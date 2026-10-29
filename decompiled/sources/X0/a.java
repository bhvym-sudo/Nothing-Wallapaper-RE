package X0;

import androidx.lifecycle.InterfaceC1163x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.InterfaceC1386a;
import p079h8.q;
import p079h8.r;
import p170r.AbstractC1708u0;
import p170r.AbstractC1709v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1708u0 f8926a;

    /* JADX INFO: renamed from: X0.a$a, reason: collision with other inner class name */
    static final class C0315a extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C0315a f8927r = new C0315a();

        C0315a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1163x invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    static {
        Object objB;
        AbstractC1708u0 abstractC1708u0;
        try {
            q.a aVar = q.f21862r;
            ClassLoader classLoader = InterfaceC1163x.class.getClassLoader();
            n.e(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    if (objInvoke instanceof AbstractC1708u0) {
                        abstractC1708u0 = (AbstractC1708u0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof InterfaceC1386a)) {
                    i10++;
                }
                abstractC1708u0 = null;
                break;
            }
            objB = q.b(abstractC1708u0);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        AbstractC1708u0 abstractC1708u0E = (AbstractC1708u0) (q.f(objB) ? null : objB);
        if (abstractC1708u0E == null) {
            abstractC1708u0E = AbstractC1709v.e(C0315a.f8927r);
        }
        f8926a = abstractC1708u0E;
    }

    public static final AbstractC1708u0 a() {
        return f8926a;
    }
}
