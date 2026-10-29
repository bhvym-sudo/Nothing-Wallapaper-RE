.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;
    }
.end annotation


# static fields
.field public static final r:Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;


# instance fields
.field private final q:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;

    return-void
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Lt7/a;

    invoke-direct {p2, p1}, Lt7/a;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->q:Lh8/h;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)F
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->b(Landroid/content/Context;)F

    move-result p0

    return p0
.end method

.method private static final b(Landroid/content/Context;)F
    .registers 2

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    invoke-virtual {v0, p0}, LH3/s;->d(Landroid/content/Context;)F

    move-result p0

    return p0
.end method

.method private final c(IF)I
    .registers 3

    int-to-float p0, p1

    mul-float/2addr p0, p2

    float-to-int p0, p0

    return p0
.end method

.method private final getScreenAspectRatio()F
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->q:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method


# virtual methods
.method protected onMeasure(II)V
    .registers 14

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_15e

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/16 v1, 0xc

    invoke-direct {p0, v1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->c(IF)I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingStart()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_7e

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v4

    sub-int v4, p1, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v6

    sub-int/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    sub-int/2addr v6, v5

    mul-int/2addr v6, v0

    sub-int/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    sub-int v0, p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v0, v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    div-int/2addr v4, v6

    sub-int v6, v4, v3

    int-to-float v6, v6

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->getScreenAspectRatio()F

    move-result v7

    mul-float/2addr v6, v7

    int-to-float v3, v3

    add-float/2addr v6, v3

    float-to-int v3, v6

    if-le v3, v0, :cond_70

    int-to-float v3, v0

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->getScreenAspectRatio()F

    move-result v4

    div-float/2addr v3, v4

    float-to-int v4, v3

    goto :goto_71

    :cond_70
    move v0, v3

    :goto_71
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v0

    goto :goto_c2

    :cond_7e
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v4

    sub-int v4, p1, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v6

    sub-int/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int v6, p2, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    sub-int/2addr v7, v5

    mul-int/2addr v7, v0

    sub-int/2addr v6, v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    div-int/2addr v6, v0

    sub-int v0, v6, v3

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->getScreenAspectRatio()F

    move-result v7

    div-float/2addr v0, v7

    int-to-float v3, v3

    add-float/2addr v0, v3

    float-to-int v0, v0

    if-le v0, v4, :cond_b5

    int-to-float v0, v4

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->getScreenAspectRatio()F

    move-result v3

    mul-float/2addr v0, v3

    float-to-int v6, v0

    goto :goto_b6

    :cond_b5
    move v4, v0

    :goto_b6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v0

    :goto_c2
    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {p0, v1, v4}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->c(IF)I

    move-result v1

    invoke-static {p0}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object v4

    invoke-interface {v4}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v6, v2

    :goto_f1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    if-gez v6, :cond_102

    invoke-static {}, Li8/s;->t()V

    :cond_102
    check-cast v7, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    sub-int/2addr v9, v5

    if-ge v6, v9, :cond_10d

    move v6, v5

    goto :goto_10e

    :cond_10d
    move v6, v2

    :goto_10e
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v9

    const-string v10, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-nez v9, :cond_12d

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    if-eqz v9, :cond_127

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v6, :cond_123

    invoke-virtual {v9, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :cond_123
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_13c

    :cond_127
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_12d
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    if-eqz v9, :cond_158

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v6, :cond_139

    iput v1, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_139
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_13c
    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v7, v9, v6}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v6

    if-nez v6, :cond_153

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_156

    :cond_153
    invoke-virtual {p0, v3, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_156
    move v6, v8

    goto :goto_f1

    :cond_158
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_15e
    :goto_15e
    return-void
.end method
