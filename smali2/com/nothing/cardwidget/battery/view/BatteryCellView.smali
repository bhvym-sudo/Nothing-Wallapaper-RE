.class public final Lcom/nothing/cardwidget/battery/view/BatteryCellView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/view/BatteryCellView$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/battery/view/BatteryCellView$Companion;

.field private static final TAG:Ljava/lang/String; = "BatteryCellView"


# instance fields
.field private final animDeviceEnter$delegate:Lh8/h;

.field private final animDeviceExit$delegate:Lh8/h;

.field private final animIndicatorEnter$delegate:Lh8/h;

.field private final animIndicatorExit$delegate:Lh8/h;

.field private attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

.field private batteryCellNormalView:Landroid/widget/RelativeLayout;

.field private batteryDeviceIv:Landroid/widget/ImageView;

.field private batteryIndicatorIv:Landroid/widget/ImageView;

.field private batteryLevelIv:Landroid/widget/ImageView;

.field private batteryView:Landroid/widget/RelativeLayout;

.field private emitJob:LF8/x0;

.field private indicatorUpdateFilter:LI8/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI8/z;"
        }
    .end annotation
.end field

.field private indicatorUpdateJob:LF8/x0;

.field private lastBatteryInfo:LM5/a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->Companion:Lcom/nothing/cardwidget/battery/view/BatteryCellView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 12

    .line 3
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 6
    sget-object p2, LH8/a;->r:LH8/a;

    const/4 p3, 0x2

    const/4 p4, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, p3, p4}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->indicatorUpdateFilter:LI8/z;

    .line 7
    new-instance p2, Lcom/nothing/cardwidget/battery/view/c;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/battery/view/c;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animIndicatorEnter$delegate:Lh8/h;

    .line 8
    new-instance p2, Lcom/nothing/cardwidget/battery/view/d;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/battery/view/d;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animDeviceEnter$delegate:Lh8/h;

    .line 9
    new-instance p2, Lcom/nothing/cardwidget/battery/view/e;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/battery/view/e;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animIndicatorExit$delegate:Lh8/h;

    .line 10
    new-instance p2, Lcom/nothing/cardwidget/battery/view/f;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/battery/view/f;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animDeviceExit$delegate:Lh8/h;

    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/nothing/cardwidget/R$layout;->battery_cell:I

    invoke-virtual {p1, p2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->initView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 4
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animIndicatorExit_delegate$lambda$5(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBatteryDeviceIv$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getBatteryIndicatorIv$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getIndicatorUpdateFilter$p(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)LI8/z;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->indicatorUpdateFilter:LI8/z;

    return-object p0
.end method

.method public static final synthetic access$setBatteryIndicator(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/widget/ImageView;LM5/a;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryIndicator(Landroid/widget/ImageView;LM5/a;)V

    return-void
.end method

.method private static final animDeviceEnter_delegate$lambda$3(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimDeviceEnter()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    return-object v0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final animDeviceExit_delegate$lambda$7(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimDeviceExit()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    return-object v0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final animIndicatorEnter_delegate$lambda$1(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimChargingEnter()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    return-object v0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final animIndicatorExit_delegate$lambda$5(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimChargingExit()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    return-object v0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryIndicator$lambda$25$lambda$22$lambda$21(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static synthetic c(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animDeviceEnter_delegate$lambda$3(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method private final cancelAnimator(Landroid/animation/Animator;)V
    .registers 3

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/animation/Animator;->isRunning()Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_c

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_c
    return-void
.end method

.method public static synthetic d(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animIndicatorEnter_delegate$lambda$1(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animDeviceExit_delegate$lambda$7(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryIndicator$lambda$25$lambda$24$lambda$23(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    return-void
.end method

.method private final getAnimDeviceEnter()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animDeviceEnter$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/animation/Animator;

    return-object p0
.end method

.method private final getAnimDeviceExit()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animDeviceExit$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/animation/Animator;

    return-object p0
.end method

.method private final getAnimIndicatorEnter()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animIndicatorEnter$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/animation/Animator;

    return-object p0
.end method

.method private final getAnimIndicatorExit()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->animIndicatorExit$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/animation/Animator;

    return-object p0
.end method

.method private final hideView()V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryView:Landroid/widget/RelativeLayout;

    if-eqz p0, :cond_9

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    return-void
.end method

.method private final initIndicatorUpdateJob()V
    .registers 10

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->indicatorUpdateJob:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    invoke-static {}, LO5/g;->k()LF8/L;

    move-result-object v3

    new-instance v6, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1;

    invoke-direct {v6, p0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$initIndicatorUpdateJob$1;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->indicatorUpdateJob:LF8/x0;

    return-void
.end method

.method private final initView(Landroid/view/View;)V
    .registers 3

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryView:Landroid/widget/RelativeLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->rv_battery_cell:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryCellNormalView:Landroid/widget/RelativeLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->iv_battery_level:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryLevelIv:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->iv_battery_device:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->iv_battery_indicator:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;

    return-void
.end method

.method private final obtainDescByBatteryStatus(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    if-eqz p1, :cond_68

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x7bc0ad8f

    const-string v2, "getString(...)"

    if-eq v0, v1, :cond_4e

    const v1, 0x12734

    if-eq v0, v1, :cond_33

    const v1, 0x38f4a897

    if-eq v0, v1, :cond_18

    goto :goto_68

    :cond_18
    const-string v0, "POWER_SAVE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_21

    goto :goto_68

    :cond_21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget p1, Lcom/nothing/cardwidget/R$string;->text_power_saving_mode:I

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_33
    const-string v0, "LOW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3c

    goto :goto_68

    :cond_3c
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget p1, Lcom/nothing/cardwidget/R$string;->text_low_battery:I

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_4e
    const-string v0, "CHARGING"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_68

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget p1, Lcom/nothing/cardwidget/R$string;->text_charging:I

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_68
    :goto_68
    const-string p0, ""

    return-object p0
.end method

.method private final parseIndicator(LM5/a;)Landroid/graphics/drawable/Drawable;
    .registers 4

    invoke-virtual {p1}, LM5/a;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CHARGING"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz p0, :cond_16

    invoke-virtual {p0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getChargingDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_16
    return-object v1

    :cond_17
    const-string v0, "POWER_SAVE"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_28

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz p0, :cond_28

    invoke-virtual {p0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getPowerSaveDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_28
    return-object v1
.end method

.method private final parseProgressbarColor(LM5/a;)Ljava/lang/Integer;
    .registers 6

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryConfig;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/battery/BatteryConfig;->isLowBattery(LM5/a;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_13

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz p0, :cond_12

    invoke-virtual {p0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getLowBatteryLevelColor()Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_12
    return-object v0

    :cond_13
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz p1, :cond_64

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getNormalLevelColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_64

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2d

    :cond_2c
    const/4 v0, 0x0

    :goto_2d
    if-eqz v0, :cond_63

    sget-object v0, Lcom/nothing/cardwidget/util/UiUtil;->INSTANCE:Lcom/nothing/cardwidget/util/UiUtil;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/util/UiUtil;->isDarkTheme(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_63

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x1060021

    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    move-result p0

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    const-wide v2, 0x4059800000000000L    # 102.0

    invoke-static {v2, v3}, Lx8/a;->a(D)I

    move-result v2

    invoke-static {v2, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    :cond_63
    return-object p1

    :cond_64
    return-object v0
.end method

.method private final setAodBatteryIndicator(Landroid/widget/ImageView;LM5/a;)V
    .registers 3

    invoke-direct {p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->parseIndicator(LM5/a;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_e

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_e
    const/16 p0, 0x8

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private final setBatteryDeviceIcon(Landroid/widget/ImageView;LM5/a;)V
    .registers 6

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryConfig;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryConfig;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_1b

    :cond_1a
    const/4 p0, 0x0

    :goto_1b
    invoke-virtual {v0, p2, v1, p0}, Lcom/nothing/cardwidget/battery/BatteryConfig;->getDeviceIcon(LM5/a;Landroid/content/Context;Z)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final setBatteryIndicator(Landroid/widget/ImageView;LM5/a;)V
    .registers 8

    invoke-direct {p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->parseIndicator(LM5/a;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_5d

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_46

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto :goto_1e

    :cond_1d
    move v3, v2

    :goto_1e
    if-eqz v3, :cond_21

    goto :goto_46

    :cond_21
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorEnter()Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_2a

    invoke-virtual {v3}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_2a
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorEnter()Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_38

    new-instance v4, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;

    invoke-direct {v4, p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$1$1;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_38
    new-instance v3, Lcom/nothing/cardwidget/battery/view/a;

    invoke-direct {v3, p0, v0}, Lcom/nothing/cardwidget/battery/view/a;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_59

    :cond_46
    :goto_46
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    if-eqz v0, :cond_58

    const/high16 v3, -0x3e500000    # -22.0f

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    goto :goto_59

    :cond_58
    move-object v0, v1

    :goto_59
    if-nez v0, :cond_5c

    goto :goto_5d

    :cond_5c
    return-void

    :cond_5d
    :goto_5d
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_a5

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->lastBatteryInfo:LM5/a;

    if-eqz v0, :cond_6b

    invoke-virtual {v0}, LM5/a;->i()Ljava/util/List;

    move-result-object v1

    :cond_6b
    invoke-virtual {p2}, LM5/a;->i()Ljava/util/List;

    move-result-object p2

    invoke-static {v1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a5

    iget-object p2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz p2, :cond_83

    invoke-virtual {p2}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :cond_83
    if-eqz v2, :cond_a5

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorExit()Landroid/animation/Animator;

    move-result-object p2

    if-eqz p2, :cond_8e

    invoke-virtual {p2}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_8e
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorExit()Landroid/animation/Animator;

    move-result-object p2

    if-eqz p2, :cond_9c

    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$2$1;

    invoke-direct {v0, p1, p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$setBatteryIndicator$1$2$1;-><init>(Landroid/widget/ImageView;Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-virtual {p2, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_9c
    new-instance p2, Lcom/nothing/cardwidget/battery/view/b;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/battery/view/b;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_a5
    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    if-eqz p0, :cond_b3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    :cond_b3
    return-void
.end method

.method private static final setBatteryIndicator$lambda$25$lambda$22$lambda$21(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/graphics/drawable/Drawable;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorExit()Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->cancelAnimator(Landroid/animation/Animator;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimDeviceExit()Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->cancelAnimator(Landroid/animation/Animator;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorEnter()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_1c
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimDeviceEnter()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_25
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;

    if-eqz p0, :cond_2c

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2c
    return-void
.end method

.method private static final setBatteryIndicator$lambda$25$lambda$24$lambda$23(Lcom/nothing/cardwidget/battery/view/BatteryCellView;)V
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorEnter()Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->cancelAnimator(Landroid/animation/Animator;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimDeviceEnter()Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->cancelAnimator(Landroid/animation/Animator;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimIndicatorExit()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_1c
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->getAnimDeviceExit()Landroid/animation/Animator;

    move-result-object p0

    if-eqz p0, :cond_25

    invoke-virtual {p0}, Landroid/animation/Animator;->start()V

    :cond_25
    return-void
.end method

.method private final setBatteryLevel(Landroid/widget/ImageView;LM5/a;)V
    .registers 6

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_65

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;

    if-eqz v1, :cond_1f

    move-object v2, v0

    check-cast v2, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;

    :cond_1f
    if-eqz v2, :cond_36

    invoke-direct {p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->parseProgressbarColor(LM5/a;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_2e

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;->setColor(I)V

    :cond_2e
    invoke-virtual {p2}, LM5/a;->l()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;->setBatteryLevel(I)V

    return-void

    :cond_36
    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;-><init>()V

    invoke-direct {p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->parseProgressbarColor(LM5/a;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_48

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;->setColor(I)V

    :cond_48
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const-string v1, "getDisplayMetrics(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, p0}, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;->setBorderWidth(FLandroid/util/DisplayMetrics;)V

    invoke-virtual {p2}, LM5/a;->l()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/battery/view/BatteryAODLevelDrawable;->setBatteryLevel(I)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_65
    if-nez v0, :cond_a6

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;

    if-eqz v1, :cond_72

    move-object v2, v0

    check-cast v2, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;

    :cond_72
    if-eqz v2, :cond_89

    invoke-direct {p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->parseProgressbarColor(LM5/a;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_81

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->setColor(I)V

    :cond_81
    invoke-virtual {p2}, LM5/a;->l()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->setBatteryLevel(I)V

    return-void

    :cond_89
    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;-><init>()V

    invoke-direct {p0, p2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->parseProgressbarColor(LM5/a;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_9b

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->setColor(I)V

    :cond_9b
    invoke-virtual {p2}, LM5/a;->l()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->setBatteryLevel(I)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_a6
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0
.end method

.method private final showView()V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryView:Landroid/widget/RelativeLayout;

    if-eqz p0, :cond_8

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    return-void
.end method

.method private final updateUI(LM5/a;)V
    .registers 11

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryCellNormalView:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryLevelIv:Landroid/widget/ImageView;

    if-eqz v0, :cond_f

    invoke-direct {p0, v0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryLevel(Landroid/widget/ImageView;LM5/a;)V

    :cond_f
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    if-eqz v0, :cond_16

    invoke-direct {p0, v0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryDeviceIcon(Landroid/widget/ImageView;LM5/a;)V

    :cond_16
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->emitJob:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1f

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1f
    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v3

    new-instance v6, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;

    invoke-direct {v6, p0, p1, v1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView$updateUI$1;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->emitJob:LF8/x0;

    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->initIndicatorUpdateJob()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->emitJob:LF8/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_c

    invoke-static {v0, v2, v1, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_c
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->indicatorUpdateJob:LF8/x0;

    if-eqz p0, :cond_13

    invoke-static {p0, v2, v1, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_13
    return-void
.end method

.method public final setAttributeHelper(Lcom/nothing/cardwidget/battery/AttributeHelper;)V
    .registers 3

    const-string v0, "attributeHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->attrsHelper:Lcom/nothing/cardwidget/battery/AttributeHelper;

    return-void
.end method

.method public final setBatteryInfo(LM5/a;)V
    .registers 7

    if-nez p1, :cond_6

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->hideView()V

    goto :goto_c

    :cond_6
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->showView()V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateUI(LM5/a;)V

    :goto_c
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->lastBatteryInfo:LM5/a;

    if-eqz p1, :cond_44

    invoke-virtual {p1}, LM5/a;->l()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/nothing/cardwidget/R$string;->battery_content_desc:I

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->lastBatteryInfo:LM5/a;

    const/4 v3, 0x0

    if-eqz v2, :cond_28

    invoke-virtual {v2}, LM5/a;->g()Ljava/lang/String;

    move-result-object v2

    goto :goto_29

    :cond_28
    move-object v2, v3

    :goto_29
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->lastBatteryInfo:LM5/a;

    if-eqz v4, :cond_35

    invoke-virtual {v4}, LM5/a;->b()Ljava/lang/String;

    move-result-object v3

    :cond_35
    invoke-direct {p0, v3}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->obtainDescByBatteryStatus(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, p1, v3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_44
    return-void
.end method

.method public final updateRatio(F)V
    .registers 8

    sget-object v0, Lcom/nothing/cardwidget/util/UiUtil;->INSTANCE:Lcom/nothing/cardwidget/util/UiUtil;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x32

    invoke-virtual {v0, v1, v3}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x1e

    invoke-virtual {v0, v3, v4}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, p1

    invoke-static {v3}, Lx8/a;->b(F)I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x10

    invoke-virtual {v0, v4, v5}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, p1

    invoke-static {v4}, Lx8/a;->b(F)I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x30

    invoke-virtual {v0, v5, v2}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result p1

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryDeviceIv:Landroid/widget/ImageView;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v2, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->batteryIndicatorIv:Landroid/widget/ImageView;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, p0, v0, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const-string v0, "layout_marginTop"

    invoke-virtual {v2, p0, v0, p1}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    return-void
.end method
