package p167q6;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import F8.M;
import F8.T0;
import F8.W;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Toast f25097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f25099c = M.a(C0803b0.c().z(T0.b(null, 1, null)));

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25100q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f25102s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f25103t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f25104u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, int i10, e eVar) {
            super(2, eVar);
            this.f25102s = context;
            this.f25103t = str;
            this.f25104u = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return d.this.new a(this.f25102s, this.f25103t, this.f25104u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f25100q;
            if (i10 == 0) {
                r.b(obj);
                d dVar = d.this;
                Context context = this.f25102s;
                String str = this.f25103t;
                int i11 = this.f25104u;
                this.f25100q = 1;
                if (dVar.e(context, str, i11, this) == objE) {
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

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25105q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f25106r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f25108t;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25106r = obj;
            this.f25108t |= Integer.MIN_VALUE;
            return d.this.e(null, null, 0, this);
        }
    }

    private final void c(Context context, String str, int i10) {
        if (this.f25098b) {
            return;
        }
        AbstractC0816i.d(this.f25099c, null, null, new a(context, str, i10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Context context, String str, int i10, e eVar) {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i11 = bVar.f25108t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f25108t = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f25106r;
        Object objE = p139n8.b.e();
        int i12 = bVar.f25108t;
        if (i12 == 0) {
            r.b(obj);
            b();
            this.f25097a = new Toast(context.getApplicationContext(), null);
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.toast_layout, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.message_text)).setText(str);
            Toast toast = this.f25097a;
            if (toast != null) {
                toast.setDuration(i10);
                toast.setView(viewInflate);
            }
            this.f25098b = true;
            Toast toast2 = this.f25097a;
            if (toast2 != null) {
                toast2.show();
            }
            long j9 = i10 == 1 ? 3500L : 2000L;
            bVar.f25105q = this;
            bVar.f25108t = 1;
            if (W.b(j9, bVar) == objE) {
                return objE;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (d) bVar.f25105q;
            r.b(obj);
        }
        this.f25098b = false;
        this.f25097a = null;
        return A.f21846a;
    }

    public final void b() {
        Toast toast = this.f25097a;
        if (toast != null) {
            toast.cancel();
        }
        this.f25097a = null;
    }

    public final void d(Context context, String text) {
        n.h(context, "context");
        n.h(text, "text");
        c(context, text, 1);
    }
}
