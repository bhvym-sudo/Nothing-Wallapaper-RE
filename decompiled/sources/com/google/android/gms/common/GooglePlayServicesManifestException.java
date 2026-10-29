package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f16190q;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f16190q = i10;
    }
}
