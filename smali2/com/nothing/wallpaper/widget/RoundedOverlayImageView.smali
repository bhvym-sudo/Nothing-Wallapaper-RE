.class public final Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field private q:F

.field private r:I

.field private s:F

.field private final t:Landroid/graphics/Path;

.field private final u:Landroid/graphics/RectF;

.field private final v:Landroid/graphics/RectF;

.field private final w:Landroid/graphics/Paint;

.field private final x:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x41400000    # 12.0f

    .line 4
    invoke-direct {p0, p3}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->c(F)F

    move-result p3

    iput p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    .line 5
    const-string p3, "#80000000"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->r:I

    const/high16 p3, 0x41c00000    # 24.0f

    .line 6
    invoke-direct {p0, p3}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->c(F)F

    move-result p3

    iput p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    .line 7
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->t:Landroid/graphics/Path;

    .line 8
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->u:Landroid/graphics/RectF;

    .line 9
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->v:Landroid/graphics/RectF;

    .line 10
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    iput-object p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->w:Landroid/graphics/Paint;

    .line 14
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 16
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 18
    iput-object v2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->x:Landroid/graphics/Paint;

    if-eqz p2, :cond_86

    .line 19
    sget-object v1, La3/a;->k2:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 20
    iget v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    .line 21
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    .line 22
    iget p2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->r:I

    .line 23
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->r:I

    const/4 p2, 0x2

    .line 24
    iget v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    .line 26
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 27
    :cond_86
    iget p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->r:I

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

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

    .line 2
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final c(F)F
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, p0

    return p1
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 11

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->t:Landroid/graphics/Path;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v5, v0

    const/4 v0, 0x0

    cmpg-float v1, v4, v0

    if-lez v1, :cond_bb

    cmpg-float v1, v5, v0

    if-gtz v1, :cond_29

    goto/16 :goto_bb

    :cond_29
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v1, v6

    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v0}, LB8/h;->e(FF)F

    move-result v7

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->u:Landroid/graphics/RectF;

    invoke-virtual {v1, v0, v0, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->v:Landroid/graphics/RectF;

    sub-float v3, v4, v7

    sub-float v8, v5, v7

    invoke-virtual {v1, v7, v7, v3, v8}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->v:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpg-float v1, v1, v0

    if-lez v1, :cond_5f

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->v:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v1, v1, v0

    if-gtz v1, :cond_61

    :cond_5f
    move-object v1, p1

    goto :goto_84

    :cond_61
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    move-result p1

    iget-object v2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->u:Landroid/graphics/RectF;

    iget v3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    iget-object v4, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->w:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget v2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    sub-float/2addr v2, v7

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget-object v2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->v:Landroid/graphics/RectF;

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->x:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v0, v0, p0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    invoke-virtual {v1, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :goto_84
    new-instance p1, Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v7, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->r:I

    invoke-virtual {p1, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget v7, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v6, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    div-float/2addr v3, v2

    new-instance v2, Landroid/graphics/RectF;

    sub-float/2addr v4, v3

    sub-float/2addr v5, v3

    invoke-direct {v2, v3, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget p0, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    sub-float/2addr p0, v3

    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-virtual {v1, v2, p0, p0, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_bb
    :goto_bb
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->t:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    iget-object p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->u:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->t:Landroid/graphics/Path;

    iget-object p2, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->u:Landroid/graphics/RectF;

    iget p3, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    sget-object p4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, p2, p3, p3, p4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->t:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public setBackgroundColor(I)V
    .registers 2

    return-void
.end method

.method public final setCornerRadiusDp(F)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->c(F)F

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setCornerRadiusPx(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->q:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOverlayColor(I)V
    .registers 3

    iput p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->r:I

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->w:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOverlayThicknessDp(F)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->c(F)F

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOverlayThicknessPx(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;->s:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
