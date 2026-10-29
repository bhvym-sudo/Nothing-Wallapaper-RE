.class public final Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$Companion;,
        Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerCalendarViewHolder;,
        Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerDigitalViewHolder;,
        Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$Companion;

.field private static final DESIGN_COMMON_MARGIN:I = 0x10

.field private static final DESIGN_HUMAN_HEIGHT:I = 0x22

.field private static final DESIGN_HUMAN_WIDTH:I = 0x18

.field private static final DESIGN_LEFT_GAP:I = 0x8

.field private static final DESIGN_PERCENT_MARGIN_TOP:I = 0x10

.field private static final DESIGN_TOTAL_WIDTH:I = 0xac

.field private static final DESIGN_WALKING_PROGRESS_HEIGHT:I = 0x4

.field private static final FLOAT_50:F = 50.0f

.field private static final FRAME_ANIM_EXECUTION_CYCLE:J = 0x13baL

.field private static final MARK_PERCENT:Ljava/lang/String; = "%"

.field public static final PEDOMETER_CALENDAR_VIEW:I = 0x2

.field public static final PEDOMETER_DIGITAL_VIEW:I = 0x1

.field public static final PEDOMETER_WALKING_VIEW:I = 0x0

.field public static final TAG:Ljava/lang/String; = "PedometerAdapter"


# instance fields
.field private bgHuman:Landroid/graphics/drawable/AnimationDrawable;

.field private commonTextColor:I

.field private containerType:I

.field private currentDayColor:I

.field private currentDayShape:Ljava/lang/Integer;

.field private final digitalFormat:Ljava/text/DecimalFormat;

.field private goalNotReachedColor:I

.field private goalNotReachedShape:Ljava/lang/Integer;

.field private goalReachedColor:I

.field private goalReachedShape:Ljava/lang/Integer;

.field private heightRatio:F

.field private leftCircleColor:I

.field private pedometerDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerData;",
            ">;"
        }
    .end annotation
.end field

.field private rightDotColor:I

.field private sevenDayAverageDesStr:Ljava/lang/String;

.field private totalTodayDesStr:Ljava/lang/String;

.field private walkingViewHolder:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

.field private weeklyDesColor:I

.field private widthRatio:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->Companion:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalNotReachedColor:I

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalReachedColor:I

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->currentDayColor:I

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->weeklyDesColor:I

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->commonTextColor:I

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->leftCircleColor:I

    iput v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->rightDotColor:I

    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    const-string v1, "#,###"

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->digitalFormat:Ljava/text/DecimalFormat;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getDigitalFormat$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)Ljava/text/DecimalFormat;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->digitalFormat:Ljava/text/DecimalFormat;

    return-object p0
.end method

.method public static final synthetic access$getHeightRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->heightRatio:F

    return p0
.end method

.method public static final synthetic access$getWidthRatio$p(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;)F
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->widthRatio:F

    return p0
.end method


# virtual methods
.method public final getBgHuman()Landroid/graphics/drawable/AnimationDrawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->bgHuman:Landroid/graphics/drawable/AnimationDrawable;

    return-object p0
.end method

.method public final getCommonTextColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->commonTextColor:I

    return p0
.end method

.method public final getContainerType()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->containerType:I

    return p0
.end method

.method public final getCurrentDayColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->currentDayColor:I

    return p0
.end method

.method public final getCurrentDayShape()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->currentDayShape:Ljava/lang/Integer;

    return-object p0
.end method

.method public final getGoalNotReachedColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalNotReachedColor:I

    return p0
.end method

.method public final getGoalNotReachedShape()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalNotReachedShape:Ljava/lang/Integer;

    return-object p0
.end method

.method public final getGoalReachedColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalReachedColor:I

    return p0
.end method

.method public final getGoalReachedShape()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalReachedShape:Ljava/lang/Integer;

    return-object p0
.end method

.method public getItemCount()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public getItemViewType(I)I
    .registers 2

    if-nez p1, :cond_4

    const/4 p0, 0x0

    return p0

    :cond_4
    const/4 p0, 0x1

    if-ne p1, p0, :cond_8

    return p0

    :cond_8
    const/4 p0, 0x2

    return p0
.end method

.method public final getLeftCircleColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->leftCircleColor:I

    return p0
.end method

.method public final getPedometerDataList()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerData;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    return-object p0
.end method

.method public final getRightDotColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->rightDotColor:I

    return p0
.end method

.method public final getSevenDayAverageDesStr()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->sevenDayAverageDesStr:Ljava/lang/String;

    return-object p0
.end method

.method public final getTotalTodayDesStr()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->totalTodayDesStr:Ljava/lang/String;

    return-object p0
.end method

.method public final getWalkingData()Lcom/nothing/cardwidget/pedometer/WalkingData;
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_17

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lcom/nothing/cardwidget/pedometer/WalkingData;

    if-eqz v0, :cond_17

    check-cast p0, Lcom/nothing/cardwidget/pedometer/WalkingData;

    return-object p0

    :cond_17
    return-object v1
.end method

.method public final getWalkingViewHolder()Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->walkingViewHolder:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    return-object p0
.end method

.method public final getWeeklyDesColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->weeklyDesColor:I

    return p0
.end method

.method public final isAod()Z
    .registers 2

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->containerType:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_6

    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->getItemViewType(I)I

    move-result v0

    if-eqz v0, :cond_2e

    const/4 v1, 0x1

    if-eq v0, v1, :cond_20

    const/4 v1, 0x2

    if-eq v0, v1, :cond_12

    goto :goto_37

    :cond_12
    check-cast p1, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerCalendarViewHolder;

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/pedometer/PedometerData;

    invoke-virtual {p1, p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerCalendarViewHolder;->bindData(Lcom/nothing/cardwidget/pedometer/PedometerData;)V

    return-void

    :cond_20
    check-cast p1, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerDigitalViewHolder;

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/pedometer/PedometerData;

    invoke-virtual {p1, p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerDigitalViewHolder;->bindData(Lcom/nothing/cardwidget/pedometer/PedometerData;)V

    return-void

    :cond_2e
    check-cast p1, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->walkingViewHolder:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    if-eqz p1, :cond_37

    invoke-virtual {p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->bindData()V

    :cond_37
    :goto_37
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 7

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflate(...)"

    const/4 v1, 0x0

    if-eqz p2, :cond_46

    const/4 v2, 0x1

    if-eq p2, v2, :cond_2f

    const/4 v2, 0x2

    if-ne p2, v2, :cond_27

    new-instance p2, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerCalendarViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/nothing/cardwidget/R$layout;->pedometer_calendar:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerCalendarViewHolder;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/view/View;)V

    return-object p2

    :cond_27
    new-instance p0, Ljava/lang/Exception;

    const-string p1, "PedometerViewPagerAdapter no such viewType!!!"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2f
    new-instance p2, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerDigitalViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/nothing/cardwidget/R$layout;->pedometer_digital:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerDigitalViewHolder;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/view/View;)V

    return-object p2

    :cond_46
    new-instance p2, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/nothing/cardwidget/R$layout;->pedometer_walking:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public final setBgHuman(Landroid/graphics/drawable/AnimationDrawable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->bgHuman:Landroid/graphics/drawable/AnimationDrawable;

    return-void
.end method

.method public final setCommonTextColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->commonTextColor:I

    return-void
.end method

.method public final setContainerType(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->containerType:I

    return-void
.end method

.method public final setCurrentDayColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->currentDayColor:I

    return-void
.end method

.method public final setCurrentDayShape(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->currentDayShape:Ljava/lang/Integer;

    return-void
.end method

.method public final setGoalNotReachedColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalNotReachedColor:I

    return-void
.end method

.method public final setGoalNotReachedShape(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalNotReachedShape:Ljava/lang/Integer;

    return-void
.end method

.method public final setGoalReachedColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalReachedColor:I

    return-void
.end method

.method public final setGoalReachedShape(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->goalReachedShape:Ljava/lang/Integer;

    return-void
.end method

.method public final setHeightRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->heightRatio:F

    return-void
.end method

.method public final setLeftCircleColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->leftCircleColor:I

    return-void
.end method

.method public final setPedometerDataList(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    return-void
.end method

.method public final setRightDotColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->rightDotColor:I

    return-void
.end method

.method public final setSevenDayAverageDesStr(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->sevenDayAverageDesStr:Ljava/lang/String;

    return-void
.end method

.method public final setTotalTodayDesStr(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->totalTodayDesStr:Ljava/lang/String;

    return-void
.end method

.method public final setWalkingViewHolder(Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->walkingViewHolder:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    return-void
.end method

.method public final setWeeklyDesColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->weeklyDesColor:I

    return-void
.end method

.method public final setWidthRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->widthRatio:F

    return-void
.end method

.method public final updateAllData(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pedometerDatas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final updateDataExcludeMonthStepsList(Ljava/util/List;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/nothing/cardwidget/pedometer/PedometerData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pedometerDatas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1f

    invoke-static {}, Li8/s;->t()V

    :cond_1f
    check-cast v3, Lcom/nothing/cardwidget/pedometer/PedometerData;

    iget-object v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter;->pedometerDataList:Ljava/util/List;

    invoke-interface {v5, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v2, v4

    goto :goto_e

    :cond_28
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    return-void
.end method
