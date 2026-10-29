.class public abstract LF8/i0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LF8/d0;
.implements LK8/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private volatile _heap:Ljava/lang/Object;

.field public q:J

.field private r:I


# direct methods
.method public constructor <init>(J)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LF8/i0$c;->q:J

    const/4 p1, -0x1

    iput p1, p0, LF8/i0$c;->r:I

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    check-cast p1, LF8/i0$c;

    invoke-virtual {p0, p1}, LF8/i0$c;->i(LF8/i0$c;)I

    move-result p0

    return p0
.end method

.method public final dispose()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LF8/i0$c;->_heap:Ljava/lang/Object;

    invoke-static {}, LF8/l0;->b()LK8/D;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_12

    if-ne v0, v1, :cond_b

    monitor-exit p0

    return-void

    :cond_b
    :try_start_b
    instance-of v1, v0, LF8/i0$d;

    if-eqz v1, :cond_14

    check-cast v0, LF8/i0$d;

    goto :goto_15

    :catchall_12
    move-exception v0

    goto :goto_24

    :cond_14
    const/4 v0, 0x0

    :goto_15
    if-eqz v0, :cond_1a

    invoke-virtual {v0, p0}, LK8/M;->h(LK8/N;)Z

    :cond_1a
    invoke-static {}, LF8/l0;->b()LK8/D;

    move-result-object v0

    iput-object v0, p0, LF8/i0$c;->_heap:Ljava/lang/Object;

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_22
    .catchall {:try_start_b .. :try_end_22} :catchall_12

    monitor-exit p0

    return-void

    :goto_24
    monitor-exit p0

    throw v0
.end method

.method public e()LK8/M;
    .registers 2

    iget-object p0, p0, LF8/i0$c;->_heap:Ljava/lang/Object;

    instance-of v0, p0, LK8/M;

    if-eqz v0, :cond_9

    check-cast p0, LK8/M;

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public f(I)V
    .registers 2

    iput p1, p0, LF8/i0$c;->r:I

    return-void
.end method

.method public g()I
    .registers 1

    iget p0, p0, LF8/i0$c;->r:I

    return p0
.end method

.method public h(LK8/M;)V
    .registers 4

    iget-object v0, p0, LF8/i0$c;->_heap:Ljava/lang/Object;

    invoke-static {}, LF8/l0;->b()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_b

    iput-object p1, p0, LF8/i0$c;->_heap:Ljava/lang/Object;

    return-void

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public i(LF8/i0$c;)I
    .registers 4

    iget-wide v0, p0, LF8/i0$c;->q:J

    iget-wide p0, p1, LF8/i0$c;->q:J

    sub-long/2addr v0, p0

    const-wide/16 p0, 0x0

    cmp-long p0, v0, p0

    if-lez p0, :cond_d

    const/4 p0, 0x1

    return p0

    :cond_d
    if-gez p0, :cond_11

    const/4 p0, -0x1

    return p0

    :cond_11
    const/4 p0, 0x0

    return p0
.end method

.method public final k(JLF8/i0$d;LF8/i0;)I
    .registers 12

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LF8/i0$c;->_heap:Ljava/lang/Object;

    invoke-static {}, LF8/l0;->b()LK8/D;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_1d

    if-ne v0, v1, :cond_c

    monitor-exit p0

    const/4 p0, 0x2

    return p0

    :cond_c
    :try_start_c
    monitor-enter p3
    :try_end_d
    .catchall {:try_start_c .. :try_end_d} :catchall_1d

    :try_start_d
    invoke-virtual {p3}, LK8/M;->b()LK8/N;

    move-result-object v0

    check-cast v0, LF8/i0$c;

    invoke-static {p4}, LF8/i0;->A1(LF8/i0;)Z

    move-result p4
    :try_end_17
    .catchall {:try_start_d .. :try_end_17} :catchall_26

    if-eqz p4, :cond_1f

    :try_start_19
    monitor-exit p3
    :try_end_1a
    .catchall {:try_start_19 .. :try_end_1a} :catchall_1d

    monitor-exit p0

    const/4 p0, 0x1

    return p0

    :catchall_1d
    move-exception p1

    goto :goto_50

    :cond_1f
    const-wide/16 v1, 0x0

    if-nez v0, :cond_28

    :try_start_23
    iput-wide p1, p3, LF8/i0$d;->c:J

    goto :goto_3c

    :catchall_26
    move-exception p1

    goto :goto_4e

    :cond_28
    iget-wide v3, v0, LF8/i0$c;->q:J

    sub-long v5, v3, p1

    cmp-long p4, v5, v1

    if-ltz p4, :cond_31

    goto :goto_32

    :cond_31
    move-wide p1, v3

    :goto_32
    iget-wide v3, p3, LF8/i0$d;->c:J

    sub-long v3, p1, v3

    cmp-long p4, v3, v1

    if-lez p4, :cond_3c

    iput-wide p1, p3, LF8/i0$d;->c:J

    :cond_3c
    :goto_3c
    iget-wide p1, p0, LF8/i0$c;->q:J

    iget-wide v3, p3, LF8/i0$d;->c:J

    sub-long/2addr p1, v3

    cmp-long p1, p1, v1

    if-gez p1, :cond_47

    iput-wide v3, p0, LF8/i0$c;->q:J

    :cond_47
    invoke-virtual {p3, p0}, LK8/M;->a(LK8/N;)V
    :try_end_4a
    .catchall {:try_start_23 .. :try_end_4a} :catchall_26

    :try_start_4a
    monitor-exit p3
    :try_end_4b
    .catchall {:try_start_4a .. :try_end_4b} :catchall_1d

    monitor-exit p0

    const/4 p0, 0x0

    return p0

    :goto_4e
    :try_start_4e
    monitor-exit p3

    throw p1
    :try_end_50
    .catchall {:try_start_4e .. :try_end_50} :catchall_1d

    :goto_50
    monitor-exit p0

    throw p1
.end method

.method public final l(J)Z
    .registers 5

    iget-wide v0, p0, LF8/i0$c;->q:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p1, v0

    if-ltz p0, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delayed[nanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LF8/i0$c;->q:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
