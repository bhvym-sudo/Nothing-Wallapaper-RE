.class public final Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->a:Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/v;Lg3/x;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->g(Landroidx/fragment/app/v;Lg3/x;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lv8/a;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->e(Lv8/a;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic c(Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->f(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    return-void
.end method

.method public static final d(Landroidx/fragment/app/v;Landroid/content/Context;Landroid/view/View;Li7/g;Landroidx/lifecycle/x;Lv8/a;)V
    .registers 16

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigateToFullWallpaperSelector"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0297

    invoke-virtual {p2, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v0

    check-cast v8, Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {v8}, LH6/d;->f(Landroid/view/View;)V

    new-instance v0, Ld7/n;

    invoke-direct {v0, p5}, Ld7/n;-><init>(Lv8/a;)V

    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p5, 0x7f0a0463

    invoke-virtual {p2, p5}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v7, p2

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    new-instance p5, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$bind$suggestedWallpaperRV$1$1;

    invoke-direct {p5}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$bind$suggestedWallpaperRV$1$1;-><init>()V

    invoke-virtual {v7, p5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    const-string p5, "apply(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v2, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;

    const/4 v9, 0x0

    move-object v6, p0

    move-object v5, p1

    move-object v4, p3

    move-object v3, p4

    invoke-direct/range {v2 .. v9}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder$a;-><init>(Landroidx/lifecycle/x;Li7/g;Landroid/content/Context;Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Lcom/nothing/wallpaper/widget/MoreGuideView;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private static final e(Lv8/a;Landroid/view/View;)V
    .registers 2

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0}, LR7/d;->j()V

    return-void
.end method

.method private final f(Landroidx/fragment/app/v;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
    .registers 5

    new-instance p0, Lc7/b;

    new-instance v0, Ld7/o;

    invoke-direct {v0, p1}, Ld7/o;-><init>(Landroidx/fragment/app/v;)V

    invoke-direct {p0, p3, v0}, Lc7/b;-><init>(Ljava/util/List;Lv8/l;)V

    invoke-virtual {p2, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private static final g(Landroidx/fragment/app/v;Lg3/x;)Lh8/A;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->a:Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;

    invoke-direct {v0, p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->h(Landroidx/fragment/app/v;Lg3/x;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final h(Landroidx/fragment/app/v;Lg3/x;)V
    .registers 5

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p0

    invoke-interface {p0, p1}, Lh3/H;->A(Landroid/content/Context;)Lh3/U;

    move-result-object p0

    invoke-interface {p0, p2}, Lh3/U;->e(Lg3/x;)V

    new-instance p0, Lcom/android/wallpaper/picker/PreviewActivity$a;

    invoke-direct {p0}, Lcom/android/wallpaper/picker/PreviewActivity$a;-><init>()V

    instance-of v0, p2, Lg3/k;

    const/4 v1, 0x1

    if-eqz v0, :cond_17

    const/4 v0, 0x4

    goto :goto_18

    :cond_17
    move v0, v1

    :goto_18
    invoke-virtual {p2, p1, p0, v0, v1}, Lg3/x;->x(Landroid/app/Activity;Lg3/j;IZ)V

    return-void
.end method
