package com.android.wallpaper.widget;

import H3.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.wallpaper.widget.FloatingSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nothing.wallpaper.R;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingSheet extends FrameLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f16102v = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ViewGroup f16103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ViewGroup f16104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final BottomSheetBehavior f16105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f16106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f16107u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingSheet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        this.f16106t = new HashMap();
        LayoutInflater.from(context).inflate(R.layout.floating_sheet, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.floating_sheet_content);
        this.f16103q = viewGroup;
        t.a(viewGroup);
        setColor(context);
        ViewGroup viewGroup2 = (ViewGroup) requireViewById(R.id.floating_sheet_container);
        this.f16104r = viewGroup2;
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(viewGroup2);
        this.f16105s = bottomSheetBehaviorQ0;
        bottomSheetBehaviorQ0.X0(5);
        this.f16107u = getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FloatingSheet floatingSheet, J3.a aVar) {
    }

    public final void setColor(Context context) {
        n.h(context, "context");
        this.f16103q.setBackground(p060g.a.b(context, R.drawable.floating_sheet_background));
        if (this.f16103q.getChildCount() > 0) {
            this.f16103q.removeAllViews();
            this.f16106t.values().forEach(new Consumer() { // from class: I3.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FloatingSheet floatingSheet = this.f3017a;
                    androidx.appcompat.app.o.a(obj);
                    FloatingSheet.b(floatingSheet, null);
                }
            });
        }
    }
}
