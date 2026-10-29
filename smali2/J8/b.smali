.class public abstract LJ8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private q:[LJ8/d;

.field private r:I

.field private s:I

.field private t:LJ8/B;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic f(LJ8/b;)I
    .registers 1

    iget p0, p0, LJ8/b;->r:I

    return p0
.end method

.method public static final synthetic i(LJ8/b;)[LJ8/d;
    .registers 1

    iget-object p0, p0, LJ8/b;->q:[LJ8/d;

    return-object p0
.end method


# virtual methods
.method protected final j()LJ8/d;
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LJ8/b;->q:[LJ8/d;

    const/4 v1, 0x2

    if-nez v0, :cond_f

    invoke-virtual {p0, v1}, LJ8/b;->m(I)[LJ8/d;

    move-result-object v0

    iput-object v0, p0, LJ8/b;->q:[LJ8/d;

    goto :goto_26

    :catchall_d
    move-exception v0

    goto :goto_54

    :cond_f
    iget v2, p0, LJ8/b;->r:I

    array-length v3, v0

    if-lt v2, v3, :cond_26

    array-length v2, v0

    mul-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, [LJ8/d;

    iput-object v1, p0, LJ8/b;->q:[LJ8/d;

    check-cast v0, [LJ8/d;

    :cond_26
    :goto_26
    iget v1, p0, LJ8/b;->s:I

    :cond_28
    aget-object v2, v0, v1

    if-nez v2, :cond_32

    invoke-virtual {p0}, LJ8/b;->k()LJ8/d;

    move-result-object v2

    aput-object v2, v0, v1

    :cond_32
    add-int/lit8 v1, v1, 0x1

    array-length v3, v0

    if-lt v1, v3, :cond_38

    const/4 v1, 0x0

    :cond_38
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p0}, LJ8/d;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    iput v1, p0, LJ8/b;->s:I

    iget v0, p0, LJ8/b;->r:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LJ8/b;->r:I

    iget-object v0, p0, LJ8/b;->t:LJ8/B;
    :try_end_4d
    .catchall {:try_start_1 .. :try_end_4d} :catchall_d

    monitor-exit p0

    if-eqz v0, :cond_53

    invoke-virtual {v0, v1}, LJ8/B;->c0(I)Z

    :cond_53
    return-object v2

    :goto_54
    monitor-exit p0

    throw v0
.end method

.method protected abstract k()LJ8/d;
.end method

.method public final l()LI8/O;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LJ8/b;->t:LJ8/B;

    if-nez v0, :cond_11

    new-instance v0, LJ8/B;

    iget v1, p0, LJ8/b;->r:I

    invoke-direct {v0, v1}, LJ8/B;-><init>(I)V

    iput-object v0, p0, LJ8/b;->t:LJ8/B;
    :try_end_e
    .catchall {:try_start_1 .. :try_end_e} :catchall_f

    goto :goto_11

    :catchall_f
    move-exception v0

    goto :goto_13

    :cond_11
    :goto_11
    monitor-exit p0

    return-object v0

    :goto_13
    monitor-exit p0

    throw v0
.end method

.method protected abstract m(I)[LJ8/d;
.end method

.method protected final n(LJ8/d;)V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget v0, p0, LJ8/b;->r:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, LJ8/b;->r:I

    iget-object v2, p0, LJ8/b;->t:LJ8/B;

    const/4 v3, 0x0

    if-nez v0, :cond_11

    iput v3, p0, LJ8/b;->s:I

    goto :goto_11

    :catchall_f
    move-exception p1

    goto :goto_36

    :cond_11
    :goto_11
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LJ8/d;->b(Ljava/lang/Object;)[Lm8/e;

    move-result-object p1
    :try_end_1a
    .catchall {:try_start_1 .. :try_end_1a} :catchall_f

    monitor-exit p0

    array-length p0, p1

    :goto_1c
    if-ge v3, p0, :cond_30

    aget-object v0, p1, v3

    if-eqz v0, :cond_2d

    sget-object v4, Lh8/q;->r:Lh8/q$a;

    sget-object v4, Lh8/A;->a:Lh8/A;

    invoke-static {v4}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v4}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_2d
    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_30
    if-eqz v2, :cond_35

    invoke-virtual {v2, v1}, LJ8/B;->c0(I)Z

    :cond_35
    return-void

    :goto_36
    monitor-exit p0

    throw p1
.end method

.method protected final o()I
    .registers 1

    iget p0, p0, LJ8/b;->r:I

    return p0
.end method

.method protected final p()[LJ8/d;
    .registers 1

    iget-object p0, p0, LJ8/b;->q:[LJ8/d;

    return-object p0
.end method
