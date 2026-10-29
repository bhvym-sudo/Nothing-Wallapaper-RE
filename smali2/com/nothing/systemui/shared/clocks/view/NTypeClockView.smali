.class public final Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private final M:Lh8/h;

.field private final N:Lh8/h;

.field private final O:Lh8/h;

.field private final P:Lh8/h;

.field private final Q:Lh8/h;

.field private final R:Lh8/h;

.field private final S:Lh8/h;

.field private final T:Lh8/h;

.field private final U:Lh8/h;

.field private final V:Lh8/h;

.field private final W:Landroid/graphics/Paint;


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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p2, "NTypeClockView"

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->L:Ljava/lang/String;

    .line 5
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/E;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/E;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->M:Lh8/h;

    .line 6
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/F;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/F;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->N:Lh8/h;

    .line 7
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/G;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/G;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->O:Lh8/h;

    .line 8
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/H;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/H;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->P:Lh8/h;

    .line 9
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/I;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/I;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->Q:Lh8/h;

    .line 10
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/J;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/J;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->R:Lh8/h;

    .line 11
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/K;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/K;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->S:Lh8/h;

    .line 12
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/L;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/L;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->T:Lh8/h;

    .line 13
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/M;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/M;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->U:Lh8/h;

    .line 14
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/N;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/N;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->V:Lh8/h;

    .line 15
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->W:Landroid/graphics/Paint;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic J(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->e0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->b0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->W(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->d0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->Z(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->V(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->a0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->X(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->Y(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->c0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final T(C)Landroid/graphics/Bitmap;
    .registers 2

    packed-switch p1, :pswitch_data_38

    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum9()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_a
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum8()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_f
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum7()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_14
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum6()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_19
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum5()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_1e
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum4()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_23
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum3()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_28
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum2()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_2d
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum1()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_32
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->getNum0()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_38
    .packed-switch 0x30
        :pswitch_32
        :pswitch_2d
        :pswitch_28
        :pswitch_23
        :pswitch_1e
        :pswitch_19
        :pswitch_14
        :pswitch_f
        :pswitch_a
        :pswitch_5
    .end packed-switch
.end method

.method private final U(Ljava/lang/String;I)F
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

.method private static final V(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->b0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final W(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->d0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final X(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->f0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final Y(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->h0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final Z(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->j0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final a0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->l0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final b0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->n0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final c0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->p0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->r0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final e0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->t0:I

    invoke-static {p0, v0}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_12

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lu0/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private final getNum0()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->M:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum1()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->N:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum2()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->O:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum3()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->P:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum4()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->Q:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum5()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->R:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum6()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->S:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum7()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->T:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum8()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->U:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum9()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->V:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_14

    return-void

    :cond_14
    invoke-static {v7}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_174

    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->s:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v8, v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->q:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v9, v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->r:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v10, v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->h:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float v11, v2, v3

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v3

    move v6, v4

    :goto_64
    const/4 v12, 0x2

    const/4 v13, 0x3

    if-ge v5, v2, :cond_8f

    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    invoke-direct {v0, v14}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->T(C)Landroid/graphics/Bitmap;

    move-result-object v14

    if-eqz v14, :cond_8c

    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    mul-float/2addr v14, v15

    add-float/2addr v6, v14

    invoke-direct {v0, v7, v5}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->U(Ljava/lang/String;I)F

    move-result v14

    add-float/2addr v6, v14

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v14

    sub-int/2addr v14, v5

    if-ne v14, v13, :cond_8c

    int-to-float v12, v12

    mul-float/2addr v12, v10

    add-float/2addr v6, v12

    :cond_8c
    add-int/lit8 v5, v5, 0x1

    goto :goto_64

    :cond_8f
    cmpg-float v2, v6, v4

    if-nez v2, :cond_94

    return-void

    :cond_94
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, v6, v2

    if-lez v2, :cond_a2

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v6, v2

    :cond_a2
    iget-object v2, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->W:Landroid/graphics/Paint;

    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v5

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5, v14}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c1

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v5

    if-nez v5, :cond_c1

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v5

    if-nez v5, :cond_c1

    const/high16 v5, -0x1000000

    goto :goto_c2

    :cond_c1
    const/4 v5, -0x1

    :goto_c2
    sget-object v14, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5, v14}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v6

    const/high16 v14, 0x40000000    # 2.0f

    div-float/2addr v2, v14

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v15

    :goto_d7
    if-ge v3, v15, :cond_174

    invoke-virtual {v7, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-direct {v0, v4}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->T(C)Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_168

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v16

    mul-float v6, v6, v16

    sub-float/2addr v5, v6

    div-float/2addr v5, v14

    sub-float/2addr v5, v11

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v14

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v12

    invoke-virtual {v6, v14, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v6, v2, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v12, Lh8/A;->a:Lh8/A;

    iget-object v12, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->W:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v6, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v12

    mul-float/2addr v6, v12

    add-float/2addr v2, v6

    invoke-direct {v0, v7, v3}, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->U(Ljava/lang/String;I)F

    move-result v6

    add-float/2addr v2, v6

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v3

    if-ne v6, v13, :cond_164

    add-float v12, v2, v10

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float/2addr v2, v4

    const/4 v14, 0x2

    int-to-float v4, v14

    div-float/2addr v2, v4

    add-float/2addr v2, v11

    div-float v6, v9, v4

    sub-float/2addr v2, v6

    div-float v17, v8, v4

    sub-float v2, v2, v17

    add-float v18, v5, v2

    sub-float v2, v12, v17

    move v4, v3

    sub-float v3, v18, v17

    move v5, v4

    add-float v4, v12, v17

    move v6, v5

    add-float v5, v18, v17

    move/from16 v19, v6

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->W:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    add-float v1, v9, v8

    add-float v18, v18, v1

    sub-float v3, v18, v17

    add-float v5, v18, v17

    iget-object v6, v0, Lcom/nothing/systemui/shared/clocks/view/NTypeClockView;->W:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    add-float v2, v12, v10

    goto :goto_16b

    :cond_164
    move/from16 v19, v3

    const/4 v14, 0x2

    goto :goto_16b

    :cond_168
    move/from16 v19, v3

    move v14, v12

    :goto_16b
    add-int/lit8 v3, v19, 0x1

    move-object/from16 v1, p1

    move v12, v14

    const/high16 v14, 0x40000000    # 2.0f

    goto/16 :goto_d7

    :cond_174
    :goto_174
    return-void
.end method
