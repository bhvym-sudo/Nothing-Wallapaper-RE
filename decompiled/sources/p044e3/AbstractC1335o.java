package p044e3;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.g;

/* JADX INFO: renamed from: e3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1335o extends g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinearLayout f20040A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f20041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f20042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f20043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f20044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f20045z;

    protected AbstractC1335o(Object obj, View view, int i10, LinearLayout linearLayout, LinearLayout linearLayout2, View view2, View view3, TextView textView, LinearLayout linearLayout3) {
        super(obj, view, i10);
        this.f20041v = linearLayout;
        this.f20042w = linearLayout2;
        this.f20043x = view2;
        this.f20044y = view3;
        this.f20045z = textView;
        this.f20040A = linearLayout3;
    }
}
