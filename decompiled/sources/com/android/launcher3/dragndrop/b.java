package com.android.launcher3.dragndrop;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.function.Consumer;
import p253z2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f15525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Consumer f15526b;

    public interface a {
        void a(float f10, float f11);

        void b();

        void c(float f10, float f11);
    }

    /* JADX INFO: renamed from: com.android.launcher3.dragndrop.b$b, reason: collision with other inner class name */
    static class C0443b extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.android.launcher3.dragndrop.a f15527c;

        C0443b(com.android.launcher3.dragndrop.a aVar, Consumer consumer) {
            super(aVar, consumer);
            this.f15527c = aVar;
        }

        @Override // com.android.launcher3.dragndrop.b
        public boolean b(MotionEvent motionEvent) {
            this.f15526b.accept(motionEvent);
            int action = motionEvent.getAction();
            if (action == 1) {
                this.f15525a.a(this.f15527c.v(motionEvent), this.f15527c.w(motionEvent));
            } else if (action == 3) {
                this.f15525a.b();
            }
            return true;
        }

        @Override // com.android.launcher3.dragndrop.b
        public boolean c(MotionEvent motionEvent) {
            this.f15526b.accept(motionEvent);
            int action = motionEvent.getAction();
            if (action == 1) {
                this.f15525a.c(this.f15527c.v(motionEvent), this.f15527c.w(motionEvent));
                this.f15525a.a(this.f15527c.v(motionEvent), this.f15527c.w(motionEvent));
            } else if (action == 2) {
                this.f15525a.c(this.f15527c.v(motionEvent), this.f15527c.w(motionEvent));
            } else if (action == 3) {
                this.f15525a.b();
            }
            return true;
        }
    }

    static class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f15528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f15529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f15530e;

        c(com.android.launcher3.dragndrop.a aVar, Consumer consumer) {
            super(aVar, consumer);
            this.f15529d = 0.0f;
            this.f15530e = 0.0f;
            this.f15528c = SystemClock.uptimeMillis();
        }

        @Override // com.android.launcher3.dragndrop.b
        public boolean b(MotionEvent motionEvent) {
            return false;
        }
    }

    public b(a aVar, Consumer consumer) {
        this.f15525a = aVar;
        this.f15526b = consumer;
    }

    public static b a(com.android.launcher3.dragndrop.a aVar, e eVar, Consumer consumer) {
        if (eVar.f30656c == null) {
            return new C0443b(aVar, consumer);
        }
        if (eVar.f30654a) {
            return null;
        }
        return new c(aVar, consumer);
    }

    public abstract boolean b(MotionEvent motionEvent);

    public boolean c(MotionEvent motionEvent) {
        return false;
    }
}
