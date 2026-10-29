package p161q0;

import android.content.res.Configuration;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f23874b;

    public o(boolean z9) {
        this.f23873a = z9;
    }

    public final boolean a() {
        return this.f23873a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(boolean z9, Configuration newConfig) {
        this(z9);
        n.h(newConfig, "newConfig");
        this.f23874b = newConfig;
    }
}
