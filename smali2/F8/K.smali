.class public abstract LF8/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm8/i;Ljava/lang/Throwable;)V
    .registers 3

    instance-of v0, p1, LF8/X;

    if-eqz v0, :cond_a

    check-cast p1, LF8/X;

    invoke-virtual {p1}, LF8/X;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_a
    :try_start_a
    sget-object v0, LF8/J;->d:LF8/J$a;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    check-cast v0, LF8/J;

    if-eqz v0, :cond_1a

    invoke-interface {v0, p0, p1}, LF8/J;->b0(Lm8/i;Ljava/lang/Throwable;)V
    :try_end_17
    .catchall {:try_start_a .. :try_end_17} :catchall_18

    return-void

    :catchall_18
    move-exception v0

    goto :goto_1e

    :cond_1a
    invoke-static {p0, p1}, LK8/f;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void

    :goto_1e
    invoke-static {p1, v0}, LF8/K;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p0, p1}, LK8/f;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .registers 4

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception while trying to handle coroutine exception"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, p0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-object v0
.end method
