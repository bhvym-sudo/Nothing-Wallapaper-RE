package com.android.wallpaper.asset;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import p014b3.C;

/* JADX INFO: loaded from: classes.dex */
public class r implements ModelLoader {

    private static class a implements DataFetcher {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private C f15921q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f15922r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f15923s;

        public a(C c10, int i10, int i11) {
            this.f15921q = c10;
            this.f15922r = i10;
            this.f15923s = i11;
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
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            dataCallback.onDataReady(this.f15921q.a(this.f15922r, this.f15923s));
        }
    }

    public static class b implements ModelLoaderFactory {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new r();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ModelLoader.LoadData buildLoadData(C c10, int i10, int i11, Options options) {
        return new ModelLoader.LoadData(c10.b(), new a(c10, i10, i11));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(C c10) {
        return true;
    }
}
