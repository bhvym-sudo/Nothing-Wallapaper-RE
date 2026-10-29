package P8;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes2.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6357a = a.f6359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f6358b = new a.C0212a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f6359a = new a();

        /* JADX INFO: renamed from: P8.q$a$a, reason: collision with other inner class name */
        private static final class C0212a implements q {
            @Override // P8.q
            public List a(String hostname) throws UnknownHostException {
                kotlin.jvm.internal.n.h(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.n.g(allByName, "getAllByName(hostname)");
                    return AbstractC1439m.Y(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List a(String str);
}
