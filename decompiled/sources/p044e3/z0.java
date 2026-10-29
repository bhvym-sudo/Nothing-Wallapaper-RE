package p044e3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import com.nothing.widget.ui.NtSwitch;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CardView f20175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f20176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f20177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final NtSwitch f20178y;

    protected z0(Object obj, View view, int i10, CardView cardView, TextView textView, LinearLayout linearLayout, NtSwitch ntSwitch) {
        super(obj, view, i10);
        this.f20175v = cardView;
        this.f20176w = textView;
        this.f20177x = linearLayout;
        this.f20178y = ntSwitch;
    }

    public static z0 C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        f.d();
        return D(layoutInflater, viewGroup, z9, null);
    }

    public static z0 D(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (z0) g.q(layoutInflater, R.layout.widget_list_head, viewGroup, z9, obj);
    }
}
