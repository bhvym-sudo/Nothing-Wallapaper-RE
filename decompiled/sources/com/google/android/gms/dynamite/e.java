package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0456b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0456b c0456b = new DynamiteModule.b.C0456b();
        int iA = aVar.a(context, str, false);
        c0456b.f16346b = iA;
        if (iA == 0) {
            c0456b.f16347c = 0;
            return c0456b;
        }
        c0456b.f16347c = 1;
        return c0456b;
    }
}
