.class final LJ7/i$w;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;-><init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm8/e;)V
    .registers 3

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LN1/a;

    check-cast p2, LN1/a;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LJ7/i$w;->s(LN1/a;LN1/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LJ7/i$w;->q:I

    if-nez v0, :cond_16

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$w;->r:Ljava/lang/Object;

    check-cast p1, LN1/a;

    iget-object p0, p0, LJ7/i$w;->s:Ljava/lang/Object;

    check-cast p0, LN1/a;

    if-nez p0, :cond_15

    return-object p1

    :cond_15
    return-object p0

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(LN1/a;LN1/a;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance p0, LJ7/i$w;

    invoke-direct {p0, p3}, LJ7/i$w;-><init>(Lm8/e;)V

    iput-object p1, p0, LJ7/i$w;->r:Ljava/lang/Object;

    iput-object p2, p0, LJ7/i$w;->s:Ljava/lang/Object;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/i$w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
