.class public abstract LF8/Z;
.super LM8/h;
.source "SourceFile"


# instance fields
.field public s:I


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, LM8/h;-><init>()V

    iput p1, p0, LF8/Z;->s:I

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .registers 3

    return-void
.end method

.method public abstract d()Lm8/e;
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .registers 3

    instance-of p0, p1, LF8/A;

    const/4 v0, 0x0

    if-eqz p0, :cond_8

    check-cast p1, LF8/A;

    goto :goto_9

    :cond_8
    move-object p1, v0

    :goto_9
    if-eqz p1, :cond_e

    iget-object p0, p1, LF8/A;->a:Ljava/lang/Throwable;

    return-object p0

    :cond_e
    return-object v0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    return-object p1
.end method

.method public final g(Ljava/lang/Throwable;)V
    .registers 5

    new-instance v0, LF8/O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fatal exception in coroutines machinery for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LF8/O;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, LF8/Z;->d()Lm8/e;

    move-result-object p0

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0, v0}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract h()Ljava/lang/Object;
.end method

.method public final run()V
    .registers 10

    :try_start_0
    invoke-virtual {p0}, LF8/Z;->d()Lm8/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK8/h;

    iget-object v1, v0, LK8/h;->u:Lm8/e;

    iget-object v0, v0, LK8/h;->w:Ljava/lang/Object;

    invoke-interface {v1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v2

    invoke-static {v2, v0}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LK8/K;->a:LK8/D;

    const/4 v4, 0x0

    if-eq v0, v3, :cond_27

    invoke-static {v1, v2, v0}, LF8/G;->m(Lm8/e;Lm8/i;Ljava/lang/Object;)LF8/a1;

    move-result-object v3
    :try_end_20
    .catch LF8/X; {:try_start_0 .. :try_end_20} :catch_24
    .catchall {:try_start_0 .. :try_end_20} :catchall_21

    goto :goto_28

    :catchall_21
    move-exception v0

    goto/16 :goto_9d

    :catch_24
    move-exception v0

    goto/16 :goto_a1

    :cond_27
    move-object v3, v4

    :goto_28
    :try_start_28
    invoke-interface {v1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v5

    invoke-virtual {p0}, LF8/Z;->h()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v6}, LF8/Z;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_49

    iget v8, p0, LF8/Z;->s:I

    invoke-static {v8}, LF8/a0;->b(I)Z

    move-result v8

    if-eqz v8, :cond_49

    sget-object v4, LF8/x0;->e:LF8/x0$b;

    invoke-interface {v5, v4}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v4

    check-cast v4, LF8/x0;

    goto :goto_49

    :catchall_47
    move-exception v1

    goto :goto_91

    :cond_49
    :goto_49
    if-eqz v4, :cond_66

    invoke-interface {v4}, LF8/x0;->a()Z

    move-result v5

    if-nez v5, :cond_66

    invoke-interface {v4}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object v4

    invoke-virtual {p0, v6, v4}, LF8/Z;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v5, Lh8/q;->r:Lh8/q$a;

    invoke-static {v4}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_83

    :cond_66
    if-eqz v7, :cond_76

    sget-object v4, Lh8/q;->r:Lh8/q$a;

    invoke-static {v7}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_83

    :cond_76
    sget-object v4, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0, v6}, LF8/Z;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :goto_83
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_85
    .catchall {:try_start_28 .. :try_end_85} :catchall_47

    if-eqz v3, :cond_8d

    :try_start_87
    invoke-virtual {v3}, LF8/a1;->Z0()Z

    move-result v1

    if-eqz v1, :cond_b0

    :cond_8d
    invoke-static {v2, v0}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    return-void

    :goto_91
    if-eqz v3, :cond_99

    invoke-virtual {v3}, LF8/a1;->Z0()Z

    move-result v3

    if-eqz v3, :cond_9c

    :cond_99
    invoke-static {v2, v0}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_9c
    throw v1
    :try_end_9d
    .catch LF8/X; {:try_start_87 .. :try_end_9d} :catch_24
    .catchall {:try_start_87 .. :try_end_9d} :catchall_21

    :goto_9d
    invoke-virtual {p0, v0}, LF8/Z;->g(Ljava/lang/Throwable;)V

    goto :goto_b0

    :goto_a1
    invoke-virtual {p0}, LF8/Z;->d()Lm8/e;

    move-result-object p0

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-virtual {v0}, LF8/X;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {p0, v0}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    :cond_b0
    :goto_b0
    return-void
.end method
