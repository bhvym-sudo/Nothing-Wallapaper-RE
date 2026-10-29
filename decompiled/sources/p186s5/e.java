package p186s5;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.I;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.T0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.nothing.cardhost.k;
import com.nothing.cardhost.m;
import com.nothing.cardservice.BaseShareInfo;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.h;
import p079h8.i;
import p079h8.r;
import p139n8.b;
import p216v5.c;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f27727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LayoutInflater f27728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f27729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f27730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f27731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f27732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f27733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f27734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f27735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ObjectAnimator f27736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ObjectAnimator f27737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC0846x0 f27738m;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27739q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f27741s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f27742t;

        /* JADX INFO: renamed from: s5.e$a$a, reason: collision with other inner class name */
        static final class C0669a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f27743q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ e f27744r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f27745s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f27746t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0669a(e eVar, String str, String str2, p129m8.e eVar2) {
                super(2, eVar2);
                this.f27744r = eVar;
                this.f27745s = str;
                this.f27746t = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0669a(this.f27744r, this.f27745s, this.f27746t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0669a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.e();
                if (this.f27743q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                c cVar = this.f27744r.f27727b;
                if (cVar != null) {
                    return cVar.c(this.f27745s, this.f27746t);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, p129m8.e eVar) {
            super(2, eVar);
            this.f27741s = str;
            this.f27742t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new a(this.f27741s, this.f27742t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f27739q;
            if (i10 == 0) {
                r.b(obj);
                I iB = C0803b0.b();
                C0669a c0669a = new C0669a(e.this, this.f27741s, this.f27742t, null);
                this.f27739q = 1;
                obj = AbstractC0812g.g(iB, c0669a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            Uri uri = (Uri) obj;
            G5.c.f1948a.h("Share", "shareStateView avatar = " + uri);
            Glide.with(e.this.k()).load(uri).apply((BaseRequestOptions<?>) RequestOptions.circleCropTransform()).placeholder(k.f17989b).into(e.this.f27731f);
            return A.f21846a;
        }
    }

    public e(Context context, ViewGroup parent, final int i10, final p216v5.a aVar, c cVar) {
        n.h(context, "context");
        n.h(parent, "parent");
        this.f27726a = context;
        this.f27727b = cVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f27728c = layoutInflaterFrom;
        View viewInflate = layoutInflaterFrom.inflate(m.f17997a, parent, false);
        this.f27729d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(com.nothing.cardhost.l.f17996e);
        this.f27730e = viewFindViewById;
        this.f27731f = (ImageView) viewInflate.findViewById(com.nothing.cardhost.l.f17995d);
        View viewFindViewById2 = viewInflate.findViewById(com.nothing.cardhost.l.f17994c);
        this.f27732g = viewFindViewById2;
        this.f27733h = viewInflate.findViewById(com.nothing.cardhost.l.f17992a);
        this.f27734i = viewInflate.findViewById(com.nothing.cardhost.l.f17993b);
        this.f27735j = i.b(new p219v8.a() { // from class: s5.b
            @Override // p219v8.a
            public final Object invoke() {
                return e.m();
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: s5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.d(aVar, i10, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: s5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.e(aVar, i10, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p216v5.a aVar, int i10, View view) {
        if (aVar != null) {
            aVar.onShareInterAction(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p216v5.a aVar, int i10, View view) {
        if (aVar != null) {
            aVar.onShareInterAction(i10);
        }
    }

    private final void h() {
        ObjectAnimator objectAnimator = this.f27736k;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f27736k;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            this.f27736k = null;
        }
        ObjectAnimator objectAnimator3 = this.f27737l;
        if (objectAnimator3 == null || !objectAnimator3.isRunning()) {
            return;
        }
        ObjectAnimator objectAnimator4 = this.f27737l;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        this.f27737l = null;
    }

    private final L l() {
        return (L) this.f27735j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L m() {
        return M.a(C0803b0.c().n1().z(T0.b(null, 1, null)));
    }

    private final void n(BaseShareInfo baseShareInfo) {
        String creator = baseShareInfo.getCreator();
        if (creator == null) {
            creator = "";
        }
        String receiver = baseShareInfo.getReceiver();
        String str = receiver != null ? receiver : "";
        InterfaceC0846x0 interfaceC0846x0 = this.f27738m;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f27738m = AbstractC0816i.d(l(), null, null, new a(creator, str, null), 3, null);
    }

    private final void o() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27733h, "translationX", 0.0f, 30.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        this.f27736k = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f27734i, "translationX", 0.0f, -30.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        this.f27737l = objectAnimatorOfFloat2;
        ObjectAnimator objectAnimator = this.f27736k;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        ObjectAnimator objectAnimator2 = this.f27737l;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    public final void i() {
        h();
        InterfaceC0846x0 interfaceC0846x0 = this.f27738m;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
    }

    public final View j() {
        View contentView = this.f27729d;
        n.g(contentView, "contentView");
        return contentView;
    }

    public final Context k() {
        return this.f27726a;
    }

    public final void p(BaseShareInfo shareInfo) {
        n.h(shareInfo, "shareInfo");
        G5.c.f1948a.h("Share", "shareStateView updateState loginState = " + shareInfo.getLoginState() + ", state = " + shareInfo.getShareState());
        h();
        int combineLoginState = shareInfo.getCombineLoginState();
        if (combineLoginState == 8) {
            this.f27732g.setVisibility(0);
            this.f27732g.setContentDescription("widget updating");
            this.f27730e.setVisibility(8);
            o();
            return;
        }
        if (combineLoginState == 0) {
            this.f27732g.setVisibility(8);
            this.f27730e.setVisibility(0);
            this.f27731f.setImageResource(k.f17990c);
            this.f27731f.setBackgroundResource(0);
            this.f27731f.setContentDescription("connection lost");
            return;
        }
        int shareState = shareInfo.getShareState();
        if (shareState == 2) {
            this.f27732g.setVisibility(8);
            this.f27730e.setVisibility(0);
            n(shareInfo);
            this.f27731f.setBackgroundResource(k.f17988a);
            this.f27731f.setContentDescription("profile picture");
            return;
        }
        if (shareState != 4) {
            this.f27732g.setVisibility(8);
            this.f27730e.setVisibility(0);
            this.f27731f.setImageResource(k.f17991d);
            this.f27731f.setBackgroundResource(0);
            this.f27731f.setContentDescription("pending");
            return;
        }
        this.f27732g.setVisibility(8);
        this.f27730e.setVisibility(0);
        this.f27731f.setImageResource(k.f17990c);
        this.f27731f.setBackgroundResource(0);
        this.f27731f.setContentDescription("connection lost");
    }
}
