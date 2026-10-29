.class public final Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;
.super Lcom/nothing/cardwidget/RemoteServiceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$Companion;

.field private static final TAG:Ljava/lang/String; = "SmallContainerView"


# instance fields
.field private final animEnter$delegate:Lh8/h;

.field private aodPermissionContainer:Landroid/widget/RelativeLayout;

.field private aodPermissionIv:Landroid/widget/ImageView;

.field private final attributeHelper$delegate:Lh8/h;

.field private batteryContainer:Landroid/widget/RelativeLayout;

.field private batteryPermissionIv:Landroid/widget/ImageView;

.field private batteryPermissionTv:Landroid/widget/TextView;

.field private batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

.field private iconClickConsumer:Ljava/util/function/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Consumer<",
            "Lh8/o;",
            ">;"
        }
    .end annotation
.end field

.field private lastInfo:LM5/a;

.field private permissionClickListener:Landroid/view/View$OnClickListener;

.field private permissionContainer:Landroid/widget/RelativeLayout;

.field private widgetId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->Companion:Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$Companion;

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/RemoteServiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 6
    new-instance p3, Lcom/nothing/cardwidget/battery/view/k;

    invoke-direct {p3, p0}, Lcom/nothing/cardwidget/battery/view/k;-><init>(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)V

    invoke-static {p3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p3

    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->animEnter$delegate:Lh8/h;

    .line 7
    new-instance p3, Lcom/nothing/cardwidget/battery/view/l;

    invoke-direct {p3}, Lcom/nothing/cardwidget/battery/view/l;-><init>()V

    invoke-static {p3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p3

    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->attributeHelper$delegate:Lh8/h;

    .line 8
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p3

    invoke-virtual {p3, p2, p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getRemoteResource(Landroid/util/AttributeSet;Landroid/content/Context;)V

    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/nothing/cardwidget/R$layout;->battery_small_container:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->initView(Landroid/view/View;)V

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic X(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->initView$lambda$5$lambda$4(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Y()Lcom/nothing/cardwidget/battery/AttributeHelper;
    .registers 1

    invoke-static {}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->attributeHelper_delegate$lambda$2()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic Z(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Ljava/lang/String;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->setBatteryClickListener$lambda$18(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private static final animEnter_delegate$lambda$1(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)Landroid/animation/Animator;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryEnter()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    return-object v0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final attributeHelper_delegate$lambda$2()Lcom/nothing/cardwidget/battery/AttributeHelper;
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/battery/AttributeHelper;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;-><init>()V

    return-object v0
.end method

.method private final crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;LM5/a;)V
    .registers 6

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {p1, p3}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    return-void

    :cond_14
    const/4 v0, 0x0

    if-eqz p2, :cond_1c

    invoke-virtual {p2}, LM5/a;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_1d

    :cond_1c
    move-object v1, v0

    :goto_1d
    if-eqz p3, :cond_23

    invoke-virtual {p3}, LM5/a;->a()Ljava/lang/String;

    move-result-object v0

    :cond_23
    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    if-eqz p2, :cond_38

    invoke-virtual {p1, p3}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAnimEnter()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_3b

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    goto :goto_3b

    :cond_38
    invoke-virtual {p1, p3}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    :cond_3b
    :goto_3b
    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->lastInfo:LM5/a;

    return-void
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)Landroid/animation/Animator;
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->animEnter_delegate$lambda$1(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method private final getAnimEnter()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->animEnter$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/animation/Animator;

    return-object p0
.end method

.method private final getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->attributeHelper$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/AttributeHelper;

    return-object p0
.end method

.method private final initView(Landroid/view/View;)V
    .registers 5

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryContainer:Landroid/widget/RelativeLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->layout_battery_permission:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/nothing/cardwidget/battery/view/j;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/battery/view/j;-><init>(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->permissionContainer:Landroid/widget/RelativeLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->layout_battery_aod_permission:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->aodPermissionContainer:Landroid/widget/RelativeLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->iv_battery_permission:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz v0, :cond_3d

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getPermissionBgDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3e

    :cond_3d
    move-object v0, v1

    :goto_3e
    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryPermissionIv:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->iv_battery_aod_permission:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_56

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAodPermissionDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    move-object v1, v0

    :cond_56
    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->aodPermissionIv:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_small_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setAttributeHelper(Lcom/nothing/cardwidget/battery/AttributeHelper;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    sget v0, Lcom/nothing/cardwidget/R$id;->tv_battery_permission:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getPermissionStr()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7e

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7e
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getPermissionTvColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_8f

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_8f
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryPermissionTv:Landroid/widget/TextView;

    return-void
.end method

.method private static final initView$lambda$5$lambda$4(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Landroid/view/View;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->permissionClickListener:Landroid/view/View$OnClickListener;

    if-eqz p0, :cond_c

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_c
    return-void
.end method

.method private final setBatteryClickListener(Ljava/lang/String;)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryContainer:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_c

    new-instance v1, Lcom/nothing/cardwidget/battery/view/m;

    invoke-direct {v1, p0, p1}, Lcom/nothing/cardwidget/battery/view/m;-><init>(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    return-void
.end method

.method private static final setBatteryClickListener$lambda$18(Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;Ljava/lang/String;Landroid/view/View;)V
    .registers 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->widgetId:Ljava/lang/Integer;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->iconClickConsumer:Ljava/util/function/Consumer;

    if-eqz p0, :cond_1b

    new-instance v0, Lh8/o;

    invoke-direct {v0, p2, p1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1b
    return-void
.end method

.method private final showBatteryUI()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->permissionContainer:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->aodPermissionContainer:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_f

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p0, :cond_17

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_17
    return-void
.end method

.method private final showPermissionUI()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    const/4 v1, 0x4

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_28

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->permissionContainer:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_20

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_20
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->aodPermissionContainer:Landroid/widget/RelativeLayout;

    if-eqz p0, :cond_36

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_28
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->aodPermissionContainer:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2f

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2f
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->permissionContainer:Landroid/widget/RelativeLayout;

    if-eqz p0, :cond_36

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_36
    return-void
.end method


# virtual methods
.method public onDataChanged(Landroid/os/Bundle;)V
    .registers 2

    const-string p0, "data"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setBatteryInfo(Ljava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LM5/a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "batteryInfoList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_6e

    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$setBatteryInfo$$inlined$compareByDescending$1;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$setBatteryInfo$$inlined$compareByDescending$1;-><init>()V

    new-instance v1, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$setBatteryInfo$$inlined$thenByDescending$1;

    invoke-direct {v1, v0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$setBatteryInfo$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

    new-instance v0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$setBatteryInfo$$inlined$thenByDescending$2;

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView$setBatteryInfo$$inlined$thenByDescending$2;-><init>(Ljava/util/Comparator;)V

    invoke-static {p1, v0}, Li8/s;->m0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_30
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v2, v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_30

    :cond_46
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4f
    :goto_4f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_67

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LM5/a;

    invoke-virtual {v2}, LM5/a;->l()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4f

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4f

    :cond_67
    invoke-static {p1}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM5/a;

    goto :goto_74

    :cond_6e
    invoke-static {p1}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM5/a;

    :goto_74
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v0, :cond_7d

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->lastInfo:LM5/a;

    invoke-direct {p0, v0, v1, p1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;LM5/a;)V

    :cond_7d
    invoke-virtual {p1}, LM5/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->setBatteryClickListener(Ljava/lang/String;)V

    return-void
.end method

.method public final setBatteryWidgetId(I)V
    .registers 2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->widgetId:Ljava/lang/Integer;

    return-void
.end method

.method public final setClickEventConsumer(Ljava/util/function/Consumer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Consumer<",
            "Lh8/o;",
            ">;)V"
        }
    .end annotation

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->iconClickConsumer:Ljava/util/function/Consumer;

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->permissionClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setPermission(Z)V
    .registers 2

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->showBatteryUI()V

    return-void

    :cond_6
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->showPermissionUI()V

    return-void
.end method

.method public final setSmallBatteryDisplayRatio(F)V
    .registers 7

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryPermissionIv:Landroid/widget/ImageView;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v1, Lcom/nothing/cardwidget/util/UiUtil;->INSTANCE:Lcom/nothing/cardwidget/util/UiUtil;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x12

    invoke-virtual {v1, v2, v4}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p1

    invoke-static {v2}, Lx8/a;->b(F)I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x20

    invoke-virtual {v1, v4, v3}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v1

    sget-object v3, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v2, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryView:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v0, :cond_43

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateRatio(F)V

    :cond_43
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatterySmallContainerView;->batteryPermissionTv:Landroid/widget/TextView;

    if-eqz p0, :cond_4e

    const/high16 v0, 0x424c0000    # 51.0f

    mul-float/2addr p1, v0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_4e
    return-void
.end method
