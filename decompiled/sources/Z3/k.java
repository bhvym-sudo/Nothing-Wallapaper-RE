package Z3;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class k extends p135n4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f9469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f9469b = dVar;
        this.f9468a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int iF = this.f9469b.f(this.f9468a);
        if (this.f9469b.i(iF)) {
            this.f9469b.n(this.f9468a, iF);
        }
    }
}
