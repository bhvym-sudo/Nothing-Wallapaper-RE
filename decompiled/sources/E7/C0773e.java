package E7;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: E7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0773e extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DepthEffectState f1416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p219v8.p f1418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773e(Context context, boolean z9, DepthEffectState depthEffectState) {
        super(context);
        kotlin.jvm.internal.n.h(context, "context");
        this.f1414a = context;
        this.f1415b = z9;
        this.f1416c = depthEffectState;
        setAnimationStyle(R.style.PopupMenuAnimationShowUpLeft);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(d());
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
    }

    private final int[] b(View view) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        Point pointD = p087i6.q.d(this.f1414a);
        int measuredHeight = getContentView().getMeasuredHeight();
        int measuredWidth = getContentView().getMeasuredWidth();
        int dimension = (int) this.f1414a.getResources().getDimension(R.dimen.popup_effects_menu_margin);
        if (getContentView().getLayoutDirection() == 1) {
            iArr[0] = dimension;
            iArr[1] = (iArr2[1] - measuredHeight) - dimension;
            setAnimationStyle(R.style.PopupMenuAnimationShowUpRight);
            return iArr;
        }
        iArr[0] = (pointD.x - measuredWidth) - dimension;
        iArr[1] = (iArr2[1] - measuredHeight) - dimension;
        setAnimationStyle(R.style.PopupMenuAnimationShowUpLeft);
        return iArr;
    }

    private final List c() {
        EnumC0774f enumC0774f = EnumC0774f.EFFECT_NONE;
        String string = this.f1414a.getString(R.string.depth_effect_no_effect);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        F7.f fVar = new F7.f(enumC0774f, 0, string, !this.f1415b, true);
        if (!p074h3.I.a().C().p() || this.f1416c == null) {
            return AbstractC1444s.p(fVar);
        }
        EnumC0774f enumC0774f2 = EnumC0774f.EFFECT_DEPTH_ON;
        Context context = this.f1414a;
        String string2 = context.getString(R.string.depth_effect_name, context.getString(R.string.depth_effect_beta));
        kotlin.jvm.internal.n.g(string2, "getString(...)");
        return AbstractC1444s.p(new F7.f(enumC0774f2, R.drawable.ic_popup_menu_depth, string2, this.f1415b, p098j7.j.f22340T.a(this.f1416c)), fVar);
    }

    private final View d() {
        View viewInflate = LayoutInflater.from(this.f1414a).inflate(R.layout.popup_effect_menu, (ViewGroup) null, false);
        View viewRequireViewById = viewInflate.requireViewById(R.id.recyclerView);
        kotlin.jvm.internal.n.g(viewRequireViewById, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f1414a));
        F7.e eVar = new F7.e(c(), new p219v8.p() { // from class: E7.d
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return C0773e.e(this.f1413q, ((Boolean) obj).booleanValue(), (F7.f) obj2);
            }
        });
        recyclerView.setAdapter(eVar);
        eVar.notifyDataSetChanged();
        kotlin.jvm.internal.n.e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A e(C0773e c0773e, boolean z9, F7.f model) {
        kotlin.jvm.internal.n.h(model, "model");
        p219v8.p pVar = c0773e.f1418e;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z9), model.b());
        }
        return p079h8.A.f21846a;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        this.f1418e = null;
        super.dismiss();
    }

    public final void f(p219v8.p pVar) {
        this.f1418e = pVar;
    }

    public final void g(View anchor) {
        kotlin.jvm.internal.n.h(anchor, "anchor");
        this.f1417d = anchor;
        int[] iArrB = b(anchor);
        showAtLocation(anchor, 0, iArrB[0], iArrB[1]);
    }
}
