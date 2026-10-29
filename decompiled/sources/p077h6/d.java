package p077h6;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ModelLoader {

    public static final class a implements ModelLoaderFactory {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiFactory) {
            n.h(multiFactory, "multiFactory");
            return new d();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static final class b implements DataFetcher {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final c f21813q;

        public b(c thumbAsset) {
            n.h(thumbAsset, "thumbAsset");
            this.f21813q = thumbAsset;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback callback) {
            n.h(priority, "priority");
            n.h(callback, "callback");
            callback.onDataReady(this.f21813q.z());
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ModelLoader.LoadData buildLoadData(c model, int i10, int i11, Options options) {
        n.h(model, "model");
        n.h(options, "options");
        return new ModelLoader.LoadData(model.y(), new b(model));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(c model) {
        n.h(model, "model");
        return true;
    }
}
