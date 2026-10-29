.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->releaseAndRebindService()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/function/Supplier<",
        "Lh8/A;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;->get()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public get()V
    .registers 3

    .line 2
    const-string v0, "AsyncServiceBinder"

    const-string v1, "releaseAndRebindService begin."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->innerUnbindService()V
    invoke-static {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$innerUnbindService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V

    .line 4
    iget-object p0, p0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$releaseAndRebindService$1$1;->this$0:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    # invokes: Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->bindService()Z
    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->access$bindService(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Z

    return-void
.end method
