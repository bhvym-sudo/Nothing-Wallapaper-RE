.class public final Lo7/h;
.super Lo7/b;
.source "SourceFile"


# instance fields
.field private final j:Lp7/a;

.field private final k:LD6/f;

.field private final l:LI8/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lp7/a;Lg3/x;LD6/f;)V
    .registers 6

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editFrom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperDataSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3}, Lo7/b;-><init>(Landroid/content/Context;Lg3/x;)V

    iput-object p2, p0, Lo7/h;->j:Lp7/a;

    iput-object p4, p0, Lo7/h;->k:LD6/f;

    invoke-interface {p4}, LD6/f;->S()LI8/f;

    move-result-object p1

    iput-object p1, p0, Lo7/h;->l:LI8/f;

    invoke-virtual {p0}, Lo7/b;->i()Landroidx/lifecycle/H;

    move-result-object p0

    sget-object p1, Lm7/a$c;->a:Lm7/a$c;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/H;->n(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected d()V
    .registers 1

    invoke-super {p0}, Landroidx/lifecycle/a0;->d()V

    iget-object p0, p0, Lo7/h;->k:LD6/f;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public k()LI8/f;
    .registers 1

    iget-object p0, p0, Lo7/h;->l:LI8/f;

    return-object p0
.end method

.method public final w()V
    .registers 1

    invoke-virtual {p0}, Lo7/h;->d()V

    return-void
.end method

.method public final x()Landroid/content/ComponentName;
    .registers 2

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object p0

    invoke-virtual {p0}, Lg3/x;->q()Landroid/app/WallpaperInfo;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    const-string v0, "getComponent(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final y()Landroid/content/Intent;
    .registers 3

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object p0

    invoke-virtual {p0}, Lg3/x;->q()Landroid/app/WallpaperInfo;

    move-result-object p0

    if-eqz p0, :cond_1e

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.service.wallpaper.WallpaperService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getServiceName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0

    :cond_1e
    const/4 p0, 0x0

    return-object p0
.end method

.method public final z()Z
    .registers 2

    iget-object p0, p0, Lo7/h;->j:Lp7/a;

    sget-object v0, Lp7/a$c;->b:Lp7/a$c$a;

    invoke-virtual {v0}, Lp7/a$c$a;->a()Lp7/a$c;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
