package com.nothing.wallpaper.picker.edit.preview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.nothing.wallpaper.R;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p044e3.AbstractC1315b0;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class EffectButtonGroup extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1315b0 f18539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f18540r;

    public enum a {
        BLUR,
        GLASS,
        CUSTOMIZE;


        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f18545u = b.a(d());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EffectButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    public final void a(a action, View.OnClickListener listener) {
        n.h(action, "action");
        n.h(listener, "listener");
        EffectButton effectButton = (EffectButton) this.f18540r.get(action);
        if (effectButton != null) {
            effectButton.setOnClickListener(listener);
        }
    }

    public final void b(List actions) {
        n.h(actions, "actions");
        Map map = this.f18540r;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (actions.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            EffectButton effectButton = (EffectButton) ((Map.Entry) it.next()).getValue();
            effectButton.setVisibility(0);
            if (actions.size() == 1) {
                effectButton.getLayoutParams().width = getResources().getDimensionPixelOffset(R.dimen.nt_effect_btn_size);
                ViewGroup.LayoutParams layoutParams = effectButton.getLayoutParams();
                n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(0);
            }
        }
    }

    public final void c(a action, boolean z9) {
        n.h(action, "action");
        EffectButton effectButton = (EffectButton) this.f18540r.get(action);
        if (effectButton != null) {
            effectButton.setSelected(z9);
        }
    }

    public /* synthetic */ EffectButtonGroup(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectButtonGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        AbstractC1315b0 abstractC1315b0C = AbstractC1315b0.C(LayoutInflater.from(context), this, true);
        n.g(abstractC1315b0C, "inflate(...)");
        this.f18539q = abstractC1315b0C;
        EnumMap enumMap = new EnumMap(a.class);
        this.f18540r = enumMap;
        enumMap.put(a.BLUR, abstractC1315b0C.f19933v);
        enumMap.put(a.GLASS, abstractC1315b0C.f19935x);
        enumMap.put(a.CUSTOMIZE, abstractC1315b0C.f19934w);
    }
}
