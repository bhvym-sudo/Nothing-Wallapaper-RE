package H3;

import android.os.Bundle;
import android.os.Message;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceView;
import android.view.ViewRootImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static Bundle a(SurfaceView surfaceView, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ViewRootImpl viewRootImpl = surfaceView.getViewRootImpl();
        if (viewRootImpl != null) {
            bundle2.putBinder("nt_window_binder", viewRootImpl.getWindowToken());
        }
        bundle2.putBinder("host_token", surfaceView.getHostToken());
        bundle2.putInt("display_id", surfaceView.getDisplay().getDisplayId());
        bundle2.putInt("width", surfaceView.getWidth());
        bundle2.putInt("height", surfaceView.getHeight());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public static Message b(Bundle bundle) {
        return (Message) bundle.getParcelable("callback");
    }

    public static SurfaceControlViewHost.SurfacePackage c(Bundle bundle) {
        return (SurfaceControlViewHost.SurfacePackage) bundle.getParcelable("surface_package");
    }
}
