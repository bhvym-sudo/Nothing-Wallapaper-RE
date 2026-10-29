.class public final Lh7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# instance fields
.field private final q:Landroidx/fragment/app/v;

.field private final r:Li7/g;

.field private final s:Landroidx/lifecycle/x;

.field private final t:Lg3/f$a;

.field private final u:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/v;Li7/g;Landroidx/lifecycle/x;Lg3/f$a;Z)V
    .registers 7

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/o;->q:Landroidx/fragment/app/v;

    iput-object p2, p0, Lh7/o;->r:Li7/g;

    iput-object p3, p0, Lh7/o;->s:Landroidx/lifecycle/x;

    iput-object p4, p0, Lh7/o;->t:Lg3/f$a;

    iput-boolean p5, p0, Lh7/o;->u:Z

    return-void
.end method

.method public static synthetic b(Lh7/o;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lh7/o;->g(Lh7/o;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lh7/o;)Lh8/A;
    .registers 2

    iget-object p0, p0, Lh7/o;->t:Lg3/f$a;

    new-instance v0, Lcom/android/wallpaper/picker/g;

    invoke-direct {v0}, Lcom/android/wallpaper/picker/g;-><init>()V

    invoke-interface {p0, v0}, Lg3/f$a;->g(Landroidx/fragment/app/q;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lh7/o;->q:Landroidx/fragment/app/v;

    iget-object v4, p0, Lh7/o;->r:Li7/g;

    iget-object v5, p0, Lh7/o;->s:Landroidx/lifecycle/x;

    new-instance v6, Lh7/n;

    invoke-direct {v6, p0}, Lh7/n;-><init>(Lh7/o;)V

    move-object v3, p1

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->d(Landroidx/fragment/app/v;Landroid/content/Context;Landroid/view/View;Li7/g;Landroidx/lifecycle/x;Lv8/a;)V

    return-object v3
.end method

.method public e(Landroid/content/Context;)Z
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public bridge synthetic f(Landroid/content/Context;)Li3/s0;
    .registers 2

    invoke-virtual {p0, p1}, Lh7/o;->i(Landroid/content/Context;)Lcom/android/wallpaper/picker/customization/ui/section/WallpaperQuickSwitchView;

    move-result-object p0

    return-object p0
.end method

.method public i(Landroid/content/Context;)Lcom/android/wallpaper/picker/customization/ui/section/WallpaperQuickSwitchView;
    .registers 3

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lh8/n;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "An operation is not implemented: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Not yet implemented"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lh8/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method
