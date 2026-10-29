.class public final LH7/d;
.super Landroid/content/ContextWrapper;
.source "SourceFile"

# interfaces
.implements Lcom/android/launcher3/views/f;
.implements Lcom/android/launcher3/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH7/d$a;,
        LH7/d$b;
    }
.end annotation


# instance fields
.field private final q:LK6/c;

.field private final r:Le3/I;

.field private final s:Lh8/h;

.field private final t:LH7/d$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .registers 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK6/c;

    iput-object v0, p0, LH7/d;->q:LK6/c;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Le3/I;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/I;

    move-result-object v0

    const-string v1, "inflate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LH7/d;->r:Le3/I;

    new-instance v1, LH7/a;

    invoke-direct {v1, p1}, LH7/a;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, LH7/d;->s:Lh8/h;

    new-instance v1, LH7/d$a;

    invoke-direct {p0}, LH7/d;->m()Lcom/nothing/launcher/card/u;

    move-result-object v3

    invoke-direct {v1, v3}, LH7/d$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Lcom/nothing/cardhost/f;->z(Landroid/content/Context;)V

    iput-object v1, p0, LH7/d;->t:LH7/d$a;

    invoke-virtual {p0}, LH7/d;->K()Lcom/android/launcher3/f;

    move-result-object v1

    iget v1, v1, Lcom/android/launcher3/f;->h:I

    invoke-virtual {p0}, LH7/d;->K()Lcom/android/launcher3/f;

    move-result-object v3

    iget v3, v3, Lcom/android/launcher3/f;->i:I

    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v4

    const-string v5, "getRootView(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->isLaidOut()Z

    move-result v5

    if-eqz v5, :cond_ae

    invoke-virtual {v4}, Landroid/view/View;->isLayoutRequested()Z

    move-result v5

    if-nez v5, :cond_ae

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    invoke-static {p0}, LH7/d;->e(LH7/d;)Le3/I;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0, v6, v1, v3}, LH7/d;->f(LH7/d;Landroid/view/View;II)V

    if-lez v4, :cond_81

    int-to-float v1, v4

    int-to-float v3, v3

    div-float/2addr v1, v3

    goto :goto_85

    :cond_81
    int-to-float v3, v5

    int-to-float v1, v1

    div-float v1, v3, v1

    :goto_85
    invoke-virtual {v6, v1}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setScaleY(F)V

    invoke-static {p0}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_98

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    goto :goto_99

    :cond_98
    move v1, v3

    :goto_99
    invoke-virtual {v6, v1}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {v6, v3}, Landroid/view/View;->setPivotY(F)V

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {p2, v6, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    goto :goto_b6

    :cond_ae
    new-instance v5, LH7/d$c;

    invoke-direct {v5, p2, p0, v1, v3}, LH7/d$c;-><init>(Landroid/view/ViewGroup;LH7/d;II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_b6
    iget-object p2, v0, Le3/I;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    const-string v1, "clockHostView"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_107

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, LH7/d;->K()Lcom/android/launcher3/f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/launcher3/f;->j()I

    move-result v3

    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, v0, Le3/I;->z:Lcom/android/launcher3/Workspace;

    invoke-virtual {p2, v2}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/launcher3/CellLayout;->getAnimBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object p2, v0, Le3/I;->x:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    sget-object v0, LF2/F;->t:LF2/F$a;

    invoke-virtual {v0, p1}, LF2/F$a;->a(Landroid/content/Context;)LF2/F;

    move-result-object v0

    invoke-virtual {v0}, LF2/F;->Y()Z

    move-result v0

    if-eqz v0, :cond_f5

    const v0, 0x106001d

    goto :goto_f8

    :cond_f5
    const v0, 0x1060028

    :goto_f8
    invoke-static {p1, v0}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    invoke-virtual {p0}, LH7/d;->K()Lcom/android/launcher3/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/launcher3/f;->d(Lcom/android/launcher3/l;)V

    return-void

    :cond_107
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic a(Landroid/content/Context;)Lcom/nothing/launcher/card/u;
    .registers 1

    invoke-static {p0}, LH7/d;->v(Landroid/content/Context;)Lcom/nothing/launcher/card/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/view/View;)Lh8/o;
    .registers 1

    invoke-static {p0}, LH7/d;->l(Landroid/view/View;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Lh8/o;)Z
    .registers 2

    invoke-static {p0, p1}, LH7/d;->j(Ljava/util/List;Lh8/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic e(LH7/d;)Le3/I;
    .registers 1

    iget-object p0, p0, LH7/d;->r:Le3/I;

    return-object p0
.end method

.method public static final synthetic f(LH7/d;Landroid/view/View;II)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LH7/d;->q(Landroid/view/View;II)V

    return-void
.end method

.method private static final j(Ljava/util/List;Lh8/o;)Z
    .registers 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/launcher/card/t;

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_1c

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    return v1

    :cond_1c
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_20
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-virtual {v0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-virtual {v0}, Lcom/nothing/launcher/card/t;->m()I

    move-result v0

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v2

    if-ne v0, v2, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_3e
    return v1
.end method

.method private static final l(Landroid/view/View;)Lh8/o;
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-static {p0, v0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method private final m()Lcom/nothing/launcher/card/u;
    .registers 1

    iget-object p0, p0, LH7/d;->s:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/u;

    return-object p0
.end method

.method private final n(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/t;)Landroid/view/View;
    .registers 11

    iget-object v0, p0, LH7/d;->t:LH7/d$a;

    invoke-virtual {p2}, Lcom/nothing/launcher/card/t;->m()I

    move-result v2

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v0 .. v7}, Lcom/nothing/cardhost/f;->C(Lcom/nothing/cardhost/f;Landroid/content/Context;ILF5/m;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/nothing/cardhost/g;

    move-result-object p0

    invoke-direct {v1, p0, p2}, LH7/d;->r(Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/t;)V

    return-object p0
.end method

.method private final q(Landroid/view/View;II)V
    .registers 5

    const/high16 p0, 0x40000000    # 2.0f

    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-static {p3, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    invoke-virtual {p1, v0, p0}, Landroid/view/View;->measure(II)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0, p0, p2, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private final r(Lcom/nothing/cardhost/g;Lcom/nothing/launcher/card/t;)V
    .registers 3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p2, p0, p1}, Lcom/nothing/launcher/card/t;->q(Landroid/content/Context;Lcom/nothing/cardhost/g;)V

    return-void
.end method

.method private static final v(Landroid/content/Context;)Lcom/nothing/launcher/card/u;
    .registers 2

    new-instance v0, Lcom/nothing/launcher/card/u;

    invoke-direct {v0, p0}, Lcom/nothing/launcher/card/u;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public J()Lcom/android/launcher3/dragndrop/DragLayer;
    .registers 2

    iget-object p0, p0, LH7/d;->r:Le3/I;

    iget-object p0, p0, Le3/I;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/graphics/LockScreenPreviewLayout;

    const-string v0, "dragLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public K()Lcom/android/launcher3/f;
    .registers 2

    iget-object v0, p0, LH7/d;->q:LK6/c;

    invoke-virtual {v0, p0}, LK6/c;->J0(Landroid/content/Context;)Lcom/android/launcher3/f;

    move-result-object p0

    return-object p0
.end method

.method public M()Lcom/android/launcher3/Workspace;
    .registers 2

    iget-object p0, p0, LH7/d;->r:Le3/I;

    iget-object p0, p0, Le3/I;->z:Lcom/android/launcher3/Workspace;

    const-string v0, "workspace"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public R()Lcom/nothing/launcher/card/p;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public b(Z)V
    .registers 3

    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/android/launcher3/Workspace;->V(Ljava/lang/Boolean;)V

    iget-object p0, p0, LH7/d;->r:Le3/I;

    iget-object p0, p0, Le3/I;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->b(Z)V

    return-void
.end method

.method public destroy()V
    .registers 2

    invoke-super {p0}, Landroid/content/ContextWrapper;->destroy()V

    invoke-virtual {p0}, LH7/d;->K()Lcom/android/launcher3/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/f;->r(Lcom/android/launcher3/l;)V

    iget-object p0, p0, LH7/d;->t:LH7/d$a;

    invoke-virtual {p0}, Lcom/nothing/cardhost/f;->r0()V

    return-void
.end method

.method public final g(Ljava/util/List;)V
    .registers 11

    const-string v0, "infoList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/launcher3/Workspace;->B()V

    return-void

    :cond_13
    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/launcher3/Workspace;->getAllChildren()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4b

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_27
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/launcher/card/j;

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-direct {p0, v1, v0}, LH7/d;->n(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/t;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object v2

    invoke-interface {v2, v1, v0}, Lcom/android/launcher3/E;->e(Landroid/view/View;LC2/b;)V

    goto :goto_27

    :cond_4b
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Li8/s;->K(Ljava/lang/Iterable;)LD8/h;

    move-result-object v1

    new-instance v2, LH7/b;

    invoke-direct {v2}, LH7/b;-><init>()V

    invoke-static {v1, v2}, LD8/k;->x(LD8/h;Lv8/l;)LD8/h;

    move-result-object v1

    new-instance v2, LH7/c;

    invoke-direct {v2, p1}, LH7/c;-><init>(Ljava/util/List;)V

    invoke-static {v1, v2}, LD8/k;->p(LD8/h;Lv8/l;)LD8/h;

    move-result-object v1

    invoke-interface {v1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_84

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/launcher3/Workspace;->Y(Landroid/view/View;)V

    goto :goto_6a

    :cond_84
    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo"

    if-eqz v2, :cond_db

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lh8/o;

    invoke-virtual {v4}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nothing/launcher/card/t;

    instance-of v5, v0, Ljava/util/Collection;

    if-eqz v5, :cond_b2

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_b2

    goto :goto_d7

    :cond_b2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lcom/nothing/launcher/card/t;

    invoke-virtual {v7, v4}, Lcom/nothing/launcher/card/t;->o(Lcom/nothing/launcher/card/t;)Z

    move-result v7

    if-eqz v7, :cond_d4

    invoke-virtual {v6, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_d4
    if-eqz v7, :cond_b6

    goto :goto_8f

    :cond_d7
    :goto_d7
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8f

    :cond_db
    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_ea
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_148

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nothing/launcher/card/j;

    invoke-virtual {v2}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/t;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_106
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_127

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lcom/nothing/launcher/card/t;

    invoke-virtual {v7}, Lcom/nothing/launcher/card/t;->m()I

    move-result v7

    invoke-virtual {v2}, Lcom/nothing/launcher/card/t;->m()I

    move-result v8

    if-ne v7, v8, :cond_106

    goto :goto_128

    :cond_127
    const/4 v6, 0x0

    :goto_128
    check-cast v6, Landroid/view/View;

    if-eqz v6, :cond_13c

    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/android/launcher3/Workspace;->Y(Landroid/view/View;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-static {v6, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v5

    if-nez v5, :cond_144

    :cond_13c
    invoke-direct {p0, v4, v2}, LH7/d;->n(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/t;)Landroid/view/View;

    move-result-object v4

    invoke-static {v4, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v5

    :cond_144
    invoke-interface {p1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_ea

    :cond_148
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_14c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-virtual {p0}, LH7/d;->M()Lcom/android/launcher3/Workspace;

    move-result-object v2

    invoke-interface {v2, v1, v0}, Lcom/android/launcher3/E;->e(Landroid/view/View;LC2/b;)V

    goto :goto_14c

    :cond_16c
    return-void
.end method

.method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .registers 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layout_inflater"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    return-object p0

    :cond_1a
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final t(Ljava/util/List;)V
    .registers 3

    const-string v0, "shortcuts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LH7/d;->r:Le3/I;

    iget-object p0, p0, Le3/I;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setShortcuts(Ljava/util/List;)V

    return-void
.end method

.method public final u(LS1/a;Ljava/lang/String;)V
    .registers 4

    const-string v0, "clockViewFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LH7/d;->r:Le3/I;

    iget-object p0, p0, Le3/I;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->v(LS1/a;Ljava/lang/String;)V

    return-void
.end method

.method public x()[LF2/w;
    .registers 1

    const/4 p0, 0x0

    new-array p0, p0, [LF2/w;

    return-object p0
.end method
