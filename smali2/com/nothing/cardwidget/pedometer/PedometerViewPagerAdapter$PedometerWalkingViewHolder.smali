.class public final Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PedometerWalkingViewHolder"
.end annotation


# instance fields
.field private bgAnimator:Landroid/animation/ValueAnimator;

.field private handler:Landroid/os/Handler;

.field private humanAnimator:Landroid/animation/ValueAnimator;

.field private humanView:Landroid/widget/ImageView;

.field private isRtl:Z

.field private leftGap:F

.field final synthetic this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

.field private todayPercent:Landroid/widget/TextView;

.field private walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

.field private walkingRange:F


# direct methods
.method public constructor <init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/view/View;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    sget v0, Lcom/nothing/cardwidget/R$id;->walking_bg_view:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    iput-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    sget v0, Lcom/nothing/cardwidget/R$id;->human_view:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->tv_today_percent:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->handler:Landroid/os/Handler;

    const/16 p2, 0x18

    int-to-float p2, p2

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->widthRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getWidthRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result v0

    mul-float/2addr p2, v0

    float-to-int p2, p2

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput p2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    const/16 v2, 0x22

    int-to-float v2, v2

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->heightRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getHeightRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result v3

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getBgHuman()Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    if-eqz v0, :cond_71

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_71
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getLeftCircleColor()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0x10

    int-to-float v2, v2

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->heightRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getHeightRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result v3

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x4

    int-to-float v1, v1

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->heightRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getHeightRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getLeftCircleColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getRightDotColor()I

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;->init(III)V

    const/16 v0, 0x8

    int-to-float v0, v0

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->widthRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getWidthRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result v1

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->leftGap:F

    const/16 v0, 0x9c

    int-to-float v0, v0

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->widthRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getWidthRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result p1

    mul-float/2addr v0, p1

    int-to-float p1, p2

    sub-float/2addr v0, p1

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingRange:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->setHumanProgress(F)V

    return-void
.end method

.method private static final bindData$lambda$5$lambda$4(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/nothing/cardwidget/pedometer/UtilsKt;->isRtl(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->isRtl:Z

    if-eqz v0, :cond_25

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setRotationY(F)V

    :cond_25
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    iget-boolean v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->isRtl:Z

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;->refreshRtl(Z)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->update()V

    return-void
.end method

.method public static synthetic d(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->updateBeforeComplete$lambda$14$lambda$11$lambda$10(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bindData$lambda$5$lambda$4(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V

    return-void
.end method

.method public static synthetic f(Landroid/graphics/drawable/AnimationDrawable;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->startWalking$lambda$15(Landroid/graphics/drawable/AnimationDrawable;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V

    return-void
.end method

.method public static synthetic g(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->updateBeforeComplete$lambda$14$lambda$13$lambda$12(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final setHumanProgress(F)V
    .registers 3

    iget v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingRange:F

    mul-float/2addr v0, p1

    const/16 p1, 0x64

    int-to-float p1, p1

    div-float/2addr v0, p1

    iget p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->leftGap:F

    add-float/2addr v0, p1

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    iget-boolean p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->isRtl:Z

    if-eqz p0, :cond_11

    neg-float v0, v0

    :cond_11
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method private final startWalking()V
    .registers 6

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->isAod()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"

    if-eqz v0, :cond_1d

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/DrawableContainer;->selectDrawable(I)Z

    return-void

    :cond_1d
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v2

    if-nez v2, :cond_31

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    :cond_31
    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->handler:Landroid/os/Handler;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "startWalking "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "PedometerAdapter"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/nothing/cardwidget/pedometer/c;

    invoke-direct {v2, v0, p0}, Lcom/nothing/cardwidget/pedometer/c;-><init>(Landroid/graphics/drawable/AnimationDrawable;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V

    const-wide/16 v3, 0x13ba

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final startWalking$lambda$15(Landroid/graphics/drawable/AnimationDrawable;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V
    .registers 4

    const-string v0, "$animDrawable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/DrawableContainer;->selectDrawable(I)Z

    iget-object p1, p1, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->handler:Landroid/os/Handler;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopWalking "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "PedometerAdapter"

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final update()V
    .registers 6

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getWalkingData()Lcom/nothing/cardwidget/pedometer/WalkingData;

    move-result-object v0

    if-eqz v0, :cond_66

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->isJustWalking()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->isAnimateValid()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->startWalking()V

    :cond_19
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setJustWalking(Z)V

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result v3

    const/16 v4, 0x64

    if-lt v3, v4, :cond_42

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bgAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_2c

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_2c
    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanAnimator:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_33

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_33
    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->updateAfterComplete(I)V

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setCurrentProgress(I)V

    return-void

    :cond_42
    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getRefreshProgress()Z

    move-result v3

    if-eqz v3, :cond_66

    invoke-virtual {v0, v2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setRefreshProgress(Z)V

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getCurrentProgress()I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x5

    if-lt v2, v3, :cond_62

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->isAod()Z

    move-result v1

    if-nez v1, :cond_62

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getCurrentProgress()I

    move-result v0

    goto :goto_63

    :cond_62
    const/4 v0, -0x1

    :goto_63
    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->updateBeforeComplete(I)V

    :cond_66
    return-void
.end method

.method private final updateAfterComplete(I)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0x64

    if-le p1, v0, :cond_36

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    const/16 v0, -0x15

    int-to-float v0, v0

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->heightRatio:F
    invoke-static {v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->access$getHeightRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_43

    :cond_36
    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :goto_43
    const/high16 p1, 0x42480000    # 50.0f

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->setHumanProgress(F)V

    return-void
.end method

.method private final updateBeforeComplete(I)V
    .registers 9

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getWalkingData()Lcom/nothing/cardwidget/pedometer/WalkingData;

    move-result-object v1

    if-eqz v1, :cond_b6

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_17

    goto :goto_1c

    :cond_17
    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanView:Landroid/widget/ImageView;

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationY(F)V

    :goto_1c
    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->todayPercent:Landroid/widget/TextView;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    if-gez p1, :cond_50

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bgAnimator:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_30

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_30
    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanAnimator:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_37

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_37
    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result p1

    int-to-float p1, p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->setHumanProgress(F)V

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;->setProgress(I)V

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result p0

    invoke-virtual {v1, p0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setCurrentProgress(I)V

    return-void

    :cond_50
    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bgAnimator:Landroid/animation/ValueAnimator;

    if-eqz v3, :cond_5f

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v4

    if-eqz v4, :cond_5b

    goto :goto_5c

    :cond_5b
    const/4 v3, 0x0

    :goto_5c
    if-eqz v3, :cond_5f

    return-void

    :cond_5f
    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result v3

    filled-new-array {p1, v3}, [I

    move-result-object v3

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v3

    iput-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bgAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v4, 0x13ba

    if-eqz v3, :cond_87

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v6, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v6, Lcom/nothing/cardwidget/pedometer/d;

    invoke-direct {v6, p0, v2}, Lcom/nothing/cardwidget/pedometer/d;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)V

    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    :cond_87
    int-to-float p1, p1

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x2

    new-array v2, v2, [F

    aput p1, v2, v0

    const/4 p1, 0x1

    aput v1, v2, p1

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->humanAnimator:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_b3

    invoke-virtual {p1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, Lcom/nothing/cardwidget/pedometer/e;

    invoke-direct {v0, p0}, Lcom/nothing/cardwidget/pedometer/e;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_b3
    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->startWalking()V

    :cond_b6
    return-void
.end method

.method static synthetic updateBeforeComplete$default(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;IILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, -0x1

    :cond_5
    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->updateBeforeComplete(I)V

    return-void
.end method

.method private static final updateBeforeComplete$lambda$14$lambda$11$lambda$10(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {p0, p2}, Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;->setProgress(I)V

    invoke-virtual {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getWalkingData()Lcom/nothing/cardwidget/pedometer/WalkingData;

    move-result-object p0

    if-eqz p0, :cond_2c

    invoke-virtual {p0, p2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setCurrentProgress(I)V

    :cond_2c
    return-void
.end method

.method private static final updateBeforeComplete$lambda$14$lambda$13$lambda$12(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->setHumanProgress(F)V

    return-void
.end method


# virtual methods
.method public final bindData()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getWalkingData()Lcom/nothing/cardwidget/pedometer/WalkingData;

    move-result-object v0

    if-eqz v0, :cond_22

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result v0

    const/16 v2, 0x64

    if-lt v0, v2, :cond_14

    const/4 v0, 0x4

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->walkingBgView:Lcom/nothing/cardwidget/pedometer/PedometerWalkingBgView;

    new-instance v1, Lcom/nothing/cardwidget/pedometer/f;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/pedometer/f;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_22
    return-void
.end method
