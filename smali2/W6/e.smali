.class public final LW6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW6/e$a;,
        LW6/e$b;
    }
.end annotation


# static fields
.field public static final j:LW6/e$a;

.field private static final k:J

.field private static final l:J

.field private static final m:J


# instance fields
.field private final a:Ljava/util/HashMap;

.field private final b:Ljava/util/HashMap;

.field private final c:Ljava/util/HashMap;

.field private d:Landroid/animation/ObjectAnimator;

.field private e:Landroid/animation/ObjectAnimator;

.field private final f:Landroid/view/animation/PathInterpolator;

.field private final g:Landroid/view/animation/PathInterpolator;

.field private h:Lv8/a;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW6/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW6/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW6/e;->j:LW6/e$a;

    const-wide/16 v0, 0x258

    sput-wide v0, LW6/e;->k:J

    const-wide/16 v0, 0x320

    sput-wide v0, LW6/e;->l:J

    const-wide/16 v0, 0xfa0

    sput-wide v0, LW6/e;->m:J

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW6/e;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW6/e;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LW6/e;->c:Ljava/util/HashMap;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3ecccccd    # 0.4f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v2, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object v0, p0, LW6/e;->f:Landroid/view/animation/PathInterpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    invoke-direct {v0, v1, v2, v1, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object v0, p0, LW6/e;->g:Landroid/view/animation/PathInterpolator;

    return-void
.end method

.method private final E(Landroid/view/View;Lv8/a;)V
    .registers 9

    new-instance v3, Landroid/view/animation/AlphaAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v3, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    sget-wide v0, LW6/e;->k:J

    invoke-virtual {v3, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    new-instance v0, LW6/e$h;

    move-object v4, v3

    move-object v2, p0

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LW6/e$h;-><init>(Landroid/view/View;LW6/e;Landroid/view/animation/AlphaAnimation;Landroid/view/animation/AlphaAnimation;Lv8/a;)V

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    new-instance p0, LW6/b;

    invoke-direct {p0, v1, v3}, LW6/b;-><init>(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V

    invoke-virtual {v1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final F(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, LW6/e;->y(Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lcom/airbnb/lottie/LottieAnimationView;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, LW6/e;->v(Lcom/airbnb/lottie/LottieAnimationView;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic c(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V
    .registers 2

    invoke-static {p0, p1}, LW6/e;->q(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V

    return-void
.end method

.method public static synthetic d(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V
    .registers 2

    invoke-static {p0, p1}, LW6/e;->F(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V

    return-void
.end method

.method public static final synthetic e(LW6/e;)Ljava/util/HashMap;
    .registers 1

    iget-object p0, p0, LW6/e;->c:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic f(LW6/e;)Ljava/util/HashMap;
    .registers 1

    iget-object p0, p0, LW6/e;->b:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic g(LW6/e;)Ljava/util/HashMap;
    .registers 1

    iget-object p0, p0, LW6/e;->a:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic h(LW6/e;Landroid/view/View;Landroid/view/View;F)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LW6/e;->t(Landroid/view/View;Landroid/view/View;F)V

    return-void
.end method

.method private final j(Landroid/view/View;ZLandroid/view/animation/Animation;)V
    .registers 5

    invoke-virtual {p3}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object p0, p0, LW6/e;->a:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LW6/e$b;

    if-eqz p0, :cond_19

    invoke-virtual {p0}, LW6/e$b;->b()Z

    move-result p0

    if-eq p2, p0, :cond_19

    invoke-virtual {p3}, Landroid/view/animation/Animation;->cancel()V

    :cond_19
    return-void
.end method

.method private final k(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V
    .registers 3

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->removeAllAnimatorListeners()V

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->removeAllUpdateListeners()V

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->isAnimating()Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->cancelAnimation()V

    :cond_f
    invoke-virtual {p2}, Lcom/airbnb/lottie/LottieAnimationView;->removeAllAnimatorListeners()V

    invoke-virtual {p2}, Lcom/airbnb/lottie/LottieAnimationView;->removeAllUpdateListeners()V

    invoke-virtual {p2}, Lcom/airbnb/lottie/LottieAnimationView;->isAnimating()Z

    move-result p0

    if-eqz p0, :cond_1e

    invoke-virtual {p2}, Lcom/airbnb/lottie/LottieAnimationView;->cancelAnimation()V

    :cond_1e
    return-void
.end method

.method private final m()V
    .registers 3

    iget-object v0, p0, LW6/e;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v1, v0}, Li8/s;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/animation/Animation;

    invoke-virtual {v1}, Landroid/view/animation/Animation;->cancel()V

    goto :goto_1c

    :cond_2c
    iget-object p0, p0, LW6/e;->c:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method private final n()V
    .registers 3

    iget-object v0, p0, LW6/e;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v1, v0}, Li8/s;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    goto :goto_1c

    :cond_2c
    iget-object p0, p0, LW6/e;->b:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method private final p(Landroid/view/View;Lv8/a;)V
    .registers 9

    new-instance v3, Landroid/view/animation/AlphaAnimation;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    sget-wide v0, LW6/e;->k:J

    invoke-virtual {v3, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    new-instance v0, LW6/e$c;

    move-object v4, v3

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LW6/e$c;-><init>(LW6/e;Landroid/view/View;Landroid/view/animation/AlphaAnimation;Landroid/view/animation/AlphaAnimation;Lv8/a;)V

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    new-instance p0, LW6/c;

    invoke-direct {p0, v2, v3}, LW6/c;-><init>(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V

    invoke-virtual {v2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final q(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private final t(Landroid/view/View;Landroid/view/View;F)V
    .registers 12

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {p0}, LW6/e;->l()V

    neg-float v3, p3

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_12

    move v4, v3

    goto :goto_13

    :cond_12
    move v4, p3

    :goto_13
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v6

    cmpg-float v5, v6, v5

    if-gez v5, :cond_1c

    goto :goto_1d

    :cond_1c
    move p3, v3

    :goto_1d
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v3

    new-array v5, v2, [F

    aput v3, v5, v1

    aput v4, v5, v0

    const-string v3, "translationY"

    invoke-static {p1, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    iput-object v4, p0, LW6/e;->d:Landroid/animation/ObjectAnimator;

    const/4 v5, -0x1

    if-eqz v4, :cond_42

    iget-object v6, p0, LW6/e;->g:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v4, v6}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-wide v6, LW6/e;->m:J

    invoke-virtual {v4, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v4, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    :cond_42
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v4

    new-array v6, v2, [F

    aput v4, v6, v1

    aput p3, v6, v0

    invoke-static {p2, v3, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p3

    iput-object p3, p0, LW6/e;->e:Landroid/animation/ObjectAnimator;

    if-eqz p3, :cond_6c

    iget-object v0, p0, LW6/e;->g:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p3, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-wide v0, LW6/e;->m:J

    invoke-virtual {p3, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {p3, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    invoke-virtual {p3, v5}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    new-instance v0, LW6/e$e;

    invoke-direct {v0, p0, p1, p2}, LW6/e$e;-><init>(LW6/e;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p3, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_6c
    iget-object p1, p0, LW6/e;->e:Landroid/animation/ObjectAnimator;

    if-eqz p1, :cond_73

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    :cond_73
    iget-object p0, p0, LW6/e;->d:Landroid/animation/ObjectAnimator;

    if-eqz p0, :cond_7a

    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_7a
    return-void
.end method

.method private final u(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V
    .registers 3

    new-instance p0, LW6/e$f;

    invoke-direct {p0, p1}, LW6/e$f;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    invoke-virtual {p2, p0}, Lcom/airbnb/lottie/LottieAnimationView;->addAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    new-instance p0, LW6/a;

    invoke-direct {p0, p2}, LW6/a;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView;->addAnimatorUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method private static final v(Lcom/airbnb/lottie/LottieAnimationView;Landroid/animation/ValueAnimator;)V
    .registers 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    float-to-double v0, p1

    const-wide v2, 0x3fefae147ae147aeL    # 0.99

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_1a

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    :cond_1a
    return-void
.end method

.method private static final y(Landroid/view/View;Landroid/animation/ValueAnimator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-static {p1, p1, v0}, Landroid/graphics/RenderEffect;->createBlurEffect(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    return-void
.end method


# virtual methods
.method public final A(Lv8/a;)V
    .registers 2

    iput-object p1, p0, LW6/e;->h:Lv8/a;

    return-void
.end method

.method public final B(Landroid/view/View;ZZZLv8/a;)V
    .registers 13

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, LW6/e;->C(Landroid/view/View;ZZZZLv8/a;)V

    return-void
.end method

.method public final C(Landroid/view/View;ZZZZLv8/a;)V
    .registers 11

    if-nez p1, :cond_3

    goto :goto_2a

    :cond_3
    invoke-virtual {p1, p4}, Landroid/view/View;->setEnabled(Z)V

    const/4 p4, 0x4

    const/4 v0, 0x0

    if-eqz p2, :cond_c

    move v1, v0

    goto :goto_d

    :cond_c
    move v1, p4

    :goto_d
    iget-object v2, p0, LW6/e;->a:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LW6/e$b;

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, LW6/e$b;->a()Landroid/view/animation/Animation;

    move-result-object v2

    goto :goto_1d

    :cond_1c
    const/4 v2, 0x0

    :goto_1d
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-ne v3, v1, :cond_2b

    if-eqz p5, :cond_2b

    if-eqz v2, :cond_2a

    invoke-direct {p0, p1, p2, v2}, LW6/e;->j(Landroid/view/View;ZLandroid/view/animation/Animation;)V

    :cond_2a
    :goto_2a
    return-void

    :cond_2b
    if-eqz v2, :cond_30

    invoke-direct {p0, p1, p2, v2}, LW6/e;->j(Landroid/view/View;ZLandroid/view/animation/Animation;)V

    :cond_30
    if-eqz p2, :cond_3c

    if-eqz p3, :cond_38

    invoke-direct {p0, p1, p6}, LW6/e;->E(Landroid/view/View;Lv8/a;)V

    return-void

    :cond_38
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3c
    if-eqz p3, :cond_42

    invoke-direct {p0, p1, p6}, LW6/e;->p(Landroid/view/View;Lv8/a;)V

    return-void

    :cond_42
    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final D(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .registers 6

    const-string v0, "lavProcessing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lavProcessingLoop"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    if-eqz p3, :cond_f

    const/4 v1, 0x0

    goto :goto_10

    :cond_f
    move v1, v0

    :goto_10
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    if-eqz p3, :cond_1c

    invoke-direct {p0, p1, p2}, LW6/e;->u(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void

    :cond_1c
    invoke-direct {p0, p1, p2}, LW6/e;->k(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V

    return-void
.end method

.method public final G(Landroid/widget/ImageView;Z)V
    .registers 5

    const-string v0, "ivSelectedFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LW6/e;->i:Z

    if-eq v0, p2, :cond_25

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/drawable/TransitionDrawable;

    if-eqz p2, :cond_1d

    sget-wide v0, LW6/e;->l:J

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    goto :goto_23

    :cond_1d
    sget-wide v0, LW6/e;->l:J

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/TransitionDrawable;->reverseTransition(I)V

    :goto_23
    iput-boolean p2, p0, LW6/e;->i:Z

    :cond_25
    return-void
.end method

.method public final H(Landroid/view/View;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010011

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    new-instance v1, LW6/e$i;

    invoke-direct {v1, p0, p1, v0}, LW6/e$i;-><init>(LW6/e;Landroid/view/View;Landroid/view/animation/Animation;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final i()V
    .registers 2

    invoke-direct {p0}, LW6/e;->n()V

    invoke-direct {p0}, LW6/e;->m()V

    invoke-virtual {p0}, LW6/e;->l()V

    const/4 v0, 0x0

    iput-object v0, p0, LW6/e;->d:Landroid/animation/ObjectAnimator;

    iput-object v0, p0, LW6/e;->e:Landroid/animation/ObjectAnimator;

    return-void
.end method

.method public final l()V
    .registers 2

    iget-object v0, p0, LW6/e;->d:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_a
    iget-object p0, p0, LW6/e;->e:Landroid/animation/ObjectAnimator;

    if-eqz p0, :cond_14

    invoke-virtual {p0}, Landroid/animation/Animator;->removeAllListeners()V

    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    :cond_14
    return-void
.end method

.method public final o()V
    .registers 1

    iget-object p0, p0, LW6/e;->a:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final r()Lv8/a;
    .registers 1

    iget-object p0, p0, LW6/e;->h:Lv8/a;

    return-object p0
.end method

.method public final s(Landroid/view/View;Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;IZ)V
    .registers 18

    const-string v0, "layoutSubject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lavProcessing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lavProcessingLoop"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imgPromptView"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f01000f

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    new-instance v0, LW6/e$d;

    move-object v1, p0

    move-object v7, p1

    move-object v8, p2

    move-object v5, p3

    move-object v6, p4

    move-object v2, p5

    move/from16 v9, p6

    move/from16 v4, p7

    invoke-direct/range {v0 .. v9}, LW6/e$d;-><init>(LW6/e;Landroid/view/View;Landroid/view/animation/Animation;ZLcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;Landroid/view/View;I)V

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p5, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final w(Landroid/view/View;Landroid/view/View;)V
    .registers 3

    const-string p0, "layoutSubject"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "layoutStyle"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p2, p0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final x(Landroid/view/View;FFJ)V
    .registers 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p2, v0, v1

    const/4 p2, 0x1

    aput p3, v0, p2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    iget-object p3, p0, LW6/e;->f:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p2, p4, p5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance p3, LW6/d;

    invoke-direct {p3, p1}, LW6/d;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p3, LW6/e$g;

    invoke-direct {p3, p0, p1, p2}, LW6/e$g;-><init>(LW6/e;Landroid/view/View;Landroid/animation/ValueAnimator;)V

    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final z(Landroid/view/View;FF)V
    .registers 4

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-static {p2, p3, p0}, Landroid/graphics/RenderEffect;->createBlurEffect(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    return-void
.end method
