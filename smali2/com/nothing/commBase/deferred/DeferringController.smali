.class public final Lcom/nothing/commBase/deferred/DeferringController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/commBase/deferred/IDeferring;


# instance fields
.field private beginDeferTime:J

.field private deferredRunnable:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private maxDeferTime:J


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->maxDeferTime:J

    return-void
.end method

.method private final executeAndClearDeferringList()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->deferredRunnable:Ljava/util/Set;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/nothing/commBase/deferred/DeferringController;->deferredRunnable:Ljava/util/Set;

    if-eqz v0, :cond_1d

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_d

    :cond_1d
    return-void
.end method


# virtual methods
.method public beginDeferring(J)V
    .registers 5

    iput-wide p1, p0, Lcom/nothing/commBase/deferred/DeferringController;->maxDeferTime:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->beginDeferTime:J

    return-void
.end method

.method public endDeferring()V
    .registers 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->beginDeferTime:J

    invoke-direct {p0}, Lcom/nothing/commBase/deferred/DeferringController;->executeAndClearDeferringList()V

    return-void
.end method

.method public isDeferring()Z
    .registers 5

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/nothing/commBase/deferred/DeferringController;->beginDeferTime:J

    cmp-long p0, v0, v2

    if-gez p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public declared-synchronized removeDeferringCallback(Ljava/lang/Runnable;)Z
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->deferredRunnable:Ljava/util/Set;

    if-eqz v0, :cond_11

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1
    :try_end_e
    .catchall {:try_start_1 .. :try_end_e} :catchall_f

    goto :goto_12

    :catchall_f
    move-exception p1

    goto :goto_14

    :cond_11
    const/4 p1, 0x0

    :goto_12
    monitor-exit p0

    return p1

    :goto_14
    :try_start_14
    monitor-exit p0
    :try_end_15
    .catchall {:try_start_14 .. :try_end_15} :catchall_f

    throw p1
.end method

.method public declared-synchronized runOnDeferringEnd(Ljava/lang/Runnable;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/commBase/deferred/DeferringController;->isDeferring()Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->deferredRunnable:Ljava/util/Set;

    if-nez v0, :cond_1a

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->deferredRunnable:Ljava/util/Set;

    goto :goto_1a

    :catchall_18
    move-exception p1

    goto :goto_27

    :cond_1a
    :goto_1a
    iget-object v0, p0, Lcom/nothing/commBase/deferred/DeferringController;->deferredRunnable:Ljava/util/Set;

    if-eqz v0, :cond_25

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_22
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_25
    .catchall {:try_start_1 .. :try_end_25} :catchall_18

    :cond_25
    :goto_25
    monitor-exit p0

    return-void

    :goto_27
    :try_start_27
    monitor-exit p0
    :try_end_28
    .catchall {:try_start_27 .. :try_end_28} :catchall_18

    throw p1
.end method
