.class public abstract LJ8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LI8/g;Lm8/i;)LI8/g;
    .registers 2

    invoke-static {p0, p1}, LJ8/f;->d(LI8/g;Lm8/i;)LI8/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lm8/i;Ljava/lang/Object;Ljava/lang/Object;Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 7

    invoke-static {p0, p2}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_4
    new-instance v0, LJ8/A;

    invoke-direct {v0, p4, p0}, LJ8/A;-><init>(Lm8/e;Lm8/i;)V

    instance-of v1, p3, Lkotlin/coroutines/jvm/internal/a;

    if-nez v1, :cond_14

    invoke-static {p3, p1, v0}, Ln8/b;->d(Lv8/p;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1f

    :catchall_12
    move-exception p1

    goto :goto_2c

    :cond_14
    const/4 v1, 0x2

    invoke-static {p3, v1}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lv8/p;

    invoke-interface {p3, p1, v0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1f
    .catchall {:try_start_4 .. :try_end_1f} :catchall_12

    :goto_1f
    invoke-static {p0, p2}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2b

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_2b
    return-object p1

    :goto_2c
    invoke-static {p0, p2}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    throw p1
.end method

.method public static synthetic c(Lm8/i;Ljava/lang/Object;Ljava/lang/Object;Lv8/p;Lm8/e;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 7

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_8

    invoke-static {p0}, LK8/K;->g(Lm8/i;)Ljava/lang/Object;

    move-result-object p2

    :cond_8
    invoke-static {p0, p1, p2, p3, p4}, LJ8/f;->b(Lm8/i;Ljava/lang/Object;Ljava/lang/Object;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LI8/g;Lm8/i;)LI8/g;
    .registers 3

    instance-of v0, p0, LJ8/z;

    if-nez v0, :cond_f

    instance-of v0, p0, LJ8/s;

    if-eqz v0, :cond_9

    return-object p0

    :cond_9
    new-instance v0, LJ8/C;

    invoke-direct {v0, p0, p1}, LJ8/C;-><init>(LI8/g;Lm8/i;)V

    return-object v0

    :cond_f
    return-object p0
.end method
