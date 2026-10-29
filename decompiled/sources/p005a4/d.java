package p005a4;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1227d;
import com.google.android.gms.common.api.internal.AbstractC1230g;
import com.google.android.gms.common.api.internal.C1225b;
import com.google.android.gms.common.api.internal.C1226c;
import com.google.android.gms.common.api.internal.C1229f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.q;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p015b4.A;
import p015b4.C1181a;
import p015b4.C1182b;
import p015b4.j;
import p015b4.o;
import p025c4.AbstractC1189c;
import p025c4.AbstractC1202p;
import p025c4.C1190d;
import p085i4.g;
import p215v4.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p005a4.a f9828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a4.a.d f9829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1182b f9830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f9831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f9833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f9834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final C1225b f9835j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f9836c = new C0353a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f9837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f9838b;

        /* JADX INFO: renamed from: a4.d$a$a, reason: collision with other inner class name */
        public static class C0353a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private j f9839a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f9840b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f9839a == null) {
                    this.f9839a = new C1181a();
                }
                if (this.f9840b == null) {
                    this.f9840b = Looper.getMainLooper();
                }
                return new a(this.f9839a, this.f9840b);
            }
        }

        private a(j jVar, Account account, Looper looper) {
            this.f9837a = jVar;
            this.f9838b = looper;
        }
    }

    private d(Context context, Activity activity, p005a4.a aVar, a4.a.d dVar, a aVar2) {
        AbstractC1202p.j(context, "Null context is not permitted.");
        AbstractC1202p.j(aVar, "Api must not be null.");
        AbstractC1202p.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f9826a = context.getApplicationContext();
        String str = null;
        if (g.h()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f9827b = str;
        this.f9828c = aVar;
        this.f9829d = dVar;
        this.f9831f = aVar2.f9838b;
        C1182b c1182bA = C1182b.a(aVar, dVar, str);
        this.f9830e = c1182bA;
        this.f9833h = new o(this);
        C1225b c1225bX = C1225b.x(this.f9826a);
        this.f9835j = c1225bX;
        this.f9832g = c1225bX.m();
        this.f9834i = aVar2.f9837a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            k.u(activity, c1225bX, c1182bA);
        }
        c1225bX.b(this);
    }

    private final p215v4.k p(int i10, AbstractC1230g abstractC1230g) {
        l lVar = new l();
        this.f9835j.F(this, i10, abstractC1230g, lVar, this.f9834i);
        return lVar.a();
    }

    protected C1190d.a e() {
        C1190d.a aVar = new C1190d.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f9826a.getClass().getName());
        aVar.b(this.f9826a.getPackageName());
        return aVar;
    }

    public p215v4.k f(AbstractC1230g abstractC1230g) {
        return p(2, abstractC1230g);
    }

    public p215v4.k g(AbstractC1230g abstractC1230g) {
        return p(0, abstractC1230g);
    }

    public p215v4.k h(C1229f c1229f) {
        AbstractC1202p.i(c1229f);
        AbstractC1202p.j(c1229f.f16260a.b(), "Listener has already been released.");
        AbstractC1202p.j(c1229f.f16261b.a(), "Listener has already been released.");
        return this.f9835j.z(this, c1229f.f16260a, c1229f.f16261b, c1229f.f16262c);
    }

    public p215v4.k i(C1226c.a aVar, int i10) {
        AbstractC1202p.j(aVar, "Listener key cannot be null.");
        return this.f9835j.A(this, aVar, i10);
    }

    public final C1182b j() {
        return this.f9830e;
    }

    protected String k() {
        return this.f9827b;
    }

    public C1226c l(Object obj, String str) {
        return AbstractC1227d.a(obj, this.f9831f, str);
    }

    public final int m() {
        return this.f9832g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a4.a.f n(Looper looper, q qVar) {
        a4.a.f fVarA = ((p005a4.a.AbstractC0351a) AbstractC1202p.i(this.f9828c.a())).a(this.f9826a, looper, e().a(), this.f9829d, qVar, qVar);
        String strK = k();
        if (strK != null && (fVarA instanceof AbstractC1189c)) {
            ((AbstractC1189c) fVarA).O(strK);
        }
        if (strK == null || !(fVarA instanceof p015b4.g)) {
            return fVarA;
        }
        androidx.appcompat.app.o.a(fVarA);
        throw null;
    }

    public final A o(Context context, Handler handler) {
        return new A(context, handler, e().a());
    }

    public d(Context context, p005a4.a aVar, a4.a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
