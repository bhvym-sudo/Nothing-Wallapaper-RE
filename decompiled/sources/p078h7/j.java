package p078h7;

import L7.a;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import kotlin.jvm.internal.n;
import p064g3.f;
import p074h3.I;
import p163q2.b;
import p173r2.c;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f.a f21831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final c f21832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC1163x f21833v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f.a navigationController, c viewModel, InterfaceC1163x lifecycleOwner) {
        super(navigationController, viewModel, lifecycleOwner);
        n.h(navigationController, "navigationController");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        this.f21831t = navigationController;
        this.f21832u = viewModel;
        this.f21833v = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(j jVar, Context context, View view) {
        if (I.a().C().s()) {
            jVar.f21831t.P("custom_short_cut");
            return;
        }
        Intent intentB = p058f7.c.b();
        intentB.setFlags(268468224);
        context.startActivity(intentB);
    }

    @Override // p064g3.f
    public View c(View view, final Context context) {
        n.h(view, "view");
        n.h(context, "context");
        return a.b(context, (ViewGroup) view, this.f21832u, this.f21833v, new View.OnClickListener() { // from class: h7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.k(this.f21829q, context, view2);
            }
        });
    }
}
