.class public final Lcom/nothing/widget/ui/NtSwitch;
.super Landroid/widget/CompoundButton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/widget/ui/NtSwitch$a;
    }
.end annotation


# static fields
.field public static final J:Lcom/nothing/widget/ui/NtSwitch$a;

.field private static final K:Landroid/view/animation/PathInterpolator;

.field private static final L:Landroid/view/animation/PathInterpolator;


# instance fields
.field private A:F

.field private B:F

.field private C:Landroid/animation/ValueAnimator;

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private final I:Landroid/graphics/Paint;

.field private q:Z

.field private r:Landroid/graphics/drawable/GradientDrawable;

.field private s:Landroid/graphics/drawable/GradientDrawable;

.field private t:Landroid/graphics/drawable/GradientDrawable;

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, Lcom/nothing/widget/ui/NtSwitch$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/widget/ui/NtSwitch$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/widget/ui/NtSwitch;->J:Lcom/nothing/widget/ui/NtSwitch$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f19999a    # 0.6f

    const v2, 0x3ecccccd    # 0.4f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3, v4, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/widget/ui/NtSwitch;->K:Landroid/view/animation/PathInterpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    invoke-direct {v0, v3, v2, v2, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/widget/ui/NtSwitch;->L:Landroid/view/animation/PathInterpolator;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/widget/ui/NtSwitch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/nothing/widget/ui/NtSwitch;->q:Z

    .line 5
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/nothing/widget/ui/NtSwitch;->I:Landroid/graphics/Paint;

    .line 6
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtSwitch;->f()V

    .line 7
    invoke-direct {p0}, Lcom/nothing/widget/ui/NtSwitch;->d()Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/widget/ui/NtSwitch;->r:Landroid/graphics/drawable/GradientDrawable;

    .line 8
    iget p1, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    invoke-direct {p0, p1}, Lcom/nothing/widget/ui/NtSwitch;->e(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/widget/ui/NtSwitch;->s:Landroid/graphics/drawable/GradientDrawable;

    .line 9
    iget p1, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    invoke-direct {p0, p1}, Lcom/nothing/widget/ui/NtSwitch;->e(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/widget/ui/NtSwitch;->t:Landroid/graphics/drawable/GradientDrawable;

    const/4 p1, 0x0

    .line 10
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

    const p3, 0x101043f

    .line 2
    :cond_c
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/widget/ui/NtSwitch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/widget/ui/NtSwitch;FFIILandroid/animation/ValueAnimator;)V
    .registers 6

    invoke-static/range {p0 .. p5}, Lcom/nothing/widget/ui/NtSwitch;->c(Lcom/nothing/widget/ui/NtSwitch;FFIILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final b(Z)V
    .registers 8

    iget v2, p0, Lcom/nothing/widget/ui/NtSwitch;->B:F

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p1, :cond_9

    move v3, v1

    goto :goto_a

    :cond_9
    move v3, v0

    :goto_a
    if-eqz p1, :cond_10

    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    :goto_e
    move v4, v0

    goto :goto_13

    :cond_10
    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    goto :goto_e

    :goto_13
    if-eqz p1, :cond_19

    iget p1, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    :goto_17
    move v5, p1

    goto :goto_1c

    :cond_19
    iget p1, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    goto :goto_17

    :goto_1c
    iget-object p1, p0, Lcom/nothing/widget/ui/NtSwitch;->C:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_23

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_23
    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_4a

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, LX7/n;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, LX7/n;-><init>(Lcom/nothing/widget/ui/NtSwitch;FFII)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    iput-object p1, v1, Lcom/nothing/widget/ui/NtSwitch;->C:Landroid/animation/ValueAnimator;

    return-void

    nop

    :array_4a
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final c(Lcom/nothing/widget/ui/NtSwitch;FFIILandroid/animation/ValueAnimator;)V
    .registers 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p5

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Ljava/lang/Float;

    invoke-virtual {p5}, Ljava/lang/Float;->floatValue()F

    move-result p5

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float v1, p5, v0

    if-gez v1, :cond_35

    div-float/2addr p5, v0

    sget-object p2, Lcom/nothing/widget/ui/NtSwitch;->K:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p2, p5}, Landroid/view/animation/PathInterpolator;->getInterpolation(F)F

    move-result p2

    iget p3, p0, Lcom/nothing/widget/ui/NtSwitch;->v:I

    int-to-float p4, p3

    iget p5, p0, Lcom/nothing/widget/ui/NtSwitch;->w:I

    sub-int/2addr p5, p3

    int-to-float p3, p5

    mul-float/2addr p3, p2

    add-float/2addr p4, p3

    float-to-int p2, p4

    iput p2, p0, Lcom/nothing/widget/ui/NtSwitch;->u:I

    iput p1, p0, Lcom/nothing/widget/ui/NtSwitch;->B:F

    goto :goto_6c

    :cond_35
    sub-float/2addr p5, v0

    div-float/2addr p5, v0

    sget-object v0, Lcom/nothing/widget/ui/NtSwitch;->L:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v0, p5}, Landroid/view/animation/PathInterpolator;->getInterpolation(F)F

    move-result p5

    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->w:I

    int-to-float v1, v0

    iget v2, p0, Lcom/nothing/widget/ui/NtSwitch;->v:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float/2addr v0, p5

    sub-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->u:I

    sub-float/2addr p2, p1

    mul-float/2addr p2, p5

    add-float/2addr p1, p2

    iput p1, p0, Lcom/nothing/widget/ui/NtSwitch;->B:F

    new-instance p1, Landroid/animation/ArgbEvaluator;

    invoke-direct {p1}, Landroid/animation/ArgbEvaluator;-><init>()V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p5, p2, p3}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/nothing/widget/ui/NtSwitch;->H:I

    :goto_6c
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final d()Landroid/graphics/drawable/GradientDrawable;
    .registers 3

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->v:I

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->A:F

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget p0, p0, Lcom/nothing/widget/ui/NtSwitch;->D:I

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-object v0
.end method

.method private final e(I)Landroid/graphics/drawable/GradientDrawable;
    .registers 5

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->y:I

    iget v2, p0, Lcom/nothing/widget/ui/NtSwitch;->z:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    iget p0, p0, Lcom/nothing/widget/ui/NtSwitch;->A:F

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-object v0
.end method

.method private final f()V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->v:I

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->u:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->w:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->z:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf6/b;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->A:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lf6/a;->d:I

    invoke-static {v0, v1}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->D:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->E:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lf6/a;->c:I

    invoke-static {v0, v1}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lf6/a;->b:I

    invoke-static {v0, v1}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->H:I

    return-void
.end method

.method private final h()V
    .registers 4

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
    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->D:I

    const/16 v2, 0xff

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v1

    iput v1, p0, Lcom/nothing/widget/ui/NtSwitch;->D:I

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->E:I

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v1

    iput v1, p0, Lcom/nothing/widget/ui/NtSwitch;->E:I

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v1

    iput v1, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    invoke-static {v1, v0}, Lt0/a;->x(II)I

    move-result v0

    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_44

    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    goto :goto_46

    :cond_44
    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    :goto_46
    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->H:I

    return-void
.end method


# virtual methods
.method public final g(ZZ)V
    .registers 3

    iput-boolean p2, p0, Lcom/nothing/widget/ui/NtSwitch;->q:Z

    invoke-virtual {p0, p1}, Lcom/nothing/widget/ui/NtSwitch;->setChecked(Z)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 11

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, p0, Lcom/nothing/widget/ui/NtSwitch;->y:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v2, v1

    iget v3, p0, Lcom/nothing/widget/ui/NtSwitch;->z:I

    int-to-float v3, v3

    div-float/2addr v3, v1

    sub-float v3, v0, v3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_28

    iget-object v4, p0, Lcom/nothing/widget/ui/NtSwitch;->s:Landroid/graphics/drawable/GradientDrawable;

    goto :goto_2a

    :cond_28
    iget-object v4, p0, Lcom/nothing/widget/ui/NtSwitch;->t:Landroid/graphics/drawable/GradientDrawable;

    :goto_2a
    iget v5, p0, Lcom/nothing/widget/ui/NtSwitch;->H:I

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    float-to-int v5, v2

    float-to-int v6, v3

    iget v7, p0, Lcom/nothing/widget/ui/NtSwitch;->y:I

    int-to-float v7, v7

    add-float/2addr v7, v2

    float-to-int v7, v7

    iget v8, p0, Lcom/nothing/widget/ui/NtSwitch;->z:I

    int-to-float v8, v8

    add-float/2addr v3, v8

    float-to-int v3, v3

    invoke-virtual {v4, v5, v6, v7, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_49

    goto :goto_4a

    :cond_49
    const/4 v4, 0x0

    :goto_4a
    iget v3, p0, Lcom/nothing/widget/ui/NtSwitch;->y:I

    iget v5, p0, Lcom/nothing/widget/ui/NtSwitch;->u:I

    sub-int/2addr v3, v5

    iget v6, p0, Lcom/nothing/widget/ui/NtSwitch;->x:I

    mul-int/lit8 v7, v6, 0x2

    sub-int/2addr v3, v7

    if-eqz v4, :cond_5c

    const/high16 v4, 0x3f800000    # 1.0f

    iget v7, p0, Lcom/nothing/widget/ui/NtSwitch;->B:F

    sub-float/2addr v4, v7

    goto :goto_5e

    :cond_5c
    iget v4, p0, Lcom/nothing/widget/ui/NtSwitch;->B:F

    :goto_5e
    int-to-float v6, v6

    add-float/2addr v2, v6

    int-to-float v3, v3

    mul-float/2addr v4, v3

    add-float/2addr v2, v4

    iget v3, p0, Lcom/nothing/widget/ui/NtSwitch;->v:I

    int-to-float v4, v3

    div-float/2addr v4, v1

    sub-float/2addr v0, v4

    iget-object v1, p0, Lcom/nothing/widget/ui/NtSwitch;->r:Landroid/graphics/drawable/GradientDrawable;

    float-to-int v4, v2

    float-to-int v6, v0

    int-to-float v5, v5

    add-float/2addr v2, v5

    float-to-int v2, v2

    int-to-float v3, v3

    add-float/2addr v0, v3

    float-to-int v0, v0

    invoke-virtual {v1, v4, v6, v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p0, p0, Lcom/nothing/widget/ui/NtSwitch;->r:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->y:I

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    iget v0, p0, Lcom/nothing/widget/ui/NtSwitch;->z:I

    iget v1, p0, Lcom/nothing/widget/ui/NtSwitch;->x:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setChecked(Z)V
    .registers 5

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtSwitch;->h()V

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v1, p0, Lcom/nothing/widget/ui/NtSwitch;->r:Landroid/graphics/drawable/GradientDrawable;

    if-eqz v1, :cond_18

    if-eqz p1, :cond_13

    iget v2, p0, Lcom/nothing/widget/ui/NtSwitch;->D:I

    goto :goto_15

    :cond_13
    iget v2, p0, Lcom/nothing/widget/ui/NtSwitch;->E:I

    :goto_15
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_18
    if-eq v0, p1, :cond_34

    iget-boolean v0, p0, Lcom/nothing/widget/ui/NtSwitch;->q:Z

    if-eqz v0, :cond_34

    invoke-direct {p0, p1}, Lcom/nothing/widget/ui/NtSwitch;->b(Z)V

    sget-object p1, Lg6/c;->f:Lg6/c$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lg6/c$a;->a(Landroid/content/Context;)Lg6/c;

    move-result-object p1

    invoke-virtual {p1}, Lg6/c;->g()V

    goto :goto_45

    :cond_34
    if-eqz p1, :cond_39

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_3a

    :cond_39
    const/4 v0, 0x0

    :goto_3a
    iput v0, p0, Lcom/nothing/widget/ui/NtSwitch;->B:F

    if-eqz p1, :cond_41

    iget p1, p0, Lcom/nothing/widget/ui/NtSwitch;->F:I

    goto :goto_43

    :cond_41
    iget p1, p0, Lcom/nothing/widget/ui/NtSwitch;->G:I

    :goto_43
    iput p1, p0, Lcom/nothing/widget/ui/NtSwitch;->H:I

    :goto_45
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/nothing/widget/ui/NtSwitch;->q:Z

    return-void
.end method

.method public setEnabled(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/nothing/widget/ui/NtSwitch;->h()V

    return-void
.end method

.method public toggle()V
    .registers 1

    invoke-super {p0}, Landroid/widget/CompoundButton;->toggle()V

    return-void
.end method
