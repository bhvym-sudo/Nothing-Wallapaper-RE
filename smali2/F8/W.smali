.class public abstract LF8/W;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm8/e;)Ljava/lang/Object;
    .registers 5

    instance-of v0, p0, LF8/W$a;

    if-eqz v0, :cond_13

    move-object v0, p0

    check-cast v0, LF8/W$a;

    iget v1, v0, LF8/W$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LF8/W$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LF8/W$a;

    invoke-direct {v0, p0}, LF8/W$a;-><init>(Lm8/e;)V

    :goto_18
    iget-object p0, v0, LF8/W$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LF8/W$a;->r:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-eq v2, v3, :cond_2d

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2d
    invoke-static {p0}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_52

    :cond_31
    invoke-static {p0}, Lh8/r;->b(Ljava/lang/Object;)V

    iput v3, v0, LF8/W$a;->r:I

    new-instance p0, LF8/n;

    invoke-static {v0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v2

    invoke-direct {p0, v2, v3}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {p0}, LF8/n;->G()V

    invoke-virtual {p0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v2

    if-ne p0, v2, :cond_4f

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_4f
    if-ne p0, v1, :cond_52

    return-object v1

    :cond_52
    :goto_52
    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method

.method public static final b(JLm8/e;)Ljava/lang/Object;
    .registers 6

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_9

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9
    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long v1, p0, v1

    if-gez v1, :cond_2a

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    invoke-static {v1}, LF8/W;->c(Lm8/i;)LF8/V;

    move-result-object v1

    invoke-interface {v1, p0, p1, v0}, LF8/V;->T0(JLF8/l;)V

    :cond_2a
    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_37

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_37
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3e

    return-object p0

    :cond_3e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final c(Lm8/i;)LF8/V;
    .registers 2

    sget-object v0, Lm8/f;->l:Lm8/f$b;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    instance-of v0, p0, LF8/V;

    if-eqz v0, :cond_d

    check-cast p0, LF8/V;

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    if-nez p0, :cond_14

    invoke-static {}, LF8/S;->a()LF8/V;

    move-result-object p0

    :cond_14
    return-object p0
.end method
