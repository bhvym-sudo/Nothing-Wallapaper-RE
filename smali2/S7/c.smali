.class public final LS7/c;
.super Landroidx/transition/l;
.source "SourceFile"


# instance fields
.field private s0:I

.field private t0:Lv8/l;

.field private u0:Lv8/l;

.field private v0:Lv8/a;


# direct methods
.method public constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/transition/l;-><init>(I)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, LS7/c;->s0:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    const/16 p1, 0x50

    .line 3
    :cond_6
    invoke-direct {p0, p1}, LS7/c;-><init>(I)V

    return-void
.end method

.method public static synthetic D0(LS7/c;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, LS7/c;->H0(LS7/c;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic E0(LS7/c;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, LS7/c;->G0(LS7/c;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final G0(LS7/c;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LS7/c;->t0:Lv8/l;

    if-eqz p0, :cond_14

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    return-void
.end method

.method private static final H0(LS7/c;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LS7/c;->u0:Lv8/l;

    if-eqz p0, :cond_14

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    return-void
.end method


# virtual methods
.method public final F0()Lv8/a;
    .registers 1

    iget-object p0, p0, LS7/c;->v0:Lv8/a;

    return-object p0
.end method

.method public final I0(Lv8/l;)V
    .registers 2

    iput-object p1, p0, LS7/c;->t0:Lv8/l;

    return-void
.end method

.method public final J0(Lv8/a;)V
    .registers 2

    iput-object p1, p0, LS7/c;->v0:Lv8/a;

    return-void
.end method

.method public final K0(Lv8/l;)V
    .registers 2

    iput-object p1, p0, LS7/c;->u0:Lv8/l;

    return-void
.end method

.method public final L0(I)V
    .registers 2

    iput p1, p0, LS7/c;->s0:I

    return-void
.end method

.method public x0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;
    .registers 6

    const-string v0, "sceneRoot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LS7/c;->s0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_13

    goto :goto_14

    :cond_13
    move-object p2, v0

    :goto_14
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/transition/l;->x0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;

    move-result-object p1

    instance-of p2, p1, Landroid/animation/ValueAnimator;

    if-eqz p2, :cond_27

    move-object p2, p1

    check-cast p2, Landroid/animation/ValueAnimator;

    new-instance p3, LS7/a;

    invoke-direct {p3, p0}, LS7/a;-><init>(LS7/c;)V

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_27
    return-object p1
.end method

.method public z0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;
    .registers 6

    const-string v0, "sceneRoot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LS7/c;->s0:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_13

    goto :goto_14

    :cond_13
    move-object p2, v0

    :goto_14
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/transition/l;->z0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;

    move-result-object p1

    instance-of p2, p1, Landroid/animation/ValueAnimator;

    if-eqz p2, :cond_2f

    move-object p2, p1

    check-cast p2, Landroid/animation/ValueAnimator;

    new-instance p3, LS7/b;

    invoke-direct {p3, p0}, LS7/b;-><init>(LS7/c;)V

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p3, LS7/c$a;

    invoke-direct {p3, p0}, LS7/c$a;-><init>(LS7/c;)V

    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_2f
    return-object p1
.end method
