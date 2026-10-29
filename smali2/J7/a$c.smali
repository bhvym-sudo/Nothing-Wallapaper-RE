.class final LJ7/a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/a;->b(LF8/L;LU5/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Z

.field u:I

.field final synthetic v:LJ7/a;

.field final synthetic w:LU5/a;

.field final synthetic x:Z


# direct methods
.method constructor <init>(LJ7/a;LU5/a;ZLm8/e;)V
    .registers 5

    iput-object p1, p0, LJ7/a$c;->v:LJ7/a;

    iput-object p2, p0, LJ7/a$c;->w:LU5/a;

    iput-boolean p3, p0, LJ7/a$c;->x:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LJ7/a$c;

    iget-object v0, p0, LJ7/a$c;->v:LJ7/a;

    iget-object v1, p0, LJ7/a$c;->w:LU5/a;

    iget-boolean p0, p0, LJ7/a$c;->x:Z

    invoke-direct {p1, v0, v1, p0, p2}, LJ7/a$c;-><init>(LJ7/a;LU5/a;ZLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ7/a$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/a$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/a$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/a$c;->u:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_26

    if-ne v1, v2, :cond_1e

    iget-boolean v0, p0, LJ7/a$c;->t:Z

    iget-object v1, p0, LJ7/a$c;->s:Ljava/lang/Object;

    check-cast v1, LJ7/a;

    iget-object v2, p0, LJ7/a$c;->r:Ljava/lang/Object;

    check-cast v2, LU5/a;

    iget-object p0, p0, LJ7/a$c;->q:Ljava/lang/Object;

    check-cast p0, LO8/a;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4a

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_26
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/a$c;->v:LJ7/a;

    invoke-static {p1}, LJ7/a;->h(LJ7/a;)LO8/a;

    move-result-object p1

    iget-object v1, p0, LJ7/a$c;->w:LU5/a;

    iget-boolean v4, p0, LJ7/a$c;->x:Z

    iget-object v5, p0, LJ7/a$c;->v:LJ7/a;

    iput-object p1, p0, LJ7/a$c;->q:Ljava/lang/Object;

    iput-object v1, p0, LJ7/a$c;->r:Ljava/lang/Object;

    iput-object v5, p0, LJ7/a$c;->s:Ljava/lang/Object;

    iput-boolean v4, p0, LJ7/a$c;->t:Z

    iput v2, p0, LJ7/a$c;->u:I

    invoke-interface {p1, v3, p0}, LO8/a;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_46

    return-object v0

    :cond_46
    move-object p0, p1

    move-object v2, v1

    move v0, v4

    move-object v1, v5

    :goto_4a
    :try_start_4a
    invoke-interface {v2, v0}, LU5/a;->e(Z)V

    invoke-static {v1}, LJ7/a;->k(LJ7/a;)Landroidx/lifecycle/Q;

    move-result-object p1

    invoke-static {v1}, LJ7/a;->j(LJ7/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_5e
    .catchall {:try_start_4a .. :try_end_5e} :catchall_64

    invoke-interface {p0, v3}, LO8/a;->b(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_64
    move-exception p1

    invoke-interface {p0, v3}, LO8/a;->b(Ljava/lang/Object;)V

    throw p1
.end method
