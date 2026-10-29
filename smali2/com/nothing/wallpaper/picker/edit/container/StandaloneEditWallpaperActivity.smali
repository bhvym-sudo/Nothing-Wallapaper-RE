.class public final Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;
.super Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity$a;
    }
.end annotation


# static fields
.field public static final V:Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity$a;


# instance fields
.field private final U:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->V:Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;-><init>()V

    new-instance v0, Lq6/b;

    invoke-direct {v0, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->U:Lq6/b;

    return-void
.end method

.method private final x0()Z
    .registers 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method private final y0(Landroid/net/Uri;)Z
    .registers 5

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/content/Context;->checkUriPermission(Landroid/net/Uri;III)I

    move-result p0

    if-nez p0, :cond_10

    return v2

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method private final z0()V
    .registers 7

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2a

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "com.google.android.apps.photos.contentprovider"

    const/4 v5, 0x0

    invoke-static {v0, v4, v5, v2, v3}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-ne v0, v1, :cond_2a

    new-instance v0, Lg3/i;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lg3/i;-><init>(Landroid/net/Uri;I)V

    goto :goto_37

    :cond_2a
    new-instance v0, Lg3/i;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v2}, Lg3/i;-><init>(Landroid/net/Uri;)V

    :goto_37
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.android.wallpaper.picker.asset_id_present"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    sget-object v2, Lp7/a$a;->b:Lp7/a$a;

    invoke-virtual {p0, v0, v2, v1}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->w0(Lg3/x;Lp7/a;Z)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 6

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_19

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->U:Lq6/b;

    const-string v0, "No URI passed in intent; exiting StandaloneEditWallpaperActivity"

    invoke-virtual {p1, v0}, Lq6/b;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_19
    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->y0(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_28

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->x0()Z

    move-result v0

    if-eqz v0, :cond_28

    move v0, v1

    goto :goto_29

    :cond_28
    const/4 v0, 0x0

    :goto_29
    if-nez v0, :cond_37

    if-eqz p1, :cond_37

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->U:Lq6/b;

    const-string v3, "Since we lack image permissions, let\u2019s clear savedInstanceState to prevent fragment restoration."

    invoke-virtual {v2, v3}, Lq6/b;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Bundle;->clear()V

    :cond_37
    invoke-super {p0, p1}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz v0, :cond_40

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->z0()V

    return-void

    :cond_40
    const-string p1, "android.permission.READ_MEDIA_IMAGES"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 6

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/v;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3c

    array-length p1, p2

    const/4 v1, 0x0

    if-nez p1, :cond_16

    move p1, v0

    goto :goto_17

    :cond_16
    move p1, v1

    :goto_17
    if-nez p1, :cond_32

    aget-object p1, p2, v1

    const-string p2, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_32

    array-length p1, p3

    if-nez p1, :cond_27

    goto :goto_28

    :cond_27
    move v0, v1

    :goto_28
    if-nez v0, :cond_32

    aget p1, p3, v1

    if-nez p1, :cond_32

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->z0()V

    return-void

    :cond_32
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/edit/container/StandaloneEditWallpaperActivity;->U:Lq6/b;

    const-string p2, "image uri permission denial, finish activity."

    invoke-virtual {p1, p2}, Lq6/b;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_3c
    return-void
.end method

.method public q()Z
    .registers 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v0, "up_arrow"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method
