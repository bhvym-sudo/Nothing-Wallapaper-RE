.class final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RetryConnectTask"
.end annotation


# instance fields
.field private final callbackHandler:Landroid/os/Handler;

.field private retryCount:I

.field private final weakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/nothing/cardwidget/utils/AsyncServiceBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Handler;)V
    .registers 4

    const-string v0, "serviceBinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->callbackHandler:Landroid/os/Handler;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->weakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final declared-synchronized beginRetry()V
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->callbackHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->callbackHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_b
    .catchall {:try_start_1 .. :try_end_b} :catchall_d

    monitor-exit p0

    return-void

    :catchall_d
    move-exception v0

    :try_start_e
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_e .. :try_end_f} :catchall_d

    throw v0
.end method

.method public final getCallbackHandler()Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->callbackHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public final release()V
    .registers 1

    invoke-virtual {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->stopRetry()V

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->weakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    return-void
.end method

.method public final declared-synchronized resetRetryCount()V
    .registers 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_2
    iput v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->retryCount:I
    :try_end_4
    .catchall {:try_start_2 .. :try_end_4} :catchall_6

    monitor-exit p0

    return-void

    :catchall_6
    move-exception v0

    :try_start_7
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_7 .. :try_end_8} :catchall_6

    throw v0
.end method

.method public run()V
    .registers 7

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->weakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    if-eqz v0, :cond_7b

    iget v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->retryCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->retryCount:I

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;
    invoke-static {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getBindPolicy$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    move-result-object v2

    invoke-interface {v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;->getReBindLimitCount()I

    move-result v2

    const-string v3, "AsyncServiceBinder"

    if-gt v1, v2, :cond_60

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;
    invoke-static {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getRemoteService$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/IRemoteService;

    move-result-object v1

    if-nez v1, :cond_49

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->callbackHandler:Landroid/os/Handler;

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;
    invoke-static {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getBindPolicy$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    move-result-object v2

    invoke-interface {v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;->getRebindInterval()J

    move-result-wide v4

    invoke-virtual {v1, p0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseAndRebindService()V
    invoke-static {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$releaseAndRebindService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    iget p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->retryCount:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Waiting service connected timeout, begin connect service again. Retry count = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_49
    iget p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->retryCount:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Service connected, quit retry, retryCount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_60
    iget p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->retryCount:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Always connect service fail, Retry count = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Check current bindClass."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7b
    return-void
.end method

.method public final declared-synchronized stopRetry()V
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->callbackHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception v0

    :try_start_9
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_9 .. :try_end_a} :catchall_8

    throw v0
.end method
