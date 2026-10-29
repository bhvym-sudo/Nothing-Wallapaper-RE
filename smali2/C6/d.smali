.class public final LC6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/graphics/Rect;

.field private final b:F

.field private final c:F

.field private final d:Landroid/graphics/Rect;

.field private final e:Lh8/h;

.field private final f:F


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;FFLandroid/graphics/Rect;)V
    .registers 6

    const-string v0, "imageScaledRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperScaledRect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/d;->a:Landroid/graphics/Rect;

    iput p2, p0, LC6/d;->b:F

    iput p3, p0, LC6/d;->c:F

    iput-object p4, p0, LC6/d;->d:Landroid/graphics/Rect;

    new-instance p1, LC6/c;

    invoke-direct {p1, p0}, LC6/c;-><init>(LC6/d;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LC6/d;->e:Lh8/h;

    mul-float/2addr p2, p3

    iput p2, p0, LC6/d;->f:F

    return-void
.end method

.method public static synthetic a(LC6/d;)Landroid/graphics/Rect;
    .registers 1

    invoke-static {p0}, LC6/d;->h(LC6/d;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LC6/d;Landroid/graphics/Rect;FFLandroid/graphics/Rect;ILjava/lang/Object;)LC6/d;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget-object p1, p0, LC6/d;->a:Landroid/graphics/Rect;

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_c

    iget p2, p0, LC6/d;->b:F

    :cond_c
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_12

    iget p3, p0, LC6/d;->c:F

    :cond_12
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_18

    iget-object p4, p0, LC6/d;->d:Landroid/graphics/Rect;

    :cond_18
    invoke-virtual {p0, p1, p2, p3, p4}, LC6/d;->b(Landroid/graphics/Rect;FFLandroid/graphics/Rect;)LC6/d;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LC6/d;)Landroid/graphics/Rect;
    .registers 7

    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, LC6/d;->a:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p0, LC6/d;->b:F

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-float v1, v1

    float-to-int v1, v1

    iget-object v2, p0, LC6/d;->a:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget v3, p0, LC6/d;->b:F

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    iget-object v3, p0, LC6/d;->a:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget v4, p0, LC6/d;->b:F

    div-float/2addr v3, v4

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    iget-object v4, p0, LC6/d;->a:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    iget p0, p0, LC6/d;->b:F

    div-float/2addr v4, p0

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float p0, v4

    float-to-int p0, p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/graphics/Rect;FFLandroid/graphics/Rect;)LC6/d;
    .registers 5

    const-string p0, "imageScaledRect"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "wallpaperScaledRect"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LC6/d;

    invoke-direct {p0, p1, p2, p3, p4}, LC6/d;-><init>(Landroid/graphics/Rect;FFLandroid/graphics/Rect;)V

    return-object p0
.end method

.method public final d()Landroid/graphics/Rect;
    .registers 1

    iget-object p0, p0, LC6/d;->a:Landroid/graphics/Rect;

    return-object p0
.end method

.method public final e()Landroid/graphics/Rect;
    .registers 1

    iget-object p0, p0, LC6/d;->e:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Rect;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LC6/d;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LC6/d;

    iget-object v1, p0, LC6/d;->a:Landroid/graphics/Rect;

    iget-object v3, p1, LC6/d;->a:Landroid/graphics/Rect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, LC6/d;->b:F

    iget v3, p1, LC6/d;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_22

    return v2

    :cond_22
    iget v1, p0, LC6/d;->c:F

    iget v3, p1, LC6/d;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2d

    return v2

    :cond_2d
    iget-object p0, p0, LC6/d;->d:Landroid/graphics/Rect;

    iget-object p1, p1, LC6/d;->d:Landroid/graphics/Rect;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_38

    return v2

    :cond_38
    return v0
.end method

.method public final f()F
    .registers 1

    iget p0, p0, LC6/d;->f:F

    return p0
.end method

.method public final g()Landroid/graphics/Rect;
    .registers 1

    iget-object p0, p0, LC6/d;->d:Landroid/graphics/Rect;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, LC6/d;->a:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LC6/d;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LC6/d;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LC6/d;->d:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Rect;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 8

    iget-object v0, p0, LC6/d;->a:Landroid/graphics/Rect;

    iget v1, p0, LC6/d;->b:F

    iget v2, p0, LC6/d;->c:F

    iget-object v3, p0, LC6/d;->d:Landroid/graphics/Rect;

    invoke-virtual {p0}, LC6/d;->e()Landroid/graphics/Rect;

    move-result-object v4

    iget p0, p0, LC6/d;->f:F

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CropRect(imageScaledRect="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wallpaperScale="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", screenScale="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", wallpaperScaledRect="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rawRect="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scale="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
