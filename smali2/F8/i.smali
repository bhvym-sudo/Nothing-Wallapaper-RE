.class abstract synthetic LF8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/L;Lm8/i;LF8/N;Lv8/p;)LF8/T;
    .registers 5

    invoke-static {p0, p1}, LF8/G;->j(LF8/L;Lm8/i;)Lm8/i;

    move-result-object p0

    invoke-virtual {p2}, LF8/N;->f()Z

    move-result p1

    if-eqz p1, :cond_10

    new-instance p1, LF8/F0;

    invoke-direct {p1, p0, p3}, LF8/F0;-><init>(Lm8/i;Lv8/p;)V

    goto :goto_16

    :cond_10
    new-instance p1, LF8/U;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LF8/U;-><init>(Lm8/i;Z)V

    :goto_16
    invoke-virtual {p1, p2, p1, p3}, LF8/a;->W0(LF8/N;Ljava/lang/Object;Lv8/p;)V

    return-object p1
.end method

.method public static synthetic b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    sget-object p1, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_c

    sget-object p2, LF8/N;->q:LF8/N;

    :cond_c
    invoke-static {p0, p1, p2, p3}, LF8/g;->a(LF8/L;Lm8/i;LF8/N;Lv8/p;)LF8/T;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LF8/L;Lm8/i;LF8/N;Lv8/p;)LF8/x0;
    .registers 5

    invoke-static {p0, p1}, LF8/G;->j(LF8/L;Lm8/i;)Lm8/i;

    move-result-object p0

    invoke-virtual {p2}, LF8/N;->f()Z

    move-result p1

    if-eqz p1, :cond_10

    new-instance p1, LF8/G0;

    invoke-direct {p1, p0, p3}, LF8/G0;-><init>(Lm8/i;Lv8/p;)V

    goto :goto_16

    :cond_10
    new-instance p1, LF8/Q0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LF8/Q0;-><init>(Lm8/i;Z)V

    :goto_16
    invoke-virtual {p1, p2, p1, p3}, LF8/a;->W0(LF8/N;Ljava/lang/Object;Lv8/p;)V

    return-object p1
.end method

.method public static synthetic d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    sget-object p1, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_c

    sget-object p2, LF8/N;->q:LF8/N;

    :cond_c
    invoke-static {p0, p1, p2, p3}, LF8/g;->c(LF8/L;Lm8/i;LF8/N;Lv8/p;)LF8/x0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 6

    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {v0, p0}, LF8/G;->k(Lm8/i;Lm8/i;)Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    if-ne p0, v0, :cond_17

    new-instance v0, LK8/z;

    invoke-direct {v0, p0, p2}, LK8/z;-><init>(Lm8/i;Lm8/e;)V

    invoke-static {v0, v0, p1}, LL8/b;->b(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_4f

    :cond_17
    sget-object v1, Lm8/f;->l:Lm8/f$b;

    invoke-interface {p0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v2

    invoke-interface {v0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_43

    new-instance v0, LF8/a1;

    invoke-direct {v0, p0, p2}, LF8/a1;-><init>(Lm8/i;Lm8/e;)V

    invoke-virtual {v0}, LF8/a;->getContext()Lm8/i;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :try_start_35
    invoke-static {v0, v0, p1}, LL8/b;->b(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_39
    .catchall {:try_start_35 .. :try_end_39} :catchall_3e

    invoke-static {p0, v1}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_4f

    :catchall_3e
    move-exception p1

    invoke-static {p0, v1}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    throw p1

    :cond_43
    new-instance v0, LF8/Y;

    invoke-direct {v0, p0, p2}, LF8/Y;-><init>(Lm8/i;Lm8/e;)V

    invoke-static {p1, v0, v0}, LL8/a;->c(Lv8/p;Ljava/lang/Object;Lm8/e;)V

    invoke-virtual {v0}, LF8/Y;->Z0()Ljava/lang/Object;

    move-result-object p0

    :goto_4f
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_58

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_58
    return-object p0
.end method
