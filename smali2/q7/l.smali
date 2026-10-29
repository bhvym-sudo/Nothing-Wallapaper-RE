.class public final Lq7/l;
.super Lcom/android/wallpaper/picker/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq7/l$a;
    }
.end annotation


# static fields
.field public static final G:Lq7/l$a;

.field private static final H:Landroid/content/ComponentName;


# instance fields
.field private A:Landroid/view/View;

.field private B:Lr6/g;

.field private C:Lr6/g;

.field private D:Lr6/g;

.field private E:Landroid/app/ProgressDialog;

.field private final F:Lh8/h;

.field private v:Le3/j0;

.field private final w:Lh8/h;

.field private final x:Lh8/h;

.field private y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field private z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lq7/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq7/l$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lq7/l;->G:Lq7/l$a;

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.nothing.wallpaper"

    const-string v2, "com.nothing.blurwallpaper.AtmosphereWallpaperService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lq7/l;->H:Landroid/content/ComponentName;

    return-void
.end method

.method public constructor <init>()V
    .registers 6

    invoke-direct {p0}, Lcom/android/wallpaper/picker/a;-><init>()V

    const-class v0, Ls7/a;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Lq7/l$h;

    invoke-direct {v1, p0}, Lq7/l$h;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Lq7/l$i;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Lq7/l$i;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v4, Lq7/l$j;

    invoke-direct {v4, p0}, Lq7/l$j;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lq7/l;->w:Lh8/h;

    const-class v0, Lj7/j;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Lq7/l$k;

    invoke-direct {v1, p0}, Lq7/l$k;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Lq7/l$l;

    invoke-direct {v2, v3, p0}, Lq7/l$l;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, Lq7/l$m;

    invoke-direct {v3, p0}, Lq7/l$m;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lq7/l;->x:Lh8/h;

    new-instance v0, Lq7/i;

    invoke-direct {v0, p0}, Lq7/i;-><init>(Lq7/l;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lq7/l;->F:Lh8/h;

    return-void
.end method

.method public static synthetic A0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->Z0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lq7/l;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->d1(Lq7/l;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->W0(Lq7/l;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic D0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->a1(Lq7/l;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->Y0(Lq7/l;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->X0(Lq7/l;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic G0(Lq7/l;)Lr6/g;
    .registers 1

    iget-object p0, p0, Lq7/l;->D:Lr6/g;

    return-object p0
.end method

.method public static final synthetic H0(Lq7/l;)Lj7/j;
    .registers 1

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I0(Lq7/l;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;
    .registers 1

    iget-object p0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    return-object p0
.end method

.method public static final synthetic J0(Lq7/l;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;
    .registers 1

    iget-object p0, p0, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    return-object p0
.end method

.method public static final synthetic K0(Lq7/l;)Ls7/a;
    .registers 1

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L0(Lq7/l;Lp7/b;)V
    .registers 2

    invoke-direct {p0, p1}, Lq7/l;->T0(Lp7/b;)V

    return-void
.end method

.method public static final synthetic M0(Lq7/l;Lg3/x;Lg3/x;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lq7/l;->i1(Lg3/x;Lg3/x;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N0(Lq7/l;Lp7/c;)V
    .registers 2

    invoke-direct {p0, p1}, Lq7/l;->l1(Lp7/c;)V

    return-void
.end method

.method private final O0()V
    .registers 9

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object v0

    invoke-virtual {v0}, Lj7/j;->u0()Lg3/x;

    move-result-object v0

    invoke-static {v0}, LG6/e;->s(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, Lq7/l$b;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lq7/l$b;-><init>(Lq7/l;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_28
    return-void
.end method

.method private final P0()Lj7/j;
    .registers 1

    iget-object p0, p0, Lq7/l;->x:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj7/j;

    return-object p0
.end method

.method private final Q0(I)Landroid/service/wallpaper/IWallpaperEngine;
    .registers 3

    if-eqz p1, :cond_b

    const/4 v0, 0x1

    if-eq p1, v0, :cond_8

    iget-object p0, p0, Lq7/l;->C:Lr6/g;

    goto :goto_d

    :cond_8
    iget-object p0, p0, Lq7/l;->B:Lr6/g;

    goto :goto_d

    :cond_b
    iget-object p0, p0, Lq7/l;->C:Lr6/g;

    :goto_d
    if-eqz p0, :cond_14

    invoke-virtual {p0}, Lr6/g;->j0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object p0

    return-object p0

    :cond_14
    const/4 p0, 0x0

    return-object p0
.end method

.method private final R0()Ls7/a;
    .registers 1

    iget-object p0, p0, Lq7/l;->w:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls7/a;

    return-object p0
.end method

.method private final S0()Landroidx/core/view/W;
    .registers 1

    iget-object p0, p0, Lq7/l;->F:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/core/view/W;

    return-object p0
.end method

.method private final T0(Lp7/b;)V
    .registers 5

    iget-object v0, p0, Lq7/l;->v:Le3/j0;

    if-eqz v0, :cond_1f

    iget-object v0, v0, Le3/j0;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;

    if-eqz v0, :cond_1f

    invoke-virtual {p1}, Lp7/b;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;->b(Ljava/util/List;)V

    invoke-virtual {p1}, Lp7/b;->b()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1f

    sget-object v1, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    new-instance v2, Lq7/b;

    invoke-direct {v2, p0, p1}, Lq7/b;-><init>(Lq7/l;Landroid/content/Intent;)V

    invoke-virtual {v0, v1, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;->a(Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;Landroid/view/View$OnClickListener;)V

    :cond_1f
    return-void
.end method

.method private static final U0(Lq7/l;Landroid/content/Intent;Landroid/view/View;)V
    .registers 10

    sget-object v0, Li6/a;->a:Li6/a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string p0, "requireContext(...)"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const v4, 0x7f13012e

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Li6/a;->b(Li6/a;Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;IILjava/lang/Object;)Z

    return-void
.end method

.method private final V0()V
    .registers 5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    iget-object v0, p0, Lq7/l;->v:Le3/j0;

    if-eqz v0, :cond_39

    invoke-virtual {v0}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/android/wallpaper/picker/a;->q0(Landroid/view/View;)V

    iget-object v1, v0, Le3/j0;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;

    new-instance v2, Lq7/a;

    invoke-direct {v2}, Lq7/a;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    iget-object v1, v0, Le3/j0;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;

    sget-object v2, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    new-instance v3, Lq7/c;

    invoke-direct {v3, p0}, Lq7/c;-><init>(Lq7/l;)V

    invoke-virtual {v1, v2, v3}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;->a(Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;Landroid/view/View$OnClickListener;)V

    iget-object v0, v0, Le3/j0;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;

    sget-object v1, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    new-instance v2, Lq7/d;

    invoke-direct {v2, p0}, Lq7/d;-><init>(Lq7/l;)V

    invoke-virtual {v0, v1, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;->a(Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;Landroid/view/View$OnClickListener;)V

    :cond_39
    iget-object v0, p0, Lq7/l;->v:Le3/j0;

    const/4 v1, 0x0

    if-eqz v0, :cond_41

    iget-object v0, v0, Le3/j0;->B:Landroid/view/View;

    goto :goto_42

    :cond_41
    move-object v0, v1

    :goto_42
    instance-of v2, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v2, :cond_49

    check-cast v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    goto :goto_4a

    :cond_49
    move-object v0, v1

    :goto_4a
    if-eqz v0, :cond_60

    new-instance v2, Lq7/e;

    invoke-direct {v2, p0}, Lq7/e;-><init>(Lq7/l;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f130280

    invoke-virtual {p0, v2}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    :cond_60
    iget-object v0, p0, Lq7/l;->v:Le3/j0;

    if-eqz v0, :cond_67

    iget-object v0, v0, Le3/j0;->z:Landroid/view/View;

    goto :goto_68

    :cond_67
    move-object v0, v1

    :goto_68
    instance-of v2, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v2, :cond_6f

    check-cast v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    goto :goto_70

    :cond_6f
    move-object v0, v1

    :goto_70
    if-eqz v0, :cond_86

    new-instance v2, Lq7/f;

    invoke-direct {v2, p0}, Lq7/f;-><init>(Lq7/l;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f13027f

    invoke-virtual {p0, v2}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    :cond_86
    const v0, 0x7f0f0007

    invoke-virtual {p0, v0}, Lcom/android/wallpaper/picker/a;->s0(I)V

    iget-object v0, p0, Lcom/android/wallpaper/picker/a;->t:Landroid/widget/Toolbar;

    invoke-virtual {v0}, Landroid/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v0

    const v2, 0x7f0a01aa

    invoke-interface {v0, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_a6

    const v1, 0x7f0a0040

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    :cond_a6
    iput-object v1, p0, Lq7/l;->A:Landroid/view/View;

    if-eqz v1, :cond_b2

    new-instance v0, Lq7/g;

    invoke-direct {v0, p0}, Lq7/g;-><init>(Lq7/l;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b2
    return-void
.end method

.method private static final W0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ls7/a;->x(Z)V

    return-void
.end method

.method private static final X0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ls7/a;->x(Z)V

    return-void
.end method

.method private static final Y0(Lq7/l;Landroid/view/View;)V
    .registers 6

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->o()Lh8/o;

    move-result-object p1

    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v2

    const-string v3, "requireActivity(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq7/l;->Q0(I)Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object p0

    invoke-virtual {v1, v2, v0, p1, p0}, Lj7/j;->Z0(Landroid/app/Activity;Ljava/util/List;ILandroid/service/wallpaper/IWallpaperEngine;)V

    return-void
.end method

.method private static final Z0(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 3

    const-string v0, "v"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    const-string v0, "getInsets(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_29

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Landroid/graphics/Insets;->bottom:I

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    return-object p0

    :cond_29
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final a1(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->k()V

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p0

    invoke-virtual {p0}, Lj7/j;->Z()V

    return-void
.end method

.method private static final b1(Lq7/l;Landroid/view/View;)V
    .registers 3

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->t()Z

    move-result p1

    if-nez p1, :cond_13

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p1

    sget-object v0, Lk7/a;->q:Lk7/a;

    invoke-virtual {p1, v0}, Lj7/j;->W(Lk7/a;)V

    :cond_13
    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->l()V

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p0

    invoke-virtual {p0}, Lj7/j;->Z()V

    return-void
.end method

.method private final c1()V
    .registers 11

    iget-object v0, p0, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    const-string v1, "requireContext(...)"

    const-string v2, "getViewLifecycleOwner(...)"

    if-eqz v0, :cond_2c

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LH3/q;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f130132

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, LH3/q;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/h;)V

    invoke-virtual {v0, v3, v4}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r(Landroidx/lifecycle/x;LH3/q;)V

    :cond_2c
    iget-object v0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v0, :cond_56

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LH3/q;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f1300fb

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v6, "getString(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5, v1}, LH3/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r(Landroidx/lifecycle/x;LH3/q;)V

    :cond_56
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v3

    new-instance v6, Lq7/l$c;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v0}, Lq7/l$c;-><init>(Lq7/l;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v3

    new-instance v6, Lq7/l$d;

    invoke-direct {v6, p0, v0}, Lq7/l$d;-><init>(Lq7/l;Lm8/e;)V

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object v0

    invoke-virtual {v0}, Lj7/j;->o0()Landroidx/lifecycle/C;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v1

    new-instance v2, Lq7/j;

    invoke-direct {v2, p0}, Lq7/j;-><init>(Lq7/l;)V

    new-instance p0, Lq7/l$e;

    invoke-direct {p0, v2}, Lq7/l$e;-><init>(Lv8/l;)V

    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/C;->h(Landroidx/lifecycle/x;Landroidx/lifecycle/I;)V

    return-void
.end method

.method private static final d1(Lq7/l;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;
    .registers 3

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {p0}, Lq7/l;->e1(Lq7/l;)V

    iget-object p0, p0, Lq7/l;->E:Landroid/app/ProgressDialog;

    if-eqz p0, :cond_4f

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_4f

    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v0, 0x1

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v0, 0x0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {p0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_4f

    :cond_25
    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {p0}, Lq7/l;->e1(Lq7/l;)V

    goto :goto_4f

    :cond_31
    instance-of v0, p1, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;

    if-eqz v0, :cond_4f

    iget-object v0, p0, Lq7/l;->E:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_3c

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_3c
    check-cast p1, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;->getSuccess()Z

    move-result p1

    if-eqz p1, :cond_4f

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_4f
    :goto_4f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final e1(Lq7/l;)V
    .registers 4

    iget-object v0, p0, Lq7/l;->E:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_7
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v1

    const v2, 0x7f14014c

    invoke-direct {v0, v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v2

    if-eqz v2, :cond_24

    const v1, 0x7f130281

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_24
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setInverseBackgroundForced(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iput-object v0, p0, Lq7/l;->E:Landroid/app/ProgressDialog;

    return-void
.end method

.method private static final f1(Lq7/l;)Lh8/A;
    .registers 2

    iget-object v0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v0, :cond_c

    iget-object p0, p0, Lq7/l;->D:Lr6/g;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->H(Lr6/g;)V

    :cond_c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final g1(Landroid/content/ComponentName;Lr6/g;ILv8/a;)Lr6/g;
    .registers 11

    if-nez p2, :cond_16

    sget-object v0, Lr6/g;->I:Lr6/g$a;

    iget-object v2, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v3

    const-string p2, "requireContext(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lr6/g$a;->a(Landroid/content/ComponentName;Landroid/view/View;Landroid/content/Context;ILv8/a;)Lr6/g;

    move-result-object p2

    :cond_16
    iget-object p0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz p0, :cond_30

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_28

    invoke-virtual {p2}, Lr6/g;->c0()Z

    const/4 p0, 0x1

    invoke-virtual {p2, p0}, Lr6/g;->r0(Z)V

    return-object p2

    :cond_28
    new-instance p1, Lq7/l$f;

    invoke-direct {p1, p0, p2}, Lq7/l$f;-><init>(Landroid/view/View;Lr6/g;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_30
    return-object p2
.end method

.method static synthetic h1(Lq7/l;Landroid/content/ComponentName;Lr6/g;ILv8/a;ILjava/lang/Object;)Lr6/g;
    .registers 7

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_5

    const/4 p4, 0x0

    :cond_5
    invoke-direct {p0, p1, p2, p3, p4}, Lq7/l;->g1(Landroid/content/ComponentName;Lr6/g;ILv8/a;)Lr6/g;

    move-result-object p0

    return-object p0
.end method

.method private final i1(Lg3/x;Lg3/x;Lm8/e;)Ljava/lang/Object;
    .registers 14

    instance-of v0, p3, Lq7/l$g;

    if-eqz v0, :cond_14

    move-object v0, p3

    check-cast v0, Lq7/l$g;

    iget v1, v0, Lq7/l$g;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_14

    sub-int/2addr v1, v2

    iput v1, v0, Lq7/l$g;->w:I

    :goto_12
    move-object v6, v0

    goto :goto_1a

    :cond_14
    new-instance v0, Lq7/l$g;

    invoke-direct {v0, p0, p3}, Lq7/l$g;-><init>(Lq7/l;Lm8/e;)V

    goto :goto_12

    :goto_1a
    iget-object p3, v6, Lq7/l$g;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, Lq7/l$g;->w:I

    const/4 v7, 0x3

    const/4 v2, 0x2

    const-string v8, "requireActivity(...)"

    const/4 v9, 0x1

    if-eqz v1, :cond_60

    if-eq v1, v9, :cond_4a

    if-eq v1, v2, :cond_4a

    if-ne v1, v7, :cond_42

    iget p0, v6, Lq7/l$g;->t:I

    iget-object p1, v6, Lq7/l$g;->s:Ljava/lang/Object;

    check-cast p1, Lg3/x;

    iget-object p2, v6, Lq7/l$g;->r:Ljava/lang/Object;

    check-cast p2, Lg3/x;

    iget-object v0, v6, Lq7/l$g;->q:Ljava/lang/Object;

    check-cast v0, Lq7/l;

    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_130

    :cond_42
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4a
    iget p0, v6, Lq7/l$g;->t:I

    iget-object p1, v6, Lq7/l$g;->s:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lg3/x;

    iget-object p1, v6, Lq7/l$g;->r:Ljava/lang/Object;

    check-cast p1, Lg3/x;

    iget-object v1, v6, Lq7/l$g;->q:Ljava/lang/Object;

    check-cast v1, Lq7/l;

    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    move p3, p0

    move-object p0, v1

    goto/16 :goto_e4

    :cond_60
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    const/4 p3, 0x0

    const-string v1, "requireContext(...)"

    if-eqz p1, :cond_74

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    goto :goto_75

    :cond_74
    move-object v3, p3

    :goto_75
    if-eqz p1, :cond_82

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    :cond_82
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Preview wallpapers home "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", lock "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "."

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v1, "NTPreviewFragment"

    invoke-static {v1, p3}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p3

    invoke-virtual {p3}, Lj7/j;->u0()Lg3/x;

    move-result-object p3

    invoke-static {p3}, LG6/e;->s(Lg3/x;)Z

    move-result p3

    xor-int/2addr p3, v9

    if-eqz p2, :cond_e8

    invoke-static {p2}, LG6/e;->i(Lg3/x;)Z

    move-result v1

    if-ne v1, v9, :cond_e8

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object v1

    invoke-virtual {v1}, Ls7/a;->m()Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_e6

    iget-object v1, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v1, :cond_e3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    iput-object p0, v6, Lq7/l$g;->q:Ljava/lang/Object;

    iput-object p1, v6, Lq7/l$g;->r:Ljava/lang/Object;

    iput-object p2, v6, Lq7/l$g;->s:Ljava/lang/Object;

    iput p3, v6, Lq7/l$g;->t:I

    iput v9, v6, Lq7/l$g;->w:I

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->L(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_109

    goto :goto_12b

    :cond_e3
    move-object v3, p2

    :goto_e4
    move-object v3, p1

    goto :goto_10b

    :cond_e6
    move-object v3, p2

    goto :goto_109

    :cond_e8
    move-object v3, p2

    iget-object v1, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v1, :cond_109

    move p2, v2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    iput-object p0, v6, Lq7/l$g;->q:Ljava/lang/Object;

    iput-object p1, v6, Lq7/l$g;->r:Ljava/lang/Object;

    iput-object v3, v6, Lq7/l$g;->s:Ljava/lang/Object;

    iput p3, v6, Lq7/l$g;->t:I

    iput p2, v6, Lq7/l$g;->w:I

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->L(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_109

    goto :goto_12b

    :cond_109
    :goto_109
    move-object p2, v3

    goto :goto_e4

    :goto_10b
    iget-object v1, p0, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v1, :cond_135

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v6, Lq7/l$g;->q:Ljava/lang/Object;

    iput-object v3, v6, Lq7/l$g;->r:Ljava/lang/Object;

    iput-object p2, v6, Lq7/l$g;->s:Ljava/lang/Object;

    iput p3, v6, Lq7/l$g;->t:I

    iput v7, v6, Lq7/l$g;->w:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->M(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12c

    :goto_12b
    return-object v0

    :cond_12c
    move-object v0, p0

    move-object p1, p2

    move p0, p3

    move-object p2, v3

    :goto_130
    move p3, p0

    move-object p0, p2

    move-object v1, v0

    move-object p2, p1

    goto :goto_137

    :cond_135
    move-object v1, p0

    move-object p0, v3

    :goto_137
    invoke-static {}, Lc3/a;->b()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_148

    if-eqz p0, :cond_148

    invoke-static {p0}, LG6/e;->s(Lg3/x;)Z

    move-result p1

    if-nez p1, :cond_148

    move p1, v9

    goto :goto_149

    :cond_148
    move p1, v0

    :goto_149
    const-string v8, "getComponent(...)"

    if-eqz p1, :cond_18e

    const-string v2, "null cannot be cast to non-null type com.android.wallpaper.model.LiveWallpaperInfo"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Lg3/k;

    invoke-virtual {v2}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lq7/l;->B:Lr6/g;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lq7/l;->h1(Lq7/l;Landroid/content/ComponentName;Lr6/g;ILv8/a;ILjava/lang/Object;)Lr6/g;

    move-result-object v2

    iget-object v3, v1, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v3, :cond_177

    if-eqz p3, :cond_173

    move v4, v9

    goto :goto_174

    :cond_173
    move v4, v0

    :goto_174
    invoke-virtual {v3, v2, v4}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->D(Lr6/g;Z)V

    :cond_177
    invoke-direct {v1}, Lq7/l;->P0()Lj7/j;

    move-result-object v3

    invoke-virtual {v3}, Lj7/j;->u0()Lg3/x;

    move-result-object v3

    invoke-static {v3}, LG6/e;->s(Lg3/x;)Z

    move-result v3

    if-nez v3, :cond_18c

    iget-object v3, v1, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v3, :cond_18c

    invoke-virtual {v3, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->H(Lr6/g;)V

    :cond_18c
    iput-object v2, v1, Lq7/l;->B:Lr6/g;

    :cond_18e
    instance-of v2, p2, Lg3/k;

    if-eqz v2, :cond_1f9

    move-object v2, p2

    check-cast v2, Lg3/k;

    invoke-virtual {v2}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lq7/l;->C:Lr6/g;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lq7/l;->h1(Lq7/l;Landroid/content/ComponentName;Lr6/g;ILv8/a;ILjava/lang/Object;)Lr6/g;

    move-result-object v2

    invoke-static {p2}, LG6/e;->i(Lg3/x;)Z

    move-result p2

    if-eqz p2, :cond_1cc

    invoke-virtual {v1}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object p2

    invoke-interface {p2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p2

    new-instance v3, Lq7/k;

    invoke-direct {v3, v1}, Lq7/k;-><init>(Lq7/l;)V

    invoke-static {p2, v3}, LN7/f;->g(Landroidx/lifecycle/q;Lv8/l;)Lh8/o;

    move-result-object p2

    invoke-virtual {p2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/RemoteCallback;

    invoke-static {v2, v9, v0, v9, p2}, Lq6/g;->c(Lr6/g;IZZLandroid/os/RemoteCallback;)V

    goto :goto_1d8

    :cond_1cc
    iget-object p2, v1, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz p2, :cond_1d8

    if-eqz p3, :cond_1d4

    move v3, v9

    goto :goto_1d5

    :cond_1d4
    move v3, v0

    :goto_1d5
    invoke-virtual {p2, v2, v3}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->D(Lr6/g;Z)V

    :cond_1d8
    :goto_1d8
    if-nez p1, :cond_1f7

    if-eqz p0, :cond_1ee

    invoke-static {p0}, LG6/e;->s(Lg3/x;)Z

    move-result p0

    if-nez p0, :cond_1ee

    iget-object p0, v1, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz p0, :cond_1f7

    if-eqz p3, :cond_1e9

    goto :goto_1ea

    :cond_1e9
    move v9, v0

    :goto_1ea
    invoke-virtual {p0, v2, v9}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->D(Lr6/g;Z)V

    goto :goto_1f7

    :cond_1ee
    if-eqz p3, :cond_1f7

    iget-object p0, v1, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz p0, :cond_1f7

    invoke-virtual {p0, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->H(Lr6/g;)V

    :cond_1f7
    :goto_1f7
    iput-object v2, v1, Lq7/l;->C:Lr6/g;

    :cond_1f9
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final j1(Lq7/l;Landroid/graphics/Bitmap;)Lh8/A;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls7/a;->y(Landroid/graphics/Bitmap;)V

    iget-object p0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz p0, :cond_15

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->B(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;)V

    :cond_15
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final k1(Z)V
    .registers 5

    iget-object p0, p0, Lq7/l;->v:Le3/j0;

    if-eqz p0, :cond_38

    iget-object v0, p0, Le3/j0;->C:Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;

    invoke-static {v0}, Landroidx/core/view/H;->M(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    const/high16 v2, -0x3d840000    # -63.0f

    if-eqz v0, :cond_30

    iget-object p0, p0, Le3/j0;->C:Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    if-eqz p1, :cond_18

    move v1, v2

    :cond_18
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    const-wide/16 v0, 0x190

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    sget-object p1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->A:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;->a()Landroid/view/animation/Interpolator;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    :cond_30
    iget-object p0, p0, Le3/j0;->C:Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;

    if-eqz p1, :cond_35

    move v1, v2

    :cond_35
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    :cond_38
    return-void
.end method

.method private final l1(Lp7/c;)V
    .registers 8

    iget-object v0, p0, Lq7/l;->v:Le3/j0;

    if-eqz v0, :cond_6f

    iget-object v1, v0, Le3/j0;->F:Landroid/widget/TextView;

    instance-of v2, p1, Lp7/c$c;

    if-eqz v2, :cond_e

    const v3, 0x7f1302bc

    goto :goto_11

    :cond_e
    const v3, 0x7f130277

    :goto_11
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, p0, Lq7/l;->A:Landroid/view/View;

    if-eqz v1, :cond_1d

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    :cond_1d
    invoke-virtual {p1}, Lp7/c;->f()Z

    move-result v1

    invoke-virtual {p1}, Lp7/c;->g()Z

    move-result v2

    invoke-direct {p0, v1}, Lq7/l;->k1(Z)V

    iget-object v3, v0, Le3/j0;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;

    sget-object v4, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-virtual {v3, v4, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;->c(Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;Z)V

    iget-object v3, v0, Le3/j0;->w:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;

    sget-object v4, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-virtual {v3, v4, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;->c(Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;Z)V

    iget-object v2, v0, Le3/j0;->x:Landroid/widget/TextView;

    const-string v3, "effectTips"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v1, :cond_44

    move v5, v4

    goto :goto_45

    :cond_44
    move v5, v3

    :goto_45
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Le3/j0;->D:Landroidx/constraintlayout/widget/Group;

    const-string v2, "screenLabelGroup"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_52

    goto :goto_53

    :cond_52
    move v3, v4

    :goto_53
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lq7/l;->y:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v0, :cond_61

    invoke-virtual {p1}, Lp7/c;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->setSelected(Z)V

    :cond_61
    iget-object v0, p0, Lq7/l;->z:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    if-eqz v0, :cond_6c

    invoke-virtual {p1}, Lp7/c;->d()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->setSelected(Z)V

    :cond_6c
    invoke-direct {p0}, Lq7/l;->O0()V

    :cond_6f
    return-void
.end method

.method private static final m1(Lq7/l;)Landroidx/core/view/W;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/core/view/T;->a(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/W;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Lq7/l;)Landroidx/core/view/W;
    .registers 1

    invoke-static {p0}, Lq7/l;->m1(Lq7/l;)Landroidx/core/view/W;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Lq7/l;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lq7/l;->f1(Lq7/l;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lq7/l;Landroid/graphics/Bitmap;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->j1(Lq7/l;Landroid/graphics/Bitmap;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Lq7/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lq7/l;->b1(Lq7/l;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z0(Lq7/l;Landroid/content/Intent;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lq7/l;->U0(Lq7/l;Landroid/content/Intent;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected j0()I
    .registers 1

    const p0, 0x106000d

    return p0
.end method

.method public onAttach(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/android/wallpaper/picker/a;->onAttach(Landroid/content/Context;)V

    invoke-direct {p0}, Lq7/l;->S0()Landroidx/core/view/W;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "requireContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LH6/a;->b(Landroid/content/Context;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Landroidx/core/view/W;->d(Z)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Le3/j0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/j0;

    move-result-object p1

    iput-object p1, p0, Lq7/l;->v:Le3/j0;

    invoke-direct {p0}, Lq7/l;->V0()V

    iget-object p0, p0, Lq7/l;->v:Le3/j0;

    if-eqz p0, :cond_18

    invoke-virtual {p0}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_18
    const/4 p0, 0x0

    return-object p0
.end method

.method public onDestroyView()V
    .registers 3

    invoke-super {p0}, Lcom/android/wallpaper/picker/a;->onDestroyView()V

    iget-object v0, p0, Lq7/l;->B:Lr6/g;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lr6/g;->d0()V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Lq7/l;->B:Lr6/g;

    iget-object v1, p0, Lq7/l;->C:Lr6/g;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Lr6/g;->d0()V

    :cond_14
    iput-object v0, p0, Lq7/l;->C:Lr6/g;

    iget-object v1, p0, Lq7/l;->D:Lr6/g;

    if-eqz v1, :cond_1d

    invoke-virtual {v1}, Lr6/g;->d0()V

    :cond_1d
    iput-object v0, p0, Lq7/l;->D:Lr6/g;

    iget-object p0, p0, Lq7/l;->E:Landroid/app/ProgressDialog;

    if-eqz p0, :cond_26

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_26
    return-void
.end method

.method public onPause()V
    .registers 3

    invoke-super {p0}, Landroidx/fragment/app/q;->onPause()V

    iget-object v0, p0, Lq7/l;->B:Lr6/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    invoke-virtual {v0, v1}, Lr6/g;->r0(Z)V

    :cond_b
    iget-object v0, p0, Lq7/l;->C:Lr6/g;

    if-eqz v0, :cond_12

    invoke-virtual {v0, v1}, Lr6/g;->r0(Z)V

    :cond_12
    iget-object p0, p0, Lq7/l;->D:Lr6/g;

    if-eqz p0, :cond_19

    invoke-virtual {p0, v1}, Lr6/g;->r0(Z)V

    :cond_19
    return-void
.end method

.method public onStart()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onStart()V

    iget-object p0, p0, Lq7/l;->D:Lr6/g;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lr6/g;->c0()Z

    :cond_a
    return-void
.end method

.method public onStop()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/q;->onStop()V

    iget-object v0, p0, Lq7/l;->B:Lr6/g;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lr6/g;->e0()V

    :cond_a
    iget-object v0, p0, Lq7/l;->C:Lr6/g;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lr6/g;->e0()V

    :cond_11
    iget-object v0, p0, Lq7/l;->D:Lr6/g;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lr6/g;->e0()V

    :cond_18
    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p0

    invoke-virtual {p0}, Ls7/a;->w()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 5

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Li3/d;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p2

    invoke-virtual {p2}, Lj7/j;->u0()Lg3/x;

    move-result-object p2

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object v0

    invoke-virtual {v0}, Lj7/j;->l0()Lp7/a;

    move-result-object v0

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object v1

    invoke-virtual {v1}, Lj7/j;->f0()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Ls7/a;->r(Lg3/x;Lp7/a;Ljava/util/Set;)V

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p1

    invoke-virtual {p1}, Lj7/j;->u0()Lg3/x;

    move-result-object p1

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result p1

    if-eqz p1, :cond_77

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->t()Z

    move-result p1

    if-eqz p1, :cond_48

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p1

    sget-object p2, Lk7/a;->q:Lk7/a;

    invoke-virtual {p1, p2}, Lj7/j;->W(Lk7/a;)V

    :cond_48
    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p1

    invoke-virtual {p1}, Ls7/a;->s()Z

    move-result p1

    if-nez p1, :cond_67

    invoke-direct {p0}, Lq7/l;->P0()Lj7/j;

    move-result-object p1

    invoke-direct {p0}, Lq7/l;->R0()Ls7/a;

    move-result-object p2

    invoke-virtual {p2}, Ls7/a;->o()Lh8/o;

    move-result-object p2

    invoke-virtual {p2}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1, p2}, Lj7/j;->Y0(Ljava/util/List;)V

    :cond_67
    sget-object p1, Lq7/l;->H:Landroid/content/ComponentName;

    iget-object p2, p0, Lq7/l;->D:Lr6/g;

    new-instance v0, Lq7/h;

    invoke-direct {v0, p0}, Lq7/h;-><init>(Lq7/l;)V

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v1, v0}, Lq7/l;->g1(Landroid/content/ComponentName;Lr6/g;ILv8/a;)Lr6/g;

    move-result-object p1

    iput-object p1, p0, Lq7/l;->D:Lr6/g;

    :cond_77
    invoke-direct {p0}, Lq7/l;->c1()V

    return-void
.end method
