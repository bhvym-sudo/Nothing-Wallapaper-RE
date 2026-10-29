.class public final Lg7/k;
.super Li3/o;
.source "SourceFile"

# interfaces
.implements Le7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/k$a;
    }
.end annotation


# static fields
.field public static final O:Lg7/k$a;


# instance fields
.field private final C:Ljava/lang/String;

.field private D:Landroid/os/Bundle;

.field private E:Landroidx/viewpager2/widget/ViewPager2;

.field private F:Lc7/a;

.field private G:Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

.field private H:Z

.field private I:[Landroid/view/View;

.field private J:Lcom/google/android/material/tabs/d;

.field private K:Ly7/o;

.field private final L:Lh8/h;

.field private final M:Lh8/h;

.field private N:Landroid/animation/Animator;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lg7/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg7/k$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lg7/k;->O:Lg7/k$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 6

    invoke-direct {p0}, Li3/o;-><init>()V

    const-string v0, "NTCustomizationPickerFragment"

    iput-object v0, p0, Lg7/k;->C:Ljava/lang/String;

    const-class v0, LJ7/b;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Lg7/k$g;

    invoke-direct {v1, p0}, Lg7/k$g;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Lg7/k$h;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Lg7/k$h;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v4, Lg7/k$i;

    invoke-direct {v4, p0}, Lg7/k$i;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lg7/k;->L:Lh8/h;

    const-class v0, Li7/d;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Lg7/k$j;

    invoke-direct {v1, p0}, Lg7/k$j;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Lg7/k$k;

    invoke-direct {v2, v3, p0}, Lg7/k$k;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, Lg7/k$l;

    invoke-direct {v3, p0}, Lg7/k$l;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lg7/k;->M:Lh8/h;

    return-void
.end method

.method private static final A1(Lg3/f;)Z
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0}, LJ6/d;->d(Lg3/f;)Z

    move-result p0

    return p0
.end method

.method private static final B1(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final C1()LJ7/b;
    .registers 1

    iget-object p0, p0, Lg7/k;->L:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/b;

    return-object p0
.end method

.method private final E1()V
    .registers 10

    iget-object v0, p0, Lg7/k;->K:Ly7/o;

    if-nez v0, :cond_8e

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->C()Ld3/a;

    move-result-object v0

    invoke-virtual {v0}, Ld3/a;->s()Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_8e

    :cond_14
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, LH3/a;->b(Landroid/content/Intent;)Z

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getChildFragmentManager()Landroidx/fragment/app/J;

    move-result-object v1

    const v2, 0x7f0a0545

    invoke-virtual {v1, v2}, Landroidx/fragment/app/J;->j0(I)Landroidx/fragment/app/q;

    move-result-object v1

    instance-of v3, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 v4, 0x0

    if-eqz v3, :cond_34

    move-object v3, v1

    check-cast v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    goto :goto_35

    :cond_34
    move-object v3, v4

    :goto_35
    const/4 v5, 0x1

    if-nez v3, :cond_4b

    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->p0:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-static {v6}, LH3/a;->k(Landroid/content/Intent;)Z

    move-result v6

    xor-int/2addr v6, v5

    invoke-virtual {v3, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;->a(Z)Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object v3

    :cond_4b
    new-instance v6, Ly7/o;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireView()Landroid/view/View;

    move-result-object v7

    const-string v8, "requireView(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg7/k;->C1()LJ7/b;

    move-result-object v8

    invoke-direct {v6, v7, v3, v8}, Ly7/o;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LJ7/b;)V

    iput-object v6, p0, Lg7/k;->K:Ly7/o;

    invoke-virtual {v6}, Ly7/o;->f()V

    if-nez v1, :cond_8e

    if-eqz v0, :cond_78

    iget-object v0, p0, Lg7/k;->K:Ly7/o;

    if-eqz v0, :cond_6f

    const/4 v1, 0x0

    const/4 v6, 0x2

    invoke-static {v0, v1, v4, v6, v4}, Ly7/o;->i(Ly7/o;ZLv8/a;ILjava/lang/Object;)V

    :cond_6f
    invoke-direct {p0}, Lg7/k;->C1()LJ7/b;

    move-result-object v0

    const-string v1, "lock_screen_preview"

    invoke-virtual {v0, v1, v5}, LJ7/b;->n(Ljava/lang/String;Z)V

    :cond_78
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getChildFragmentManager()Landroidx/fragment/app/J;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/S;->r(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/S;->i()I

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getChildFragmentManager()Landroidx/fragment/app/J;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/J;->g0()Z

    :cond_8e
    :goto_8e
    return-void
.end method

.method private final F1(Landroid/view/View;)V
    .registers 5

    const v0, 0x7f0a0363

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v0, :cond_3f

    new-instance v1, Lcom/google/android/material/tabs/d;

    new-instance v2, Lg7/e;

    invoke-direct {v2}, Lg7/e;-><init>()V

    invoke-direct {v1, p1, v0, v2}, Lcom/google/android/material/tabs/d;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/d$b;)V

    invoke-virtual {v1}, Lcom/google/android/material/tabs/d;->a()V

    iput-object v1, p0, Lg7/k;->J:Lcom/google/android/material/tabs/d;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-eqz v0, :cond_3c

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v2, 0x7f070482

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    mul-int/2addr p0, v0

    iput p0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_3c
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->r()V

    :cond_3f
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 p0, 0x0

    invoke-static {p1, p0}, LH6/d;->e(Landroid/view/View;Z)V

    return-void
.end method

.method private static final G1(Lcom/google/android/material/tabs/TabLayout$f;I)V
    .registers 2

    const-string p1, "<unused var>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private final H1(Landroid/view/View;)V
    .registers 9

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LH3/a;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3e

    invoke-static {}, Lcom/android/launcher3/w;->f()Z

    move-result v0

    if-nez v0, :cond_3e

    const v0, 0x7f0f0006

    invoke-super {p0, v0}, Lcom/android/wallpaper/picker/a;->s0(I)V

    invoke-direct {p0}, Lg7/k;->t1()Li7/a;

    move-result-object v4

    if-eqz v4, :cond_3e

    sget-object v1, Ld7/l;->a:Ld7/l;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string p1, "getContext(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/android/wallpaper/picker/a;->t:Landroid/widget/Toolbar;

    const-string p1, "mToolbar"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg7/k;->u1()Li7/d;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v6

    const-string p0, "getViewLifecycleOwner(...)"

    invoke-static {v6, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {v1 .. v6}, Ld7/l;->i(Landroid/content/Context;Landroid/widget/Toolbar;Lx3/b;Li7/d;Landroidx/lifecycle/x;)V

    :cond_3e
    return-void
.end method

.method private final I1(Landroid/view/View;)V
    .registers 4

    const v0, 0x7f0a0388

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

    iput-object p1, p0, Lg7/k;->G:Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lg7/k;->w1(Z)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ld7/m;->a(Landroid/view/ViewGroup;Ljava/util/List;)V

    iget-object p1, p0, Lg7/k;->G:Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg7/k;->w1(Z)Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Ld7/m;->a(Landroid/view/ViewGroup;Ljava/util/List;)V

    iget-object p1, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz p1, :cond_37

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_37

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lg7/k$c;

    invoke-direct {v0, p0}, Lg7/k$c;-><init>(Lg7/k;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;)V

    :cond_37
    return-void
.end method

.method private final J1(Landroid/view/View;)V
    .registers 5

    invoke-virtual {p0}, Lg7/k;->s1()Lg3/f;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lg3/f;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    if-eqz v0, :cond_29

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p0}, Lg3/f;->c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_29

    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_29
    return-void
.end method

.method private final K1(Landroid/view/View;)V
    .registers 6

    const v0, 0x7f0a0441

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "requireViewById(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/Space;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v1

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object v1

    const-string v2, "getCurrentWindowMetrics(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/WindowMetrics;->getDensity()F

    move-result v1

    const v2, 0x407dcbbc

    sub-float/2addr v2, v1

    const v3, 0x426c386c

    div-float/2addr v2, v3

    const/high16 v3, 0x40280000    # 2.625f

    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->matchConstraintPercentHeight:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p0, p0, Lg7/k;->C:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "initViewLayoutParams: current density="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", percent="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final L1(Landroid/view/View;)V
    .registers 9

    new-instance v0, Lc7/a;

    invoke-direct {v0, p0}, Lc7/a;-><init>(Lg7/k;)V

    iput-object v0, p0, Lg7/k;->F:Lc7/a;

    const v0, 0x7f0a03e1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    if-eqz v1, :cond_ab

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "getResources(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lg7/k;->F:Lc7/a;

    if-nez v3, :cond_28

    const-string v3, "screenPreviewPagerAdapter"

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v6, v0

    goto :goto_29

    :cond_28
    move-object v6, v3

    :goto_29
    const v3, 0x7f0704b7

    const v4, 0x7f07057c

    const/4 v5, 0x2

    invoke-static/range {v1 .. v6}, Ln6/d;->f(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/res/Resources;IIILandroidx/viewpager2/adapter/FragmentStateAdapter;)V

    new-instance v2, Lg7/k$d;

    invoke-direct {v2, p0, v1}, Lg7/k$d;-><init>(Lg7/k;Landroidx/viewpager2/widget/ViewPager2;)V

    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    move-result v2

    if-eqz v2, :cond_a2

    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-nez v2, :cond_a2

    invoke-static {p0}, Lg7/k;->f1(Lg7/k;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object v2

    if-eqz v2, :cond_9e

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v3, :cond_59

    move-object v0, v2

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    :cond_59
    const v2, 0x7f0a0441

    invoke-virtual {p1, v2}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    const v2, 0x3f638866    # 0.8888f

    mul-float/2addr p1, v2

    if-eqz v0, :cond_9e

    invoke-static {v0}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object v0

    if-eqz v0, :cond_9e

    invoke-interface {v0}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_75
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    const v3, 0x7f0a03df

    invoke-virtual {v2, v3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "requireViewById(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-int v3, p1

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    invoke-virtual {v2, v4, v3, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_75

    :cond_9e
    invoke-static {p0}, Lg7/k;->h1(Lg7/k;)V

    goto :goto_ac

    :cond_a2
    new-instance v0, Lg7/k$e;

    invoke-direct {v0, p0, p1}, Lg7/k$e;-><init>(Lg7/k;Landroid/view/View;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto :goto_ac

    :cond_ab
    move-object v1, v0

    :goto_ac
    iput-object v1, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    return-void
.end method

.method public static final M1(ZLjava/lang/CharSequence;)Landroidx/fragment/app/q;
    .registers 3

    sget-object v0, Lg7/k;->O:Lg7/k$a;

    invoke-virtual {v0, p0, p1}, Lg7/k$a;->a(ZLjava/lang/CharSequence;)Landroidx/fragment/app/q;

    move-result-object p0

    return-object p0
.end method

.method private final N1()V
    .registers 9

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, Lg7/k$f;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lg7/k$f;-><init>(Lg7/k;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private static final O1(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 6

    const-string v0, "v"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "windowInsets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {}, Landroidx/core/view/V$k;->f()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Insets;->bottom:I

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p1}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method private final P1(IF)V
    .registers 6

    iget-object v0, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    if-nez v0, :cond_5

    goto :goto_35

    :cond_5
    invoke-direct {p0, v0}, Lg7/k;->v1(Landroidx/viewpager2/widget/ViewPager2;)[Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_10

    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_10

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    if-nez v0, :cond_14

    goto :goto_35

    :cond_14
    const/4 v1, 0x1

    if-nez p1, :cond_18

    goto :goto_1b

    :cond_18
    int-to-float p1, v1

    sub-float p2, p1, p2

    :goto_1b
    int-to-float p1, v1

    sub-float/2addr p1, p2

    const/4 v2, 0x0

    aget-object v2, v0, v2

    invoke-virtual {v2, p2}, Landroid/view/View;->setAlpha(F)V

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lg7/k;->K:Ly7/o;

    if-eqz p0, :cond_35

    invoke-virtual {p0}, Ly7/o;->e()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    if-eqz p0, :cond_35

    invoke-virtual {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->n4(F)V

    :cond_35
    :goto_35
    return-void
.end method

.method public static synthetic Q0(Lv8/l;Lg3/f;)Z
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->y1(Lv8/l;Lg3/f;)Z

    move-result p0

    return p0
.end method

.method private final Q1(IF)V
    .registers 6

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->C()Ld3/a;

    move-result-object v0

    invoke-virtual {v0}, Ld3/a;->s()Z

    move-result v0

    if-eqz v0, :cond_49

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0545

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_49

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0704b7

    invoke-static {v1, v2}, Li6/q;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v2, 0x7f07057c

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    invoke-virtual {v0}, Landroid/view/View;->isLayoutRtl()Z

    move-result v2

    if-eqz v2, :cond_3e

    const/4 v2, 0x1

    goto :goto_3f

    :cond_3e
    const/4 v2, -0x1

    :goto_3f
    int-to-float v2, v2

    int-to-float p1, p1

    add-float/2addr p2, p1

    mul-float/2addr v2, p2

    add-int/2addr v1, p0

    int-to-float p0, v1

    mul-float/2addr v2, p0

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationX(F)V

    :cond_49
    return-void
.end method

.method public static synthetic R0(ZLg3/f;)Z
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->x1(ZLg3/f;)Z

    move-result p0

    return p0
.end method

.method public static synthetic S0(Lv8/l;Lg3/f;)Z
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->q1(Lv8/l;Lg3/f;)Z

    move-result p0

    return p0
.end method

.method public static synthetic T0(Lg3/f;)Z
    .registers 1

    invoke-static {p0}, Lg7/k;->A1(Lg3/f;)Z

    move-result p0

    return p0
.end method

.method public static synthetic U0(Lcom/google/android/material/tabs/TabLayout$f;I)V
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->G1(Lcom/google/android/material/tabs/TabLayout$f;I)V

    return-void
.end method

.method public static synthetic V0(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->B1(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic W0(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->r1(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->O1(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y0(Lg3/f;)Z
    .registers 1

    invoke-static {p0}, Lg7/k;->p1(Lg3/f;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Z0(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, Lg7/k;->z1(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a1(Lg7/k;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, Lg7/k;->n1(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b1(Ljava/lang/CharSequence;)Landroid/os/Bundle;
    .registers 1

    invoke-static {p0}, Lcom/android/wallpaper/picker/a;->g0(Ljava/lang/CharSequence;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c1(Lg7/k;)Li7/a;
    .registers 1

    invoke-direct {p0}, Lg7/k;->t1()Li7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d1(Lg7/k;)Ly7/o;
    .registers 1

    iget-object p0, p0, Lg7/k;->K:Ly7/o;

    return-object p0
.end method

.method public static final synthetic e1(Lg7/k;)Lcom/nothing/wallpaper/widget/PreviewSectionLayout;
    .registers 1

    iget-object p0, p0, Lg7/k;->G:Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

    return-object p0
.end method

.method public static final synthetic f1(Lg7/k;)Landroidx/viewpager2/widget/ViewPager2;
    .registers 1

    iget-object p0, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    return-object p0
.end method

.method public static final synthetic g1(Lg7/k;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lg7/k;->C:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic h1(Lg7/k;)V
    .registers 1

    invoke-direct {p0}, Lg7/k;->E1()V

    return-void
.end method

.method public static final synthetic i1(Lg7/k;)Z
    .registers 1

    iget-boolean p0, p0, Lg7/k;->H:Z

    return p0
.end method

.method public static final synthetic j1(Lg7/k;Ljava/lang/CharSequence;)V
    .registers 2

    invoke-virtual {p0, p1}, Lcom/android/wallpaper/picker/a;->n0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final synthetic k1(Lg7/k;Z)V
    .registers 2

    iput-boolean p1, p0, Lg7/k;->H:Z

    return-void
.end method

.method public static final synthetic l1(Lg7/k;IF)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lg7/k;->P1(IF)V

    return-void
.end method

.method public static final synthetic m1(Lg7/k;IF)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lg7/k;->Q1(IF)V

    return-void
.end method

.method private final n1(Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance v0, Lg7/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg7/k$b;-><init>(Lg7/k;Lm8/e;)V

    invoke-static {v0, p1}, LF8/M;->e(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_11

    return-object p0

    :cond_11
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final p1(Lg3/f;)Z
    .registers 2

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LJ6/d;->d(Lg3/f;)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-static {p0}, LJ6/d;->b(Lg3/f;)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-static {p0}, LJ6/d;->c(Lg3/f;)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-static {p0}, LJ6/d;->a(Lg3/f;)Z

    move-result p0

    if-eqz p0, :cond_1e

    goto :goto_20

    :cond_1e
    const/4 p0, 0x0

    return p0

    :cond_20
    :goto_20
    const/4 p0, 0x1

    return p0
.end method

.method private static final q1(Lv8/l;Lg3/f;)Z
    .registers 2

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final r1(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final t1()Li7/a;
    .registers 2

    iget-object p0, p0, Li3/o;->B:Lx3/b;

    instance-of v0, p0, Li7/a;

    if-eqz v0, :cond_9

    check-cast p0, Li7/a;

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method private final u1()Li7/d;
    .registers 1

    iget-object p0, p0, Lg7/k;->M:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li7/d;

    return-object p0
.end method

.method private final v1(Landroidx/viewpager2/widget/ViewPager2;)[Landroid/view/View;
    .registers 6

    iget-object v0, p0, Lg7/k;->I:[Landroid/view/View;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    instance-of v1, p1, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x0

    if-eqz v1, :cond_12

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    goto :goto_13

    :cond_12
    move-object p1, v2

    :goto_13
    if-nez p1, :cond_16

    return-object v2

    :cond_16
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3b

    const v1, 0x7f0a0395

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_26

    goto :goto_3b

    :cond_26
    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_3b

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_34

    goto :goto_3b

    :cond_34
    filled-new-array {v0, p1}, [Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lg7/k;->I:[Landroid/view/View;

    return-object p1

    :cond_3b
    :goto_3b
    return-object v2
.end method

.method private static final x1(ZLg3/f;)Z
    .registers 3

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_c

    invoke-static {p1}, LJ6/d;->c(Lg3/f;)Z

    move-result p0

    return p0

    :cond_c
    invoke-static {p1}, LJ6/d;->b(Lg3/f;)Z

    move-result p0

    return p0
.end method

.method private static final y1(Lv8/l;Lg3/f;)Z
    .registers 2

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final z1(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method protected A0(Ljava/util/List;)Ljava/util/List;
    .registers 4

    new-instance v0, Lg7/b;

    invoke-direct {v0}, Lg7/b;-><init>()V

    if-eqz p1, :cond_2a

    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p1

    if-eqz p1, :cond_2a

    new-instance v1, Lg7/c;

    invoke-direct {v1, v0}, Lg7/c;-><init>(Lv8/l;)V

    new-instance v0, Lg7/d;

    invoke-direct {v0, v1}, Lg7/d;-><init>(Lv8/l;)V

    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object p1

    if-eqz p1, :cond_2a

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2a

    goto :goto_2f

    :cond_2a
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_2f
    invoke-super {p0, p1}, Li3/o;->A0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string p1, "filterAvailableSections(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method protected B0()I
    .registers 1

    const p0, 0x7f0d0125

    return p0
.end method

.method public C0()I
    .registers 1

    const p0, 0x7f0d0139

    return p0
.end method

.method public final D1()V
    .registers 5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0545

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_11

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    :cond_11
    iget-object v0, p0, Lg7/k;->K:Ly7/o;

    if-eqz v0, :cond_1b

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Ly7/o;->i(Ly7/o;ZLv8/a;ILjava/lang/Object;)V

    :cond_1b
    invoke-direct {p0}, Lg7/k;->C1()LJ7/b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LJ7/b;->y(Z)V

    iget-object p0, p0, Lg7/k;->K:Ly7/o;

    if-eqz p0, :cond_30

    invoke-virtual {p0}, Ly7/o;->e()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    if-eqz p0, :cond_30

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z2()V

    :cond_30
    return-void
.end method

.method protected H0(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method protected I0(Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/android/wallpaper/picker/a;->r0(Landroid/view/View;Z)V

    return-void
.end method

.method public P(Ljava/lang/String;)V
    .registers 4

    if-eqz p1, :cond_4f

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_54

    goto :goto_4f

    :sswitch_a
    const-string v0, "custom_widget"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_4f

    :sswitch_13
    const-string v0, "lock_screen_preview"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_4f

    :sswitch_1c
    const-string v0, "color"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_4f

    :cond_25
    sget-object p1, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->S:Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string v0, "requireActivity(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;->a(Landroid/app/Activity;)V

    return-void

    :sswitch_34
    const-string v0, "custom_short_cut"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_4f

    :cond_3d
    invoke-direct {p0}, Lg7/k;->C1()LJ7/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LJ7/b;->n(Ljava/lang/String;Z)V

    iget-object p0, p0, Lg7/k;->K:Ly7/o;

    if-eqz p0, :cond_4e

    const/4 p1, 0x3

    const/4 v0, 0x0

    invoke-static {p0, v1, v0, p1, v0}, Ly7/o;->i(Ly7/o;ZLv8/a;ILjava/lang/Object;)V

    :cond_4e
    return-void

    :cond_4f
    :goto_4f
    invoke-super {p0, p1}, Li3/o;->P(Ljava/lang/String;)V

    return-void

    nop

    :sswitch_data_54
    .sparse-switch
        -0x3f83bb4f -> :sswitch_34
        0x5a72f63 -> :sswitch_1c
        0x3fd46c89 -> :sswitch_13
        0x4be33ad2 -> :sswitch_a
    .end sparse-switch
.end method

.method public g(Landroidx/fragment/app/q;)V
    .registers 7

    if-nez p1, :cond_3

    return-void

    :cond_3
    instance-of v0, p1, Lcom/android/wallpaper/picker/g;

    if-eqz v0, :cond_38

    move-object v1, p1

    check-cast v1, Lcom/android/wallpaper/picker/g;

    new-instance v2, Lh8/o;

    invoke-direct {p0}, Lg7/k;->t1()Li7/a;

    move-result-object v3

    if-eqz v3, :cond_23

    invoke-virtual {v3}, Lx3/b;->k()LI8/O;

    move-result-object v3

    if-eqz v3, :cond_23

    invoke-interface {v3}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_24

    :cond_23
    const/4 v3, 0x1

    :goto_24
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "key_is_lock_screen"

    invoke-direct {v2, v4, v3}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Lh8/o;

    move-result-object v2

    invoke-static {v2}, Lx0/d;->a([Lh8/o;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    :cond_38
    if-eqz v0, :cond_64

    invoke-static {}, Li6/e;->n()Z

    move-result v0

    if-nez v0, :cond_64

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object v0

    const v1, 0x7f0a01f5

    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/S;->b(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/S;->g(Ljava/lang/String;)Landroidx/fragment/app/S;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/S;->i()I

    invoke-virtual {p0}, Landroidx/fragment/app/J;->g0()Z

    return-void

    :cond_64
    invoke-super {p0, p1}, Li3/o;->g(Landroidx/fragment/app/q;)V

    return-void
.end method

.method public final o1()V
    .registers 1

    iget-object p0, p0, Lg7/k;->K:Ly7/o;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ly7/o;->d()V

    :cond_7
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 5

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Li3/o;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_22

    const p1, 0x7f0a0338

    invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "requireViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    new-instance p2, Lg7/a;

    invoke-direct {p2}, Lg7/a;-><init>()V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-object p0

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method

.method public onDestroyView()V
    .registers 3

    iget-object v0, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_8
    iput-object v1, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    iput-object v1, p0, Lg7/k;->G:Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

    iput-object v1, p0, Lg7/k;->I:[Landroid/view/View;

    iget-object v0, p0, Lg7/k;->J:Lcom/google/android/material/tabs/d;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lcom/google/android/material/tabs/d;->b()V

    :cond_15
    iput-object v1, p0, Lg7/k;->J:Lcom/google/android/material/tabs/d;

    iput-object v1, p0, Lg7/k;->N:Landroid/animation/Animator;

    iput-object v1, p0, Lg7/k;->K:Ly7/o;

    invoke-super {p0}, Li3/o;->onDestroyView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Li3/d;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iput-object p2, p0, Lg7/k;->D:Landroid/os/Bundle;

    invoke-direct {p0, p1}, Lg7/k;->K1(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lg7/k;->L1(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lg7/k;->I1(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lg7/k;->F1(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lg7/k;->J1(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lg7/k;->H1(Landroid/view/View;)V

    invoke-direct {p0}, Lg7/k;->N1()V

    return-void
.end method

.method public r(Z)Ljava/util/List;
    .registers 3

    if-eqz p1, :cond_5

    sget-object p1, Lh3/d$a;->q:Lh3/d$a;

    goto :goto_7

    :cond_5
    sget-object p1, Lh3/d$a;->r:Lh3/d$a;

    :goto_7
    iget-object v0, p0, Lg7/k;->D:Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0}, Li3/o;->F0(Lh3/d$a;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg7/k;->A0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance p1, Lg7/i;

    invoke-direct {p1}, Lg7/i;-><init>()V

    new-instance v0, Lg7/j;

    invoke-direct {v0, p1}, Lg7/j;-><init>(Lv8/l;)V

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object p0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "collect(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public s0(I)V
    .registers 2

    return-void
.end method

.method public s1()Lg3/f;
    .registers 3

    sget-object v0, Lh3/d$a;->q:Lh3/d$a;

    iget-object v1, p0, Lg7/k;->D:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v1}, Li3/o;->F0(Lh3/d$a;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg7/k;->A0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lg3/f;

    invoke-static {v1}, LJ6/d;->a(Lg3/f;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_27

    :cond_26
    const/4 v0, 0x0

    :goto_27
    check-cast v0, Lg3/f;

    return-object v0
.end method

.method public v(ZZ)Z
    .registers 14

    iget-object v0, p0, Lg7/k;->N:Landroid/animation/Animator;

    const/4 v1, 0x1

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-ne v0, v1, :cond_13

    iget-object p0, p0, Lg7/k;->C:Ljava/lang/String;

    const-string p1, "selectPageItem: viewpager is in scrolling animation, block click event"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_13
    iget-object v2, p0, Lg7/k;->E:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    if-nez v2, :cond_19

    return v0

    :cond_19
    sget-object v3, Lc7/a;->q:Lc7/a$a;

    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v4

    invoke-virtual {v3, v4}, Lc7/a$a;->c(I)Z

    move-result v3

    if-ne v3, p1, :cond_26

    return v0

    :cond_26
    xor-int/lit8 v3, p1, 0x1

    iget-object p1, p0, Lg7/k;->C:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "selectPageItem: position is "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", userClick is "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_76

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "requireContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0704b7

    invoke-static {p1, p2}, Li6/q;->c(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f07057c

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v8

    iget-object p1, p0, Lg7/k;->N:Landroid/animation/Animator;

    if-eqz p1, :cond_6a

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_6a
    const/4 v9, 0x6

    const/4 v10, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v10}, Ln6/d;->d(Landroidx/viewpager2/widget/ViewPager2;IJLandroid/animation/TimeInterpolator;IIILjava/lang/Object;)Landroid/animation/Animator;

    move-result-object p1

    iput-object p1, p0, Lg7/k;->N:Landroid/animation/Animator;

    goto :goto_79

    :cond_76
    invoke-virtual {v2, v3, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    :goto_79
    return v1
.end method

.method public w1(Z)Ljava/util/List;
    .registers 4

    if-eqz p1, :cond_5

    sget-object v0, Lh3/d$a;->q:Lh3/d$a;

    goto :goto_7

    :cond_5
    sget-object v0, Lh3/d$a;->r:Lh3/d$a;

    :goto_7
    iget-object v1, p0, Lg7/k;->D:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v1}, Li3/o;->F0(Lh3/d$a;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg7/k;->A0(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Lg7/f;

    invoke-direct {v0, p1}, Lg7/f;-><init>(Z)V

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance p1, Lg7/g;

    invoke-direct {p1, v0}, Lg7/g;-><init>(Lv8/l;)V

    new-instance v0, Lg7/h;

    invoke-direct {v0, p1}, Lg7/h;-><init>(Lv8/l;)V

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object p0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "collect(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    return-object p0
.end method
