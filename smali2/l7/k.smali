.class public abstract Ll7/k;
.super Landroidx/fragment/app/q;
.source "SourceFile"


# instance fields
.field private A:Landroid/widget/ImageButton;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Z

.field private F:Z

.field private G:Z

.field private final H:Lh8/h;

.field private final I:Ll7/k$c;

.field private final q:Ljava/lang/String;

.field private final r:F

.field private final s:J

.field private t:LH3/k;

.field private u:Lcom/google/android/material/bottomsheet/a;

.field private v:Ljava/util/List;

.field private w:Landroid/content/Intent;

.field private x:Ljava/lang/CharSequence;

.field private y:LT7/h;

.field private z:Lcom/nothing/wallpaper/widget/ToolActionsView;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    const-string v0, "CropFragment"

    iput-object v0, p0, Ll7/k;->q:Ljava/lang/String;

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, Ll7/k;->r:F

    const-wide/16 v0, 0x50

    iput-wide v0, p0, Ll7/k;->s:J

    new-instance v0, Ll7/b;

    invoke-direct {v0, p0}, Ll7/b;-><init>(Ll7/k;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ll7/k;->H:Lh8/h;

    new-instance v0, Ll7/k$c;

    invoke-direct {v0, p0}, Ll7/k$c;-><init>(Ll7/k;)V

    iput-object v0, p0, Ll7/k;->I:Ll7/k$c;

    return-void
.end method

.method private final B0()Landroid/widget/Toast;
    .registers 2

    iget-object p0, p0, Ll7/k;->H:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getValue(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/Toast;

    return-object p0
.end method

.method private static final I0(Landroid/widget/TextView;)V
    .registers 2

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final J0()V
    .registers 2

    iget-object v0, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/appcompat/app/k;->dismiss()V

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    return-void
.end method

.method private static final L0(Ll7/k;Landroid/view/View;)V
    .registers 2

    iget-object p1, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result p1

    goto :goto_a

    :cond_9
    const/4 p1, 0x0

    :goto_a
    xor-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Ll7/k;->f1(Z)V

    return-void
.end method

.method private final S0()V
    .registers 9

    iget-object v0, p0, Ll7/k;->x:Ljava/lang/CharSequence;

    if-eqz v0, :cond_a

    iget-object v0, p0, Ll7/k;->v:Ljava/util/List;

    if-nez v0, :cond_9

    goto :goto_a

    :cond_9
    return-void

    :cond_a
    :goto_a
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v3

    new-instance v5, Ll7/k$a;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Ll7/k$a;-><init>(Ll7/k;Lm8/e;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final T0()V
    .registers 9

    iget-object v0, p0, Ll7/k;->x:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1a

    iget-object v0, p0, Ll7/k;->v:Ljava/util/List;

    if-nez v0, :cond_9

    goto :goto_1a

    :cond_9
    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_19

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_19

    :cond_14
    iget-object v0, p0, Ll7/k;->v:Ljava/util/List;

    invoke-direct {p0, v0}, Ll7/k;->V0(Ljava/util/List;)V

    :cond_19
    :goto_19
    return-void

    :cond_1a
    :goto_1a
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v3

    new-instance v5, Ll7/k$b;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Ll7/k$b;-><init>(Ll7/k;Lm8/e;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final U0(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Ll7/k;->G0()Lo7/b;

    move-result-object p1

    iget-object v0, p0, Ll7/k;->w:Landroid/content/Intent;

    iget-object p0, p0, Ll7/k;->x:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, p0}, Lo7/b;->q(Landroid/content/Intent;Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final V0(Ljava/util/List;)V
    .registers 10

    invoke-virtual {p0}, Ll7/k;->M0()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_37

    :cond_7
    if-eqz p1, :cond_37

    iget-object v1, p0, Ll7/k;->y:LT7/h;

    if-eqz v1, :cond_37

    iget-object v3, p0, Ll7/k;->x:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Ll7/k;->G0()Lo7/b;

    move-result-object v0

    invoke-virtual {v0}, Lo7/b;->u()Z

    move-result v4

    invoke-virtual {p0}, Ll7/k;->G0()Lo7/b;

    move-result-object v0

    iget-object v2, p0, Ll7/k;->w:Landroid/content/Intent;

    iget-object v5, p0, Ll7/k;->x:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2, v5}, Lo7/b;->t(Landroid/content/Intent;Ljava/lang/CharSequence;)Z

    move-result v5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f08013f

    invoke-virtual {v0, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    new-instance v7, Ll7/j;

    invoke-direct {v7, p0}, Ll7/j;-><init>(Ll7/k;)V

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, LT7/h;->e(Ljava/util/List;Ljava/lang/CharSequence;ZZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    :cond_37
    :goto_37
    return-void
.end method

.method private static final W0(Ll7/k;Landroid/view/View;)V
    .registers 3

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll7/k;->U0(Landroid/view/View;)V

    return-void
.end method

.method private static final Z0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 5

    const-string v0, "v"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "windowInsets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    return-object p1
.end method

.method private final c1(Z)V
    .registers 4

    if-eqz p1, :cond_36

    iget-object p1, p0, Ll7/k;->C:Landroid/widget/TextView;

    const v0, 0x7f060086

    if-eqz p1, :cond_14

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_14
    iget-object p1, p0, Ll7/k;->D:Landroid/widget/TextView;

    if-eqz p1, :cond_23

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_23
    iget-object p1, p0, Ll7/k;->B:Landroid/widget/TextView;

    if-eqz p1, :cond_69

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f060088

    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_36
    iget-object p1, p0, Ll7/k;->C:Landroid/widget/TextView;

    const v0, 0x7f060087

    if-eqz p1, :cond_48

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_48
    iget-object p1, p0, Ll7/k;->D:Landroid/widget/TextView;

    if-eqz p1, :cond_57

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_57
    iget-object p1, p0, Ll7/k;->B:Landroid/widget/TextView;

    if-eqz p1, :cond_69

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f060089

    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_69
    return-void
.end method

.method public static synthetic d0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->Z0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method private final d1(Ljava/lang/Runnable;)V
    .registers 5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Ll7/k;->G0()Lo7/b;

    move-result-object v1

    new-instance v2, Ll7/a;

    invoke-direct {v2, p0, p1}, Ll7/a;-><init>(Ll7/k;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v0, v2}, Lo7/b;->o(Landroid/content/Context;Li3/D0$a;)V

    return-void
.end method

.method public static synthetic e0(Ll7/k;Landroid/content/DialogInterface;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->m1(Ll7/k;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final e1(Ll7/k;Ljava/lang/Runnable;Ljava/lang/CharSequence;Landroid/content/Intent;)V
    .registers 4

    iput-object p2, p0, Ll7/k;->x:Ljava/lang/CharSequence;

    iput-object p3, p0, Ll7/k;->w:Landroid/content/Intent;

    if-eqz p1, :cond_9

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_9
    return-void
.end method

.method public static synthetic f0(Ll7/k;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->j1(Ll7/k;Landroid/view/View;)V

    return-void
.end method

.method private final f1(Z)V
    .registers 2

    invoke-virtual {p0}, Ll7/k;->G0()Lo7/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo7/b;->s(Z)V

    return-void
.end method

.method public static synthetic g0(Ll7/k;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->k1(Ll7/k;Landroid/view/View;)V

    return-void
.end method

.method private final g1(Z)V
    .registers 5

    if-eqz p1, :cond_8

    iget-boolean v0, p0, Ll7/k;->E:Z

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_9

    :cond_8
    const/4 v0, 0x4

    :goto_9
    iget-object v1, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz v1, :cond_10

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_10
    iget-object v1, p0, Ll7/k;->B:Landroid/widget/TextView;

    if-eqz v1, :cond_17

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_17
    iget-object v1, p0, Ll7/k;->C:Landroid/widget/TextView;

    if-eqz v1, :cond_1e

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1e
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0700ed

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iget-object p0, p0, Ll7/k;->D:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eqz p0, :cond_37

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    goto :goto_38

    :cond_37
    move-object p0, v1

    :goto_38
    instance-of v2, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_3f

    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    :cond_3f
    if-eqz p1, :cond_46

    if-eqz v1, :cond_4c

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return-void

    :cond_46
    if-eqz v1, :cond_4c

    div-int/lit8 v0, v0, 0x2

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_4c
    return-void
.end method

.method public static synthetic h0(Ll7/k;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->L0(Ll7/k;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i0(Ll7/k;Ljava/lang/Runnable;Ljava/lang/CharSequence;Landroid/content/Intent;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Ll7/k;->e1(Ll7/k;Ljava/lang/Runnable;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    return-void
.end method

.method private static final i1(Ll7/k;Landroid/view/View;)V
    .registers 3

    iget-object p1, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_f

    invoke-direct {p0}, Ll7/k;->J0()V

    return-void

    :cond_f
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object p0

    if-eqz p0, :cond_18

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_18
    return-void
.end method

.method public static synthetic j0(Ll7/k;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->W0(Ll7/k;Landroid/view/View;)V

    return-void
.end method

.method private static final j1(Ll7/k;Landroid/view/View;)V
    .registers 3

    iget-object p1, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_f

    invoke-direct {p0}, Ll7/k;->J0()V

    return-void

    :cond_f
    invoke-direct {p0}, Ll7/k;->l1()V

    return-void
.end method

.method public static synthetic k0(Ll7/k;)Landroid/widget/Toast;
    .registers 1

    invoke-static {p0}, Ll7/k;->w0(Ll7/k;)Landroid/widget/Toast;

    move-result-object p0

    return-object p0
.end method

.method private static final k1(Ll7/k;Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Ll7/k;->G0()Lo7/b;

    move-result-object p1

    invoke-virtual {p1}, Lo7/b;->h()Landroidx/lifecycle/C;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/C;->e()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lm7/a$a;->a:Lm7/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-direct {p0}, Ll7/k;->B0()Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_1c
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type com.nothing.wallpaper.picker.edit.container.WallpaperEditNavigator"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lj7/o;

    invoke-interface {p0}, Lj7/o;->E()V

    return-void
.end method

.method public static synthetic l0(Ll7/k;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ll7/k;->i1(Ll7/k;Landroid/view/View;)V

    return-void
.end method

.method private final l1()V
    .registers 6

    iget-object v0, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-ne v0, v1, :cond_c

    return-void

    :cond_c
    new-instance v0, Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f14012b

    invoke-direct {v0, v2, v3}, Lcom/google/android/material/bottomsheet/a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    new-instance v0, LT7/h;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "requireContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, LT7/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll7/k;->y:LT7/h;

    invoke-direct {p0}, Ll7/k;->T0()V

    iget-object v2, p0, Ll7/k;->u:Lcom/google/android/material/bottomsheet/a;

    if-eqz v2, :cond_4b

    invoke-virtual {v2}, Lb/q;->f()Lb/v;

    move-result-object v3

    iget-object v4, p0, Ll7/k;->I:Ll7/k$c;

    invoke-virtual {v3, v4}, Lb/v;->i(Lb/u;)V

    new-instance v3, Ll7/i;

    invoke-direct {v3, p0}, Ll7/i;-><init>(Ll7/k;)V

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v2, v1}, Lcom/google/android/material/bottomsheet/a;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/a;->setContentView(Landroid/view/View;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    :cond_4b
    return-void
.end method

.method public static synthetic m0(Landroid/widget/TextView;)V
    .registers 1

    invoke-static {p0}, Ll7/k;->I0(Landroid/widget/TextView;)V

    return-void
.end method

.method private static final m1(Ll7/k;Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, Ll7/k;->I:Ll7/k$c;

    invoke-virtual {p0}, Lb/u;->h()V

    return-void
.end method

.method public static final synthetic n0(Ll7/k;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Ll7/k;->v:Ljava/util/List;

    return-object p0
.end method

.method private final n1(Z)V
    .registers 5

    iget-object v0, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_8
    iget-object v0, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    :cond_f
    iget-object v0, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2f

    if-eqz p1, :cond_21

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0604f0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    goto :goto_2c

    :cond_21
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0604f1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    :goto_2c
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_2f
    iget-object v0, p0, Ll7/k;->B:Landroid/widget/TextView;

    if-eqz v0, :cond_4f

    if-eqz p1, :cond_41

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const p1, 0x7f130236

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_4c

    :cond_41
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const p1, 0x7f130235

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    :goto_4c
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4f
    return-void
.end method

.method public static final synthetic o0(Ll7/k;)Landroid/widget/Toast;
    .registers 1

    invoke-direct {p0}, Ll7/k;->B0()Landroid/widget/Toast;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p0(Ll7/k;)V
    .registers 1

    invoke-direct {p0}, Ll7/k;->J0()V

    return-void
.end method

.method public static final synthetic q0(Ll7/k;Ljava/util/List;)V
    .registers 2

    invoke-direct {p0, p1}, Ll7/k;->V0(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic r0(Ll7/k;Ljava/util/List;)V
    .registers 2

    iput-object p1, p0, Ll7/k;->v:Ljava/util/List;

    return-void
.end method

.method public static final synthetic s0(Ll7/k;Z)V
    .registers 2

    invoke-direct {p0, p1}, Ll7/k;->c1(Z)V

    return-void
.end method

.method public static final synthetic t0(Ll7/k;Ljava/lang/Runnable;)V
    .registers 2

    invoke-direct {p0, p1}, Ll7/k;->d1(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final synthetic u0(Ll7/k;Z)V
    .registers 2

    invoke-direct {p0, p1}, Ll7/k;->g1(Z)V

    return-void
.end method

.method public static final synthetic v0(Ll7/k;Z)V
    .registers 2

    invoke-direct {p0, p1}, Ll7/k;->n1(Z)V

    return-void
.end method

.method private static final w0(Ll7/k;)Landroid/widget/Toast;
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f130217

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected final A0()LH3/k;
    .registers 1

    iget-object p0, p0, Ll7/k;->t:LH3/k;

    return-object p0
.end method

.method protected final C0()Lcom/nothing/wallpaper/widget/ToolActionsView;
    .registers 1

    iget-object p0, p0, Ll7/k;->z:Lcom/nothing/wallpaper/widget/ToolActionsView;

    return-object p0
.end method

.method protected final D0()Landroid/widget/TextView;
    .registers 1

    iget-object p0, p0, Ll7/k;->D:Landroid/widget/TextView;

    return-object p0
.end method

.method protected final E0()Landroid/widget/TextView;
    .registers 1

    iget-object p0, p0, Ll7/k;->B:Landroid/widget/TextView;

    return-object p0
.end method

.method protected final F0()Landroid/widget/TextView;
    .registers 1

    iget-object p0, p0, Ll7/k;->C:Landroid/widget/TextView;

    return-object p0
.end method

.method protected abstract G0()Lo7/b;
.end method

.method protected final H0()V
    .registers 4

    iget-object p0, p0, Ll7/k;->D:Landroid/widget/TextView;

    if-eqz p0, :cond_1b

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Ll7/d;

    invoke-direct {v1, p0}, Ll7/d;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_1b
    return-void
.end method

.method protected K0(Landroid/view/View;)V
    .registers 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a04c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/widget/ToolActionsView;

    iput-object v0, p0, Ll7/k;->z:Lcom/nothing/wallpaper/widget/ToolActionsView;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ll7/k;->h1(Lcom/nothing/wallpaper/widget/ToolActionsView;)V

    const v0, 0x7f0a04e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll7/k;->D:Landroid/widget/TextView;

    const v0, 0x7f0a00d3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    const v0, 0x7f0a04f7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll7/k;->B:Landroid/widget/TextView;

    const v0, 0x7f0a04f8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll7/k;->C:Landroid/widget/TextView;

    iget-object p1, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz p1, :cond_4a

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_4a
    iget-object p1, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    if-eqz p1, :cond_56

    new-instance v0, Ll7/e;

    invoke-direct {v0, p0}, Ll7/e;-><init>(Ll7/k;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_56
    return-void
.end method

.method protected final M0()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-eqz p0, :cond_13

    goto :goto_15

    :cond_13
    const/4 p0, 0x0

    return p0

    :cond_15
    :goto_15
    const/4 p0, 0x1

    return p0
.end method

.method protected final N0()Z
    .registers 1

    iget-boolean p0, p0, Ll7/k;->G:Z

    return p0
.end method

.method protected final O0()Z
    .registers 1

    iget-boolean p0, p0, Ll7/k;->E:Z

    return p0
.end method

.method protected final P0()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_10

    return v0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method protected final Q0()Z
    .registers 1

    iget-boolean p0, p0, Ll7/k;->F:Z

    return p0
.end method

.method protected final R0()Z
    .registers 1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LH3/a;->j(Landroid/content/Context;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method protected final X0(Z)V
    .registers 2

    iput-boolean p1, p0, Ll7/k;->E:Z

    return-void
.end method

.method protected final Y0()V
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    new-instance v0, Ll7/c;

    invoke-direct {v0}, Ll7/c;-><init>()V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void
.end method

.method public final a1(Z)V
    .registers 3

    const/16 v0, 0x8

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    move-result-object p0

    if-eqz p0, :cond_30

    const/4 p1, 0x0

    invoke-interface {p0, p1, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    return-void

    :cond_1b
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    move-result-object p0

    if-eqz p0, :cond_30

    invoke-interface {p0, v0, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    :cond_30
    return-void
.end method

.method protected final b1(Z)V
    .registers 2

    iput-boolean p1, p0, Ll7/k;->F:Z

    return-void
.end method

.method protected h1(Lcom/nothing/wallpaper/widget/ToolActionsView;)V
    .registers 5

    const-string v0, "actionBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll7/k;->R0()Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v0, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->q:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    sget-object v1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->r:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    sget-object v2, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->s:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    filled-new-array {v0, v1, v2}, [Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/nothing/wallpaper/widget/ToolActionsView;->i([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V

    goto :goto_24

    :cond_19
    sget-object v0, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->r:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    sget-object v1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->s:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    filled-new-array {v0, v1}, [Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/nothing/wallpaper/widget/ToolActionsView;->i([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V

    :goto_24
    sget-object v0, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->q:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    new-instance v1, Ll7/f;

    invoke-direct {v1, p0}, Ll7/f;-><init>(Ll7/k;)V

    invoke-virtual {p1, v0, v1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->f(Lcom/nothing/wallpaper/widget/ToolActionsView$a;Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->r:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    new-instance v1, Ll7/g;

    invoke-direct {v1, p0}, Ll7/g;-><init>(Ll7/k;)V

    invoke-virtual {p1, v0, v1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->f(Lcom/nothing/wallpaper/widget/ToolActionsView$a;Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->s:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    new-instance v1, Ll7/h;

    invoke-direct {v1, p0}, Ll7/h;-><init>(Ll7/k;)V

    invoke-virtual {p1, v0, v1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->f(Lcom/nothing/wallpaper/widget/ToolActionsView$a;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "is_asset_id_present"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll7/k;->G:Z

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    const-string v1, "requireActivity(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lh3/H;->e(Landroid/content/Context;)LH3/k;

    move-result-object p1

    iput-object p1, p0, Ll7/k;->t:LH3/k;

    return-void
.end method

.method public onDestroyView()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll7/k;->y:LT7/h;

    iput-object v0, p0, Ll7/k;->z:Lcom/nothing/wallpaper/widget/ToolActionsView;

    iput-object v0, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    iput-object v0, p0, Ll7/k;->B:Landroid/widget/TextView;

    iput-object v0, p0, Ll7/k;->C:Landroid/widget/TextView;

    iput-object v0, p0, Ll7/k;->D:Landroid/widget/TextView;

    return-void
.end method

.method public onResume()V
    .registers 3

    invoke-super {p0}, Landroidx/fragment/app/q;->onResume()V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string v1, "requireActivity(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p0}, Lh3/H;->f(Landroid/content/Context;)Lh3/W;

    move-result-object p0

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lh3/W;->j(J)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 9

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/q;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/MemoryCategory;->LOW:Lcom/bumptech/glide/MemoryCategory;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/Glide;->setMemoryCategory(Lcom/bumptech/glide/MemoryCategory;)Lcom/bumptech/glide/MemoryCategory;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v3, Ll7/k$d;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Ll7/k$d;-><init>(Ll7/k;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-direct {p0}, Ll7/k;->S0()V

    return-void
.end method

.method protected final x0()J
    .registers 3

    iget-wide v0, p0, Ll7/k;->s:J

    return-wide v0
.end method

.method protected final y0()Landroid/widget/ImageButton;
    .registers 1

    iget-object p0, p0, Ll7/k;->A:Landroid/widget/ImageButton;

    return-object p0
.end method

.method protected final z0()F
    .registers 1

    iget p0, p0, Ll7/k;->r:F

    return p0
.end method
