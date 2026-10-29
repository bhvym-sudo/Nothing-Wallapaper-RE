.class abstract synthetic LI8/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/f;Lm8/e;)Ljava/lang/Object;
    .registers 6

    instance-of v0, p1, LI8/v$c;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LI8/v$c;

    iget v1, v0, LI8/v$c;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/v$c;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/v$c;

    invoke-direct {v0, p1}, LI8/v$c;-><init>(Lm8/e;)V

    :goto_18
    iget-object p1, v0, LI8/v$c;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/v$c;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v3, :cond_33

    iget-object p0, v0, LI8/v$c;->r:Ljava/lang/Object;

    check-cast p0, LI8/v$a;

    iget-object v1, v0, LI8/v$c;->q:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/E;

    :try_start_2d
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_30
    .catch LJ8/a; {:try_start_2d .. :try_end_30} :catch_31

    goto :goto_69

    :catch_31
    move-exception p1

    goto :goto_5f

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/E;

    invoke-direct {p1}, Lkotlin/jvm/internal/E;-><init>()V

    sget-object v2, LJ8/t;->a:LK8/D;

    iput-object v2, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    new-instance v2, LI8/v$a;

    invoke-direct {v2, p1}, LI8/v$a;-><init>(Lkotlin/jvm/internal/E;)V

    :try_start_4c
    iput-object p1, v0, LI8/v$c;->q:Ljava/lang/Object;

    iput-object v2, v0, LI8/v$c;->r:Ljava/lang/Object;

    iput v3, v0, LI8/v$c;->t:I

    invoke-interface {p0, v2, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_56
    .catch LJ8/a; {:try_start_4c .. :try_end_56} :catch_5b

    if-ne p0, v1, :cond_59

    return-object v1

    :cond_59
    move-object v1, p1

    goto :goto_69

    :catch_5b
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_5f
    invoke-static {p1, p0}, LJ8/p;->a(LJ8/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    :goto_69
    iget-object p0, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p1, LJ8/t;->a:LK8/D;

    if-eq p0, p1, :cond_70

    return-object p0

    :cond_70
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/v$d;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/v$d;

    iget v1, v0, LI8/v$d;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/v$d;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/v$d;

    invoke-direct {v0, p2}, LI8/v$d;-><init>(Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/v$d;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/v$d;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v3, :cond_33

    iget-object p0, v0, LI8/v$d;->r:Ljava/lang/Object;

    check-cast p0, LI8/v$b;

    iget-object p1, v0, LI8/v$d;->q:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/E;

    :try_start_2d
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_30
    .catch LJ8/a; {:try_start_2d .. :try_end_30} :catch_31

    goto :goto_69

    :catch_31
    move-exception p2

    goto :goto_5f

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/E;

    invoke-direct {p2}, Lkotlin/jvm/internal/E;-><init>()V

    sget-object v2, LJ8/t;->a:LK8/D;

    iput-object v2, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    new-instance v2, LI8/v$b;

    invoke-direct {v2, p1, p2}, LI8/v$b;-><init>(Lv8/p;Lkotlin/jvm/internal/E;)V

    :try_start_4c
    iput-object p2, v0, LI8/v$d;->q:Ljava/lang/Object;

    iput-object v2, v0, LI8/v$d;->r:Ljava/lang/Object;

    iput v3, v0, LI8/v$d;->t:I

    invoke-interface {p0, v2, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_56
    .catch LJ8/a; {:try_start_4c .. :try_end_56} :catch_5b

    if-ne p0, v1, :cond_59

    return-object v1

    :cond_59
    move-object p1, p2

    goto :goto_69

    :catch_5b
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_5f
    invoke-static {p2, p0}, LJ8/p;->a(LJ8/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    :goto_69
    iget-object p0, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p1, LJ8/t;->a:LK8/D;

    if-eq p0, p1, :cond_70

    return-object p0

    :cond_70
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element matching the predicate"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(LI8/f;Lm8/e;)Ljava/lang/Object;
    .registers 6

    instance-of v0, p1, LI8/v$f;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LI8/v$f;

    iget v1, v0, LI8/v$f;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/v$f;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/v$f;

    invoke-direct {v0, p1}, LI8/v$f;-><init>(Lm8/e;)V

    :goto_18
    iget-object p1, v0, LI8/v$f;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/v$f;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v3, :cond_33

    iget-object p0, v0, LI8/v$f;->r:Ljava/lang/Object;

    check-cast p0, LI8/v$e;

    iget-object v1, v0, LI8/v$f;->q:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/E;

    :try_start_2d
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_30
    .catch LJ8/a; {:try_start_2d .. :try_end_30} :catch_31

    goto :goto_65

    :catch_31
    move-exception p1

    goto :goto_5b

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/E;

    invoke-direct {p1}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v2, LI8/v$e;

    invoke-direct {v2, p1}, LI8/v$e;-><init>(Lkotlin/jvm/internal/E;)V

    :try_start_48
    iput-object p1, v0, LI8/v$f;->q:Ljava/lang/Object;

    iput-object v2, v0, LI8/v$f;->r:Ljava/lang/Object;

    iput v3, v0, LI8/v$f;->t:I

    invoke-interface {p0, v2, v0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_52
    .catch LJ8/a; {:try_start_48 .. :try_end_52} :catch_57

    if-ne p0, v1, :cond_55

    return-object v1

    :cond_55
    move-object v1, p1

    goto :goto_65

    :catch_57
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_5b
    invoke-static {p1, p0}, LJ8/p;->a(LJ8/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    :goto_65
    iget-object p0, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    return-object p0
.end method
