package com.nothing.cardwidget.aiwidget;

import F8.L;
import F8.M;
import android.util.Log;
import java.util.function.Supplier;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
@f(c = "com.nothing.cardwidget.aiwidget.AIServiceBinderHelper$CancelAbleBindTask$begin$1", f = "AIServiceBinderHelper.kt", l = {343}, m = "invokeSuspend")
final class AIServiceBinderHelper$CancelAbleBindTask$begin$1 extends l implements p {
    final /* synthetic */ Supplier<A> $task;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AIServiceBinderHelper this$0;
    final /* synthetic */ AIServiceBinderHelper.CancelAbleBindTask this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AIServiceBinderHelper$CancelAbleBindTask$begin$1(AIServiceBinderHelper aIServiceBinderHelper, AIServiceBinderHelper.CancelAbleBindTask cancelAbleBindTask, Supplier<A> supplier, p129m8.e<? super AIServiceBinderHelper$CancelAbleBindTask$begin$1> eVar) {
        super(2, eVar);
        this.this$0 = aIServiceBinderHelper;
        this.this$1 = cancelAbleBindTask;
        this.$task = supplier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
        AIServiceBinderHelper$CancelAbleBindTask$begin$1 aIServiceBinderHelper$CancelAbleBindTask$begin$1 = new AIServiceBinderHelper$CancelAbleBindTask$begin$1(this.this$0, this.this$1, this.$task, eVar);
        aIServiceBinderHelper$CancelAbleBindTask$begin$1.L$0 = obj;
        return aIServiceBinderHelper$CancelAbleBindTask$begin$1;
    }

    @Override // p219v8.p
    public final Object invoke(L l9, p129m8.e<? super A> eVar) {
        return ((AIServiceBinderHelper$CancelAbleBindTask$begin$1) create(l9, eVar)).invokeSuspend(A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        O8.a aVar;
        L l9;
        AIServiceBinderHelper.CancelAbleBindTask cancelAbleBindTask;
        AIServiceBinderHelper aIServiceBinderHelper;
        Supplier<A> supplier;
        Object objE = p139n8.b.e();
        int i10 = this.label;
        if (i10 == 0) {
            r.b(obj);
            L l10 = (L) this.L$0;
            aVar = this.this$0.mutex;
            AIServiceBinderHelper.CancelAbleBindTask cancelAbleBindTask2 = this.this$1;
            AIServiceBinderHelper aIServiceBinderHelper2 = this.this$0;
            Supplier<A> supplier2 = this.$task;
            this.L$0 = l10;
            this.L$1 = aVar;
            this.L$2 = cancelAbleBindTask2;
            this.L$3 = aIServiceBinderHelper2;
            this.L$4 = supplier2;
            this.label = 1;
            if (aVar.c(null, this) == objE) {
                return objE;
            }
            l9 = l10;
            cancelAbleBindTask = cancelAbleBindTask2;
            aIServiceBinderHelper = aIServiceBinderHelper2;
            supplier = supplier2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            supplier = (Supplier) this.L$4;
            aIServiceBinderHelper = (AIServiceBinderHelper) this.L$3;
            cancelAbleBindTask = (AIServiceBinderHelper.CancelAbleBindTask) this.L$2;
            aVar = (O8.a) this.L$1;
            l9 = (L) this.L$0;
            r.b(obj);
        }
        try {
            if (n.j(cancelAbleBindTask.getMarkTime(), aIServiceBinderHelper.taskTimeMark.get()) == 0) {
                M.f(l9);
                supplier.get();
            }
            Log.d("AiServiceBinderHelper", "Bind task run over");
            A a10 = A.f21846a;
            return A.f21846a;
        } finally {
            aVar.b(null);
        }
    }
}
