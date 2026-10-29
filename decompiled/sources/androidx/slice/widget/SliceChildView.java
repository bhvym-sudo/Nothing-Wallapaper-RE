package androidx.slice.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.slice.SliceItem;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class SliceChildView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f13843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f13844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f13845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected long f13846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f13847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f13848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f13849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f13850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected SliceActionView.b f13851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected j f13852z;

    public SliceChildView(Context context) {
        super(context);
        this.f13844r = -1;
        this.f13846t = -1L;
    }

    public abstract void a();

    public void b(int i10, int i11, int i12, int i13) {
        this.f13847u = i10;
        this.f13848v = i11;
        this.f13849w = i12;
        this.f13850x = i13;
    }

    public void c(SliceItem sliceItem, boolean z9, int i10, int i11, SliceView.d dVar) {
    }

    public int getActualHeight() {
        return 0;
    }

    public Set<SliceItem> getLoadingActions() {
        return null;
    }

    public int getMode() {
        return this.f13843q;
    }

    public int getSmallHeight() {
        return 0;
    }

    public void setActionLoading(SliceItem sliceItem) {
    }

    public void setAllowTwoLines(boolean z9) {
    }

    public void setLastUpdated(long j9) {
        this.f13846t = j9;
    }

    public void setLoadingActions(Set<SliceItem> set) {
    }

    public void setMaxSmallHeight(int i10) {
    }

    public void setMode(int i10) {
        this.f13843q = i10;
    }

    public void setShowLastUpdated(boolean z9) {
        this.f13845s = z9;
    }

    public void setSliceActionListener(SliceView.d dVar) {
    }

    public void setSliceActionLoadingListener(SliceActionView.b bVar) {
        this.f13851y = bVar;
    }

    public void setSliceActions(List<p112l1.d> list) {
    }

    public void setSliceContent(d dVar) {
    }

    public void setStyle(j jVar) {
        this.f13852z = jVar;
    }

    public void setTint(int i10) {
        this.f13844r = i10;
    }

    public SliceChildView(Context context, AttributeSet attributeSet) {
        this(context);
    }
}
