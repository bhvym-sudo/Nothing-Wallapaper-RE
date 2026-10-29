package p025c4;

import android.os.Bundle;

/* JADX INFO: renamed from: c4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1207v implements a4.a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1207v f15223c = a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15224b;

    /* JADX INFO: renamed from: c4.v$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f15225a;

        /* synthetic */ a(AbstractC1209x abstractC1209x) {
        }

        public C1207v a() {
            return new C1207v(this.f15225a, null);
        }

        public a b(String str) {
            this.f15225a = str;
            return this;
        }
    }

    /* synthetic */ C1207v(String str, AbstractC1210y abstractC1210y) {
        this.f15224b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f15224b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1207v) {
            return AbstractC1201o.a(this.f15224b, ((C1207v) obj).f15224b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1201o.b(this.f15224b);
    }
}
