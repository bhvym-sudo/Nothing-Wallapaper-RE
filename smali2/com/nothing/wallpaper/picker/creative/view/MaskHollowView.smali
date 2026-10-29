.class public final Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private final q:Landroid/graphics/Paint;

.field private final r:Landroid/graphics/RectF;

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->q:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->r:Landroid/graphics/RectF;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-direct {p0, p2}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final a(Landroid/util/AttributeSet;)V
    .registers 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, La3/a;->U0:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->s:I

    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->t:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->v:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0603ed

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->w:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final b()V
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->s:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v2, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->u:I

    if-lez v2, :cond_11

    int-to-float v1, v2

    goto :goto_1b

    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->t:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float v1, v2, v1

    :goto_1b
    iget-object v2, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->r:Landroid/graphics/RectF;

    iget v3, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->s:I

    int-to-float v3, v3

    add-float/2addr v3, v0

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->t:I

    int-to-float p0, p0

    add-float/2addr p0, v1

    invoke-virtual {v2, v0, v1, v3, p0}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method


# virtual methods
.method public final c(II)V
    .registers 3

    iput p1, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->s:I

    iput p2, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->t:I

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getHollowMarginTop()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->u:I

    return p0
.end method

.method public final getHollowRadius()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->v:I

    return p0
.end method

.method public final getMaskColor()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->w:I

    return p0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 9

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v0

    int-to-float v5, v0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    move-result p1

    iget v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->w:I

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->q:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->r:Landroid/graphics/RectF;

    iget v2, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->v:I

    int-to-float v3, v2

    int-to-float v2, v2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->q:Landroid/graphics/Paint;

    invoke-virtual {v1, v0, v3, v2, p0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    invoke-virtual {v1, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->b()V

    return-void
.end method

.method public final setHollowMarginTop(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->u:I

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setHollowRadius(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->v:I

    return-void
.end method

.method public final setMaskColor(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->w:I

    return-void
.end method
