.class public final LF8/Y;
.super LK8/z;
.source "SourceFile"


# static fields
.field private static final synthetic u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _decision$volatile:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-class v0, LF8/Y;

    const-string v1, "_decision$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/Y;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm8/i;Lm8/e;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LK8/z;-><init>(Lm8/i;Lm8/e;)V

    return-void
.end method

.method private static final synthetic a1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LF8/Y;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final b1()Z
    .registers 6

    invoke-static {}, LF8/Y;->a1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v3, :cond_f

    return v2

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {}, LF8/Y;->a1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    const/4 v4, 0x2

    invoke-virtual {v1, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_4

    return v3
.end method

.method private final d1()Z
    .registers 5

    invoke-static {}, LF8/Y;->a1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_17

    const/4 p0, 0x2

    if-ne v1, p0, :cond_f

    return v2

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Already suspended"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {}, LF8/Y;->a1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_4

    return v3
.end method


# virtual methods
.method protected S0(Ljava/lang/Object;)V
    .registers 3

    invoke-direct {p0}, LF8/Y;->b1()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, LK8/z;->t:Lm8/e;

    invoke-static {v0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    iget-object p0, p0, LK8/z;->t:Lm8/e;

    invoke-static {p1, p0}, LF8/C;->a(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, LK8/i;->b(Lm8/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final Z0()Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, LF8/Y;->d1()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LF8/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/A;

    if-nez v0, :cond_18

    return-object p0

    :cond_18
    check-cast p0, LF8/A;

    iget-object p0, p0, LF8/A;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method protected y(Ljava/lang/Object;)V
    .registers 2

    invoke-virtual {p0, p1}, LF8/Y;->S0(Ljava/lang/Object;)V

    return-void
.end method
