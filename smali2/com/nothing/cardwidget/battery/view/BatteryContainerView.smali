.class public final Lcom/nothing/cardwidget/battery/view/BatteryContainerView;
.super Lcom/nothing/cardwidget/RemoteServiceView;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/battery/timer/ITimerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/view/BatteryContainerView$WhenMappings;
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private animEnterBottomLeft:Landroid/animation/Animator;

.field private animEnterBottomRight:Landroid/animation/Animator;

.field private animEnterTopRight:Landroid/animation/Animator;

.field private animExitBottomLeft:Landroid/animation/Animator;

.field private animExitBottomRight:Landroid/animation/Animator;

.field private animExitTopRight:Landroid/animation/Animator;

.field private final attributeHelper$delegate:Lh8/h;

.field private batteryContainer:Landroid/widget/LinearLayout;

.field private batteryLevelTv:Landroid/widget/TextView;

.field private batteryPermissionTv:Landroid/widget/TextView;

.field private batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

.field private batteryViewBottomLeftInfo:LM5/a;

.field private batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

.field private batteryViewBottomRightInfo:LM5/a;

.field private batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

.field private batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

.field private batteryViewTopRightInfo:LM5/a;

.field private clickListener:Ljava/util/function/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Consumer<",
            "Lh8/o;",
            ">;"
        }
    .end annotation
.end field

.field private permissionClickListener:Landroid/view/View$OnClickListener;

.field private tempList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LM5/a;",
            ">;"
        }
    .end annotation
.end field

.field private widgetId:Ljava/lang/Integer;


# direct methods
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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/RemoteServiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 6
    const-string p3, "BatteryContainerView"

    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->TAG:Ljava/lang/String;

    .line 7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    .line 8
    new-instance p3, Lcom/nothing/cardwidget/battery/view/g;

    invoke-direct {p3}, Lcom/nothing/cardwidget/battery/view/g;-><init>()V

    invoke-static {p3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p3

    iput-object p3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->attributeHelper$delegate:Lh8/h;

    .line 9
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p3

    invoke-virtual {p3, p2, p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getRemoteResource(Landroid/util/AttributeSet;Landroid/content/Context;)V

    .line 10
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/nothing/cardwidget/R$layout;->battery_container:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->initView(Landroid/view/View;)V

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic X()Lcom/nothing/cardwidget/battery/AttributeHelper;
    .registers 1

    invoke-static {}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->attributeHelper_delegate$lambda$0()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic Y(Landroid/view/View;Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Ljava/lang/String;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener$lambda$55$lambda$54(Landroid/view/View;Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private static final attributeHelper_delegate$lambda$0()Lcom/nothing/cardwidget/battery/AttributeHelper;
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/battery/AttributeHelper;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;-><init>()V

    return-object v0
.end method

.method private final clearOutDatedData(Ljava/util/ArrayList;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LM5/a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM5/a;

    invoke-direct {p0, v3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getBaseId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_27
    invoke-static {v0}, Li8/s;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v2}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getBatteryStateInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    const-string v3, "<get-keys>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_45
    :goto_45
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_73

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getBaseId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_45

    invoke-direct {p0, v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getWidgetIdFromUniqueId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->widgetId:Ljava/lang/Integer;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_45

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_45

    :cond_73
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_77
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_91

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->clearBatteryState(Ljava/lang/String;)V

    sget-object v2, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-virtual {v2, v0}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->stopTimer(Ljava/lang/String;)V

    goto :goto_77

    :cond_91
    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_a0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    invoke-virtual {v1}, LM5/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a0

    :cond_b4
    invoke-static {v0}, Li8/s;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->clearOldCachedBatteryInfo(Ljava/util/Set;)V

    return-void
.end method

.method private final crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V
    .registers 7

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_14

    invoke-virtual {p1, p5}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    return-void

    :cond_14
    if-eqz p2, :cond_19

    invoke-virtual {p2}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_19
    if-eqz p3, :cond_1e

    invoke-virtual {p3}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_1e
    if-eqz p3, :cond_28

    new-instance p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$1;

    invoke-direct {p0, p1, p5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$1;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;)V

    invoke-virtual {p3, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_28
    if-eqz p2, :cond_32

    new-instance p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;

    invoke-direct {p0, p1, p5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$crossFadeAnimation$2;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;LM5/a;)V

    invoke-virtual {p2, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_32
    if-nez p4, :cond_3f

    if-eqz p5, :cond_3f

    invoke-virtual {p1, p5}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    if-eqz p2, :cond_48

    invoke-virtual {p2}, Landroid/animation/Animator;->start()V

    return-void

    :cond_3f
    if-eqz p4, :cond_49

    if-nez p5, :cond_49

    if-eqz p3, :cond_48

    invoke-virtual {p3}, Landroid/animation/Animator;->start()V

    :cond_48
    return-void

    :cond_49
    if-nez p4, :cond_51

    if-nez p5, :cond_51

    invoke-virtual {p1, p5}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    return-void

    :cond_51
    invoke-virtual {p1, p5}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    return-void
.end method

.method private final deviceOnReceived(Ljava/util/ArrayList;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LM5/a;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_94

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM5/a;

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x10501908

    if-eq v2, v3, :cond_7f

    const v3, -0x4bbb681

    if-eq v2, v3, :cond_31

    const v3, 0x52a7f2ca

    if-eq v2, v3, :cond_28

    goto :goto_4

    :cond_28
    const-string v2, "NOTHINGX_DEVICE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_89

    :cond_31
    const-string v2, "FASTPAIR_DEVICE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    goto :goto_4

    :cond_3a
    invoke-static {v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerViewKt;->isSingleBattery(LM5/a;)Z

    move-result v1

    if-nez v1, :cond_94

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4b
    :goto_4b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LM5/a;

    invoke-virtual {v5}, LM5/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4b

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4b

    :cond_6a
    invoke-static {v2}, Li8/s;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v2, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7f
    const-string v2, "AIRPODS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_89

    goto/16 :goto_4

    :cond_89
    :goto_89
    invoke-static {v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerViewKt;->isSingleBattery(LM5/a;)Z

    move-result v1

    if-nez v1, :cond_94

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->nothingDeviceOnReceived(LM5/a;)V

    goto/16 :goto_4

    :cond_94
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->updateUI()V

    return-void
.end method

.method private final deviceStateOnHandle(LM5/a;)Ljava/util/ArrayList;
    .registers 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM5/a;",
            ")",
            "Ljava/util/ArrayList<",
            "LM5/a;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    sget-object v1, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCurrentHandleBatteryInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct/range {p0 .. p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->queryBatteryState(LM5/a;Ljava/lang/String;)Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    move-result-object v2

    sget-object v3, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1d5

    const/4 v3, 0x2

    const-string v4, "getContext(...)"

    const/4 v5, -0x1

    if-eq v2, v3, :cond_102

    const/4 v3, 0x3

    if-eq v2, v3, :cond_38

    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v0

    filled-new-array {v0}, [LM5/a;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_38
    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_f5

    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_57

    goto :goto_5f

    :cond_57
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v5, :cond_5f

    goto/16 :goto_f5

    :cond_5f
    :goto_5f
    invoke-direct/range {p0 .. p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_84

    sget-object v6, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v8

    const-wide/16 v9, 0x7530

    move-object/from16 v11, p0

    invoke-virtual/range {v6 .. v11}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->startAlarmTimer(Landroid/content/Context;Ljava/lang/String;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V

    goto :goto_98

    :cond_84
    sget-object v11, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v13

    const-wide/16 v14, 0x7530

    move-object/from16 v16, p0

    invoke-virtual/range {v11 .. v16}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->startHandleTimer(Landroid/content/Context;Ljava/lang/String;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V

    :goto_98
    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v2

    new-instance v6, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_be

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_be
    move v10, v5

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v13

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v14

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v15

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v16

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v17

    invoke-virtual {v0}, LM5/a;->e()Ljava/util/List;

    move-result-object v22

    const/16 v23, 0x3800

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v6 .. v24}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    filled-new-array {v2, v6}, [LM5/a;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_f5
    :goto_f5
    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v0

    filled-new-array {v0}, [LM5/a;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_102
    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1c8

    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_121

    goto :goto_129

    :cond_121
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v5, :cond_129

    goto/16 :goto_1c8

    :cond_129
    :goto_129
    invoke-direct/range {p0 .. p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE_COUNTING:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {v1, v2, v3}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V

    invoke-direct/range {p0 .. p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_157

    sget-object v11, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v13

    const-wide/16 v14, 0x7530

    move-object/from16 v16, p0

    invoke-virtual/range {v11 .. v16}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->startAlarmTimer(Landroid/content/Context;Ljava/lang/String;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V

    goto :goto_16b

    :cond_157
    sget-object v11, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v13

    const-wide/16 v14, 0x7530

    move-object/from16 v16, p0

    invoke-virtual/range {v11 .. v16}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->startHandleTimer(Landroid/content/Context;Ljava/lang/String;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V

    :goto_16b
    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v2

    new-instance v6, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_191

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_191
    move v10, v5

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v13

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v14

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v15

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v16

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v17

    invoke-virtual {v0}, LM5/a;->e()Ljava/util/List;

    move-result-object v22

    const/16 v23, 0x3800

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v6 .. v24}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    filled-new-array {v2, v6}, [LM5/a;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_1c8
    :goto_1c8
    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->earProductsOnCombine(LM5/a;)LM5/a;

    move-result-object v0

    filled-new-array {v0}, [LM5/a;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_1d5
    new-instance v1, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v5

    invoke-virtual {v0}, LM5/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v8

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v9

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v10

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v11

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v12

    invoke-virtual {v0}, LM5/a;->k()Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x3800

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v19}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    new-instance v2, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v6

    invoke-virtual {v0}, LM5/a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v9

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v10

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v11

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v12

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v13

    invoke-virtual {v0}, LM5/a;->n()Ljava/util/List;

    move-result-object v18

    const/16 v19, 0x3800

    const/16 v20, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v20}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    new-instance v3, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v7

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v10

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v11

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v12

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v13

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v14

    invoke-virtual {v0}, LM5/a;->e()Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x3800

    const/16 v21, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v3 .. v21}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    filled-new-array {v1, v2, v3}, [LM5/a;

    move-result-object v0

    invoke-static {v0}, Li8/s;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->initView$lambda$11$lambda$10(Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Landroid/view/View;)V

    return-void
.end method

.method private final getAddressFromUniqueId(Ljava/lang/String;)Ljava/lang/String;
    .registers 8

    const-string p0, "+"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LE8/i;->D0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private final getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->attributeHelper$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/AttributeHelper;

    return-object p0
.end method

.method private final getBaseId(Ljava/lang/String;)Ljava/lang/String;
    .registers 8

    const-string p0, "+"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LE8/i;->D0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_33

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_33
    return-object v0
.end method

.method private final getKeysByValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Set;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TT;+TE;>;TE;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_2b
    return-object p0
.end method

.method private final getUniqueId(LM5/a;)Ljava/lang/String;
    .registers 4

    invoke-virtual {p1}, LM5/a;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->widgetId:Ljava/lang/Integer;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod()Ljava/lang/Boolean;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "+"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getWidgetIdFromUniqueId(Ljava/lang/String;)Ljava/lang/String;
    .registers 8

    const-string p0, "+"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LE8/i;->D0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_1a

    const-string p0, ""

    :cond_1a
    return-object p0
.end method

.method private final initView(Landroid/view/View;)V
    .registers 5

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryContainer:Landroid/widget/LinearLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_view_top_left:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setAttributeHelper(Lcom/nothing/cardwidget/battery/AttributeHelper;)V

    goto :goto_1e

    :cond_1d
    move-object v0, v1

    :goto_1e
    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_view_top_right:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v0, :cond_32

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setAttributeHelper(Lcom/nothing/cardwidget/battery/AttributeHelper;)V

    goto :goto_33

    :cond_32
    move-object v0, v1

    :goto_33
    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_view_bottom_left:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v0, :cond_47

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setAttributeHelper(Lcom/nothing/cardwidget/battery/AttributeHelper;)V

    goto :goto_48

    :cond_47
    move-object v0, v1

    :goto_48
    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    sget v0, Lcom/nothing/cardwidget/R$id;->battery_view_bottom_right:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v0, :cond_5c

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setAttributeHelper(Lcom/nothing/cardwidget/battery/AttributeHelper;)V

    goto :goto_5d

    :cond_5c
    move-object v0, v1

    :goto_5d
    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    sget v0, Lcom/nothing/cardwidget/R$id;->tv_battery_level:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getBatteryLevelTvColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_78

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_78
    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    sget v0, Lcom/nothing/cardwidget/R$id;->tv_battery_permission:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getPermissionStr()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8f

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8f
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getPermissionTvColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_a0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_a0
    new-instance v0, Lcom/nothing/cardwidget/battery/view/i;

    invoke-direct {v0, p0}, Lcom/nothing/cardwidget/battery/view/i;-><init>(Lcom/nothing/cardwidget/battery/view/BatteryContainerView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryPermissionTv:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryEnter()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_c0

    invoke-virtual {p1}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_c0

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    goto :goto_c1

    :cond_c0
    move-object p1, v1

    :goto_c1
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterTopRight:Landroid/animation/Animator;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryExit()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_d9

    invoke-virtual {p1}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_d9

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    goto :goto_da

    :cond_d9
    move-object p1, v1

    :goto_da
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitTopRight:Landroid/animation/Animator;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryEnter()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_f2

    invoke-virtual {p1}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_f2

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    goto :goto_f3

    :cond_f2
    move-object p1, v1

    :goto_f3
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomLeft:Landroid/animation/Animator;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryExit()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_10b

    invoke-virtual {p1}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_10b

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    goto :goto_10c

    :cond_10b
    move-object p1, v1

    :goto_10c
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomLeft:Landroid/animation/Animator;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryEnter()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_124

    invoke-virtual {p1}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_124

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    goto :goto_125

    :cond_124
    move-object p1, v1

    :goto_125
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomRight:Landroid/animation/Animator;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAttributeHelper()Lcom/nothing/cardwidget/battery/AttributeHelper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/nothing/cardwidget/battery/AttributeHelper;->getAnimBatteryExit()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_13d

    invoke-virtual {p1}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_13d

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    move-object v1, p1

    :cond_13d
    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomRight:Landroid/animation/Animator;

    return-void
.end method

.method private static final initView$lambda$11$lambda$10(Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Landroid/view/View;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->permissionClickListener:Landroid/view/View$OnClickListener;

    if-eqz p0, :cond_c

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_c
    return-void
.end method

.method private final nothingDeviceOnReceived(LM5/a;)V
    .registers 8

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCurrentHandleBatteryInfo()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {p1}, LM5/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LM5/a;->c()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3a

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCaseBatteryInfo()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {p1}, LM5/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LM5/a;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->INIT_IN_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {v0, v1, v2}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V

    sget-object v0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->stopTimer(Ljava/lang/String;)V

    goto :goto_4f

    :cond_3a
    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->queryBatteryState(LM5/a;Ljava/lang/String;)Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    move-result-object v1

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->INIT_IN_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    if-ne v1, v2, :cond_4f

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getUniqueId(LM5/a;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {v0, v1, v2}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V

    :cond_4f
    :goto_4f
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5a
    :goto_5a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_79

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LM5/a;

    invoke-virtual {v4}, LM5/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LM5/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5a

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5a

    :cond_79
    invoke-static {v1}, Li8/s;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->deviceStateOnHandle(LM5/a;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private final setAllBatteryClickListener(Ljava/util/List;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LM5/a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM5/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_f
    move-object v0, v1

    :goto_10
    const/4 v2, 0x1

    invoke-static {p1, v2}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM5/a;

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_1f

    :cond_1e
    move-object v3, v1

    :goto_1f
    const/4 v4, 0x2

    invoke-static {p1, v4}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    if-eqz v5, :cond_2d

    invoke-virtual {v5}, LM5/a;->a()Ljava/lang/String;

    move-result-object v5

    goto :goto_2e

    :cond_2d
    move-object v5, v1

    :goto_2e
    const/4 v6, 0x3

    invoke-static {p1, v6}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LM5/a;

    if-eqz v7, :cond_3c

    invoke-virtual {v7}, LM5/a;->a()Ljava/lang/String;

    move-result-object v7

    goto :goto_3d

    :cond_3c
    move-object v7, v1

    :goto_3d
    iget-object v8, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryContainer:Landroid/widget/LinearLayout;

    if-eqz v8, :cond_44

    invoke-direct {p0, v8, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_44
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eq p1, v2, :cond_a5

    if-eq p1, v4, :cond_88

    if-eq p1, v6, :cond_6b

    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_55

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_55
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_5c

    invoke-direct {p0, p1, v3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_5c
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_63

    invoke-direct {p0, p1, v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_63
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_c1

    invoke-direct {p0, p1, v7}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_6b
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_72

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_72
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_79

    invoke-direct {p0, p1, v3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_79
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_80

    invoke-direct {p0, p1, v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_80
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_c1

    invoke-direct {p0, p1, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_88
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_8f

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_8f
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_96

    invoke-direct {p0, p1, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_96
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_9d

    invoke-direct {p0, p1, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_9d
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_c1

    invoke-direct {p0, p1, v3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_a5
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryContainer:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_ac

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_ac
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_b3

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_b3
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_ba

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_ba
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz p1, :cond_c1

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V

    :cond_c1
    return-void
.end method

.method private final setBatteryClickListener(Landroid/view/View;Ljava/lang/String;)V
    .registers 4

    if-eqz p2, :cond_b

    new-instance v0, Lcom/nothing/cardwidget/battery/view/h;

    invoke-direct {v0, p1, p0, p2}, Lcom/nothing/cardwidget/battery/view/h;-><init>(Landroid/view/View;Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_b
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final setBatteryClickListener$lambda$55$lambda$54(Landroid/view/View;Lcom/nothing/cardwidget/battery/view/BatteryContainerView;Ljava/lang/String;Landroid/view/View;)V
    .registers 4

    const-string p3, "$batteryView"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "this$0"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p1, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->widgetId:Ljava/lang/Integer;

    invoke-virtual {p0, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p1, p1, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->clickListener:Ljava/util/function/Consumer;

    if-eqz p1, :cond_1b

    new-instance p3, Lh8/o;

    invoke-direct {p3, p0, p2}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, p3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1b
    return-void
.end method

.method private final showBatteryUI()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryPermissionTv:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryContainer:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_11
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    if-eqz p0, :cond_18

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_18
    return-void
.end method

.method private final showPermissionUI()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryPermissionTv:Landroid/widget/TextView;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryContainer:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_11

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_11
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    if-eqz p0, :cond_18

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_18
    return-void
.end method

.method private final updateUI()V
    .registers 13

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateUI tempList: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_23
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LM5/a;

    invoke-virtual {v4}, LM5/a;->l()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_23

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_3b
    new-instance v1, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$updateUI$$inlined$compareByDescending$1;

    invoke-direct {v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$updateUI$$inlined$compareByDescending$1;-><init>()V

    new-instance v3, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$updateUI$$inlined$thenByDescending$1;

    invoke-direct {v3, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$updateUI$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

    new-instance v1, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$updateUI$$inlined$thenByDescending$2;

    invoke-direct {v1, v3}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView$updateUI$$inlined$thenByDescending$2;-><init>(Ljava/util/Comparator;)V

    invoke-static {v2, v1}, Li8/s;->m0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v1, v8, :cond_1a2

    const-string v9, ""

    const/4 v10, 0x2

    if-eq v1, v10, :cond_149

    const/4 v11, 0x3

    if-eq v1, v11, :cond_e0

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_77

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM5/a;

    invoke-virtual {v1, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    :cond_77
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_8d

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterTopRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitTopRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    iget-object v5, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_8d
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_a3

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomLeft:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomLeft:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    iget-object v5, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_a3
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_b9

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    iget-object v5, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_b9
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    if-eqz v1, :cond_c0

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_c0
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    goto/16 :goto_208

    :cond_e0
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_ef

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM5/a;

    invoke-virtual {v1, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    :cond_ef
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_105

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterTopRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitTopRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    iget-object v5, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_105
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_11b

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomLeft:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomLeft:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    iget-object v5, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_11b
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_12a

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_12a
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    if-eqz v1, :cond_131

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_131
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    iput-object v7, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    goto/16 :goto_208

    :cond_149
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_158

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM5/a;

    invoke-virtual {v1, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    :cond_158
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_167

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterTopRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitTopRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_167
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_176

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomLeft:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomLeft:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_176
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_18c

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    iget-object v5, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM5/a;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_18c
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    if-eqz v1, :cond_193

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_193
    iput-object v7, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    iput-object v7, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iput-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    goto :goto_208

    :cond_1a2
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_1b1

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM5/a;

    invoke-virtual {v1, v2}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->setBatteryInfo(LM5/a;)V

    :cond_1b1
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_1c0

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterTopRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitTopRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_1c0
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_1cf

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomLeft:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomLeft:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_1cf
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v1, :cond_1de

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animEnterBottomRight:Landroid/animation/Animator;

    iget-object v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->animExitBottomRight:Landroid/animation/Animator;

    iget-object v4, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->crossFadeAnimation(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/animation/Animator;Landroid/animation/Animator;LM5/a;LM5/a;)V

    :cond_1de
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    if-eqz v1, :cond_202

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM5/a;

    invoke-virtual {v2}, LM5/a;->l()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_202
    iput-object v7, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRightInfo:LM5/a;

    iput-object v7, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeftInfo:LM5/a;

    iput-object v7, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRightInfo:LM5/a;

    :goto_208
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->setAllBatteryClickListener(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public onDataChanged(Landroid/os/Bundle;)V
    .registers 2

    const-string p0, "data"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTicker(Ljava/lang/String;)V
    .registers 8

    const-string v0, "uniqueId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getBatteryStateInfo()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->OUT_OF_CASE_COUNTING:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-direct {p0, v0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getKeysByValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_2c

    :cond_2b
    const/4 v1, 0x0

    :goto_2c
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_88

    sget-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->getCurrentHandleBatteryInfo()Ljava/util/HashMap;

    move-result-object v2

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->getAddressFromUniqueId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    if-eqz v1, :cond_88

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->NORMAL:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {v0, p1, v2}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V

    sget-object v0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->stopTimer(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_57
    :goto_57
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_76

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LM5/a;

    invoke-virtual {v4}, LM5/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, LM5/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_57

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_57

    :cond_76
    invoke-static {v0}, Li8/s;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->deviceStateOnHandle(LM5/a;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_88
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->updateUI()V

    return-void
.end method

.method public final setBatteryDisplayRatio(F)V
    .registers 15

    sget-object v0, Lcom/nothing/cardwidget/util/UiUtil;->INSTANCE:Lcom/nothing/cardwidget/util/UiUtil;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x46

    invoke-virtual {v0, v1, v3}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    invoke-virtual {v0, v3, v4}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, p1

    invoke-static {v3}, Lx8/a;->b(F)I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0xa

    invoke-virtual {v0, v4, v5}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, p1

    invoke-static {v4}, Lx8/a;->b(F)I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x3

    invoke-virtual {v0, v5, v6}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, p1

    invoke-static {v5}, Lx8/a;->b(F)I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x10

    invoke-virtual {v0, v6, v2}, Lcom/nothing/cardwidget/util/UiUtil;->dp2px(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    const-string v6, "layout_marginStart"

    const-string v7, "layout_marginTop"

    const-string v8, "layout_marginBottom"

    const-string v9, "layout_marginEnd"

    if-eqz v2, :cond_89

    sget-object v10, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v2, v11, v12}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v10, v2, v7, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v6, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v9, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v8, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateRatio(F)V

    :cond_89
    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewTopRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v2, :cond_a9

    sget-object v10, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v2, v11, v12}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v10, v2, v7, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v6, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v9, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v8, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateRatio(F)V

    :cond_a9
    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomLeft:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v2, :cond_c9

    sget-object v10, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v2, v11, v12}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v10, v2, v7, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v6, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v9, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v8, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateRatio(F)V

    :cond_c9
    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryViewBottomRight:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    if-eqz v2, :cond_e9

    sget-object v10, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v2, v11, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v10, v2, v7, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v6, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v9, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v8, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->updateRatio(F)V

    :cond_e9
    iget-object v1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryLevelTv:Landroid/widget/TextView;

    const/4 v2, 0x0

    if-eqz v1, :cond_fc

    sget-object v3, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-virtual {v3, v1, v9, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v3, v1, v8, v4}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    const/high16 v0, 0x42980000    # 76.0f

    mul-float/2addr v0, p1

    invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_fc
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->batteryPermissionTv:Landroid/widget/TextView;

    if-eqz p0, :cond_106

    const/high16 v0, 0x424c0000    # 51.0f

    mul-float/2addr p1, v0

    invoke-virtual {p0, v2, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_106
    return-void
.end method

.method public final setBatteryInfo(Ljava/util/ArrayList;)V
    .registers 5
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

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->clearOutDatedData(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->tempList:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_23
    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->deviceOnReceived(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final setBatteryWidgetId(I)V
    .registers 2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->widgetId:Ljava/lang/Integer;

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

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->clickListener:Ljava/util/function/Consumer;

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->permissionClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setPermission(Z)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateBatteryViewState state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1c

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->showBatteryUI()V

    return-void

    :cond_1c
    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerView;->showPermissionUI()V

    return-void
.end method
