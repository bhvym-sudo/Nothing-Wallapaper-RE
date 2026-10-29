package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.v;
import androidx.core.view.AbstractC1070b;
import androidx.core.view.AbstractC1083o;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050f.j;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class[] f10320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class[] f10321f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f10322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f10323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f10324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f10325d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class[] f10326c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f10327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f10328b;

        public a(Object obj, String str) {
            this.f10327a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10328b = cls.getMethod(str, f10326c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f10328b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10328b.invoke(this.f10327a, menuItem)).booleanValue();
                }
                this.f10328b.invoke(this.f10327a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        AbstractC1070b f10329A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private CharSequence f10330B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private CharSequence f10331C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private ColorStateList f10332D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f10333E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f10335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10340f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f10341g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f10342h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10343i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f10344j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f10345k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f10346l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10347m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f10348n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f10349o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f10350p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f10351q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f10352r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f10353s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f10354t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f10355u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f10356v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f10357w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f10358x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f10359y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f10360z;

        public b(Menu menu) {
            this.f10335a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f10324c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z9 = false;
            menuItem.setChecked(this.f10353s).setVisible(this.f10354t).setEnabled(this.f10355u).setCheckable(this.f10352r >= 1).setTitleCondensed(this.f10346l).setIcon(this.f10347m);
            int i10 = this.f10356v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f10360z != null) {
                if (g.this.f10324c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f10360z));
            }
            if (this.f10352r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).s(true);
                } else if (menuItem instanceof p100k.c) {
                    ((p100k.c) menuItem).h(true);
                }
            }
            String str = this.f10358x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f10320e, g.this.f10322a));
                z9 = true;
            }
            int i11 = this.f10357w;
            if (i11 > 0) {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC1070b abstractC1070b = this.f10329A;
            if (abstractC1070b != null) {
                AbstractC1083o.a(menuItem, abstractC1070b);
            }
            AbstractC1083o.c(menuItem, this.f10330B);
            AbstractC1083o.g(menuItem, this.f10331C);
            AbstractC1083o.b(menuItem, this.f10348n, this.f10349o);
            AbstractC1083o.f(menuItem, this.f10350p, this.f10351q);
            PorterDuff.Mode mode = this.f10333E;
            if (mode != null) {
                AbstractC1083o.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f10332D;
            if (colorStateList != null) {
                AbstractC1083o.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f10342h = true;
            i(this.f10335a.add(this.f10336b, this.f10343i, this.f10344j, this.f10345k));
        }

        public SubMenu b() {
            this.f10342h = true;
            SubMenu subMenuAddSubMenu = this.f10335a.addSubMenu(this.f10336b, this.f10343i, this.f10344j, this.f10345k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f10342h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f10324c.obtainStyledAttributes(attributeSet, j.f20667o1);
            this.f10336b = typedArrayObtainStyledAttributes.getResourceId(j.f20677q1, 0);
            this.f10337c = typedArrayObtainStyledAttributes.getInt(j.f20687s1, 0);
            this.f10338d = typedArrayObtainStyledAttributes.getInt(j.f20692t1, 0);
            this.f10339e = typedArrayObtainStyledAttributes.getInt(j.f20697u1, 0);
            this.f10340f = typedArrayObtainStyledAttributes.getBoolean(j.f20682r1, true);
            this.f10341g = typedArrayObtainStyledAttributes.getBoolean(j.f20672p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            J jU = J.u(g.this.f10324c, attributeSet, j.f20702v1);
            this.f10343i = jU.n(j.f20717y1, 0);
            this.f10344j = (jU.k(j.f20497B1, this.f10337c) & (-65536)) | (jU.k(j.f20501C1, this.f10338d) & 65535);
            this.f10345k = jU.p(j.f20505D1);
            this.f10346l = jU.p(j.f20509E1);
            this.f10347m = jU.n(j.f20707w1, 0);
            this.f10348n = c(jU.o(j.f20513F1));
            this.f10349o = jU.k(j.f20541M1, 4096);
            this.f10350p = c(jU.o(j.f20517G1));
            this.f10351q = jU.k(j.f20557Q1, 4096);
            int i10 = j.f20521H1;
            if (jU.s(i10)) {
                this.f10352r = jU.a(i10, false) ? 1 : 0;
            } else {
                this.f10352r = this.f10339e;
            }
            this.f10353s = jU.a(j.f20722z1, false);
            this.f10354t = jU.a(j.f20492A1, this.f10340f);
            this.f10355u = jU.a(j.f20712x1, this.f10341g);
            this.f10356v = jU.k(j.f20561R1, -1);
            this.f10360z = jU.o(j.f20525I1);
            this.f10357w = jU.n(j.f20529J1, 0);
            this.f10358x = jU.o(j.f20537L1);
            String strO = jU.o(j.f20533K1);
            this.f10359y = strO;
            boolean z9 = strO != null;
            if (z9 && this.f10357w == 0 && this.f10358x == null) {
                this.f10329A = (AbstractC1070b) e(strO, g.f10321f, g.this.f10323b);
            } else {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f10329A = null;
            }
            this.f10330B = jU.p(j.f20545N1);
            this.f10331C = jU.p(j.f20565S1);
            int i11 = j.f20553P1;
            if (jU.s(i11)) {
                this.f10333E = v.d(jU.k(i11, -1), this.f10333E);
            } else {
                this.f10333E = null;
            }
            int i12 = j.f20549O1;
            if (jU.s(i12)) {
                this.f10332D = jU.c(i12);
            } else {
                this.f10332D = null;
            }
            jU.x();
            this.f10342h = false;
        }

        public void h() {
            this.f10336b = 0;
            this.f10337c = 0;
            this.f10338d = 0;
            this.f10339e = 0;
            this.f10340f = true;
            this.f10341g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f10320e = clsArr;
        f10321f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f10324c = context;
        Object[] objArr = {context};
        this.f10322a = objArr;
        this.f10323b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        z10 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC1070b abstractC1070b = bVar.f10329A;
                            if (abstractC1070b == null || !abstractC1070b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z9 = true;
                    }
                }
            } else if (!z10) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z10 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f10325d == null) {
            this.f10325d = a(this.f10324c);
        }
        return this.f10325d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof p211v0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z9 = false;
        try {
            try {
                layout = this.f10324c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z9 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z9) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z9) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
