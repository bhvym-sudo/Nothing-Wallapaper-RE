package Q1;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.content.Context;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.android.customization.picker.clock.ui.view.ClockCarouselView;
import com.android.wallpaper.picker.customization.ui.section.ScreenPreviewClickView;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1450a;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6603a = new e();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6604a;

        static {
            int[] iArr = new int[AbstractC1157q.a.values().length];
            try {
                iArr[AbstractC1157q.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1157q.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6604a = iArr;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6605q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f6606r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ T1.b f6607s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ClockCarouselView f6608t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f6609u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Q1.a f6610v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ ScreenPreviewClickView f6611w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ S1.a f6612x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ Context f6613y;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6614q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f6615r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ T1.b f6616s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ClockCarouselView f6617t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ boolean f6618u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Q1.a f6619v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ ScreenPreviewClickView f6620w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ S1.a f6621x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ Context f6622y;

            /* JADX INFO: renamed from: Q1.e$b$a$a, reason: collision with other inner class name */
            static final class C0215a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6623q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.b f6624r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ ClockCarouselView f6625s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ boolean f6626t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ Q1.a f6627u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ ScreenPreviewClickView f6628v;

                /* JADX INFO: renamed from: Q1.e$b$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C0216a extends AbstractC1450a implements q {

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public static final C0216a f6629x = new C0216a();

                    C0216a() {
                        super(3, o.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                    }

                    @Override // p219v8.q
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object e(N1.a aVar, List list, p129m8.e eVar) {
                        return C0215a.u(aVar, list, eVar);
                    }
                }

                /* JADX INFO: renamed from: Q1.e$b$a$a$b, reason: collision with other inner class name */
                static final class C0217b implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ ClockCarouselView f6630q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ boolean f6631r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Q1.a f6632s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ ScreenPreviewClickView f6633t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    final /* synthetic */ T1.b f6634u;

                    C0217b(ClockCarouselView clockCarouselView, boolean z9, Q1.a aVar, ScreenPreviewClickView screenPreviewClickView, T1.b bVar) {
                        this.f6630q = clockCarouselView;
                        this.f6631r = z9;
                        this.f6632s = aVar;
                        this.f6633t = screenPreviewClickView;
                        this.f6634u = bVar;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final A f(T1.b bVar, T1.a clock) {
                        n.h(clock, "clock");
                        bVar.o(clock.a());
                        return A.f21846a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final A i(ClockCarouselView clockCarouselView, boolean z9) {
                        if (z9) {
                            clockCarouselView.w();
                        } else {
                            clockCarouselView.v();
                        }
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public final Object b(o oVar, p129m8.e eVar) {
                        N1.a aVar = (N1.a) oVar.a();
                        List list = (List) oVar.b();
                        ClockCarouselView clockCarouselView = this.f6630q;
                        final T1.b bVar = this.f6634u;
                        clockCarouselView.x(aVar, list, new p219v8.l() { // from class: Q1.f
                            @Override // p219v8.l
                            public final Object f(Object obj) {
                                return e.b.a.C0215a.C0217b.f(bVar, (T1.a) obj);
                            }
                        }, this.f6631r);
                        this.f6630q.setAccessibilityDelegate(list.size() > 1 ? this.f6632s : null);
                        ScreenPreviewClickView screenPreviewClickView = this.f6633t;
                        final ClockCarouselView clockCarouselView2 = this.f6630q;
                        screenPreviewClickView.setOnSideClickedListener(new p219v8.l() { // from class: Q1.g
                            @Override // p219v8.l
                            public final Object f(Object obj) {
                                return e.b.a.C0215a.C0217b.i(clockCarouselView2, ((Boolean) obj).booleanValue());
                            }
                        });
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0215a(T1.b bVar, ClockCarouselView clockCarouselView, boolean z9, Q1.a aVar, ScreenPreviewClickView screenPreviewClickView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6624r = bVar;
                    this.f6625s = clockCarouselView;
                    this.f6626t = z9;
                    this.f6627u = aVar;
                    this.f6628v = screenPreviewClickView;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object u(N1.a aVar, List list, p129m8.e eVar) {
                    return new o(aVar, list);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0215a(this.f6624r, this.f6625s, this.f6626t, this.f6627u, this.f6628v, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0215a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6623q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(this.f6624r.m(), this.f6624r.i(), C0216a.f6629x);
                        C0217b c0217b = new C0217b(this.f6625s, this.f6626t, this.f6627u, this.f6628v, this.f6624r);
                        this.f6623q = 1;
                        if (interfaceC0880fL.a(c0217b, this) == objE) {
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

            /* JADX INFO: renamed from: Q1.e$b$a$b, reason: collision with other inner class name */
            static final class C0218b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6635q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.b f6636r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ S1.a f6637s;

                /* JADX INFO: renamed from: Q1.e$b$a$b$a, reason: collision with other inner class name */
                static final class C0219a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ S1.a f6638q;

                    C0219a(S1.a aVar) {
                        this.f6638q = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        S1.a aVar = this.f6638q;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            aVar.g(((T1.a) it.next()).a());
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0218b(T1.b bVar, S1.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6636r = bVar;
                    this.f6637s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0218b(this.f6636r, this.f6637s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0218b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6635q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oI = this.f6636r.i();
                        C0219a c0219a = new C0219a(this.f6637s);
                        this.f6635q = 1;
                        if (oI.a(c0219a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            static final class c extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6639q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.b f6640r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ Q1.a f6641s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ClockCarouselView f6642t;

                /* JADX INFO: renamed from: Q1.e$b$a$c$a, reason: collision with other inner class name */
                static final class C0220a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ Q1.a f6643q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ ClockCarouselView f6644r;

                    C0220a(Q1.a aVar, ClockCarouselView clockCarouselView) {
                        this.f6643q = aVar;
                        this.f6644r = clockCarouselView;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        this.f6643q.a(this.f6644r.t(i10));
                        this.f6644r.setSelectedClockIndex(i10);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(T1.b bVar, Q1.a aVar, ClockCarouselView clockCarouselView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6640r = bVar;
                    this.f6641s = aVar;
                    this.f6642t = clockCarouselView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f6640r, this.f6641s, this.f6642t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6639q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fN = this.f6640r.n();
                        C0220a c0220a = new C0220a(this.f6641s, this.f6642t);
                        this.f6639q = 1;
                        if (interfaceC0880fN.a(c0220a, this) == objE) {
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

            static final class d extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6645q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.b f6646r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ S1.a f6647s;

                /* JADX INFO: renamed from: Q1.e$b$a$d$a, reason: collision with other inner class name */
                static final class C0221a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ S1.a f6648q;

                    C0221a(S1.a aVar) {
                        this.f6648q = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(Integer num, p129m8.e eVar) {
                        this.f6648q.h(num);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(T1.b bVar, S1.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6646r = bVar;
                    this.f6647s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new d(this.f6646r, this.f6647s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6645q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fK = this.f6646r.k();
                        C0221a c0221a = new C0221a(this.f6647s);
                        this.f6645q = 1;
                        if (interfaceC0880fK.a(c0221a, this) == objE) {
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

            /* JADX INFO: renamed from: Q1.e$b$a$e, reason: collision with other inner class name */
            static final class C0222e extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6649q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Context f6650r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ T1.b f6651s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ClockCarouselView f6652t;

                /* JADX INFO: renamed from: Q1.e$b$a$e$a, reason: collision with other inner class name */
                static final class C0223a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ ClockCarouselView f6653q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ Context f6654r;

                    C0223a(ClockCarouselView clockCarouselView, Context context) {
                        this.f6653q = clockCarouselView;
                        this.f6654r = context;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        this.f6653q.setCarouselCardColor(p171r0.a.b(this.f6654r, i10));
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0222e(Context context, T1.b bVar, ClockCarouselView clockCarouselView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6650r = context;
                    this.f6651s = bVar;
                    this.f6652t = clockCarouselView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0222e(this.f6650r, this.f6651s, this.f6652t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0222e) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6649q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fJ = this.f6651s.j((this.f6650r.getResources().getConfiguration().uiMode & 48) == 32);
                        C0223a c0223a = new C0223a(this.f6652t, this.f6650r);
                        this.f6649q = 1;
                        if (interfaceC0880fJ.a(c0223a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T1.b bVar, ClockCarouselView clockCarouselView, boolean z9, Q1.a aVar, ScreenPreviewClickView screenPreviewClickView, S1.a aVar2, Context context, p129m8.e eVar) {
                super(2, eVar);
                this.f6616s = bVar;
                this.f6617t = clockCarouselView;
                this.f6618u = z9;
                this.f6619v = aVar;
                this.f6620w = screenPreviewClickView;
                this.f6621x = aVar2;
                this.f6622y = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f6616s, this.f6617t, this.f6618u, this.f6619v, this.f6620w, this.f6621x, this.f6622y, eVar);
                aVar.f6615r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f6614q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f6615r;
                AbstractC0816i.d(l9, null, null, new C0215a(this.f6616s, this.f6617t, this.f6618u, this.f6619v, this.f6620w, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0218b(this.f6616s, this.f6621x, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f6616s, this.f6619v, this.f6617t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new d(this.f6616s, this.f6621x, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0222e(this.f6622y, this.f6616s, this.f6617t, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, T1.b bVar, ClockCarouselView clockCarouselView, boolean z9, Q1.a aVar, ScreenPreviewClickView screenPreviewClickView, S1.a aVar2, Context context, p129m8.e eVar) {
            super(2, eVar);
            this.f6606r = interfaceC1163x;
            this.f6607s = bVar;
            this.f6608t = clockCarouselView;
            this.f6609u = z9;
            this.f6610v = aVar;
            this.f6611w = screenPreviewClickView;
            this.f6612x = aVar2;
            this.f6613y = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f6606r, this.f6607s, this.f6608t, this.f6609u, this.f6610v, this.f6611w, this.f6612x, this.f6613y, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6605q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f6606r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f6607s, this.f6608t, this.f6609u, this.f6610v, this.f6611w, this.f6612x, this.f6613y, null);
                this.f6605q = 1;
                if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
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

    private e() {
    }

    public static final void d(Context context, final ClockCarouselView carouselView, ScreenPreviewClickView screenPreviewClickView, T1.b viewModel, final S1.a clockViewFactory, InterfaceC1163x lifecycleOwner, boolean z9) {
        n.h(context, "context");
        n.h(carouselView, "carouselView");
        n.h(screenPreviewClickView, "screenPreviewClickView");
        n.h(viewModel, "viewModel");
        n.h(clockViewFactory, "clockViewFactory");
        n.h(lifecycleOwner, "lifecycleOwner");
        carouselView.setClockViewFactory(clockViewFactory);
        carouselView.setVisibility(0);
        clockViewFactory.c();
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new b(lifecycleOwner, viewModel, carouselView, z9, new Q1.a(context, new p219v8.a() { // from class: Q1.b
            @Override // p219v8.a
            public final Object invoke() {
                return e.e(carouselView);
            }
        }, new p219v8.a() { // from class: Q1.c
            @Override // p219v8.a
            public final Object invoke() {
                return e.f(carouselView);
            }
        }), screenPreviewClickView, clockViewFactory, context, null), 3, null);
        lifecycleOwner.getLifecycle().a(new InterfaceC1160u() { // from class: Q1.d
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                e.g(clockViewFactory, interfaceC1163x, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A e(ClockCarouselView clockCarouselView) {
        clockCarouselView.y();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A f(ClockCarouselView clockCarouselView) {
        clockCarouselView.z();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(S1.a aVar, InterfaceC1163x source, AbstractC1157q.a event) {
        n.h(source, "source");
        n.h(event, "event");
        int i10 = a.f6604a[event.ordinal()];
        if (i10 == 1) {
            aVar.e(source);
        } else {
            if (i10 != 2) {
                return;
            }
            aVar.i(source);
        }
    }
}
