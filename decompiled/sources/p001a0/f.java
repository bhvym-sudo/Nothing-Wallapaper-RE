package p001a0;

import F8.M;
import I.J;
import U.j;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1450a;
import kotlin.jvm.internal.o;
import p079h8.A;
import p111l0.m;
import p111l0.p;
import p129m8.i;
import p170r.InterfaceC1683h0;
import p170r.V0;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p001a0.a.InterfaceC0350a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1683h0 f9587a = V0.b(Boolean.FALSE, null, 2, null);

    /* synthetic */ class a extends AbstractC1450a implements l {
        a(Object obj) {
            super(1, obj, p190t.b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(g gVar) {
            ((p190t.b) this.f22783q).b(gVar);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((g) obj);
            return A.f21846a;
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f9588r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable f(g gVar) {
            return Integer.valueOf(gVar.b());
        }
    }

    static final class c extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f9589r = new c();

        c() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable f(g gVar) {
            return Integer.valueOf(gVar.d().e());
        }
    }

    private final void e(boolean z9) {
        this.f9587a.setValue(Boolean.valueOf(z9));
    }

    @Override // p001a0.a.InterfaceC0350a
    public void a() {
        e(true);
    }

    @Override // p001a0.a.InterfaceC0350a
    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.f9587a.getValue()).booleanValue();
    }

    public final void d(View view, p011b0.l lVar, i iVar, Consumer<ScrollCaptureTarget> consumer) {
        p190t.b bVar = new p190t.b(new g[16], 0);
        Object obj = null;
        h.e(lVar.a(), 0, new a(bVar), 2, null);
        bVar.B(p109k8.a.b(b.f9588r, c.f9589r));
        if (!bVar.r()) {
            obj = bVar.o()[bVar.p() - 1];
        }
        g gVar = (g) obj;
        if (gVar == null) {
            return;
        }
        p001a0.a aVar = new p001a0.a(gVar.c(), gVar.d(), M.a(iVar), this);
        H.i iVarB = j.b(gVar.a());
        long jI = gVar.d().i();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(view, J.b(p.a(iVarB)), new Point(m.d(jI), m.e(jI)), aVar);
        scrollCaptureTarget.setScrollBounds(J.b(gVar.d()));
        consumer.accept(scrollCaptureTarget);
    }
}
