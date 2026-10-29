.class public final Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private M:LX5/a;

.field private N:Ljava/lang/Boolean;

.field private O:LY5/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "QuickLookClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->L:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 2
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final J(LX5/a;LY5/a;)V
    .registers 7

    const/high16 v0, -0x80000000

    if-eqz p2, :cond_9

    invoke-virtual {p2}, LY5/a;->c()I

    move-result v1

    goto :goto_a

    :cond_9
    move v1, v0

    :goto_a
    const-string v2, ""

    if-eqz p2, :cond_14

    invoke-virtual {p2}, LY5/a;->b()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_15

    :cond_14
    move-object p2, v2

    :cond_15
    if-eqz p1, :cond_22

    invoke-virtual {p1}, LX5/a;->h()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {p1}, LX5/a;->f()Ljava/lang/String;

    move-result-object v2

    goto :goto_35

    :cond_22
    if-eq v1, v0, :cond_35

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\u00b0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_35
    :goto_35
    if-eqz p1, :cond_45

    invoke-virtual {p1}, LX5/a;->h()Z

    move-result v3

    if-eqz v3, :cond_45

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, LX5/b;->c(Landroid/content/Context;LX5/a;)Ljava/lang/String;

    move-result-object p2

    :cond_45
    sget v3, LI2/d;->p:I

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_52

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_52
    sget v2, LI2/d;->k:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_5f

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5f
    sget p2, LI2/d;->n:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_7c

    if-eqz p1, :cond_73

    invoke-virtual {p1}, LX5/a;->h()Z

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_73

    goto :goto_75

    :cond_73
    if-eq v1, v0, :cond_78

    :goto_75
    const/16 p1, 0x8

    goto :goto_79

    :cond_78
    const/4 p1, 0x0

    :goto_79
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_7c
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->A()V

    return-void
.end method


# virtual methods
.method protected A()V
    .registers 17

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_12

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_12

    :cond_10
    const/4 v1, 0x0

    goto :goto_13

    :cond_12
    :goto_12
    move v1, v2

    :goto_13
    iget-object v3, v0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->N:Ljava/lang/Boolean;

    if-eqz v3, :cond_1c

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_1d

    :cond_1c
    move v3, v2

    :goto_1d
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, LI2/a;->b:I

    invoke-static {v4, v5}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x106001f

    invoke-static {v5, v6}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x1060028

    invoke-static {v6, v7}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v6

    if-eqz v1, :cond_42

    sget v7, LI2/c;->G0:I

    goto :goto_44

    :cond_42
    sget v7, LI2/c;->F0:I

    :goto_44
    iget-object v8, v0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->M:LX5/a;

    if-eqz v8, :cond_51

    invoke-virtual {v8}, LX5/a;->c()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_52

    :cond_51
    const/4 v8, 0x0

    :goto_52
    const/4 v10, -0x1

    const/4 v11, 0x2

    if-nez v8, :cond_57

    goto :goto_5d

    :cond_57
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eq v12, v2, :cond_71

    :goto_5d
    if-nez v8, :cond_60

    goto :goto_67

    :cond_60
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v11, :cond_67

    goto :goto_71

    :cond_67
    :goto_67
    if-eqz v1, :cond_6b

    move v8, v10

    goto :goto_72

    :cond_6b
    if-eqz v3, :cond_6f

    move v8, v6

    goto :goto_72

    :cond_6f
    move v8, v5

    goto :goto_72

    :cond_71
    :goto_71
    move v8, v4

    :goto_72
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v12

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget v14, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v14, v13, :cond_85

    goto :goto_86

    :cond_85
    move v14, v13

    :goto_86
    int-to-float v13, v14

    int-to-float v14, v11

    mul-float/2addr v12, v14

    sub-float/2addr v13, v12

    float-to-int v12, v13

    mul-int/lit8 v13, v12, 0x68

    div-int/lit16 v13, v13, 0x162

    sget v14, LI2/d;->g:I

    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/LinearLayout;

    if-eqz v14, :cond_bd

    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-static {v15, v7}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_ae

    new-instance v15, Landroid/graphics/PorterDuffColorFilter;

    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v15, v8, v9}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v7, v15}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_af

    :cond_ae
    const/4 v7, 0x0

    :goto_af
    invoke-virtual {v14, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iput v12, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v13, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v14, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_bd
    iget-object v7, v0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->M:LX5/a;

    if-eqz v7, :cond_ca

    invoke-virtual {v7}, LX5/a;->c()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_cb

    :cond_ca
    const/4 v9, 0x0

    :goto_cb
    if-nez v9, :cond_ce

    goto :goto_d4

    :cond_ce
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v2, :cond_e6

    :goto_d4
    if-nez v9, :cond_d7

    goto :goto_de

    :cond_d7
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v11, :cond_de

    goto :goto_e6

    :cond_de
    :goto_de
    if-eqz v1, :cond_e2

    move v4, v10

    goto :goto_ea

    :cond_e2
    if-eqz v3, :cond_e9

    move v4, v5

    goto :goto_ea

    :cond_e6
    :goto_e6
    if-eqz v1, :cond_e9

    goto :goto_ea

    :cond_e9
    move v4, v6

    :goto_ea
    sget v1, LI2/d;->f:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_f7

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_f7
    sget v1, LI2/d;->p:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_104

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_104
    sget v1, LI2/d;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_111

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_111
    sget v1, LI2/d;->n:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_11e

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_11e
    sget v1, LI2/d;->u:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_12b

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_12b
    sget v1, LI2/d;->s:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_13f

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v4, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_13f
    return-void
.end method

.method public F()V
    .registers 3

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->F()V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->M:LX5/a;

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->O:LY5/a;

    invoke-direct {p0, v0, v1}, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->J(LX5/a;LY5/a;)V

    return-void
.end method

.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1c

    sget v0, LI2/d;->f:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    if-eqz p0, :cond_1c

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1c
    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2a

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    sub-int/2addr p0, p3

    div-int/lit8 p0, p0, 0x2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    add-int/2addr p4, p0

    invoke-virtual {p1, p2, p0, p3, p4}, Landroid/view/View;->layout(IIII)V

    :cond_2a
    return-void
.end method

.method protected onMeasure(II)V
    .registers 8

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->measureChildren(II)V

    invoke-super {p0, p1, p2}, Lcom/nothing/systemui/shared/clocks/view/D;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, LI2/b;->n:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result p2

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, LI2/b;->f:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v0

    mul-float/2addr p2, v0

    float-to-int p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LI2/b;->o:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LI2/b;->p:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v2

    mul-float/2addr v1, v2

    sget v2, LI2/d;->l:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    const/4 v3, 0x0

    if-eqz v2, :cond_6d

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-virtual {v2, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    const/4 v4, 0x1

    if-ne p1, v4, :cond_69

    goto :goto_6a

    :cond_69
    move v4, v3

    :goto_6a
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_6d
    sget p1, LI2/d;->s:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    if-eqz p1, :cond_82

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput p2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_82
    sget p1, LI2/d;->f:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_8f

    invoke-virtual {p1, v3, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_8f
    sget p1, LI2/d;->u:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_9c

    invoke-virtual {p1, v3, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_9c
    sget p1, LI2/d;->n:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_a9

    invoke-virtual {p1, v3, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_a9
    sget p1, LI2/d;->p:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_b6

    invoke-virtual {p1, v3, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_b6
    sget p1, LI2/d;->k:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    if-eqz p0, :cond_c3

    invoke-virtual {p0, v3, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_c3
    return-void
.end method

.method public p(LX5/a;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->M:LX5/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->M:LX5/a;

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->O:LY5/a;

    invoke-direct {p0, p1, v0}, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->J(LX5/a;LY5/a;)V

    :cond_f
    return-void
.end method

.method public y(LY5/a;)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->O:LY5/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->O:LY5/a;

    sget-object v0, LY5/b;->a:LY5/b;

    const/4 v1, 0x0

    if-eqz p1, :cond_14

    invoke-virtual {p1}, LY5/a;->a()I

    move-result v2

    goto :goto_15

    :cond_14
    move v2, v1

    :goto_15
    invoke-virtual {v0, v2}, LY5/b;->a(I)I

    move-result v0

    sget v2, LI2/d;->s:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_26

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_26
    sget v2, LI2/d;->u:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_38

    if-nez v0, :cond_33

    goto :goto_35

    :cond_33
    const/16 v1, 0x8

    :goto_35
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_38
    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->M:LX5/a;

    invoke-direct {p0, v0, p1}, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;->J(LX5/a;LY5/a;)V

    :cond_3d
    return-void
.end method
