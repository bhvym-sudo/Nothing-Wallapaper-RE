package p088i7;

import D3.c;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import androidx.lifecycle.Q;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p234x3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC0880f f22212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g f22214m;

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    public static final class C0551a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f22215q;

        /* JADX INFO: renamed from: i7.a$a$a, reason: collision with other inner class name */
        public static final class C0552a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f22216q;

            /* JADX INFO: renamed from: i7.a$a$a$a, reason: collision with other inner class name */
            public static final class C0553a extends d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f22217q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f22218r;

                public C0553a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f22217q = obj;
                    this.f22218r |= Integer.MIN_VALUE;
                    return C0552a.this.b(null, this);
                }
            }

            public C0552a(InterfaceC0881g interfaceC0881g) {
                this.f22216q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0553a c0553a;
                if (eVar instanceof C0553a) {
                    c0553a = (C0553a) eVar;
                    int i10 = c0553a.f22218r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0553a.f22218r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0553a = new C0553a(eVar);
                    }
                } else {
                    c0553a = new C0553a(eVar);
                }
                Object obj2 = c0553a.f22217q;
                Object objE = p139n8.b.e();
                int i11 = c0553a.f22218r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f22216q;
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(p028c7.a.f15234q.b(((Boolean) obj).booleanValue()));
                    c0553a.f22218r = 1;
                    if (interfaceC0881g.b(numC, c0553a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public C0551a(InterfaceC0880f interfaceC0880f) {
            this.f22215q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f22215q.a(new C0552a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c undoInteractor, p194t3.a wallpaperInteractor, Q savedStateHandle) {
        super(undoInteractor, wallpaperInteractor, savedStateHandle);
        n.h(undoInteractor, "undoInteractor");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(savedStateHandle, "savedStateHandle");
        this.f22212k = new C0551a(k());
        this.f22213l = 8;
        this.f22214m = new g(8);
    }

    @Override // androidx.lifecycle.a0
    protected void d() {
        super.d();
        this.f22214m.g();
    }

    public final g n() {
        return this.f22214m;
    }

    public final InterfaceC0880f o() {
        return this.f22212k;
    }

    public final void p(boolean z9) {
        j().setValue(Boolean.valueOf(z9));
        g().i("is_on_lock_screen", Boolean.valueOf(z9));
    }
}
