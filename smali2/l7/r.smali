.class public final Ll7/r;
.super Ll7/k;
.source "SourceFile"


# instance fields
.field private final J:Ljava/lang/String;

.field private final K:Ljava/lang/String;

.field private L:Landroidx/constraintlayout/widget/Group;

.field private M:Landroid/view/View;

.field private N:Landroid/widget/ImageView;

.field private O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

.field private P:Landroid/graphics/Point;

.field private final Q:Lh8/h;

.field private R:Landroid/animation/ValueAnimator;

.field private final S:Ll7/r$a;


# direct methods
.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Ll7/k;-><init>()V

    const-string v0, "CropImageFragment"

    iput-object v0, p0, Ll7/r;->J:Ljava/lang/String;

    const-string v0, "is_clean_screen"

    iput-object v0, p0, Ll7/r;->K:Ljava/lang/String;

    const-class v0, Lo7/g;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Ll7/r$d;

    invoke-direct {v1, p0}, Ll7/r$d;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Ll7/r$e;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Ll7/r$e;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, Ll7/r$f;

    invoke-direct {v3, p0}, Ll7/r$f;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ll7/r;->Q:Lh8/h;

    new-instance v0, Ll7/r$a;

    invoke-direct {v0, p0}, Ll7/r$a;-><init>(Ll7/r;)V

    iput-object v0, p0, Ll7/r;->S:Ll7/r$a;

    return-void
.end method

.method private static final A1(Ll7/r;)Lh8/A;
    .registers 4

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lo7/g;->l0(Lo7/g;ZILjava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final B1(Ll7/r;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;
    .registers 3

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lo7/g;->m0(Ljava/lang/Float;Landroid/graphics/PointF;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final C1()V
    .registers 9

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    invoke-virtual {p0}, Ll7/k;->A0()LH3/k;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_10

    invoke-virtual {v1}, LH3/k;->i()Landroid/view/Display;

    move-result-object v1

    goto :goto_11

    :cond_10
    move-object v1, v2

    :goto_11
    invoke-virtual {v0, v1}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LH3/D;->n(Landroid/content/Context;)F

    move-result v1

    iget v3, v0, Landroid/graphics/Point;->x:I

    iget v4, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Ll7/k;->A0()LH3/k;

    move-result-object v5

    if-eqz v5, :cond_3e

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v6

    const-string v7, "requireActivity(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, LH3/k;->n(Landroid/app/Activity;)Z

    move-result v5

    if-nez v5, :cond_3e

    int-to-float v3, v3

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v5, v0

    div-float/2addr v3, v5

    int-to-float v0, v0

    mul-float/2addr v0, v3

    float-to-int v3, v0

    :cond_3e
    int-to-float v0, v3

    mul-float/2addr v0, v1

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v0, v5

    float-to-int v0, v0

    int-to-float v3, v4

    mul-float/2addr v3, v1

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, LH3/D;->o(Landroid/content/Context;)Z

    iget-object v4, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v4, :cond_5f

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    :cond_5f
    if-eqz v2, :cond_63

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_63
    if-eqz v2, :cond_67

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_67
    iget-object v4, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v4, :cond_6e

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6e
    iget-object v2, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v2, :cond_75

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    :cond_75
    iget-object v2, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v2, :cond_86

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v2, v5, v4}, Landroid/view/View;->measure(II)V

    :cond_86
    iget-object v2, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v2, :cond_8e

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v4, v0, v3}, Landroid/view/View;->layout(IIII)V

    :cond_8e
    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p0

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v0, v3}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {p0, v2, v1}, Lo7/g;->n0(Landroid/graphics/Point;F)V

    return-void
.end method

.method private final D1(Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V
    .registers 5

    iput-object p2, p0, Ll7/r;->P:Landroid/graphics/Point;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setFullResBitmap mRawWallpaperSize:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/nothing/wallpaper/common/log/c;->j(Ljava/lang/String;)V

    iget-object p2, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p2, :cond_1d

    invoke-virtual {p2, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    :cond_1d
    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p1

    invoke-virtual {p1}, Lo7/g;->V()Lcom/android/wallpaper/asset/a;

    move-result-object p1

    instance-of p1, p1, Lcom/android/wallpaper/asset/h;

    invoke-direct {p0, p1}, Ll7/r;->G1(Z)V

    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_36

    new-instance p2, Ll7/r$c;

    invoke-direct {p2, p0}, Ll7/r$c;-><init>(Ll7/r;)V

    invoke-virtual {p1, p2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setOnStateChangedListener(Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$OnStateChangedListener;)V

    :cond_36
    return-void
.end method

.method private final E1(Lw6/b;)V
    .registers 7

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object v0

    invoke-virtual {v0}, Lo7/g;->c0()I

    move-result v0

    iget-object v1, p0, Ll7/r;->N:Landroid/widget/ImageView;

    if-eqz v1, :cond_5a

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLowResImage placeHolderColor:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "  image:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/nothing/wallpaper/common/log/c;->j(Ljava/lang/String;)V

    instance-of v2, p1, Lw6/b$a;

    if-eqz v2, :cond_4e

    new-instance v2, Li3/J0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p0}, Ll7/k;->P0()Z

    move-result v4

    invoke-direct {v2, v3, v4}, Li3/J0;-><init>(Landroid/content/Context;Z)V

    check-cast p1, Lw6/b$a;

    invoke-virtual {p1}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p1, p0, v1, v0, v2}, Lcom/android/wallpaper/asset/a;->q(Landroid/app/Activity;Landroid/widget/ImageView;ILcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;)V

    return-void

    :cond_4e
    instance-of p0, p1, Lw6/b$b;

    if-eqz p0, :cond_5a

    new-instance p0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p0, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5a
    return-void
.end method

.method private final F1(Z)V
    .registers 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    move v2, v1

    goto :goto_7

    :cond_6
    move v2, v0

    :goto_7
    iget-object v3, p0, Ll7/r;->L:Landroidx/constraintlayout/widget/Group;

    if-eqz v3, :cond_e

    invoke-virtual {v3, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_e
    if-eqz p1, :cond_32

    invoke-virtual {p0}, Ll7/k;->Q0()Z

    move-result p1

    if-eqz p1, :cond_32

    invoke-virtual {p0}, Ll7/k;->y0()Landroid/widget/ImageButton;

    move-result-object p1

    if-eqz p1, :cond_1f

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1f
    invoke-virtual {p0}, Ll7/k;->E0()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_28

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_28
    invoke-virtual {p0}, Ll7/k;->F0()Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_4d

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_32
    invoke-virtual {p0}, Ll7/k;->y0()Landroid/widget/ImageButton;

    move-result-object p1

    if-eqz p1, :cond_3b

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3b
    invoke-virtual {p0}, Ll7/k;->E0()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_44

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_44
    invoke-virtual {p0}, Ll7/k;->F0()Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_4d

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_4d
    return-void
.end method

.method private final G1(Z)V
    .registers 8

    iget-object v0, p0, Ll7/r;->P:Landroid/graphics/Point;

    if-nez v0, :cond_e

    invoke-virtual {p0}, Ll7/r;->x1()Ljava/lang/String;

    move-result-object p0

    const-string p1, "setWallpaperZoomAndScroll but rawWallpaperSize is null."

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_e
    iget-object v1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v1, :cond_166

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v2, :cond_166

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {v0, v3}, LH3/D;->j(Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p0}, Ll7/r;->x1()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setWallpaperZoomAndScroll screenSize:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "  mRawWallpaperSize:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "  visibleRawWallpaperRect:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_84

    invoke-virtual {p0}, Ll7/k;->A0()LH3/k;

    move-result-object p1

    if-eqz p1, :cond_84

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v2

    const-string v4, "requireActivity(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LH3/k;->n(Landroid/app/Activity;)Z

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_84

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LH3/D;->o(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_7e

    iget p1, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1, p1, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    goto :goto_84

    :cond_7e
    iget p1, v1, Landroid/graphics/Rect;->top:I

    const/4 v0, 0x0

    invoke-virtual {v1, v0, p1}, Landroid/graphics/Rect;->offsetTo(II)V

    :cond_84
    :goto_84
    new-instance p1, Landroid/graphics/PointF;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {p1, v0, v2}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-direct {v0, v2, v1}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {v0, v3}, LH3/D;->i(Landroid/graphics/Point;Landroid/graphics/Point;)F

    move-result v0

    iget-object v1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v1, :cond_b3

    invoke-virtual {p0}, Ll7/k;->z0()F

    move-result v2

    invoke-static {v2, v0}, LB8/h;->e(FF)F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMaxScale(F)V

    :cond_b3
    iget-object v1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v1, :cond_ba

    invoke-virtual {v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinScale(F)V

    :cond_ba
    invoke-virtual {p0}, Ll7/r;->x1()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const/4 v3, 0x0

    if-eqz v2, :cond_cc

    invoke-virtual {v2}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->getMaxScale()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_cd

    :cond_cc
    move-object v2, v3

    :goto_cd
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setDefaultWallpaperZoomAndScroll, maxScale="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",minScale="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object v1

    invoke-virtual {v1}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v1

    if-eqz v1, :cond_f8

    invoke-virtual {v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v1

    goto :goto_fa

    :cond_f8
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_fa
    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object v2

    invoke-virtual {v2}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    if-eqz v2, :cond_108

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v3

    :cond_108
    if-eqz v3, :cond_132

    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_111

    invoke-virtual {p1, v1, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    :cond_111
    invoke-virtual {p0}, Ll7/r;->x1()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setScaleAndCenter, scale="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", center="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_132
    iget-object v1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v1, :cond_139

    invoke-virtual {v1, v0, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    :cond_139
    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-string v3, "init"

    invoke-virtual {v1, p1, v2, v3}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll7/r;->x1()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setScaleAndCenter, default scale="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ",center="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_166
    return-void
.end method

.method public static synthetic o1(Ll7/r;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/r;->z1(Ll7/r;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p1(Ll7/r;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Ll7/r;->B1(Ll7/r;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q1(Ll7/r;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/r;->w1(Ll7/r;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic r1(Ll7/r;)Lh8/A;
    .registers 1

    invoke-static {p0}, Ll7/r;->A1(Ll7/r;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s1(Ll7/r;Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ll7/r;->D1(Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V

    return-void
.end method

.method public static final synthetic t1(Ll7/r;Z)V
    .registers 2

    invoke-direct {p0, p1}, Ll7/r;->F1(Z)V

    return-void
.end method

.method private final u1(ZZ)V
    .registers 7

    const/4 v0, 0x1

    invoke-virtual {p0}, Ll7/k;->O0()Z

    move-result v1

    if-eq v1, p1, :cond_86

    invoke-virtual {p0}, Ll7/k;->M0()Z

    move-result v1

    if-eqz v1, :cond_f

    goto/16 :goto_86

    :cond_f
    iget-object v1, p0, Ll7/r;->R:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-ne v1, v0, :cond_1a

    return-void

    :cond_1a
    const/4 v1, 0x0

    if-eqz p2, :cond_30

    if-nez p1, :cond_30

    invoke-virtual {p0}, Ll7/k;->C0()Lcom/nothing/wallpaper/widget/ToolActionsView;

    move-result-object v2

    if-eqz v2, :cond_2a

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    goto :goto_2b

    :cond_2a
    move v2, v1

    :goto_2b
    cmpl-float v2, v2, v1

    if-lez v2, :cond_30

    goto :goto_86

    :cond_30
    if-eqz p2, :cond_45

    if-eqz p1, :cond_45

    invoke-virtual {p0}, Ll7/k;->C0()Lcom/nothing/wallpaper/widget/ToolActionsView;

    move-result-object p2

    if-eqz p2, :cond_3f

    invoke-virtual {p2}, Landroid/view/View;->getAlpha()F

    move-result p2

    goto :goto_40

    :cond_3f
    move p2, v1

    :goto_40
    cmpg-float p2, p2, v1

    if-nez p2, :cond_45

    return-void

    :cond_45
    invoke-virtual {p0, p1}, Ll7/k;->X0(Z)V

    const/high16 p2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_4f

    move v3, v1

    move v1, p2

    move p2, v3

    :cond_4f
    iget-object p1, p0, Ll7/r;->R:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_58

    iget-object v2, p0, Ll7/r;->S:Ll7/r$a;

    invoke-virtual {p1, v2}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_58
    const/4 p1, 0x2

    new-array p1, p1, [F

    const/4 v2, 0x0

    aput v1, p1, v2

    aput p2, p1, v0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Ll7/r;->R:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_7d

    invoke-virtual {p0}, Ll7/k;->x0()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance p2, Ll7/n;

    invoke-direct {p2, p0}, Ll7/n;-><init>(Ll7/r;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-direct {p0, v0}, Ll7/r;->F1(Z)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_7d
    iget-object p1, p0, Ll7/r;->R:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_86

    iget-object p0, p0, Ll7/r;->S:Ll7/r$a;

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_86
    :goto_86
    return-void
.end method

.method static synthetic v1(Ll7/r;ZZILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x1

    :cond_5
    invoke-direct {p0, p1, p2}, Ll7/r;->u1(ZZ)V

    return-void
.end method

.method private static final w1(Ll7/r;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Ll7/k;->C0()Lcom/nothing/wallpaper/widget/ToolActionsView;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_1d
    invoke-virtual {p0}, Ll7/k;->D0()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_26
    iget-object v0, p0, Ll7/r;->M:Landroid/view/View;

    if-eqz v0, :cond_2d

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_2d
    invoke-virtual {p0}, Ll7/k;->Q0()Z

    move-result v0

    if-eqz v0, :cond_4e

    invoke-virtual {p0}, Ll7/k;->y0()Landroid/widget/ImageButton;

    move-result-object v0

    if-eqz v0, :cond_3c

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_3c
    invoke-virtual {p0}, Ll7/k;->E0()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_45

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_45
    invoke-virtual {p0}, Ll7/k;->F0()Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_4e

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_4e
    return-void
.end method

.method private static final z1(Ll7/r;Landroid/view/View;)V
    .registers 5

    invoke-virtual {p0}, Ll7/k;->O0()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Ll7/r;->v1(Ll7/r;ZZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic G0()Lo7/b;
    .registers 1

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p0

    return-object p0
.end method

.method protected K0(Landroid/view/View;)V
    .registers 5

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ll7/k;->K0(Landroid/view/View;)V

    const v0, 0x7f0a0508

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Ll7/r;->L:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f0a0507

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll7/r;->M:Landroid/view/View;

    const v0, 0x7f0a02c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Ll7/r;->N:Landroid/widget/ImageView;

    if-eqz v0, :cond_34

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/high16 v2, 0x43160000    # 150.0f

    invoke-static {v2, v2, v1}, Landroid/graphics/RenderEffect;->createBlurEffect(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    :cond_34
    const v0, 0x7f0a01f9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iput-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_45

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinimumScaleType(I)V

    :cond_45
    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_4d

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setPanLimit(I)V

    :cond_4d
    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_59

    new-instance v0, Ll7/o;

    invoke-direct {v0, p0}, Ll7/o;-><init>(Ll7/r;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_59
    return-void
.end method

.method protected h1(Lcom/nothing/wallpaper/widget/ToolActionsView;)V
    .registers 3

    const-string v0, "actionBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ll7/k;->h1(Lcom/nothing/wallpaper/widget/ToolActionsView;)V

    invoke-virtual {p0}, Ll7/k;->C0()Lcom/nothing/wallpaper/widget/ToolActionsView;

    move-result-object p0

    if-eqz p0, :cond_17

    sget-object p1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->s:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    filled-new-array {p1}, [Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->c([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V

    :cond_17
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 6

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll7/k;->Y0()V

    const v0, 0x7f0d0124

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll7/r;->K0(Landroid/view/View;)V

    invoke-direct {p0}, Ll7/r;->C1()V

    if-eqz p3, :cond_22

    iget-object p2, p0, Ll7/r;->K:Ljava/lang/String;

    invoke-virtual {p3, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    goto :goto_23

    :cond_22
    move p2, v1

    :goto_23
    invoke-direct {p0, p2, v1}, Ll7/r;->u1(ZZ)V

    return-object p1
.end method

.method public onDestroyView()V
    .registers 3

    invoke-super {p0}, Ll7/k;->onDestroyView()V

    iget-object v0, p0, Ll7/r;->R:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_c

    iget-object v1, p0, Ll7/r;->S:Ll7/r$a;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_c
    iget-object v0, p0, Ll7/r;->R:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_13
    iget-object v0, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->recycle()V

    :cond_1a
    const/4 v0, 0x0

    iput-object v0, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iput-object v0, p0, Ll7/r;->N:Landroid/widget/ImageView;

    iput-object v0, p0, Ll7/r;->M:Landroid/view/View;

    iput-object v0, p0, Ll7/r;->L:Landroidx/constraintlayout/widget/Group;

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 3

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_17

    iget-object v0, p0, Ll7/r;->K:Ljava/lang/String;

    invoke-virtual {p0}, Ll7/k;->O0()Z

    move-result p0

    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_17
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 9

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ll7/k;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v3, Ll7/r$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Ll7/r$b;-><init>(Ll7/r;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_2e

    new-instance p2, Ll7/p;

    invoke-direct {p2, p0}, Ll7/p;-><init>(Ll7/r;)V

    invoke-virtual {p1, p2}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->setOnStateEndListener(Lv8/a;)V

    :cond_2e
    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_3a

    new-instance p2, Ll7/q;

    invoke-direct {p2, p0}, Ll7/q;-><init>(Ll7/r;)V

    invoke-virtual {p1, p2}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->setOnStatePreEndListener(Lv8/p;)V

    :cond_3a
    iget-object p1, p0, Ll7/r;->O:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    if-eqz p1, :cond_4f

    invoke-virtual {p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->isImageLoaded()Z

    move-result p1

    if-nez p1, :cond_4f

    invoke-virtual {p0}, Ll7/r;->y1()Lo7/g;

    move-result-object p1

    invoke-virtual {p1}, Lo7/g;->Z()Lw6/b;

    move-result-object p1

    invoke-direct {p0, p1}, Ll7/r;->E1(Lw6/b;)V

    :cond_4f
    return-void
.end method

.method protected x1()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Ll7/r;->J:Ljava/lang/String;

    return-object p0
.end method

.method protected y1()Lo7/g;
    .registers 1

    iget-object p0, p0, Ll7/r;->Q:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo7/g;

    return-object p0
.end method
