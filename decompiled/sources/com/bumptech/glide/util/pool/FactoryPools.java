package com.bumptech.glide.util.pool;

import B0.f;
import B0.g;
import B0.h;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final Resetter<Object> EMPTY_RESETTER = new Resetter<Object>() { // from class: com.bumptech.glide.util.pool.FactoryPools.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
        }
    };
    private static final String TAG = "FactoryPools";

    public interface Factory<T> {
        T create();
    }

    private static final class FactoryPool<T> implements f {
        private final Factory<T> factory;
        private final f pool;
        private final Resetter<T> resetter;

        FactoryPool(f fVar, Factory<T> factory, Resetter<T> resetter) {
            this.pool = fVar;
            this.factory = factory;
            this.resetter = resetter;
        }

        @Override // B0.f
        public T acquire() {
            T tCreate = (T) this.pool.acquire();
            if (tCreate == null) {
                tCreate = this.factory.create();
                if (Log.isLoggable(FactoryPools.TAG, 2)) {
                    Log.v(FactoryPools.TAG, "Created new " + tCreate.getClass());
                }
            }
            if (tCreate instanceof Poolable) {
                tCreate.getVerifier().setRecycled(false);
            }
            return (T) tCreate;
        }

        @Override // B0.f
        public boolean release(T t9) {
            if (t9 instanceof Poolable) {
                ((Poolable) t9).getVerifier().setRecycled(true);
            }
            this.resetter.reset(t9);
            return this.pool.release(t9);
        }
    }

    public interface Poolable {
        StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(T t9);
    }

    private FactoryPools() {
    }

    private static <T extends Poolable> f build(f fVar, Factory<T> factory) {
        return build(fVar, factory, emptyResetter());
    }

    private static <T> Resetter<T> emptyResetter() {
        return (Resetter<T>) EMPTY_RESETTER;
    }

    public static <T extends Poolable> f simple(int i10, Factory<T> factory) {
        return build(new g(i10), factory);
    }

    public static <T extends Poolable> f threadSafe(int i10, Factory<T> factory) {
        return build(new h(i10), factory);
    }

    public static <T> f threadSafeList() {
        return threadSafeList(20);
    }

    private static <T> f build(f fVar, Factory<T> factory, Resetter<T> resetter) {
        return new FactoryPool(fVar, factory, resetter);
    }

    public static <T extends Poolable> f threadSafe(int i10, Factory<T> factory, Resetter<T> resetter) {
        return build(new h(i10), factory, resetter);
    }

    public static <T> f threadSafeList(int i10) {
        return build(new h(i10), new Factory<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.2
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public List<T> create() {
                return new ArrayList();
            }
        }, new Resetter<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.3
            @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
            public void reset(List<T> list) {
                list.clear();
            }
        });
    }
}
