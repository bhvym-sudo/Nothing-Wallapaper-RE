package com.android.wallpaper.asset;

import android.media.ExifInterface;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S0.a f15894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExifInterface f15895b;

    public j(InputStream inputStream) {
        this.f15895b = new ExifInterface(inputStream);
    }

    public String a(String str) {
        ExifInterface exifInterface = this.f15895b;
        if (exifInterface != null) {
            return exifInterface.getAttribute(str);
        }
        S0.a aVar = this.f15894a;
        if (aVar != null) {
            return aVar.f(str);
        }
        return null;
    }

    public int b(String str, int i10) {
        ExifInterface exifInterface = this.f15895b;
        if (exifInterface != null) {
            return exifInterface.getAttributeInt(str, i10);
        }
        S0.a aVar = this.f15894a;
        return aVar != null ? aVar.g(str, i10) : i10;
    }
}
