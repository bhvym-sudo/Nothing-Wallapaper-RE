.class public abstract LF8/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/E;ZLm8/i;Lm8/i$b;)Lm8/i;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LF8/G;->e(Lkotlin/jvm/internal/E;ZLm8/i;Lm8/i$b;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm8/i;Lm8/i$b;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, LF8/G;->f(Lm8/i;Lm8/i$b;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLm8/i$b;)Z
    .registers 2

    invoke-static {p0, p1}, LF8/G;->i(ZLm8/i$b;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lm8/i;Lm8/i;Z)Lm8/i;
    .registers 6

    invoke-static {p0}, LF8/G;->h(Lm8/i;)Z

    move-result v0

    invoke-static {p1}, LF8/G;->h(Lm8/i;)Z

    move-result v1

    if-nez v0, :cond_11

    if-nez v1, :cond_11

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0

    :cond_11
    new-instance v0, Lkotlin/jvm/internal/E;

    invoke-direct {v0}, Lkotlin/jvm/internal/E;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p1, Lm8/j;->q:Lm8/j;

    new-instance v2, LF8/E;

    invoke-direct {v2, v0, p2}, LF8/E;-><init>(Lkotlin/jvm/internal/E;Z)V

    invoke-interface {p0, p1, v2}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm8/i;

    if-eqz v1, :cond_36

    iget-object p2, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p2, Lm8/i;

    new-instance v1, LF8/F;

    invoke-direct {v1}, LF8/F;-><init>()V

    invoke-interface {p2, p1, v1}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    :cond_36
    iget-object p1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p1, Lm8/i;

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/E;ZLm8/i;Lm8/i$b;)Lm8/i;
    .registers 4

    invoke-interface {p2, p3}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lm8/i;Lm8/i$b;)Lm8/i;
    .registers 2

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lm8/i;)Ljava/lang/String;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final h(Lm8/i;)Z
    .registers 3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v1, LF8/D;

    invoke-direct {v1}, LF8/D;-><init>()V

    invoke-interface {p0, v0, v1}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final i(ZLm8/i$b;)Z
    .registers 2

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return p0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method public static final j(LF8/L;Lm8/i;)Lm8/i;
    .registers 3

    invoke-interface {p0}, LF8/L;->w0()Lm8/i;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, LF8/G;->d(Lm8/i;Lm8/i;Z)Lm8/i;

    move-result-object p0

    invoke-static {}, LF8/b0;->a()LF8/I;

    move-result-object p1

    if-eq p0, p1, :cond_1f

    sget-object p1, Lm8/f;->l:Lm8/f$b;

    invoke-interface {p0, p1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p1

    if-nez p1, :cond_1f

    invoke-static {}, LF8/b0;->a()LF8/I;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    :cond_1f
    return-object p0
.end method

.method public static final k(Lm8/i;Lm8/i;)Lm8/i;
    .registers 3

    invoke-static {p1}, LF8/G;->h(Lm8/i;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-interface {p0, p1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0

    :cond_b
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, LF8/G;->d(Lm8/i;Lm8/i;Z)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lkotlin/coroutines/jvm/internal/e;)LF8/a1;
    .registers 3

    :cond_0
    instance-of v0, p0, LF8/Y;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return-object v1

    :cond_6
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/e;->getCallerFrame()Lkotlin/coroutines/jvm/internal/e;

    move-result-object p0

    if-nez p0, :cond_d

    return-object v1

    :cond_d
    instance-of v0, p0, LF8/a1;

    if-eqz v0, :cond_0

    check-cast p0, LF8/a1;

    return-object p0
.end method

.method public static final m(Lm8/e;Lm8/i;Ljava/lang/Object;)LF8/a1;
    .registers 5

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    sget-object v0, LF8/b1;->q:LF8/b1;

    invoke-interface {p1, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    if-eqz v0, :cond_1a

    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    invoke-static {p0}, LF8/G;->l(Lkotlin/coroutines/jvm/internal/e;)LF8/a1;

    move-result-object p0

    if-eqz p0, :cond_19

    invoke-virtual {p0, p1, p2}, LF8/a1;->b1(Lm8/i;Ljava/lang/Object;)V

    :cond_19
    return-object p0

    :cond_1a
    return-object v1
.end method
