package p226w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f29562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f29563b;

    static final class a extends d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        int f29564A;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29565q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29566r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29567s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29568t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29569u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29570v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29571w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f29572x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f29573y;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29573y = obj;
            this.f29564A |= Integer.MIN_VALUE;
            return h.this.b(null, null, null, null, null, null, this);
        }
    }

    public h(JSONArray jSONArray, j actionResponsive) {
        n.h(actionResponsive, "actionResponsive");
        this.f29562a = jSONArray;
        this.f29563b = actionResponsive;
    }

    @Override // p226w5.o
    public Object a(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        return o.a.a(this, context, view, viewGroup, fVar, aVar, nVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd A[LOOP:0: B:19:0x0077->B:28:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bf -> B:27:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p226w5.o
    public java.lang.Object b(android.content.Context r14, android.view.View r15, android.view.ViewGroup r16, p226w5.f r17, p216v5.a r18, p226w5.n r19, p129m8.e r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p226w5.h.b(android.content.Context, android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
    }
}
