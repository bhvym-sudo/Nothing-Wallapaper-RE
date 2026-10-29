package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1163x;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends androidx.databinding.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f12356m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f12365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.databinding.h[] f12368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f12369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Choreographer f12371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Choreographer.FrameCallback f12372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f12373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f12374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC1163x f12375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static int f12355l = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f12357n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final androidx.databinding.c f12358o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final androidx.databinding.c f12359p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final androidx.databinding.c f12360q = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final androidx.databinding.c f12361r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final androidx.databinding.b f12362s = new e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ReferenceQueue f12363t = new ReferenceQueue();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f12364u = new f();

    class a implements androidx.databinding.c {
        a() {
        }
    }

    class b implements androidx.databinding.c {
        b() {
        }
    }

    class c implements androidx.databinding.c {
        c() {
        }
    }

    class d implements androidx.databinding.c {
        d() {
        }
    }

    class e extends androidx.databinding.b {
        e() {
        }
    }

    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            g.n(view).f12365a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$g, reason: collision with other inner class name */
    class RunnableC0383g implements Runnable {
        RunnableC0383g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                g.this.f12366b = false;
            }
            g.x();
            if (g.this.f12369e.isAttachedToWindow()) {
                g.this.k();
            } else {
                g.this.f12369e.removeOnAttachStateChangeListener(g.f12364u);
                g.this.f12369e.addOnAttachStateChangeListener(g.f12364u);
            }
        }
    }

    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j9) {
            g.this.f12365a.run();
        }
    }

    protected static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f12378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f12379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[][] f12380c;

        public i(int i10) {
            this.f12378a = new String[i10][];
            this.f12379b = new int[i10][];
            this.f12380c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f12378a[i10] = strArr;
            this.f12379b[i10] = iArr;
            this.f12380c[i10] = iArr2;
        }
    }

    protected g(androidx.databinding.e eVar, View view, int i10) {
        this.f12365a = new RunnableC0383g();
        this.f12366b = false;
        this.f12367c = false;
        this.f12368d = new androidx.databinding.h[i10];
        this.f12369e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f12357n) {
            this.f12371g = Choreographer.getInstance();
            this.f12372h = new h();
        } else {
            this.f12372h = null;
            this.f12373i = new Handler(Looper.myLooper());
        }
    }

    protected static g f(Object obj, View view, int i10) {
        g(obj);
        return androidx.databinding.f.a(null, view, i10);
    }

    private static androidx.databinding.e g(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void i() {
        if (this.f12370f) {
            y();
        } else if (p()) {
            this.f12370f = true;
            this.f12367c = false;
            h();
            this.f12370f = false;
        }
    }

    protected static void j(g gVar) {
        gVar.i();
    }

    private static int l(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f12378a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static int m(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (s(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    static g n(View view) {
        if (view != null) {
            return (g) view.getTag(J0.a.f3503a);
        }
        return null;
    }

    protected static g q(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z9, Object obj) {
        g(obj);
        return androidx.databinding.f.f(layoutInflater, i10, viewGroup, z9, null);
    }

    private static boolean s(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    private static void t(androidx.databinding.e eVar, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z9) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        int iL;
        int id;
        int i13;
        int iW;
        boolean z13;
        i iVar2 = iVar;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        if (n(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        boolean z14 = true;
        if (z9 && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i14 = iLastIndexOf + 1;
                if (s(str, i14)) {
                    iW = w(str, i14);
                    if (objArr[iW] == null) {
                        objArr[iW] = view;
                    }
                    if (iVar2 == null) {
                        iW = -1;
                    }
                    z13 = true;
                } else {
                    iW = -1;
                    z13 = false;
                }
            } else {
                iW = -1;
                z13 = false;
            }
            boolean z15 = z13;
            i10 = iW;
            z10 = z15;
        } else if (str == null || !str.startsWith("binding_")) {
            i10 = -1;
            z10 = false;
        } else {
            int iW2 = w(str, f12356m);
            if (objArr[iW2] == null) {
                objArr[iW2] = view;
            }
            if (iVar2 == null) {
                iW2 = -1;
            }
            i10 = iW2;
            z10 = true;
        }
        if (!z10 && (id = view.getId()) > 0 && sparseIntArray2 != null && (i13 = sparseIntArray2.get(id, -1)) >= 0 && objArr[i13] == null) {
            objArr[i13] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i15 = 0;
            int i16 = 0;
            while (i15 < childCount) {
                View childAt = viewGroup.getChildAt(i15);
                if (i10 < 0 || !(childAt.getTag() instanceof String)) {
                    z11 = z14;
                    i11 = i15;
                    i12 = i16;
                    z12 = false;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (!str2.endsWith("_0") || !str2.startsWith("layout") || str2.indexOf(47) <= 0 || (iL = l(str2, i16, iVar2, i10)) < 0) {
                        z11 = z14;
                        i11 = i15;
                        i12 = i16;
                        z12 = false;
                    } else {
                        int i17 = iL + 1;
                        int i18 = iVar2.f12379b[i10][iL];
                        int i19 = iVar2.f12380c[i10][iL];
                        int iM = m(viewGroup, i15);
                        if (iM == i15) {
                            objArr[i18] = androidx.databinding.f.a(eVar, childAt, i19);
                            i11 = i15;
                            z12 = z14;
                            z11 = z12;
                            i12 = i17;
                        } else {
                            int i20 = iM - i15;
                            int i21 = i20 + 1;
                            View[] viewArr = new View[i21];
                            z11 = z14;
                            int i22 = 0;
                            while (i22 < i21) {
                                int i23 = i15;
                                viewArr[i22] = viewGroup.getChildAt(i23 + i22);
                                i22++;
                                i15 = i23;
                            }
                            objArr[i18] = androidx.databinding.f.b(eVar, viewArr, i19);
                            i11 = i15 + i20;
                            i12 = i17;
                            z12 = z11;
                        }
                    }
                }
                if (!z12) {
                    t(eVar, childAt, objArr, iVar2, sparseIntArray2, false);
                }
                i15 = i11 + 1;
                iVar2 = iVar;
                sparseIntArray2 = sparseIntArray;
                i16 = i12;
                z14 = z11;
            }
        }
    }

    protected static Object[] u(androidx.databinding.e eVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        t(eVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static Object[] v(androidx.databinding.e eVar, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            t(eVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    private static int w(String str, int i10) {
        int length = str.length();
        int iCharAt = 0;
        while (i10 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x() {
        while (f12363t.poll() != null) {
        }
    }

    protected void A(View view) {
        view.setTag(J0.a.f3503a, this);
    }

    protected void B(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(J0.a.f3503a, this);
        }
    }

    protected abstract void h();

    public void k() {
        g gVar = this.f12374j;
        if (gVar == null) {
            i();
        } else {
            gVar.k();
        }
    }

    public View o() {
        return this.f12369e;
    }

    public abstract boolean p();

    public abstract void r();

    protected void y() {
        g gVar = this.f12374j;
        if (gVar != null) {
            gVar.y();
            return;
        }
        InterfaceC1163x interfaceC1163x = this.f12375k;
        if (interfaceC1163x == null || interfaceC1163x.getLifecycle().b().e(AbstractC1157q.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f12366b) {
                        return;
                    }
                    this.f12366b = true;
                    if (f12357n) {
                        this.f12371g.postFrameCallback(this.f12372h);
                    } else {
                        this.f12373i.post(this.f12365a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void z(g gVar) {
        if (gVar != null) {
            gVar.f12374j = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected g(Object obj, View view, int i10) {
        this((androidx.databinding.e) null, view, i10);
        g(obj);
    }
}
