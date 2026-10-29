.class public final synthetic Lcom/nothing/cardwidget/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

.field public final synthetic r:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/a;->q:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    iput-object p2, p0, Lcom/nothing/cardwidget/utils/a;->r:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/utils/a;->q:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/a;->r:Landroid/os/Bundle;

    invoke-static {v0, p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->c(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;Landroid/os/Bundle;)V

    return-void
.end method
