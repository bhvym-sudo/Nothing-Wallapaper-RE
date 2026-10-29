package p226w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f29460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f29461b;

    static final class a extends d {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        int f29463B;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29464q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29465r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29466s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29467t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f29468u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f29469v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f29470w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f29471x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f29472y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f29473z;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29473z = obj;
            this.f29463B |= Integer.MIN_VALUE;
            return c.this.b(null, null, null, null, null, null, this);
        }
    }

    public c(JSONArray jSONArray, j actionHandler) {
        n.h(actionHandler, "actionHandler");
        this.f29460a = jSONArray;
        this.f29461b = actionHandler;
    }

    @Override // p226w5.o
    public Object a(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        return o.a.a(this, context, view, viewGroup, fVar, aVar, nVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0109  */
    /* JADX WARN: Code duplicated, block: B:29:0x0116  */
    /* JADX WARN: Code duplicated, block: B:31:0x0128  */
    /* JADX WARN: Code duplicated, block: B:34:0x014f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01cd -> B:50:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01ee -> B:55:0x01f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p226w5.o
    public java.lang.Object b(android.content.Context r18, android.view.View r19, android.view.ViewGroup r20, p226w5.f r21, p216v5.a r22, p226w5.n r23, p129m8.e r24) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p226w5.c.b(android.content.Context, android.view.View, android.view.ViewGroup, w5.f, v5.a, w5.n, m8.e):java.lang.Object");
    }
}
