package p011b0;

import java.util.List;
import kotlin.jvm.internal.o;
import p079h8.A;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f14629a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f14630b = p.b("ContentDescription", b.f14656r);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f14631c = p.a("StateDescription");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q f14632d = p.a("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q f14633e = p.b("PaneTitle", g.f14661r);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final q f14634f = p.a("SelectableGroup");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final q f14635g = p.a("CollectionInfo");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final q f14636h = p.a("CollectionItemInfo");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final q f14637i = p.a("Heading");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final q f14638j = p.a("Disabled");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final q f14639k = p.a("LiveRegion");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final q f14640l = p.a("Focused");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final q f14641m = p.a("IsTraversalGroup");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final q f14642n = new q("InvisibleToUser", d.f14658r);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final q f14643o = new q("ContentType", c.f14657r);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final q f14644p = new q("ContentDataType", a.f14655r);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final q f14645q = p.b("TraversalIndex", k.f14665r);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final q f14646r = p.a("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final q f14647s = p.a("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final q f14648t = p.b("IsPopup", f.f14660r);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final q f14649u = p.b("IsDialog", e.f14659r);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final q f14650v = p.b("Role", h.f14662r);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final q f14651w = new q("TestTag", false, i.f14663r);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final q f14652x = p.b("Text", j.f14664r);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final q f14653y = new q("TextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final q f14654z = new q("IsShowingTextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final q f14618A = p.a("EditableText");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final q f14619B = p.a("TextSelectionRange");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final q f14620C = p.a("ImeAction");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final q f14621D = p.a("Selected");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final q f14622E = p.a("ToggleableState");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final q f14623F = p.a("Password");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final q f14624G = p.a("Error");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final q f14625H = new q("IndexForKey", null, 2, null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final q f14626I = new q("IsEditable", null, 2, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final q f14627J = new q("MaxTextLength", null, 2, null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f14628K = 8;

    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f14655r = new a();

        a() {
            super(2);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            androidx.appcompat.app.o.a(obj);
            androidx.appcompat.app.o.a(obj2);
            throw null;
        }
    }

    static final class b extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f14656r = new b();

        b() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listU0;
            if (list == null || (listU0 = AbstractC1444s.u0(list)) == null) {
                return list2;
            }
            listU0.addAll(list2);
            return listU0;
        }
    }

    static final class c extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f14657r = new c();

        c() {
            super(2);
        }

        public final D.i a(D.i iVar, D.i iVar2) {
            return iVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            androidx.appcompat.app.o.a(obj);
            androidx.appcompat.app.o.a(obj2);
            a(null, null);
            return null;
        }
    }

    static final class d extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f14658r = new d();

        d() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(A a10, A a11) {
            return a10;
        }
    }

    static final class e extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f14659r = new e();

        e() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(A a10, A a11) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    static final class f extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final f f14660r = new f();

        f() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(A a10, A a11) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    static final class g extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final g f14661r = new g();

        g() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    static final class h extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final h f14662r = new h();

        h() {
            super(2);
        }

        public final p011b0.d a(p011b0.d dVar, int i10) {
            return dVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p011b0.d) obj, ((p011b0.d) obj2).n());
        }
    }

    static final class i extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final i f14663r = new i();

        i() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class j extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final j f14664r = new j();

        j() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listU0;
            if (list == null || (listU0 = AbstractC1444s.u0(list)) == null) {
                return list2;
            }
            listU0.addAll(list2);
            return listU0;
        }
    }

    static final class k extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final k f14665r = new k();

        k() {
            super(2);
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Float) obj, ((Number) obj2).floatValue());
        }
    }

    private m() {
    }

    public final q A() {
        return f14652x;
    }

    public final q B() {
        return f14619B;
    }

    public final q C() {
        return f14653y;
    }

    public final q D() {
        return f14622E;
    }

    public final q E() {
        return f14645q;
    }

    public final q F() {
        return f14647s;
    }

    public final q a() {
        return f14635g;
    }

    public final q b() {
        return f14636h;
    }

    public final q c() {
        return f14644p;
    }

    public final q d() {
        return f14630b;
    }

    public final q e() {
        return f14643o;
    }

    public final q f() {
        return f14638j;
    }

    public final q g() {
        return f14618A;
    }

    public final q h() {
        return f14624G;
    }

    public final q i() {
        return f14640l;
    }

    public final q j() {
        return f14637i;
    }

    public final q k() {
        return f14646r;
    }

    public final q l() {
        return f14620C;
    }

    public final q m() {
        return f14642n;
    }

    public final q n() {
        return f14626I;
    }

    public final q o() {
        return f14654z;
    }

    public final q p() {
        return f14641m;
    }

    public final q q() {
        return f14639k;
    }

    public final q r() {
        return f14627J;
    }

    public final q s() {
        return f14633e;
    }

    public final q t() {
        return f14623F;
    }

    public final q u() {
        return f14632d;
    }

    public final q v() {
        return f14650v;
    }

    public final q w() {
        return f14634f;
    }

    public final q x() {
        return f14621D;
    }

    public final q y() {
        return f14631c;
    }

    public final q z() {
        return f14651w;
    }
}
