.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;-><init>(Landroid/content/Context;Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBindingDied(Landroid/content/ComponentName;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->onServiceLose()V
    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$onServiceLose(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    const-string p0, "AsyncServiceBinder"

    const-string p1, "on remote service view bind failure because of binding died."

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onNullBinding(Landroid/content/ComponentName;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->onServiceLose()V
    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$onServiceLose(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    const-string p0, "AsyncServiceBinder"

    const-string p1, "on remote service view bind failure because of null binding."

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryTask:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;
    invoke-static {p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getRetryTask$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RetryConnectTask;->stopRetry()V

    iget-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    :try_start_15
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->deathRecipient:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;
    invoke-static {p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getDeathRecipient$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_25
    .catchall {:try_start_15 .. :try_end_25} :catchall_26

    goto :goto_31

    :catchall_26
    move-exception p1

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_31
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-static {p1}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "AsyncServiceBinder"

    if-eqz p1, :cond_44

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryConnectService()V
    invoke-static {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$retryConnectService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    const-string p0, "Lint to remote service to death error."

    invoke-static {v1, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_44
    iget-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-static {p2}, Lcom/nothing/cardwidget/IRemoteService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/nothing/cardwidget/IRemoteService;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$setRemoteService$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Lcom/nothing/cardwidget/IRemoteService;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;
    invoke-static {p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getRemoteService$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/IRemoteService;

    move-result-object p1

    if-eqz p1, :cond_68

    iget-object p2, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-virtual {p2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->getServiceListener()Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;

    move-result-object v0

    if-eqz v0, :cond_60

    invoke-interface {v0, p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;->onServiceBind(Lcom/nothing/cardwidget/IRemoteService;)V

    :cond_60
    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteCallback:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;
    invoke-static {p2}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getRemoteCallback$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/nothing/cardwidget/IRemoteService;->startListening(Lcom/nothing/cardwidget/IRemoteServiceCallback;)Z

    goto :goto_6d

    :cond_68
    iget-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryConnectService()V
    invoke-static {p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$retryConnectService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    :goto_6d
    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # getter for: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->remoteService:Lcom/nothing/cardwidget/IRemoteService;
    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$getRemoteService$p(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lcom/nothing/cardwidget/IRemoteService;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "on remote service view connected, remoteService = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$serviceConnection$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->onServiceLose()V
    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$onServiceLose(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    const-string p0, "AsyncServiceBinder"

    const-string p1, "on remote service view disconnected."

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
