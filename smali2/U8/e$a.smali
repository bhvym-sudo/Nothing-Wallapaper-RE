.class public final LU8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final q:LP8/f;

.field private volatile r:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic s:LU8/e;


# direct methods
.method public constructor <init>(LU8/e;LP8/f;)V
    .registers 4

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LU8/e$a;->s:LU8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LU8/e$a;->q:LP8/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, LU8/e$a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ExecutorService;)V
    .registers 4

    const-string v0, "executorService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/e$a;->s:LU8/e;

    invoke-virtual {v0}, LU8/e;->n()LP8/z;

    move-result-object v0

    invoke-virtual {v0}, LP8/z;->p()LP8/p;

    move-result-object v0

    sget-boolean v1, LQ8/d;->h:Z

    if-eqz v1, :cond_41

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_41

    :cond_1a
    new-instance p0, Ljava/lang/AssertionError;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_41
    :goto_41
    :try_start_41
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_44
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_41 .. :try_end_44} :catch_47
    .catchall {:try_start_41 .. :try_end_44} :catchall_45

    return-void

    :catchall_45
    move-exception p1

    goto :goto_6c

    :catch_47
    move-exception p1

    :try_start_48
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object p1, p0, LU8/e$a;->s:LU8/e;

    invoke-virtual {p1, v0}, LU8/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object p1, p0, LU8/e$a;->q:LP8/f;

    iget-object v1, p0, LU8/e$a;->s:LU8/e;

    invoke-interface {p1, v1, v0}, LP8/f;->b(LP8/e;Ljava/io/IOException;)V
    :try_end_5e
    .catchall {:try_start_48 .. :try_end_5e} :catchall_45

    iget-object p1, p0, LU8/e$a;->s:LU8/e;

    invoke-virtual {p1}, LU8/e;->n()LP8/z;

    move-result-object p1

    invoke-virtual {p1}, LP8/z;->p()LP8/p;

    move-result-object p1

    invoke-virtual {p1, p0}, LP8/p;->f(LU8/e$a;)V

    return-void

    :goto_6c
    iget-object v0, p0, LU8/e$a;->s:LU8/e;

    invoke-virtual {v0}, LU8/e;->n()LP8/z;

    move-result-object v0

    invoke-virtual {v0}, LP8/z;->p()LP8/p;

    move-result-object v0

    invoke-virtual {v0, p0}, LP8/p;->f(LU8/e$a;)V

    throw p1
.end method

.method public final b()LU8/e;
    .registers 1

    iget-object p0, p0, LU8/e$a;->s:LU8/e;

    return-object p0
.end method

.method public final c()Ljava/util/concurrent/atomic/AtomicInteger;
    .registers 1

    iget-object p0, p0, LU8/e$a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LU8/e$a;->s:LU8/e;

    invoke-virtual {p0}, LU8/e;->s()LP8/B;

    move-result-object p0

    invoke-virtual {p0}, LP8/B;->j()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->i()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final e(LU8/e$a;)V
    .registers 3

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, LU8/e$a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, LU8/e$a;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public run()V
    .registers 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OkHttp "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU8/e$a;->s:LU8/e;

    invoke-virtual {v1}, LU8/e;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LU8/e$a;->s:LU8/e;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_24
    invoke-static {v1}, LU8/e;->c(LU8/e;)LU8/e$c;

    move-result-object v0

    invoke-virtual {v0}, Le9/c;->v()V
    :try_end_2b
    .catchall {:try_start_24 .. :try_end_2b} :catchall_43

    const/4 v0, 0x0

    :try_start_2c
    invoke-virtual {v1}, LU8/e;->t()LP8/D;

    move-result-object v0
    :try_end_30
    .catch Ljava/io/IOException; {:try_start_2c .. :try_end_30} :catch_75
    .catchall {:try_start_2c .. :try_end_30} :catchall_4a

    const/4 v4, 0x1

    :try_start_31
    iget-object v5, p0, LU8/e$a;->q:LP8/f;

    invoke-interface {v5, v1, v0}, LP8/f;->a(LP8/e;LP8/D;)V
    :try_end_36
    .catch Ljava/io/IOException; {:try_start_31 .. :try_end_36} :catch_48
    .catchall {:try_start_31 .. :try_end_36} :catchall_46

    :try_start_36
    invoke-virtual {v1}, LU8/e;->n()LP8/z;

    move-result-object v0

    invoke-virtual {v0}, LP8/z;->p()LP8/p;

    move-result-object v0

    :goto_3e
    invoke-virtual {v0, p0}, LP8/p;->f(LU8/e$a;)V
    :try_end_41
    .catchall {:try_start_36 .. :try_end_41} :catchall_43

    goto/16 :goto_a9

    :catchall_43
    move-exception p0

    goto/16 :goto_b9

    :catchall_46
    move-exception v0

    goto :goto_4e

    :catch_48
    move-exception v0

    goto :goto_79

    :catchall_4a
    move-exception v4

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    :goto_4e
    :try_start_4e
    invoke-virtual {v1}, LU8/e;->cancel()V

    if-nez v4, :cond_74

    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "canceled due to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iget-object v5, p0, LU8/e$a;->q:LP8/f;

    invoke-interface {v5, v1, v4}, LP8/f;->b(LP8/e;Ljava/io/IOException;)V

    goto :goto_74

    :catchall_72
    move-exception v0

    goto :goto_ad

    :cond_74
    :goto_74
    throw v0

    :catch_75
    move-exception v4

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    :goto_79
    if-eqz v4, :cond_9b

    sget-object v4, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v4}, LZ8/h$a;->g()LZ8/h;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Callback failure for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LU8/e;->d(LU8/e;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    invoke-virtual {v4, v5, v6, v0}, LZ8/h;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_a0

    :cond_9b
    iget-object v4, p0, LU8/e$a;->q:LP8/f;

    invoke-interface {v4, v1, v0}, LP8/f;->b(LP8/e;Ljava/io/IOException;)V
    :try_end_a0
    .catchall {:try_start_4e .. :try_end_a0} :catchall_72

    :goto_a0
    :try_start_a0
    invoke-virtual {v1}, LU8/e;->n()LP8/z;

    move-result-object v0

    invoke-virtual {v0}, LP8/z;->p()LP8/p;

    move-result-object v0
    :try_end_a8
    .catchall {:try_start_a0 .. :try_end_a8} :catchall_43

    goto :goto_3e

    :goto_a9
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_ad
    :try_start_ad
    invoke-virtual {v1}, LU8/e;->n()LP8/z;

    move-result-object v1

    invoke-virtual {v1}, LP8/z;->p()LP8/p;

    move-result-object v1

    invoke-virtual {v1, p0}, LP8/p;->f(LU8/e$a;)V

    throw v0
    :try_end_b9
    .catchall {:try_start_ad .. :try_end_b9} :catchall_43

    :goto_b9
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw p0
.end method
