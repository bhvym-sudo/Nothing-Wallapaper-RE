package p237x6;

import F8.AbstractC0814h;
import F8.L;
import java.io.IOException;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f30031a;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30032q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ List f30034s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, e eVar) {
            super(2, eVar);
            this.f30034s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return f.this.new a(this.f30034s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f30032q;
            if (i10 == 0) {
                r.b(obj);
                k kVar = f.this.f30031a;
                List list = this.f30034s;
                this.f30032q = 1;
                if (kVar.l(list, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    public f(k effectAssetManager) {
        n.h(effectAssetManager, "effectAssetManager");
        this.f30031a = effectAssetManager;
    }

    @Override // p237x6.p
    public void a() throws IOException {
        this.f30031a.k();
    }

    @Override // p237x6.p
    public void b(List list) {
        AbstractC0814h.b(null, new a(list, null), 1, null);
    }
}
