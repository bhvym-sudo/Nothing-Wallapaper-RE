package p045e4;

import Z3.c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import p015b4.InterfaceC1183c;
import p015b4.h;
import p025c4.AbstractC1193g;
import p025c4.C1190d;
import p025c4.C1207v;
import p135n4.d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1193g {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final C1207v f20184Y;

    public e(Context context, Looper looper, C1190d c1190d, C1207v c1207v, InterfaceC1183c interfaceC1183c, h hVar) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, c1190d, interfaceC1183c, hVar);
        this.f20184Y = c1207v;
    }

    @Override // p025c4.AbstractC1189c
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p025c4.AbstractC1189c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p025c4.AbstractC1189c
    protected final boolean H() {
        return true;
    }

    @Override // p025c4.AbstractC1189c, a4.a.f
    public final int l() {
        return 203400000;
    }

    @Override // p025c4.AbstractC1189c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // p025c4.AbstractC1189c
    public final c[] u() {
        return d.f23265b;
    }

    @Override // p025c4.AbstractC1189c
    protected final Bundle z() {
        return this.f20184Y.b();
    }
}
