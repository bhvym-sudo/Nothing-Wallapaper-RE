.class public abstract Lq6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/View;ZFFZZ)V
    .registers 12

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "view"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "scaleX"

    if-eqz p1, :cond_17

    new-array v4, v2, [F

    aput p3, v4, v1

    aput p2, v4, v0

    invoke-static {p0, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    goto :goto_21

    :cond_17
    new-array v4, v2, [F

    aput p2, v4, v1

    aput p3, v4, v0

    invoke-static {p0, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    :goto_21
    const-string v4, "scaleY"

    if-eqz p1, :cond_30

    new-array v5, v2, [F

    aput p3, v5, v1

    aput p2, v5, v0

    invoke-static {p0, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    goto :goto_3a

    :cond_30
    new-array v5, v2, [F

    aput p2, v5, v1

    aput p3, v5, v0

    invoke-static {p0, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    :goto_3a
    new-instance p3, Lq6/a$a;

    invoke-direct {p3, p0, p5}, Lq6/a$a;-><init>(Landroid/view/View;Z)V

    invoke-virtual {v3, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {v3, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {p2, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance p3, Landroid/animation/AnimatorSet;

    invoke-direct {p3}, Landroid/animation/AnimatorSet;-><init>()V

    if-eqz p4, :cond_73

    const-string p4, "alpha"

    if-eqz p1, :cond_5f

    new-array p1, v2, [F

    fill-array-data p1, :array_7e

    invoke-static {p0, p4, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    goto :goto_68

    :cond_5f
    new-array p1, v2, [F

    fill-array-data p1, :array_86

    invoke-static {p0, p4, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    :goto_68
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    filled-new-array {v3, p2, p0}, [Landroid/animation/Animator;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_7a

    :cond_73
    filled-new-array {v3, p2}, [Landroid/animation/Animator;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    :goto_7a
    invoke-virtual {p3}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_7e
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_86
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static synthetic b(Landroid/view/View;ZFFZZILjava/lang/Object;)V
    .registers 14

    and-int/lit8 p7, p6, 0x10

    if-eqz p7, :cond_5

    const/4 p4, 0x0

    :cond_5
    move v4, p4

    and-int/lit8 p4, p6, 0x20

    if-eqz p4, :cond_b

    const/4 p5, 0x1

    :cond_b
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v5, p5

    invoke-static/range {v0 .. v5}, Lq6/a;->a(Landroid/view/View;ZFFZZ)V

    return-void
.end method

.method public static final c(Landroid/view/View;ZLv8/a;)V
    .registers 5

    const/4 v0, 0x2

    const-string v1, "view"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "alpha"

    if-eqz p1, :cond_1c

    new-array p1, v0, [F

    fill-array-data p1, :array_36

    invoke-static {p0, v1, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    new-instance v0, Lq6/a$b;

    invoke-direct {v0, p0, p2}, Lq6/a$b;-><init>(Landroid/view/View;Lv8/a;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_2d

    :cond_1c
    new-array p1, v0, [F

    fill-array-data p1, :array_3e

    invoke-static {p0, v1, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    new-instance v0, Lq6/a$c;

    invoke-direct {v0, p0, p2}, Lq6/a$c;-><init>(Landroid/view/View;Lv8/a;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :goto_2d
    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :array_36
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_3e
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static final d(Landroid/view/View;Landroid/view/View;Z)V
    .registers 6

    const-string v0, "borderView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0704ab

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0704aa

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sub-int v0, v1, v0

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3a

    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    sget-object p0, LA3/f;->a:LA3/f;

    invoke-virtual {p0, p1, v0}, LA3/f;->p(Landroid/view/View;F)V

    return-void

    :cond_3a
    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/View;->setAlpha(F)V

    sget-object p0, LA3/f;->a:LA3/f;

    invoke-virtual {p0, p1, v1}, LA3/f;->p(Landroid/view/View;F)V

    return-void
.end method
