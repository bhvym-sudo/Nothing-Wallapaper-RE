package p226w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.d;
import org.json.JSONObject;
import p079h8.r;
import p129m8.e;
import p139n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f29575a;

    static final class a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f29576q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f29578s;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29576q = obj;
            this.f29578s |= Integer.MIN_VALUE;
            return i.this.b(null, null, null, null, null, null, this);
        }
    }

    public i(JSONObject jSONObject) {
        this.f29575a = jSONObject;
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
            int i10 = aVar2.f29578s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f29578s = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        a aVar3 = aVar2;
        Object obj = aVar3.f29576q;
        Object objE = b.e();
        int i11 = aVar3.f29578s;
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
        A5.a aVar4 = new A5.a(this.f29575a);
        aVar3.f29578s = 1;
        if (aVar4.b(view, viewGroup, fVar, aVar, nVar, aVar3) == objE) {
            return objE;
        }
        return null;
    }
}
