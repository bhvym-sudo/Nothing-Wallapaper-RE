package p061g0;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p079h8.h;
import p079h8.i;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class B implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f20890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f20891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f20892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f20894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f20895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y f20896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f20897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f20898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f20899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1355e f20900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p190t.b f20901l;

    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    static final class b extends o implements p219v8.a {
        b() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(B.this.h(), false);
        }
    }

    public static final class c implements l {
        c() {
        }

        @Override // p061g0.l
        public void a(u uVar) {
            int size = B.this.f20898i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (n.d(((WeakReference) B.this.f20898i.get(i10)).get(), uVar)) {
                    B.this.f20898i.remove(i10);
                    return;
                }
            }
        }

        @Override // p061g0.l
        public void b(KeyEvent keyEvent) {
            B.this.g().sendKeyEvent(keyEvent);
        }

        @Override // p061g0.l
        public void c(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            B.this.f20900k.a(z9, z10, z11, z12, z13, z14);
        }

        @Override // p061g0.l
        public void d(int i10) {
            B.this.f20895f.f(j.i(i10));
        }

        @Override // p061g0.l
        public void e(List list) {
            B.this.f20894e.f(list);
        }
    }

    static final class d extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f20909r = new d();

        d() {
            super(1);
        }

        public final void a(List list) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((List) obj);
            return A.f21846a;
        }
    }

    static final class e extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f20910r = new e();

        e() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(((j) obj).o());
            return A.f21846a;
        }
    }

    public B(View view, Q.B b10, m mVar, Executor executor) {
        this.f20890a = view;
        this.f20891b = mVar;
        this.f20892c = executor;
        this.f20894e = d.f20909r;
        this.f20895f = e.f20910r;
        this.f20896g = new y("", p031d0.n.f19416b.a(), (p031d0.n) null, 4, (AbstractC1457h) null);
        this.f20897h = k.f20949g.a();
        this.f20898i = new ArrayList();
        this.f20899j = i.a(p079h8.l.NONE, new b());
        this.f20900k = new C1355e(b10, mVar);
        this.f20901l = new p190t.b(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection g() {
        return (BaseInputConnection) this.f20899j.getValue();
    }

    public final InputConnection f(EditorInfo editorInfo) {
        if (!this.f20893d) {
            return null;
        }
        E.h(editorInfo, this.f20897h, this.f20896g);
        E.i(editorInfo);
        u uVar = new u(this.f20896g, new c(), this.f20897h.b());
        this.f20898i.add(new WeakReference(uVar));
        return uVar;
    }

    public final View h() {
        return this.f20890a;
    }

    public final boolean i() {
        return this.f20893d;
    }

    public /* synthetic */ B(View view, Q.B b10, m mVar, Executor executor, int i10, AbstractC1457h abstractC1457h) {
        this(view, b10, mVar, (i10 & 8) != 0 ? E.d(Choreographer.getInstance()) : executor);
    }

    public B(View view, Q.B b10) {
        this(view, b10, new n(view), null, 8, null);
    }
}
