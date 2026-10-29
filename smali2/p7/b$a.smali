.class public final Lp7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lp7/b$a;-><init>()V

    return-void
.end method

.method private final b(Landroid/app/WallpaperInfo;Landroid/content/Context;)Landroid/content/Intent;
    .registers 6

    invoke-virtual {p1}, Landroid/app/WallpaperInfo;->getSettingsActivity()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_8

    return-object v0

    :cond_8
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/app/WallpaperInfo;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string p0, "android.service.wallpaper.PREVIEW_MODE"

    const/4 p1, 0x1

    invoke-virtual {v1, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v1, p0, p1}, Landroid/content/Intent;->resolveActivityInfo(Landroid/content/pm/PackageManager;I)Landroid/content/pm/ActivityInfo;

    move-result-object p0

    if-eqz p0, :cond_2b

    return-object v1

    :cond_2b
    return-object v0
.end method


# virtual methods
.method public final a(Lg3/x;Landroid/content/Context;)Lp7/b;
    .registers 5

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-virtual {p1}, Lg3/x;->q()Landroid/app/WallpaperInfo;

    move-result-object p1

    const-string v1, "getWallpaperComponent(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lp7/b$a;->b(Landroid/app/WallpaperInfo;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_42

    sget-object p1, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_43

    :cond_2a
    invoke-static {p1, p2}, LG6/e;->g(Lg3/x;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_35

    sget-object p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_35
    sget-object p0, LF6/a;->a:LF6/a$a;

    invoke-virtual {p0}, LF6/a$a;->a()Z

    move-result p0

    if-eqz p0, :cond_42

    sget-object p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_42
    const/4 p0, 0x0

    :goto_43
    new-instance p1, Lp7/b;

    invoke-direct {p1, v0, p0}, Lp7/b;-><init>(Ljava/util/List;Landroid/content/Intent;)V

    return-object p1
.end method
