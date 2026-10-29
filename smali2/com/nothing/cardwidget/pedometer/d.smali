.class public final synthetic Lcom/nothing/cardwidget/pedometer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

.field public final synthetic b:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/d;->a:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    iput-object p2, p0, Lcom/nothing/cardwidget/pedometer/d;->b:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/d;->a:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/d;->b:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-static {v0, p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->d(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/animation/ValueAnimator;)V

    return-void
.end method
