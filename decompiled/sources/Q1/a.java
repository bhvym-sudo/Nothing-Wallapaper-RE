package Q1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f6595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v8.a f6596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6599f;

    public a(Context context, p219v8.a scrollForwardCallback, p219v8.a scrollBackwardCallback) {
        n.h(context, "context");
        n.h(scrollForwardCallback, "scrollForwardCallback");
        n.h(scrollBackwardCallback, "scrollBackwardCallback");
        this.f6594a = context;
        this.f6595b = scrollForwardCallback;
        this.f6596c = scrollBackwardCallback;
        this.f6597d = "";
        this.f6598e = R.id.action_scroll_backward;
        this.f6599f = R.id.action_scroll_forward;
    }

    public final void a(String str) {
        n.h(str, "<set-?>");
        this.f6597d = str;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
        n.h(host, "host");
        n.h(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.setScrollable(true);
        info.addAction(16);
        info.addAction(new AccessibilityNodeInfo.AccessibilityAction(this.f6599f, this.f6594a.getString(R.string.scroll_forward_and_select)));
        info.addAction(new AccessibilityNodeInfo.AccessibilityAction(this.f6598e, this.f6594a.getString(R.string.scroll_backward_and_select)));
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS);
        info.setContentDescription(this.f6597d);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View host, int i10, Bundle bundle) {
        n.h(host, "host");
        if (i10 == 16) {
            this.f6595b.invoke();
            return true;
        }
        if (i10 == this.f6598e) {
            this.f6596c.invoke();
            return true;
        }
        if (i10 != this.f6599f) {
            return super.performAccessibilityAction(host, i10, bundle);
        }
        this.f6595b.invoke();
        return true;
    }
}
