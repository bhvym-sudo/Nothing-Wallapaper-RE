.class public abstract Lg9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg9/d;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LF8/n;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    new-instance v1, Lg9/p$a;

    invoke-direct {v1, p0}, Lg9/p$a;-><init>(Lg9/d;)V

    invoke-interface {v0, v1}, LF8/l;->i(Lv8/l;)V

    new-instance v1, Lg9/p$b;

    invoke-direct {v1, v0}, Lg9/p$b;-><init>(LF8/l;)V

    invoke-interface {p0, v1}, Lg9/d;->g(Lg9/f;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_2a

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_2a
    return-object p0
.end method

.method public static final b(Lg9/d;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LF8/n;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    new-instance v1, Lg9/p$c;

    invoke-direct {v1, p0}, Lg9/p$c;-><init>(Lg9/d;)V

    invoke-interface {v0, v1}, LF8/l;->i(Lv8/l;)V

    new-instance v1, Lg9/p$d;

    invoke-direct {v1, v0}, Lg9/p$d;-><init>(LF8/l;)V

    invoke-interface {p0, v1}, Lg9/d;->g(Lg9/f;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_2a

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_2a
    return-object p0
.end method

.method public static final c(Lg9/d;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LF8/n;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    new-instance v1, Lg9/p$e;

    invoke-direct {v1, p0}, Lg9/p$e;-><init>(Lg9/d;)V

    invoke-interface {v0, v1}, LF8/l;->i(Lv8/l;)V

    new-instance v1, Lg9/p$f;

    invoke-direct {v1, v0}, Lg9/p$f;-><init>(LF8/l;)V

    invoke-interface {p0, v1}, Lg9/d;->g(Lg9/f;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_2a

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_2a
    return-object p0
.end method

.method public static final d(Lg9/d;Lm8/e;)Ljava/lang/Object;
    .registers 3

    const-string v0, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lg9/p;->b(Lg9/d;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;
    .registers 6

    instance-of v0, p1, Lg9/p$g;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, Lg9/p$g;

    iget v1, v0, Lg9/p$g;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lg9/p$g;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, Lg9/p$g;

    invoke-direct {v0, p1}, Lg9/p$g;-><init>(Lm8/e;)V

    :goto_18
    iget-object p1, v0, Lg9/p$g;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lg9/p$g;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_35

    if-eq v2, v3, :cond_2d

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2d
    iget-object p0, v0, Lg9/p$g;->q:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5c

    :cond_35
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Lg9/p$g;->q:Ljava/lang/Object;

    iput v3, v0, Lg9/p$g;->s:I

    invoke-static {}, LF8/b0;->a()LF8/I;

    move-result-object p1

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v2

    new-instance v3, Lg9/p$h;

    invoke-direct {v3, v0, p0}, Lg9/p$h;-><init>(Lm8/e;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v2, v3}, LF8/I;->g1(Lm8/i;Ljava/lang/Runnable;)V

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_59

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_59
    if-ne p0, v1, :cond_5c

    return-object v1

    :cond_5c
    :goto_5c
    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method
