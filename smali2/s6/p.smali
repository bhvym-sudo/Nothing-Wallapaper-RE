.class public final Ls6/p;
.super Landroid/service/wallpaper/IWallpaperConnection$Stub;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/p$a;
    }
.end annotation


# static fields
.field public static final J:Ls6/p$a;

.field private static final K:Lq6/b;

.field private static final L:Landroid/os/HandlerThread;

.field private static final M:Landroid/os/Handler;


# instance fields
.field private volatile A:Z

.field private B:Landroid/service/wallpaper/IWallpaperService;

.field private volatile C:Landroid/service/wallpaper/IWallpaperEngine;

.field private D:Z

.field private E:Z

.field private F:Landroid/graphics/Point;

.field private final G:Ljava/util/List;

.field private H:I

.field private I:I

.field private final q:Landroid/content/ComponentName;

.field private final r:Landroid/content/Context;

.field private final s:I

.field private final t:LH3/C$d;

.field private final u:Landroid/app/wallpaper/WallpaperDescription;

.field private final v:Landroid/content/Intent;

.field private final w:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private final x:Ls6/b;

.field private final y:Ljava/lang/Runnable;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ls6/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls6/p$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ls6/p;->J:Ls6/p$a;

    new-instance v0, Lq6/b;

    const-string v1, "WallpaperConnectionInternal"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ls6/p;->K:Lq6/b;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "shared_wallpaper_connection_worker"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    sput-object v0, Ls6/p;->L:Landroid/os/HandlerThread;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Ls6/p;->M:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/ComponentName;Landroid/content/Context;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)V
    .registers 12

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whichPreview"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroid/service/wallpaper/IWallpaperConnection$Stub;-><init>()V

    .line 3
    iput-object p1, p0, Ls6/p;->q:Landroid/content/ComponentName;

    .line 4
    iput-object p2, p0, Ls6/p;->r:Landroid/content/Context;

    .line 5
    iput p3, p0, Ls6/p;->s:I

    .line 6
    iput-object p4, p0, Ls6/p;->t:LH3/C$d;

    .line 7
    iput-object p5, p0, Ls6/p;->u:Landroid/app/wallpaper/WallpaperDescription;

    .line 8
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.service.wallpaper.WallpaperService"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p3

    .line 10
    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    iput-object p2, p0, Ls6/p;->v:Landroid/content/Intent;

    .line 13
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    new-instance v0, Ls6/b;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ls6/b;-><init>(Ls6/a;Ls6/a$e;ZILkotlin/jvm/internal/h;)V

    iput-object v0, p0, Ls6/p;->x:Ls6/b;

    .line 15
    new-instance p1, Ls6/m;

    invoke-direct {p1, p0}, Ls6/m;-><init>(Ls6/p;)V

    iput-object p1, p0, Ls6/p;->y:Ljava/lang/Runnable;

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ls6/p;->G:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/ComponentName;Landroid/content/Context;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;ILkotlin/jvm/internal/h;)V
    .registers 14

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_5

    const/4 p5, 0x0

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-direct/range {v0 .. v5}, Ls6/p;-><init>(Landroid/content/ComponentName;Landroid/content/Context;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)V

    return-void
.end method

.method public static synthetic X(Ls6/b;)Z
    .registers 1

    invoke-static {p0}, Ls6/p;->q0(Ls6/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Y(Ls6/b;)Z
    .registers 1

    invoke-static {p0}, Ls6/p;->d0(Ls6/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lkotlin/jvm/internal/E;Ls6/b;)Z
    .registers 2

    invoke-static {p0, p1}, Ls6/p;->s0(Lkotlin/jvm/internal/E;Ls6/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ls6/b;)Z
    .registers 1

    invoke-static {p0}, Ls6/p;->m0(Ls6/b;)Z

    move-result p0

    return p0
.end method

.method private static final d0(Ls6/b;)Z
    .registers 2

    const-string v0, "connM"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/a$d;->r:Ls6/a$d;

    invoke-virtual {p0, v0}, Ls6/b;->c(Ls6/a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Ls6/p;)V
    .registers 1

    invoke-static {p0}, Ls6/p;->t0(Ls6/p;)V

    return-void
.end method

.method private final e0(Z)V
    .registers 4

    iget-boolean v0, p0, Ls6/p;->A:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    if-eqz p1, :cond_16

    sget-object p1, Ls6/p;->M:Landroid/os/Handler;

    iget-object v0, p0, Ls6/p;->y:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p0, p0, Ls6/p;->y:Ljava/lang/Runnable;

    const-wide/16 v0, 0x5

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_16
    invoke-direct {p0}, Ls6/p;->r0()V

    return-void
.end method

.method static synthetic f0(Ls6/p;ZILjava/lang/Object;)V
    .registers 4

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_5

    move p1, p3

    :cond_5
    invoke-direct {p0, p1}, Ls6/p;->e0(Z)V

    return-void
.end method

.method private final h0()Landroid/graphics/Point;
    .registers 2

    iget-object v0, p0, Ls6/p;->F:Landroid/graphics/Point;

    if-nez v0, :cond_16

    iget-object v0, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v0}, Li8/s;->T(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls6/h;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ls6/h;->s()Landroid/graphics/Point;

    move-result-object v0

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    :goto_14
    iput-object v0, p0, Ls6/p;->F:Landroid/graphics/Point;

    :cond_16
    return-object v0
.end method

.method private final j0(Landroid/view/SurfaceView;)[F
    .registers 7

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const/16 v1, 0x9

    new-array v1, v1, [F

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    iget v2, p0, Ls6/p;->H:I

    if-eqz v2, :cond_56

    iget v2, p0, Ls6/p;->I:I

    if-nez v2, :cond_1a

    goto :goto_56

    :cond_1a
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ls6/p;->H:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    iget p0, p0, Ls6/p;->I:I

    int-to-float p0, p0

    div-float/2addr p1, p0

    invoke-virtual {v0, v2, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    sget-object p0, Ls6/p;->K:Lq6/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getScale "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    return-object v1

    :cond_56
    :goto_56
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final m0(Ls6/b;)Z
    .registers 2

    const-string v0, "connMovement"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ls6/b;->d()Ls6/a$e;

    move-result-object p0

    instance-of p0, p0, Ls6/a$e$b;

    return p0
.end method

.method private final o0(Z)V
    .registers 4

    iget-object v0, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    if-eqz v0, :cond_40

    iget-boolean v1, p0, Ls6/p;->E:Z

    if-eq p1, v1, :cond_40

    :try_start_8
    invoke-interface {v0, p1}, Landroid/service/wallpaper/IWallpaperEngine;->setVisibility(Z)V

    iput-boolean p1, p0, Ls6/p;->E:Z

    sget-object p0, Ls6/p;->K:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "conn internal setEngineVisibility "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_28
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_28} :catch_29

    goto :goto_40

    :catch_29
    move-exception p0

    sget-object p1, Ls6/p;->K:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failure setting wallpaper visibility "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lq6/b;->e(Ljava/lang/String;)V

    :cond_40
    :goto_40
    return-void
.end method

.method private static final q0(Ls6/b;)Z
    .registers 2

    const-string v0, "connM"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ls6/b;->e()Z

    move-result p0

    return p0
.end method

.method private final r0()V
    .registers 9

    new-instance v0, Lkotlin/jvm/internal/E;

    invoke-direct {v0}, Lkotlin/jvm/internal/E;-><init>()V

    monitor-enter p0

    const/4 v1, 0x1

    :try_start_7
    iput-boolean v1, p0, Ls6/p;->A:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Ls6/p;->z:Z

    iget-object v3, p0, Ls6/p;->x:Ls6/b;

    invoke-virtual {v3}, Ls6/b;->d()Ls6/a$e;

    move-result-object v3

    iput-object v3, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object v4, Lh8/A;->a:Lh8/A;
    :try_end_16
    .catchall {:try_start_7 .. :try_end_16} :catchall_96

    monitor-exit p0

    sget-object v4, Ls6/p;->K:Lq6/b;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "sync, current state "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object v3, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_33
    :goto_33
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls6/h;

    :cond_3f
    new-instance v5, Ls6/o;

    invoke-direct {v5, v0}, Ls6/o;-><init>(Lkotlin/jvm/internal/E;)V

    invoke-virtual {v4, v5}, Ls6/h;->B(Lv8/l;)Z

    move-result v5

    if-eqz v5, :cond_33

    sget-object v5, Ls6/p;->K:Lq6/b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "sync, moveState for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object v5, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v5, Ls6/a$e;

    invoke-virtual {v4, v5}, Ls6/h;->u(Ls6/a$e;)Z

    move-result v5

    if-nez v5, :cond_3f

    goto :goto_33

    :cond_6b
    monitor-enter p0

    :try_start_6c
    iget-boolean v3, p0, Ls6/p;->z:Z

    if-nez v3, :cond_83

    iget-object v3, p0, Ls6/p;->x:Ls6/b;

    invoke-virtual {v3}, Ls6/b;->d()Ls6/a$e;

    move-result-object v3

    iget-object v0, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_7c
    .catchall {:try_start_6c .. :try_end_7c} :catchall_81

    if-nez v0, :cond_7f

    goto :goto_83

    :cond_7f
    move v1, v2

    goto :goto_83

    :catchall_81
    move-exception v0

    goto :goto_94

    :cond_83
    :goto_83
    monitor-exit p0

    if-eqz v1, :cond_8a

    invoke-direct {p0}, Ls6/p;->r0()V

    return-void

    :cond_8a
    monitor-enter p0

    :try_start_8b
    iput-boolean v2, p0, Ls6/p;->A:Z

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_8f
    .catchall {:try_start_8b .. :try_end_8f} :catchall_91

    monitor-exit p0

    return-void

    :catchall_91
    move-exception v0

    monitor-exit p0

    throw v0

    :goto_94
    monitor-exit p0

    throw v0

    :catchall_96
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static final s0(Lkotlin/jvm/internal/E;Ls6/b;)Z
    .registers 3

    const-string v0, "connMovement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls6/b;->d()Ls6/a$e;

    move-result-object p1

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Ls6/a$e;

    invoke-virtual {p1, p0}, Ls6/a$e;->d(Ls6/a$e;)I

    move-result p0

    if-gez p0, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method private static final t0(Ls6/p;)V
    .registers 1

    invoke-direct {p0}, Ls6/p;->r0()V

    return-void
.end method

.method private final u0(Ls6/h;)V
    .registers 5

    sget-object v0, Ls6/p;->K:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unregister "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_17
    iget-object v0, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls6/p;->z:Z

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_21
    .catchall {:try_start_17 .. :try_end_21} :catchall_23

    monitor-exit p0

    return-void

    :catchall_23
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final Z(ILandroid/os/IBinder;II)Z
    .registers 17

    const-string v0, "windowToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, p0, Ls6/p;->x:Ls6/b;

    sget-object v9, Ls6/a$a;->r:Ls6/a$a;

    sget-object v0, Ls6/a$c;->r:Ls6/a$c;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    monitor-enter p0

    :try_start_12
    invoke-virtual {v8, v0}, Ls6/b;->c(Ls6/a;)Z

    move-result v0

    if-nez v0, :cond_1e

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_1a
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1c

    monitor-exit p0

    goto :goto_28

    :catchall_1c
    move-exception v0

    goto :goto_26

    :cond_1e
    :try_start_1e
    const-string v0, "Cannot connect on a destroyed WallpaperConnection"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_26
    .catchall {:try_start_1e .. :try_end_26} :catchall_1c

    :goto_26
    monitor-exit p0

    throw v0

    :cond_28
    :goto_28
    new-instance v10, Lkotlin/jvm/internal/A;

    invoke-direct {v10}, Lkotlin/jvm/internal/A;-><init>()V

    monitor-enter p0

    :try_start_2e
    invoke-virtual {v8, v9}, Ls6/b;->c(Ls6/a;)Z

    move-result v0

    const/4 v11, 0x1

    if-eqz v0, :cond_5a

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " do event "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " but already in state."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_55
    .catchall {:try_start_2e .. :try_end_55} :catchall_57

    monitor-exit p0

    return v11

    :catchall_57
    move-exception v0

    goto/16 :goto_c3

    :cond_5a
    :try_start_5a
    iget-object v0, p0, Ls6/p;->B:Landroid/service/wallpaper/IWallpaperService;
    :try_end_5c
    .catchall {:try_start_5a .. :try_end_5c} :catchall_57

    if-nez v0, :cond_61

    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :cond_61
    :try_start_61
    sget-boolean v2, Lcom/android/launcher3/w;->i:Z

    if-eqz v2, :cond_74

    iget v6, p0, Ls6/p;->s:I

    iget-object v7, p0, Ls6/p;->u:Landroid/app/wallpaper/WallpaperDescription;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v5, p4

    invoke-static/range {v0 .. v7}, Lr6/h;->b(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;IIILandroid/app/wallpaper/WallpaperDescription;)Z

    move-result v0

    goto :goto_7e

    :cond_74
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v5, p4

    invoke-static/range {v0 .. v5}, Lr6/h;->c(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;II)Z

    move-result v0

    :goto_7e
    iput-boolean v0, v10, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v0, :cond_85

    invoke-static {v8, v9}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    :cond_85
    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_87
    .catchall {:try_start_61 .. :try_end_87} :catchall_57

    monitor-exit p0

    iget-boolean v0, v10, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v0, :cond_96

    sget-object v0, Ls6/p;->K:Lq6/b;

    const-string v2, "conn internal attachEngine success."

    invoke-virtual {v0, v2}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-direct {p0, v11}, Ls6/p;->e0(Z)V

    :cond_96
    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v0

    iget-boolean v1, v10, Lkotlin/jvm/internal/A;->q:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " do event "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", success "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-boolean v0, v10, Lkotlin/jvm/internal/A;->q:Z

    return v0

    :goto_c3
    monitor-exit p0

    throw v0
.end method

.method public final a0()Z
    .registers 7

    iget-object v0, p0, Ls6/p;->x:Ls6/b;

    sget-object v1, Ls6/a$b;->r:Ls6/a$b;

    sget-object v2, Ls6/a$c;->r:Ls6/a$c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    monitor-enter p0

    :try_start_d
    invoke-virtual {v0, v2}, Ls6/b;->c(Ls6/a;)Z

    move-result v2

    if-nez v2, :cond_19

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_15
    .catchall {:try_start_d .. :try_end_15} :catchall_17

    monitor-exit p0

    goto :goto_23

    :catchall_17
    move-exception v0

    goto :goto_21

    :cond_19
    :try_start_19
    const-string v0, "Cannot connect on a destroyed WallpaperConnection"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_21
    .catchall {:try_start_19 .. :try_end_21} :catchall_17

    :goto_21
    monitor-exit p0

    throw v0

    :cond_23
    :goto_23
    monitor-enter p0

    :try_start_24
    invoke-virtual {v0, v1}, Ls6/b;->c(Ls6/a;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4f

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but already in state."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_4b
    .catchall {:try_start_24 .. :try_end_4b} :catchall_4d

    monitor-exit p0

    return v3

    :catchall_4d
    move-exception v0

    goto :goto_96

    :cond_4f
    :try_start_4f
    iget-object v2, p0, Ls6/p;->r:Landroid/content/Context;

    iget-object v4, p0, Ls6/p;->v:Landroid/content/Intent;

    const/16 v5, 0x241

    invoke-virtual {v2, v4, p0, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v2

    if-eqz v2, :cond_5e

    invoke-static {v0, v1}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    :cond_5e
    sget-object v4, Lh8/A;->a:Lh8/A;
    :try_end_60
    .catchall {:try_start_4f .. :try_end_60} :catchall_4d

    monitor-exit p0

    if-eqz v2, :cond_6d

    sget-object v4, Ls6/p;->K:Lq6/b;

    const-string v5, "conn internal connect success."

    invoke-virtual {v4, v5}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Ls6/p;->e0(Z)V

    :cond_6d
    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object p0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq6/b;->a(Ljava/lang/String;)V

    return v2

    :goto_96
    monitor-exit p0

    throw v0
.end method

.method public attachEngine(Landroid/service/wallpaper/IWallpaperEngine;I)V
    .registers 10

    const-string p2, "engine"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-object p2, p0, Ls6/p;->x:Ls6/b;

    sget-object v0, Ls6/a$d;->r:Ls6/a$d;

    invoke-virtual {p2, v0}, Ls6/b;->c(Ls6/a;)Z

    move-result p2
    :try_end_e
    .catchall {:try_start_6 .. :try_end_e} :catchall_14

    if-eqz p2, :cond_19

    :try_start_10
    invoke-interface {p1}, Landroid/service/wallpaper/IWallpaperEngine;->destroy()V
    :try_end_13
    .catch Landroid/os/RemoteException; {:try_start_10 .. :try_end_13} :catch_17
    .catchall {:try_start_10 .. :try_end_13} :catchall_14

    goto :goto_17

    :catchall_14
    move-exception p1

    goto/16 :goto_149

    :catch_17
    :goto_17
    monitor-exit p0

    return-void

    :cond_19
    :try_start_19
    iget-object p2, p0, Ls6/p;->x:Ls6/b;

    invoke-virtual {p2}, Ls6/b;->f()Z

    move-result p2
    :try_end_1f
    .catchall {:try_start_19 .. :try_end_1f} :catchall_14

    if-nez p2, :cond_23

    monitor-exit p0

    return-void

    :cond_23
    :try_start_23
    iput-object p1, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    iget-boolean p1, p0, Ls6/p;->D:Z

    if-eqz p1, :cond_2d

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ls6/p;->o0(Z)V

    :cond_2d
    sget-object p1, Ls6/p;->K:Lq6/b;

    iget-boolean p2, p0, Ls6/p;->D:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "conn internal attachEngine success. engine visible "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_45
    .catchall {:try_start_23 .. :try_end_45} :catchall_14

    const/4 p1, 0x0

    :try_start_46
    invoke-direct {p0}, Ls6/p;->h0()Landroid/graphics/Point;

    move-result-object p2

    iget v0, p0, Ls6/p;->H:I

    if-nez v0, :cond_5f

    if-eqz p2, :cond_5f

    iget v0, p2, Landroid/graphics/Point;->x:I

    iput v0, p0, Ls6/p;->H:I

    iget v0, p2, Landroid/graphics/Point;->y:I

    iput v0, p0, Ls6/p;->I:I

    goto :goto_5f

    :catch_59
    move-exception p2

    goto/16 :goto_113

    :catch_5c
    move-exception p2

    goto/16 :goto_12c

    :cond_5f
    :goto_5f
    iget-object v0, p0, Ls6/p;->q:Landroid/content/ComponentName;

    invoke-static {v0}, Lr6/a;->a(Landroid/content/ComponentName;)Z

    move-result v0

    if-eqz v0, :cond_d9

    iget-object v0, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_72
    :goto_72
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_88

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls6/h;

    invoke-virtual {v2}, Ls6/h;->t()Landroid/graphics/Point;

    move-result-object v2

    if-eqz v2, :cond_72

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_72

    :cond_88
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_95

    move-object v1, v2

    goto :goto_be

    :cond_95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_a0

    goto :goto_be

    :cond_a0
    move-object v3, v1

    check-cast v3, Landroid/graphics/Point;

    iget v4, v3, Landroid/graphics/Point;->x:I

    iget v3, v3, Landroid/graphics/Point;->y:I

    mul-int/2addr v4, v3

    :cond_a8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/graphics/Point;

    iget v6, v5, Landroid/graphics/Point;->x:I

    iget v5, v5, Landroid/graphics/Point;->y:I

    mul-int/2addr v6, v5

    if-ge v4, v6, :cond_b8

    move-object v1, v3

    move v4, v6

    :cond_b8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_a8

    :goto_be
    check-cast v1, Landroid/graphics/Point;

    if-nez v1, :cond_ce

    if-eqz p2, :cond_cf

    new-instance v2, Landroid/graphics/Point;

    iget v0, p2, Landroid/graphics/Point;->x:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    invoke-direct {v2, v0, p2}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_cf

    :cond_ce
    move-object v2, v1

    :cond_cf
    :goto_cf
    if-eqz v2, :cond_d9

    iget p2, v2, Landroid/graphics/Point;->x:I

    iput p2, p0, Ls6/p;->H:I

    iget p2, v2, Landroid/graphics/Point;->y:I

    iput p2, p0, Ls6/p;->I:I

    :cond_d9
    sget-object p2, Ls6/p;->K:Lq6/b;

    iget v0, p0, Ls6/p;->H:I

    iget v1, p0, Ls6/p;->I:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "attachEngine resizePreview size=["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "]."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p2, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    if-eqz p2, :cond_144

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Ls6/p;->H:I

    iget v2, p0, Ls6/p;->I:I

    invoke-direct {v0, p1, p1, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-interface {p2, v0}, Landroid/service/wallpaper/IWallpaperEngine;->resizePreview(Landroid/graphics/Rect;)V

    sget-object p2, Lh8/A;->a:Lh8/A;
    :try_end_112
    .catch Landroid/os/RemoteException; {:try_start_46 .. :try_end_112} :catch_5c
    .catch Ljava/lang/NullPointerException; {:try_start_46 .. :try_end_112} :catch_59
    .catchall {:try_start_46 .. :try_end_112} :catchall_14

    goto :goto_144

    :goto_113
    :try_start_113
    sget-object v0, Ls6/p;->K:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed calling WallpaperEngine APIs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object p2, Lh8/A;->a:Lh8/A;

    goto :goto_144

    :goto_12c
    sget-object v0, Ls6/p;->K:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed calling WallpaperEngine APIs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object p2, Lh8/A;->a:Lh8/A;
    :try_end_144
    .catchall {:try_start_113 .. :try_end_144} :catchall_14

    :cond_144
    :goto_144
    monitor-exit p0

    invoke-direct {p0, p1}, Ls6/p;->e0(Z)V

    return-void

    :goto_149
    monitor-exit p0

    throw p1
.end method

.method public final b0(Ls6/h;)V
    .registers 5

    const-string v0, "conn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ls6/p;->u0(Ls6/h;)V

    monitor-enter p0

    :try_start_9
    iget-object p1, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1
    :try_end_f
    .catchall {:try_start_9 .. :try_end_f} :catchall_a3

    if-nez p1, :cond_13

    monitor-exit p0

    return-void

    :cond_13
    :try_start_13
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_15
    .catchall {:try_start_13 .. :try_end_15} :catchall_a3

    monitor-exit p0

    sget-object p1, Ls6/j;->a:Ls6/j;

    iget-object v0, p0, Ls6/p;->q:Landroid/content/ComponentName;

    invoke-virtual {p1, v0}, Ls6/j;->f(Landroid/content/ComponentName;)V

    iget-object p1, p0, Ls6/p;->x:Ls6/b;

    sget-object v0, Ls6/a$c;->r:Ls6/a$c;

    invoke-static {v0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    monitor-enter p0

    :try_start_28
    invoke-virtual {p1, v0}, Ls6/b;->c(Ls6/a;)Z

    move-result v1
    :try_end_2c
    .catchall {:try_start_28 .. :try_end_2c} :catchall_38

    if-nez v1, :cond_30

    monitor-exit p0

    goto :goto_3b

    :cond_30
    :try_start_30
    const-string p1, "Cannot connect on a destroyed WallpaperConnection"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_38
    .catchall {:try_start_30 .. :try_end_38} :catchall_38

    :catchall_38
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_3b
    :goto_3b
    monitor-enter p0

    :try_start_3c
    invoke-virtual {p1, v0}, Ls6/b;->c(Ls6/a;)Z

    move-result v1

    if-eqz v1, :cond_66

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " do event "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but already in state."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_62
    .catchall {:try_start_3c .. :try_end_62} :catchall_64

    monitor-exit p0

    return-void

    :catchall_64
    move-exception p1

    goto :goto_a1

    :cond_66
    :try_start_66
    invoke-virtual {p0}, Ls6/p;->c0()V

    invoke-static {p1, v0}, Ls6/b;->b(Ls6/b;Ls6/a;)V
    :try_end_6c
    .catchall {:try_start_66 .. :try_end_6c} :catchall_64

    monitor-exit p0

    sget-object v1, Ls6/p;->K:Lq6/b;

    const-string v2, "conn internal destroy success."

    invoke-virtual {v1, v2}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Ls6/p;->e0(Z)V

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " do event "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", success "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-void

    :goto_a1
    monitor-exit p0

    throw p1

    :catchall_a3
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final c0()V
    .registers 10

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_12

    :cond_d
    move v0, v2

    goto :goto_2e

    :catchall_f
    move-exception v0

    goto/16 :goto_114

    :cond_12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls6/h;

    new-instance v4, Ls6/n;

    invoke-direct {v4}, Ls6/n;-><init>()V

    invoke-virtual {v3, v4}, Ls6/h;->B(Lv8/l;)Z

    move-result v3

    if-nez v3, :cond_16

    move v0, v1

    :goto_2e
    iget-object v3, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    const/4 v4, 0x0

    if-eqz v0, :cond_10d

    if-eqz v3, :cond_10d

    iget-object v0, p0, Ls6/p;->x:Ls6/b;

    sget-object v5, Ls6/a$d;->r:Ls6/a$d;

    sget-object v6, Ls6/a$c;->r:Ls6/a$c;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_58

    monitor-enter p0
    :try_end_42
    .catchall {:try_start_1 .. :try_end_42} :catchall_f

    :try_start_42
    invoke-virtual {v0, v6}, Ls6/b;->c(Ls6/a;)Z

    move-result v6

    if-nez v6, :cond_4e

    sget-object v6, Lh8/A;->a:Lh8/A;
    :try_end_4a
    .catchall {:try_start_42 .. :try_end_4a} :catchall_4c

    :try_start_4a
    monitor-exit p0
    :try_end_4b
    .catchall {:try_start_4a .. :try_end_4b} :catchall_f

    goto :goto_58

    :catchall_4c
    move-exception v0

    goto :goto_56

    :cond_4e
    :try_start_4e
    const-string v0, "Cannot connect on a destroyed WallpaperConnection"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_56
    .catchall {:try_start_4e .. :try_end_56} :catchall_4c

    :goto_56
    :try_start_56
    monitor-exit p0

    throw v0

    :cond_58
    :goto_58
    new-instance v6, Lkotlin/jvm/internal/A;

    invoke-direct {v6}, Lkotlin/jvm/internal/A;-><init>()V

    monitor-enter p0
    :try_end_5e
    .catchall {:try_start_56 .. :try_end_5e} :catchall_f

    :try_start_5e
    invoke-virtual {v0, v5}, Ls6/b;->c(Ls6/a;)Z

    move-result v7

    if-eqz v7, :cond_8a

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but already in state."

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_84
    .catchall {:try_start_5e .. :try_end_84} :catchall_87

    :try_start_84
    monitor-exit p0
    :try_end_85
    .catchall {:try_start_84 .. :try_end_85} :catchall_f

    goto/16 :goto_10d

    :catchall_87
    move-exception v0

    goto/16 :goto_10b

    :cond_8a
    :try_start_8a
    invoke-interface {v3}, Landroid/service/wallpaper/IWallpaperEngine;->destroy()V

    iget-object v3, p0, Ls6/p;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_93
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "next(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/view/SurfaceControl;

    invoke-virtual {v7}, Landroid/view/SurfaceControl;->release()V

    goto :goto_93

    :cond_a8
    iget-object v3, p0, Ls6/p;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_ad
    .catch Landroid/os/RemoteException; {:try_start_8a .. :try_end_ad} :catch_ad
    .catchall {:try_start_8a .. :try_end_ad} :catchall_87

    :catch_ad
    :try_start_ad
    iput-object v4, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;
    :try_end_af
    .catchall {:try_start_ad .. :try_end_af} :catchall_87

    :try_start_af
    iget-object v3, p0, Ls6/p;->r:Landroid/content/Context;

    invoke-virtual {v3, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_b4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_af .. :try_end_b4} :catch_b5
    .catchall {:try_start_af .. :try_end_b4} :catchall_87

    goto :goto_bc

    :catch_b5
    :try_start_b5
    sget-object v3, Ls6/p;->K:Lq6/b;

    const-string v7, "Can\'t unbind wallpaper service. It might have crashed, just ignoring."

    invoke-virtual {v3, v7}, Lq6/b;->f(Ljava/lang/String;)V

    :goto_bc
    iput-object v4, p0, Ls6/p;->B:Landroid/service/wallpaper/IWallpaperService;

    iput-boolean v2, v6, Lkotlin/jvm/internal/A;->q:Z

    invoke-static {v0, v5}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_c5
    .catchall {:try_start_b5 .. :try_end_c5} :catchall_87

    :try_start_c5
    monitor-exit p0

    iget-boolean v3, v6, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v3, :cond_e0

    monitor-enter p0
    :try_end_cb
    .catchall {:try_start_c5 .. :try_end_cb} :catchall_f

    :try_start_cb
    iget-object v3, p0, Ls6/p;->x:Ls6/b;

    invoke-virtual {v3}, Ls6/b;->f()Z
    :try_end_d0
    .catchall {:try_start_cb .. :try_end_d0} :catchall_dd

    :try_start_d0
    monitor-exit p0

    iput v1, p0, Ls6/p;->H:I

    iput v1, p0, Ls6/p;->I:I

    sget-object v3, Ls6/p;->K:Lq6/b;

    const-string v7, "conn internal disconnect success."

    invoke-virtual {v3, v7}, Lq6/b;->a(Ljava/lang/String;)V

    goto :goto_e0

    :catchall_dd
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_e0
    :goto_e0
    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v3

    iget-boolean v6, v6, Lkotlin/jvm/internal/A;->q:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lq6/b;->a(Ljava/lang/String;)V

    goto :goto_10d

    :goto_10b
    monitor-exit p0

    throw v0

    :cond_10d
    :goto_10d
    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_10f
    .catchall {:try_start_d0 .. :try_end_10f} :catchall_f

    monitor-exit p0

    invoke-static {p0, v1, v2, v4}, Ls6/p;->f0(Ls6/p;ZILjava/lang/Object;)V

    return-void

    :goto_114
    monitor-exit p0

    throw v0
.end method

.method public engineShown(Landroid/service/wallpaper/IWallpaperEngine;)V
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-object p1, p0, Ls6/p;->x:Ls6/b;

    invoke-virtual {p1}, Ls6/b;->f()Z
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_29

    monitor-exit p0

    sget-object p1, Ls6/p;->K:Lq6/b;

    iget-object v0, p0, Ls6/p;->x:Ls6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "conn internal engineShown, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ls6/p;->e0(Z)V

    return-void

    :catchall_29
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final g0()I
    .registers 1

    iget p0, p0, Ls6/p;->s:I

    return p0
.end method

.method public final i0()Landroid/service/wallpaper/IWallpaperEngine;
    .registers 1

    iget-object p0, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    return-object p0
.end method

.method public final k0()LH3/C$d;
    .registers 1

    iget-object p0, p0, Ls6/p;->t:LH3/C$d;

    return-object p0
.end method

.method public final l0(Landroid/view/SurfaceView;)V
    .registers 14

    const-string v0, "parentSurface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-object v0, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    if-nez v0, :cond_17

    sget-object p1, Ls6/p;->K:Lq6/b;

    const-string v0, "Engine is null, was the service disconnected?"

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_6 .. :try_end_11} :catchall_13

    monitor-exit p0

    return-void

    :catchall_13
    move-exception v0

    move-object p1, v0

    goto/16 :goto_fa

    :cond_17
    :try_start_17
    iget-object v0, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_1e
    .catchall {:try_start_17 .. :try_end_1e} :catchall_13

    monitor-exit p0

    :try_start_1f
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object v2

    if-nez v2, :cond_2f

    goto/16 :goto_f9

    :cond_2f
    invoke-interface {v0}, Landroid/service/wallpaper/IWallpaperEngine;->mirrorSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object v4

    if-nez v4, :cond_37

    goto/16 :goto_f9

    :cond_37
    invoke-direct {p0, p1}, Ls6/p;->j0(Landroid/view/SurfaceView;)[F

    move-result-object p1

    if-nez p1, :cond_3f

    goto/16 :goto_f9

    :cond_3f
    new-instance v3, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {v3}, Landroid/view/SurfaceControl$Transaction;-><init>()V
    :try_end_44
    .catch Landroid/os/RemoteException; {:try_start_1f .. :try_end_44} :catch_e1
    .catch Ljava/lang/NullPointerException; {:try_start_1f .. :try_end_44} :catch_c8

    const/4 v0, 0x0

    :try_start_45
    aget v5, p1, v0

    const/4 v9, 0x3

    aget v6, p1, v9

    const/4 v10, 0x1

    aget v7, p1, v10

    const/4 v11, 0x4

    aget v8, p1, v11

    invoke-virtual/range {v3 .. v8}, Landroid/view/SurfaceControl$Transaction;->setMatrix(Landroid/view/SurfaceControl;FFFF)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v3, v4, v2}, Landroid/view/SurfaceControl$Transaction;->reparent(Landroid/view/SurfaceControl;Landroid/view/SurfaceControl;)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v3, v4}, Landroid/view/SurfaceControl$Transaction;->show(Landroid/view/SurfaceControl;)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v3}, Landroid/view/SurfaceControl$Transaction;->apply()V
    :try_end_5c
    .catchall {:try_start_45 .. :try_end_5c} :catchall_bf

    const/4 v2, 0x0

    :try_start_5d
    invoke-static {v3, v2}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    monitor-enter p0
    :try_end_61
    .catch Landroid/os/RemoteException; {:try_start_5d .. :try_end_61} :catch_e1
    .catch Ljava/lang/NullPointerException; {:try_start_5d .. :try_end_61} :catch_c8

    :try_start_61
    iget-object v2, p0, Ls6/p;->G:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_66
    .catchall {:try_start_61 .. :try_end_66} :catchall_bb

    :try_start_66
    monitor-exit p0

    sget-object p0, Ls6/p;->K:Lq6/b;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    aget v0, p1, v0

    aget v3, p1, v9

    aget v4, p1, v10

    aget p1, p1, v11

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "conn internal do mirrorAndReparent success, parentSurface size["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], values["

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-void

    :catchall_bb
    move-exception v0

    move-object p1, v0

    monitor-exit p0

    throw p1
    :try_end_bf
    .catch Landroid/os/RemoteException; {:try_start_66 .. :try_end_bf} :catch_e1
    .catch Ljava/lang/NullPointerException; {:try_start_66 .. :try_end_bf} :catch_c8

    :catchall_bf
    move-exception v0

    move-object p0, v0

    :try_start_c1
    throw p0
    :try_end_c2
    .catchall {:try_start_c1 .. :try_end_c2} :catchall_c2

    :catchall_c2
    move-exception v0

    move-object p1, v0

    :try_start_c4
    invoke-static {v3, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_c8
    .catch Landroid/os/RemoteException; {:try_start_c4 .. :try_end_c8} :catch_e1
    .catch Ljava/lang/NullPointerException; {:try_start_c4 .. :try_end_c8} :catch_c8

    :catch_c8
    move-exception v0

    move-object p0, v0

    sget-object p1, Ls6/p;->K:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t reparent wallpaper surface "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_f9

    :catch_e1
    move-exception v0

    move-object p0, v0

    sget-object p1, Ls6/p;->K:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t reparent wallpaper surface "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lq6/b;->e(Ljava/lang/String;)V

    :goto_f9
    return-void

    :goto_fa
    monitor-exit p0

    throw p1
.end method

.method public final n0(Ls6/h;)V
    .registers 5

    const-string v0, "conn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/p;->K:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_1c
    iget-object v1, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already added."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_3e

    :catchall_39
    move-exception p1

    goto :goto_42

    :cond_3b
    const/4 p1, 0x1

    iput-boolean p1, p0, Ls6/p;->z:Z

    :goto_3e
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_40
    .catchall {:try_start_1c .. :try_end_40} :catchall_39

    monitor-exit p0

    return-void

    :goto_42
    monitor-exit p0

    throw p1
.end method

.method public onLocalWallpaperColorsChanged(Landroid/graphics/RectF;Landroid/app/WallpaperColors;I)V
    .registers 4

    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 4

    sget-object p1, Ls6/p;->K:Lq6/b;

    const-string v0, "conn internal onServiceConnected."

    invoke-virtual {p1, v0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/service/wallpaper/IWallpaperService$Stub;->asInterface(Landroid/os/IBinder;)Landroid/service/wallpaper/IWallpaperService;

    move-result-object p1

    iput-object p1, p0, Ls6/p;->B:Landroid/service/wallpaper/IWallpaperService;

    monitor-enter p0

    :try_start_e
    iget-object p1, p0, Ls6/p;->x:Ls6/b;

    sget-object p2, Ls6/a$e$d;->s:Ls6/a$e$d;

    invoke-virtual {p1, p2}, Ls6/b;->g(Ls6/a$e;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_17
    .catchall {:try_start_e .. :try_end_17} :catchall_1d

    monitor-exit p0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ls6/p;->e0(Z)V

    return-void

    :catchall_1d
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 5

    sget-object v0, Ls6/p;->K:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "conn internal onServiceDisconnected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ls6/p;->B:Landroid/service/wallpaper/IWallpaperService;

    iput-object p1, p0, Ls6/p;->C:Landroid/service/wallpaper/IWallpaperEngine;

    monitor-enter p0

    :try_start_21
    iget-object p1, p0, Ls6/p;->x:Ls6/b;

    new-instance v0, Ls6/a$e$e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ls6/a$e$e;-><init>(Z)V

    invoke-virtual {p1, v0}, Ls6/b;->g(Ls6/a$e;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_2e
    .catchall {:try_start_21 .. :try_end_2e} :catchall_34

    monitor-exit p0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ls6/p;->e0(Z)V

    return-void

    :catchall_34
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onWallpaperColorsChanged(Landroid/app/WallpaperColors;I)V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls6/h;

    new-instance v2, Ls6/k;

    invoke-direct {v2}, Ls6/k;-><init>()V

    invoke-virtual {v1, v2}, Ls6/h;->B(Lv8/l;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1, p1, p2}, Ls6/h;->x(Landroid/app/WallpaperColors;I)V

    goto :goto_7

    :catchall_22
    move-exception p1

    goto :goto_28

    :cond_24
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_26
    .catchall {:try_start_1 .. :try_end_26} :catchall_22

    monitor-exit p0

    return-void

    :goto_28
    monitor-exit p0

    throw p1
.end method

.method public final p0(Z)V
    .registers 5

    monitor-enter p0

    if-nez p1, :cond_2d

    :try_start_3
    iget-object v0, p0, Ls6/p;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_2d

    :catchall_e
    move-exception p1

    goto :goto_36

    :cond_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls6/h;

    new-instance v2, Ls6/l;

    invoke-direct {v2}, Ls6/l;-><init>()V

    invoke-virtual {v1, v2}, Ls6/h;->B(Lv8/l;)Z

    move-result v1
    :try_end_29
    .catchall {:try_start_3 .. :try_end_29} :catchall_e

    if-eqz v1, :cond_14

    monitor-exit p0

    return-void

    :cond_2d
    :goto_2d
    :try_start_2d
    iput-boolean p1, p0, Ls6/p;->D:Z

    invoke-direct {p0, p1}, Ls6/p;->o0(Z)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_34
    .catchall {:try_start_2d .. :try_end_34} :catchall_e

    monitor-exit p0

    return-void

    :goto_36
    monitor-exit p0

    throw p1
.end method

.method public setWallpaper(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method
