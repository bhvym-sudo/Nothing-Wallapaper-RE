.class public final LM8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field private volatile synthetic blockingTasksInBuffer$volatile:I

.field private volatile synthetic consumerIndex$volatile:I

.field private volatile synthetic lastScheduledTask$volatile:Ljava/lang/Object;

.field private volatile synthetic producerIndex$volatile:I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "lastScheduledTask$volatile"

    const-class v2, LM8/l;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/l;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "producerIndex$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/l;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "consumerIndex$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/l;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "blockingTasksInBuffer$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LM8/l;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, LM8/l;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method private final b(LM8/h;)LM8/h;
    .registers 4

    invoke-direct {p0}, LM8/l;->e()I

    move-result v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_9

    return-object p1

    :cond_9
    iget-boolean v0, p1, LM8/h;->r:Z

    if-eqz v0, :cond_14

    invoke-static {}, LM8/l;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    :cond_14
    invoke-static {}, LM8/l;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    and-int/2addr v0, v1

    :goto_1d
    iget-object v1, p0, LM8/l;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_29

    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_1d

    :cond_29
    iget-object v1, p0, LM8/l;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    invoke-static {}, LM8/l;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method private final c(LM8/h;)V
    .registers 2

    if-eqz p1, :cond_d

    iget-boolean p1, p1, LM8/h;->r:Z

    if-eqz p1, :cond_d

    invoke-static {}, LM8/l;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    :cond_d
    return-void
.end method

.method private static final synthetic d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LM8/l;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final e()I
    .registers 3

    invoke-static {}, LM8/l;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, LM8/l;->f()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method private static final synthetic f()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LM8/l;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private static final synthetic g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LM8/l;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LM8/l;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final m()LM8/h;
    .registers 6

    :cond_0
    :goto_0
    invoke-static {}, LM8/l;->f()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, LM8/l;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    const/4 v2, 0x0

    if-nez v1, :cond_16

    return-object v2

    :cond_16
    and-int/lit8 v1, v0, 0x7f

    invoke-static {}, LM8/l;->f()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v3

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {v3, p0, v0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LM8/l;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    if-nez v0, :cond_2f

    goto :goto_0

    :cond_2f
    invoke-direct {p0, v0}, LM8/l;->c(LM8/h;)V

    return-object v0
.end method

.method private final n(LM8/d;)Z
    .registers 2

    invoke-direct {p0}, LM8/l;->m()LM8/h;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    invoke-virtual {p1, p0}, LK8/p;->a(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0
.end method

.method private final o(Z)LM8/h;
    .registers 6

    :cond_0
    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    const/4 v1, 0x0

    if-nez v0, :cond_e

    goto :goto_1d

    :cond_e
    iget-boolean v2, v0, LM8/h;->r:Z

    if-ne v2, p1, :cond_1d

    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1d
    :goto_1d
    invoke-static {}, LM8/l;->f()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, LM8/l;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    :cond_2d
    if-eq v0, v2, :cond_45

    if-eqz p1, :cond_3c

    invoke-static {}, LM8/l;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v3

    if-nez v3, :cond_3c

    return-object v1

    :cond_3c
    add-int/lit8 v2, v2, -0x1

    invoke-direct {p0, v2, p1}, LM8/l;->q(IZ)LM8/h;

    move-result-object v3

    if-eqz v3, :cond_2d

    return-object v3

    :cond_45
    return-object v1
.end method

.method private final p(I)LM8/h;
    .registers 6

    invoke-static {}, LM8/l;->f()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, LM8/l;->h()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_14

    goto :goto_15

    :cond_14
    const/4 v2, 0x0

    :goto_15
    const/4 p1, 0x0

    if-eq v0, v1, :cond_30

    if-eqz v2, :cond_25

    invoke-static {}, LM8/l;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v3

    if-nez v3, :cond_25

    return-object p1

    :cond_25
    add-int/lit8 p1, v0, 0x1

    invoke-direct {p0, v0, v2}, LM8/l;->q(IZ)LM8/h;

    move-result-object v0

    if-nez v0, :cond_2f

    move v0, p1

    goto :goto_15

    :cond_2f
    return-object v0

    :cond_30
    return-object p1
.end method

.method private final q(IZ)LM8/h;
    .registers 6

    and-int/lit8 p1, p1, 0x7f

    iget-object v0, p0, LM8/l;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_23

    iget-boolean v2, v0, LM8/h;->r:Z

    if-ne v2, p2, :cond_23

    iget-object v2, p0, LM8/l;->a:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v2, p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_23

    if-eqz p2, :cond_22

    invoke-static {}, LM8/l;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    :cond_22
    return-object v0

    :cond_23
    return-object v1
.end method

.method private final s(ILkotlin/jvm/internal/E;)J
    .registers 9

    :cond_0
    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    const-wide/16 v1, -0x2

    if-nez v0, :cond_f

    return-wide v1

    :cond_f
    iget-boolean v3, v0, LM8/h;->r:Z

    if-eqz v3, :cond_15

    const/4 v3, 0x1

    goto :goto_16

    :cond_15
    const/4 v3, 0x2

    :goto_16
    and-int/2addr v3, p1

    if-nez v3, :cond_1a

    return-wide v1

    :cond_1a
    sget-object v1, LM8/j;->f:LM8/g;

    invoke-virtual {v1}, LM8/g;->a()J

    move-result-wide v1

    iget-wide v3, v0, LM8/h;->q:J

    sub-long/2addr v1, v3

    sget-wide v3, LM8/j;->b:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_2b

    sub-long/2addr v3, v1

    return-wide v3

    :cond_2b
    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iput-object v0, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    const-wide/16 p0, -0x1

    return-wide p0
.end method


# virtual methods
.method public final a(LM8/h;Z)LM8/h;
    .registers 3

    if-eqz p2, :cond_7

    invoke-direct {p0, p1}, LM8/l;->b(LM8/h;)LM8/h;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM8/h;

    if-nez p1, :cond_15

    const/4 p0, 0x0

    return-object p0

    :cond_15
    invoke-direct {p0, p1}, LM8/l;->b(LM8/h;)LM8/h;

    move-result-object p0

    return-object p0
.end method

.method public final i()I
    .registers 2

    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, LM8/l;->e()I

    move-result p0

    if-eqz v0, :cond_10

    add-int/lit8 p0, p0, 0x1

    :cond_10
    return p0
.end method

.method public final j(LM8/d;)V
    .registers 4

    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    if-eqz v0, :cond_10

    invoke-virtual {p1, v0}, LK8/p;->a(Ljava/lang/Object;)Z

    :cond_10
    invoke-direct {p0, p1}, LM8/l;->n(LM8/d;)Z

    move-result v0

    if-nez v0, :cond_10

    return-void
.end method

.method public final k()LM8/h;
    .registers 3

    invoke-static {}, LM8/l;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM8/h;

    if-nez v0, :cond_12

    invoke-direct {p0}, LM8/l;->m()LM8/h;

    move-result-object p0

    return-object p0

    :cond_12
    return-object v0
.end method

.method public final l()LM8/h;
    .registers 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LM8/l;->o(Z)LM8/h;

    move-result-object p0

    return-object p0
.end method

.method public final r(ILkotlin/jvm/internal/E;)J
    .registers 4

    const/4 v0, 0x3

    if-ne p1, v0, :cond_8

    invoke-direct {p0}, LM8/l;->m()LM8/h;

    move-result-object v0

    goto :goto_c

    :cond_8
    invoke-direct {p0, p1}, LM8/l;->p(I)LM8/h;

    move-result-object v0

    :goto_c
    if-eqz v0, :cond_13

    iput-object v0, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_13
    invoke-direct {p0, p1, p2}, LM8/l;->s(ILkotlin/jvm/internal/E;)J

    move-result-wide p0

    return-wide p0
.end method
