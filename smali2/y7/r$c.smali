.class public final Ly7/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:[Landroid/view/View;

.field private final b:I

.field private final c:I

.field private final d:F

.field private final e:F

.field private f:Landroid/graphics/RectF;


# direct methods
.method public varargs constructor <init>(Landroid/graphics/RectF;[Landroid/view/View;)V
    .registers 7

    const-string v0, "startValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly7/r$c;->a:[Landroid/view/View;

    const/4 v0, 0x0

    aget-object v1, p2, v0

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p0, Ly7/r$c;->b:I

    aget-object v2, p2, v0

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, p0, Ly7/r$c;->c:I

    int-to-float v1, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    iput v1, p0, Ly7/r$c;->d:F

    int-to-float v1, v2

    div-float/2addr v1, v3

    iput v1, p0, Ly7/r$c;->e:F

    iput-object p1, p0, Ly7/r$c;->f:Landroid/graphics/RectF;

    array-length v1, p2

    :goto_2d
    if-ge v0, v1, :cond_3e

    aget-object v2, p2, v0

    iget v3, p0, Ly7/r$c;->d:F

    invoke-virtual {v2, v3}, Landroid/view/View;->setPivotX(F)V

    iget v3, p0, Ly7/r$c;->e:F

    invoke-virtual {v2, v3}, Landroid/view/View;->setPivotY(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2d

    :cond_3e
    invoke-virtual {p0, p1}, Ly7/r$c;->b(Landroid/graphics/RectF;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/RectF;
    .registers 1

    iget-object p0, p0, Ly7/r$c;->f:Landroid/graphics/RectF;

    return-object p0
.end method

.method public final b(Landroid/graphics/RectF;)V
    .registers 8

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly7/r$c;->f:Landroid/graphics/RectF;

    iget v0, p0, Ly7/r$c;->b:I

    if-eqz v0, :cond_45

    iget v0, p0, Ly7/r$c;->c:I

    if-nez v0, :cond_10

    goto :goto_45

    :cond_10
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v1, p0, Ly7/r$c;->b:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    iget v2, p0, Ly7/r$c;->c:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iget v3, p0, Ly7/r$c;->d:F

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iget v3, p0, Ly7/r$c;->e:F

    sub-float/2addr p1, v3

    iget-object p0, p0, Ly7/r$c;->a:[Landroid/view/View;

    array-length v3, p0

    const/4 v4, 0x0

    :goto_32
    if-ge v4, v3, :cond_45

    aget-object v5, p0, v4

    invoke-virtual {v5, v0}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v5, v1}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {v5, p1}, Landroid/view/View;->setTranslationY(F)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_32

    :cond_45
    :goto_45
    return-void
.end method
