.class public final Lr7/c;
.super Li2/f;
.source "SourceFile"


# instance fields
.field private final I:Landroid/app/Activity;

.field private final J:Landroidx/lifecycle/x;

.field private final K:Lg3/z;

.field private final L:Lw7/b;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/lifecycle/x;Lh3/d$a;Lh3/c;Lg3/v;LH3/k;Lg3/z;Lt3/a;LJ1/a;Lw7/b;Landroid/app/WallpaperManager;Z)V
    .registers 26

    move-object/from16 v7, p7

    move-object/from16 v12, p10

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screen"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperInfoFactory"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorViewModel"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayUtils"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperPreviewNavigator"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperInteractor"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themedIconInteractor"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launcherGridInteractor"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperManager"

    move-object/from16 v10, p11

    invoke-static {v10, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move/from16 v11, p12

    invoke-direct/range {v0 .. v11}, Li2/f;-><init>(Landroid/app/Activity;Landroidx/lifecycle/x;Lh3/d$a;Lh3/c;Lg3/v;LH3/k;Lg3/z;Lt3/a;LJ1/a;Landroid/app/WallpaperManager;Z)V

    iput-object p1, p0, Lr7/c;->I:Landroid/app/Activity;

    iput-object p2, p0, Lr7/c;->J:Landroidx/lifecycle/x;

    iput-object v7, p0, Lr7/c;->K:Lg3/z;

    iput-object v12, p0, Lr7/c;->L:Lw7/b;

    return-void
.end method

.method public static synthetic F(Lv8/a;Lr7/c;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lr7/c;->N(Lv8/a;Lr7/c;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lv8/a;Lr7/c;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lr7/c;->M(Lv8/a;Lr7/c;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic H(Lr7/c;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lw3/d;->u(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I(Lr7/c;)Lg3/z;
    .registers 1

    iget-object p0, p0, Lr7/c;->K:Lg3/z;

    return-object p0
.end method

.method public static final synthetic J(Lr7/c;)Z
    .registers 1

    invoke-virtual {p0}, Lw3/d;->v()Z

    move-result p0

    return p0
.end method

.method private final K(Landroid/view/ViewGroup;)V
    .registers 4

    iget-object v0, p0, Lr7/c;->I:Landroid/app/Activity;

    const-string v1, "null cannot be cast to non-null type androidx.activity.ComponentActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb/j;

    iget-object p0, p0, Lr7/c;->J:Landroidx/lifecycle/x;

    invoke-static {v0, p0, p1}, LG7/s;->d(Lb/j;Landroidx/lifecycle/x;Landroid/view/ViewGroup;)LG7/s$a;

    return-void
.end method

.method private static final M(Lv8/a;Lr7/c;Landroid/view/View;)V
    .registers 3

    new-instance p2, Lr7/b;

    invoke-direct {p2, p0, p1}, Lr7/b;-><init>(Lv8/a;Lr7/c;)V

    invoke-static {p2}, Li6/b;->a(Lv8/a;)V

    return-void
.end method

.method private static final N(Lv8/a;Lr7/c;)Lh8/A;
    .registers 8

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_1f

    iget-object p0, p1, Lr7/c;->J:Landroidx/lifecycle/x;

    invoke-static {p0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v3, Lr7/c$a;

    const/4 p0, 0x0

    invoke-direct {v3, p1, p0}, Lr7/c$a;-><init>(Lr7/c;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_1f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final L(Landroid/view/View;Lv8/a;)V
    .registers 4

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highPriorityClickEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr7/a;

    invoke-direct {v0, p2, p0}, Lr7/a;-><init>(Lv8/a;Lr7/c;)V

    const p0, 0x7f0a0398

    invoke-virtual {p1, p0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/android/wallpaper/picker/FixedWidthDisplayRatioFrameLayout;

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0398

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/wallpaper/picker/FixedWidthDisplayRatioFrameLayout;

    invoke-virtual {p0}, Lw3/d;->v()Z

    move-result v2

    const v3, 0x7f0a0387

    if-eqz v2, :cond_47

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v2

    invoke-interface {v2}, Lh3/H;->C()Ld3/a;

    move-result-object v2

    invoke-virtual {v2}, Ld3/a;->s()Z

    move-result v2

    if-nez v2, :cond_30

    goto :goto_47

    :cond_30
    const p0, 0x7f130134

    invoke-virtual {p2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-object v0

    :cond_47
    :goto_47
    invoke-virtual {p1, v3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/cardview/widget/CardView;

    invoke-virtual {p0, v2, p2}, Lw3/d;->n(Landroidx/cardview/widget/CardView;Landroid/content/Context;)V

    invoke-virtual {p0}, Lw3/d;->v()Z

    move-result p2

    if-eqz p2, :cond_76

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p2

    invoke-interface {p2}, Lh3/H;->C()Ld3/a;

    move-result-object p2

    invoke-virtual {p2}, Ld3/a;->m()Z

    move-result p2

    if-eqz p2, :cond_76

    const p2, 0x7f0a02bc

    invoke-virtual {p1, p2}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    invoke-direct {p0, p1}, Lr7/c;->K(Landroid/view/ViewGroup;)V

    :cond_76
    return-object v0
.end method

.method protected p(Landroid/content/Context;)Lx3/d;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Li2/f;->p(Landroid/content/Context;)Lx3/d;

    move-result-object p1

    invoke-virtual {p1}, Lx3/d;->i()Lh3/d$a;

    move-result-object v0

    sget-object v1, Lh3/d$a;->r:Lh3/d$a;

    if-ne v0, v1, :cond_21

    instance-of v0, p1, Lj2/a;

    if-eqz v0, :cond_19

    move-object v0, p1

    check-cast v0, Lj2/a;

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    if-eqz v0, :cond_21

    iget-object p0, p0, Lr7/c;->L:Lw7/b;

    invoke-virtual {v0, p0}, Lj2/a;->s(Lw7/b;)V

    :cond_21
    return-object p1
.end method
