.class public final synthetic Lcom/nothing/cardwidget/battery/view/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/m;->q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/m;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/m;->q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/m;->r:Ljava/lang/String;

    invoke-static {v0, p0, p1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->Z(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
