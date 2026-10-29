package N6;

import H3.AbstractC0851a;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.fragment.app.S;
import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.c;
import com.nothing.wallpaper.segmenter.Segmenter;
import kotlin.jvm.internal.n;
import p074h3.I;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final String f5382R = "BaseEntranceActivity";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Segmenter f5383S;

    private final void w0() {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setResult(0);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (y0(i10, i11, intent)) {
            if (AbstractC0851a.j(this)) {
                w0();
                return;
            }
            J jO0 = o0();
            n.g(jO0, "getSupportFragmentManager(...)");
            while (jO0.r0() > 0) {
                jO0.c1();
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qX0 = x0();
            if (abstractComponentCallbacksC1132qX0 != null) {
                c.k(this.f5382R, "Manually trigger fragment onCreateView");
                S sP = jO0.p();
                n.g(sP, "beginTransaction(...)");
                sP.m(abstractComponentCallbacksC1132qX0);
                sP.i();
                S sP2 = jO0.p();
                n.g(sP2, "beginTransaction(...)");
                sP2.h(abstractComponentCallbacksC1132qX0);
                sP2.i();
            }
        }
    }

    @Override // N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.d(this.f5382R, "onCreate");
        if (I.a() == null) {
            NTPickerApplication.a aVar = NTPickerApplication.f18424q;
            Application application = getApplication();
            n.g(application, "getApplication(...)");
            aVar.b(application);
        }
        if (I.a().C().p()) {
            Segmenter segmenterC = P7.b.c();
            this.f5383S = segmenterC;
            if (segmenterC != null) {
                segmenterC.a();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c.d(this.f5382R, "onDestroy");
        Segmenter segmenter = this.f5383S;
        if (segmenter != null) {
            segmenter.close();
        }
    }

    public abstract AbstractComponentCallbacksC1132q x0();

    protected abstract boolean y0(int i10, int i11, Intent intent);
}
