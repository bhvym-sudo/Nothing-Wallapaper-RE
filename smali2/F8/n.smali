.class public LF8/n;
.super LF8/Z;
.source "SourceFile"

# interfaces
.implements LF8/l;
.implements Lkotlin/coroutines/jvm/internal/e;
.implements LF8/c1;


# static fields
.field private static final synthetic v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decisionAndIndex$volatile:I

.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field private final t:Lm8/e;

.field private final u:Lm8/i;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "_decisionAndIndex$volatile"

    const-class v1, LF8/n;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/n;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "_state$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/n;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/n;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm8/e;I)V
    .registers 3

    invoke-direct {p0, p2}, LF8/Z;-><init>(I)V

    iput-object p1, p0, LF8/n;->t:Lm8/e;

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object p1

    iput-object p1, p0, LF8/n;->u:Lm8/i;

    const p1, 0x1fffffff

    iput p1, p0, LF8/n;->_decisionAndIndex$volatile:I

    sget-object p1, LF8/d;->q:LF8/d;

    iput-object p1, p0, LF8/n;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final C()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, LF8/n;->B()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/L0;

    if-eqz v0, :cond_b

    const-string p0, "Active"

    return-object p0

    :cond_b
    instance-of p0, p0, LF8/q;

    if-eqz p0, :cond_12

    const-string p0, "Cancelled"

    return-object p0

    :cond_12
    const-string p0, "Completed"

    return-object p0
.end method

.method private static final synthetic D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LF8/n;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private static final synthetic E()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LF8/n;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LF8/n;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final H()LF8/d0;
    .registers 6

    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object v0

    sget-object v1, LF8/x0;->e:LF8/x0$b;

    invoke-interface {v0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    check-cast v0, LF8/x0;

    const/4 v1, 0x0

    if-nez v0, :cond_10

    return-object v1

    :cond_10
    new-instance v2, LF8/r;

    invoke-direct {v2, p0}, LF8/r;-><init>(LF8/n;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v3, v1}, LF8/A0;->m(LF8/x0;ZLF8/C0;ILjava/lang/Object;)LF8/d0;

    move-result-object v0

    invoke-static {}, LF8/n;->E()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v0
.end method

.method private final I(Ljava/lang/Object;)V
    .registers 14

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v1, v2, LF8/d;

    if-eqz v1, :cond_18

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_b3

    :cond_18
    instance-of v1, v2, LF8/k;

    if-nez v1, :cond_b4

    instance-of v1, v2, LK8/A;

    if-eqz v1, :cond_22

    goto/16 :goto_b4

    :cond_22
    instance-of v1, v2, LF8/A;

    if-eqz v1, :cond_56

    move-object v0, v2

    check-cast v0, LF8/A;

    invoke-virtual {v0}, LF8/A;->c()Z

    move-result v1

    if-nez v1, :cond_32

    invoke-direct {p0, p1, v2}, LF8/n;->M(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_32
    instance-of v1, v2, LF8/q;

    if-eqz v1, :cond_b3

    instance-of v1, v2, LF8/A;

    const/4 v2, 0x0

    if-eqz v1, :cond_3c

    goto :goto_3d

    :cond_3c
    move-object v0, v2

    :goto_3d
    if-eqz v0, :cond_41

    iget-object v2, v0, LF8/A;->a:Ljava/lang/Throwable;

    :cond_41
    instance-of v0, p1, LF8/k;

    if-eqz v0, :cond_4b

    check-cast p1, LF8/k;

    invoke-virtual {p0, p1, v2}, LF8/n;->n(LF8/k;Ljava/lang/Throwable;)V

    return-void

    :cond_4b
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK8/A;

    invoke-direct {p0, p1, v2}, LF8/n;->s(LK8/A;Ljava/lang/Throwable;)V

    return-void

    :cond_56
    instance-of v1, v2, LF8/z;

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"

    if-eqz v1, :cond_93

    move-object v4, v2

    check-cast v4, LF8/z;

    iget-object v1, v4, LF8/z;->b:LF8/k;

    if-eqz v1, :cond_66

    invoke-direct {p0, p1, v2}, LF8/n;->M(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_66
    instance-of v1, p1, LK8/A;

    if-eqz v1, :cond_6b

    return-void

    :cond_6b
    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, LF8/k;

    invoke-virtual {v4}, LF8/z;->c()Z

    move-result v1

    if-eqz v1, :cond_7d

    iget-object p1, v4, LF8/z;->e:Ljava/lang/Throwable;

    invoke-virtual {p0, v6, p1}, LF8/n;->n(LF8/k;Ljava/lang/Throwable;)V

    return-void

    :cond_7d
    const/16 v10, 0x1d

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, LF8/z;->b(LF8/z;Ljava/lang/Object;LF8/k;Lv8/q;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LF8/z;

    move-result-object v1

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_b3

    :cond_93
    instance-of v1, p1, LK8/A;

    if-eqz v1, :cond_98

    return-void

    :cond_98
    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, LF8/k;

    new-instance v1, LF8/z;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, LF8/z;-><init>(Ljava/lang/Object;LF8/k;Lv8/q;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/h;)V

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_b3
    :goto_b3
    return-void

    :cond_b4
    :goto_b4
    invoke-direct {p0, p1, v2}, LF8/n;->M(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4
.end method

.method private final L()Z
    .registers 2

    iget v0, p0, LF8/Z;->s:I

    invoke-static {v0}, LF8/a0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object p0, p0, LF8/n;->t:Lm8/e;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LK8/h;

    invoke-virtual {p0}, LK8/h;->u()Z

    move-result p0

    if-eqz p0, :cond_19

    const/4 p0, 0x1

    return p0

    :cond_19
    const/4 p0, 0x0

    return p0
.end method

.method private final M(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 5

    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final R(Lv8/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 4

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic T(LF8/n;Ljava/lang/Object;ILv8/q;ILjava/lang/Object;)V
    .registers 6

    if-nez p5, :cond_b

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_7

    const/4 p3, 0x0

    :cond_7
    invoke-virtual {p0, p1, p2, p3}, LF8/n;->S(Ljava/lang/Object;ILv8/q;)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final U(LF8/L0;Ljava/lang/Object;ILv8/q;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 14

    instance-of p0, p2, LF8/A;

    if-eqz p0, :cond_5

    return-object p2

    :cond_5
    invoke-static {p3}, LF8/a0;->b(I)Z

    move-result p0

    if-nez p0, :cond_e

    if-nez p5, :cond_e

    goto :goto_17

    :cond_e
    if-nez p4, :cond_18

    instance-of p0, p1, LF8/k;

    if-nez p0, :cond_18

    if-eqz p5, :cond_17

    goto :goto_18

    :cond_17
    :goto_17
    return-object p2

    :cond_18
    :goto_18
    new-instance v0, LF8/z;

    instance-of p0, p1, LF8/k;

    if-eqz p0, :cond_22

    check-cast p1, LF8/k;

    :goto_20
    move-object v2, p1

    goto :goto_24

    :cond_22
    const/4 p1, 0x0

    goto :goto_20

    :goto_24
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, LF8/z;-><init>(Ljava/lang/Object;LF8/k;Lv8/q;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method private final V()Z
    .registers 7

    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    const/4 v3, 0x1

    if-eqz v2, :cond_19

    if-ne v2, v3, :cond_11

    const/4 p0, 0x0

    return p0

    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const v4, 0x1fffffff

    and-int/2addr v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    add-int/2addr v5, v4

    invoke-virtual {v2, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_4

    return v3
.end method

.method private final W(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)LK8/D;
    .registers 13

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LF8/L0;

    if-eqz v2, :cond_2e

    move-object v4, v1

    check-cast v4, LF8/L0;

    iget v6, p0, LF8/Z;->s:I

    move-object v3, p0

    move-object v5, p1

    move-object v8, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, LF8/n;->U(LF8/L0;Ljava/lang/Object;ILv8/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v3, v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_29

    invoke-direct {v3}, LF8/n;->w()V

    sget-object p0, LF8/o;->a:LK8/D;

    return-object p0

    :cond_29
    move-object p0, v3

    move-object p1, v5

    move-object p3, v7

    move-object p2, v8

    goto :goto_4

    :cond_2e
    move-object v8, p2

    instance-of p0, v1, LF8/z;

    const/4 p1, 0x0

    if-eqz p0, :cond_3f

    if-eqz v8, :cond_3f

    check-cast v1, LF8/z;

    iget-object p0, v1, LF8/z;->d:Ljava/lang/Object;

    if-ne p0, v8, :cond_3f

    sget-object p0, LF8/o;->a:LK8/D;

    return-object p0

    :cond_3f
    return-object p1
.end method

.method private final X()Z
    .registers 6

    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_19

    const/4 p0, 0x2

    if-ne v2, p0, :cond_11

    const/4 p0, 0x0

    return p0

    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Already suspended"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const v3, 0x1fffffff

    and-int/2addr v3, v1

    const/high16 v4, 0x20000000

    add-int/2addr v4, v3

    invoke-virtual {v2, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic j(Lv8/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LF8/n;->R(Lv8/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Void;
    .registers 4

    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Already resumed, but proposed with update "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final s(LK8/A;Ljava/lang/Throwable;)V
    .registers 6

    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_35

    :try_start_e
    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, LK8/A;->s(ILjava/lang/Throwable;Lm8/i;)V
    :try_end_15
    .catchall {:try_start_e .. :try_end_15} :catchall_16

    return-void

    :catchall_16
    move-exception p1

    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object p2

    new-instance v0, LF8/B;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LF8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void

    :cond_35
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "The index for Segment.onCancellation(..) is broken"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final u(Ljava/lang/Throwable;)Z
    .registers 3

    invoke-direct {p0}, LF8/n;->L()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    iget-object p0, p0, LF8/n;->t:Lm8/e;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LK8/h;

    invoke-virtual {p0, p1}, LK8/h;->v(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method private final w()V
    .registers 2

    invoke-direct {p0}, LF8/n;->L()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, LF8/n;->v()V

    :cond_9
    return-void
.end method

.method private final x(I)V
    .registers 3

    invoke-direct {p0}, LF8/n;->V()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-static {p0, p1}, LF8/a0;->a(LF8/Z;I)V

    return-void
.end method

.method private final z()LF8/d0;
    .registers 2

    invoke-static {}, LF8/n;->E()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/d0;

    return-object p0
.end method


# virtual methods
.method public final A()Ljava/lang/Object;
    .registers 4

    invoke-direct {p0}, LF8/n;->L()Z

    move-result v0

    invoke-direct {p0}, LF8/n;->X()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-direct {p0}, LF8/n;->z()LF8/d0;

    move-result-object v1

    if-nez v1, :cond_13

    invoke-direct {p0}, LF8/n;->H()LF8/d0;

    :cond_13
    if-eqz v0, :cond_18

    invoke-virtual {p0}, LF8/n;->P()V

    :cond_18
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1d
    if-eqz v0, :cond_22

    invoke-virtual {p0}, LF8/n;->P()V

    :cond_22
    invoke-virtual {p0}, LF8/n;->B()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/A;

    if-nez v1, :cond_54

    iget v1, p0, LF8/Z;->s:I

    invoke-static {v1}, LF8/a0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_4f

    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object v1

    sget-object v2, LF8/x0;->e:LF8/x0$b;

    invoke-interface {v1, v2}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v1

    check-cast v1, LF8/x0;

    if-eqz v1, :cond_4f

    invoke-interface {v1}, LF8/x0;->a()Z

    move-result v2

    if-eqz v2, :cond_47

    goto :goto_4f

    :cond_47
    invoke-interface {v1}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LF8/n;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    throw v1

    :cond_4f
    :goto_4f
    invoke-virtual {p0, v0}, LF8/n;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_54
    check-cast v0, LF8/A;

    iget-object p0, v0, LF8/A;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public final B()Ljava/lang/Object;
    .registers 2

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public G()V
    .registers 3

    invoke-direct {p0}, LF8/n;->H()LF8/d0;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_19

    :cond_7
    invoke-virtual {p0}, LF8/n;->K()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, LF8/d0;->dispose()V

    invoke-static {}, LF8/n;->E()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LF8/K0;->q:LF8/K0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_19
    :goto_19
    return-void
.end method

.method public final J(LF8/k;)V
    .registers 2

    invoke-direct {p0, p1}, LF8/n;->I(Ljava/lang/Object;)V

    return-void
.end method

.method public K()Z
    .registers 1

    invoke-virtual {p0}, LF8/n;->B()Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, LF8/L0;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method protected N()Ljava/lang/String;
    .registers 1

    const-string p0, "CancellableContinuation"

    return-object p0
.end method

.method public final O(Ljava/lang/Throwable;)V
    .registers 3

    invoke-direct {p0, p1}, LF8/n;->u(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0, p1}, LF8/n;->o(Ljava/lang/Throwable;)Z

    invoke-direct {p0}, LF8/n;->w()V

    return-void
.end method

.method public final P()V
    .registers 3

    iget-object v0, p0, LF8/n;->t:Lm8/e;

    instance-of v1, v0, LK8/h;

    if-eqz v1, :cond_9

    check-cast v0, LK8/h;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_19

    invoke-virtual {v0, p0}, LK8/h;->x(LF8/l;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_13

    goto :goto_19

    :cond_13
    invoke-virtual {p0}, LF8/n;->v()V

    invoke-virtual {p0, v0}, LF8/n;->o(Ljava/lang/Throwable;)Z

    :cond_19
    :goto_19
    return-void
.end method

.method public final Q()Z
    .registers 3

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/z;

    if-eqz v1, :cond_17

    check-cast v0, LF8/z;

    iget-object v0, v0, LF8/z;->d:Ljava/lang/Object;

    if-eqz v0, :cond_17

    invoke-virtual {p0}, LF8/n;->v()V

    const/4 p0, 0x0

    return p0

    :cond_17
    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const v1, 0x1fffffff

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LF8/d;->q:LF8/d;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final S(Ljava/lang/Object;ILv8/q;)V
    .registers 13

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LF8/L0;

    if-eqz v2, :cond_2e

    move-object v4, v1

    check-cast v4, LF8/L0;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, LF8/n;->U(LF8/L0;Ljava/lang/Object;ILv8/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v3, v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_29

    invoke-direct {v3}, LF8/n;->w()V

    invoke-direct {v3, v6}, LF8/n;->x(I)V

    return-void

    :cond_29
    move-object p0, v3

    move-object p1, v5

    move p2, v6

    move-object p3, v7

    goto :goto_4

    :cond_2e
    move-object v3, p0

    move-object v5, p1

    move-object v7, p3

    instance-of p0, v1, LF8/q;

    if-eqz p0, :cond_45

    check-cast v1, LF8/q;

    invoke-virtual {v1}, LF8/q;->e()Z

    move-result p0

    if-eqz p0, :cond_45

    if-eqz v7, :cond_44

    iget-object p0, v1, LF8/A;->a:Ljava/lang/Throwable;

    invoke-virtual {v3, v7, p0, v5}, LF8/n;->p(Lv8/q;Ljava/lang/Throwable;Ljava/lang/Object;)V

    :cond_44
    return-void

    :cond_45
    invoke-direct {v3, v5}, LF8/n;->l(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method

.method public a()Z
    .registers 1

    invoke-virtual {p0}, LF8/n;->B()Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, LF8/L0;

    return p0
.end method

.method public b(LK8/A;I)V
    .registers 7

    invoke-static {}, LF8/n;->D()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x1fffffff

    and-int v3, v1, v2

    if-ne v3, v2, :cond_1e

    shr-int/lit8 v2, v1, 0x1d

    shl-int/lit8 v2, v2, 0x1d

    add-int/2addr v2, p2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {p0, p1}, LF8/n;->I(Ljava/lang/Object;)V

    return-void

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "invokeOnCancellation should be called at most once"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .registers 13

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    :goto_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, LF8/L0;

    if-nez v0, :cond_5a

    instance-of v0, v1, LF8/A;

    if-eqz v0, :cond_11

    goto :goto_57

    :cond_11
    instance-of v0, v1, LF8/z;

    if-eqz v0, :cond_41

    move-object v2, v1

    check-cast v2, LF8/z;

    invoke-virtual {v2}, LF8/z;->c()Z

    move-result v0

    if-nez v0, :cond_39

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, LF8/z;->b(LF8/z;Ljava/lang/Object;LF8/k;Lv8/q;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LF8/z;

    move-result-object p2

    move-object v5, v7

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_58

    invoke-virtual {v2, p0, v5}, LF8/z;->d(LF8/n;Ljava/lang/Throwable;)V

    return-void

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Must be called at most once"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_41
    move-object v5, p2

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    new-instance v0, LF8/z;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, LF8/z;-><init>(Ljava/lang/Object;LF8/k;Lv8/q;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/h;)V

    invoke-virtual {p2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_58

    :goto_57
    return-void

    :cond_58
    move-object p2, v5

    goto :goto_4

    :cond_5a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Not completed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final d()Lm8/e;
    .registers 1

    iget-object p0, p0, LF8/n;->t:Lm8/e;

    return-object p0
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .registers 2

    invoke-super {p0, p1}, LF8/Z;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_7

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    instance-of p0, p1, LF8/z;

    if-eqz p0, :cond_9

    check-cast p1, LF8/z;

    iget-object p0, p1, LF8/z;->a:Ljava/lang/Object;

    return-object p0

    :cond_9
    return-object p1
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .registers 2

    iget-object p0, p0, LF8/n;->t:Lm8/e;

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v0, :cond_9

    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public getContext()Lm8/i;
    .registers 1

    iget-object p0, p0, LF8/n;->u:Lm8/i;

    return-object p0
.end method

.method public h()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LF8/n;->B()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public i(Lv8/l;)V
    .registers 3

    new-instance v0, LF8/k$a;

    invoke-direct {v0, p1}, LF8/k$a;-><init>(Lv8/l;)V

    invoke-static {p0, v0}, LF8/p;->c(LF8/l;LF8/k;)V

    return-void
.end method

.method public k(Ljava/lang/Object;Lv8/l;)V
    .registers 5

    iget v0, p0, LF8/Z;->s:I

    if-eqz p2, :cond_a

    new-instance v1, LF8/m;

    invoke-direct {v1, p2}, LF8/m;-><init>(Lv8/l;)V

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    invoke-virtual {p0, p1, v0, v1}, LF8/n;->S(Ljava/lang/Object;ILv8/q;)V

    return-void
.end method

.method public m(Ljava/lang/Object;Lv8/q;)V
    .registers 4

    iget v0, p0, LF8/Z;->s:I

    invoke-virtual {p0, p1, v0, p2}, LF8/n;->S(Ljava/lang/Object;ILv8/q;)V

    return-void
.end method

.method public final n(LF8/k;Ljava/lang/Throwable;)V
    .registers 6

    :try_start_0
    invoke-interface {p1, p2}, LF8/k;->e(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_0 .. :try_end_3} :catchall_4

    return-void

    :catchall_4
    move-exception p1

    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object p2

    new-instance v0, LF8/B;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LF8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public o(Ljava/lang/Throwable;)Z
    .registers 8

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LF8/L0;

    const/4 v3, 0x0

    if-nez v2, :cond_e

    return v3

    :cond_e
    new-instance v2, LF8/q;

    instance-of v4, v1, LF8/k;

    const/4 v5, 0x1

    if-nez v4, :cond_19

    instance-of v4, v1, LK8/A;

    if-eqz v4, :cond_1a

    :cond_19
    move v3, v5

    :cond_1a
    invoke-direct {v2, p0, p1, v3}, LF8/q;-><init>(Lm8/e;Ljava/lang/Throwable;Z)V

    invoke-static {}, LF8/n;->F()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v0, v1

    check-cast v0, LF8/L0;

    instance-of v2, v0, LF8/k;

    if-eqz v2, :cond_34

    check-cast v1, LF8/k;

    invoke-virtual {p0, v1, p1}, LF8/n;->n(LF8/k;Ljava/lang/Throwable;)V

    goto :goto_3d

    :cond_34
    instance-of v0, v0, LK8/A;

    if-eqz v0, :cond_3d

    check-cast v1, LK8/A;

    invoke-direct {p0, v1, p1}, LF8/n;->s(LK8/A;Ljava/lang/Throwable;)V

    :cond_3d
    :goto_3d
    invoke-direct {p0}, LF8/n;->w()V

    iget p1, p0, LF8/Z;->s:I

    invoke-direct {p0, p1}, LF8/n;->x(I)V

    return v5
.end method

.method public final p(Lv8/q;Ljava/lang/Throwable;Ljava/lang/Object;)V
    .registers 6

    :try_start_0
    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object v0

    invoke-interface {p1, p2, p3, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_0 .. :try_end_7} :catchall_8

    return-void

    :catchall_8
    move-exception p1

    invoke-virtual {p0}, LF8/n;->getContext()Lm8/i;

    move-result-object p2

    new-instance p3, LF8/B;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p3, p0, p1}, LF8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, p3}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public q(LF8/I;Ljava/lang/Object;)V
    .registers 9

    iget-object v0, p0, LF8/n;->t:Lm8/e;

    instance-of v1, v0, LK8/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    check-cast v0, LK8/h;

    goto :goto_b

    :cond_a
    move-object v0, v2

    :goto_b
    if-eqz v0, :cond_f

    iget-object v2, v0, LK8/h;->t:LF8/I;

    :cond_f
    if-ne v2, p1, :cond_14

    const/4 p1, 0x4

    :goto_12
    move v2, p1

    goto :goto_17

    :cond_14
    iget p1, p0, LF8/Z;->s:I

    goto :goto_12

    :goto_17
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LF8/n;->T(LF8/n;Ljava/lang/Object;ILv8/q;ILjava/lang/Object;)V

    return-void
.end method

.method public r(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LF8/n;->W(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)LK8/D;

    move-result-object p0

    return-object p0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .registers 8

    invoke-static {p1, p0}, LF8/C;->c(Ljava/lang/Object;LF8/l;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, LF8/Z;->s:I

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LF8/n;->T(LF8/n;Ljava/lang/Object;ILv8/q;ILjava/lang/Object;)V

    return-void
.end method

.method public t(Ljava/lang/Object;)V
    .registers 2

    iget p1, p0, LF8/Z;->s:I

    invoke-direct {p0, p1}, LF8/n;->x(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LF8/n;->N()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF8/n;->t:Lm8/e;

    invoke-static {v1}, LF8/P;->c(Lm8/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LF8/n;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final v()V
    .registers 3

    invoke-direct {p0}, LF8/n;->z()LF8/d0;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    invoke-interface {v0}, LF8/d0;->dispose()V

    invoke-static {}, LF8/n;->E()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LF8/K0;->q:LF8/K0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public y(LF8/x0;)Ljava/lang/Throwable;
    .registers 2

    invoke-interface {p1}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0
.end method
