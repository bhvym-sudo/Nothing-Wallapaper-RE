.class public abstract Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;
.super Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;
.source "SourceFile"

# interfaces
.implements Lcom/android/launcher3/h;
.implements Lcom/android/launcher3/dragndrop/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D$a;
    }
.end annotation


# static fields
.field public static final g0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D$a;

.field private static final h0:Landroid/view/animation/Interpolator;


# instance fields
.field protected d0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

.field private e0:Z

.field private f0:Landroid/animation/AnimatorSet;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->g0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->h0:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic o0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Lcom/android/launcher3/h$a;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->u0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Lcom/android/launcher3/h$a;)V

    return-void
.end method

.method public static synthetic p0(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Z)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->r0(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Z)V

    return-void
.end method

.method private final q0(ZLandroid/view/View;)V
    .registers 16

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->getCurPageView()Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_a

    return-void

    :cond_a
    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->f0:Landroid/animation/AnimatorSet;

    if-eqz v4, :cond_1b

    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v5

    if-eqz v5, :cond_15

    goto :goto_16

    :cond_15
    const/4 v4, 0x0

    :goto_16
    if-eqz v4, :cond_1b

    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_1b
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3}, Landroid/view/View;->getScaleX()F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz p1, :cond_2a

    const v6, 0x3f733333    # 0.95f

    goto :goto_2b

    :cond_2a
    move v6, v5

    :goto_2b
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v7

    const/4 v8, 0x0

    if-eqz p1, :cond_34

    move v9, v8

    goto :goto_35

    :cond_34
    move v9, v5

    :goto_35
    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object v10

    invoke-virtual {v10, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v10, Landroid/animation/AnimatorSet;

    invoke-direct {v10}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v11, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v12, v0, [F

    aput v7, v12, v2

    aput v9, v12, v1

    invoke-static {v3, v11, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    invoke-virtual {v10, v7}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    instance-of v7, v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-eqz v7, :cond_69

    move-object v4, v3

    check-cast v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    invoke-virtual {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->getContent()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    sget-object v7, Lcom/android/launcher3/j;->b:Landroid/util/FloatProperty;

    new-array v9, v1, [F

    aput v6, v9, v2

    invoke-static {v4, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v10, v4}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_78

    :cond_69
    sget-object v7, Lcom/android/launcher3/j;->b:Landroid/util/FloatProperty;

    new-array v9, v0, [F

    aput v4, v9, v2

    aput v6, v9, v1

    invoke-static {v3, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v10, v4}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :goto_78
    instance-of v4, p2, Lcom/nothing/launcher/card/s;

    if-eqz v4, :cond_99

    sget-object v4, Lcom/nothing/launcher/card/s;->r0:Landroid/util/FloatProperty;

    invoke-virtual {v4, p2}, Landroid/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    if-eqz p1, :cond_87

    goto :goto_88

    :cond_87
    move v5, v8

    :goto_88
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    new-array v0, v0, [F

    aput v6, v0, v2

    aput v5, v0, v1

    invoke-static {p2, v4, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    invoke-virtual {v10, p2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_99
    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;

    invoke-direct {p2, v3, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Z)V

    invoke-static {p2}, Lw2/f;->c(Ljava/lang/Runnable;)Landroid/animation/Animator$AnimatorListener;

    move-result-object p1

    invoke-virtual {v10, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-wide/16 p1, 0x190

    invoke-virtual {v10, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    sget-object p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->h0:Landroid/view/animation/Interpolator;

    invoke-virtual {v10, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v10}, Landroid/animation/AnimatorSet;->start()V

    iput-object v10, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->f0:Landroid/animation/AnimatorSet;

    return-void
.end method

.method private static final r0(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Z)V
    .registers 3

    invoke-static {p0}, Lw2/a;->a(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p0

    if-eqz p2, :cond_b

    const/4 p1, 0x0

    goto :goto_d

    :cond_b
    const/16 p1, 0x8

    :goto_d
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final s0(LC2/b;)Z
    .registers 2

    iget p0, p1, LC2/b;->q:I

    const/4 p1, -0x1

    if-eq p0, p1, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method private final t0(Lcom/android/launcher3/h$a;)V
    .registers 3

    iget-object p1, p1, Lcom/android/launcher3/h$a;->g:LC2/b;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->s0(LC2/b;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object p0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p0, Ly7/u;

    invoke-virtual {p0, p1}, Ly7/u;->o(LC2/b;)V

    :cond_12
    return-void
.end method

.method private static final u0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Lcom/android/launcher3/h$a;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->t0(Lcom/android/launcher3/h$a;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Rect;)V
    .registers 5

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, p1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast v2, Ly7/u;

    invoke-virtual {v2}, Ly7/u;->K()Lcom/android/launcher3/f;

    move-result-object v2

    iget v2, v2, Lcom/android/launcher3/f;->P:I

    add-int/2addr v1, v2

    iput v1, p1, Landroid/graphics/Rect;->top:I

    iget-object p1, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p1, Ly7/u;

    invoke-virtual {p1}, Ly7/u;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object p1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p0

    invoke-virtual {p1, p0, v0}, Lcom/android/launcher3/views/g;->i(Landroid/view/View;Landroid/graphics/Rect;)F

    return-void
.end method

.method public g(Lcom/android/launcher3/h$a;)V
    .registers 3

    const-string v0, "dragObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lcom/android/launcher3/h$a;->i:Lcom/android/launcher3/g;

    instance-of p1, p1, Lcom/android/launcher3/Workspace;

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->e0:Z

    return-void
.end method

.method protected final getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->d0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "widgetDeleteView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public i()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public l(Lcom/android/launcher3/h$a;)V
    .registers 2

    const-string p0, "dragObject"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public n(Lcom/android/launcher3/h$a;Lz2/e;)V
    .registers 3

    const-string p0, "dragObject"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast v0, Ly7/u;

    invoke-virtual {v0}, Ly7/u;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/dragndrop/a;->d(Lcom/android/launcher3/dragndrop/a$b;)V

    iget-object v0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast v0, Ly7/u;

    invoke-virtual {v0}, Ly7/u;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/dragndrop/a;->e(Lcom/android/launcher3/h;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast v0, Ly7/u;

    invoke-virtual {v0}, Ly7/u;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/dragndrop/a;->B(Lcom/android/launcher3/h;)V

    iget-object v0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast v0, Ly7/u;

    invoke-virtual {v0}, Ly7/u;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/dragndrop/a;->A(Lcom/android/launcher3/dragndrop/a$b;)V

    return-void
.end method

.method public s(Lcom/android/launcher3/h$a;)V
    .registers 3

    const-string v0, "dragObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/android/launcher3/h$a;->i:Lcom/android/launcher3/g;

    instance-of v0, v0, Lcom/android/launcher3/Workspace;

    if-eqz v0, :cond_15

    iget-object p1, p1, Lcom/android/launcher3/h$a;->f:Lz2/h;

    invoke-virtual {p1}, Lz2/h;->getContentView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->q0(ZLandroid/view/View;)V

    :cond_15
    return-void
.end method

.method protected final setWidgetDeleteView(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->d0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    return-void
.end method

.method public t()V
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->e0:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->q0(ZLandroid/view/View;)V

    iput-boolean v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->e0:Z

    :cond_b
    return-void
.end method

.method public u(Lcom/android/launcher3/h$a;)Z
    .registers 2

    const-string p0, "dragObject"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public w(Lcom/android/launcher3/h$a;)V
    .registers 3

    const-string v0, "dragObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->e0:Z

    if-nez v0, :cond_19

    iget-object v0, p1, Lcom/android/launcher3/h$a;->i:Lcom/android/launcher3/g;

    instance-of v0, v0, Lcom/android/launcher3/Workspace;

    if-eqz v0, :cond_19

    iget-object p1, p1, Lcom/android/launcher3/h$a;->f:Lz2/h;

    invoke-virtual {p1}, Lz2/h;->getContentView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->q0(ZLandroid/view/View;)V

    :cond_19
    return-void
.end method

.method public z(Lcom/android/launcher3/h$a;Lz2/e;)V
    .registers 14

    const-string v0, "dragObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p2, Lz2/e;->f:Z

    if-eqz p2, :cond_f

    return-void

    :cond_f
    iget-object v1, p1, Lcom/android/launcher3/h$a;->f:Lz2/h;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->b(Lcom/android/launcher3/h$a;)Landroid/graphics/Rect;

    move-result-object v2

    const/4 p2, 0x1

    invoke-virtual {v1, p2}, Lz2/h;->j(Z)V

    new-instance v8, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;

    invoke-direct {v8, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Lcom/android/launcher3/h$a;)V

    iget-object p0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p0, Ly7/u;

    invoke-virtual {p0}, Ly7/u;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    sget-object v7, Lv1/d;->L:Landroid/view/animation/Interpolator;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    const/16 v6, 0x12c

    invoke-virtual/range {v0 .. v10}, Lcom/android/launcher3/dragndrop/DragLayer;->t(Lz2/h;Landroid/graphics/Rect;FFFILandroid/view/animation/Interpolator;Ljava/lang/Runnable;ILandroid/view/View;)V

    return-void
.end method
