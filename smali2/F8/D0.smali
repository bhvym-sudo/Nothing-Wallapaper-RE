.class public LF8/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/x0;
.implements LF8/u;
.implements LF8/M0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/D0$a;,
        LF8/D0$b;,
        LF8/D0$c;
    }
.end annotation


# static fields
.field private static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "_state$volatile"

    const-class v1, LF8/D0;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/D0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/D0;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_a

    invoke-static {}, LF8/E0;->c()LF8/g0;

    move-result-object p1

    goto :goto_e

    :cond_a
    invoke-static {}, LF8/E0;->d()LF8/g0;

    move-result-object p1

    :goto_e
    iput-object p1, p0, LF8/D0;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final C(Lm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LF8/D0$a;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LF8/D0$a;-><init>(Lm8/e;LF8/D0;)V

    invoke-virtual {v0}, LF8/n;->G()V

    new-instance v1, LF8/N0;

    invoke-direct {v1, v0}, LF8/N0;-><init>(LF8/n;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v2, v3}, LF8/A0;->m(LF8/x0;ZLF8/C0;ILjava/lang/Object;)LF8/d0;

    move-result-object p0

    invoke-static {v0, p0}, LF8/p;->a(LF8/l;LF8/d0;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_28

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_28
    return-object p0
.end method

.method private final C0(LF8/C0;)V
    .registers 4

    new-instance v0, LF8/I0;

    invoke-direct {v0}, LF8/I0;-><init>()V

    invoke-virtual {p1, v0}, LK8/o;->f(LK8/o;)Z

    invoke-virtual {p1}, LK8/o;->l()LK8/o;

    move-result-object v0

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final F0(Ljava/lang/Object;)I
    .registers 6

    instance-of v0, p1, LF8/g0;

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_24

    move-object v0, p1

    check-cast v0, LF8/g0;

    invoke-virtual {v0}, LF8/g0;->a()Z

    move-result v0

    if-eqz v0, :cond_11

    return v3

    :cond_11
    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LF8/E0;->c()LF8/g0;

    move-result-object v3

    invoke-virtual {v0, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_20

    return v2

    :cond_20
    invoke-virtual {p0}, LF8/D0;->y0()V

    return v1

    :cond_24
    instance-of v0, p1, LF8/s0;

    if-eqz v0, :cond_3e

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    move-object v3, p1

    check-cast v3, LF8/s0;

    invoke-virtual {v3}, LF8/s0;->b()LF8/I0;

    move-result-object v3

    invoke-virtual {v0, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3a

    return v2

    :cond_3a
    invoke-virtual {p0}, LF8/D0;->y0()V

    return v1

    :cond_3e
    return v3
.end method

.method private final G0(Ljava/lang/Object;)Ljava/lang/String;
    .registers 3

    instance-of p0, p1, LF8/D0$c;

    const-string v0, "Active"

    if-eqz p0, :cond_1b

    check-cast p1, LF8/D0$c;

    invoke-virtual {p1}, LF8/D0$c;->j()Z

    move-result p0

    if-eqz p0, :cond_11

    const-string p0, "Cancelling"

    return-object p0

    :cond_11
    invoke-virtual {p1}, LF8/D0$c;->k()Z

    move-result p0

    if-eqz p0, :cond_1a

    const-string p0, "Completing"

    return-object p0

    :cond_1a
    return-object v0

    :cond_1b
    instance-of p0, p1, LF8/t0;

    if-eqz p0, :cond_2b

    check-cast p1, LF8/t0;

    invoke-interface {p1}, LF8/t0;->a()Z

    move-result p0

    if-eqz p0, :cond_28

    return-object v0

    :cond_28
    const-string p0, "New"

    return-object p0

    :cond_2b
    instance-of p0, p1, LF8/A;

    if-eqz p0, :cond_32

    const-string p0, "Cancelled"

    return-object p0

    :cond_32
    const-string p0, "Completed"

    return-object p0
.end method

.method private final H(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    :cond_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/t0;

    if-eqz v1, :cond_2d

    instance-of v1, v0, LF8/D0$c;

    if-eqz v1, :cond_16

    move-object v1, v0

    check-cast v1, LF8/D0$c;

    invoke-virtual {v1}, LF8/D0$c;->k()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_2d

    :cond_16
    new-instance v1, LF8/A;

    invoke-direct {p0, p1}, LF8/D0;->P(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    invoke-direct {p0, v0, v1}, LF8/D0;->N0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2d
    :goto_2d
    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object p0

    return-object p0
.end method

.method private final J(Ljava/lang/Throwable;)Z
    .registers 5

    invoke-virtual {p0}, LF8/D0;->j0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    return v1

    :cond_8
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, LF8/D0;->a0()LF8/s;

    move-result-object p0

    if-eqz p0, :cond_21

    sget-object v2, LF8/K0;->q:LF8/K0;

    if-ne p0, v2, :cond_15

    goto :goto_21

    :cond_15
    invoke-interface {p0, p1}, LF8/s;->d(Ljava/lang/Throwable;)Z

    move-result p0

    if-nez p0, :cond_20

    if-eqz v0, :cond_1e

    goto :goto_20

    :cond_1e
    const/4 p0, 0x0

    return p0

    :cond_20
    :goto_20
    return v1

    :cond_21
    :goto_21
    return v0
.end method

.method public static synthetic J0(LF8/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .registers 5

    if-nez p4, :cond_c

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_7

    const/4 p2, 0x0

    :cond_7
    invoke-virtual {p0, p1, p2}, LF8/D0;->H0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final L0(LF8/t0;Ljava/lang/Object;)Z
    .registers 5

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {p2}, LF8/E0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    const/4 p0, 0x0

    return p0

    :cond_10
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LF8/D0;->v0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, LF8/D0;->x0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, LF8/D0;->N(LF8/t0;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final M0(LF8/t0;Ljava/lang/Throwable;)Z
    .registers 7

    invoke-direct {p0, p1}, LF8/D0;->X(LF8/t0;)LF8/I0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    :cond_8
    new-instance v2, LF8/D0$c;

    invoke-direct {v2, v0, v1, p2}, LF8/D0$c;-><init>(LF8/I0;ZLjava/lang/Throwable;)V

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    return v1

    :cond_18
    invoke-direct {p0, v0, p2}, LF8/D0;->s0(LF8/I0;Ljava/lang/Throwable;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final N(LF8/t0;Ljava/lang/Object;)V
    .registers 6

    invoke-virtual {p0}, LF8/D0;->a0()LF8/s;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, LF8/d0;->dispose()V

    sget-object v0, LF8/K0;->q:LF8/K0;

    invoke-virtual {p0, v0}, LF8/D0;->E0(LF8/s;)V

    :cond_e
    instance-of v0, p2, LF8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_16

    check-cast p2, LF8/A;

    goto :goto_17

    :cond_16
    move-object p2, v1

    :goto_17
    if-eqz p2, :cond_1b

    iget-object v1, p2, LF8/A;->a:Ljava/lang/Throwable;

    :cond_1b
    instance-of p2, p1, LF8/C0;

    if-eqz p2, :cond_49

    :try_start_1f
    move-object p2, p1

    check-cast p2, LF8/C0;

    invoke-virtual {p2, v1}, LF8/C0;->w(Ljava/lang/Throwable;)V
    :try_end_25
    .catchall {:try_start_1f .. :try_end_25} :catchall_26

    return-void

    :catchall_26
    move-exception p2

    new-instance v0, LF8/B;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, LF8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LF8/D0;->g0(Ljava/lang/Throwable;)V

    goto :goto_52

    :cond_49
    invoke-interface {p1}, LF8/t0;->b()LF8/I0;

    move-result-object p1

    if-eqz p1, :cond_52

    invoke-direct {p0, p1, v1}, LF8/D0;->u0(LF8/I0;Ljava/lang/Throwable;)V

    :cond_52
    :goto_52
    return-void
.end method

.method private final N0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    instance-of v0, p1, LF8/t0;

    if-nez v0, :cond_9

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object p0

    return-object p0

    :cond_9
    instance-of v0, p1, LF8/g0;

    if-nez v0, :cond_11

    instance-of v0, p1, LF8/C0;

    if-eqz v0, :cond_27

    :cond_11
    instance-of v0, p1, LF8/t;

    if-nez v0, :cond_27

    instance-of v0, p2, LF8/A;

    if-nez v0, :cond_27

    check-cast p1, LF8/t0;

    invoke-direct {p0, p1, p2}, LF8/D0;->L0(LF8/t0;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_22

    return-object p2

    :cond_22
    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object p0

    return-object p0

    :cond_27
    check-cast p1, LF8/t0;

    invoke-direct {p0, p1, p2}, LF8/D0;->Q0(LF8/t0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final O(LF8/D0$c;LF8/t;Ljava/lang/Object;)V
    .registers 6

    invoke-direct {p0, p2}, LF8/D0;->r0(LK8/o;)LF8/t;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-direct {p0, p1, v0, p3}, LF8/D0;->R0(LF8/D0$c;LF8/t;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_21

    :cond_d
    invoke-virtual {p1}, LF8/D0$c;->b()LF8/I0;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, LK8/o;->g(I)V

    invoke-direct {p0, p2}, LF8/D0;->r0(LK8/o;)LF8/t;

    move-result-object p2

    if-eqz p2, :cond_22

    invoke-direct {p0, p1, p2, p3}, LF8/D0;->R0(LF8/D0$c;LF8/t;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_22

    :goto_21
    return-void

    :cond_22
    invoke-direct {p0, p1, p3}, LF8/D0;->R(LF8/D0$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LF8/D0;->y(Ljava/lang/Object;)V

    return-void
.end method

.method private final P(Ljava/lang/Object;)Ljava/lang/Throwable;
    .registers 4

    if-nez p1, :cond_4

    const/4 v0, 0x1

    goto :goto_6

    :cond_4
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_6
    if-eqz v0, :cond_17

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_16

    new-instance p1, LF8/y0;

    invoke-static {p0}, LF8/D0;->v(LF8/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    :cond_16
    return-object p1

    :cond_17
    const-string p0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M0;

    invoke-interface {p1}, LF8/M0;->I0()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0
.end method

.method private final Q0(LF8/t0;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-direct {p0, p1}, LF8/D0;->X(LF8/t0;)LF8/I0;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object p0

    return-object p0

    :cond_b
    instance-of v1, p1, LF8/D0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_14

    move-object v1, p1

    check-cast v1, LF8/D0$c;

    goto :goto_15

    :cond_14
    move-object v1, v2

    :goto_15
    const/4 v3, 0x0

    if-nez v1, :cond_1d

    new-instance v1, LF8/D0$c;

    invoke-direct {v1, v0, v3, v2}, LF8/D0$c;-><init>(LF8/I0;ZLjava/lang/Throwable;)V

    :cond_1d
    new-instance v3, Lkotlin/jvm/internal/E;

    invoke-direct {v3}, Lkotlin/jvm/internal/E;-><init>()V

    monitor-enter v1

    :try_start_23
    invoke-virtual {v1}, LF8/D0$c;->k()Z

    move-result v4

    if-eqz v4, :cond_31

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object p0
    :try_end_2d
    .catchall {:try_start_23 .. :try_end_2d} :catchall_2f

    monitor-exit v1

    return-object p0

    :catchall_2f
    move-exception p0

    goto :goto_93

    :cond_31
    const/4 v4, 0x1

    :try_start_32
    invoke-virtual {v1, v4}, LF8/D0$c;->n(Z)V

    if-eq v1, p1, :cond_47

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_47

    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object p0
    :try_end_45
    .catchall {:try_start_32 .. :try_end_45} :catchall_2f

    monitor-exit v1

    return-object p0

    :cond_47
    :try_start_47
    invoke-virtual {v1}, LF8/D0$c;->j()Z

    move-result p1

    instance-of v4, p2, LF8/A;

    if-eqz v4, :cond_53

    move-object v4, p2

    check-cast v4, LF8/A;

    goto :goto_54

    :cond_53
    move-object v4, v2

    :goto_54
    if-eqz v4, :cond_5b

    iget-object v4, v4, LF8/A;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v4}, LF8/D0$c;->c(Ljava/lang/Throwable;)V

    :cond_5b
    invoke-virtual {v1}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object v4

    if-nez p1, :cond_62

    move-object v2, v4

    :cond_62
    iput-object v2, v3, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_66
    .catchall {:try_start_47 .. :try_end_66} :catchall_2f

    monitor-exit v1

    if-eqz v2, :cond_6c

    invoke-direct {p0, v0, v2}, LF8/D0;->s0(LF8/I0;Ljava/lang/Throwable;)V

    :cond_6c
    invoke-direct {p0, v0}, LF8/D0;->r0(LK8/o;)LF8/t;

    move-result-object p1

    if-eqz p1, :cond_7b

    invoke-direct {p0, v1, p1, p2}, LF8/D0;->R0(LF8/D0$c;LF8/t;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7b

    sget-object p0, LF8/E0;->b:LK8/D;

    return-object p0

    :cond_7b
    const/4 p1, 0x2

    invoke-virtual {v0, p1}, LK8/o;->g(I)V

    invoke-direct {p0, v0}, LF8/D0;->r0(LK8/o;)LF8/t;

    move-result-object p1

    if-eqz p1, :cond_8e

    invoke-direct {p0, v1, p1, p2}, LF8/D0;->R0(LF8/D0$c;LF8/t;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8e

    sget-object p0, LF8/E0;->b:LK8/D;

    return-object p0

    :cond_8e
    invoke-direct {p0, v1, p2}, LF8/D0;->R(LF8/D0$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :goto_93
    monitor-exit v1

    throw p0
.end method

.method private final R(LF8/D0$c;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, LF8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    move-object v0, p2

    check-cast v0, LF8/A;

    goto :goto_a

    :cond_9
    move-object v0, v1

    :goto_a
    if-eqz v0, :cond_f

    iget-object v0, v0, LF8/A;->a:Ljava/lang/Throwable;

    goto :goto_10

    :cond_f
    move-object v0, v1

    :goto_10
    monitor-enter p1

    :try_start_11
    invoke-virtual {p1}, LF8/D0$c;->j()Z

    move-result v2

    invoke-virtual {p1, v0}, LF8/D0$c;->m(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, p1, v3}, LF8/D0;->T(LF8/D0$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_25

    invoke-direct {p0, v4, v3}, LF8/D0;->x(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_22
    .catchall {:try_start_11 .. :try_end_22} :catchall_23

    goto :goto_25

    :catchall_23
    move-exception p0

    goto :goto_63

    :cond_25
    :goto_25
    monitor-exit p1

    if-nez v4, :cond_29

    goto :goto_33

    :cond_29
    if-ne v4, v0, :cond_2c

    goto :goto_33

    :cond_2c
    new-instance p2, LF8/A;

    const/4 v0, 0x0

    const/4 v3, 0x2

    invoke-direct {p2, v4, v0, v3, v1}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    :goto_33
    if-eqz v4, :cond_4c

    invoke-direct {p0, v4}, LF8/D0;->J(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_41

    invoke-virtual {p0, v4}, LF8/D0;->f0(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_4c

    :cond_41
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, LF8/A;

    invoke-virtual {v0}, LF8/A;->c()Z

    :cond_4c
    if-nez v2, :cond_51

    invoke-virtual {p0, v4}, LF8/D0;->v0(Ljava/lang/Throwable;)V

    :cond_51
    invoke-virtual {p0, p2}, LF8/D0;->x0(Ljava/lang/Object;)V

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {p2}, LF8/E0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-direct {p0, p1, p2}, LF8/D0;->N(LF8/t0;Ljava/lang/Object;)V

    return-object p2

    :goto_63
    monitor-exit p1

    throw p0
.end method

.method private final R0(LF8/D0$c;LF8/t;Ljava/lang/Object;)Z
    .registers 7

    :cond_0
    iget-object v0, p2, LF8/t;->u:LF8/u;

    new-instance v1, LF8/D0$b;

    invoke-direct {v1, p0, p1, p2, p3}, LF8/D0$b;-><init>(LF8/D0;LF8/D0$c;LF8/t;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LF8/A0;->l(LF8/x0;ZLF8/C0;)LF8/d0;

    move-result-object v0

    sget-object v1, LF8/K0;->q:LF8/K0;

    if-eq v0, v1, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    invoke-direct {p0, p2}, LF8/D0;->r0(LK8/o;)LF8/t;

    move-result-object p2

    if-nez p2, :cond_0

    return v2
.end method

.method private final S(Ljava/lang/Object;)Ljava/lang/Throwable;
    .registers 3

    instance-of p0, p1, LF8/A;

    const/4 v0, 0x0

    if-eqz p0, :cond_8

    check-cast p1, LF8/A;

    goto :goto_9

    :cond_8
    move-object p1, v0

    :goto_9
    if-eqz p1, :cond_e

    iget-object p0, p1, LF8/A;->a:Ljava/lang/Throwable;

    return-object p0

    :cond_e
    return-object v0
.end method

.method private final T(LF8/D0$c;Ljava/util/List;)Ljava/lang/Throwable;
    .registers 6

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_18

    invoke-virtual {p1}, LF8/D0$c;->j()Z

    move-result p1

    if-eqz p1, :cond_17

    new-instance p1, LF8/y0;

    invoke-static {p0}, LF8/D0;->v(LF8/D0;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    return-object p1

    :cond_17
    return-object v1

    :cond_18
    move-object p0, p2

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1f

    goto :goto_32

    :cond_31
    move-object v0, v1

    :goto_32
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_37

    return-object v0

    :cond_37
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    instance-of p2, p1, LF8/W0;

    if-eqz p2, :cond_5f

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_46
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/lang/Throwable;

    if-eq v0, p1, :cond_46

    instance-of v0, v0, LF8/W0;

    if-eqz v0, :cond_46

    move-object v1, p2

    :cond_5a
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_5f

    return-object v1

    :cond_5f
    return-object p1
.end method

.method private final X(LF8/t0;)LF8/I0;
    .registers 4

    invoke-interface {p1}, LF8/t0;->b()LF8/I0;

    move-result-object v0

    if-nez v0, :cond_36

    instance-of v0, p1, LF8/g0;

    if-eqz v0, :cond_10

    new-instance p0, LF8/I0;

    invoke-direct {p0}, LF8/I0;-><init>()V

    return-object p0

    :cond_10
    instance-of v0, p1, LF8/C0;

    if-eqz v0, :cond_1b

    check-cast p1, LF8/C0;

    invoke-direct {p0, p1}, LF8/D0;->C0(LF8/C0;)V

    const/4 p0, 0x0

    return-object p0

    :cond_1b
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "State should have list: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_36
    return-object v0
.end method

.method private static final synthetic d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LF8/D0;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LF8/D0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final k0()Z
    .registers 3

    :cond_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/t0;

    if-nez v1, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    invoke-direct {p0, v0}, LF8/D0;->F0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 p0, 0x1

    return p0
.end method

.method private final l0(Lm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LF8/n;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    new-instance v1, LF8/O0;

    invoke-direct {v1, v0}, LF8/O0;-><init>(Lm8/e;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v2, v3}, LF8/A0;->m(LF8/x0;ZLF8/C0;ILjava/lang/Object;)LF8/d0;

    move-result-object p0

    invoke-static {v0, p0}, LF8/p;->a(LF8/l;LF8/d0;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_28

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_28
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2f

    return-object p0

    :cond_2f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final m0(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    const/4 v0, 0x0

    move-object v1, v0

    :cond_2
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LF8/D0$c;

    if-eqz v3, :cond_50

    monitor-enter v2

    :try_start_b
    move-object v3, v2

    check-cast v3, LF8/D0$c;

    invoke-virtual {v3}, LF8/D0$c;->l()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-static {}, LF8/E0;->f()LK8/D;

    move-result-object p0
    :try_end_18
    .catchall {:try_start_b .. :try_end_18} :catchall_1a

    monitor-exit v2

    return-object p0

    :catchall_1a
    move-exception p0

    goto :goto_4e

    :cond_1c
    :try_start_1c
    move-object v3, v2

    check-cast v3, LF8/D0$c;

    invoke-virtual {v3}, LF8/D0$c;->j()Z

    move-result v3

    if-nez p1, :cond_27

    if-nez v3, :cond_33

    :cond_27
    if-nez v1, :cond_2d

    invoke-direct {p0, p1}, LF8/D0;->P(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_2d
    move-object p1, v2

    check-cast p1, LF8/D0$c;

    invoke-virtual {p1, v1}, LF8/D0$c;->c(Ljava/lang/Throwable;)V

    :cond_33
    move-object p1, v2

    check-cast p1, LF8/D0$c;

    invoke-virtual {p1}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_3a
    .catchall {:try_start_1c .. :try_end_3a} :catchall_1a

    if-nez v3, :cond_3d

    move-object v0, p1

    :cond_3d
    monitor-exit v2

    if-eqz v0, :cond_49

    check-cast v2, LF8/D0$c;

    invoke-virtual {v2}, LF8/D0$c;->b()LF8/I0;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LF8/D0;->s0(LF8/I0;Ljava/lang/Throwable;)V

    :cond_49
    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object p0

    return-object p0

    :goto_4e
    monitor-exit v2

    throw p0

    :cond_50
    instance-of v3, v2, LF8/t0;

    if-eqz v3, :cond_a1

    if-nez v1, :cond_5a

    invoke-direct {p0, p1}, LF8/D0;->P(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_5a
    move-object v3, v2

    check-cast v3, LF8/t0;

    invoke-interface {v3}, LF8/t0;->a()Z

    move-result v4

    if-eqz v4, :cond_6e

    invoke-direct {p0, v3, v1}, LF8/D0;->M0(LF8/t0;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object p0

    return-object p0

    :cond_6e
    new-instance v3, LF8/A;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    invoke-direct {p0, v2, v3}, LF8/D0;->N0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object v4

    if-eq v3, v4, :cond_86

    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object v2

    if-eq v3, v2, :cond_2

    return-object v3

    :cond_86
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot happen in "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a1
    invoke-static {}, LF8/E0;->f()LK8/D;

    move-result-object p0

    return-object p0
.end method

.method private final r0(LK8/o;)LF8/t;
    .registers 2

    :goto_0
    invoke-virtual {p1}, LK8/o;->q()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {p1}, LK8/o;->m()LK8/o;

    move-result-object p1

    goto :goto_0

    :cond_b
    invoke-virtual {p1}, LK8/o;->l()LK8/o;

    move-result-object p1

    invoke-virtual {p1}, LK8/o;->q()Z

    move-result p0

    if-nez p0, :cond_b

    instance-of p0, p1, LF8/t;

    if-eqz p0, :cond_1c

    check-cast p1, LF8/t;

    return-object p1

    :cond_1c
    instance-of p0, p1, LF8/I0;

    if-eqz p0, :cond_b

    const/4 p0, 0x0

    return-object p0
.end method

.method private final s0(LF8/I0;Ljava/lang/Throwable;)V
    .registers 8

    invoke-virtual {p0, p2}, LF8/D0;->v0(Ljava/lang/Throwable;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, LK8/o;->g(I)V

    invoke-virtual {p1}, LK8/o;->k()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK8/o;

    const/4 v1, 0x0

    :goto_13
    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_59

    instance-of v2, v0, LF8/C0;

    if-eqz v2, :cond_54

    move-object v2, v0

    check-cast v2, LF8/C0;

    invoke-virtual {v2}, LF8/C0;->v()Z

    move-result v2

    if-eqz v2, :cond_54

    :try_start_26
    move-object v2, v0

    check-cast v2, LF8/C0;

    invoke-virtual {v2, p2}, LF8/C0;->w(Ljava/lang/Throwable;)V
    :try_end_2c
    .catchall {:try_start_26 .. :try_end_2c} :catchall_2d

    goto :goto_54

    :catchall_2d
    move-exception v2

    if-eqz v1, :cond_34

    invoke-static {v1, v2}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_54

    :cond_34
    new-instance v1, LF8/B;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception in completion handler "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, LF8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lh8/A;->a:Lh8/A;

    :cond_54
    :goto_54
    invoke-virtual {v0}, LK8/o;->l()LK8/o;

    move-result-object v0

    goto :goto_13

    :cond_59
    if-eqz v1, :cond_5e

    invoke-virtual {p0, v1}, LF8/D0;->g0(Ljava/lang/Throwable;)V

    :cond_5e
    invoke-direct {p0, p2}, LF8/D0;->J(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final u0(LF8/I0;Ljava/lang/Throwable;)V
    .registers 8

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LK8/o;->g(I)V

    invoke-virtual {p1}, LK8/o;->k()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK8/o;

    const/4 v1, 0x0

    :goto_10
    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4d

    instance-of v2, v0, LF8/C0;

    if-eqz v2, :cond_48

    :try_start_1a
    move-object v2, v0

    check-cast v2, LF8/C0;

    invoke-virtual {v2, p2}, LF8/C0;->w(Ljava/lang/Throwable;)V
    :try_end_20
    .catchall {:try_start_1a .. :try_end_20} :catchall_21

    goto :goto_48

    :catchall_21
    move-exception v2

    if-eqz v1, :cond_28

    invoke-static {v1, v2}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_48

    :cond_28
    new-instance v1, LF8/B;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception in completion handler "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, LF8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lh8/A;->a:Lh8/A;

    :cond_48
    :goto_48
    invoke-virtual {v0}, LK8/o;->l()LK8/o;

    move-result-object v0

    goto :goto_10

    :cond_4d
    if-eqz v1, :cond_52

    invoke-virtual {p0, v1}, LF8/D0;->g0(Ljava/lang/Throwable;)V

    :cond_52
    return-void
.end method

.method public static final synthetic v(LF8/D0;)Ljava/lang/String;
    .registers 1

    invoke-virtual {p0}, LF8/D0;->L()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(LF8/D0;LF8/D0$c;LF8/t;Ljava/lang/Object;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LF8/D0;->O(LF8/D0$c;LF8/t;Ljava/lang/Object;)V

    return-void
.end method

.method private final x(Ljava/lang/Throwable;Ljava/util/List;)V
    .registers 5

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x1

    if-gt p0, v0, :cond_8

    goto :goto_37

    :cond_8
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0, p0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_19
    :goto_19
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eq v0, p1, :cond_19

    if-eq v0, p1, :cond_19

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_19

    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {p1, v0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_19

    :cond_37
    :goto_37
    return-void
.end method

.method private final z0(LF8/g0;)V
    .registers 4

    new-instance v0, LF8/I0;

    invoke-direct {v0}, LF8/I0;-><init>()V

    invoke-virtual {p1}, LF8/g0;->a()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_12

    :cond_c
    new-instance v1, LF8/s0;

    invoke-direct {v1, v0}, LF8/s0;-><init>(LF8/I0;)V

    move-object v0, v1

    :goto_12
    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method protected final A(Lm8/e;)Ljava/lang/Object;
    .registers 4

    :cond_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/t0;

    if-nez v1, :cond_16

    instance-of p0, v0, LF8/A;

    if-nez p0, :cond_11

    invoke-static {v0}, LF8/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_11
    check-cast v0, LF8/A;

    iget-object p0, v0, LF8/A;->a:Ljava/lang/Throwable;

    throw p0

    :cond_16
    invoke-direct {p0, v0}, LF8/D0;->F0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-direct {p0, p1}, LF8/D0;->C(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final B()LD8/h;
    .registers 3

    new-instance v0, LF8/D0$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LF8/D0$d;-><init>(LF8/D0;Lm8/e;)V

    invoke-static {v0}, LD8/k;->b(Lv8/p;)LD8/h;

    move-result-object p0

    return-object p0
.end method

.method public final D(Ljava/lang/Throwable;)Z
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->E(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final D0(LF8/C0;)V
    .registers 5

    :cond_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/C0;

    if-eqz v1, :cond_1a

    if-eq v0, p1, :cond_b

    goto :goto_29

    :cond_b
    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LF8/E0;->c()LF8/g0;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_29

    :cond_1a
    instance-of p0, v0, LF8/t0;

    if-eqz p0, :cond_29

    check-cast v0, LF8/t0;

    invoke-interface {v0}, LF8/t0;->b()LF8/I0;

    move-result-object p0

    if-eqz p0, :cond_29

    invoke-virtual {p1}, LK8/o;->r()Z

    :cond_29
    :goto_29
    return-void
.end method

.method public final E(Ljava/lang/Object;)Z
    .registers 5

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object v0

    invoke-virtual {p0}, LF8/D0;->W()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_14

    invoke-direct {p0, p1}, LF8/D0;->H(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LF8/E0;->b:LK8/D;

    if-ne v0, v1, :cond_14

    return v2

    :cond_14
    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_1e

    invoke-direct {p0, p1}, LF8/D0;->m0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1e
    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_25

    return v2

    :cond_25
    sget-object p1, LF8/E0;->b:LK8/D;

    if-ne v0, p1, :cond_2a

    return v2

    :cond_2a
    invoke-static {}, LF8/E0;->f()LK8/D;

    move-result-object p1

    if-ne v0, p1, :cond_32

    const/4 p0, 0x0

    return p0

    :cond_32
    invoke-virtual {p0, v0}, LF8/D0;->y(Ljava/lang/Object;)V

    return v2
.end method

.method public final E0(LF8/s;)V
    .registers 3

    invoke-static {}, LF8/D0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public F(Ljava/lang/Throwable;)V
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->E(Ljava/lang/Object;)Z

    return-void
.end method

.method public final G(LF8/u;)LF8/s;
    .registers 5

    new-instance v0, LF8/t;

    invoke-direct {v0, p1}, LF8/t;-><init>(LF8/u;)V

    invoke-virtual {v0, p0}, LF8/C0;->x(LF8/D0;)V

    :cond_8
    :goto_8
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LF8/g0;

    if-eqz v1, :cond_28

    move-object v1, p1

    check-cast v1, LF8/g0;

    invoke-virtual {v1}, LF8/g0;->a()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    return-object v0

    :cond_24
    invoke-direct {p0, v1}, LF8/D0;->z0(LF8/g0;)V

    goto :goto_8

    :cond_28
    instance-of v1, p1, LF8/t0;

    const/4 v2, 0x0

    if-eqz v1, :cond_72

    move-object v1, p1

    check-cast v1, LF8/t0;

    invoke-interface {v1}, LF8/t0;->b()LF8/I0;

    move-result-object v1

    if-nez v1, :cond_41

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/C0;

    invoke-direct {p0, p1}, LF8/D0;->C0(LF8/C0;)V

    goto :goto_8

    :cond_41
    const/4 p1, 0x7

    invoke-virtual {v1, v0, p1}, LK8/o;->c(LK8/o;I)Z

    move-result p1

    if-eqz p1, :cond_49

    goto :goto_6e

    :cond_49
    const/4 p1, 0x3

    invoke-virtual {v1, v0, p1}, LK8/o;->c(LK8/o;I)Z

    move-result p1

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, LF8/D0$c;

    if-eqz v1, :cond_5d

    check-cast p0, LF8/D0$c;

    invoke-virtual {p0}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_69

    :cond_5d
    instance-of v1, p0, LF8/A;

    if-eqz v1, :cond_64

    check-cast p0, LF8/A;

    goto :goto_65

    :cond_64
    move-object p0, v2

    :goto_65
    if-eqz p0, :cond_69

    iget-object v2, p0, LF8/A;->a:Ljava/lang/Throwable;

    :cond_69
    :goto_69
    invoke-virtual {v0, v2}, LF8/t;->w(Ljava/lang/Throwable;)V

    if-eqz p1, :cond_6f

    :goto_6e
    return-object v0

    :cond_6f
    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0

    :cond_72
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, LF8/A;

    if-eqz p1, :cond_7d

    check-cast p0, LF8/A;

    goto :goto_7e

    :cond_7d
    move-object p0, v2

    :goto_7e
    if-eqz p0, :cond_82

    iget-object v2, p0, LF8/A;->a:Ljava/lang/Throwable;

    :cond_82
    invoke-virtual {v0, v2}, LF8/t;->w(Ljava/lang/Throwable;)V

    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method protected final H0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .registers 4

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    if-nez v0, :cond_16

    new-instance v0, LF8/y0;

    if-nez p2, :cond_13

    invoke-static {p0}, LF8/D0;->v(LF8/D0;)Ljava/lang/String;

    move-result-object p2

    :cond_13
    invoke-direct {v0, p2, p1, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    :cond_16
    return-object v0
.end method

.method public final I(ZZLv8/l;)LF8/d0;
    .registers 4

    if-eqz p1, :cond_8

    new-instance p1, LF8/v0;

    invoke-direct {p1, p3}, LF8/v0;-><init>(Lv8/l;)V

    goto :goto_d

    :cond_8
    new-instance p1, LF8/w0;

    invoke-direct {p1, p3}, LF8/w0;-><init>(Lv8/l;)V

    :goto_d
    invoke-virtual {p0, p2, p1}, LF8/D0;->i0(ZLF8/C0;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public I0()Ljava/util/concurrent/CancellationException;
    .registers 6

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/D0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_11

    move-object v1, v0

    check-cast v1, LF8/D0$c;

    invoke-virtual {v1}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_20

    :cond_11
    instance-of v1, v0, LF8/A;

    if-eqz v1, :cond_1b

    move-object v1, v0

    check-cast v1, LF8/A;

    iget-object v1, v1, LF8/A;->a:Ljava/lang/Throwable;

    goto :goto_20

    :cond_1b
    instance-of v1, v0, LF8/t0;

    if-nez v1, :cond_44

    move-object v1, v2

    :goto_20
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_27

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_27
    if-nez v2, :cond_43

    new-instance v2, LF8/y0;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, LF8/D0;->G0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    :cond_43
    return-object v2

    :cond_44
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final K()Ljava/util/concurrent/CancellationException;
    .registers 5

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/D0$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_47

    check-cast v0, LF8/D0$c;

    invoke-virtual {v0}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2e

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LF8/D0;->H0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_2e

    return-object v0

    :cond_2e
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_47
    instance-of v1, v0, LF8/t0;

    if-nez v1, :cond_75

    instance-of v1, v0, LF8/A;

    const/4 v2, 0x0

    if-eqz v1, :cond_5a

    check-cast v0, LF8/A;

    iget-object v0, v0, LF8/A;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, LF8/D0;->J0(LF8/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_5a
    new-instance v0, LF8/y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    return-object v0

    :cond_75
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final K0()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LF8/D0;->p0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, LF8/D0;->G0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected L()Ljava/lang/String;
    .registers 1

    const-string p0, "Job was cancelled"

    return-object p0
.end method

.method public M(Ljava/lang/Throwable;)Z
    .registers 4

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {p0, p1}, LF8/D0;->E(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {p0}, LF8/D0;->V()Z

    move-result p0

    if-eqz p0, :cond_13

    return v1

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public final O0()Z
    .registers 1

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, LF8/t0;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final Q(Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, LF8/D0;->k0()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0}, LF8/A0;->j(Lm8/i;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_10
    invoke-direct {p0, p1}, LF8/D0;->l0(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1b

    return-object p0

    :cond_1b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LF8/x0$a;->b(LF8/x0;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public V()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public W()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public Z()LF8/x0;
    .registers 1

    invoke-virtual {p0}, LF8/D0;->a0()LF8/s;

    move-result-object p0

    if-eqz p0, :cond_b

    invoke-interface {p0}, LF8/s;->getParent()LF8/x0;

    move-result-object p0

    return-object p0

    :cond_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public a()Z
    .registers 2

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/t0;

    if-eqz v0, :cond_12

    check-cast p0, LF8/t0;

    invoke-interface {p0}, LF8/t0;->a()Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public final a0()LF8/s;
    .registers 2

    invoke-static {}, LF8/D0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/s;

    return-object p0
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 2

    invoke-static {p0, p1}, LF8/x0$a;->c(LF8/x0;Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public final c0()Ljava/lang/Object;
    .registers 2

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final c1(Lv8/l;)LF8/d0;
    .registers 3

    new-instance v0, LF8/w0;

    invoke-direct {v0, p1}, LF8/w0;-><init>(Lv8/l;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, LF8/D0;->i0(ZLF8/C0;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public f(Ljava/util/concurrent/CancellationException;)V
    .registers 4

    if-nez p1, :cond_c

    new-instance p1, LF8/y0;

    invoke-static {p0}, LF8/D0;->v(LF8/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    :cond_c
    invoke-virtual {p0, p1}, LF8/D0;->F(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected f0(Ljava/lang/Throwable;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public g0(Ljava/lang/Throwable;)V
    .registers 2

    throw p1
.end method

.method public final getKey()Lm8/i$c;
    .registers 1

    sget-object p0, LF8/x0;->e:LF8/x0$b;

    return-object p0
.end method

.method protected final h0(LF8/x0;)V
    .registers 3

    if-nez p1, :cond_8

    sget-object p1, LF8/K0;->q:LF8/K0;

    invoke-virtual {p0, p1}, LF8/D0;->E0(LF8/s;)V

    return-void

    :cond_8
    invoke-interface {p1}, LF8/x0;->start()Z

    invoke-interface {p1, p0}, LF8/x0;->G(LF8/u;)LF8/s;

    move-result-object p1

    invoke-virtual {p0, p1}, LF8/D0;->E0(LF8/s;)V

    invoke-virtual {p0}, LF8/D0;->O0()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-interface {p1}, LF8/d0;->dispose()V

    sget-object p1, LF8/K0;->q:LF8/K0;

    invoke-virtual {p0, p1}, LF8/D0;->E0(LF8/s;)V

    :cond_20
    return-void
.end method

.method public final i0(ZLF8/C0;)LF8/d0;
    .registers 8

    invoke-virtual {p2, p0}, LF8/C0;->x(LF8/D0;)V

    :cond_3
    :goto_3
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/g0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_25

    move-object v1, v0

    check-cast v1, LF8/g0;

    invoke-virtual {v1}, LF8/g0;->a()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-static {}, LF8/D0;->e0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_6b

    :cond_21
    invoke-direct {p0, v1}, LF8/D0;->z0(LF8/g0;)V

    goto :goto_3

    :cond_25
    instance-of v1, v0, LF8/t0;

    if-eqz v1, :cond_6a

    move-object v1, v0

    check-cast v1, LF8/t0;

    invoke-interface {v1}, LF8/t0;->b()LF8/I0;

    move-result-object v4

    if-nez v4, :cond_3d

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LF8/C0;

    invoke-direct {p0, v0}, LF8/D0;->C0(LF8/C0;)V

    goto :goto_3

    :cond_3d
    invoke-virtual {p2}, LF8/C0;->v()Z

    move-result v0

    if-eqz v0, :cond_63

    instance-of v0, v1, LF8/D0$c;

    if-eqz v0, :cond_4a

    check-cast v1, LF8/D0$c;

    goto :goto_4b

    :cond_4a
    move-object v1, v3

    :goto_4b
    if-eqz v1, :cond_52

    invoke-virtual {v1}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_53

    :cond_52
    move-object v0, v3

    :goto_53
    if-nez v0, :cond_5b

    const/4 v0, 0x5

    invoke-virtual {v4, p2, v0}, LK8/o;->c(LK8/o;I)Z

    move-result v0

    goto :goto_67

    :cond_5b
    if-eqz p1, :cond_60

    invoke-virtual {p2, v0}, LF8/C0;->w(Ljava/lang/Throwable;)V

    :cond_60
    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0

    :cond_63
    invoke-virtual {v4, p2, v2}, LK8/o;->c(LK8/o;I)Z

    move-result v0

    :goto_67
    if-eqz v0, :cond_3

    goto :goto_6b

    :cond_6a
    const/4 v2, 0x0

    :goto_6b
    if-eqz v2, :cond_6e

    return-object p2

    :cond_6e
    if-eqz p1, :cond_83

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, LF8/A;

    if-eqz p1, :cond_7b

    check-cast p0, LF8/A;

    goto :goto_7c

    :cond_7b
    move-object p0, v3

    :goto_7c
    if-eqz p0, :cond_80

    iget-object v3, p0, LF8/A;->a:Ljava/lang/Throwable;

    :cond_80
    invoke-virtual {p2, v3}, LF8/C0;->w(Ljava/lang/Throwable;)V

    :cond_83
    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method public final isCancelled()Z
    .registers 2

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/A;

    if-nez v0, :cond_17

    instance-of v0, p0, LF8/D0$c;

    if-eqz v0, :cond_15

    check-cast p0, LF8/D0$c;

    invoke-virtual {p0}, LF8/D0$c;->j()Z

    move-result p0

    if-eqz p0, :cond_15

    goto :goto_17

    :cond_15
    const/4 p0, 0x0

    return p0

    :cond_17
    :goto_17
    const/4 p0, 0x1

    return p0
.end method

.method protected j0()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final n0(Ljava/lang/Object;)Z
    .registers 5

    :cond_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LF8/D0;->N0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_10

    const/4 p0, 0x0

    return p0

    :cond_10
    sget-object v1, LF8/E0;->b:LK8/D;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_16

    return v2

    :cond_16
    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LF8/D0;->y(Ljava/lang/Object;)V

    return v2
.end method

.method public final o0(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    :cond_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LF8/D0;->N0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LF8/E0;->a()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_15

    invoke-static {}, LF8/E0;->b()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, LF8/D0;->S(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public p0()Ljava/lang/String;
    .registers 1

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final q0(LF8/M0;)V
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->E(Ljava/lang/Object;)Z

    return-void
.end method

.method public final start()Z
    .registers 3

    :goto_0
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, LF8/D0;->F0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    if-eq v0, v1, :cond_e

    goto :goto_0

    :cond_e
    return v1

    :cond_f
    const/4 p0, 0x0

    return p0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, LF8/x0$a;->d(LF8/x0;Lm8/i$c;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LF8/D0;->K0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected v0(Ljava/lang/Throwable;)V
    .registers 2

    return-void
.end method

.method protected x0(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method protected y(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method protected y0()V
    .registers 1

    return-void
.end method

.method public z(Lm8/i;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, LF8/x0$a;->e(LF8/x0;Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
