package p040e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0528a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f19755a;

        public C0528a(Object obj) {
            this.f19755a = obj;
        }

        public final Object a() {
            return this.f19755a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0528a b(Context context, Object obj) {
        n.h(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
