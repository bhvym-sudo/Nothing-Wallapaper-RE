.class abstract synthetic LI8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LI8/g;Lv8/q;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/r;->c(LI8/g;Lv8/q;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LI8/g;)V
    .registers 2

    instance-of v0, p0, LI8/T;

    if-nez v0, :cond_5

    return-void

    :cond_5
    check-cast p0, LI8/T;

    iget-object p0, p0, LI8/T;->q:Ljava/lang/Throwable;

    throw p0
.end method

.method private static final c(LI8/g;Lv8/q;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p3, LI8/r$a;

    if-eqz v0, :cond_13

    move-object v0, p3

    check-cast v0, LI8/r$a;

    iget v1, v0, LI8/r$a;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/r$a;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/r$a;

    invoke-direct {v0, p3}, LI8/r$a;-><init>(Lm8/e;)V

    :goto_18
    iget-object p3, v0, LI8/r$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/r$a;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_38

    if-ne v2, v3, :cond_30

    iget-object p0, v0, LI8/r$a;->q:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/Throwable;

    :try_start_2a
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_2d
    .catchall {:try_start_2a .. :try_end_2d} :catchall_2e

    goto :goto_46

    :catchall_2e
    move-exception p0

    goto :goto_49

    :cond_30
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_38
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_3b
    iput-object p2, v0, LI8/r$a;->q:Ljava/lang/Object;

    iput v3, v0, LI8/r$a;->s:I

    invoke-interface {p1, p0, p2, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_43
    .catchall {:try_start_3b .. :try_end_43} :catchall_2e

    if-ne p0, v1, :cond_46

    return-object v1

    :cond_46
    :goto_46
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_49
    if-eqz p2, :cond_50

    if-eq p2, p0, :cond_50

    invoke-static {p0, p2}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_50
    throw p0
.end method

.method public static final d(LI8/f;Lv8/q;)LI8/f;
    .registers 3

    new-instance v0, LI8/r$b;

    invoke-direct {v0, p0, p1}, LI8/r$b;-><init>(LI8/f;Lv8/q;)V

    return-object v0
.end method

.method public static final e(LI8/f;Lv8/p;)LI8/f;
    .registers 3

    new-instance v0, LI8/r$c;

    invoke-direct {v0, p1, p0}, LI8/r$c;-><init>(Lv8/p;LI8/f;)V

    return-object v0
.end method
