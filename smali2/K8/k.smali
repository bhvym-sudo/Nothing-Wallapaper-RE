.class public final LK8/k;
.super LF8/I;
.source "SourceFile"

# interfaces
.implements LF8/V;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK8/k$a;
    }
.end annotation


# static fields
.field private static final synthetic y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic runningWorkers$volatile:I

.field private final synthetic s:LF8/V;

.field private final t:LF8/I;

.field private final u:I

.field private final v:Ljava/lang/String;

.field private final w:LK8/p;

.field private final x:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-class v0, LK8/k;

    const-string v1, "runningWorkers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/k;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LF8/I;ILjava/lang/String;)V
    .registers 5

    invoke-direct {p0}, LF8/I;-><init>()V

    instance-of v0, p1, LF8/V;

    if-eqz v0, :cond_b

    move-object v0, p1

    check-cast v0, LF8/V;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    if-nez v0, :cond_12

    invoke-static {}, LF8/S;->a()LF8/V;

    move-result-object v0

    :cond_12
    iput-object v0, p0, LK8/k;->s:LF8/V;

    iput-object p1, p0, LK8/k;->t:LF8/I;

    iput p2, p0, LK8/k;->u:I

    iput-object p3, p0, LK8/k;->v:Ljava/lang/String;

    new-instance p1, LK8/p;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LK8/p;-><init>(Z)V

    iput-object p1, p0, LK8/k;->w:LK8/p;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK8/k;->x:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic l1(LK8/k;)LF8/I;
    .registers 1

    iget-object p0, p0, LK8/k;->t:LF8/I;

    return-object p0
.end method

.method public static final synthetic m1(LK8/k;)Ljava/lang/Runnable;
    .registers 1

    invoke-direct {p0}, LK8/k;->o1()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LK8/k;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final o1()Ljava/lang/Runnable;
    .registers 3

    :goto_0
    iget-object v0, p0, LK8/k;->w:LK8/p;

    invoke-virtual {v0}, LK8/p;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_2b

    iget-object v0, p0, LK8/k;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_d
    invoke-static {}, LK8/k;->n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v1, p0, LK8/k;->w:LK8/p;

    invoke-virtual {v1}, LK8/p;->c()I

    move-result v1
    :try_end_1a
    .catchall {:try_start_d .. :try_end_1a} :catchall_28

    if-nez v1, :cond_1f

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :cond_1f
    :try_start_1f
    invoke-static {}, LK8/k;->n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_26
    .catchall {:try_start_1f .. :try_end_26} :catchall_28

    monitor-exit v0

    goto :goto_0

    :catchall_28
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_2b
    return-object v0
.end method

.method private final p1()Z
    .registers 4

    iget-object v0, p0, LK8/k;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-static {}, LK8/k;->n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, LK8/k;->u:I
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_1c

    if-lt v1, v2, :cond_12

    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :cond_12
    :try_start_12
    invoke-static {}, LK8/k;->n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_19
    .catchall {:try_start_12 .. :try_end_19} :catchall_1c

    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_1c
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public T0(JLF8/l;)V
    .registers 4

    iget-object p0, p0, LK8/k;->s:LF8/V;

    invoke-interface {p0, p1, p2, p3}, LF8/V;->T0(JLF8/l;)V

    return-void
.end method

.method public W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 5

    iget-object p0, p0, LK8/k;->s:LF8/V;

    invoke-interface {p0, p1, p2, p3, p4}, LF8/V;->W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    iget-object p1, p0, LK8/k;->w:LK8/p;

    invoke-virtual {p1, p2}, LK8/p;->a(Ljava/lang/Object;)Z

    invoke-static {}, LK8/k;->n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, LK8/k;->u:I

    if-ge p1, p2, :cond_28

    invoke-direct {p0}, LK8/k;->p1()Z

    move-result p1

    if-eqz p1, :cond_28

    invoke-direct {p0}, LK8/k;->o1()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_1e

    goto :goto_28

    :cond_1e
    new-instance p2, LK8/k$a;

    invoke-direct {p2, p0, p1}, LK8/k$a;-><init>(LK8/k;Ljava/lang/Runnable;)V

    iget-object p1, p0, LK8/k;->t:LF8/I;

    invoke-static {p1, p0, p2}, LK8/i;->c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V

    :cond_28
    :goto_28
    return-void
.end method

.method public h1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    iget-object p1, p0, LK8/k;->w:LK8/p;

    invoke-virtual {p1, p2}, LK8/p;->a(Ljava/lang/Object;)Z

    invoke-static {}, LK8/k;->n1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, LK8/k;->u:I

    if-ge p1, p2, :cond_28

    invoke-direct {p0}, LK8/k;->p1()Z

    move-result p1

    if-eqz p1, :cond_28

    invoke-direct {p0}, LK8/k;->o1()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_1e

    goto :goto_28

    :cond_1e
    new-instance p2, LK8/k$a;

    invoke-direct {p2, p0, p1}, LK8/k$a;-><init>(LK8/k;Ljava/lang/Runnable;)V

    iget-object p1, p0, LK8/k;->t:LF8/I;

    invoke-virtual {p1, p0, p2}, LF8/I;->h1(Lm8/i;Ljava/lang/Runnable;)V

    :cond_28
    :goto_28
    return-void
.end method

.method public j1(ILjava/lang/String;)LF8/I;
    .registers 4

    invoke-static {p1}, LK8/l;->a(I)V

    iget v0, p0, LK8/k;->u:I

    if-lt p1, v0, :cond_c

    invoke-static {p0, p2}, LK8/l;->b(LF8/I;Ljava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0

    :cond_c
    invoke-super {p0, p1, p2}, LF8/I;->j1(ILjava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, LK8/k;->v:Ljava/lang/String;

    if-nez v0, :cond_22

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LK8/k;->t:LF8/I;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".limitedParallelism("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LK8/k;->u:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_22
    return-object v0
.end method
