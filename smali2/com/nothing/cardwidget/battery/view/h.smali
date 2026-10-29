.class public final synthetic Lcom/nothing/cardwidget/battery/view/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Lcom/nothing/cardwidget/battery/view/BatteryContainerView;

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Ljava/lang/String;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/h;->q:Landroid/view/View;

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/h;->r:Lcom/nothing/cardwidget/battery/view/BatteryContainerView;

    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/h;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/h;->q:Landroid/view/View;

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/h;->r:Lcom/nothing/cardwidget/battery/view/BatteryContainerView;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/h;->s:Ljava/lang/String;

    invoke-static {v0, v1, p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->Y(Landroid/view/View;Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
