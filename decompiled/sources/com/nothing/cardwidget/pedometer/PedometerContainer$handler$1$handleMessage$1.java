package com.nothing.cardwidget.pedometer;

import F8.L;
import android.os.Bundle;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.pedometer.PedometerContainer$handler$1$handleMessage$1", f = "PedometerContainer.kt", l = {}, m = "invokeSuspend")
final class PedometerContainer$handler$1$handleMessage$1 extends l implements p {
    final /* synthetic */ int $animationType;
    int label;
    final /* synthetic */ PedometerContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PedometerContainer$handler$1$handleMessage$1(PedometerContainer pedometerContainer, int i10, p129m8.e<? super PedometerContainer$handler$1$handleMessage$1> eVar) {
        super(2, eVar);
        this.this$0 = pedometerContainer;
        this.$animationType = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
        return new PedometerContainer$handler$1$handleMessage$1(this.this$0, this.$animationType, eVar);
    }

    @Override // p219v8.p
    public final Object invoke(L l9, p129m8.e<? super A> eVar) {
        return ((PedometerContainer$handler$1$handleMessage$1) create(l9, eVar)).invokeSuspend(A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        p139n8.b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        PedometerContainer pedometerContainer = this.this$0;
        Bundle bundle = new Bundle();
        int i10 = this.$animationType;
        bundle.putString(Constants.KEY_METHOD_NAME, Constants.METHOD_ANIMATION_END);
        bundle.putInt(Constants.KEY_ANIMATION_FLAG, i10);
        pedometerContainer.callRemoteService(bundle);
        return A.f21846a;
    }
}
