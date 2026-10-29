package p175r4;

import K3.c;
import K3.e;
import K3.f;
import K3.g;
import M3.r;
import S4.u;
import Y4.b;
import android.content.Context;
import com.google.android.datatransport.cct.a;

/* JADX INFO: loaded from: classes.dex */
public final class n9 implements V8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f26873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f26874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X8 f26875c;

    public n9(Context context, X8 x9) {
        this.f26875c = x9;
        a aVar = a.f16154g;
        r.f(context);
        final g gVarG = r.c().g(aVar);
        if (aVar.a().contains(K3.b.b("json"))) {
            this.f26873a = new u(new b() { // from class: r4.k9
                @Override // Y4.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, K3.b.b("json"), new e() { // from class: r4.m9
                        @Override // K3.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f26874b = new u(new b() { // from class: r4.l9
            @Override // Y4.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, K3.b.b("proto"), new e() { // from class: r4.j9
                    @Override // K3.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c b(X8 x9, U8 u9) {
        int iA = x9.a();
        return u9.zza() != 0 ? c.d(u9.c(iA, false)) : c.e(u9.c(iA, false));
    }

    @Override // p175r4.V8
    public final void a(U8 u9) {
        if (this.f26875c.a() != 0) {
            ((f) this.f26874b.get()).a(b(this.f26875c, u9));
            return;
        }
        b bVar = this.f26873a;
        if (bVar != null) {
            ((f) bVar.get()).a(b(this.f26875c, u9));
        }
    }
}
