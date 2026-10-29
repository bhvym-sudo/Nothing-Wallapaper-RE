.class public final LM8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/a$a;,
        LM8/a$b;,
        LM8/a$c;,
        LM8/a$d;
    }
.end annotation


# static fields
.field private static final synthetic A:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final B:LK8/D;

.field public static final x:LM8/a$a;

.field private static final synthetic y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile synthetic _isTerminated$volatile:I

.field private volatile synthetic controlState$volatile:J

.field private volatile synthetic parkedWorkersStack$volatile:J

.field public final q:I

.field public final r:I

.field public final s:J

.field public final t:Ljava/lang/String;

.field public final u:LM8/d;

.field public final v:LM8/d;

.field public final w:LK8/y;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LM8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM8/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LM8/a;->x:LM8/a$a;

    const-string v0, "parkedWorkersStack$volatile"

    const-class v1, LM8/a;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/a;->y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "controlState$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/a;->z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_isTerminated$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/a;->A:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    new-instance v0, LK8/D;

    const-string v1, "NOT_IN_STACK"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LM8/a;->B:LK8/D;

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LM8/a;->q:I

    iput p2, p0, LM8/a;->r:I

    iput-wide p3, p0, LM8/a;->s:J

    iput-object p5, p0, LM8/a;->t:Ljava/lang/String;

    const/4 p5, 0x1

    if-lt p1, p5, :cond_9c

    const-string p5, "Max pool size "

    if-lt p2, p1, :cond_7b

    const v0, 0x1ffffe

    if-gt p2, v0, :cond_5d

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-lez p2, :cond_3d

    new-instance p2, LM8/d;

    invoke-direct {p2}, LM8/d;-><init>()V

    iput-object p2, p0, LM8/a;->u:LM8/d;

    new-instance p2, LM8/d;

    invoke-direct {p2}, LM8/d;-><init>()V

    iput-object p2, p0, LM8/a;->v:LM8/d;

    new-instance p2, LK8/y;

    add-int/lit8 p3, p1, 0x1

    mul-int/lit8 p3, p3, 0x2

    invoke-direct {p2, p3}, LK8/y;-><init>(I)V

    iput-object p2, p0, LM8/a;->w:LK8/y;

    int-to-long p1, p1

    const/16 p3, 0x2a

    shl-long/2addr p1, p3

    iput-wide p1, p0, LM8/a;->controlState$volatile:J

    return-void

    :cond_3d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Idle worker keep alive time "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " must be positive"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " should not exceed maximal supported number of threads 2097150"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " should be greater than or equals to core pool size "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9c
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Core pool size "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " should be at least 1"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final A0(J)V
    .registers 4

    invoke-direct {p0}, LM8/a;->T0()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_d

    :cond_7
    invoke-direct {p0, p1, p2}, LM8/a;->O0(J)Z

    move-result p1

    if-eqz p1, :cond_e

    :goto_d
    return-void

    :cond_e
    invoke-direct {p0}, LM8/a;->T0()Z

    return-void
.end method

.method public static synthetic B(LM8/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V
    .registers 7

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_6

    move p2, v0

    :cond_6
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_b

    move p3, v0

    :cond_b
    invoke-virtual {p0, p1, p2, p3}, LM8/a;->z(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method private static final synthetic G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LM8/a;->z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private static final synthetic I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LM8/a;->y:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final I0(LM8/a$c;LM8/h;Z)LM8/h;
    .registers 5

    if-nez p1, :cond_3

    goto :goto_9

    :cond_3
    iget-object p0, p1, LM8/a$c;->s:LM8/a$d;

    sget-object v0, LM8/a$d;->u:LM8/a$d;

    if-ne p0, v0, :cond_a

    :goto_9
    return-object p2

    :cond_a
    iget-boolean v0, p2, LM8/h;->r:Z

    if-nez v0, :cond_13

    sget-object v0, LM8/a$d;->r:LM8/a$d;

    if-ne p0, v0, :cond_13

    return-object p2

    :cond_13
    const/4 p0, 0x1

    iput-boolean p0, p1, LM8/a$c;->w:Z

    iget-object p0, p1, LM8/a$c;->q:LM8/l;

    invoke-virtual {p0, p2, p3}, LM8/l;->a(LM8/h;Z)LM8/h;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic K()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LM8/a;->A:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final O0(J)Z
    .registers 6

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, p1

    long-to-int v0, v0

    const-wide v1, 0x3ffffe00000L

    and-long/2addr p1, v1

    const/16 v1, 0x15

    shr-long/2addr p1, v1

    long-to-int p1, p1

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    invoke-static {v0, p1}, LB8/h;->f(II)I

    move-result p2

    iget v0, p0, LM8/a;->q:I

    if-ge p2, v0, :cond_2a

    invoke-direct {p0}, LM8/a;->f()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_27

    iget v1, p0, LM8/a;->q:I

    if-le v1, v0, :cond_27

    invoke-direct {p0}, LM8/a;->f()I

    :cond_27
    if-lez p2, :cond_2a

    return v0

    :cond_2a
    return p1
.end method

.method static synthetic P0(LM8/a;JILjava/lang/Object;)Z
    .registers 5

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_c

    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide p1

    :cond_c
    invoke-direct {p0, p1, p2}, LM8/a;->O0(J)Z

    move-result p0

    return p0
.end method

.method private final Q(LM8/a$c;)I
    .registers 2

    invoke-virtual {p1}, LM8/a$c;->g()Ljava/lang/Object;

    move-result-object p0

    :goto_4
    sget-object p1, LM8/a;->B:LK8/D;

    if-ne p0, p1, :cond_a

    const/4 p0, -0x1

    return p0

    :cond_a
    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    check-cast p0, LM8/a$c;

    invoke-virtual {p0}, LM8/a$c;->f()I

    move-result p1

    if-eqz p1, :cond_17

    return p1

    :cond_17
    invoke-virtual {p0}, LM8/a$c;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_4
.end method

.method private final T0()Z
    .registers 5

    :cond_0
    invoke-direct {p0}, LM8/a;->U()LM8/a$c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    :cond_8
    invoke-static {}, LM8/a$c;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final U()LM8/a$c;
    .registers 11

    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v1, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v1, v1

    iget-object v2, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v2, v1}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LM8/a$c;

    if-nez v7, :cond_1a

    const/4 p0, 0x0

    return-object p0

    :cond_1a
    const-wide/32 v1, 0x200000

    add-long/2addr v1, v3

    const-wide/32 v5, -0x200000

    and-long/2addr v1, v5

    invoke-direct {p0, v7}, LM8/a;->Q(LM8/a$c;)I

    move-result v5

    if-ltz v5, :cond_4

    move-wide v8, v1

    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    int-to-long v5, v5

    or-long/2addr v5, v8

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_3c

    sget-object p0, LM8/a;->B:LK8/D;

    invoke-virtual {v7, p0}, LM8/a$c;->o(Ljava/lang/Object;)V

    return-object v7

    :cond_3c
    move-object p0, v2

    goto :goto_4
.end method

.method public static final synthetic a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final b(LM8/h;)Z
    .registers 3

    iget-boolean v0, p1, LM8/h;->r:Z

    if-eqz v0, :cond_b

    iget-object p0, p0, LM8/a;->v:LM8/d;

    invoke-virtual {p0, p1}, LK8/p;->a(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_b
    iget-object p0, p0, LM8/a;->u:LM8/d;

    invoke-virtual {p0, p1}, LK8/p;->a(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final f()I
    .registers 9

    iget-object v0, p0, LM8/a;->w:LK8/y;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, LM8/a;->isTerminated()Z

    move-result v1
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_72

    if-eqz v1, :cond_c

    monitor-exit v0

    const/4 p0, -0x1

    return p0

    :cond_c
    :try_start_c
    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide/32 v3, 0x1fffff

    and-long v5, v1, v3

    long-to-int v5, v5

    const-wide v6, 0x3ffffe00000L

    and-long/2addr v1, v6

    const/16 v6, 0x15

    shr-long/2addr v1, v6

    long-to-int v1, v1

    sub-int v1, v5, v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LB8/h;->f(II)I

    move-result v1

    iget v6, p0, LM8/a;->q:I
    :try_end_2d
    .catchall {:try_start_c .. :try_end_2d} :catchall_72

    if-lt v1, v6, :cond_31

    monitor-exit v0

    return v2

    :cond_31
    :try_start_31
    iget v6, p0, LM8/a;->r:I
    :try_end_33
    .catchall {:try_start_31 .. :try_end_33} :catchall_72

    if-lt v5, v6, :cond_37

    monitor-exit v0

    return v2

    :cond_37
    :try_start_37
    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    and-long/2addr v5, v3

    long-to-int v2, v5

    add-int/lit8 v2, v2, 0x1

    if-lez v2, :cond_74

    iget-object v5, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v5, v2}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_74

    new-instance v5, LM8/a$c;

    invoke-direct {v5, p0, v2}, LM8/a$c;-><init>(LM8/a;I)V

    iget-object v6, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v6, v2, v5}, LK8/y;->c(ILjava/lang/Object;)V

    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v6
    :try_end_5f
    .catchall {:try_start_37 .. :try_end_5f} :catchall_72

    and-long/2addr v3, v6

    long-to-int p0, v3

    if-ne v2, p0, :cond_6a

    add-int/lit8 v1, v1, 0x1

    monitor-exit v0

    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    return v1

    :cond_6a
    :try_start_6a
    const-string p0, "Failed requirement."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_72
    move-exception p0

    goto :goto_7c

    :cond_74
    const-string p0, "Failed requirement."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_7c
    .catchall {:try_start_6a .. :try_end_7c} :catchall_72

    :goto_7c
    monitor-exit v0

    throw p0
.end method

.method private final u()LM8/a$c;
    .registers 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, LM8/a$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    check-cast v0, LM8/a$c;

    goto :goto_d

    :cond_c
    move-object v0, v2

    :goto_d
    if-eqz v0, :cond_1a

    invoke-static {v0}, LM8/a$c;->a(LM8/a$c;)LM8/a;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1a

    return-object v0

    :cond_1a
    return-object v2
.end method


# virtual methods
.method public final B0()V
    .registers 5

    invoke-direct {p0}, LM8/a;->T0()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_11

    :cond_7
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, v2, v3, v0, v1}, LM8/a;->P0(LM8/a;JILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    :goto_11
    return-void

    :cond_12
    invoke-direct {p0}, LM8/a;->T0()Z

    return-void
.end method

.method public final Y(LM8/a$c;)Z
    .registers 11

    invoke-virtual {p1}, LM8/a$c;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LM8/a;->B:LK8/D;

    if-eq v0, v1, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_e
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v1, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v1, v1

    const-wide/32 v5, 0x200000

    add-long/2addr v5, v3

    const-wide/32 v7, -0x200000

    and-long/2addr v5, v7

    invoke-virtual {p1}, LM8/a$c;->f()I

    move-result v2

    iget-object v7, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v7, v1}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, LM8/a$c;->o(Ljava/lang/Object;)V

    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    int-to-long v7, v2

    or-long/2addr v5, v7

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_3b

    const/4 p0, 0x1

    return p0

    :cond_3b
    move-object p0, v2

    goto :goto_e
.end method

.method public final b0(LM8/a$c;II)V
    .registers 13

    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v1, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v1, v1

    const-wide/32 v5, 0x200000

    add-long/2addr v5, v3

    const-wide/32 v7, -0x200000

    and-long/2addr v5, v7

    if-ne v1, p2, :cond_1f

    if-nez p3, :cond_1e

    invoke-direct {p0, p1}, LM8/a;->Q(LM8/a$c;)I

    move-result v1

    goto :goto_1f

    :cond_1e
    move v1, p3

    :cond_1f
    :goto_1f
    if-ltz v1, :cond_4

    move v2, v1

    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    int-to-long v7, v2

    or-long/2addr v5, v7

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_30

    return-void

    :cond_30
    move-object p0, v2

    goto :goto_4
.end method

.method public close()V
    .registers 3

    const-wide/16 v0, 0x2710

    invoke-virtual {p0, v0, v1}, LM8/a;->t0(J)V

    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .registers 8

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LM8/a;->B(LM8/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public final isTerminated()Z
    .registers 2

    invoke-static {}, LM8/a;->K()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_c

    return v0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final j(Ljava/lang/Runnable;Z)LM8/h;
    .registers 5

    sget-object p0, LM8/j;->f:LM8/g;

    invoke-virtual {p0}, LM8/g;->a()J

    move-result-wide v0

    instance-of p0, p1, LM8/h;

    if-eqz p0, :cond_11

    check-cast p1, LM8/h;

    iput-wide v0, p1, LM8/h;->q:J

    iput-boolean p2, p1, LM8/h;->r:Z

    return-object p1

    :cond_11
    invoke-static {p1, v0, v1, p2}, LM8/j;->b(Ljava/lang/Runnable;JZ)LM8/h;

    move-result-object p0

    return-object p0
.end method

.method public final q0(LM8/h;)V
    .registers 3

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_3
    .catchall {:try_start_0 .. :try_end_3} :catchall_7

    invoke-static {}, LF8/c;->a()LF8/b;

    return-void

    :catchall_7
    move-exception p0

    :try_start_8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_13
    .catchall {:try_start_8 .. :try_end_13} :catchall_17

    invoke-static {}, LF8/c;->a()LF8/b;

    return-void

    :catchall_17
    move-exception p0

    invoke-static {}, LF8/c;->a()LF8/b;

    throw p0
.end method

.method public final t0(J)V
    .registers 10

    invoke-static {}, LM8/a;->K()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    invoke-direct {p0}, LM8/a;->u()LM8/a$c;

    move-result-object v0

    iget-object v1, p0, LM8/a;->w:LK8/y;

    monitor-enter v1

    :try_start_14
    invoke-static {}, LM8/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3
    :try_end_1c
    .catchall {:try_start_14 .. :try_end_1c} :catchall_8f

    const-wide/32 v5, 0x1fffff

    and-long/2addr v3, v5

    long-to-int v3, v3

    monitor-exit v1

    if-gt v2, v3, :cond_4d

    move v1, v2

    :goto_25
    iget-object v4, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v4, v1}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v4, LM8/a$c;

    if-eq v4, v0, :cond_48

    :goto_32
    invoke-virtual {v4}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v5

    sget-object v6, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v5, v6, :cond_41

    invoke-static {v4}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    invoke-virtual {v4, p1, p2}, Ljava/lang/Thread;->join(J)V

    goto :goto_32

    :cond_41
    iget-object v4, v4, LM8/a$c;->q:LM8/l;

    iget-object v5, p0, LM8/a;->v:LM8/d;

    invoke-virtual {v4, v5}, LM8/l;->j(LM8/d;)V

    :cond_48
    if-eq v1, v3, :cond_4d

    add-int/lit8 v1, v1, 0x1

    goto :goto_25

    :cond_4d
    iget-object p1, p0, LM8/a;->v:LM8/d;

    invoke-virtual {p1}, LK8/p;->b()V

    iget-object p1, p0, LM8/a;->u:LM8/d;

    invoke-virtual {p1}, LK8/p;->b()V

    :goto_57
    if-eqz v0, :cond_5f

    invoke-virtual {v0, v2}, LM8/a$c;->e(Z)LM8/h;

    move-result-object p1

    if-nez p1, :cond_8b

    :cond_5f
    iget-object p1, p0, LM8/a;->u:LM8/d;

    invoke-virtual {p1}, LK8/p;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM8/h;

    if-nez p1, :cond_8b

    iget-object p1, p0, LM8/a;->v:LM8/d;

    invoke-virtual {p1}, LK8/p;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM8/h;

    if-nez p1, :cond_8b

    if-eqz v0, :cond_7a

    sget-object p1, LM8/a$d;->u:LM8/a$d;

    invoke-virtual {v0, p1}, LM8/a$c;->r(LM8/a$d;)Z

    :cond_7a
    invoke-static {}, LM8/a;->I()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    return-void

    :cond_8b
    invoke-virtual {p0, p1}, LM8/a;->q0(LM8/h;)V

    goto :goto_57

    :catchall_8f
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 13

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v1}, LK8/y;->a()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    move v5, v4

    move v6, v5

    move v7, v6

    move v8, v3

    :goto_12
    if-ge v8, v1, :cond_94

    iget-object v9, p0, LM8/a;->w:LK8/y;

    invoke-virtual {v9, v8}, LK8/y;->b(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LM8/a$c;

    if-nez v9, :cond_20

    goto/16 :goto_90

    :cond_20
    iget-object v10, v9, LM8/a$c;->q:LM8/l;

    invoke-virtual {v10}, LM8/l;->i()I

    move-result v10

    iget-object v9, v9, LM8/a$c;->s:LM8/a$d;

    sget-object v11, LM8/a$b;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v11, v9

    if-eq v9, v3, :cond_8e

    const/4 v11, 0x2

    if-eq v9, v11, :cond_77

    const/4 v11, 0x3

    if-eq v9, v11, :cond_60

    const/4 v11, 0x4

    if-eq v9, v11, :cond_47

    const/4 v10, 0x5

    if-ne v9, v10, :cond_41

    add-int/lit8 v7, v7, 0x1

    goto :goto_90

    :cond_41
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_47
    add-int/lit8 v6, v6, 0x1

    if-lez v10, :cond_90

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x64

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_90

    :cond_60
    add-int/lit8 v2, v2, 0x1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x63

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_90

    :cond_77
    add-int/lit8 v4, v4, 0x1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x62

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_90

    :cond_8e
    add-int/lit8 v5, v5, 0x1

    :cond_90
    :goto_90
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_12

    :cond_94
    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, LM8/a;->t:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[Pool Size {core = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LM8/a;->q:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", max = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LM8/a;->r:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "}, Worker States {CPU = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", blocking = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", parked = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", dormant = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", terminated = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "}, running workers queues = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", global CPU queue size = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LM8/a;->u:LM8/d;

    invoke-virtual {v0}, LK8/p;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", global blocking queue size = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LM8/a;->v:LM8/d;

    invoke-virtual {v0}, LK8/p;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", Control State {created workers= "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/32 v2, 0x1fffff

    and-long/2addr v2, v8

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", blocking tasks = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, 0x3ffffe00000L

    and-long/2addr v2, v8

    const/16 v0, 0x15

    shr-long/2addr v2, v0

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", CPUs acquired = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LM8/a;->q:I

    const-wide v2, 0x7ffffc0000000000L

    and-long/2addr v2, v8

    const/16 v0, 0x2a

    shr-long/2addr v2, v0

    long-to-int v0, v2

    sub-int/2addr p0, v0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "}]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final z(Ljava/lang/Runnable;ZZ)V
    .registers 7

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-virtual {p0, p1, p2}, LM8/a;->j(Ljava/lang/Runnable;Z)LM8/h;

    move-result-object p1

    iget-boolean p2, p1, LM8/h;->r:Z

    if-eqz p2, :cond_17

    invoke-static {}, LM8/a;->G()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/32 v1, 0x200000

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v0

    goto :goto_19

    :cond_17
    const-wide/16 v0, 0x0

    :goto_19
    invoke-direct {p0}, LM8/a;->u()LM8/a$c;

    move-result-object v2

    invoke-direct {p0, v2, p1, p3}, LM8/a;->I0(LM8/a$c;LM8/h;Z)LM8/h;

    move-result-object p1

    if-eqz p1, :cond_43

    invoke-direct {p0, p1}, LM8/a;->b(LM8/h;)Z

    move-result p1

    if-eqz p1, :cond_2a

    goto :goto_43

    :cond_2a
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, LM8/a;->t:Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " was terminated"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_43
    :goto_43
    if-eqz p2, :cond_49

    invoke-direct {p0, v0, v1}, LM8/a;->A0(J)V

    return-void

    :cond_49
    invoke-virtual {p0}, LM8/a;->B0()V

    return-void
.end method
