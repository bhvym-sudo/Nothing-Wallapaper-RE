.class public final Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private final M:Landroid/graphics/Paint;

.field private final N:Landroid/graphics/Paint;

.field private final O:Landroid/graphics/Paint;

.field private final P:Landroid/graphics/Paint;

.field private Q:Landroid/graphics/Bitmap;

.field private R:Landroid/graphics/Bitmap;

.field private S:Z

.field private T:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "GraphicClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->L:Ljava/lang/String;

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 6
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p3, 0x1

    .line 7
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->M:Landroid/graphics/Paint;

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    const/4 p4, 0x0

    .line 10
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    new-instance p4, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p4, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 13
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14
    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->N:Landroid/graphics/Paint;

    .line 15
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 16
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    sget-object p4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 18
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->O:Landroid/graphics/Paint;

    .line 20
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 21
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->P:Landroid/graphics/Paint;

    .line 24
    iput-boolean p3, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->T:Z

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

    .line 2
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic J(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->Q(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final K(Landroid/graphics/Canvas;FILandroid/graphics/Xfermode;)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->M:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p4

    new-instance v1, Landroid/graphics/RectF;

    div-float/2addr p2, p4

    sub-float p4, p3, p2

    sub-float v2, v0, p2

    add-float/2addr p3, p2

    add-float/2addr v0, p2

    invoke-direct {v1, p4, v2, p3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->M:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, p0}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method static synthetic L(Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;Landroid/graphics/Canvas;FILandroid/graphics/Xfermode;ILjava/lang/Object;)V
    .registers 7

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_5

    const/4 p4, 0x0

    :cond_5
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->K(Landroid/graphics/Canvas;FILandroid/graphics/Xfermode;)V

    return-void
.end method

.method private final M(Landroid/graphics/Canvas;FFLh8/o;I)V
    .registers 22

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    iget-object v2, v0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->O:Landroid/graphics/Paint;

    move/from16 v4, p3

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move/from16 v4, p5

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    move/from16 v2, p2

    float-to-double v6, v2

    mul-double/2addr v6, v4

    const/high16 v2, 0x41f00000    # 30.0f

    float-to-double v4, v2

    div-double/2addr v6, v4

    const-wide v4, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v6, v4

    float-to-double v1, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    float-to-double v8, v3

    mul-double/2addr v4, v8

    invoke-virtual/range {p4 .. p4}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    mul-double/2addr v4, v10

    sub-double v3, v1, v4

    double-to-float v11, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    mul-double/2addr v3, v8

    invoke-virtual/range {p4 .. p4}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    mul-double/2addr v3, v12

    sub-double v3, v8, v3

    double-to-float v12, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double/2addr v3, v8

    invoke-virtual/range {p4 .. p4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    mul-double/2addr v3, v13

    add-double/2addr v1, v3

    double-to-float v13, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    mul-double/2addr v1, v8

    invoke-virtual/range {p4 .. p4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    mul-double/2addr v1, v3

    add-double/2addr v8, v1

    double-to-float v14, v8

    iget-object v15, v0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->O:Landroid/graphics/Paint;

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final N(Landroid/graphics/Canvas;Ljava/lang/String;)V
    .registers 25

    move-object/from16 v0, p2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, -0x2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v1

    if-nez v1, :cond_3a

    invoke-virtual/range {p0 .. p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v1

    if-eqz v1, :cond_3b

    :cond_3a
    const/4 v5, 0x1

    :cond_3b
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v4, LI2/b;->d:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float v9, v1, v4

    invoke-virtual/range {p0 .. p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5d

    if-nez v5, :cond_5d

    const/high16 v1, -0x1000000

    :goto_5b
    move v15, v1

    goto :goto_5f

    :cond_5d
    const/4 v1, -0x1

    goto :goto_5b

    :goto_5f
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v4, LI2/a;->a:I

    invoke-static {v1, v4}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v21

    int-to-float v0, v0

    int-to-float v1, v2

    const/high16 v2, 0x42700000    # 60.0f

    div-float v4, v1, v2

    add-float/2addr v0, v4

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float v12, v0, v4

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v13, v9, v0

    new-instance v14, Lh8/o;

    const v0, 0x3e5e1282

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const v6, 0x3ed7e753

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-direct {v14, v4, v6}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    invoke-direct/range {v10 .. v15}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->M(Landroid/graphics/Canvas;FFLh8/o;I)V

    int-to-float v3, v3

    div-float v2, v3, v2

    add-float v8, v1, v2

    new-instance v10, Lh8/o;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const v1, 0x3f4ea68e

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v10, v0, v2}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move v11, v15

    invoke-direct/range {v6 .. v11}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->M(Landroid/graphics/Canvas;FFLh8/o;I)V

    if-nez v5, :cond_d0

    const/high16 v0, 0x40000000    # 2.0f

    div-float v19, v9, v0

    new-instance v0, Lh8/o;

    const v2, 0x3e4565c8

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move-object/from16 v20, v0

    move/from16 v18, v3

    invoke-direct/range {v16 .. v21}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->M(Landroid/graphics/Canvas;FFLh8/o;I)V

    :cond_d0
    return-void
.end method

.method private final O(Landroid/graphics/Canvas;)V
    .registers 9

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->Q:Landroid/graphics/Bitmap;

    if-nez v0, :cond_5

    goto :goto_9

    :cond_5
    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->R:Landroid/graphics/Bitmap;

    if-nez v1, :cond_a

    :goto_9
    return-void

    :cond_a
    iget-object v2, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->P:Landroid/graphics/Paint;

    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v4

    if-nez v4, :cond_29

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v4

    if-nez v4, :cond_29

    const/high16 v4, -0x1000000

    goto :goto_2a

    :cond_29
    const/4 v4, -0x1

    :goto_2a
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v6

    mul-float/2addr v5, v6

    sub-float/2addr v4, v5

    div-float/2addr v4, v3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v3

    if-nez v3, :cond_7c

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v3

    if-nez v3, :cond_7c

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v6

    invoke-virtual {v3, v5, v6}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v3, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v5, Lh8/A;->a:Lh8/A;

    iget-object v5, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->P:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    :cond_7c
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    invoke-virtual {v1, v3, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v2, Lh8/A;->a:Lh8/A;

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->P:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, p0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    return-void
.end method

.method private final P()V
    .registers 10

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->S:Z

    if-nez v0, :cond_5c

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->S:Z

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "initResource"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#initResource"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LI2/c;->b:I

    invoke-static {v0, v1}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_3f

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_40

    :cond_3f
    move-object v1, v0

    :goto_40
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->c:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_57

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_57
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->R:Landroid/graphics/Bitmap;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_5c
    return-void
.end method

.method private static final Q(LK2/b;)Ljava/lang/String;
    .registers 3

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshTime() - before invalidate new time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public F()V
    .registers 8

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getFormat()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    goto/16 :goto_9d

    :cond_8
    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->T:Z

    if-nez v0, :cond_2f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getCalendar()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v2, v0

    if-gtz v2, :cond_2f

    const-wide/16 v2, 0x385

    cmp-long v0, v0, v2

    if-gez v0, :cond_2f

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->getTag()Ljava/lang/String;

    move-result-object p0

    const-string v0, "intercept refreshTime interval 0-900ms"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2f
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getFormat()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9d

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_9d

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getLogger()LK2/e;

    move-result-object v1

    new-instance v2, Lcom/nothing/systemui/shared/clocks/view/a;

    invoke-direct {v2}, Lcom/nothing/systemui/shared/clocks/view/a;-><init>()V

    sget-object v3, LK2/a;->t:LK2/a;

    invoke-virtual {v1}, LK2/e;->e()LK2/f;

    move-result-object v4

    invoke-virtual {v1}, LK2/e;->f()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v4, v5, v3, v2, v6}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v2

    invoke-interface {v2, v0}, LK2/b;->k(Ljava/lang/String;)V

    invoke-virtual {v1}, LK2/e;->e()LK2/f;

    move-result-object v1

    invoke-interface {v1, v2}, LK2/f;->b(LK2/b;)V

    invoke-virtual {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/D;->setTimeStr(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTalkBackContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getLogger()LK2/e;

    move-result-object p0

    const-string v0, "refreshTime() - after invalidate"

    const/4 v1, 0x2

    invoke-static {p0, v0, v6, v1, v6}, LK2/e;->c(LK2/e;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_9d
    :goto_9d
    return-void
.end method

.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 15

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->P()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_13

    return-void

    :cond_13
    invoke-static {v0}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1a

    return-void

    :cond_1a
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LI2/b;->s:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v2

    mul-float v5, v1, v2

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v1

    if-nez v1, :cond_46

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v1

    if-nez v1, :cond_46

    const/high16 v1, -0x1000000

    :goto_44
    move v9, v1

    goto :goto_48

    :cond_46
    const/4 v1, -0x1

    goto :goto_44

    :goto_48
    invoke-direct {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->O(Landroid/graphics/Canvas;)V

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v5

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float v8, v1, v2

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v6, p0

    move-object v7, p1

    invoke-static/range {v6 .. v12}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->L(Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;Landroid/graphics/Canvas;FILandroid/graphics/Xfermode;ILjava/lang/Object;)V

    move-object v3, v6

    move-object v4, v7

    invoke-direct {v3, v4, v0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->N(Landroid/graphics/Canvas;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result p0

    const/4 p1, 0x0

    if-nez p0, :cond_7f

    invoke-virtual {v3}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result p0

    if-nez p0, :cond_7f

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    sget v0, LI2/a;->a:I

    invoke-static {p0, v0}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->L(Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;Landroid/graphics/Canvas;FILandroid/graphics/Xfermode;ILjava/lang/Object;)V

    goto :goto_89

    :cond_7f
    new-instance p0, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-direct {v3, v4, v5, p1, p0}, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->K(Landroid/graphics/Canvas;FILandroid/graphics/Xfermode;)V

    :goto_89
    iput-boolean p1, v3, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->T:Z

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->T:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->T:Z

    return-void
.end method

.method public z()V
    .registers 10

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->Q:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->R:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->b:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1b

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1c

    :cond_1b
    move-object v1, v0

    :goto_1c
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->c:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_33

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_33
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;->R:Landroid/graphics/Bitmap;

    return-void
.end method
