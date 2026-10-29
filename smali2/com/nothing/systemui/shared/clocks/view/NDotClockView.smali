.class public final Lcom/nothing/systemui/shared/clocks/view/NDotClockView;
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

.field private final W:Lh8/h;

.field private final a0:Lh8/h;

.field private final b0:Lh8/h;

.field private final c0:Lh8/h;

.field private final d0:Lh8/h;

.field private final e0:Lh8/h;

.field private final f0:Lh8/h;

.field private final g0:Lh8/h;

.field private final h0:Lh8/h;

.field private final i0:Lh8/h;

.field private final j0:Landroid/graphics/Paint;


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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p2, "NDotClockView"

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->L:Ljava/lang/String;

    .line 5
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/b;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/b;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->M:Lh8/h;

    .line 6
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/d;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/d;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->N:Lh8/h;

    .line 7
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/e;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/e;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->O:Lh8/h;

    .line 8
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/f;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/f;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->P:Lh8/h;

    .line 9
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/g;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/g;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->Q:Lh8/h;

    .line 10
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/h;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/h;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->R:Lh8/h;

    .line 11
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/i;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/i;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->S:Lh8/h;

    .line 12
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/j;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/j;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->T:Lh8/h;

    .line 13
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/k;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/k;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->U:Lh8/h;

    .line 14
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/l;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/l;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->V:Lh8/h;

    .line 15
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/m;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/m;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->W:Lh8/h;

    .line 16
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/n;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/n;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->a0:Lh8/h;

    .line 17
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/o;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/o;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->b0:Lh8/h;

    .line 18
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/p;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/p;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->c0:Lh8/h;

    .line 19
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/q;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/q;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->d0:Lh8/h;

    .line 20
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/r;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/r;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->e0:Lh8/h;

    .line 21
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/s;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/s;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->f0:Lh8/h;

    .line 22
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/t;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/t;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->g0:Lh8/h;

    .line 23
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/u;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/u;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->h0:Lh8/h;

    .line 24
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/c;

    invoke-direct {p2, p1}, Lcom/nothing/systemui/shared/clocks/view/c;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->i0:Lh8/h;

    .line 25
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->j0:Landroid/graphics/Paint;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic J(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->o0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->v0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->x0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->m0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->p0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->i0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->j0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->t0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->u0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->k0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->w0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->r0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->e0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->g0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->n0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->f0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->q0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->h0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->s0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->l0(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final d0(CZZ)Landroid/graphics/Bitmap;
    .registers 4

    packed-switch p1, :pswitch_data_92

    const/4 p0, 0x0

    return-object p0

    :pswitch_5
    if-eqz p3, :cond_e

    if-eqz p2, :cond_e

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum9Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_e
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum9()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_13
    if-eqz p3, :cond_1c

    if-eqz p2, :cond_1c

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum8Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_1c
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum8()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_21
    if-eqz p3, :cond_2a

    if-eqz p2, :cond_2a

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum7Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_2a
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum7()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_2f
    if-eqz p3, :cond_38

    if-eqz p2, :cond_38

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum6Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_38
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum6()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_3d
    if-eqz p3, :cond_46

    if-eqz p2, :cond_46

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum5Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_46
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum5()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_4b
    if-eqz p3, :cond_54

    if-eqz p2, :cond_54

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum4Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_54
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum4()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_59
    if-eqz p3, :cond_62

    if-eqz p2, :cond_62

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum3Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_62
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum3()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_67
    if-eqz p3, :cond_70

    if-eqz p2, :cond_70

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum2Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_70
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum2()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_75
    if-eqz p3, :cond_7e

    if-eqz p2, :cond_7e

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum1Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_7e
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum1()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :pswitch_83
    if-eqz p3, :cond_8c

    if-eqz p2, :cond_8c

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum0Light()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_8c
    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->getNum0()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_92
    .packed-switch 0x30
        :pswitch_83
        :pswitch_75
        :pswitch_67
        :pswitch_59
        :pswitch_4b
        :pswitch_3d
        :pswitch_2f
        :pswitch_21
        :pswitch_13
        :pswitch_5
    .end packed-switch
.end method

.method private static final e0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->I:I

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

.method private static final f0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->H:I

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

.method private static final g0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->K:I

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

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->M:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum0Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->N:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum1()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->O:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum1Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->P:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum2()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->Q:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum2Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->R:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum3()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->S:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum3Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->T:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum4()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->U:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum4Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->V:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum5()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->W:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum5Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->a0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum6()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->b0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum6Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->c0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum7()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->d0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum7Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->e0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum8()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->f0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum8Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->g0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum9()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->h0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final getNum9Light()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->i0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private static final h0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->J:I

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

.method private static final i0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->M:I

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

.method private static final j0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->L:I

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

.method private static final k0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->O:I

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

.method private static final l0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->N:I

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

.method private static final m0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->Q:I

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

.method private static final n0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->P:I

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

.method private static final o0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->S:I

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

.method private static final p0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->R:I

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

.method private static final q0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->U:I

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

.method private static final r0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->T:I

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

.method private static final s0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->W:I

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

.method private static final t0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->V:I

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

.method private static final u0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->Y:I

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

.method private static final v0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->X:I

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

.method private static final w0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->a0:I

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

.method private static final x0(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 8

    sget v0, LI2/c;->Z:I

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


# virtual methods
.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v6, "canvas"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_18

    return-void

    :cond_18
    invoke-static {v6}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_20

    goto/16 :goto_197

    :cond_20
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v7

    if-nez v7, :cond_2f

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v7

    if-eqz v7, :cond_2d

    goto :goto_2f

    :cond_2d
    move v7, v4

    goto :goto_30

    :cond_2f
    :goto_2f
    move v7, v5

    :goto_30
    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v8

    if-eqz v8, :cond_3b

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_3c

    :cond_3b
    move v8, v5

    :goto_3c
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x4

    if-eq v9, v2, :cond_52

    if-eq v9, v10, :cond_47

    goto/16 :goto_197

    :cond_47
    new-array v9, v10, [Z

    aput-boolean v4, v9, v4

    aput-boolean v4, v9, v5

    aput-boolean v5, v9, v3

    aput-boolean v5, v9, v2

    goto :goto_5a

    :cond_52
    new-array v9, v2, [Z

    aput-boolean v4, v9, v4

    aput-boolean v5, v9, v5

    aput-boolean v5, v9, v3

    :goto_5a
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

    if-eq v13, v2, :cond_b0

    if-eq v13, v10, :cond_89

    goto/16 :goto_197

    :cond_89
    invoke-virtual {v6, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v15, v4, v3, v14}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_98

    move v10, v11

    goto :goto_99

    :cond_98
    move v10, v12

    :goto_99
    invoke-virtual {v6, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v15, v4, v3, v14}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a7

    move v12, v11

    :cond_a7
    new-array v2, v2, [F

    aput v10, v2, v4

    aput v11, v2, v16

    aput v12, v2, v3

    goto :goto_c7

    :cond_b0
    move/from16 v2, v16

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v15, v4, v3, v14}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c0

    move v12, v11

    :cond_c0
    new-array v3, v3, [F

    aput v11, v3, v4

    aput v12, v3, v2

    move-object v2, v3

    :goto_c7
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v5, 0x0

    move v10, v4

    move v11, v5

    :goto_ce
    if-ge v10, v3, :cond_fa

    invoke-virtual {v6, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    aget-boolean v13, v9, v10

    invoke-direct {v0, v12, v7, v13}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->d0(CZZ)Landroid/graphics/Bitmap;

    move-result-object v12

    if-eqz v12, :cond_f5

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v13

    mul-float/2addr v12, v13

    add-float/2addr v11, v12

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v12

    const/16 v16, 0x1

    add-int/lit8 v12, v12, -0x1

    if-ge v10, v12, :cond_f7

    aget v12, v2, v10

    add-float/2addr v11, v12

    goto :goto_f7

    :cond_f5
    const/16 v16, 0x1

    :cond_f7
    :goto_f7
    add-int/lit8 v10, v10, 0x1

    goto :goto_ce

    :cond_fa
    cmpg-float v3, v11, v5

    if-nez v3, :cond_ff

    return-void

    :cond_ff
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, v11, v3

    if-lez v3, :cond_10d

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v11, v3

    :cond_10d
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v11

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    sget v11, LI2/b;->u:I

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v11

    mul-float/2addr v10, v11

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v11

    :goto_129
    if-ge v4, v11, :cond_197

    iget-object v12, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->j0:Landroid/graphics/Paint;

    new-instance v13, Landroid/graphics/PorterDuffColorFilter;

    if-nez v8, :cond_136

    if-nez v7, :cond_136

    const/high16 v14, -0x1000000

    goto :goto_137

    :cond_136
    const/4 v14, -0x1

    :goto_137
    sget-object v15, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v13, v14, v15}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v12

    aget-boolean v13, v9, v4

    invoke-direct {v0, v12, v7, v13}, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->d0(CZZ)Landroid/graphics/Bitmap;

    move-result-object v12

    if-eqz v12, :cond_190

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    mul-float/2addr v14, v15

    sub-float/2addr v13, v14

    div-float/2addr v13, v5

    sub-float/2addr v13, v10

    new-instance v14, Landroid/graphics/Matrix;

    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v15

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    invoke-virtual {v14, v15, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v14, v3, v13}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    sget-object v5, Lh8/A;->a:Lh8/A;

    iget-object v5, v0, Lcom/nothing/systemui/shared/clocks/view/NDotClockView;->j0:Landroid/graphics/Paint;

    invoke-virtual {v1, v12, v14, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v12

    mul-float/2addr v5, v12

    add-float/2addr v3, v5

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v16, 0x1

    add-int/lit8 v5, v5, -0x1

    if-ge v4, v5, :cond_192

    aget v5, v2, v4

    add-float/2addr v3, v5

    goto :goto_192

    :cond_190
    const/16 v16, 0x1

    :cond_192
    :goto_192
    add-int/lit8 v4, v4, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    goto :goto_129

    :cond_197
    :goto_197
    return-void
.end method
