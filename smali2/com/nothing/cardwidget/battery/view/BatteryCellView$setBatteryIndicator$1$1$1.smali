.class public final Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryIndicator(Landroid/widget/ImageView;LM5/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    # getter for: Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;
    invoke-static {p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->access$getBatteryIndicatorIv$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_11

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_11
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    # getter for: Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;
    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->access$getBatteryDeviceIv$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/widget/ImageView;

    move-result-object p0

    if-eqz p0, :cond_1e

    const/high16 p1, -0x3e500000    # -22.0f

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_1e
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;->this$0:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    # getter for: Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;
    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->access$getBatteryIndicatorIv$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/widget/ImageView;

    move-result-object p0

    if-eqz p0, :cond_11

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_11
    return-void
.end method
