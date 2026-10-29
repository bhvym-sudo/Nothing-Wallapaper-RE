package C5;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;
import p139n8.b;
import p206u5.c;
import p226w5.f;
import p226w5.j;
import p226w5.m;
import p226w5.n;
import p226w5.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p, m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f616u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f617v;

    /* JADX INFO: renamed from: C5.a$a, reason: collision with other inner class name */
    static final class C0031a extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f618q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n f619r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ViewGroup f620s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f621t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f622u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0031a(n nVar, ViewGroup viewGroup, a aVar, int i10, e eVar) {
            super(1, eVar);
            this.f619r = nVar;
            this.f620s = viewGroup;
            this.f621t = aVar;
            this.f622u = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(e eVar) {
            return new C0031a(this.f619r, this.f620s, this.f621t, this.f622u, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.f618q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f619r.e(this.f620s, this.f621t, this.f622u);
            if (!this.f621t.f617v.isEmpty()) {
                this.f619r.g(this.f621t.f617v);
            }
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(e eVar) {
            return ((C0031a) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public a(JSONObject jSONObject, j actionHandler) {
        kotlin.jvm.internal.n.h(actionHandler, "actionHandler");
        this.f612q = jSONObject;
        this.f613r = actionHandler;
        this.f617v = AbstractC1444s.l();
    }

    @Override // p226w5.m
    public void a(String event) {
        kotlin.jvm.internal.n.h(event, "event");
        if (this.f617v.contains(event)) {
            j.a.b(this.f613r, event, null, 2, null);
        }
    }

    @Override // p226w5.m
    public void b() {
        if (this.f615t) {
            j.a.a(this.f613r, "onHostViewStopped", null, 2, null);
        }
    }

    @Override // p226w5.m
    public void c() {
        if (this.f614s) {
            j.a.a(this.f613r, "onHostViewResumed", null, 2, null);
        }
    }

    public Object e(p219v8.l lVar, e eVar) {
        return p.a.a(this, lVar, eVar);
    }

    public Object f(View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        List listL;
        JSONObject jSONObject = this.f612q;
        if (jSONObject != null) {
            this.f614s = jSONObject.has("on_view_resumed");
            this.f615t = this.f612q.has("on_view_stopped");
            this.f616u = this.f612q.has("on_configuration_changed");
            JSONArray jSONArrayA = c.a(this.f612q, "on_config_broadcast_event");
            if (jSONArrayA == null || (listL = p206u5.b.f(jSONArrayA)) == null) {
                listL = AbstractC1444s.l();
            }
            this.f617v = listL;
            int iIntValue = ((Number) c.c(this.f612q, "update_period_minute", kotlin.coroutines.jvm.internal.b.c(-1))).intValue();
            if (!this.f617v.isEmpty() || this.f614s || this.f615t || this.f616u || iIntValue > -1) {
                Object objE = e(new C0031a(nVar, viewGroup, this, iIntValue, null), eVar);
                return objE == b.e() ? objE : A.f21846a;
            }
        }
        return A.f21846a;
    }

    @Override // p226w5.m
    public void onHostConfigChanged(Configuration newConfig) {
        kotlin.jvm.internal.n.h(newConfig, "newConfig");
        if (this.f616u) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("host_new_config", newConfig);
            this.f613r.i("onConfigChanged", bundle);
        }
    }

    @Override // p226w5.m
    public void onHostViewPeriodTimeUp() {
        j.a.a(this.f613r, "onPeriodRefresh", null, 2, null);
    }
}
