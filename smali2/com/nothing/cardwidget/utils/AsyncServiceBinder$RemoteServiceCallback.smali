.class final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;
.super Lcom/nothing/cardwidget/IRemoteServiceCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RemoteServiceCallback"
.end annotation


# instance fields
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
.method public constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 3

    const-string v0, "serviceBinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/IRemoteServiceCallback$Stub;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;->weakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onChanged(Landroid/os/Bundle;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$RemoteServiceCallback;->weakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    if-eqz p0, :cond_d

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->receiveRemoteData(Landroid/os/Bundle;)V
    invoke-static {p0, p1}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$receiveRemoteData(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V

    :cond_d
    return-void
.end method
