.class public abstract Lkotlin/coroutines/jvm/internal/d;
.super Lkotlin/coroutines/jvm/internal/a;
.source "SourceFile"


# instance fields
.field private final _context:Lm8/i;

.field private transient intercepted:Lm8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm8/e;)V
    .registers 3

    if-eqz p1, :cond_7

    .line 3
    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    invoke-direct {p0, p1, v0}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;Lm8/i;)V

    return-void
.end method

.method public constructor <init>(Lm8/e;Lm8/i;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Lm8/e;)V

    .line 2
    iput-object p2, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lm8/i;

    return-void
.end method


# virtual methods
.method public getContext()Lm8/i;
    .registers 1

    iget-object p0, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lm8/i;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final intercepted()Lm8/e;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lm8/e;

    if-nez v0, :cond_1b

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lm8/i;

    move-result-object v0

    sget-object v1, Lm8/f;->l:Lm8/f$b;

    invoke-interface {v0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    check-cast v0, Lm8/f;

    if-eqz v0, :cond_18

    invoke-interface {v0, p0}, Lm8/f;->U(Lm8/e;)Lm8/e;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object v0, p0

    :cond_19
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lm8/e;

    :cond_1b
    return-object v0
.end method

.method protected releaseIntercepted()V
    .registers 4

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lm8/e;

    if-eqz v0, :cond_18

    if-eq v0, p0, :cond_18

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lm8/i;

    move-result-object v1

    sget-object v2, Lm8/f;->l:Lm8/f$b;

    invoke-interface {v1, v2}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v1, Lm8/f;

    invoke-interface {v1, v0}, Lm8/f;->Y(Lm8/e;)V

    :cond_18
    sget-object v0, Lkotlin/coroutines/jvm/internal/c;->q:Lkotlin/coroutines/jvm/internal/c;

    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lm8/e;

    return-void
.end method
