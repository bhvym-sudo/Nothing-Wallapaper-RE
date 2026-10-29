package p027c6;

import android.content.Context;
import com.google.gson.Gson;
import com.nothing.security.sdk.SecurityConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0436a f15231b = new C0436a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f15232c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecurityConfig f15233a;

    /* JADX INFO: renamed from: c6.a$a, reason: collision with other inner class name */
    public static final class C0436a {
        public /* synthetic */ C0436a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ a b(C0436a c0436a, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            return c0436a.a(str);
        }

        public final a a(String dir) {
            Object objPutIfAbsent;
            n.h(dir, "dir");
            ConcurrentHashMap concurrentHashMap = a.f15232c;
            Object aVar = concurrentHashMap.get(dir);
            if (aVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(dir, (aVar = new a(new SecurityConfig(dir), null)))) != null) {
                aVar = objPutIfAbsent;
            }
            n.g(aVar, "getOrPut(...)");
            return (a) aVar;
        }

        private C0436a() {
        }
    }

    public /* synthetic */ a(SecurityConfig securityConfig, AbstractC1457h abstractC1457h) {
        this(securityConfig);
    }

    public final String b(Context context) {
        n.h(context, "context");
        return this.f15233a.fetchKey1(context);
    }

    public final String c(Context context) {
        n.h(context, "context");
        return this.f15233a.fetchKey2(context);
    }

    public final Object d(Context context, Class obj) {
        n.h(context, "context");
        n.h(obj, "obj");
        return new Gson().fromJson(this.f15233a.fetchCustomData(context), obj);
    }

    private a(SecurityConfig securityConfig) {
        this.f15233a = securityConfig;
    }
}
