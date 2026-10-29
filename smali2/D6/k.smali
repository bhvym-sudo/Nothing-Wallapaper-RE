.class public final LD6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD6/k$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/graphics/Point;

.field private final c:F

.field private final d:Lg3/x;

.field private final e:Z

.field private final f:Lq6/b;

.field private final g:Landroid/graphics/Bitmap;

.field private h:Landroid/graphics/Bitmap;

.field private final i:Landroid/graphics/Point;

.field private final j:Landroid/graphics/Point;

.field private final k:F

.field private final l:Lh8/h;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Point;FLg3/x;Z)V
    .registers 8

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewSize"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, LD6/k;->a:Landroid/content/Context;

    .line 3
    iput-object p3, p0, LD6/k;->b:Landroid/graphics/Point;

    .line 4
    iput p4, p0, LD6/k;->c:F

    .line 5
    iput-object p5, p0, LD6/k;->d:Lg3/x;

    .line 6
    iput-boolean p6, p0, LD6/k;->e:Z

    .line 7
    new-instance p3, Lq6/b;

    invoke-direct {p3, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, LD6/k;->f:Lq6/b;

    .line 8
    invoke-static {p1}, LG6/c;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p3

    iput-object p3, p0, LD6/k;->g:Landroid/graphics/Bitmap;

    .line 9
    new-instance p3, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p5

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-direct {p3, p5, p1}, Landroid/graphics/Point;-><init>(II)V

    iput-object p3, p0, LD6/k;->i:Landroid/graphics/Point;

    const/4 p1, 0x1

    int-to-float p1, p1

    div-float/2addr p1, p4

    .line 10
    iput p1, p0, LD6/k;->k:F

    .line 11
    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object p1

    .line 12
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p3

    invoke-interface {p3, p2}, Lh3/H;->e(Landroid/content/Context;)LH3/k;

    move-result-object p2

    .line 13
    invoke-virtual {p2}, LH3/k;->i()Landroid/view/Display;

    move-result-object p2

    .line 14
    invoke-virtual {p1, p2}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object p1

    iput-object p1, p0, LD6/k;->j:Landroid/graphics/Point;

    .line 15
    new-instance p1, LD6/i;

    invoke-direct {p1, p0}, LD6/i;-><init>(LD6/k;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LD6/k;->l:Lh8/h;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Point;FLg3/x;ZILkotlin/jvm/internal/h;)V
    .registers 16

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_5

    const/4 p5, 0x0

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 16
    invoke-direct/range {v0 .. v6}, LD6/k;-><init>(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Point;FLg3/x;Z)V

    return-void
.end method

.method public static synthetic a(Landroid/graphics/Rect;LC6/a;LC6/d;LD6/k;)Ljava/lang/String;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LD6/k;->i(Landroid/graphics/Rect;LC6/a;LC6/d;LD6/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LD6/k;)LD6/t;
    .registers 1

    invoke-static {p0}, LD6/k;->d(LD6/k;)LD6/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LD6/k;LC6/d;LC6/a;)LC6/i;
    .registers 3

    invoke-direct {p0, p1, p2}, LD6/k;->h(LC6/d;LC6/a;)LC6/i;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LD6/k;)LD6/t;
    .registers 4

    new-instance v0, LD6/t;

    iget-object v1, p0, LD6/k;->b:Landroid/graphics/Point;

    iget-object v2, p0, LD6/k;->j:Landroid/graphics/Point;

    iget-boolean p0, p0, LD6/k;->e:Z

    invoke-direct {v0, v1, v2, p0}, LD6/t;-><init>(Landroid/graphics/Point;Landroid/graphics/Point;Z)V

    return-object v0
.end method

.method private final e(FLandroid/graphics/PointF;Z)Landroid/graphics/Rect;
    .registers 15

    iget-object v0, p0, LD6/k;->b:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    div-int/lit8 v1, v1, 0x2

    iget v0, v0, Landroid/graphics/Point;->y:I

    div-int/lit8 v0, v0, 0x2

    iget v2, p2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, p1

    float-to-int v2, v2

    sub-int/2addr v2, v1

    const/4 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    iget p2, p2, Landroid/graphics/PointF;->y:F

    mul-float/2addr p2, p1

    float-to-int p2, p2

    sub-int/2addr p2, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v9

    iget-object p2, p0, LD6/k;->b:Landroid/graphics/Point;

    iget v0, p2, Landroid/graphics/Point;->x:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, LD6/k;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v3, v1, v2, v0, p2}, LH3/D;->h(Landroid/content/res/Resources;IIII)Landroid/graphics/Point;

    move-result-object v6

    iget-object v3, p0, LD6/k;->a:Landroid/content/Context;

    iget-object v5, p0, LD6/k;->i:Landroid/graphics/Point;

    iget-object v7, p0, LD6/k;->b:Landroid/graphics/Point;

    move v4, p1

    move v10, p3

    invoke-static/range {v3 .. v10}, LH3/D;->d(Landroid/content/Context;FLandroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;IIZ)Landroid/graphics/Rect;

    move-result-object p0

    const-string p1, "calculateCropRect(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final g()LD6/t;
    .registers 1

    iget-object p0, p0, LD6/k;->l:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD6/t;

    return-object p0
.end method

.method private final h(LC6/d;LC6/a;)LC6/i;
    .registers 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object v2

    iget-object v3, p0, LD6/k;->f:Lq6/b;

    new-instance v4, LD6/j;

    invoke-direct {v4, v2, p2, p1, p0}, LD6/j;-><init>(Landroid/graphics/Rect;LC6/a;LC6/d;LD6/k;)V

    invoke-virtual {v3, v4}, Lq6/b;->b(Lv8/a;)V

    invoke-virtual {p1}, LC6/d;->d()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {p1}, LC6/d;->d()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    invoke-direct {p0}, LD6/k;->g()LD6/t;

    move-result-object v5

    invoke-virtual {v5, v3, v4, p2}, LD6/t;->f(IILC6/a;)LC6/i;

    move-result-object v5

    invoke-virtual {v5}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/graphics/Bitmap;->eraseColor(I)V

    sget-object v6, LC6/a;->s:LC6/a;

    if-ne p2, v6, :cond_45

    iget-object v6, p0, LD6/k;->h:Landroid/graphics/Bitmap;

    if-eqz v6, :cond_45

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, LC6/d;->f()F

    move-result p1

    invoke-static {v6, v2, p1, v5}, LG6/b;->b(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLC6/i;)V

    goto :goto_4e

    :cond_45
    iget-object v6, p0, LD6/k;->g:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, LC6/d;->f()F

    move-result p1

    invoke-static {v6, v2, p1, v5}, LG6/b;->b(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLC6/i;)V

    :goto_4e
    iget-object p0, p0, LD6/k;->f:Lq6/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "getBitmapRegion success, type:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " desireSize:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "-"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " consume:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-object v5
.end method

.method private static final i(Landroid/graphics/Rect;LC6/a;LC6/d;LD6/k;)Ljava/lang/String;
    .registers 7

    iget-object v0, p3, LD6/k;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object p3, p3, LD6/k;->g:Landroid/graphics/Bitmap;

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getBitmapRegion: rawRect="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", type:"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cr="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " bitmap=["

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ","

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final j(FLandroid/graphics/PointF;)LC6/d;
    .registers 11

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LD6/k;->m(FLandroid/graphics/PointF;Z)LC6/d;

    move-result-object v1

    invoke-virtual {v1}, LC6/d;->d()Landroid/graphics/Rect;

    move-result-object p1

    iget p2, p0, LD6/k;->k:F

    invoke-static {p1, p2}, LG6/c;->c(Landroid/graphics/Rect;F)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1}, LC6/d;->g()Landroid/graphics/Rect;

    move-result-object p1

    iget p0, p0, LD6/k;->k:F

    invoke-static {p1, p0}, LG6/c;->c(Landroid/graphics/Rect;F)Landroid/graphics/Rect;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, LC6/d;->c(LC6/d;Landroid/graphics/Rect;FFLandroid/graphics/Rect;ILjava/lang/Object;)LC6/d;

    move-result-object p0

    return-object p0
.end method

.method private final l(FLandroid/graphics/PointF;)LC6/d;
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LD6/k;->m(FLandroid/graphics/PointF;Z)LC6/d;

    move-result-object p0

    return-object p0
.end method

.method private final m(FLandroid/graphics/PointF;Z)LC6/d;
    .registers 10

    invoke-direct {p0, p1, p2, p3}, LD6/k;->e(FLandroid/graphics/PointF;Z)Landroid/graphics/Rect;

    move-result-object p2

    iget p3, p2, Landroid/graphics/Rect;->right:I

    int-to-float v0, p3

    iget-object v1, p0, LD6/k;->i:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_36

    iget-object v0, p0, LD6/k;->f:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getWallpaperRect Correction cropRect right:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lq6/b;->e(Ljava/lang/String;)V

    iget-object p3, p0, LD6/k;->i:Landroid/graphics/Point;

    iget p3, p3, Landroid/graphics/Point;->x:I

    int-to-float p3, p3

    mul-float/2addr p3, p1

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p3, v0

    float-to-int p3, p3

    iput p3, p2, Landroid/graphics/Rect;->right:I

    :cond_36
    iget p3, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, p3

    iget-object v1, p0, LD6/k;->i:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_68

    iget-object v0, p0, LD6/k;->f:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getWallpaperRect Correction cropRect bottom:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lq6/b;->e(Ljava/lang/String;)V

    iget-object p3, p0, LD6/k;->i:Landroid/graphics/Point;

    iget p3, p3, Landroid/graphics/Point;->y:I

    int-to-float p3, p3

    mul-float/2addr p3, p1

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p3, v0

    float-to-int p3, p3

    iput p3, p2, Landroid/graphics/Rect;->bottom:I

    :cond_68
    iget-object p3, p0, LD6/k;->j:Landroid/graphics/Point;

    iget v0, p3, Landroid/graphics/Point;->x:I

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-static {p1, p2, v0, p3}, LH3/D;->m(FLandroid/graphics/Rect;II)F

    move-result p3

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    mul-float/2addr v1, p3

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-float v1, v1

    float-to-int v1, v1

    iget v2, p2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    mul-float/2addr v2, p3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    iget v3, p2, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    mul-float/2addr v3, p3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    iget v4, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    mul-float/2addr v4, p3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v1, LC6/d;

    invoke-direct {v1, p2, p1, p3, v0}, LC6/d;-><init>(Landroid/graphics/Rect;FFLandroid/graphics/Rect;)V

    iget-object p1, p0, LD6/k;->f:Lq6/b;

    invoke-virtual {v1}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "getWallpaperRect Correction rawRect:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq6/b;->e(Ljava/lang/String;)V

    invoke-virtual {v1}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v1}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object p2

    iget p2, p2, Landroid/graphics/Rect;->right:I

    iget-object p3, p0, LD6/k;->i:Landroid/graphics/Point;

    iget p3, p3, Landroid/graphics/Point;->x:I

    invoke-static {p2, p3}, LB8/h;->i(II)I

    move-result p2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v1}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object p2

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    iget-object p0, p0, LD6/k;->i:Landroid/graphics/Point;

    iget p0, p0, Landroid/graphics/Point;->y:I

    invoke-static {p2, p0}, LB8/h;->i(II)I

    move-result p0

    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    return-object v1
.end method


# virtual methods
.method public final f(Lcom/nothing/wallpaper/effects/data/model/ViewScope;Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 15

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_f0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC6/a;

    sget-object v3, LD6/k$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_42

    const/4 v4, 0x2

    if-eq v3, v4, :cond_42

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3c

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v3

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v4

    invoke-direct {p0, v3, v4}, LD6/k;->j(FLandroid/graphics/PointF;)LC6/d;

    move-result-object v3

    goto :goto_60

    :cond_3c
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_42
    iget-boolean v3, p0, LD6/k;->e:Z

    if-eqz v3, :cond_54

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v3

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {p0, v3, v4, v5}, LD6/k;->m(FLandroid/graphics/PointF;Z)LC6/d;

    move-result-object v3

    goto :goto_60

    :cond_54
    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v3

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v4

    invoke-direct {p0, v3, v4}, LD6/k;->l(FLandroid/graphics/PointF;)LC6/d;

    move-result-object v3

    :goto_60
    iget-object v4, p0, LD6/k;->d:Lg3/x;

    if-eqz v4, :cond_6b

    iget-object v5, p0, LD6/k;->a:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    goto :goto_6c

    :cond_6b
    move-object v4, v2

    :goto_6c
    iget-object v5, p0, LD6/k;->d:Lg3/x;

    if-eqz v5, :cond_75

    invoke-virtual {v5}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v5

    goto :goto_76

    :cond_75
    move-object v5, v2

    :goto_76
    iget-object v6, p0, LD6/k;->j:Landroid/graphics/Point;

    iget-object v7, p0, LD6/k;->i:Landroid/graphics/Point;

    iget v8, p0, LD6/k;->c:F

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "getBitmapRegion CroppedRect.rawRect is empty.Wallpaper collectionId "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "wallpaperId "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",CropType "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ",wallpaperScreenSize "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ",rawBitmapSize "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ",previewScale:"

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",crop:"

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, LD6/k;->f:Lq6/b;

    invoke-virtual {v5, v4}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {v3}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_e6

    invoke-static {}, LG6/d;->a()Z

    move-result p1

    if-eqz p1, :cond_e0

    iget-object p0, p0, LD6/k;->f:Lq6/b;

    invoke-virtual {p0, v4}, Lq6/b;->e(Ljava/lang/String;)V

    return-object v2

    :cond_e0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e6
    new-instance v2, Lh8/o;

    invoke-direct {v2, v1, v3}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_11

    :cond_f0
    new-instance p2, LD6/k$b;

    invoke-direct {p2, v0, p0, p1, v2}, LD6/k$b;-><init>(Ljava/util/List;LD6/k;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V

    invoke-static {p2, p3}, LF8/M;->e(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final k()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/k;->h:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final n(Landroid/graphics/Bitmap;)V
    .registers 3

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LG6/c;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, LD6/k;->h:Landroid/graphics/Bitmap;

    return-void
.end method
