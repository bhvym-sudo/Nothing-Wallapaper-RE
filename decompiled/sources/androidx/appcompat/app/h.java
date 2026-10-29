package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1011h;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.t;
import androidx.collection.P;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.core.view.AbstractC1078j;
import androidx.core.view.AbstractC1079k;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.O;
import androidx.core.view.Q;
import androidx.core.view.V;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1163x;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class h extends androidx.appcompat.app.f implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final Context f10121A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    Window f10122B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private m f10123C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final androidx.appcompat.app.d f10124D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.appcompat.app.a f10125E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    MenuInflater f10126F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f10127G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private t f10128H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private g f10129I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private s f10130J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    androidx.appcompat.view.b f10131K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    ActionBarContextView f10132L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    PopupWindow f10133M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Runnable f10134N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    O f10135O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f10136P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f10137Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    ViewGroup f10138R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private TextView f10139S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f10140T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f10141U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f10142V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f10143W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    boolean f10144X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f10145Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f10146Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    boolean f10147a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f10148b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private r[] f10149c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private r f10150d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f10151e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f10152f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f10153g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f10154h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Configuration f10155i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f10156j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f10157k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f10158l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f10159m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private o f10160n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private o f10161o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f10162p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    int f10163q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Runnable f10164r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f10165s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private Rect f10166t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private Rect f10167u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private androidx.appcompat.app.l f10168v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private androidx.appcompat.app.n f10169w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private OnBackInvokedDispatcher f10170x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private OnBackInvokedCallback f10171y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final Object f10172z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final P f10120z0 = new P();

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private static final boolean f10117A0 = false;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private static final int[] f10118B0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private static final boolean f10119C0 = !"robolectric".equals(Build.FINGERPRINT);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f10163q0 & 1) != 0) {
                hVar.f0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f10163q0 & 4096) != 0) {
                hVar2.f0(108);
            }
            h hVar3 = h.this;
            hVar3.f10162p0 = false;
            hVar3.f10163q0 = 0;
        }
    }

    class b implements InterfaceC1090w {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            int iL = v9.l();
            int iC1 = h.this.c1(v9, null);
            if (iL != iC1) {
                v9 = v9.p(v9.j(), iC1, v9.k(), v9.i());
            }
            return H.T(view, v9);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.d0();
        }
    }

    class d implements Runnable {

        class a extends Q {
            a() {
            }

            @Override // androidx.core.view.P
            public void b(View view) {
                h.this.f10132L.setAlpha(1.0f);
                h.this.f10135O.g(null);
                h.this.f10135O = null;
            }

            @Override // androidx.core.view.Q, androidx.core.view.P
            public void c(View view) {
                h.this.f10132L.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f10133M.showAtLocation(hVar.f10132L, 55, 0, 0);
            h.this.g0();
            if (!h.this.R0()) {
                h.this.f10132L.setAlpha(1.0f);
                h.this.f10132L.setVisibility(0);
            } else {
                h.this.f10132L.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f10135O = H.d(hVar2.f10132L).b(1.0f);
                h.this.f10135O.g(new a());
            }
        }
    }

    class e extends Q {
        e() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            h.this.f10132L.setAlpha(1.0f);
            h.this.f10135O.g(null);
            h.this.f10135O = null;
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void c(View view) {
            h.this.f10132L.setVisibility(0);
            if (h.this.f10132L.getParent() instanceof View) {
                H.d0((View) h.this.f10132L.getParent());
            }
        }
    }

    interface f {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class g implements androidx.appcompat.view.menu.j.a {
        g() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
            h.this.W(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackS0 = h.this.s0();
            if (callbackS0 == null) {
                return true;
            }
            callbackS0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    class C0361h implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.view.b.a f10180a;

        /* JADX INFO: renamed from: androidx.appcompat.app.h$h$a */
        class a extends Q {
            a() {
            }

            @Override // androidx.core.view.P
            public void b(View view) {
                h.this.f10132L.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f10133M;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f10132L.getParent() instanceof View) {
                    H.d0((View) h.this.f10132L.getParent());
                }
                h.this.f10132L.k();
                h.this.f10135O.g(null);
                h hVar2 = h.this;
                hVar2.f10135O = null;
                H.d0(hVar2.f10138R);
            }
        }

        public C0361h(androidx.appcompat.view.b.a aVar) {
            this.f10180a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f10180a.a(bVar);
            h hVar = h.this;
            if (hVar.f10133M != null) {
                hVar.f10122B.getDecorView().removeCallbacks(h.this.f10134N);
            }
            h hVar2 = h.this;
            if (hVar2.f10132L != null) {
                hVar2.g0();
                h hVar3 = h.this;
                hVar3.f10135O = H.d(hVar3.f10132L).b(0.0f);
                h.this.f10135O.g(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.d dVar = hVar4.f10124D;
            if (dVar != null) {
                dVar.j(hVar4.f10131K);
            }
            h hVar5 = h.this;
            hVar5.f10131K = null;
            H.d0(hVar5.f10138R);
            h.this.a1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f10180a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            H.d0(h.this.f10138R);
            return this.f10180a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f10180a.d(bVar, menuItem);
        }
    }

    static class i {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static p231x0.h b(Configuration configuration) {
            return p231x0.h.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(p231x0.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.g()));
        }

        static void d(Configuration configuration, p231x0.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.g()));
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    static class l {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.i
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    hVar.A0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    class m extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private f f10183r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f10184s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f10185t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f10186u;

        m(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f10185t = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f10185t = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f10184s = true;
                callback.onContentChanged();
            } finally {
                this.f10184s = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f10186u = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f10186u = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f10185t) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return h.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(f fVar) {
            this.f10183r = fVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            androidx.appcompat.view.f.a aVar = new androidx.appcompat.view.f.a(h.this.f10121A, callback);
            androidx.appcompat.view.b bVarU0 = h.this.U0(aVar);
            if (bVarU0 != null) {
                return aVar.e(bVarU0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f10184s) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            f fVar = this.f10183r;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.G0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f10186u) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                h.this.H0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            f fVar = this.f10183r;
            boolean zOnPreparePanel = fVar != null && fVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            r rVarQ0 = h.this.q0(0, true);
            if (rVarQ0 == null || (eVar = rVarQ0.f10205j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (h.this.y0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class n extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f10188c;

        n(Context context) {
            super();
            this.f10188c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int c() {
            return i.a(this.f10188c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void d() {
            h.this.Q();
        }
    }

    abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f10190a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f10190a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f10121A.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f10190a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f10190a == null) {
                this.f10190a = new a();
            }
            h.this.f10121A.registerReceiver(this.f10190a, intentFilterB);
        }
    }

    private class p extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.r f10193c;

        p(androidx.appcompat.app.r rVar) {
            super();
            this.f10193c = rVar;
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int c() {
            return this.f10193c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void d() {
            h.this.Q();
        }
    }

    private class q extends ContentFrameLayout {
        public q(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(p060g.a.b(getContext(), i10));
        }
    }

    protected static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f10202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f10203h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f10204i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f10205j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f10206k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f10207l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f10208m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f10209n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f10210o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10211p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f10212q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f10213r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f10214s;

        r(int i10) {
            this.f10196a = i10;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a aVar) {
            if (this.f10205j == null) {
                return null;
            }
            if (this.f10206k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f10207l, p050f.g.f20465j);
                this.f10206k = cVar;
                cVar.h(aVar);
                this.f10205j.b(this.f10206k);
            }
            return this.f10206k.b(this.f10202g);
        }

        public boolean b() {
            if (this.f10203h == null) {
                return false;
            }
            return this.f10204i != null || this.f10206k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f10205j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f10206k);
            }
            this.f10205j = eVar;
            if (eVar == null || (cVar = this.f10206k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(p050f.a.f20335a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(p050f.a.f20326F, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(p050f.i.f20487b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f10207l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(p050f.j.f20716y0);
            this.f10197b = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20496B0, 0);
            this.f10201f = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20491A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class s implements androidx.appcompat.view.menu.j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z10 = eVarD != eVar;
            h hVar = h.this;
            if (z10) {
                eVar = eVarD;
            }
            r rVarJ0 = hVar.j0(eVar);
            if (rVarJ0 != null) {
                if (!z10) {
                    h.this.Z(rVarJ0, z9);
                } else {
                    h.this.V(rVarJ0.f10196a, rVarJ0, eVarD);
                    h.this.Z(rVarJ0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackS0;
            if (eVar != eVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f10143W || (callbackS0 = hVar.s0()) == null || h.this.f10154h0) {
                return true;
            }
            callbackS0.onMenuOpened(108, eVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean C0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r rVarQ0 = q0(i10, true);
        if (rVarQ0.f10210o) {
            return false;
        }
        return M0(rVarQ0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean F0(int i10, KeyEvent keyEvent) {
        boolean zM0;
        t tVar;
        if (this.f10131K != null) {
            return false;
        }
        boolean zF = true;
        r rVarQ0 = q0(i10, true);
        if (i10 != 0 || (tVar = this.f10128H) == null || !tVar.d() || ViewConfiguration.get(this.f10121A).hasPermanentMenuKey()) {
            boolean z9 = rVarQ0.f10210o;
            if (z9 || rVarQ0.f10209n) {
                Z(rVarQ0, true);
                zF = z9;
            } else if (rVarQ0.f10208m) {
                if (rVarQ0.f10213r) {
                    rVarQ0.f10208m = false;
                    zM0 = M0(rVarQ0, keyEvent);
                } else {
                    zM0 = true;
                }
                if (zM0) {
                    J0(rVarQ0, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.f10128H.b()) {
            zF = this.f10128H.f();
        } else if (this.f10154h0 || !M0(rVarQ0, keyEvent)) {
            zF = false;
        } else {
            zF = this.f10128H.g();
        }
        if (zF) {
            AudioManager audioManager = (AudioManager) this.f10121A.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zF;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zF;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void J0(r rVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (rVar.f10210o || this.f10154h0) {
            return;
        }
        if (rVar.f10196a == 0 && (this.f10121A.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null && !callbackS0.onMenuOpened(rVar.f10196a, rVar.f10205j)) {
            Z(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10121A.getSystemService("window");
        if (windowManager != null && M0(rVar, keyEvent)) {
            ViewGroup viewGroup = rVar.f10202g;
            if (viewGroup != null && !rVar.f10212q) {
                View view = rVar.f10204i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                rVar.f10209n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, rVar.f10199d, rVar.f10200e, 1002, 8519680, -3);
                layoutParams2.gravity = rVar.f10198c;
                layoutParams2.windowAnimations = rVar.f10201f;
                windowManager.addView(rVar.f10202g, layoutParams2);
                rVar.f10210o = true;
                if (rVar.f10196a == 0) {
                    a1();
                }
            }
            if (viewGroup == null) {
                if (!v0(rVar) || rVar.f10202g == null) {
                    return;
                }
            } else if (rVar.f10212q && viewGroup.getChildCount() > 0) {
                rVar.f10202g.removeAllViews();
            }
            if (!u0(rVar) || !rVar.b()) {
                rVar.f10212q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = rVar.f10203h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            rVar.f10202g.setBackgroundResource(rVar.f10197b);
            ViewParent parent = rVar.f10203h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(rVar.f10203h);
            }
            rVar.f10202g.addView(rVar.f10203h, layoutParams3);
            if (!rVar.f10203h.hasFocus()) {
                rVar.f10203h.requestFocus();
            }
            i10 = -2;
            rVar.f10209n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, rVar.f10199d, rVar.f10200e, 1002, 8519680, -3);
            layoutParams4.gravity = rVar.f10198c;
            layoutParams4.windowAnimations = rVar.f10201f;
            windowManager.addView(rVar.f10202g, layoutParams4);
            rVar.f10210o = true;
            if (rVar.f10196a == 0) {
                a1();
            }
        }
    }

    private boolean L0(r rVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f10208m || M0(rVar, keyEvent)) && (eVar = rVar.f10205j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f10128H == null) {
            Z(rVar, true);
        }
        return zPerformShortcut;
    }

    private boolean M0(r rVar, KeyEvent keyEvent) {
        t tVar;
        t tVar2;
        t tVar3;
        if (this.f10154h0) {
            return false;
        }
        if (rVar.f10208m) {
            return true;
        }
        r rVar2 = this.f10150d0;
        if (rVar2 != null && rVar2 != rVar) {
            Z(rVar2, false);
        }
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null) {
            rVar.f10204i = callbackS0.onCreatePanelView(rVar.f10196a);
        }
        int i10 = rVar.f10196a;
        boolean z9 = i10 == 0 || i10 == 108;
        if (z9 && (tVar3 = this.f10128H) != null) {
            tVar3.c();
        }
        if (rVar.f10204i == null && (!z9 || !(K0() instanceof androidx.appcompat.app.p))) {
            androidx.appcompat.view.menu.e eVar = rVar.f10205j;
            if (eVar == null || rVar.f10213r) {
                if (eVar == null && (!w0(rVar) || rVar.f10205j == null)) {
                    return false;
                }
                if (z9 && this.f10128H != null) {
                    if (this.f10129I == null) {
                        this.f10129I = new g();
                    }
                    this.f10128H.a(rVar.f10205j, this.f10129I);
                }
                rVar.f10205j.e0();
                if (!callbackS0.onCreatePanelMenu(rVar.f10196a, rVar.f10205j)) {
                    rVar.c(null);
                    if (z9 && (tVar = this.f10128H) != null) {
                        tVar.a(null, this.f10129I);
                    }
                    return false;
                }
                rVar.f10213r = false;
            }
            rVar.f10205j.e0();
            Bundle bundle = rVar.f10214s;
            if (bundle != null) {
                rVar.f10205j.Q(bundle);
                rVar.f10214s = null;
            }
            if (!callbackS0.onPreparePanel(0, rVar.f10204i, rVar.f10205j)) {
                if (z9 && (tVar2 = this.f10128H) != null) {
                    tVar2.a(null, this.f10129I);
                }
                rVar.f10205j.d0();
                return false;
            }
            boolean z10 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f10211p = z10;
            rVar.f10205j.setQwertyMode(z10);
            rVar.f10205j.d0();
        }
        rVar.f10208m = true;
        rVar.f10209n = false;
        this.f10150d0 = rVar;
        return true;
    }

    private void N0(boolean z9) {
        t tVar = this.f10128H;
        if (tVar == null || !tVar.d() || (ViewConfiguration.get(this.f10121A).hasPermanentMenuKey() && !this.f10128H.e())) {
            r rVarQ0 = q0(0, true);
            rVarQ0.f10212q = true;
            Z(rVarQ0, false);
            J0(rVarQ0, null);
            return;
        }
        Window.Callback callbackS0 = s0();
        if (this.f10128H.b() && z9) {
            this.f10128H.f();
            if (this.f10154h0) {
                return;
            }
            callbackS0.onPanelClosed(108, q0(0, true).f10205j);
            return;
        }
        if (callbackS0 == null || this.f10154h0) {
            return;
        }
        if (this.f10162p0 && (this.f10163q0 & 1) != 0) {
            this.f10122B.getDecorView().removeCallbacks(this.f10164r0);
            this.f10164r0.run();
        }
        r rVarQ1 = q0(0, true);
        androidx.appcompat.view.menu.e eVar = rVarQ1.f10205j;
        if (eVar == null || rVarQ1.f10213r || !callbackS0.onPreparePanel(0, rVarQ1.f10204i, eVar)) {
            return;
        }
        callbackS0.onMenuOpened(108, rVarQ1.f10205j);
        this.f10128H.g();
    }

    private boolean O(boolean z9) {
        return P(z9, true);
    }

    private int O0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean P(boolean z9, boolean z10) {
        if (this.f10154h0) {
            return false;
        }
        int iU = U();
        boolean zZ0 = Z0(z0(this.f10121A, iU), null, z9);
        if (iU == 0) {
            o0(this.f10121A).e();
        } else {
            o oVar = this.f10160n0;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (iU == 3) {
            n0(this.f10121A).e();
            return zZ0;
        }
        o oVar2 = this.f10161o0;
        if (oVar2 != null) {
            oVar2.a();
        }
        return zZ0;
    }

    private void R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f10138R.findViewById(R.id.content);
        View decorView = this.f10122B.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f10121A.obtainStyledAttributes(p050f.j.f20716y0);
        typedArrayObtainStyledAttributes.getValue(p050f.j.f20532K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(p050f.j.f20536L0, contentFrameLayout.getMinWidthMinor());
        int i10 = p050f.j.f20524I0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = p050f.j.f20528J0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = p050f.j.f20516G0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = p050f.j.f20520H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void S(Window window) {
        if (this.f10122B != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.f10123C = mVar;
        window.setCallback(mVar);
        J jU = J.u(this.f10121A, null, f10118B0);
        Drawable drawableH = jU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        jU.x();
        this.f10122B = window;
        if (this.f10170x0 == null) {
            I(null);
        }
    }

    private boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f10122B.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int U() {
        int i10 = this.f10156j0;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.m();
    }

    private void W0() {
        if (this.f10137Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void X() {
        o oVar = this.f10160n0;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.f10161o0;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private androidx.appcompat.app.c X0() {
        for (Context baseContext = this.f10121A; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y0(Configuration configuration) {
        Activity activity = (Activity) this.f10172z;
        if (activity instanceof InterfaceC1163x) {
            if (((InterfaceC1163x) activity).getLifecycle().b().e(AbstractC1157q.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f10153g0 || this.f10154h0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    private boolean Z0(int i10, p231x0.h hVar, boolean z9) {
        boolean z10;
        Configuration configurationA0 = a0(this.f10121A, i10, hVar, null, false);
        int iM0 = m0(this.f10121A);
        Configuration configuration = this.f10155i0;
        if (configuration == null) {
            configuration = this.f10121A.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationA0.uiMode & 48;
        p231x0.h hVarP0 = p0(configuration);
        p231x0.h hVarP1 = hVar == null ? null : p0(configurationA0);
        int i13 = i11 != i12 ? Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING : 0;
        if (hVarP1 != null && !hVarP0.equals(hVarP1)) {
            i13 |= 8196;
        }
        boolean z11 = true;
        if (((~iM0) & i13) != 0 && z9 && this.f10152f0 && (f10119C0 || this.f10153g0)) {
            Object obj = this.f10172z;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z10 = false;
            } else {
                if ((i13 & 8192) != 0) {
                    ((Activity) this.f10172z).getWindow().getDecorView().setLayoutDirection(configurationA0.getLayoutDirection());
                }
                p161q0.a.i((Activity) this.f10172z);
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10 || i13 == 0) {
            z11 = z10;
        } else {
            b1(i12, hVarP1, (i13 & iM0) == i13, null);
        }
        if (z11) {
            Object obj2 = this.f10172z;
            if (obj2 instanceof androidx.appcompat.app.c) {
                if ((i13 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
                    ((androidx.appcompat.app.c) obj2).A0(i10);
                }
                if ((i13 & 4) != 0) {
                    ((androidx.appcompat.app.c) this.f10172z).z0(hVar);
                }
            }
        }
        if (hVarP1 != null) {
            Q0(p0(this.f10121A.getResources().getConfiguration()));
        }
        return z11;
    }

    private Configuration a0(Context context, int i10, p231x0.h hVar, Configuration configuration, boolean z9) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z9 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            P0(configuration2, hVar);
        }
        return configuration2;
    }

    private ViewGroup b0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f10121A.obtainStyledAttributes(p050f.j.f20716y0);
        int i10 = p050f.j.f20504D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p050f.j.f20540M0, false)) {
            E(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            E(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p050f.j.f20508E0, false)) {
            E(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p050f.j.f20512F0, false)) {
            E(10);
        }
        this.f10146Z = typedArrayObtainStyledAttributes.getBoolean(p050f.j.f20721z0, false);
        typedArrayObtainStyledAttributes.recycle();
        i0();
        this.f10122B.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f10121A);
        if (this.f10147a0) {
            viewGroup = this.f10145Y ? (ViewGroup) layoutInflaterFrom.inflate(p050f.g.f20470o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(p050f.g.f20469n, (ViewGroup) null);
        } else if (this.f10146Z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(p050f.g.f20461f, (ViewGroup) null);
            this.f10144X = false;
            this.f10143W = false;
        } else if (this.f10143W) {
            TypedValue typedValue = new TypedValue();
            this.f10121A.getTheme().resolveAttribute(p050f.a.f20339e, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f10121A, typedValue.resourceId) : this.f10121A).inflate(p050f.g.f20471p, (ViewGroup) null);
            t tVar = (t) viewGroup.findViewById(p050f.f.f20445p);
            this.f10128H = tVar;
            tVar.setWindowCallback(s0());
            if (this.f10144X) {
                this.f10128H.h(109);
            }
            if (this.f10141U) {
                this.f10128H.h(2);
            }
            if (this.f10142V) {
                this.f10128H.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f10143W + ", windowActionBarOverlay: " + this.f10144X + ", android:windowIsFloating: " + this.f10146Z + ", windowActionModeOverlay: " + this.f10145Y + ", windowNoTitle: " + this.f10147a0 + " }");
        }
        H.u0(viewGroup, new b());
        if (this.f10128H == null) {
            this.f10139S = (TextView) viewGroup.findViewById(p050f.f.f20426C);
        }
        androidx.appcompat.widget.Q.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(p050f.f.f20431b);
        ViewGroup viewGroup2 = (ViewGroup) this.f10122B.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f10122B.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void b1(int i10, p231x0.h hVar, boolean z9, Configuration configuration) {
        Resources resources = this.f10121A.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            P0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.f10157k0;
        if (i11 != 0) {
            this.f10121A.setTheme(i11);
            this.f10121A.getTheme().applyStyle(this.f10157k0, true);
        }
        if (z9 && (this.f10172z instanceof Activity)) {
            Y0(configuration2);
        }
    }

    private void d1(View view) {
        view.setBackgroundColor((H.F(view) & 8192) != 0 ? p171r0.a.b(this.f10121A, p050f.c.f20363b) : p171r0.a.b(this.f10121A, p050f.c.f20362a));
    }

    private void h0() {
        if (this.f10137Q) {
            return;
        }
        this.f10138R = b0();
        CharSequence charSequenceR0 = r0();
        if (!TextUtils.isEmpty(charSequenceR0)) {
            t tVar = this.f10128H;
            if (tVar != null) {
                tVar.setWindowTitle(charSequenceR0);
            } else if (K0() != null) {
                K0().v(charSequenceR0);
            } else {
                TextView textView = this.f10139S;
                if (textView != null) {
                    textView.setText(charSequenceR0);
                }
            }
        }
        R();
        I0(this.f10138R);
        this.f10137Q = true;
        r rVarQ0 = q0(0, false);
        if (this.f10154h0) {
            return;
        }
        if (rVarQ0 == null || rVarQ0.f10205j == null) {
            x0(108);
        }
    }

    private void i0() {
        if (this.f10122B == null) {
            Object obj = this.f10172z;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.f10122B == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration k0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            j.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            k.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    private int m0(Context context) {
        if (!this.f10159m0 && (this.f10172z instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f10172z.getClass()), 269221888);
                if (activityInfo != null) {
                    this.f10158l0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f10158l0 = 0;
            }
        }
        this.f10159m0 = true;
        return this.f10158l0;
    }

    private o n0(Context context) {
        if (this.f10161o0 == null) {
            this.f10161o0 = new n(context);
        }
        return this.f10161o0;
    }

    private o o0(Context context) {
        if (this.f10160n0 == null) {
            this.f10160n0 = new p(androidx.appcompat.app.r.a(context));
        }
        return this.f10160n0;
    }

    private void t0() {
        h0();
        if (this.f10143W && this.f10125E == null) {
            Object obj = this.f10172z;
            if (obj instanceof Activity) {
                this.f10125E = new androidx.appcompat.app.s((Activity) this.f10172z, this.f10144X);
            } else if (obj instanceof Dialog) {
                this.f10125E = new androidx.appcompat.app.s((Dialog) this.f10172z);
            }
            androidx.appcompat.app.a aVar = this.f10125E;
            if (aVar != null) {
                aVar.r(this.f10165s0);
            }
        }
    }

    private boolean u0(r rVar) {
        View view = rVar.f10204i;
        if (view != null) {
            rVar.f10203h = view;
            return true;
        }
        if (rVar.f10205j == null) {
            return false;
        }
        if (this.f10130J == null) {
            this.f10130J = new s();
        }
        View view2 = (View) rVar.a(this.f10130J);
        rVar.f10203h = view2;
        return view2 != null;
    }

    private boolean v0(r rVar) {
        rVar.d(l0());
        rVar.f10202g = new q(rVar.f10207l);
        rVar.f10198c = 81;
        return true;
    }

    private boolean w0(r rVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f10121A;
        int i10 = rVar.f10196a;
        if ((i10 == 0 || i10 == 108) && this.f10128H != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(p050f.a.f20339e, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(p050f.a.f20340f, typedValue, true);
            } else {
                theme.resolveAttribute(p050f.a.f20340f, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        rVar.c(eVar);
        return true;
    }

    private void x0(int i10) {
        this.f10163q0 = (1 << i10) | this.f10163q0;
        if (this.f10162p0) {
            return;
        }
        H.Y(this.f10122B.getDecorView(), this.f10164r0);
        this.f10162p0 = true;
    }

    @Override // androidx.appcompat.app.f
    public void A() {
        P(true, false);
    }

    boolean A0() {
        boolean z9 = this.f10151e0;
        this.f10151e0 = false;
        r rVarQ0 = q0(0, false);
        if (rVarQ0 != null && rVarQ0.f10210o) {
            if (!z9) {
                Z(rVarQ0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f10131K;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarQ = q();
        return aVarQ != null && aVarQ.h();
    }

    @Override // androidx.appcompat.app.f
    public void B() {
        androidx.appcompat.app.a aVarQ = q();
        if (aVarQ != null) {
            aVarQ.t(false);
        }
    }

    boolean B0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f10151e0 = (keyEvent.getFlags() & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0;
        } else if (i10 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean D0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarQ = q();
        if (aVarQ != null && aVarQ.o(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f10150d0;
        if (rVar != null && L0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.f10150d0;
            if (rVar2 != null) {
                rVar2.f10209n = true;
            }
            return true;
        }
        if (this.f10150d0 == null) {
            r rVarQ0 = q0(0, true);
            M0(rVarQ0, keyEvent);
            boolean zL0 = L0(rVarQ0, keyEvent.getKeyCode(), keyEvent, 1);
            rVarQ0.f10208m = false;
            if (zL0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean E(int i10) {
        int iO0 = O0(i10);
        if (this.f10147a0 && iO0 == 108) {
            return false;
        }
        if (this.f10143W && iO0 == 1) {
            this.f10143W = false;
        }
        if (iO0 == 1) {
            W0();
            this.f10147a0 = true;
            return true;
        }
        if (iO0 == 2) {
            W0();
            this.f10141U = true;
            return true;
        }
        if (iO0 == 5) {
            W0();
            this.f10142V = true;
            return true;
        }
        if (iO0 == 10) {
            W0();
            this.f10145Y = true;
            return true;
        }
        if (iO0 == 108) {
            W0();
            this.f10143W = true;
            return true;
        }
        if (iO0 != 109) {
            return this.f10122B.requestFeature(iO0);
        }
        W0();
        this.f10144X = true;
        return true;
    }

    boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                F0(0, keyEvent);
                return true;
            }
        } else if (A0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void F(int i10) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.f10138R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f10121A).inflate(i10, viewGroup);
        this.f10123C.c(this.f10122B.getCallback());
    }

    @Override // androidx.appcompat.app.f
    public void G(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.f10138R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f10123C.c(this.f10122B.getCallback());
    }

    void G0(int i10) {
        androidx.appcompat.app.a aVarQ;
        if (i10 != 108 || (aVarQ = q()) == null) {
            return;
        }
        aVarQ.i(true);
    }

    @Override // androidx.appcompat.app.f
    public void H(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.f10138R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f10123C.c(this.f10122B.getCallback());
    }

    void H0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarQ = q();
            if (aVarQ != null) {
                aVarQ.i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r rVarQ0 = q0(i10, true);
            if (rVarQ0.f10210o) {
                Z(rVarQ0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.appcompat.app.f
    public void I(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.I(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f10170x0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f10171y0) != null) {
            l.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f10171y0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f10172z;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f10170x0 = onBackInvokedDispatcher;
            } else {
                this.f10170x0 = l.a((Activity) this.f10172z);
            }
        } else {
            this.f10170x0 = onBackInvokedDispatcher;
        }
        a1();
    }

    void I0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.f
    public void J(Toolbar toolbar) {
        if (this.f10172z instanceof Activity) {
            androidx.appcompat.app.a aVarQ = q();
            if (aVarQ instanceof androidx.appcompat.app.s) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f10126F = null;
            if (aVarQ != null) {
                aVarQ.n();
            }
            this.f10125E = null;
            if (toolbar != null) {
                androidx.appcompat.app.p pVar = new androidx.appcompat.app.p(toolbar, r0(), this.f10123C);
                this.f10125E = pVar;
                this.f10123C.e(pVar.f10235c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f10123C.e(null);
            }
            s();
        }
    }

    @Override // androidx.appcompat.app.f
    public void K(int i10) {
        this.f10157k0 = i10;
    }

    final androidx.appcompat.app.a K0() {
        return this.f10125E;
    }

    @Override // androidx.appcompat.app.f
    public final void L(CharSequence charSequence) {
        this.f10127G = charSequence;
        t tVar = this.f10128H;
        if (tVar != null) {
            tVar.setWindowTitle(charSequence);
            return;
        }
        if (K0() != null) {
            K0().v(charSequence);
            return;
        }
        TextView textView = this.f10139S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void P0(Configuration configuration, p231x0.h hVar) {
        j.d(configuration, hVar);
    }

    public boolean Q() {
        return O(true);
    }

    void Q0(p231x0.h hVar) {
        j.c(hVar);
    }

    final boolean R0() {
        ViewGroup viewGroup;
        return this.f10137Q && (viewGroup = this.f10138R) != null && viewGroup.isLaidOut();
    }

    p231x0.h T(Context context) {
        return null;
    }

    boolean T0() {
        if (this.f10170x0 == null) {
            return false;
        }
        r rVarQ0 = q0(0, false);
        return (rVarQ0 != null && rVarQ0.f10210o) || this.f10131K != null;
    }

    public androidx.appcompat.view.b U0(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f10131K;
        if (bVar != null) {
            bVar.c();
        }
        C0361h c0361h = new C0361h(aVar);
        androidx.appcompat.app.a aVarQ = q();
        if (aVarQ != null) {
            androidx.appcompat.view.b bVarW = aVarQ.w(c0361h);
            this.f10131K = bVarW;
            if (bVarW != null && (dVar = this.f10124D) != null) {
                dVar.h(bVarW);
            }
        }
        if (this.f10131K == null) {
            this.f10131K = V0(c0361h);
        }
        a1();
        return this.f10131K;
    }

    void V(int i10, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.f10149c0;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                menu = rVar.f10205j;
            }
        }
        if ((rVar == null || rVar.f10210o) && !this.f10154h0) {
            this.f10123C.d(this.f10122B.getCallback(), i10, menu);
        }
    }

    androidx.appcompat.view.b V0(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.view.b bVarT;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        g0();
        androidx.appcompat.view.b bVar = this.f10131K;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof C0361h)) {
            aVar = new C0361h(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f10124D;
        if (dVar3 == null || this.f10154h0) {
            bVarT = null;
        } else {
            try {
                bVarT = dVar3.t(aVar);
            } catch (AbstractMethodError unused) {
                bVarT = null;
            }
        }
        if (bVarT != null) {
            this.f10131K = bVarT;
        } else {
            if (this.f10132L == null) {
                if (this.f10146Z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f10121A.getTheme();
                    theme.resolveAttribute(p050f.a.f20339e, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f10121A.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f10121A, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f10121A;
                    }
                    this.f10132L = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, p050f.a.f20342h);
                    this.f10133M = popupWindow;
                    androidx.core.widget.k.b(popupWindow, 2);
                    this.f10133M.setContentView(this.f10132L);
                    this.f10133M.setWidth(-1);
                    dVar.getTheme().resolveAttribute(p050f.a.f20336b, typedValue, true);
                    this.f10132L.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f10133M.setHeight(-2);
                    this.f10134N = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f10138R.findViewById(p050f.f.f20437h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(l0()));
                        this.f10132L = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f10132L != null) {
                g0();
                this.f10132L.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f10132L.getContext(), this.f10132L, aVar, this.f10133M == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f10132L.h(eVar);
                    this.f10131K = eVar;
                    if (R0()) {
                        this.f10132L.setAlpha(0.0f);
                        O oB = H.d(this.f10132L).b(1.0f);
                        this.f10135O = oB;
                        oB.g(new e());
                    } else {
                        this.f10132L.setAlpha(1.0f);
                        this.f10132L.setVisibility(0);
                        if (this.f10132L.getParent() instanceof View) {
                            H.d0((View) this.f10132L.getParent());
                        }
                    }
                    if (this.f10133M != null) {
                        this.f10122B.getDecorView().post(this.f10134N);
                    }
                } else {
                    this.f10131K = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f10131K;
        if (bVar2 != null && (dVar2 = this.f10124D) != null) {
            dVar2.h(bVar2);
        }
        a1();
        return this.f10131K;
    }

    void W(androidx.appcompat.view.menu.e eVar) {
        if (this.f10148b0) {
            return;
        }
        this.f10148b0 = true;
        this.f10128H.i();
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null && !this.f10154h0) {
            callbackS0.onPanelClosed(108, eVar);
        }
        this.f10148b0 = false;
    }

    void Y(int i10) {
        Z(q0(i10, true), true);
    }

    void Z(r rVar, boolean z9) {
        ViewGroup viewGroup;
        t tVar;
        if (z9 && rVar.f10196a == 0 && (tVar = this.f10128H) != null && tVar.b()) {
            W(rVar.f10205j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10121A.getSystemService("window");
        if (windowManager != null && rVar.f10210o && (viewGroup = rVar.f10202g) != null) {
            windowManager.removeView(viewGroup);
            if (z9) {
                V(rVar.f10196a, rVar, null);
            }
        }
        rVar.f10208m = false;
        rVar.f10209n = false;
        rVar.f10210o = false;
        rVar.f10203h = null;
        rVar.f10212q = true;
        if (this.f10150d0 == rVar) {
            this.f10150d0 = null;
        }
        if (rVar.f10196a == 0) {
            a1();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        r rVarJ0;
        Window.Callback callbackS0 = s0();
        if (callbackS0 == null || this.f10154h0 || (rVarJ0 = j0(eVar.D())) == null) {
            return false;
        }
        return callbackS0.onMenuItemSelected(rVarJ0.f10196a, menuItem);
    }

    void a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        boolean zT0 = T0();
        if (zT0 && this.f10171y0 == null) {
            this.f10171y0 = l.b(this.f10170x0, this);
        } else {
            if (zT0 || (onBackInvokedCallback = this.f10171y0) == null) {
                return;
            }
            l.c(this.f10170x0, onBackInvokedCallback);
            this.f10171y0 = null;
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        N0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z9;
        boolean zS0 = false;
        if (this.f10168v0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f10121A.obtainStyledAttributes(p050f.j.f20716y0);
            String string = typedArrayObtainStyledAttributes.getString(p050f.j.f20500C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f10168v0 = new androidx.appcompat.app.l();
            } else {
                try {
                    this.f10168v0 = (androidx.appcompat.app.l) this.f10121A.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f10168v0 = new androidx.appcompat.app.l();
                }
            }
        }
        boolean z10 = f10117A0;
        if (z10) {
            if (this.f10169w0 == null) {
                this.f10169w0 = new androidx.appcompat.app.n();
            }
            if (this.f10169w0.a(attributeSet)) {
                z9 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zS0 = S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zS0 = true;
                }
                z9 = zS0;
            }
        } else {
            z9 = zS0;
        }
        return this.f10168v0.r(view, str, context, attributeSet, z9, z10, true, androidx.appcompat.widget.P.c());
    }

    final int c1(V v9, Rect rect) {
        int iL;
        boolean z9;
        boolean z10;
        if (v9 != null) {
            iL = v9.l();
        } else {
            iL = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f10132L;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10132L.getLayoutParams();
            boolean z11 = true;
            if (this.f10132L.isShown()) {
                if (this.f10166t0 == null) {
                    this.f10166t0 = new Rect();
                    this.f10167u0 = new Rect();
                }
                Rect rect2 = this.f10166t0;
                Rect rect3 = this.f10167u0;
                if (v9 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(v9.j(), v9.l(), v9.k(), v9.i());
                }
                androidx.appcompat.widget.Q.a(this.f10138R, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                V vA = H.A(this.f10138R);
                int iJ = vA == null ? 0 : vA.j();
                int iK = vA == null ? 0 : vA.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                if (i10 <= 0 || this.f10140T != null) {
                    View view = this.f10140T;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.f10140T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f10121A);
                    this.f10140T = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.f10138R.addView(this.f10140T, -1, layoutParams);
                }
                View view3 = this.f10140T;
                z11 = view3 != null;
                if (z11 && view3.getVisibility() != 0) {
                    d1(this.f10140T);
                }
                if (!this.f10145Y && z11) {
                    iL = 0;
                }
                z9 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z9 = false;
            } else {
                z9 = false;
                z11 = false;
            }
            if (z11) {
                this.f10132L.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f10140T;
        if (view4 != null) {
            view4.setVisibility(z9 ? 0 : 8);
        }
        return iL;
    }

    void d0() {
        androidx.appcompat.view.menu.e eVar;
        t tVar = this.f10128H;
        if (tVar != null) {
            tVar.i();
        }
        if (this.f10133M != null) {
            this.f10122B.getDecorView().removeCallbacks(this.f10134N);
            if (this.f10133M.isShowing()) {
                try {
                    this.f10133M.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f10133M = null;
        }
        g0();
        r rVarQ0 = q0(0, false);
        if (rVarQ0 == null || (eVar = rVarQ0.f10205j) == null) {
            return;
        }
        eVar.close();
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.f10138R.findViewById(R.id.content)).addView(view, layoutParams);
        this.f10123C.c(this.f10122B.getCallback());
    }

    boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f10172z;
        if (((obj instanceof AbstractC1078j.a) || (obj instanceof androidx.appcompat.app.k)) && (decorView = this.f10122B.getDecorView()) != null && AbstractC1078j.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f10123C.b(this.f10122B.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    void f0(int i10) {
        r rVarQ0;
        r rVarQ1 = q0(i10, true);
        if (rVarQ1.f10205j != null) {
            Bundle bundle = new Bundle();
            rVarQ1.f10205j.R(bundle);
            if (bundle.size() > 0) {
                rVarQ1.f10214s = bundle;
            }
            rVarQ1.f10205j.e0();
            rVarQ1.f10205j.clear();
        }
        rVarQ1.f10213r = true;
        rVarQ1.f10212q = true;
        if ((i10 != 108 && i10 != 0) || this.f10128H == null || (rVarQ0 = q0(0, false)) == null) {
            return;
        }
        rVarQ0.f10208m = false;
        M0(rVarQ0, null);
    }

    @Override // androidx.appcompat.app.f
    public Context g(Context context) {
        h hVar;
        Context context2;
        this.f10152f0 = true;
        int iZ0 = z0(context, U());
        if (androidx.appcompat.app.f.t(context)) {
            androidx.appcompat.app.f.N(context);
        }
        p231x0.h hVarT = T(context);
        if (context instanceof ContextThemeWrapper) {
            hVar = this;
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(hVar.a0(context2, iZ0, hVarT, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            hVar = this;
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(hVar.a0(context2, iZ0, hVarT, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f10119C0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationA0 = hVar.a0(context2, iZ0, hVarT, !configuration2.equals(configuration3) ? k0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, p050f.i.f20488c);
        dVar.a(configurationA0);
        try {
            if (context2.getTheme() != null) {
                s0.h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    void g0() {
        O o9 = this.f10135O;
        if (o9 != null) {
            o9.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public View j(int i10) {
        h0();
        return this.f10122B.findViewById(i10);
    }

    r j0(Menu menu) {
        r[] rVarArr = this.f10149c0;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f10205j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public Context l() {
        return this.f10121A;
    }

    final Context l0() {
        androidx.appcompat.app.a aVarQ = q();
        Context contextK = aVarQ != null ? aVarQ.k() : null;
        return contextK == null ? this.f10121A : contextK;
    }

    @Override // androidx.appcompat.app.f
    public int n() {
        return this.f10156j0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater p() {
        if (this.f10126F == null) {
            t0();
            androidx.appcompat.app.a aVar = this.f10125E;
            this.f10126F = new androidx.appcompat.view.g(aVar != null ? aVar.k() : this.f10121A);
        }
        return this.f10126F;
    }

    p231x0.h p0(Configuration configuration) {
        return j.b(configuration);
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a q() {
        t0();
        return this.f10125E;
    }

    protected r q0(int i10, boolean z9) {
        r[] rVarArr = this.f10149c0;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[i10 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.f10149c0 = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i10);
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    @Override // androidx.appcompat.app.f
    public void r() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f10121A);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC1079k.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final CharSequence r0() {
        Object obj = this.f10172z;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f10127G;
    }

    @Override // androidx.appcompat.app.f
    public void s() {
        if (K0() == null || q().l()) {
            return;
        }
        x0(0);
    }

    final Window.Callback s0() {
        return this.f10122B.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void u(Configuration configuration) {
        androidx.appcompat.app.a aVarQ;
        if (this.f10143W && this.f10137Q && (aVarQ = q()) != null) {
            aVarQ.m(configuration);
        }
        C1011h.b().g(this.f10121A);
        this.f10155i0 = new Configuration(this.f10121A.getResources().getConfiguration());
        P(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void v(Bundle bundle) {
        String strC;
        this.f10152f0 = true;
        O(false);
        i0();
        Object obj = this.f10172z;
        if (obj instanceof Activity) {
            try {
                strC = p161q0.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarK0 = K0();
                if (aVarK0 == null) {
                    this.f10165s0 = true;
                } else {
                    aVarK0.r(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f10155i0 = new Configuration(this.f10121A.getResources().getConfiguration());
        this.f10153g0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    public void w() {
        if (this.f10172z instanceof Activity) {
            androidx.appcompat.app.f.C(this);
        }
        if (this.f10162p0) {
            this.f10122B.getDecorView().removeCallbacks(this.f10164r0);
        }
        this.f10154h0 = true;
        if (this.f10156j0 != -100) {
            Object obj = this.f10172z;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f10120z0.put(this.f10172z.getClass().getName(), Integer.valueOf(this.f10156j0));
            } else {
                f10120z0.remove(this.f10172z.getClass().getName());
            }
        } else {
            f10120z0.remove(this.f10172z.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.f10125E;
        if (aVar != null) {
            aVar.n();
        }
        X();
    }

    @Override // androidx.appcompat.app.f
    public void x(Bundle bundle) {
        h0();
    }

    @Override // androidx.appcompat.app.f
    public void y() {
        androidx.appcompat.app.a aVarQ = q();
        if (aVarQ != null) {
            aVarQ.t(true);
        }
    }

    public boolean y0() {
        return this.f10136P;
    }

    @Override // androidx.appcompat.app.f
    public void z(Bundle bundle) {
    }

    int z0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return o0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return n0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    h(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.appcompat.app.c cVarX0;
        this.f10135O = null;
        this.f10136P = true;
        this.f10156j0 = -100;
        this.f10164r0 = new a();
        this.f10121A = context;
        this.f10124D = dVar;
        this.f10172z = obj;
        if (this.f10156j0 == -100 && (obj instanceof Dialog) && (cVarX0 = X0()) != null) {
            this.f10156j0 = cVarX0.u0().n();
        }
        if (this.f10156j0 == -100) {
            P p9 = f10120z0;
            Integer num = (Integer) p9.get(obj.getClass().getName());
            if (num != null) {
                this.f10156j0 = num.intValue();
                p9.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        C1011h.h();
    }
}
