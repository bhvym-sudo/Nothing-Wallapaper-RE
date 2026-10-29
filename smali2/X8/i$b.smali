.class public final LX8/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private q:Z

.field private final r:Le9/e;

.field private s:LP8/u;

.field private t:Z

.field final synthetic u:LX8/i;


# direct methods
.method public constructor <init>(LX8/i;Z)V
    .registers 3

    iput-object p1, p0, LX8/i$b;->u:LX8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LX8/i$b;->q:Z

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    iput-object p1, p0, LX8/i$b;->r:Le9/e;

    return-void
.end method

.method private final a(Z)V
    .registers 14

    iget-object v1, p0, LX8/i$b;->u:LX8/i;

    monitor-enter v1

    :try_start_3
    invoke-virtual {v1}, LX8/i;->s()LX8/i$d;

    move-result-object v0

    invoke-virtual {v0}, Le9/c;->v()V
    :try_end_a
    .catchall {:try_start_3 .. :try_end_a} :catchall_5f

    :goto_a
    :try_start_a
    invoke-virtual {v1}, LX8/i;->r()J

    move-result-wide v2

    invoke-virtual {v1}, LX8/i;->q()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_2b

    iget-boolean v0, p0, LX8/i$b;->q:Z

    if-nez v0, :cond_2b

    iget-boolean v0, p0, LX8/i$b;->t:Z

    if-nez v0, :cond_2b

    invoke-virtual {v1}, LX8/i;->h()LX8/b;

    move-result-object v0

    if-nez v0, :cond_2b

    invoke-virtual {v1}, LX8/i;->D()V
    :try_end_27
    .catchall {:try_start_a .. :try_end_27} :catchall_28

    goto :goto_a

    :catchall_28
    move-exception v0

    move-object p0, v0

    goto :goto_97

    :cond_2b
    :try_start_2b
    invoke-virtual {v1}, LX8/i;->s()LX8/i$d;

    move-result-object v0

    invoke-virtual {v0}, LX8/i$d;->C()V

    invoke-virtual {v1}, LX8/i;->c()V

    invoke-virtual {v1}, LX8/i;->q()J

    move-result-wide v2

    invoke-virtual {v1}, LX8/i;->r()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v0, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    invoke-virtual {v1}, LX8/i;->r()J

    move-result-wide v2

    add-long/2addr v2, v10

    invoke-virtual {v1, v2, v3}, LX8/i;->B(J)V

    if-eqz p1, :cond_62

    iget-object p1, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v2

    cmp-long p1, v10, v2

    if-nez p1, :cond_62

    const/4 p1, 0x1

    :goto_5d
    move v8, p1

    goto :goto_64

    :catchall_5f
    move-exception v0

    move-object p0, v0

    goto :goto_9f

    :cond_62
    const/4 p1, 0x0

    goto :goto_5d

    :goto_64
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_66
    .catchall {:try_start_2b .. :try_end_66} :catchall_5f

    monitor-exit v1

    iget-object p1, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p1}, LX8/i;->s()LX8/i$d;

    move-result-object p1

    invoke-virtual {p1}, Le9/c;->v()V

    :try_start_70
    iget-object p1, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p1}, LX8/i;->g()LX8/f;

    move-result-object v6

    iget-object p1, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p1}, LX8/i;->j()I

    move-result v7

    iget-object v9, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual/range {v6 .. v11}, LX8/f;->z1(IZLe9/e;J)V
    :try_end_81
    .catchall {:try_start_70 .. :try_end_81} :catchall_8b

    iget-object p0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p0}, LX8/i;->s()LX8/i$d;

    move-result-object p0

    invoke-virtual {p0}, LX8/i$d;->C()V

    return-void

    :catchall_8b
    move-exception v0

    move-object p1, v0

    iget-object p0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p0}, LX8/i;->s()LX8/i$d;

    move-result-object p0

    invoke-virtual {p0}, LX8/i$d;->C()V

    throw p1

    :goto_97
    :try_start_97
    invoke-virtual {v1}, LX8/i;->s()LX8/i$d;

    move-result-object p1

    invoke-virtual {p1}, LX8/i$d;->C()V

    throw p0
    :try_end_9f
    .catchall {:try_start_97 .. :try_end_9f} :catchall_5f

    :goto_9f
    monitor-exit v1

    throw p0
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    sget-boolean v1, LQ8/d;->h:Z

    if-eqz v1, :cond_39

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_39

    :cond_12
    new-instance p0, Ljava/lang/AssertionError;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Thread "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " MUST NOT hold lock on "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_39
    :goto_39
    iget-object v0, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {v0, p1, p2, p3}, Le9/e;->Z(Le9/e;J)V

    :goto_3e
    iget-object p1, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p1, p1, v0

    if-ltz p1, :cond_4f

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX8/i$b;->a(Z)V

    goto :goto_3e

    :cond_4f
    return-void
.end method

.method public final b()Z
    .registers 1

    iget-boolean p0, p0, LX8/i$b;->q:Z

    return p0
.end method

.method public close()V
    .registers 11

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    sget-boolean v1, LQ8/d;->h:Z

    if-eqz v1, :cond_34

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_34

    :cond_d
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_34
    :goto_34
    iget-object v1, p0, LX8/i$b;->u:LX8/i;

    monitor-enter v1

    :try_start_37
    iget-boolean v0, p0, LX8/i$b;->t:Z
    :try_end_39
    .catchall {:try_start_37 .. :try_end_39} :catchall_cf

    if-eqz v0, :cond_3d

    monitor-exit v1

    return-void

    :cond_3d
    :try_start_3d
    invoke-virtual {v1}, LX8/i;->h()LX8/b;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_47

    move v0, v3

    goto :goto_48

    :cond_47
    move v0, v2

    :goto_48
    sget-object v4, Lh8/A;->a:Lh8/A;
    :try_end_4a
    .catchall {:try_start_3d .. :try_end_4a} :catchall_cf

    monitor-exit v1

    iget-object v1, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v1}, LX8/i;->o()LX8/i$b;

    move-result-object v1

    iget-boolean v1, v1, LX8/i$b;->q:Z

    if-nez v1, :cond_b4

    iget-object v1, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {v1}, Le9/e;->X0()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_63

    move v1, v3

    goto :goto_64

    :cond_63
    move v1, v2

    :goto_64
    iget-object v4, p0, LX8/i$b;->s:LP8/u;

    if-eqz v4, :cond_8f

    :goto_68
    iget-object v1, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {v1}, Le9/e;->X0()J

    move-result-wide v4

    cmp-long v1, v4, v6

    if-lez v1, :cond_76

    invoke-direct {p0, v2}, LX8/i$b;->a(Z)V

    goto :goto_68

    :cond_76
    iget-object v1, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v1}, LX8/i;->g()LX8/f;

    move-result-object v1

    iget-object v2, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v2}, LX8/i;->j()I

    move-result v2

    iget-object v4, p0, LX8/i$b;->s:LP8/u;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v4}, LQ8/d;->O(LP8/u;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v2, v0, v4}, LX8/f;->A1(IZLjava/util/List;)V

    goto :goto_b4

    :cond_8f
    if-eqz v1, :cond_9f

    :goto_91
    iget-object v0, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_b4

    invoke-direct {p0, v3}, LX8/i$b;->a(Z)V

    goto :goto_91

    :cond_9f
    if-eqz v0, :cond_b4

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v0}, LX8/i;->g()LX8/f;

    move-result-object v4

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v0}, LX8/i;->j()I

    move-result v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v4 .. v9}, LX8/f;->z1(IZLe9/e;J)V

    :cond_b4
    :goto_b4
    iget-object v1, p0, LX8/i$b;->u:LX8/i;

    monitor-enter v1

    :try_start_b7
    iput-boolean v3, p0, LX8/i$b;->t:Z

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_bb
    .catchall {:try_start_b7 .. :try_end_bb} :catchall_cb

    monitor-exit v1

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v0}, LX8/i;->g()LX8/f;

    move-result-object v0

    invoke-virtual {v0}, LX8/f;->flush()V

    iget-object p0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p0}, LX8/i;->b()V

    return-void

    :catchall_cb
    move-exception v0

    move-object p0, v0

    monitor-exit v1

    throw p0

    :catchall_cf
    move-exception v0

    move-object p0, v0

    monitor-exit v1

    throw p0
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {p0}, LX8/i;->s()LX8/i$d;

    move-result-object p0

    return-object p0
.end method

.method public flush()V
    .registers 5

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    sget-boolean v1, LQ8/d;->h:Z

    if-eqz v1, :cond_34

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_34

    :cond_d
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_34
    :goto_34
    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    monitor-enter v0

    :try_start_37
    invoke-virtual {v0}, LX8/i;->c()V

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_3c
    .catchall {:try_start_37 .. :try_end_3c} :catchall_58

    monitor-exit v0

    :goto_3d
    iget-object v0, p0, LX8/i$b;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_57

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LX8/i$b;->a(Z)V

    iget-object v0, p0, LX8/i$b;->u:LX8/i;

    invoke-virtual {v0}, LX8/i;->g()LX8/f;

    move-result-object v0

    invoke-virtual {v0}, LX8/f;->flush()V

    goto :goto_3d

    :cond_57
    return-void

    :catchall_58
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final y()Z
    .registers 1

    iget-boolean p0, p0, LX8/i$b;->t:Z

    return p0
.end method
