.class public abstract LG6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg3/x;LC6/g;Landroid/app/WallpaperColors;Landroid/content/Context;)LJ6/a;
    .registers 11

    const-string v0, "origin"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effectInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ6/a;

    new-instance v1, Landroid/app/WallpaperInfo;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-static {p3}, LG6/e;->d(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v4

    const-wide/16 v5, 0x80

    invoke-static {v5, v6}, Landroid/content/pm/PackageManager$ResolveInfoFlags;->of(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/app/WallpaperInfo;-><init>(Landroid/content/Context;Landroid/content/pm/ResolveInfo;)V

    new-instance v2, Lg3/x$a;

    invoke-direct {v2, p2}, Lg3/x$a;-><init>(Landroid/app/WallpaperColors;)V

    invoke-direct {v0, p0, v1, p1, v2}, LJ6/a;-><init>(Lg3/x;Landroid/app/WallpaperInfo;LC6/g;Lg3/x$a;)V

    invoke-virtual {p0}, Lg3/x;->t()Z

    move-result p1

    if-eqz p1, :cond_47

    invoke-virtual {p0}, Lg3/x;->s()Z

    move-result p0

    if-nez p0, :cond_47

    const/4 p0, 0x1

    goto :goto_48

    :cond_47
    const/4 p0, 0x0

    :goto_48
    invoke-virtual {v0, p0}, Lg3/x;->w(Z)V

    sget-boolean p0, Lcom/android/launcher3/w;->i:Z

    if-eqz p0, :cond_6a

    const-string p0, "com.nothing.blurwallpaper.AtmosphereWallpaperService"

    invoke-static {p3, p0}, Landroid/content/ComponentName;->createRelative(Landroid/content/Context;Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p0

    const-string p1, "createRelative(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/app/wallpaper/WallpaperDescription$Builder;

    invoke-direct {p1}, Landroid/app/wallpaper/WallpaperDescription$Builder;-><init>()V

    invoke-virtual {p1, p0}, Landroid/app/wallpaper/WallpaperDescription$Builder;->setComponent(Landroid/content/ComponentName;)Landroid/app/wallpaper/WallpaperDescription$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/wallpaper/WallpaperDescription$Builder;->build()Landroid/app/wallpaper/WallpaperDescription;

    move-result-object p0

    invoke-virtual {v0, p0}, Lg3/k;->C(Landroid/app/wallpaper/WallpaperDescription;)V

    :cond_6a
    return-object v0
.end method

.method public static final b(Landroid/content/Context;)Lx6/c;
    .registers 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx6/c;

    invoke-static {p0}, Ln6/a;->b(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/c;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public static final c(Landroid/content/Context;)Lx6/c;
    .registers 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx6/c;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget-object v1, Lq5/n;->a:Lq5/n;

    invoke-virtual {v1}, Lq5/n;->l()I

    move-result v1

    invoke-static {p0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string v1, "decodeResource(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lx6/c;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public static final d(Landroid/content/Context;)Landroid/content/Intent;
    .registers 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, Lcom/nothing/blurwallpaper/AtmosphereWallpaperService;->v:Lcom/nothing/blurwallpaper/AtmosphereWallpaperService$b;

    const-class v1, Lcom/nothing/blurwallpaper/AtmosphereWallpaperService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "android.service.wallpaper.WallpaperService"

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public static final e(Lg3/x;Landroid/content/Context;)Lcom/android/wallpaper/asset/a;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/e;->i(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {p1}, LG6/e;->b(Landroid/content/Context;)Lx6/c;

    move-result-object p0

    return-object p0

    :cond_15
    invoke-virtual {p0, p1}, Lg3/x;->d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final f(Landroid/content/Context;)I
    .registers 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1010031

    invoke-static {p0, v0}, LH3/r;->a(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method

.method public static final g(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/e;->s(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {p0, p1}, LG6/e;->k(Lg3/x;Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method public static final h(Landroid/app/WallpaperInfo;)Z
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    if-eqz p0, :cond_10

    invoke-virtual {p0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object p0

    goto :goto_11

    :cond_10
    const/4 p0, 0x0

    :goto_11
    const-string v0, "com.nothing.wallpaper/com.nothing.blurwallpaper.AtmosphereWallpaperService"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final i(Lg3/x;)Z
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lg3/k;

    if-eqz v0, :cond_27

    check-cast p0, Lg3/k;

    invoke-virtual {p0}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object p0

    if-eqz p0, :cond_1c

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    if-eqz p0, :cond_1c

    invoke-virtual {p0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1d

    :cond_1c
    const/4 p0, 0x0

    :goto_1d
    const-string v0, "com.nothing.wallpaper/com.nothing.blurwallpaper.AtmosphereWallpaperService"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_27

    const/4 p0, 0x1

    return p0

    :cond_27
    const/4 p0, 0x0

    return p0
.end method

.method public static final j(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "cape_category"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final k(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LJ6/c;

    if-nez v0, :cond_17

    invoke-static {p0, p1}, LG6/e;->l(Lg3/x;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_15

    goto :goto_17

    :cond_15
    const/4 p0, 0x0

    return p0

    :cond_17
    :goto_17
    const/4 p0, 0x1

    return p0
.end method

.method public static final l(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "color_category"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final m(Lg3/x;)Z
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/e;->n(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {p0}, LG6/e;->i(Lg3/x;)Z

    move-result p0

    if-nez p0, :cond_13

    const/4 p0, 0x1

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public static final n(Lg3/x;)Z
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, Lg3/k;

    return p0
.end method

.method public static final o(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, LJ6/i;->F:LJ6/i$a;

    invoke-virtual {v0, p1}, LJ6/i$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final p(Lg3/x;Landroid/content/Context;)Z
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nothing_category"

    const-string v1, "category1"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final q(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LG6/e;->l(Lg3/x;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_24

    invoke-static {p0, p1}, LG6/e;->p(Lg3/x;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_24

    invoke-static {p0, p1}, LG6/e;->j(Lg3/x;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_24

    invoke-static {p0}, LG6/e;->s(Lg3/x;)Z

    move-result p0

    if-eqz p0, :cond_24

    const/4 p0, 0x1

    return p0

    :cond_24
    const/4 p0, 0x0

    return p0
.end method

.method public static final r(Lg3/x;Landroid/content/Context;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg3/x;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1c

    const v0, 0x7f130112

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1c
    const/4 p0, 0x0

    return p0
.end method

.method public static final s(Lg3/x;)Z
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/e;->n(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {p0}, LG6/e;->i(Lg3/x;)Z

    move-result p0

    if-eqz p0, :cond_12

    goto :goto_14

    :cond_12
    const/4 p0, 0x0

    return p0

    :cond_14
    :goto_14
    const/4 p0, 0x1

    return p0
.end method
