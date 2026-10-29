.class public final Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private M:Landroid/graphics/Bitmap;

.field private N:Landroid/graphics/Bitmap;

.field private O:Landroid/graphics/Bitmap;

.field private P:Landroid/graphics/Bitmap;

.field private Q:Landroid/graphics/Bitmap;

.field private R:Landroid/graphics/Bitmap;

.field private S:Landroid/graphics/Bitmap;

.field private T:Landroid/graphics/Bitmap;

.field private U:Landroid/graphics/Bitmap;

.field private V:Landroid/graphics/Bitmap;

.field private final W:Landroid/graphics/Paint;

.field private a0:Z


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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "NTypeClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->L:Ljava/lang/String;

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->W:Landroid/graphics/Paint;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final J(I)Landroid/graphics/Bitmap;
    .registers 9

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v0, 0x0

    if-eqz v1, :cond_15

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_16

    :cond_15
    move-object v1, v0

    :goto_16
    if-eqz v1, :cond_20

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-nez v2, :cond_1f

    goto :goto_20

    :cond_1f
    return-object v1

    :cond_20
    :goto_20
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->getTag()Ljava/lang/String;

    move-result-object p0

    if-eqz v1, :cond_2e

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_2e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "null or invalid drawable bitmap for id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", width: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method private final K(C)Landroid/graphics/Bitmap;
    .registers 2

    packed-switch p1, :pswitch_data_24

    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->V:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_8
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->U:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_b
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->T:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_e
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->S:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_11
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->R:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_14
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->Q:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_17
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->P:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_1a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->O:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_1d
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->N:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_20
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->M:Landroid/graphics/Bitmap;

    return-object p0

    nop

    :pswitch_data_24
    .packed-switch 0x30
        :pswitch_20
        :pswitch_1d
        :pswitch_1a
        :pswitch_17
        :pswitch_14
        :pswitch_11
        :pswitch_e
        :pswitch_b
        :pswitch_8
        :pswitch_5
    .end packed-switch
.end method

.method private final L(Ljava/lang/String;I)F
    .registers 8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    const-string v2, "substring(...)"

    const/4 v3, 0x2

    const-string v4, ""

    if-eq v0, v1, :cond_1f

    const/4 v1, 0x4

    if-eq v0, v1, :cond_10

    goto :goto_29

    :cond_10
    if-eqz p2, :cond_15

    if-eq p2, v3, :cond_15

    goto :goto_29

    :cond_15
    add-int/lit8 v0, p2, 0x2

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_29

    :cond_1f
    const/4 v0, 0x1

    if-ne p2, v0, :cond_29

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_29
    :goto_29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, LI2/b;->J:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    neg-float p1, p1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result p0

    mul-float/2addr p1, p0

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result p0

    const/16 p2, 0x623

    if-eq p0, p2, :cond_60

    const/16 p2, 0x626

    if-eq p0, p2, :cond_56

    const/16 p2, 0x628

    if-eq p0, p2, :cond_4a

    goto :goto_68

    :cond_4a
    const-string p0, "19"

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_53

    goto :goto_68

    :cond_53
    int-to-float p0, v3

    :goto_54
    mul-float/2addr p1, p0

    return p1

    :cond_56
    const-string p0, "17"

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5f

    goto :goto_68

    :cond_5f
    return p1

    :cond_60
    const-string p0, "14"

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6a

    :goto_68
    const/4 p0, 0x0

    return p0

    :cond_6a
    const/4 p0, 0x6

    int-to-float p0, p0

    goto :goto_54
.end method

.method private final M()V
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->a0:Z

    if-nez v0, :cond_13

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->a0:Z

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "initResource"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->z()V

    :cond_13
    return-void
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v7, 0x1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->M()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "drawClock, time: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", scaleRatio: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3c

    goto :goto_42

    :cond_3c
    invoke-static {v8}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5b

    :goto_42
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "drawClock with invalide time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->w:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v9, v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->v:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v10, v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->r:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v11, v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->h:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v12, v2, v3

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v3

    move v6, v4

    :goto_a3
    const/4 v13, 0x2

    const/4 v14, 0x3

    if-ge v5, v2, :cond_ce

    invoke-virtual {v8, v5}, Ljava/lang/String;->charAt(I)C

    move-result v15

    invoke-direct {v0, v15}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->K(C)Landroid/graphics/Bitmap;

    move-result-object v15

    if-eqz v15, :cond_cc

    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    int-to-float v15, v15

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v16

    mul-float v15, v15, v16

    add-float/2addr v6, v15

    invoke-direct {v0, v8, v5}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->L(Ljava/lang/String;I)F

    move-result v15

    add-float/2addr v6, v15

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v15

    sub-int/2addr v15, v5

    if-ne v15, v14, :cond_cc

    int-to-float v13, v13

    mul-float/2addr v13, v11

    add-float/2addr v6, v13

    :cond_cc
    add-int/2addr v5, v7

    goto :goto_a3

    :cond_ce
    cmpg-float v2, v6, v4

    if-nez v2, :cond_dc

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "drawClock with clockWidth==0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_dc
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, v6, v2

    if-lez v2, :cond_ea

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v6, v2

    :cond_ea
    iget-object v2, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->W:Landroid/graphics/Paint;

    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v5

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5, v15}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_109

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v5

    if-nez v5, :cond_109

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v5

    if-nez v5, :cond_109

    const/high16 v5, -0x1000000

    goto :goto_10a

    :cond_109
    const/4 v5, -0x1

    :goto_10a
    sget-object v15, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5, v15}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->i()Z

    move-result v4

    const/high16 v15, 0x40000000    # 2.0f

    if-eqz v4, :cond_126

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v6

    div-float/2addr v2, v15

    goto :goto_13c

    :cond_126
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v4

    if-ne v4, v7, :cond_13c

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v2

    sub-float v2, v4, v6

    :cond_13c
    :goto_13c
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v4

    :goto_140
    if-ge v3, v4, :cond_1ee

    invoke-virtual {v8, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-direct {v0, v5}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->K(C)Landroid/graphics/Bitmap;

    move-result-object v5

    if-eqz v5, :cond_1dc

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    move/from16 v16, v7

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v17

    mul-float v7, v7, v17

    sub-float/2addr v6, v7

    div-float/2addr v6, v15

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v7

    if-eqz v7, :cond_167

    goto :goto_168

    :cond_167
    sub-float/2addr v6, v12

    :goto_168
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v13

    invoke-virtual {v7, v15, v13}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v7, v2, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v13, Lh8/A;->a:Lh8/A;

    iget-object v13, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->W:Landroid/graphics/Paint;

    invoke-virtual {v1, v5, v7, v13}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v13

    mul-float/2addr v7, v13

    add-float/2addr v2, v7

    invoke-direct {v0, v8, v3}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->L(Ljava/lang/String;I)F

    move-result v7

    add-float/2addr v2, v7

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v3

    if-ne v7, v14, :cond_1d6

    add-float v7, v2, v11

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    mul-float/2addr v2, v5

    const/4 v13, 0x2

    int-to-float v5, v13

    div-float/2addr v2, v5

    add-float/2addr v2, v12

    div-float v15, v10, v5

    sub-float/2addr v2, v15

    div-float v15, v9, v5

    sub-float/2addr v2, v15

    add-float v18, v6, v2

    sub-float v2, v7, v15

    move v5, v3

    sub-float v3, v18, v15

    move v6, v4

    add-float v4, v7, v15

    move/from16 v19, v5

    add-float v5, v18, v15

    move/from16 v20, v6

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->W:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    add-float v1, v10, v9

    add-float v18, v18, v1

    sub-float v3, v18, v15

    add-float v5, v18, v15

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->W:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    add-float v2, v7, v11

    goto :goto_1e2

    :cond_1d6
    move/from16 v19, v3

    move/from16 v20, v4

    const/4 v13, 0x2

    goto :goto_1e2

    :cond_1dc
    move/from16 v19, v3

    move/from16 v20, v4

    move/from16 v16, v7

    :goto_1e2
    add-int/lit8 v3, v19, 0x1

    move-object/from16 v1, p1

    move/from16 v7, v16

    move/from16 v4, v20

    const/high16 v15, 0x40000000    # 2.0f

    goto/16 :goto_140

    :cond_1ee
    return-void
.end method

.method public z()V
    .registers 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->M:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->N:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->O:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->P:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->Q:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->R:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->S:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->T:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->U:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->V:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->c0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->M:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->e0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->N:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->g0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->O:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->i0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->P:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->k0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->Q:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->m0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->R:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->o0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->S:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->q0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->T:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->s0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->U:Landroid/graphics/Bitmap;

    sget v0, LI2/c;->u0:I

    invoke-direct {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->J(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView_16B;->V:Landroid/graphics/Bitmap;

    return-void
.end method
