.class public final Lcom/nothing/wallpaper/widget/MoreGuideView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/widget/MoreGuideView$a;
    }
.end annotation


# static fields
.field public static final y:Lcom/nothing/wallpaper/widget/MoreGuideView$a;


# instance fields
.field private final q:Landroid/view/animation/PathInterpolator;

.field private final r:Landroid/view/animation/PathInterpolator;

.field private final s:Ljava/util/List;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/ImageView;

.field private w:Z

.field private final x:Lcom/nothing/wallpaper/widget/MoreGuideView$d;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/widget/MoreGuideView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/widget/MoreGuideView$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/widget/MoreGuideView;->y:Lcom/nothing/wallpaper/widget/MoreGuideView$a;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/widget/MoreGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Landroid/view/animation/PathInterpolator;

    const p3, 0x3ecccccd    # 0.4f

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p2, p3, v0, v0, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->q:Landroid/view/animation/PathInterpolator;

    .line 5
    new-instance p2, Landroid/view/animation/PathInterpolator;

    invoke-direct {p2, p3, v0, p3, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->r:Landroid/view/animation/PathInterpolator;

    .line 6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->s:Ljava/util/List;

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance p3, Lcom/nothing/wallpaper/widget/MoreGuideView$d;

    invoke-direct {p3, p0, p2}, Lcom/nothing/wallpaper/widget/MoreGuideView$d;-><init>(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->x:Lcom/nothing/wallpaper/widget/MoreGuideView$d;

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d0128

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a0495

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->t:Landroid/widget/TextView;

    const p1, 0x7f0a0249

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    const p1, 0x7f0a024b

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->v:Landroid/widget/ImageView;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/MoreGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Landroid/animation/ValueAnimator;Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/widget/MoreGuideView;->o(Landroid/animation/ValueAnimator;Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/widget/MoreGuideView;->n(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic c(Lcom/nothing/wallpaper/widget/MoreGuideView;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->s:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic d(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic e(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/ImageView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->v:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic f(Lcom/nothing/wallpaper/widget/MoreGuideView;)Landroid/widget/TextView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->t:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic g(Lcom/nothing/wallpaper/widget/MoreGuideView;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->w:Z

    return p0
.end method

.method public static final synthetic h(Lcom/nothing/wallpaper/widget/MoreGuideView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->k()V

    return-void
.end method

.method public static final synthetic i(Lcom/nothing/wallpaper/widget/MoreGuideView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->m()V

    return-void
.end method

.method private final k()V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->x:Lcom/nothing/wallpaper/widget/MoreGuideView$d;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method private final m()V
    .registers 10

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->t:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_a

    return-void

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070474

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070473

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iget-object v3, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v3, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    iget-object v3, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->v:Landroid/widget/ImageView;

    new-array v4, v0, [F

    fill-array-data v4, :array_b4

    const-string v5, "alpha"

    invoke-static {v3, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    iget-object v4, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->r:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v6, 0x12c

    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v4, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    new-array v8, v0, [F

    fill-array-data v8, :array_bc

    invoke-static {v4, v5, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    iget-object v8, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->r:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v4, v8}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v4, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v8, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->t:Landroid/widget/TextView;

    new-array v0, v0, [F

    fill-array-data v0, :array_c4

    invoke-static {v8, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v5, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->q:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v0, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    filled-new-array {v2, v1}, [I

    move-result-object v1

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->q:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v5, 0x258

    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, LT7/c;

    invoke-direct {v2, p0}, LT7/c;-><init>(Lcom/nothing/wallpaper/widget/MoreGuideView;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v2, Lcom/nothing/wallpaper/widget/MoreGuideView$b;

    invoke-direct {v2, p0, v1, v0}, Lcom/nothing/wallpaper/widget/MoreGuideView$b;-><init>(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;Landroid/animation/ObjectAnimator;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v2, Lcom/nothing/wallpaper/widget/MoreGuideView$c;

    invoke-direct {v2, p0, v0, v3, v4}, Lcom/nothing/wallpaper/widget/MoreGuideView$c;-><init>(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    invoke-virtual {v4, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, LT7/d;

    invoke-direct {v0, v1, p0}, LT7/d;-><init>(Landroid/animation/ValueAnimator;Lcom/nothing/wallpaper/widget/MoreGuideView;)V

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->s:Ljava/util/List;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->s:Ljava/util/List;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :array_b4
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_bc
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_c4
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final n(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private static final o(Landroid/animation/ValueAnimator;Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "animation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p2

    const v0, 0x3e99999a    # 0.3f

    cmpl-float p2, p2, v0

    if-lez p2, :cond_1b

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    iget-object p1, p1, Lcom/nothing/wallpaper/widget/MoreGuideView;->s:Ljava/util/List;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1b
    return-void
.end method


# virtual methods
.method public final j()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->u:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->v:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->v:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final l()V
    .registers 4

    invoke-direct {p0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->k()V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->x:Lcom/nothing/wallpaper/widget/MoreGuideView$d;

    const/4 v0, 0x1

    const-wide/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->w:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->w:Z

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView;->s:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v1, v0}, Li8/s;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    instance-of v2, v1, Landroid/animation/ValueAnimator;

    if-eqz v2, :cond_2f

    move-object v2, v1

    check-cast v2, Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_2f
    invoke-virtual {v1}, Landroid/animation/Animator;->removeAllListeners()V

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    goto :goto_19

    :cond_36
    invoke-direct {p0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->k()V

    return-void
.end method
