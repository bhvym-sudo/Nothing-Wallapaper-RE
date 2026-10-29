.class public final LM8/a$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# static fields
.field private static final synthetic y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field public final q:LM8/l;

.field private final r:Lkotlin/jvm/internal/E;

.field public s:LM8/a$d;

.field private t:J

.field private u:J

.field private v:I

.field public w:Z

.field private volatile synthetic workerCtl$volatile:I

.field final synthetic x:LM8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-class v0, LM8/a$c;

    const-string v1, "workerCtl$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/a$c;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method private constructor <init>(LM8/a;)V
    .registers 4

    .line 1
    iput-object p1, p0, LM8/a$c;->x:LM8/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 4
    new-instance p1, LM8/l;

    invoke-direct {p1}, LM8/l;-><init>()V

    iput-object p1, p0, LM8/a$c;->q:LM8/l;

    .line 5
    new-instance p1, Lkotlin/jvm/internal/E;

    invoke-direct {p1}, Lkotlin/jvm/internal/E;-><init>()V

    iput-object p1, p0, LM8/a$c;->r:Lkotlin/jvm/internal/E;

    .line 6
    sget-object p1, LM8/a$d;->t:LM8/a$d;

    iput-object p1, p0, LM8/a$c;->s:LM8/a$d;

    .line 7
    sget-object p1, LM8/a;->B:LK8/D;

    iput-object p1, p0, LM8/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    long-to-int p1, v0

    if-eqz p1, :cond_32

    goto :goto_34

    :cond_32
    const/16 p1, 0x2a

    .line 9
    :goto_34
    iput p1, p0, LM8/a$c;->v:I

    return-void
.end method

.method public constructor <init>(LM8/a;I)V
    .registers 3

    .line 10
    invoke-direct {p0, p1}, LM8/a$c;-><init>(LM8/a;)V

    .line 11
    invoke-virtual {p0, p2}, LM8/a$c;->n(I)V

    return-void
.end method

.method public static final synthetic a(LM8/a$c;)LM8/a;
    .registers 1

    iget-object p0, p0, LM8/a$c;->x:LM8/a;

    return-object p0
.end method

.method private final b(LM8/h;)V
    .registers 5

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LM8/a$c;->t:J

    iget-object v0, p0, LM8/a$c;->s:LM8/a$d;

    sget-object v1, LM8/a$d;->s:LM8/a$d;

    if-ne v0, v1, :cond_e

    sget-object v0, LM8/a$d;->r:LM8/a$d;

    iput-object v0, p0, LM8/a$c;->s:LM8/a$d;

    :cond_e
    iget-boolean v0, p1, LM8/h;->r:Z

    if-eqz v0, :cond_3b

    sget-object v0, LM8/a$d;->r:LM8/a$d;

    invoke-virtual {p0, v0}, LM8/a$c;->r(LM8/a$d;)Z

    move-result v0

    if-eqz v0, :cond_1f

    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    invoke-virtual {v0}, LM8/a;->B0()V

    :cond_1f
    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    invoke-virtual {v0, p1}, LM8/a;->q0(LM8/h;)V

    iget-object p1, p0, LM8/a$c;->x:LM8/a;

    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/32 v1, -0x200000

    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    iget-object p1, p0, LM8/a$c;->s:LM8/a$d;

    sget-object v0, LM8/a$d;->u:LM8/a$d;

    if-eq p1, v0, :cond_3a

    sget-object p1, LM8/a$d;->t:LM8/a$d;

    iput-object p1, p0, LM8/a$c;->s:LM8/a$d;

    :cond_3a
    return-void

    :cond_3b
    iget-object p0, p0, LM8/a$c;->x:LM8/a;

    invoke-virtual {p0, p1}, LM8/a;->q0(LM8/h;)V

    return-void
.end method

.method private final c(Z)LM8/h;
    .registers 3

    if-eqz p1, :cond_2c

    iget-object p1, p0, LM8/a$c;->x:LM8/a;

    iget p1, p1, LM8/a;->q:I

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, LM8/a$c;->j(I)I

    move-result p1

    if-nez p1, :cond_10

    const/4 p1, 0x1

    goto :goto_11

    :cond_10
    const/4 p1, 0x0

    :goto_11
    if-eqz p1, :cond_1a

    invoke-direct {p0}, LM8/a$c;->l()LM8/h;

    move-result-object v0

    if-eqz v0, :cond_1a

    return-object v0

    :cond_1a
    iget-object v0, p0, LM8/a$c;->q:LM8/l;

    invoke-virtual {v0}, LM8/l;->k()LM8/h;

    move-result-object v0

    if-eqz v0, :cond_23

    return-object v0

    :cond_23
    if-nez p1, :cond_33

    invoke-direct {p0}, LM8/a$c;->l()LM8/h;

    move-result-object p1

    if-eqz p1, :cond_33

    return-object p1

    :cond_2c
    invoke-direct {p0}, LM8/a$c;->l()LM8/h;

    move-result-object p1

    if-eqz p1, :cond_33

    return-object p1

    :cond_33
    const/4 p1, 0x3

    invoke-direct {p0, p1}, LM8/a$c;->s(I)LM8/h;

    move-result-object p0

    return-object p0
.end method

.method private final d()LM8/h;
    .registers 2

    iget-object v0, p0, LM8/a$c;->q:LM8/l;

    invoke-virtual {v0}, LM8/l;->l()LM8/h;

    move-result-object v0

    if-nez v0, :cond_1a

    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    iget-object v0, v0, LM8/a;->v:LM8/d;

    invoke-virtual {v0}, LK8/p;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    if-nez v0, :cond_1a

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LM8/a$c;->s(I)LM8/h;

    move-result-object p0

    return-object p0

    :cond_1a
    return-object v0
.end method

.method public static final synthetic h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LM8/a$c;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final i()Z
    .registers 2

    iget-object p0, p0, LM8/a$c;->nextParkedWorker:Ljava/lang/Object;

    sget-object v0, LM8/a;->B:LK8/D;

    if-eq p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method private final k()V
    .registers 7

    iget-wide v0, p0, LM8/a$c;->t:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_13

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v4, p0, LM8/a$c;->x:LM8/a;

    iget-wide v4, v4, LM8/a;->s:J

    add-long/2addr v0, v4

    iput-wide v0, p0, LM8/a$c;->t:J

    :cond_13
    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    iget-wide v0, v0, LM8/a;->s:J

    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v4, p0, LM8/a$c;->t:J

    sub-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2a

    iput-wide v2, p0, LM8/a$c;->t:J

    invoke-direct {p0}, LM8/a$c;->t()V

    :cond_2a
    return-void
.end method

.method private final l()LM8/h;
    .registers 2

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LM8/a$c;->j(I)I

    move-result v0

    if-nez v0, :cond_1f

    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    iget-object v0, v0, LM8/a;->u:LM8/d;

    invoke-virtual {v0}, LK8/p;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    if-eqz v0, :cond_14

    return-object v0

    :cond_14
    iget-object p0, p0, LM8/a$c;->x:LM8/a;

    iget-object p0, p0, LM8/a;->v:LM8/d;

    invoke-virtual {p0}, LK8/p;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LM8/h;

    return-object p0

    :cond_1f
    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    iget-object v0, v0, LM8/a;->v:LM8/d;

    invoke-virtual {v0}, LK8/p;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    if-eqz v0, :cond_2c

    return-object v0

    :cond_2c
    iget-object p0, p0, LM8/a$c;->x:LM8/a;

    iget-object p0, p0, LM8/a;->u:LM8/d;

    invoke-virtual {p0}, LK8/p;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LM8/h;

    return-object p0
.end method

.method private final m()V
    .registers 8

    const/4 v0, 0x0

    :goto_1
    move v1, v0

    :goto_2
    iget-object v2, p0, LM8/a$c;->x:LM8/a;

    invoke-virtual {v2}, LM8/a;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_40

    iget-object v2, p0, LM8/a$c;->s:LM8/a$d;

    sget-object v3, LM8/a$d;->u:LM8/a$d;

    if-eq v2, v3, :cond_40

    iget-boolean v2, p0, LM8/a$c;->w:Z

    invoke-virtual {p0, v2}, LM8/a$c;->e(Z)LM8/h;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_20

    iput-wide v3, p0, LM8/a$c;->u:J

    invoke-direct {p0, v2}, LM8/a$c;->b(LM8/h;)V

    goto :goto_1

    :cond_20
    iput-boolean v0, p0, LM8/a$c;->w:Z

    iget-wide v5, p0, LM8/a$c;->u:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_3c

    if-nez v1, :cond_2c

    const/4 v1, 0x1

    goto :goto_2

    :cond_2c
    sget-object v1, LM8/a$d;->s:LM8/a$d;

    invoke-virtual {p0, v1}, LM8/a$c;->r(LM8/a$d;)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    iget-wide v1, p0, LM8/a$c;->u:J

    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    iput-wide v3, p0, LM8/a$c;->u:J

    goto :goto_1

    :cond_3c
    invoke-direct {p0}, LM8/a$c;->q()V

    goto :goto_2

    :cond_40
    sget-object v0, LM8/a$d;->u:LM8/a$d;

    invoke-virtual {p0, v0}, LM8/a$c;->r(LM8/a$d;)Z

    return-void
.end method

.method private final p()Z
    .registers 10

    iget-object v0, p0, LM8/a$c;->s:LM8/a$d;

    sget-object v1, LM8/a$d;->q:LM8/a$d;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_8

    return v2

    :cond_8
    iget-object v4, p0, LM8/a$c;->x:LM8/a;

    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_e
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    const-wide v7, 0x7ffffc0000000000L

    and-long/2addr v7, v5

    const/16 v1, 0x2a

    shr-long/2addr v7, v1

    long-to-int v1, v7

    if-nez v1, :cond_20

    const/4 p0, 0x0

    return p0

    :cond_20
    const-wide v7, 0x40000000000L

    sub-long v7, v5, v7

    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v0, LM8/a$d;->q:LM8/a$d;

    iput-object v0, p0, LM8/a$c;->s:LM8/a$d;

    return v2
.end method

.method private final q()V
    .registers 4

    invoke-direct {p0}, LM8/a$c;->i()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    invoke-virtual {v0, p0}, LM8/a;->Y(LM8/a$c;)Z

    return-void

    :cond_c
    invoke-static {}, LM8/a$c;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    :goto_14
    invoke-direct {p0}, LM8/a$c;->i()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-static {}, LM8/a$c;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v1, :cond_3f

    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    invoke-virtual {v0}, LM8/a;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_3f

    iget-object v0, p0, LM8/a$c;->s:LM8/a$d;

    sget-object v2, LM8/a$d;->u:LM8/a$d;

    if-ne v0, v2, :cond_33

    goto :goto_3f

    :cond_33
    sget-object v0, LM8/a$d;->s:LM8/a$d;

    invoke-virtual {p0, v0}, LM8/a$c;->r(LM8/a$d;)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    invoke-direct {p0}, LM8/a$c;->k()V

    goto :goto_14

    :cond_3f
    :goto_3f
    return-void
.end method

.method private final s(I)LM8/h;
    .registers 19

    move-object/from16 v0, p0

    iget-object v1, v0, LM8/a$c;->x:LM8/a;

    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide/32 v3, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v1, v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_16

    return-object v3

    :cond_16
    invoke-virtual {v0, v1}, LM8/a$c;->j(I)I

    move-result v2

    iget-object v4, v0, LM8/a$c;->x:LM8/a;

    const-wide v5, 0x7fffffffffffffffL

    const/4 v7, 0x0

    move-wide v8, v5

    :goto_23
    const-wide/16 v10, 0x0

    if-ge v7, v1, :cond_5f

    const/4 v12, 0x1

    add-int/2addr v2, v12

    if-le v2, v1, :cond_2c

    move v2, v12

    :cond_2c
    iget-object v12, v4, LM8/a;->w:LK8/y;

    invoke-virtual {v12, v2}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LM8/a$c;

    if-eqz v12, :cond_5a

    if-eq v12, v0, :cond_5a

    iget-object v12, v12, LM8/a$c;->q:LM8/l;

    iget-object v13, v0, LM8/a$c;->r:Lkotlin/jvm/internal/E;

    move/from16 v14, p1

    invoke-virtual {v12, v14, v13}, LM8/l;->r(ILkotlin/jvm/internal/E;)J

    move-result-wide v12

    const-wide/16 v15, -0x1

    cmp-long v15, v12, v15

    if-nez v15, :cond_51

    iget-object v0, v0, LM8/a$c;->r:Lkotlin/jvm/internal/E;

    iget-object v1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v1, LM8/h;

    iput-object v3, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    return-object v1

    :cond_51
    cmp-long v10, v12, v10

    if-lez v10, :cond_5c

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    goto :goto_5c

    :cond_5a
    move/from16 v14, p1

    :cond_5c
    :goto_5c
    add-int/lit8 v7, v7, 0x1

    goto :goto_23

    :cond_5f
    cmp-long v1, v8, v5

    if-eqz v1, :cond_64

    goto :goto_65

    :cond_64
    move-wide v8, v10

    :goto_65
    iput-wide v8, v0, LM8/a$c;->u:J

    return-object v3
.end method

.method private final t()V
    .registers 9

    iget-object v0, p0, LM8/a$c;->x:LM8/a;

    iget-object v1, v0, LM8/a;->w:LK8/y;

    monitor-enter v1

    :try_start_5
    invoke-virtual {v0}, LM8/a;->isTerminated()Z

    move-result v2
    :try_end_9
    .catchall {:try_start_5 .. :try_end_9} :catchall_5b

    if-eqz v2, :cond_d

    monitor-exit v1

    return-void

    :cond_d
    :try_start_d
    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/32 v4, 0x1fffff

    and-long/2addr v2, v4

    long-to-int v2, v2

    iget v3, v0, LM8/a;->q:I
    :try_end_1c
    .catchall {:try_start_d .. :try_end_1c} :catchall_5b

    if-gt v2, v3, :cond_20

    monitor-exit v1

    return-void

    :cond_20
    :try_start_20
    invoke-static {}, LM8/a$c;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v6, 0x1

    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v2
    :try_end_2a
    .catchall {:try_start_20 .. :try_end_2a} :catchall_5b

    if-nez v2, :cond_2e

    monitor-exit v1

    return-void

    :cond_2e
    :try_start_2e
    iget v2, p0, LM8/a$c;->indexInArray:I

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, LM8/a$c;->n(I)V

    invoke-virtual {v0, p0, v2, v3}, LM8/a;->b0(LM8/a$c;II)V

    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v6

    and-long v3, v6, v4

    long-to-int v3, v3

    if-eq v3, v2, :cond_5d

    iget-object v4, v0, LM8/a;->w:LK8/y;

    invoke-virtual {v4, v3}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v4, LM8/a$c;

    iget-object v5, v0, LM8/a;->w:LK8/y;

    invoke-virtual {v5, v2, v4}, LK8/y;->c(ILjava/lang/Object;)V

    invoke-virtual {v4, v2}, LM8/a$c;->n(I)V

    invoke-virtual {v0, v4, v3, v2}, LM8/a;->b0(LM8/a$c;II)V

    goto :goto_5d

    :catchall_5b
    move-exception p0

    goto :goto_6b

    :cond_5d
    :goto_5d
    iget-object v0, v0, LM8/a;->w:LK8/y;

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2}, LK8/y;->c(ILjava/lang/Object;)V

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_65
    .catchall {:try_start_2e .. :try_end_65} :catchall_5b

    monitor-exit v1

    sget-object v0, LM8/a$d;->u:LM8/a$d;

    iput-object v0, p0, LM8/a$c;->s:LM8/a$d;

    return-void

    :goto_6b
    monitor-exit v1

    throw p0
.end method


# virtual methods
.method public final e(Z)LM8/h;
    .registers 3

    invoke-direct {p0}, LM8/a$c;->p()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0, p1}, LM8/a$c;->c(Z)LM8/h;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-direct {p0}, LM8/a$c;->d()LM8/h;

    move-result-object p0

    return-object p0
.end method

.method public final f()I
    .registers 1

    iget p0, p0, LM8/a$c;->indexInArray:I

    return p0
.end method

.method public final g()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LM8/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-object p0
.end method

.method public final j(I)I
    .registers 4

    iget v0, p0, LM8/a$c;->v:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    iput v0, p0, LM8/a$c;->v:I

    add-int/lit8 p0, p1, -0x1

    and-int v1, p0, p1

    if-nez v1, :cond_15

    and-int/2addr p0, v0

    return p0

    :cond_15
    const p0, 0x7fffffff

    and-int/2addr p0, v0

    rem-int/2addr p0, p1

    return p0
.end method

.method public final n(I)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LM8/a$c;->x:LM8/a;

    iget-object v1, v1, LM8/a;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_16

    const-string v1, "TERMINATED"

    goto :goto_1a

    :cond_16
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_1a
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iput p1, p0, LM8/a$c;->indexInArray:I

    return-void
.end method

.method public final o(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, LM8/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final r(LM8/a$d;)Z
    .registers 8

    iget-object v0, p0, LM8/a$c;->s:LM8/a$d;

    sget-object v1, LM8/a$d;->q:LM8/a$d;

    if-ne v0, v1, :cond_8

    const/4 v1, 0x1

    goto :goto_9

    :cond_8
    const/4 v1, 0x0

    :goto_9
    if-eqz v1, :cond_19

    iget-object v2, p0, LM8/a$c;->x:LM8/a;

    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    const-wide v4, 0x40000000000L

    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    :cond_19
    if-eq v0, p1, :cond_1d

    iput-object p1, p0, LM8/a$c;->s:LM8/a$d;

    :cond_1d
    return v1
.end method

.method public run()V
    .registers 1

    invoke-direct {p0}, LM8/a$c;->m()V

    return-void
.end method
