package p259z8;

import java.util.Random;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p259z8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f30802s = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p259z8.a
    public Random d() {
        Object obj = this.f30802s.get();
        n.g(obj, "get(...)");
        return (Random) obj;
    }
}
