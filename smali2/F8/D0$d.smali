.class final LF8/D0$d;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/D0;->B()LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field private synthetic u:Ljava/lang/Object;

.field final synthetic v:LF8/D0;


# direct methods
.method constructor <init>(LF8/D0;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LF8/D0$d;->v:LF8/D0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LF8/D0$d;

    iget-object p0, p0, LF8/D0$d;->v:LF8/D0;

    invoke-direct {v0, p0, p2}, LF8/D0$d;-><init>(LF8/D0;Lm8/e;)V

    iput-object p1, v0, LF8/D0$d;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LD8/j;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LF8/D0$d;->s(LD8/j;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF8/D0$d;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2a

    if-eq v1, v3, :cond_26

    if-ne v1, v2, :cond_1e

    iget-object v1, p0, LF8/D0$d;->s:Ljava/lang/Object;

    check-cast v1, LK8/o;

    iget-object v3, p0, LF8/D0$d;->r:Ljava/lang/Object;

    check-cast v3, LK8/n;

    iget-object v4, p0, LF8/D0$d;->u:Ljava/lang/Object;

    check-cast v4, LD8/j;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_81

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_26
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_86

    :cond_2a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LF8/D0$d;->u:Ljava/lang/Object;

    check-cast p1, LD8/j;

    iget-object v1, p0, LF8/D0$d;->v:LF8/D0;

    invoke-virtual {v1}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, LF8/t;

    if-eqz v4, :cond_48

    check-cast v1, LF8/t;

    iget-object v1, v1, LF8/t;->u:LF8/u;

    iput v3, p0, LF8/D0$d;->t:I

    invoke-virtual {p1, v1, p0}, LD8/j;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_86

    goto :goto_80

    :cond_48
    instance-of v3, v1, LF8/t0;

    if-eqz v3, :cond_86

    check-cast v1, LF8/t0;

    invoke-interface {v1}, LF8/t0;->b()LF8/I0;

    move-result-object v1

    if-eqz v1, :cond_86

    invoke-virtual {v1}, LK8/o;->k()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LK8/o;

    move-object v4, v3

    move-object v3, v1

    move-object v1, v4

    move-object v4, p1

    :goto_63
    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_86

    instance-of p1, v1, LF8/t;

    if-eqz p1, :cond_81

    move-object p1, v1

    check-cast p1, LF8/t;

    iget-object p1, p1, LF8/t;->u:LF8/u;

    iput-object v4, p0, LF8/D0$d;->u:Ljava/lang/Object;

    iput-object v3, p0, LF8/D0$d;->r:Ljava/lang/Object;

    iput-object v1, p0, LF8/D0$d;->s:Ljava/lang/Object;

    iput v2, p0, LF8/D0$d;->t:I

    invoke-virtual {v4, p1, p0}, LD8/j;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_81

    :goto_80
    return-object v0

    :cond_81
    :goto_81
    invoke-virtual {v1}, LK8/o;->l()LK8/o;

    move-result-object v1

    goto :goto_63

    :cond_86
    :goto_86
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LD8/j;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LF8/D0$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LF8/D0$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LF8/D0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
