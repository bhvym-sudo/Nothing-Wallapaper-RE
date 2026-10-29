.class public final LX8/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final q:J

.field private r:Z

.field private final s:Le9/e;

.field private final t:Le9/e;

.field private u:LP8/u;

.field private v:Z

.field final synthetic w:LX8/i;


# direct methods
.method public constructor <init>(LX8/i;JZ)V
    .registers 5

    iput-object p1, p0, LX8/i$c;->w:LX8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LX8/i$c;->q:J

    iput-boolean p4, p0, LX8/i$c;->r:Z

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    iput-object p1, p0, LX8/i$c;->s:Le9/e;

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    iput-object p1, p0, LX8/i$c;->t:Le9/e;

    return-void
.end method

.method private final u(J)V
    .registers 5

    iget-object v0, p0, LX8/i$c;->w:LX8/i;

    sget-boolean v1, LQ8/d;->h:Z

    if-eqz v1, :cond_34

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_34

    :cond_d
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

    :cond_34
    :goto_34
    iget-object p0, p0, LX8/i$c;->w:LX8/i;

    invoke-virtual {p0}, LX8/i;->g()LX8/f;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, LX8/f;->y1(J)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .registers 1

    iget-boolean p0, p0, LX8/i$c;->v:Z

    return p0
.end method

.method public final b()Z
    .registers 1

    iget-boolean p0, p0, LX8/i$c;->r:Z

    return p0
.end method

.method public close()V
    .registers 6

    iget-object v0, p0, LX8/i$c;->w:LX8/i;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, LX8/i$c;->v:Z

    iget-object v1, p0, LX8/i$c;->t:Le9/e;

    invoke-virtual {v1}, Le9/e;->X0()J

    move-result-wide v1

    iget-object v3, p0, LX8/i$c;->t:Le9/e;

    invoke-virtual {v3}, Le9/e;->j()V

    const-string v3, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_1b
    .catchall {:try_start_4 .. :try_end_1b} :catchall_2b

    monitor-exit v0

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_25

    invoke-direct {p0, v1, v2}, LX8/i$c;->u(J)V

    :cond_25
    iget-object p0, p0, LX8/i$c;->w:LX8/i;

    invoke-virtual {p0}, LX8/i;->b()V

    return-void

    :catchall_2b
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, LX8/i$c;->w:LX8/i;

    invoke-virtual {p0}, LX8/i;->m()LX8/i$d;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_cd

    :goto_11
    iget-object v6, v0, LX8/i$c;->w:LX8/i;

    monitor-enter v6

    :try_start_14
    invoke-virtual {v6}, LX8/i;->m()LX8/i$d;

    move-result-object v7

    invoke-virtual {v7}, Le9/c;->v()V
    :try_end_1b
    .catchall {:try_start_14 .. :try_end_1b} :catchall_b9

    :try_start_1b
    invoke-virtual {v6}, LX8/i;->h()LX8/b;

    move-result-object v7

    if-eqz v7, :cond_3b

    iget-boolean v7, v0, LX8/i$c;->r:Z

    if-nez v7, :cond_3b

    invoke-virtual {v6}, LX8/i;->i()Ljava/io/IOException;

    move-result-object v7

    if-nez v7, :cond_3c

    new-instance v7, LX8/n;

    invoke-virtual {v6}, LX8/i;->h()LX8/b;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v7, v8}, LX8/n;-><init>(LX8/b;)V

    goto :goto_3c

    :catchall_38
    move-exception v0

    goto/16 :goto_c3

    :cond_3b
    const/4 v7, 0x0

    :cond_3c
    :goto_3c
    iget-boolean v8, v0, LX8/i$c;->v:Z

    if-nez v8, :cond_bb

    iget-object v8, v0, LX8/i$c;->t:Le9/e;

    invoke-virtual {v8}, Le9/e;->X0()J

    move-result-wide v8

    cmp-long v8, v8, v4

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    if-lez v8, :cond_95

    iget-object v8, v0, LX8/i$c;->t:Le9/e;

    invoke-virtual {v8}, Le9/e;->X0()J

    move-result-wide v12

    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    invoke-virtual {v8, v1, v12, v13}, Le9/e;->e1(Le9/e;J)J

    move-result-wide v12

    invoke-virtual {v6}, LX8/i;->l()J

    move-result-wide v14

    add-long/2addr v14, v12

    invoke-virtual {v6, v14, v15}, LX8/i;->A(J)V

    invoke-virtual {v6}, LX8/i;->l()J

    move-result-wide v14

    invoke-virtual {v6}, LX8/i;->k()J

    move-result-wide v16

    sub-long v14, v14, v16

    if-nez v7, :cond_a0

    invoke-virtual {v6}, LX8/i;->g()LX8/f;

    move-result-object v8

    invoke-virtual {v8}, LX8/f;->W0()LX8/m;

    move-result-object v8

    invoke-virtual {v8}, LX8/m;->c()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    int-to-long v4, v8

    cmp-long v4, v14, v4

    if-ltz v4, :cond_a0

    invoke-virtual {v6}, LX8/i;->g()LX8/f;

    move-result-object v4

    invoke-virtual {v6}, LX8/i;->j()I

    move-result v5

    invoke-virtual {v4, v5, v14, v15}, LX8/f;->E1(IJ)V

    invoke-virtual {v6}, LX8/i;->l()J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, LX8/i;->z(J)V

    goto :goto_a0

    :cond_95
    iget-boolean v4, v0, LX8/i$c;->r:Z

    if-nez v4, :cond_9f

    if-nez v7, :cond_9f

    invoke-virtual {v6}, LX8/i;->D()V
    :try_end_9e
    .catchall {:try_start_1b .. :try_end_9e} :catchall_38

    const/4 v11, 0x1

    :cond_9f
    move-wide v12, v9

    :cond_a0
    :goto_a0
    :try_start_a0
    invoke-virtual {v6}, LX8/i;->m()LX8/i$d;

    move-result-object v4

    invoke-virtual {v4}, LX8/i$d;->C()V

    sget-object v4, Lh8/A;->a:Lh8/A;
    :try_end_a9
    .catchall {:try_start_a0 .. :try_end_a9} :catchall_b9

    monitor-exit v6

    if-eqz v11, :cond_b0

    const-wide/16 v4, 0x0

    goto/16 :goto_11

    :cond_b0
    cmp-long v0, v12, v9

    if-eqz v0, :cond_b5

    return-wide v12

    :cond_b5
    if-nez v7, :cond_b8

    return-wide v9

    :cond_b8
    throw v7

    :catchall_b9
    move-exception v0

    goto :goto_cb

    :cond_bb
    :try_start_bb
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c3
    .catchall {:try_start_bb .. :try_end_c3} :catchall_38

    :goto_c3
    :try_start_c3
    invoke-virtual {v6}, LX8/i;->m()LX8/i$d;

    move-result-object v1

    invoke-virtual {v1}, LX8/i$d;->C()V

    throw v0
    :try_end_cb
    .catchall {:try_start_c3 .. :try_end_cb} :catchall_b9

    :goto_cb
    monitor-exit v6

    throw v0

    :cond_cd
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final f(Le9/g;J)V
    .registers 15

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/i$c;->w:LX8/i;

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
    move-wide v0, p2

    :goto_3a
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_b2

    iget-object v4, p0, LX8/i$c;->w:LX8/i;

    monitor-enter v4

    :try_start_43
    iget-boolean v5, p0, LX8/i$c;->r:Z

    iget-object v6, p0, LX8/i$c;->t:Le9/e;

    invoke-virtual {v6}, Le9/e;->X0()J

    move-result-wide v6

    add-long/2addr v6, v0

    iget-wide v8, p0, LX8/i$c;->q:J

    cmp-long v6, v6, v8

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-lez v6, :cond_56

    move v6, v8

    goto :goto_57

    :cond_56
    move v6, v7

    :goto_57
    sget-object v9, Lh8/A;->a:Lh8/A;
    :try_end_59
    .catchall {:try_start_43 .. :try_end_59} :catchall_af

    monitor-exit v4

    if-eqz v6, :cond_67

    invoke-interface {p1, v0, v1}, Le9/g;->skip(J)V

    iget-object p0, p0, LX8/i$c;->w:LX8/i;

    sget-object p1, LX8/b;->v:LX8/b;

    invoke-virtual {p0, p1}, LX8/i;->f(LX8/b;)V

    return-void

    :cond_67
    if-eqz v5, :cond_6d

    invoke-interface {p1, v0, v1}, Le9/g;->skip(J)V

    return-void

    :cond_6d
    iget-object v4, p0, LX8/i$c;->s:Le9/e;

    invoke-interface {p1, v4, v0, v1}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v4

    const-wide/16 v9, -0x1

    cmp-long v6, v4, v9

    if-eqz v6, :cond_a9

    sub-long/2addr v0, v4

    iget-object v4, p0, LX8/i$c;->w:LX8/i;

    monitor-enter v4

    :try_start_7d
    iget-boolean v5, p0, LX8/i$c;->v:Z

    if-eqz v5, :cond_89

    iget-object v2, p0, LX8/i$c;->s:Le9/e;

    invoke-virtual {v2}, Le9/e;->j()V

    goto :goto_a5

    :catchall_87
    move-exception p0

    goto :goto_a7

    :cond_89
    iget-object v5, p0, LX8/i$c;->t:Le9/e;

    invoke-virtual {v5}, Le9/e;->X0()J

    move-result-wide v5

    cmp-long v2, v5, v2

    if-nez v2, :cond_94

    move v7, v8

    :cond_94
    iget-object v2, p0, LX8/i$c;->t:Le9/e;

    iget-object v3, p0, LX8/i$c;->s:Le9/e;

    invoke-virtual {v2, v3}, Le9/e;->l1(Le9/B;)J

    if-eqz v7, :cond_a5

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_a5
    .catchall {:try_start_7d .. :try_end_a5} :catchall_87

    :cond_a5
    :goto_a5
    monitor-exit v4

    goto :goto_3a

    :goto_a7
    monitor-exit v4

    throw p0

    :cond_a9
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :catchall_af
    move-exception p0

    monitor-exit v4

    throw p0

    :cond_b2
    invoke-direct {p0, p2, p3}, LX8/i$c;->u(J)V

    return-void
.end method

.method public final g(Z)V
    .registers 2

    iput-boolean p1, p0, LX8/i$c;->r:Z

    return-void
.end method

.method public final j(LP8/u;)V
    .registers 2

    iput-object p1, p0, LX8/i$c;->u:LP8/u;

    return-void
.end method
