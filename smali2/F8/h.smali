.class abstract synthetic LF8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm8/i;Lv8/p;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, Lm8/f;->l:Lm8/f$b;

    invoke-interface {p0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v1

    check-cast v1, Lm8/f;

    if-nez v1, :cond_1f

    sget-object v1, LF8/V0;->a:LF8/V0;

    invoke-virtual {v1}, LF8/V0;->b()LF8/h0;

    move-result-object v1

    sget-object v2, LF8/r0;->q:LF8/r0;

    invoke-interface {p0, v1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    invoke-static {v2, p0}, LF8/G;->j(LF8/L;Lm8/i;)Lm8/i;

    move-result-object p0

    goto :goto_42

    :cond_1f
    instance-of v2, v1, LF8/h0;

    const/4 v3, 0x0

    if-eqz v2, :cond_27

    check-cast v1, LF8/h0;

    goto :goto_28

    :cond_27
    move-object v1, v3

    :goto_28
    if-eqz v1, :cond_36

    invoke-virtual {v1}, LF8/h0;->w1()Z

    move-result v2

    if-eqz v2, :cond_31

    move-object v3, v1

    :cond_31
    if-nez v3, :cond_34

    goto :goto_36

    :cond_34
    move-object v1, v3

    goto :goto_3c

    :cond_36
    :goto_36
    sget-object v1, LF8/V0;->a:LF8/V0;

    invoke-virtual {v1}, LF8/V0;->a()LF8/h0;

    move-result-object v1

    :goto_3c
    sget-object v2, LF8/r0;->q:LF8/r0;

    invoke-static {v2, p0}, LF8/G;->j(LF8/L;Lm8/i;)Lm8/i;

    move-result-object p0

    :goto_42
    new-instance v2, LF8/e;

    invoke-direct {v2, p0, v0, v1}, LF8/e;-><init>(Lm8/i;Ljava/lang/Thread;LF8/h0;)V

    sget-object p0, LF8/N;->q:LF8/N;

    invoke-virtual {v2, p0, v2, p1}, LF8/a;->W0(LF8/N;Ljava/lang/Object;Lv8/p;)V

    invoke-virtual {v2}, LF8/e;->Y0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    sget-object p0, Lm8/j;->q:Lm8/j;

    :cond_6
    invoke-static {p0, p1}, LF8/g;->e(Lm8/i;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
