.class public abstract Ln6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/C;Landroidx/viewpager2/widget/ViewPager2;ZLandroid/animation/ValueAnimator;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Ln6/d;->e(Lkotlin/jvm/internal/C;Landroidx/viewpager2/widget/ViewPager2;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final b(Landroid/content/Context;Landroid/content/res/Resources;I)I
    .registers 4

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    invoke-static {p0, p2}, Li6/q;->c(Landroid/content/Context;I)I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr v0, p0

    const/4 p0, 0x2

    int-to-float p0, p0

    div-float/2addr v0, p0

    float-to-int p0, v0

    return p0
.end method

.method public static final c(Landroidx/viewpager2/widget/ViewPager2;IJLandroid/animation/TimeInterpolator;II)Landroid/animation/Animator;
    .registers 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interpolator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_13

    goto :goto_14

    :cond_13
    move v2, v1

    :goto_14
    add-int/2addr p6, p5

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p5

    sub-int/2addr p1, p5

    mul-int/2addr p6, p1

    filled-new-array {v1, p6}, [I

    move-result-object p1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-instance p5, Lkotlin/jvm/internal/C;

    invoke-direct {p5}, Lkotlin/jvm/internal/C;-><init>()V

    new-instance p6, Ln6/c;

    invoke-direct {p6, p5, p0, v2}, Ln6/c;-><init>(Lkotlin/jvm/internal/C;Landroidx/viewpager2/widget/ViewPager2;Z)V

    invoke-virtual {p1, p6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p5, Ln6/d$a;

    invoke-direct {p5, p0}, Ln6/d$a;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    invoke-virtual {p1, p5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1, p4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic d(Landroidx/viewpager2/widget/ViewPager2;IJLandroid/animation/TimeInterpolator;IIILjava/lang/Object;)Landroid/animation/Animator;
    .registers 16

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_6

    const-wide/16 p2, 0x190

    :cond_6
    move-wide v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_d

    sget-object p4, Lv1/d;->k:Landroid/view/animation/Interpolator;

    :cond_d
    move-object v4, p4

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_16

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p5

    :cond_16
    move v5, p5

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_1c

    const/4 p6, 0x0

    :cond_1c
    move-object v0, p0

    move v1, p1

    move v6, p6

    invoke-static/range {v0 .. v6}, Ln6/d;->c(Landroidx/viewpager2/widget/ViewPager2;IJLandroid/animation/TimeInterpolator;II)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/C;Landroidx/viewpager2/widget/ViewPager2;ZLandroid/animation/ValueAnimator;)V
    .registers 5

    const-string v0, "valueAnimator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v0, p0, Lkotlin/jvm/internal/C;->q:I

    sub-int v0, p3, v0

    int-to-float v0, v0

    if-eqz p2, :cond_1c

    goto :goto_1d

    :cond_1c
    neg-float v0, v0

    :goto_1d
    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->fakeDragBy(F)Z

    iput p3, p0, Lkotlin/jvm/internal/C;->q:I

    return-void
.end method

.method public static final f(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/res/Resources;IIILandroidx/viewpager2/adapter/FragmentStateAdapter;)V
    .registers 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    invoke-virtual {p0, p5}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    instance-of v0, p5, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_21

    check-cast p5, Landroidx/recyclerview/widget/RecyclerView;

    goto :goto_22

    :cond_21
    const/4 p5, 0x0

    :goto_22
    if-eqz p5, :cond_3b

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, p2}, Ln6/d;->b(Landroid/content/Context;Landroid/content/res/Resources;I)I

    move-result p1

    invoke-virtual {p5, p1, p4, p1, p4}, Landroid/view/View;->setPaddingRelative(IIII)V

    invoke-virtual {p5, p4}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    const/4 p1, 0x2

    invoke-virtual {p5, p1}, Landroid/view/View;->setOverScrollMode(I)V

    :cond_3b
    new-instance p1, Landroidx/viewpager2/widget/MarginPageTransformer;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    invoke-direct {p1, p2}, Landroidx/viewpager2/widget/MarginPageTransformer;-><init>(I)V

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(Landroidx/viewpager2/widget/ViewPager2$PageTransformer;)V

    return-void
.end method
