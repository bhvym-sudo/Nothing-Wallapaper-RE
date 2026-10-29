package p078h7;

import H3.AbstractC0851a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p034d3.a;
import p064g3.f;
import p074h3.I;
import p084i3.s0;
import p197t6.c;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, View view, View view2) {
        try {
            a aVarC = I.a().C();
            n.f(aVarC, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags");
            if (!((c) aVarC).z()) {
                Intent intentA = p058f7.c.a();
                intentA.setFlags(268468224);
                context.startActivity(intentA);
            } else {
                context.startActivity(p058f7.c.a());
                Activity activityA = AbstractC0851a.a(view);
                if (activityA != null) {
                    activityA.overridePendingTransition(R.anim.enter_from_right, R.anim.stay);
                }
            }
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.g("NTMoreSettingsSectionController", "start activity error!", e10);
        }
    }

    @Override // p064g3.f
    public View c(final View view, final Context context) {
        n.h(view, "view");
        n.h(context, "context");
        return M7.c.f(context, (ViewGroup) view, Integer.valueOf(R.drawable.nt_ic_more_settings_section), ImageView.ScaleType.CENTER_INSIDE, R.string.nt_more_settings_section_title, new View.OnClickListener() { // from class: h7.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.g(context, view, view2);
            }
        });
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
