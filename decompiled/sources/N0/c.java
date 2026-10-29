package N0;

import C8.k;
import F8.L;
import L0.InterfaceC0932i;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p249y8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f5184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f5185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f5186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterfaceC0932i f5187e;

    static final class a extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f5188r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f5189s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f5188r = context;
            this.f5189s = cVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f5188r;
            n.g(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f5189s.f5183a);
        }
    }

    public c(String name, M0.b bVar, l produceMigrations, L scope) {
        n.h(name, "name");
        n.h(produceMigrations, "produceMigrations");
        n.h(scope, "scope");
        this.f5183a = name;
        this.f5184b = produceMigrations;
        this.f5185c = scope;
        this.f5186d = new Object();
    }

    @Override // p249y8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0932i a(Context thisRef, k property) {
        InterfaceC0932i interfaceC0932i;
        n.h(thisRef, "thisRef");
        n.h(property, "property");
        InterfaceC0932i interfaceC0932i2 = this.f5187e;
        if (interfaceC0932i2 != null) {
            return interfaceC0932i2;
        }
        synchronized (this.f5186d) {
            try {
                if (this.f5187e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    O0.e eVar = O0.e.f5742a;
                    l lVar = this.f5184b;
                    n.g(applicationContext, "applicationContext");
                    this.f5187e = eVar.b(null, (List) lVar.f(applicationContext), this.f5185c, new a(applicationContext, this));
                }
                interfaceC0932i = this.f5187e;
                n.e(interfaceC0932i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0932i;
    }
}
