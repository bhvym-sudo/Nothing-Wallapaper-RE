.class public abstract LG6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I = 0x3100


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public static final a(LC6/i;Lk6/c;)Landroid/graphics/Bitmap;
    .registers 12

    const-string v0, "regionBitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC6/i;->e()I

    move-result v0

    invoke-virtual {p0}, LC6/i;->d()I

    move-result v1

    mul-int v2, v0, v1

    sget v3, LG6/f;->a:I

    if-le v2, v3, :cond_50

    invoke-static {v0, v1}, LG6/f;->b(II)Lh8/o;

    move-result-object v2

    invoke-virtual {v2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {v2}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lk6/c;->q(Lk6/c;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object p0

    new-instance v2, Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v4, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    sget-object v0, LC6/i;->h:LC6/i$a;

    invoke-virtual {v0, p1}, LC6/i$a;->a(Landroid/graphics/Bitmap;)LC6/i;

    move-result-object v0

    invoke-static {p0, v2, v3, v0}, LG6/b;->b(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLC6/i;)V

    return-object p1

    :cond_50
    invoke-virtual {p0}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final b(II)Lh8/o;
    .registers 7

    mul-int v0, p0, p1

    sget v1, LG6/f;->a:I

    if-le v0, v1, :cond_e

    int-to-double v1, v1

    int-to-double v3, v0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    goto :goto_10

    :cond_e
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    :goto_10
    int-to-double v2, p0

    mul-double/2addr v2, v0

    double-to-int p0, v2

    int-to-double v2, p1

    mul-double/2addr v2, v0

    double-to-int p1, v2

    const/4 v2, 0x1

    if-nez p0, :cond_1a

    move p0, v2

    :cond_1a
    if-nez p1, :cond_1d

    move p1, v2

    :cond_1d
    new-instance v2, Lh8/o;

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    new-instance v1, Landroid/util/Size;

    invoke-direct {v1, p0, p1}, Landroid/util/Size;-><init>(II)V

    invoke-direct {v2, v0, v1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final c(Landroid/graphics/Point;)Landroid/graphics/Bitmap;
    .registers 3

    const-string v0, "viewSize"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/f;->e(Landroid/graphics/Point;)Landroid/util/Size;

    move-result-object p0

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, p0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v0, "createBitmap(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(Landroid/graphics/Point;)Landroid/graphics/Bitmap;
    .registers 3

    const-string v0, "size"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Landroid/graphics/Point;->x:I

    iget p0, p0, Landroid/graphics/Point;->y:I

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, p0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v0, "createBitmap(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Landroid/graphics/Point;)Landroid/util/Size;
    .registers 2

    const-string v0, "viewSize"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Landroid/graphics/Point;->x:I

    iget p0, p0, Landroid/graphics/Point;->y:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    new-instance v0, Landroid/util/Size;

    invoke-direct {v0, p0, p0}, Landroid/util/Size;-><init>(II)V

    return-object v0
.end method
