package com.google.android.datatransport.cct;

import N3.h;
import N3.m;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements N3.d {
    @Override // N3.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
