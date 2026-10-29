package p025c4;

import Z3.a;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p145o4.e;

/* JADX INFO: loaded from: classes.dex */
final class S extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC1189c f15078a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AbstractC1189c abstractC1189c, Looper looper) {
        super(looper);
        this.f15078a = abstractC1189c;
    }

    private static final void a(Message message) {
        T t9 = (T) message.obj;
        t9.b();
        t9.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f15078a.f15113S.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f15078a.s()) || message.what == 5)) && !this.f15078a.d()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f15078a.f15110P = new a(message.arg2);
            if (AbstractC1189c.f0(this.f15078a)) {
                AbstractC1189c abstractC1189c = this.f15078a;
                if (!abstractC1189c.f15111Q) {
                    abstractC1189c.g0(3, null);
                    return;
                }
            }
            AbstractC1189c abstractC1189c2 = this.f15078a;
            a aVar = abstractC1189c2.f15110P != null ? abstractC1189c2.f15110P : new a(8);
            this.f15078a.f15100F.c(aVar);
            this.f15078a.K(aVar);
            return;
        }
        if (i11 == 5) {
            AbstractC1189c abstractC1189c3 = this.f15078a;
            a aVar2 = abstractC1189c3.f15110P != null ? abstractC1189c3.f15110P : new a(8);
            this.f15078a.f15100F.c(aVar2);
            this.f15078a.K(aVar2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            a aVar3 = new a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f15078a.f15100F.c(aVar3);
            this.f15078a.K(aVar3);
            return;
        }
        if (i11 == 6) {
            this.f15078a.g0(5, null);
            AbstractC1189c abstractC1189c4 = this.f15078a;
            if (abstractC1189c4.f15105K != null) {
                abstractC1189c4.f15105K.c(message.arg2);
            }
            this.f15078a.L(message.arg2);
            AbstractC1189c.e0(this.f15078a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f15078a.g()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((T) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
