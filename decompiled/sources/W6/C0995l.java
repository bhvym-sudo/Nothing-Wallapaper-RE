package W6;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1333m;

/* JADX INFO: renamed from: W6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0995l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8830d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f8831e = "is_policy_agree";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f8833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p219v8.l f8834c;

    /* JADX INFO: renamed from: W6.l$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a() {
            return C0995l.f8831e;
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            return p087i6.n.a(context, a(), false);
        }

        public final void c(Context context, boolean z9) {
            kotlin.jvm.internal.n.h(context, "context");
            p087i6.n.f(context, a(), z9);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: W6.l$b */
    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            kotlin.jvm.internal.n.h(widget, "widget");
            C0995l c0995l = C0995l.this;
            c0995l.k(p087i6.l.f22204a.e(c0995l.f8832a, !H6.a.b(C0995l.this.f8832a)));
        }
    }

    /* JADX INFO: renamed from: W6.l$c */
    public static final class c extends ClickableSpan {
        c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            kotlin.jvm.internal.n.h(widget, "widget");
            C0995l c0995l = C0995l.this;
            c0995l.k(p087i6.l.f22204a.d(c0995l.f8832a));
        }
    }

    public C0995l(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f8832a = context;
    }

    private final void g(AbstractC1333m abstractC1333m) {
        String string = p087i6.e.k(this.f8832a) ? this.f8832a.getString(R.string.nt_create_policy_content1_placeholder2) : this.f8832a.getString(R.string.nt_create_policy_content1_placeholder);
        kotlin.jvm.internal.n.e(string);
        String string2 = this.f8832a.getString(R.string.nt_create_policy_content1, string);
        kotlin.jvm.internal.n.g(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string2);
        b bVar = new b();
        int iD0 = E8.i.d0(string2, string, 0, false, 6, null);
        int length = string.length() + iD0;
        spannableString.setSpan(new StyleSpan(1), iD0, length, 33);
        spannableString.setSpan(bVar, iD0, length, 33);
        abstractC1333m.f20027x.setText(spannableString);
        abstractC1333m.f20027x.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void h(AbstractC1333m abstractC1333m) {
        String string = this.f8832a.getString(R.string.nt_create_policy_content2_placeholder);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        String string2 = this.f8832a.getString(R.string.nt_create_policy_content2, string);
        kotlin.jvm.internal.n.g(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string2);
        c cVar = new c();
        int iD0 = E8.i.d0(string2, string, 0, false, 6, null);
        int length = string.length() + iD0;
        spannableString.setSpan(new StyleSpan(1), iD0, length, 33);
        spannableString.setSpan(cVar, iD0, length, 33);
        abstractC1333m.f20028y.setText(spannableString);
        abstractC1333m.f20028y.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void i(AbstractC1333m abstractC1333m) {
        g(abstractC1333m);
        h(abstractC1333m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str) {
        p087i6.a.b(p087i6.a.f22186a, this.f8832a, new Intent("android.intent.action.VIEW", Uri.parse(str)), null, 0, 12, null);
    }

    private final void l(AbstractC1333m abstractC1333m) {
        abstractC1333m.f20024A.setOnClickListener(new View.OnClickListener() { // from class: W6.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0995l.m(this.f8828q, view);
            }
        });
        abstractC1333m.f20026w.setOnClickListener(new View.OnClickListener() { // from class: W6.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0995l.n(this.f8829q, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C0995l c0995l, View view) {
        f8830d.c(c0995l.f8832a, true);
        c0995l.r(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(C0995l c0995l, View view) {
        c0995l.r(false);
    }

    private final void r(boolean z9) {
        p219v8.l lVar = this.f8834c;
        if (lVar != null) {
            lVar.f(Boolean.valueOf(z9));
        }
        AlertDialog alertDialog = this.f8833b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final void f() {
        AlertDialog alertDialog = this.f8833b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final boolean j() {
        AlertDialog alertDialog = this.f8833b;
        return alertDialog != null && alertDialog.isShowing();
    }

    public final void o(p219v8.l lVar) {
        this.f8834c = lVar;
    }

    public final void p(DialogInterface.OnDismissListener listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        AlertDialog alertDialog = this.f8833b;
        if (alertDialog != null) {
            alertDialog.setOnDismissListener(listener);
        }
    }

    public final void q(DialogInterface.OnShowListener listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        AlertDialog alertDialog = this.f8833b;
        if (alertDialog != null) {
            alertDialog.setOnShowListener(listener);
        }
    }

    public final void s() {
        AbstractC1333m abstractC1333mC = AbstractC1333m.C(LayoutInflater.from(this.f8832a), null, false);
        kotlin.jvm.internal.n.e(abstractC1333mC);
        i(abstractC1333mC);
        l(abstractC1333mC);
        kotlin.jvm.internal.n.g(abstractC1333mC, "apply(...)");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f8832a, R.style.LightDialogTheme).setView(abstractC1333mC.o()).create();
        this.f8833b = alertDialogCreate;
        if (alertDialogCreate != null) {
            alertDialogCreate.show();
        }
    }
}
