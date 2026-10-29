package p143o2;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.app.Activity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AbstractC1151k;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p173r2.c;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23409a = new d();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23410q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f23411r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f23412s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ v3.l.a f23413t;

        /* JADX INFO: renamed from: o2.d$a$a, reason: collision with other inner class name */
        static final class C0616a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ v3.l.a f23414q;

            C0616a(v3.l.a aVar) {
                this.f23414q = aVar;
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(String str, e eVar) {
                v3.l.a aVar = this.f23414q;
                Bundle bundle = new Bundle();
                bundle.putString("slot_id", str);
                A a10 = A.f21846a;
                aVar.c(1337, bundle);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, InterfaceC1163x interfaceC1163x, v3.l.a aVar, e eVar) {
            super(2, eVar);
            this.f23411r = cVar;
            this.f23412s = interfaceC1163x;
            this.f23413t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f23411r, this.f23412s, this.f23413t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f23410q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fA = AbstractC1151k.a(this.f23411r.w(), this.f23412s.getLifecycle(), AbstractC1157q.b.STARTED);
                C0616a c0616a = new C0616a(this.f23413t);
                this.f23410q = 1;
                if (interfaceC0880fA.a(c0616a, this) == objE) {
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

    private d() {
    }

    public static final void b(final Activity activity, CardView previewView, c viewModel, InterfaceC1163x lifecycleOwner, boolean z9) {
        n.h(activity, "activity");
        n.h(previewView, "previewView");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        v3.l.a aVarN = p214v3.l.n(activity, previewView, viewModel.u(), lifecycleOwner, false, false, false, z9, true, new p219v8.a() { // from class: o2.c
            @Override // p219v8.a
            public final Object invoke() {
                return d.c(activity);
            }
        }, null, false, 3184, null);
        previewView.setContentDescription(previewView.getContext().getString(R.string.lockscreen_wallpaper_preview_card_content_description));
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(viewModel, lifecycleOwner, aVarN, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A c(Activity activity) {
        activity.recreate();
        return A.f21846a;
    }
}
