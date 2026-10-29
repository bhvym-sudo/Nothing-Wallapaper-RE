.class public final Ly7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/o$a;
    }
.end annotation


# static fields
.field public static final o:Ly7/o$a;

.field private static final p:Landroid/view/animation/Interpolator;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field private final c:LJ7/b;

.field private final d:Landroid/view/ViewGroup;

.field private final e:Landroidx/viewpager2/widget/ViewPager2;

.field private final f:Landroid/view/ViewGroup;

.field private final g:Landroid/view/ViewGroup;

.field private final h:Landroid/view/View;

.field private final i:Landroid/view/ViewGroup;

.field private final j:LH3/s;

.field private final k:F

.field private l:Landroid/view/View;

.field private m:Landroid/view/View;

.field private n:Landroid/animation/Animator;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Ly7/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/o$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ly7/o;->o:Ly7/o$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Ly7/o;->p:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LJ7/b;)V
    .registers 6

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lockScreenFragment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/o;->a:Landroid/view/View;

    iput-object p2, p0, Ly7/o;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-object p3, p0, Ly7/o;->c:LJ7/b;

    const p2, 0x7f0a015b

    invoke-virtual {p1, p2}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "requireViewById(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/view/ViewGroup;

    iput-object p2, p0, Ly7/o;->d:Landroid/view/ViewGroup;

    const p2, 0x7f0a03e1

    invoke-virtual {p1, p2}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/viewpager2/widget/ViewPager2;

    iput-object p2, p0, Ly7/o;->e:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f0a00e6

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Ly7/o;->f:Landroid/view/ViewGroup;

    const v0, 0x7f0a0388

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Ly7/o;->g:Landroid/view/ViewGroup;

    const v0, 0x7f0a0363

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly7/o;->h:Landroid/view/View;

    const v0, 0x7f0a04c2

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Ly7/o;->i:Landroid/view/ViewGroup;

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object p3

    iput-object p3, p0, Ly7/o;->j:LH3/s;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p3, "getContext(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LH6/a;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_84

    const/high16 p1, -0x3c060000    # -500.0f

    goto :goto_86

    :cond_84
    const/high16 p1, 0x43fa0000    # 500.0f

    :goto_86
    iput p1, p0, Ly7/o;->k:F

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    instance-of p3, p2, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    if-eqz p3, :cond_95

    check-cast p2, Landroid/view/ViewGroup;

    goto :goto_96

    :cond_95
    move-object p2, v0

    :goto_96
    if-eqz p2, :cond_b2

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    const/4 v1, 0x2

    if-lt p3, v1, :cond_a0

    move-object v0, p2

    :cond_a0
    if-eqz v0, :cond_b2

    invoke-static {v0, p1}, Landroidx/core/view/K;->a(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ly7/o;->l:Landroid/view/View;

    const/4 p1, 0x1

    invoke-static {v0, p1}, Landroidx/core/view/K;->a(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ly7/o;->m:Landroid/view/View;

    invoke-direct {p0}, Ly7/o;->g()V

    :cond_b2
    return-void
.end method

.method public static synthetic a(Lv8/a;Ly7/o;Z)V
    .registers 3

    invoke-static {p0, p1, p2}, Ly7/o;->m(Lv8/a;Ly7/o;Z)V

    return-void
.end method

.method public static synthetic b(Ly7/o;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Ly7/o;->l(Ly7/o;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final c(Z)V
    .registers 6

    iget-object v0, p0, Ly7/o;->d:Landroid/view/ViewGroup;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    iget-object v0, p0, Ly7/o;->e:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eqz p1, :cond_f

    move v3, v2

    goto :goto_10

    :cond_f
    move v3, v1

    :goto_10
    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Ly7/o;->f:Landroid/view/ViewGroup;

    if-eqz p1, :cond_19

    move v3, v2

    goto :goto_1a

    :cond_19
    move v3, v1

    :goto_1a
    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Ly7/o;->g:Landroid/view/ViewGroup;

    if-eqz p1, :cond_23

    move v3, v2

    goto :goto_24

    :cond_23
    move v3, v1

    :goto_24
    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Ly7/o;->h:Landroid/view/View;

    if-eqz p1, :cond_2d

    move v3, v2

    goto :goto_2e

    :cond_2d
    move v3, v1

    :goto_2e
    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object p0, p0, Ly7/o;->i:Landroid/view/ViewGroup;

    if-eqz p1, :cond_36

    move v1, v2

    :cond_36
    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method

.method private final g()V
    .registers 4

    iget-object v0, p0, Ly7/o;->c:LJ7/b;

    invoke-virtual {v0}, LJ7/b;->i()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Ly7/o;->i(Ly7/o;ZLv8/a;ILjava/lang/Object;)V

    :cond_e
    return-void
.end method

.method public static synthetic i(Ly7/o;ZLv8/a;ILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_5

    const/4 p1, 0x1

    :cond_5
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_a

    const/4 p2, 0x0

    :cond_a
    invoke-virtual {p0, p1, p2}, Ly7/o;->h(ZLv8/a;)V

    return-void
.end method

.method private final j(ZZLv8/a;)V
    .registers 13

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly7/o;->m:Landroid/view/View;

    if-nez v2, :cond_8

    goto/16 :goto_f5

    :cond_8
    iget-object v3, p0, Ly7/o;->n:Landroid/animation/Animator;

    if-eqz v3, :cond_19

    invoke-virtual {v3}, Landroid/animation/Animator;->isRunning()Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_14

    :cond_13
    const/4 v3, 0x0

    :goto_14
    if-eqz v3, :cond_19

    invoke-virtual {v3}, Landroid/animation/Animator;->cancel()V

    :cond_19
    invoke-direct {p0, v1}, Ly7/o;->c(Z)V

    iget-object v3, p0, Ly7/o;->c:LJ7/b;

    invoke-virtual {v3}, LJ7/b;->g()Lz7/a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    if-eqz p1, :cond_30

    iget-object v4, p0, Ly7/o;->c:LJ7/b;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    move-result v5

    invoke-virtual {v4, v5}, LJ7/b;->v(F)V

    :cond_30
    if-eqz p1, :cond_35

    iget v4, p0, Ly7/o;->k:F

    goto :goto_3b

    :cond_35
    iget-object v4, p0, Ly7/o;->c:LJ7/b;

    invoke-virtual {v4}, LJ7/b;->h()F

    move-result v4

    :goto_3b
    if-eqz p1, :cond_41

    const v5, 0x3f733333    # 0.95f

    goto :goto_43

    :cond_41
    const/high16 v5, 0x3f800000    # 1.0f

    :goto_43
    iget-object v6, p0, Ly7/o;->i:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    move-result v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v6, v7}, Landroid/view/View;->setPivotY(F)V

    iget-object v6, p0, Ly7/o;->g:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    move-result v7

    neg-float v7, v7

    div-float/2addr v7, v8

    invoke-virtual {v6, v7}, Landroid/view/View;->setPivotY(F)V

    iget-object v6, p0, Ly7/o;->h:Landroid/view/View;

    invoke-virtual {v3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    move-result v7

    neg-float v7, v7

    div-float/2addr v7, v8

    invoke-virtual {v6, v7}, Landroid/view/View;->setPivotY(F)V

    iget-object v6, p0, Ly7/o;->f:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    neg-float v3, v3

    div-float/2addr v3, v8

    invoke-virtual {v6, v3}, Landroid/view/View;->setPivotY(F)V

    if-eqz p2, :cond_d2

    sget-object p2, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array v3, v0, [F

    aput v4, v3, v1

    invoke-static {v2, p2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    iget-object v2, p0, Ly7/o;->f:Landroid/view/ViewGroup;

    sget-object v3, Lcom/android/launcher3/j;->b:Landroid/util/FloatProperty;

    new-array v0, v0, [F

    aput v5, v0, v1

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    new-instance v1, Ly7/m;

    invoke-direct {v1, p0}, Ly7/m;-><init>(Ly7/o;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v1, p2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    iget-object p2, p0, Ly7/o;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->G2(Z)Landroid/animation/AnimatorSet;

    move-result-object p2

    if-eqz p2, :cond_b3

    invoke-virtual {v1, p2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_b3
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    const-wide/16 v2, 0x190

    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    sget-object p2, Ly7/o;->p:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, p2}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p2, Ly7/n;

    invoke-direct {p2, p3, p0, p1}, Ly7/n;-><init>(Lv8/a;Ly7/o;Z)V

    invoke-static {p2}, Lw2/f;->c(Ljava/lang/Runnable;)Landroid/animation/Animator$AnimatorListener;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    iput-object v1, p0, Ly7/o;->n:Landroid/animation/Animator;

    return-void

    :cond_d2
    invoke-virtual {v2, v4}, Landroid/view/View;->setTranslationX(F)V

    sget-object p2, LA3/f;->a:LA3/f;

    iget-object p3, p0, Ly7/o;->f:Landroid/view/ViewGroup;

    invoke-virtual {p2, p3, v5}, LA3/f;->p(Landroid/view/View;F)V

    iget-object p3, p0, Ly7/o;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2, p3, v5}, LA3/f;->p(Landroid/view/View;F)V

    iget-object p3, p0, Ly7/o;->i:Landroid/view/ViewGroup;

    invoke-virtual {p2, p3, v5}, LA3/f;->p(Landroid/view/View;F)V

    iget-object p3, p0, Ly7/o;->h:Landroid/view/View;

    invoke-virtual {p2, p3, v5}, LA3/f;->p(Landroid/view/View;F)V

    iget-object p2, p0, Ly7/o;->c:LJ7/b;

    invoke-virtual {p2, p1}, LJ7/b;->w(Z)V

    if-nez p1, :cond_f5

    invoke-direct {p0, v0}, Ly7/o;->c(Z)V

    :cond_f5
    :goto_f5
    return-void
.end method

.method static synthetic k(Ly7/o;ZZLv8/a;ILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x1

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    :cond_a
    invoke-direct {p0, p1, p2, p3}, Ly7/o;->j(ZZLv8/a;)V

    return-void
.end method

.method private static final l(Ly7/o;Landroid/animation/ValueAnimator;)V
    .registers 6

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LA3/f;->a:LA3/f;

    iget-object v1, p0, Ly7/o;->g:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "getAnimatedValue(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LA3/f;->p(Landroid/view/View;F)V

    iget-object v1, p0, Ly7/o;->i:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LA3/f;->p(Landroid/view/View;F)V

    iget-object p0, p0, Ly7/o;->h:Landroid/view/View;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {v0, p0, p1}, LA3/f;->p(Landroid/view/View;F)V

    return-void
.end method

.method private static final m(Lv8/a;Ly7/o;Z)V
    .registers 3

    if-eqz p0, :cond_5

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_5
    iget-object p0, p1, Ly7/o;->c:LJ7/b;

    invoke-virtual {p0, p2}, LJ7/b;->w(Z)V

    if-nez p2, :cond_10

    const/4 p0, 0x1

    invoke-direct {p1, p0}, Ly7/o;->c(Z)V

    :cond_10
    return-void
.end method


# virtual methods
.method public final d()V
    .registers 7

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Ly7/o;->k(Ly7/o;ZZLv8/a;ILjava/lang/Object;)V

    return-void
.end method

.method public final e()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;
    .registers 1

    iget-object p0, p0, Ly7/o;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-object p0
.end method

.method public final f()V
    .registers 7

    iget-object v0, p0, Ly7/o;->l:Landroid/view/View;

    if-nez v0, :cond_5

    return-void

    :cond_5
    const v1, 0x7f0a03df

    invoke-virtual {v0, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    sget-object v1, Ly7/r;->z:Ly7/r$b;

    iget-object v2, p0, Ly7/o;->e:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1, v2}, Ly7/r$b;->a(Landroid/view/View;)Landroid/graphics/RectF;

    move-result-object v1

    iget-object v2, p0, Ly7/o;->j:LH3/s;

    iget-object v3, p0, Ly7/o;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, LH3/s;->d(Landroid/content/Context;)F

    move-result v2

    iget-object v3, p0, Ly7/o;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f0704b7

    invoke-static {v3, v4}, Li6/q;->c(Landroid/content/Context;I)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    iget v4, v1, Landroid/graphics/RectF;->top:F

    int-to-float v0, v0

    add-float/2addr v4, v0

    iput v4, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v4, v2

    iput v4, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Ly7/o;->j:LH3/s;

    iget-object v2, p0, Ly7/o;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v0, v2}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v0

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    sub-float v4, v2, v3

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    iput v4, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v4, v3

    iput v4, v1, Landroid/graphics/RectF;->right:F

    new-instance v3, Landroid/graphics/RectF;

    int-to-float v0, v0

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object p0, p0, Ly7/o;->c:LJ7/b;

    new-instance v0, Lz7/a;

    invoke-direct {v0, v1, v3}, Lz7/a;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    invoke-virtual {p0, v0}, LJ7/b;->u(Lz7/a;)V

    return-void
.end method

.method public final h(ZLv8/a;)V
    .registers 5

    iget-object v0, p0, Ly7/o;->n:Landroid/animation/Animator;

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-ne v0, v1, :cond_c

    return-void

    :cond_c
    invoke-direct {p0, v1, p1, p2}, Ly7/o;->j(ZZLv8/a;)V

    return-void
.end method
