.class public final LT8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT8/e$a;,
        LT8/e$b;,
        LT8/e$c;
    }
.end annotation


# static fields
.field public static final h:LT8/e$b;

.field public static final i:LT8/e;

.field private static final j:Ljava/util/logging/Logger;


# instance fields
.field private final a:LT8/e$a;

.field private b:I

.field private c:Z

.field private d:J

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, LT8/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT8/e$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LT8/e;->h:LT8/e$b;

    new-instance v0, LT8/e;

    new-instance v1, LT8/e$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, LQ8/d;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " TaskRunner"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, LQ8/d;->M(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v2

    invoke-direct {v1, v2}, LT8/e$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v0, v1}, LT8/e;-><init>(LT8/e$a;)V

    sput-object v0, LT8/e;->i:LT8/e;

    const-class v0, LT8/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(TaskRunner::class.java.name)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LT8/e;->j:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(LT8/e$a;)V
    .registers 3

    const-string v0, "backend"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT8/e;->a:LT8/e$a;

    const/16 p1, 0x2710

    iput p1, p0, LT8/e;->b:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LT8/e;->e:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LT8/e;->f:Ljava/util/List;

    new-instance p1, LT8/e$d;

    invoke-direct {p1, p0}, LT8/e$d;-><init>(LT8/e;)V

    iput-object p1, p0, LT8/e;->g:Ljava/lang/Runnable;

    return-void
.end method

.method public static final synthetic a()Ljava/util/logging/Logger;
    .registers 1

    sget-object v0, LT8/e;->j:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static final synthetic b(LT8/e;LT8/a;)V
    .registers 2

    invoke-direct {p0, p1}, LT8/e;->j(LT8/a;)V

    return-void
.end method

.method private final c(LT8/a;J)V
    .registers 8

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    invoke-virtual {p1}, LT8/a;->d()LT8/d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LT8/d;->c()LT8/a;

    move-result-object v1

    if-ne v1, p1, :cond_74

    invoke-virtual {v0}, LT8/d;->d()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LT8/d;->m(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LT8/d;->l(LT8/a;)V

    iget-object v2, p0, LT8/e;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-wide/16 v2, -0x1

    cmp-long v2, p2, v2

    if-eqz v2, :cond_62

    if-nez v1, :cond_62

    invoke-virtual {v0}, LT8/d;->g()Z

    move-result v1

    if-nez v1, :cond_62

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, LT8/d;->k(LT8/a;JZ)Z

    :cond_62
    invoke-virtual {v0}, LT8/d;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_73

    iget-object p0, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_73
    return-void

    :cond_74
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final e(LT8/a;)V
    .registers 4

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, LT8/a;->g(J)V

    invoke-virtual {p1}, LT8/a;->d()LT8/d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LT8/d;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, LT8/d;->l(LT8/a;)V

    iget-object p0, p0, LT8/e;->e:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final j(LT8/a;)V
    .registers 7

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LT8/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_41
    invoke-virtual {p1}, LT8/a;->f()J

    move-result-wide v2
    :try_end_45
    .catchall {:try_start_41 .. :try_end_45} :catchall_53

    monitor-enter p0

    :try_start_46
    invoke-direct {p0, p1, v2, v3}, LT8/e;->c(LT8/a;J)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_4b
    .catchall {:try_start_46 .. :try_end_4b} :catchall_50

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :catchall_50
    move-exception p1

    monitor-exit p0

    throw p1

    :catchall_53
    move-exception v2

    monitor-enter p0

    const-wide/16 v3, -0x1

    :try_start_57
    invoke-direct {p0, p1, v3, v4}, LT8/e;->c(LT8/a;J)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_5c
    .catchall {:try_start_57 .. :try_end_5c} :catchall_61

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v2

    :catchall_61
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final d()LT8/a;
    .registers 15

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

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

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_32
    :goto_32
    iget-object v0, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3c

    return-object v1

    :cond_3c
    iget-object v0, p0, LT8/e;->a:LT8/e$a;

    invoke-interface {v0}, LT8/e$a;->c()J

    move-result-wide v2

    iget-object v0, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v4, 0x7fffffffffffffffL

    move-object v6, v1

    :goto_4e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v7, :cond_80

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LT8/d;

    invoke-virtual {v7}, LT8/d;->e()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LT8/a;

    invoke-virtual {v7}, LT8/a;->c()J

    move-result-wide v10

    sub-long/2addr v10, v2

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    cmp-long v12, v10, v12

    if-lez v12, :cond_7a

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    goto :goto_4e

    :cond_7a
    if-eqz v6, :cond_7e

    move v0, v8

    goto :goto_81

    :cond_7e
    move-object v6, v7

    goto :goto_4e

    :cond_80
    move v0, v9

    :goto_81
    if-eqz v6, :cond_9e

    invoke-direct {p0, v6}, LT8/e;->e(LT8/a;)V

    if-nez v0, :cond_96

    iget-boolean v0, p0, LT8/e;->c:Z

    if-nez v0, :cond_9d

    iget-object v0, p0, LT8/e;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9d

    :cond_96
    iget-object v0, p0, LT8/e;->a:LT8/e$a;

    iget-object p0, p0, LT8/e;->g:Ljava/lang/Runnable;

    invoke-interface {v0, p0}, LT8/e$a;->execute(Ljava/lang/Runnable;)V

    :cond_9d
    return-object v6

    :cond_9e
    iget-boolean v0, p0, LT8/e;->c:Z

    if-eqz v0, :cond_af

    iget-wide v6, p0, LT8/e;->d:J

    sub-long/2addr v6, v2

    cmp-long v0, v4, v6

    if-gez v0, :cond_ae

    iget-object v0, p0, LT8/e;->a:LT8/e$a;

    invoke-interface {v0, p0}, LT8/e$a;->b(LT8/e;)V

    :cond_ae
    return-object v1

    :cond_af
    iput-boolean v8, p0, LT8/e;->c:Z

    add-long/2addr v2, v4

    iput-wide v2, p0, LT8/e;->d:J

    :try_start_b4
    iget-object v0, p0, LT8/e;->a:LT8/e$a;

    invoke-interface {v0, p0, v4, v5}, LT8/e$a;->a(LT8/e;J)V
    :try_end_b9
    .catch Ljava/lang/InterruptedException; {:try_start_b4 .. :try_end_b9} :catch_bf
    .catchall {:try_start_b4 .. :try_end_b9} :catchall_bd

    :goto_b9
    iput-boolean v9, p0, LT8/e;->c:Z

    goto/16 :goto_32

    :catchall_bd
    move-exception v0

    goto :goto_c3

    :catch_bf
    :try_start_bf
    invoke-virtual {p0}, LT8/e;->f()V
    :try_end_c2
    .catchall {:try_start_bf .. :try_end_c2} :catchall_bd

    goto :goto_b9

    :goto_c3
    iput-boolean v9, p0, LT8/e;->c:Z

    throw v0
.end method

.method public final f()V
    .registers 4

    iget-object v0, p0, LT8/e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    const/4 v1, -0x1

    if-ge v1, v0, :cond_19

    iget-object v1, p0, LT8/e;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT8/d;

    invoke-virtual {v1}, LT8/d;->b()Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_19
    iget-object v0, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_21
    if-ge v1, v0, :cond_40

    iget-object v2, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LT8/d;

    invoke-virtual {v2}, LT8/d;->b()Z

    invoke-virtual {v2}, LT8/d;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3d

    iget-object v2, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_3d
    add-int/lit8 v0, v0, -0x1

    goto :goto_21

    :cond_40
    return-void
.end method

.method public final g()LT8/e$a;
    .registers 1

    iget-object p0, p0, LT8/e;->a:LT8/e$a;

    return-object p0
.end method

.method public final h(LT8/d;)V
    .registers 4

    const-string v0, "taskQueue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_37

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_37

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_37
    :goto_37
    invoke-virtual {p1}, LT8/d;->c()LT8/a;

    move-result-object v0

    if-nez v0, :cond_54

    invoke-virtual {p1}, LT8/d;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4f

    iget-object v0, p0, LT8/e;->f:Ljava/util/List;

    invoke-static {v0, p1}, LQ8/d;->c(Ljava/util/List;Ljava/lang/Object;)V

    goto :goto_54

    :cond_4f
    iget-object v0, p0, LT8/e;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_54
    :goto_54
    iget-boolean p1, p0, LT8/e;->c:Z

    if-eqz p1, :cond_5e

    iget-object p1, p0, LT8/e;->a:LT8/e$a;

    invoke-interface {p1, p0}, LT8/e$a;->b(LT8/e;)V

    return-void

    :cond_5e
    iget-object p1, p0, LT8/e;->a:LT8/e$a;

    iget-object p0, p0, LT8/e;->g:Ljava/lang/Runnable;

    invoke-interface {p1, p0}, LT8/e$a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i()LT8/d;
    .registers 5

    monitor-enter p0

    :try_start_1
    iget v0, p0, LT8/e;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LT8/e;->b:I
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_1f

    monitor-exit p0

    new-instance v1, LT8/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x51

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, v0}, LT8/d;-><init>(LT8/e;Ljava/lang/String;)V

    return-object v1

    :catchall_1f
    move-exception v0

    monitor-exit p0

    throw v0
.end method
