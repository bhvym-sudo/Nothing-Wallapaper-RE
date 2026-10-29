.class public final Lcom/nothing/launcher/card/s;
.super Lcom/nothing/launcher/card/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/launcher/card/s$b;
    }
.end annotation


# static fields
.field public static final p0:Lcom/nothing/launcher/card/s$b;

.field private static final q0:Landroid/view/animation/Interpolator;

.field public static final r0:Landroid/util/FloatProperty;


# instance fields
.field private final m0:Lv8/l;

.field private final n0:Landroid/widget/ImageView;

.field private o0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Lcom/nothing/launcher/card/s$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/launcher/card/s$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/launcher/card/s;->p0:Lcom/nothing/launcher/card/s$b;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/launcher/card/s;->q0:Landroid/view/animation/Interpolator;

    new-instance v0, Lcom/nothing/launcher/card/s$a;

    invoke-direct {v0}, Lcom/nothing/launcher/card/s$a;-><init>()V

    sput-object v0, Lcom/nothing/launcher/card/s;->r0:Landroid/util/FloatProperty;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lv8/l;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/launcher/card/l;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/nothing/launcher/card/s;->m0:Lv8/l;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/android/launcher3/s;->a:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/nothing/launcher/card/s;->o0:Z

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    new-instance p2, Lcom/nothing/launcher/card/q;

    invoke-direct {p2, p0}, Lcom/nothing/launcher/card/q;-><init>(Lcom/nothing/launcher/card/s;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/nothing/launcher/card/l;->getActivityContext()Lcom/android/launcher3/views/f;

    move-result-object p2

    invoke-interface {p2}, Lcom/android/launcher3/views/f;->Q()Z

    move-result p2

    if-eqz p2, :cond_39

    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_3a

    :cond_39
    const/4 p2, 0x0

    :goto_3a
    invoke-virtual {p0, p2}, Lcom/nothing/launcher/card/s;->setDeleteIconAlpha(F)V

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t0(Lcom/nothing/launcher/card/s;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/launcher/card/s;->v0(Lcom/nothing/launcher/card/s;Landroid/view/View;)V

    return-void
.end method

.method public static u0(Lcom/nothing/launcher/card/s;)V
    .registers 2

    iget-object v0, p0, Lcom/nothing/launcher/card/s;->m0:Lv8/l;

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/nothing/cardhost/g;->getAppWidgetId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    return-void
.end method

.method private static final v0(Lcom/nothing/launcher/card/s;Landroid/view/View;)V
    .registers 4

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    sget-object v0, Lcom/nothing/launcher/card/s;->q0:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Lcom/nothing/launcher/card/r;

    invoke-direct {v0, p0}, Lcom/nothing/launcher/card/r;-><init>(Lcom/nothing/launcher/card/s;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public static final synthetic w0(Lcom/nothing/launcher/card/s;)Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    return-object p0
.end method

.method private final x0(Landroid/view/MotionEvent;)Z
    .registers 6

    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget-object p0, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

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


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_31

    invoke-virtual {p0}, Lcom/nothing/cardhost/g;->getAppWidgetInfo()LF5/m;

    move-result-object v0

    if-eqz v0, :cond_2e

    sget-object v2, LF5/l;->g:LF5/l$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, LF5/l$a;->a(Landroid/content/Context;)LF5/l;

    move-result-object v2

    invoke-virtual {p0}, Lcom/nothing/cardhost/g;->getAppWidgetId()I

    move-result v3

    invoke-virtual {v0}, LF5/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, LF5/l;->n(ILjava/lang/String;)Z

    move-result v0

    goto :goto_2f

    :cond_2e
    move v0, v1

    :goto_2f
    iput-boolean v0, p0, Lcom/nothing/launcher/card/s;->o0:Z

    :cond_31
    invoke-direct {p0, p1}, Lcom/nothing/launcher/card/s;->x0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3d

    iget-boolean v0, p0, Lcom/nothing/launcher/card/s;->o0:Z

    if-nez v0, :cond_3c

    goto :goto_3d

    :cond_3c
    return v1

    :cond_3d
    :goto_3d
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onViewAdded(Landroid/view/View;)V
    .registers 3

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_11
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    return-void
.end method

.method public final setDeleteIconAlpha(F)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_b

    return-void

    :cond_b
    iget-object v0, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lcom/nothing/launcher/card/s;->n0:Landroid/widget/ImageView;

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    const/4 v0, 0x0

    if-lez p1, :cond_1a

    const/4 p1, 0x1

    goto :goto_1b

    :cond_1a
    move p1, v0

    :goto_1b
    if-eqz p1, :cond_1e

    goto :goto_20

    :cond_1e
    const/16 v0, 0x8

    :goto_20
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
