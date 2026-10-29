.class abstract synthetic LF8/B0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/x0;)LF8/y;
    .registers 2

    new-instance v0, LF8/z0;

    invoke-direct {v0, p0}, LF8/z0;-><init>(LF8/x0;)V

    return-object v0
.end method

.method public static synthetic b(LF8/x0;ILjava/lang/Object;)LF8/y;
    .registers 3

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_5

    const/4 p0, 0x0

    :cond_5
    invoke-static {p0}, LF8/A0;->a(LF8/x0;)LF8/y;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LF8/x0;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 3

    invoke-static {p1, p2}, LF8/m0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-interface {p0, p1}, LF8/x0;->f(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final d(Lm8/i;Ljava/util/concurrent/CancellationException;)V
    .registers 3

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    check-cast p0, LF8/x0;

    if-eqz p0, :cond_d

    invoke-interface {p0, p1}, LF8/x0;->f(Ljava/util/concurrent/CancellationException;)V

    :cond_d
    return-void
.end method

.method public static synthetic e(LF8/x0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-static {p0, p1, p2}, LF8/A0;->c(LF8/x0;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(Lm8/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-static {p0, p1}, LF8/A0;->d(Lm8/i;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(LF8/x0;Lm8/e;)Ljava/lang/Object;
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {p0, p1}, LF8/x0;->Q(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_10

    return-object p0

    :cond_10
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final h(LF8/x0;LF8/d0;)LF8/d0;
    .registers 5

    new-instance v0, LF8/f0;

    invoke-direct {v0, p1}, LF8/f0;-><init>(LF8/d0;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, LF8/A0;->m(LF8/x0;ZLF8/C0;ILjava/lang/Object;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(LF8/x0;)V
    .registers 2

    invoke-interface {p0}, LF8/x0;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-interface {p0}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final j(Lm8/i;)V
    .registers 2

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    check-cast p0, LF8/x0;

    if-eqz p0, :cond_d

    invoke-static {p0}, LF8/A0;->i(LF8/x0;)V

    :cond_d
    return-void
.end method

.method public static final k(Lm8/i;)LF8/x0;
    .registers 4

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    check-cast v0, LF8/x0;

    if-eqz v0, :cond_b

    return-object v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final l(LF8/x0;ZLF8/C0;)LF8/d0;
    .registers 5

    instance-of v0, p0, LF8/D0;

    if-eqz v0, :cond_b

    check-cast p0, LF8/D0;

    invoke-virtual {p0, p1, p2}, LF8/D0;->i0(ZLF8/C0;)LF8/d0;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-virtual {p2}, LF8/C0;->v()Z

    move-result v0

    new-instance v1, LF8/B0$a;

    invoke-direct {v1, p2}, LF8/B0$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0, p1, v1}, LF8/x0;->I(ZZLv8/l;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(LF8/x0;ZLF8/C0;ILjava/lang/Object;)LF8/d0;
    .registers 5

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_5

    move p1, p4

    :cond_5
    invoke-static {p0, p1, p2}, LF8/A0;->l(LF8/x0;ZLF8/C0;)LF8/d0;

    move-result-object p0

    return-object p0
.end method
