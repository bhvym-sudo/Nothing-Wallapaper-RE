package H3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.DisplayInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;
import p089i8.U;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2481c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f2482d = U.f(1, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p079h8.h f2484b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public k(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f2483a = context;
        this.f2484b = p079h8.i.b(new p219v8.a() { // from class: H3.h
            @Override // p219v8.a
            public final Object invoke() {
                return k.d(this.f2478q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayManager d(k kVar) {
        Object systemService = kVar.f2483a.getApplicationContext().getSystemService("display");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return (DisplayManager) systemService;
    }

    private final DisplayManager e() {
        return (DisplayManager) this.f2484b.getValue();
    }

    private final List f() {
        Display[] displays = e().getDisplays("android.hardware.display.category.ALL_INCLUDING_DISABLED");
        kotlin.jvm.internal.n.g(displays, "getDisplays(...)");
        if (displays.length == 0) {
            Log.e("DisplayUtils", "No displays found on context " + this.f2483a.getApplicationContext());
            throw new RuntimeException("No displays found!");
        }
        ArrayList arrayList = new ArrayList();
        for (Display display : displays) {
            if (display.getType() == 1) {
                arrayList.add(display);
            }
        }
        return arrayList;
    }

    private final int g(Display display) {
        DisplayInfo displayInfo = new DisplayInfo();
        display.getDisplayInfo(displayInfo);
        return displayInfo.logicalHeight * displayInfo.logicalWidth;
    }

    private final Point h(Display display) {
        DisplayInfo displayInfo = new DisplayInfo();
        display.getDisplayInfo(displayInfo);
        return new Point(displayInfo.logicalWidth, displayInfo.logicalHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(k kVar, Display display, Display display2) {
        kotlin.jvm.internal.n.e(display);
        int iG = kVar.g(display);
        kotlin.jvm.internal.n.e(display2);
        return iG - kVar.g(display2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(p219v8.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    public final Display i() {
        List listF = f();
        final p219v8.p pVar = new p219v8.p() { // from class: H3.i
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(k.j(this.f2479q, (Display) obj, (Display) obj2));
            }
        };
        Display display = (Display) AbstractC1444s.d0(listF, new Comparator() { // from class: H3.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.k(pVar, obj, obj2);
            }
        });
        return display == null ? (Display) listF.get(0) : display;
    }

    public final boolean l() {
        return f().size() > 1;
    }

    public final boolean m() {
        Point pointH = h(i());
        return W2.a.a((float) Math.min(pointH.x, pointH.y), this.f2483a.getResources().getConfiguration().densityDpi) >= 600.0f;
    }

    public final boolean n(Activity activity) {
        kotlin.jvm.internal.n.h(activity, "activity");
        return kotlin.jvm.internal.n.d(activity.getDisplay().getUniqueId(), i().getUniqueId());
    }

    public final boolean o(Activity activity) {
        kotlin.jvm.internal.n.h(activity, "activity");
        return !l() || p(activity);
    }

    public final boolean p(Activity activity) {
        kotlin.jvm.internal.n.h(activity, "activity");
        return f2482d.contains(Integer.valueOf(activity.getDisplay().getRotation())) && n(activity) && l();
    }
}
