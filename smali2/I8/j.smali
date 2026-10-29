.class abstract synthetic LI8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LI8/g;LH8/v;ZLm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/j;->c(LI8/g;LH8/v;ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LI8/g;LH8/v;Lm8/e;)Ljava/lang/Object;
    .registers 4

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p2}, LI8/j;->c(LI8/g;LH8/v;ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_c

    return-object p0

    :cond_c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final c(LI8/g;LH8/v;ZLm8/e;)Ljava/lang/Object;
    .registers 10

    instance-of v0, p3, LI8/j$a;

    if-eqz v0, :cond_13

    move-object v0, p3

    check-cast v0, LI8/j$a;

    iget v1, v0, LI8/j$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/j$a;->v:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/j$a;

    invoke-direct {v0, p3}, LI8/j$a;-><init>(Lm8/e;)V

    :goto_18
    iget-object p3, v0, LI8/j$a;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/j$a;->v:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_58

    if-eq v2, v4, :cond_46

    if-ne v2, v3, :cond_3e

    iget-boolean p2, v0, LI8/j$a;->t:Z

    iget-object p0, v0, LI8/j$a;->s:Ljava/lang/Object;

    check-cast p0, LH8/i;

    iget-object p1, v0, LI8/j$a;->r:Ljava/lang/Object;

    check-cast p1, LH8/v;

    iget-object v2, v0, LI8/j$a;->q:Ljava/lang/Object;

    check-cast v2, LI8/g;

    :try_start_36
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_39
    .catchall {:try_start_36 .. :try_end_39} :catchall_3c

    :cond_39
    move-object p3, p0

    move-object p0, v2

    goto :goto_62

    :catchall_3c
    move-exception p0

    goto :goto_9d

    :cond_3e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_46
    iget-boolean p2, v0, LI8/j$a;->t:Z

    iget-object p0, v0, LI8/j$a;->s:Ljava/lang/Object;

    check-cast p0, LH8/i;

    iget-object p1, v0, LI8/j$a;->r:Ljava/lang/Object;

    check-cast p1, LH8/v;

    iget-object v2, v0, LI8/j$a;->q:Ljava/lang/Object;

    check-cast v2, LI8/g;

    :try_start_54
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_57
    .catchall {:try_start_54 .. :try_end_57} :catchall_3c

    goto :goto_77

    :cond_58
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {p0}, LI8/h;->v(LI8/g;)V

    :try_start_5e
    invoke-interface {p1}, LH8/v;->iterator()LH8/i;

    move-result-object p3

    :goto_62
    iput-object p0, v0, LI8/j$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LI8/j$a;->r:Ljava/lang/Object;

    iput-object p3, v0, LI8/j$a;->s:Ljava/lang/Object;

    iput-boolean p2, v0, LI8/j$a;->t:Z

    iput v4, v0, LI8/j$a;->v:I

    invoke-interface {p3, v0}, LH8/i;->a(Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_73

    goto :goto_93

    :cond_73
    move-object v5, v2

    move-object v2, p0

    move-object p0, p3

    move-object p3, v5

    :goto_77
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_94

    invoke-interface {p0}, LH8/i;->next()Ljava/lang/Object;

    move-result-object p3

    iput-object v2, v0, LI8/j$a;->q:Ljava/lang/Object;

    iput-object p1, v0, LI8/j$a;->r:Ljava/lang/Object;

    iput-object p0, v0, LI8/j$a;->s:Ljava/lang/Object;

    iput-boolean p2, v0, LI8/j$a;->t:Z

    iput v3, v0, LI8/j$a;->v:I

    invoke-interface {v2, p3, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p3
    :try_end_91
    .catchall {:try_start_5e .. :try_end_91} :catchall_3c

    if-ne p3, v1, :cond_39

    :goto_93
    return-object v1

    :cond_94
    if-eqz p2, :cond_9a

    const/4 p0, 0x0

    invoke-static {p1, p0}, LH8/m;->a(LH8/v;Ljava/lang/Throwable;)V

    :cond_9a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_9d
    :try_start_9d
    throw p0
    :try_end_9e
    .catchall {:try_start_9d .. :try_end_9e} :catchall_9e

    :catchall_9e
    move-exception p3

    if-eqz p2, :cond_a4

    invoke-static {p1, p0}, LH8/m;->a(LH8/v;Ljava/lang/Throwable;)V

    :cond_a4
    throw p3
.end method
