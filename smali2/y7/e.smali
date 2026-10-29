.class public final Ly7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/e$a;,
        Ly7/e$b;
    }
.end annotation


# static fields
.field public static final c:Ly7/e$a;

.field private static final d:Landroid/view/animation/Interpolator;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Ly7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ly7/e;->c:Ly7/e$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Ly7/e;->d:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Lcom/android/launcher3/f;)V
    .registers 3

    const-string v0, "deviceProfile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lcom/android/launcher3/f;->o:I

    iput v0, p0, Ly7/e;->a:I

    iget p1, p1, Lcom/android/launcher3/f;->n:I

    iput p1, p0, Ly7/e;->b:I

    return-void
.end method

.method public static synthetic a(Lv8/p;LA7/a;Landroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Ly7/e;->f(Lv8/p;LA7/a;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lv8/l;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Ly7/e;->i(Lv8/l;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic c(Lv8/l;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Ly7/e;->h(Lv8/l;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic d(Lv8/p;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Ly7/e;->m(Lv8/p;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final f(Lv8/p;LA7/a;Landroid/animation/ValueAnimator;)V
    .registers 5

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sget-object v1, LA7/a;->q:LA7/a;

    if-ne p1, v1, :cond_19

    goto :goto_1d

    :cond_19
    const/4 p1, 0x1

    int-to-float p1, p1

    sub-float v0, p1, v0

    :goto_1d
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final h(Lv8/l;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final i(Lv8/l;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final j()Landroid/animation/ValueAnimator;
    .registers 3

    const/4 p0, 0x2

    new-array p0, p0, [F

    fill-array-data p0, :array_1a

    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p0

    const-wide/16 v0, 0x96

    invoke-virtual {p0, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Ly7/e;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-string v0, "apply(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :array_1a
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final m(Lv8/p;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(LA7/a;Lv8/a;Lv8/p;)Landroid/animation/Animator;
    .registers 5

    const-string v0, "onEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "update"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly7/e;->j()Landroid/animation/ValueAnimator;

    move-result-object p0

    new-instance v0, Ly7/a;

    invoke-direct {v0, p3, p1}, Ly7/a;-><init>(Lv8/p;LA7/a;)V

    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Ly7/e$c;

    invoke-direct {p1, p2}, Ly7/e$c;-><init>(Lv8/a;)V

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object p0
.end method

.method public final g(Lv8/a;Lv8/a;Lv8/l;Lv8/l;)Landroid/animation/Animator;
    .registers 7

    const-string v0, "onExitStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onExitEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onExitUpdate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterUpdate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly7/e;->j()Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Ly7/c;

    invoke-direct {v1, p3}, Ly7/c;-><init>(Lv8/l;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p3, Ly7/e$d;

    invoke-direct {p3, p1, p2}, Ly7/e$d;-><init>(Lv8/a;Lv8/a;)V

    invoke-virtual {v0, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-direct {p0}, Ly7/e;->j()Landroid/animation/ValueAnimator;

    move-result-object p0

    new-instance p1, Ly7/d;

    invoke-direct {p1, p4}, Ly7/d;-><init>(Lv8/l;)V

    invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    filled-new-array {v0, p0}, [Landroid/animation/Animator;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    return-object p1
.end method

.method public final k()Landroid/animation/AnimatorSet;
    .registers 3

    new-instance p0, Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v0, 0x96

    invoke-virtual {p0, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    sget-object v0, Ly7/e;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object p0
.end method

.method public final l(LN1/a;Lv8/a;Lv8/a;Lv8/p;)Landroid/animation/Animator;
    .registers 7

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStart"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "update"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly7/e$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_31

    new-instance p1, Lh8/o;

    iget v0, p0, Ly7/e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p0, p0, Ly7/e;->b:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_42

    :cond_31
    new-instance p1, Lh8/o;

    iget v0, p0, Ly7/e;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p0, p0, Ly7/e;->a:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_42
    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    filled-new-array {p0, p1}, [I

    move-result-object p0

    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p0

    sget-object p1, Ly7/e;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v0, 0x96

    invoke-virtual {p0, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    new-instance p1, Ly7/e$e;

    invoke-direct {p1, p3, p2}, Ly7/e$e;-><init>(Lv8/a;Lv8/a;)V

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance p1, Ly7/b;

    invoke-direct {p1, p4}, Ly7/b;-><init>(Lv8/p;)V

    invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p0
.end method
