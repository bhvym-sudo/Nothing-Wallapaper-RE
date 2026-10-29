.class public final Lcom/nothing/wallpaper/widget/PhotoCoverView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private final q:Landroid/view/LayoutInflater;

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:F


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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/widget/PhotoCoverView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->q:Landroid/view/LayoutInflater;

    const p2, 0x1010530

    .line 5
    invoke-static {p1, p2}, LH3/r;->a(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->r:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0704ad

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->s:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0704ae

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->t:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0704b1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->u:I

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0704b2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->v:I

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0704b0

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->w:F

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/PhotoCoverView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final b(Ljava/util/List;)V
    .registers 12

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_88

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_1c

    invoke-static {}, Li8/s;->t()V

    :cond_1c
    check-cast v2, Lcom/android/wallpaper/asset/a;

    iget-object v4, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->q:Landroid/view/LayoutInflater;

    invoke-static {v4, p0, v0}, Le3/h0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/h0;

    move-result-object v4

    const-string v5, "inflate(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v4, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    iget v6, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->w:F

    invoke-virtual {v5, v6}, Lcom/nothing/wallpaper/widget/RoundImageView;->setRoundRadius(F)V

    iget-object v5, v4, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    const-string v6, "image"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v7, :cond_82

    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v9, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->v:I

    iput v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v7, v4, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    iget v9, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->r:I

    invoke-virtual {v2, v5, v7, v9}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    invoke-virtual {v4}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-lez v1, :cond_80

    iget-object v1, v4, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_7a

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->v:I

    div-int/lit8 v4, v4, 0x2

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v4, p0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->t:I

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_80

    :cond_7a
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_80
    :goto_80
    move v1, v3

    goto :goto_b

    :cond_82
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_88
    return-void
.end method

.method private final c(Ljava/util/List;I)V
    .registers 24

    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "inflate(...)"

    const/4 v4, 0x0

    if-eqz v2, :cond_29

    iget-object v1, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->q:Landroid/view/LayoutInflater;

    invoke-static {v1, v0, v4}, Le3/h0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/h0;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    const v3, 0x7f08027b

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    invoke-virtual {v1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_29
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v5, v4

    :goto_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_154

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_43

    invoke-static {}, Li8/s;->t()V

    :cond_43
    check-cast v6, Lcom/android/wallpaper/asset/a;

    iget-object v8, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->q:Landroid/view/LayoutInflater;

    invoke-static {v8, v0, v4}, Le3/h0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/h0;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    iget-object v10, v8, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    iget v11, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->r:I

    invoke-virtual {v6, v9, v10, v11}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    if-nez v5, :cond_65

    invoke-virtual {v8}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_62
    :goto_62
    move v4, v7

    goto/16 :goto_150

    :cond_65
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    const-string v9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    const-string v10, "image"

    const/4 v11, 0x2

    if-ne v6, v11, :cond_ec

    iget v5, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->u:I

    mul-int/lit8 v6, v5, 0x2

    iget v12, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->s:I

    mul-int/lit8 v13, v12, 0x3

    add-int/2addr v6, v13

    if-le v1, v6, :cond_9e

    iget-object v5, v8, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-static {v5, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    if-eqz v6, :cond_98

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v9, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->s:I

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_62

    :cond_98
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9e
    int-to-double v13, v1

    int-to-double v5, v5

    const-wide/high16 v15, 0x3ff8000000000000L    # 1.5

    mul-double/2addr v5, v15

    mul-int/lit8 v12, v12, 0x3

    move-wide/from16 v16, v5

    int-to-double v4, v12

    add-double v5, v16, v4

    cmpl-double v4, v13, v5

    if-lez v4, :cond_62

    iget-object v4, v8, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_e6

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v6, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->s:I

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v4, v8, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_e0

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v6, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->u:I

    div-int/2addr v6, v11

    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_62

    :cond_e0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e6
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_ec
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x3

    if-ne v4, v6, :cond_62

    int-to-double v12, v1

    iget v4, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->u:I

    move v6, v11

    move-wide/from16 v16, v12

    int-to-double v11, v4

    const/4 v4, 0x1

    int-to-double v13, v4

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    move/from16 v20, v6

    move v4, v7

    int-to-double v6, v5

    mul-double v6, v6, v18

    add-double/2addr v13, v6

    mul-double/2addr v11, v13

    add-int/lit8 v5, v5, 0x2

    iget v6, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->s:I

    mul-int/2addr v5, v6

    int-to-double v5, v5

    add-double/2addr v11, v5

    cmpl-double v5, v16, v11

    if-lez v5, :cond_150

    iget-object v5, v8, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-static {v5, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    if-eqz v6, :cond_14a

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->s:I

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v5, v8, Le3/h0;->v:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-static {v5, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    if-eqz v6, :cond_144

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, v0, Lcom/nothing/wallpaper/widget/PhotoCoverView;->u:I

    div-int/lit8 v7, v7, 0x2

    iput v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_150

    :cond_144
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14a
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_150
    :goto_150
    move v5, v4

    const/4 v4, 0x0

    goto/16 :goto_32

    :cond_154
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;IZ)V
    .registers 5

    const-string v0, "asserts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_b

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/widget/PhotoCoverView;->c(Ljava/util/List;I)V

    return-void

    :cond_b
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/widget/PhotoCoverView;->b(Ljava/util/List;)V

    return-void
.end method
