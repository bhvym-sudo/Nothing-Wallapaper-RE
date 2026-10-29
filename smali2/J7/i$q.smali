.class final LJ7/i$q;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;->G0(LC7/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LJ7/i;

.field final synthetic s:LC7/a;

.field final synthetic t:Z


# direct methods
.method constructor <init>(LJ7/i;LC7/a;ZLm8/e;)V
    .registers 5

    iput-object p1, p0, LJ7/i$q;->r:LJ7/i;

    iput-object p2, p0, LJ7/i$q;->s:LC7/a;

    iput-boolean p3, p0, LJ7/i$q;->t:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LJ7/i$q;

    iget-object v0, p0, LJ7/i$q;->r:LJ7/i;

    iget-object v1, p0, LJ7/i$q;->s:LC7/a;

    iget-boolean p0, p0, LJ7/i$q;->t:Z

    invoke-direct {p1, v0, v1, p0, p2}, LJ7/i$q;-><init>(LJ7/i;LC7/a;ZLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ7/i$q;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/i$q;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/i$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/i$q;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/i$q;->q:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_22

    if-eq v1, v4, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    goto :goto_1e

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_65

    :cond_1e
    :goto_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_86

    :cond_22
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$q;->r:LJ7/i;

    invoke-virtual {p1}, LJ7/i;->a0()Z

    move-result p1

    if-eqz p1, :cond_3c

    iget-object p1, p0, LJ7/i$q;->r:LJ7/i;

    iget-object v1, p0, LJ7/i$q;->s:LC7/a;

    iget-boolean v2, p0, LJ7/i$q;->t:Z

    iput v4, p0, LJ7/i$q;->q:I

    invoke-static {p1, v1, v2, p0}, LJ7/i;->y(LJ7/i;LC7/a;ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_86

    goto :goto_85

    :cond_3c
    iget-boolean p1, p0, LJ7/i$q;->t:Z

    if-eqz p1, :cond_65

    iget-object p1, p0, LJ7/i$q;->r:LJ7/i;

    invoke-static {p1}, LJ7/i;->s(LJ7/i;)LB7/a;

    move-result-object p1

    iget-object v1, p0, LJ7/i$q;->r:LJ7/i;

    invoke-static {v1}, LJ7/i;->r(LJ7/i;)LI8/O;

    move-result-object v1

    invoke-interface {v1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v4, "bottom_start"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5a

    const-string v4, "bottom_end"

    :cond_5a
    iput v3, p0, LJ7/i$q;->q:I

    const-string v1, "none"

    invoke-interface {p1, v4, v1, p0}, LB7/a;->c(Ljava/lang/String;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_65

    goto :goto_85

    :cond_65
    :goto_65
    iget-object p1, p0, LJ7/i$q;->r:LJ7/i;

    invoke-static {p1}, LJ7/i;->s(LJ7/i;)LB7/a;

    move-result-object p1

    iget-object v1, p0, LJ7/i$q;->r:LJ7/i;

    invoke-static {v1}, LJ7/i;->r(LJ7/i;)LI8/O;

    move-result-object v1

    invoke-interface {v1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, LJ7/i$q;->s:LC7/a;

    invoke-virtual {v3}, LC7/a;->c()Ljava/lang/String;

    move-result-object v3

    iput v2, p0, LJ7/i$q;->q:I

    invoke-interface {p1, v1, v3, p0}, LB7/a;->c(Ljava/lang/String;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_86

    :goto_85
    return-object v0

    :cond_86
    :goto_86
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
