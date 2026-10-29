package com.android.wallpaper.asset;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class i implements ModelLoader {

    private static class a implements DataFetcher {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private h f15893q;

        public a(h hVar) {
            this.f15893q = hVar;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            ParcelFileDescriptor parcelFileDescriptorV = this.f15893q.V();
            if (parcelFileDescriptorV == null) {
                dataCallback.onLoadFailed(new Exception("ParcelFileDescriptor for wallpaper is null, unable to open InputStream."));
            } else {
                dataCallback.onDataReady(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorV));
            }
        }
    }

    public static class b implements ModelLoaderFactory {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new i();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ModelLoader.LoadData buildLoadData(h hVar, int i10, int i11, Options options) {
        return new ModelLoader.LoadData(hVar.U(), new a(hVar));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(h hVar) {
        return true;
    }
}
