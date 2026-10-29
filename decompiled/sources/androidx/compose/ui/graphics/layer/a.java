package androidx.compose.ui.graphics.layer;

import I.AbstractC0874s;
import I.InterfaceC0869m;
import I.L;
import I.r;
import K.f;
import L.c;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.jvm.internal.o;
import p079h8.A;
import p111l0.d;
import p111l0.s;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0368a f11467a = C0368a.f11468a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.a$a, reason: collision with other inner class name */
    public static final class C0368a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0368a f11468a = new C0368a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final l f11469b = C0369a.f11470r;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.a$a$a, reason: collision with other inner class name */
        static final class C0369a extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final C0369a f11470r = new C0369a();

            C0369a() {
                super(1);
            }

            public final void a(f fVar) {
                f.K(fVar, r.f2740b.d(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // p219v8.l
            public /* bridge */ /* synthetic */ Object f(Object obj) {
                a((f) obj);
                return A.f21846a;
            }
        }

        private C0368a() {
        }
    }

    void A(Outline outline, long j9);

    int B();

    void C(int i10, int i11, long j9);

    void D(long j9);

    long E();

    void F(InterfaceC0869m interfaceC0869m);

    void G(d dVar, s sVar, c cVar, l lVar);

    long H();

    void I(long j9);

    void J(boolean z9);

    void K(int i10);

    void L(long j9);

    Matrix M();

    float N();

    void a(float f10);

    float b();

    void c(float f10);

    float d();

    void e(float f10);

    void f(float f10);

    void g();

    AbstractC0874s h();

    void i(float f10);

    void j(L l9);

    float k();

    boolean l();

    float m();

    float n();

    void o(float f10);

    float p();

    float q();

    float r();

    void s(float f10);

    void t(float f10);

    float u();

    void v(float f10);

    int w();

    void x(boolean z9);

    void y(float f10);

    L z();
}
