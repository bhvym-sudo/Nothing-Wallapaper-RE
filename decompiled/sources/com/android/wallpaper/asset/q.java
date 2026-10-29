package com.android.wallpaper.asset;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
public class q implements ModelLoader {

    public static class a implements ModelLoaderFactory {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new q();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ModelLoader.LoadData buildLoadData(p pVar, int i10, int i11, Options options) {
        return new ModelLoader.LoadData(pVar.S(), new n.a(pVar, i10, i11));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(p pVar) {
        return true;
    }
}
