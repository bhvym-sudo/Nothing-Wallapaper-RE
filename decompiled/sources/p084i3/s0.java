package p084i3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected a f22091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f22092r;

    public interface a {
        void a(Context context, boolean z9);
    }

    public s0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public String getTitle() {
        return this.f22092r;
    }

    public void setTitle(String str) {
        this.f22092r = str;
    }

    public void setViewListener(a aVar) {
        this.f22091q = aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.generateLayoutParams(layoutParams);
    }
}
