package androidx.compose.ui.input.key;

import C.c;
import O.e;
import android.view.KeyEvent;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
final class b extends c.AbstractC0022c implements e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private l f11474D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private l f11475E;

    public b(l lVar, l lVar2) {
        this.f11474D = lVar;
        this.f11475E = lVar2;
    }

    @Override // O.e
    public boolean a(KeyEvent keyEvent) {
        l lVar = this.f11475E;
        if (lVar != null) {
            return ((Boolean) lVar.f(O.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void h0(l lVar) {
        this.f11474D = lVar;
    }

    public final void i0(l lVar) {
        this.f11475E = lVar;
    }

    @Override // O.e
    public boolean k(KeyEvent keyEvent) {
        l lVar = this.f11474D;
        if (lVar != null) {
            return ((Boolean) lVar.f(O.b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
