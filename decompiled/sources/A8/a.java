package A8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p259z8.a {
    @Override // p259z8.a
    public Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        n.g(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
