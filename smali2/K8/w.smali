.class public abstract LK8/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv8/l;Ljava/lang/Object;Lm8/i;)V
    .registers 4

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, LK8/w;->b(Lv8/l;Ljava/lang/Object;LK8/P;)LK8/P;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-static {p2, p0}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    :cond_a
    return-void
.end method

.method public static final b(Lv8/l;Ljava/lang/Object;LK8/P;)LK8/P;
    .registers 5

    :try_start_0
    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_0 .. :try_end_3} :catchall_4

    return-object p2

    :catchall_4
    move-exception p0

    if-eqz p2, :cond_11

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eq v0, p0, :cond_11

    invoke-static {p2, p0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-object p2

    :cond_11
    new-instance p2, LK8/P;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception in undelivered element handler for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, LK8/P;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public static synthetic c(Lv8/l;Ljava/lang/Object;LK8/P;ILjava/lang/Object;)LK8/P;
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-static {p0, p1, p2}, LK8/w;->b(Lv8/l;Ljava/lang/Object;LK8/P;)LK8/P;

    move-result-object p0

    return-object p0
.end method
