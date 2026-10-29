.class public final Lcom/nothing/wallpaper/picker/creative/a;
.super Landroidx/fragment/app/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/creative/a$a;
    }
.end annotation


# static fields
.field public static final r:Lcom/nothing/wallpaper/picker/creative/a$a;


# instance fields
.field private q:Landroid/animation/AnimatorSet;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/creative/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/creative/a;->r:Lcom/nothing/wallpaper/picker/creative/a$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    return-void
.end method

.method public static synthetic d0(Landroid/animation/ValueAnimator;FILandroid/view/ViewGroup;Landroid/animation/ValueAnimator;)V
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/a;->j0(Landroid/animation/ValueAnimator;FILandroid/view/ViewGroup;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e0(Lcom/nothing/wallpaper/picker/creative/a;Le3/o;F)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/creative/a;->f0(Lcom/nothing/wallpaper/picker/creative/a;Le3/o;F)V

    return-void
.end method

.method private static final f0(Lcom/nothing/wallpaper/picker/creative/a;Le3/o;F)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/creative/a;->h0(Le3/o;F)V

    return-void
.end method

.method private final g0(Landroid/view/ViewGroup;F)V
    .registers 7

    invoke-static {p1}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object p0

    invoke-interface {p0}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float/2addr v3, p2

    sub-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_8

    :cond_28
    return-void
.end method

.method private final h0(Le3/o;F)V
    .registers 10

    iget-object v0, p1, Le3/o;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr v1, p2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p1, Le3/o;->A:Landroid/widget/LinearLayout;

    const-string v2, "topSection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, p2}, Lcom/nothing/wallpaper/picker/creative/a;->g0(Landroid/view/ViewGroup;F)V

    iget-object v1, p1, Le3/o;->v:Landroid/widget/LinearLayout;

    const-string v3, "bottomSection"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, p2}, Lcom/nothing/wallpaper/picker/creative/a;->g0(Landroid/view/ViewGroup;F)V

    iget-object v1, p1, Le3/o;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setScrollX(I)V

    iget-object v1, p1, Le3/o;->v:Landroid/widget/LinearLayout;

    float-to-int v4, p2

    neg-int v4, v4

    invoke-virtual {v1, v4}, Landroid/view/View;->setScrollX(I)V

    iget-object v1, p1, Le3/o;->A:Landroid/widget/LinearLayout;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    int-to-float v2, v2

    int-to-float v4, v0

    div-float v4, p2, v4

    add-float/2addr v2, v4

    const/4 v4, 0x0

    invoke-direct {p0, v1, v0, v2, v4}, Lcom/nothing/wallpaper/picker/creative/a;->i0(Landroid/view/ViewGroup;IFF)Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object p1, p1, Le3/o;->v:Landroid/widget/LinearLayout;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, v0, v2, p2}, Lcom/nothing/wallpaper/picker/creative/a;->i0(Landroid/view/ViewGroup;IFF)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-instance p2, Landroid/animation/AnimatorSet;

    invoke-direct {p2}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v5, 0xc8

    invoke-virtual {p2, v5, v6}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    const-wide/16 v5, 0x3e8

    invoke-virtual {p2, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v3, 0x3f19999a    # 0.6f

    invoke-direct {v0, v3, v4, v4, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {p2, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    filled-new-array {v1, p1}, [Landroid/animation/Animator;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {p2}, Landroid/animation/AnimatorSet;->start()V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/creative/a;->q:Landroid/animation/AnimatorSet;

    return-void
.end method

.method private final i0(Landroid/view/ViewGroup;IFF)Landroid/animation/ValueAnimator;
    .registers 7

    const/4 p0, 0x2

    new-array p0, p0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, p0, v1

    const/4 v0, 0x1

    aput p3, p0, v0

    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p0

    new-instance p3, LS6/c;

    invoke-direct {p3, p0, p4, p2, p1}, LS6/c;-><init>(Landroid/animation/ValueAnimator;FILandroid/view/ViewGroup;)V

    invoke-virtual {p0, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-string p1, "apply(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final j0(Landroid/animation/ValueAnimator;FILandroid/view/ViewGroup;Landroid/animation/ValueAnimator;)V
    .registers 6

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p0

    const-string p4, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    const/4 p4, 0x0

    cmpg-float p4, p1, p4

    if-nez p4, :cond_1f

    int-to-float p1, p2

    const/4 p2, 0x1

    int-to-float p2, p2

    sub-float/2addr p2, p0

    mul-float/2addr p1, p2

    goto :goto_24

    :cond_1f
    int-to-float p2, p2

    add-float/2addr p2, p1

    mul-float/2addr p2, p0

    sub-float p1, p2, p1

    :goto_24
    float-to-int p0, p1

    invoke-virtual {p3}, Landroid/view/View;->getScrollY()I

    move-result p1

    invoke-virtual {p3, p0, p1}, Landroid/view/View;->scrollTo(II)V

    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 6

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0d0099

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/f;->e(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/g;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Le3/o;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f070441

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f070440

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    iget-object v0, p1, Le3/o;->A:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/nothing/wallpaper/picker/creative/a$b;

    invoke-direct {v1, p3}, Lcom/nothing/wallpaper/picker/creative/a$b;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iget-object p3, p1, Le3/o;->A:Landroid/widget/LinearLayout;

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p3

    new-instance v0, LS6/b;

    invoke-direct {v0, p0, p1, p2}, LS6/b;-><init>(Lcom/nothing/wallpaper/picker/creative/a;Le3/o;F)V

    invoke-virtual {p3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onDestroyView()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroyView()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/a;->q:Landroid/animation/AnimatorSet;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_a
    return-void
.end method
