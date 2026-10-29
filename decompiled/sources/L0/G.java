package L0;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4294q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f4295r;

        a(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s((y) obj, ((Boolean) obj2).booleanValue(), (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f4294q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return obj;
            }
            p079h8.r.b(obj);
            y yVar = (y) this.f4295r;
            this.f4294q = 1;
            Object objB = yVar.b(this);
            return objB == objE ? objE : objB;
        }

        public final Object s(y yVar, boolean z9, p129m8.e eVar) {
            a aVar = new a(eVar);
            aVar.f4295r = yVar;
            return aVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final Object a(F f10, p129m8.e eVar) {
        return f10.a(new a(null), eVar);
    }
}
