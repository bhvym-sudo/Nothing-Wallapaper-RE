package L0;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: L0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0927d extends IOException {
    public /* synthetic */ C0927d(String str, Throwable th, int i10, AbstractC1457h abstractC1457h) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0927d(String message, Throwable th) {
        super(message, th);
        kotlin.jvm.internal.n.h(message, "message");
    }
}
