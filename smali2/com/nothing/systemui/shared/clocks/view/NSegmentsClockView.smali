.class public final Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private final M:I

.field private final N:J

.field private final O:Ljava/lang/String;

.field private final P:I

.field private final Q:I

.field private final R:F

.field private final S:I

.field private T:Z

.field private U:I

.field private V:I

.field private W:I

.field private a0:Z

.field private final b0:[I

.field private final c0:Ljava/util/Map;

.field private final d0:[Landroid/animation/ValueAnimator;

.field private final e0:[Ljava/lang/Boolean;

.field private final f0:[Landroid/graphics/Rect;

.field private final g0:[Ljava/lang/Integer;

.field private h0:Landroid/graphics/Point;

.field private final i0:Landroid/os/Handler;

.field private final j0:I

.field private k0:Z

.field private l0:F

.field private final m0:Landroid/graphics/Paint;

.field private n0:Z

.field private final o0:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;


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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p2, "NSegmentsClockView"

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->L:Ljava/lang/String;

    const/4 p2, 0x4

    .line 5
    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M:I

    const-wide/16 p3, 0x12c

    .line 6
    iput-wide p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->N:J

    .line 7
    const-string p3, "fonts/nsegments_1_vf.otf"

    iput-object p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->O:Ljava/lang/String;

    .line 8
    const-string p3, "animator.fontsize"

    const/16 p4, 0x1dd

    invoke-static {p3, p4}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result p3

    int-to-float p3, p3

    const-string p4, "ro.sf.lcd_density"

    const/16 v0, 0x1e0

    invoke-static {p4, v0}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x43f00000    # 480.0f

    div-float/2addr v1, v2

    mul-float/2addr p3, v1

    float-to-int p3, p3

    iput p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->P:I

    const/16 p3, 0x2bc

    .line 9
    iput p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    .line 10
    invoke-static {p4, v0}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, v2

    const p4, 0x3ecccccd    # 0.4f

    mul-float/2addr p3, p4

    iput p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->R:F

    const/16 p3, 0x64

    .line 11
    iput p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->S:I

    const/4 p3, 0x1

    .line 12
    iput-boolean p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    const/4 p4, -0x1

    .line 13
    iput p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->U:I

    const/4 p4, 0x2

    .line 14
    new-array p4, p4, [I

    iput-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->b0:[I

    .line 15
    new-instance p4, Ljava/util/LinkedHashMap;

    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->c0:Ljava/util/Map;

    .line 16
    new-array p4, p2, [Landroid/animation/ValueAnimator;

    iput-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->d0:[Landroid/animation/ValueAnimator;

    .line 17
    new-array p4, p2, [Ljava/lang/Boolean;

    const/4 v0, 0x0

    move v1, v0

    :goto_5e
    if-ge v1, p2, :cond_67

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v2, p4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5e

    :cond_67
    iput-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->e0:[Ljava/lang/Boolean;

    .line 18
    iget p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M:I

    new-array p4, p2, [Landroid/graphics/Rect;

    iput-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->f0:[Landroid/graphics/Rect;

    .line 19
    new-array p4, p2, [Ljava/lang/Integer;

    move v1, v0

    :goto_72
    if-ge v1, p2, :cond_7f

    iget v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_72

    :cond_7f
    iput-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->g0:[Ljava/lang/Integer;

    .line 20
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2, v0, v0}, Landroid/graphics/Point;-><init>(II)V

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->h0:Landroid/graphics/Point;

    .line 21
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->i0:Landroid/os/Handler;

    .line 22
    const-string p2, "animator.duration"

    const/16 p4, 0x1f4

    invoke-static {p2, p4}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result p2

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->j0:I

    .line 23
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 24
    iget p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->P:I

    int-to-float p3, p3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getSizeScaleRatio()F

    move-result p4

    mul-float/2addr p3, p4

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 25
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result p3

    if-eqz p3, :cond_bd

    .line 26
    invoke-virtual {p2}, Landroid/graphics/Paint;->getTextSize()F

    move-result p3

    iget p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->R:F

    mul-float/2addr p3, p4

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 27
    :cond_bd
    iget p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    invoke-direct {p0, p3}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->R(I)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 28
    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    .line 29
    new-instance p2, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;

    invoke-direct {p2, p0}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;-><init>(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)V

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->o0:Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$b;

    .line 30
    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/view/WindowManager;

    .line 31
    new-instance p3, Landroid/util/DisplayMetrics;

    invoke-direct {p3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 32
    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 33
    iget p2, p3, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->V:I

    .line 34
    iget p2, p3, Landroid/util/DisplayMetrics;->heightPixels:I

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->W:I

    .line 35
    iget p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M:I

    move p3, v0

    :goto_f3
    if-ge p3, p2, :cond_100

    .line 36
    iget-object p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->d0:[Landroid/animation/ValueAnimator;

    invoke-direct {p0, p3}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->P(I)Landroid/animation/ValueAnimator;

    move-result-object v1

    aput-object v1, p4, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_f3

    .line 37
    :cond_100
    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.os.PowerManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/os/PowerManager;

    .line 38
    invoke-virtual {p1}, Landroid/os/PowerManager;->isInteractive()Z

    move-result p1

    .line 39
    iget p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M:I

    :goto_113
    if-ge v0, p2, :cond_127

    .line 40
    iget-object p3, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->g0:[Ljava/lang/Integer;

    if-eqz p1, :cond_11c

    iget p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    goto :goto_11e

    :cond_11c
    iget p4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->S:I

    :goto_11e
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_113

    :cond_127
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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic J(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;ILandroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;ILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic K(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)[Landroid/graphics/Rect;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->f0:[Landroid/graphics/Rect;

    return-object p0
.end method

.method public static final synthetic L(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->n0:Z

    return p0
.end method

.method public static final synthetic M(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)[Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->g0:[Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic N(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)I
    .registers 1

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    return p0
.end method

.method public static final synthetic O(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    return p0
.end method

.method private final P(I)Landroid/animation/ValueAnimator;
    .registers 8

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->S:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    filled-new-array {v1, v0}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->j0:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/PathInterpolator;

    const v2, 0x3e4ccccd    # 0.2f

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3f19999a    # 0.6f

    const/4 v5, 0x0

    invoke-direct {v1, v4, v5, v2, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Lcom/nothing/systemui/shared/clocks/view/v;

    invoke-direct {v1, p0, p1}, Lcom/nothing/systemui/shared/clocks/view/v;-><init>(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$a;

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView$a;-><init>()V

    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-string p0, "apply(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final Q(Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;ILandroid/animation/ValueAnimator;)V
    .registers 5

    const-string v0, "animator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->g0:[Ljava/lang/Integer;

    iget-boolean v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v1, :cond_1e

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->S:I

    add-int/2addr v1, p2

    goto :goto_21

    :cond_1e
    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    sub-int/2addr v1, p2

    :goto_21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v0, p1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    return-void
.end method

.method private final R(I)Landroid/graphics/Typeface;
    .registers 6

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->c0:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3c

    new-instance v2, Landroid/graphics/Typeface$Builder;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->O:Ljava/lang/String;

    invoke-direct {v2, v3, p0}, Landroid/graphics/Typeface$Builder;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\'wght\' "

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/graphics/Typeface$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    move-result-object v2

    const-string p0, "build(...)"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3c
    check-cast v2, Landroid/graphics/Typeface;

    return-object v2
.end method

.method private final S(IIILjava/lang/String;)V
    .registers 9

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, p4, v2, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v0, p2, p3}, Landroid/graphics/Rect;->offset(II)V

    iget-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->b0:[I

    invoke-virtual {p0, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->b0:[I

    aget p3, p2, v2

    aget p2, p2, v3

    invoke-virtual {v0, p3, p2}, Landroid/graphics/Rect;->offset(II)V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->f0:[Landroid/graphics/Rect;

    aput-object v0, p0, p1

    return-void
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 15

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_10

    return-void

    :cond_10
    invoke-static {v0}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_1a0

    :cond_18
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_29

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v1

    if-ne v1, v3, :cond_27

    goto :goto_29

    :cond_27
    move v1, v2

    goto :goto_2a

    :cond_29
    :goto_29
    move v1, v3

    :goto_2a
    iget-boolean v4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->k0:Z

    if-eq v4, v1, :cond_30

    iput-boolean v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->k0:Z

    :cond_30
    iget-object v4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    iget v5, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->P:I

    int-to-float v5, v5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getSizeScaleRatio()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v4

    if-eqz v4, :cond_4f

    iget-object v4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    iget v6, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->R:F

    mul-float/2addr v5, v6

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_4f
    iget-object v4, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    if-nez v1, :cond_63

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_60

    goto :goto_63

    :cond_60
    const/high16 v1, -0x1000000

    goto :goto_64

    :cond_63
    :goto_63
    const/4 v1, -0x1

    :goto_64
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v2

    :goto_71
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_8f

    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    iget-object v6, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_71

    :cond_8f
    invoke-static {v1}, Li8/s;->n0(Ljava/lang/Iterable;)F

    move-result v4

    iget-object v5, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    iget v8, v5, Landroid/graphics/Paint$FontMetrics;->top:F

    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->bottom:F

    add-float/2addr v8, v5

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v8, v5

    sub-float/2addr v6, v8

    iget-boolean v5, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v5, :cond_b7

    invoke-static {v0}, LE8/i;->W(Ljava/lang/CharSequence;)LB8/g;

    move-result-object v5

    invoke-static {v5}, LB8/h;->o(LB8/e;)LB8/e;

    move-result-object v5

    goto :goto_bb

    :cond_b7
    invoke-static {v0}, LE8/i;->W(Ljava/lang/CharSequence;)LB8/g;

    move-result-object v5

    :goto_bb
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v9

    if-ne v9, v3, :cond_ce

    goto :goto_cf

    :cond_ce
    move v3, v2

    :goto_cf
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->i()Z

    move-result v9

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v10

    if-nez v10, :cond_131

    if-nez v9, :cond_f9

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    iget-object v11, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    iget v12, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->Q:I

    invoke-direct {p0, v12}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->R(I)Landroid/graphics/Typeface;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v11, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v11, v0, v2, v12, v10}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v2, v10, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iput v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->l0:F

    :cond_f9
    if-eqz v9, :cond_110

    iget-boolean v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v2, :cond_108

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    :goto_103
    int-to-float v2, v2

    div-float/2addr v2, v7

    div-float/2addr v4, v7

    add-float/2addr v2, v4

    goto :goto_13f

    :cond_108
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    :goto_10c
    int-to-float v2, v2

    sub-float/2addr v2, v4

    div-float/2addr v2, v7

    goto :goto_13f

    :cond_110
    if-eqz v3, :cond_127

    if-nez v9, :cond_127

    iget-boolean v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v2, :cond_11f

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v8

    goto :goto_13f

    :cond_11f
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v8

    sub-float/2addr v2, v4

    goto :goto_13f

    :cond_127
    iget-boolean v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v2, :cond_12c

    add-float/2addr v8, v4

    :cond_12c
    iget v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->l0:F

    sub-float v2, v8, v2

    goto :goto_13f

    :cond_131
    iget-boolean v2, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v2, :cond_13a

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    goto :goto_103

    :cond_13a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    goto :goto_10c

    :goto_13f
    invoke-virtual {v5}, LB8/e;->g()I

    move-result v3

    invoke-virtual {v5}, LB8/e;->m()I

    move-result v4

    invoke-virtual {v5}, LB8/e;->n()I

    move-result v5

    if-lez v5, :cond_14f

    if-le v3, v4, :cond_153

    :cond_14f
    if-gez v5, :cond_1a0

    if-gt v4, v3, :cond_1a0

    :cond_153
    :goto_153
    iget-boolean v7, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-eqz v7, :cond_162

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v2, v7

    :cond_162
    iget-object v7, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    iget-object v8, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->g0:[Ljava/lang/Integer;

    aget-object v8, v8, v3

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-direct {p0, v8}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->R(I)Landroid/graphics/Typeface;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->m0:Landroid/graphics/Paint;

    invoke-virtual {p1, v7, v2, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    float-to-int v7, v2

    float-to-int v8, v6

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, v3, v7, v8, v9}, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->S(IIILjava/lang/String;)V

    iget-boolean v7, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-nez v7, :cond_19c

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    add-float/2addr v2, v7

    :cond_19c
    if-eq v3, v4, :cond_1a0

    add-int/2addr v3, v5

    goto :goto_153

    :cond_1a0
    :goto_1a0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->c0:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->d0:[Landroid/animation/ValueAnimator;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_c
    if-ge v1, v0, :cond_22

    aget-object v2, p0, v1

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_15
    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_1a
    if-eqz v2, :cond_1f

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_22
    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .registers 5

    const-string v0, "changedView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result p1

    if-eqz p1, :cond_f

    goto :goto_42

    :cond_f
    const/4 p1, 0x4

    if-eq p2, p1, :cond_13

    goto :goto_42

    :cond_13
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getCLOCKFACE_TRANSITION_ENABLED()Z

    move-result p1

    if-eqz p1, :cond_1f

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->j()Z

    move-result p1

    if-nez p1, :cond_25

    :cond_1f
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getCLOCKFACE_TRANSITION_ENABLED()Z

    move-result p1

    if-nez p1, :cond_42

    :cond_25
    iget-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->a0:Z

    if-nez p1, :cond_42

    iget-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->T:Z

    if-nez p1, :cond_42

    iget p1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->M:I

    const/4 p2, 0x0

    :goto_30
    if-ge p2, p1, :cond_3f

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->g0:[Ljava/lang/Integer;

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/NSegmentsClockView;->S:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_30

    :cond_3f
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    :cond_42
    :goto_42
    return-void
.end method
