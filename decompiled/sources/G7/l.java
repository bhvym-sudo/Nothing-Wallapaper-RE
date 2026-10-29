package G7;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.nothing.wallpaper.R;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1450a;
import p044e3.AbstractC1324g;
import p079h8.A;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2056a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f2057b = N.i(p079h8.v.a(N1.a.DYNAMIC, Integer.valueOf(R.drawable.clock_edit_size_large)), p079h8.v.a(N1.a.SMALL, Integer.valueOf(R.drawable.clock_edit_size_small)), p079h8.v.a(A7.a.CENTER, Integer.valueOf(R.drawable.clock_edit_align_center)), p079h8.v.a(A7.a.LEFT, Integer.valueOf(R.drawable.clock_edit_align_left)));

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2058q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f2059r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f2060s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p079h8.o[] f2061t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object[] f2062u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ J7.i f2063v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ p219v8.l f2064w;

        /* JADX INFO: renamed from: G7.l$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0083a extends AbstractC1450a implements p219v8.q {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final C0083a f2065x = new C0083a();

            C0083a() {
                super(3, p079h8.o.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // p219v8.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object e(Object obj, String str, p129m8.e eVar) {
                return a.u(obj, str, eVar);
            }
        }

        static final class b implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p079h8.o[] f2066q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Object[] f2067r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ J7.i f2068s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.l f2069t;

            b(p079h8.o[] oVarArr, Object[] objArr, J7.i iVar, p219v8.l lVar) {
                this.f2066q = oVarArr;
                this.f2067r = objArr;
                this.f2068s = iVar;
                this.f2069t = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(J7.i iVar, p219v8.l lVar, Object obj, View view) {
                if (iVar.n0()) {
                    return;
                }
                lVar.f(obj);
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object b(p079h8.o oVar, p129m8.e eVar) {
                Object objA = oVar.a();
                String str = (String) oVar.b();
                p079h8.o[] oVarArr = this.f2066q;
                Object[] objArr = this.f2067r;
                final J7.i iVar = this.f2068s;
                final p219v8.l lVar = this.f2069t;
                int length = oVarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    p079h8.o oVar2 = oVarArr[i10];
                    int i12 = i11 + 1;
                    Integer num = (Integer) oVar2.a();
                    ImageView imageView = (ImageView) oVar2.b();
                    final Object obj = objArr[i11];
                    if (num != null) {
                        imageView.setImageResource(num.intValue());
                    }
                    imageView.setEnabled(l.f2056a.i(str, kotlin.jvm.internal.n.d(objA, obj)));
                    imageView.setSelected(kotlin.jvm.internal.n.d(objA, obj));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: G7.m
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l.a.b.e(iVar, lVar, obj, view);
                        }
                    });
                    i10++;
                    i11 = i12;
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, p079h8.o[] oVarArr, Object[] objArr, J7.i iVar, p219v8.l lVar, p129m8.e eVar) {
            super(2, eVar);
            this.f2059r = interfaceC0880f;
            this.f2060s = interfaceC0880f2;
            this.f2061t = oVarArr;
            this.f2062u = objArr;
            this.f2063v = iVar;
            this.f2064w = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object u(Object obj, String str, p129m8.e eVar) {
            return new p079h8.o(obj, str);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f2059r, this.f2060s, this.f2061t, this.f2062u, this.f2063v, this.f2064w, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2058q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(this.f2059r, this.f2060s, C0083a.f2065x);
                b bVar = new b(this.f2061t, this.f2062u, this.f2063v, this.f2064w);
                this.f2058q = 1;
                if (interfaceC0880fL.a(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A e(J7.i iVar, A7.a item) {
        kotlin.jvm.internal.n.h(item, "item");
        iVar.O0(item);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(J7.i iVar, N1.a item) {
        kotlin.jvm.internal.n.h(item, "item");
        iVar.Q0(item);
        return A.f21846a;
    }

    private final void h(L l9, J7.i iVar, InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, Object[] objArr, p079h8.o[] oVarArr, p219v8.l lVar) {
        AbstractC0816i.d(l9, null, null, new a(interfaceC0880f, interfaceC0880f2, oVarArr, objArr, iVar, lVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(String str, boolean z9) {
        return !A7.e.f313a.a().containsKey(str) || z9;
    }

    private final void j(com.android.launcher3.f fVar, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = fVar.f15581r;
        layoutParams.height = fVar.i();
        view.setLayoutParams(layoutParams);
    }

    public final void d(AbstractC1324g binding, com.android.launcher3.f deviceProfile, final J7.i lockScreenViewModel, L coroutineScope) {
        kotlin.jvm.internal.n.h(binding, "binding");
        kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
        kotlin.jvm.internal.n.h(lockScreenViewModel, "lockScreenViewModel");
        kotlin.jvm.internal.n.h(coroutineScope, "coroutineScope");
        A7.a[] aVarArr = {A7.a.LEFT, A7.a.CENTER};
        Map map = f2057b;
        p079h8.o[] oVarArr = {p079h8.v.a(map.get(aVarArr[0]), binding.f19976H), p079h8.v.a(map.get(aVarArr[1]), binding.f19982w)};
        ImageView left = binding.f19976H;
        kotlin.jvm.internal.n.g(left, "left");
        j(deviceProfile, left);
        ImageView center = binding.f19982w;
        kotlin.jvm.internal.n.g(center, "center");
        j(deviceProfile, center);
        LinearLayout clockAlign = binding.f19983x;
        kotlin.jvm.internal.n.g(clockAlign, "clockAlign");
        ViewGroup.LayoutParams layoutParams = clockAlign.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = deviceProfile.i();
        clockAlign.setLayoutParams(layoutParams);
        ImageView imageView = binding.f19976H;
        Context context = imageView.getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        imageView.setContentDescription(H6.a.d(context) ? imageView.getResources().getString(R.string.nt_clock_align_right) : imageView.getResources().getString(R.string.nt_clock_align_left));
        ImageView imageView2 = binding.f19982w;
        imageView2.setContentDescription(imageView2.getResources().getString(R.string.nt_clock_align_center));
        h(coroutineScope, lockScreenViewModel, lockScreenViewModel.T(), lockScreenViewModel.U(), aVarArr, oVarArr, new p219v8.l() { // from class: G7.j
            @Override // p219v8.l
            public final Object f(Object obj) {
                return l.e(lockScreenViewModel, (A7.a) obj);
            }
        });
    }

    public final void f(AbstractC1324g binding, com.android.launcher3.f deviceProfile, final J7.i lockScreenViewModel, L coroutineScope) {
        kotlin.jvm.internal.n.h(binding, "binding");
        kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
        kotlin.jvm.internal.n.h(lockScreenViewModel, "lockScreenViewModel");
        kotlin.jvm.internal.n.h(coroutineScope, "coroutineScope");
        N1.a[] aVarArr = {N1.a.DYNAMIC, N1.a.SMALL};
        Map map = f2057b;
        p079h8.o[] oVarArr = {p079h8.v.a(map.get(aVarArr[0]), binding.f19975G), p079h8.v.a(map.get(aVarArr[1]), binding.f19977I)};
        ImageView large = binding.f19975G;
        kotlin.jvm.internal.n.g(large, "large");
        j(deviceProfile, large);
        ImageView small = binding.f19977I;
        kotlin.jvm.internal.n.g(small, "small");
        j(deviceProfile, small);
        ImageView imageView = binding.f19977I;
        imageView.setContentDescription(imageView.getResources().getString(R.string.nt_clock_size_small));
        ImageView imageView2 = binding.f19975G;
        imageView2.setContentDescription(imageView2.getResources().getString(R.string.nt_clock_size_big));
        h(coroutineScope, lockScreenViewModel, lockScreenViewModel.V(), lockScreenViewModel.U(), aVarArr, oVarArr, new p219v8.l() { // from class: G7.k
            @Override // p219v8.l
            public final Object f(Object obj) {
                return l.g(lockScreenViewModel, (N1.a) obj);
            }
        });
    }
}
