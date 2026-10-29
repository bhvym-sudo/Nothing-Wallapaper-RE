.class public LH8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH8/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/e$a;
    }
.end annotation


# static fields
.field private static final synthetic A:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic B:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic u:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic v:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic z:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _closeCause$volatile:Ljava/lang/Object;

.field private volatile synthetic bufferEnd$volatile:J

.field private volatile synthetic bufferEndSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic closeHandler$volatile:Ljava/lang/Object;

.field private volatile synthetic completedExpandBuffersAndPauseFlag$volatile:J

.field private final q:I

.field public final r:Lv8/l;

.field private volatile synthetic receiveSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic receivers$volatile:J

.field private final s:Lv8/q;

.field private volatile synthetic sendSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic sendersAndCloseStatus$volatile:J


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "sendersAndCloseStatus$volatile"

    const-class v1, LH8/e;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "receivers$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->u:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "bufferEnd$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->v:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "completedExpandBuffersAndPauseFlag$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "sendSegment$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "receiveSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "bufferEndSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->z:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closeCause$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->A:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "closeHandler$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LH8/e;->B:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(ILv8/l;)V
    .registers 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LH8/e;->q:I

    iput-object p2, p0, LH8/e;->r:Lv8/l;

    if-ltz p1, :cond_46

    invoke-static {p1}, LH8/f;->t(I)J

    move-result-wide v0

    iput-wide v0, p0, LH8/e;->bufferEnd$volatile:J

    invoke-direct {p0}, LH8/e;->c0()J

    move-result-wide v0

    iput-wide v0, p0, LH8/e;->completedExpandBuffersAndPauseFlag$volatile:J

    new-instance v2, LH8/l;

    const/4 v5, 0x0

    const/4 v7, 0x3

    const-wide/16 v3, 0x0

    move-object v6, p0

    invoke-direct/range {v2 .. v7}, LH8/l;-><init>(JLH8/l;LH8/e;I)V

    iput-object v2, v6, LH8/e;->sendSegment$volatile:Ljava/lang/Object;

    iput-object v2, v6, LH8/e;->receiveSegment$volatile:Ljava/lang/Object;

    invoke-direct {v6}, LH8/e;->A0()Z

    move-result p0

    if-eqz p0, :cond_32

    invoke-static {}, LH8/f;->n()LH8/l;

    move-result-object v2

    const-string p0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_32
    iput-object v2, v6, LH8/e;->bufferEndSegment$volatile:Ljava/lang/Object;

    if-eqz p2, :cond_3c

    new-instance p0, LH8/b;

    invoke-direct {p0, v6}, LH8/b;-><init>(LH8/e;)V

    goto :goto_3d

    :cond_3c
    const/4 p0, 0x0

    :goto_3d
    iput-object p0, v6, LH8/e;->s:Lv8/q;

    invoke-static {}, LH8/f;->l()LK8/D;

    move-result-object p0

    iput-object p0, v6, LH8/e;->_closeCause$volatile:Ljava/lang/Object;

    return-void

    :cond_46
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid channel capacity: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", should be >=0"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic A(LH8/e;LF8/l;)V
    .registers 2

    invoke-direct {p0, p1}, LH8/e;->J0(LF8/l;)V

    return-void
.end method

.method private final A0()Z
    .registers 5

    invoke-direct {p0}, LH8/e;->c0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-eqz p0, :cond_16

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p0, v0, v2

    if-nez p0, :cond_14

    goto :goto_16

    :cond_14
    const/4 p0, 0x0

    return p0

    :cond_16
    :goto_16
    const/4 p0, 0x1

    return p0
.end method

.method public static final synthetic B(LH8/e;LF8/l;)V
    .registers 2

    invoke-direct {p0, p1}, LH8/e;->K0(LF8/l;)V

    return-void
.end method

.method private final B0(LH8/l;)J
    .registers 9

    :cond_0
    sget v0, LH8/f;->b:I

    add-int/lit8 v0, v0, -0x1

    :goto_4
    const-wide/16 v1, -0x1

    const/4 v3, -0x1

    if-ge v3, v0, :cond_3c

    iget-wide v3, p1, LK8/A;->s:J

    sget v5, LH8/f;->b:I

    int-to-long v5, v5

    mul-long/2addr v3, v5

    int-to-long v5, v0

    add-long/2addr v3, v5

    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v5

    cmp-long v5, v3, v5

    if-gez v5, :cond_1a

    return-wide v1

    :cond_1a
    invoke-virtual {p1, v0}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2c

    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_27

    goto :goto_2c

    :cond_27
    sget-object v2, LH8/f;->d:LK8/D;

    if-ne v1, v2, :cond_39

    return-wide v3

    :cond_2c
    :goto_2c
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-virtual {p1}, LK8/A;->t()V

    :cond_39
    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_3c
    invoke-virtual {p1}, LK8/b;->h()LK8/b;

    move-result-object p1

    check-cast p1, LH8/l;

    if-nez p1, :cond_0

    return-wide v1
.end method

.method public static final synthetic C(LH8/e;Ljava/lang/Object;LF8/l;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/e;->N0(Ljava/lang/Object;LF8/l;)V

    return-void
.end method

.method private final C0()V
    .registers 7

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v1, 0x3c

    shr-long v4, v2, v1

    long-to-int v1, v4

    if-nez v1, :cond_24

    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v4, v2

    const/4 v1, 0x1

    invoke-static {v4, v5, v1}, LH8/f;->b(JI)J

    move-result-wide v4

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_22

    goto :goto_24

    :cond_22
    move-object p0, v1

    goto :goto_4

    :cond_24
    :goto_24
    return-void
.end method

.method public static final synthetic D(LH8/e;LF8/c1;LH8/l;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH8/e;->S0(LF8/c1;LH8/l;I)V

    return-void
.end method

.method private final D0()V
    .registers 7

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v4, v2

    const/4 v1, 0x3

    invoke-static {v4, v5, v1}, LH8/f;->b(JI)J

    move-result-wide v4

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_1b

    return-void

    :cond_1b
    move-object p0, v1

    goto :goto_4
.end method

.method public static final synthetic E(LH8/e;LF8/c1;LH8/l;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH8/e;->T0(LF8/c1;LH8/l;I)V

    return-void
.end method

.method private final E0()V
    .registers 8

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v1, 0x3c

    shr-long v4, v2, v1

    long-to-int v1, v4

    const-wide v4, 0xfffffffffffffffL

    if-eqz v1, :cond_20

    const/4 v6, 0x1

    if-eq v1, v6, :cond_18

    goto :goto_2d

    :cond_18
    and-long/2addr v4, v2

    const/4 v1, 0x3

    invoke-static {v4, v5, v1}, LH8/f;->b(JI)J

    move-result-wide v4

    :goto_1e
    move-object v1, p0

    goto :goto_27

    :cond_20
    and-long/2addr v4, v2

    const/4 v1, 0x2

    invoke-static {v4, v5, v1}, LH8/f;->b(JI)J

    move-result-wide v4

    goto :goto_1e

    :goto_27
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_2e

    :goto_2d
    return-void

    :cond_2e
    move-object p0, v1

    goto :goto_4
.end method

.method public static final synthetic F(LH8/e;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/e;->U0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final F0(JLH8/l;)V
    .registers 8

    :goto_0
    iget-wide v0, p3, LK8/A;->s:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_11

    invoke-virtual {p3}, LK8/b;->f()LK8/b;

    move-result-object v0

    check-cast v0, LH8/l;

    if-nez v0, :cond_f

    goto :goto_11

    :cond_f
    move-object p3, v0

    goto :goto_0

    :cond_11
    :goto_11
    invoke-virtual {p3}, LK8/A;->k()Z

    move-result p1

    if-eqz p1, :cond_22

    invoke-virtual {p3}, LK8/b;->f()LK8/b;

    move-result-object p1

    check-cast p1, LH8/l;

    if-nez p1, :cond_20

    goto :goto_22

    :cond_20
    move-object p3, p1

    goto :goto_11

    :cond_22
    :goto_22
    invoke-static {}, LH8/e;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    :cond_26
    :goto_26
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LK8/A;

    iget-wide v0, p2, LK8/A;->s:J

    iget-wide v2, p3, LK8/A;->s:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_35

    return-void

    :cond_35
    invoke-virtual {p3}, LK8/A;->u()Z

    move-result v0

    if-nez v0, :cond_3c

    goto :goto_11

    :cond_3c
    invoke-virtual {p1, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4c

    invoke-virtual {p2}, LK8/A;->p()Z

    move-result p0

    if-eqz p0, :cond_4b

    invoke-virtual {p2}, LK8/b;->n()V

    :cond_4b
    return-void

    :cond_4c
    invoke-virtual {p3}, LK8/A;->p()Z

    move-result p2

    if-eqz p2, :cond_26

    invoke-virtual {p3}, LK8/b;->n()V

    goto :goto_26
.end method

.method public static final synthetic G(LH8/e;LH8/l;IJLm8/e;)Ljava/lang/Object;
    .registers 6

    invoke-direct/range {p0 .. p5}, LH8/e;->X0(LH8/l;IJLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final G0(Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V
    .registers 4

    iget-object p0, p0, LH8/e;->r:Lv8/l;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p2}, LH8/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0, p1, p3}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    return-void
.end method

.method public static final synthetic H(LH8/e;LN8/k;Ljava/lang/Object;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/e;->Z0(LN8/k;Ljava/lang/Object;)V

    return-void
.end method

.method private final H0(Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V
    .registers 4

    iget-object p0, p0, LH8/e;->r:Lv8/l;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0, p2, p3}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    return-void
.end method

.method public static final synthetic I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-direct/range {p0 .. p5}, LH8/e;->m1(LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J(LH8/e;LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .registers 8

    invoke-direct/range {p0 .. p7}, LH8/e;->o1(LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    return p0
.end method

.method private final J0(LF8/l;)V
    .registers 3

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    sget-object v0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {v0, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private final K(Lv8/l;)LC8/e;
    .registers 2

    new-instance p1, LH8/e$b;

    invoke-direct {p1, p0}, LH8/e$b;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final K0(LF8/l;)V
    .registers 3

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-direct {p0}, LH8/e;->h0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private final L(Lv8/l;Ljava/lang/Object;)Lv8/q;
    .registers 3

    new-instance p0, LH8/c;

    invoke-direct {p0, p1, p2}, LH8/c;-><init>(Lv8/l;Ljava/lang/Object;)V

    return-object p0
.end method

.method private final L0(LN8/k;)V
    .registers 2

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p0

    invoke-interface {p1, p0}, LN8/k;->f(Ljava/lang/Object;)V

    return-void
.end method

.method private static final M(Lv8/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 5

    invoke-static {p0, p1, p4}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final M0(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    iget-object v1, p0, LH8/e;->r:Lv8/l;

    if-eqz v1, :cond_2e

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, LK8/w;->c(Lv8/l;Ljava/lang/Object;LK8/P;ILjava/lang/Object;)LK8/P;

    move-result-object p1

    if-eqz p1, :cond_2e

    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p1, p0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_2e
    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :goto_3f
    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4c

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_4c
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_53

    return-object p0

    :cond_53
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final N(Lv8/l;)LC8/e;
    .registers 2

    new-instance p1, LH8/e$c;

    invoke-direct {p1, p0}, LH8/e$c;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final N0(Ljava/lang/Object;LF8/l;)V
    .registers 5

    iget-object v0, p0, LH8/e;->r:Lv8/l;

    if-eqz v0, :cond_b

    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    invoke-static {v0, p1, v1}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    :cond_b
    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private final O(J)Z
    .registers 7

    invoke-direct {p0}, LH8/e;->c0()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_17

    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v0

    iget p0, p0, LH8/e;->q:I

    int-to-long v2, p0

    add-long/2addr v0, v2

    cmp-long p0, p1, v0

    if-gez p0, :cond_15

    goto :goto_17

    :cond_15
    const/4 p0, 0x0

    return p0

    :cond_17
    :goto_17
    const/4 p0, 0x1

    return p0
.end method

.method private final Q(LH8/l;J)V
    .registers 12

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LK8/j;->b(Ljava/lang/Object;ILkotlin/jvm/internal/h;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    const/4 v2, -0x1

    if-eqz p1, :cond_6e

    sget v3, LH8/f;->b:I

    sub-int/2addr v3, v1

    :goto_c
    if-ge v2, v3, :cond_67

    iget-wide v4, p1, LK8/A;->s:J

    sget v6, LH8/f;->b:I

    int-to-long v6, v6

    mul-long/2addr v4, v6

    int-to-long v6, v3

    add-long/2addr v4, v6

    cmp-long v4, v4, p2

    if-ltz v4, :cond_6e

    :cond_1a
    invoke-virtual {p1, v3}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_57

    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v5

    if-ne v4, v5, :cond_27

    goto :goto_57

    :cond_27
    instance-of v5, v4, LH8/x;

    if-eqz v5, :cond_41

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    check-cast v4, LH8/x;

    iget-object v4, v4, LH8/x;->a:LF8/c1;

    invoke-static {v0, v4}, LK8/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v3, v1}, LH8/l;->C(IZ)V

    goto :goto_64

    :cond_41
    instance-of v5, v4, LF8/c1;

    if-eqz v5, :cond_64

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-static {v0, v4}, LK8/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v3, v1}, LH8/l;->C(IZ)V

    goto :goto_64

    :cond_57
    :goto_57
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-virtual {p1}, LK8/A;->t()V

    :cond_64
    :goto_64
    add-int/lit8 v3, v3, -0x1

    goto :goto_c

    :cond_67
    invoke-virtual {p1}, LK8/b;->h()LK8/b;

    move-result-object p1

    check-cast p1, LH8/l;

    goto :goto_6

    :cond_6e
    if-eqz v0, :cond_94

    instance-of p1, v0, Ljava/util/ArrayList;

    if-nez p1, :cond_7a

    check-cast v0, LF8/c1;

    invoke-direct {p0, v0}, LH8/e;->b1(LF8/c1;)V

    return-void

    :cond_7a
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    :goto_86
    if-ge v2, p1, :cond_94

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LF8/c1;

    invoke-direct {p0, p2}, LH8/e;->b1(LF8/c1;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_86

    :cond_94
    return-void
.end method

.method private static final Q0(LH8/e;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;
    .registers 4

    new-instance p2, LH8/d;

    invoke-direct {p2, p3, p0, p1}, LH8/d;-><init>(Ljava/lang/Object;LH8/e;LN8/k;)V

    return-object p2
.end method

.method private final R()LH8/l;
    .registers 7

    invoke-static {}, LH8/e;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LH8/e;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH8/l;

    iget-wide v2, v1, LK8/A;->s:J

    move-object v4, v0

    check-cast v4, LH8/l;

    iget-wide v4, v4, LK8/A;->s:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_1e

    move-object v0, v1

    :cond_1e
    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH8/l;

    iget-wide v1, p0, LK8/A;->s:J

    move-object v3, v0

    check-cast v3, LH8/l;

    iget-wide v3, v3, LK8/A;->s:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_34

    move-object v0, p0

    :cond_34
    check-cast v0, LK8/b;

    invoke-static {v0}, LK8/a;->b(LK8/b;)LK8/b;

    move-result-object p0

    check-cast p0, LH8/l;

    return-object p0
.end method

.method private static final R0(Ljava/lang/Object;LH8/e;LN8/k;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 6

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p3

    if-eq p0, p3, :cond_f

    iget-object p1, p1, LH8/e;->r:Lv8/l;

    invoke-interface {p2}, LN8/k;->getContext()Lm8/i;

    move-result-object p2

    invoke-static {p1, p0, p2}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    :cond_f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final S0(LF8/c1;LH8/l;I)V
    .registers 4

    invoke-virtual {p0}, LH8/e;->P0()V

    invoke-interface {p1, p2, p3}, LF8/c1;->b(LK8/A;I)V

    return-void
.end method

.method private final T(J)V
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/e;->U(J)LH8/l;

    move-result-object p1

    invoke-direct {p0, p1}, LH8/e;->a1(LH8/l;)V

    return-void
.end method

.method private final T0(LF8/c1;LH8/l;I)V
    .registers 4

    sget p0, LH8/f;->b:I

    add-int/2addr p3, p0

    invoke-interface {p1, p2, p3}, LF8/c1;->b(LK8/A;I)V

    return-void
.end method

.method private final U(J)LH8/l;
    .registers 8

    invoke-direct {p0}, LH8/e;->R()LH8/l;

    move-result-object v0

    invoke-virtual {p0}, LH8/e;->z0()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-direct {p0, v0}, LH8/e;->B0(LH8/l;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_17

    invoke-virtual {p0, v1, v2}, LH8/e;->W(J)V

    :cond_17
    invoke-direct {p0, v0, p1, p2}, LH8/e;->Q(LH8/l;J)V

    return-object v0
.end method

.method private final U0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p1

    if-ne p2, p1, :cond_11

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_17

    :cond_11
    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0, p2}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_17
    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    return-object p0
.end method

.method private final V()V
    .registers 1

    invoke-virtual {p0}, LH8/e;->s()Z

    return-void
.end method

.method static synthetic V0(LH8/e;Lm8/e;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :goto_a
    invoke-virtual {p0}, LH8/e;->w0()Z

    move-result v1

    if-nez v1, :cond_69

    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v5

    sget v1, LH8/f;->b:I

    int-to-long v2, v1

    div-long v2, v5, v2

    int-to-long v7, v1

    rem-long v7, v5, v7

    long-to-int v4, v7

    iget-wide v7, v0, LK8/A;->s:J

    cmp-long v1, v7, v2

    if-eqz v1, :cond_30

    invoke-static {p0, v2, v3, v0}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object v1

    if-nez v1, :cond_2e

    goto :goto_a

    :cond_2e
    move-object v3, v1

    goto :goto_31

    :cond_30
    move-object v3, v0

    :goto_31
    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object v0

    if-eq p0, v0, :cond_61

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object v0

    if-ne p0, v0, :cond_51

    invoke-virtual {v2}, LH8/e;->o0()J

    move-result-wide v0

    cmp-long p0, v5, v0

    if-gez p0, :cond_4e

    invoke-virtual {v3}, LK8/b;->b()V

    :cond_4e
    move-object p0, v2

    move-object v0, v3

    goto :goto_a

    :cond_51
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object v0

    if-ne p0, v0, :cond_5d

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, LH8/e;->Y0(LH8/l;IJLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_5d
    invoke-virtual {v3}, LK8/b;->b()V

    return-object p0

    :cond_61
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_69
    move-object v2, p0

    invoke-direct {v2}, LH8/e;->h0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, LK8/C;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method static synthetic W0(LH8/e;Lm8/e;)Ljava/lang/Object;
    .registers 15

    instance-of v0, p1, LH8/e$f;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, LH8/e$f;

    iget v1, v0, LH8/e$f;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_14

    sub-int/2addr v1, v2

    iput v1, v0, LH8/e$f;->s:I

    :goto_12
    move-object v6, v0

    goto :goto_1a

    :cond_14
    new-instance v0, LH8/e$f;

    invoke-direct {v0, p0, p1}, LH8/e$f;-><init>(LH8/e;Lm8/e;)V

    goto :goto_12

    :goto_1a
    iget-object p1, v6, LH8/e$f;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LH8/e$f;->s:I

    const/4 v2, 0x1

    if-eqz v1, :cond_39

    if-ne v1, v2, :cond_31

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    check-cast p1, LH8/k;

    invoke-virtual {p1}, LH8/k;->k()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_31
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_39
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LH8/l;

    :goto_46
    invoke-virtual {p0}, LH8/e;->w0()Z

    move-result v1

    if-eqz v1, :cond_57

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_57
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    sget v1, LH8/f;->b:I

    int-to-long v7, v1

    div-long v7, v4, v7

    int-to-long v9, v1

    rem-long v9, v4, v9

    long-to-int v3, v9

    iget-wide v9, p1, LK8/A;->s:J

    cmp-long v1, v9, v7

    if-eqz v1, :cond_77

    invoke-static {p0, v7, v8, p1}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object v1

    if-nez v1, :cond_75

    goto :goto_46

    :cond_75
    move-object v8, v1

    goto :goto_78

    :cond_77
    move-object v8, p1

    :goto_78
    const/4 v12, 0x0

    move-object v7, p0

    move v9, v3

    move-wide v10, v4

    invoke-static/range {v7 .. v12}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v1, v7

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p1

    if-eq p0, p1, :cond_b6

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_9b

    invoke-virtual {v1}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v4, p0

    if-gez p0, :cond_98

    invoke-virtual {v8}, LK8/b;->b()V

    :cond_98
    move-object p0, v1

    move-object p1, v8

    goto :goto_46

    :cond_9b
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_ac

    iput v2, v6, LH8/e$f;->s:I

    move-object v2, v8

    invoke-direct/range {v1 .. v6}, LH8/e;->X0(LH8/l;IJLm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_ab

    return-object v0

    :cond_ab
    return-object p0

    :cond_ac
    invoke-virtual {v8}, LK8/b;->b()V

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1, p0}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_b6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final X()V
    .registers 14

    invoke-direct {p0}, LH8/e;->A0()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-static {}, LH8/e;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    move-object v4, v0

    :goto_12
    invoke-static {}, LH8/e;->b0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v5

    sget v0, LH8/f;->b:I

    int-to-long v1, v0

    div-long v2, v5, v1

    invoke-virtual {p0}, LH8/e;->o0()J

    move-result-wide v7

    cmp-long v1, v7, v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    if-gtz v1, :cond_3e

    iget-wide v0, v4, LK8/A;->s:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_3a

    invoke-virtual {v4}, LK8/b;->f()LK8/b;

    move-result-object v0

    if-eqz v0, :cond_3a

    invoke-direct {p0, v2, v3, v4}, LH8/e;->F0(JLH8/l;)V

    :cond_3a
    invoke-static {p0, v9, v10, v8, v7}, LH8/e;->s0(LH8/e;JILjava/lang/Object;)V

    return-void

    :cond_3e
    iget-wide v11, v4, LK8/A;->s:J

    cmp-long v1, v11, v2

    if-eqz v1, :cond_4f

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LH8/e;->Y(JLH8/l;J)LH8/l;

    move-result-object p0

    if-nez p0, :cond_4d

    :goto_4b
    move-object p0, v1

    goto :goto_12

    :cond_4d
    move-object v4, p0

    goto :goto_50

    :cond_4f
    move-object v1, p0

    :goto_50
    int-to-long v2, v0

    rem-long v2, v5, v2

    long-to-int p0, v2

    invoke-direct {v1, v4, p0, v5, v6}, LH8/e;->k1(LH8/l;IJ)Z

    move-result p0

    if-eqz p0, :cond_5e

    invoke-static {v1, v9, v10, v8, v7}, LH8/e;->s0(LH8/e;JILjava/lang/Object;)V

    return-void

    :cond_5e
    invoke-static {v1, v9, v10, v8, v7}, LH8/e;->s0(LH8/e;JILjava/lang/Object;)V

    goto :goto_4b
.end method

.method private final X0(LH8/l;IJLm8/e;)Ljava/lang/Object;
    .registers 16

    instance-of v0, p5, LH8/e$g;

    if-eqz v0, :cond_13

    move-object v0, p5

    check-cast v0, LH8/e$g;

    iget v1, v0, LH8/e$g;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LH8/e$g;->w:I

    goto :goto_18

    :cond_13
    new-instance v0, LH8/e$g;

    invoke-direct {v0, p0, p5}, LH8/e$g;-><init>(LH8/e;Lm8/e;)V

    :goto_18
    iget-object p5, v0, LH8/e$g;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LH8/e$g;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3a

    if-ne v2, v3, :cond_32

    iget-object p0, v0, LH8/e$g;->r:Ljava/lang/Object;

    check-cast p0, LH8/l;

    iget-object p0, v0, LH8/e$g;->q:Ljava/lang/Object;

    check-cast p0, LH8/e;

    invoke-static {p5}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_12b

    :cond_32
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3a
    invoke-static {p5}, Lh8/r;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LH8/e$g;->q:Ljava/lang/Object;

    iput-object p1, v0, LH8/e$g;->r:Ljava/lang/Object;

    iput p2, v0, LH8/e$g;->s:I

    iput-wide p3, v0, LH8/e$g;->t:J

    iput v3, v0, LH8/e$g;->w:I

    invoke-static {v0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object p5

    invoke-static {p5}, LF8/p;->b(Lm8/e;)LF8/n;

    move-result-object p5

    :try_start_4f
    new-instance v7, LH8/u;

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, p5}, LH8/u;-><init>(LF8/n;)V

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    invoke-static/range {v2 .. v7}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_70

    invoke-static {v2, v7, v3, v4}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    goto/16 :goto_11b

    :catchall_6c
    move-exception v0

    move-object p0, v0

    goto/16 :goto_132

    :cond_70
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p1

    const/4 p2, 0x0

    if-ne p0, p1, :cond_103

    invoke-virtual {v2}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v5, p0

    if-gez p0, :cond_82

    invoke-virtual {v3}, LK8/b;->b()V

    :cond_82
    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH8/l;

    :goto_8c
    invoke-virtual {v2}, LH8/e;->w0()Z

    move-result p1

    if-eqz p1, :cond_97

    invoke-static {v2, p5}, LH8/e;->A(LH8/e;LF8/l;)V

    goto/16 :goto_11b

    :cond_97
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v5

    sget p1, LH8/f;->b:I

    int-to-long p3, p1

    div-long p3, v5, p3

    int-to-long v3, p1

    rem-long v3, v5, v3

    long-to-int v4, v3

    iget-wide v8, p0, LK8/A;->s:J

    cmp-long p1, v8, p3

    if-eqz p1, :cond_b7

    invoke-static {v2, p3, p4, p0}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object p1

    if-nez p1, :cond_b5

    goto :goto_8c

    :cond_b5
    move-object v3, p1

    goto :goto_b8

    :cond_b7
    move-object v3, p0

    :goto_b8
    invoke-static/range {v2 .. v7}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p1, v3

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p3

    if-ne p0, p3, :cond_c7

    invoke-static {v2, v7, p1, v4}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    goto :goto_11b

    :cond_c7
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p3

    if-ne p0, p3, :cond_da

    invoke-virtual {v2}, LH8/e;->o0()J

    move-result-wide p3

    cmp-long p0, v5, p3

    if-gez p0, :cond_d8

    invoke-virtual {p1}, LK8/b;->b()V

    :cond_d8
    move-object p0, p1

    goto :goto_8c

    :cond_da
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p3

    if-eq p0, p3, :cond_fb

    invoke-virtual {p1}, LK8/b;->b()V

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1, p0}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    iget-object p1, v2, LH8/e;->r:Lv8/l;

    if-eqz p1, :cond_f5

    invoke-static {v2, p1}, LH8/e;->m(LH8/e;Lv8/l;)LC8/e;

    move-result-object p2

    :cond_f5
    check-cast p2, Lv8/q;

    :goto_f7
    invoke-virtual {p5, p0, p2}, LF8/n;->m(Ljava/lang/Object;Lv8/q;)V

    goto :goto_11b

    :cond_fb
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_103
    invoke-virtual {v3}, LK8/b;->b()V

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1, p0}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    iget-object p1, v2, LH8/e;->r:Lv8/l;

    if-eqz p1, :cond_118

    invoke-static {v2, p1}, LH8/e;->m(LH8/e;Lv8/l;)LC8/e;

    move-result-object p2

    :cond_118
    check-cast p2, Lv8/q;
    :try_end_11a
    .catchall {:try_start_4f .. :try_end_11a} :catchall_6c

    goto :goto_f7

    :goto_11b
    invoke-virtual {p5}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    if-ne p5, p0, :cond_128

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_128
    if-ne p5, v1, :cond_12b

    return-object v1

    :cond_12b
    :goto_12b
    check-cast p5, LH8/k;

    invoke-virtual {p5}, LH8/k;->k()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :goto_132
    invoke-virtual {p5}, LF8/n;->P()V

    throw p0
.end method

.method private final Y(JLH8/l;J)LH8/l;
    .registers 20

    move-wide v2, p1

    invoke-static {}, LH8/e;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LH8/f;->y()LC8/e;

    move-result-object v4

    check-cast v4, Lv8/p;

    move-object/from16 v5, p3

    :goto_d
    invoke-static {v5, v2, v3, v4}, LK8/a;->c(LK8/A;JLv8/p;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4b

    invoke-static {v6}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v7

    :cond_1b
    :goto_1b
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LK8/A;

    iget-wide v9, v8, LK8/A;->s:J

    iget-wide v11, v7, LK8/A;->s:J

    cmp-long v9, v9, v11

    if-ltz v9, :cond_2a

    goto :goto_4b

    :cond_2a
    invoke-virtual {v7}, LK8/A;->u()Z

    move-result v9

    if-nez v9, :cond_31

    goto :goto_d

    :cond_31
    invoke-virtual {v0, p0, v8, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_41

    invoke-virtual {v8}, LK8/A;->p()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-virtual {v8}, LK8/b;->n()V

    goto :goto_4b

    :cond_41
    invoke-virtual {v7}, LK8/A;->p()Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-virtual {v7}, LK8/b;->n()V

    goto :goto_1b

    :cond_4b
    :goto_4b
    invoke-static {v6}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    if-eqz v0, :cond_5f

    invoke-direct {p0}, LH8/e;->V()V

    invoke-direct/range {p0 .. p3}, LH8/e;->F0(JLH8/l;)V

    invoke-static {p0, v8, v9, v7, v10}, LH8/e;->s0(LH8/e;JILjava/lang/Object;)V

    return-object v10

    :cond_5f
    invoke-static {v6}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LH8/l;

    iget-wide v4, v6, LK8/A;->s:J

    cmp-long v0, v4, v2

    if-lez v0, :cond_8f

    invoke-static {}, LH8/e;->b0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/16 v2, 0x1

    add-long v2, p4, v2

    iget-wide v4, v6, LK8/A;->s:J

    sget v11, LH8/f;->b:I

    int-to-long v12, v11

    mul-long/2addr v4, v12

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_8b

    iget-wide v2, v6, LK8/A;->s:J

    int-to-long v4, v11

    mul-long/2addr v2, v4

    sub-long v2, v2, p4

    invoke-direct {p0, v2, v3}, LH8/e;->r0(J)V

    goto :goto_8e

    :cond_8b
    invoke-static {p0, v8, v9, v7, v10}, LH8/e;->s0(LH8/e;JILjava/lang/Object;)V

    :goto_8e
    return-object v10

    :cond_8f
    return-object v6
.end method

.method private final Y0(LH8/l;IJLm8/e;)Ljava/lang/Object;
    .registers 15

    invoke-static {p5}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    invoke-static {v0}, LF8/p;->b(Lm8/e;)LF8/n;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    :try_start_c
    invoke-static/range {v1 .. v6}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_1f

    invoke-static {v1, v6, v2, v3}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    goto/16 :goto_bb

    :catchall_1b
    move-exception v0

    move-object p0, v0

    goto/16 :goto_c9

    :cond_1f
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p1

    const/4 p2, 0x0

    if-ne p0, p1, :cond_ad

    invoke-virtual {v1}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v4, p0

    if-gez p0, :cond_31

    invoke-virtual {v2}, LK8/b;->b()V

    :cond_31
    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH8/l;

    :goto_3b
    invoke-virtual {v1}, LH8/e;->w0()Z

    move-result p1

    if-eqz p1, :cond_46

    invoke-static {v1, v6}, LH8/e;->B(LH8/e;LF8/l;)V

    goto/16 :goto_bb

    :cond_46
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    sget p1, LH8/f;->b:I

    int-to-long p3, p1

    div-long p3, v4, p3

    int-to-long v2, p1

    rem-long v2, v4, v2

    long-to-int v3, v2

    iget-wide v7, p0, LK8/A;->s:J

    cmp-long p1, v7, p3

    if-eqz p1, :cond_66

    invoke-static {v1, p3, p4, p0}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object p1

    if-nez p1, :cond_64

    goto :goto_3b

    :cond_64
    move-object v2, p1

    goto :goto_67

    :cond_66
    move-object v2, p0

    :goto_67
    invoke-static/range {v1 .. v6}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p1, v2

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p3

    if-ne p0, p3, :cond_7b

    if-eqz v6, :cond_75

    move-object p2, v6

    :cond_75
    if-eqz p2, :cond_bb

    invoke-static {v1, p2, p1, v3}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    goto :goto_bb

    :cond_7b
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p3

    if-ne p0, p3, :cond_8e

    invoke-virtual {v1}, LH8/e;->o0()J

    move-result-wide p3

    cmp-long p0, v4, p3

    if-gez p0, :cond_8c

    invoke-virtual {p1}, LK8/b;->b()V

    :cond_8c
    move-object p0, p1

    goto :goto_3b

    :cond_8e
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p3

    if-eq p0, p3, :cond_a5

    invoke-virtual {p1}, LK8/b;->b()V

    iget-object p1, v1, LH8/e;->r:Lv8/l;

    if-eqz p1, :cond_9f

    invoke-static {v1, p1}, LH8/e;->j(LH8/e;Lv8/l;)LC8/e;

    move-result-object p2

    :cond_9f
    check-cast p2, Lv8/q;

    :goto_a1
    invoke-virtual {v6, p0, p2}, LF8/n;->m(Ljava/lang/Object;Lv8/q;)V

    goto :goto_bb

    :cond_a5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_ad
    invoke-virtual {v2}, LK8/b;->b()V

    iget-object p1, v1, LH8/e;->r:Lv8/l;

    if-eqz p1, :cond_b8

    invoke-static {v1, p1}, LH8/e;->j(LH8/e;Lv8/l;)LC8/e;

    move-result-object p2

    :cond_b8
    check-cast p2, Lv8/q;
    :try_end_ba
    .catchall {:try_start_c .. :try_end_ba} :catchall_1b

    goto :goto_a1

    :cond_bb
    :goto_bb
    invoke-virtual {v6}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_c8

    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_c8
    return-object p0

    :goto_c9
    invoke-virtual {v6}, LF8/n;->P()V

    throw p0
.end method

.method private final Z(JLH8/l;)LH8/l;
    .registers 13

    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LH8/f;->y()LC8/e;

    move-result-object v1

    check-cast v1, Lv8/p;

    :goto_a
    invoke-static {p3, p1, p2, v1}, LK8/a;->c(LK8/A;JLv8/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_48

    invoke-static {v2}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v3

    :cond_18
    :goto_18
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LK8/A;

    iget-wide v5, v4, LK8/A;->s:J

    iget-wide v7, v3, LK8/A;->s:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_27

    goto :goto_48

    :cond_27
    invoke-virtual {v3}, LK8/A;->u()Z

    move-result v5

    if-nez v5, :cond_2e

    goto :goto_a

    :cond_2e
    invoke-virtual {v0, p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3e

    invoke-virtual {v4}, LK8/A;->p()Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-virtual {v4}, LK8/b;->n()V

    goto :goto_48

    :cond_3e
    invoke-virtual {v3}, LK8/A;->p()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v3}, LK8/b;->n()V

    goto :goto_18

    :cond_48
    :goto_48
    invoke-static {v2}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_64

    invoke-direct {p0}, LH8/e;->V()V

    iget-wide p1, p3, LK8/A;->s:J

    sget v0, LH8/f;->b:I

    int-to-long v2, v0

    mul-long/2addr p1, v2

    invoke-virtual {p0}, LH8/e;->o0()J

    move-result-wide v2

    cmp-long p0, p1, v2

    if-gez p0, :cond_63

    invoke-virtual {p3}, LK8/b;->b()V

    :cond_63
    return-object v1

    :cond_64
    invoke-static {v2}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object p3

    check-cast p3, LH8/l;

    invoke-direct {p0}, LH8/e;->A0()Z

    move-result v0

    if-nez v0, :cond_ae

    invoke-direct {p0}, LH8/e;->c0()J

    move-result-wide v2

    sget v0, LH8/f;->b:I

    int-to-long v4, v0

    div-long/2addr v2, v4

    cmp-long v0, p1, v2

    if-gtz v0, :cond_ae

    invoke-static {}, LH8/e;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_80
    :goto_80
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK8/A;

    iget-wide v3, v2, LK8/A;->s:J

    iget-wide v5, p3, LK8/A;->s:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_ae

    invoke-virtual {p3}, LK8/A;->u()Z

    move-result v3

    if-eqz v3, :cond_ae

    invoke-virtual {v0, p0, v2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a4

    invoke-virtual {v2}, LK8/A;->p()Z

    move-result v0

    if-eqz v0, :cond_ae

    invoke-virtual {v2}, LK8/b;->n()V

    goto :goto_ae

    :cond_a4
    invoke-virtual {p3}, LK8/A;->p()Z

    move-result v2

    if-eqz v2, :cond_80

    invoke-virtual {p3}, LK8/b;->n()V

    goto :goto_80

    :cond_ae
    :goto_ae
    iget-wide v2, p3, LK8/A;->s:J

    cmp-long p1, v2, p1

    if-lez p1, :cond_cb

    sget p1, LH8/f;->b:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, LH8/e;->q1(J)V

    iget-wide v2, p3, LK8/A;->s:J

    int-to-long p1, p1

    mul-long/2addr v2, p1

    invoke-virtual {p0}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v2, p0

    if-gez p0, :cond_ca

    invoke-virtual {p3}, LK8/b;->b()V

    :cond_ca
    return-object v1

    :cond_cb
    return-object p3
.end method

.method private final Z0(LN8/k;Ljava/lang/Object;)V
    .registers 11

    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LH8/l;

    :goto_a
    invoke-virtual {p0}, LH8/e;->w0()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-direct {p0, p1}, LH8/e;->L0(LN8/k;)V

    return-void

    :cond_14
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    sget v0, LH8/f;->b:I

    int-to-long v1, v0

    div-long v1, v4, v1

    int-to-long v6, v0

    rem-long v6, v4, v6

    long-to-int v3, v6

    iget-wide v6, p2, LK8/A;->s:J

    cmp-long v0, v6, v1

    if-eqz v0, :cond_36

    invoke-static {p0, v1, v2, p2}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object v0

    if-nez v0, :cond_32

    goto :goto_a

    :cond_32
    move-object v2, v0

    :goto_33
    move-object v1, p0

    move-object v6, p1

    goto :goto_38

    :cond_36
    move-object v2, p2

    goto :goto_33

    :goto_38
    invoke-static/range {v1 .. v6}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p2, v2

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_52

    instance-of p0, v6, LF8/c1;

    if-eqz p0, :cond_4b

    move-object p1, v6

    check-cast p1, LF8/c1;

    goto :goto_4c

    :cond_4b
    const/4 p1, 0x0

    :goto_4c
    if-eqz p1, :cond_51

    invoke-static {v1, p1, p2, v3}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    :cond_51
    return-void

    :cond_52
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_66

    invoke-virtual {v1}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v4, p0

    if-gez p0, :cond_63

    invoke-virtual {p2}, LK8/b;->b()V

    :cond_63
    move-object p0, v1

    move-object p1, v6

    goto :goto_a

    :cond_66
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p1

    if-eq p0, p1, :cond_73

    invoke-virtual {p2}, LK8/b;->b()V

    invoke-interface {v6, p0}, LN8/k;->f(Ljava/lang/Object;)V

    return-void

    :cond_73
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic a(Ljava/lang/Object;LH8/e;LN8/k;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 6

    invoke-static/range {p0 .. p5}, LH8/e;->R0(Ljava/lang/Object;LH8/e;LN8/k;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final a0(JLH8/l;)LH8/l;
    .registers 13

    invoke-static {}, LH8/e;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LH8/f;->y()LC8/e;

    move-result-object v1

    check-cast v1, Lv8/p;

    :goto_a
    invoke-static {p3, p1, p2, v1}, LK8/a;->c(LK8/A;JLv8/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_48

    invoke-static {v2}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object v3

    :cond_18
    :goto_18
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LK8/A;

    iget-wide v5, v4, LK8/A;->s:J

    iget-wide v7, v3, LK8/A;->s:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_27

    goto :goto_48

    :cond_27
    invoke-virtual {v3}, LK8/A;->u()Z

    move-result v5

    if-nez v5, :cond_2e

    goto :goto_a

    :cond_2e
    invoke-virtual {v0, p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3e

    invoke-virtual {v4}, LK8/A;->p()Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-virtual {v4}, LK8/b;->n()V

    goto :goto_48

    :cond_3e
    invoke-virtual {v3}, LK8/A;->p()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v3}, LK8/b;->n()V

    goto :goto_18

    :cond_48
    :goto_48
    invoke-static {v2}, LK8/B;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_64

    invoke-direct {p0}, LH8/e;->V()V

    iget-wide p1, p3, LK8/A;->s:J

    sget v0, LH8/f;->b:I

    int-to-long v2, v0

    mul-long/2addr p1, v2

    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v2

    cmp-long p0, p1, v2

    if-gez p0, :cond_63

    invoke-virtual {p3}, LK8/b;->b()V

    :cond_63
    return-object v1

    :cond_64
    invoke-static {v2}, LK8/B;->b(Ljava/lang/Object;)LK8/A;

    move-result-object p3

    check-cast p3, LH8/l;

    iget-wide v2, p3, LK8/A;->s:J

    cmp-long p1, v2, p1

    if-lez p1, :cond_87

    sget p1, LH8/f;->b:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, LH8/e;->r1(J)V

    iget-wide v2, p3, LK8/A;->s:J

    int-to-long p1, p1

    mul-long/2addr v2, p1

    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide p0

    cmp-long p0, v2, p0

    if-gez p0, :cond_86

    invoke-virtual {p3}, LK8/b;->b()V

    :cond_86
    return-object v1

    :cond_87
    return-object p3
.end method

.method private final a1(LH8/l;)V
    .registers 13

    iget-object v0, p0, LH8/e;->r:Lv8/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LK8/j;->b(Ljava/lang/Object;ILkotlin/jvm/internal/h;)Ljava/lang/Object;

    move-result-object v3

    :cond_8
    sget v4, LH8/f;->b:I

    sub-int/2addr v4, v2

    :goto_b
    const/4 v5, -0x1

    if-ge v5, v4, :cond_b3

    iget-wide v6, p1, LK8/A;->s:J

    sget v8, LH8/f;->b:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    int-to-long v8, v4

    add-long/2addr v6, v8

    :cond_16
    invoke-virtual {p1, v4}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object v9

    if-eq v8, v9, :cond_bb

    sget-object v9, LH8/f;->d:LK8/D;

    if-ne v8, v9, :cond_48

    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_bb

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    if-eqz v0, :cond_40

    invoke-virtual {p1, v4}, LH8/l;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, LK8/w;->b(Lv8/l;Ljava/lang/Object;LK8/P;)LK8/P;

    move-result-object v1

    :cond_40
    invoke-virtual {p1, v4}, LH8/l;->w(I)V

    invoke-virtual {p1}, LK8/A;->t()V

    goto/16 :goto_af

    :cond_48
    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v9

    if-eq v8, v9, :cond_a2

    if-nez v8, :cond_51

    goto :goto_a2

    :cond_51
    instance-of v9, v8, LF8/c1;

    if-nez v9, :cond_6e

    instance-of v9, v8, LH8/x;

    if-eqz v9, :cond_5a

    goto :goto_6e

    :cond_5a
    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v9

    if-eq v8, v9, :cond_bb

    invoke-static {}, LH8/f;->q()LK8/D;

    move-result-object v9

    if-ne v8, v9, :cond_67

    goto :goto_bb

    :cond_67
    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v9

    if-eq v8, v9, :cond_16

    goto :goto_af

    :cond_6e
    :goto_6e
    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_bb

    instance-of v9, v8, LH8/x;

    if-eqz v9, :cond_80

    move-object v9, v8

    check-cast v9, LH8/x;

    iget-object v9, v9, LH8/x;->a:LF8/c1;

    goto :goto_83

    :cond_80
    move-object v9, v8

    check-cast v9, LF8/c1;

    :goto_83
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v10

    invoke-virtual {p1, v4, v8, v10}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    if-eqz v0, :cond_97

    invoke-virtual {p1, v4}, LH8/l;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, LK8/w;->b(Lv8/l;Ljava/lang/Object;LK8/P;)LK8/P;

    move-result-object v1

    :cond_97
    invoke-static {v3, v9}, LK8/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v4}, LH8/l;->w(I)V

    invoke-virtual {p1}, LK8/A;->t()V

    goto :goto_af

    :cond_a2
    :goto_a2
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-virtual {p1}, LK8/A;->t()V

    :goto_af
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_b

    :cond_b3
    invoke-virtual {p1}, LK8/b;->h()LK8/b;

    move-result-object p1

    check-cast p1, LH8/l;

    if-nez p1, :cond_8

    :cond_bb
    :goto_bb
    if-eqz v3, :cond_e1

    instance-of p1, v3, Ljava/util/ArrayList;

    if-nez p1, :cond_c7

    check-cast v3, LF8/c1;

    invoke-direct {p0, v3}, LH8/e;->c1(LF8/c1;)V

    goto :goto_e1

    :cond_c7
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v2

    :goto_d3
    if-ge v5, p1, :cond_e1

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/c1;

    invoke-direct {p0, v0}, LH8/e;->c1(LF8/c1;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_d3

    :cond_e1
    :goto_e1
    if-nez v1, :cond_e4

    return-void

    :cond_e4
    throw v1
.end method

.method public static synthetic b(LH8/e;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LH8/e;->Q0(LH8/e;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic b0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->v:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final b1(LF8/c1;)V
    .registers 3

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LH8/e;->d1(LF8/c1;Z)V

    return-void
.end method

.method private final c0()J
    .registers 3

    invoke-static {}, LH8/e;->b0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method private final c1(LF8/c1;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LH8/e;->d1(LF8/c1;Z)V

    return-void
.end method

.method private static final synthetic d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->z:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final d1(LF8/c1;Z)V
    .registers 4

    instance-of v0, p1, LF8/l;

    if-eqz v0, :cond_1f

    check-cast p1, Lm8/e;

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    if-eqz p2, :cond_f

    invoke-direct {p0}, LH8/e;->h0()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_13

    :cond_f
    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    :goto_13
    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_1f
    instance-of p2, p1, LH8/u;

    if-eqz p2, :cond_3f

    check-cast p1, LH8/u;

    iget-object p1, p1, LH8/u;->q:LF8/n;

    sget-object p2, Lh8/q;->r:Lh8/q$a;

    sget-object p2, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p2, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_3f
    instance-of p2, p1, LH8/e$a;

    if-eqz p2, :cond_49

    check-cast p1, LH8/e$a;

    invoke-virtual {p1}, LH8/e$a;->j()V

    return-void

    :cond_49
    instance-of p2, p1, LN8/k;

    if-eqz p2, :cond_57

    check-cast p1, LN8/k;

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p2

    invoke-interface {p1, p0, p2}, LN8/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_57
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected waiter: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static synthetic e1(LH8/e;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 16

    invoke-static {}, LH8/e;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :cond_a
    :goto_a
    invoke-static {}, LH8/e;->w()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v9, v1, v3

    invoke-static {p0, v1, v2}, LH8/e;->x(LH8/e;J)Z

    move-result v12

    sget v1, LH8/f;->b:I

    int-to-long v2, v1

    div-long v2, v9, v2

    int-to-long v4, v1

    rem-long v4, v9, v4

    long-to-int v7, v4

    iget-wide v4, v0, LK8/A;->s:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_41

    invoke-static {p0, v2, v3, v0}, LH8/e;->q(LH8/e;JLH8/l;)LH8/l;

    move-result-object v1

    if-nez v1, :cond_3f

    if-eqz v12, :cond_a

    invoke-direct {p0, p1, p2}, LH8/e;->M0(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_98

    return-object p0

    :cond_3f
    move-object v6, v1

    goto :goto_42

    :cond_41
    move-object v6, v0

    :goto_42
    const/4 v11, 0x0

    move-object v5, p0

    move-object v8, p1

    invoke-static/range {v5 .. v12}, LH8/e;->J(LH8/e;LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    if-eqz p0, :cond_95

    const/4 p1, 0x1

    if-eq p0, p1, :cond_98

    const/4 p1, 0x2

    if-eq p0, p1, :cond_84

    const/4 p1, 0x3

    if-eq p0, p1, :cond_78

    const/4 p1, 0x4

    if-eq p0, p1, :cond_62

    const/4 p1, 0x5

    if-eq p0, p1, :cond_5b

    goto :goto_5e

    :cond_5b
    invoke-virtual {v6}, LK8/b;->b()V

    :goto_5e
    move-object p0, v5

    move-object v0, v6

    move-object p1, v8

    goto :goto_a

    :cond_62
    invoke-virtual {v5}, LH8/e;->k0()J

    move-result-wide p0

    cmp-long p0, v9, p0

    if-gez p0, :cond_6d

    invoke-virtual {v6}, LK8/b;->b()V

    :cond_6d
    invoke-direct {v5, v8, p2}, LH8/e;->M0(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_98

    return-object p0

    :cond_78
    move-object v11, p2

    invoke-direct/range {v5 .. v11}, LH8/e;->f1(LH8/l;ILjava/lang/Object;JLm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_98

    return-object p0

    :cond_84
    move-object v11, p2

    if-eqz v12, :cond_98

    invoke-virtual {v6}, LK8/A;->t()V

    invoke-direct {v5, v8, v11}, LH8/e;->M0(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_98

    return-object p0

    :cond_95
    invoke-virtual {v6}, LK8/b;->b()V

    :cond_98
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final synthetic f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->B:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final f1(LH8/l;ILjava/lang/Object;JLm8/e;)Ljava/lang/Object;
    .registers 22

    invoke-static/range {p6 .. p6}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    invoke-static {v0}, LF8/p;->b(Lm8/e;)LF8/n;

    move-result-object v6

    const/4 v7, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    :try_start_12
    invoke-static/range {v0 .. v7}, LH8/e;->J(LH8/e;LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v7
    :try_end_16
    .catchall {:try_start_12 .. :try_end_16} :catchall_63

    if-eqz v7, :cond_e3

    const/4 v8, 0x1

    if-eq v7, v8, :cond_da

    const/4 v9, 0x2

    if-eq v7, v9, :cond_d2

    const/4 v10, 0x4

    if-eq v7, v10, :cond_c6

    const-string v11, "unexpected"

    const/4 v12, 0x5

    if-ne v7, v12, :cond_c0

    :try_start_26
    invoke-virtual/range {p1 .. p1}, LK8/b;->b()V

    invoke-static {}, LH8/e;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH8/l;

    :goto_33
    invoke-static {}, LH8/e;->w()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    const-wide v13, 0xfffffffffffffffL

    and-long/2addr v13, v4

    invoke-static {p0, v4, v5}, LH8/e;->x(LH8/e;J)Z

    move-result v7

    sget v2, LH8/f;->b:I

    int-to-long v4, v2

    div-long v4, v13, v4

    move-wide/from16 p4, v13

    int-to-long v12, v2

    rem-long v13, p4, v12

    long-to-int v2, v13

    iget-wide v12, v1, LK8/A;->s:J

    cmp-long v12, v12, v4

    if-eqz v12, :cond_6a

    invoke-static {p0, v4, v5, v1}, LH8/e;->q(LH8/e;JLH8/l;)LH8/l;

    move-result-object v4

    if-nez v4, :cond_69

    if-eqz v7, :cond_67

    :cond_5e
    :goto_5e
    invoke-static {p0, v3, v6}, LH8/e;->C(LH8/e;Ljava/lang/Object;LF8/l;)V

    goto/16 :goto_f1

    :catchall_63
    move-exception v0

    move-object p0, v0

    goto/16 :goto_108

    :cond_67
    const/4 v12, 0x5

    goto :goto_33

    :cond_69
    move-object v1, v4

    :cond_6a
    move-object v0, p0

    move-wide/from16 v4, p4

    invoke-static/range {v0 .. v7}, LH8/e;->J(LH8/e;LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v12

    if-eqz v12, :cond_b4

    if-eq v12, v8, :cond_a8

    if-eq v12, v9, :cond_97

    const/4 v2, 0x3

    if-eq v12, v2, :cond_91

    if-eq v12, v10, :cond_85

    const/4 v2, 0x5

    if-eq v12, v2, :cond_80

    goto :goto_83

    :cond_80
    invoke-virtual {v1}, LK8/b;->b()V

    :goto_83
    move v12, v2

    goto :goto_33

    :cond_85
    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v7

    cmp-long v2, v4, v7

    if-gez v2, :cond_5e

    invoke-virtual {v1}, LK8/b;->b()V

    goto :goto_5e

    :cond_91
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_97
    if-eqz v7, :cond_9d

    invoke-virtual {v1}, LK8/A;->t()V

    goto :goto_5e

    :cond_9d
    if-eqz v6, :cond_a1

    move-object v3, v6

    goto :goto_a2

    :cond_a1
    const/4 v3, 0x0

    :goto_a2
    if-eqz v3, :cond_f1

    invoke-static {p0, v3, v1, v2}, LH8/e;->E(LH8/e;LF8/c1;LH8/l;I)V

    goto :goto_f1

    :cond_a8
    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_b0
    invoke-interface {v6, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_f1

    :cond_b4
    invoke-virtual {v1}, LK8/b;->b()V

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_b0

    :cond_c0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c6
    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v1

    cmp-long v1, p4, v1

    if-gez v1, :cond_5e

    invoke-virtual/range {p1 .. p1}, LK8/b;->b()V

    goto :goto_5e

    :cond_d2
    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-static {p0, v6, v1, v2}, LH8/e;->E(LH8/e;LF8/c1;LH8/l;I)V

    goto :goto_f1

    :cond_da
    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_b0

    :cond_e3
    move-object/from16 v1, p1

    invoke-virtual {v1}, LK8/b;->b()V

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_f0
    .catchall {:try_start_26 .. :try_end_f0} :catchall_63

    goto :goto_b0

    :cond_f1
    :goto_f1
    invoke-virtual {v6}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_fe

    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_fe
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_105

    return-object p0

    :cond_105
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_108
    invoke-virtual {v6}, LF8/n;->P()V

    throw p0
.end method

.method private static final synthetic g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final g1(J)Z
    .registers 5

    invoke-direct {p0, p1, p2}, LH8/e;->y0(J)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const-wide v0, 0xfffffffffffffffL

    and-long/2addr p1, v0

    invoke-direct {p0, p1, p2}, LH8/e;->O(J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final h0()Ljava/lang/Throwable;
    .registers 2

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_d

    new-instance p0, LH8/o;

    const-string v0, "Channel was closed"

    invoke-direct {p0, v0}, LH8/o;-><init>(Ljava/lang/String;)V

    :cond_d
    return-object p0
.end method

.method private final h1(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 5

    instance-of v0, p1, LN8/k;

    if-eqz v0, :cond_b

    check-cast p1, LN8/k;

    invoke-interface {p1, p0, p2}, LN8/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_b
    instance-of v0, p1, LH8/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_32

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LH8/u;

    iget-object p1, p1, LH8/u;->q:LF8/n;

    sget-object v0, LH8/k;->b:LH8/k$b;

    invoke-virtual {v0, p2}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p2

    iget-object v0, p0, LH8/e;->r:Lv8/l;

    if-eqz v0, :cond_2b

    invoke-direct {p0, v0}, LH8/e;->N(Lv8/l;)LC8/e;

    move-result-object v1

    :cond_2b
    check-cast v1, Lv8/q;

    invoke-static {p1, p2, v1}, LH8/f;->u(LF8/l;Ljava/lang/Object;Lv8/q;)Z

    move-result p0

    return p0

    :cond_32
    instance-of v0, p1, LH8/e$a;

    if-eqz v0, :cond_42

    const-string p0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LH8/e$a;

    invoke-virtual {p1, p2}, LH8/e$a;->i(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_42
    instance-of v0, p1, LF8/l;

    if-eqz v0, :cond_5c

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/l;

    iget-object v0, p0, LH8/e;->r:Lv8/l;

    if-eqz v0, :cond_55

    invoke-direct {p0, v0}, LH8/e;->K(Lv8/l;)LC8/e;

    move-result-object v1

    :cond_55
    check-cast v1, Lv8/q;

    invoke-static {p1, p2, v1}, LH8/f;->u(LF8/l;Ljava/lang/Object;Lv8/q;)Z

    move-result p0

    return p0

    :cond_5c
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected receiver type: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic i(Lv8/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, LH8/e;->M(Lv8/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->y:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final i1(Ljava/lang/Object;LH8/l;I)Z
    .registers 5

    instance-of v0, p1, LF8/l;

    if-eqz v0, :cond_14

    const-string p0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/l;

    sget-object p0, Lh8/A;->a:Lh8/A;

    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-static {p1, p0, p3, p2, p3}, LH8/f;->C(LF8/l;Ljava/lang/Object;Lv8/q;ILjava/lang/Object;)Z

    move-result p0

    return p0

    :cond_14
    instance-of v0, p1, LN8/k;

    if-eqz v0, :cond_34

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LN8/j;

    sget-object v0, Lh8/A;->a:Lh8/A;

    invoke-virtual {p1, p0, v0}, LN8/j;->x(Ljava/lang/Object;Ljava/lang/Object;)LN8/m;

    move-result-object p0

    sget-object p1, LN8/m;->r:LN8/m;

    if-ne p0, p1, :cond_2c

    invoke-virtual {p2, p3}, LH8/l;->w(I)V

    :cond_2c
    sget-object p1, LN8/m;->q:LN8/m;

    if-ne p0, p1, :cond_32

    const/4 p0, 0x1

    return p0

    :cond_32
    const/4 p0, 0x0

    return p0

    :cond_34
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected waiter: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic j(LH8/e;Lv8/l;)LC8/e;
    .registers 2

    invoke-direct {p0, p1}, LH8/e;->K(Lv8/l;)LC8/e;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->u:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method public static final synthetic k(LH8/e;Lv8/l;Ljava/lang/Object;)Lv8/q;
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/e;->L(Lv8/l;Ljava/lang/Object;)Lv8/q;

    move-result-object p0

    return-object p0
.end method

.method private final k1(LH8/l;IJ)Z
    .registers 8

    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/c1;

    if-eqz v1, :cond_37

    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    cmp-long v1, p3, v1

    if-ltz v1, :cond_37

    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-direct {p0, v0, p1, p2}, LH8/e;->i1(Ljava/lang/Object;LH8/l;I)Z

    move-result p0

    if-eqz p0, :cond_2b

    sget-object p0, LH8/f;->d:LK8/D;

    invoke-virtual {p1, p2, p0}, LH8/l;->F(ILjava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    :cond_2b
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, LH8/l;->F(ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p2, p0}, LH8/l;->C(IZ)V

    return p0

    :cond_37
    invoke-direct {p0, p1, p2, p3, p4}, LH8/e;->l1(LH8/l;IJ)Z

    move-result p0

    return p0
.end method

.method private final l1(LH8/l;IJ)Z
    .registers 11

    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/c1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_46

    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    cmp-long v1, p3, v4

    if-gez v1, :cond_25

    new-instance v1, LH8/x;

    move-object v2, v0

    check-cast v2, LF8/c1;

    invoke-direct {v1, v2}, LH8/x;-><init>(LF8/c1;)V

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_25
    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, p1, p2}, LH8/e;->i1(Ljava/lang/Object;LH8/l;I)Z

    move-result p0

    if-eqz p0, :cond_3b

    sget-object p0, LH8/f;->d:LK8/D;

    invoke-virtual {p1, p2, p0}, LH8/l;->F(ILjava/lang/Object;)V

    return v3

    :cond_3b
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, LH8/l;->F(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, v2}, LH8/l;->C(IZ)V

    return v2

    :cond_46
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_4d

    return v2

    :cond_4d
    if-nez v0, :cond_5a

    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_5a
    sget-object v1, LH8/f;->d:LK8/D;

    if-ne v0, v1, :cond_5f

    return v3

    :cond_5f
    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_9b

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_9b

    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_72

    goto :goto_9b

    :cond_72
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_79

    return v3

    :cond_79
    invoke-static {}, LH8/f;->q()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_80

    goto :goto_0

    :cond_80
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unexpected cell state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9b
    :goto_9b
    return v3
.end method

.method public static final synthetic m(LH8/e;Lv8/l;)LC8/e;
    .registers 2

    invoke-direct {p0, p1}, LH8/e;->N(Lv8/l;)LC8/e;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final m1(LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_33

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v1, p3, v1

    if-ltz v1, :cond_2d

    if-nez p5, :cond_1f

    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p0

    return-object p0

    :cond_1f
    invoke-virtual {p1, p2, v0, p5}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-direct {p0}, LH8/e;->X()V

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p0

    return-object p0

    :cond_2d
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    goto :goto_49

    :cond_33
    sget-object v1, LH8/f;->d:LK8/D;

    if-ne v0, v1, :cond_2d

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-direct {p0}, LH8/e;->X()V

    invoke-virtual {p1, p2}, LH8/l;->D(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :goto_49
    invoke-direct/range {v0 .. v5}, LH8/e;->n1(LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->t:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final n1(LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;
    .registers 11

    :cond_0
    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8a

    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_e

    goto/16 :goto_8a

    :cond_e
    sget-object v1, LH8/f;->d:LK8/D;

    if-ne v0, v1, :cond_24

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LH8/e;->X()V

    invoke-virtual {p1, p2}, LH8/l;->D(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_24
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_2f

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p0

    return-object p0

    :cond_2f
    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_3a

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p0

    return-object p0

    :cond_3a
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_48

    invoke-direct {p0}, LH8/e;->X()V

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p0

    return-object p0

    :cond_48
    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, LH8/f;->q()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of p3, v0, LH8/x;

    if-eqz p3, :cond_60

    check-cast v0, LH8/x;

    iget-object v0, v0, LH8/x;->a:LF8/c1;

    :cond_60
    invoke-direct {p0, v0, p1, p2}, LH8/e;->i1(Ljava/lang/Object;LH8/l;I)Z

    move-result p4

    if-eqz p4, :cond_75

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LH8/l;->F(ILjava/lang/Object;)V

    invoke-direct {p0}, LH8/e;->X()V

    invoke-virtual {p1, p2}, LH8/l;->D(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_75
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object p4

    invoke-virtual {p1, p2, p4}, LH8/l;->F(ILjava/lang/Object;)V

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p4}, LH8/l;->C(IZ)V

    if-eqz p3, :cond_85

    invoke-direct {p0}, LH8/e;->X()V

    :cond_85
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p0

    return-object p0

    :cond_8a
    :goto_8a
    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v1, p3, v1

    if-gez v1, :cond_ae

    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LH8/e;->X()V

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p0

    return-object p0

    :cond_ae
    if-nez p5, :cond_b5

    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p0

    return-object p0

    :cond_b5
    invoke-virtual {p1, p2, v0, p5}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LH8/e;->X()V

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LH8/e;JLH8/l;)LH8/l;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH8/e;->Z(JLH8/l;)LH8/l;

    move-result-object p0

    return-object p0
.end method

.method private final o1(LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .registers 11

    invoke-virtual {p1, p2, p3}, LH8/l;->G(ILjava/lang/Object;)V

    if-eqz p7, :cond_a

    invoke-direct/range {p0 .. p7}, LH8/e;->p1(LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    return p0

    :cond_a
    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_2d

    invoke-direct {p0, p4, p5}, LH8/e;->O(J)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_21

    sget-object v0, LH8/f;->d:LK8/D;

    invoke-virtual {p1, p2, v2, v0}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_59

    return v1

    :cond_21
    if-nez p6, :cond_25

    const/4 p0, 0x3

    return p0

    :cond_25
    invoke-virtual {p1, p2, v2, p6}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_59

    const/4 p0, 0x2

    return p0

    :cond_2d
    instance-of v2, v0, LF8/c1;

    if-eqz v2, :cond_59

    invoke-virtual {p1, p2}, LH8/l;->w(I)V

    invoke-direct {p0, v0, p3}, LH8/e;->h1(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_46

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LH8/l;->F(ILjava/lang/Object;)V

    invoke-virtual {p0}, LH8/e;->O0()V

    const/4 p0, 0x0

    return p0

    :cond_46
    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, LH8/l;->x(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object p3

    if-eq p0, p3, :cond_57

    invoke-virtual {p1, p2, v1}, LH8/l;->C(IZ)V

    :cond_57
    const/4 p0, 0x5

    return p0

    :cond_59
    invoke-direct/range {p0 .. p7}, LH8/e;->p1(LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    return p0
.end method

.method private static final synthetic p0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LH8/e;->A:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final p1(LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .registers 13

    :cond_0
    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_37

    invoke-direct {p0, p4, p5}, LH8/e;->O(J)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1b

    if-nez p7, :cond_1b

    sget-object v0, LH8/f;->d:LK8/D;

    invoke-virtual {p1, p2, v4, v0}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_1b
    if-eqz p7, :cond_2b

    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v0

    invoke-virtual {p1, p2, v4, v0}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v2}, LH8/l;->C(IZ)V

    return v1

    :cond_2b
    if-nez p6, :cond_2f

    const/4 p0, 0x3

    return p0

    :cond_2f
    invoke-virtual {p1, p2, v4, p6}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_37
    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v4

    if-ne v0, v4, :cond_46

    sget-object v1, LH8/f;->d:LK8/D;

    invoke-virtual {p1, p2, v0, v1}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_46
    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object p4

    const/4 p5, 0x5

    if-ne v0, p4, :cond_51

    invoke-virtual {p1, p2}, LH8/l;->w(I)V

    return p5

    :cond_51
    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object p4

    if-ne v0, p4, :cond_5b

    invoke-virtual {p1, p2}, LH8/l;->w(I)V

    return p5

    :cond_5b
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p4

    if-ne v0, p4, :cond_68

    invoke-virtual {p1, p2}, LH8/l;->w(I)V

    invoke-direct {p0}, LH8/e;->V()V

    return v1

    :cond_68
    invoke-virtual {p1, p2}, LH8/l;->w(I)V

    instance-of p4, v0, LH8/x;

    if-eqz p4, :cond_73

    check-cast v0, LH8/x;

    iget-object v0, v0, LH8/x;->a:LF8/c1;

    :cond_73
    invoke-direct {p0, v0, p3}, LH8/e;->h1(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_84

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LH8/l;->F(ILjava/lang/Object;)V

    invoke-virtual {p0}, LH8/e;->O0()V

    return v2

    :cond_84
    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, LH8/l;->x(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object p3

    if-eq p0, p3, :cond_95

    invoke-virtual {p1, p2, v3}, LH8/l;->C(IZ)V

    :cond_95
    return p5
.end method

.method public static final synthetic q(LH8/e;JLH8/l;)LH8/l;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH8/e;->a0(JLH8/l;)LH8/l;

    move-result-object p0

    return-object p0
.end method

.method private final q1(J)V
    .registers 10

    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    cmp-long v1, v3, p1

    if-ltz v1, :cond_d

    goto :goto_19

    :cond_d
    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    move-object v2, p0

    move-wide v5, p1

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_1a

    :goto_19
    return-void

    :cond_1a
    move-object p0, v2

    move-wide p1, v5

    goto :goto_4
.end method

.method public static final synthetic r(LH8/e;)Ljava/lang/Throwable;
    .registers 1

    invoke-direct {p0}, LH8/e;->h0()Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method private final r0(J)V
    .registers 7

    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    and-long/2addr p1, v0

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1f

    :goto_11
    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide p1

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1f

    goto :goto_11

    :cond_1f
    return-void
.end method

.method private final r1(J)V
    .registers 10

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide v1, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v5, v1, p1

    if-ltz v5, :cond_13

    goto :goto_27

    :cond_13
    const/16 v5, 0x3c

    shr-long v5, v3, v5

    long-to-int v5, v5

    invoke-static {v1, v2, v5}, LH8/f;->b(JI)J

    move-result-wide v5

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_28

    :goto_27
    return-void

    :cond_28
    move-object p0, v2

    goto :goto_4
.end method

.method static synthetic s0(LH8/e;JILjava/lang/Object;)V
    .registers 5

    if-nez p4, :cond_c

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_8

    const-wide/16 p1, 0x1

    :cond_8
    invoke-direct {p0, p1, p2}, LH8/e;->r0(J)V

    return-void

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final t0()V
    .registers 4

    invoke-static {}, LH8/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_f

    invoke-static {}, LH8/f;->d()LK8/D;

    move-result-object v2

    goto :goto_13

    :cond_f
    invoke-static {}, LH8/f;->e()LK8/D;

    move-result-object v2

    :goto_13
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez v1, :cond_1c

    return-void

    :cond_1c
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/l;

    check-cast v1, Lv8/l;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-interface {v1, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final u0(LH8/l;IJ)Z
    .registers 8

    :cond_0
    invoke-virtual {p1, p2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_48

    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v2

    if-ne v0, v2, :cond_e

    goto :goto_48

    :cond_e
    sget-object p1, LH8/f;->d:LK8/D;

    const/4 p2, 0x1

    if-ne v0, p1, :cond_14

    return p2

    :cond_14
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_1b

    return v1

    :cond_1b
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_22

    return v1

    :cond_22
    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_29

    return v1

    :cond_29
    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_30

    return v1

    :cond_30
    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_37

    return p2

    :cond_37
    invoke-static {}, LH8/f;->q()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_3e

    return v1

    :cond_3e
    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide p0

    cmp-long p0, p3, p0

    if-nez p0, :cond_47

    return p2

    :cond_47
    return v1

    :cond_48
    :goto_48
    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object v2

    invoke-virtual {p1, p2, v0, v2}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LH8/e;->X()V

    return v1
.end method

.method public static final synthetic v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    invoke-static {}, LH8/e;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final v0(JZ)Z
    .registers 10

    const/16 v0, 0x3c

    shr-long v0, p1, v0

    long-to-int v0, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_45

    const/4 v2, 0x1

    if-eq v0, v2, :cond_45

    const/4 v3, 0x2

    const-wide v4, 0xfffffffffffffffL

    if-eq v0, v3, :cond_36

    const/4 p3, 0x3

    if-ne v0, p3, :cond_1b

    and-long/2addr p1, v4

    invoke-direct {p0, p1, p2}, LH8/e;->T(J)V

    return v2

    :cond_1b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "unexpected close status: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    and-long/2addr p1, v4

    invoke-direct {p0, p1, p2}, LH8/e;->U(J)LH8/l;

    if-eqz p3, :cond_44

    invoke-virtual {p0}, LH8/e;->q0()Z

    move-result p0

    if-nez p0, :cond_43

    return v2

    :cond_43
    return v1

    :cond_44
    return v2

    :cond_45
    return v1
.end method

.method public static final synthetic w()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic x(LH8/e;J)Z
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/e;->y0(J)Z

    move-result p0

    return p0
.end method

.method private final x0(J)Z
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LH8/e;->v0(JZ)Z

    move-result p0

    return p0
.end method

.method public static final synthetic y(LH8/e;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH8/e;->G0(Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V

    return-void
.end method

.method private final y0(J)Z
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LH8/e;->v0(JZ)Z

    move-result p0

    return p0
.end method

.method public static final synthetic z(LH8/e;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH8/e;->H0(Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)V

    return-void
.end method


# virtual methods
.method protected I0()V
    .registers 1

    return-void
.end method

.method protected O0()V
    .registers 1

    return-void
.end method

.method public P(Ljava/lang/Throwable;)Z
    .registers 3

    if-nez p1, :cond_9

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Channel was cancelled"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_9
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LH8/e;->S(Ljava/lang/Throwable;Z)Z

    move-result p0

    return p0
.end method

.method protected P0()V
    .registers 1

    return-void
.end method

.method protected S(Ljava/lang/Throwable;Z)Z
    .registers 5

    if-eqz p2, :cond_5

    invoke-direct {p0}, LH8/e;->C0()V

    :cond_5
    invoke-static {}, LH8/e;->p0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LH8/f;->l()LK8/D;

    move-result-object v1

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p2, :cond_17

    invoke-direct {p0}, LH8/e;->D0()V

    goto :goto_1a

    :cond_17
    invoke-direct {p0}, LH8/e;->E0()V

    :goto_1a
    invoke-direct {p0}, LH8/e;->V()V

    invoke-virtual {p0}, LH8/e;->I0()V

    if-eqz p1, :cond_25

    invoke-direct {p0}, LH8/e;->t0()V

    :cond_25
    return p1
.end method

.method protected final W(J)V
    .registers 13

    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :goto_a
    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    iget v1, p0, LH8/e;->q:I

    int-to-long v1, v1

    add-long/2addr v1, v4

    invoke-direct {p0}, LH8/e;->c0()J

    move-result-wide v6

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-gez v1, :cond_23

    return-void

    :cond_23
    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    const-wide/16 v6, 0x1

    add-long/2addr v6, v4

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    move-object v2, v3

    if-eqz p0, :cond_79

    sget p0, LH8/f;->b:I

    int-to-long v6, p0

    div-long v6, v4, v6

    int-to-long v8, p0

    rem-long v8, v4, v8

    long-to-int p0, v8

    iget-wide v8, v0, LK8/A;->s:J

    cmp-long v1, v8, v6

    if-eqz v1, :cond_4a

    invoke-direct {v2, v6, v7, v0}, LH8/e;->Z(JLH8/l;)LH8/l;

    move-result-object v1

    if-nez v1, :cond_48

    goto :goto_79

    :cond_48
    move-object v3, v1

    goto :goto_4b

    :cond_4a
    move-object v3, v0

    :goto_4b
    const/4 v7, 0x0

    move-wide v5, v4

    move v4, p0

    invoke-direct/range {v2 .. v7}, LH8/e;->m1(LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-wide v4, v5

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object v0

    if-ne p0, v0, :cond_65

    invoke-virtual {v2}, LH8/e;->o0()J

    move-result-wide v0

    cmp-long p0, v4, v0

    if-gez p0, :cond_76

    invoke-virtual {v3}, LK8/b;->b()V

    goto :goto_76

    :cond_65
    invoke-virtual {v3}, LK8/b;->b()V

    iget-object v0, v2, LH8/e;->r:Lv8/l;

    if-eqz v0, :cond_76

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-static {v0, p0, v4, v1, v4}, LK8/w;->c(Lv8/l;Ljava/lang/Object;LK8/P;ILjava/lang/Object;)LK8/P;

    move-result-object p0

    if-nez p0, :cond_75

    goto :goto_76

    :cond_75
    throw p0

    :cond_76
    :goto_76
    move-object p0, v2

    move-object v0, v3

    goto :goto_a

    :cond_79
    :goto_79
    move-object p0, v2

    goto :goto_a
.end method

.method public c(Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, LH8/e;->W0(LH8/e;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public d()LN8/g;
    .registers 6

    new-instance v0, LN8/h;

    sget-object v1, LH8/e$d;->q:LH8/e$d;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv8/q;

    sget-object v3, LH8/e$e;->q:LH8/e$e;

    const-string v4, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv8/q;

    iget-object v3, p0, LH8/e;->s:Lv8/q;

    invoke-direct {v0, p0, v1, v2, v3}, LN8/h;-><init>(Ljava/lang/Object;Lv8/q;Lv8/q;Lv8/q;)V

    return-object v0
.end method

.method public e(Lv8/l;)V
    .registers 6

    invoke-static {}, LH8/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    return-void

    :cond_c
    invoke-static {}, LH8/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LH8/f;->d()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_34

    invoke-static {}, LH8/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LH8/f;->d()LK8/D;

    move-result-object v2

    invoke-static {}, LH8/f;->e()LK8/D;

    move-result-object v3

    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-interface {p1, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_34
    invoke-static {}, LH8/f;->e()LK8/D;

    move-result-object p0

    if-ne v1, p0, :cond_42

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Another handler was already registered and successfully invoked"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_42
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Another handler is already registered: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected final e0()Ljava/lang/Throwable;
    .registers 2

    invoke-static {}, LH8/e;->p0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0
.end method

.method public final f(Ljava/util/concurrent/CancellationException;)V
    .registers 2

    invoke-virtual {p0, p1}, LH8/e;->P(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public g()Ljava/lang/Object;
    .registers 12

    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, LH8/e;->x0(J)Z

    move-result v4

    if-eqz v4, :cond_21

    sget-object v0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {v0, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_21
    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_32

    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/k$b;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_32
    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object v5

    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :goto_40
    invoke-virtual {p0}, LH8/e;->w0()Z

    move-result v1

    if-eqz v1, :cond_51

    sget-object v0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {v0, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_51
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v3

    sget v1, LH8/f;->b:I

    int-to-long v6, v1

    div-long v6, v3, v6

    int-to-long v1, v1

    rem-long v1, v3, v1

    long-to-int v2, v1

    iget-wide v8, v0, LK8/A;->s:J

    cmp-long v1, v8, v6

    if-eqz v1, :cond_71

    invoke-static {p0, v6, v7, v0}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object v1

    if-nez v1, :cond_6f

    goto :goto_40

    :cond_6f
    :goto_6f
    move-object v0, p0

    goto :goto_73

    :cond_71
    move-object v1, v0

    goto :goto_6f

    :goto_73
    invoke-static/range {v0 .. v5}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object v6

    if-ne p0, v6, :cond_9a

    instance-of p0, v5, LF8/c1;

    if-eqz p0, :cond_87

    check-cast v5, LF8/c1;

    goto :goto_88

    :cond_87
    const/4 v5, 0x0

    :goto_88
    if-eqz v5, :cond_8d

    invoke-static {v1, v5, v0, v2}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    :cond_8d
    invoke-virtual {v1, v3, v4}, LH8/e;->s1(J)V

    invoke-virtual {v0}, LK8/A;->t()V

    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/k$b;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_9a
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object v2

    if-ne p0, v2, :cond_ad

    invoke-virtual {v1}, LH8/e;->o0()J

    move-result-wide v6

    cmp-long p0, v3, v6

    if-gez p0, :cond_ab

    invoke-virtual {v0}, LK8/b;->b()V

    :cond_ab
    move-object p0, v1

    goto :goto_40

    :cond_ad
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object v1

    if-eq p0, v1, :cond_bd

    invoke-virtual {v0}, LK8/b;->b()V

    sget-object v0, LH8/k;->b:LH8/k$b;

    invoke-virtual {v0, p0}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_bd
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public h(Ljava/lang/Throwable;)Z
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LH8/e;->S(Ljava/lang/Throwable;Z)Z

    move-result p0

    return p0
.end method

.method public iterator()LH8/i;
    .registers 2

    new-instance v0, LH8/e$a;

    invoke-direct {v0, p0}, LH8/e$a;-><init>(LH8/e;)V

    return-object v0
.end method

.method protected final j1(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    sget-object v6, LH8/f;->d:LK8/D;

    invoke-static {}, LH8/e;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :cond_c
    :goto_c
    invoke-static {}, LH8/e;->w()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v4, v1, v3

    invoke-static {p0, v1, v2}, LH8/e;->x(LH8/e;J)Z

    move-result v7

    sget v8, LH8/f;->b:I

    int-to-long v1, v8

    div-long v1, v4, v1

    int-to-long v9, v8

    rem-long v9, v4, v9

    long-to-int v3, v9

    iget-wide v9, v0, LK8/A;->s:J

    cmp-long v9, v9, v1

    if-eqz v9, :cond_45

    invoke-static {p0, v1, v2, v0}, LH8/e;->q(LH8/e;JLH8/l;)LH8/l;

    move-result-object v1

    if-nez v1, :cond_41

    if-eqz v7, :cond_c

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_41
    move-object v0, p0

    move v2, v3

    :goto_43
    move-object v3, p1

    goto :goto_49

    :cond_45
    move-object v1, v0

    move v2, v3

    move-object v0, p0

    goto :goto_43

    :goto_49
    invoke-static/range {v0 .. v7}, LH8/e;->J(LH8/e;LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    move-object p1, v0

    move-object v0, v1

    if-eqz p0, :cond_bd

    const/4 v1, 0x1

    if-eq p0, v1, :cond_b4

    const/4 v1, 0x2

    if-eq p0, v1, :cond_85

    const/4 v1, 0x3

    if-eq p0, v1, :cond_7d

    const/4 v1, 0x4

    if-eq p0, v1, :cond_67

    const/4 v1, 0x5

    if-eq p0, v1, :cond_61

    goto :goto_64

    :cond_61
    invoke-virtual {v0}, LK8/b;->b()V

    :goto_64
    move-object p0, p1

    move-object p1, v3

    goto :goto_c

    :cond_67
    invoke-virtual {p1}, LH8/e;->k0()J

    move-result-wide v1

    cmp-long p0, v4, v1

    if-gez p0, :cond_72

    invoke-virtual {v0}, LK8/b;->b()V

    :cond_72
    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, p1}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_7d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_85
    if-eqz v7, :cond_95

    invoke-virtual {v0}, LK8/A;->t()V

    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, p1}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_95
    instance-of p0, v6, LF8/c1;

    if-eqz p0, :cond_9c

    check-cast v6, LF8/c1;

    goto :goto_9d

    :cond_9c
    const/4 v6, 0x0

    :goto_9d
    if-eqz v6, :cond_a2

    invoke-static {p1, v6, v0, v2}, LH8/e;->E(LH8/e;LF8/c1;LH8/l;I)V

    :cond_a2
    iget-wide v0, v0, LK8/A;->s:J

    int-to-long v3, v8

    mul-long/2addr v0, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, LH8/e;->W(J)V

    sget-object p0, LH8/k;->b:LH8/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_b4
    sget-object p0, LH8/k;->b:LH8/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_bd
    invoke-virtual {v0}, LK8/b;->b()V

    sget-object p0, LH8/k;->b:LH8/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final k0()J
    .registers 3

    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public l(Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, LH8/e;->V0(LH8/e;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected final l0()Ljava/lang/Throwable;
    .registers 2

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_d

    new-instance p0, LH8/p;

    const-string v0, "Channel was closed"

    invoke-direct {p0, v0}, LH8/p;-><init>(Ljava/lang/String;)V

    :cond_d
    return-object p0
.end method

.method public n(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LH8/e;->e1(LH8/e;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final o0()J
    .registers 5

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide v2, 0xfffffffffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public p(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LH8/e;->g1(J)Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/k$b;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_15
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v6

    invoke-static {}, LH8/e;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :cond_23
    :goto_23
    invoke-static {}, LH8/e;->w()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v4, v1, v3

    invoke-static {p0, v1, v2}, LH8/e;->x(LH8/e;J)Z

    move-result v7

    sget v1, LH8/f;->b:I

    int-to-long v2, v1

    div-long v2, v4, v2

    int-to-long v8, v1

    rem-long v8, v4, v8

    long-to-int v1, v8

    iget-wide v8, v0, LK8/A;->s:J

    cmp-long v8, v8, v2

    if-eqz v8, :cond_5e

    invoke-static {p0, v2, v3, v0}, LH8/e;->q(LH8/e;JLH8/l;)LH8/l;

    move-result-object v2

    if-nez v2, :cond_58

    if-eqz v7, :cond_23

    sget-object p1, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_58
    move-object v0, v2

    move v2, v1

    move-object v1, v0

    move-object v0, p0

    move-object v3, p1

    goto :goto_62

    :cond_5e
    move-object v3, p1

    move v2, v1

    move-object v1, v0

    move-object v0, p0

    :goto_62
    invoke-static/range {v0 .. v7}, LH8/e;->J(LH8/e;LH8/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    move-object p1, v0

    move-object v0, v1

    if-eqz p0, :cond_ce

    const/4 v1, 0x1

    if-eq p0, v1, :cond_c5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_9e

    const/4 v1, 0x3

    if-eq p0, v1, :cond_96

    const/4 v1, 0x4

    if-eq p0, v1, :cond_80

    const/4 v1, 0x5

    if-eq p0, v1, :cond_7a

    goto :goto_7d

    :cond_7a
    invoke-virtual {v0}, LK8/b;->b()V

    :goto_7d
    move-object p0, p1

    move-object p1, v3

    goto :goto_23

    :cond_80
    invoke-virtual {p1}, LH8/e;->k0()J

    move-result-wide v1

    cmp-long p0, v4, v1

    if-gez p0, :cond_8b

    invoke-virtual {v0}, LK8/b;->b()V

    :cond_8b
    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, p1}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_96
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9e
    if-eqz v7, :cond_ae

    invoke-virtual {v0}, LK8/A;->t()V

    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p1}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, p1}, LH8/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_ae
    instance-of p0, v6, LF8/c1;

    if-eqz p0, :cond_b5

    check-cast v6, LF8/c1;

    goto :goto_b6

    :cond_b5
    const/4 v6, 0x0

    :goto_b6
    if-eqz v6, :cond_bb

    invoke-static {p1, v6, v0, v2}, LH8/e;->E(LH8/e;LF8/c1;LH8/l;I)V

    :cond_bb
    invoke-virtual {v0}, LK8/A;->t()V

    sget-object p0, LH8/k;->b:LH8/k$b;

    invoke-virtual {p0}, LH8/k$b;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_c5
    sget-object p0, LH8/k;->b:LH8/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_ce
    invoke-virtual {v0}, LK8/b;->b()V

    sget-object p0, LH8/k;->b:LH8/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final q0()Z
    .registers 10

    :cond_0
    :goto_0
    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    invoke-virtual {p0}, LH8/e;->k0()J

    move-result-wide v3

    invoke-virtual {p0}, LH8/e;->o0()J

    move-result-wide v1

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-gtz v1, :cond_18

    return v2

    :cond_18
    sget v1, LH8/f;->b:I

    int-to-long v5, v1

    div-long v5, v3, v5

    iget-wide v7, v0, LK8/A;->s:J

    cmp-long v7, v7, v5

    if-eqz v7, :cond_3a

    invoke-direct {p0, v5, v6, v0}, LH8/e;->Z(JLH8/l;)LH8/l;

    move-result-object v0

    if-nez v0, :cond_3a

    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    iget-wide v0, v0, LK8/A;->s:J

    cmp-long v0, v0, v5

    if-gez v0, :cond_0

    return v2

    :cond_3a
    invoke-virtual {v0}, LK8/b;->b()V

    int-to-long v1, v1

    rem-long v1, v3, v1

    long-to-int v1, v1

    invoke-direct {p0, v0, v1, v3, v4}, LH8/e;->u0(LH8/l;IJ)Z

    move-result v0

    if-eqz v0, :cond_49

    const/4 p0, 0x1

    return p0

    :cond_49
    invoke-static {}, LH8/e;->j0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_0
.end method

.method public s()Z
    .registers 3

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LH8/e;->y0(J)Z

    move-result p0

    return p0
.end method

.method public final s1(J)V
    .registers 21

    move-object/from16 v1, p0

    invoke-direct {v1}, LH8/e;->A0()Z

    move-result v0

    if-eqz v0, :cond_a

    goto/16 :goto_8c

    :cond_a
    :goto_a
    invoke-direct {v1}, LH8/e;->c0()J

    move-result-wide v2

    cmp-long v0, v2, p1

    if-lez v0, :cond_ac

    invoke-static {}, LH8/f;->g()I

    move-result v0

    const/4 v6, 0x0

    move v2, v6

    :goto_18
    const-wide v7, 0x3fffffffffffffffL    # 1.9999999999999998

    if-ge v2, v0, :cond_3c

    invoke-direct {v1}, LH8/e;->c0()J

    move-result-wide v3

    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v9

    and-long/2addr v7, v9

    cmp-long v5, v3, v7

    if-nez v5, :cond_39

    invoke-direct {v1}, LH8/e;->c0()J

    move-result-wide v7

    cmp-long v3, v3, v7

    if-nez v3, :cond_39

    goto :goto_8c

    :cond_39
    add-int/lit8 v2, v2, 0x1

    goto :goto_18

    :cond_3c
    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_40
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v4, v2, v7

    const/4 v9, 0x1

    invoke-static {v4, v5, v9}, LH8/f;->a(JZ)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v2

    if-eqz v2, :cond_a9

    :goto_51
    invoke-direct {v1}, LH8/e;->c0()J

    move-result-wide v2

    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    and-long v10, v4, v7

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    and-long/2addr v12, v4

    const-wide/16 v14, 0x0

    cmp-long v0, v12, v14

    if-eqz v0, :cond_6a

    move v0, v9

    goto :goto_6b

    :cond_6a
    move v0, v6

    :goto_6b
    cmp-long v12, v2, v10

    if-nez v12, :cond_91

    invoke-direct {v1}, LH8/e;->c0()J

    move-result-wide v12

    cmp-long v2, v2, v12

    if-nez v2, :cond_91

    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_7b
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v4, v2, v7

    invoke-static {v4, v5, v6}, LH8/f;->a(JZ)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v2

    move-object v1, v0

    if-eqz v2, :cond_8d

    :goto_8c
    return-void

    :cond_8d
    move-object v0, v1

    move-object/from16 v1, p0

    goto :goto_7b

    :cond_91
    if-nez v0, :cond_a6

    invoke-static {}, LH8/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-static {v10, v11, v9}, LH8/f;->a(JZ)J

    move-result-wide v1

    move-wide/from16 v16, v4

    move-wide v4, v1

    move-wide/from16 v2, v16

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_51

    :cond_a6
    move-object/from16 v1, p0

    goto :goto_51

    :cond_a9
    move-object/from16 v1, p0

    goto :goto_40

    :cond_ac
    move-object/from16 v1, p0

    goto/16 :goto_a
.end method

.method public toString()Ljava/lang/String;
    .registers 17

    move-object/from16 v0, p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v4, 0x3c

    shr-long/2addr v2, v4

    long-to-int v2, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_20

    if-eq v2, v3, :cond_1a

    goto :goto_25

    :cond_1a
    const-string v2, "cancelled,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_25

    :cond_20
    const-string v2, "closed,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "capacity="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v0, LH8/e;->q:I

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x2c

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "data=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v2, v3, [LH8/l;

    invoke-static {}, LH8/e;->i0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    aput-object v3, v2, v6

    invoke-static {}, LH8/e;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v7, 0x1

    aput-object v3, v2, v7

    invoke-static {}, LH8/e;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v2}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_76
    :goto_76
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, LH8/l;

    invoke-static {}, LH8/f;->n()LH8/l;

    move-result-object v9

    if-eq v8, v9, :cond_76

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_76

    :cond_8d
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1f8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_a2

    goto :goto_bc

    :cond_a2
    move-object v4, v3

    check-cast v4, LH8/l;

    iget-wide v8, v4, LK8/A;->s:J

    :cond_a7
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, LH8/l;

    iget-wide v10, v10, LK8/A;->s:J

    cmp-long v12, v8, v10

    if-lez v12, :cond_b6

    move-object v3, v4

    move-wide v8, v10

    :cond_b6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_a7

    :goto_bc
    check-cast v3, LH8/l;

    invoke-virtual {v0}, LH8/e;->k0()J

    move-result-wide v10

    invoke-virtual {v0}, LH8/e;->o0()J

    move-result-wide v12

    :goto_c6
    sget v0, LH8/f;->b:I

    move v2, v6

    :goto_c9
    if-ge v2, v0, :cond_1ce

    iget-wide v8, v3, LK8/A;->s:J

    sget v4, LH8/f;->b:I

    int-to-long v14, v4

    mul-long/2addr v8, v14

    int-to-long v14, v2

    add-long/2addr v8, v14

    cmp-long v4, v8, v12

    if-ltz v4, :cond_db

    cmp-long v14, v8, v10

    if-gez v14, :cond_1d7

    :cond_db
    invoke-virtual {v3, v2}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v3, v2}, LH8/l;->A(I)Ljava/lang/Object;

    move-result-object v15

    instance-of v6, v14, LF8/l;

    if-eqz v6, :cond_fd

    cmp-long v6, v8, v10

    if-gez v6, :cond_f1

    if-ltz v4, :cond_f1

    const-string v4, "receive"

    goto/16 :goto_195

    :cond_f1
    if-gez v4, :cond_f9

    if-ltz v6, :cond_f9

    const-string v4, "send"

    goto/16 :goto_195

    :cond_f9
    const-string v4, "cont"

    goto/16 :goto_195

    :cond_fd
    instance-of v6, v14, LN8/k;

    if-eqz v6, :cond_117

    cmp-long v6, v8, v10

    if-gez v6, :cond_10b

    if-ltz v4, :cond_10b

    const-string v4, "onReceive"

    goto/16 :goto_195

    :cond_10b
    if-gez v4, :cond_113

    if-ltz v6, :cond_113

    const-string v4, "onSend"

    goto/16 :goto_195

    :cond_113
    const-string v4, "select"

    goto/16 :goto_195

    :cond_117
    instance-of v4, v14, LH8/u;

    if-eqz v4, :cond_11f

    const-string v4, "receiveCatching"

    goto/16 :goto_195

    :cond_11f
    instance-of v4, v14, LH8/x;

    if-eqz v4, :cond_13a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "EB("

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v6, 0x29

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_195

    :cond_13a
    invoke-static {}, LH8/f;->q()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_193

    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14f

    goto :goto_193

    :cond_14f
    if-eqz v14, :cond_1c9

    invoke-static {}, LH8/f;->k()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c9

    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c9

    invoke-static {}, LH8/f;->o()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c9

    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c9

    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c9

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18e

    goto :goto_1c9

    :cond_18e
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_195

    :cond_193
    :goto_193
    const-string v4, "resuming_sender"

    :goto_195
    if-eqz v15, :cond_1b7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v8, 0x28

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "),"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1c9

    :cond_1b7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1c9
    :goto_1c9
    add-int/lit8 v2, v2, 0x1

    const/4 v6, 0x0

    goto/16 :goto_c9

    :cond_1ce
    invoke-virtual {v3}, LK8/b;->f()LK8/b;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LH8/l;

    if-nez v3, :cond_1f5

    :cond_1d7
    invoke-static {v1}, LE8/i;->P0(Ljava/lang/CharSequence;)C

    move-result v0

    if-ne v0, v5, :cond_1eb

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v7

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "deleteCharAt(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1eb
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1f5
    const/4 v6, 0x0

    goto/16 :goto_c6

    :cond_1f8
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public w0()Z
    .registers 3

    invoke-static {}, LH8/e;->n0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LH8/e;->x0(J)Z

    move-result p0

    return p0
.end method

.method protected z0()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method
