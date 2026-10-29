package A5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONObject;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p206u5.c;
import p226w5.f;
import p226w5.n;
import p226w5.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f225q;

    /* JADX INFO: renamed from: A5.a$a, reason: collision with other inner class name */
    static final class C0010a extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f226q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n f227r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Bundle f228s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0010a(n nVar, Bundle bundle, e eVar) {
            super(1, eVar);
            this.f227r = nVar;
            this.f228s = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(e eVar) {
            return new C0010a(this.f227r, this.f228s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.f226q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f227r.f(this.f228s);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(e eVar) {
            return ((C0010a) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public a(JSONObject jSONObject) {
        this.f225q = jSONObject;
    }

    public Object a(p219v8.l lVar, e eVar) {
        return p.a.a(this, lVar, eVar);
    }

    public Object b(View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        Object objA;
        JSONObject jSONObject = this.f225q;
        Bundle bundleA = new B5.b(jSONObject != null ? c.b(jSONObject, "bundle") : null).a();
        return (bundleA == null || (objA = a(new C0010a(nVar, bundleA, null), eVar)) != b.e()) ? A.f21846a : objA;
    }
}
