package p155p4;

import K3.e;
import K3.g;
import M3.r;
import S4.u;
import Y4.b;
import android.content.Context;
import com.google.android.datatransport.cct.a;

/* JADX INFO: loaded from: classes.dex */
public final class U implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f23721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f23722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J f23723c;

    public U(Context context, J j9) {
        this.f23723c = j9;
        a aVar = a.f16154g;
        r.f(context);
        final g gVarG = r.c().g(aVar);
        if (aVar.a().contains(K3.b.b("json"))) {
            this.f23721a = new u(new b() { // from class: p4.P
                @Override // Y4.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, K3.b.b("json"), new e() { // from class: p4.S
                        @Override // K3.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f23722b = new u(new b() { // from class: p4.Q
            @Override // Y4.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, K3.b.b("proto"), new e() { // from class: p4.O
                    @Override // K3.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
