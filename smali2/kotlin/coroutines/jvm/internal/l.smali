.class public abstract Lkotlin/coroutines/jvm/internal/l;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/j;


# instance fields
.field private final arity:I


# direct methods
.method public constructor <init>(ILm8/e;)V
    .registers 3

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    iput p1, p0, Lkotlin/coroutines/jvm/internal/l;->arity:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .registers 1

    iget p0, p0, Lkotlin/coroutines/jvm/internal/l;->arity:I

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/a;->getCompletion()Lm8/e;

    move-result-object v0

    if-nez v0, :cond_10

    invoke-static {p0}, Lkotlin/jvm/internal/F;->h(Lkotlin/jvm/internal/j;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "renderLambdaToString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_10
    invoke-super {p0}, Lkotlin/coroutines/jvm/internal/a;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
