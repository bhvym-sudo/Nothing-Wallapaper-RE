package p078h7;

import M7.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p058f7.b;
import p064g3.f;
import p084i3.s0;
import p228w7.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1163x f21827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f21828r;

    public h(InterfaceC1163x lifecycleOwner, a interactor) {
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(interactor, "interactor");
        this.f21827q = lifecycleOwner;
        this.f21828r = interactor;
    }

    @Override // p064g3.f
    public View c(View view, Context context) {
        n.h(view, "view");
        n.h(context, "context");
        return c.e(context, (ViewGroup) view, R.string.nothing_wallpaper_style_appicon_title, this.f21827q, this.f21828r);
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return b.f20880a.d(context);
    }

    @Override // p064g3.f
    public s0 f(Context context) {
        n.h(context, "context");
        throw new p079h8.n("An operation is not implemented: Not yet implemented");
    }
}
