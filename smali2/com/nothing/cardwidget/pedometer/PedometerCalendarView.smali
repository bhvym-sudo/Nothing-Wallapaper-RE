.class public final Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/pedometer/PedometerCalendarView$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/pedometer/PedometerCalendarView$Companion;

.field public static final KEY_MONTH_STEPS_LIST:Ljava/lang/String; = "month_steps_list"

.field private static final RECTANGLES_LIMIT:I = 0x5

.field public static final SHAPE_CIRCLE:I = 0x3

.field public static final SHAPE_DOT:I = 0x1

.field public static final SHAPE_RECTANGLE:I = 0x4

.field public static final SHAPE_RING:I = 0x2

.field private static final TAG:Ljava/lang/String; = "PedometerCalendarView"


# instance fields
.field private final WEEKLY_BOTTOM_MARGIN:F

.field private final X_INITIAL_MARGIN:I

.field private final X_MARGIN:F

.field private final circleRadius:F

.field private currentDayColor:I

.field private currentDayShape:I

.field private final dotRadius:F

.field private dotShapes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/Shape;",
            ">;"
        }
    .end annotation
.end field

.field private fixRadio:F

.field private goalNotReachedColor:I

.field private goalNotReachedShape:I

.field private goalReachedColor:I

.field private goalReachedShape:I

.field private lastItemInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final rectangles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/Shape;",
            ">;"
        }
    .end annotation
.end field

.field private final shapePaint:Landroid/graphics/Paint;

.field private weeklyDesColor:I

.field private weeklyDesPaint:Landroid/text/TextPaint;

.field private final weeklyDesTextSize:F

.field private weeklySimpleHead:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->Companion:Lcom/nothing/cardwidget/pedometer/PedometerCalendarView$Companion;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p2, 0x40400000    # 3.0f

    .line 5
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->circleRadius:F

    const/high16 p2, 0x3f800000    # 1.0f

    .line 6
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotRadius:F

    const/4 p2, -0x1

    .line 7
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedColor:I

    .line 8
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    .line 9
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayColor:I

    .line 10
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    .line 11
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    iput-object p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    .line 13
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesColor:I

    const/high16 p2, 0x41300000    # 11.0f

    .line 14
    iput p2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesTextSize:F

    .line 15
    const-string v5, "S"

    const-string v6, "S"

    const-string v0, "M"

    const-string v1, "T"

    const-string v2, "W"

    const-string v3, "T"

    const-string v4, "F"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklySimpleHead:[Ljava/lang/String;

    .line 16
    new-instance p3, Landroid/text/TextPaint;

    invoke-direct {p3}, Landroid/text/TextPaint;-><init>()V

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/4 v0, 0x2

    .line 18
    invoke-static {v0, p2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 19
    iput-object p3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesPaint:Landroid/text/TextPaint;

    const/4 p1, 0x3

    .line 20
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedShape:I

    .line 21
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedShape:I

    .line 22
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayShape:I

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->rectangles:Ljava/util/List;

    .line 24
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    const/16 p1, 0x14

    .line 25
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_INITIAL_MARGIN:I

    const/high16 p1, 0x41b00000    # 22.0f

    .line 26
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_MARGIN:F

    const/high16 p1, 0x41800000    # 16.0f

    .line 27
    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->WEEKLY_BOTTOM_MARGIN:F

    .line 28
    invoke-static {}, Lcom/nothing/cardwidget/pedometer/UtilsKt;->getShortWeekdays()[Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->setWeeklyStr([Ljava/lang/String;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final addRectangleShape(ILcom/nothing/cardwidget/pedometer/Shape;)V
    .registers 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_ac

    iget-object v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/cardwidget/pedometer/Shape;

    iget-object v5, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/cardwidget/pedometer/Shape;

    instance-of v5, v3, Lcom/nothing/cardwidget/pedometer/CircleShape;

    const/4 v6, 0x0

    if-eqz v5, :cond_28

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/Shape;->getColor()I

    move-result v5

    iget v7, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    if-ne v5, v7, :cond_28

    move v5, v2

    goto :goto_29

    :cond_28
    move v5, v6

    :goto_29
    instance-of v7, v1, Lcom/nothing/cardwidget/pedometer/CircleShape;

    if-eqz v7, :cond_37

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getColor()I

    move-result v7

    iget v8, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    if-ne v7, v8, :cond_37

    move v7, v2

    goto :goto_38

    :cond_37
    move v7, v6

    :goto_38
    if-eqz v5, :cond_3e

    if-eqz v7, :cond_3e

    move v5, v2

    goto :goto_3f

    :cond_3e
    move v5, v6

    :goto_3f
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const-string v8, "getContext(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/nothing/cardwidget/pedometer/UtilsKt;->isRtl(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_5e

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v7

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v8

    cmpl-float v7, v7, v8

    if-lez v7, :cond_5c

    :goto_5a
    move v7, v2

    goto :goto_6b

    :cond_5c
    move v7, v6

    goto :goto_6b

    :cond_5e
    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v7

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v8

    cmpg-float v7, v7, v8

    if-gez v7, :cond_5c

    goto :goto_5a

    :goto_6b
    invoke-direct {v0, v4}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->getMonthOneDayWeek(I)I

    move-result v4

    const/4 v8, 0x5

    if-eq v4, v8, :cond_73

    goto :goto_74

    :cond_73
    move v2, v6

    :goto_74
    if-eqz v5, :cond_ac

    if-eqz v7, :cond_ac

    if-eqz v2, :cond_ac

    new-instance v8, Lcom/nothing/cardwidget/pedometer/Rectangle;

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v9

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result v2

    iget v4, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->circleRadius:F

    iget v5, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v4, v5

    sub-float v10, v2, v4

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v11

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result v1

    iget v2, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->circleRadius:F

    iget v3, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v2, v3

    add-float v12, v1, v2

    invoke-virtual/range {p2 .. p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result v14

    iget v15, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    invoke-direct/range {v8 .. v15}, Lcom/nothing/cardwidget/pedometer/Rectangle;-><init>(FFFFFFI)V

    iget-object v0, v0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->rectangles:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_ac
    return-void
.end method

.method private final addStepShape(ILcom/nothing/cardwidget/pedometer/Shape;II)V
    .registers 6

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    const/4 v0, 0x2

    if-eq p3, v0, :cond_24

    const/4 v0, 0x3

    if-eq p3, v0, :cond_16

    new-instance p3, Lcom/nothing/cardwidget/pedometer/Dot;

    invoke-virtual {p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v0

    invoke-virtual {p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result p2

    invoke-direct {p3, v0, p2, p4}, Lcom/nothing/cardwidget/pedometer/Dot;-><init>(FFI)V

    goto :goto_31

    :cond_16
    new-instance p3, Lcom/nothing/cardwidget/pedometer/CircleShape;

    invoke-virtual {p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v0

    invoke-virtual {p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result p2

    invoke-direct {p3, v0, p2, p4}, Lcom/nothing/cardwidget/pedometer/CircleShape;-><init>(FFI)V

    goto :goto_31

    :cond_24
    new-instance p3, Lcom/nothing/cardwidget/pedometer/RingShape;

    invoke-virtual {p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v0

    invoke-virtual {p2}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result p2

    invoke-direct {p3, v0, p2, p4}, Lcom/nothing/cardwidget/pedometer/RingShape;-><init>(FFI)V

    :goto_31
    invoke-interface {p0, p1, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final drawStepShape(Landroid/graphics/Canvas;)V
    .registers 10

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_91

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/cardwidget/pedometer/Shape;

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getColor()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    instance-of v2, v1, Lcom/nothing/cardwidget/pedometer/Dot;

    if-eqz v2, :cond_3c

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v2

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result v1

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotRadius:F

    iget v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :goto_3a
    move-object v2, p1

    goto :goto_8e

    :cond_3c
    instance-of v2, v1, Lcom/nothing/cardwidget/pedometer/CircleShape;

    if-eqz v2, :cond_53

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result v2

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result v1

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->circleRadius:F

    iget v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_3a

    :cond_53
    instance-of v2, v1, Lcom/nothing/cardwidget/pedometer/Rectangle;

    if-eqz v2, :cond_70

    check-cast v1, Lcom/nothing/cardwidget/pedometer/Rectangle;

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Rectangle;->getLeft()F

    move-result v3

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Rectangle;->getTop()F

    move-result v4

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Rectangle;->getRight()F

    move-result v5

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Rectangle;->getBottom()F

    move-result v6

    iget-object v7, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_8e

    :cond_70
    move-object v2, p1

    instance-of p1, v1, Lcom/nothing/cardwidget/pedometer/RingShape;

    if-eqz p1, :cond_8e

    iget-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotX()F

    move-result p1

    invoke-virtual {v1}, Lcom/nothing/cardwidget/pedometer/Shape;->getPivotY()F

    move-result v1

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->circleRadius:F

    iget v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->shapePaint:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_8e
    :goto_8e
    move-object p1, v2

    goto/16 :goto_8

    :cond_91
    return-void
.end method

.method private final drawWeeklyStr(Landroid/graphics/Canvas;)V
    .registers 7

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x0

    :goto_8
    const/4 v1, 0x7

    if-ge v0, v1, :cond_3b

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesPaint:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklySimpleHead:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    iget v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_MARGIN:F

    int-to-float v3, v0

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_INITIAL_MARGIN:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v2, v3

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v1, v3

    sub-float/2addr v2, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->WEEKLY_BOTTOM_MARGIN:F

    iget v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v3, v4

    sub-float/2addr v1, v3

    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklySimpleHead:[Ljava/lang/String;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v3, v2, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_3b
    return-void
.end method

.method private final findFirstDayIndex(Ljava/util/List;)I
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;",
            ">;)I"
        }
    .end annotation

    move-object p0, p1

    check-cast p0, Ljava/util/Collection;

    if-eqz p0, :cond_2b

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_c

    goto :goto_2b

    :cond_c
    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->getDate()J

    move-result-wide p0

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0

    :cond_2b
    :goto_2b
    const/4 p0, -0x1

    return p0
.end method

.method private final getMonthOneDayWeek(I)I
    .registers 3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p0

    const-string v0, "getInstance(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0, p1}, Ljava/util/Calendar;->set(II)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1}, Ljava/util/Calendar;->get(I)I

    move-result p0

    add-int/lit8 p0, p0, -0x2

    if-gez p0, :cond_17

    const/4 p0, 0x6

    :cond_17
    return p0
.end method

.method private final initMonthShape()V
    .registers 11

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/LocalDate;->lengthOfMonth()I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->getMonthOneDayWeek(I)I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_16

    goto :goto_17

    :cond_16
    move v1, v3

    :goto_17
    add-int/2addr v0, v2

    move v4, v3

    :goto_19
    if-ge v2, v0, :cond_64

    const/4 v5, 0x7

    if-lt v2, v5, :cond_21

    rem-int/lit8 v5, v2, 0x7

    goto :goto_22

    :cond_21
    move v5, v2

    :goto_22
    if-eqz v1, :cond_26

    move v1, v3

    goto :goto_2a

    :cond_26
    if-nez v5, :cond_2a

    add-int/lit8 v4, v4, 0x1

    :cond_2a
    :goto_2a
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/nothing/cardwidget/pedometer/UtilsKt;->isRtl(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_46

    iget v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_MARGIN:F

    neg-float v6, v6

    int-to-float v5, v5

    mul-float/2addr v6, v5

    const/16 v5, 0x96

    :goto_40
    int-to-float v5, v5

    add-float/2addr v6, v5

    iget v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v6, v5

    goto :goto_4d

    :cond_46
    iget v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_MARGIN:F

    int-to-float v5, v5

    mul-float/2addr v6, v5

    iget v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_INITIAL_MARGIN:I

    goto :goto_40

    :goto_4d
    iget v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->X_MARGIN:F

    int-to-float v7, v4

    mul-float/2addr v7, v5

    add-float/2addr v7, v5

    iget v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    mul-float/2addr v7, v5

    iget-object v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    new-instance v8, Lcom/nothing/cardwidget/pedometer/Dot;

    iget v9, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedColor:I

    invoke-direct {v8, v6, v7, v9}, Lcom/nothing/cardwidget/pedometer/Dot;-><init>(FFI)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    :cond_64
    return-void
.end method

.method private final maybeUpdateShapes(Ljava/util/List;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_11

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_11

    :cond_f
    move v0, v2

    goto :goto_12

    :cond_11
    :goto_11
    move v0, v1

    :goto_12
    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    if-eqz v3, :cond_2a

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ne v3, v4, :cond_2a

    iget-object v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    goto :goto_2a

    :cond_29
    move v1, v2

    :cond_2a
    :goto_2a
    if-nez v0, :cond_2e

    if-eqz v1, :cond_41

    :cond_2e
    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->initMonthShape()V

    invoke-direct {p0}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->updateStepsMonthShape()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V
    :try_end_39
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_39} :catch_3a

    return-void

    :catch_3a
    const-string p0, "PedometerCalendarView"

    const-string p1, "PedometerCalendarView onDataChanged parse json failure~"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_41
    return-void
.end method

.method private final setWeeklyStr([Ljava/lang/String;)V
    .registers 10

    if-eqz p1, :cond_41

    array-length v0, p1

    if-nez v0, :cond_6

    goto :goto_41

    :cond_6
    array-length v0, p1

    const/4 v1, 0x7

    if-ge v0, v1, :cond_b

    goto :goto_41

    :cond_b
    array-length v0, p1

    const/4 v1, 0x0

    const-string v2, ""

    move-object v3, v2

    move v2, v1

    :goto_11
    if-ge v1, v0, :cond_2c

    aget-object v4, p1, v1

    add-int/lit8 v5, v2, 0x1

    if-eqz v4, :cond_28

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-le v6, v7, :cond_24

    move-object v3, v4

    :cond_24
    iget-object v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklySimpleHead:[Ljava/lang/String;

    aput-object v4, v6, v2

    :cond_28
    add-int/lit8 v1, v1, 0x1

    move v2, v5

    goto :goto_11

    :cond_2c
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/nothing/cardwidget/pedometer/UtilsKt;->isRtl(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_40

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklySimpleHead:[Ljava/lang/String;

    invoke-static {p0}, Li8/m;->R([Ljava/lang/Object;)V

    :cond_40
    return-void

    :cond_41
    :goto_41
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setWeeklyStr si error, weeklyStr is "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "PedometerCalendarView"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final updateStepsMonthShape()V
    .registers 9

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->findFirstDayIndex(Ljava/util/List;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_a

    goto :goto_12

    :cond_a
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    :goto_12
    return-void

    :cond_13
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->rectangles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    if-eqz v0, :cond_82

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_35

    invoke-static {}, Li8/s;->t()V

    :cond_35
    check-cast v3, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;

    iget-object v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_80

    if-gez v2, :cond_42

    goto :goto_80

    :cond_42
    iget-object v5, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nothing/cardwidget/pedometer/Shape;

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->getSteps()I

    move-result v6

    invoke-virtual {v3}, Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;->getTarget()I

    move-result v3

    const/4 v7, 0x1

    if-lt v6, v3, :cond_57

    move v3, v7

    goto :goto_58

    :cond_57
    move v3, v1

    :goto_58
    iget-object v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->lastItemInfos:Ljava/util/List;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v7

    if-ne v2, v6, :cond_6c

    iget v2, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayShape:I

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayColor:I

    invoke-direct {p0, v6, v5, v2, v3}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->addStepShape(ILcom/nothing/cardwidget/pedometer/Shape;II)V

    goto :goto_80

    :cond_6c
    if-nez v3, :cond_76

    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedShape:I

    iget v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedColor:I

    invoke-direct {p0, v2, v5, v3, v6}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->addStepShape(ILcom/nothing/cardwidget/pedometer/Shape;II)V

    goto :goto_80

    :cond_76
    iget v3, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedShape:I

    iget v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    invoke-direct {p0, v2, v5, v3, v6}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->addStepShape(ILcom/nothing/cardwidget/pedometer/Shape;II)V

    invoke-direct {p0, v2, v5}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->addRectangleShape(ILcom/nothing/cardwidget/pedometer/Shape;)V

    :cond_80
    :goto_80
    move v2, v4

    goto :goto_24

    :cond_82
    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->dotShapes:Ljava/util/List;

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->rectangles:Ljava/util/List;

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final getCurrentDayColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayColor:I

    return p0
.end method

.method public final getCurrentDayShape()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayShape:I

    return p0
.end method

.method public final getGoalNotReachedColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedColor:I

    return p0
.end method

.method public final getGoalNotReachedShape()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedShape:I

    return p0
.end method

.method public final getGoalReachedColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    return p0
.end method

.method public final getGoalReachedShape()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedShape:I

    return p0
.end method

.method public final getWeeklyDesColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesColor:I

    return p0
.end method

.method public final onDataChanged(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/cardwidget/pedometer/PedometerStepsInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "monthStepsList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->maybeUpdateShapes(Ljava/util/List;)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->drawStepShape(Landroid/graphics/Canvas;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->drawWeeklyStr(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final setCurrentDayColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayColor:I

    return-void
.end method

.method public final setCurrentDayShape(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->currentDayShape:I

    return-void
.end method

.method public final setFixRatio(F)V
    .registers 3

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->fixRadio:F

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesPaint:Landroid/text/TextPaint;

    iget p0, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesTextSize:F

    mul-float/2addr p0, p1

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public final setGoalNotReachedColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedColor:I

    return-void
.end method

.method public final setGoalNotReachedShape(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalNotReachedShape:I

    return-void
.end method

.method public final setGoalReachedColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedColor:I

    return-void
.end method

.method public final setGoalReachedShape(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->goalReachedShape:I

    return-void
.end method

.method public final setWeeklyDesColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerCalendarView;->weeklyDesColor:I

    return-void
.end method
