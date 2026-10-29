package K2;

import android.util.Log;
import kotlin.jvm.internal.n;
import p079h8.m;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K2.a f4076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J2.a f4077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4078c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4079a;

        static {
            int[] iArr = new int[K2.a.values().length];
            try {
                iArr[K2.a.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K2.a.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K2.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K2.a.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[K2.a.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[K2.a.WTF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4079a = iArr;
        }
    }

    public c(K2.a targetLogLevel) {
        n.h(targetLogLevel, "targetLogLevel");
        this.f4076a = targetLogLevel;
        this.f4077b = J2.a.f3512r.a();
    }

    @Override // K2.f
    public synchronized b a(String tag, K2.a level, l messagePrinter, Throwable th) {
        n.h(tag, "tag");
        n.h(level, "level");
        n.h(messagePrinter, "messagePrinter");
        if (this.f4078c) {
            throw new UnsupportedOperationException("Message has already been obtained. Call order is incorrect.");
        }
        this.f4077b.p(tag, level, System.currentTimeMillis(), messagePrinter, th);
        this.f4078c = true;
        return this.f4077b;
    }

    @Override // K2.f
    public synchronized void b(b message) {
        try {
            n.h(message, "message");
            if (!n.d(this.f4077b, message)) {
                throw new IllegalArgumentException("Message argument is not the expected message.");
            }
            if (!this.f4078c) {
                throw new UnsupportedOperationException("Message has not been obtained. Call order is incorrect.");
            }
            if (message.h().compareTo(this.f4076a) >= 0) {
                String str = (String) message.d().f(message);
                switch (a.f4079a[message.h().ordinal()]) {
                    case 1:
                        Log.v(message.getTag(), str, message.b());
                        break;
                    case 2:
                        Log.d(message.getTag(), str, message.b());
                        break;
                    case 3:
                        Log.i(message.getTag(), str, message.b());
                        break;
                    case 4:
                        Log.w(message.getTag(), str, message.b());
                        break;
                    case 5:
                        Log.e(message.getTag(), str, message.b());
                        break;
                    case 6:
                        Log.wtf(message.getTag(), str, message.b());
                        break;
                    default:
                        throw new m();
                }
            }
            this.f4078c = false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
