package com.nothing.cardparser;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
@f(c = "com.nothing.cardparser.CardView$AsyncParseTask", f = "CardView.kt", l = {256, 265}, m = "runParserAsync")
final class CardView$AsyncParseTask$runParserAsync$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CardView.AsyncParseTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardView$AsyncParseTask$runParserAsync$1(CardView.AsyncParseTask asyncParseTask, e<? super CardView$AsyncParseTask$runParserAsync$1> eVar) {
        super(eVar);
        this.this$0 = asyncParseTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runParserAsync(null, this);
    }
}
