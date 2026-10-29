.class public final Lcom/nothing/widget/ui/NtRadioButton;
.super Landroidx/appcompat/widget/AppCompatRadioButton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/widget/ui/NtRadioButton$a;
    }
.end annotation


# static fields
.field public static final L:Lcom/nothing/widget/ui/NtRadioButton$a;

.field private static final M:Landroid/view/animation/PathInterpolator;

.field private static final N:Landroid/view/animation/PathInterpolator;


# instance fields
.field private A:Landroid/graphics/drawable/TransitionDrawable;

.field private B:Landroid/graphics/drawable/TransitionDrawable;

.field private C:Landroid/animation/ValueAnimator;

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private u:Z

.field private v:Landroid/graphics/drawable/StateListDrawable;

.field public w:Landroid/graphics/drawable/LayerDrawable;

.field public x:Landroid/graphics/drawable/LayerDrawable;

.field public y:Landroid/graphics/drawable/LayerDrawable;

.field private z:Landroid/graphics/drawable/TransitionDrawable;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, Lcom/nothing/widget/ui/NtRadioButton$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/widget/ui/NtRadioButton$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/widget/ui/NtRadioButton;->L:Lcom/nothing/widget/ui/NtRadioButton$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f19999a    # 0.6f

    const v2, 0x3ecccccd    # 0.4f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3, v4, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/widget/ui/NtRadioButton;->M:Landroid/view/animation/PathInterpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    invoke-direct {v0, v3, v2, v2, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/widget/ui/NtRadioButton;->N:Landroid/view/animation/PathInterpolator;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/widget/ui/NtRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->u:Z

    .line 6
    invoke-direct {p0, p2}, Lcom/nothing/widget/ui/NtRadioButton;->q(Landroid/util/AttributeSet;)V

    .line 7
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->m()V

    .line 8
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->n()V

    .line 9
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->r()V

    .line 10
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->l()Landroid/graphics/drawable/StateListDrawable;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->v:Landroid/graphics/drawable/StateListDrawable;

    .line 11
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 12
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

    if-eqz p4, :cond_b

    .line 2
    sget p3, Lf/a;->G:I

    .line 3
    :cond_b
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/widget/ui/NtRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/widget/ui/NtRadioButton;->i(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/widget/ui/NtRadioButton;->g(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/widget/ui/NtRadioButton;->k(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic d(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/widget/ui/NtRadioButton;->h(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/nothing/widget/ui/NtRadioButton;Landroid/animation/ValueAnimator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->C:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private final f(Z)V
    .registers 16

    const/4 v0, 0x0

    if-eqz p1, :cond_28

    iget-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->z:Landroid/graphics/drawable/TransitionDrawable;

    const-string v1, "preCheckedTransition"

    if-nez p1, :cond_d

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v0

    :cond_d
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->z:Landroid/graphics/drawable/TransitionDrawable;

    if-nez p1, :cond_19

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v3, v0

    goto :goto_1a

    :cond_19
    move-object v3, p1

    :goto_1a
    sget-object v6, Lcom/nothing/widget/ui/NtRadioButton;->M:Landroid/view/animation/PathInterpolator;

    new-instance v7, LX7/j;

    invoke-direct {v7, p0}, LX7/j;-><init>(Lcom/nothing/widget/ui/NtRadioButton;)V

    const-wide/16 v4, 0x64

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/nothing/widget/ui/NtRadioButton;->j(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V

    return-void

    :cond_28
    move-object v2, p0

    iget-object p0, v2, Lcom/nothing/widget/ui/NtRadioButton;->B:Landroid/graphics/drawable/TransitionDrawable;

    const-string p1, "uncheckedTransition"

    if-nez p0, :cond_33

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v0

    :cond_33
    invoke-virtual {v2, p0}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p0, v2, Lcom/nothing/widget/ui/NtRadioButton;->B:Landroid/graphics/drawable/TransitionDrawable;

    if-nez p0, :cond_3f

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v9, v0

    goto :goto_40

    :cond_3f
    move-object v9, p0

    :goto_40
    sget-object v12, Lcom/nothing/widget/ui/NtRadioButton;->M:Landroid/view/animation/PathInterpolator;

    new-instance v13, LX7/k;

    invoke-direct {v13, v2}, LX7/k;-><init>(Lcom/nothing/widget/ui/NtRadioButton;)V

    const-wide/16 v10, 0x64

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, Lcom/nothing/widget/ui/NtRadioButton;->j(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V

    return-void
.end method

.method private static final g(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->v:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->s()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final h(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;
    .registers 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->A:Landroid/graphics/drawable/TransitionDrawable;

    const/4 v1, 0x0

    const-string v2, "checkedTransition"

    if-nez v0, :cond_10

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_10
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->A:Landroid/graphics/drawable/TransitionDrawable;

    if-nez v0, :cond_1c

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v1

    goto :goto_1d

    :cond_1c
    move-object v4, v0

    :goto_1d
    sget-object v7, Lcom/nothing/widget/ui/NtRadioButton;->N:Landroid/view/animation/PathInterpolator;

    new-instance v8, LX7/m;

    invoke-direct {v8, p0}, LX7/m;-><init>(Lcom/nothing/widget/ui/NtRadioButton;)V

    const-wide/16 v5, 0x64

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/nothing/widget/ui/NtRadioButton;->j(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final i(Lcom/nothing/widget/ui/NtRadioButton;)Lh8/A;
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->v:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->s()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final j(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V
    .registers 7

    invoke-virtual {p1}, Landroid/graphics/drawable/TransitionDrawable;->resetTransition()V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_2a

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p2, LX7/l;

    invoke-direct {p2, p1}, LX7/l;-><init>(Landroid/graphics/drawable/TransitionDrawable;)V

    invoke-virtual {v0, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Lcom/nothing/widget/ui/NtRadioButton$b;

    invoke-direct {p1, p0, p5}, Lcom/nothing/widget/ui/NtRadioButton$b;-><init>(Lcom/nothing/widget/ui/NtRadioButton;Lv8/a;)V

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->C:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_2a
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final k(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V
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

.method private final l()Landroid/graphics/drawable/StateListDrawable;
    .registers 4

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const v1, 0x10100a0

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getUncheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method private final m()V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->D:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->i:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->E:I

    iget v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->D:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->F:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->j:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->H:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->G:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/a;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->K:I

    return-void
.end method

.method private final n()V
    .registers 15

    iget v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->I:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/nothing/widget/ui/NtRadioButton;->p(Lcom/nothing/widget/ui/NtRadioButton;ILjava/lang/Integer;IILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    move-object v0, v1

    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {p0}, [Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    invoke-direct {v1, p0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iget v3, v0, Lcom/nothing/widget/ui/NtRadioButton;->D:I

    move v4, v3

    move v5, v3

    move v6, v3

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    invoke-virtual {v0, v1}, Lcom/nothing/widget/ui/NtRadioButton;->setUncheckedDrawable(Landroid/graphics/drawable/LayerDrawable;)V

    iget v1, v0, Lcom/nothing/widget/ui/NtRadioButton;->J:I

    const/16 v4, 0xc

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/nothing/widget/ui/NtRadioButton;->p(Lcom/nothing/widget/ui/NtRadioButton;ILjava/lang/Integer;IILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    iget v1, v0, Lcom/nothing/widget/ui/NtRadioButton;->K:I

    iget v3, v0, Lcom/nothing/widget/ui/NtRadioButton;->H:I

    invoke-static {v0, v1, v2, v3}, Lcom/nothing/widget/ui/NtRadioButton;->o(Lcom/nothing/widget/ui/NtRadioButton;ILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    iget v2, v0, Lcom/nothing/widget/ui/NtRadioButton;->F:I

    iget v3, v0, Lcom/nothing/widget/ui/NtRadioButton;->H:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    iget v3, v0, Lcom/nothing/widget/ui/NtRadioButton;->D:I

    add-int v6, v2, v3

    new-instance v7, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {p0}, [Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-direct {v7, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v8, 0x0

    iget v9, v0, Lcom/nothing/widget/ui/NtRadioButton;->D:I

    move v10, v9

    move v11, v9

    move v12, v9

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    invoke-virtual {v0, v7}, Lcom/nothing/widget/ui/NtRadioButton;->setPreCheckedDrawable(Landroid/graphics/drawable/LayerDrawable;)V

    new-instance v4, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {p0, v1}, [Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    invoke-direct {v4, p0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v9, 0x0

    iget v10, v0, Lcom/nothing/widget/ui/NtRadioButton;->D:I

    move v11, v10

    move v12, v10

    move v13, v10

    move-object v8, v4

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    const/4 v5, 0x1

    move v7, v6

    move v8, v6

    move v9, v6

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    invoke-virtual {v0, v4}, Lcom/nothing/widget/ui/NtRadioButton;->setCheckedDrawable(Landroid/graphics/drawable/LayerDrawable;)V

    return-void
.end method

.method private static final o(Lcom/nothing/widget/ui/NtRadioButton;ILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;
    .registers 6

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v0, p3, p3}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    if-eqz p2, :cond_1a

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget p0, p0, Lcom/nothing/widget/ui/NtRadioButton;->G:I

    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_1a
    return-object v0
.end method

.method static synthetic p(Lcom/nothing/widget/ui/NtRadioButton;ILjava/lang/Integer;IILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;
    .registers 6

    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_b

    iget p3, p0, Lcom/nothing/widget/ui/NtRadioButton;->F:I

    :cond_b
    invoke-static {p0, p1, p2, p3}, Lcom/nothing/widget/ui/NtRadioButton;->o(Lcom/nothing/widget/ui/NtRadioButton;ILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p0

    return-object p0
.end method

.method private final q(Landroid/util/AttributeSet;)V
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lf6/d;->h:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_f
    sget v0, Lf6/d;->j:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lf6/a;->a:I

    invoke-static {v1, v2}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->I:I

    sget v0, Lf6/d;->i:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lf6/a;->c:I

    invoke-static {v1, v2}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->J:I
    :try_end_33
    .catchall {:try_start_f .. :try_end_33} :catchall_37

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_37
    move-exception p0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p0
.end method

.method private final r()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->w:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_4a

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->x:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_4a

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->y:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_4a

    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getUncheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getPreCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v2

    filled-new-array {v1, v2}, [Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->z:Landroid/graphics/drawable/TransitionDrawable;

    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getPreCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v2

    filled-new-array {v1, v2}, [Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->A:Landroid/graphics/drawable/TransitionDrawable;

    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getUncheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v2

    filled-new-array {v1, v2}, [Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    iput-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->B:Landroid/graphics/drawable/TransitionDrawable;

    return-void

    :cond_4a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Drawables must be initialized before transitions."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final s()V
    .registers 6

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
    iget-object v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->w:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_7c

    iget-object v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->x:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_7c

    iget-object v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->y:Landroid/graphics/drawable/LayerDrawable;

    if-nez v1, :cond_23

    goto :goto_7c

    :cond_23
    iget v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->I:I

    const/16 v2, 0xff

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v1

    iput v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->I:I

    iget v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->J:I

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v1

    iput v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->J:I

    iget v1, p0, Lcom/nothing/widget/ui/NtRadioButton;->K:I

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->K:I

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getUncheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget v3, p0, Lcom/nothing/widget/ui/NtRadioButton;->G:I

    iget v4, p0, Lcom/nothing/widget/ui/NtRadioButton;->I:I

    invoke-virtual {v0, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getPreCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget v3, p0, Lcom/nothing/widget/ui/NtRadioButton;->J:I

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtRadioButton;->getCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget p0, p0, Lcom/nothing/widget/ui/NtRadioButton;->J:I

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void

    :cond_7c
    :goto_7c
    const-string p0, "NtRadioButton"

    const-string v0, "Drawables are not initialized yet."

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final getCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/widget/ui/NtRadioButton;->y:Landroid/graphics/drawable/LayerDrawable;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "checkedDrawable"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getPreCheckedDrawable()Landroid/graphics/drawable/LayerDrawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/widget/ui/NtRadioButton;->x:Landroid/graphics/drawable/LayerDrawable;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "preCheckedDrawable"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getUncheckedDrawable()Landroid/graphics/drawable/LayerDrawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/widget/ui/NtRadioButton;->w:Landroid/graphics/drawable/LayerDrawable;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "uncheckedDrawable"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public setChecked(Z)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->s()V

    if-eq v0, p1, :cond_1b

    iget-boolean v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->u:Z

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lcom/nothing/widget/ui/NtRadioButton;->C:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_17
    invoke-direct {p0, p1}, Lcom/nothing/widget/ui/NtRadioButton;->f(Z)V

    goto :goto_20

    :cond_1b
    iget-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->v:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatRadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_20
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->u:Z

    return-void
.end method

.method public final setCheckedDrawable(Landroid/graphics/drawable/LayerDrawable;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->y:Landroid/graphics/drawable/LayerDrawable;

    return-void
.end method

.method public setEnabled(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtRadioButton;->s()V

    return-void
.end method

.method public final setPreCheckedDrawable(Landroid/graphics/drawable/LayerDrawable;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->x:Landroid/graphics/drawable/LayerDrawable;

    return-void
.end method

.method public final setUncheckedDrawable(Landroid/graphics/drawable/LayerDrawable;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/widget/ui/NtRadioButton;->w:Landroid/graphics/drawable/LayerDrawable;

    return-void
.end method
