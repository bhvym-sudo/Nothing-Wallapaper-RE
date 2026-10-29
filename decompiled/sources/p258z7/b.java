package p258z7;

import K6.c;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import kotlin.jvm.internal.n;
import p074h3.H;
import p074h3.I;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30791a;

    public static final class a implements ModelLoaderFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f30792a;

        public a(Context context) {
            n.h(context, "context");
            this.f30792a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiFactory) {
            n.h(multiFactory, "multiFactory");
            return new b(this.f30792a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: z7.b$b, reason: collision with other inner class name */
    public static final class C0768b implements DataFetcher {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final S5.a f30793q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Context f30794r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final c f30795s;

        public C0768b(S5.a model, Context context) {
            n.h(model, "model");
            n.h(context, "context");
            this.f30793q = model;
            this.f30794r = context;
            H hA = I.a();
            n.f(hA, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector");
            this.f30795s = (c) hA;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback callback) {
            n.h(priority, "priority");
            n.h(callback, "callback");
            S5.a aVar = this.f30793q;
            Context context = this.f30794r;
            callback.onDataReady(aVar.e(context, this.f30795s.J0(context)));
        }
    }

    public b(Context context) {
        n.h(context, "context");
        this.f30791a = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ModelLoader.LoadData buildLoadData(S5.a model, int i10, int i11, Options options) {
        n.h(model, "model");
        n.h(options, "options");
        return new ModelLoader.LoadData(new ObjectKey(model), new C0768b(model, this.f30791a));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(S5.a model) {
        n.h(model, "model");
        return true;
    }
}
