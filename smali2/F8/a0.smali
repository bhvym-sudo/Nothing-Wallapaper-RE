.class public abstract LF8/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/Z;I)V
    .registers 5

    invoke-virtual {p0}, LF8/Z;->d()Lm8/e;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    if-nez v1, :cond_32

    instance-of v2, v0, LK8/h;

    if-eqz v2, :cond_32

    invoke-static {p1}, LF8/a0;->b(I)Z

    move-result p1

    iget v2, p0, LF8/Z;->s:I

    invoke-static {v2}, LF8/a0;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_32

    check-cast v0, LK8/h;

    iget-object p1, v0, LK8/h;->t:LF8/I;

    invoke-virtual {v0}, LK8/h;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {p1, v0}, LK8/i;->d(LF8/I;Lm8/i;)Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-static {p1, v0, p0}, LK8/i;->c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V

    return-void

    :cond_2e
    invoke-static {p0}, LF8/a0;->e(LF8/Z;)V

    return-void

    :cond_32
    invoke-static {p0, v0, v1}, LF8/a0;->d(LF8/Z;Lm8/e;Z)V

    return-void
.end method

.method public static final b(I)Z
    .registers 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_9

    const/4 v1, 0x2

    if-ne p0, v1, :cond_7

    goto :goto_9

    :cond_7
    const/4 p0, 0x0

    return p0

    :cond_9
    :goto_9
    return v0
.end method

.method public static final c(I)Z
    .registers 2

    const/4 v0, 0x2

    if-ne p0, v0, :cond_5

    const/4 p0, 0x1

    return p0

    :cond_5
    const/4 p0, 0x0

    return p0
.end method

.method public static final d(LF8/Z;Lm8/e;Z)V
    .registers 6

    invoke-virtual {p0}, LF8/Z;->h()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LF8/Z;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_15

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    invoke-static {v1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_10
    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1c

    :cond_15
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0, v0}, LF8/Z;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_10

    :goto_1c
    if-eqz p2, :cond_5d

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK8/h;

    iget-object p2, p1, LK8/h;->u:Lm8/e;

    iget-object v0, p1, LK8/h;->w:Ljava/lang/Object;

    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    invoke-static {v1, v0}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LK8/K;->a:LK8/D;

    if-eq v0, v2, :cond_3a

    invoke-static {p2, v1, v0}, LF8/G;->m(Lm8/e;Lm8/i;Ljava/lang/Object;)LF8/a1;

    move-result-object p2

    goto :goto_3b

    :cond_3a
    const/4 p2, 0x0

    :goto_3b
    :try_start_3b
    iget-object p1, p1, LK8/h;->u:Lm8/e;

    invoke-interface {p1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_42
    .catchall {:try_start_3b .. :try_end_42} :catchall_50

    if-eqz p2, :cond_4c

    invoke-virtual {p2}, LF8/a1;->Z0()Z

    move-result p0

    if-eqz p0, :cond_4b

    goto :goto_4c

    :cond_4b
    return-void

    :cond_4c
    :goto_4c
    invoke-static {v1, v0}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    return-void

    :catchall_50
    move-exception p0

    if-eqz p2, :cond_59

    invoke-virtual {p2}, LF8/a1;->Z0()Z

    move-result p1

    if-eqz p1, :cond_5c

    :cond_59
    invoke-static {v1, v0}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_5c
    throw p0

    :cond_5d
    invoke-interface {p1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(LF8/Z;)V
    .registers 4

    sget-object v0, LF8/V0;->a:LF8/V0;

    invoke-virtual {v0}, LF8/V0;->b()LF8/h0;

    move-result-object v0

    invoke-virtual {v0}, LF8/h0;->s1()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0, p0}, LF8/h0;->o1(LF8/Z;)V

    return-void

    :cond_10
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LF8/h0;->q1(Z)V

    :try_start_14
    invoke-virtual {p0}, LF8/Z;->d()Lm8/e;

    move-result-object v2

    invoke-static {p0, v2, v1}, LF8/a0;->d(LF8/Z;Lm8/e;Z)V

    :cond_1b
    invoke-virtual {v0}, LF8/h0;->v1()Z

    move-result v2
    :try_end_1f
    .catchall {:try_start_14 .. :try_end_1f} :catchall_25

    if-nez v2, :cond_1b

    :goto_21
    invoke-virtual {v0, v1}, LF8/h0;->l1(Z)V

    goto :goto_2a

    :catchall_25
    move-exception v2

    :try_start_26
    invoke-virtual {p0, v2}, LF8/Z;->g(Ljava/lang/Throwable;)V
    :try_end_29
    .catchall {:try_start_26 .. :try_end_29} :catchall_2b

    goto :goto_21

    :goto_2a
    return-void

    :catchall_2b
    move-exception p0

    invoke-virtual {v0, v1}, LF8/h0;->l1(Z)V

    throw p0
.end method
