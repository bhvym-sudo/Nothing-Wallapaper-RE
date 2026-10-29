package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f10494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.appcompat.app.b f10495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    c f10496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j.a f10497t;

    public f(e eVar) {
        this.f10494q = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f10495r;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f10494q;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(eVar.u());
        c cVar = new c(aVar.b(), p050f.g.f20465j);
        this.f10496s = cVar;
        cVar.h(this);
        this.f10494q.b(this.f10496s);
        aVar.c(this.f10496s.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            aVar.d(viewY);
        } else {
            aVar.e(eVar.w()).l(eVar.x());
        }
        aVar.i(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f10495r = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f10495r.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f10495r.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(e eVar, boolean z9) {
        if (z9 || eVar == this.f10494q) {
            a();
        }
        j.a aVar = this.f10497t;
        if (aVar != null) {
            aVar.c(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(e eVar) {
        j.a aVar = this.f10497t;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f10494q.M((g) this.f10496s.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f10496s.c(this.f10494q, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f10495r.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f10495r.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f10494q.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f10494q.performShortcut(i10, keyEvent, 0);
    }
}
