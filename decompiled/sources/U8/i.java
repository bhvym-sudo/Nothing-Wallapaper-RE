package U8;

import java.io.IOException;
import kotlin.jvm.internal.n;
import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final IOException f8075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private IOException f8076r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        n.h(firstConnectException, "firstConnectException");
        this.f8075q = firstConnectException;
        this.f8076r = firstConnectException;
    }

    public final void a(IOException e10) {
        n.h(e10, "e");
        AbstractC1388c.a(this.f8075q, e10);
        this.f8076r = e10;
    }

    public final IOException b() {
        return this.f8075q;
    }

    public final IOException c() {
        return this.f8076r;
    }
}
