package p051f0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final o f20751A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final o f20752B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final o f20753C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final o f20754D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final o f20755E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final o f20756F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final o f20757G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final o f20758H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final o f20759I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final o f20760J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final List f20761K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f20762r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final o f20763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final o f20764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final o f20765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final o f20766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final o f20767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final o f20768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final o f20769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final o f20770z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f20771q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final o a() {
            return o.f20755E;
        }

        public final o b() {
            return o.f20768x;
        }

        private a() {
        }
    }

    static {
        o oVar = new o(100);
        f20763s = oVar;
        o oVar2 = new o(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        f20764t = oVar2;
        o oVar3 = new o(300);
        f20765u = oVar3;
        o oVar4 = new o(400);
        f20766v = oVar4;
        o oVar5 = new o(500);
        f20767w = oVar5;
        o oVar6 = new o(600);
        f20768x = oVar6;
        o oVar7 = new o(TypedValues.TransitionType.TYPE_DURATION);
        f20769y = oVar7;
        o oVar8 = new o(800);
        f20770z = oVar8;
        o oVar9 = new o(TypedValues.Custom.TYPE_INT);
        f20751A = oVar9;
        f20752B = oVar;
        f20753C = oVar2;
        f20754D = oVar3;
        f20755E = oVar4;
        f20756F = oVar5;
        f20757G = oVar6;
        f20758H = oVar7;
        f20759I = oVar8;
        f20760J = oVar9;
        f20761K = AbstractC1444s.n(oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9);
    }

    public o(int i10) {
        this.f20771q = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f20771q == ((o) obj).f20771q;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return n.i(this.f20771q, oVar.f20771q);
    }

    public final int g() {
        return this.f20771q;
    }

    public int hashCode() {
        return this.f20771q;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f20771q + ')';
    }
}
