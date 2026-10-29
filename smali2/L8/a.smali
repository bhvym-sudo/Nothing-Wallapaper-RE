.class public abstract LL8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lm8/e;Ljava/lang/Throwable;)V
    .registers 3

    instance-of v0, p1, LF8/X;

    if-eqz v0, :cond_a

    check-cast p1, LF8/X;

    invoke-virtual {p1}, LF8/X;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_a
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Lm8/e;Lm8/e;)V
    .registers 3

    :try_start_0
    invoke-static {p0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    sget-object v0, Lh8/A;->a:Lh8/A;

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, LK8/i;->b(Lm8/e;Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_0 .. :try_end_f} :catchall_10

    return-void

    :catchall_10
    move-exception p0

    invoke-static {p1, p0}, LL8/a;->a(Lm8/e;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final c(Lv8/p;Ljava/lang/Object;Lm8/e;)V
    .registers 3

    :try_start_0
    invoke-static {p0, p1, p2}, Ln8/b;->a(Lv8/p;Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    invoke-static {p0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, LK8/i;->b(Lm8/e;Ljava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_0 .. :try_end_13} :catchall_14

    return-void

    :catchall_14
    move-exception p0

    invoke-static {p2, p0}, LL8/a;->a(Lm8/e;Ljava/lang/Throwable;)V

    return-void
.end method
