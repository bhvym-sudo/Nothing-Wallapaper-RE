package com.nothing.cardparser;

import F8.L;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p139n8.b;
import p219v8.p;
import p226w5.e;

/* JADX INFO: loaded from: classes.dex */
@f(c = "com.nothing.cardparser.CardView$AsyncParseTask$start$1", f = "CardView.kt", l = {300}, m = "invokeSuspend")
final class CardView$AsyncParseTask$start$1 extends l implements p {
    int label;
    final /* synthetic */ CardView.AsyncParseTask this$0;

    /* JADX INFO: renamed from: com.nothing.cardparser.CardView$AsyncParseTask$start$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.l implements p {
        AnonymousClass1(Object obj) {
            super(2, obj, CardView.AsyncParseTask.class, "onParserStateChanged", "onParserStateChanged(Lcom/nothing/cardparser/parser/CardInfoParser$ParserStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p219v8.p
        public final Object invoke(e.b bVar, p129m8.e<? super A> eVar) {
            return ((CardView.AsyncParseTask) this.receiver).onParserStateChanged(bVar, eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardView$AsyncParseTask$start$1(CardView.AsyncParseTask asyncParseTask, p129m8.e<? super CardView$AsyncParseTask$start$1> eVar) {
        super(2, eVar);
        this.this$0 = asyncParseTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
        return new CardView$AsyncParseTask$start$1(this.this$0, eVar);
    }

    @Override // p219v8.p
    public final Object invoke(L l9, p129m8.e<? super A> eVar) {
        return ((CardView$AsyncParseTask$start$1) create(l9, eVar)).invokeSuspend(A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = b.e();
        int i10 = this.label;
        if (i10 == 0) {
            r.b(obj);
            CardView.AsyncParseTask asyncParseTask = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (asyncParseTask.runParserAsync(anonymousClass1, this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        }
        return A.f21846a;
    }
}
