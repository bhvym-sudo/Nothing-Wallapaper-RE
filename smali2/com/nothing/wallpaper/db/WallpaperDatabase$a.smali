.class public final Lcom/nothing/wallpaper/db/WallpaperDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/db/WallpaperDatabase;
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
    invoke-direct {p0}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;
    .registers 3

    const-class p0, Lcom/nothing/wallpaper/db/WallpaperDatabase;

    const-string v0, "NTWallpaper.db"

    invoke-static {p1, p0, v0}, Lg1/p;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lg1/q$a;

    move-result-object p0

    new-instance p1, Lcom/nothing/wallpaper/db/WallpaperDatabase$a$a;

    invoke-direct {p1}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a$a;-><init>()V

    invoke-virtual {p0, p1}, Lg1/q$a;->a(Lg1/q$b;)Lg1/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lg1/q$a;->c()Lg1/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lg1/q$a;->b()Lg1/q;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/db/WallpaperDatabase;

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->B()Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v0

    if-nez v0, :cond_22

    monitor-enter p0

    :try_start_c
    invoke-static {}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->B()Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v0

    if-nez v0, :cond_1e

    sget-object v0, Lcom/nothing/wallpaper/db/WallpaperDatabase;->p:Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

    invoke-direct {v0, p1}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;->a(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v0

    invoke-static {v0}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->C(Lcom/nothing/wallpaper/db/WallpaperDatabase;)V
    :try_end_1b
    .catchall {:try_start_c .. :try_end_1b} :catchall_1c

    goto :goto_1e

    :catchall_1c
    move-exception p1

    goto :goto_20

    :cond_1e
    :goto_1e
    monitor-exit p0

    return-object v0

    :goto_20
    monitor-exit p0

    throw p1

    :cond_22
    return-object v0
.end method
