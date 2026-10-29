package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutView extends SliceChildView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private d f13825A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Uri f13826B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private SliceItem f13827C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private SliceItem f13828D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private SliceItem f13829E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Set f13830F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f13831G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f13832H;

    public ShortcutView(Context context) {
        super(context);
        Resources resources = getResources();
        this.f13832H = resources.getDimensionPixelSize(p122m1.b.f23111l);
        this.f13831G = resources.getDimensionPixelSize(p122m1.b.f23118s);
    }

    private void d(Context context) {
        Slice sliceN = this.f13825A.n();
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = packageManager.resolveContentProvider(sliceN.f().getAuthority(), 0).applicationInfo;
        if (applicationInfo != null) {
            SliceItem sliceItem = this.f13829E;
            if (sliceItem == null || sliceItem.f() == null) {
                Slice.a aVar = new Slice.a(sliceN.f());
                aVar.e(k.b(packageManager.getApplicationIcon(applicationInfo)), "large", new String[0]);
                this.f13829E = (SliceItem) aVar.o().e().get(0);
            }
            if (this.f13828D == null) {
                Slice.a aVar2 = new Slice.a(sliceN.f());
                aVar2.n(packageManager.getApplicationLabel(applicationInfo), null, new String[0]);
                this.f13828D = (SliceItem) aVar2.o().e().get(0);
            }
            if (this.f13827C == null) {
                this.f13827C = new SliceItem(PendingIntent.getActivity(context, 0, packageManager.getLaunchIntentForPackage(applicationInfo.packageName), 0), new Slice.a(sliceN.f()).o(), "action", null, null);
            }
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void a() {
        this.f13825A = null;
        this.f13826B = null;
        this.f13827C = null;
        this.f13828D = null;
        this.f13829E = null;
        setBackground(null);
        removeAllViews();
    }

    @Override // androidx.slice.widget.SliceChildView
    public Set<SliceItem> getLoadingActions() {
        return this.f13830F;
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getMode() {
        return 3;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f13825A == null) {
            return false;
        }
        if (callOnClick()) {
            return true;
        }
        try {
            SliceItem sliceItem = this.f13827C;
            if (sliceItem != null) {
                sliceItem.a(null, null);
            } else {
                Intent data = new Intent("android.intent.action.VIEW").setData(this.f13826B);
                data.addFlags(268435456);
                getContext().startActivity(data);
            }
            return true;
        } catch (PendingIntent.CanceledException e10) {
            Log.e("ShortcutView", "PendingIntent for slice cannot be sent", e10);
            return true;
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setLoadingActions(Set<SliceItem> set) {
        this.f13830F = set;
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setSliceContent(d dVar) {
        a();
        this.f13825A = dVar;
        if (dVar == null) {
            return;
        }
        f fVar = new f(dVar);
        this.f13827C = fVar.a();
        this.f13829E = fVar.c();
        this.f13828D = fVar.d();
        SliceItem sliceItem = this.f13829E;
        if (sliceItem == null || sliceItem.f() == null || this.f13828D == null || this.f13827C == null) {
            d(getContext());
        }
        SliceItem sliceItemB = fVar.b();
        int iG = sliceItemB != null ? sliceItemB.g() : k.d(getContext());
        Drawable drawableR = p201u0.a.r(new ShapeDrawable(new OvalShape()));
        p201u0.a.n(drawableR, iG);
        View imageView = new ImageView(getContext());
        SliceItem sliceItem2 = this.f13829E;
        if (sliceItem2 != null && !sliceItem2.n("no_tint")) {
            imageView.setBackground(drawableR);
        }
        addView(imageView);
        SliceItem sliceItem3 = this.f13829E;
        if (sliceItem3 != null) {
            boolean zN = sliceItem3.n("no_tint");
            k.a(getContext(), zN ? this.f13831G : this.f13832H, this.f13829E.f(), zN, this);
            this.f13826B = dVar.n().f();
            setClickable(true);
        } else {
            setClickable(false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }
}
