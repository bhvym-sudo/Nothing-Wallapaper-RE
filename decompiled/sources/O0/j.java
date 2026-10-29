package O0;

import L0.InterfaceC0932i;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5747q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f5748r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f5749s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, p129m8.e eVar) {
            super(2, eVar);
            this.f5749s = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f5749s, eVar);
            aVar.f5748r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f5747q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f5748r;
                r.b(obj);
                return cVar;
            }
            r.b(obj);
            c cVarC = ((f) this.f5748r).c();
            p pVar = this.f5749s;
            this.f5748r = cVarC;
            this.f5747q = 1;
            return pVar.invoke(cVarC, this) == objE ? objE : cVarC;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, p129m8.e eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final Object a(InterfaceC0932i interfaceC0932i, p pVar, p129m8.e eVar) {
        return interfaceC0932i.a(new a(pVar, null), eVar);
    }
}
