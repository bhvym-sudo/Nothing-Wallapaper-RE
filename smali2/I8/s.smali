.class abstract synthetic LI8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/f;Lv8/q;)LI8/f;
    .registers 3

    new-instance v0, LI8/s$a;

    invoke-direct {v0, p0, p1}, LI8/s$a;-><init>(LI8/f;Lv8/q;)V

    return-object v0
.end method

.method public static final b(LI8/f;LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/s$b;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/s$b;

    iget v1, v0, LI8/s$b;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/s$b;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/s$b;

    invoke-direct {v0, p2}, LI8/s$b;-><init>(Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/s$b;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/s$b;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_37

    if-ne v2, v3, :cond_2f

    iget-object p0, v0, LI8/s$b;->q:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/E;

    :try_start_29
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_2c
    .catchall {:try_start_29 .. :try_end_2c} :catchall_2d

    goto :goto_4f

    :catchall_2d
    move-exception p1

    goto :goto_53

    :cond_2f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_37
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/E;

    invoke-direct {p2}, Lkotlin/jvm/internal/E;-><init>()V

    :try_start_3f
    new-instance v2, LI8/s$c;

    invoke-direct {v2, p1, p2}, LI8/s$c;-><init>(LI8/g;Lkotlin/jvm/internal/E;)V

    iput-object p2, v0, LI8/s$b;->q:Ljava/lang/Object;

    iput v3, v0, LI8/s$b;->s:I

    invoke-interface {p0, v2, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4c
    .catchall {:try_start_3f .. :try_end_4c} :catchall_51

    if-ne p0, v1, :cond_4f

    return-object v1

    :cond_4f
    :goto_4f
    const/4 p0, 0x0

    return-object p0

    :catchall_51
    move-exception p1

    move-object p0, p2

    :goto_53
    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1, p0}, LI8/s;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_76

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p2

    invoke-static {p1, p2}, LI8/s;->c(Ljava/lang/Throwable;Lm8/i;)Z

    move-result p2

    if-nez p2, :cond_76

    if-nez p0, :cond_6a

    return-object p1

    :cond_6a
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_72

    invoke-static {p0, p1}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p0

    :cond_72
    invoke-static {p1, p0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_76
    throw p1
.end method

.method private static final c(Ljava/lang/Throwable;Lm8/i;)Z
    .registers 3

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p1, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p1

    check-cast p1, LF8/x0;

    if-eqz p1, :cond_1a

    invoke-interface {p1}, LF8/x0;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_1a

    :cond_11
    invoke-interface {p1}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p0, p1}, LI8/s;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p0

    return p0

    :cond_1a
    :goto_1a
    const/4 p0, 0x0

    return p0
.end method

.method private static final d(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z
    .registers 2

    if-eqz p1, :cond_a

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method
