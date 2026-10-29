package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;
import p032d1.c;
import p032d1.e;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f13502A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f13503B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f13504C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Object f13505D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f13506E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f13507F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f13508G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f13509H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f13510I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f13511J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f13512K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f13513L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f13514M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f13515N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f13516O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f13517P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private List f13518Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private b f13519R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f13520S;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f13521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f13524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f13525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f13526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f13527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Intent f13528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f13529y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f13530z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.C(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f13522r = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f13523s = 0;
        this.f13530z = true;
        this.f13502A = true;
        this.f13503B = true;
        this.f13506E = true;
        this.f13507F = true;
        this.f13508G = true;
        this.f13509H = true;
        this.f13510I = true;
        this.f13512K = true;
        this.f13515N = true;
        int i12 = e.f19432a;
        this.f13516O = i12;
        this.f13520S = new a();
        this.f13521q = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19450I, i10, i11);
        this.f13526v = k.l(typedArrayObtainStyledAttributes, g.f19504g0, g.f19452J, 0);
        this.f13527w = k.m(typedArrayObtainStyledAttributes, g.f19510j0, g.f19464P);
        this.f13524t = k.n(typedArrayObtainStyledAttributes, g.f19526r0, g.f19460N);
        this.f13525u = k.n(typedArrayObtainStyledAttributes, g.f19524q0, g.f19466Q);
        this.f13522r = k.d(typedArrayObtainStyledAttributes, g.f19514l0, g.f19468R, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.f13529y = k.m(typedArrayObtainStyledAttributes, g.f19502f0, g.f19478W);
        this.f13516O = k.l(typedArrayObtainStyledAttributes, g.f19512k0, g.f19458M, i12);
        this.f13517P = k.l(typedArrayObtainStyledAttributes, g.f19528s0, g.f19470S, 0);
        this.f13530z = k.b(typedArrayObtainStyledAttributes, g.f19499e0, g.f19456L, true);
        this.f13502A = k.b(typedArrayObtainStyledAttributes, g.f19518n0, g.f19462O, true);
        this.f13503B = k.b(typedArrayObtainStyledAttributes, g.f19516m0, g.f19454K, true);
        this.f13504C = k.m(typedArrayObtainStyledAttributes, g.f19493c0, g.f19472T);
        int i13 = g.f19484Z;
        this.f13509H = k.b(typedArrayObtainStyledAttributes, i13, i13, this.f13502A);
        int i14 = g.f19487a0;
        this.f13510I = k.b(typedArrayObtainStyledAttributes, i14, i14, this.f13502A);
        int i15 = g.f19490b0;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f13505D = z(typedArrayObtainStyledAttributes, i15);
        } else {
            int i16 = g.f19474U;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                this.f13505D = z(typedArrayObtainStyledAttributes, i16);
            }
        }
        this.f13515N = k.b(typedArrayObtainStyledAttributes, g.f19520o0, g.f19476V, true);
        int i17 = g.f19522p0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i17);
        this.f13511J = zHasValue;
        if (zHasValue) {
            this.f13512K = k.b(typedArrayObtainStyledAttributes, i17, g.f19480X, true);
        }
        this.f13513L = k.b(typedArrayObtainStyledAttributes, g.f19506h0, g.f19482Y, false);
        int i18 = g.f19508i0;
        this.f13508G = k.b(typedArrayObtainStyledAttributes, i18, i18, true);
        int i19 = g.f19496d0;
        this.f13514M = k.b(typedArrayObtainStyledAttributes, i19, i19, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(Preference preference, boolean z9) {
        if (this.f13507F == z9) {
            this.f13507F = !z9;
            w(H());
            v();
        }
    }

    public void B() {
        if (t() && u()) {
            x();
            o();
            if (this.f13528x != null) {
                f().startActivity(this.f13528x);
            }
        }
    }

    protected void C(View view) {
        B();
    }

    protected boolean D(boolean z9) {
        if (!I()) {
            return false;
        }
        if (z9 == k(!z9)) {
            return true;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean E(int i10) {
        if (!I()) {
            return false;
        }
        if (i10 == l(~i10)) {
            return true;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean F(String str) {
        if (!I()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, m(null))) {
            return true;
        }
        n();
        obj.getClass();
        throw null;
    }

    public final void G(b bVar) {
        this.f13519R = bVar;
        v();
    }

    public boolean H() {
        return !t();
    }

    protected boolean I() {
        return false;
    }

    public boolean d(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f13522r;
        int i11 = preference.f13522r;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f13524t;
        CharSequence charSequence2 = preference.f13524t;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f13524t.toString());
    }

    public Context f() {
        return this.f13521q;
    }

    StringBuilder g() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceR = r();
        if (!TextUtils.isEmpty(charSequenceR)) {
            sb.append(charSequenceR);
            sb.append(' ');
        }
        CharSequence charSequenceP = p();
        if (!TextUtils.isEmpty(charSequenceP)) {
            sb.append(charSequenceP);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String h() {
        return this.f13529y;
    }

    public Intent i() {
        return this.f13528x;
    }

    protected boolean k(boolean z9) {
        if (!I()) {
            return z9;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected int l(int i10) {
        if (!I()) {
            return i10;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected String m(String str) {
        if (!I()) {
            return str;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public p032d1.a n() {
        return null;
    }

    public p032d1.b o() {
        return null;
    }

    public CharSequence p() {
        return q() != null ? q().a(this) : this.f13525u;
    }

    public final b q() {
        return this.f13519R;
    }

    public CharSequence r() {
        return this.f13524t;
    }

    public boolean s() {
        return !TextUtils.isEmpty(this.f13527w);
    }

    public boolean t() {
        return this.f13530z && this.f13506E && this.f13507F;
    }

    public String toString() {
        return g().toString();
    }

    public boolean u() {
        return this.f13502A;
    }

    protected void v() {
    }

    public void w(boolean z9) {
        List list = this.f13518Q;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Preference) list.get(i10)).y(this, z9);
        }
    }

    protected void x() {
    }

    public void y(Preference preference, boolean z9) {
        if (this.f13506E == z9) {
            this.f13506E = !z9;
            w(H());
            v();
        }
    }

    protected Object z(TypedArray typedArray, int i10) {
        return null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19427g, R.attr.preferenceStyle));
    }
}
