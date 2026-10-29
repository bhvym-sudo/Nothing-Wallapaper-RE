.class public abstract LH8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LH8/t;Lv8/a;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LH8/r$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LH8/r$a;

    iget v1, v0, LH8/r$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LH8/r$a;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LH8/r$a;

    invoke-direct {v0, p2}, LH8/r$a;-><init>(Lm8/e;)V

    :goto_18
    iget-object p2, v0, LH8/r$a;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LH8/r$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3c

    if-ne v2, v3, :cond_34

    iget-object p0, v0, LH8/r$a;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lv8/a;

    iget-object p0, v0, LH8/r$a;->q:Ljava/lang/Object;

    check-cast p0, LH8/t;

    :try_start_2e
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_31
    .catchall {:try_start_2e .. :try_end_31} :catchall_32

    goto :goto_75

    :catchall_32
    move-exception p0

    goto :goto_7b

    :cond_34
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3c
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p2

    sget-object v2, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p2, v2}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p2

    if-ne p2, p0, :cond_7f

    :try_start_4b
    iput-object p0, v0, LH8/r$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LH8/r$a;->r:Ljava/lang/Object;

    iput v3, v0, LH8/r$a;->t:I

    new-instance p2, LF8/n;

    invoke-static {v0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v2

    invoke-direct {p2, v2, v3}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {p2}, LF8/n;->G()V

    new-instance v2, LH8/r$b;

    invoke-direct {v2, p2}, LH8/r$b;-><init>(LF8/l;)V

    invoke-interface {p0, v2}, LH8/w;->e(Lv8/l;)V

    invoke-virtual {p2}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p0, p2, :cond_72

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V
    :try_end_72
    .catchall {:try_start_4b .. :try_end_72} :catchall_32

    :cond_72
    if-ne p0, v1, :cond_75

    return-object v1

    :cond_75
    :goto_75
    invoke-interface {p1}, Lv8/a;->invoke()Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_7b
    invoke-interface {p1}, Lv8/a;->invoke()Ljava/lang/Object;

    throw p0

    :cond_7f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LF8/L;Lm8/i;ILH8/a;LF8/N;Lv8/l;Lv8/p;)LH8/v;
    .registers 9

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p2, p3, v0, v1, v0}, LH8/j;->b(ILH8/a;Lv8/l;ILjava/lang/Object;)LH8/g;

    move-result-object p2

    invoke-static {p0, p1}, LF8/G;->j(LF8/L;Lm8/i;)Lm8/i;

    move-result-object p0

    new-instance p1, LH8/s;

    invoke-direct {p1, p0, p2}, LH8/s;-><init>(Lm8/i;LH8/g;)V

    if-eqz p5, :cond_14

    invoke-virtual {p1, p5}, LF8/D0;->c1(Lv8/l;)LF8/d0;

    :cond_14
    invoke-virtual {p1, p4, p1, p6}, LF8/a;->W0(LF8/N;Ljava/lang/Object;Lv8/p;)V

    return-object p1
.end method

.method public static final c(LF8/L;Lm8/i;ILv8/p;)LH8/v;
    .registers 11

    sget-object v3, LH8/a;->q:LH8/a;

    sget-object v4, LF8/N;->q:LF8/N;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, LH8/r;->b(LF8/L;Lm8/i;ILH8/a;LF8/N;Lv8/l;Lv8/p;)LH8/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LF8/L;Lm8/i;ILH8/a;LF8/N;Lv8/l;Lv8/p;ILjava/lang/Object;)LH8/v;
    .registers 9

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_6

    sget-object p1, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_b

    const/4 p2, 0x0

    :cond_b
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_11

    sget-object p3, LH8/a;->q:LH8/a;

    :cond_11
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_17

    sget-object p4, LF8/N;->q:LF8/N;

    :cond_17
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_1c

    const/4 p5, 0x0

    :cond_1c
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-static/range {p2 .. p8}, LH8/r;->b(LF8/L;Lm8/i;ILH8/a;LF8/N;Lv8/l;Lv8/p;)LH8/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LF8/L;Lm8/i;ILv8/p;ILjava/lang/Object;)LH8/v;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    sget-object p1, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_b

    const/4 p2, 0x0

    :cond_b
    invoke-static {p0, p1, p2, p3}, LH8/r;->c(LF8/L;Lm8/i;ILv8/p;)LH8/v;

    move-result-object p0

    return-object p0
.end method
