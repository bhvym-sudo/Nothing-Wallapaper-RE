.class public abstract Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;
.super Lcom/android/launcher3/views/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;
    }
.end annotation


# static fields
.field public static final b0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;

.field private static final c0:Landroid/view/animation/Interpolator;


# instance fields
.field private final P:Lcom/android/launcher3/f;

.field private final Q:F

.field private final R:F

.field private S:Landroid/animation/Animator;

.field private T:F

.field private U:Landroid/view/animation/Interpolator;

.field private V:J

.field private W:Landroid/view/View;

.field private a0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->b0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->c0:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/android/launcher3/views/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iget-object p1, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p1, Lcom/android/launcher3/views/f;

    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->P:Lcom/android/launcher3/f;

    const/4 p2, 0x1

    int-to-float p2, p2

    iget p1, p1, Lcom/android/launcher3/f;->T:F

    sub-float p3, p2, p1

    iput p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float/2addr p1, p3

    sub-float/2addr p2, p1

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->R:F

    const-wide/16 p1, 0x190

    iput-wide p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->V:J

    return-void
.end method

.method public static synthetic e0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->n0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V

    return-void
.end method

.method public static synthetic f0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/a;->A()V

    return-void
.end method

.method public static synthetic g0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->W()V

    return-void
.end method

.method public static synthetic h0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->l0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V

    return-void
.end method

.method public static final synthetic i0()Landroid/view/animation/Interpolator;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->c0:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method private static final l0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V
    .registers 1

    iget-object p0, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {p0}, LE2/b;->d()V

    return-void
.end method

.method private final m0(F)V
    .registers 7

    sget-object v0, Lcom/android/launcher3/views/e;->N:Landroid/util/FloatProperty;

    iget v1, p0, Lcom/android/launcher3/views/e;->z:F

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v1, v3, v4

    const/4 v1, 0x1

    aput v2, v3, v1

    invoke-static {p0, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget v1, p0, Lcom/android/launcher3/views/e;->z:F

    sub-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p1, v1}, LE2/b;->b(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p1, Lw2/q;->g:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/a0;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/a0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V

    invoke-static {p1}, Lw2/f;->c(Ljava/lang/Runnable;)Landroid/animation/Animator$AnimatorListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    return-void
.end method

.method private static final n0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V
    .registers 1

    iget-object p0, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {p0}, LE2/b;->d()V

    return-void
.end method


# virtual methods
.method protected I(Z)V
    .registers 9

    iget-boolean v0, p0, Lcom/android/launcher3/a;->q:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/android/launcher3/views/e;->E:Lcom/android/launcher3/views/e$c;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Lcom/android/launcher3/views/e$c;->a()V

    :cond_c
    const/high16 v0, 0x3f800000    # 1.0f

    if-nez p1, :cond_28

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    if-eqz p1, :cond_21

    invoke-virtual {p1}, Landroid/animation/Animator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_1c

    :cond_1b
    const/4 p1, 0x0

    :goto_1c
    if-eqz p1, :cond_21

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_21
    invoke-virtual {p0, v0}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->W()V

    return-void

    :cond_28
    iget-object p1, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {p1}, LE2/b;->i()Z

    move-result p1

    if-eqz p1, :cond_3d

    const-wide/16 v1, 0x190

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->c0:Landroid/view/animation/Interpolator;

    invoke-static {p1, v1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p1

    goto :goto_49

    :cond_3d
    iget-wide v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->V:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->U:Landroid/view/animation/Interpolator;

    invoke-static {p1, v1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p1

    :goto_49
    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/animation/Interpolator;

    sget-object v3, Lcom/android/launcher3/views/e;->N:Landroid/util/FloatProperty;

    iget v4, p0, Lcom/android/launcher3/views/e;->z:F

    const/4 v5, 0x2

    new-array v5, v5, [F

    const/4 v6, 0x0

    aput v4, v5, v6

    const/4 v4, 0x1

    aput v0, v5, v4

    invoke-static {p0, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/Y;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/Y;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V

    invoke-static {p1}, Lw2/f;->a(Ljava/lang/Runnable;)Landroid/animation/Animator$AnimatorListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    return-void
.end method

.method protected U()Z
    .registers 2

    iget-boolean v0, p0, Lcom/android/launcher3/a;->q:Z

    if-eqz v0, :cond_10

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    if-eqz p0, :cond_10

    invoke-virtual {p0}, Landroid/animation/Animator;->isRunning()Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_10

    return v0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public f(F)V
    .registers 10

    iget-object v0, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {v0, p1}, LE2/b;->h(F)Z

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gez v1, :cond_f

    move v1, v3

    goto :goto_10

    :cond_f
    move v1, v2

    :goto_10
    const/4 v4, 0x2

    if-nez v0, :cond_25

    iget v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    int-to-float v6, v4

    div-float/2addr v5, v6

    iget v6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->R:F

    iget v7, p0, Lcom/android/launcher3/views/e;->z:F

    cmpg-float v5, v5, v7

    if-gtz v5, :cond_25

    cmpg-float v5, v7, v6

    if-gtz v5, :cond_25

    move v5, v3

    goto :goto_26

    :cond_25
    move v5, v2

    :goto_26
    if-eqz v0, :cond_3e

    if-eqz v1, :cond_32

    iget v6, p0, Lcom/android/launcher3/views/e;->z:F

    iget v7, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    cmpl-float v6, v6, v7

    if-gez v6, :cond_3c

    :cond_32
    if-nez v1, :cond_3e

    iget v6, p0, Lcom/android/launcher3/views/e;->z:F

    iget v7, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    cmpg-float v6, v6, v7

    if-gez v6, :cond_3e

    :cond_3c
    move v6, v3

    goto :goto_3f

    :cond_3e
    move v6, v2

    :goto_3f
    if-eqz v0, :cond_4b

    if-eqz v1, :cond_4b

    iget v0, p0, Lcom/android/launcher3/views/e;->z:F

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_55

    :cond_4b
    iget v0, p0, Lcom/android/launcher3/views/e;->z:F

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    int-to-float v4, v4

    div-float/2addr v1, v4

    cmpg-float v0, v0, v1

    if-gez v0, :cond_56

    :cond_55
    move v2, v3

    :cond_56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->U:Landroid/view/animation/Interpolator;

    if-nez v5, :cond_7d

    if-eqz v6, :cond_5e

    goto :goto_7d

    :cond_5e
    if-eqz v2, :cond_64

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->m0(F)V

    return-void

    :cond_64
    invoke-static {p1}, Lw2/q;->h(F)Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->U:Landroid/view/animation/Interpolator;

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, Lcom/android/launcher3/views/e;->z:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p1, v0}, LE2/b;->b(FF)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->V:J

    invoke-virtual {p0, v3}, Lcom/android/launcher3/a;->D(Z)V

    return-void

    :cond_7d
    :goto_7d
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->k0(F)V

    return-void
.end method

.method protected final getCurPageView()Landroid/view/View;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->W:Landroid/view/View;

    return-object p0
.end method

.method protected final getOpenCloseAnimation()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    return-object p0
.end method

.method public h(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->a0:Z

    if-eqz v0, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->h(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method protected final j0(Z)V
    .registers 6

    const/4 v0, 0x0

    iput v0, p0, Lcom/android/launcher3/views/e;->B:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/android/launcher3/views/e;->A:F

    if-eqz p1, :cond_2a

    sget-object p1, Lcom/android/launcher3/views/e;->N:Landroid/util/FloatProperty;

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    aput v1, v2, v0

    invoke-static {p0, p1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0x190

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->c0:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    return-void

    :cond_2a
    iget p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    invoke-virtual {p0, p1}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/Z;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/Z;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public k(Landroid/view/MotionEvent;)Z
    .registers 6

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->W:Landroid/view/View;

    instance-of v0, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_26

    iget v0, p0, Lcom/android/launcher3/views/e;->z:F

    iget v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_26

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_26

    iget-object v0, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {v0}, LE2/b;->e()Z

    move-result v0

    if-eqz v0, :cond_26

    iput-boolean v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->a0:Z

    return v2

    :cond_26
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->U()Z

    move-result v0

    if-eqz v0, :cond_3d

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_3d

    iget-object v0, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {v0, p1}, LE2/b;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3d

    iput-boolean v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->a0:Z

    return v2

    :cond_3d
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->a0:Z

    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->k(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method protected final k0(F)V
    .registers 7

    iget v0, p0, Lcom/android/launcher3/views/e;->z:F

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    cmpg-float v2, v0, v1

    if-nez v2, :cond_e

    iget-object p0, p0, Lcom/android/launcher3/views/e;->s:LE2/g;

    invoke-virtual {p0}, LE2/b;->d()V

    return-void

    :cond_e
    sget-object v2, Lcom/android/launcher3/views/e;->N:Landroid/util/FloatProperty;

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v0, v3, v4

    const/4 v0, 0x1

    aput v1, v3, v0

    invoke-static {p0, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->Q:F

    iget v2, p0, Lcom/android/launcher3/views/e;->z:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p1, v1}, LE2/b;->b(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p1, Lw2/q;->g:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b0;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;)V

    invoke-static {p1}, Lw2/f;->c(Ljava/lang/Runnable;)Landroid/animation/Animator$AnimatorListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    return-void
.end method

.method public m(ZF)V
    .registers 3

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Landroid/animation/Animator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_b

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    if-eqz p1, :cond_11

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_11
    iget p1, p0, Lcom/android/launcher3/views/e;->z:F

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->T:F

    return-void
.end method

.method public o(F)Z
    .registers 5

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->T:F

    iget v1, p0, Lcom/android/launcher3/views/e;->B:F

    iget v2, p0, Lcom/android/launcher3/views/e;->A:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->getShiftRange()F

    move-result v2

    div-float/2addr p1, v2

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    const/4 p0, 0x1

    return p0
.end method

.method protected final setCurPageView(Landroid/view/View;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->W:Landroid/view/View;

    return-void
.end method

.method protected final setOpenCloseAnimation(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->S:Landroid/animation/Animator;

    return-void
.end method
