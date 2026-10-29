package N6;

import H3.AbstractC0851a;
import android.app.Application;
import android.os.Bundle;
import androidx.core.view.T;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p074h3.I;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AbstractActivityC1136v implements com.android.wallpaper.picker.a.InterfaceC0448a {
    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public void k() {
        f().l();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (I.a() == null) {
            NTPickerApplication.a aVar = NTPickerApplication.f18424q;
            Application application = getApplication();
            n.g(application, "getApplication(...)");
            aVar.b(application);
        }
        super.onCreate(bundle);
        T.b(getWindow(), false);
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return !AbstractC0851a.j(getBaseContext());
    }

    protected void u0(AbstractComponentCallbacksC1132q fragment) {
        n.h(fragment, "fragment");
        o0().p().r(R.id.fragment_container, fragment).k();
    }

    protected void v0(AbstractComponentCallbacksC1132q fragment) {
        n.h(fragment, "fragment");
        o0().p().u(R.anim.fragment_open_enter, R.anim.fragment_open_exit, R.anim.fragment_close_enter, R.anim.fragment_close_exit).r(R.id.fragment_container, fragment).g(null).i();
        o0().g0();
    }
}
