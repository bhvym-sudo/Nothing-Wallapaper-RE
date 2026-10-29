.class public abstract Lr6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;IIILandroid/app/wallpaper/WallpaperDescription;)Z
    .registers 21

    :try_start_0
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    new-instance v8, Landroid/graphics/Rect;

    const/4 v0, 0x0

    invoke-direct {v8, v0, v0, v0, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v11, 0x0

    const/16 v4, 0x3e9

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p1

    move v9, p2

    move-object/from16 v3, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v10, p6

    move-object/from16 v12, p7

    invoke-interface/range {v1 .. v12}, Landroid/service/wallpaper/IWallpaperService;->attach(Landroid/service/wallpaper/IWallpaperConnection;Landroid/os/IBinder;IZIILandroid/graphics/Rect;IILandroid/app/WallpaperInfo;Landroid/app/wallpaper/WallpaperDescription;)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_22
    .catchall {:try_start_0 .. :try_end_22} :catchall_23

    goto :goto_2f

    :catchall_23
    move-exception v0

    move-object p0, v0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2f
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4d

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "attachBConnection fail, "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/nothing/wallpaper/common/log/c;->e(Ljava/lang/String;)V

    :cond_4d
    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_54

    const/4 p0, 0x0

    :cond_54
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;IIILandroid/app/wallpaper/WallpaperDescription;)Z
    .registers 16

    const-string v0, "wallpaperService"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "windowToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p7, :cond_1a

    new-instance p7, Landroid/app/wallpaper/WallpaperDescription$Builder;

    invoke-direct {p7}, Landroid/app/wallpaper/WallpaperDescription$Builder;-><init>()V

    invoke-virtual {p7}, Landroid/app/wallpaper/WallpaperDescription$Builder;->build()Landroid/app/wallpaper/WallpaperDescription;

    move-result-object p7

    :cond_1a
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move-object v7, p7

    invoke-static/range {v0 .. v7}, Lr6/h;->a(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;IIILandroid/app/wallpaper/WallpaperDescription;)Z

    move-result p0

    return p0
.end method

.method public static final c(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;II)Z
    .registers 7

    const-string v0, "wallpaperService"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "windowToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p5}, Lr6/h;->d(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;II)Z

    move-result p0

    if-eqz p0, :cond_17

    const/4 p0, 0x1

    return p0

    :cond_17
    const/4 p0, 0x0

    return p0
.end method

.method private static final d(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;II)Z
    .registers 18

    :try_start_0
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "attach"

    const-class v2, Landroid/service/wallpaper/IWallpaperConnection;

    const-class v3, Landroid/os/IBinder;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v8, Landroid/graphics/Rect;

    const-class v11, Landroid/app/WallpaperInfo;

    move-object v6, v4

    move-object v7, v4

    move-object v9, v4

    move-object v10, v4

    filled-new-array/range {v2 .. v11}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getMethod(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x3e9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-direct {v8, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x0

    move-object v2, p1

    move-object v3, p3

    filled-new-array/range {v2 .. v11}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_52
    .catchall {:try_start_0 .. :try_end_52} :catchall_53

    goto :goto_5f

    :catchall_53
    move-exception v0

    move-object p0, v0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_5f
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_7d

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "attachVConnection fail, "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/nothing/wallpaper/common/log/c;->e(Ljava/lang/String;)V

    :cond_7d
    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_84

    const/4 p0, 0x0

    :cond_84
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
