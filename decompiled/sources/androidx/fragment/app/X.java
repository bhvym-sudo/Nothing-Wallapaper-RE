package androidx.fragment.app;

import androidx.lifecycle.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f13045r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f13045r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.d0.c invoke() {
            return this.f13045r.getDefaultViewModelProviderFactory();
        }
    }

    public static final p079h8.h b(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, C8.c cVar, p219v8.a aVar, p219v8.a aVar2, p219v8.a aVar3) {
        if (aVar3 == null) {
            aVar3 = new a(abstractComponentCallbacksC1132q);
        }
        return new androidx.lifecycle.c0(cVar, aVar, aVar3, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 c(p079h8.h hVar) {
        return (f0) hVar.getValue();
    }
}
