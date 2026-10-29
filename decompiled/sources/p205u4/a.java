package p205u4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import p025c4.AbstractC1189c;
import p025c4.AbstractC1193g;
import p025c4.AbstractC1202p;
import p025c4.C1190d;
import p025c4.H;
import p195t4.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractC1193g implements e {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f27978c0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final boolean f27979Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final C1190d f27980Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Bundle f27981a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Integer f27982b0;

    public a(Context context, Looper looper, boolean z9, C1190d c1190d, Bundle bundle, a4.e.a aVar, a4.e.b bVar) {
        super(context, looper, 44, c1190d, aVar, bVar);
        this.f27979Y = true;
        this.f27980Z = c1190d;
        this.f27981a0 = bundle;
        this.f27982b0 = c1190d.g();
    }

    public static Bundle j0(C1190d c1190d) {
        c1190d.f();
        Integer numG = c1190d.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1190d.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p025c4.AbstractC1189c
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p025c4.AbstractC1189c
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p195t4.e
    public final void h(f fVar) {
        AbstractC1202p.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f27980Z.b();
            ((g) C()).X(new j(1, new H(accountB, ((Integer) AbstractC1202p.i(this.f27982b0)).intValue(), "<<default account>>".equals(accountB.name) ? X3.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.f(new l(1, new Z3.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // p025c4.AbstractC1189c, a4.a.f
    public final int l() {
        return 12451000;
    }

    @Override // p025c4.AbstractC1189c, a4.a.f
    public final boolean o() {
        return this.f27979Y;
    }

    @Override // p195t4.e
    public final void p() {
        a(new AbstractC1189c.d());
    }

    @Override // p025c4.AbstractC1189c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // p025c4.AbstractC1189c
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.f27980Z.d())) {
            this.f27981a0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f27980Z.d());
        }
        return this.f27981a0;
    }
}
