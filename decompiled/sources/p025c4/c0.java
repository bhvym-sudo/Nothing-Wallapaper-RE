package p025c4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f15125f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f15128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15130e;

    public c0(String str, String str2, int i10, boolean z9) {
        AbstractC1202p.e(str);
        this.f15126a = str;
        AbstractC1202p.e(str2);
        this.f15127b = str2;
        this.f15128c = null;
        this.f15129d = i10;
        this.f15130e = z9;
    }

    public final int a() {
        return this.f15129d;
    }

    public final ComponentName b() {
        return this.f15128c;
    }

    public final Intent c(Context context) {
        Bundle bundleCall;
        if (this.f15126a == null) {
            return new Intent().setComponent(this.f15128c);
        }
        Intent intent = null;
        if (this.f15130e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f15126a);
            try {
                bundleCall = context.getContentResolver().call(f15125f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f15126a)));
            }
        }
        return intent != null ? intent : new Intent(this.f15126a).setPackage(this.f15127b);
    }

    public final String d() {
        return this.f15127b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return AbstractC1201o.a(this.f15126a, c0Var.f15126a) && AbstractC1201o.a(this.f15127b, c0Var.f15127b) && AbstractC1201o.a(this.f15128c, c0Var.f15128c) && this.f15129d == c0Var.f15129d && this.f15130e == c0Var.f15130e;
    }

    public final int hashCode() {
        return AbstractC1201o.b(this.f15126a, this.f15127b, this.f15128c, Integer.valueOf(this.f15129d), Boolean.valueOf(this.f15130e));
    }

    public final String toString() {
        String str = this.f15126a;
        if (str != null) {
            return str;
        }
        AbstractC1202p.i(this.f15128c);
        return this.f15128c.flattenToString();
    }
}
