.class final Lj7/j$h$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lj7/j;


# direct methods
.method constructor <init>(Lj7/j;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lj7/j$h$b;

    iget-object p0, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-direct {p1, p0, p2}, Lj7/j$h$b;-><init>(Lj7/j;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$h$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$h$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$h$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$h$b;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1b

    if-eq v1, v3, :cond_17

    if-ne v1, v2, :cond_f

    goto :goto_17

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    :goto_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_86

    :cond_1b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->J(Lj7/j;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_5f

    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->K(Lj7/j;)Z

    move-result p1

    if-eqz p1, :cond_5f

    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->B(Lj7/j;)LD6/g;

    move-result-object p1

    if-eqz p1, :cond_5f

    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object p1

    const-string v2, "listen effect dataSource."

    invoke-virtual {p1, v2}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->B(Lj7/j;)LD6/g;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1}, LD6/g;->N()LI8/f;

    move-result-object p1

    new-instance v2, Lj7/j$h$b$a;

    iget-object v4, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-direct {v2, v4, v1}, Lj7/j$h$b$a;-><init>(Lj7/j;Lm8/e;)V

    iput v3, p0, Lj7/j$h$b;->q:I

    invoke-static {p1, v2, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_86

    goto :goto_85

    :cond_5f
    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object p1

    const-string v3, "listen origin dataSource."

    invoke-virtual {p1, v3}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->z(Lj7/j;)LD6/f;

    move-result-object p1

    check-cast p1, LD6/e;

    invoke-interface {p1}, LD6/e;->t()LI8/f;

    move-result-object p1

    new-instance v3, Lj7/j$h$b$b;

    iget-object v4, p0, Lj7/j$h$b;->r:Lj7/j;

    invoke-direct {v3, v4, v1}, Lj7/j$h$b$b;-><init>(Lj7/j;Lm8/e;)V

    iput v2, p0, Lj7/j$h$b;->q:I

    invoke-static {p1, v3, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_86

    :goto_85
    return-object v0

    :cond_86
    :goto_86
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
