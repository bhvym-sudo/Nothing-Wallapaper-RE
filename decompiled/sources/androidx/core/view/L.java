package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    static final class a extends kotlin.coroutines.jvm.internal.k implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f12201r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f12202s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f12203t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, p129m8.e eVar) {
            super(2, eVar);
            this.f12203t = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f12203t, eVar);
            aVar.f12202s = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.d(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r4.f12201r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                java.lang.Object r1 = r4.f12202s
                D8.j r1 = (D8.j) r1
                p079h8.r.b(r5)
                goto L37
            L22:
                p079h8.r.b(r5)
                java.lang.Object r5 = r4.f12202s
                r1 = r5
                D8.j r1 = (D8.j) r1
                android.view.View r5 = r4.f12203t
                r4.f12202s = r1
                r4.f12201r = r3
                java.lang.Object r5 = r1.c(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f12203t
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                D8.h r5 = androidx.core.view.K.c(r5)
                r3 = 0
                r4.f12202s = r3
                r4.f12201r = r2
                java.lang.Object r4 = r1.d(r5, r4)
                if (r4 != r0) goto L4f
            L4e:
                return r0
            L4f:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.L.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D8.j jVar, p129m8.e eVar) {
            return ((a) create(jVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final D8.h a(View view) {
        return D8.k.b(new a(view, null));
    }
}
