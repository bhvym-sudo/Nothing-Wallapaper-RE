package J8;

import F8.L;
import F8.M;
import F8.N;
import F8.P;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p129m8.i f3889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final H8.a f3891s;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3892q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3893r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3894s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ e f3895t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0881g interfaceC0881g, e eVar, p129m8.e eVar2) {
            super(2, eVar2);
            this.f3894s = interfaceC0881g;
            this.f3895t = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f3894s, this.f3895t, eVar);
            aVar.f3893r = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3892q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                L l9 = (L) this.f3893r;
                InterfaceC0881g interfaceC0881g = this.f3894s;
                H8.v vVarP = this.f3895t.p(l9);
                this.f3892q = 1;
                if (AbstractC0882h.s(interfaceC0881g, vVarP, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3896q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3897r;

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = e.this.new b(eVar);
            bVar.f3897r = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3896q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                H8.t tVar = (H8.t) this.f3897r;
                e eVar = e.this;
                this.f3896q = 1;
                if (eVar.j(tVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H8.t tVar, p129m8.e eVar) {
            return ((b) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public e(p129m8.i iVar, int i10, H8.a aVar) {
        this.f3889q = iVar;
        this.f3890r = i10;
        this.f3891s = aVar;
    }

    static /* synthetic */ Object i(e eVar, InterfaceC0881g interfaceC0881g, p129m8.e eVar2) {
        Object objE = M.e(new a(interfaceC0881g, eVar, null), eVar2);
        return objE == p139n8.b.e() ? objE : p079h8.A.f21846a;
    }

    @Override // I8.InterfaceC0880f
    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        return i(this, interfaceC0881g, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // J8.q
    public InterfaceC0880f e(p129m8.i iVar, int i10, H8.a aVar) {
        p129m8.i iVarZ = iVar.z(this.f3889q);
        if (aVar == H8.a.SUSPEND) {
            int i11 = this.f3890r;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                        }
                    }
                }
            }
            aVar = this.f3891s;
        }
        return (kotlin.jvm.internal.n.d(iVarZ, this.f3889q) && i10 == this.f3890r && aVar == this.f3891s) ? this : k(iVarZ, i10, aVar);
    }

    protected String f() {
        return null;
    }

    protected abstract Object j(H8.t tVar, p129m8.e eVar);

    protected abstract e k(p129m8.i iVar, int i10, H8.a aVar);

    public InterfaceC0880f m() {
        return null;
    }

    public final p219v8.p n() {
        return new b(null);
    }

    public final int o() {
        int i10 = this.f3890r;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public H8.v p(L l9) {
        return H8.r.d(l9, this.f3889q, o(), this.f3891s, N.ATOMIC, null, n(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        if (this.f3889q != p129m8.j.f23252q) {
            arrayList.add("context=" + this.f3889q);
        }
        if (this.f3890r != -3) {
            arrayList.add("capacity=" + this.f3890r);
        }
        if (this.f3891s != H8.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f3891s);
        }
        return P.a(this) + '[' + AbstractC1444s.a0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
