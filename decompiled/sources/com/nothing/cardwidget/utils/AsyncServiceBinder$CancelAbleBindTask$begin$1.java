package com.nothing.cardwidget.utils;

import F8.L;
import F8.M;
import android.util.Log;
import java.util.function.Supplier;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
@f(c = "com.nothing.cardwidget.utils.AsyncServiceBinder$CancelAbleBindTask$begin$1", f = "AsyncServiceBinder.kt", l = {}, m = "invokeSuspend")
final class AsyncServiceBinder$CancelAbleBindTask$begin$1 extends l implements p {
    final /* synthetic */ Supplier<A> $task;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AsyncServiceBinder.CancelAbleBindTask this$0;
    final /* synthetic */ AsyncServiceBinder this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncServiceBinder$CancelAbleBindTask$begin$1(AsyncServiceBinder.CancelAbleBindTask cancelAbleBindTask, AsyncServiceBinder asyncServiceBinder, Supplier<A> supplier, e<? super AsyncServiceBinder$CancelAbleBindTask$begin$1> eVar) {
        super(2, eVar);
        this.this$0 = cancelAbleBindTask;
        this.this$1 = asyncServiceBinder;
        this.$task = supplier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e<A> create(Object obj, e<?> eVar) {
        AsyncServiceBinder$CancelAbleBindTask$begin$1 asyncServiceBinder$CancelAbleBindTask$begin$1 = new AsyncServiceBinder$CancelAbleBindTask$begin$1(this.this$0, this.this$1, this.$task, eVar);
        asyncServiceBinder$CancelAbleBindTask$begin$1.L$0 = obj;
        return asyncServiceBinder$CancelAbleBindTask$begin$1;
    }

    @Override // p219v8.p
    public final Object invoke(L l9, e<? super A> eVar) {
        return ((AsyncServiceBinder$CancelAbleBindTask$begin$1) create(l9, eVar)).invokeSuspend(A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        p139n8.b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        L l9 = (L) this.L$0;
        Object obj2 = AsyncServiceBinder.TASK_LOCK;
        AsyncServiceBinder.CancelAbleBindTask cancelAbleBindTask = this.this$0;
        AsyncServiceBinder asyncServiceBinder = this.this$1;
        Supplier<A> supplier = this.$task;
        synchronized (obj2) {
            if (cancelAbleBindTask.getMarkTime() >= asyncServiceBinder.taskTimeMark.get()) {
                M.f(l9);
                supplier.get();
                Log.d("AsyncServiceBinder", "Bind task run over, task = " + supplier);
            }
        }
        return A.f21846a;
    }
}
