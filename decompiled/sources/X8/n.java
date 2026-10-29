package X8;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends IOException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f9223q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b errorCode) {
        super("stream was reset: " + errorCode);
        kotlin.jvm.internal.n.h(errorCode, "errorCode");
        this.f9223q = errorCode;
    }
}
