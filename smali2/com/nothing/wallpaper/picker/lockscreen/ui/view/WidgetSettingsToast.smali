.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;
.super Lcom/android/launcher3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;
    }
.end annotation


# static fields
.field private static final A:Landroid/view/animation/Interpolator;

.field public static final z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;


# instance fields
.field private final r:Lcom/android/launcher3/views/f;

.field private final s:Lcom/android/launcher3/f;

.field private t:Landroid/widget/TextView;

.field private final u:Landroid/graphics/Paint;

.field private final v:F

.field private final w:Landroid/graphics/drawable/Drawable;

.field private x:Z

.field private y:LE7/a;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->A:Landroid/view/animation/Interpolator;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/android/launcher3/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p2

    check-cast p2, Lcom/android/launcher3/views/f;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->r:Lcom/android/launcher3/views/f;

    .line 5
    invoke-interface {p2}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    .line 6
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    const p3, 0x7f06029d

    .line 7
    invoke-static {p1, p3}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->u:Landroid/graphics/Paint;

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f070635

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->v:F

    const p2, 0x7f08031f

    .line 10
    invoke-static {p1, p2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->w:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic L(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->U(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)V

    return-void
.end method

.method public static final synthetic M(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Landroid/content/Context;Z)I
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->V(Landroid/content/Context;Z)I

    move-result p0

    return p0
.end method

.method public static final synthetic N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    return-object p0
.end method

.method public static final synthetic O(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->x:Z

    return p0
.end method

.method public static final synthetic P(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->W(Z)V

    return-void
.end method

.method public static final synthetic Q(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;LE7/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->y:LE7/a;

    return-void
.end method

.method public static final synthetic R(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->x:Z

    return-void
.end method

.method public static final synthetic S(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private final T()V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/i0;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/i0;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    const-wide/16 v0, 0x190

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->A:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method private static final U(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->r:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method private final V(Landroid/content/Context;Z)I
    .registers 3

    invoke-static {}, Li6/e;->j()Z

    move-result p1

    if-eqz p1, :cond_1e

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    if-eqz p2, :cond_d

    iget p1, p1, Lcom/android/launcher3/f;->o:I

    goto :goto_f

    :cond_d
    iget p1, p1, Lcom/android/launcher3/f;->n:I

    :goto_f
    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    invoke-virtual {p2}, Lcom/android/launcher3/f;->j()I

    move-result p2

    add-int/2addr p2, p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    invoke-virtual {p0}, Lcom/android/launcher3/f;->h()I

    move-result p0

    sub-int/2addr p2, p0

    return p2

    :cond_1e
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    invoke-virtual {p1}, Lcom/android/launcher3/f;->j()I

    move-result p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->s:Lcom/android/launcher3/f;

    iget p0, p0, Lcom/android/launcher3/f;->m:I

    add-int/2addr p1, p0

    return p1
.end method

.method private final W(Z)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    if-nez v0, :cond_a

    const-string v0, "tipTextView"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_8a

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-boolean v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->x:Z

    if-eqz v2, :cond_19

    const/16 v2, 0x50

    goto :goto_1b

    :cond_19
    const/16 v2, 0x30

    :goto_1b
    or-int/lit8 v2, v2, 0x1

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_68

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_68

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->O(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Z

    move-result v0

    if-eqz v0, :cond_43

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->M(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Landroid/content/Context;Z)I

    move-result p1

    int-to-float p1, p1

    goto :goto_64

    :cond_43
    if-eqz p1, :cond_53

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;

    move-result-object p1

    iget p1, p1, Lcom/android/launcher3/f;->n:I

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;

    move-result-object v0

    iget v0, v0, Lcom/android/launcher3/f;->o:I

    sub-int/2addr p1, v0

    goto :goto_54

    :cond_53
    const/4 p1, 0x0

    :goto_54
    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;

    move-result-object v0

    iget v0, v0, Lcom/android/launcher3/f;->L:I

    int-to-float v0, v0

    int-to-float p1, p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    sub-float p1, v0, p1

    :goto_64
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_70

    :cond_68
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;

    invoke-direct {v0, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_70
    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_92

    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-static {p0, v0, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const-wide/16 v0, 0x190

    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->A:Landroid/view/animation/Interpolator;

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :cond_8a
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :array_92
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final setText(Ljava/lang/String;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    if-nez p0, :cond_a

    const-string p0, "tipTextView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method protected I(Z)V
    .registers 2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->T()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->y:LE7/a;

    if-nez p0, :cond_d

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_d
    invoke-interface {p0}, LE7/a;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0}, LJ7/i;->B()V

    return-void
.end method

.method protected J(I)Z
    .registers 2

    and-int/lit8 p0, p1, 0x4

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public h(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_f

    invoke-virtual {p0, v0}, Lcom/android/launcher3/a;->D(Z)V

    :cond_f
    return v0
.end method

.method public k(Landroid/view/MotionEvent;)Z
    .registers 2

    const-string p0, "ev"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/launcher3/a;->q:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/launcher3/a;->q:Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 10

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5d

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    new-instance v4, Landroid/graphics/Rect;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-boolean v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->x:Z

    if-nez v1, :cond_38

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v4, v5, v1}, Landroid/graphics/Rect;->offset(II)V

    :cond_38
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-boolean v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->x:Z

    if-eqz v1, :cond_57

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v2

    const/high16 v3, 0x43340000    # 180.0f

    invoke-virtual {p1, v3, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    :cond_57
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_5d
    new-instance v0, Landroid/graphics/RectF;

    new-instance v1, Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    const/4 v3, 0x0

    const-string v4, "tipTextView"

    if-nez v2, :cond_6c

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v3

    :cond_6c
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    if-nez v5, :cond_78

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v5, v3

    :cond_78
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v5

    iget-object v6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    if-nez v6, :cond_84

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v6, v3

    :cond_84
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v6

    iget-object v7, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    if-nez v7, :cond_90

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_91

    :cond_90
    move-object v3, v7

    :goto_91
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-direct {v1, v2, v5, v6, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->offset(FF)V

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->v:F

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->u:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, p0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method protected onFinishInflate()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f0a040e

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->t:Landroid/widget/TextView;

    return-void
.end method
