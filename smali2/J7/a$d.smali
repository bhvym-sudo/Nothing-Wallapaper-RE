.class final LJ7/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/a;->c(LF8/L;LU5/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field final synthetic u:LJ7/a;

.field final synthetic v:LU5/a;


# direct methods
.method constructor <init>(LJ7/a;LU5/a;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LJ7/a$d;->u:LJ7/a;

    iput-object p2, p0, LJ7/a$d;->v:LU5/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LJ7/a$d;

    iget-object v0, p0, LJ7/a$d;->u:LJ7/a;

    iget-object p0, p0, LJ7/a$d;->v:LU5/a;

    invoke-direct {p1, v0, p0, p2}, LJ7/a$d;-><init>(LJ7/a;LU5/a;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ7/a$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/a$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/a$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/a$d;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_37

    if-eq v1, v3, :cond_26

    if-ne v1, v2, :cond_1e

    iget-object v0, p0, LJ7/a$d;->r:Ljava/lang/Object;

    check-cast v0, LJ7/a;

    iget-object p0, p0, LJ7/a$d;->q:Ljava/lang/Object;

    check-cast p0, LO8/a;

    :try_start_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_1a
    .catchall {:try_start_17 .. :try_end_1a} :catchall_1b

    goto :goto_66

    :catchall_1b
    move-exception p1

    goto/16 :goto_88

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_26
    iget-object v1, p0, LJ7/a$d;->s:Ljava/lang/Object;

    check-cast v1, LJ7/a;

    iget-object v3, p0, LJ7/a$d;->r:Ljava/lang/Object;

    check-cast v3, LU5/a;

    iget-object v5, p0, LJ7/a$d;->q:Ljava/lang/Object;

    check-cast v5, LO8/a;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_55

    :cond_37
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/a$d;->u:LJ7/a;

    invoke-static {p1}, LJ7/a;->h(LJ7/a;)LO8/a;

    move-result-object p1

    iget-object v1, p0, LJ7/a$d;->v:LU5/a;

    iget-object v5, p0, LJ7/a$d;->u:LJ7/a;

    iput-object p1, p0, LJ7/a$d;->q:Ljava/lang/Object;

    iput-object v1, p0, LJ7/a$d;->r:Ljava/lang/Object;

    iput-object v5, p0, LJ7/a$d;->s:Ljava/lang/Object;

    iput v3, p0, LJ7/a$d;->t:I

    invoke-interface {p1, v4, p0}, LO8/a;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_53

    goto :goto_63

    :cond_53
    move-object v3, v1

    move-object v1, v5

    :goto_55
    :try_start_55
    iput-object p1, p0, LJ7/a$d;->q:Ljava/lang/Object;

    iput-object v1, p0, LJ7/a$d;->r:Ljava/lang/Object;

    iput-object v4, p0, LJ7/a$d;->s:Ljava/lang/Object;

    iput v2, p0, LJ7/a$d;->t:I

    invoke-interface {v3, p0}, LU5/a;->k(Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_61
    .catchall {:try_start_55 .. :try_end_61} :catchall_84

    if-ne p0, v0, :cond_64

    :goto_63
    return-object v0

    :cond_64
    move-object p0, p1

    move-object v0, v1

    :goto_66
    :try_start_66
    invoke-static {v0}, LJ7/a;->k(LJ7/a;)Landroidx/lifecycle/Q;

    move-result-object p1

    invoke-static {v0}, LJ7/a;->i(LJ7/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/lifecycle/Q;->f(Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {v0}, LJ7/a;->k(LJ7/a;)Landroidx/lifecycle/Q;

    move-result-object p1

    invoke-static {v0}, LJ7/a;->j(LJ7/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/Q;->f(Ljava/lang/String;)Ljava/lang/Object;

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_7e
    .catchall {:try_start_66 .. :try_end_7e} :catchall_1b

    invoke-interface {p0, v4}, LO8/a;->b(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_84
    move-exception p0

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_88
    invoke-interface {p0, v4}, LO8/a;->b(Ljava/lang/Object;)V

    throw p1
.end method
