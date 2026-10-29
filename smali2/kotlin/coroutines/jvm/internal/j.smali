.class public abstract Lkotlin/coroutines/jvm/internal/j;
.super Lkotlin/coroutines/jvm/internal/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm8/e;)V
    .registers 2

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Lm8/e;)V

    if-eqz p1, :cond_16

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    sget-object p1, Lm8/j;->q:Lm8/j;

    if-ne p0, p1, :cond_e

    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_16
    return-void
.end method


# virtual methods
.method public getContext()Lm8/i;
    .registers 1

    sget-object p0, Lm8/j;->q:Lm8/j;

    return-object p0
.end method
