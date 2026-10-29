.class public abstract LG6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/graphics/Rect;

.field private static final b:Landroid/graphics/Point;

.field private static final c:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    sput-object v0, LG6/c;->a:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Point;

    const/16 v1, 0x30a

    const/16 v2, 0x6cc

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    sput-object v0, LG6/c;->b:Landroid/graphics/Point;

    new-instance v0, Lq6/b;

    const-string v1, "EffectUtils"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, LG6/c;->c:Lq6/b;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Landroid/graphics/PointF;
    .registers 8

    if-eqz p0, :cond_35

    invoke-static {p0}, LE8/i;->f0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_35

    :cond_9
    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "x"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LE8/i;->d0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p0

    new-instance v0, Landroid/graphics/PointF;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {v1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-direct {v0, v2, p0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0

    :cond_35
    :goto_35
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Landroid/graphics/Point;
    .registers 8

    if-eqz p0, :cond_35

    invoke-static {p0}, LE8/i;->f0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_35

    :cond_9
    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "x"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LE8/i;->d0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p0

    new-instance v0, Landroid/graphics/Point;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {v1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v0, v2, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object v0

    :cond_35
    :goto_35
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(Landroid/graphics/Rect;F)Landroid/graphics/Rect;
    .registers 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_c

    return-object p0

    :cond_c
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, p1

    div-float/2addr v4, v3

    int-to-float p1, v0

    sub-float v0, p1, v2

    int-to-float v1, v1

    sub-float v3, v1, v4

    add-float/2addr p1, v2

    add-float/2addr v1, v4

    sub-float v2, v1, v3

    float-to-int v2, v2

    float-to-int v1, v1

    float-to-int v4, v3

    sub-int v5, v1, v4

    if-ne v2, v5, :cond_3a

    iput v4, p0, Landroid/graphics/Rect;->top:I

    iput v1, p0, Landroid/graphics/Rect;->bottom:I

    goto :goto_45

    :cond_3a
    float-to-double v2, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    iput v2, p0, Landroid/graphics/Rect;->top:I

    iput v1, p0, Landroid/graphics/Rect;->bottom:I

    :goto_45
    sub-float v1, p1, v0

    float-to-int v1, v1

    float-to-int p1, p1

    float-to-int v2, v0

    sub-int v3, p1, v2

    if-ne v1, v3, :cond_53

    iput v2, p0, Landroid/graphics/Rect;->left:I

    iput p1, p0, Landroid/graphics/Rect;->right:I

    return-object p0

    :cond_53
    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-int v0, v0

    iput v0, p0, Landroid/graphics/Rect;->left:I

    iput p1, p0, Landroid/graphics/Rect;->right:I

    return-object p0
.end method

.method public static final d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .registers 7

    const-string v0, "hardware"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-eq v0, v1, :cond_e

    return-object p0

    :cond_e
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    new-instance v2, Landroid/graphics/Picture;

    invoke-direct {v2}, Landroid/graphics/Picture;-><init>()V

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v3

    const-string v4, "beginRecording(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v3, p0, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/graphics/Picture;->endRecording()V

    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v0, v1, p0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Picture;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v0, "createBitmap(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Landroid/graphics/PointF;)Ljava/lang/String;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, LG6/c;->f(F)Ljava/lang/String;

    move-result-object v0

    iget p0, p0, Landroid/graphics/PointF;->y:F

    invoke-static {p0}, LG6/c;->f(F)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(F)Ljava/lang/String;
    .registers 3

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string p0, "NaN"

    return-object p0

    :cond_9
    new-instance v0, Ljava/math/BigDecimal;

    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    const/16 p0, 0x8

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {v0, p0, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toPlainString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final g(Landroid/content/Context;)Ljava/io/File;
    .registers 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "effect_data"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    return-object v0
.end method

.method public static final h()Landroid/graphics/Rect;
    .registers 1

    sget-object v0, LG6/c;->a:Landroid/graphics/Rect;

    return-object v0
.end method

.method public static final i(LC6/g;Landroid/graphics/Point;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 6

    const-string v0, "viewSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_4b

    invoke-virtual {p0}, LC6/g;->f()LC6/j;

    move-result-object v1

    if-eqz v1, :cond_4b

    invoke-virtual {v1}, LC6/j;->b()Landroid/graphics/PointF;

    move-result-object v2

    if-eqz v2, :cond_15

    goto :goto_16

    :cond_15
    move-object v1, v0

    :goto_16
    if-eqz v1, :cond_4b

    invoke-virtual {p0}, LC6/g;->f()LC6/j;

    move-result-object p0

    invoke-virtual {p0}, LC6/j;->d()Landroid/graphics/Point;

    move-result-object p0

    if-nez p0, :cond_24

    sget-object p0, LG6/c;->b:Landroid/graphics/Point;

    :cond_24
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v0, v2

    iget v3, p0, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    iget v3, p1, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    iget p0, p0, Landroid/graphics/Point;->y:I

    int-to-float p0, p0

    div-float/2addr v3, p0

    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    move-result p0

    new-instance v0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {v1}, LC6/j;->c()F

    move-result v2

    mul-float/2addr v2, p0

    invoke-virtual {v1}, LC6/j;->b()Landroid/graphics/PointF;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v0, v2, p0, p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;-><init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V

    :cond_4b
    return-object v0
.end method

.method public static final j(Landroid/graphics/Rect;F)Landroid/graphics/Rect;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_c

    return-object p0

    :cond_c
    iget v0, p0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, p0, Landroid/graphics/Rect;->left:I

    iget v0, p0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, p0, Landroid/graphics/Rect;->top:I

    iget v0, p0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, p0, Landroid/graphics/Rect;->right:I

    iget v0, p0, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int p1, v0

    iput p1, p0, Landroid/graphics/Rect;->bottom:I

    return-object p0
.end method

.method public static final k(Ljava/lang/String;)F
    .registers 2

    const-string v0, "str"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NaN"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0

    :cond_10
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final l(LC6/b;)LC6/j;
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LC6/j;

    invoke-virtual {p0}, LC6/b;->b()LC6/d;

    move-result-object v1

    invoke-virtual {v1}, LC6/d;->f()F

    move-result v1

    invoke-virtual {p0}, LC6/b;->b()LC6/d;

    move-result-object v2

    invoke-virtual {v2}, LC6/d;->g()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v3

    invoke-virtual {v3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v3

    invoke-virtual {p0}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getViewSize()Landroid/graphics/Point;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, LC6/j;-><init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;)V

    return-object v0
.end method
