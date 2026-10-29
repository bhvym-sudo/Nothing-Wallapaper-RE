.class public abstract LW6/i;
.super Landroidx/fragment/app/q;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW6/i$a;
    }
.end annotation


# static fields
.field private static final A:F

.field private static final B:F

.field public static final x:LW6/i$a;

.field private static final y:J

.field private static final z:J


# instance fields
.field private q:La7/d$c;

.field private final r:Landroid/view/animation/PathInterpolator;

.field private s:Li6/k;

.field private final t:LW6/e;

.field private u:I

.field private v:I

.field private final w:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW6/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW6/i$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW6/i;->x:LW6/i$a;

    const-wide/16 v0, 0x1f4

    sput-wide v0, LW6/i;->y:J

    sput-wide v0, LW6/i;->z:J

    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, LW6/i;->A:F

    const/high16 v0, 0x43200000    # 160.0f

    sput v0, LW6/i;->B:F

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3e4ccccd    # 0.2f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object v0, p0, LW6/i;->r:Landroid/view/animation/PathInterpolator;

    new-instance v0, LW6/e;

    invoke-direct {v0}, LW6/e;-><init>()V

    iput-object v0, p0, LW6/i;->t:LW6/e;

    new-instance v0, LW6/g;

    invoke-direct {v0, p0}, LW6/g;-><init>(LW6/i;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, LW6/i;->w:Lh8/h;

    return-void
.end method

.method private static final A0(LW6/i;)Z
    .registers 1

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result p0

    return p0
.end method

.method private static final C0(Lv8/l;Z)Lh8/A;
    .registers 2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final M0(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {p0, p1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_12
    return-void
.end method

.method private static final Q0(LW6/i;)Landroidx/core/view/W;
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

.method public static synthetic d0(LW6/i;)Landroidx/core/view/W;
    .registers 1

    invoke-static {p0}, LW6/i;->Q0(LW6/i;)Landroidx/core/view/W;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(LW6/i;)Z
    .registers 1

    invoke-static {p0}, LW6/i;->A0(LW6/i;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f0(Lv8/l;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/i;->C0(Lv8/l;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g0()J
    .registers 2

    sget-wide v0, LW6/i;->y:J

    return-wide v0
.end method

.method public static final synthetic h0()J
    .registers 2

    sget-wide v0, LW6/i;->z:J

    return-wide v0
.end method

.method public static final synthetic i0()F
    .registers 1

    sget v0, LW6/i;->B:F

    return v0
.end method

.method public static final synthetic j0()F
    .registers 1

    sget v0, LW6/i;->A:F

    return v0
.end method

.method protected static final l0()J
    .registers 2

    sget-object v0, LW6/i;->x:LW6/i$a;

    invoke-virtual {v0}, LW6/i$a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method protected static final m0()J
    .registers 2

    sget-object v0, LW6/i;->x:LW6/i$a;

    invoke-virtual {v0}, LW6/i$a;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method protected static final o0()F
    .registers 1

    sget-object v0, LW6/i;->x:LW6/i$a;

    invoke-virtual {v0}, LW6/i$a;->c()F

    move-result v0

    return v0
.end method

.method protected static final p0()F
    .registers 1

    sget-object v0, LW6/i;->x:LW6/i$a;

    invoke-virtual {v0}, LW6/i$a;->d()F

    move-result v0

    return v0
.end method

.method private final u0()Landroidx/core/view/W;
    .registers 1

    iget-object p0, p0, LW6/i;->w:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/core/view/W;

    return-object p0
.end method


# virtual methods
.method protected final B0(Lv8/l;)V
    .registers 3

    const-string v0, "networkChanged"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LW6/i;->s:Li6/k;

    if-eqz p0, :cond_11

    new-instance v0, LW6/h;

    invoke-direct {v0, p1}, LW6/h;-><init>(Lv8/l;)V

    invoke-virtual {p0, v0}, Li6/k;->f(Lv8/l;)V

    :cond_11
    return-void
.end method

.method protected final D0(Landroid/widget/ImageView;)V
    .registers 3

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f080189

    invoke-virtual {p0, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected final E0(I)V
    .registers 2

    iput p1, p0, LW6/i;->u:I

    return-void
.end method

.method protected final F0(La7/d$c;)V
    .registers 2

    iput-object p1, p0, LW6/i;->q:La7/d$c;

    return-void
.end method

.method protected final G0(Lcom/airbnb/lottie/LottieAnimationView;)V
    .registers 2

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const p0, 0x7f120002

    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    return-void
.end method

.method protected final H0(I)V
    .registers 2

    iput p1, p0, LW6/i;->v:I

    return-void
.end method

.method protected final I0()V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method protected final J0(Landroid/widget/Toolbar;)V
    .registers 4

    if-eqz p1, :cond_2c

    const v0, 0x7f0801d9

    invoke-virtual {p1, v0}, Landroid/widget/Toolbar;->setNavigationIcon(I)V

    const v0, 0x7f13004a

    invoke-virtual {p1, v0}, Landroid/widget/Toolbar;->setNavigationContentDescription(I)V

    invoke-virtual {p1}, Landroid/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_18

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    :cond_18
    invoke-virtual {p1}, Landroid/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2c

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x1010036

    invoke-static {p0, v0}, LH3/r;->a(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_2c
    return-void
.end method

.method protected final K0(LX6/d$a;)V
    .registers 5

    sget-object v0, La7/d$c;->q:La7/d$c$a;

    invoke-virtual {v0}, La7/d$c$a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_14

    invoke-virtual {p1}, LX6/d$a;->a()Ljava/lang/Exception;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_15

    :cond_14
    move-object v2, v1

    :goto_15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    return-void

    :cond_1c
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "requireContext(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_53

    sget-object v0, La7/d;->v:La7/d$b;

    if-eqz p1, :cond_34

    invoke-virtual {p1}, LX6/d$a;->a()Ljava/lang/Exception;

    move-result-object v2

    goto :goto_35

    :cond_34
    move-object v2, v1

    :goto_35
    invoke-virtual {v0, v2}, La7/d$b;->c(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_3f

    const p1, 0x7f13022e

    goto :goto_56

    :cond_3f
    if-eqz p1, :cond_45

    invoke-virtual {p1}, LX6/d$a;->a()Ljava/lang/Exception;

    move-result-object v1

    :cond_45
    invoke-virtual {v0, v1}, La7/d$b;->d(Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_4f

    const p1, 0x7f130232

    goto :goto_56

    :cond_4f
    const p1, 0x7f130214

    goto :goto_56

    :cond_53
    const p1, 0x7f13021e

    :goto_56
    invoke-direct {p0, p1}, LW6/i;->M0(I)V

    return-void
.end method

.method protected final L0()V
    .registers 2

    const v0, 0x7f13021e

    invoke-direct {p0, v0}, LW6/i;->M0(I)V

    return-void
.end method

.method public final N0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 4

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LW6/i;->s0()I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, LW6/i;->O0(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public final O0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 5

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LH6/d;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_c

    neg-int p2, p2

    :cond_c
    const/4 v0, 0x0

    iget-object p0, p0, LW6/i;->r:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p1, p2, v0, p0, p3}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(IILandroid/view/animation/Interpolator;I)V

    return-void
.end method

.method protected final P0()V
    .registers 1

    iget-object p0, p0, LW6/i;->s:Li6/k;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Li6/k;->g()V

    :cond_7
    return-void
.end method

.method public k0(Z)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->x0(Z)V

    return-void
.end method

.method protected final n0()LW6/e;
    .registers 1

    iget-object p0, p0, LW6/i;->t:LW6/e;

    return-object p0
.end method

.method public onAttach(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onAttach(Landroid/content/Context;)V

    invoke-direct {p0}, LW6/i;->u0()Landroidx/core/view/W;

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

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, LW6/i;->t:LW6/e;

    new-instance v0, LW6/f;

    invoke-direct {v0, p0}, LW6/f;-><init>(LW6/i;)V

    invoke-virtual {p1, v0}, LW6/e;->A(Lv8/a;)V

    return-void
.end method

.method public onDestroyView()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroyView()V

    iget-object p0, p0, LW6/i;->t:LW6/e;

    invoke-virtual {p0}, LW6/e;->o()V

    return-void
.end method

.method public onDetach()V
    .registers 3

    invoke-super {p0}, Landroidx/fragment/app/q;->onDetach()V

    invoke-direct {p0}, LW6/i;->u0()Landroidx/core/view/W;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "requireContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LH6/a;->b(Landroid/content/Context;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {v0, p0}, Landroidx/core/view/W;->d(Z)V

    return-void
.end method

.method public onStart()V
    .registers 3

    invoke-super {p0}, Landroidx/fragment/app/q;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->y0(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;)V

    return-void
.end method

.method public onStop()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/q;->onStop()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->y0(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;)V

    return-void
.end method

.method protected final q0()I
    .registers 1

    iget p0, p0, LW6/i;->u:I

    return p0
.end method

.method protected final r0()La7/d$c;
    .registers 1

    iget-object p0, p0, LW6/i;->q:La7/d$c;

    return-object p0
.end method

.method public final s0()I
    .registers 3

    sget-wide v0, LW6/i;->y:J

    long-to-int p0, v0

    return p0
.end method

.method protected final t0()I
    .registers 1

    iget p0, p0, LW6/i;->v:I

    return p0
.end method

.method protected final v0()V
    .registers 4

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v1, Li6/k;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "getApplicationContext(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Li6/k;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, LW6/i;->s:Li6/k;

    :cond_16
    return-void
.end method

.method protected final w0()Z
    .registers 4

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_1d

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_1d

    :cond_14
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_1b

    return v1

    :cond_1b
    const/4 p0, 0x0

    return p0

    :cond_1d
    :goto_1d
    return v1
.end method

.method protected final x0()Z
    .registers 2

    iget-object p0, p0, LW6/i;->q:La7/d$c;

    instance-of v0, p0, La7/d$c$e;

    if-nez v0, :cond_d

    instance-of p0, p0, La7/d$c$d;

    if-eqz p0, :cond_b

    goto :goto_d

    :cond_b
    const/4 p0, 0x0

    return p0

    :cond_d
    :goto_d
    const/4 p0, 0x1

    return p0
.end method

.method protected final y0()Z
    .registers 1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LH3/a;->j(Landroid/content/Context;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method protected final z0(Lcom/airbnb/lottie/LottieAnimationView;Z)V
    .registers 3

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    return-void

    :cond_b
    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->cancelAnimation()V

    return-void
.end method
