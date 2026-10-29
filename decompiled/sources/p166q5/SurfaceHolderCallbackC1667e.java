package p166q5;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: q5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC1667e extends GLSurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SurfaceHolder f25041q;

    public SurfaceHolderCallbackC1667e(Context context) {
        this(context, null);
    }

    public final void a() {
        c.d("BLUR-AtmosphereWallpaperService", "AtmosphereSurfaceView onWallpaperDestroy");
        SurfaceHolder surfaceHolder = this.f25041q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.SurfaceView
    public SurfaceHolder getHolder() {
        SurfaceHolder surfaceHolder = this.f25041q;
        if (surfaceHolder != null) {
            return surfaceHolder;
        }
        SurfaceHolder holder = super.getHolder();
        n.g(holder, "getHolder(...)");
        return holder;
    }

    public final SurfaceHolder getSurfaceHolder() {
        return this.f25041q;
    }

    public final void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.f25041q = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
        }
    }

    public SurfaceHolderCallbackC1667e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
