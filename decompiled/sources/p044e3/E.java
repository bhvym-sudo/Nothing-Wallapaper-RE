package p044e3;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f19827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f19828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f19829x;

    protected E(Object obj, View view, int i10, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f19827v = linearLayout;
        this.f19828w = imageView;
        this.f19829x = textView;
    }
}
