package E4;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Dialog f1279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f1280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f1281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f1282t;

    public a(Dialog dialog, Rect rect) {
        this.f1279q = dialog;
        this.f1280r = rect.left;
        this.f1281s = rect.top;
        this.f1282t = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f1280r + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f1281s + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f1279q.onTouchEvent(motionEventObtain);
    }
}
