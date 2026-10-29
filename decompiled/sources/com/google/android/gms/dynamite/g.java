package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0456b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0456b c0456b = new DynamiteModule.b.C0456b();
        int iB = aVar.b(context, str);
        c0456b.f16345a = iB;
        int i10 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0456b.f16346b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0456b.f16346b = iA;
        }
        int i11 = c0456b.f16345a;
        if (i11 != 0) {
            i10 = i11;
        } else if (iA == 0) {
            c0456b.f16347c = 0;
            return c0456b;
        }
        if (i10 >= iA) {
            c0456b.f16347c = -1;
            return c0456b;
        }
        c0456b.f16347c = 1;
        return c0456b;
    }
}
