package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0456b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0456b c0456b = new DynamiteModule.b.C0456b();
        c0456b.f16345a = aVar.b(context, str);
        int iA = aVar.a(context, str, true);
        c0456b.f16346b = iA;
        int i10 = c0456b.f16345a;
        if (i10 == 0) {
            i10 = 0;
            if (iA == 0) {
                c0456b.f16347c = 0;
                return c0456b;
            }
        }
        if (i10 >= iA) {
            c0456b.f16347c = -1;
            return c0456b;
        }
        c0456b.f16347c = 1;
        return c0456b;
    }
}
