package p244y3;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.android.wallpaper.picker.PreviewActivity;
import p064g3.j;
import p064g3.k;
import p064g3.x;
import p074h3.I;
import p074h3.U;

/* JADX INFO: loaded from: classes.dex */
class f extends a implements View.OnClickListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private U f30228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j f30229y;

    public f(Activity activity, int i10, View view) {
        super(activity, i10, i10, view);
        this.f30191r.setOnClickListener(this);
        this.f30228x = I.a().A(activity);
        this.f30229y = new PreviewActivity.a();
    }

    private void e(x xVar) {
        this.f30228x.e(xVar);
        xVar.x(this.f30190q, this.f30229y, xVar instanceof k ? 4 : 1, true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f30190q.isFinishing()) {
            Log.w("PreviewIndividualHolder", "onClick received on VH on finishing Activity");
        } else {
            I.a().q(this.f30190q).j(this.f30196w.g(this.f30190q));
            e(this.f30196w);
        }
    }
}
