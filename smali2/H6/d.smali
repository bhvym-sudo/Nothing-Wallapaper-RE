.class public abstract LH6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroid/graphics/drawable/RippleDrawable;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 3

    invoke-static {p0, p1, p2}, LH6/d;->g(Landroid/graphics/drawable/RippleDrawable;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroid/view/View;Landroid/view/View;)Landroid/graphics/PointF;
    .registers 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    if-eqz v0, :cond_2b

    if-nez v1, :cond_1f

    goto :goto_2b

    :cond_1f
    new-instance v3, Landroid/graphics/PointF;

    int-to-float v2, v2

    int-to-float v0, v0

    div-float/2addr v2, v0

    int-to-float p1, p1

    int-to-float v0, v1

    div-float/2addr p1, v0

    invoke-direct {v3, v2, p1}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_32

    :cond_2b
    :goto_2b
    new-instance v3, Landroid/graphics/PointF;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-direct {v3, p1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    :goto_32
    iget p1, v3, Landroid/graphics/PointF;->x:F

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    iget p1, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    return-object v3
.end method

.method public static final c(Landroid/view/View;)Z
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->isLayoutDirectionResolved()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_15

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p0

    if-ne p0, v2, :cond_14

    return v2

    :cond_14
    return v1

    :cond_15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "getContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LH6/a;->a(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result p0

    if-ne p0, v2, :cond_29

    return v2

    :cond_29
    return v1
.end method

.method public static final d(Landroid/view/View;Landroid/view/View;)V
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH6/d$a;

    invoke-direct {v0, p0, p0, p1}, LH6/d$a;-><init>(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    invoke-static {p0, v0}, Landroidx/core/view/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/y;

    return-void
.end method

.method public static final e(Landroid/view/View;Z)V
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_26

    check-cast p0, Landroid/view/ViewGroup;

    invoke-static {p0}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object p0

    invoke-interface {p0}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, LH6/d;->e(Landroid/view/View;Z)V

    goto :goto_16

    :cond_26
    return-void
.end method

.method public static final f(Landroid/view/View;)V
    .registers 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-eqz v1, :cond_11

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_12

    :cond_11
    move-object v0, v2

    :goto_12
    if-nez v0, :cond_15

    goto :goto_49

    :cond_15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    const/4 v4, 0x1

    const v5, 0x101030e

    invoke-virtual {v1, v5, v3, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v3, v3, Landroid/util/TypedValue;->resourceId:I

    filled-new-array {v5}, [I

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v3, "obtainStyledAttributes(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    instance-of v4, v3, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v4, :cond_44

    move-object v2, v3

    check-cast v2, Landroid/graphics/drawable/RippleDrawable;

    :cond_44
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v2, :cond_4a

    :goto_49
    return-void

    :cond_4a
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, LH6/c;

    invoke-direct {v0, v2}, LH6/c;-><init>(Landroid/graphics/drawable/RippleDrawable;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private static final g(Landroid/graphics/drawable/RippleDrawable;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 6

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_18

    if-eq v0, v2, :cond_e

    const/4 v2, 0x3

    if-eq v0, v2, :cond_e

    goto :goto_21

    :cond_e
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1, p0, p2, v1}, LH6/d;->h(Landroid/view/View;Landroid/graphics/drawable/RippleDrawable;Landroid/view/MotionEvent;Z)V

    goto :goto_21

    :cond_18
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1, p0, p2, v2}, LH6/d;->h(Landroid/view/View;Landroid/graphics/drawable/RippleDrawable;Landroid/view/MotionEvent;Z)V

    :goto_21
    return v1
.end method

.method private static final h(Landroid/view/View;Landroid/graphics/drawable/RippleDrawable;Landroid/view/MotionEvent;Z)V
    .registers 6

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result p0

    int-to-float p0, p0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    add-float/2addr p0, p2

    const/4 p2, 0x0

    if-eqz p3, :cond_29

    invoke-virtual {p1, v0, p0}, Landroid/graphics/drawable/RippleDrawable;->setHotspot(FF)V

    const/4 p0, 0x2

    new-array p0, p0, [I

    const p3, 0x10100a7

    aput p3, p0, p2

    const/4 p2, 0x1

    const p3, 0x101009e

    aput p3, p0, p2

    goto :goto_2b

    :cond_29
    new-array p0, p2, [I

    :goto_2b
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    return-void
.end method
