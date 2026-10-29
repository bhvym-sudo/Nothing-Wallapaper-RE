.class public abstract LK8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm8/i;Ljava/lang/Throwable;)V
    .registers 4

    invoke-static {}, LK8/e;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/J;

    :try_start_14
    invoke-interface {v1, p0, p1}, LF8/J;->b0(Lm8/i;Ljava/lang/Throwable;)V
    :try_end_17
    .catchall {:try_start_14 .. :try_end_17} :catchall_18

    goto :goto_8

    :catchall_18
    move-exception v1

    invoke-static {p1, v1}, LF8/K;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, LK8/e;->b(Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_21
    :try_start_21
    new-instance v0, LK8/g;

    invoke-direct {v0, p0}, LK8/g;-><init>(Lm8/i;)V

    invoke-static {p1, v0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_29
    .catchall {:try_start_21 .. :try_end_29} :catchall_29

    :catchall_29
    invoke-static {p1}, LK8/e;->b(Ljava/lang/Throwable;)V

    return-void
.end method
