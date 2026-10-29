.class abstract synthetic LH8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LH8/v;Ljava/lang/Throwable;)V
    .registers 4

    const/4 v0, 0x0

    if-eqz p1, :cond_13

    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_a

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    :cond_a
    if-nez v0, :cond_13

    const-string v0, "Channel was consumed, consumer had failed"

    invoke-static {v0, p1}, LF8/m0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    move-object v0, p1

    :cond_13
    invoke-interface {p0, v0}, LH8/v;->f(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
