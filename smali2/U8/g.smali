.class public final LU8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU8/g$a;
    }
.end annotation


# static fields
.field public static final f:LU8/g$a;


# instance fields
.field private final a:I

.field private final b:J

.field private final c:LT8/d;

.field private final d:LU8/g$b;

.field private final e:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LU8/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU8/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LU8/g;->f:LU8/g$a;

    return-void
.end method

.method public constructor <init>(LT8/e;IJLjava/util/concurrent/TimeUnit;)V
    .registers 8

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeUnit"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LU8/g;->a:I

    invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, LU8/g;->b:J

    invoke-virtual {p1}, LT8/e;->i()LT8/d;

    move-result-object p1

    iput-object p1, p0, LU8/g;->c:LT8/d;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, LQ8/d;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " ConnectionPool"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, LU8/g$b;

    invoke-direct {p2, p0, p1}, LU8/g$b;-><init>(LU8/g;Ljava/lang/String;)V

    iput-object p2, p0, LU8/g;->d:LU8/g$b;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    const-wide/16 p0, 0x0

    cmp-long p0, p3, p0

    if-lez p0, :cond_43

    return-void

    :cond_43
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "keepAliveDuration <= 0: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final d(LU8/f;J)I
    .registers 10

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p0, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_32
    :goto_32
    invoke-virtual {p1}, LU8/f;->o()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_38
    :goto_38
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_97

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4d

    add-int/lit8 v2, v2, 0x1

    goto :goto_38

    :cond_4d
    const-string v4, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LU8/e$b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "A connection to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LU8/f;->A()LP8/F;

    move-result-object v5

    invoke-virtual {v5}, LP8/F;->a()LP8/a;

    move-result-object v5

    invoke-virtual {v5}, LP8/a;->l()LP8/v;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v5}, LZ8/h$a;->g()LZ8/h;

    move-result-object v5

    invoke-virtual {v3}, LU8/e$b;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v5, v4, v3}, LZ8/h;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, LU8/f;->D(Z)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_38

    iget-wide v2, p0, LU8/g;->b:J

    sub-long/2addr p2, v2

    invoke-virtual {p1, p2, p3}, LU8/f;->C(J)V

    return v1

    :cond_97
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(LP8/a;LU8/e;Ljava/util/List;Z)Z
    .registers 7

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU8/f;

    const-string v1, "connection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    if-eqz p4, :cond_2d

    :try_start_24
    invoke-virtual {v0}, LU8/f;->w()Z

    move-result v1

    if-eqz v1, :cond_39

    goto :goto_2d

    :catchall_2b
    move-exception p0

    goto :goto_3d

    :cond_2d
    :goto_2d
    invoke-virtual {v0, p1, p3}, LU8/f;->u(LP8/a;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-virtual {p2, v0}, LU8/e;->e(LU8/f;)V
    :try_end_36
    .catchall {:try_start_24 .. :try_end_36} :catchall_2b

    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :cond_39
    :try_start_39
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_3b
    .catchall {:try_start_39 .. :try_end_3b} :catchall_2b

    monitor-exit v0

    goto :goto_10

    :goto_3d
    monitor-exit v0

    throw p0

    :cond_3f
    const/4 p0, 0x0

    return p0
.end method

.method public final b(J)J
    .registers 14

    const/4 v0, 0x1

    iget-object v1, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    move-wide v5, v4

    move-object v4, v3

    move v3, v2

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LU8/f;

    const-string v8, "connection"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v7

    :try_start_20
    invoke-direct {p0, v7, p1, p2}, LU8/g;->d(LU8/f;J)I

    move-result v8

    if-lez v8, :cond_28

    add-int/2addr v3, v0

    goto :goto_37

    :cond_28
    add-int/2addr v2, v0

    invoke-virtual {v7}, LU8/f;->p()J

    move-result-wide v8

    sub-long v8, p1, v8

    cmp-long v10, v8, v5

    if-lez v10, :cond_35

    move-object v4, v7

    move-wide v5, v8

    :cond_35
    sget-object v8, Lh8/A;->a:Lh8/A;
    :try_end_37
    .catchall {:try_start_20 .. :try_end_37} :catchall_39

    :goto_37
    monitor-exit v7

    goto :goto_e

    :catchall_39
    move-exception p0

    monitor-exit v7

    throw p0

    :cond_3c
    iget-wide v7, p0, LU8/g;->b:J

    cmp-long v1, v5, v7

    if-gez v1, :cond_51

    iget v1, p0, LU8/g;->a:I

    if-le v2, v1, :cond_47

    goto :goto_51

    :cond_47
    if-lez v2, :cond_4b

    sub-long/2addr v7, v5

    return-wide v7

    :cond_4b
    if-lez v3, :cond_4e

    return-wide v7

    :cond_4e
    const-wide/16 p0, -0x1

    return-wide p0

    :cond_51
    :goto_51
    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    monitor-enter v4

    :try_start_55
    invoke-virtual {v4}, LU8/f;->o()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1
    :try_end_5f
    .catchall {:try_start_55 .. :try_end_5f} :catchall_8e

    const-wide/16 v2, 0x0

    if-nez v1, :cond_65

    monitor-exit v4

    return-wide v2

    :cond_65
    :try_start_65
    invoke-virtual {v4}, LU8/f;->p()J

    move-result-wide v7
    :try_end_69
    .catchall {:try_start_65 .. :try_end_69} :catchall_8e

    add-long/2addr v7, v5

    cmp-long p1, v7, p1

    if-eqz p1, :cond_70

    monitor-exit v4

    return-wide v2

    :cond_70
    :try_start_70
    invoke-virtual {v4, v0}, LU8/f;->D(Z)V

    iget-object p1, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_78
    .catchall {:try_start_70 .. :try_end_78} :catchall_8e

    monitor-exit v4

    invoke-virtual {v4}, LU8/f;->E()Ljava/net/Socket;

    move-result-object p1

    invoke-static {p1}, LQ8/d;->n(Ljava/net/Socket;)V

    iget-object p1, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8d

    iget-object p0, p0, LU8/g;->c:LT8/d;

    invoke-virtual {p0}, LT8/d;->a()V

    :cond_8d
    return-wide v2

    :catchall_8e
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method public final c(LU8/f;)Z
    .registers 9

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
    invoke-virtual {p1}, LU8/f;->q()Z

    move-result v0

    if-nez v0, :cond_4f

    iget v0, p0, LU8/g;->a:I

    if-nez v0, :cond_42

    goto :goto_4f

    :cond_42
    iget-object v1, p0, LU8/g;->c:LT8/d;

    iget-object v2, p0, LU8/g;->d:LU8/g$b;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, LT8/d;->j(LT8/d;LT8/a;JILjava/lang/Object;)V

    const/4 p0, 0x0

    return p0

    :cond_4f
    :goto_4f
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LU8/f;->D(Z)V

    iget-object v1, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_65

    iget-object p0, p0, LU8/g;->c:LT8/d;

    invoke-virtual {p0}, LT8/d;->a()V

    :cond_65
    return v0
.end method

.method public final e(LU8/f;)V
    .registers 9

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
    iget-object v0, p0, LU8/g;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LU8/g;->c:LT8/d;

    iget-object v2, p0, LU8/g;->d:LU8/g$b;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, LT8/d;->j(LT8/d;LT8/a;JILjava/lang/Object;)V

    return-void
.end method
