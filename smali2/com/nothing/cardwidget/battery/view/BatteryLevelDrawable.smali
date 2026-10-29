.class public final Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field private boundsF:Landroid/graphics/RectF;

.field private final paint:Landroid/graphics/Paint;

.field private progressLevel:F

.field private final startAngle:F


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    const/high16 v0, 0x43870000    # 270.0f

    iput v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->startAngle:F

    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->progressLevel:F

    return-void
.end method

.method private final calculateBounds(Landroid/graphics/Rect;)Landroid/graphics/RectF;
    .registers 8

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterY()F

    move-result p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    new-instance v3, Landroid/graphics/RectF;

    sub-float v4, v1, v0

    sub-float v5, p1, v0

    add-float/2addr v1, v0

    add-float/2addr p1, v0

    invoke-direct {v3, v4, v5, v1, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p0

    div-float/2addr p0, v2

    invoke-virtual {v3, p0, p0}, Landroid/graphics/RectF;->inset(FF)V

    return-object v3
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 9

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->boundsF:Landroid/graphics/RectF;

    if-nez v2, :cond_a

    return-void

    :cond_a
    iget v0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->progressLevel:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v0, v1

    iget v3, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->startAngle:F

    const/4 v5, 0x1

    iget-object v6, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public getOpacity()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/graphics/Paint;->getAlpha()I

    move-result p0

    return p0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .registers 3

    const-string v0, "bounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->calculateBounds(Landroid/graphics/Rect;)Landroid/graphics/RectF;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->boundsF:Landroid/graphics/RectF;

    return-void
.end method

.method public setAlpha(I)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final setBatteryLevel(I)V
    .registers 3

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    iput p1, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->progressLevel:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColor(I)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/BatteryLevelDrawable;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
