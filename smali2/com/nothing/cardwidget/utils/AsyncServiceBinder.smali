.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;,
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$Companion;,
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;,
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;,
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;,
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$Companion;

.field private static final TAG:Ljava/lang/String; = "AsyncServiceBinder"

.field private static final TASK_LOCK:Ljava/lang/Object;


# instance fields
.field private bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

.field private bindServiceTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

.field private final context:Landroid/content/Context;

.field private final deathRecipient:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;

.field private final isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mainHandler:Landroid/os/Handler;

.field private releaseAndBindTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

.field private final remoteCallback:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;

.field private volatile remoteService:Lcom/nothing/cardwidget/IRemoteService;

.field private remoteServiceIntent:Landroid/content/Intent;

.field private final retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

.field private final serviceConnection:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;

.field private serviceListener:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

.field private final taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

.field private unBindServiceTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->Companion:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$Companion;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->TASK_LOCK:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceListener:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

    new-instance p1, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->deathRecipient:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->mainHandler:Landroid/os/Handler;

    new-instance p2, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    invoke-direct {p2, p0, p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Handler;)V

    iput-object p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    new-instance p1, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteCallback:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$bindPolicy$1;

    invoke-direct {p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$bindPolicy$1;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    new-instance p1, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceConnection:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;

    return-void
.end method

.method public static synthetic a(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseService$lambda$1$innerUnbindService__proxy(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$bindService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Z
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindService()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getBindPolicy$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    return-object p0
.end method

.method public static final synthetic access$getDeathRecipient$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->deathRecipient:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;

    return-object p0
.end method

.method public static final synthetic access$getRemoteCallback$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteCallback:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;

    return-object p0
.end method

.method public static final synthetic access$getRemoteService$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/IRemoteService;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    return-object p0
.end method

.method public static final synthetic access$getRetryTask$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    return-object p0
.end method

.method public static final synthetic access$getTASK_LOCK$cp()Ljava/lang/Object;
    .registers 1

    sget-object v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->TASK_LOCK:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic access$getTaskTimeMark$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Ljava/util/concurrent/atomic/AtomicLong;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final synthetic access$innerUnbindService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->innerUnbindService()V

    return-void
.end method

.method public static final synthetic access$onServiceLose(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->onServiceLose()V

    return-void
.end method

.method public static final synthetic access$receiveRemoteData(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->receiveRemoteData(Landroid/os/Bundle;)V

    return-void
.end method

.method public static final synthetic access$releaseAndRebindService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseAndRebindService()V

    return-void
.end method

.method public static final synthetic access$retryConnectService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryConnectService()V

    return-void
.end method

.method public static final synthetic access$setRemoteService$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Lcom/nothing/cardwidget/IRemoteService;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    return-void
.end method

.method public static synthetic b(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->configService$lambda$0$bindServiceWithRetry__proxy(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final bindService()Z
    .registers 7

    new-instance v0, Lkotlin/jvm/internal/A;

    invoke-direct {v0}, Lkotlin/jvm/internal/A;-><init>()V

    :try_start_5
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteServiceIntent:Landroid/content/Intent;

    const/4 v2, 0x0

    if-eqz v1, :cond_21

    iget-object v3, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->context:Landroid/content/Context;

    iget-object v4, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceConnection:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;

    iget-object v5, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    invoke-interface {v5}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;->getBindFlags()I

    move-result v5

    invoke-virtual {v3, v1, v4, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_21

    move v2, v3

    goto :goto_21

    :catchall_1f
    move-exception v1

    goto :goto_29

    :cond_21
    :goto_21
    iput-boolean v2, v0, Lkotlin/jvm/internal/A;->q:Z

    sget-object v1, Lh8/A;->a:Lh8/A;

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_28
    .catchall {:try_start_5 .. :try_end_28} :catchall_1f

    goto :goto_32

    :goto_29
    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-static {v1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_32
    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v1, v0, Lkotlin/jvm/internal/A;->q:Z

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-boolean p0, v0, Lkotlin/jvm/internal/A;->q:Z

    return p0
.end method

.method private final bindServiceWithRetry()V
    .registers 2

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindService()Z

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->beginRetry()V

    :cond_10
    return-void
.end method

.method public static synthetic c(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->receiveRemoteData$lambda$8(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method private final cancelAllBindTasks()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindServiceTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->cancel()V

    :cond_7
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->unBindServiceTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->cancel()V

    :cond_e
    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseAndBindTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->cancel()V

    :cond_15
    return-void
.end method

.method private static final synthetic configService$lambda$0$bindServiceWithRetry__proxy(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindServiceWithRetry()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final innerUnbindService()V
    .registers 7

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    const-string v1, "AsyncServiceBinder"

    const/4 v2, 0x0

    if-eqz v0, :cond_6c

    const/4 v0, 0x0

    :try_start_8
    sget-object v3, Lh8/q;->r:Lh8/q$a;

    iget-object v3, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    if-eqz v3, :cond_1b

    iget-object v4, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteCallback:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;

    invoke-interface {v3, v4}, Lcom/nothing/cardwidget/IRemoteService;->stopListening(Lcom/nothing/cardwidget/IRemoteServiceCallback;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_1c

    :catchall_19
    move-exception v3

    goto :goto_20

    :cond_1b
    move-object v3, v0

    :goto_1c
    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1f
    .catchall {:try_start_8 .. :try_end_1f} :catchall_19

    goto :goto_29

    :goto_20
    sget-object v4, Lh8/q;->r:Lh8/q$a;

    invoke-static {v3}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_29
    :try_start_29
    iget-object v3, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    if-eqz v3, :cond_40

    invoke-interface {v3}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v3

    if-eqz v3, :cond_40

    iget-object v4, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->deathRecipient:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;

    invoke-interface {v3, v4, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_41

    :catchall_3e
    move-exception v3

    goto :goto_46

    :cond_40
    move-object v3, v0

    :goto_41
    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_45
    .catchall {:try_start_29 .. :try_end_45} :catchall_3e

    goto :goto_50

    :goto_46
    sget-object v4, Lh8/q;->r:Lh8/q$a;

    invoke-static {v3}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :goto_50
    invoke-static {v3}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_6a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "unlinkToDeath error: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6a
    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    :cond_6c
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_80

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceConnection:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;

    invoke-virtual {v0, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_80
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "innerUnbindService called this = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final onServiceLose()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceListener:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;->onServiceUnbind()V

    :cond_10
    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryConnectService()V

    return-void
.end method

.method private final receiveRemoteData(Landroid/os/Bundle;)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/nothing/cardwidget/utils/a;

    invoke-direct {v1, p0, p1}, Lcom/nothing/cardwidget/utils/a;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final receiveRemoteData$lambda$8(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceListener:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

    if-eqz p0, :cond_c

    invoke-interface {p0, p1}, Lcom/nothing/cardwidget/IRemoteServiceCallback;->onChanged(Landroid/os/Bundle;)V

    :cond_c
    return-void
.end method

.method private final releaseAndRebindService()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->cancelAllBindTasks()V

    new-instance v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;J)V

    new-instance v1, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->begin(Ljava/util/function/Supplier;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseAndBindTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteServiceIntent:Landroid/content/Intent;

    if-eqz p0, :cond_2a

    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    goto :goto_2b

    :cond_2a
    const/4 p0, 0x0

    :goto_2b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release and bind service for = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AsyncServiceBinder"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final synthetic releaseService$lambda$1$innerUnbindService__proxy(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->innerUnbindService()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final retryConnectService()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    invoke-interface {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;->isAutoReBind()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->beginRetry()V

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->resetRetryCount()V

    :cond_12
    return-void
.end method


# virtual methods
.method public final configService(Landroid/content/Intent;)V
    .registers 5

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_56

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteServiceIntent:Landroid/content/Intent;

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->cancelAllBindTasks()V

    new-instance v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;J)V

    new-instance v1, Lcom/nothing/cardwidget/utils/c;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/utils/c;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->begin(Ljava/util/function/Supplier;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindServiceTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Config remote service with intent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " this = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "AsyncServiceBinder"

    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_56
    return-void
.end method

.method public final getContext()Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public final getServiceListener()Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceListener:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

    return-object p0
.end method

.method public final isServiceAlive()Z
    .registers 3

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    const/4 v0, 0x0

    if-eqz p0, :cond_13

    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p0

    if-eqz p0, :cond_13

    invoke-interface {p0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_13

    return v1

    :cond_13
    return v0
.end method

.method public final makeSureAlive()Z
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteServiceIntent:Landroid/content/Intent;

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isServiceAlive()Z

    move-result v0

    if-nez v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_12

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseAndRebindService()V

    :cond_12
    return v0
.end method

.method public final releaseService()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->release()V

    invoke-direct {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->cancelAllBindTasks()V

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->isBound:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_14

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;

    if-eqz v0, :cond_32

    :cond_14
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    new-instance v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    iget-object v1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->taskTimeMark:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;J)V

    new-instance v1, Lcom/nothing/cardwidget/utils/b;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/utils/b;-><init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;->begin(Ljava/util/function/Supplier;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->unBindServiceTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$CancelAbleBindTask;

    :cond_32
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteServiceIntent:Landroid/content/Intent;

    if-eqz v0, :cond_3b

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_3c

    :cond_3b
    const/4 v0, 0x0

    :goto_3c
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Release remote service for = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " this = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AsyncServiceBinder"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final setBindPolicy(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)V
    .registers 3

    const-string v0, "bindPolicy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindPolicy:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;

    return-void
.end method

.method public final setServiceListener(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->serviceListener:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

    return-void
.end method
