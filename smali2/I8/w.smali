.class abstract synthetic LI8/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/z;)LI8/E;
    .registers 3

    new-instance v0, LI8/B;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LI8/B;-><init>(LI8/E;LF8/x0;)V

    return-object v0
.end method

.method public static final b(LI8/A;)LI8/O;
    .registers 3

    new-instance v0, LI8/C;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LI8/C;-><init>(LI8/O;LF8/x0;)V

    return-object v0
.end method

.method private static final c(LI8/f;I)LI8/J;
    .registers 9

    sget-object v0, LH8/g;->f:LH8/g$a;

    invoke-virtual {v0}, LH8/g$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LB8/h;->f(II)I

    move-result v0

    sub-int/2addr v0, p1

    instance-of v1, p0, LJ8/e;

    if-eqz v1, :cond_3c

    move-object v1, p0

    check-cast v1, LJ8/e;

    invoke-virtual {v1}, LJ8/e;->m()LI8/f;

    move-result-object v2

    if-eqz v2, :cond_3c

    new-instance p0, LI8/J;

    iget v3, v1, LJ8/e;->r:I

    const/4 v4, -0x3

    if-eq v3, v4, :cond_26

    const/4 v4, -0x2

    if-eq v3, v4, :cond_26

    if-eqz v3, :cond_26

    move v0, v3

    goto :goto_34

    :cond_26
    iget-object v4, v1, LJ8/e;->s:LH8/a;

    sget-object v5, LH8/a;->q:LH8/a;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_31

    if-nez v3, :cond_34

    :cond_2f
    move v0, v6

    goto :goto_34

    :cond_31
    if-nez p1, :cond_2f

    const/4 v0, 0x1

    :cond_34
    :goto_34
    iget-object p1, v1, LJ8/e;->s:LH8/a;

    iget-object v1, v1, LJ8/e;->q:Lm8/i;

    invoke-direct {p0, v2, v0, p1, v1}, LI8/J;-><init>(LI8/f;ILH8/a;Lm8/i;)V

    return-object p0

    :cond_3c
    new-instance p1, LI8/J;

    sget-object v1, LH8/a;->q:LH8/a;

    sget-object v2, Lm8/j;->q:Lm8/j;

    invoke-direct {p1, p0, v0, v1, v2}, LI8/J;-><init>(LI8/f;ILH8/a;Lm8/i;)V

    return-object p1
.end method

.method private static final d(LF8/L;Lm8/i;LI8/f;LI8/z;LI8/K;Ljava/lang/Object;)LF8/x0;
    .registers 13

    sget-object v0, LI8/K;->a:LI8/K$a;

    invoke-virtual {v0}, LI8/K$a;->c()LI8/K;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, LF8/N;->q:LF8/N;

    goto :goto_11

    :cond_f
    sget-object v0, LF8/N;->t:LF8/N;

    :goto_11
    new-instance v1, LI8/w$a;

    const/4 v6, 0x0

    move-object v3, p2

    move-object v4, p3

    move-object v2, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, LI8/w$a;-><init>(LI8/K;LI8/f;LI8/z;Ljava/lang/Object;Lm8/e;)V

    invoke-static {p0, p1, v0, v1}, LF8/g;->c(LF8/L;Lm8/i;LF8/N;Lv8/p;)LF8/x0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LF8/L;Lm8/i;LI8/f;LF8/v;)V
    .registers 10

    new-instance v3, LI8/w$b;

    const/4 v0, 0x0

    invoke-direct {v3, p2, p3, v0}, LI8/w$b;-><init>(LI8/f;LF8/v;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public static final f(LI8/f;LF8/L;LI8/K;I)LI8/E;
    .registers 12

    invoke-static {p0, p3}, LI8/w;->c(LI8/f;I)LI8/J;

    move-result-object p0

    iget v0, p0, LI8/J;->b:I

    iget-object v1, p0, LI8/J;->c:LH8/a;

    invoke-static {p3, v0, v1}, LI8/G;->a(IILH8/a;)LI8/z;

    move-result-object v5

    iget-object v3, p0, LI8/J;->d:Lm8/i;

    iget-object v4, p0, LI8/J;->a:LI8/f;

    sget-object v7, LI8/G;->a:LK8/D;

    move-object v2, p1

    move-object v6, p2

    invoke-static/range {v2 .. v7}, LI8/w;->d(LF8/L;Lm8/i;LI8/f;LI8/z;LI8/K;Ljava/lang/Object;)LF8/x0;

    move-result-object p0

    new-instance p1, LI8/B;

    invoke-direct {p1, v5, p0}, LI8/B;-><init>(LI8/E;LF8/x0;)V

    return-object p1
.end method

.method public static final g(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;
    .registers 10

    const/4 v0, 0x1

    invoke-static {p0, v0}, LI8/w;->c(LI8/f;I)LI8/J;

    move-result-object p0

    invoke-static {p3}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v3

    iget-object v1, p0, LI8/J;->d:Lm8/i;

    iget-object v2, p0, LI8/J;->a:LI8/f;

    move-object v0, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LI8/w;->d(LF8/L;Lm8/i;LI8/f;LI8/z;LI8/K;Ljava/lang/Object;)LF8/x0;

    move-result-object p0

    new-instance p1, LI8/C;

    invoke-direct {p1, v3, p0}, LI8/C;-><init>(LI8/O;LF8/x0;)V

    return-object p1
.end method

.method public static final h(LI8/f;LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 5

    const/4 v0, 0x1

    invoke-static {p0, v0}, LI8/w;->c(LI8/f;I)LI8/J;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, LF8/x;->b(LF8/x0;ILjava/lang/Object;)LF8/v;

    move-result-object v0

    iget-object v1, p0, LI8/J;->d:Lm8/i;

    iget-object p0, p0, LI8/J;->a:LI8/f;

    invoke-static {p1, v1, p0, v0}, LI8/w;->e(LF8/L;Lm8/i;LI8/f;LF8/v;)V

    invoke-interface {v0, p2}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
