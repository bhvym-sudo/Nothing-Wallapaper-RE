.class public final Ly7/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/C$a;
    }
.end annotation


# static fields
.field public static final h:Ly7/C$a;

.field private static final i:Landroid/view/animation/Interpolator;


# instance fields
.field private final a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field private final b:Lcom/android/launcher3/f;

.field private final c:Lcom/android/launcher3/Workspace;

.field private final d:Lcom/android/launcher3/CellLayout;

.field private final e:Lcom/android/launcher3/v;

.field private f:Landroid/animation/AnimatorSet;

.field private final g:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Ly7/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/C$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ly7/C;->h:Ly7/C$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Ly7/C;->i:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Lcom/android/launcher3/views/f;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;)V
    .registers 4

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockHostView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly7/C;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p2

    iput-object p2, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    invoke-interface {p1}, Lcom/android/launcher3/views/f;->M()Lcom/android/launcher3/Workspace;

    move-result-object p1

    iput-object p1, p0, Ly7/C;->c:Lcom/android/launcher3/Workspace;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object p1

    iput-object p1, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    invoke-virtual {p1}, Lcom/android/launcher3/CellLayout;->getShortcutsAndWidgets()Lcom/android/launcher3/v;

    move-result-object p1

    iput-object p1, p0, Ly7/C;->e:Lcom/android/launcher3/v;

    new-instance p1, Ly7/v;

    invoke-direct {p1, p0}, Ly7/v;-><init>(Ly7/C;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Ly7/C;->g:Lh8/h;

    return-void
.end method

.method private final A(ZZLv8/a;)V
    .registers 6

    iget-object v0, p0, Ly7/C;->f:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_11
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-direct {p0, p1}, Ly7/C;->j(Z)Landroid/animation/Animator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-direct {p0, p1}, Ly7/C;->q(Z)Landroid/animation/Animator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-direct {p0, p1}, Ly7/C;->l(Z)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    if-eqz p2, :cond_3b

    iget-object p2, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    const-string v1, "cellLayout"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ly7/C;->s(ZLcom/android/launcher3/CellLayout;)Landroid/animation/Animator;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_3b
    if-eqz p1, :cond_45

    invoke-direct {p0}, Ly7/C;->r()Landroid/animation/AnimatorSet;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_4c

    :cond_45
    invoke-direct {p0}, Ly7/C;->m()Landroid/animation/AnimatorSet;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :goto_4c
    const-wide/16 p1, 0x190

    invoke-virtual {v0, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    sget-object p1, Ly7/C;->i:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p1, Ly7/C$d;

    invoke-direct {p1, p3, p0}, Ly7/C$d;-><init>(Lv8/a;Ly7/C;)V

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    iput-object v0, p0, Ly7/C;->f:Landroid/animation/AnimatorSet;

    return-void
.end method

.method public static synthetic a(FFFFLcom/android/launcher3/u;Landroid/animation/ValueAnimator;)V
    .registers 6

    invoke-static/range {p0 .. p5}, Ly7/C;->z(FFFFLcom/android/launcher3/u;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Ly7/C;)I
    .registers 1

    invoke-static {p0}, Ly7/C;->v(Ly7/C;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lh8/o;)Ljava/lang/Comparable;
    .registers 1

    invoke-static {p0}, Ly7/C;->p(Lh8/o;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly7/C;ZILandroid/graphics/Rect;Landroid/graphics/drawable/Drawable;Landroid/animation/ValueAnimator;)V
    .registers 6

    invoke-static/range {p0 .. p5}, Ly7/C;->k(Ly7/C;ZILandroid/graphics/Rect;Landroid/graphics/drawable/Drawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e(Lcom/android/launcher3/CellLayout;FILandroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;)V
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, Ly7/C;->t(Lcom/android/launcher3/CellLayout;FILandroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic f(Lh8/o;)Ljava/lang/Comparable;
    .registers 1

    invoke-static {p0}, Ly7/C;->n(Lh8/o;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/view/View;)Lh8/o;
    .registers 1

    invoke-static {p0}, Ly7/C;->o(Landroid/view/View;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Ly7/C;)Lcom/android/launcher3/CellLayout;
    .registers 1

    iget-object p0, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    return-object p0
.end method

.method private final i(Landroid/view/View;Z)Landroid/animation/ObjectAnimator;
    .registers 7

    const/high16 p0, 0x3f800000    # 1.0f

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [F

    if-eqz p2, :cond_f

    aput v1, v3, v2

    aput p0, v3, v0

    goto :goto_13

    :cond_f
    aput p0, v3, v2

    aput v1, v3, v0

    :goto_13
    sget-object p0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    array-length v0, v3

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    invoke-static {p1, p0, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    new-instance v0, Ly7/C$b;

    invoke-direct {v0, p2, p1}, Ly7/C$b;-><init>(ZLandroid/view/View;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-string p1, "apply(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final j(Z)Landroid/animation/Animator;
    .registers 10

    iget-object v0, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    invoke-virtual {v0}, Lcom/android/launcher3/CellLayout;->getAnimBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    new-instance v5, Landroid/graphics/Rect;

    iget-object v0, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    iget v1, v0, Lcom/android/launcher3/f;->H:I

    iget v0, v0, Lcom/android/launcher3/f;->I:I

    const/4 v2, 0x0

    invoke-direct {v5, v2, v2, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x1

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x2

    new-array v4, v4, [F

    if-eqz p1, :cond_21

    aput v3, v4, v2

    aput v0, v4, v1

    goto :goto_25

    :cond_21
    aput v0, v4, v2

    aput v3, v4, v1

    :goto_25
    iget-object v0, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->f0:I

    array-length v1, v4

    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v7

    new-instance v1, Ly7/w;

    move-object v2, p0

    move v3, p1

    move v4, v0

    invoke-direct/range {v1 .. v6}, Ly7/w;-><init>(Ly7/C;ZILandroid/graphics/Rect;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v7, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-string p0, "apply(...)"

    invoke-static {v7, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v7
.end method

.method private static final k(Ly7/C;ZILandroid/graphics/Rect;Landroid/graphics/drawable/Drawable;Landroid/animation/ValueAnimator;)V
    .registers 9

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->H:I

    int-to-float v0, v0

    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "getAnimatedValue(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    if-eqz p1, :cond_23

    const/4 p1, 0x1

    int-to-float p1, p1

    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p5

    sub-float/2addr p1, p5

    goto :goto_27

    :cond_23
    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    :goto_27
    iget-object p5, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    iget p5, p5, Lcom/android/launcher3/f;->H:I

    div-int/lit8 p5, p5, 0x2

    int-to-float p2, p2

    mul-float/2addr p2, p1

    float-to-int p1, p2

    add-int/2addr p5, p1

    div-int/lit8 v0, v0, 0x2

    sub-int p1, p5, v0

    iput p1, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr p5, v0

    iput p5, p3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p4, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object p0, p0, Ly7/C;->e:Lcom/android/launcher3/v;

    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method private final l(Z)Landroid/animation/ObjectAnimator;
    .registers 2

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_6

    :cond_4
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_6
    iget-object p0, p0, Ly7/C;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    invoke-interface {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->f(F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method private final m()Landroid/animation/AnimatorSet;
    .registers 14

    iget-object v0, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    invoke-virtual {v0}, Lcom/android/launcher3/CellLayout;->getOccupied()LV5/b;

    move-result-object v1

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iget-object v2, p0, Ly7/C;->e:Lcom/android/launcher3/v;

    const-string v3, "shortcutsAndWidgets"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object v2

    new-instance v3, Ly7/y;

    invoke-direct {v3}, Ly7/y;-><init>()V

    invoke-static {v2, v3}, LD8/k;->x(LD8/h;Lv8/l;)LD8/h;

    move-result-object v2

    new-instance v3, Ly7/z;

    invoke-direct {v3}, Ly7/z;-><init>()V

    new-instance v4, Ly7/A;

    invoke-direct {v4}, Ly7/A;-><init>()V

    filled-new-array {v3, v4}, [Lv8/l;

    move-result-object v3

    invoke-static {v3}, Lk8/a;->b([Lv8/l;)Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v2, v3}, LD8/k;->z(LD8/h;Ljava/util/Comparator;)LD8/h;

    move-result-object v2

    invoke-interface {v2}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_39
    :goto_39
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroid/view/View;

    invoke-virtual {v2}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/nothing/launcher/card/t;

    iget v2, v9, LC2/b;->s:I

    iget v3, v9, LC2/b;->t:I

    iget v4, v9, LC2/b;->u:I

    iget v5, v9, LC2/b;->v:I

    invoke-virtual {v1, v2, v3, v4, v5}, LV5/b;->g(IIII)Z

    move-result v2

    if-nez v2, :cond_39

    const/4 v2, 0x2

    new-array v10, v2, [I

    const/4 v11, 0x0

    invoke-virtual {v1, v9, v11}, LV5/b;->j(LC2/b;Z)V

    iget v2, v9, LC2/b;->u:I

    iget v3, v9, LC2/b;->v:I

    invoke-virtual {v1, v10, v2, v3}, LV5/b;->c([III)Z

    move-result v2

    const/4 v12, 0x1

    if-eqz v2, :cond_99

    iget v2, v9, LC2/b;->s:I

    invoke-virtual {v9, v2}, Lcom/nothing/launcher/card/t;->r(I)V

    iget v2, v9, LC2/b;->t:I

    invoke-virtual {v9, v2}, Lcom/nothing/launcher/card/t;->s(I)V

    aget v2, v10, v11

    iput v2, v9, LC2/b;->s:I

    aget v3, v10, v12

    iput v3, v9, LC2/b;->t:I

    iget v4, v9, LC2/b;->u:I

    iget v5, v9, LC2/b;->v:I

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, LV5/b;->i(IIIIZ)V

    aget v2, v10, v11

    aget v3, v10, v12

    invoke-direct {p0, v8, v2, v3, v9}, Ly7/C;->y(Landroid/view/View;IILcom/nothing/launcher/card/t;)Landroid/animation/ValueAnimator;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_39

    :cond_99
    invoke-virtual {v9, v12}, Lcom/nothing/launcher/card/t;->t(Z)V

    invoke-direct {p0, v8, v11}, Ly7/C;->i(Landroid/view/View;Z)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_39

    :cond_a4
    return-object v0
.end method

.method private static final n(Lh8/o;)Ljava/lang/Comparable;
    .registers 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/t;

    iget p0, p0, LC2/b;->s:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroid/view/View;)Lh8/o;
    .registers 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-static {p0, v0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lh8/o;)Ljava/lang/Comparable;
    .registers 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/t;

    iget p0, p0, LC2/b;->t:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private final q(Z)Landroid/animation/Animator;
    .registers 7

    iget-object v0, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->f0:I

    int-to-float v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz p1, :cond_12

    new-array p1, v4, [F

    aput v0, p1, v3

    aput v1, p1, v2

    goto :goto_18

    :cond_12
    new-array p1, v4, [F

    aput v1, p1, v3

    aput v0, p1, v2

    :goto_18
    iget-object p0, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    invoke-virtual {p0}, Lcom/android/launcher3/CellLayout;->getEmptyView()Landroid/view/View;

    move-result-object p0

    sget-object v0, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p1

    invoke-static {p0, v0, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const-string p1, "ofFloat(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final r()Landroid/animation/AnimatorSet;
    .registers 9

    iget-object v0, p0, Ly7/C;->d:Lcom/android/launcher3/CellLayout;

    invoke-virtual {v0}, Lcom/android/launcher3/CellLayout;->getOccupied()LV5/b;

    move-result-object v0

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v0}, LV5/b;->a()V

    iget-object v2, p0, Ly7/C;->e:Lcom/android/launcher3/v;

    const-string v3, "shortcutsAndWidgets"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object v2

    invoke-interface {v2}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_76

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/nothing/launcher/card/t;

    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->k()I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, -0x1

    if-ne v5, v7, :cond_55

    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->l()I

    move-result v5

    if-eq v5, v7, :cond_43

    goto :goto_55

    :cond_43
    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v5

    if-eqz v5, :cond_72

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/nothing/launcher/card/t;->t(Z)V

    invoke-direct {p0, v3, v6}, Ly7/C;->i(Landroid/view/View;Z)Landroid/animation/ObjectAnimator;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_72

    :cond_55
    :goto_55
    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->k()I

    move-result v5

    iput v5, v4, LC2/b;->s:I

    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->l()I

    move-result v5

    iput v5, v4, LC2/b;->t:I

    invoke-virtual {v4, v7}, Lcom/nothing/launcher/card/t;->r(I)V

    invoke-virtual {v4, v7}, Lcom/nothing/launcher/card/t;->s(I)V

    iget v5, v4, LC2/b;->s:I

    iget v7, v4, LC2/b;->t:I

    invoke-direct {p0, v3, v5, v7, v4}, Ly7/C;->y(Landroid/view/View;IILcom/nothing/launcher/card/t;)Landroid/animation/ValueAnimator;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_72
    :goto_72
    invoke-virtual {v0, v4, v6}, LV5/b;->j(LC2/b;Z)V

    goto :goto_1d

    :cond_76
    return-object v1
.end method

.method private final s(ZLcom/android/launcher3/CellLayout;)Landroid/animation/Animator;
    .registers 5

    invoke-direct {p0}, Ly7/C;->w()I

    move-result p0

    if-eqz p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, -0x1

    :goto_9
    mul-int/2addr p0, p1

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result p1

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_26

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Ly7/x;

    invoke-direct {v1, p2, p1, p0, v0}, Ly7/x;-><init>(Lcom/android/launcher3/CellLayout;FILandroid/animation/ValueAnimator;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-string p0, "apply(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :array_26
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final t(Lcom/android/launcher3/CellLayout;FILandroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;)V
    .registers 6

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p2, p2

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p3

    mul-float/2addr p2, p3

    add-float/2addr p1, p2

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method private static final v(Ly7/C;)I
    .registers 2

    iget-object p0, p0, Ly7/C;->b:Lcom/android/launcher3/f;

    iget v0, p0, Lcom/android/launcher3/f;->n:I

    iget p0, p0, Lcom/android/launcher3/f;->o:I

    sub-int/2addr v0, p0

    return v0
.end method

.method private final w()I
    .registers 1

    iget-object p0, p0, Ly7/C;->g:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final y(Landroid/view/View;IILcom/nothing/launcher/card/t;)Landroid/animation/ValueAnimator;
    .registers 14

    const-string v0, "null cannot be cast to non-null type com.android.launcher3.Reorderable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Lcom/android/launcher3/u;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.android.launcher3.celllayout.CellLayoutLayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lx2/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lx2/b;->h:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lx2/b;->e:Z

    invoke-virtual {v0, p2}, Lx2/b;->e(I)V

    invoke-virtual {v0, p3}, Lx2/b;->f(I)V

    iget v2, v0, Lx2/b;->j:I

    iget v3, v0, Lx2/b;->k:I

    iget-object p0, p0, Ly7/C;->e:Lcom/android/launcher3/v;

    invoke-virtual {p0, p1}, Lcom/android/launcher3/v;->setupLp(Landroid/view/View;)V

    iget p0, v0, Lx2/b;->j:I

    iget v4, v0, Lx2/b;->k:I

    iput v2, v0, Lx2/b;->j:I

    iput v3, v0, Lx2/b;->k:I

    iput-boolean v1, v0, Lx2/b;->h:Z

    invoke-interface {v6}, Lcom/android/launcher3/u;->getTranslateDelegate()LF2/o;

    move-result-object v1

    const-string v5, "getTranslateDelegate(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    invoke-virtual {v1, v5}, LF2/o;->a(I)LF2/m$c;

    move-result-object v7

    invoke-virtual {v7}, LF2/m$c;->b()F

    move-result v7

    invoke-virtual {v1, v5}, LF2/o;->b(I)LF2/m$c;

    move-result-object v1

    invoke-virtual {v1}, LF2/m$c;->b()F

    move-result v1

    sub-int/2addr p0, v2

    int-to-float p0, p0

    sub-int/2addr v4, v3

    int-to-float v2, v4

    new-array v3, v5, [F

    fill-array-data v3, :array_78

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v8

    move v4, v1

    new-instance v1, Ly7/B;

    move v3, p0

    move v5, v2

    move v2, v7

    invoke-direct/range {v1 .. v6}, Ly7/B;-><init>(FFFFLcom/android/launcher3/u;)V

    invoke-virtual {v8, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Ly7/C$c;

    move-object v7, p1

    move v4, p2

    move v5, p3

    move-object v3, p4

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Ly7/C$c;-><init>(Lx2/b;Lcom/nothing/launcher/card/t;IILcom/android/launcher3/u;Landroid/view/View;)V

    invoke-virtual {v8, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-string p0, "apply(...)"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v8

    :array_78
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final z(FFFFLcom/android/launcher3/u;Landroid/animation/ValueAnimator;)V
    .registers 7

    const-string v0, "animation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p5

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Ljava/lang/Float;

    invoke-virtual {p5}, Ljava/lang/Float;->floatValue()F

    move-result p5

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p5

    mul-float/2addr p0, v0

    mul-float/2addr p1, p5

    add-float/2addr p0, p1

    mul-float/2addr v0, p2

    mul-float/2addr p5, p3

    add-float/2addr v0, p5

    invoke-interface {p4}, Lcom/android/launcher3/u;->getTranslateDelegate()LF2/o;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2, p0, v0}, LF2/o;->c(IFF)V

    return-void
.end method


# virtual methods
.method public final u(ZZLv8/a;)V
    .registers 5

    const-string v0, "onEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Ly7/C;->A(ZZLv8/a;)V

    return-void
.end method

.method public final x()Z
    .registers 3

    iget-object p0, p0, Ly7/C;->f:Landroid/animation/AnimatorSet;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method
