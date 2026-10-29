.class public final Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private M:LX5/a;

.field private N:Landroid/graphics/Bitmap;

.field private O:Landroid/graphics/Bitmap;

.field private P:Landroid/graphics/Bitmap;

.field private Q:Landroid/graphics/Bitmap;

.field private R:Landroid/graphics/Bitmap;

.field private S:Landroid/graphics/Bitmap;

.field private T:Landroid/graphics/Bitmap;

.field private U:Landroid/graphics/Bitmap;

.field private V:Landroid/graphics/Bitmap;

.field private W:Landroid/graphics/Bitmap;

.field private a0:Landroid/graphics/Bitmap;

.field private b0:Landroid/graphics/Bitmap;

.field private c0:Landroid/graphics/Bitmap;

.field private d0:Landroid/graphics/Bitmap;

.field private e0:Landroid/graphics/Bitmap;

.field private f0:Landroid/graphics/Bitmap;

.field private g0:Landroid/graphics/Bitmap;

.field private h0:Landroid/graphics/Bitmap;

.field private i0:Landroid/graphics/Bitmap;

.field private j0:Landroid/graphics/Bitmap;

.field private final k0:Landroid/graphics/Paint;

.field private l0:LY5/a;

.field private m0:I

.field private n0:Z


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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "GeneralClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->L:Ljava/lang/String;

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->k0:Landroid/graphics/Paint;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final J(CZ)Landroid/graphics/Bitmap;
    .registers 3

    packed-switch p1, :pswitch_data_56

    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    if-eqz p2, :cond_a

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->j0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->i0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_d
    if-eqz p2, :cond_12

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->h0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_12
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->g0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_15
    if-eqz p2, :cond_1a

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->f0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_1a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->e0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_1d
    if-eqz p2, :cond_22

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->d0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_22
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->c0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_25
    if-eqz p2, :cond_2a

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->b0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_2a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->a0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_2d
    if-eqz p2, :cond_32

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->W:Landroid/graphics/Bitmap;

    return-object p0

    :cond_32
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->V:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_35
    if-eqz p2, :cond_3a

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->U:Landroid/graphics/Bitmap;

    return-object p0

    :cond_3a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->T:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_3d
    if-eqz p2, :cond_42

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->S:Landroid/graphics/Bitmap;

    return-object p0

    :cond_42
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->R:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_45
    if-eqz p2, :cond_4a

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->Q:Landroid/graphics/Bitmap;

    return-object p0

    :cond_4a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->P:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_4d
    if-eqz p2, :cond_52

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->O:Landroid/graphics/Bitmap;

    return-object p0

    :cond_52
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->N:Landroid/graphics/Bitmap;

    return-object p0

    nop

    :pswitch_data_56
    .packed-switch 0x30
        :pswitch_4d
        :pswitch_45
        :pswitch_3d
        :pswitch_35
        :pswitch_2d
        :pswitch_25
        :pswitch_1d
        :pswitch_15
        :pswitch_d
        :pswitch_5
    .end packed-switch
.end method

.method private final K()V
    .registers 10

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->n0:Z

    if-nez v0, :cond_221

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->n0:Z

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "initResource"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#initResource"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LI2/c;->d:I

    invoke-static {v0, v1}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_42

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_43

    :cond_42
    move-object v1, v0

    :goto_43
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->N:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->e:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_5b

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_5c

    :cond_5b
    move-object v1, v0

    :goto_5c
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->O:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->f:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_74

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_75

    :cond_74
    move-object v1, v0

    :goto_75
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->P:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->g:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_8d

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_8e

    :cond_8d
    move-object v1, v0

    :goto_8e
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->h:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_a6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_a7

    :cond_a6
    move-object v1, v0

    :goto_a7
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->R:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->i:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_bf

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_c0

    :cond_bf
    move-object v1, v0

    :goto_c0
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->S:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->j:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_d8

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_d9

    :cond_d8
    move-object v1, v0

    :goto_d9
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->T:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->k:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_f1

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_f2

    :cond_f1
    move-object v1, v0

    :goto_f2
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->U:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->l:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_10a

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_10b

    :cond_10a
    move-object v1, v0

    :goto_10b
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->V:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->m:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_123

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_124

    :cond_123
    move-object v1, v0

    :goto_124
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->W:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->n:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_13c

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_13d

    :cond_13c
    move-object v1, v0

    :goto_13d
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->a0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->o:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_155

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_156

    :cond_155
    move-object v1, v0

    :goto_156
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->b0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->p:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_16e

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_16f

    :cond_16e
    move-object v1, v0

    :goto_16f
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->c0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->q:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_187

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_188

    :cond_187
    move-object v1, v0

    :goto_188
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->d0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->r:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1a0

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1a1

    :cond_1a0
    move-object v1, v0

    :goto_1a1
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->e0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->s:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1b9

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1ba

    :cond_1b9
    move-object v1, v0

    :goto_1ba
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->t:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1d2

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1d3

    :cond_1d2
    move-object v1, v0

    :goto_1d3
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->g0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->u:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1eb

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1ec

    :cond_1eb
    move-object v1, v0

    :goto_1ec
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->h0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->v:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_204

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_205

    :cond_204
    move-object v1, v0

    :goto_205
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->i0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->w:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_21c

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_21c
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->j0:Landroid/graphics/Bitmap;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_221
    return-void
.end method

.method private final L(LX5/a;LY5/a;)V
    .registers 13

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

    move-result-object v3

    if-nez v3, :cond_15

    :cond_14
    move-object v3, v2

    :cond_15
    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p1, :cond_21

    invoke-virtual {p1}, LX5/a;->h()Z

    move-result v6

    if-eqz v6, :cond_21

    move v6, v4

    goto :goto_22

    :cond_21
    move v6, v5

    :goto_22
    if-eqz v6, :cond_2d

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LX5/b;->c(Landroid/content/Context;LX5/a;)Ljava/lang/String;

    move-result-object v0

    goto :goto_42

    :cond_2d
    if-eq v1, v0, :cond_41

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u00b0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_42

    :cond_41
    move-object v0, v2

    :goto_42
    if-eqz v6, :cond_4d

    if-eqz p1, :cond_4c

    invoke-virtual {p1}, LX5/a;->d()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4d

    :cond_4c
    move-object v3, v2

    :cond_4d
    if-eqz p1, :cond_59

    invoke-virtual {p1}, LX5/a;->h()Z

    move-result v1

    if-ne v1, v4, :cond_59

    invoke-virtual {p1}, LX5/a;->f()Ljava/lang/String;

    move-result-object v2

    :cond_59
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_72

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_72

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_72

    goto :goto_73

    :cond_72
    move v4, v5

    :goto_73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, LI2/b;->m:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v1

    mul-float/2addr p1, v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v7, LI2/b;->p:I

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v7

    mul-float/2addr v1, v7

    sget v7, LI2/d;->j:I

    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    const/16 v8, 0x8

    if-eqz v7, :cond_a5

    if-eqz v4, :cond_a1

    move v9, v8

    goto :goto_a2

    :cond_a1
    move v9, v5

    :goto_a2
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_a5
    sget v7, LI2/d;->n:I

    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_b7

    if-eqz v4, :cond_b3

    move v9, v5

    goto :goto_b4

    :cond_b3
    move v9, v8

    :goto_b4
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_b7
    sget v7, LI2/d;->s:I

    invoke-virtual {p0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_db

    if-nez v6, :cond_c7

    if-eqz v4, :cond_c6

    goto :goto_c7

    :cond_c6
    move v8, v5

    :cond_c7
    :goto_c7
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object v4, LY5/b;->a:LY5/b;

    if-eqz p2, :cond_d3

    invoke-virtual {p2}, LY5/a;->a()I

    move-result p2

    goto :goto_d4

    :cond_d3
    move p2, v5

    :goto_d4
    invoke-virtual {v4, p2}, LY5/b;->a(I)I

    move-result p2

    invoke-virtual {v7, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_db
    sget p2, LI2/d;->m:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_f7

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_f3

    move v0, p1

    goto :goto_f4

    :cond_f3
    move v0, v1

    :goto_f4
    invoke-virtual {p2, v5, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_f7
    sget p2, LI2/d;->o:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_136

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_10e

    goto :goto_10f

    :cond_10e
    move p1, v1

    :goto_10f
    invoke-virtual {p2, v5, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, LI2/b;->b:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v6, :cond_130

    move v5, p1

    :cond_130
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_136
    sget p1, LI2/d;->p:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_143

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_143
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->A()V

    return-void
.end method

.method private final M()V
    .registers 12

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LI2/b;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->g:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, LI2/b;->o:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, LI2/b;->p:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    mul-float/2addr v4, v5

    iget v5, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->m0:I

    if-lez v5, :cond_47

    goto :goto_72

    :cond_47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v5, v6, :cond_68

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    goto :goto_72

    :cond_68
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    :goto_72
    int-to-float v5, v5

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float/2addr v0, v6

    sub-float/2addr v5, v0

    float-to-int v0, v5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, LI2/b;->e:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v6

    mul-float/2addr v5, v6

    float-to-int v5, v5

    sget v6, LI2/d;->g:I

    invoke-virtual {p0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    const/4 v7, 0x0

    if-eqz v6, :cond_c1

    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, LI2/b;->l:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v9

    mul-float/2addr v8, v9

    float-to-int v8, v8

    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, LI2/b;->j:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v10

    mul-float/2addr v9, v10

    float-to-int v9, v9

    invoke-virtual {v6, v7, v8, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iput v0, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v5, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_c1
    sget v0, LI2/d;->s:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_e3

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_e3
    sget v0, LI2/d;->p:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_111

    invoke-virtual {v0, v7, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LI2/b;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v2, v7, v7, v7, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_111
    sget v0, LI2/d;->n:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    if-eqz p0, :cond_11e

    invoke-virtual {p0, v7, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_11e
    return-void
.end method


# virtual methods
.method protected A()V
    .registers 4

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->A()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v0

    if-nez v0, :cond_1e

    const/high16 v0, -0x1000000

    goto :goto_1f

    :cond_1e
    const/4 v0, -0x1

    :goto_1f
    sget v1, LI2/d;->m:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_2c

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2c
    sget v1, LI2/d;->o:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_39

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_39
    sget v1, LI2/d;->p:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_46

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_46
    sget v1, LI2/d;->n:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_53

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_53
    sget v1, LI2/d;->s:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    if-eqz p0, :cond_67

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v0, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_67
    return-void
.end method

.method public F()V
    .registers 3

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->F()V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->l0:LY5/a;

    invoke-direct {p0, v0, v1}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->L(LX5/a;LY5/a;)V

    return-void
.end method

.method public H()V
    .registers 3

    const-string v0, "customization.general_clock"

    const/16 v1, 0x1e0

    invoke-static {v0, v1}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/D;->setSnapshotRatio(F)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getSnapshotRatio()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/D;->setScaleRatio(F)V

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M()V

    return-void
.end method

.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v7, 0x1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->K()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_18

    return-void

    :cond_18
    invoke-static {v8}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_20

    goto/16 :goto_197

    :cond_20
    iget-object v2, v0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    if-eqz v2, :cond_3f

    invoke-virtual {v2}, LX5/a;->h()Z

    move-result v2

    if-ne v2, v7, :cond_3f

    iget-object v2, v0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    if-eqz v2, :cond_33

    invoke-virtual {v2}, LX5/a;->f()Ljava/lang/String;

    move-result-object v2

    goto :goto_34

    :cond_33
    const/4 v2, 0x0

    :goto_34
    if-eqz v2, :cond_3f

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3d

    goto :goto_3f

    :cond_3d
    move v9, v7

    goto :goto_40

    :cond_3f
    :goto_3f
    const/4 v9, 0x0

    :goto_40
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, LI2/b;->l:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float v10, v2, v4

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, LI2/b;->i:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    mul-float v11, v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, LI2/b;->t:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    mul-float v12, v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, LI2/b;->q:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    mul-float v13, v4, v5

    iget-object v4, v0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->k0:Landroid/graphics/Paint;

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v6

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v14}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a3

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v6

    if-nez v6, :cond_a3

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v6

    if-nez v6, :cond_a3

    const/high16 v6, -0x1000000

    goto :goto_a4

    :cond_a3
    const/4 v6, -0x1

    :goto_a4
    sget-object v14, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v14}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x0

    move v14, v5

    const/4 v6, 0x0

    :goto_b3
    const/4 v15, 0x2

    move/from16 v16, v7

    const/4 v7, 0x3

    if-ge v6, v4, :cond_de

    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-direct {v0, v3, v9}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->J(CZ)Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_d9

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v18

    mul-float v3, v3, v18

    add-float/2addr v14, v3

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v6

    if-ne v3, v7, :cond_d9

    int-to-float v3, v15

    mul-float/2addr v3, v11

    add-float/2addr v14, v3

    :cond_d9
    add-int/lit8 v6, v6, 0x1

    move/from16 v7, v16

    goto :goto_b3

    :cond_de
    cmpg-float v3, v14, v5

    if-nez v3, :cond_e3

    return-void

    :cond_e3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, v14, v3

    if-lez v3, :cond_f1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v14, v3

    :cond_f1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v3

    move/from16 v4, v16

    if-ne v3, v4, :cond_109

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v2

    sub-float v2, v3, v14

    :cond_109
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v14

    const/4 v3, 0x0

    :goto_10e
    if-ge v3, v14, :cond_197

    invoke-virtual {v8, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-direct {v0, v4, v9}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->J(CZ)Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_18a

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v6

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    invoke-virtual {v5, v6, v15}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v5, v2, v10}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v6, Lh8/A;->a:Lh8/A;

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->k0:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v2, v5

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, v3

    if-ne v5, v7, :cond_183

    add-float v15, v2, v11

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float/2addr v2, v4

    const/4 v4, 0x2

    int-to-float v5, v4

    div-float/2addr v2, v5

    div-float v6, v13, v5

    sub-float/2addr v2, v6

    div-float v17, v12, v5

    sub-float v2, v2, v17

    add-float v18, v10, v2

    sub-float v2, v15, v17

    move v5, v3

    sub-float v3, v18, v17

    move v6, v4

    add-float v4, v15, v17

    move/from16 v19, v5

    add-float v5, v18, v17

    move/from16 v20, v6

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->k0:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    add-float v1, v13, v12

    add-float v18, v18, v1

    sub-float v3, v18, v17

    add-float v5, v18, v17

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->k0:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    add-float v2, v15, v11

    goto :goto_187

    :cond_183
    move/from16 v19, v3

    const/16 v20, 0x2

    :goto_187
    const/16 v16, 0x1

    goto :goto_18f

    :cond_18a
    move/from16 v19, v3

    move/from16 v20, v15

    goto :goto_187

    :goto_18f
    add-int/lit8 v3, v19, 0x1

    move-object/from16 v1, p1

    move/from16 v15, v20

    goto/16 :goto_10e

    :cond_197
    :goto_197
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
    .registers 5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->setWindowWidth(I)V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M()V

    :cond_17
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->measureChildren(II)V

    invoke-super {p0, p1, p2}, Lcom/nothing/systemui/shared/clocks/view/D;->onMeasure(II)V

    return-void
.end method

.method public p(LX5/a;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->l0:LY5/a;

    invoke-direct {p0, p1, v0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->L(LX5/a;LY5/a;)V

    :cond_f
    return-void
.end method

.method public setWindowWidth(I)V
    .registers 3

    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->m0:I

    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->l0:LY5/a;

    invoke-direct {p0, p1, v0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->L(LX5/a;LY5/a;)V

    return-void
.end method

.method public y(LY5/a;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->l0:LY5/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->l0:LY5/a;

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->M:LX5/a;

    invoke-direct {p0, v0, p1}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->L(LX5/a;LY5/a;)V

    :cond_f
    return-void
.end method

.method public z()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->n0:Z

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/GeneralClockView;->K()V

    return-void
.end method
