.class public final Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $new:LM5/a;

.field final synthetic $this_crossFadeAnimation:Lcom/nothing/cardwidget/battery/view/BatteryCellView;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;->$this_crossFadeAnimation:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;->$new:LM5/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;->$this_crossFadeAnimation:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;->$new:LM5/a;

    invoke-virtual {p1, p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    return-void
.end method
