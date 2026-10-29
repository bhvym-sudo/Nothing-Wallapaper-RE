package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static B f10732i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap f10734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.P f10735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.collection.Q f10736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f10737d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f10738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f10740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f10731h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f10733j = new a(6);

    private static class a extends androidx.collection.t {
        public a(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) e(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(B b10, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j9, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.r rVar = (androidx.collection.r) this.f10737d.get(context);
            if (rVar == null) {
                rVar = new androidx.collection.r();
                this.f10737d.put(context, rVar);
            }
            rVar.l(j9, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f10734a == null) {
            this.f10734a = new WeakHashMap();
        }
        androidx.collection.Q q9 = (androidx.collection.Q) this.f10734a.get(context);
        if (q9 == null) {
            q9 = new androidx.collection.Q();
            this.f10734a.put(context, q9);
        }
        q9.c(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f10739f) {
            return;
        }
        this.f10739f = true;
        Drawable drawableI = i(context, p080i.a.f21885a);
        if (drawableI == null || !p(drawableI)) {
            this.f10739f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f10738e == null) {
            this.f10738e = new TypedValue();
        }
        TypedValue typedValue = this.f10738e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f10740g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i10);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized B g() {
        try {
            if (f10732i == null) {
                B b10 = new B();
                f10732i = b10;
                o(b10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10732i;
    }

    private synchronized Drawable h(Context context, long j9) {
        androidx.collection.r rVar = (androidx.collection.r) this.f10737d.get(context);
        if (rVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) rVar.h(j9);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            rVar.m(j9);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        a aVar = f10733j;
        porterDuffColorFilterK = aVar.k(i10, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i10, mode);
            aVar.l(i10, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList m(Context context, int i10) {
        androidx.collection.Q q9;
        WeakHashMap weakHashMap = this.f10734a;
        if (weakHashMap == null || (q9 = (androidx.collection.Q) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) q9.i(i10);
    }

    private static void o(B b10) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        androidx.collection.P p9 = this.f10735b;
        if (p9 == null || p9.isEmpty()) {
            return null;
        }
        androidx.collection.Q q9 = this.f10736c;
        if (q9 != null) {
            String str = (String) q9.i(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f10735b.get(str) == null)) {
                return null;
            }
        } else {
            this.f10736c = new androidx.collection.Q();
        }
        if (this.f10738e == null) {
            this.f10738e = new TypedValue();
        }
        TypedValue typedValue = this.f10738e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f10736c.c(i10, name);
                b bVar = (b) this.f10735b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f10736c.c(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z9, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = p201u0.a.r(drawable.mutate());
            p201u0.a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                p201u0.a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f10740g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z9) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, H h10, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z9 = h10.f10799d;
        if (z9 || h10.f10798c) {
            drawable.setColorFilter(f(z9 ? h10.f10796a : null, h10.f10798c ? h10.f10797b : f10731h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z9) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = p171r0.a.d(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z9, drawableQ);
            }
            if (drawableQ != null) {
                v.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f10740g;
            colorStateListM = cVar == null ? null : cVar.d(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f10740g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i10);
    }

    public synchronized void r(Context context) {
        androidx.collection.r rVar = (androidx.collection.r) this.f10737d.get(context);
        if (rVar != null) {
            rVar.c();
        }
    }

    synchronized Drawable s(Context context, P p9, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = p9.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f10740g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f10740g;
        return cVar != null && cVar.a(context, i10, drawable);
    }
}
