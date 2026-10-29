.class public final LF8/p0;
.super LF8/o0;
.source "SourceFile"

# interfaces
.implements LF8/V;


# instance fields
.field private final t:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .registers 2

    invoke-direct {p0}, LF8/o0;-><init>()V

    iput-object p1, p0, LF8/p0;->t:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p1

    instance-of p1, p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz p1, :cond_17

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    :cond_17
    return-void
.end method

.method private final l1(Lm8/i;Ljava/util/concurrent/RejectedExecutionException;)V
    .registers 3

    const-string p0, "The task was rejected"

    invoke-static {p0, p2}, LF8/m0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    invoke-static {p1, p0}, LF8/A0;->d(Lm8/i;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method private final n1(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lm8/i;J)Ljava/util/concurrent/ScheduledFuture;
    .registers 7

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p4, p5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0
    :try_end_6
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_6} :catch_7

    return-object p0

    :catch_7
    move-exception p1

    invoke-direct {p0, p3, p1}, LF8/p0;->l1(Lm8/i;Ljava/util/concurrent/RejectedExecutionException;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public T0(JLF8/l;)V
    .registers 13

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_e

    :cond_d
    move-object v4, v2

    :goto_e
    if-eqz v4, :cond_20

    new-instance v5, LF8/P0;

    invoke-direct {v5, p0, p3}, LF8/P0;-><init>(LF8/I;LF8/l;)V

    invoke-interface {p3}, Lm8/e;->getContext()Lm8/i;

    move-result-object v6

    move-object v3, p0

    move-wide v7, p1

    invoke-direct/range {v3 .. v8}, LF8/p0;->n1(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lm8/i;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    goto :goto_21

    :cond_20
    move-wide v7, p1

    :goto_21
    if-eqz v2, :cond_2c

    new-instance p0, LF8/j;

    invoke-direct {p0, v2}, LF8/j;-><init>(Ljava/util/concurrent/Future;)V

    invoke-static {p3, p0}, LF8/p;->c(LF8/l;LF8/k;)V

    return-void

    :cond_2c
    sget-object p0, LF8/Q;->y:LF8/Q;

    invoke-virtual {p0, v7, v8, p3}, LF8/i0;->T0(JLF8/l;)V

    return-void
.end method

.method public W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 14

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_e

    :cond_d
    move-object v4, v2

    :goto_e
    if-eqz v4, :cond_19

    move-object v3, p0

    move-wide v7, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v3 .. v8}, LF8/p0;->n1(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lm8/i;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    goto :goto_1c

    :cond_19
    move-wide v7, p1

    move-object v5, p3

    move-object v6, p4

    :goto_1c
    if-eqz v2, :cond_24

    new-instance p0, LF8/c0;

    invoke-direct {p0, v2}, LF8/c0;-><init>(Ljava/util/concurrent/Future;)V

    return-object p0

    :cond_24
    sget-object p0, LF8/Q;->y:LF8/Q;

    invoke-virtual {p0, v7, v8, v5, v6}, LF8/Q;->W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public close()V
    .registers 2

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p0

    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_b

    check-cast p0, Ljava/util/concurrent/ExecutorService;

    goto :goto_c

    :cond_b
    const/4 p0, 0x0

    :goto_c
    if-eqz p0, :cond_11

    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_11
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, LF8/p0;

    if-eqz v0, :cond_12

    check-cast p1, LF8/p0;

    invoke-virtual {p1}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p0

    if-ne p1, p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 4

    :try_start_0
    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-interface {v0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_a
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_a} :catch_b

    return-void

    :catch_b
    move-exception v0

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-direct {p0, p1, v0}, LF8/p0;->l1(Lm8/i;Ljava/util/concurrent/RejectedExecutionException;)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, LF8/I;->g1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public hashCode()I
    .registers 1

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public m1()Ljava/util/concurrent/Executor;
    .registers 1

    iget-object p0, p0, LF8/p0;->t:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    invoke-virtual {p0}, LF8/p0;->m1()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
