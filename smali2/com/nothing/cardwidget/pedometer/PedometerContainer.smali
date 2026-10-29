.class public final Lcom/nothing/cardwidget/pedometer/PedometerContainer;
.super Lcom/nothing/cardwidget/RemoteServiceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/pedometer/PedometerContainer$Companion;
    }
.end annotation


# static fields
.field public static final AOD_MODE:I = 0x1

.field public static final Companion:Lcom/nothing/cardwidget/pedometer/PedometerContainer$Companion;

.field public static final NORMAL_MODE:I

.field private static sharedAnimType:I

.field private static sharedIsJustWalking:Z

.field private static sharedMonthStepsListJson:Ljava/lang/String;

.field private static sharedPageState:I

.field private static sharedSevenDayAverage:I

.field private static sharedSevenDayPercent:I

.field private static sharedStepCounter:I

.field private static sharedTodayPercent:I


# instance fields
.field private final TAG:Ljava/lang/String;

.field private containerType:I

.field private final gson:Lcom/google/gson/Gson;

.field private final handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

.field private isResumed:Z

.field private isSupportAod:I

.field private lastMonthStepsData:Lcom/nothing/cardwidget/pedometer/MonthStepsData;

.field private noDataDes:Ljava/lang/String;

.field private noPermissionDes:Ljava/lang/String;

.field private pedometerAbnormalTxt:Landroid/widget/TextView;

.field private pedometerAnimIv:Landroid/widget/ImageView;

.field private pedometerPageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

.field private pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

.field private pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

.field private reachGoalAnimRes:Landroid/graphics/drawable/Drawable;

.field private walkingAnimRes:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->Companion:Lcom/nothing/cardwidget/pedometer/PedometerContainer$Companion;

    const/4 v0, -0x1

    sput v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedPageState:I

    sput v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedAnimType:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 9

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 34

    move-object/from16 v1, p1

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    .line 4
    invoke-direct/range {v0 .. v6}, Lcom/nothing/cardwidget/RemoteServiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    .line 5
    const-string v3, "PedometerContainer"

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->TAG:Ljava/lang/String;

    .line 6
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->gson:Lcom/google/gson/Gson;

    const/4 v3, 0x1

    .line 7
    iput-boolean v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    .line 8
    new-instance v3, Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    .line 9
    new-instance v4, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    .line 10
    invoke-static {}, Lcom/nothing/cardwidget/pedometer/UtilsKt;->getTodayTimeMillis()J

    move-result-wide v5

    const/4 v7, -0x1

    const/4 v8, 0x0

    .line 11
    invoke-direct {v4, v5, v6, v7, v8}, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;-><init>(JII)V

    filled-new-array {v4}, [Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    move-result-object v4

    .line 12
    invoke-static {v4}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 13
    invoke-direct {v3, v4}, Lcom/nothing/cardwidget/pedometer/MonthStepsData;-><init>(Ljava/util/List;)V

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->lastMonthStepsData:Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    .line 14
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    .line 15
    const-string v4, "leftCircleColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->leftCircleColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v9

    .line 16
    const-string v4, "rightDotColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->rightDotColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v10

    .line 17
    const-string v4, "human"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->human:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v11

    .line 18
    const-string v4, "goalNotReachedColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->goalNotReachedColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v12

    .line 19
    const-string v4, "goalReachedColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->goalReachedColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v13

    .line 20
    const-string v4, "currentDayColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->currentDayColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v14

    .line 21
    const-string v4, "weeklyDesColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->weeklyDesColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v15

    .line 22
    const-string v4, "totalTodayDes"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->totalTodayDes:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v16

    .line 23
    const-string v4, "sevenDayAverageDes"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->sevenDayAverageDes:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v17

    .line 24
    const-string v4, "commonTextColor"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->commonTextColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v18

    .line 25
    const-string v4, "walkingAnimRes"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->walkingAnimRes:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v19

    .line 26
    const-string v4, "reachGoalAnimRes"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->reachGoalAnimRes:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v20

    .line 27
    const-string v4, "noPermissionDes"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->noPermissionDes:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v21

    .line 28
    const-string v4, "noDataDes"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->noDataDes:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v22

    .line 29
    const-string v4, "goalNotReachedShape"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->goalNotReachedShape:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v23

    .line 30
    const-string v4, "goalReachedShape"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->goalReachedShape:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v24

    .line 31
    const-string v4, "currentDayShape"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->currentDayShape:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v25

    .line 32
    const-string v4, "containerUiType"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->containerUiType:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v26

    .line 33
    const-string v4, "isSupportAod"

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->isSupportAod:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v27

    filled-new-array/range {v9 .. v27}, [Lh8/o;

    move-result-object v4

    .line 34
    invoke-static {v4}, Li8/N;->i([Lh8/o;)Ljava/util/Map;

    move-result-object v4

    .line 35
    invoke-virtual {v3, v2, v4}, LJ5/a$a;->k(Landroid/util/AttributeSet;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    .line 36
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move-object v5, v4

    move-object v6, v5

    move-object v9, v6

    move-object v10, v9

    move v11, v7

    move v12, v11

    move v13, v12

    move v14, v13

    move v15, v14

    move/from16 v28, v15

    move/from16 v29, v28

    move-object v7, v10

    :goto_1dd
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_3f4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    .line 37
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Number;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object/from16 v17, v3

    .line 38
    sget v3, Lcom/nothing/cardwidget/R$attr;->leftCircleColor:I

    if-ne v8, v3, :cond_211

    if-eqz v2, :cond_20c

    .line 39
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move v12, v3

    :cond_20c
    :goto_20c
    move-object/from16 v18, v10

    :cond_20e
    :goto_20e
    const/4 v10, 0x0

    goto/16 :goto_3ed

    .line 40
    :cond_211
    sget v3, Lcom/nothing/cardwidget/R$attr;->rightDotColor:I

    if-ne v8, v3, :cond_229

    if-eqz v2, :cond_20c

    .line 41
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move v13, v3

    goto :goto_20c

    .line 42
    :cond_229
    sget v3, Lcom/nothing/cardwidget/R$attr;->human:I

    if-ne v8, v3, :cond_248

    if-eqz v2, :cond_20c

    .line 43
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v3, v1, v2, v4}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/graphics/drawable/AnimationDrawable;

    move-object v4, v3

    goto :goto_20c

    .line 44
    :cond_248
    sget v3, Lcom/nothing/cardwidget/R$attr;->goalNotReachedColor:I

    if-ne v8, v3, :cond_260

    if-eqz v2, :cond_20c

    .line 45
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move v14, v3

    goto :goto_20c

    .line 46
    :cond_260
    sget v3, Lcom/nothing/cardwidget/R$attr;->goalReachedColor:I

    if-ne v8, v3, :cond_278

    if-eqz v2, :cond_20c

    .line 47
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move v15, v3

    goto :goto_20c

    .line 48
    :cond_278
    sget v3, Lcom/nothing/cardwidget/R$attr;->currentDayColor:I

    if-ne v8, v3, :cond_292

    if-eqz v2, :cond_20c

    .line 49
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move/from16 v28, v3

    goto/16 :goto_20c

    .line 50
    :cond_292
    sget v3, Lcom/nothing/cardwidget/R$attr;->weeklyDesColor:I

    if-ne v8, v3, :cond_2ac

    if-eqz v2, :cond_20c

    .line 51
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move/from16 v29, v3

    goto/16 :goto_20c

    .line 52
    :cond_2ac
    sget v3, Lcom/nothing/cardwidget/R$attr;->totalTodayDes:I

    if-ne v8, v3, :cond_2c5

    if-eqz v2, :cond_20c

    .line 53
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v3, v1, v2, v5}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v3

    move-object v5, v3

    goto/16 :goto_20c

    .line 54
    :cond_2c5
    sget v3, Lcom/nothing/cardwidget/R$attr;->sevenDayAverageDes:I

    if-ne v8, v3, :cond_2de

    if-eqz v2, :cond_20c

    .line 55
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v3, v1, v2, v6}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v3

    move-object v6, v3

    goto/16 :goto_20c

    .line 56
    :cond_2de
    sget v3, Lcom/nothing/cardwidget/R$attr;->commonTextColor:I

    if-ne v8, v3, :cond_2f7

    if-eqz v2, :cond_20c

    .line 57
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v3

    move v11, v3

    goto/16 :goto_20c

    .line 58
    :cond_2f7
    sget v3, Lcom/nothing/cardwidget/R$attr;->walkingAnimRes:I

    if-ne v8, v3, :cond_311

    if-eqz v2, :cond_20c

    .line 59
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->walkingAnimRes:Landroid/graphics/drawable/Drawable;

    goto/16 :goto_20c

    .line 60
    :cond_311
    sget v3, Lcom/nothing/cardwidget/R$attr;->reachGoalAnimRes:I

    if-ne v8, v3, :cond_32b

    if-eqz v2, :cond_20c

    .line 61
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->reachGoalAnimRes:Landroid/graphics/drawable/Drawable;

    goto/16 :goto_20c

    .line 62
    :cond_32b
    sget v3, Lcom/nothing/cardwidget/R$attr;->noPermissionDes:I

    if-ne v8, v3, :cond_345

    if-eqz v2, :cond_20c

    .line 63
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->noPermissionDes:Ljava/lang/String;

    goto/16 :goto_20c

    .line 64
    :cond_345
    sget v3, Lcom/nothing/cardwidget/R$attr;->noDataDes:I

    if-ne v8, v3, :cond_35f

    if-eqz v2, :cond_20c

    .line 65
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->noDataDes:Ljava/lang/String;

    goto/16 :goto_20c

    .line 66
    :cond_35f
    sget v3, Lcom/nothing/cardwidget/R$attr;->currentDayShape:I

    move-object/from16 v18, v10

    const/4 v10, 0x3

    if-ne v8, v3, :cond_37f

    if-eqz v2, :cond_20e

    .line 67
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v3, v1, v2, v7, v10}, LJ5/a$a;->i(Landroid/content/Context;Landroid/util/AttributeSet;II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v7, v3

    goto/16 :goto_20e

    .line 68
    :cond_37f
    sget v3, Lcom/nothing/cardwidget/R$attr;->goalReachedShape:I

    if-ne v8, v3, :cond_39c

    if-eqz v2, :cond_20e

    .line 69
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8, v10}, LJ5/a$a;->i(Landroid/content/Context;Landroid/util/AttributeSet;II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v9, v3

    goto/16 :goto_20e

    .line 70
    :cond_39c
    sget v3, Lcom/nothing/cardwidget/R$attr;->goalNotReachedShape:I

    if-ne v8, v3, :cond_3ba

    if-eqz v2, :cond_20e

    .line 71
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8, v10}, LJ5/a$a;->i(Landroid/content/Context;Landroid/util/AttributeSet;II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v18, v3

    goto/16 :goto_20e

    .line 72
    :cond_3ba
    sget v3, Lcom/nothing/cardwidget/R$attr;->containerUiType:I

    if-ne v8, v3, :cond_3d4

    if-eqz v2, :cond_20e

    .line 73
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    const/4 v10, 0x0

    invoke-virtual {v3, v1, v2, v8, v10}, LJ5/a$a;->i(Landroid/content/Context;Landroid/util/AttributeSet;II)I

    move-result v3

    iput v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->containerType:I

    goto :goto_3ed

    :cond_3d4
    const/4 v10, 0x0

    .line 74
    sget v3, Lcom/nothing/cardwidget/R$attr;->isSupportAod:I

    if-ne v8, v3, :cond_3ed

    if-eqz v2, :cond_3ed

    .line 75
    sget-object v3, LJ5/a;->a:LJ5/a$a;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3, v1, v2, v8, v10}, LJ5/a$a;->i(Landroid/content/Context;Landroid/util/AttributeSet;II)I

    move-result v3

    iput v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isSupportAod:I

    :cond_3ed
    :goto_3ed
    move v8, v10

    move-object/from16 v3, v17

    move-object/from16 v10, v18

    goto/16 :goto_1dd

    :cond_3f4
    move-object/from16 v18, v10

    move v10, v8

    .line 76
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/nothing/cardwidget/R$layout;->pedometer_container:I

    invoke-virtual {v2, v3, v0, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 77
    sget v3, Lcom/nothing/cardwidget/R$id;->pedometer_viewpager:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v8, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    .line 78
    sget v8, Lcom/nothing/cardwidget/R$id;->pedometer_anim_iv:I

    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    iput-object v8, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    .line 79
    sget v8, Lcom/nothing/cardwidget/R$id;->abnormal_txt:I

    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAbnormalTxt:Landroid/widget/TextView;

    .line 80
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 81
    iget v8, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isSupportAod:I

    if-nez v8, :cond_430

    .line 82
    iget-object v8, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAbnormalTxt:Landroid/widget/TextView;

    new-instance v10, Lcom/nothing/cardwidget/pedometer/b;

    invoke-direct {v10, v1}, Lcom/nothing/cardwidget/pedometer/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    :cond_430
    new-instance v1, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-direct {v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;-><init>()V

    iput-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    .line 84
    invoke-virtual {v1, v12}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setLeftCircleColor(I)V

    .line 85
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v13}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setRightDotColor(I)V

    .line 86
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v4}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setBgHuman(Landroid/graphics/drawable/AnimationDrawable;)V

    .line 87
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v11}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setCommonTextColor(I)V

    .line 88
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v14}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setGoalNotReachedColor(I)V

    .line 89
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v15}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setGoalReachedColor(I)V

    .line 90
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    move/from16 v4, v28

    invoke-virtual {v1, v4}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setCurrentDayColor(I)V

    .line 91
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    move/from16 v4, v29

    invoke-virtual {v1, v4}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setWeeklyDesColor(I)V

    .line 92
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v5}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setTotalTodayDesStr(Ljava/lang/String;)V

    .line 93
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v6}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setSevenDayAverageDesStr(Ljava/lang/String;)V

    .line 94
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v7}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setCurrentDayShape(Ljava/lang/Integer;)V

    .line 95
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v9}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setGoalReachedShape(Ljava/lang/Integer;)V

    .line 96
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    move-object/from16 v4, v18

    invoke-virtual {v1, v4}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setGoalNotReachedShape(Ljava/lang/Integer;)V

    .line 97
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    iget v4, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->containerType:I

    invoke-virtual {v1, v4}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setContainerType(I)V

    .line 98
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v4, Landroidx/viewpager2/widget/MarginPageTransformer;

    const/4 v10, 0x0

    invoke-direct {v4, v10}, Landroidx/viewpager2/widget/MarginPageTransformer;-><init>(I)V

    invoke-virtual {v1, v4}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(Landroidx/viewpager2/widget/ViewPager2$PageTransformer;)V

    .line 99
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v4, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v4}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 100
    iget-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v4, Lcom/nothing/cardwidget/pedometer/PedometerContainer$3;

    invoke-direct {v4, v0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$3;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V

    invoke-virtual {v1, v4}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 101
    sget v1, Lcom/nothing/cardwidget/R$id;->pedometer_page_indicator:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/nothing/cardwidget/NTPageIndicatorDot;

    iput-object v1, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerPageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

    .line 102
    invoke-virtual {v1, v3}, Lcom/nothing/cardwidget/NTPageIndicatorDot;->setPageListener(I)V

    .line 103
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-direct {v2, v0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;Landroid/os/Looper;)V

    iput-object v2, v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 3
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic X(Landroid/content/Context;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->_init_$lambda$21(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method private static final _init_$lambda$21(Landroid/content/Context;Landroid/view/View;)V
    .registers 3

    const-string p1, "$context"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.nothing.action.PEDOMETER_WIDGET_CONFIGURE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v0, 0x14000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v0, "android.intent.category.DEFAULT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static final synthetic access$getPedometerAnimIv$p(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getPedometerViewpager$p(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)Landroidx/viewpager2/widget/ViewPager2;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    return-object p0
.end method

.method public static final synthetic access$getSharedAnimType$cp()I
    .registers 1

    sget v0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedAnimType:I

    return v0
.end method

.method public static final synthetic access$isResumed$p(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    return p0
.end method

.method public static final synthetic access$setViewPagerShow(Lcom/nothing/cardwidget/pedometer/PedometerContainer;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V

    return-void
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->updateWalkingData$lambda$27(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V

    return-void
.end method

.method private final getAnimType(I)I
    .registers 2

    const/4 p0, 0x1

    if-eq p1, p0, :cond_7

    const/4 p0, 0x2

    if-eq p1, p0, :cond_7

    const/4 p0, -0x1

    :cond_7
    return p0
.end method

.method private final getMonthStepsData(Ljava/lang/String;)Lcom/nothing/cardwidget/pedometer/MonthStepsData;
    .registers 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2d

    :try_start_6
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->lastMonthStepsData:Lcom/nothing/cardwidget/pedometer/MonthStepsData;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_12} :catch_13

    goto :goto_2c

    :catch_13
    move-exception p1

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parse Json for MonthStepsData e: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->lastMonthStepsData:Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    :goto_2c
    return-object p1

    :cond_2d
    const/4 p0, 0x0

    return-object p0
.end method

.method private final isAod()Z
    .registers 2

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->containerType:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_6

    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method private final maybeUpdateWalkingPercent(IIZ)V
    .registers 6

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getWalkingData()Lcom/nothing/cardwidget/pedometer/WalkingData;

    move-result-object v0

    if-eqz v0, :cond_4f

    if-ltz p2, :cond_d

    invoke-virtual {v0, p2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setWalkingPercent(I)V

    :cond_d
    const/4 p2, 0x1

    if-eqz p3, :cond_1c

    iget-boolean p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setAnimateValid(Z)V

    invoke-virtual {v0, p2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setJustWalking(Z)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->updateWalkingData()V

    return-void

    :cond_1c
    invoke-virtual {v0}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getWalkingPercent()I

    move-result p3

    const/16 v1, 0x64

    if-lt p3, v1, :cond_2b

    invoke-virtual {v0, p2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setRefreshProgress(Z)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->updateWalkingData()V

    return-void

    :cond_2b
    iget-object p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {p3}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getPedometerDataList()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    const/4 v1, 0x3

    if-ge p3, v1, :cond_39

    goto :goto_4f

    :cond_39
    iget-boolean p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    if-eqz p3, :cond_4f

    if-eqz p1, :cond_40

    goto :goto_4f

    :cond_40
    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p1

    if-eqz p1, :cond_49

    goto :goto_4f

    :cond_49
    invoke-virtual {v0, p2}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setRefreshProgress(Z)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->updateWalkingData()V

    :cond_4f
    :goto_4f
    return-void
.end method

.method static synthetic maybeUpdateWalkingPercent$default(Lcom/nothing/cardwidget/pedometer/PedometerContainer;IIZILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, -0x1

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->maybeUpdateWalkingPercent(IIZ)V

    return-void
.end method

.method private final setViewPagerShow(Z)V
    .registers 3

    if-eqz p1, :cond_e

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerPageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_e
    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerPageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final showAbnormal(Z)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAbnormalTxt:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAbnormalTxt:Landroid/widget/TextView;

    if-eqz p1, :cond_10

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->noPermissionDes:Ljava/lang/String;

    goto :goto_12

    :cond_10
    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->noDataDes:Ljava/lang/String;

    :goto_12
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final showAnim(I)V
    .registers 6

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isAod()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1a

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of p1, p0, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz p1, :cond_14

    move-object v1, p0

    check-cast v1, Landroid/graphics/drawable/AnimationDrawable;

    :cond_14
    if-eqz v1, :cond_78

    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    return-void

    :cond_1a
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_78

    :cond_23
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->reachGoalAnimRes:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_78

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->walkingAnimRes:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_2c

    goto :goto_78

    :cond_2c
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_3f

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0, v2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V

    :cond_3f
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    const/4 v2, 0x1

    if-ne p1, v2, :cond_47

    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->reachGoalAnimRes:Landroid/graphics/drawable/Drawable;

    goto :goto_49

    :cond_47
    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->walkingAnimRes:Landroid/graphics/drawable/Drawable;

    :goto_49
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v3, v0, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v3, :cond_59

    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/AnimationDrawable;

    :cond_59
    if-eqz v1, :cond_78

    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const-string v1, "obtainMessage(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, v0, Landroid/os/Message;->what:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    const-wide/16 v1, 0x9f6

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_78
    :goto_78
    return-void
.end method

.method private final showNormal(ZIIIILjava/lang/String;)V
    .registers 20

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAbnormalTxt:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isAod()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3e

    if-nez v0, :cond_18

    goto :goto_3e

    :cond_18
    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v4

    new-instance v7, Lcom/nothing/cardwidget/pedometer/PedometerContainer$showNormal$1;

    invoke-direct {v7, p0, v3}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$showNormal$1;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;Lm8/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v5

    const/4 v8, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->maybeUpdateWalkingPercent$default(Lcom/nothing/cardwidget/pedometer/PedometerContainer;IIZILjava/lang/Object;)V

    goto :goto_42

    :cond_3e
    :goto_3e
    xor-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V

    :goto_42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Lcom/nothing/cardwidget/pedometer/WalkingData;

    iget-boolean v10, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move v8, p1

    move/from16 v6, p3

    invoke-direct/range {v5 .. v12}, Lcom/nothing/cardwidget/pedometer/WalkingData;-><init>(IZZIZILkotlin/jvm/internal/h;)V

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getPedometerDataList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_62
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_74

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/nothing/cardwidget/pedometer/PedometerData;

    instance-of v6, v6, Lcom/nothing/cardwidget/pedometer/WalkingData;

    if-eqz v6, :cond_62

    move-object v3, v2

    :cond_74
    check-cast v3, Lcom/nothing/cardwidget/pedometer/PedometerData;

    if-eqz v3, :cond_81

    check-cast v3, Lcom/nothing/cardwidget/pedometer/WalkingData;

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/WalkingData;->getCurrentProgress()I

    move-result v1

    invoke-virtual {v5, v1}, Lcom/nothing/cardwidget/pedometer/WalkingData;->setCurrentProgress(I)V

    :cond_81
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/nothing/cardwidget/pedometer/DigitalData;

    move/from16 v6, p3

    move/from16 v3, p4

    move/from16 v5, p5

    invoke-direct {v1, p2, v6, v3, v5}, Lcom/nothing/cardwidget/pedometer/DigitalData;-><init>(IIII)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p6

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->getMonthStepsData(Ljava/lang/String;)Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    move-result-object v1

    if-eqz v1, :cond_a3

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->updateAllData(Ljava/util/List;)V

    goto :goto_bc

    :cond_a3
    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getItemCount()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_b7

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->lastMonthStepsData:Lcom/nothing/cardwidget/pedometer/MonthStepsData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->updateAllData(Ljava/util/List;)V

    goto :goto_bc

    :cond_b7
    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->updateDataExcludeMonthStepsList(Ljava/util/List;)V

    :goto_bc
    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerPageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/NTPageIndicatorDot;->refreshDotIfItemCountChanged()V

    return-void
.end method

.method private final showPageState(IZIIIILjava/lang/String;)V
    .registers 15

    if-eqz p1, :cond_2d

    const/4 p3, 0x2

    const/4 p5, 0x1

    if-eq p1, p5, :cond_29

    if-eq p1, p3, :cond_25

    const/4 p3, 0x3

    if-eq p1, p3, :cond_21

    const/4 p3, 0x4

    if-eq p1, p3, :cond_1c

    const/4 p3, 0x5

    if-eq p1, p3, :cond_12

    return-void

    :cond_12
    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    invoke-direct {p0, p1, p4, p2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->maybeUpdateWalkingPercent(IIZ)V

    return-void

    :cond_1c
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showAbnormal(Z)V

    return-void

    :cond_21
    invoke-direct {p0, p5}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showAbnormal(Z)V

    return-void

    :cond_25
    invoke-direct {p0, p5}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showAnim(I)V

    return-void

    :cond_29
    invoke-direct {p0, p3}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showAnim(I)V

    return-void

    :cond_2d
    move-object v0, p0

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showNormal(ZIIIILjava/lang/String;)V

    return-void
.end method

.method private final updateWalkingData()V
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/nothing/cardwidget/pedometer/a;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/pedometer/a;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final updateWalkingData$lambda$27(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_14

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void

    :cond_14
    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getWalkingViewHolder()Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    move-result-object p0

    if-eqz p0, :cond_1f

    invoke-virtual {p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bindData()V

    :cond_1f
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .registers 9

    invoke-super {p0}, Lcom/nothing/cardwidget/RemoteServiceView;->onAttachedToWindow()V

    sget v1, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedPageState:I

    sget-boolean v2, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedIsJustWalking:Z

    sget v3, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedStepCounter:I

    sget v4, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedTodayPercent:I

    sget v5, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedSevenDayAverage:I

    sget v6, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedSevenDayPercent:I

    sget-object v7, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedMonthStepsListJson:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showPageState(IZIIIILjava/lang/String;)V

    return-void
.end method

.method public onDataChanged(Landroid/os/Bundle;)V
    .registers 12

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key_page_state"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v0, "steps"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v0, "today_percent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v0, "seven_day_average"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v6

    const-string v0, "seven_day_percent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v7

    const-string v0, "month_steps_list"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "key_just_walking"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->TAG:Ljava/lang/String;

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isAod()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "onDataChanged,  isAod "

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " stepCounter: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", todayPercent: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sevenDayAverage: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sevenDayPercent: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", pageState: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isJustWalking: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", monthStepsListJson: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sput v2, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedPageState:I

    sput-boolean v3, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedIsJustWalking:Z

    invoke-direct {p0, v2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->getAnimType(I)I

    move-result p1

    sput p1, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedAnimType:I

    sput v4, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedStepCounter:I

    sput v5, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedTodayPercent:I

    sput v6, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedSevenDayAverage:I

    sput v7, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedSevenDayPercent:I

    sput-object v8, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->sharedMonthStepsListJson:Ljava/lang/String;

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->showPageState(IZIIIILjava/lang/String;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x432c0000    # 172.0f

    div-float/2addr p1, p2

    iget-object p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAbnormalTxt:Landroid/widget/TextView;

    const/high16 p4, 0x41a00000    # 20.0f

    mul-float/2addr p1, p4

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x3f0ee23c

    mul-float/2addr p3, p4

    float-to-int p3, p3

    iput p3, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x3e26b29b

    mul-float/2addr p3, p4

    float-to-int p3, p3

    iput p3, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, p2

    invoke-virtual {p1, p3}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setWidthRatio(F)V

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewPagerAdapter:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p0, p2

    invoke-virtual {p1, p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->setHeightRatio(F)V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .registers 4

    const-string v0, "changedView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    const/4 p1, 0x1

    if-nez p2, :cond_d

    move p2, p1

    goto :goto_e

    :cond_d
    const/4 p2, 0x0

    :goto_e
    iput-boolean p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    iget-object p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p2

    if-eqz p2, :cond_42

    iget-boolean p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z

    if-nez p2, :cond_42

    iget-object p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->TAG:Ljava/lang/String;

    const-string v0, "onVisibilityChanged, animation is interrupted, stop animation..."

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V

    iget-object p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->handler:Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_42
    return-void
.end method
