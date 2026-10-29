package p114l3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p079h8.A;
import p104k3.b;
import p124m3.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22930a = new c();

    private c() {
    }

    public static /* synthetic */ Dialog d(c cVar, Context context, a aVar, p219v8.a aVar2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            aVar2 = null;
        }
        p219v8.a aVar3 = aVar2;
        if ((i12 & 8) != 0) {
            i10 = R.layout.dialog_view;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = R.layout.dialog_button;
        }
        return cVar.c(context, aVar, aVar3, i13, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A e(b bVar, androidx.appcompat.app.b bVar2) {
        p219v8.a aVarC = bVar.c();
        if (aVarC != null) {
            aVarC.invoke();
        }
        bVar2.dismiss();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p219v8.a aVar, a aVar2, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
        p219v8.a aVarE = aVar2.e();
        if (aVarE != null) {
            aVarE.invoke();
        }
    }

    public final Dialog c(Context context, final a viewModel, final p219v8.a aVar, int i10, int i11) {
        n.h(context, "context");
        n.h(viewModel, "viewModel");
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) null);
        View viewRequireViewById = viewInflate.requireViewById(R.id.icon);
        n.g(viewRequireViewById, "requireViewById(...)");
        ImageView imageView = (ImageView) viewRequireViewById;
        View viewRequireViewById2 = viewInflate.requireViewById(R.id.headline);
        n.g(viewRequireViewById2, "requireViewById(...)");
        TextView textView = (TextView) viewRequireViewById2;
        View viewRequireViewById3 = viewInflate.requireViewById(R.id.supporting_text);
        n.g(viewRequireViewById3, "requireViewById(...)");
        TextView textView2 = (TextView) viewRequireViewById3;
        View viewRequireViewById4 = viewInflate.requireViewById(R.id.message);
        n.g(viewRequireViewById4, "requireViewById(...)");
        TextView textView3 = (TextView) viewRequireViewById4;
        View viewRequireViewById5 = viewInflate.requireViewById(R.id.button_container);
        n.g(viewRequireViewById5, "requireViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewRequireViewById5;
        p144o3.a aVarC = viewModel.c();
        if (aVarC != null) {
            p134n3.b.f23260a.a(imageView, aVarC);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        p164q3.a aVarB = viewModel.b();
        if (aVarB != null) {
            p154p3.a.f23694a.a(textView, aVarB);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        p164q3.a aVarF = viewModel.f();
        if (aVarF != null) {
            p154p3.a.f23694a.a(textView2, aVarF);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        p164q3.a aVarD = viewModel.d();
        if (aVarD != null) {
            p154p3.a.f23694a.a(textView3, aVarD);
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        androidx.appcompat.app.b.a aVarN = new androidx.appcompat.app.b.a(context, R.style.LightDialogTheme).n(viewInflate);
        if (viewModel.e() != null || aVar != null) {
            aVarN.h(new DialogInterface.OnDismissListener() { // from class: l3.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    c.f(aVar, viewModel, dialogInterface);
                }
            });
        }
        final androidx.appcompat.app.b bVarA = aVarN.a();
        n.g(bVarA, "create(...)");
        viewGroup.removeAllViews();
        for (final b bVar : viewModel.a()) {
            viewGroup.addView(p094j3.c.f22296a.e(viewGroup, b.b(bVar, null, null, new p219v8.a() { // from class: l3.b
                @Override // p219v8.a
                public final Object invoke() {
                    return c.e(bVar, bVarA);
                }
            }, 3, null), i11));
        }
        bVarA.show();
        return bVarA;
    }
}
