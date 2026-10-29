.class public abstract LK8/A;
.super LK8/b;
.source "SourceFile"

# interfaces
.implements LF8/L0;


# static fields
.field private static final synthetic t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic cleanedAndPointers$volatile:I

.field public final s:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-class v0, LK8/A;

    const-string v1, "cleanedAndPointers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/A;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(JLK8/A;I)V
    .registers 5

    invoke-direct {p0, p3}, LK8/b;-><init>(LK8/b;)V

    iput-wide p1, p0, LK8/A;->s:J

    shl-int/lit8 p1, p4, 0x10

    iput p1, p0, LK8/A;->cleanedAndPointers$volatile:I

    return-void
.end method

.method private static final synthetic q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LK8/A;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public k()Z
    .registers 3

    invoke-static {}, LK8/A;->q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LK8/A;->r()I

    move-result v1

    if-ne v0, v1, :cond_16

    invoke-virtual {p0}, LK8/b;->l()Z

    move-result p0

    if-nez p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final p()Z
    .registers 3

    invoke-static {}, LK8/A;->q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const/high16 v1, -0x10000

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->addAndGet(Ljava/lang/Object;I)I

    move-result v0

    invoke-virtual {p0}, LK8/A;->r()I

    move-result v1

    if-ne v0, v1, :cond_18

    invoke-virtual {p0}, LK8/b;->l()Z

    move-result p0

    if-nez p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method public abstract r()I
.end method

.method public abstract s(ILjava/lang/Throwable;Lm8/i;)V
.end method

.method public final t()V
    .registers 3

    invoke-static {}, LK8/A;->q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LK8/A;->r()I

    move-result v1

    if-ne v0, v1, :cond_11

    invoke-virtual {p0}, LK8/b;->n()V

    :cond_11
    return-void
.end method

.method public final u()Z
    .registers 4

    invoke-static {}, LK8/A;->q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {p0}, LK8/A;->r()I

    move-result v2

    if-ne v1, v2, :cond_17

    invoke-virtual {p0}, LK8/b;->l()Z

    move-result v2

    if-eqz v2, :cond_15

    goto :goto_17

    :cond_15
    const/4 p0, 0x0

    return p0

    :cond_17
    :goto_17
    const/high16 v2, 0x10000

    add-int/2addr v2, v1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x1

    return p0
.end method
