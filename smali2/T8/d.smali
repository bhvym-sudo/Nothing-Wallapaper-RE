.class public final LT8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT8/e;

.field private final b:Ljava/lang/String;

.field private c:Z

.field private d:LT8/a;

.field private final e:Ljava/util/List;

.field private f:Z


# direct methods
.method public constructor <init>(LT8/e;Ljava/lang/String;)V
    .registers 4

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT8/d;->a:LT8/e;

    iput-object p2, p0, LT8/d;->b:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LT8/d;->e:Ljava/util/List;

    return-void
.end method

.method public static synthetic j(LT8/d;LT8/a;JILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_6

    const-wide/16 p2, 0x0

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, LT8/d;->i(LT8/a;J)V

    return-void
.end method


# virtual methods
.method public final a()V
    .registers 4

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance v0, Ljava/lang/AssertionError;

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

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_32
    :goto_32
    iget-object v0, p0, LT8/d;->a:LT8/e;

    monitor-enter v0

    :try_start_35
    invoke-virtual {p0}, LT8/d;->b()Z

    move-result v1

    if-eqz v1, :cond_43

    iget-object v1, p0, LT8/d;->a:LT8/e;

    invoke-virtual {v1, p0}, LT8/e;->h(LT8/d;)V

    goto :goto_43

    :catchall_41
    move-exception p0

    goto :goto_47

    :cond_43
    :goto_43
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_45
    .catchall {:try_start_35 .. :try_end_45} :catchall_41

    monitor-exit v0

    return-void

    :goto_47
    monitor-exit v0

    throw p0
.end method

.method public final b()Z
    .registers 6

    iget-object v0, p0, LT8/d;->d:LT8/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_10

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LT8/a;->a()Z

    move-result v0

    if-eqz v0, :cond_10

    iput-boolean v1, p0, LT8/d;->f:Z

    :cond_10
    iget-object v0, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_18
    const/4 v3, -0x1

    if-ge v3, v0, :cond_4d

    iget-object v3, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT8/a;

    invoke-virtual {v3}, LT8/a;->a()Z

    move-result v3

    if-eqz v3, :cond_4a

    iget-object v2, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LT8/a;

    sget-object v3, LT8/e;->h:LT8/e$b;

    invoke-virtual {v3}, LT8/e$b;->a()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_44

    const-string v3, "canceled"

    invoke-static {v2, p0, v3}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    :cond_44
    iget-object v2, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v2, v1

    :cond_4a
    add-int/lit8 v0, v0, -0x1

    goto :goto_18

    :cond_4d
    return v2
.end method

.method public final c()LT8/a;
    .registers 1

    iget-object p0, p0, LT8/d;->d:LT8/a;

    return-object p0
.end method

.method public final d()Z
    .registers 1

    iget-boolean p0, p0, LT8/d;->f:Z

    return p0
.end method

.method public final e()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LT8/d;->e:Ljava/util/List;

    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LT8/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final g()Z
    .registers 1

    iget-boolean p0, p0, LT8/d;->c:Z

    return p0
.end method

.method public final h()LT8/e;
    .registers 1

    iget-object p0, p0, LT8/d;->a:LT8/e;

    return-object p0
.end method

.method public final i(LT8/a;J)V
    .registers 6

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT8/d;->a:LT8/e;

    monitor-enter v0

    :try_start_8
    iget-boolean v1, p0, LT8/d;->c:Z

    if-eqz v1, :cond_43

    invoke-virtual {p1}, LT8/a;->a()Z

    move-result p2

    if-eqz p2, :cond_2a

    sget-object p2, LT8/e;->h:LT8/e$b;

    invoke-virtual {p2}, LT8/e$b;->a()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_28

    const-string p2, "schedule canceled (queue is shutdown)"

    invoke-static {p1, p0, p2}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V
    :try_end_25
    .catchall {:try_start_8 .. :try_end_25} :catchall_26

    goto :goto_28

    :catchall_26
    move-exception p0

    goto :goto_53

    :cond_28
    :goto_28
    monitor-exit v0

    return-void

    :cond_2a
    :try_start_2a
    sget-object p2, LT8/e;->h:LT8/e$b;

    invoke-virtual {p2}, LT8/e$b;->a()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_3d

    const-string p2, "schedule failed (queue is shutdown)"

    invoke-static {p1, p0, p2}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    :cond_3d
    new-instance p0, Ljava/util/concurrent/RejectedExecutionException;

    invoke-direct {p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    throw p0

    :cond_43
    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, LT8/d;->k(LT8/a;JZ)Z

    move-result p1

    if-eqz p1, :cond_4f

    iget-object p1, p0, LT8/d;->a:LT8/e;

    invoke-virtual {p1, p0}, LT8/e;->h(LT8/d;)V

    :cond_4f
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_51
    .catchall {:try_start_2a .. :try_end_51} :catchall_26

    monitor-exit v0

    return-void

    :goto_53
    monitor-exit v0

    throw p0
.end method

.method public final k(LT8/a;JZ)Z
    .registers 14

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LT8/a;->e(LT8/d;)V

    iget-object v0, p0, LT8/d;->a:LT8/e;

    invoke-virtual {v0}, LT8/e;->g()LT8/e$a;

    move-result-object v0

    invoke-interface {v0}, LT8/e$a;->c()J

    move-result-wide v0

    add-long v2, v0, p2

    iget-object v4, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-eq v4, v6, :cond_3f

    invoke-virtual {p1}, LT8/a;->c()J

    move-result-wide v7

    cmp-long v7, v7, v2

    if-gtz v7, :cond_3a

    sget-object p2, LT8/e;->h:LT8/e$b;

    invoke-virtual {p2}, LT8/e$b;->a()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_39

    const-string p2, "already scheduled"

    invoke-static {p1, p0, p2}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    :cond_39
    return v5

    :cond_3a
    iget-object v7, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_3f
    invoke-virtual {p1, v2, v3}, LT8/a;->g(J)V

    sget-object v4, LT8/e;->h:LT8/e$b;

    invoke-virtual {v4}, LT8/e$b;->a()Ljava/util/logging/Logger;

    move-result-object v4

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_82

    if-eqz p4, :cond_69

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "run again after "

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, LT8/b;->b(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    goto :goto_7f

    :cond_69
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "scheduled after "

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, LT8/b;->b(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_7f
    invoke-static {p1, p0, p4}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    :cond_82
    iget-object p4, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move v2, v5

    :goto_89
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT8/a;

    invoke-virtual {v3}, LT8/a;->c()J

    move-result-wide v3

    sub-long/2addr v3, v0

    cmp-long v3, v3, p2

    if-lez v3, :cond_9f

    goto :goto_a3

    :cond_9f
    add-int/lit8 v2, v2, 0x1

    goto :goto_89

    :cond_a2
    move v2, v6

    :goto_a3
    if-ne v2, v6, :cond_ab

    iget-object p2, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    :cond_ab
    iget-object p0, p0, LT8/d;->e:Ljava/util/List;

    invoke-interface {p0, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    if-nez v2, :cond_b4

    const/4 p0, 0x1

    return p0

    :cond_b4
    return v5
.end method

.method public final l(LT8/a;)V
    .registers 2

    iput-object p1, p0, LT8/d;->d:LT8/a;

    return-void
.end method

.method public final m(Z)V
    .registers 2

    iput-boolean p1, p0, LT8/d;->f:Z

    return-void
.end method

.method public final n()V
    .registers 4

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance v0, Ljava/lang/AssertionError;

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

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_32
    :goto_32
    iget-object v0, p0, LT8/d;->a:LT8/e;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_36
    iput-boolean v1, p0, LT8/d;->c:Z

    invoke-virtual {p0}, LT8/d;->b()Z

    move-result v1

    if-eqz v1, :cond_46

    iget-object v1, p0, LT8/d;->a:LT8/e;

    invoke-virtual {v1, p0}, LT8/e;->h(LT8/d;)V

    goto :goto_46

    :catchall_44
    move-exception p0

    goto :goto_4a

    :cond_46
    :goto_46
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_48
    .catchall {:try_start_36 .. :try_end_48} :catchall_44

    monitor-exit v0

    return-void

    :goto_4a
    monitor-exit v0

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LT8/d;->b:Ljava/lang/String;

    return-object p0
.end method
