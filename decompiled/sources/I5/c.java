package I5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3098a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f3099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f3102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f3103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f3104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f3105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f3106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f3107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f3108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f3109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f3110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f3111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f3112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f3113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f3114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f3115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f3116s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return c.f3111n;
        }

        public final int b() {
            return c.f3100c;
        }

        public final int c() {
            return c.f3101d;
        }

        public final int d() {
            return c.f3102e;
        }

        public final int e() {
            return c.f3114q;
        }

        public final int f() {
            return c.f3103f;
        }

        public final int g() {
            return c.f3115r;
        }

        public final int h() {
            return c.f3104g;
        }

        public final int i() {
            return c.f3116s;
        }

        public final int j() {
            return c.f3105h;
        }

        public final int k() {
            return c.f3106i;
        }

        public final int l() {
            return c.f3112o;
        }

        public final int m() {
            return c.f3109l;
        }

        public final int n() {
            return c.f3107j;
        }

        public final int o() {
            return c.f3108k;
        }

        public final int p() {
            return c.f3113p;
        }

        public final int q() {
            return c.f3110m;
        }

        public final Class r(int i10) {
            if (i10 == b()) {
                return Boolean.TYPE;
            }
            if (i10 == c()) {
                return Byte.TYPE;
            }
            if (i10 == d()) {
                return CharSequence.class;
            }
            if (i10 == f()) {
                return Double.TYPE;
            }
            if (i10 == h()) {
                return Float.TYPE;
            }
            if (i10 == j()) {
                return Integer.TYPE;
            }
            if (i10 == k()) {
                return Long.TYPE;
            }
            if (i10 == n()) {
                return Short.TYPE;
            }
            if (i10 == o()) {
                return String.class;
            }
            if (i10 == m()) {
                return ImageView.ScaleType.class;
            }
            if (i10 == q()) {
                return TextUtils.TruncateAt.class;
            }
            if (i10 == a()) {
                return BlendMode.class;
            }
            if (i10 == l()) {
                return PorterDuff.Mode.class;
            }
            if (i10 == p()) {
                return TimeInterpolator.class;
            }
            if (i10 == e()) {
                return ColorStateList.class;
            }
            if (i10 == g()) {
                return Drawable.class;
            }
            if (i10 == i()) {
                return Icon.class;
            }
            throw new UnsupportedOperationException("Error parse param type. typeIndex: " + i10);
        }

        public final Object s(Context context, int i10, Object obj) {
            float fDoubleValue;
            n.h(context, "context");
            if (i10 == m()) {
                g.a aVar = g.f3120a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar.a(((Integer) obj).intValue());
            }
            if (i10 == q()) {
                i.a aVar2 = i.f3122a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar2.a(((Integer) obj).intValue());
            }
            if (i10 == a()) {
                d.a aVar3 = d.f3117a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar3.a(((Integer) obj).intValue());
            }
            if (i10 == l()) {
                e.a aVar4 = e.f3118a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar4.a(((Integer) obj).intValue());
            }
            if (i10 == p()) {
                h.a aVar5 = h.f3121a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar5.a(((Integer) obj).intValue());
            }
            if (i10 == e()) {
                f.a aVar6 = f.f3119a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar6.a(context, ((Integer) obj).intValue());
            }
            if (i10 == g()) {
                f.a aVar7 = f.f3119a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar7.b(context, ((Integer) obj).intValue());
            }
            if (i10 == i()) {
                f.a aVar8 = f.f3119a;
                n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return aVar8.c(context, ((Integer) obj).intValue());
            }
            if (i10 == h()) {
                if (obj instanceof Integer) {
                    fDoubleValue = ((Number) obj).intValue();
                } else {
                    n.f(obj, "null cannot be cast to non-null type kotlin.Double");
                    fDoubleValue = (float) ((Double) obj).doubleValue();
                }
                return Float.valueOf(fDoubleValue);
            }
            if (obj == null) {
                return null;
            }
            Object obj2 = JSONObject.NULL;
            if (n.d(obj, obj2) || n.d(obj2.toString(), obj.toString())) {
                return null;
            }
            return obj;
        }

        private a() {
        }
    }

    static {
        int i10 = f3099b;
        f3100c = i10;
        f3101d = i10 + 1;
        f3102e = i10 + 2;
        f3103f = i10 + 3;
        f3104g = i10 + 4;
        f3105h = i10 + 5;
        f3106i = i10 + 6;
        f3107j = i10 + 7;
        f3108k = i10 + 8;
        f3109l = i10 + 9;
        f3110m = i10 + 10;
        f3111n = i10 + 11;
        f3112o = i10 + 12;
        f3113p = i10 + 13;
        f3114q = i10 + 14;
        f3115r = i10 + 15;
        f3099b = i10 + 17;
        f3116s = i10 + 16;
    }
}
