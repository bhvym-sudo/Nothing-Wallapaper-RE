.class public final Lr6/g;
.super Landroid/service/wallpaper/IWallpaperConnection$Stub;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr6/g$a;
    }
.end annotation


# static fields
.field public static final I:Lr6/g$a;


# instance fields
.field private A:Landroid/service/wallpaper/IWallpaperService;

.field private B:Landroid/graphics/Point;

.field private C:Landroid/service/wallpaper/IWallpaperEngine;

.field private D:Z

.field private final E:Ljava/util/ArrayList;

.field private F:Ljava/lang/Runnable;

.field private G:I

.field private H:I

.field private final q:Landroid/content/Intent;

.field private r:Landroid/view/View;

.field private s:LH3/C$c;

.field private final t:I

.field private final u:Ljava/util/ArrayList;

.field private final v:Landroid/content/Context;

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lr6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr6/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lr6/g;->I:Lr6/g$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Landroid/content/Context;Landroid/view/View;LH3/C$c;I)V
    .registers 7

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/service/wallpaper/IWallpaperConnection$Stub;-><init>()V

    iput-object p1, p0, Lr6/g;->q:Landroid/content/Intent;

    iput-object p3, p0, Lr6/g;->r:Landroid/view/View;

    iput-object p4, p0, Lr6/g;->s:LH3/C$c;

    iput p5, p0, Lr6/g;->t:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lr6/g;->u:Ljava/util/ArrayList;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lr6/g;->v:Landroid/content/Context;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lr6/g;->E:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic X(Lr6/g;)V
    .registers 1

    invoke-static {p0}, Lr6/g;->h0(Lr6/g;)V

    return-void
.end method

.method public static synthetic Y(Lr6/g;Landroid/service/wallpaper/IWallpaperEngine;)V
    .registers 2

    invoke-static {p0, p1}, Lr6/g;->b0(Lr6/g;Landroid/service/wallpaper/IWallpaperEngine;)V

    return-void
.end method

.method public static final synthetic Z(Lr6/g;I)V
    .registers 2

    invoke-direct {p0, p1}, Lr6/g;->a0(I)V

    return-void
.end method

.method public static synthetic a(Lr6/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lr6/g;->g0(Lr6/g;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private final a0(I)V
    .registers 10

    iget-object v0, p0, Lr6/g;->A:Landroid/service/wallpaper/IWallpaperService;

    if-eqz v0, :cond_3f

    iget-object v1, p0, Lr6/g;->r:Landroid/view/View;

    if-nez v1, :cond_9

    goto :goto_3f

    :cond_9
    sget-boolean v2, Lcom/android/launcher3/w;->i:Z

    const-string v3, "getWindowToken(...)"

    if-eqz v2, :cond_28

    move-object v2, v3

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v5

    iget v6, p0, Lr6/g;->t:I

    const/4 v7, 0x0

    move-object v1, p0

    move v2, p1

    invoke-static/range {v0 .. v7}, Lr6/h;->b(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;IIILandroid/app/wallpaper/WallpaperDescription;)Z

    return-void

    :cond_28
    move-object v2, v1

    move-object v1, p0

    move-object p0, v2

    move v2, p1

    move-object p1, v3

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lr6/h;->c(Landroid/service/wallpaper/IWallpaperService;Landroid/service/wallpaper/IWallpaperConnection;ILandroid/os/IBinder;II)Z

    :cond_3f
    :goto_3f
    return-void
.end method

.method private static final b0(Lr6/g;Landroid/service/wallpaper/IWallpaperEngine;)V
    .registers 4

    const-string v0, "NTWallpaperConnection"

    const-string v1, "onAttachEngine"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lr6/g;->s:LH3/C$c;

    if-eqz v0, :cond_e

    invoke-interface {v0, p1}, LH3/C$c;->e(Landroid/service/wallpaper/IWallpaperEngine;)V

    :cond_e
    iget-object p1, p0, Lr6/g;->F:Ljava/lang/Runnable;

    if-eqz p1, :cond_15

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_15
    const/4 p1, 0x0

    iput-object p1, p0, Lr6/g;->F:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic c(Lr6/g;Landroid/app/WallpaperColors;I)V
    .registers 3

    invoke-static {p0, p1, p2}, Lr6/g;->m0(Lr6/g;Landroid/app/WallpaperColors;I)V

    return-void
.end method

.method public static synthetic e(Lr6/g;Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lr6/g;->o0(Lr6/g;Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    return-void
.end method

.method private static final g0(Lr6/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 9

    :try_start_0
    iget-object v0, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_2} :catch_d

    if-eqz v0, :cond_24

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move-object v5, p2

    :try_start_9
    invoke-interface/range {v0 .. v5}, Landroid/service/wallpaper/IWallpaperEngine;->dispatchWallpaperCommand(Ljava/lang/String;IIILandroid/os/Bundle;)V
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_c} :catch_e

    return-void

    :catch_d
    move-object v5, p2

    :catch_e
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Error dispatching wallpaper command: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "NTWallpaperConnection"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_24
    return-void
.end method

.method private static final h0(Lr6/g;)V
    .registers 2

    iget-object v0, p0, Lr6/g;->s:LH3/C$c;

    if-eqz v0, :cond_7

    invoke-interface {v0}, LH3/C$c;->m()V

    :cond_7
    invoke-direct {p0}, Lr6/g;->p0()V

    return-void
.end method

.method private final i0()Landroid/graphics/Point;
    .registers 3

    iget-object v0, p0, Lr6/g;->B:Landroid/graphics/Point;

    if-nez v0, :cond_26

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    iget-object v1, p0, Lr6/g;->r:Landroid/view/View;

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v1

    if-eqz v1, :cond_1e

    invoke-virtual {v0, v1}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lr6/g;->B:Landroid/graphics/Point;

    const-string p0, "also(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1e
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Display is null due to the view not currently attached to a window."

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_26
    return-object v0
.end method

.method private final k0(Landroid/graphics/Rect;)[F
    .registers 10

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const/16 v1, 0x9

    new-array v1, v1, [F

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v3

    iget v4, p0, Lr6/g;->G:I

    iget v5, p0, Lr6/g;->H:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "getScale desired["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "], engineSize["

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "NTWallpaperConnection"

    invoke-static {v3, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lr6/g;->G:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    iget p0, p0, Lr6/g;->H:I

    int-to-float p0, p0

    div-float/2addr p1, p0

    invoke-virtual {v0, v2, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    return-object v1
.end method

.method private final l0(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V
    .registers 11

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;

    if-nez v0, :cond_11

    const-string p1, "NTWallpaperConnection"

    const-string p2, "Engine is null, was the service disconnected?"

    invoke-static {p1, p2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_e

    monitor-exit p0

    return-void

    :catchall_e
    move-exception v0

    move-object p1, v0

    goto :goto_7d

    :cond_11
    :try_start_11
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_16
    .catchall {:try_start_11 .. :try_end_16} :catchall_e

    monitor-exit p0

    :try_start_17
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-interface {v0}, Landroid/service/wallpaper/IWallpaperEngine;->mirrorSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object v3

    if-nez v3, :cond_20

    goto :goto_7c

    :cond_20
    invoke-direct {p0, p2}, Lr6/g;->k0(Landroid/graphics/Rect;)[F

    move-result-object p2

    new-instance v2, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {v2}, Landroid/view/SurfaceControl$Transaction;-><init>()V
    :try_end_29
    .catchall {:try_start_17 .. :try_end_29} :catchall_63

    const/4 v0, 0x0

    :try_start_2a
    aget v4, p2, v0

    const/4 v0, 0x3

    aget v5, p2, v0

    const/4 v0, 0x1

    aget v6, p2, v0

    const/4 v0, 0x4

    aget v7, p2, v0

    invoke-virtual/range {v2 .. v7}, Landroid/view/SurfaceControl$Transaction;->setMatrix(Landroid/view/SurfaceControl;FFFF)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v2, v3, p1}, Landroid/view/SurfaceControl$Transaction;->reparent(Landroid/view/SurfaceControl;Landroid/view/SurfaceControl;)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v2, v3}, Landroid/view/SurfaceControl$Transaction;->show(Landroid/view/SurfaceControl;)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v2}, Landroid/view/SurfaceControl$Transaction;->apply()V
    :try_end_41
    .catchall {:try_start_2a .. :try_end_41} :catchall_5a

    const/4 p1, 0x0

    :try_start_42
    invoke-static {v2, p1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    monitor-enter p0
    :try_end_46
    .catchall {:try_start_42 .. :try_end_46} :catchall_63

    :try_start_46
    iget-object p1, p0, Lr6/g;->u:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result p1
    :try_end_4c
    .catchall {:try_start_46 .. :try_end_4c} :catchall_56

    :try_start_4c
    monitor-exit p0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_6f

    :catchall_56
    move-exception v0

    move-object p1, v0

    monitor-exit p0

    throw p1
    :try_end_5a
    .catchall {:try_start_4c .. :try_end_5a} :catchall_63

    :catchall_5a
    move-exception v0

    move-object p0, v0

    :try_start_5c
    throw p0
    :try_end_5d
    .catchall {:try_start_5c .. :try_end_5d} :catchall_5d

    :catchall_5d
    move-exception v0

    move-object p1, v0

    :try_start_5f
    invoke-static {v2, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_63
    .catchall {:try_start_5f .. :try_end_63} :catchall_63

    :catchall_63
    move-exception v0

    move-object p0, v0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_6f
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_7c

    const-string p1, "NTWallpaperConnection"

    const-string p2, "Couldn\'t reparent wallpaper surface"

    invoke-static {p1, p2, p0}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7c
    :goto_7c
    return-void

    :goto_7d
    monitor-exit p0

    throw p1
.end method

.method private static final m0(Lr6/g;Landroid/app/WallpaperColors;I)V
    .registers 3

    iget-object p0, p0, Lr6/g;->s:LH3/C$c;

    if-eqz p0, :cond_7

    invoke-interface {p0, p1, p2}, LH3/C$c;->onWallpaperColorsChanged(Landroid/app/WallpaperColors;I)V

    :cond_7
    return-void
.end method

.method private static final o0(Lr6/g;Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lr6/g;->l0(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    return-void
.end method

.method private final p0()V
    .registers 3

    iget-object v0, p0, Lr6/g;->E:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_6

    :cond_16
    iget-object p0, p0, Lr6/g;->E:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private final q0(Z)V
    .registers 4

    iget-object v0, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;

    if-eqz v0, :cond_27

    iget-boolean v1, p0, Lr6/g;->z:Z

    if-eq p1, v1, :cond_27

    if-eqz v0, :cond_d

    :try_start_a
    invoke-interface {v0, p1}, Landroid/service/wallpaper/IWallpaperEngine;->setVisibility(Z)V

    :cond_d
    iput-boolean p1, p0, Lr6/g;->z:Z
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_f} :catch_10

    return-void

    :catch_10
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failure setting wallpaper visibility :"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "NTWallpaperConnection"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    :cond_27
    return-void
.end method


# virtual methods
.method public attachEngine(Landroid/service/wallpaper/IWallpaperEngine;I)V
    .registers 8

    monitor-enter p0

    :try_start_1
    sget-object p2, Lh8/q;->r:Lh8/q$a;

    iget-boolean p2, p0, Lr6/g;->x:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_8d

    iput-object p1, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;

    iget-boolean p2, p0, Lr6/g;->y:Z

    if-eqz p2, :cond_16

    const/4 p2, 0x1

    invoke-direct {p0, p2}, Lr6/g;->q0(Z)V

    goto :goto_16

    :catchall_13
    move-exception p1

    goto/16 :goto_99

    :cond_16
    :goto_16
    iget-object p2, p0, Lr6/g;->r:Landroid/view/View;

    if-eqz p2, :cond_24

    new-instance v1, Lr6/b;

    invoke-direct {v1, p0, p1}, Lr6/b;-><init>(Lr6/g;Landroid/service/wallpaper/IWallpaperEngine;)V

    const-wide/16 v2, 0x10

    invoke-virtual {p2, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_24
    invoke-direct {p0}, Lr6/g;->i0()Landroid/graphics/Point;

    move-result-object p2

    iget v1, p2, Landroid/graphics/Point;->x:I

    iput v1, p0, Lr6/g;->G:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    iput p2, p0, Lr6/g;->H:I

    iget-object p2, p0, Lr6/g;->q:Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p2}, Lr6/a;->a(Landroid/content/ComponentName;)Z

    move-result p2

    if-eqz p2, :cond_4f

    iget-object p2, p0, Lr6/g;->r:Landroid/view/View;

    if-eqz p2, :cond_4f

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p0, Lr6/g;->G:I

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    iput p2, p0, Lr6/g;->H:I

    :cond_4f
    const-string p2, "NTWallpaperConnection"

    iget v1, p0, Lr6/g;->G:I

    iget v2, p0, Lr6/g;->H:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "attachEngine resizePreview size["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_85

    new-instance p2, Landroid/graphics/Rect;

    iget v1, p0, Lr6/g;->G:I

    iget v2, p0, Lr6/g;->H:I

    const/4 v3, 0x0

    invoke-direct {p2, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-interface {p1, p2}, Landroid/service/wallpaper/IWallpaperEngine;->resizePreview(Landroid/graphics/Rect;)V

    :cond_85
    if-eqz p1, :cond_94

    invoke-interface {p1}, Landroid/service/wallpaper/IWallpaperEngine;->requestWallpaperColors()V

    sget-object v0, Lh8/A;->a:Lh8/A;

    goto :goto_94

    :cond_8d
    if-eqz p1, :cond_94

    invoke-interface {p1}, Landroid/service/wallpaper/IWallpaperEngine;->destroy()V

    sget-object v0, Lh8/A;->a:Lh8/A;

    :cond_94
    :goto_94
    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_98
    .catchall {:try_start_1 .. :try_end_98} :catchall_13

    goto :goto_a3

    :goto_99
    :try_start_99
    sget-object p2, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_a3
    invoke-static {p1}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_c2

    const-string p2, "NTWallpaperConnection"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed calling WallpaperEngine APIs:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_bf
    .catchall {:try_start_99 .. :try_end_bf} :catchall_c0

    goto :goto_c2

    :catchall_c0
    move-exception p1

    goto :goto_c4

    :cond_c2
    :goto_c2
    monitor-exit p0

    return-void

    :goto_c4
    monitor-exit p0

    throw p1
.end method

.method public final c0()Z
    .registers 5

    iget-boolean v0, p0, Lr6/g;->w:Z

    if-nez v0, :cond_2b

    monitor-enter p0

    :try_start_5
    iget-boolean v0, p0, Lr6/g;->x:Z
    :try_end_7
    .catchall {:try_start_5 .. :try_end_7} :catchall_28

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    monitor-exit p0

    return v1

    :cond_c
    :try_start_c
    iget-object v0, p0, Lr6/g;->v:Landroid/content/Context;

    iget-object v2, p0, Lr6/g;->q:Landroid/content/Intent;

    const/16 v3, 0x241

    invoke-virtual {v0, v2, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0
    :try_end_16
    .catchall {:try_start_c .. :try_end_16} :catchall_28

    if-nez v0, :cond_1b

    monitor-exit p0

    const/4 p0, 0x0

    return p0

    :cond_1b
    :try_start_1b
    iput-boolean v1, p0, Lr6/g;->x:Z

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_1f
    .catchall {:try_start_1b .. :try_end_1f} :catchall_28

    monitor-exit p0

    iget-object p0, p0, Lr6/g;->s:LH3/C$c;

    if-eqz p0, :cond_27

    invoke-interface {p0}, LH3/C$c;->H()V

    :cond_27
    return v1

    :catchall_28
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2b
    const-string p0, "Cannot connect on a destroyed WallpaperConnection"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d0()V
    .registers 2

    invoke-virtual {p0}, Lr6/g;->e0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lr6/g;->s:LH3/C$c;

    iput-object v0, p0, Lr6/g;->r:Landroid/view/View;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr6/g;->w:Z

    return-void
.end method

.method public final e0()V
    .registers 7

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lr6/g;->x:Z

    iput-boolean v0, p0, Lr6/g;->D:Z

    iget-object v1, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;
    :try_end_8
    .catchall {:try_start_2 .. :try_end_8} :catchall_11

    const/4 v2, 0x0

    if-eqz v1, :cond_3a

    if-eqz v1, :cond_13

    :try_start_d
    invoke-interface {v1}, Landroid/service/wallpaper/IWallpaperEngine;->destroy()V

    goto :goto_13

    :catchall_11
    move-exception v0

    goto :goto_79

    :cond_13
    :goto_13
    iget-object v1, p0, Lr6/g;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v3, "iterator(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_33

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "next(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/view/SurfaceControl;

    invoke-virtual {v3}, Landroid/view/SurfaceControl;->release()V

    goto :goto_1e

    :cond_33
    iget-object v1, p0, Lr6/g;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_38
    .catch Landroid/os/RemoteException; {:try_start_d .. :try_end_38} :catch_38
    .catchall {:try_start_d .. :try_end_38} :catchall_11

    :catch_38
    :try_start_38
    iput-object v2, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;
    :try_end_3a
    .catchall {:try_start_38 .. :try_end_3a} :catchall_11

    :cond_3a
    :try_start_3a
    iget-object v1, p0, Lr6/g;->v:Landroid/content/Context;

    invoke-virtual {v1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const-string v1, "NTWallpaperConnection"

    const-string v3, "unbind wallpaper service."

    invoke-static {v1, v3}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_46
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3a .. :try_end_46} :catch_47
    .catchall {:try_start_3a .. :try_end_46} :catchall_11

    goto :goto_63

    :catch_47
    move-exception v1

    :try_start_48
    const-string v3, "NTWallpaperConnection"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Can\'t unbind wallpaper service. It might have crashed, just ignoring "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_63
    iput-object v2, p0, Lr6/g;->A:Landroid/service/wallpaper/IWallpaperService;

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_67
    .catchall {:try_start_48 .. :try_end_67} :catchall_11

    monitor-exit p0

    iput v0, p0, Lr6/g;->G:I

    iput v0, p0, Lr6/g;->H:I

    iget-object v0, p0, Lr6/g;->s:LH3/C$c;

    if-eqz v0, :cond_73

    invoke-interface {v0}, LH3/C$c;->E()V

    :cond_73
    iget-object p0, p0, Lr6/g;->E:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void

    :goto_79
    monitor-exit p0

    throw v0
.end method

.method public engineShown(Landroid/service/wallpaper/IWallpaperEngine;)V
    .registers 3

    iget-boolean p1, p0, Lr6/g;->x:Z

    if-eqz p1, :cond_13

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr6/g;->D:Z

    iget-object p1, p0, Lr6/g;->r:Landroid/view/View;

    if-eqz p1, :cond_13

    new-instance v0, Lr6/d;

    invoke-direct {v0, p0}, Lr6/d;-><init>(Lr6/g;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_13
    return-void
.end method

.method public final f0(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 10

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;

    if-eqz v1, :cond_12

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v6, p2

    invoke-interface/range {v1 .. v6}, Landroid/service/wallpaper/IWallpaperEngine;->dispatchWallpaperCommand(Ljava/lang/String;IIILandroid/os/Bundle;)V

    return-void

    :cond_12
    move-object v2, p1

    move-object v6, p2

    new-instance p1, Lr6/f;

    invoke-direct {p1, p0, v2, v6}, Lr6/f;-><init>(Lr6/g;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object p1, p0, Lr6/g;->F:Ljava/lang/Runnable;

    return-void
.end method

.method public final j0()Landroid/service/wallpaper/IWallpaperEngine;
    .registers 1

    iget-object p0, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;

    return-object p0
.end method

.method public final n0(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V
    .registers 5

    const-string v0, "surfacePosition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_8

    return-void

    :cond_8
    iget-boolean v0, p0, Lr6/g;->D:Z

    if-eqz v0, :cond_10

    invoke-direct {p0, p1, p2}, Lr6/g;->l0(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    return-void

    :cond_10
    iget-object v0, p0, Lr6/g;->E:Ljava/util/ArrayList;

    new-instance v1, Lr6/e;

    invoke-direct {v1, p0, p1, p2}, Lr6/e;-><init>(Lr6/g;Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onLocalWallpaperColorsChanged(Landroid/graphics/RectF;Landroid/app/WallpaperColors;I)V
    .registers 4

    const-string p0, "NTWallpaperConnection"

    const-string p1, "onLocalWallpaperColorsChanged"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 3

    invoke-static {p2}, Landroid/service/wallpaper/IWallpaperService$Stub;->asInterface(Landroid/os/IBinder;)Landroid/service/wallpaper/IWallpaperService;

    move-result-object p1

    iput-object p1, p0, Lr6/g;->A:Landroid/service/wallpaper/IWallpaperService;

    iget-object p1, p0, Lr6/g;->r:Landroid/view/View;

    if-eqz p1, :cond_36

    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object p2

    if-nez p2, :cond_2b

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p2

    if-eqz p2, :cond_22

    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result p1

    invoke-static {p0, p1}, Lr6/g;->Z(Lr6/g;I)V

    return-void

    :cond_22
    new-instance p2, Lr6/g$b;

    invoke-direct {p2, p1, p0}, Lr6/g$b;-><init>(Landroid/view/View;Lr6/g;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :cond_2b
    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result p1

    invoke-direct {p0, p1}, Lr6/g;->a0(I)V

    :cond_36
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lr6/g;->A:Landroid/service/wallpaper/IWallpaperService;

    iput-object v0, p0, Lr6/g;->C:Landroid/service/wallpaper/IWallpaperEngine;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Wallpaper service gone: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "NTWallpaperConnection"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onWallpaperColorsChanged(Landroid/app/WallpaperColors;I)V
    .registers 5

    iget-object v0, p0, Lr6/g;->r:Landroid/view/View;

    if-eqz v0, :cond_c

    new-instance v1, Lr6/c;

    invoke-direct {v1, p0, p1, p2}, Lr6/c;-><init>(Lr6/g;Landroid/app/WallpaperColors;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_c
    return-void
.end method

.method public final r0(Z)V
    .registers 2

    monitor-enter p0

    :try_start_1
    iput-boolean p1, p0, Lr6/g;->y:Z

    invoke-direct {p0, p1}, Lr6/g;->q0(Z)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_a

    monitor-exit p0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setWallpaper(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 2

    const/4 p0, 0x0

    return-object p0
.end method
