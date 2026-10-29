package p076h5;

import java.util.concurrent.Executor;
import p025c4.AbstractC1201o;
import p175r4.C1888p8;
import p175r4.C1907r8;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f21788f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21789a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21790b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21791c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21792d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f21793e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f21794f;

        public e a() {
            return new e(this, null);
        }

        public a b() {
            this.f21790b = true;
            return this;
        }

        public a c() {
            this.f21789a = true;
            return this;
        }
    }

    /* synthetic */ e(a aVar, f fVar) {
        this.f21783a = aVar.f21789a;
        this.f21784b = aVar.f21790b;
        this.f21785c = aVar.f21791c;
        this.f21786d = aVar.f21792d;
        this.f21787e = aVar.f21793e;
        this.f21788f = aVar.f21794f;
    }

    public final C1907r8 a() {
        C1888p8 c1888p8 = new C1888p8();
        c1888p8.b(Boolean.valueOf(this.f21783a));
        c1888p8.a(Boolean.valueOf(this.f21784b));
        c1888p8.c(Boolean.valueOf(this.f21785c));
        c1888p8.e(Boolean.valueOf(this.f21786d));
        c1888p8.d(Boolean.valueOf(this.f21787e));
        return c1888p8.f();
    }

    public final Executor b() {
        return this.f21788f;
    }

    public final boolean c() {
        return this.f21784b;
    }

    public final boolean d() {
        return this.f21783a;
    }

    public final boolean e() {
        return this.f21785c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21783a == eVar.f21783a && this.f21784b == eVar.f21784b && this.f21785c == eVar.f21785c && this.f21786d == eVar.f21786d && this.f21787e == eVar.f21787e && AbstractC1201o.a(this.f21788f, eVar.f21788f);
    }

    public final boolean f() {
        return this.f21787e;
    }

    public final boolean g() {
        return this.f21786d;
    }

    public int hashCode() {
        return AbstractC1201o.b(Boolean.valueOf(this.f21783a), Boolean.valueOf(this.f21784b), Boolean.valueOf(this.f21785c), Boolean.valueOf(this.f21786d), Boolean.valueOf(this.f21787e), this.f21788f);
    }
}
