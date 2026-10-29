package p226w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.r;
import p129m8.e;
import p139n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class w implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f29634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f29635b;

    static final class a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f29636q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f29638s;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29636q = obj;
            this.f29638s |= Integer.MIN_VALUE;
            return w.this.b(null, null, null, null, null, null, this);
        }
    }

    public w(JSONObject jSONObject, j actionHandler) {
        n.h(actionHandler, "actionHandler");
        this.f29634a = jSONObject;
        this.f29635b = actionHandler;
    }

    @Override // p226w5.o
    public Object a(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        return o.a.a(this, context, view, viewGroup, fVar, aVar, nVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p226w5.o
    public Object b(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i10 = aVar2.f29638s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f29638s = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        a aVar3 = aVar2;
        Object obj = aVar3.f29636q;
        Object objE = b.e();
        int i11 = aVar3.f29638s;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return null;
        }
        r.b(obj);
        if (view == null) {
            return null;
        }
        C5.a aVar4 = new C5.a(this.f29634a, this.f29635b);
        aVar3.f29638s = 1;
        if (aVar4.f(view, viewGroup, fVar, aVar, nVar, aVar3) == objE) {
            return objE;
        }
        return null;
    }
}
