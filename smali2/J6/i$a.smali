.class public final LJ6/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/i;
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
    invoke-direct {p0}, LJ6/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    if-eqz p1, :cond_d

    const p0, 0x7f13020f

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_c

    goto :goto_d

    :cond_c
    return-object p0

    :cond_d
    :goto_d
    const-string p0, ""

    return-object p0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x63

    invoke-virtual {p0, p1, p2, v0}, LJ6/i$a;->c(Landroid/content/Context;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final c(Landroid/content/Context;Ljava/lang/String;I)Ljava/util/List;
    .registers 15

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LU6/e;->c:LU6/e$a;

    invoke-virtual {v0}, LU6/e$a;->b()LU6/e;

    move-result-object v0

    invoke-virtual {v0}, LU6/e;->e()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/nothing/wallpaper/db/WallpaperDatabase;->p:Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;->b(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->D()Lu6/a;

    move-result-object v1

    invoke-interface {v1, p3}, Lu6/a;->d(I)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_33
    :goto_33
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_86

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getFilePath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_33

    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1301f2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v2, "getString(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LJ6/i;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getFilePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v1}, LJ6/i$a;->f(Lcom/nothing/wallpaper/db/CreativeWallpaper;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageUrl()Ljava/lang/String;

    move-result-object v10

    move-object v6, p2

    invoke-direct/range {v4 .. v10}, LJ6/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_33

    :cond_86
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;
    .registers 4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "+"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final e()Ljava/lang/String;
    .registers 3

    sget-object p0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Wallpaper Studio"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final f(Lcom/nothing/wallpaper/db/CreativeWallpaper;)Ljava/lang/String;
    .registers 3

    const-string p0, "wallpaperInfo"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectLoc()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_12

    goto :goto_17

    :cond_12
    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectLoc()Ljava/lang/String;

    move-result-object p0

    goto :goto_1b

    :cond_17
    :goto_17
    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectEn()Ljava/lang/String;

    move-result-object p0

    :goto_1b
    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleLoc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2d

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_28

    goto :goto_2d

    :cond_28
    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleLoc()Ljava/lang/String;

    move-result-object p1

    goto :goto_31

    :cond_2d
    :goto_2d
    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleEn()Ljava/lang/String;

    move-result-object p1

    :goto_31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " + "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
