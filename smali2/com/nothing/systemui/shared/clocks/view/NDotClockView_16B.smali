.class public final Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private final M:F

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

.field private k0:Landroid/graphics/Paint;

.field private l0:Z


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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "NDotClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->L:Ljava/lang/String;

    const p1, 0x3f19999a    # 0.6f

    .line 5
    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->M:F

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->k0:Landroid/graphics/Paint;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final J(CZZ)Landroid/graphics/Bitmap;
    .registers 4

    packed-switch p1, :pswitch_data_6a

    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    if-eqz p3, :cond_c

    if-eqz p2, :cond_c

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->j0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_c
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->i0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_f
    if-eqz p3, :cond_16

    if-eqz p2, :cond_16

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->h0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_16
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->g0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_19
    if-eqz p3, :cond_20

    if-eqz p2, :cond_20

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->f0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_20
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->e0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_23
    if-eqz p3, :cond_2a

    if-eqz p2, :cond_2a

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->d0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_2a
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->c0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_2d
    if-eqz p3, :cond_34

    if-eqz p2, :cond_34

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->b0:Landroid/graphics/Bitmap;

    return-object p0

    :cond_34
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->a0:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_37
    if-eqz p3, :cond_3e

    if-eqz p2, :cond_3e

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->W:Landroid/graphics/Bitmap;

    return-object p0

    :cond_3e
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->V:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_41
    if-eqz p3, :cond_48

    if-eqz p2, :cond_48

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->U:Landroid/graphics/Bitmap;

    return-object p0

    :cond_48
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->T:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_4b
    if-eqz p3, :cond_52

    if-eqz p2, :cond_52

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->S:Landroid/graphics/Bitmap;

    return-object p0

    :cond_52
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->R:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_55
    if-eqz p3, :cond_5c

    if-eqz p2, :cond_5c

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->Q:Landroid/graphics/Bitmap;

    return-object p0

    :cond_5c
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->P:Landroid/graphics/Bitmap;

    return-object p0

    :pswitch_5f
    if-eqz p3, :cond_66

    if-eqz p2, :cond_66

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->O:Landroid/graphics/Bitmap;

    return-object p0

    :cond_66
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->N:Landroid/graphics/Bitmap;

    return-object p0

    nop

    :pswitch_data_6a
    .packed-switch 0x30
        :pswitch_5f
        :pswitch_55
        :pswitch_4b
        :pswitch_41
        :pswitch_37
        :pswitch_2d
        :pswitch_23
        :pswitch_19
        :pswitch_f
        :pswitch_5
    .end packed-switch
.end method

.method private final K()V
    .registers 10

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->l0:Z

    if-nez v0, :cond_21e

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->l0:Z

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "initResource"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->getTag()Ljava/lang/String;

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

    sget v1, LI2/c;->H:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->N:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->I:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->O:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->J:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->P:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->K:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->L:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->R:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->M:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->S:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->N:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->T:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->O:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->U:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->P:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->V:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->Q:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_120

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_121

    :cond_120
    move-object v1, v0

    :goto_121
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->W:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->R:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_139

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_13a

    :cond_139
    move-object v1, v0

    :goto_13a
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->a0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->S:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_152

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_153

    :cond_152
    move-object v1, v0

    :goto_153
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->b0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->T:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_16b

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_16c

    :cond_16b
    move-object v1, v0

    :goto_16c
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->c0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->U:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_184

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_185

    :cond_184
    move-object v1, v0

    :goto_185
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->d0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->V:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_19d

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_19e

    :cond_19d
    move-object v1, v0

    :goto_19e
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->e0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->W:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1b6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1b7

    :cond_1b6
    move-object v1, v0

    :goto_1b7
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->X:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1cf

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1d0

    :cond_1cf
    move-object v1, v0

    :goto_1d0
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->g0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->Y:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1e8

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1e9

    :cond_1e8
    move-object v1, v0

    :goto_1e9
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->h0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->Z:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_201

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_202

    :cond_201
    move-object v1, v0

    :goto_202
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->i0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->a0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_219

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_219
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->j0:Landroid/graphics/Bitmap;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_21e
    return-void
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v6, "canvas"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->getTag()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "#drawClock"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->K()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_33

    return-void

    :cond_33
    invoke-static {v6}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3b

    goto/16 :goto_a1

    :cond_3b
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v7

    if-nez v7, :cond_4a

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v7

    if-eqz v7, :cond_48

    goto :goto_4a

    :cond_48
    move v7, v4

    goto :goto_4b

    :cond_4a
    :goto_4a
    move v7, v5

    :goto_4b
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v8

    if-eqz v8, :cond_56

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_57

    :cond_56
    move v8, v5

    :goto_57
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x4

    if-eq v9, v2, :cond_6c

    if-eq v9, v10, :cond_61

    goto :goto_a1

    :cond_61
    new-array v9, v10, [Z

    aput-boolean v4, v9, v4

    aput-boolean v4, v9, v5

    aput-boolean v5, v9, v3

    aput-boolean v5, v9, v2

    goto :goto_74

    :cond_6c
    new-array v9, v2, [Z

    aput-boolean v4, v9, v4

    aput-boolean v5, v9, v5

    aput-boolean v5, v9, v3

    :goto_74
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    sget v12, LI2/b;->i:I

    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v11

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v12

    mul-float/2addr v11, v12

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    sget v13, LI2/b;->I:I

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v12

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v13

    mul-float/2addr v12, v13

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    const/4 v14, 0x0

    const-string v15, "1"

    move/from16 v16, v5

    const-string v5, "substring(...)"

    if-eq v13, v2, :cond_c9

    if-eq v13, v10, :cond_a2

    :goto_a1
    return-void

    :cond_a2
    invoke-virtual {v6, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v15, v4, v3, v14}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b1

    move v10, v11

    goto :goto_b2

    :cond_b1
    move v10, v12

    :goto_b2
    invoke-virtual {v6, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v15, v4, v3, v14}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c0

    move v12, v11

    :cond_c0
    new-array v2, v2, [F

    aput v10, v2, v4

    aput v11, v2, v16

    aput v12, v2, v3

    goto :goto_e0

    :cond_c9
    move/from16 v2, v16

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v15, v4, v3, v14}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d9

    move v12, v11

    :cond_d9
    new-array v5, v3, [F

    aput v11, v5, v4

    aput v12, v5, v2

    move-object v2, v5

    :goto_e0
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v10, 0x0

    move v11, v4

    move v12, v10

    :goto_e7
    if-ge v11, v5, :cond_113

    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    move-result v13

    aget-boolean v14, v9, v11

    invoke-direct {v0, v13, v7, v14}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->J(CZZ)Landroid/graphics/Bitmap;

    move-result-object v13

    if-eqz v13, :cond_10e

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v14

    mul-float/2addr v13, v14

    add-float/2addr v12, v13

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    const/16 v16, 0x1

    add-int/lit8 v13, v13, -0x1

    if-ge v11, v13, :cond_110

    aget v13, v2, v11

    add-float/2addr v12, v13

    goto :goto_110

    :cond_10e
    const/16 v16, 0x1

    :cond_110
    :goto_110
    add-int/lit8 v11, v11, 0x1

    goto :goto_e7

    :cond_113
    cmpg-float v5, v12, v10

    if-nez v5, :cond_118

    return-void

    :cond_118
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v5, v12, v5

    if-lez v5, :cond_126

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v12, v5

    :cond_126
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v5

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->i()Z

    move-result v10

    const/high16 v11, 0x40000000    # 2.0f

    if-eqz v10, :cond_13a

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v12

    div-float/2addr v5, v11

    goto :goto_151

    :cond_13a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v10

    const/4 v13, 0x1

    if-ne v10, v13, :cond_151

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v10, v5

    sub-float v5, v10, v12

    :cond_151
    :goto_151
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    sget v12, LI2/b;->u:I

    invoke-virtual {v10, v12}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v12

    mul-float/2addr v10, v12

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v12

    :goto_164
    if-ge v4, v12, :cond_1fa

    iget-object v13, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->k0:Landroid/graphics/Paint;

    new-instance v14, Landroid/graphics/PorterDuffColorFilter;

    if-nez v8, :cond_173

    if-nez v7, :cond_173

    const/high16 v15, -0x1000000

    :goto_170
    move/from16 v17, v11

    goto :goto_175

    :cond_173
    const/4 v15, -0x1

    goto :goto_170

    :goto_175
    sget-object v11, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v14, v15, v11}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    const/16 v11, 0xff

    if-nez v7, :cond_193

    iget-object v13, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->k0:Landroid/graphics/Paint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    sub-int/2addr v14, v4

    if-gt v14, v3, :cond_18f

    int-to-float v11, v11

    iget v14, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->M:F

    mul-float/2addr v11, v14

    float-to-int v11, v11

    :cond_18f
    invoke-virtual {v13, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_198

    :cond_193
    iget-object v13, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->k0:Landroid/graphics/Paint;

    invoke-virtual {v13, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    :goto_198
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v11

    aget-boolean v13, v9, v4

    invoke-direct {v0, v11, v7, v13}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->J(CZZ)Landroid/graphics/Bitmap;

    move-result-object v11

    if-eqz v11, :cond_1f1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    mul-float/2addr v14, v15

    sub-float/2addr v13, v14

    div-float v13, v13, v17

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v14

    if-eqz v14, :cond_1bd

    goto :goto_1be

    :cond_1bd
    sub-float/2addr v13, v10

    :goto_1be
    new-instance v14, Landroid/graphics/Matrix;

    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    invoke-virtual {v14, v15, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v14, v5, v13}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v3, Lh8/A;->a:Lh8/A;

    iget-object v3, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->k0:Landroid/graphics/Paint;

    invoke-virtual {v1, v11, v14, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v11

    mul-float/2addr v3, v11

    add-float/2addr v5, v3

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v16, 0x1

    add-int/lit8 v3, v3, -0x1

    if-ge v4, v3, :cond_1f3

    aget v3, v2, v4

    add-float/2addr v5, v3

    goto :goto_1f3

    :cond_1f1
    const/16 v16, 0x1

    :cond_1f3
    :goto_1f3
    add-int/lit8 v4, v4, 0x1

    move/from16 v11, v17

    const/4 v3, 0x2

    goto/16 :goto_164

    :cond_1fa
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public z()V
    .registers 10

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->N:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->P:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->R:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->T:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->V:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->a0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->c0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->e0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->g0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->i0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->O:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->Q:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->S:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->U:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->W:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->b0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->d0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->f0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->h0:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->j0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->H:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_3f

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_40

    :cond_3f
    move-object v1, v0

    :goto_40
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->N:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->I:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->O:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->J:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->P:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->K:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->Q:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->L:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->R:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->M:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->S:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->N:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->T:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->O:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->U:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->P:I

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
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->V:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->Q:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_120

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_121

    :cond_120
    move-object v1, v0

    :goto_121
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->W:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->R:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_139

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_13a

    :cond_139
    move-object v1, v0

    :goto_13a
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->a0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->S:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_152

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_153

    :cond_152
    move-object v1, v0

    :goto_153
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->b0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->T:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_16b

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_16c

    :cond_16b
    move-object v1, v0

    :goto_16c
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->c0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->U:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_184

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_185

    :cond_184
    move-object v1, v0

    :goto_185
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->d0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->V:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_19d

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_19e

    :cond_19d
    move-object v1, v0

    :goto_19e
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->e0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->W:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1b6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1b7

    :cond_1b6
    move-object v1, v0

    :goto_1b7
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->f0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->X:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1cf

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1d0

    :cond_1cf
    move-object v1, v0

    :goto_1d0
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->g0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->Y:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1e8

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1e9

    :cond_1e8
    move-object v1, v0

    :goto_1e9
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->h0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->Z:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_201

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_202

    :cond_201
    move-object v1, v0

    :goto_202
    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->i0:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LI2/c;->a0:I

    invoke-static {v1, v2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_219

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_219
    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView_16B;->j0:Landroid/graphics/Bitmap;

    return-void
.end method
