package I3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

/* JADX INFO: loaded from: classes.dex */
public class y extends RecyclerViewAccessibilityDelegate {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final RecyclerView f3037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f3038r;

    public interface a {
    }

    public y(RecyclerView recyclerView, a aVar, int i10) {
        super(recyclerView);
        this.f3037q = recyclerView;
        this.f3038r = i10;
    }

    @Override // androidx.core.view.C1069a
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            this.f3037q.getChildLayoutPosition(view);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.C1069a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
