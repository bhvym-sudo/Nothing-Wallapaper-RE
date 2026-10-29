.class public LK8/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final synthetic b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _size$volatile:I

.field private a:[LK8/N;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-class v0, LK8/M;

    const-string v1, "_size$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/M;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final synthetic d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LK8/M;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final g()[LK8/N;
    .registers 4

    iget-object v0, p0, LK8/M;->a:[LK8/N;

    if-nez v0, :cond_a

    const/4 v0, 0x4

    new-array v0, v0, [LK8/N;

    iput-object v0, p0, LK8/M;->a:[LK8/N;

    return-object v0

    :cond_a
    invoke-virtual {p0}, LK8/M;->c()I

    move-result v1

    array-length v2, v0

    if-lt v1, v2, :cond_24

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [LK8/N;

    iput-object v0, p0, LK8/M;->a:[LK8/N;

    :cond_24
    return-object v0
.end method

.method private final k(I)V
    .registers 3

    invoke-static {}, LK8/M;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    return-void
.end method

.method private final l(I)V
    .registers 7

    :goto_0
    mul-int/lit8 v0, p1, 0x2

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v2

    if-lt v1, v2, :cond_b

    goto :goto_3e

    :cond_b
    iget-object v2, p0, LK8/M;->a:[LK8/N;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v3

    if-ge v0, v3, :cond_2b

    aget-object v3, v2, v0

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Comparable;

    aget-object v4, v2, v1

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_2b

    goto :goto_2c

    :cond_2b
    move v0, v1

    :goto_2c
    aget-object v1, v2, p1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Comparable;

    aget-object v2, v2, v0

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v1

    if-gtz v1, :cond_3f

    :goto_3e
    return-void

    :cond_3f
    invoke-direct {p0, p1, v0}, LK8/M;->n(II)V

    move p1, v0

    goto :goto_0
.end method

.method private final m(I)V
    .registers 5

    :goto_0
    if-gtz p1, :cond_3

    goto :goto_1e

    :cond_3
    iget-object v0, p0, LK8/M;->a:[LK8/N;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    add-int/lit8 v1, p1, -0x1

    div-int/lit8 v1, v1, 0x2

    aget-object v2, v0, v1

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Comparable;

    aget-object v0, v0, p1

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1f

    :goto_1e
    return-void

    :cond_1f
    invoke-direct {p0, p1, v1}, LK8/M;->n(II)V

    move p1, v1

    goto :goto_0
.end method

.method private final n(II)V
    .registers 5

    iget-object p0, p0, LK8/M;->a:[LK8/N;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object v0, p0, p2

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object v1, p0, p1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aput-object v0, p0, p1

    aput-object v1, p0, p2

    invoke-interface {v0, p1}, LK8/N;->f(I)V

    invoke-interface {v1, p2}, LK8/N;->f(I)V

    return-void
.end method


# virtual methods
.method public final a(LK8/N;)V
    .registers 5

    invoke-interface {p1, p0}, LK8/N;->h(LK8/M;)V

    invoke-direct {p0}, LK8/M;->g()[LK8/N;

    move-result-object v0

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-direct {p0, v2}, LK8/M;->k(I)V

    aput-object p1, v0, v1

    invoke-interface {p1, v1}, LK8/N;->f(I)V

    invoke-direct {p0, v1}, LK8/M;->m(I)V

    return-void
.end method

.method public final b()LK8/N;
    .registers 2

    iget-object p0, p0, LK8/M;->a:[LK8/N;

    if-eqz p0, :cond_8

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0

    :cond_8
    const/4 p0, 0x0

    return-object p0
.end method

.method public final c()I
    .registers 2

    invoke-static {}, LK8/M;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final e()Z
    .registers 1

    invoke-virtual {p0}, LK8/M;->c()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final f()LK8/N;
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, LK8/M;->b()LK8/N;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_7

    monitor-exit p0

    return-object v0

    :catchall_7
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final h(LK8/N;)Z
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-interface {p1}, LK8/N;->e()LK8/M;

    move-result-object v0

    if-nez v0, :cond_9

    const/4 p1, 0x0

    goto :goto_11

    :cond_9
    invoke-interface {p1}, LK8/N;->g()I

    move-result p1

    invoke-virtual {p0, p1}, LK8/M;->i(I)LK8/N;
    :try_end_10
    .catchall {:try_start_1 .. :try_end_10} :catchall_13

    const/4 p1, 0x1

    :goto_11
    monitor-exit p0

    return p1

    :catchall_13
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final i(I)LK8/N;
    .registers 7

    iget-object v0, p0, LK8/M;->a:[LK8/N;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v1

    const/4 v2, -0x1

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, LK8/M;->k(I)V

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v1

    if-ge p1, v1, :cond_3d

    invoke-virtual {p0}, LK8/M;->c()I

    move-result v1

    invoke-direct {p0, p1, v1}, LK8/M;->n(II)V

    add-int/lit8 v1, p1, -0x1

    div-int/lit8 v1, v1, 0x2

    if-lez p1, :cond_3a

    aget-object v3, v0, p1

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Comparable;

    aget-object v4, v0, v1

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_3a

    invoke-direct {p0, p1, v1}, LK8/M;->n(II)V

    invoke-direct {p0, v1}, LK8/M;->m(I)V

    goto :goto_3d

    :cond_3a
    invoke-direct {p0, p1}, LK8/M;->l(I)V

    :cond_3d
    :goto_3d
    invoke-virtual {p0}, LK8/M;->c()I

    move-result p1

    aget-object p1, v0, p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-interface {p1, v1}, LK8/N;->h(LK8/M;)V

    invoke-interface {p1, v2}, LK8/N;->f(I)V

    invoke-virtual {p0}, LK8/M;->c()I

    move-result p0

    aput-object v1, v0, p0

    return-object p1
.end method

.method public final j()LK8/N;
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, LK8/M;->c()I

    move-result v0

    if-lez v0, :cond_f

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LK8/M;->i(I)LK8/N;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_d

    goto :goto_10

    :catchall_d
    move-exception v0

    goto :goto_12

    :cond_f
    const/4 v0, 0x0

    :goto_10
    monitor-exit p0

    return-object v0

    :goto_12
    monitor-exit p0

    throw v0
.end method
