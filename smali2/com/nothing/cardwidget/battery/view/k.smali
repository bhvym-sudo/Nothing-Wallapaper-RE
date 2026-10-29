.class public final synthetic Lcom/nothing/cardwidget/battery/view/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/k;->q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/k;->q:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->e(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method
