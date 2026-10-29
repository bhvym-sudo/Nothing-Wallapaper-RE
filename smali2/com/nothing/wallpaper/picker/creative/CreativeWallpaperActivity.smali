.class public final Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;
.super LN6/a;
.source "SourceFile"

# interfaces
.implements LS6/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;,
        Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;
    }
.end annotation


# static fields
.field public static final T:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;


# instance fields
.field private R:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;

.field private final S:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, LN6/a;-><init>()V

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;-><init>(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->S:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;

    return-void
.end method

.method public static final synthetic w0(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;)Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->R:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;

    return-object p0
.end method


# virtual methods
.method public A()V
    .registers 2

    new-instance v0, LW6/x;

    invoke-direct {v0}, LW6/x;-><init>()V

    invoke-virtual {p0, v0}, LN6/a;->v0(Landroidx/fragment/app/q;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .registers 4

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/v;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_c

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_c
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, LN6/a;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d002b

    invoke-virtual {p0, p1}, Lb/j;->setContentView(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p1

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a01f5

    invoke-virtual {p1, v0}, Landroidx/fragment/app/J;->j0(I)Landroidx/fragment/app/q;

    move-result-object v1

    if-nez v1, :cond_2b

    new-instance v1, LW6/U;

    invoke-direct {v1}, LW6/U;-><init>()V

    invoke-virtual {p1}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/S;->b(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/S;->i()I

    :cond_2b
    invoke-virtual {p0}, Lb/j;->f()Lb/v;

    move-result-object p1

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->S:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;

    invoke-virtual {p1, p0, v0}, Lb/v;->h(Landroidx/lifecycle/x;Lb/u;)V

    sget-object p1, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_40

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;->b(Landroid/content/Context;Z)V

    :cond_40
    return-void
.end method

.method protected onDestroy()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/v;->onDestroy()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->S:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;

    invoke-virtual {p0}, Lb/u;->h()V

    return-void
.end method

.method protected onStart()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/v;->onStart()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const-string v0, "getWindow(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LH6/e;->a(Landroid/view/Window;)V

    return-void
.end method

.method public final x0(Z)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->S:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;

    invoke-virtual {p0, p1}, Lb/u;->j(Z)V

    return-void
.end method

.method public final y0(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->R:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;

    return-void
.end method
