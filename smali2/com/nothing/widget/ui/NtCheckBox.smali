.class public Lcom/nothing/widget/ui/NtCheckBox;
.super Landroidx/appcompat/widget/AppCompatCheckBox;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/widget/ui/NtCheckBox$a;
    }
.end annotation


# static fields
.field public static final L:Lcom/nothing/widget/ui/NtCheckBox$a;

.field private static final M:Landroid/view/animation/PathInterpolator;

.field private static final N:Landroid/view/animation/PathInterpolator;


# instance fields
.field private A:Landroid/graphics/drawable/TransitionDrawable;

.field private B:Landroid/graphics/drawable/TransitionDrawable;

.field private C:Landroid/animation/ValueAnimator;

.field private D:Z

.field private E:I

.field private F:I

.field private G:I

.field private H:F

.field private I:I

.field private J:I

.field private K:I

.field private u:Z

.field private v:Landroid/graphics/drawable/StateListDrawable;

.field private w:Landroid/graphics/drawable/LayerDrawable;

.field private x:Landroid/graphics/drawable/LayerDrawable;

.field private y:Landroid/graphics/drawable/LayerDrawable;

.field private z:Landroid/graphics/drawable/TransitionDrawable;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, Lcom/nothing/widget/ui/NtCheckBox$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/widget/ui/NtCheckBox$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/widget/ui/NtCheckBox;->L:Lcom/nothing/widget/ui/NtCheckBox$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f19999a    # 0.6f

    const v2, 0x3ecccccd    # 0.4f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3, v4, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/widget/ui/NtCheckBox;->M:Landroid/view/animation/PathInterpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    invoke-direct {v0, v3, v2, v2, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/widget/ui/NtCheckBox;->N:Landroid/view/animation/PathInterpolator;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/widget/ui/NtCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->u:Z

    .line 5
    invoke-direct {p0, p2}, Lcom/nothing/widget/ui/NtCheckBox;->r(Landroid/util/AttributeSet;)V

    .line 6
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->n()V

    .line 7
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->o()V

    .line 8
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->s()V

    .line 9
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->m()Landroid/graphics/drawable/StateListDrawable;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->v:Landroid/graphics/drawable/StateListDrawable;

    .line 10
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_c

    const p3, 0x101006c

    .line 2
    :cond_c
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/widget/ui/NtCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/widget/ui/NtCheckBox;->i(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/widget/ui/NtCheckBox;->h(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/widget/ui/NtCheckBox;->j(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/widget/ui/NtCheckBox;->l(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic f(Lcom/nothing/widget/ui/NtCheckBox;Landroid/animation/ValueAnimator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->C:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private final g(Z)V
    .registers 16

    const/4 v0, 0x0

    if-eqz p1, :cond_28

    iget-object p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->z:Landroid/graphics/drawable/TransitionDrawable;

    const-string v1, "preCheckedTransition"

    if-nez p1, :cond_d

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v0

    :cond_d
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->z:Landroid/graphics/drawable/TransitionDrawable;

    if-nez p1, :cond_19

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v3, v0

    goto :goto_1a

    :cond_19
    move-object v3, p1

    :goto_1a
    sget-object v6, Lcom/nothing/widget/ui/NtCheckBox;->M:Landroid/view/animation/PathInterpolator;

    new-instance v7, LX7/a;

    invoke-direct {v7, p0}, LX7/a;-><init>(Lcom/nothing/widget/ui/NtCheckBox;)V

    const-wide/16 v4, 0x64

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/nothing/widget/ui/NtCheckBox;->k(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V

    return-void

    :cond_28
    move-object v2, p0

    iget-object p0, v2, Lcom/nothing/widget/ui/NtCheckBox;->B:Landroid/graphics/drawable/TransitionDrawable;

    const-string p1, "uncheckedTransition"

    if-nez p0, :cond_33

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v0

    :cond_33
    invoke-virtual {v2, p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p0, v2, Lcom/nothing/widget/ui/NtCheckBox;->B:Landroid/graphics/drawable/TransitionDrawable;

    if-nez p0, :cond_3f

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v9, v0

    goto :goto_40

    :cond_3f
    move-object v9, p0

    :goto_40
    sget-object v12, Lcom/nothing/widget/ui/NtCheckBox;->M:Landroid/view/animation/PathInterpolator;

    new-instance v13, LX7/b;

    invoke-direct {v13, v2}, LX7/b;-><init>(Lcom/nothing/widget/ui/NtCheckBox;)V

    const-wide/16 v10, 0x64

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, Lcom/nothing/widget/ui/NtCheckBox;->k(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V

    return-void
.end method

.method private static final h(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;
    .registers 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->A:Landroid/graphics/drawable/TransitionDrawable;

    const/4 v1, 0x0

    const-string v2, "checkedTransition"

    if-nez v0, :cond_10

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_10
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->A:Landroid/graphics/drawable/TransitionDrawable;

    if-nez v0, :cond_1c

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v1

    goto :goto_1d

    :cond_1c
    move-object v4, v0

    :goto_1d
    sget-object v7, Lcom/nothing/widget/ui/NtCheckBox;->N:Landroid/view/animation/PathInterpolator;

    new-instance v8, LX7/d;

    invoke-direct {v8, p0}, LX7/d;-><init>(Lcom/nothing/widget/ui/NtCheckBox;)V

    const-wide/16 v5, 0x64

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/nothing/widget/ui/NtCheckBox;->k(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final i(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->v:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->t()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final j(Lcom/nothing/widget/ui/NtCheckBox;)Lh8/A;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->v:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->t()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final k(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V
    .registers 7

    invoke-virtual {p1}, Landroid/graphics/drawable/TransitionDrawable;->resetTransition()V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_2a

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p2, LX7/c;

    invoke-direct {p2, p1}, LX7/c;-><init>(Landroid/graphics/drawable/TransitionDrawable;)V

    invoke-virtual {v0, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Lcom/nothing/widget/ui/NtCheckBox$b;

    invoke-direct {p1, p0, p5}, Lcom/nothing/widget/ui/NtCheckBox$b;-><init>(Lcom/nothing/widget/ui/NtCheckBox;Lv8/a;)V

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->C:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_2a
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final l(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "$drawable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/16 v0, 0x2710

    int-to-float v1, v0

    mul-float/2addr p1, v1

    float-to-int p1, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, LB8/h;->m(III)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    return-void
.end method

.method private final m()Landroid/graphics/drawable/StateListDrawable;
    .registers 5

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const v1, 0x10100a0

    filled-new-array {v1}, [I

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x0

    if-nez v2, :cond_17

    const-string v2, "checkedDrawable"

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, v3

    :cond_17
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    new-array v1, v1, [I

    iget-object p0, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    if-nez p0, :cond_27

    const-string p0, "uncheckedDrawable"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_28

    :cond_27
    move-object v3, p0

    :goto_28
    invoke-virtual {v0, v1, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method private final n()V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->i:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->F:I

    iget v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->G:I

    iget-boolean v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->D:Z

    if-eqz v0, :cond_2f

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    :goto_2d
    int-to-float v0, v0

    goto :goto_3a

    :cond_2f
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_2d

    :goto_3a
    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->H:F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->I:I

    return-void
.end method

.method private final o()V
    .registers 15

    iget v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->J:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/nothing/widget/ui/NtCheckBox;->p(Lcom/nothing/widget/ui/NtCheckBox;ILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {v0}, [Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v2, 0x0

    iget v3, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    move v4, v3

    move v5, v3

    move v6, v3

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    iput-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    iget v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->K:I

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lcom/nothing/widget/ui/NtCheckBox;->q(Lcom/nothing/widget/ui/NtCheckBox;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lf6/c;->b:I

    invoke-static {v1, v3, v2}, Ls0/h;->e(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {v0}, [Landroid/graphics/drawable/GradientDrawable;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v4, 0x0

    iget v5, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    move v6, v5

    move v7, v5

    move v8, v5

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    iput-object v3, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_7d

    iget v2, p0, Lcom/nothing/widget/ui/NtCheckBox;->G:I

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    iget v3, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    add-int v6, v2, v3

    iget v2, p0, Lcom/nothing/widget/ui/NtCheckBox;->G:I

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    iget v3, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    add-int v7, v2, v3

    new-instance v4, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {v0, v1}, [Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v9, 0x0

    iget v10, p0, Lcom/nothing/widget/ui/NtCheckBox;->E:I

    move v11, v10

    move v12, v10

    move v13, v10

    move-object v8, v4

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    const/4 v5, 0x1

    move v8, v6

    move v9, v7

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    iput-object v4, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    return-void

    :cond_7d
    const-string v0, "NtCheckBox"

    const-string v1, "Checkmark drawable is null!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    if-nez v0, :cond_8e

    const-string v0, "preCheckedDrawable"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_8f

    :cond_8e
    move-object v2, v0

    :goto_8f
    iput-object v2, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    return-void
.end method

.method private static final p(Lcom/nothing/widget/ui/NtCheckBox;ILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;
    .registers 5

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->G:I

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    iget v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->H:F

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    if-eqz p2, :cond_21

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget p0, p0, Lcom/nothing/widget/ui/NtCheckBox;->I:I

    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_21
    return-object v0
.end method

.method static synthetic q(Lcom/nothing/widget/ui/NtCheckBox;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;
    .registers 5

    if-nez p4, :cond_c

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_7

    const/4 p2, 0x0

    :cond_7
    invoke-static {p0, p1, p2}, Lcom/nothing/widget/ui/NtCheckBox;->p(Lcom/nothing/widget/ui/NtCheckBox;ILjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: initDrawables$createGradientDrawable"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final r(Landroid/util/AttributeSet;)V
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lf6/d;->c:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_f
    sget v0, Lf6/d;->e:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->D:Z

    sget v0, Lf6/d;->f:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lf6/a;->a:I

    invoke-static {v1, v2}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->J:I

    sget v0, Lf6/d;->d:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lf6/a;->c:I

    invoke-static {v1, v2}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->K:I
    :try_end_3b
    .catchall {:try_start_f .. :try_end_3b} :catchall_3f

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_3f
    move-exception p0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p0
.end method

.method private final s()V
    .registers 7

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_6a

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_6a

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_6a

    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    iget-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    const-string v2, "uncheckedDrawable"

    const/4 v3, 0x0

    if-nez v1, :cond_19

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_19
    iget-object v4, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    const-string v5, "preCheckedDrawable"

    if-nez v4, :cond_23

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v3

    :cond_23
    filled-new-array {v1, v4}, [Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->z:Landroid/graphics/drawable/TransitionDrawable;

    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    iget-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    if-nez v1, :cond_36

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_36
    iget-object v4, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    const-string v5, "checkedDrawable"

    if-nez v4, :cond_40

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v3

    :cond_40
    filled-new-array {v1, v4}, [Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->A:Landroid/graphics/drawable/TransitionDrawable;

    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    iget-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    if-nez v1, :cond_53

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_53
    iget-object v4, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    if-nez v4, :cond_5b

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_5c

    :cond_5b
    move-object v3, v4

    :goto_5c
    filled-new-array {v1, v3}, [Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->B:Landroid/graphics/drawable/TransitionDrawable;

    return-void

    :cond_6a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Drawables must be initialized before transitions."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final t()V
    .registers 7

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_16

    :cond_9
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_13

    const v0, 0x3e99999a    # 0.3f

    goto :goto_16

    :cond_13
    const v0, 0x3ecccccd    # 0.4f

    :goto_16
    iget-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_88

    iget-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_88

    iget-object v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    if-nez v1, :cond_23

    goto :goto_88

    :cond_23
    iget v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->J:I

    const/16 v2, 0xff

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v1

    iput v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->J:I

    iget v1, p0, Lcom/nothing/widget/ui/NtCheckBox;->K:I

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->K:I

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->w:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x0

    if-nez v0, :cond_43

    const-string v0, "uncheckedDrawable"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_43
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget v4, p0, Lcom/nothing/widget/ui/NtCheckBox;->I:I

    iget v5, p0, Lcom/nothing/widget/ui/NtCheckBox;->J:I

    invoke-virtual {v0, v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->x:Landroid/graphics/drawable/LayerDrawable;

    if-nez v0, :cond_60

    const-string v0, "preCheckedDrawable"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_60
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget v4, p0, Lcom/nothing/widget/ui/NtCheckBox;->K:I

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->y:Landroid/graphics/drawable/LayerDrawable;

    if-nez v0, :cond_78

    const-string v0, "checkedDrawable"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_79

    :cond_78
    move-object v1, v0

    :goto_79
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget p0, p0, Lcom/nothing/widget/ui/NtCheckBox;->K:I

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void

    :cond_88
    :goto_88
    const-string p0, "NtCheckBox"

    const-string v0, "Drawables are not initialized yet."

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public setChecked(Z)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->t()V

    if-eq v0, p1, :cond_1b

    iget-boolean v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->u:Z

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lcom/nothing/widget/ui/NtCheckBox;->C:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_17
    invoke-direct {p0, p1}, Lcom/nothing/widget/ui/NtCheckBox;->g(Z)V

    goto :goto_20

    :cond_1b
    iget-object p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->v:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_20
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/nothing/widget/ui/NtCheckBox;->u:Z

    return-void
.end method

.method public setEnabled(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtCheckBox;->t()V

    return-void
.end method
