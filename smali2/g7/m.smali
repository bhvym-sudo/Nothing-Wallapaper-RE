.class public final Lg7/m;
.super Landroidx/fragment/app/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/m$a;
    }
.end annotation


# static fields
.field public static final s:Lg7/m$a;


# instance fields
.field private q:Z

.field private r:LF8/d0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lg7/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg7/m$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lg7/m;->s:Lg7/m$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    return-void
.end method

.method public static synthetic d0(Lg7/m;)Z
    .registers 1

    invoke-static {p0}, Lg7/m;->g0(Lg7/m;)Z

    move-result p0

    return p0
.end method

.method private final e0()Le7/a;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireParentFragment()Landroidx/fragment/app/q;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.customization.ui.callback.ScreenPreviewCallback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Le7/a;

    return-object p0
.end method

.method private final f0()V
    .registers 5

    iget-object v0, p0, Lg7/m;->r:LF8/d0;

    if-eqz v0, :cond_7

    invoke-interface {v0}, LF8/d0;->dispose()V

    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg7/m;->e0()Le7/a;

    move-result-object v2

    iget-boolean v3, p0, Lg7/m;->q:Z

    invoke-interface {v2, v3}, Le7/a;->r(Z)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lg7/l;

    invoke-direct {v3, p0}, Lg7/l;-><init>(Lg7/m;)V

    invoke-static {v0, v1, v2, v3}, Ld7/c;->b(Landroid/view/View;Landroidx/lifecycle/x;Ljava/util/List;Lv8/a;)LF8/d0;

    move-result-object v0

    goto :goto_2b

    :cond_2a
    const/4 v0, 0x0

    :goto_2b
    iput-object v0, p0, Lg7/m;->r:LF8/d0;

    return-void
.end method

.method private static final g0(Lg7/m;)Z
    .registers 4

    invoke-direct {p0}, Lg7/m;->e0()Le7/a;

    move-result-object v0

    iget-boolean v1, p0, Lg7/m;->q:Z

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Le7/a;->v(ZZ)Z

    move-result v0

    iget-boolean v1, p0, Lg7/m;->q:Z

    if-eqz v1, :cond_33

    if-nez v0, :cond_33

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v1

    invoke-interface {v1}, Lh3/H;->C()Ld3/a;

    move-result-object v1

    invoke-virtual {v1}, Ld3/a;->s()Z

    move-result v1

    if-eqz v1, :cond_33

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireParentFragment()Landroidx/fragment/app/q;

    move-result-object p0

    instance-of v0, p0, Lg3/f$a;

    if-eqz v0, :cond_2a

    check-cast p0, Lg3/f$a;

    goto :goto_2b

    :cond_2a
    const/4 p0, 0x0

    :goto_2b
    if-eqz p0, :cond_32

    const-string v0, "lock_screen_preview"

    invoke-interface {p0, v0}, Lg3/f$a;->P(Ljava/lang/String;)V

    :cond_32
    return v2

    :cond_33
    return v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_14

    const-string v1, "is_lock_screen"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_14

    move v0, v1

    :cond_14
    iput-boolean v0, p0, Lg7/m;->q:Z

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 5

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p3, 0x7f0d00b2

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/f;->e(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/g;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Le3/w;

    iget-boolean p2, p0, Lg7/m;->q:Z

    if-nez p2, :cond_2f

    iget-object p2, p1, Le3/w;->v:Landroid/view/View;

    const p3, 0x7f130253

    invoke-virtual {p0, p3}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object p0

    const p3, 0x7f0a03a0

    invoke-virtual {p2, p3, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_2f
    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/q;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lg7/m;->f0()V

    return-void
.end method
