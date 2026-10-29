package com.nothing.cardparser;

import F8.L;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.m;
import p079h8.r;
import p139n8.b;
import p219v8.p;
import p226w5.e;

/* JADX INFO: loaded from: classes.dex */
@f(c = "com.nothing.cardparser.CardView$AsyncParseTask$onParserStateChanged$2", f = "CardView.kt", l = {}, m = "invokeSuspend")
final class CardView$AsyncParseTask$onParserStateChanged$2 extends l implements p {
    final /* synthetic */ e.b $parserStatus;
    int label;
    final /* synthetic */ CardView.AsyncParseTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardView$AsyncParseTask$onParserStateChanged$2(e.b bVar, CardView.AsyncParseTask asyncParseTask, p129m8.e<? super CardView$AsyncParseTask$onParserStateChanged$2> eVar) {
        super(2, eVar);
        this.$parserStatus = bVar;
        this.this$0 = asyncParseTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
        return new CardView$AsyncParseTask$onParserStateChanged$2(this.$parserStatus, this.this$0, eVar);
    }

    @Override // p219v8.p
    public final Object invoke(L l9, p129m8.e<? super A> eVar) {
        return ((CardView$AsyncParseTask$onParserStateChanged$2) create(l9, eVar)).invokeSuspend(A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        e.b bVar = this.$parserStatus;
        if (bVar instanceof e.b.C0721b) {
            this.this$0.parserListener.c(((e.b.C0721b) this.$parserStatus).a(), ((e.b.C0721b) this.$parserStatus).b());
        } else {
            if (!(bVar instanceof e.b.a)) {
                throw new m();
            }
            this.this$0.parserListener.b(((e.b.a) this.$parserStatus).a(), ((e.b.a) this.$parserStatus).b());
        }
        return A.f21846a;
    }
}
