package com.nothing.cardparser;

import F8.L;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
@f(c = "com.nothing.cardparser.CardView$AsyncParseTask$runParserAsync$3$1", f = "CardView.kt", l = {}, m = "invokeSuspend")
final class CardView$AsyncParseTask$runParserAsync$3$1 extends l implements p {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ CardView.AsyncParseTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardView$AsyncParseTask$runParserAsync$3$1(CardView.AsyncParseTask asyncParseTask, Throwable th, e<? super CardView$AsyncParseTask$runParserAsync$3$1> eVar) {
        super(2, eVar);
        this.this$0 = asyncParseTask;
        this.$it = th;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e<A> create(Object obj, e<?> eVar) {
        return new CardView$AsyncParseTask$runParserAsync$3$1(this.this$0, this.$it, eVar);
    }

    @Override // p219v8.p
    public final Object invoke(L l9, e<? super A> eVar) {
        return ((CardView$AsyncParseTask$runParserAsync$3$1) create(l9, eVar)).invokeSuspend(A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        this.this$0.parserListener.a(this.$it);
        return A.f21846a;
    }
}
