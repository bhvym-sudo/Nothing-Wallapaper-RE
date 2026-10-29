.class public final Lcom/nothing/wallpaper/widget/PreviewSectionLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private final q:Ljava/lang/String;

.field private r:I

.field private s:I

.field private final t:Landroid/view/animation/AccelerateInterpolator;

.field private final u:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    const-string p2, "PreviewSectionLayout"

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->q:Ljava/lang/String;

    .line 5
    new-instance p2, Landroid/view/animation/AccelerateInterpolator;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Landroid/view/animation/AccelerateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->t:Landroid/view/animation/AccelerateInterpolator;

    .line 6
    invoke-static {p1}, LH3/D;->o(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->u:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 2
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final b(IF)V
    .registers 5

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p2, v0

    const/4 v1, 0x0

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    move v0, v1

    :goto_11
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, v0, p1}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->c(ZLandroid/view/View;)V

    const/4 p0, 0x0

    cmpg-float p0, p2, p0

    if-nez p0, :cond_1e

    const/16 v1, 0x8

    :cond_1e
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final c(ZLandroid/view/View;)V
    .registers 4

    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_21

    check-cast p2, Landroid/view/ViewGroup;

    invoke-static {p2}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object p2

    invoke-interface {p2}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, p1, v0}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->c(ZLandroid/view/View;)V

    goto :goto_11

    :cond_21
    return-void
.end method


# virtual methods
.method public final a(IF)V
    .registers 5

    iget v0, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->r:I

    if-eqz v0, :cond_3a

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3a

    if-ltz p1, :cond_3a

    if-ge p1, v1, :cond_3a

    iget v0, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->r:I

    if-nez p1, :cond_19

    int-to-float v0, v0

    mul-float/2addr v0, p2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    :cond_19
    iput v0, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->s:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setScrollX(I)V

    if-nez p1, :cond_24

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float p2, p1, p2

    :cond_24
    const/4 p1, 0x1

    int-to-float v0, p1

    sub-float/2addr v0, p2

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->t:Landroid/view/animation/AccelerateInterpolator;

    invoke-virtual {v1, p2}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F

    move-result p2

    const/4 v1, 0x0

    invoke-direct {p0, v1, p2}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->b(IF)V

    iget-object p2, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->t:Landroid/view/animation/AccelerateInterpolator;

    invoke-virtual {p2, v0}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F

    move-result p2

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->b(IF)V

    :cond_3a
    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 14

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_e8

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p1

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p2

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_94

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v4, :cond_34

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v3}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v3

    goto :goto_35

    :cond_34
    move v3, p3

    :goto_35
    add-int/2addr v3, p1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v5, :cond_41

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_42

    :cond_41
    move-object v4, v2

    :goto_42
    if-eqz v4, :cond_47

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_48

    :cond_47
    move v4, p3

    :goto_48
    add-int/2addr v4, p2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v6, :cond_58

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v5}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v5

    goto :goto_59

    :cond_58
    move v5, p3

    :goto_59
    sub-int v5, p4, v5

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    instance-of v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v7, :cond_66

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_67

    :cond_66
    move-object v6, v2

    :goto_67
    if-eqz v6, :cond_6c

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_6d

    :cond_6c
    move v6, p3

    :goto_6d
    sub-int v6, p5, v6

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->layout(IIII)V

    instance-of v3, v0, Landroid/view/ViewGroup;

    if-eqz v3, :cond_79

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_7a

    :cond_79
    move-object v0, v2

    :goto_7a
    if-eqz v0, :cond_87

    invoke-virtual {v0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_87

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    goto :goto_88

    :cond_87
    move v0, p3

    :goto_88
    iput v0, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->r:I

    iget-boolean v3, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->u:Z

    if-eqz v3, :cond_90

    const/4 v3, -0x1

    goto :goto_91

    :cond_90
    move v3, v1

    :goto_91
    mul-int/2addr v0, v3

    iput v0, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->r:I

    :cond_94
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_e8

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v3, :cond_a9

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v1

    goto :goto_aa

    :cond_a9
    move v1, p3

    :goto_aa
    add-int/2addr p1, v1

    iget v1, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->r:I

    add-int/2addr p1, v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v3, :cond_b9

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_ba

    :cond_b9
    move-object v1, v2

    :goto_ba
    if-eqz v1, :cond_bf

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_c0

    :cond_bf
    move v1, p3

    :goto_c0
    add-int/2addr p2, v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v3, :cond_d0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v1

    goto :goto_d1

    :cond_d0
    move v1, p3

    :goto_d1
    sub-int/2addr p4, v1

    iget p0, p0, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->r:I

    add-int/2addr p4, p0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_e0

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    :cond_e0
    if-eqz v2, :cond_e4

    iget p3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_e4
    sub-int/2addr p5, p3

    invoke-virtual {v0, p1, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_e8
    :goto_e8
    return-void
.end method
