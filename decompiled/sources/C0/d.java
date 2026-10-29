package C0;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f515b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f516c = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final C0.g f564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f539e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f540f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f541g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f542h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f543i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f544j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f545k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f546l = new a(Optimizer.OPTIMIZATION_GRAPH_WRAP, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f547m = new a(256, (CharSequence) null, C0.g.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f548n = new a(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING, (CharSequence) null, C0.g.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f549o = new a(Optimizer.OPTIMIZATION_GROUPING, (CharSequence) null, C0.g.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f550p = new a(RecyclerView.ItemAnimator.FLAG_MOVED, (CharSequence) null, C0.g.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f551q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f552r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f553s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f554t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f555u = new a(ArrayPool.STANDARD_BUFFER_SIZE_BYTES, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f556v = new a(131072, (CharSequence) null, C0.g.C0024g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f557w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f558x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f559y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f560z = new a(2097152, (CharSequence) null, C0.g.h.class);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f517A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f518B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, C0.g.e.class);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f519C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f520D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f521E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f522F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f523G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f524H = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f525I = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f526J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f527K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f528L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, C0.g.f.class);

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f529M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, C0.g.d.class);

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f530N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f531O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f532P = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f533Q = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f534R = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null, null);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f535S = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null, null);

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f536T = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null, null);

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f537U = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null, null);

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final a f538V = new a(C0023d.a(), R.id.accessibilityActionScrollInDirection, null, null, null);

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, C0.g gVar) {
            return new a(null, this.f562b, charSequence, gVar, this.f563c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f561a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f561a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f564d == null) {
                return false;
            }
            Class cls = this.f563c;
            if (cls != null) {
                try {
                    o.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f563c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f564d.perform(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f561a;
            if (obj2 == null) {
                return aVar.f561a == null;
            }
            return obj2.equals(aVar.f561a);
        }

        public int hashCode() {
            Object obj = this.f561a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strH = d.h(this.f562b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb.append(strH);
            return sb.toString();
        }

        public a(int i10, CharSequence charSequence, C0.g gVar) {
            this(null, i10, charSequence, gVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, C0.g gVar, Class cls) {
            this.f562b = i10;
            this.f564d = gVar;
            if (obj == null) {
                this.f561a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f561a = obj;
            }
            this.f563c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: C0.d$d, reason: collision with other inner class name */
    private static class C0023d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f565a;

        e(Object obj) {
            this.f565a = obj;
        }

        public static e a(int i10, int i11, boolean z9, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z9, i12));
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f566a;

        f(Object obj) {
            this.f566a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z9, z10));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f567a;

        g(Object obj) {
            this.f567a = obj;
        }

        public static g a(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f514a = accessibilityNodeInfo;
    }

    private boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static d U() {
        return U0(AccessibilityNodeInfo.obtain());
    }

    public static d U0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    public static d V(d dVar) {
        return U0(AccessibilityNodeInfo.obtain(dVar.f514a));
    }

    public static d W(View view) {
        return U0(AccessibilityNodeInfo.obtain(view));
    }

    private List f(String str) {
        ArrayList<Integer> integerArrayList = this.f514a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f514a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case Optimizer.OPTIMIZATION_GRAPH_WRAP /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case Optimizer.OPTIMIZATION_GROUPING /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case ArrayPool.STANDARD_BUFFER_SIZE_BYTES /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean j(int i10) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return c.a(this.f514a);
    }

    public void A0(CharSequence charSequence) {
        this.f514a.setPaneTitle(charSequence);
    }

    public String B() {
        return this.f514a.getViewIdResourceName();
    }

    public void B0(View view) {
        this.f515b = -1;
        this.f514a.setParent(view);
    }

    public void C0(View view, int i10) {
        this.f515b = i10;
        this.f514a.setParent(view, i10);
    }

    public boolean D() {
        return C0023d.d(this.f514a);
    }

    public void D0(boolean z9) {
        this.f514a.setPassword(z9);
    }

    public boolean E() {
        return this.f514a.isCheckable();
    }

    public void E0(g gVar) {
        this.f514a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f567a);
    }

    public boolean F() {
        return this.f514a.isChecked();
    }

    public void F0(CharSequence charSequence) {
        this.f514a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean G() {
        return this.f514a.isClickable();
    }

    public void G0(boolean z9) {
        this.f514a.setScreenReaderFocusable(z9);
    }

    public boolean H() {
        return this.f514a.isContextClickable();
    }

    public void H0(boolean z9) {
        this.f514a.setScrollable(z9);
    }

    public boolean I() {
        return this.f514a.isEnabled();
    }

    public void I0(boolean z9) {
        this.f514a.setSelected(z9);
    }

    public boolean J() {
        return this.f514a.isFocusable();
    }

    public void J0(boolean z9) {
        this.f514a.setShowingHintText(z9);
    }

    public boolean K() {
        return this.f514a.isFocused();
    }

    public void K0(View view, int i10) {
        this.f516c = i10;
        this.f514a.setSource(view, i10);
    }

    public boolean L() {
        return j(67108864);
    }

    public void L0(CharSequence charSequence) {
        b.b(this.f514a, charSequence);
    }

    public boolean M() {
        return this.f514a.isImportantForAccessibility();
    }

    public void M0(CharSequence charSequence) {
        this.f514a.setText(charSequence);
    }

    public boolean N() {
        return this.f514a.isLongClickable();
    }

    public void N0(int i10, int i11) {
        this.f514a.setTextSelection(i10, i11);
    }

    public boolean O() {
        return this.f514a.isPassword();
    }

    public void O0(View view) {
        this.f514a.setTraversalAfter(view);
    }

    public boolean P() {
        return this.f514a.isScrollable();
    }

    public void P0(View view) {
        this.f514a.setTraversalBefore(view);
    }

    public boolean Q() {
        return this.f514a.isSelected();
    }

    public void Q0(View view, int i10) {
        this.f514a.setTraversalBefore(view, i10);
    }

    public boolean R() {
        return this.f514a.isShowingHintText();
    }

    public void R0(String str) {
        this.f514a.setViewIdResourceName(str);
    }

    public boolean S() {
        return c.b(this.f514a);
    }

    public void S0(boolean z9) {
        this.f514a.setVisibleToUser(z9);
    }

    public boolean T() {
        return this.f514a.isVisibleToUser();
    }

    public AccessibilityNodeInfo T0() {
        return this.f514a;
    }

    public boolean X(int i10, Bundle bundle) {
        return this.f514a.performAction(i10, bundle);
    }

    public void Y() {
    }

    public boolean Z(a aVar) {
        return this.f514a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f561a);
    }

    public void a(int i10) {
        this.f514a.addAction(i10);
    }

    public void a0(boolean z9) {
        this.f514a.setAccessibilityFocused(z9);
    }

    public void b(a aVar) {
        this.f514a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f561a);
    }

    public void b0(List list) {
        this.f514a.setAvailableExtraData(list);
    }

    public void c(View view) {
        this.f514a.addChild(view);
    }

    public void c0(Rect rect) {
        this.f514a.setBoundsInParent(rect);
    }

    public void d(View view, int i10) {
        this.f514a.addChild(view, i10);
    }

    public void d0(Rect rect) {
        this.f514a.setBoundsInScreen(rect);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public void e0(boolean z9) {
        this.f514a.setCheckable(z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f514a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f514a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f514a)) {
            return false;
        }
        return this.f516c == dVar.f516c && this.f515b == dVar.f515b;
    }

    public void f0(boolean z9) {
        this.f514a.setChecked(z9);
    }

    public List g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f514a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void g0(CharSequence charSequence) {
        this.f514a.setClassName(charSequence);
    }

    public void h0(boolean z9) {
        this.f514a.setClickable(z9);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f514a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.f514a.getActions();
    }

    public void i0(Object obj) {
        this.f514a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f565a);
    }

    public void j0(Object obj) {
        this.f514a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f566a);
    }

    public void k(Rect rect) {
        this.f514a.getBoundsInParent(rect);
    }

    public void k0(CharSequence charSequence) {
        this.f514a.setContentDescription(charSequence);
    }

    public void l(Rect rect) {
        this.f514a.getBoundsInScreen(rect);
    }

    public void l0(boolean z9) {
        this.f514a.setContentInvalid(z9);
    }

    public void m(Rect rect) {
        C0023d.b(this.f514a, rect);
    }

    public void m0(boolean z9) {
        this.f514a.setDismissable(z9);
    }

    public int n() {
        return this.f514a.getChildCount();
    }

    public void n0(boolean z9) {
        this.f514a.setEditable(z9);
    }

    public CharSequence o() {
        return this.f514a.getClassName();
    }

    public void o0(boolean z9) {
        this.f514a.setEnabled(z9);
    }

    public void p0(CharSequence charSequence) {
        this.f514a.setError(charSequence);
    }

    public CharSequence q() {
        return C0023d.c(this.f514a);
    }

    public void q0(boolean z9) {
        this.f514a.setFocusable(z9);
    }

    public CharSequence r() {
        return this.f514a.getContentDescription();
    }

    public void r0(boolean z9) {
        this.f514a.setFocused(z9);
    }

    public CharSequence s() {
        return this.f514a.getError();
    }

    public void s0(boolean z9) {
        this.f514a.setHeading(z9);
    }

    public Bundle t() {
        return this.f514a.getExtras();
    }

    public void t0(CharSequence charSequence) {
        this.f514a.setHintText(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(w());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(y());
        sb.append("; error: ");
        sb.append(s());
        sb.append("; maxTextLength: ");
        sb.append(u());
        sb.append("; stateDescription: ");
        sb.append(x());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; tooltipText: ");
        sb.append(z());
        sb.append("; viewIdResName: ");
        sb.append(B());
        sb.append("; uniqueId: ");
        sb.append(A());
        sb.append("; checkable: ");
        sb.append(E());
        sb.append("; checked: ");
        sb.append(F());
        sb.append("; focusable: ");
        sb.append(J());
        sb.append("; focused: ");
        sb.append(K());
        sb.append("; selected: ");
        sb.append(Q());
        sb.append("; clickable: ");
        sb.append(G());
        sb.append("; longClickable: ");
        sb.append(N());
        sb.append("; contextClickable: ");
        sb.append(H());
        sb.append("; enabled: ");
        sb.append(I());
        sb.append("; password: ");
        sb.append(O());
        sb.append("; scrollable: " + P());
        sb.append("; containerTitle: ");
        sb.append(q());
        sb.append("; granularScrollingSupported: ");
        sb.append(L());
        sb.append("; importantForAccessibility: ");
        sb.append(M());
        sb.append("; visible: ");
        sb.append(T());
        sb.append("; isTextSelectable: ");
        sb.append(S());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(D());
        sb.append("; [");
        List listG = g();
        for (int i10 = 0; i10 < listG.size(); i10++) {
            a aVar = (a) listG.get(i10);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb.append(strH);
            if (i10 != listG.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        return this.f514a.getMaxTextLength();
    }

    public void u0(boolean z9) {
        this.f514a.setImportantForAccessibility(z9);
    }

    public int v() {
        return this.f514a.getMovementGranularities();
    }

    public void v0(View view) {
        this.f514a.setLabelFor(view);
    }

    public CharSequence w() {
        return this.f514a.getPackageName();
    }

    public void w0(boolean z9) {
        this.f514a.setLongClickable(z9);
    }

    public CharSequence x() {
        return b.a(this.f514a);
    }

    public void x0(int i10) {
        this.f514a.setMaxTextLength(i10);
    }

    public CharSequence y() {
        if (!C()) {
            return this.f514a.getText();
        }
        List listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f514a.getText(), 0, this.f514a.getText().length()));
        for (int i10 = 0; i10 < listF.size(); i10++) {
            spannableString.setSpan(new C0.a(((Integer) listF4.get(i10)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listF.get(i10)).intValue(), ((Integer) listF2.get(i10)).intValue(), ((Integer) listF3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void y0(int i10) {
        this.f514a.setMovementGranularities(i10);
    }

    public CharSequence z() {
        return this.f514a.getTooltipText();
    }

    public void z0(CharSequence charSequence) {
        this.f514a.setPackageName(charSequence);
    }
}
