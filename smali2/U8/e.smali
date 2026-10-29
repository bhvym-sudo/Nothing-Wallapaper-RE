.class public final LU8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU8/e$a;,
        LU8/e$b;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:LU8/c;

.field private C:Z

.field private D:Z

.field private E:Z

.field private volatile F:Z

.field private volatile G:LU8/c;

.field private volatile H:LU8/f;

.field private final q:LP8/z;

.field private final r:LP8/B;

.field private final s:Z

.field private final t:LU8/g;

.field private final u:LP8/r;

.field private final v:LU8/e$c;

.field private final w:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private x:Ljava/lang/Object;

.field private y:LU8/d;

.field private z:LU8/f;


# direct methods
.method public constructor <init>(LP8/z;LP8/B;Z)V
    .registers 6

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8/e;->q:LP8/z;

    iput-object p2, p0, LU8/e;->r:LP8/B;

    iput-boolean p3, p0, LU8/e;->s:Z

    invoke-virtual {p1}, LP8/z;->m()LP8/k;

    move-result-object p2

    invoke-virtual {p2}, LP8/k;->a()LU8/g;

    move-result-object p2

    iput-object p2, p0, LU8/e;->t:LU8/g;

    invoke-virtual {p1}, LP8/z;->r()LP8/r$c;

    move-result-object p2

    invoke-interface {p2, p0}, LP8/r$c;->a(LP8/e;)LP8/r;

    move-result-object p2

    iput-object p2, p0, LU8/e;->u:LP8/r;

    new-instance p2, LU8/e$c;

    invoke-direct {p2, p0}, LU8/e$c;-><init>(LU8/e;)V

    invoke-virtual {p1}, LP8/z;->j()I

    move-result p1

    int-to-long v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p1}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    iput-object p2, p0, LU8/e;->v:LU8/e$c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, LU8/e;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, LU8/e;->E:Z

    return-void
.end method

.method private final F(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 3

    iget-boolean v0, p0, LU8/e;->A:Z

    if-eqz v0, :cond_5

    goto :goto_d

    :cond_5
    iget-object p0, p0, LU8/e;->v:LU8/e$c;

    invoke-virtual {p0}, Le9/c;->w()Z

    move-result p0

    if-nez p0, :cond_e

    :goto_d
    return-object p1

    :cond_e
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "timeout"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1a

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1a
    return-object p0
.end method

.method private final G()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LU8/e;->f()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "canceled "

    goto :goto_10

    :cond_e
    const-string v1, ""

    :goto_10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LU8/e;->s:Z

    if-eqz v1, :cond_1a

    const-string v1, "web socket"

    goto :goto_1c

    :cond_1a
    const-string v1, "call"

    :goto_1c
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU8/e;->y()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LU8/e;)LU8/e$c;
    .registers 1

    iget-object p0, p0, LU8/e;->v:LU8/e$c;

    return-object p0
.end method

.method public static final synthetic d(LU8/e;)Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, LU8/e;->G()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 5

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    iget-object v1, p0, LU8/e;->z:LU8/f;

    if-eqz v1, :cond_89

    if-eqz v0, :cond_66

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto :goto_66

    :cond_3f
    new-instance p0, Ljava/lang/AssertionError;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_66
    :goto_66
    monitor-enter v1

    :try_start_67
    invoke-virtual {p0}, LU8/e;->A()Ljava/net/Socket;

    move-result-object v0
    :try_end_6b
    .catchall {:try_start_67 .. :try_end_6b} :catchall_86

    monitor-exit v1

    iget-object v2, p0, LU8/e;->z:LU8/f;

    if-nez v2, :cond_7b

    if-eqz v0, :cond_75

    invoke-static {v0}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_75
    iget-object v0, p0, LU8/e;->u:LP8/r;

    invoke-virtual {v0, p0, v1}, LP8/r;->k(LP8/e;LP8/j;)V

    goto :goto_89

    :cond_7b
    if-nez v0, :cond_7e

    goto :goto_89

    :cond_7e
    const-string p0, "Check failed."

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_86
    move-exception p0

    monitor-exit v1

    throw p0

    :cond_89
    :goto_89
    invoke-direct {p0, p1}, LU8/e;->F(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-eqz p1, :cond_98

    iget-object p1, p0, LU8/e;->u:LP8/r;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, LP8/r;->d(LP8/e;Ljava/io/IOException;)V

    return-object v0

    :cond_98
    iget-object p1, p0, LU8/e;->u:LP8/r;

    invoke-virtual {p1, p0}, LP8/r;->c(LP8/e;)V

    return-object v0
.end method

.method private final i()V
    .registers 3

    sget-object v0, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v0}, LZ8/h$a;->g()LZ8/h;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, LZ8/h;->h(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LU8/e;->x:Ljava/lang/Object;

    iget-object v0, p0, LU8/e;->u:LP8/r;

    invoke-virtual {v0, p0}, LP8/r;->e(LP8/e;)V

    return-void
.end method

.method private final k(LP8/v;)LP8/a;
    .registers 16

    invoke-virtual {p1}, LP8/v;->j()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v0}, LP8/z;->J()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->w()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iget-object v2, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v2}, LP8/z;->k()LP8/g;

    move-result-object v2

    move-object v6, v0

    move-object v7, v1

    move-object v8, v2

    goto :goto_20

    :cond_1c
    const/4 v0, 0x0

    move-object v6, v0

    move-object v7, v6

    move-object v8, v7

    :goto_20
    new-instance v1, LP8/a;

    invoke-virtual {p1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LP8/v;->n()I

    move-result v3

    iget-object p1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p1}, LP8/z;->q()LP8/q;

    move-result-object v4

    iget-object p1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p1}, LP8/z;->I()Ljavax/net/SocketFactory;

    move-result-object v5

    iget-object p1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p1}, LP8/z;->E()LP8/b;

    move-result-object v9

    iget-object p1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p1}, LP8/z;->D()Ljava/net/Proxy;

    move-result-object v10

    iget-object p1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p1}, LP8/z;->C()Ljava/util/List;

    move-result-object v11

    iget-object p1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p1}, LP8/z;->n()Ljava/util/List;

    move-result-object v12

    iget-object p0, p0, LU8/e;->q:LP8/z;

    invoke-virtual {p0}, LP8/z;->F()Ljava/net/ProxySelector;

    move-result-object v13

    invoke-direct/range {v1 .. v13}, LP8/a;-><init>(Ljava/lang/String;ILP8/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LP8/g;LP8/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v1
.end method


# virtual methods
.method public final A()Ljava/net/Socket;
    .registers 7

    iget-object v0, p0, LU8/e;->z:LU8/f;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-boolean v1, LQ8/d;->h:Z

    if-eqz v1, :cond_37

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_37

    :cond_10
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_37
    :goto_37
    invoke-virtual {v0}, LU8/f;->o()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_40
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_5b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/Reference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_58

    goto :goto_5c

    :cond_58
    add-int/lit8 v3, v3, 0x1

    goto :goto_40

    :cond_5b
    move v3, v5

    :goto_5c
    if-eq v3, v5, :cond_7f

    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, LU8/e;->z:LU8/f;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7e

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, LU8/f;->C(J)V

    iget-object p0, p0, LU8/e;->t:LU8/g;

    invoke-virtual {p0, v0}, LU8/g;->c(LU8/f;)Z

    move-result p0

    if-eqz p0, :cond_7e

    invoke-virtual {v0}, LU8/f;->E()Ljava/net/Socket;

    move-result-object p0

    return-object p0

    :cond_7e
    return-object v2

    :cond_7f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public B(LP8/f;)V
    .registers 5

    const-string v0, "responseCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/e;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-direct {p0}, LU8/e;->i()V

    iget-object v0, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v0}, LP8/z;->p()LP8/p;

    move-result-object v0

    new-instance v1, LU8/e$a;

    invoke-direct {v1, p0, p1}, LU8/e$a;-><init>(LU8/e;LP8/f;)V

    invoke-virtual {v0, v1}, LP8/p;->a(LU8/e$a;)V

    return-void

    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Already Executed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final C()Z
    .registers 1

    iget-object p0, p0, LU8/e;->y:LU8/d;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LU8/d;->e()Z

    move-result p0

    return p0
.end method

.method public final D(LU8/f;)V
    .registers 2

    iput-object p1, p0, LU8/e;->H:LU8/f;

    return-void
.end method

.method public final E()V
    .registers 2

    iget-boolean v0, p0, LU8/e;->A:Z

    if-nez v0, :cond_d

    const/4 v0, 0x1

    iput-boolean v0, p0, LU8/e;->A:Z

    iget-object p0, p0, LU8/e;->v:LU8/e$c;

    invoke-virtual {p0}, Le9/c;->w()Z

    return-void

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a()LP8/D;
    .registers 4

    iget-object v0, p0, LU8/e;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, p0, LU8/e;->v:LU8/e$c;

    invoke-virtual {v0}, Le9/c;->v()V

    invoke-direct {p0}, LU8/e;->i()V

    :try_start_12
    iget-object v0, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v0}, LP8/z;->p()LP8/p;

    move-result-object v0

    invoke-virtual {v0, p0}, LP8/p;->b(LU8/e;)V

    invoke-virtual {p0}, LU8/e;->t()LP8/D;

    move-result-object v0
    :try_end_1f
    .catchall {:try_start_12 .. :try_end_1f} :catchall_29

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->p()LP8/p;

    move-result-object v1

    invoke-virtual {v1, p0}, LP8/p;->g(LU8/e;)V

    return-object v0

    :catchall_29
    move-exception v0

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->p()LP8/p;

    move-result-object v1

    invoke-virtual {v1, p0}, LP8/p;->g(LU8/e;)V

    throw v0

    :cond_34
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public b()LP8/B;
    .registers 1

    iget-object p0, p0, LU8/e;->r:LP8/B;

    return-object p0
.end method

.method public cancel()V
    .registers 2

    iget-boolean v0, p0, LU8/e;->F:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, LU8/e;->F:Z

    iget-object v0, p0, LU8/e;->G:LU8/c;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, LU8/c;->b()V

    :cond_f
    iget-object v0, p0, LU8/e;->H:LU8/f;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, LU8/f;->e()V

    :cond_16
    iget-object v0, p0, LU8/e;->u:LP8/r;

    invoke-virtual {v0, p0}, LP8/r;->f(LP8/e;)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LU8/e;->j()LU8/e;

    move-result-object p0

    return-object p0
.end method

.method public final e(LU8/f;)V
    .registers 4

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_37

    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_37

    :cond_10
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_37
    :goto_37
    iget-object v0, p0, LU8/e;->z:LU8/f;

    if-nez v0, :cond_4c

    iput-object p1, p0, LU8/e;->z:LU8/f;

    invoke-virtual {p1}, LU8/f;->o()Ljava/util/List;

    move-result-object p1

    new-instance v0, LU8/e$b;

    iget-object v1, p0, LU8/e;->x:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, LU8/e$b;-><init>(LU8/e;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_4c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public f()Z
    .registers 1

    iget-boolean p0, p0, LU8/e;->F:Z

    return p0
.end method

.method public j()LU8/e;
    .registers 4

    new-instance v0, LU8/e;

    iget-object v1, p0, LU8/e;->q:LP8/z;

    iget-object v2, p0, LU8/e;->r:LP8/B;

    iget-boolean p0, p0, LU8/e;->s:Z

    invoke-direct {v0, v1, v2, p0}, LU8/e;-><init>(LP8/z;LP8/B;Z)V

    return-object v0
.end method

.method public final l(LP8/B;Z)V
    .registers 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/e;->B:LU8/c;

    if-nez v0, :cond_3f

    monitor-enter p0

    :try_start_a
    iget-boolean v0, p0, LU8/e;->D:Z

    if-nez v0, :cond_35

    iget-boolean v0, p0, LU8/e;->C:Z

    if-nez v0, :cond_2d

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_2b

    monitor-exit p0

    if-eqz p2, :cond_2a

    new-instance p2, LU8/d;

    iget-object v0, p0, LU8/e;->t:LU8/g;

    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object p1

    invoke-direct {p0, p1}, LU8/e;->k(LP8/v;)LP8/a;

    move-result-object p1

    iget-object v1, p0, LU8/e;->u:LP8/r;

    invoke-direct {p2, v0, p1, p0, v1}, LU8/d;-><init>(LU8/g;LP8/a;LU8/e;LP8/r;)V

    iput-object p2, p0, LU8/e;->y:LU8/d;

    :cond_2a
    return-void

    :catchall_2b
    move-exception p1

    goto :goto_3d

    :cond_2d
    :try_start_2d
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_35
    const-string p1, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3d
    .catchall {:try_start_2d .. :try_end_3d} :catchall_2b

    :goto_3d
    monitor-exit p0

    throw p1

    :cond_3f
    const-string p0, "Check failed."

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LU8/e;->E:Z

    if-eqz v0, :cond_17

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_15

    monitor-exit p0

    if-eqz p1, :cond_11

    iget-object p1, p0, LU8/e;->G:LU8/c;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, LU8/c;->d()V

    :cond_11
    const/4 p1, 0x0

    iput-object p1, p0, LU8/e;->B:LU8/c;

    return-void

    :catchall_15
    move-exception p1

    goto :goto_1f

    :cond_17
    :try_start_17
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1f
    .catchall {:try_start_17 .. :try_end_1f} :catchall_15

    :goto_1f
    monitor-exit p0

    throw p1
.end method

.method public final n()LP8/z;
    .registers 1

    iget-object p0, p0, LU8/e;->q:LP8/z;

    return-object p0
.end method

.method public final o()LU8/f;
    .registers 1

    iget-object p0, p0, LU8/e;->z:LU8/f;

    return-object p0
.end method

.method public final p()LP8/r;
    .registers 1

    iget-object p0, p0, LU8/e;->u:LP8/r;

    return-object p0
.end method

.method public final q()Z
    .registers 1

    iget-boolean p0, p0, LU8/e;->s:Z

    return p0
.end method

.method public final r()LU8/c;
    .registers 1

    iget-object p0, p0, LU8/e;->B:LU8/c;

    return-object p0
.end method

.method public final s()LP8/B;
    .registers 1

    iget-object p0, p0, LU8/e;->r:LP8/B;

    return-object p0
.end method

.method public final t()LP8/D;
    .registers 11

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v0}, LP8/z;->x()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Li8/s;->z(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    new-instance v0, LV8/j;

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-direct {v0, v1}, LV8/j;-><init>(LP8/z;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LV8/a;

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->o()LP8/n;

    move-result-object v1

    invoke-direct {v0, v1}, LV8/a;-><init>(LP8/n;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LS8/a;

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->i()LP8/c;

    const/4 v9, 0x0

    invoke-direct {v0, v9}, LS8/a;-><init>(LP8/c;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    sget-object v0, LU8/a;->a:LU8/a;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, LU8/e;->s:Z

    if-nez v0, :cond_4a

    iget-object v0, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v0}, LP8/z;->y()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Li8/s;->z(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    :cond_4a
    new-instance v0, LV8/b;

    iget-boolean v1, p0, LU8/e;->s:Z

    invoke-direct {v0, v1}, LV8/b;-><init>(Z)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LV8/g;

    iget-object v5, p0, LU8/e;->r:LP8/B;

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->l()I

    move-result v6

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->G()I

    move-result v7

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v1}, LP8/z;->L()I

    move-result v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, LV8/g;-><init>(LU8/e;Ljava/util/List;ILU8/c;LP8/B;III)V

    const/4 p0, 0x0

    :try_start_71
    iget-object v2, v1, LU8/e;->r:LP8/B;

    invoke-virtual {v0, v2}, LV8/g;->a(LP8/B;)LP8/D;

    move-result-object v0

    invoke-virtual {v1}, LU8/e;->f()Z

    move-result v2
    :try_end_7b
    .catch Ljava/io/IOException; {:try_start_71 .. :try_end_7b} :catch_8e
    .catchall {:try_start_71 .. :try_end_7b} :catchall_8c

    if-nez v2, :cond_81

    invoke-virtual {v1, v9}, LU8/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v0

    :cond_81
    :try_start_81
    invoke-static {v0}, LQ8/d;->m(Ljava/io/Closeable;)V

    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8c
    .catch Ljava/io/IOException; {:try_start_81 .. :try_end_8c} :catch_8e
    .catchall {:try_start_81 .. :try_end_8c} :catchall_8c

    :catchall_8c
    move-exception v0

    goto :goto_9d

    :catch_8e
    move-exception v0

    move-object p0, v0

    const/4 v2, 0x1

    :try_start_91
    invoke-virtual {v1, p0}, LU8/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    throw p0
    :try_end_9b
    .catchall {:try_start_91 .. :try_end_9b} :catchall_9b

    :catchall_9b
    move-exception v0

    move p0, v2

    :goto_9d
    if-nez p0, :cond_a2

    invoke-virtual {v1, v9}, LU8/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_a2
    throw v0
.end method

.method public final v(LV8/g;)LU8/c;
    .registers 5

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-boolean v0, p0, LU8/e;->E:Z

    if-eqz v0, :cond_54

    iget-boolean v0, p0, LU8/e;->D:Z

    if-nez v0, :cond_4c

    iget-boolean v0, p0, LU8/e;->C:Z

    if-nez v0, :cond_44

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_14
    .catchall {:try_start_6 .. :try_end_14} :catchall_42

    monitor-exit p0

    iget-object v0, p0, LU8/e;->y:LU8/d;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, p0, LU8/e;->q:LP8/z;

    invoke-virtual {v0, v1, p1}, LU8/d;->a(LP8/z;LV8/g;)LV8/d;

    move-result-object p1

    new-instance v1, LU8/c;

    iget-object v2, p0, LU8/e;->u:LP8/r;

    invoke-direct {v1, p0, v2, v0, p1}, LU8/c;-><init>(LU8/e;LP8/r;LU8/d;LV8/d;)V

    iput-object v1, p0, LU8/e;->B:LU8/c;

    iput-object v1, p0, LU8/e;->G:LU8/c;

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_2d
    iput-boolean p1, p0, LU8/e;->C:Z

    iput-boolean p1, p0, LU8/e;->D:Z
    :try_end_31
    .catchall {:try_start_2d .. :try_end_31} :catchall_3f

    monitor-exit p0

    iget-boolean p0, p0, LU8/e;->F:Z

    if-nez p0, :cond_37

    return-object v1

    :cond_37
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Canceled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_3f
    move-exception p1

    monitor-exit p0

    throw p1

    :catchall_42
    move-exception p1

    goto :goto_5c

    :cond_44
    :try_start_44
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5c
    .catchall {:try_start_44 .. :try_end_5c} :catchall_42

    :goto_5c
    monitor-exit p0

    throw p1
.end method

.method public final w(LU8/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .registers 6

    const-string v0, "exchange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/e;->G:LU8/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_58

    :cond_e
    monitor-enter p0

    const/4 p1, 0x0

    if-eqz p2, :cond_19

    :try_start_12
    iget-boolean v0, p0, LU8/e;->C:Z

    if-nez v0, :cond_1f

    goto :goto_19

    :catchall_17
    move-exception p1

    goto :goto_59

    :cond_19
    :goto_19
    if-eqz p3, :cond_41

    iget-boolean v0, p0, LU8/e;->D:Z

    if-eqz v0, :cond_41

    :cond_1f
    if-eqz p2, :cond_23

    iput-boolean p1, p0, LU8/e;->C:Z

    :cond_23
    if-eqz p3, :cond_27

    iput-boolean p1, p0, LU8/e;->D:Z

    :cond_27
    iget-boolean p2, p0, LU8/e;->C:Z

    const/4 p3, 0x1

    if-nez p2, :cond_32

    iget-boolean v0, p0, LU8/e;->D:Z

    if-nez v0, :cond_32

    move v0, p3

    goto :goto_33

    :cond_32
    move v0, p1

    :goto_33
    if-nez p2, :cond_3e

    iget-boolean p2, p0, LU8/e;->D:Z

    if-nez p2, :cond_3e

    iget-boolean p2, p0, LU8/e;->E:Z

    if-nez p2, :cond_3e

    move p1, p3

    :cond_3e
    move p2, p1

    move p1, v0

    goto :goto_42

    :cond_41
    move p2, p1

    :goto_42
    sget-object p3, Lh8/A;->a:Lh8/A;
    :try_end_44
    .catchall {:try_start_12 .. :try_end_44} :catchall_17

    monitor-exit p0

    if-eqz p1, :cond_51

    const/4 p1, 0x0

    iput-object p1, p0, LU8/e;->G:LU8/c;

    iget-object p1, p0, LU8/e;->z:LU8/f;

    if-eqz p1, :cond_51

    invoke-virtual {p1}, LU8/f;->t()V

    :cond_51
    if-eqz p2, :cond_58

    invoke-direct {p0, p4}, LU8/e;->h(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0

    :cond_58
    :goto_58
    return-object p4

    :goto_59
    monitor-exit p0

    throw p1
.end method

.method public final x(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 4

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LU8/e;->E:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_14

    iput-boolean v1, p0, LU8/e;->E:Z

    iget-boolean v0, p0, LU8/e;->C:Z

    if-nez v0, :cond_14

    iget-boolean v0, p0, LU8/e;->D:Z

    if-nez v0, :cond_14

    const/4 v1, 0x1

    goto :goto_14

    :catchall_12
    move-exception p1

    goto :goto_1f

    :cond_14
    :goto_14
    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_12

    monitor-exit p0

    if-eqz v1, :cond_1e

    invoke-direct {p0, p1}, LU8/e;->h(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0

    :cond_1e
    return-object p1

    :goto_1f
    monitor-exit p0

    throw p1
.end method

.method public final y()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LU8/e;->r:LP8/B;

    invoke-virtual {p0}, LP8/B;->j()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->p()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
