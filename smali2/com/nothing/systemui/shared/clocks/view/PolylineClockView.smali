.class public final Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;
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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "PolylineClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->L:Ljava/lang/String;

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->W:Landroid/graphics/Paint;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final J(C)Landroid/graphics/Bitmap;
    .registers 2

    packed-switch p1, :pswitch_data_24

    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->V:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_8
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->U:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_b
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->T:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_e
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->S:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_11
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->R:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_14
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->Q:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_17
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->P:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_1a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->O:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_1d
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->N:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_20
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->M:Landroid/graphics/Bitmap;

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

.method private final K()V
    .registers 10

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->a0:Z

    if-nez v0, :cond_124

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->a0:Z

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "initResource"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#initResource"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LI2/c;->v0:I

    invoke-static {v0, v1}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_3f

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_40

    :cond_3f
    move-object v1, v0

    :goto_40
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->M:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->w0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_58

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_59

    :cond_58
    move-object v1, v0

    :goto_59
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->N:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->x0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_71

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_72

    :cond_71
    move-object v1, v0

    :goto_72
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->O:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->y0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_8a

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_8b

    :cond_8a
    move-object v1, v0

    :goto_8b
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->P:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->z0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_a3

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_a4

    :cond_a3
    move-object v1, v0

    :goto_a4
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->A0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_bc

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_bd

    :cond_bc
    move-object v1, v0

    :goto_bd
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->R:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->B0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_d5

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_d6

    :cond_d5
    move-object v1, v0

    :goto_d6
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->S:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->C0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_ee

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_ef

    :cond_ee
    move-object v1, v0

    :goto_ef
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->T:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->D0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_107

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_108

    :cond_107
    move-object v1, v0

    :goto_108
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->U:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->E0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_11f

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_11f
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->V:Landroid/graphics/Bitmap;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_124
    return-void
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 15

    const/4 v0, 0x1

    const-string v1, "canvas"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->K()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_14

    return-void

    :cond_14
    invoke-static {v1}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_11a

    :cond_1c
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->h:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, LI2/b;->K:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v5

    move v8, v6

    :goto_42
    if-ge v7, v4, :cond_5c

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-direct {p0, v9}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->J(C)Landroid/graphics/Bitmap;

    move-result-object v9

    if-eqz v9, :cond_5a

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v10

    mul-float/2addr v9, v10

    add-float/2addr v8, v9

    add-float/2addr v8, v3

    :cond_5a
    add-int/2addr v7, v0

    goto :goto_42

    :cond_5c
    cmpg-float v4, v8, v6

    if-nez v4, :cond_61

    return-void

    :cond_61
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpl-float v4, v8, v4

    if-lez v4, :cond_6f

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v8, v4

    :cond_6f
    iget-object v4, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->W:Landroid/graphics/Paint;

    new-instance v6, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v7

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8e

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v7

    if-nez v7, :cond_8e

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v7

    if-nez v7, :cond_8e

    const/high16 v7, -0x1000000

    goto :goto_8f

    :cond_8e
    const/4 v7, -0x1

    :goto_8f
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v6, v7, v9}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v4

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->i()Z

    move-result v6

    const/high16 v7, 0x40000000    # 2.0f

    if-eqz v6, :cond_ab

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v8

    div-float/2addr v4, v7

    goto :goto_c9

    :cond_ab
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v6

    if-ne v6, v0, :cond_c9

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v6, v4

    sub-float/2addr v6, v8

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v0

    int-to-float v4, v4

    mul-float/2addr v4, v3

    sub-float v4, v6, v4

    :cond_c9
    :goto_c9
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    :goto_cd
    if-ge v5, v6, :cond_11a

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-direct {p0, v8}, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->J(C)Landroid/graphics/Bitmap;

    move-result-object v8

    if-eqz v8, :cond_118

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v11

    mul-float/2addr v10, v11

    sub-float/2addr v9, v10

    div-float/2addr v9, v7

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v10

    if-eqz v10, :cond_f1

    goto :goto_f2

    :cond_f1
    sub-float/2addr v9, v2

    :goto_f2
    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v11

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v12

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v10, v4, v9}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v9, Lh8/A;->a:Lh8/A;

    iget-object v9, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->W:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v10, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v9

    mul-float/2addr v8, v9

    add-float/2addr v8, v3

    add-float/2addr v4, v8

    :cond_118
    add-int/2addr v5, v0

    goto :goto_cd

    :cond_11a
    :goto_11a
    return-void
.end method

.method public z()V
    .registers 10

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->M:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->N:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->O:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->P:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->Q:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->R:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->S:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->T:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->U:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->V:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->v0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_2b

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_2c

    :cond_2b
    move-object v1, v0

    :goto_2c
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->M:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->w0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_44

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_45

    :cond_44
    move-object v1, v0

    :goto_45
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->N:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->x0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_5d

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_5e

    :cond_5d
    move-object v1, v0

    :goto_5e
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->O:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->y0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_76

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_77

    :cond_76
    move-object v1, v0

    :goto_77
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->P:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->z0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_8f

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_90

    :cond_8f
    move-object v1, v0

    :goto_90
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->A0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_a8

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_a9

    :cond_a8
    move-object v1, v0

    :goto_a9
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->R:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->B0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_c1

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_c2

    :cond_c1
    move-object v1, v0

    :goto_c2
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->S:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->C0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_da

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_db

    :cond_da
    move-object v1, v0

    :goto_db
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->T:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->D0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_f3

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_f4

    :cond_f3
    move-object v1, v0

    :goto_f4
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->U:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->E0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_10b

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_10b
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/PolylineClockView;->V:Landroid/graphics/Bitmap;

    return-void
.end method
