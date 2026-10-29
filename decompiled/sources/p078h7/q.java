package p078h7;

import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p058f7.c;
import p064g3.f;
import p074h3.I;
import p084i3.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f.a f21845q;

    public q(f.a navigationController) {
        n.h(navigationController, "navigationController");
        this.f21845q = navigationController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z9, q qVar, Context context, View view) {
        if (z9) {
            return;
        }
        if (I.a().C().s()) {
            qVar.f21845q.P("custom_widget");
            return;
        }
        Intent intentC = c.c();
        intentC.setFlags(268468224);
        context.startActivity(intentC);
    }

    private final boolean i() {
        return !new UserHandle(UserHandle.myUserId()).isSystem();
    }

    @Override // p064g3.f
    public View c(View view, final Context context) {
        n.h(view, "view");
        n.h(context, "context");
        final boolean zI = i();
        LinearLayout linearLayoutF = M7.c.f(context, (ViewGroup) view, Integer.valueOf(R.drawable.nt_ic_widget_section), ImageView.ScaleType.CENTER_INSIDE, R.string.widget_button_text, new View.OnClickListener() { // from class: h7.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.g(zI, this, context, view2);
            }
        });
        if (zI) {
            ((FrameLayout) linearLayoutF.requireViewById(R.id.option_icon_container)).setClickable(false);
            linearLayoutF.setAlpha(0.3f);
        }
        return linearLayoutF;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    @Override // p064g3.f
    public s0 f(Context context) {
        n.h(context, "context");
        throw new p079h8.n("An operation is not implemented: Not yet implemented");
    }
}
