.class public final LE7/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE7/c0$a;
    }
.end annotation


# static fields
.field public static final i:LE7/c0$a;


# instance fields
.field private final a:Landroidx/fragment/app/v;

.field private final b:LE7/Z;

.field private final c:Lh8/h;

.field private final d:Lh8/h;

.field private e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

.field private f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

.field private g:F

.field private h:Landroid/graphics/PointF;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LE7/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE7/c0$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LE7/c0;->i:LE7/c0$a;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/v;LE7/Z;)V
    .registers 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    iput-object p2, p0, LE7/c0;->b:LE7/Z;

    new-instance p1, LE7/a0;

    invoke-direct {p1, p0}, LE7/a0;-><init>(LE7/c0;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LE7/c0;->c:Lh8/h;

    new-instance p1, LE7/b0;

    invoke-direct {p1, p0}, LE7/b0;-><init>(LE7/c0;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LE7/c0;->d:Lh8/h;

    invoke-virtual {p2}, LE7/Z;->E()Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    move-result-object p1

    iput-object p1, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {p2}, LE7/Z;->C()Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    move-result-object p1

    iput-object p1, p0, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    new-instance p1, Landroid/graphics/PointF;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object p1, p0, LE7/c0;->h:Landroid/graphics/PointF;

    return-void
.end method

.method public static synthetic a(LE7/c0;)LH3/k;
    .registers 1

    invoke-static {p0}, LE7/c0;->e(LE7/c0;)LH3/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LE7/c0;)Landroid/graphics/Point;
    .registers 1

    invoke-static {p0}, LE7/c0;->m(LE7/c0;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LE7/c0;)Lo7/g;
    .registers 1

    invoke-direct {p0}, LE7/c0;->f()Lo7/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LE7/c0;)V
    .registers 1

    invoke-direct {p0}, LE7/c0;->r()V

    return-void
.end method

.method private static final e(LE7/c0;)LH3/k;
    .registers 2

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    iget-object p0, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    invoke-interface {v0, p0}, Lh3/H;->e(Landroid/content/Context;)LH3/k;

    move-result-object p0

    return-object p0
.end method

.method private final f()Lo7/g;
    .registers 1

    iget-object p0, p0, LE7/c0;->b:LE7/Z;

    invoke-virtual {p0}, LE7/Z;->v()Lo7/g;

    move-result-object p0

    return-object p0
.end method

.method private final i()LH3/k;
    .registers 1

    iget-object p0, p0, LE7/c0;->c:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH3/k;

    return-object p0
.end method

.method private final j()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, LE7/c0;->d:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Point;

    return-object p0
.end method

.method private final k()Z
    .registers 3

    iget-object p0, p0, LE7/c0;->b:LE7/Z;

    invoke-virtual {p0}, LE7/Z;->F()Lg3/x;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_a

    return v0

    :cond_a
    invoke-virtual {p0}, Lg3/x;->s()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-static {p0}, LG6/e;->i(Lg3/x;)Z

    move-result p0

    if-eqz p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    return v0
.end method

.method private final l(Landroid/view/View;IIII)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    iput p2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p3, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float p4, p4

    invoke-virtual {p1, p4}, Landroid/view/View;->setTranslationX(F)V

    int-to-float p4, p5

    invoke-virtual {p1, p4}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    const/high16 p0, 0x40000000    # 2.0f

    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p4

    invoke-static {p3, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    invoke-virtual {p1, p4, p0}, Landroid/view/View;->measure(II)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0, p0, p2, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private static final m(LE7/c0;)Landroid/graphics/Point;
    .registers 2

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    invoke-direct {p0}, LE7/c0;->i()LH3/k;

    move-result-object p0

    invoke-virtual {p0}, LH3/k;->i()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {v0, p0}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method private final r()V
    .registers 3

    iget-object v0, p0, LE7/c0;->b:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->G()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1e

    :cond_9
    iget-object v0, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getState()Lcom/davemorrissey/labs/subscaleview/ImageViewState;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object p0, p0, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;->getScale()F

    move-result v1

    invoke-virtual {v0}, Lcom/davemorrissey/labs/subscaleview/ImageViewState;->getCenter()Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    :cond_1e
    :goto_1e
    return-void
.end method


# virtual methods
.method public final g()Landroid/graphics/PointF;
    .registers 1

    iget-object p0, p0, LE7/c0;->h:Landroid/graphics/PointF;

    return-object p0
.end method

.method public final h()F
    .registers 1

    iget p0, p0, LE7/c0;->g:F

    return p0
.end method

.method public final n()V
    .registers 11

    invoke-direct {p0}, LE7/c0;->k()Z

    move-result v0

    if-eqz v0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_9
    iget-object v0, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    invoke-static {v0}, LH3/D;->n(Landroid/content/Context;)F

    move-result v0

    :goto_f
    invoke-direct {p0}, LE7/c0;->j()Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    invoke-direct {p0}, LE7/c0;->j()Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-direct {p0}, LE7/c0;->i()LH3/k;

    move-result-object v3

    iget-object v4, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    invoke-virtual {v3, v4}, LH3/k;->n(Landroid/app/Activity;)Z

    move-result v3

    if-nez v3, :cond_3a

    int-to-float v3, v1

    invoke-direct {p0}, LE7/c0;->j()Landroid/graphics/Point;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-direct {p0}, LE7/c0;->j()Landroid/graphics/Point;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    mul-float/2addr v4, v3

    float-to-int v3, v4

    goto :goto_3b

    :cond_3a
    move v3, v1

    :goto_3b
    int-to-float v3, v3

    mul-float/2addr v3, v0

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v6, v3

    int-to-float v3, v2

    mul-float/2addr v3, v0

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v7, v3

    sub-int v3, v1, v6

    div-int/lit8 v3, v3, 0x2

    sub-int v4, v2, v7

    div-int/lit8 v9, v4, 0x2

    iget-object v4, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    invoke-static {v4}, LH3/D;->o(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_5f

    mul-int/lit8 v3, v3, -0x1

    :cond_5f
    move v8, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setAndGetSurfaceSize origWidth:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " origHeight:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " scale:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WallpaperScaleHelper"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setAndGetSurfaceSize     Width:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "     Height:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " left:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " top:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, LE7/c0;->l(Landroid/view/View;IIII)V

    iget-object v5, v4, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-direct/range {v4 .. v9}, LE7/c0;->l(Landroid/view/View;IIII)V

    invoke-direct {v4}, LE7/c0;->f()Lo7/g;

    move-result-object p0

    if-eqz p0, :cond_cb

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {p0, v1, v0}, Lo7/g;->n0(Landroid/graphics/Point;F)V

    :cond_cb
    return-void
.end method

.method public final o()V
    .registers 3

    iget-object v0, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    new-instance v1, LE7/c0$b;

    invoke-direct {v1, p0}, LE7/c0$b;-><init>(LE7/c0;)V

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setOnStateChangedListener(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;)V

    return-void
.end method

.method public final p()V
    .registers 6

    iget-object v0, p0, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget-object v1, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getMaxScale()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMaxScale(F)V

    iget-object v0, p0, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget-object v1, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getMinScale()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinScale(F)V

    invoke-direct {p0}, LE7/c0;->f()Lo7/g;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {v0}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {v0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v0

    goto :goto_29

    :cond_27
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_29
    invoke-direct {p0}, LE7/c0;->f()Lo7/g;

    move-result-object v1

    if-eqz v1, :cond_3a

    invoke-virtual {v1}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v1

    if-eqz v1, :cond_3a

    invoke-virtual {v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v1

    goto :goto_3b

    :cond_3a
    const/4 v1, 0x0

    :goto_3b
    const-string v2, " center="

    const-string v3, "WallpaperScaleHelper"

    if-eqz v1, :cond_61

    iget-object p0, p0, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {p0, v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setScaleAndCenter, depth scale="

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_61
    iget-object v0, p0, LE7/c0;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget v1, p0, LE7/c0;->g:F

    iget-object v4, p0, LE7/c0;->h:Landroid/graphics/PointF;

    invoke-virtual {v0, v1, v4}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    iget v0, p0, LE7/c0;->g:F

    iget-object p0, p0, LE7/c0;->h:Landroid/graphics/PointF;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setScaleAndCenter, depth default scale="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final q(Z)V
    .registers 8

    iget-object v0, p0, LE7/c0;->b:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->z()Landroid/graphics/Point;

    move-result-object v0

    const-string v1, "WallpaperScaleHelper"

    if-nez v0, :cond_10

    const-string p0, "setWallpaperZoomAndScroll but rawWallpaperSize is null."

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_10
    iget-object v2, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {v0, v4}, LH3/D;->j(Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Rect;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setWallpaperZoomAndScroll crop:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " rawWallpaperSize:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " visibleRawWallpaperRect:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_72

    invoke-direct {p0}, LE7/c0;->i()LH3/k;

    move-result-object p1

    iget-object v3, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    invoke-virtual {p1, v3}, LH3/k;->n(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_72

    iget-object p1, p0, LE7/c0;->a:Landroidx/fragment/app/v;

    invoke-static {p1}, LH3/D;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_6c

    iget p1, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    goto :goto_72

    :cond_6c
    iget p1, v2, Landroid/graphics/Rect;->top:I

    const/4 v0, 0x0

    invoke-virtual {v2, v0, p1}, Landroid/graphics/Rect;->offsetTo(II)V

    :cond_72
    :goto_72
    new-instance p1, Landroid/graphics/PointF;

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {p1, v0, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object p1, p0, LE7/c0;->h:Landroid/graphics/PointF;

    new-instance p1, Landroid/graphics/Point;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-direct {p1, v0, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {p1, v4}, LH3/D;->i(Landroid/graphics/Point;Landroid/graphics/Point;)F

    move-result p1

    iput p1, p0, LE7/c0;->g:F

    iget-object v0, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v2, p1}, LB8/h;->e(FF)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMaxScale(F)V

    iget-object p1, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget v0, p0, LE7/c0;->g:F

    invoke-virtual {p1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinScale(F)V

    iget-object p1, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getMaxScale()F

    move-result p1

    iget v0, p0, LE7/c0;->g:F

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setWallpaperZoomAndScroll, maxScale="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, ",minScale="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LE7/c0;->f()Lo7/g;

    move-result-object p1

    if-eqz p1, :cond_dd

    invoke-virtual {p1}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    if-eqz p1, :cond_dd

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result p1

    goto :goto_df

    :cond_dd
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_df
    invoke-direct {p0}, LE7/c0;->f()Lo7/g;

    move-result-object v0

    if-eqz v0, :cond_f0

    invoke-virtual {v0}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v0

    if-eqz v0, :cond_f0

    invoke-virtual {v0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v0

    goto :goto_f1

    :cond_f0
    const/4 v0, 0x0

    :goto_f1
    const-string v2, " center="

    if-eqz v0, :cond_115

    iget-object p0, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {p0, p1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setScaleAndCenter, scale="

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_115
    iget-object p1, p0, LE7/c0;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget v0, p0, LE7/c0;->g:F

    iget-object v3, p0, LE7/c0;->h:Landroid/graphics/PointF;

    invoke-virtual {p1, v0, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    invoke-direct {p0}, LE7/c0;->f()Lo7/g;

    move-result-object p1

    if-eqz p1, :cond_131

    iget-object v0, p0, LE7/c0;->h:Landroid/graphics/PointF;

    iget v3, p0, LE7/c0;->g:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "init"

    invoke-virtual {p1, v0, v3, v4}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    :cond_131
    iget p1, p0, LE7/c0;->g:F

    iget-object p0, p0, LE7/c0;->h:Landroid/graphics/PointF;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setScaleAndCenter, default scale="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
