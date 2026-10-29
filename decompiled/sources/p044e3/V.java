package p044e3;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.widget.CategoryItemView;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RecyclerView f19903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CategoryItemView f19904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f19905x;

    protected V(Object obj, View view, int i10, RecyclerView recyclerView, CategoryItemView categoryItemView, TextView textView) {
        super(obj, view, i10);
        this.f19903v = recyclerView;
        this.f19904w = categoryItemView;
        this.f19905x = textView;
    }
}
