package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1070b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f12248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0381b f12249c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0381b {
        void onActionProviderVisibilityChanged(boolean z9);
    }

    public AbstractC1070b(Context context) {
        this.f12247a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f12249c = null;
        this.f12248b = null;
    }

    public void h(a aVar) {
        this.f12248b = aVar;
    }

    public abstract void i(InterfaceC0381b interfaceC0381b);
}
