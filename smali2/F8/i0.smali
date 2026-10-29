.class public abstract LF8/i0;
.super LF8/j0;
.source "SourceFile"

# interfaces
.implements LF8/V;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/i0$a;,
        LF8/i0$b;,
        LF8/i0$c;,
        LF8/i0$d;
    }
.end annotation


# static fields
.field private static final synthetic v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _delayed$volatile:Ljava/lang/Object;

.field private volatile synthetic _isCompleted$volatile:I

.field private volatile synthetic _queue$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "_queue$volatile"

    const-class v1, LF8/i0;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/i0;->v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_delayed$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/i0;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_isCompleted$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/i0;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/j0;-><init>()V

    return-void
.end method

.method public static final synthetic A1(LF8/i0;)Z
    .registers 1

    invoke-direct {p0}, LF8/i0;->O0()Z

    move-result p0

    return p0
.end method

.method private final B1()V
    .registers 6

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1a

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {}, LF8/l0;->a()LK8/D;

    move-result-object v3

    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_48

    :cond_1a
    instance-of v2, v1, LK8/q;

    if-eqz v2, :cond_24

    check-cast v1, LK8/q;

    invoke-virtual {v1}, LK8/q;->d()Z

    return-void

    :cond_24
    invoke-static {}, LF8/l0;->a()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_2b

    goto :goto_48

    :cond_2b
    new-instance v2, LK8/q;

    const/16 v3, 0x8

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, LK8/q;-><init>(IZ)V

    const-string v3, "null cannot be cast to non-null type java.lang.Runnable"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, LK8/q;->a(Ljava/lang/Object;)I

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_48
    return-void
.end method

.method private final C1()Ljava/lang/Runnable;
    .registers 6

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_c

    return-object v2

    :cond_c
    instance-of v3, v1, LK8/q;

    if-eqz v3, :cond_2f

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, LK8/q;

    invoke-virtual {v2}, LK8/q;->m()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LK8/q;->h:LK8/D;

    if-eq v3, v4, :cond_23

    check-cast v3, Ljava/lang/Runnable;

    return-object v3

    :cond_23
    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v2}, LK8/q;->l()LK8/q;

    move-result-object v2

    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4

    :cond_2f
    invoke-static {}, LF8/l0;->a()LK8/D;

    move-result-object v3

    if-ne v1, v3, :cond_36

    return-object v2

    :cond_36
    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string p0, "null cannot be cast to non-null type java.lang.Runnable"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Runnable;

    return-object v1
.end method

.method private final E1()V
    .registers 8

    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0$d;

    if-eqz v0, :cond_42

    invoke-virtual {v0}, LK8/M;->e()Z

    move-result v1

    if-nez v1, :cond_42

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    :cond_19
    monitor-enter v0

    :try_start_1a
    invoke-virtual {v0}, LK8/M;->b()LK8/N;

    move-result-object v3
    :try_end_1e
    .catchall {:try_start_1a .. :try_end_1e} :catchall_31

    const/4 v4, 0x0

    if-nez v3, :cond_23

    monitor-exit v0

    goto :goto_3b

    :cond_23
    :try_start_23
    check-cast v3, LF8/i0$c;

    invoke-virtual {v3, v1, v2}, LF8/i0$c;->l(J)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_33

    invoke-direct {p0, v3}, LF8/i0;->F1(Ljava/lang/Runnable;)Z

    move-result v3

    goto :goto_34

    :catchall_31
    move-exception p0

    goto :goto_40

    :cond_33
    move v3, v6

    :goto_34
    if-eqz v3, :cond_3a

    invoke-virtual {v0, v6}, LK8/M;->i(I)LK8/N;

    move-result-object v4
    :try_end_3a
    .catchall {:try_start_23 .. :try_end_3a} :catchall_31

    :cond_3a
    monitor-exit v0

    :goto_3b
    check-cast v4, LF8/i0$c;

    if-nez v4, :cond_19

    goto :goto_42

    :goto_40
    monitor-exit v0

    throw p0

    :cond_42
    :goto_42
    return-void
.end method

.method private final F1(Ljava/lang/Runnable;)Z
    .registers 8

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0}, LF8/i0;->O0()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_10

    return v3

    :cond_10
    const/4 v2, 0x1

    if-nez v1, :cond_1f

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_1f
    instance-of v4, v1, LK8/q;

    if-eqz v4, :cond_45

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, LK8/q;

    invoke-virtual {v4, p1}, LK8/q;->a(Ljava/lang/Object;)I

    move-result v5

    if-eqz v5, :cond_44

    if-eq v5, v2, :cond_38

    const/4 v1, 0x2

    if-eq v5, v1, :cond_37

    goto :goto_4

    :cond_37
    return v3

    :cond_38
    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-virtual {v4}, LK8/q;->l()LK8/q;

    move-result-object v3

    invoke-virtual {v2, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4

    :cond_44
    return v2

    :cond_45
    invoke-static {}, LF8/l0;->a()LK8/D;

    move-result-object v4

    if-ne v1, v4, :cond_4c

    return v3

    :cond_4c
    new-instance v3, LK8/q;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v2}, LK8/q;-><init>(IZ)V

    const-string v4, "null cannot be cast to non-null type java.lang.Runnable"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, LK8/q;->a(Ljava/lang/Object;)I

    invoke-virtual {v3, p1}, LK8/q;->a(Ljava/lang/Object;)I

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2
.end method

.method private static final synthetic G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LF8/i0;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic H1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LF8/i0;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private static final synthetic I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LF8/i0;->v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final K1()V
    .registers 4

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    :goto_7
    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/i0$d;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, LK8/M;->j()LK8/N;

    move-result-object v2

    check-cast v2, LF8/i0$c;

    if-nez v2, :cond_1c

    goto :goto_20

    :cond_1c
    invoke-virtual {p0, v0, v1, v2}, LF8/j0;->y1(JLF8/i0$c;)V

    goto :goto_7

    :cond_20
    :goto_20
    return-void
.end method

.method private final N1(JLF8/i0$c;)I
    .registers 7

    invoke-direct {p0}, LF8/i0;->O0()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0$d;

    if-nez v0, :cond_2e

    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    new-instance v1, LF8/i0$d;

    invoke-direct {v1, p1, p2}, LF8/i0$d;-><init>(J)V

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v0, LF8/i0$d;

    :cond_2e
    invoke-virtual {p3, p1, p2, v0, p0}, LF8/i0$c;->k(JLF8/i0$d;LF8/i0;)I

    move-result p0

    return p0
.end method

.method private final O0()Z
    .registers 2

    invoke-static {}, LF8/i0;->H1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

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

.method private final P1(Z)V
    .registers 3

    invoke-static {}, LF8/i0;->H1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    return-void
.end method

.method private final Q1(LF8/i0$c;)Z
    .registers 3

    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/i0$d;

    if-eqz p0, :cond_13

    invoke-virtual {p0}, LK8/M;->f()LK8/N;

    move-result-object p0

    check-cast p0, LF8/i0$c;

    goto :goto_14

    :cond_13
    const/4 p0, 0x0

    :goto_14
    if-ne p0, p1, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public D1(Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, LF8/i0;->E1()V

    invoke-direct {p0, p1}, LF8/i0;->F1(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, LF8/j0;->z1()V

    return-void

    :cond_d
    sget-object p0, LF8/Q;->y:LF8/Q;

    invoke-virtual {p0, p1}, LF8/Q;->D1(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected J1()Z
    .registers 4

    invoke-virtual {p0}, LF8/h0;->t1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    :cond_8
    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0$d;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, LK8/M;->e()Z

    move-result v0

    if-nez v0, :cond_1b

    return v1

    :cond_1b
    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    if-nez p0, :cond_27

    return v0

    :cond_27
    instance-of v2, p0, LK8/q;

    if-eqz v2, :cond_32

    check-cast p0, LK8/q;

    invoke-virtual {p0}, LK8/q;->j()Z

    move-result p0

    return p0

    :cond_32
    invoke-static {}, LF8/l0;->a()LK8/D;

    move-result-object v2

    if-ne p0, v2, :cond_39

    return v0

    :cond_39
    return v1
.end method

.method protected final L1()V
    .registers 3

    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final M1(JLF8/i0$c;)V
    .registers 6

    invoke-direct {p0, p1, p2, p3}, LF8/i0;->N1(JLF8/i0$c;)I

    move-result v0

    if-eqz v0, :cond_19

    const/4 v1, 0x1

    if-eq v0, v1, :cond_15

    const/4 p0, 0x2

    if-ne v0, p0, :cond_d

    goto :goto_22

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected result"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_15
    invoke-virtual {p0, p1, p2, p3}, LF8/j0;->y1(JLF8/i0$c;)V

    return-void

    :cond_19
    invoke-direct {p0, p3}, LF8/i0;->Q1(LF8/i0$c;)Z

    move-result p1

    if-eqz p1, :cond_22

    invoke-virtual {p0}, LF8/j0;->z1()V

    :cond_22
    :goto_22
    return-void
.end method

.method protected final O1(JLjava/lang/Runnable;)LF8/d0;
    .registers 7

    invoke-static {p1, p2}, LF8/l0;->c(J)J

    move-result-wide p1

    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v0, p1, v0

    if-gez v0, :cond_1e

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    new-instance v2, LF8/i0$b;

    add-long/2addr p1, v0

    invoke-direct {v2, p1, p2, p3}, LF8/i0$b;-><init>(JLjava/lang/Runnable;)V

    invoke-virtual {p0, v0, v1, v2}, LF8/i0;->M1(JLF8/i0$c;)V

    return-object v2

    :cond_1e
    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method public T0(JLF8/l;)V
    .registers 7

    invoke-static {p1, p2}, LF8/l0;->c(J)J

    move-result-wide p1

    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v0, p1, v0

    if-gez v0, :cond_20

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    new-instance v2, LF8/i0$a;

    add-long/2addr p1, v0

    invoke-direct {v2, p0, p1, p2, p3}, LF8/i0$a;-><init>(LF8/i0;JLF8/l;)V

    invoke-virtual {p0, v0, v1, v2}, LF8/i0;->M1(JLF8/i0$c;)V

    invoke-static {p3, v2}, LF8/p;->a(LF8/l;LF8/d0;)V

    :cond_20
    return-void
.end method

.method public W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, LF8/V$a;->a(LF8/V;JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public final g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    invoke-virtual {p0, p2}, LF8/i0;->D1(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected p1()J
    .registers 7

    invoke-super {p0}, LF8/h0;->p1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_b

    return-wide v2

    :cond_b
    invoke-static {}, LF8/i0;->I1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_2f

    instance-of v1, v0, LK8/q;

    if-eqz v1, :cond_27

    check-cast v0, LK8/q;

    invoke-virtual {v0}, LK8/q;->j()Z

    move-result v0

    if-nez v0, :cond_2f

    return-wide v2

    :cond_27
    invoke-static {}, LF8/l0;->a()LK8/D;

    move-result-object p0

    if-ne v0, p0, :cond_2e

    return-wide v4

    :cond_2e
    return-wide v2

    :cond_2f
    invoke-static {}, LF8/i0;->G1()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/i0$d;

    if-eqz p0, :cond_53

    invoke-virtual {p0}, LK8/M;->f()LK8/N;

    move-result-object p0

    check-cast p0, LF8/i0$c;

    if-nez p0, :cond_44

    goto :goto_53

    :cond_44
    iget-wide v0, p0, LF8/i0$c;->q:J

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-static {v0, v1, v2, v3}, LB8/h;->g(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_53
    :goto_53
    return-wide v4
.end method

.method public shutdown()V
    .registers 5

    sget-object v0, LF8/V0;->a:LF8/V0;

    invoke-virtual {v0}, LF8/V0;->c()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LF8/i0;->P1(Z)V

    invoke-direct {p0}, LF8/i0;->B1()V

    :cond_c
    invoke-virtual {p0}, LF8/i0;->u1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_c

    invoke-direct {p0}, LF8/i0;->K1()V

    return-void
.end method

.method public u1()J
    .registers 4

    invoke-virtual {p0}, LF8/h0;->v1()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_9

    return-wide v1

    :cond_9
    invoke-direct {p0}, LF8/i0;->E1()V

    invoke-direct {p0}, LF8/i0;->C1()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-wide v1

    :cond_16
    invoke-virtual {p0}, LF8/i0;->p1()J

    move-result-wide v0

    return-wide v0
.end method
