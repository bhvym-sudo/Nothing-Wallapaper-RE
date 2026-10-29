.class abstract synthetic LI8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/f;ILH8/a;)LI8/f;
    .registers 10

    const/4 v0, -0x1

    if-gez p1, :cond_24

    const/4 v1, -0x2

    if-eq p1, v1, :cond_24

    if-ne p1, v0, :cond_9

    goto :goto_24

    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_24
    :goto_24
    if-ne p1, v0, :cond_33

    sget-object v1, LH8/a;->q:LH8/a;

    if-ne p2, v1, :cond_2b

    goto :goto_33

    :cond_2b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_33
    :goto_33
    if-ne p1, v0, :cond_38

    sget-object p2, LH8/a;->r:LH8/a;

    const/4 p1, 0x0

    :cond_38
    move v2, p1

    move-object v3, p2

    instance-of p1, p0, LJ8/q;

    if-eqz p1, :cond_49

    move-object v0, p0

    check-cast v0, LJ8/q;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LJ8/q$a;->a(LJ8/q;Lm8/i;ILH8/a;ILjava/lang/Object;)LI8/f;

    move-result-object p0

    return-object p0

    :cond_49
    new-instance v0, LJ8/h;

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v4, v3

    move v3, v2

    const/4 v2, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LJ8/h;-><init>(LI8/f;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public static synthetic b(LI8/f;ILH8/a;ILjava/lang/Object;)LI8/f;
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_5

    const/4 p1, -0x2

    :cond_5
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_b

    sget-object p2, LH8/a;->q:LH8/a;

    :cond_b
    invoke-static {p0, p1, p2}, LI8/h;->c(LI8/f;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lm8/i;)V
    .registers 3

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Flow context cannot contain job in it. Had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d(LI8/f;)LI8/f;
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, -0x1

    invoke-static {p0, v2, v0, v1, v0}, LI8/h;->d(LI8/f;ILH8/a;ILjava/lang/Object;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LI8/f;Lm8/i;)LI8/f;
    .registers 9

    invoke-static {p1}, LI8/l;->c(Lm8/i;)V

    sget-object v0, Lm8/j;->q:Lm8/j;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    return-object p0

    :cond_c
    instance-of v0, p0, LJ8/q;

    if-eqz v0, :cond_1d

    move-object v1, p0

    check-cast v1, LJ8/q;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LJ8/q$a;->a(LJ8/q;Lm8/i;ILH8/a;ILjava/lang/Object;)LI8/f;

    move-result-object p0

    return-object p0

    :cond_1d
    move-object v2, p1

    new-instance v0, LJ8/h;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LJ8/h;-><init>(LI8/f;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method
