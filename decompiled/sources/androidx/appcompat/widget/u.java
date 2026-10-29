package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public interface u {
    void a(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(ScrollingTabContainerView scrollingTabContainerView);

    boolean j();

    void k(int i10);

    Menu l();

    void m(int i10);

    int n();

    androidx.core.view.O o(int i10, long j9);

    void p(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2);

    void q(int i10);

    ViewGroup r();

    void s(boolean z9);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    void u();

    void v();

    void w(boolean z9);
}
