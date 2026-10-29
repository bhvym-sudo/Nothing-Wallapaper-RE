.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;-><init>(Landroid/content/Context;Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final weakSelf:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/nothing/cardwidget/utils/AsyncServiceBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;->weakSelf:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public binderDied()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$deathRecipient$1;->weakSelf:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    if-eqz p0, :cond_d

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->retryConnectService()V
    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$retryConnectService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    :cond_d
    return-void
.end method
