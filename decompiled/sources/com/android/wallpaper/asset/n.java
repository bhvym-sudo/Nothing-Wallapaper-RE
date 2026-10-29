package com.android.wallpaper.asset;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class n implements ModelLoader {

    protected static class a implements DataFetcher {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private m f15911q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f15912r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f15913s;

        public a(m mVar, int i10, int i11) {
            this.f15911q = mVar;
            this.f15912r = i10;
            this.f15913s = i11;
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
            Bitmap bitmapDecodeStream;
            BitmapFactory.Options options = new BitmapFactory.Options();
            Point pointA = this.f15911q.A();
            if (pointA == null) {
                dataCallback.onLoadFailed(new IOException("Failed to calculate raw dimensions"));
                return;
            }
            options.inSampleSize = p014b3.f.b(pointA.x, pointA.y, this.f15912r, this.f15913s);
            if (this.f15911q.H().booleanValue()) {
                try {
                    InputStream inputStreamO = this.f15911q.O();
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamO, null, options);
                        if (inputStreamO != null) {
                            inputStreamO.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamO != null) {
                            try {
                                inputStreamO.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    dataCallback.onLoadFailed(e10);
                    return;
                }
            } else {
                bitmapDecodeStream = BitmapFactory.decodeResource(this.f15911q.U(), this.f15911q.T(), options);
            }
            if (bitmapDecodeStream == null) {
                dataCallback.onLoadFailed(new IOException("Failed to decode bitmap from resource asset"));
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            dataCallback.onDataReady(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        }
    }

    public static class b implements ModelLoaderFactory {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new n();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ModelLoader.LoadData buildLoadData(m mVar, int i10, int i11, Options options) {
        return new ModelLoader.LoadData(mVar.S(), new a(mVar, i10, i11));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(m mVar) {
        return true;
    }
}
