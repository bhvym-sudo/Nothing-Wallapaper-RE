.class public abstract LF8/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm8/i;)LF8/L;
    .registers 4

    new-instance v0, LK8/d;

    sget-object v1, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v1

    if-eqz v1, :cond_b

    goto :goto_15

    :cond_b
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, LF8/A0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-interface {p0, v1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    :goto_15
    invoke-direct {v0, p0}, LK8/d;-><init>(Lm8/i;)V

    return-object v0
.end method

.method public static final b()LF8/L;
    .registers 3

    new-instance v0, LK8/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v2

    invoke-interface {v1, v2}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v1

    invoke-direct {v0, v1}, LK8/d;-><init>(Lm8/i;)V

    return-object v0
.end method

.method public static final c(LF8/L;Ljava/util/concurrent/CancellationException;)V
    .registers 4

    invoke-interface {p0}, LF8/L;->w0()Lm8/i;

    move-result-object v0

    sget-object v1, LF8/x0;->e:LF8/x0$b;

    invoke-interface {v0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    check-cast v0, LF8/x0;

    if-eqz v0, :cond_12

    invoke-interface {v0, p1}, LF8/x0;->f(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-static {p0, p1}, LF8/M;->c(LF8/L;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance v0, LK8/z;

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LK8/z;-><init>(Lm8/i;Lm8/e;)V

    invoke-static {v0, v0, p0}, LL8/b;->b(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_16

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_16
    return-object p0
.end method

.method public static final f(LF8/L;)V
    .registers 1

    invoke-interface {p0}, LF8/L;->w0()Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    return-void
.end method

.method public static final g(LF8/L;)Z
    .registers 2

    invoke-interface {p0}, LF8/L;->w0()Lm8/i;

    move-result-object p0

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    check-cast p0, LF8/x0;

    if-eqz p0, :cond_13

    invoke-interface {p0}, LF8/x0;->a()Z

    move-result p0

    return p0

    :cond_13
    const/4 p0, 0x1

    return p0
.end method

.method public static final h(LF8/L;Lm8/i;)LF8/L;
    .registers 3

    new-instance v0, LK8/d;

    invoke-interface {p0}, LF8/L;->w0()Lm8/i;

    move-result-object p0

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    invoke-direct {v0, p0}, LK8/d;-><init>(Lm8/i;)V

    return-object v0
.end method
