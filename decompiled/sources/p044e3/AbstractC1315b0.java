package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.preview.widget.EffectButton;

/* JADX INFO: renamed from: e3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1315b0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final EffectButton f19933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EffectButton f19934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EffectButton f19935x;

    protected AbstractC1315b0(Object obj, View view, int i10, EffectButton effectButton, EffectButton effectButton2, EffectButton effectButton3) {
        super(obj, view, i10);
        this.f19933v = effectButton;
        this.f19934w = effectButton2;
        this.f19935x = effectButton3;
    }

    public static AbstractC1315b0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static AbstractC1315b0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (AbstractC1315b0) g.q(layoutInflater, R.layout.nt_effect_actions_layout, viewGroup, z9, obj);
    }
}
