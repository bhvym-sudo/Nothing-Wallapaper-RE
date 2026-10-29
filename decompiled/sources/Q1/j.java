package Q1;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import androidx.core.view.y;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.customization.picker.clock.ui.view.ClockCarouselView;
import com.android.customization.picker.color.ui.view.ColorOptionIconView;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1450a;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.m;
import p079h8.o;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6659a = new j();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6660a;

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
            f6660a = iArr;
        }
    }

    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T1.f f6661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f6662b;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6663q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ T1.f f6664r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f6665s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T1.f fVar, int i10, p129m8.e eVar) {
                super(2, eVar);
                this.f6664r = fVar;
                this.f6665s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f6664r, this.f6665s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f6663q;
                if (i10 == 0) {
                    r.b(obj);
                    T1.f fVar = this.f6664r;
                    int i11 = this.f6665s;
                    this.f6663q = 1;
                    if (fVar.x(i11, this) == objE) {
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

        b(T1.f fVar, InterfaceC1163x interfaceC1163x) {
            this.f6661a = fVar;
            this.f6662b = interfaceC1163x;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
            if (z9) {
                this.f6661a.w(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                AbstractC0816i.d(AbstractC1164y.a(this.f6662b), null, null, new a(this.f6661a, progress, null), 3, null);
            }
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final /* synthetic */ RadioGroup.OnCheckedChangeListener f6666A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        final /* synthetic */ SeekBar f6667B;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6668q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f6669r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ T1.f f6670s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ S1.a f6671t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ P1.b f6672u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ View f6673v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ RadioGroup f6674w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ LinearLayout f6675x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ View f6676y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6677z;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ ViewGroup f6678A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            final /* synthetic */ RadioGroup.OnCheckedChangeListener f6679B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ SeekBar f6680C;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6681q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f6682r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ T1.f f6683s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ S1.a f6684t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ P1.b f6685u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ View f6686v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ RadioGroup f6687w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ LinearLayout f6688x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ View f6689y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f6690z;

            /* JADX INFO: renamed from: Q1.j$c$a$a, reason: collision with other inner class name */
            static final class C0224a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6691q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6692r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ S1.a f6693s;

                /* JADX INFO: renamed from: Q1.j$c$a$a$a, reason: collision with other inner class name */
                static final class C0225a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ T1.f f6694q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ S1.a f6695r;

                    C0225a(T1.f fVar, S1.a aVar) {
                        this.f6694q = fVar;
                        this.f6695r = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(Integer num, p129m8.e eVar) {
                        String str = (String) this.f6694q.o().getValue();
                        if (str != null) {
                            this.f6695r.a(str, num);
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0224a(T1.f fVar, S1.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6692r = fVar;
                    this.f6693s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0224a(this.f6692r, this.f6693s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0224a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6691q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fN = this.f6692r.n();
                        C0225a c0225a = new C0225a(this.f6692r, this.f6693s);
                        this.f6691q = 1;
                        if (interfaceC0880fN.a(c0225a, this) == objE) {
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

            static final class b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6696q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6697r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ P1.b f6698s;

                /* JADX INFO: renamed from: Q1.j$c$a$b$a, reason: collision with other inner class name */
                static final class C0226a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ P1.b f6699q;

                    C0226a(P1.b bVar) {
                        this.f6699q = bVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        this.f6699q.h(list);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(T1.f fVar, P1.b bVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6697r = fVar;
                    this.f6698s = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f6697r, this.f6698s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6696q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fT = this.f6697r.t();
                        C0226a c0226a = new C0226a(this.f6698s);
                        this.f6696q = 1;
                        if (interfaceC0880fT.a(c0226a, this) == objE) {
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

            /* JADX INFO: renamed from: Q1.j$c$a$c, reason: collision with other inner class name */
            static final class C0227c extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6700q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6701r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f6702s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ RadioGroup f6703t;

                /* JADX INFO: renamed from: Q1.j$c$a$c$a, reason: collision with other inner class name */
                static final class C0228a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f6704q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ RadioGroup f6705r;

                    /* JADX INFO: renamed from: Q1.j$c$a$c$a$a, reason: collision with other inner class name */
                    public /* synthetic */ class C0229a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f6706a;

                        static {
                            int[] iArr = new int[T1.f.c.values().length];
                            try {
                                iArr[T1.f.c.COLOR.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[T1.f.c.SIZE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            f6706a = iArr;
                        }
                    }

                    C0228a(View view, RadioGroup radioGroup) {
                        this.f6704q = view;
                        this.f6705r = radioGroup;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(T1.f.c cVar, p129m8.e eVar) {
                        int i10 = C0229a.f6706a[cVar.ordinal()];
                        if (i10 == 1) {
                            this.f6704q.setVisibility(0);
                            this.f6705r.setVisibility(4);
                        } else {
                            if (i10 != 2) {
                                throw new m();
                            }
                            this.f6704q.setVisibility(4);
                            this.f6705r.setVisibility(0);
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0227c(T1.f fVar, View view, RadioGroup radioGroup, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6701r = fVar;
                    this.f6702s = view;
                    this.f6703t = radioGroup;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0227c(this.f6701r, this.f6702s, this.f6703t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0227c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6700q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oR = this.f6701r.r();
                        C0228a c0228a = new C0228a(this.f6702s, this.f6703t);
                        this.f6700q = 1;
                        if (oR.a(c0228a, this) == objE) {
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

            static final class d extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6707q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6708r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LinearLayout f6709s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ View f6710t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f6711u;

                /* JADX INFO: renamed from: Q1.j$c$a$d$a, reason: collision with other inner class name */
                static final class C0230a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LinearLayout f6712q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ View f6713r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ InterfaceC1163x f6714s;

                    C0230a(LinearLayout linearLayout, View view, InterfaceC1163x interfaceC1163x) {
                        this.f6712q = linearLayout;
                        this.f6713r = view;
                        this.f6714s = interfaceC1163x;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        this.f6712q.removeAllViews();
                        View view = this.f6713r;
                        LinearLayout linearLayout = this.f6712q;
                        InterfaceC1163x interfaceC1163x = this.f6714s;
                        int i10 = 0;
                        for (Object obj : list) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                AbstractC1444s.t();
                            }
                            p013b2.a aVar = (p013b2.a) ((B3.a) obj).d();
                            if (aVar != null) {
                                View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.clock_color_option, (ViewGroup) linearLayout, false);
                                n.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                boolean z9 = (view.getResources().getConfiguration().uiMode & 48) == 32;
                                Y1.a aVar2 = Y1.a.f9231a;
                                View viewRequireViewById = linearLayout2.requireViewById(R.id.foreground);
                                n.g(viewRequireViewById, "requireViewById(...)");
                                aVar2.a((ColorOptionIconView) viewRequireViewById, aVar, z9);
                                A3.f.l(A3.f.f167a, linearLayout2, (B3.a) list.get(i10), interfaceC1163x, null, null, null, 40, null);
                                linearLayout2.setId(i10 + 1234);
                                linearLayout.addView(linearLayout2);
                            }
                            i10 = i11;
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(T1.f fVar, LinearLayout linearLayout, View view, InterfaceC1163x interfaceC1163x, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6708r = fVar;
                    this.f6709s = linearLayout;
                    this.f6710t = view;
                    this.f6711u = interfaceC1163x;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new d(this.f6708r, this.f6709s, this.f6710t, this.f6711u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6707q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fM = this.f6708r.m();
                        C0230a c0230a = new C0230a(this.f6709s, this.f6710t, this.f6711u);
                        this.f6707q = 1;
                        if (interfaceC0880fM.a(c0230a, this) == objE) {
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

            static final class e extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6715q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6716r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f6717s;

                /* JADX INFO: renamed from: Q1.j$c$a$e$a, reason: collision with other inner class name */
                static final class C0231a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f6718q;

                    C0231a(View view) {
                        this.f6718q = view;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        ViewParent parent;
                        if (i10 != -1) {
                            View viewRequireViewById = this.f6718q.requireViewById(R.id.color_options);
                            n.g(viewRequireViewById, "requireViewById(...)");
                            View viewFindViewById = ((LinearLayout) viewRequireViewById).findViewById(i10 + 1234);
                            if (viewFindViewById != null && (parent = viewFindViewById.getParent()) != null) {
                                parent.requestChildFocus(viewFindViewById, viewFindViewById);
                            }
                        }
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(T1.f fVar, View view, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6716r = fVar;
                    this.f6717s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new e(this.f6716r, this.f6717s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6715q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fQ = this.f6716r.q();
                        C0231a c0231a = new C0231a(this.f6717s);
                        this.f6715q = 1;
                        if (interfaceC0880fQ.a(c0231a, this) == objE) {
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

            static final class f extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6719q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6720r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ ViewGroup f6721s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ S1.a f6722t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ RadioGroup f6723u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ RadioGroup.OnCheckedChangeListener f6724v;

                /* JADX INFO: renamed from: Q1.j$c$a$f$a, reason: collision with other inner class name */
                /* synthetic */ class C0232a extends AbstractC1450a implements q {

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public static final C0232a f6725x = new C0232a();

                    C0232a() {
                        super(3, o.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                    }

                    @Override // p219v8.q
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object e(String str, N1.a aVar, p129m8.e eVar) {
                        return f.u(str, aVar, eVar);
                    }
                }

                static final class b implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ ViewGroup f6726q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ S1.a f6727r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ RadioGroup f6728s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ RadioGroup.OnCheckedChangeListener f6729t;

                    /* JADX INFO: renamed from: Q1.j$c$a$f$b$a, reason: collision with other inner class name */
                    public /* synthetic */ class C0233a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f6730a;

                        static {
                            int[] iArr = new int[N1.a.values().length];
                            try {
                                iArr[N1.a.DYNAMIC.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[N1.a.SMALL.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            f6730a = iArr;
                        }
                    }

                    /* JADX INFO: renamed from: Q1.j$c$a$f$b$b, reason: collision with other inner class name */
                    public static final class RunnableC0234b implements Runnable {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ View f6731q;

                        public RunnableC0234b(View view) {
                            this.f6731q = view;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            View view = this.f6731q;
                            view.setPivotX(view.getWidth() / 2.0f);
                            view.setPivotY(view.getHeight() / 2.0f);
                        }
                    }

                    /* JADX INFO: renamed from: Q1.j$c$a$f$b$c, reason: collision with other inner class name */
                    public static final class RunnableC0235c implements Runnable {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ View f6732q;

                        public RunnableC0235c(View view) {
                            this.f6732q = view;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            View view = this.f6732q;
                            view.setPivotX(ClockCarouselView.f15325D.b(view));
                            view.setPivotY(0.0f);
                        }
                    }

                    b(ViewGroup viewGroup, S1.a aVar, RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
                        this.f6726q = viewGroup;
                        this.f6727r = aVar;
                        this.f6728s = radioGroup;
                        this.f6729t = onCheckedChangeListener;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void e(View view, ViewGroup viewGroup) {
                        ViewParent parent = view.getParent();
                        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view);
                        }
                        viewGroup.addView(view);
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object b(o oVar, p129m8.e eVar) {
                        final View viewB;
                        String str = (String) oVar.a();
                        N1.a aVar = (N1.a) oVar.b();
                        this.f6726q.removeAllViews();
                        int[] iArr = C0233a.f6730a;
                        int i10 = iArr[aVar.ordinal()];
                        if (i10 == 1) {
                            S1.a aVar2 = this.f6727r;
                            Context context = this.f6726q.getContext();
                            n.g(context, "getContext(...)");
                            viewB = aVar2.b(context, str);
                        } else {
                            if (i10 != 2) {
                                throw new m();
                            }
                            viewB = this.f6727r.f(str);
                        }
                        final ViewGroup viewGroup = this.f6726q;
                        viewGroup.post(new Runnable() { // from class: Q1.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                j.c.a.f.b.e(viewB, viewGroup);
                            }
                        });
                        int i11 = iArr[aVar.ordinal()];
                        if (i11 == 1) {
                            this.f6728s.setOnCheckedChangeListener(null);
                            this.f6728s.check(R.id.radio_dynamic);
                            this.f6728s.setOnCheckedChangeListener(this.f6729t);
                            ViewGroup viewGroup2 = this.f6726q;
                            y.a(viewGroup2, new RunnableC0234b(viewGroup2));
                        } else {
                            if (i11 != 2) {
                                throw new m();
                            }
                            this.f6728s.setOnCheckedChangeListener(null);
                            this.f6728s.check(R.id.radio_small);
                            this.f6728s.setOnCheckedChangeListener(this.f6729t);
                            ViewGroup viewGroup3 = this.f6726q;
                            y.a(viewGroup3, new RunnableC0235c(viewGroup3));
                        }
                        return A.f21846a;
                    }
                }

                /* JADX INFO: renamed from: Q1.j$c$a$f$c, reason: collision with other inner class name */
                public static final class C0236c implements InterfaceC0880f {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ InterfaceC0880f f6733q;

                    /* JADX INFO: renamed from: Q1.j$c$a$f$c$a, reason: collision with other inner class name */
                    public static final class C0237a implements InterfaceC0881g {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ InterfaceC0881g f6734q;

                        /* JADX INFO: renamed from: Q1.j$c$a$f$c$a$a, reason: collision with other inner class name */
                        public static final class C0238a extends kotlin.coroutines.jvm.internal.d {

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            /* synthetic */ Object f6735q;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            int f6736r;

                            public C0238a(p129m8.e eVar) {
                                super(eVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.f6735q = obj;
                                this.f6736r |= Integer.MIN_VALUE;
                                return C0237a.this.b(null, this);
                            }
                        }

                        public C0237a(InterfaceC0881g interfaceC0881g) {
                            this.f6734q = interfaceC0881g;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // I8.InterfaceC0881g
                        public final Object b(Object obj, p129m8.e eVar) {
                            C0238a c0238a;
                            if (eVar instanceof C0238a) {
                                c0238a = (C0238a) eVar;
                                int i10 = c0238a.f6736r;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    c0238a.f6736r = i10 - Integer.MIN_VALUE;
                                } else {
                                    c0238a = new C0238a(eVar);
                                }
                            } else {
                                c0238a = new C0238a(eVar);
                            }
                            Object obj2 = c0238a.f6735q;
                            Object objE = p139n8.b.e();
                            int i11 = c0238a.f6736r;
                            if (i11 == 0) {
                                r.b(obj2);
                                InterfaceC0881g interfaceC0881g = this.f6734q;
                                String str = (String) obj;
                                if (str != null) {
                                    c0238a.f6736r = 1;
                                    if (interfaceC0881g.b(str, c0238a) == objE) {
                                        return objE;
                                    }
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

                    public C0236c(InterfaceC0880f interfaceC0880f) {
                        this.f6733q = interfaceC0880f;
                    }

                    @Override // I8.InterfaceC0880f
                    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                        Object objA = this.f6733q.a(new C0237a(interfaceC0881g), eVar);
                        return objA == p139n8.b.e() ? objA : A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(T1.f fVar, ViewGroup viewGroup, S1.a aVar, RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6720r = fVar;
                    this.f6721s = viewGroup;
                    this.f6722t = aVar;
                    this.f6723u = radioGroup;
                    this.f6724v = onCheckedChangeListener;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object u(String str, N1.a aVar, p129m8.e eVar) {
                    return new o(str, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new f(this.f6720r, this.f6721s, this.f6722t, this.f6723u, this.f6724v, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6719q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(new C0236c(this.f6720r.o()), this.f6720r.p(), C0232a.f6725x);
                        b bVar = new b(this.f6721s, this.f6722t, this.f6723u, this.f6724v);
                        this.f6719q = 1;
                        if (interfaceC0880fL.a(bVar, this) == objE) {
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

            static final class g extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6738q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6739r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ SeekBar f6740s;

                /* JADX INFO: renamed from: Q1.j$c$a$g$a, reason: collision with other inner class name */
                static final class C0239a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ SeekBar f6741q;

                    C0239a(SeekBar seekBar) {
                        this.f6741q = seekBar;
                    }

                    public final Object a(int i10, p129m8.e eVar) {
                        this.f6741q.setProgress(i10, true);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).intValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(T1.f fVar, SeekBar seekBar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6739r = fVar;
                    this.f6740s = seekBar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new g(this.f6739r, this.f6740s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6738q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fS = this.f6739r.s();
                        C0239a c0239a = new C0239a(this.f6740s);
                        this.f6738q = 1;
                        if (interfaceC0880fS.a(c0239a, this) == objE) {
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

            static final class h extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6742q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ T1.f f6743r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ SeekBar f6744s;

                /* JADX INFO: renamed from: Q1.j$c$a$h$a, reason: collision with other inner class name */
                static final class C0240a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ SeekBar f6745q;

                    C0240a(SeekBar seekBar) {
                        this.f6745q = seekBar;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        this.f6745q.setEnabled(z9);
                        this.f6745q.setAlpha(z9 ? 1.0f : 0.3f);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(T1.f fVar, SeekBar seekBar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6743r = fVar;
                    this.f6744s = seekBar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new h(this.f6743r, this.f6744s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((h) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6742q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fV = this.f6743r.v();
                        C0240a c0240a = new C0240a(this.f6744s);
                        this.f6742q = 1;
                        if (interfaceC0880fV.a(c0240a, this) == objE) {
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
            a(T1.f fVar, S1.a aVar, P1.b bVar, View view, RadioGroup radioGroup, LinearLayout linearLayout, View view2, InterfaceC1163x interfaceC1163x, ViewGroup viewGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, SeekBar seekBar, p129m8.e eVar) {
                super(2, eVar);
                this.f6683s = fVar;
                this.f6684t = aVar;
                this.f6685u = bVar;
                this.f6686v = view;
                this.f6687w = radioGroup;
                this.f6688x = linearLayout;
                this.f6689y = view2;
                this.f6690z = interfaceC1163x;
                this.f6678A = viewGroup;
                this.f6679B = onCheckedChangeListener;
                this.f6680C = seekBar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f6683s, this.f6684t, this.f6685u, this.f6686v, this.f6687w, this.f6688x, this.f6689y, this.f6690z, this.f6678A, this.f6679B, this.f6680C, eVar);
                aVar.f6682r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f6681q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f6682r;
                AbstractC0816i.d(l9, null, null, new C0224a(this.f6683s, this.f6684t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f6683s, this.f6685u, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0227c(this.f6683s, this.f6686v, this.f6687w, null), 3, null);
                AbstractC0816i.d(l9, null, null, new d(this.f6683s, this.f6688x, this.f6689y, this.f6690z, null), 3, null);
                AbstractC0816i.d(l9, null, null, new e(this.f6683s, this.f6689y, null), 3, null);
                AbstractC0816i.d(l9, null, null, new f(this.f6683s, this.f6678A, this.f6684t, this.f6687w, this.f6679B, null), 3, null);
                AbstractC0816i.d(l9, null, null, new g(this.f6683s, this.f6680C, null), 3, null);
                AbstractC0816i.d(l9, null, null, new h(this.f6683s, this.f6680C, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1163x interfaceC1163x, T1.f fVar, S1.a aVar, P1.b bVar, View view, RadioGroup radioGroup, LinearLayout linearLayout, View view2, ViewGroup viewGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, SeekBar seekBar, p129m8.e eVar) {
            super(2, eVar);
            this.f6669r = interfaceC1163x;
            this.f6670s = fVar;
            this.f6671t = aVar;
            this.f6672u = bVar;
            this.f6673v = view;
            this.f6674w = radioGroup;
            this.f6675x = linearLayout;
            this.f6676y = view2;
            this.f6677z = viewGroup;
            this.f6666A = onCheckedChangeListener;
            this.f6667B = seekBar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f6669r, this.f6670s, this.f6671t, this.f6672u, this.f6673v, this.f6674w, this.f6675x, this.f6676y, this.f6677z, this.f6666A, this.f6667B, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6668q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f6669r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f6670s, this.f6671t, this.f6672u, this.f6673v, this.f6674w, this.f6675x, this.f6676y, interfaceC1163x, this.f6677z, this.f6666A, this.f6667B, null);
                this.f6668q = 1;
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

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(T1.f fVar, RadioGroup radioGroup, int i10) {
        n.h(radioGroup, "<unused var>");
        switch (i10) {
            case R.id.radio_dynamic /* 2131362743 */:
                fVar.y(N1.a.DYNAMIC);
                break;
            case R.id.radio_small /* 2131362744 */:
                fVar.y(N1.a.SMALL);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(S1.a aVar, InterfaceC1163x source, AbstractC1157q.a event) {
        n.h(source, "source");
        n.h(event, "event");
        int i10 = a.f6660a[event.ordinal()];
        if (i10 == 1) {
            aVar.e(source);
        } else {
            if (i10 != 2) {
                return;
            }
            aVar.i(source);
        }
    }

    private final SpannableString f(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(str + "\n" + str2);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.SectionTitleTextStyle), 0, str.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.SectionSubtitleTextStyle), str.length() + 1, str.length() + 1 + str2.length(), 33);
        return spannableString;
    }

    public final void c(View view, final T1.f viewModel, final S1.a clockViewFactory, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(clockViewFactory, "clockViewFactory");
        n.h(lifecycleOwner, "lifecycleOwner");
        if (P2.c.b()) {
            return;
        }
        View viewRequireViewById = view.requireViewById(R.id.clock_host_view);
        n.g(viewRequireViewById, "requireViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewRequireViewById;
        View viewRequireViewById2 = view.requireViewById(R.id.tabs);
        n.g(viewRequireViewById2, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById2;
        P1.b bVar = new P1.b();
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new p023c2.a(12));
        View viewRequireViewById3 = view.requireViewById(R.id.color_options);
        n.g(viewRequireViewById3, "requireViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewRequireViewById3;
        View viewRequireViewById4 = view.requireViewById(R.id.slider);
        n.g(viewRequireViewById4, "requireViewById(...)");
        SeekBar seekBar = (SeekBar) viewRequireViewById4;
        seekBar.setOnSeekBarChangeListener(new b(viewModel, lifecycleOwner));
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() { // from class: Q1.h
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                j.d(viewModel, radioGroup, i10);
            }
        };
        View viewRequireViewById5 = view.requireViewById(R.id.clock_size_radio_button_group);
        n.g(viewRequireViewById5, "requireViewById(...)");
        RadioGroup radioGroup = (RadioGroup) viewRequireViewById5;
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        RadioButton radioButton = (RadioButton) view.requireViewById(R.id.radio_dynamic);
        Context applicationContext = view.getContext().getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        String string = view.getResources().getString(R.string.clock_size_dynamic);
        n.g(string, "getString(...)");
        String string2 = view.getResources().getString(R.string.clock_size_dynamic_description);
        n.g(string2, "getString(...)");
        radioButton.setText(f(applicationContext, string, string2));
        RadioButton radioButton2 = (RadioButton) view.requireViewById(R.id.radio_small);
        Context applicationContext2 = view.getContext().getApplicationContext();
        n.g(applicationContext2, "getApplicationContext(...)");
        String string3 = view.getResources().getString(R.string.clock_size_small);
        n.g(string3, "getString(...)");
        String string4 = view.getResources().getString(R.string.clock_size_small_description);
        n.g(string4, "getString(...)");
        radioButton2.setText(f(applicationContext2, string3, string4));
        View viewRequireViewById6 = view.requireViewById(R.id.color_picker_container);
        n.g(viewRequireViewById6, "requireViewById(...)");
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new c(lifecycleOwner, viewModel, clockViewFactory, bVar, viewRequireViewById6, radioGroup, linearLayout, view, viewGroup, onCheckedChangeListener, seekBar, null), 3, null);
        lifecycleOwner.getLifecycle().a(new InterfaceC1160u() { // from class: Q1.i
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                j.e(clockViewFactory, interfaceC1163x, aVar);
            }
        });
    }
}
