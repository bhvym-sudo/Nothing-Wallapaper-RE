package F2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f1567a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p079h8.h f1568b = p079h8.i.b(new p219v8.a() { // from class: F2.g
        @Override // p219v8.a
        public final Object invoke() {
            return Boolean.valueOf(h.m());
        }
    });

    private h() {
    }

    public static final int c(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? context.getResources().getColor(R.color.system_neutral1_0, null) : context.getResources().getColor(R.color.system_neutral1_900, null);
    }

    public static final Drawable d(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? p181s0.h.e(context.getResources(), com.android.launcher3.p.f15659j, null) : p181s0.h.e(context.getResources(), com.android.launcher3.p.f15660k, null);
    }

    public static final Drawable e(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        if (F.f1542t.a(context).Y()) {
            return f1567a.l() ? p060g.a.b(context, com.android.launcher3.p.f15652c) : p060g.a.b(context, com.android.launcher3.p.f15650a);
        }
        return f1567a.l() ? p060g.a.b(context, com.android.launcher3.p.f15653d) : p060g.a.b(context, com.android.launcher3.p.f15651b);
    }

    public static final float f(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return f1567a.l() ? context.getResources().getDimension(com.android.launcher3.o.f15638e) : context.getResources().getDimension(com.android.launcher3.o.f15637d);
    }

    public static final Drawable g(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? p060g.a.b(context, com.android.launcher3.p.f15654e) : p060g.a.b(context, com.android.launcher3.p.f15655f);
    }

    private final boolean l() {
        return ((Boolean) f1568b.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m() {
        return p087i6.e.j();
    }

    public final p079h8.o b(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? new p079h8.o(context.getColorStateList(R.color.white), Integer.valueOf(context.getColor(R.color.black))) : new p079h8.o(context.getColorStateList(R.color.black), Integer.valueOf(context.getColor(R.color.white)));
    }

    public final Drawable h(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? p181s0.h.e(context.getResources(), com.android.launcher3.p.f15652c, null) : p181s0.h.e(context.getResources(), com.android.launcher3.p.f15653d, null);
    }

    public final ColorStateList i(Context context, int i10) {
        kotlin.jvm.internal.n.h(context, "context");
        if (F.f1542t.a(context).Y()) {
            ColorStateList colorStateList = context.getColorStateList(i10);
            kotlin.jvm.internal.n.g(colorStateList, "getColorStateList(...)");
            return colorStateList;
        }
        ColorStateList colorStateList2 = context.getColorStateList(R.color.system_neutral1_900);
        kotlin.jvm.internal.n.g(colorStateList2, "getColorStateList(...)");
        return colorStateList2;
    }

    public final int j(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? context.getColor(com.android.launcher3.n.f15631b) : context.getColor(com.android.launcher3.n.f15630a);
    }

    public final Integer k(Context context, int i10, int i11) {
        kotlin.jvm.internal.n.h(context, "context");
        return F.f1542t.a(context).Y() ? Integer.valueOf(i10) : Integer.valueOf(i11);
    }

    public final void n(Button button, int i10, int i11) {
        kotlin.jvm.internal.n.h(button, "button");
        Context context = button.getContext();
        F.a aVar = F.f1542t;
        kotlin.jvm.internal.n.e(context);
        if (aVar.a(context).Y()) {
            button.setTextColor(context.getResources().getColor(R.color.system_neutral1_0, null));
            button.setBackgroundResource(i10);
        } else {
            button.setTextColor(context.getResources().getColor(R.color.system_neutral1_900, null));
            button.setBackgroundResource(i11);
        }
    }
}
