.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;
.super Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;
.source "SourceFile"

# interfaces
.implements LE7/S;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;
    }
.end annotation


# static fields
.field public static final r0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;


# instance fields
.field private final i0:Lcom/android/launcher3/f;

.field private final j0:F

.field private final k0:Lcom/android/launcher3/Workspace;

.field private l0:LE7/a;

.field private m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

.field private n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

.field private o0:LF8/x0;

.field private p0:F

.field private q0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->r0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iget-object p1, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p1, Ly7/u;

    invoke-virtual {p1}, Ly7/u;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->i0:Lcom/android/launcher3/f;

    const/4 p2, 0x1

    int-to-float p2, p2

    .line 5
    iget p1, p1, Lcom/android/launcher3/f;->T:F

    sub-float/2addr p2, p1

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->j0:F

    .line 6
    iget-object p1, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p1, Ly7/u;

    invoke-virtual {p1}, Ly7/u;->M()Lcom/android/launcher3/Workspace;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->k0:Lcom/android/launcher3/Workspace;

    .line 7
    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->p0:F

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 2
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic A0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    return-object p0
.end method

.method public static final synthetic B0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;LE7/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    return-void
.end method

.method public static final synthetic C0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/android/launcher3/a;->q:Z

    return-void
.end method

.method private final D0()Z
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez p0, :cond_a

    const-string p0, "widgetPickerGroupPage"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    const/16 v0, 0x8

    if-ne p0, v0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method private final E0(Landroid/view/MotionEvent;)Z
    .registers 3

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->D0()Z

    move-result v0

    if-nez v0, :cond_18

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez p0, :cond_10

    const-string p0, "widgetPickerGroupPage"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_10
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->Y(Landroid/view/MotionEvent;)Z

    move-result p0

    if-eqz p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method private final F0(ZZ)V
    .registers 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "widgetPickerGroupPage"

    const/4 v6, 0x0

    const-string v7, "widgetPickerDetails"

    const/4 v8, 0x0

    if-eqz p2, :cond_c4

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->getOpenCloseAnimation()Landroid/animation/Animator;

    move-result-object v9

    if-eqz v9, :cond_21

    invoke-virtual {v9}, Landroid/animation/Animator;->isRunning()Z

    move-result v10

    if-eqz v10, :cond_1b

    goto :goto_1c

    :cond_1b
    move-object v9, v8

    :goto_1c
    if-eqz v9, :cond_21

    invoke-virtual {v9}, Landroid/animation/Animator;->cancel()V

    :cond_21
    iget-object v9, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v9, :cond_29

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v9, v8

    :cond_29
    invoke-virtual {v9, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v9, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v9, :cond_34

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v9, v8

    :cond_34
    invoke-virtual {v9, v6}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_3c

    iget v9, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->j0:F

    goto :goto_3e

    :cond_3c
    iget v9, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->p0:F

    :goto_3e
    if-eqz v1, :cond_44

    iget v10, v0, Lcom/android/launcher3/views/e;->z:F

    iput v10, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->p0:F

    :cond_44
    iget-object v10, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v10, :cond_4c

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v10, v8

    :cond_4c
    invoke-virtual {v10}, Landroid/view/View;->getScaleX()F

    move-result v10

    if-eqz v1, :cond_56

    const v11, 0x3f733333    # 0.95f

    goto :goto_58

    :cond_56
    const/high16 v11, 0x3f800000    # 1.0f

    :goto_58
    iget-object v12, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v12, :cond_60

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v12, v8

    :cond_60
    invoke-virtual {v12}, Landroid/view/View;->getTranslationY()F

    move-result v12

    if-eqz v1, :cond_67

    goto :goto_6c

    :cond_67
    iget-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->i0:Lcom/android/launcher3/f;

    iget v4, v4, Lcom/android/launcher3/f;->Q:I

    int-to-float v4, v4

    :goto_6c
    new-instance v13, Landroid/animation/AnimatorSet;

    invoke-direct {v13}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v14, Lcom/android/launcher3/views/e;->N:Landroid/util/FloatProperty;

    iget v15, v0, Lcom/android/launcher3/views/e;->z:F

    const/16 v16, 0x1

    new-array v2, v3, [F

    aput v15, v2, v6

    aput v9, v2, v16

    invoke-static {v0, v14, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    new-instance v9, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;

    invoke-direct {v9, v0, v12, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;FF)V

    invoke-virtual {v2, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v13, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v2, :cond_94

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v8

    :cond_94
    sget-object v4, Lcom/android/launcher3/j;->b:Landroid/util/FloatProperty;

    new-array v3, v3, [F

    aput v10, v3, v6

    aput v11, v3, v16

    invoke-static {v2, v4, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    const-wide/16 v2, 0x190

    invoke-virtual {v13, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    sget-object v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->b0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;

    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0$a;->a()Landroid/view/animation/Interpolator;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;

    invoke-direct {v2, v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V

    invoke-static {v2}, Lw2/f;->a(Ljava/lang/Runnable;)Landroid/animation/Animator$AnimatorListener;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v13}, Landroid/animation/AnimatorSet;->start()V

    invoke-virtual {v0, v13}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->setOpenCloseAnimation(Landroid/animation/Animator;)V

    goto :goto_f7

    :cond_c4
    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v2, :cond_cc

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v8

    :cond_cc
    invoke-virtual {v2, v4}, Landroid/view/View;->setTranslationY(F)V

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v2, :cond_d7

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v8

    :cond_d7
    const/16 v3, 0x8

    if-eqz v1, :cond_dd

    move v4, v6

    goto :goto_de

    :cond_dd
    move v4, v3

    :goto_de
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v2, :cond_e9

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v8

    :cond_e9
    if-eqz v1, :cond_ec

    goto :goto_ed

    :cond_ec
    move v3, v6

    :goto_ed
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->j0:F

    invoke-virtual {v0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->setTranslationShift(F)V

    iput-boolean v6, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->q0:Z

    :goto_f7
    if-eqz v1, :cond_103

    iget-object v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v1, :cond_101

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_10a

    :cond_101
    move-object v8, v1

    goto :goto_10a

    :cond_103
    iget-object v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v1, :cond_101

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    :goto_10a
    invoke-virtual {v0, v8}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->setCurPageView(Landroid/view/View;)V

    return-void
.end method

.method static synthetic G0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;ZZILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_6

    move p1, v0

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_b

    move p2, v0

    :cond_b
    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->F0(ZZ)V

    return-void
.end method

.method private static final H0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;FFLandroid/animation/ValueAnimator;)V
    .registers 7

    const-string v0, "animation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->j0:F

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "getAnimatedValue(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->getShiftRange()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez p0, :cond_28

    const-string p0, "widgetPickerDetails"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_28
    const/4 v1, 0x1

    int-to-float v1, v1

    sub-float/2addr v1, p3

    mul-float/2addr v1, p1

    mul-float/2addr p3, p2

    add-float/2addr v1, p3

    add-float/2addr v1, v0

    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method private static final I0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V
    .registers 7

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    const/4 v1, 0x0

    if-nez v0, :cond_b

    const-string v0, "widgetPickerDetails"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_b
    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz p1, :cond_12

    move v4, v3

    goto :goto_13

    :cond_12
    move v4, v2

    :goto_13
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v0, :cond_20

    const-string v0, "widgetPickerGroupPage"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_21

    :cond_20
    move-object v1, v0

    :goto_21
    if-eqz p1, :cond_24

    goto :goto_25

    :cond_24
    move v2, v3

    :goto_25
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iput-boolean v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->q0:Z

    return-void
.end method

.method private final J0(Landroid/view/MotionEvent;)Z
    .registers 3

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->k0:Lcom/android/launcher3/Workspace;

    invoke-virtual {p0, v0}, Lcom/android/launcher3/Workspace;->c(Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p0

    float-to-int p0, p0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v0, p0, p1}, Landroid/graphics/Rect;->contains(II)Z

    move-result p0

    return p0
.end method

.method public static synthetic v0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->I0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V

    return-void
.end method

.method public static synthetic w0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;FFLandroid/animation/ValueAnimator;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->H0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;FFLandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic x0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->N()V

    return-void
.end method

.method public static final synthetic y0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)LE7/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    return-object p0
.end method

.method public static final synthetic z0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    return-object p0
.end method


# virtual methods
.method protected J(I)Z
    .registers 2

    const/4 p0, 0x1

    and-int/2addr p1, p0

    if-eqz p1, :cond_5

    return p0

    :cond_5
    const/4 p0, 0x0

    return p0
.end method

.method public a(Z)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    const/4 v1, 0x0

    if-nez v0, :cond_b

    const-string v0, "bottomSheetCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_b
    invoke-interface {v0, p1}, LE7/a;->a(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->k0(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez p0, :cond_1c

    const-string p0, "widgetPickerGroupPage"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_1d

    :cond_1c
    move-object v1, p0

    :goto_1d
    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->Z()V

    return-void
.end method

.method public d(Landroid/view/View;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/nothing/launcher/card/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    check-cast p1, Lcom/nothing/launcher/card/m;

    goto :goto_12

    :cond_11
    move-object p1, v1

    :goto_12
    if-eqz p1, :cond_22

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    if-nez p0, :cond_1e

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_1f

    :cond_1e
    move-object v1, p0

    :goto_1f
    invoke-interface {v1, p1}, LE7/a;->C(Lcom/nothing/launcher/card/m;)V

    :cond_22
    return-void
.end method

.method protected d0()Z
    .registers 2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->D0()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-super {p0}, Lcom/android/launcher3/views/e;->d0()Z

    move-result p0

    return p0

    :cond_b
    iget p0, p0, Lcom/android/launcher3/views/e;->z:F

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public h(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v0, :cond_f

    const-string v0, "widgetPickerGroupPage"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_f
    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->X(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_17

    const/4 p0, 0x1

    return p0

    :cond_17
    invoke-super {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->h(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public j(Landroid/view/View;)V
    .registers 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    if-nez p0, :cond_f

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_f
    invoke-interface {p0}, LE7/a;->T()V

    sget-object p0, LE2/f;->b:Landroid/view/View$OnLongClickListener;

    invoke-interface {p0, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    return-void
.end method

.method public k(Landroid/view/MotionEvent;)Z
    .registers 6

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast v0, Ly7/u;

    invoke-virtual {v0}, Ly7/u;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/dragndrop/a;->y()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_15

    return v1

    :cond_15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_33

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->J0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_2a

    iget v0, p0, Lcom/android/launcher3/views/e;->z:F

    iget v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->j0:F

    cmpl-float v0, v0, v3

    if-gez v0, :cond_30

    :cond_2a
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->E0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_31

    :cond_30
    move v1, v2

    :cond_31
    iput-boolean v1, p0, Lcom/android/launcher3/views/e;->D:Z

    :cond_33
    iget-boolean v0, p0, Lcom/android/launcher3/views/e;->D:Z

    if-nez v0, :cond_4e

    invoke-virtual {p0, p1}, Lcom/android/launcher3/views/e;->T(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_4e

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    if-nez v0, :cond_47

    const-string v0, "widgetPickerGroupPage"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_47
    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;->W(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_4e

    return v2

    :cond_4e
    invoke-super {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->k(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 8

    invoke-super {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->onAttachedToWindow()V

    invoke-static {p0}, Landroidx/lifecycle/g0;->a(Landroid/view/View;)Landroidx/lifecycle/x;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b;-><init>(Landroidx/lifecycle/x;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->o0:LF8/x0;

    :cond_1c
    return-void
.end method

.method public onBackInvoked()V
    .registers 4

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->D0()Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->G0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;ZZILjava/lang/Object;)V

    return-void

    :cond_d
    invoke-super {p0}, Lcom/android/launcher3/a;->onBackInvoked()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->o0:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_c
    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->o0:LF8/x0;

    return-void
.end method

.method protected onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f0a0155

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    const v0, 0x7f0a0546

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    const v0, 0x7f0a0547

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    const v0, 0x7f0a0541

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->setWidgetDeleteView(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->m0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerGroupPage;

    const/4 v1, 0x0

    if-nez v0, :cond_3b

    const-string v0, "widgetPickerGroupPage"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3b
    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->setCurPageView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v0, :cond_48

    const-string v0, "widgetPickerDetails"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_49

    :cond_48
    move-object v1, v0

    :goto_49
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->i0:Lcom/android/launcher3/f;

    iget p0, p0, Lcom/android/launcher3/f;->Q:I

    int-to-float p0, p0

    invoke-virtual {v1, p0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 7

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    iget-object p1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr p4, p1

    div-int/lit8 p4, p4, 0x2

    iget-object p2, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    sub-int p3, p5, p3

    add-int/2addr p1, p4

    invoke-virtual {p2, p4, p3, p1, p5}, Landroid/view/ViewGroup;->layout(IIII)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    const/4 p4, 0x0

    invoke-virtual {p1, p4, p4, p2, p3}, Landroid/view/View;->layout(IIII)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    const/4 p2, 0x0

    const-string p3, "widgetPickerDetails"

    if-nez p1, :cond_3a

    invoke-static {p3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, p2

    :cond_3a
    iget-object p5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez p5, :cond_42

    invoke-static {p3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p5, p2

    :cond_42
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result p5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez v0, :cond_4e

    invoke-static {p3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_4f

    :cond_4e
    move-object p2, v0

    :goto_4f
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p1, p4, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

    iget p1, p0, Lcom/android/launcher3/views/e;->z:F

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->setTranslationShift(F)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 9

    iget-object v1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->i0:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->O:F

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v5

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    iget-object p0, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->i0:Lcom/android/launcher3/f;

    iget p0, p0, Lcom/android/launcher3/f;->Q:I

    const/high16 p1, 0x40000000    # 2.0f

    invoke-static {p0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    iget-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->n0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerDetails;

    if-nez p1, :cond_25

    const-string p1, "widgetPickerDetails"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_25
    invoke-virtual {p1, v2, p0}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->getWidgetDeleteView()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;

    move-result-object p1

    invoke-virtual {p1, v2, p0}, Landroid/view/View;->measure(II)V

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {v0, p0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public p()V
    .registers 1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->onBackInvoked()V

    return-void
.end method

.method protected setTranslationShift(F)V
    .registers 4

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->D0()Z

    move-result v0

    if-eqz v0, :cond_d

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->j0:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_d

    move p1, v0

    :cond_d
    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->i0:Lcom/android/launcher3/f;

    iget p1, p1, Lcom/android/launcher3/f;->T:F

    const/4 v0, 0x1

    int-to-float v0, v0

    iget v1, p0, Lcom/android/launcher3/views/e;->z:F

    sub-float/2addr v0, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    div-float/2addr v0, p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    if-nez p0, :cond_28

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_28
    invoke-interface {p0, v0}, LE7/a;->c(F)V

    return-void
.end method

.method public v(Lz7/c;)V
    .registers 4

    const-string v0, "selectInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->q0:Z

    if-eqz v0, :cond_a

    return-void

    :cond_a
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->q0:Z

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->l0:LE7/a;

    const/4 v1, 0x0

    if-nez v0, :cond_18

    const-string v0, "bottomSheetCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_18
    invoke-interface {v0}, LE7/a;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ7/i;->N0(Lz7/c;)V

    const/4 p1, 0x3

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, p1, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->G0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;ZZILjava/lang/Object;)V

    return-void
.end method
