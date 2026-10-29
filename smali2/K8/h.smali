.class public final LK8/h;
.super LF8/Z;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;
.implements Lm8/e;


# static fields
.field private static final synthetic x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public final t:LF8/I;

.field public final u:Lm8/e;

.field public v:Ljava/lang/Object;

.field public final w:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation$volatile"

    const-class v2, LK8/h;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/h;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LF8/I;Lm8/e;)V
    .registers 4

    const/4 v0, -0x1

    invoke-direct {p0, v0}, LF8/Z;-><init>(I)V

    iput-object p1, p0, LK8/h;->t:LF8/I;

    iput-object p2, p0, LK8/h;->u:Lm8/e;

    invoke-static {}, LK8/i;->a()LK8/D;

    move-result-object p1

    iput-object p1, p0, LK8/h;->v:Ljava/lang/Object;

    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object p1

    invoke-static {p1}, LK8/K;->g(Lm8/i;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LK8/h;->w:Ljava/lang/Object;

    return-void
.end method

.method private final p()LF8/n;
    .registers 2

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/n;

    if-eqz v0, :cond_f

    check-cast p0, LF8/n;

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final synthetic s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/h;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public d()Lm8/e;
    .registers 1

    return-object p0
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .registers 2

    iget-object p0, p0, LK8/h;->u:Lm8/e;

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

    iget-object p0, p0, LK8/h;->u:Lm8/e;

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public h()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LK8/h;->v:Ljava/lang/Object;

    invoke-static {}, LK8/i;->a()LK8/D;

    move-result-object v1

    iput-object v1, p0, LK8/h;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()V
    .registers 4

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LK8/i;->b:LK8/D;

    if-eq v1, v2, :cond_4

    return-void
.end method

.method public final l()LF8/n;
    .registers 5

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_15

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LK8/i;->b:LK8/D;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0

    :cond_15
    instance-of v2, v1, LF8/n;

    if-eqz v2, :cond_28

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sget-object v3, LK8/i;->b:LK8/D;

    invoke-virtual {v2, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    check-cast v1, LF8/n;

    return-object v1

    :cond_28
    sget-object v2, LK8/i;->b:LK8/D;

    if-eq v1, v2, :cond_4

    instance-of v2, v1, Ljava/lang/Throwable;

    if-eqz v2, :cond_31

    goto :goto_4

    :cond_31
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent state "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final n(Lm8/i;Ljava/lang/Object;)V
    .registers 3

    iput-object p2, p0, LK8/h;->v:Ljava/lang/Object;

    const/4 p2, 0x1

    iput p2, p0, LF8/Z;->s:I

    iget-object p2, p0, LK8/h;->t:LF8/I;

    invoke-virtual {p2, p1, p0}, LF8/I;->h1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .registers 7

    invoke-static {p1}, LF8/C;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LK8/h;->t:LF8/I;

    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object v2

    invoke-static {v1, v2}, LK8/i;->d(LF8/I;Lm8/i;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1f

    iput-object v0, p0, LK8/h;->v:Ljava/lang/Object;

    iput v2, p0, LF8/Z;->s:I

    iget-object p1, p0, LK8/h;->t:LF8/I;

    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {p1, v0, p0}, LK8/i;->c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V

    return-void

    :cond_1f
    sget-object v1, LF8/V0;->a:LF8/V0;

    invoke-virtual {v1}, LF8/V0;->b()LF8/h0;

    move-result-object v1

    invoke-virtual {v1}, LF8/h0;->s1()Z

    move-result v3

    if-eqz v3, :cond_33

    iput-object v0, p0, LK8/h;->v:Ljava/lang/Object;

    iput v2, p0, LF8/Z;->s:I

    invoke-virtual {v1, p0}, LF8/h0;->o1(LF8/Z;)V

    goto :goto_60

    :cond_33
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, LF8/h0;->q1(Z)V

    :try_start_37
    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object v2

    iget-object v3, p0, LK8/h;->w:Ljava/lang/Object;

    invoke-static {v2, v3}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_41
    .catchall {:try_start_37 .. :try_end_41} :catchall_55

    :try_start_41
    iget-object v4, p0, LK8/h;->u:Lm8/e;

    invoke-interface {v4, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_48
    .catchall {:try_start_41 .. :try_end_48} :catchall_57

    :try_start_48
    invoke-static {v2, v3}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_4b
    invoke-virtual {v1}, LF8/h0;->v1()Z

    move-result p1
    :try_end_4f
    .catchall {:try_start_48 .. :try_end_4f} :catchall_55

    if-nez p1, :cond_4b

    :goto_51
    invoke-virtual {v1, v0}, LF8/h0;->l1(Z)V

    goto :goto_60

    :catchall_55
    move-exception p1

    goto :goto_5c

    :catchall_57
    move-exception p1

    :try_start_58
    invoke-static {v2, v3}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    throw p1
    :try_end_5c
    .catchall {:try_start_58 .. :try_end_5c} :catchall_55

    :goto_5c
    :try_start_5c
    invoke-virtual {p0, p1}, LF8/Z;->g(Ljava/lang/Throwable;)V
    :try_end_5f
    .catchall {:try_start_5c .. :try_end_5f} :catchall_61

    goto :goto_51

    :goto_60
    return-void

    :catchall_61
    move-exception p0

    invoke-virtual {v1, v0}, LF8/h0;->l1(Z)V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DispatchedContinuation["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LK8/h;->t:LF8/I;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LK8/h;->u:Lm8/e;

    invoke-static {p0}, LF8/P;->c(Lm8/e;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u()Z
    .registers 2

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final v(Ljava/lang/Throwable;)Z
    .registers 7

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LK8/i;->b:LK8/D;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1c

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v4

    :cond_1c
    instance-of v2, v1, Ljava/lang/Throwable;

    if-eqz v2, :cond_21

    return v4

    :cond_21
    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x0

    return p0
.end method

.method public final w()V
    .registers 1

    invoke-virtual {p0}, LK8/h;->j()V

    invoke-direct {p0}, LK8/h;->p()LF8/n;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, LF8/n;->v()V

    :cond_c
    return-void
.end method

.method public final x(LF8/l;)Ljava/lang/Throwable;
    .registers 6

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LK8/i;->b:LK8/D;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_18

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v3

    :cond_18
    instance-of p1, v1, Ljava/lang/Throwable;

    if-eqz p1, :cond_31

    invoke-static {}, LK8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_29

    check-cast v1, Ljava/lang/Throwable;

    return-object v1

    :cond_29
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Inconsistent state "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
