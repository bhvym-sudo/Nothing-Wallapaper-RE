package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13391b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z0.a.b f13392c = a1.g.a.f9602a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0.d f13393a;

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final d0 a(e0 store, c factory, Z0.a extras) {
            kotlin.jvm.internal.n.h(store, "store");
            kotlin.jvm.internal.n.h(factory, "factory");
            kotlin.jvm.internal.n.h(extras, "extras");
            return new d0(store, factory, extras);
        }

        private b() {
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13398a = a.f13399a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f13399a = new a();

            private a() {
            }
        }

        default a0 a(Class modelClass) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            return p002a1.g.f9601a.d();
        }

        default a0 b(C8.c modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            return c(p209u8.a.a(modelClass), extras);
        }

        default a0 c(Class modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            return a(modelClass);
        }
    }

    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f13401c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13400b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Z0.a.b f13402d = a1.g.a.f9602a;

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final d a() {
                if (d.f13401c == null) {
                    d.f13401c = new d();
                }
                d dVar = d.f13401c;
                kotlin.jvm.internal.n.e(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            return p002a1.d.f9596a.a(modelClass);
        }

        @Override // androidx.lifecycle.d0.c
        public a0 b(C8.c modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            return c(p209u8.a.a(modelClass), extras);
        }

        @Override // androidx.lifecycle.d0.c
        public a0 c(Class modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            return a(modelClass);
        }
    }

    public static class e {
        public abstract void d(a0 a0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(e0 store, c factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.n.h(store, "store");
        kotlin.jvm.internal.n.h(factory, "factory");
    }

    public final a0 a(C8.c modelClass) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        return Z0.d.b(this.f13393a, modelClass, null, 2, null);
    }

    public a0 b(Class modelClass) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        return a(p209u8.a.c(modelClass));
    }

    public a0 c(String key, Class modelClass) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        return this.f13393a.a(p209u8.a.c(modelClass), key);
    }

    public static class a extends d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f13395g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f13397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f13394f = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Z0.a.b f13396h = new C0398a();

        /* JADX INFO: renamed from: androidx.lifecycle.d0$a$a, reason: collision with other inner class name */
        public static final class C0398a implements Z0.a.b {
            C0398a() {
            }
        }

        public static final class b {
            public /* synthetic */ b(AbstractC1457h abstractC1457h) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.n.h(application, "application");
                if (a.f13395g == null) {
                    a.f13395g = new a(application);
                }
                a aVar = a.f13395g;
                kotlin.jvm.internal.n.e(aVar);
                return aVar;
            }

            private b() {
            }
        }

        private a(Application application, int i10) {
            this.f13397e = application;
        }

        private final a0 h(Class cls, Application application) {
            if (!AbstractC1142b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                a0 a0Var = (a0) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.n.g(a0Var, "{\n                try {\n…          }\n            }");
                return a0Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.d0.d, androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            Application application = this.f13397e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.d0.d, androidx.lifecycle.d0.c
        public a0 c(Class modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            if (this.f13397e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f13396h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC1142b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.n.h(application, "application");
        }
    }

    private d0(Z0.d dVar) {
        this.f13393a = dVar;
    }

    public /* synthetic */ d0(e0 e0Var, c cVar, Z0.a aVar, int i10, AbstractC1457h abstractC1457h) {
        this(e0Var, cVar, (i10 & 4) != 0 ? Z0.a.C0345a.f9384b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(e0 store, c factory, Z0.a defaultCreationExtras) {
        this(new Z0.d(store, factory, defaultCreationExtras));
        kotlin.jvm.internal.n.h(store, "store");
        kotlin.jvm.internal.n.h(factory, "factory");
        kotlin.jvm.internal.n.h(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(f0 owner) {
        kotlin.jvm.internal.n.h(owner, "owner");
        e0 viewModelStore = owner.getViewModelStore();
        p002a1.g gVar = p002a1.g.f9601a;
        this(viewModelStore, gVar.b(owner), gVar.a(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(f0 owner, c factory) {
        this(owner.getViewModelStore(), factory, p002a1.g.f9601a.a(owner));
        kotlin.jvm.internal.n.h(owner, "owner");
        kotlin.jvm.internal.n.h(factory, "factory");
    }
}
