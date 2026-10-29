.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private final q:Lcom/android/launcher3/views/f;

.field private final r:Lcom/android/launcher3/f;

.field private final s:Lh8/h;


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/android/launcher3/views/f;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->q:Lcom/android/launcher3/views/f;

    .line 5
    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->r:Lcom/android/launcher3/f;

    .line 6
    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/a;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->s:Lh8/h;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 7
    invoke-static {p0, p1, p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;LN1/a;ILjava/lang/Object;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;)I

    move-result p0

    return p0
.end method

.method private final b(LN1/a;)F
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->r:Lcom/android/launcher3/f;

    iget v1, v0, Lcom/android/launcher3/f;->L:I

    int-to-float v1, v1

    iget-boolean v2, v0, Lcom/android/launcher3/f;->e0:Z

    if-eqz v2, :cond_b

    const/4 v0, 0x0

    goto :goto_16

    :cond_b
    invoke-virtual {v0}, Lcom/android/launcher3/f;->m()I

    move-result v0

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->r:Lcom/android/launcher3/f;

    invoke-virtual {v2}, Lcom/android/launcher3/f;->n()I

    move-result v2

    sub-int/2addr v0, v2

    :goto_16
    sget-object v2, LN1/a;->r:LN1/a;

    if-ne p1, v2, :cond_25

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->r:Lcom/android/launcher3/f;

    iget-boolean p1, p1, Lcom/android/launcher3/f;->e0:Z

    if-nez p1, :cond_25

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->getFixedGap()I

    move-result p0

    add-int/2addr v0, p0

    :cond_25
    int-to-float p0, v0

    sub-float/2addr v1, p0

    return v1
.end method

.method private static final c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;)I
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->r:Lcom/android/launcher3/f;

    iget v0, p0, Lcom/android/launcher3/f;->n:I

    iget p0, p0, Lcom/android/launcher3/f;->o:I

    sub-int/2addr v0, p0

    return v0
.end method

.method public static synthetic e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;LN1/a;ILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->d(LN1/a;)V

    return-void
.end method

.method private final getFixedGap()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->s:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final d(LN1/a;)V
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->b(LN1/a;)F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final f(Z)V
    .registers 4

    const/4 v0, 0x1

    if-eqz p1, :cond_5

    const/4 v1, 0x2

    goto :goto_6

    :cond_5
    move v1, v0

    :goto_6
    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    xor-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 3

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->r:Lcom/android/launcher3/f;

    iget-object p1, p1, Lcom/android/launcher3/f;->J:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->Q()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method
