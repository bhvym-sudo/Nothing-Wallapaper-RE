.class final LF8/e;
.super LF8/a;
.source "SourceFile"


# instance fields
.field private final t:Ljava/lang/Thread;

.field private final u:LF8/h0;


# direct methods
.method public constructor <init>(Lm8/i;Ljava/lang/Thread;LF8/h0;)V
    .registers 5

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, LF8/a;-><init>(Lm8/i;ZZ)V

    iput-object p2, p0, LF8/e;->t:Ljava/lang/Thread;

    iput-object p3, p0, LF8/e;->u:LF8/h0;

    return-void
.end method


# virtual methods
.method public final Y0()Ljava/lang/Object;
    .registers 7

    invoke-static {}, LF8/c;->a()LF8/b;

    :try_start_3
    iget-object v0, p0, LF8/e;->u:LF8/h0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_d

    invoke-static {v0, v2, v1, v3}, LF8/h0;->r1(LF8/h0;ZILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_60

    :cond_d
    :goto_d
    :try_start_d
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_4f

    iget-object v0, p0, LF8/e;->u:LF8/h0;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, LF8/h0;->u1()J

    move-result-wide v4

    goto :goto_23

    :catchall_1c
    move-exception v0

    goto :goto_58

    :cond_1e
    const-wide v4, 0x7fffffffffffffffL

    :goto_23
    invoke-virtual {p0}, LF8/D0;->O0()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {p0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_2f
    .catchall {:try_start_d .. :try_end_2f} :catchall_1c

    goto :goto_d

    :cond_30
    :try_start_30
    iget-object v0, p0, LF8/e;->u:LF8/h0;

    if-eqz v0, :cond_37

    invoke-static {v0, v2, v1, v3}, LF8/h0;->m1(LF8/h0;ZILjava/lang/Object;)V
    :try_end_37
    .catchall {:try_start_30 .. :try_end_37} :catchall_60

    :cond_37
    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LF8/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/A;

    if-eqz v0, :cond_49

    move-object v3, p0

    check-cast v3, LF8/A;

    :cond_49
    if-nez v3, :cond_4c

    return-object p0

    :cond_4c
    iget-object p0, v3, LF8/A;->a:Ljava/lang/Throwable;

    throw p0

    :cond_4f
    :try_start_4f
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    invoke-virtual {p0, v0}, LF8/D0;->D(Ljava/lang/Throwable;)Z

    throw v0
    :try_end_58
    .catchall {:try_start_4f .. :try_end_58} :catchall_1c

    :goto_58
    :try_start_58
    iget-object p0, p0, LF8/e;->u:LF8/h0;

    if-eqz p0, :cond_5f

    invoke-static {p0, v2, v1, v3}, LF8/h0;->m1(LF8/h0;ZILjava/lang/Object;)V

    :cond_5f
    throw v0
    :try_end_60
    .catchall {:try_start_58 .. :try_end_60} :catchall_60

    :catchall_60
    move-exception p0

    invoke-static {}, LF8/c;->a()LF8/b;

    throw p0
.end method

.method protected j0()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method protected y(Ljava/lang/Object;)V
    .registers 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, LF8/e;->t:Ljava/lang/Thread;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    iget-object p0, p0, LF8/e;->t:Ljava/lang/Thread;

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_14
    return-void
.end method
