package p065g4;

import Z3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p015b4.InterfaceC1183c;
import p015b4.h;
import p025c4.AbstractC1193g;
import p025c4.C1190d;
import p135n4.i;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1193g {
    protected w(Context context, Looper looper, C1190d c1190d, InterfaceC1183c interfaceC1183c, h hVar) {
        super(context, looper, 308, c1190d, interfaceC1183c, hVar);
    }

    @Override // p025c4.AbstractC1189c
    protected final String D() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // p025c4.AbstractC1189c
    protected final String E() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // p025c4.AbstractC1189c
    protected final boolean H() {
        return true;
    }

    @Override // p025c4.AbstractC1189c
    public final boolean Q() {
        return true;
    }

    @Override // p025c4.AbstractC1189c, a4.a.f
    public final int l() {
        return 17895000;
    }

    @Override // p025c4.AbstractC1189c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override // p025c4.AbstractC1189c
    public final c[] u() {
        return i.f23268b;
    }
}
