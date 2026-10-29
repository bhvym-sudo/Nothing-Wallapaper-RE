.class public final Ls6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls6/j;

.field public static b:Landroid/content/Context;

.field private static final c:Ljava/util/Map;

.field private static final d:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ls6/j;

    invoke-direct {v0}, Ls6/j;-><init>()V

    sput-object v0, Ls6/j;->a:Ls6/j;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Ls6/j;->c:Ljava/util/Map;

    new-instance v0, Lq6/b;

    const-string v1, "WallpaperConnectionHolder"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ls6/j;->d:Lq6/b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ls6/j;Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;ILjava/lang/Object;)Ls6/p;
    .registers 7

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_5

    const/4 p4, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2, p3, p4}, Ls6/j;->a(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ls6/j;Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;ILjava/lang/Object;)Ls6/p;
    .registers 7

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_5

    const/4 p4, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2, p3, p4}, Ls6/j;->d(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;
    .registers 8

    monitor-enter p0

    :try_start_1
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whichPreview"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/j;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1f

    sget-object v1, Ls6/j;->a:Ls6/j;

    invoke-virtual {v1, p1, p2, p3, p4}, Ls6/j;->d(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1f

    :catchall_1d
    move-exception p1

    goto :goto_3c

    :cond_1f
    :goto_1f
    check-cast v1, Ls6/p;

    invoke-virtual {v1}, Ls6/p;->k0()LH3/C$d;

    move-result-object v0

    invoke-virtual {v0}, LH3/C$d;->e()I

    move-result v0

    invoke-virtual {p3}, LH3/C$d;->e()I

    move-result v2

    if-ne v0, v2, :cond_36

    invoke-virtual {v1}, Ls6/p;->g0()I

    move-result v0

    if-ne v0, p2, :cond_36

    goto :goto_3a

    :cond_36
    invoke-virtual {p0, p1, p2, p3, p4}, Ls6/j;->d(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;

    move-result-object v1
    :try_end_3a
    .catchall {:try_start_1 .. :try_end_3a} :catchall_1d

    :goto_3a
    monitor-exit p0

    return-object v1

    :goto_3c
    :try_start_3c
    monitor-exit p0
    :try_end_3d
    .catchall {:try_start_3c .. :try_end_3d} :catchall_1d

    throw p1
.end method

.method public final c()Landroid/content/Context;
    .registers 1

    sget-object p0, Ls6/j;->b:Landroid/content/Context;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "appContext"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final declared-synchronized d(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;
    .registers 13

    monitor-enter p0

    :try_start_1
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whichPreview"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/j;->d:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new WallpaperConnectionInternal for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    sget-boolean v0, Lcom/android/launcher3/w;->i:Z

    if-eqz v0, :cond_36

    new-instance v1, Ls6/p;

    invoke-virtual {p0}, Ls6/j;->c()Landroid/content/Context;

    move-result-object v3

    move-object v2, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ls6/p;-><init>(Landroid/content/ComponentName;Landroid/content/Context;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)V

    goto :goto_47

    :catchall_33
    move-exception v0

    move-object p1, v0

    goto :goto_49

    :cond_36
    move-object v1, p1

    move v3, p2

    move-object v4, p3

    new-instance v0, Ls6/p;

    invoke-virtual {p0}, Ls6/j;->c()Landroid/content/Context;

    move-result-object v2

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ls6/p;-><init>(Landroid/content/ComponentName;Landroid/content/Context;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;ILkotlin/jvm/internal/h;)V
    :try_end_46
    .catchall {:try_start_1 .. :try_end_46} :catchall_33

    move-object v1, v0

    :goto_47
    monitor-exit p0

    return-object v1

    :goto_49
    :try_start_49
    monitor-exit p0
    :try_end_4a
    .catchall {:try_start_49 .. :try_end_4a} :catchall_33

    throw p1
.end method

.method public final declared-synchronized f(Landroid/content/ComponentName;)V
    .registers 5

    monitor-enter p0

    :try_start_1
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/j;->d:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remove WallpaperConnectionInternal for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object v0, Ls6/j;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_21
    .catchall {:try_start_1 .. :try_end_21} :catchall_23

    monitor-exit p0

    return-void

    :catchall_23
    move-exception p1

    :try_start_24
    monitor-exit p0
    :try_end_25
    .catchall {:try_start_24 .. :try_end_25} :catchall_23

    throw p1
.end method

.method public final g(Landroid/content/Context;)V
    .registers 2

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Ls6/j;->b:Landroid/content/Context;

    return-void
.end method
