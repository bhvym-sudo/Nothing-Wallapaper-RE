.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;
.super Lcom/android/launcher3/views/e;
.source "SourceFile"

# interfaces
.implements Ly7/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/launcher3/views/e;",
        "Ly7/s;"
    }
.end annotation


# static fields
.field public static final b0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;

.field private static final c0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$a;


# instance fields
.field private final P:Lcom/android/launcher3/f;

.field private Q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

.field private R:LE7/a;

.field private final S:Landroid/view/animation/PathInterpolator;

.field private T:F

.field private U:F

.field private V:Landroid/animation/Animator;

.field private final W:Lh8/h;

.field private final a0:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->b0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$b;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->c0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$a;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/android/launcher3/views/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iget-object p1, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p1, Ly7/u;

    invoke-virtual {p1}, Ly7/u;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->P:Lcom/android/launcher3/f;

    .line 5
    new-instance p1, Landroid/view/animation/PathInterpolator;

    const p2, 0x3ecccccd    # 0.4f

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2, p2, p3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->S:Landroid/view/animation/PathInterpolator;

    .line 6
    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/v;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/v;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->W:Lh8/h;

    .line 7
    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/w;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/w;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->a0:Lh8/h;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic e0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/a;->A()V

    return-void
.end method

.method public static synthetic f0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)LS1/a;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->p0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)LS1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)LJ7/i;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->q0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)LJ7/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->N()V

    return-void
.end method

.method public static final synthetic i0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    return p0
.end method

.method public static final synthetic j0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)Landroid/view/ViewGroup;
    .registers 1

    iget-object p0, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public static final synthetic k0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)F
    .registers 1

    iget p0, p0, Lcom/android/launcher3/views/e;->z:F

    return p0
.end method

.method public static final synthetic l0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;LE7/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->R:LE7/a;

    return-void
.end method

.method public static final synthetic m0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;FF)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->s0(FF)V

    return-void
.end method

.method public static final synthetic n0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/android/launcher3/a;->q:Z

    return-void
.end method

.method private final o0(ZF)Landroid/animation/AnimatorSet;
    .registers 8

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->c0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$a;

    iget v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v2, v3, v4

    const/4 v2, 0x1

    aput p2, v3, v2

    invoke-static {p0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->Q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    if-nez v1, :cond_20

    const-string v1, "clockPickerPage"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_20
    invoke-virtual {v1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->f(Z)Landroid/animation/ObjectAnimator;

    move-result-object p1

    filled-new-array {p2, p1}, [Landroid/animation/Animator;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 p1, 0x12c

    invoke-virtual {v0, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->S:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$c;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method private static final p0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)LS1/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->R:LE7/a;

    if-nez p0, :cond_a

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-interface {p0}, LE7/a;->getClockViewFactory()LS1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final q0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)LJ7/i;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->R:LE7/a;

    if-nez p0, :cond_a

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-interface {p0}, LE7/a;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    return-object p0
.end method

.method private final s0(FF)V
    .registers 3

    invoke-super {p0, p2}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    iget-object p1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p2

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    add-float/2addr p2, p0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method


# virtual methods
.method protected I(Z)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->P:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->N:I

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/launcher3/views/e;->S(ZJ)V

    return-void
.end method

.method protected J(I)Z
    .registers 2

    and-int/lit8 p0, p1, 0x8

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public getClockViewFactory()LS1/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->a0:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LS1/a;

    return-object p0
.end method

.method public getLockScreenViewModel()LJ7/i;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->W:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/i;

    return-object p0
.end method

.method public k(Landroid/view/MotionEvent;)Z
    .registers 4

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_29

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->R:LE7/a;

    if-nez v0, :cond_15

    const-string v0, "bottomSheetCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_15
    invoke-interface {v0}, LE7/a;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getClockView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->getPopupContainer()Lcom/android/launcher3/views/g;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/android/launcher3/views/g;->n(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/android/launcher3/views/e;->D:Z

    :cond_29
    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->k(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->V:Landroid/animation/Animator;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->V:Landroid/animation/Animator;

    return-void
.end method

.method protected onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f0a0155

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f080093

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_20

    iget-object v1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0, v1}, Lcom/android/launcher3/views/e;->Z(Landroid/graphics/drawable/Drawable;Landroid/view/View;)V

    :cond_20
    const v0, 0x7f0a011e

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->Q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

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

    iget p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->T:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_30

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->Q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    if-nez p1, :cond_28

    const-string p1, "clockPickerPage"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_28
    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->getDynamicFontHeight()F

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->T:F

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    :cond_30
    iget p1, p0, Lcom/android/launcher3/views/e;->z:F

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->setTranslationShift(F)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 9

    iget-object v1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->P:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->S:F

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v5

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {v0, p0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public q(ZZ)V
    .registers 6

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->T:F

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-nez v2, :cond_21

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result p2

    if-eqz p2, :cond_18

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result p2

    if-nez p2, :cond_18

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->q(ZZ)V

    return-void

    :cond_18
    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;

    invoke-direct {p2, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;Z)V

    invoke-virtual {p0, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void

    :cond_21
    if-eqz p1, :cond_24

    move v0, v1

    :cond_24
    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    cmpg-float v1, v1, v0

    if-nez v1, :cond_2b

    return-void

    :cond_2b
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->V:Landroid/animation/Animator;

    if-eqz v1, :cond_32

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    :cond_32
    if-nez p2, :cond_3c

    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    iget p1, p0, Lcom/android/launcher3/views/e;->z:F

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->setTranslationShift(F)V

    return-void

    :cond_3c
    invoke-direct {p0, p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->o0(ZF)Landroid/animation/AnimatorSet;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->V:Landroid/animation/Animator;

    return-void
.end method

.method public final r0(Z)V
    .registers 2

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->b0()Lw2/j;

    move-result-object p0

    invoke-virtual {p0}, Lw2/j;->m()V

    return-void

    :cond_a
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->setTranslationShift(F)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/x;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/x;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected setTranslationShift(F)V
    .registers 4

    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    iget-object p1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->U:F

    add-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->P:Lcom/android/launcher3/f;

    invoke-virtual {p1}, Lcom/android/launcher3/f;->g()F

    move-result p1

    const/4 v0, 0x1

    int-to-float v0, v0

    iget v1, p0, Lcom/android/launcher3/views/e;->z:F

    sub-float/2addr v0, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    div-float/2addr v0, p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->R:LE7/a;

    if-nez p0, :cond_29

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_29
    invoke-interface {p0, v0}, LE7/a;->L(F)V

    return-void
.end method

.method public x()V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/a;->onBackInvoked()V

    return-void
.end method
