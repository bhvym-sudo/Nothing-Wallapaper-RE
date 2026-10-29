.class public final synthetic Lcom/nothing/cardwidget/battery/view/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/j;->q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/j;->q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->X(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Landroid/view/View;)V

    return-void
.end method
