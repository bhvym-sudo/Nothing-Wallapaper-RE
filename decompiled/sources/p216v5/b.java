package p216v5;

import android.R;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.CompoundButton;
import kotlin.jvm.internal.n;
import p079h8.o;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f28528a = new b();

    private b() {
    }

    private final Rect b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i10 = iArr[0];
        rect.left = (int) (i10 + 0.5f);
        rect.top = (int) (iArr[1] + 0.5f);
        rect.right = (int) (i10 + view.getWidth() + 0.5f);
        rect.bottom = (int) (iArr[1] + view.getHeight() + 0.5f);
        return rect;
    }

    public final o a(View view) {
        n.h(view, "view");
        Intent intent = new Intent();
        if (view instanceof CompoundButton) {
            intent.putExtra("android.widget.extra.CHECKED", ((CompoundButton) view).isChecked());
        }
        intent.setSourceBounds(b(view));
        ActivityOptions activityOptionsMakeCustomAnimation = ActivityOptions.makeCustomAnimation(view.getContext(), R.anim.fade_in, R.anim.fade_out);
        n.g(activityOptionsMakeCustomAnimation, "makeCustomAnimation(...)");
        return new o(intent, activityOptionsMakeCustomAnimation);
    }
}
