.class public abstract Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/IHorizontalScrollableView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$Companion;
    }
.end annotation


# static fields
.field private static final AGGRESSIVE_EASE:Landroid/view/animation/PathInterpolator;

.field public static final Companion:Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$Companion;

.field private static final REBOUND_ANIM_DURATION:I = 0x190

.field private static final SCROLL_LIMIT_THRESHOLD:I = 0xa0

.field private static final SCROLL_THRESHOLD:I = 0xe2

.field private static final TAG:Ljava/lang/String; = "HorizontalScroll"


# instance fields
.field private beginMoving:Z

.field private disableScroll:Z

.field private displayRatio:F

.field private downX:F

.field private downY:F

.field private final effectClick$delegate:Lh8/h;

.field private final effectDoubleClick$delegate:Lh8/h;

.field private isHorizontalSliding:Z

.field private isSlidingToRight:Z

.field private isVerticalSliding:Z

.field private lastX:F

.field private mActivePointerId:I

.field private rollbackScroller:Landroid/widget/Scroller;

.field private scrollStartX:F

.field private smoothScroller:Landroid/widget/Scroller;

.field private supportLeft:Z

.field private supportRight:Z

.field private touchSlop:D

.field private vibratorManager:Landroid/os/VibratorManager;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->Companion:Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$Companion;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ee147ae    # 0.44f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->AGGRESSIVE_EASE:Landroid/view/animation/PathInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 12

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p2, 0x1

    .line 5
    iput-boolean p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportLeft:Z

    .line 6
    iput-boolean p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportRight:Z

    const/4 p3, -0x1

    .line 7
    iput p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->mActivePointerId:I

    const/high16 p3, 0x3f800000    # 1.0f

    .line 8
    iput p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->displayRatio:F

    .line 9
    iput-boolean p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->beginMoving:Z

    .line 10
    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/a;

    invoke-direct {p2}, Lcom/nothing/cardwidget/mediaplayer/view/a;-><init>()V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->effectClick$delegate:Lh8/h;

    .line 11
    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/b;

    invoke-direct {p2}, Lcom/nothing/cardwidget/mediaplayer/view/b;-><init>()V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->effectDoubleClick$delegate:Lh8/h;

    .line 12
    new-instance p2, Landroid/widget/Scroller;

    sget-object p3, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->AGGRESSIVE_EASE:Landroid/view/animation/PathInterpolator;

    invoke-direct {p2, p1, p3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->rollbackScroller:Landroid/widget/Scroller;

    .line 13
    new-instance p2, Landroid/widget/Scroller;

    invoke-direct {p2, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    .line 14
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    int-to-double p2, p2

    iput-wide p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->touchSlop:D

    .line 15
    const-string p2, "vibrator_manager"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.os.VibratorManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/os/VibratorManager;

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->vibratorManager:Landroid/os/VibratorManager;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_6

    move p3, v0

    :cond_6
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_b

    move p4, v0

    .line 3
    :cond_b
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a()Landroid/os/VibrationEffect;
    .registers 1

    invoke-static {}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->effectDoubleClick_delegate$lambda$1()Landroid/os/VibrationEffect;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$vibrator(Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->vibrator(Z)V

    return-void
.end method

.method public static synthetic b()Landroid/os/VibrationEffect;
    .registers 1

    invoke-static {}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->effectClick_delegate$lambda$0()Landroid/os/VibrationEffect;

    move-result-object v0

    return-object v0
.end method

.method private static final effectClick_delegate$lambda$0()Landroid/os/VibrationEffect;
    .registers 1

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object v0

    return-object v0
.end method

.method private static final effectDoubleClick_delegate$lambda$1()Landroid/os/VibrationEffect;
    .registers 1

    const/4 v0, 0x1

    invoke-static {v0}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object v0

    return-object v0
.end method

.method private final getEffectClick()Landroid/os/VibrationEffect;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->effectClick$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/VibrationEffect;

    return-object p0
.end method

.method private final getEffectDoubleClick()Landroid/os/VibrationEffect;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->effectDoubleClick$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/VibrationEffect;

    return-object p0
.end method

.method private final getMaxScroll()I
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isSlidingToRight:Z

    if-eqz v0, :cond_8

    iget-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportRight:Z

    if-nez v1, :cond_e

    :cond_8
    if-nez v0, :cond_16

    iget-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportLeft:Z

    if-eqz v0, :cond_16

    :cond_e
    const/16 v0, 0xe2

    int-to-float v0, v0

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->displayRatio:F

    :goto_13
    mul-float/2addr v0, p0

    float-to-int p0, v0

    return p0

    :cond_16
    const/16 v0, 0xa0

    int-to-float v0, v0

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->displayRatio:F

    goto :goto_13
.end method

.method private final getSwitchThreshold()I
    .registers 5

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getMaxScroll()I

    move-result p0

    int-to-double v0, p0

    const-wide v2, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v0, v2

    double-to-int p0, v0

    return p0
.end method

.method private final runRollbackAnim(I)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->rollbackScroller:Landroid/widget/Scroller;

    neg-int v3, p1

    const/4 v4, 0x0

    const/16 v5, 0x190

    const/4 v2, 0x0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final smoothScrollTo(I)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v3, p1

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final vibrator(Z)V
    .registers 3

    if-eqz p1, :cond_19

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->vibratorManager:Landroid/os/VibratorManager;

    invoke-virtual {p1}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object p1

    iget-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportRight:Z

    if-eqz v0, :cond_11

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getEffectClick()Landroid/os/VibrationEffect;

    move-result-object p0

    goto :goto_15

    :cond_11
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getEffectDoubleClick()Landroid/os/VibrationEffect;

    move-result-object p0

    :goto_15
    invoke-virtual {p1, p0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    return-void

    :cond_19
    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->vibratorManager:Landroid/os/VibratorManager;

    invoke-virtual {p1}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object p1

    iget-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportLeft:Z

    if-eqz v0, :cond_28

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getEffectClick()Landroid/os/VibrationEffect;

    move-result-object p0

    goto :goto_2c

    :cond_28
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getEffectDoubleClick()Landroid/os/VibrationEffect;

    move-result-object p0

    :goto_2c
    invoke-virtual {p1, p0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    return-void
.end method


# virtual methods
.method public computeScroll()V
    .registers 3

    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->rollbackScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->scrollTo(II)V

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_19
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->scrollTo(II)V

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_2f
    return-void
.end method

.method public final disableHorizontalScroll(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->disableScroll:Z

    return-void
.end method

.method public isHScrollable()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->disableScroll:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_67

    const/4 v1, 0x2

    if-eq v0, v1, :cond_10

    goto/16 :goto_94

    :cond_10
    iget-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->disableScroll:Z

    if-eqz v0, :cond_19

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :cond_19
    iget v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->mActivePointerId:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_27

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :cond_27
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iget v2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->downX:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v2, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->downY:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->touchSlop:D

    cmpl-double v5, v1, v3

    if-gtz v5, :cond_49

    float-to-double v5, v0

    cmpl-double v5, v5, v3

    if-lez v5, :cond_94

    :cond_49
    cmpl-double p1, v1, v3

    const/4 v1, 0x1

    if-lez p1, :cond_5b

    iget-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isVerticalSliding:Z

    if-nez p1, :cond_5b

    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isHorizontalSliding:Z

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5b
    float-to-double v2, v0

    iget-wide v4, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->touchSlop:D

    cmpl-double p1, v2, v4

    if-lez p1, :cond_64

    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isVerticalSliding:Z

    :cond_64
    iget-boolean p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isHorizontalSliding:Z

    return p0

    :cond_67
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->mActivePointerId:I

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->rollbackScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_7e

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->rollbackScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    :cond_7e
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->setFinalX(I)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->downX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->downY:F

    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isHorizontalSliding:Z

    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isVerticalSliding:Z

    :cond_94
    :goto_94
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onSlidingSwitch(Z)V
    .registers 8

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v0

    new-instance v3, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$onSlidingSwitch$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, v1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView$onSlidingSwitch$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;ZLm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_14

    goto/16 :goto_a1

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_a1

    iget v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->mActivePointerId:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ne v0, v1, :cond_28

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :cond_28
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isHorizontalSliding:Z

    if-eqz v1, :cond_f4

    iget-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->beginMoving:Z

    if-eqz p1, :cond_3a

    iput v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->scrollStartX:F

    iput v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->lastX:F

    iput-boolean v4, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->beginMoving:Z

    :cond_3a
    iget p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->lastX:F

    sub-float p1, v0, p1

    iget v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->scrollStartX:F

    sub-float v5, v0, v1

    cmpl-float v5, v5, v2

    if-lez v5, :cond_47

    move v4, v3

    :cond_47
    iput-boolean v4, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isSlidingToRight:Z

    sub-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getMaxScroll()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v1, v1, v4

    if-gez v1, :cond_60

    invoke-static {p1}, Lx8/a;->b(F)I

    move-result p1

    neg-int p1, p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScrollTo(I)V

    goto :goto_9e

    :cond_60
    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getFinalX()I

    move-result v1

    if-lez v1, :cond_74

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getMaxScroll()I

    move-result p1

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getFinalX()I

    move-result v1

    sub-int/2addr p1, v1

    goto :goto_9b

    :cond_74
    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getFinalX()I

    move-result v1

    if-gez v1, :cond_89

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getMaxScroll()I

    move-result p1

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getFinalX()I

    move-result v1

    add-int/2addr p1, v1

    :goto_87
    neg-int p1, p1

    goto :goto_96

    :cond_89
    cmpl-float p1, p1, v2

    if-lez p1, :cond_92

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getMaxScroll()I

    move-result p1

    goto :goto_87

    :cond_92
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getMaxScroll()I

    move-result p1

    :goto_96
    int-to-float p1, p1

    invoke-static {p1}, Lx8/a;->b(F)I

    move-result p1

    :goto_9b
    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScrollTo(I)V

    :goto_9e
    iput v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->lastX:F

    return v3

    :cond_a1
    :goto_a1
    if-nez v0, :cond_a4

    goto :goto_ab

    :cond_a4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x3

    if-eq v5, v6, :cond_b4

    :goto_ab
    if-nez v0, :cond_ae

    goto :goto_f4

    :cond_ae
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_f4

    :cond_b4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iput v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->mActivePointerId:I

    iput-boolean v3, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->beginMoving:Z

    iput-boolean v4, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->isSlidingToRight:Z

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_ce

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    :cond_ce
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->smoothScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->runRollbackAnim(I)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->scrollStartX:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->getSwitchThreshold()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v1, v1, v5

    if-lez v1, :cond_f4

    cmpl-float v0, v0, v2

    if-lez v0, :cond_f0

    goto :goto_f1

    :cond_f0
    move v3, v4

    :goto_f1
    invoke-virtual {p0, v3}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->onSlidingSwitch(Z)V

    :cond_f4
    :goto_f4
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final setDisplayRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->displayRatio:F

    return-void
.end method

.method public final supportSlideLeft(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportLeft:Z

    return-void
.end method

.method public final supportSlideRight(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportRight:Z

    return-void
.end method
