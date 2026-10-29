package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class I extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f10800b;

    public I(Context context, Resources resources) {
        super(resources);
        this.f10800b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f10800b.get();
        if (drawableA != null && context != null) {
            B.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
