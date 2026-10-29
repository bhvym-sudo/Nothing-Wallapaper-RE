.class public final LF8/Q;
.super LF8/i0;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static volatile _thread:Ljava/lang/Thread;

.field private static volatile debugStatus:I

.field public static final y:LF8/Q;

.field private static final z:J


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, LF8/Q;

    invoke-direct {v0}, LF8/Q;-><init>()V

    sput-object v0, LF8/Q;->y:LF8/Q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LF8/h0;->r1(LF8/h0;ZILjava/lang/Object;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    :try_start_11
    const-string v3, "kotlinx.coroutines.DefaultExecutor.keepAlive"

    invoke-static {v3, v1, v2}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1
    :try_end_17
    .catch Ljava/lang/SecurityException; {:try_start_11 .. :try_end_17} :catch_18

    goto :goto_1c

    :catch_18
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_1c
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LF8/Q;->z:J

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/i0;-><init>()V

    return-void
.end method

.method private final declared-synchronized R1()V
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, LF8/Q;->U1()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_19

    if-nez v0, :cond_9

    monitor-exit p0

    return-void

    :cond_9
    const/4 v0, 0x3

    :try_start_a
    sput v0, LF8/Q;->debugStatus:I

    invoke-virtual {p0}, LF8/i0;->L1()V

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_17
    .catchall {:try_start_a .. :try_end_17} :catchall_19

    monitor-exit p0

    return-void

    :catchall_19
    move-exception v0

    :try_start_1a
    monitor-exit p0
    :try_end_1b
    .catchall {:try_start_1a .. :try_end_1b} :catchall_19

    throw v0
.end method

.method private final declared-synchronized S1()Ljava/lang/Thread;
    .registers 3

    monitor-enter p0

    :try_start_1
    sget-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    if-nez v0, :cond_25

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "kotlinx.coroutines.DefaultExecutor"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    sput-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    sget-object v1, LF8/Q;->y:LF8/Q;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_22
    .catchall {:try_start_1 .. :try_end_22} :catchall_23

    goto :goto_25

    :catchall_23
    move-exception v0

    goto :goto_27

    :cond_25
    :goto_25
    monitor-exit p0

    return-object v0

    :goto_27
    :try_start_27
    monitor-exit p0
    :try_end_28
    .catchall {:try_start_27 .. :try_end_28} :catchall_23

    throw v0
.end method

.method private final T1()Z
    .registers 2

    sget p0, LF8/Q;->debugStatus:I

    const/4 v0, 0x4

    if-ne p0, v0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method private final U1()Z
    .registers 2

    sget p0, LF8/Q;->debugStatus:I

    const/4 v0, 0x2

    if-eq p0, v0, :cond_b

    const/4 v0, 0x3

    if-ne p0, v0, :cond_9

    goto :goto_b

    :cond_9
    const/4 p0, 0x0

    return p0

    :cond_b
    :goto_b
    const/4 p0, 0x1

    return p0
.end method

.method private final declared-synchronized V1()Z
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, LF8/Q;->U1()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_17

    if-eqz v0, :cond_a

    monitor-exit p0

    const/4 p0, 0x0

    return p0

    :cond_a
    const/4 v0, 0x1

    :try_start_b
    sput v0, LF8/Q;->debugStatus:I

    const-string v1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_15
    .catchall {:try_start_b .. :try_end_15} :catchall_17

    monitor-exit p0

    return v0

    :catchall_17
    move-exception v0

    :try_start_18
    monitor-exit p0
    :try_end_19
    .catchall {:try_start_18 .. :try_end_19} :catchall_17

    throw v0
.end method

.method private final W1()V
    .registers 2

    new-instance p0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v0, "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"

    invoke-direct {p0, v0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public D1(Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, LF8/Q;->T1()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-direct {p0}, LF8/Q;->W1()V

    :cond_9
    invoke-super {p0, p1}, LF8/i0;->D1(Ljava/lang/Runnable;)V

    return-void
.end method

.method public W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 5

    invoke-virtual {p0, p1, p2, p3}, LF8/i0;->O1(JLjava/lang/Runnable;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public run()V
    .registers 13

    sget-object v0, LF8/V0;->a:LF8/V0;

    invoke-virtual {v0, p0}, LF8/V0;->d(LF8/h0;)V

    invoke-static {}, LF8/c;->a()LF8/b;

    const/4 v0, 0x0

    :try_start_9
    invoke-direct {p0}, LF8/Q;->V1()Z

    move-result v1
    :try_end_d
    .catchall {:try_start_9 .. :try_end_d} :catchall_43

    if-nez v1, :cond_21

    sput-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, LF8/Q;->R1()V

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-virtual {p0}, LF8/i0;->J1()Z

    move-result v0

    if-nez v0, :cond_7e

    invoke-virtual {p0}, LF8/Q;->x1()Ljava/lang/Thread;

    return-void

    :cond_21
    const-wide v1, 0x7fffffffffffffffL

    move-wide v3, v1

    :cond_27
    :goto_27
    :try_start_27
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    invoke-virtual {p0}, LF8/i0;->u1()J

    move-result-wide v5

    cmp-long v7, v5, v1

    const-wide/16 v8, 0x0

    if-nez v7, :cond_62

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    cmp-long v7, v3, v1

    if-nez v7, :cond_45

    sget-wide v3, LF8/Q;->z:J
    :try_end_41
    .catchall {:try_start_27 .. :try_end_41} :catchall_43

    add-long/2addr v3, v10

    goto :goto_45

    :catchall_43
    move-exception v1

    goto :goto_86

    :cond_45
    :goto_45
    sub-long v10, v3, v10

    cmp-long v7, v10, v8

    if-gtz v7, :cond_5d

    sput-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, LF8/Q;->R1()V

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-virtual {p0}, LF8/i0;->J1()Z

    move-result v0

    if-nez v0, :cond_7e

    invoke-virtual {p0}, LF8/Q;->x1()Ljava/lang/Thread;

    return-void

    :cond_5d
    :try_start_5d
    invoke-static {v5, v6, v10, v11}, LB8/h;->j(JJ)J

    move-result-wide v5

    goto :goto_63

    :cond_62
    move-wide v3, v1

    :goto_63
    cmp-long v7, v5, v8

    if-lez v7, :cond_27

    invoke-direct {p0}, LF8/Q;->U1()Z

    move-result v7
    :try_end_6b
    .catchall {:try_start_5d .. :try_end_6b} :catchall_43

    if-eqz v7, :cond_7f

    sput-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, LF8/Q;->R1()V

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-virtual {p0}, LF8/i0;->J1()Z

    move-result v0

    if-nez v0, :cond_7e

    invoke-virtual {p0}, LF8/Q;->x1()Ljava/lang/Thread;

    :cond_7e
    return-void

    :cond_7f
    :try_start_7f
    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {p0, v5, v6}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_85
    .catchall {:try_start_7f .. :try_end_85} :catchall_43

    goto :goto_27

    :goto_86
    sput-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, LF8/Q;->R1()V

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-virtual {p0}, LF8/i0;->J1()Z

    move-result v0

    if-nez v0, :cond_97

    invoke-virtual {p0}, LF8/Q;->x1()Ljava/lang/Thread;

    :cond_97
    throw v1
.end method

.method public shutdown()V
    .registers 2

    const/4 v0, 0x4

    sput v0, LF8/Q;->debugStatus:I

    invoke-super {p0}, LF8/i0;->shutdown()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "DefaultExecutor"

    return-object p0
.end method

.method protected x1()Ljava/lang/Thread;
    .registers 2

    sget-object v0, LF8/Q;->_thread:Ljava/lang/Thread;

    if-nez v0, :cond_9

    invoke-direct {p0}, LF8/Q;->S1()Ljava/lang/Thread;

    move-result-object p0

    return-object p0

    :cond_9
    return-object v0
.end method

.method protected y1(JLF8/i0$c;)V
    .registers 4

    invoke-direct {p0}, LF8/Q;->W1()V

    return-void
.end method
