.class public abstract LL8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv8/p;Ljava/lang/Object;Lm8/e;)V
    .registers 6

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Lm8/e;)Lm8/e;

    move-result-object p2

    :try_start_4
    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_d
    .catchall {:try_start_4 .. :try_end_d} :catchall_37

    :try_start_d
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->b(Lm8/e;)V

    instance-of v2, p0, Lkotlin/coroutines/jvm/internal/a;

    if-nez v2, :cond_1b

    invoke-static {p0, p1, p2}, Ln8/b;->d(Lv8/p;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_26

    :catchall_19
    move-exception p0

    goto :goto_39

    :cond_1b
    const/4 v2, 0x2

    invoke-static {p0, v2}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv8/p;

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_26
    .catchall {:try_start_d .. :try_end_26} :catchall_19

    :goto_26
    :try_start_26
    invoke-static {v0, v1}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V
    :try_end_29
    .catchall {:try_start_26 .. :try_end_29} :catchall_37

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-eq p0, p1, :cond_36

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_36
    return-void

    :catchall_37
    move-exception p0

    goto :goto_3d

    :goto_39
    :try_start_39
    invoke-static {v0, v1}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    throw p0
    :try_end_3d
    .catchall {:try_start_39 .. :try_end_3d} :catchall_37

    :goto_3d
    instance-of p1, p0, LF8/X;

    if-eqz p1, :cond_47

    check-cast p0, LF8/X;

    invoke-virtual {p0}, LF8/X;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    :cond_47
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 6

    const/4 v0, 0x2

    :try_start_1
    instance-of v1, p2, Lkotlin/coroutines/jvm/internal/a;

    if-nez v1, :cond_c

    invoke-static {p2, p1, p0}, Ln8/b;->d(Lv8/p;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1f

    :catchall_a
    move-exception p1

    goto :goto_17

    :cond_c
    invoke-static {p2, v0}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv8/p;

    invoke-interface {p2, p1, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_a

    goto :goto_1f

    :goto_17
    new-instance p2, LF8/A;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    move-object p1, p2

    :goto_1f
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2a

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    goto :goto_42

    :cond_2a
    invoke-virtual {p0, p1}, LF8/D0;->o0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LF8/E0;->b:LK8/D;

    if-ne p1, p2, :cond_37

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    goto :goto_42

    :cond_37
    invoke-virtual {p0}, LK8/z;->Y0()V

    instance-of p0, p1, LF8/A;

    if-nez p0, :cond_43

    invoke-static {p1}, LF8/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_42
    return-object p0

    :cond_43
    check-cast p1, LF8/A;

    iget-object p0, p1, LF8/A;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final c(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 6

    const/4 v0, 0x2

    :try_start_1
    instance-of v1, p2, Lkotlin/coroutines/jvm/internal/a;

    if-nez v1, :cond_c

    invoke-static {p2, p1, p0}, Ln8/b;->d(Lv8/p;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1f

    :catchall_a
    move-exception p1

    goto :goto_17

    :cond_c
    invoke-static {p2, v0}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv8/p;

    invoke-interface {p2, p1, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_a

    goto :goto_1f

    :goto_17
    new-instance p2, LF8/A;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    move-object p1, p2

    :goto_1f
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2a

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    goto :goto_5d

    :cond_2a
    invoke-virtual {p0, p1}, LF8/D0;->o0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LF8/E0;->b:LK8/D;

    if-ne p2, v0, :cond_37

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    goto :goto_5d

    :cond_37
    invoke-virtual {p0}, LK8/z;->Y0()V

    instance-of v0, p2, LF8/A;

    if-eqz v0, :cond_58

    check-cast p2, LF8/A;

    iget-object p2, p2, LF8/A;->a:Ljava/lang/Throwable;

    instance-of v0, p2, LF8/W0;

    if-eqz v0, :cond_57

    move-object v0, p2

    check-cast v0, LF8/W0;

    iget-object v0, v0, LF8/W0;->q:LF8/x0;

    if-ne v0, p0, :cond_57

    instance-of p0, p1, LF8/A;

    if-nez p0, :cond_52

    goto :goto_5c

    :cond_52
    check-cast p1, LF8/A;

    iget-object p0, p1, LF8/A;->a:Ljava/lang/Throwable;

    throw p0

    :cond_57
    throw p2

    :cond_58
    invoke-static {p2}, LF8/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_5c
    move-object p0, p1

    :goto_5d
    return-object p0
.end method
