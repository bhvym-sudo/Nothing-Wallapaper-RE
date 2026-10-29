package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1078j;
import androidx.lifecycle.g0;
import p010b.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends p010b.q implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private f f10218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AbstractC1078j.a f10219u;

    public k(Context context, int i10) {
        super(context, g(context, i10));
        this.f10219u = new AbstractC1078j.a() { // from class: androidx.appcompat.app.j
            @Override // androidx.core.view.AbstractC1078j.a
            public final boolean z(KeyEvent keyEvent) {
                return this.f10217q.k(keyEvent);
            }
        };
        f fVarE = e();
        fVarE.K(g(context, i10));
        fVarE.v(null);
    }

    private static int g(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p050f.a.f20360z, typedValue, true);
        return typedValue.resourceId;
    }

    private void i() {
        g0.b(getWindow().getDecorView(), this);
        p082i1.g.b(getWindow().getDecorView(), this);
        z.a(getWindow().getDecorView(), this);
    }

    @Override // p010b.q, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().w();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1078j.b(this.f10219u, getWindow().getDecorView(), this, keyEvent);
    }

    public f e() {
        if (this.f10218t == null) {
            this.f10218t = f.i(this, this);
        }
        return this.f10218t;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return e().j(i10);
    }

    @Override // androidx.appcompat.app.d
    public void h(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().s();
    }

    @Override // androidx.appcompat.app.d
    public void j(androidx.appcompat.view.b bVar) {
    }

    boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean l(int i10) {
        return e().E(i10);
    }

    @Override // p010b.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().r();
        super.onCreate(bundle);
        e().v(bundle);
    }

    @Override // p010b.q, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().B();
    }

    @Override // p010b.q, android.app.Dialog
    public void setContentView(int i10) {
        i();
        e().F(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().L(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b t(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // p010b.q, android.app.Dialog
    public void setContentView(View view) {
        i();
        e().G(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().L(getContext().getString(i10));
    }

    @Override // p010b.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        e().H(view, layoutParams);
    }
}
