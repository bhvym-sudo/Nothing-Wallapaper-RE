.class public final LJ7/i$H;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;-><init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:LJ7/i;


# direct methods
.method public constructor <init>(Lm8/e;LJ7/i;)V
    .registers 3

    iput-object p2, p0, LJ7/i$H;->t:LJ7/i;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LI8/g;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LJ7/i$H;->s(LI8/g;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/i$H;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_36

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$H;->r:Ljava/lang/Object;

    check-cast p1, LI8/g;

    iget-object v1, p0, LJ7/i$H;->s:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, p0, LJ7/i$H;->t:LJ7/i;

    invoke-virtual {v3}, LJ7/i;->U()LI8/f;

    move-result-object v3

    new-instance v4, LJ7/i$y;

    invoke-direct {v4, v3, v1}, LJ7/i$y;-><init>(LI8/f;Ljava/util/List;)V

    iput v2, p0, LJ7/i$H;->q:I

    invoke-static {p1, v4, p0}, LI8/h;->t(LI8/g;LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_36

    return-object v0

    :cond_36
    :goto_36
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LI8/g;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LJ7/i$H;

    iget-object p0, p0, LJ7/i$H;->t:LJ7/i;

    invoke-direct {v0, p3, p0}, LJ7/i$H;-><init>(Lm8/e;LJ7/i;)V

    iput-object p1, v0, LJ7/i$H;->r:Ljava/lang/Object;

    iput-object p2, v0, LJ7/i$H;->s:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LJ7/i$H;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
