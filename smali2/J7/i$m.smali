.class final LJ7/i$m;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;->z0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/i$m;->r:LJ7/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LJ7/i$m;

    iget-object p0, p0, LJ7/i$m;->r:LJ7/i;

    invoke-direct {p1, p0, p2}, LJ7/i$m;-><init>(LJ7/i;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ7/i$m;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/i$m;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/i$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/i$m;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/i$m;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_41

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$m;->r:LJ7/i;

    invoke-static {p1}, LJ7/i;->w(LJ7/i;)LI8/z;

    move-result-object p1

    iget-object v1, p0, LJ7/i$m;->r:LJ7/i;

    invoke-virtual {v1}, LJ7/i;->d0()LI8/O;

    move-result-object v1

    invoke-interface {v1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, LJ7/i$m;->r:LJ7/i;

    invoke-virtual {v3}, LJ7/i;->b0()LI8/O;

    move-result-object v3

    invoke-interface {v3}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    iput v2, p0, LJ7/i$m;->q:I

    invoke-interface {p1, v1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_41

    return-object v0

    :cond_41
    :goto_41
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
