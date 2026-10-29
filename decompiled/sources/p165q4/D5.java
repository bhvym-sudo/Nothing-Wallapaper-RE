package p165q4;

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
public final class D5 implements InterfaceC1602q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f23958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f23959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1615s5 f23960c;

    public D5(Context context, AbstractC1615s5 abstractC1615s5) {
        this.f23960c = abstractC1615s5;
        a aVar = a.f16154g;
        r.f(context);
        final g gVarG = r.c().g(aVar);
        if (aVar.a().contains(K3.b.b("json"))) {
            this.f23958a = new u(new b() { // from class: q4.A5
                @Override // Y4.b
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, K3.b.b("json"), new e() { // from class: q4.C5
                        @Override // K3.e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f23959b = new u(new b() { // from class: q4.B5
            @Override // Y4.b
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, K3.b.b("proto"), new e() { // from class: q4.z5
                    @Override // K3.e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static c b(AbstractC1615s5 abstractC1615s5, InterfaceC1595p5 interfaceC1595p5) {
        return c.e(interfaceC1595p5.b(abstractC1615s5.a(), false));
    }

    @Override // p165q4.InterfaceC1602q5
    public final void a(InterfaceC1595p5 interfaceC1595p5) {
        if (this.f23960c.a() != 0) {
            ((f) this.f23959b.get()).a(b(this.f23960c, interfaceC1595p5));
            return;
        }
        b bVar = this.f23958a;
        if (bVar != null) {
            ((f) bVar.get()).a(b(this.f23960c, interfaceC1595p5));
        }
    }
}
