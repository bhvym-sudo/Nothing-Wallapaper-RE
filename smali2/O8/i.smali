.class public LO8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final synthetic c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _availablePermits$volatile:I

.field private final a:I

.field private final b:Lv8/q;

.field private volatile synthetic deqIdx$volatile:J

.field private volatile synthetic enqIdx$volatile:J

.field private volatile synthetic head$volatile:Ljava/lang/Object;

.field private volatile synthetic tail$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "head$volatile"

    const-class v1, LO8/i;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LO8/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "deqIdx$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LO8/i;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "tail$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LO8/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LO8/i;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LO8/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(II)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LO8/i;->a:I

    if-lez p1, :cond_3e

    if-ltz p2, :cond_23

    if-gt p2, p1, :cond_23

    new-instance v0, LO8/k;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, LO8/k;-><init>(JLO8/k;I)V

    iput-object v0, p0, LO8/i;->head$volatile:Ljava/lang/Object;

    iput-object v0, p0, LO8/i;->tail$volatile:Ljava/lang/Object;

    sub-int/2addr p1, p2

    iput p1, p0, LO8/i;->_availablePermits$volatile:I

    new-instance p1, LO8/h;

    invoke-direct {p1, p0}, LO8/h;-><init>(LO8/i;)V

    iput-object p1, p0, LO8/i;->b:Lv8/q;

    return-void

    :cond_23
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "The number of acquired permits should be in 0.."

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3e
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Semaphore should have at least 1 permit, but had "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic d(LO8/i;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LO8/i;->o(LO8/i;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final f(LF8/c1;)Z
    .registers 16

    invoke-static {}, LO8/i;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO8/k;

    invoke-static {}, LO8/i;->k()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    sget-object v3, LO8/i$a;->q:LO8/i$a;

    invoke-static {}, LO8/i;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-static {}, LO8/j;->f()I

    move-result v5

    int-to-long v5, v5

    div-long v5, v1, v5

    :goto_1f
    invoke-static {v0, v5, v6, v3}, LK8/a;->c(LK8/A;JLv8/p;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5d

    invoke-static {v7}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v8

    :cond_2d
    :goto_2d
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LK8/A;

    iget-wide v10, v9, LK8/A;->s:J

    iget-wide v12, v8, LK8/A;->s:J

    cmp-long v10, v10, v12

    if-ltz v10, :cond_3c

    goto :goto_5d

    :cond_3c
    invoke-virtual {v8}, LK8/A;->u()Z

    move-result v10

    if-nez v10, :cond_43

    goto :goto_1f

    :cond_43
    invoke-virtual {v4, p0, v9, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_53

    invoke-virtual {v9}, LK8/A;->p()Z

    move-result v0

    if-eqz v0, :cond_5d

    invoke-virtual {v9}, LK8/b;->n()V

    goto :goto_5d

    :cond_53
    invoke-virtual {v8}, LK8/A;->p()Z

    move-result v9

    if-eqz v9, :cond_2d

    invoke-virtual {v8}, LK8/b;->n()V

    goto :goto_2d

    :cond_5d
    :goto_5d
    invoke-static {v7}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v0

    check-cast v0, LO8/k;

    invoke-static {}, LO8/j;->f()I

    move-result v3

    int-to-long v3, v3

    rem-long/2addr v1, v3

    long-to-int v1, v1

    invoke-virtual {v0}, LO8/k;->v()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7a

    invoke-interface {p1, v0, v1}, LF8/c1;->b(LK8/A;I)V

    return v3

    :cond_7a
    invoke-static {}, LO8/j;->e()LK8/D;

    move-result-object v2

    invoke-static {}, LO8/j;->g()LK8/D;

    move-result-object v4

    invoke-virtual {v0}, LO8/k;->v()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v0

    invoke-virtual {v0, v1, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c6

    instance-of v0, p1, LF8/l;

    if-eqz v0, :cond_9f

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/l;

    sget-object v0, Lh8/A;->a:Lh8/A;

    iget-object p0, p0, LO8/i;->b:Lv8/q;

    invoke-interface {p1, v0, p0}, LF8/l;->m(Ljava/lang/Object;Lv8/q;)V

    goto :goto_aa

    :cond_9f
    instance-of p0, p1, LN8/k;

    if-eqz p0, :cond_ab

    check-cast p1, LN8/k;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-interface {p1, p0}, LN8/k;->f(Ljava/lang/Object;)V

    :goto_aa
    return v3

    :cond_ab
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unexpected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c6
    const/4 p0, 0x0

    return p0
.end method

.method private final g()V
    .registers 4

    :cond_0
    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, LO8/i;->a:I

    if-le v0, v1, :cond_18

    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    iget v2, p0, LO8/i;->a:I

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_18
    return-void
.end method

.method private final h()I
    .registers 3

    :cond_0
    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, LO8/i;->a:I

    if-gt v0, v1, :cond_0

    return v0
.end method

.method private static final synthetic j()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LO8/i;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private static final synthetic k()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LO8/i;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private static final synthetic l()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LO8/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LO8/i;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LO8/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private static final o(LO8/i;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;
    .registers 4

    invoke-virtual {p0}, LO8/i;->p()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final r(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LF8/l;

    if-eqz v0, :cond_1d

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/l;

    sget-object v0, Lh8/A;->a:Lh8/A;

    const/4 v1, 0x0

    iget-object p0, p0, LO8/i;->b:Lv8/q;

    invoke-interface {p1, v0, v1, p0}, LF8/l;->r(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1b

    invoke-interface {p1, p0}, LF8/l;->t(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0

    :cond_1d
    instance-of v0, p1, LN8/k;

    if-eqz v0, :cond_2a

    check-cast p1, LN8/k;

    sget-object v0, Lh8/A;->a:Lh8/A;

    invoke-interface {p1, p0, v0}, LN8/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2a
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unexpected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final s()Z
    .registers 15

    invoke-static {}, LO8/i;->l()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO8/k;

    invoke-static {}, LO8/i;->j()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-static {}, LO8/j;->f()I

    move-result v3

    int-to-long v3, v3

    div-long v3, v1, v3

    sget-object v5, LO8/i$b;->q:LO8/i$b;

    invoke-static {}, LO8/i;->l()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v6

    :goto_1f
    invoke-static {v0, v3, v4, v5}, LK8/a;->c(LK8/A;JLv8/p;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5d

    invoke-static {v7}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v8

    :cond_2d
    :goto_2d
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LK8/A;

    iget-wide v10, v9, LK8/A;->s:J

    iget-wide v12, v8, LK8/A;->s:J

    cmp-long v10, v10, v12

    if-ltz v10, :cond_3c

    goto :goto_5d

    :cond_3c
    invoke-virtual {v8}, LK8/A;->u()Z

    move-result v10

    if-nez v10, :cond_43

    goto :goto_1f

    :cond_43
    invoke-virtual {v6, p0, v9, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_53

    invoke-virtual {v9}, LK8/A;->p()Z

    move-result v0

    if-eqz v0, :cond_5d

    invoke-virtual {v9}, LK8/b;->n()V

    goto :goto_5d

    :cond_53
    invoke-virtual {v8}, LK8/A;->p()Z

    move-result v9

    if-eqz v9, :cond_2d

    invoke-virtual {v8}, LK8/b;->n()V

    goto :goto_2d

    :cond_5d
    :goto_5d
    invoke-static {v7}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v0

    check-cast v0, LO8/k;

    invoke-virtual {v0}, LK8/b;->b()V

    iget-wide v5, v0, LK8/A;->s:J

    cmp-long v3, v5, v3

    const/4 v4, 0x0

    if-lez v3, :cond_6e

    return v4

    :cond_6e
    invoke-static {}, LO8/j;->f()I

    move-result v3

    int-to-long v5, v3

    rem-long/2addr v1, v5

    long-to-int v1, v1

    invoke-static {}, LO8/j;->e()LK8/D;

    move-result-object v2

    invoke-virtual {v0}, LO8/k;->v()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_ae

    invoke-static {}, LO8/j;->d()I

    move-result p0

    :goto_87
    const/4 v2, 0x1

    if-ge v4, p0, :cond_9c

    invoke-virtual {v0}, LO8/k;->v()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LO8/j;->g()LK8/D;

    move-result-object v5

    if-ne v3, v5, :cond_99

    return v2

    :cond_99
    add-int/lit8 v4, v4, 0x1

    goto :goto_87

    :cond_9c
    invoke-static {}, LO8/j;->e()LK8/D;

    move-result-object p0

    invoke-static {}, LO8/j;->b()LK8/D;

    move-result-object v3

    invoke-virtual {v0}, LO8/k;->v()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v0

    invoke-virtual {v0, v1, p0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v2

    return p0

    :cond_ae
    invoke-static {}, LO8/j;->c()LK8/D;

    move-result-object v0

    if-ne v2, v0, :cond_b5

    return v4

    :cond_b5
    invoke-direct {p0, v2}, LO8/i;->r(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method protected final e(LF8/l;)V
    .registers 3

    :cond_0
    invoke-direct {p0}, LO8/i;->h()I

    move-result v0

    if-lez v0, :cond_e

    sget-object v0, Lh8/A;->a:Lh8/A;

    iget-object p0, p0, LO8/i;->b:Lv8/q;

    invoke-interface {p1, v0, p0}, LF8/l;->m(Ljava/lang/Object;Lv8/q;)V

    return-void

    :cond_e
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LF8/c1;

    invoke-direct {p0, v0}, LO8/i;->f(LF8/c1;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final i()I
    .registers 2

    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public final p()V
    .registers 4

    :cond_0
    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndIncrement(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, LO8/i;->a:I

    if-ge v0, v1, :cond_16

    if-ltz v0, :cond_f

    goto :goto_15

    :cond_f
    invoke-direct {p0}, LO8/i;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_15
    return-void

    :cond_16
    invoke-direct {p0}, LO8/i;->g()V

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The number of released permits cannot be greater than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LO8/i;->a:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()Z
    .registers 4

    :cond_0
    :goto_0
    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, LO8/i;->a:I

    if-le v0, v1, :cond_10

    invoke-direct {p0}, LO8/i;->g()V

    goto :goto_0

    :cond_10
    if-gtz v0, :cond_14

    const/4 p0, 0x0

    return p0

    :cond_14
    invoke-static {}, LO8/i;->n()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0
.end method
