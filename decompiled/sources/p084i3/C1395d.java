package p084i3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import com.android.wallpaper.widget.BottomActionBar;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: i3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1395d extends AbstractComponentCallbacksC1132q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BottomActionBar f22030q;

    private BottomActionBar d0() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof BottomActionBar.e) {
            return ((BottomActionBar.e) activity).B();
        }
        View view = getView();
        if (view != null) {
            return (BottomActionBar) view.findViewById(R.id.bottom_actionbar);
        }
        return null;
    }

    protected void e0(BottomActionBar bottomActionBar) {
        this.f22030q = bottomActionBar;
        bottomActionBar.q(getActivity());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomActionBar bottomActionBarD0 = d0();
        this.f22030q = bottomActionBarD0;
        if (bottomActionBarD0 != null) {
            bottomActionBarD0.O();
            e0(this.f22030q);
        }
    }
}
