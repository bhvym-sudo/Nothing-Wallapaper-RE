package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class b extends k implements DialogInterface {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final AlertController f10094v;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f10095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10096b;

        public a(Context context) {
            this(context, b.n(context, 0));
        }

        public b a() {
            b bVar = new b(this.f10095a.f10054a, this.f10096b);
            this.f10095a.a(bVar.f10094v);
            bVar.setCancelable(this.f10095a.f10071r);
            if (this.f10095a.f10071r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f10095a.f10072s);
            bVar.setOnDismissListener(this.f10095a.f10073t);
            DialogInterface.OnKeyListener onKeyListener = this.f10095a.f10074u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f10095a.f10054a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10095a;
            bVar.f10076w = listAdapter;
            bVar.f10077x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f10095a.f10060g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f10095a.f10057d = drawable;
            return this;
        }

        public a f(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10095a;
            bVar.f10065l = bVar.f10054a.getText(i10);
            this.f10095a.f10067n = onClickListener;
            return this;
        }

        public a g(DialogInterface.OnCancelListener onCancelListener) {
            this.f10095a.f10072s = onCancelListener;
            return this;
        }

        public a h(DialogInterface.OnDismissListener onDismissListener) {
            this.f10095a.f10073t = onDismissListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f10095a.f10074u = onKeyListener;
            return this;
        }

        public a j(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10095a;
            bVar.f10062i = bVar.f10054a.getText(i10);
            this.f10095a.f10064k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10095a;
            bVar.f10076w = listAdapter;
            bVar.f10077x = onClickListener;
            bVar.f10047I = i10;
            bVar.f10046H = true;
            return this;
        }

        public a l(CharSequence charSequence) {
            this.f10095a.f10059f = charSequence;
            return this;
        }

        public a m(int i10) {
            AlertController.b bVar = this.f10095a;
            bVar.f10079z = null;
            bVar.f10078y = i10;
            bVar.f10043E = false;
            return this;
        }

        public a n(View view) {
            AlertController.b bVar = this.f10095a;
            bVar.f10079z = view;
            bVar.f10078y = 0;
            bVar.f10043E = false;
            return this;
        }

        public b o() {
            b bVarA = a();
            bVarA.show();
            return bVarA;
        }

        public a(Context context, int i10) {
            this.f10095a = new AlertController.b(new ContextThemeWrapper(context, b.n(context, i10)));
            this.f10096b = i10;
        }
    }

    protected b(Context context, int i10) {
        super(context, n(context, i10));
        this.f10094v = new AlertController(getContext(), this, getWindow());
    }

    static int n(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p050f.a.f20348n, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView m() {
        return this.f10094v.d();
    }

    @Override // androidx.appcompat.app.k, p010b.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10094v.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f10094v.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f10094v.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.k, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f10094v.p(charSequence);
    }
}
