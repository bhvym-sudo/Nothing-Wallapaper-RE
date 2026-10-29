.class public final Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
    }
.end annotation


# static fields
.field public static final a:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;

    invoke-direct {v0}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->a:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/graphics/Bitmap;I)I
    .registers 11

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    new-array v2, v4, [I

    add-int/lit8 v0, v0, -0x1

    move v6, v0

    :goto_12
    const/4 v0, -0x1

    if-ge v0, v6, :cond_30

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v3, 0x0

    move v7, v4

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 p0, 0x0

    :goto_1e
    if-ge p0, v4, :cond_2c

    aget v0, v2, p0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-le v0, p1, :cond_29

    return v6

    :cond_29
    add-int/lit8 p0, p0, 0x1

    goto :goto_1e

    :cond_2c
    add-int/lit8 v6, v6, -0x1

    move-object p0, v1

    goto :goto_12

    :cond_30
    return v0
.end method

.method public static final b(Landroid/graphics/Bitmap;I)I
    .registers 12

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    new-array v2, v8, [I

    const/4 v9, 0x0

    move v5, v9

    :goto_11
    if-ge v5, v0, :cond_2e

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move p0, v9

    :goto_1c
    if-ge p0, v8, :cond_2a

    aget v3, v2, p0

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-le v3, p1, :cond_27

    return v5

    :cond_27
    add-int/lit8 p0, p0, 0x1

    goto :goto_1c

    :cond_2a
    add-int/lit8 v5, v5, 0x1

    move-object p0, v1

    goto :goto_11

    :cond_2e
    const/4 p0, -0x1

    return p0
.end method

.method public static synthetic c(Landroid/graphics/Bitmap;IILjava/lang/Object;)I
    .registers 4

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_6

    const/16 p1, 0x64

    :cond_6
    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->b(Landroid/graphics/Bitmap;I)I

    move-result p0

    return p0
.end method

.method public static final d(Landroid/view/View;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p1, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;

    iget v1, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;

    invoke-direct {v0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;-><init>(Lm8/e;)V

    :goto_18
    iget-object p1, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_35

    if-ne v2, v3, :cond_2d

    iget-object p0, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->q:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_6e

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-lez p1, :cond_88

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    if-gtz p1, :cond_45

    goto :goto_88

    :cond_45
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v2, "createBitmap(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v2

    new-instance v4, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;

    const/4 v5, 0x0

    invoke-direct {v4, p1, p0, v5}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$b;-><init>(Landroid/graphics/Bitmap;Landroid/view/View;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->q:Ljava/lang/Object;

    iput v3, v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$a;->s:I

    invoke-static {v2, v4, v0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6d

    return-object v1

    :cond_6d
    move-object p0, p1

    :goto_6e
    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->b(Landroid/graphics/Bitmap;I)I

    move-result v0

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->h(Landroid/graphics/Bitmap;I)I

    move-result v1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->g(Landroid/graphics/Bitmap;I)I

    move-result v2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->a(Landroid/graphics/Bitmap;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0, v0, v1, v2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p0

    :cond_88
    :goto_88
    new-instance p0, Landroid/graphics/Rect;

    const/4 p1, -0x1

    invoke-direct {p0, p1, p1, p1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p0
.end method

.method public static final e(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FI)Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
    .registers 20

    move-object/from16 v0, p1

    move/from16 v1, p3

    const-string v2, "bitmap"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "area"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v4, v0, Landroid/graphics/Rect;->left:I

    const-string v11, "BitmapOpaqueUtil"

    if-ltz v4, :cond_101

    if-ge v4, v2, :cond_101

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v4, v0, Landroid/graphics/Rect;->right:I

    if-ltz v4, :cond_101

    if-ge v4, v2, :cond_101

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v4, v0, Landroid/graphics/Rect;->top:I

    if-ltz v4, :cond_101

    if-ge v4, v2, :cond_101

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    if-ltz v4, :cond_101

    if-ge v4, v2, :cond_101

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    if-ge v2, v5, :cond_101

    iget v2, v0, Landroid/graphics/Rect;->top:I

    if-lt v2, v4, :cond_46

    goto/16 :goto_101

    :cond_46
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    mul-int/2addr v2, v4

    int-to-float v12, v2

    mul-float v4, v12, p2

    float-to-int v13, v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v10

    const/16 v4, 0x2710

    if-gt v2, v4, :cond_80

    new-array v4, v2, [I

    iget v7, v0, Landroid/graphics/Rect;->left:I

    iget v8, v0, Landroid/graphics/Rect;->top:I

    const/4 v5, 0x0

    move v9, v6

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_6c
    if-ge v14, v2, :cond_b8

    aget v1, v4, v14

    shr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    if-lez v1, :cond_7d

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v13, :cond_7d

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0

    :cond_7d
    add-int/lit8 v14, v14, 0x1

    goto :goto_6c

    :cond_80
    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    move-result v3

    mul-int/2addr v3, v6

    new-array v4, v3, [I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    move v8, v3

    const/4 v15, 0x0

    :goto_8b
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    if-ge v8, v3, :cond_b7

    sub-int/2addr v3, v8

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v10

    mul-int v3, v6, v10

    const/4 v5, 0x0

    iget v7, v0, Landroid/graphics/Rect;->left:I

    move v9, v6

    move v14, v3

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v3, 0x0

    :goto_a1
    if-ge v3, v14, :cond_b5

    aget v5, v4, v3

    shr-int/lit8 v5, v5, 0x18

    and-int/lit16 v5, v5, 0xff

    if-lez v5, :cond_b2

    add-int/lit8 v15, v15, 0x1

    if-lt v15, v13, :cond_b2

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0

    :cond_b2
    add-int/lit8 v3, v3, 0x1

    goto :goto_a1

    :cond_b5
    add-int/2addr v8, v10

    goto :goto_8b

    :cond_b7
    move v0, v15

    :cond_b8
    sget-object v1, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v1

    if-eqz v1, :cond_f4

    const/4 v1, 0x0

    cmpg-float v1, v12, v1

    if-nez v1, :cond_c6

    goto :goto_f4

    :cond_c6
    int-to-float v1, v0

    div-float/2addr v1, v12

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getOpaqueAreaPercentage count:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " per:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_f4
    :goto_f4
    if-nez v0, :cond_f9

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0

    :cond_f9
    if-ge v0, v13, :cond_fe

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->SATISFIED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0

    :cond_fe
    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0

    :cond_101
    :goto_101
    const-string v0, "getOpaqueAreaPercentage: area is invalid"

    invoke-static {v11, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    return-object v0
.end method

.method public static synthetic f(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FIILjava/lang/Object;)Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;
    .registers 6

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_6

    const/16 p3, 0x32

    :cond_6
    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->e(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FI)Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroid/graphics/Bitmap;I)I
    .registers 11

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    new-array v2, v8, [I

    add-int/lit8 v0, v0, -0x1

    move v5, v0

    :goto_12
    const/4 v0, -0x1

    if-ge v0, v5, :cond_30

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 p0, 0x0

    :goto_1e
    if-ge p0, v8, :cond_2c

    aget v0, v2, p0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-le v0, p1, :cond_29

    return v5

    :cond_29
    add-int/lit8 p0, p0, 0x1

    goto :goto_1e

    :cond_2c
    add-int/lit8 v5, v5, -0x1

    move-object p0, v1

    goto :goto_12

    :cond_30
    return v0
.end method

.method public static final h(Landroid/graphics/Bitmap;I)I
    .registers 12

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    new-array v2, v4, [I

    const/4 v9, 0x0

    move v6, v9

    :goto_11
    if-ge v6, v0, :cond_2e

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v3, 0x0

    move v7, v4

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move p0, v9

    :goto_1c
    if-ge p0, v4, :cond_2a

    aget v3, v2, p0

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-le v3, p1, :cond_27

    return v6

    :cond_27
    add-int/lit8 p0, p0, 0x1

    goto :goto_1c

    :cond_2a
    add-int/lit8 v6, v6, 0x1

    move-object p0, v1

    goto :goto_11

    :cond_2e
    const/4 p0, -0x1

    return p0
.end method

.method private static final i([BIIII)Z
    .registers 7

    const/4 v0, 0x1

    if-eqz p1, :cond_40

    add-int/lit8 v1, p3, -0x1

    if-eq p1, v1, :cond_40

    if-eqz p2, :cond_40

    sub-int/2addr p4, v0

    if-ne p2, p4, :cond_d

    goto :goto_40

    :cond_d
    mul-int/2addr p2, p3

    add-int/2addr p2, p1

    add-int/lit8 p1, p2, -0x1

    aget-byte p1, p0, p1

    if-eqz p1, :cond_40

    add-int/lit8 p1, p2, 0x1

    aget-byte p1, p0, p1

    if-eqz p1, :cond_40

    sub-int p1, p2, p3

    aget-byte p4, p0, p1

    if-eqz p4, :cond_40

    add-int/2addr p2, p3

    aget-byte p3, p0, p2

    if-nez p3, :cond_27

    goto :goto_40

    :cond_27
    add-int/lit8 p3, p1, -0x1

    aget-byte p3, p0, p3

    if-eqz p3, :cond_40

    add-int/2addr p1, v0

    aget-byte p1, p0, p1

    if-eqz p1, :cond_40

    add-int/lit8 p1, p2, -0x1

    aget-byte p1, p0, p1

    if-eqz p1, :cond_40

    add-int/2addr p2, v0

    aget-byte p0, p0, p2

    if-nez p0, :cond_3e

    goto :goto_40

    :cond_3e
    const/4 p0, 0x0

    return p0

    :cond_40
    :goto_40
    return v0
.end method

.method public static final k(Landroid/graphics/Bitmap;)V
    .registers 12

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    const-string v0, "depth edge start"

    const-string v9, "edge:"

    invoke-static {v9, v0}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ","

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    mul-int v0, v4, v8

    new-array v2, v0, [I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move v7, v4

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    new-array p0, v0, [B

    const/4 v1, 0x0

    move v3, v1

    :goto_3b
    const/4 v5, 0x1

    if-ge v3, v0, :cond_4d

    aget v6, v2, v3

    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-lez v6, :cond_47

    goto :goto_48

    :cond_47
    move v5, v1

    :goto_48
    aput-byte v5, p0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3b

    :cond_4d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move v2, v1

    move v3, v2

    :goto_54
    if-ge v2, v8, :cond_89

    move v6, v1

    :goto_57
    if-ge v6, v4, :cond_86

    mul-int v7, v2, v4

    add-int/2addr v7, v6

    aget-byte v7, p0, v7

    if-ne v7, v5, :cond_83

    invoke-static {p0, v6, v2, v4, v8}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->i([BIIII)Z

    move-result v7

    if-eqz v7, :cond_83

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    const/16 v7, 0xc8

    if-lt v3, v7, :cond_83

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, LE8/i;->m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move v3, v1

    :cond_83
    add-int/lit8 v6, v6, 0x1

    goto :goto_57

    :cond_86
    add-int/lit8 v2, v2, 0x1

    goto :goto_54

    :cond_89
    const-string p0, "depth edge end"

    invoke-static {v9, p0}, Lcom/nothing/wallpaper/common/log/FileLog;->print(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final j(Landroid/graphics/Bitmap;I)Z
    .registers 13

    const-string p0, "bitmap"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int p0, v3, v7

    const/16 v0, 0x2710

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-gt p0, v0, :cond_2f

    new-array v1, p0, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v6, v3

    move-object v0, p1

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move p1, v9

    :goto_20
    if-ge p1, p0, :cond_2e

    aget v0, v1, p1

    shr-int/lit8 v0, v0, 0x18

    and-int/lit16 v0, v0, 0xff

    if-le v0, p2, :cond_2b

    return v9

    :cond_2b
    add-int/lit8 p1, p1, 0x1

    goto :goto_20

    :cond_2e
    return v8

    :cond_2f
    move-object v0, p1

    move p0, v7

    mul-int/lit8 p1, v3, 0x64

    new-array v1, p1, [I

    move v5, v9

    :goto_36
    if-ge v5, p0, :cond_59

    sub-int v7, p0, v5

    const/16 p1, 0x64

    invoke-static {p1, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    mul-int p1, v3, v7

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move v2, v9

    :goto_49
    if-ge v2, p1, :cond_57

    aget v4, v1, v2

    shr-int/lit8 v4, v4, 0x18

    and-int/lit16 v4, v4, 0xff

    if-le v4, p2, :cond_54

    return v9

    :cond_54
    add-int/lit8 v2, v2, 0x1

    goto :goto_49

    :cond_57
    add-int/2addr v5, v7

    goto :goto_36

    :cond_59
    return v8
.end method
