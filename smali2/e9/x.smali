.class public final Le9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le9/x;

.field private static final b:I

.field private static final c:Le9/w;

.field private static final d:I

.field private static final e:[Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .registers 7

    new-instance v0, Le9/x;

    invoke-direct {v0}, Le9/x;-><init>()V

    sput-object v0, Le9/x;->a:Le9/x;

    const/high16 v0, 0x10000

    sput v0, Le9/x;->b:I

    new-instance v1, Le9/w;

    const/4 v0, 0x0

    new-array v2, v0, [B

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Le9/w;-><init>([BIIZZ)V

    sput-object v1, Le9/x;->c:Le9/w;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    sput v1, Le9/x;->d:I

    new-array v2, v1, [Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2d
    if-ge v0, v1, :cond_39

    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2d

    :cond_39
    sput-object v2, Le9/x;->e:[Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/util/concurrent/atomic/AtomicReference;
    .registers 7

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    sget p0, Le9/x;->d:I

    int-to-long v2, p0

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    and-long/2addr v0, v2

    long-to-int p0, v0

    sget-object v0, Le9/x;->e:[Ljava/util/concurrent/atomic/AtomicReference;

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static final b(Le9/w;)V
    .registers 6

    const-string v0, "segment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/w;->f:Le9/w;

    if-nez v0, :cond_3e

    iget-object v0, p0, Le9/w;->g:Le9/w;

    if-nez v0, :cond_3e

    iget-boolean v0, p0, Le9/w;->d:Z

    if-eqz v0, :cond_12

    goto :goto_22

    :cond_12
    sget-object v0, Le9/x;->a:Le9/x;

    invoke-direct {v0}, Le9/x;->a()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    sget-object v1, Le9/x;->c:Le9/w;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/w;

    if-ne v2, v1, :cond_23

    :goto_22
    return-void

    :cond_23
    const/4 v1, 0x0

    if-eqz v2, :cond_29

    iget v3, v2, Le9/w;->c:I

    goto :goto_2a

    :cond_29
    move v3, v1

    :goto_2a
    sget v4, Le9/x;->b:I

    if-lt v3, v4, :cond_32

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    :cond_32
    iput-object v2, p0, Le9/w;->f:Le9/w;

    iput v1, p0, Le9/w;->b:I

    add-int/lit16 v3, v3, 0x2000

    iput v3, p0, Le9/w;->c:I

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    :cond_3e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c()Le9/w;
    .registers 4

    sget-object v0, Le9/x;->a:Le9/x;

    invoke-direct {v0}, Le9/x;->a()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    sget-object v1, Le9/x;->c:Le9/w;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/w;

    if-ne v2, v1, :cond_16

    new-instance v0, Le9/w;

    invoke-direct {v0}, Le9/w;-><init>()V

    return-object v0

    :cond_16
    const/4 v1, 0x0

    if-nez v2, :cond_22

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance v0, Le9/w;

    invoke-direct {v0}, Le9/w;-><init>()V

    return-object v0

    :cond_22
    iget-object v3, v2, Le9/w;->f:Le9/w;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object v1, v2, Le9/w;->f:Le9/w;

    const/4 v0, 0x0

    iput v0, v2, Le9/w;->c:I

    return-object v2
.end method
