.class public final Ls6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/h$a;
    }
.end annotation


# static fields
.field public static final j:Ls6/h$a;

.field private static final k:Lq6/b;


# instance fields
.field private a:LH3/C$c;

.field private final b:I

.field private final c:LH3/C$d;

.field private final d:Landroid/app/wallpaper/WallpaperDescription;

.field private e:Landroid/view/SurfaceView;

.field private f:Landroid/view/SurfaceView;

.field private volatile g:Z

.field private final h:Lh8/h;

.field private final i:Ls6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ls6/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls6/h$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ls6/h;->j:Ls6/h$a;

    new-instance v0, Lq6/b;

    const-string v1, "SharedWallpaperConnection"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ls6/h;->k:Lq6/b;

    return-void
.end method

.method public constructor <init>(Lg3/k;Landroid/view/SurfaceView;Landroid/view/SurfaceView;LH3/C$c;ILH3/C$d;ZLandroid/app/wallpaper/WallpaperDescription;)V
    .registers 10

    const-string v0, "liveWallpaperInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whichPreview"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Ls6/h;->a:LH3/C$c;

    .line 3
    iput p5, p0, Ls6/h;->b:I

    .line 4
    iput-object p6, p0, Ls6/h;->c:LH3/C$d;

    .line 5
    iput-object p8, p0, Ls6/h;->d:Landroid/app/wallpaper/WallpaperDescription;

    .line 6
    sget-object p4, Ls6/j;->a:Ls6/j;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p5

    invoke-virtual {p5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p5

    invoke-virtual {p4, p5}, Ls6/j;->g(Landroid/content/Context;)V

    .line 7
    iput-object p2, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    .line 8
    iput-object p3, p0, Ls6/h;->f:Landroid/view/SurfaceView;

    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p0, Ls6/h;->g:Z

    .line 10
    new-instance p2, Ls6/c;

    invoke-direct {p2, p7, p1, p0}, Ls6/c;-><init>(ZLg3/k;Ls6/h;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Ls6/h;->h:Lh8/h;

    .line 11
    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object p1

    invoke-virtual {p1, p0}, Ls6/p;->n0(Ls6/h;)V

    .line 12
    new-instance p2, Ls6/b;

    const/4 p6, 0x7

    const/4 p7, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-direct/range {p2 .. p7}, Ls6/b;-><init>(Ls6/a;Ls6/a$e;ZILkotlin/jvm/internal/h;)V

    iput-object p2, p0, Ls6/h;->i:Ls6/b;

    return-void
.end method

.method public synthetic constructor <init>(Lg3/k;Landroid/view/SurfaceView;Landroid/view/SurfaceView;LH3/C$c;ILH3/C$d;ZLandroid/app/wallpaper/WallpaperDescription;ILkotlin/jvm/internal/h;)V
    .registers 22

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    move v9, v1

    goto :goto_b

    :cond_9
    move/from16 v9, p7

    :goto_b
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1b

    const/4 v0, 0x0

    move-object v10, v0

    :goto_11
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    goto :goto_1e

    :cond_1b
    move-object/from16 v10, p8

    goto :goto_11

    .line 13
    :goto_1e
    invoke-direct/range {v2 .. v10}, Ls6/h;-><init>(Lg3/k;Landroid/view/SurfaceView;Landroid/view/SurfaceView;LH3/C$c;ILH3/C$d;ZLandroid/app/wallpaper/WallpaperDescription;)V

    return-void
.end method

.method public static synthetic d(Ls6/h;Landroid/app/WallpaperColors;I)V
    .registers 3

    invoke-static {p0, p1, p2}, Ls6/h;->y(Ls6/h;Landroid/app/WallpaperColors;I)V

    return-void
.end method

.method public static synthetic e(ZLg3/k;Ls6/h;)Ls6/p;
    .registers 3

    invoke-static {p0, p1, p2}, Ls6/h;->m(ZLg3/k;Ls6/h;)Ls6/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ls6/h;)V
    .registers 1

    invoke-static {p0}, Ls6/h;->l(Ls6/h;)V

    return-void
.end method

.method public static synthetic g(Ls6/h;Landroid/view/SurfaceView;)V
    .registers 2

    invoke-static {p0, p1}, Ls6/h;->p(Ls6/h;Landroid/view/SurfaceView;)V

    return-void
.end method

.method public static synthetic h(Ls6/h;Landroid/view/SurfaceView;)V
    .registers 2

    invoke-static {p0, p1}, Ls6/h;->q(Ls6/h;Landroid/view/SurfaceView;)V

    return-void
.end method

.method public static final synthetic i(Ls6/h;)Ls6/p;
    .registers 1

    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Ls6/h;)V
    .registers 1

    invoke-direct {p0}, Ls6/h;->v()V

    return-void
.end method

.method private final k()V
    .registers 5

    iget-object v0, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    if-eqz v0, :cond_e

    new-instance v1, Ls6/e;

    invoke-direct {v1, p0}, Ls6/e;-><init>(Ls6/h;)V

    const-wide/16 v2, 0x10

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_e
    return-void
.end method

.method private static final l(Ls6/h;)V
    .registers 2

    iget-object v0, p0, Ls6/h;->a:LH3/C$c;

    if-eqz v0, :cond_f

    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object p0

    invoke-virtual {p0}, Ls6/p;->i0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object p0

    invoke-interface {v0, p0}, LH3/C$c;->e(Landroid/service/wallpaper/IWallpaperEngine;)V

    :cond_f
    return-void
.end method

.method private static final m(ZLg3/k;Ls6/h;)Ls6/p;
    .registers 10

    sget-boolean v0, Lcom/android/launcher3/w;->i:Z

    const-string v1, "getComponent(...)"

    if-eqz v0, :cond_38

    if-eqz p0, :cond_20

    sget-object p0, Ls6/j;->a:Ls6/j;

    invoke-virtual {p1}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p2, Ls6/h;->b:I

    iget-object v1, p2, Ls6/h;->c:LH3/C$d;

    iget-object p2, p2, Ls6/h;->d:Landroid/app/wallpaper/WallpaperDescription;

    invoke-virtual {p0, p1, v0, v1, p2}, Ls6/j;->a(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;

    move-result-object p0

    return-object p0

    :cond_20
    sget-object p0, Ls6/j;->a:Ls6/j;

    invoke-virtual {p1}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p2, Ls6/h;->b:I

    iget-object v1, p2, Ls6/h;->c:LH3/C$d;

    iget-object p2, p2, Ls6/h;->d:Landroid/app/wallpaper/WallpaperDescription;

    invoke-virtual {p0, p1, v0, v1, p2}, Ls6/j;->d(Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)Ls6/p;

    move-result-object p0

    return-object p0

    :cond_38
    if-eqz p0, :cond_55

    sget-object v0, Ls6/j;->a:Ls6/j;

    invoke-virtual {p1}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p2, Ls6/h;->b:I

    iget-object v3, p2, Ls6/h;->c:LH3/C$d;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Ls6/j;->b(Ls6/j;Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;ILjava/lang/Object;)Ls6/p;

    move-result-object p0

    return-object p0

    :cond_55
    sget-object v0, Ls6/j;->a:Ls6/j;

    invoke-virtual {p1}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p2, Ls6/h;->b:I

    iget-object v3, p2, Ls6/h;->c:LH3/C$d;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Ls6/j;->e(Ls6/j;Landroid/content/ComponentName;ILH3/C$d;Landroid/app/wallpaper/WallpaperDescription;ILjava/lang/Object;)Ls6/p;

    move-result-object p0

    return-object p0
.end method

.method private final o()V
    .registers 3

    iget-object v0, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    if-eqz v0, :cond_c

    new-instance v1, Ls6/f;

    invoke-direct {v1, p0, v0}, Ls6/f;-><init>(Ls6/h;Landroid/view/SurfaceView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_c
    iget-object v0, p0, Ls6/h;->f:Landroid/view/SurfaceView;

    if-eqz v0, :cond_18

    new-instance v1, Ls6/g;

    invoke-direct {v1, p0, v0}, Ls6/g;-><init>(Ls6/h;Landroid/view/SurfaceView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_18
    return-void
.end method

.method private static final p(Ls6/h;Landroid/view/SurfaceView;)V
    .registers 2

    invoke-direct {p0, p1}, Ls6/h;->z(Landroid/view/SurfaceView;)V

    return-void
.end method

.method private static final q(Ls6/h;Landroid/view/SurfaceView;)V
    .registers 8

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Ls6/h;->c:LH3/C$d;

    invoke-virtual {v0}, LH3/C$d;->e()I

    move-result v0

    const-string v1, "which_preview"

    invoke-virtual {v5, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :try_start_10
    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object v0

    invoke-virtual {v0}, Ls6/p;->i0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object v0

    if-eqz v0, :cond_3b

    const-string v1, "android.wallpaper.previewinfo"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v5}, Landroid/service/wallpaper/IWallpaperEngine;->dispatchWallpaperCommand(Ljava/lang/String;IIILandroid/os/Bundle;)V
    :try_end_22
    .catch Landroid/os/RemoteException; {:try_start_10 .. :try_end_22} :catch_23

    goto :goto_3b

    :catch_23
    sget-object v0, Ls6/h;->k:Lq6/b;

    iget-object v1, p0, Ls6/h;->c:LH3/C$d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error dispatching wallpaper command:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->e(Ljava/lang/String;)V

    :cond_3b
    :goto_3b
    invoke-direct {p0, p1}, Ls6/h;->z(Landroid/view/SurfaceView;)V

    iget-object p0, p0, Ls6/h;->a:LH3/C$c;

    if-eqz p0, :cond_45

    invoke-interface {p0}, LH3/C$c;->m()V

    :cond_45
    return-void
.end method

.method private final r()Ls6/p;
    .registers 1

    iget-object p0, p0, Ls6/h;->h:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls6/p;

    return-object p0
.end method

.method private final v()V
    .registers 9

    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    sget-object v1, Ls6/a$a;->r:Ls6/a$a;

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
    new-instance v2, Lkotlin/jvm/internal/A;

    invoke-direct {v2}, Lkotlin/jvm/internal/A;-><init>()V

    monitor-enter p0

    :try_start_29
    invoke-virtual {v0, v1}, Ls6/b;->c(Ls6/a;)Z

    move-result v3

    if-eqz v3, :cond_54

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but already in state."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_4f
    .catchall {:try_start_29 .. :try_end_4f} :catchall_51

    monitor-exit p0

    return-void

    :catchall_51
    move-exception v0

    goto/16 :goto_ca

    :cond_54
    :try_start_54
    iget-object v3, p0, Ls6/h;->e:Landroid/view/SurfaceView;
    :try_end_56
    .catchall {:try_start_54 .. :try_end_56} :catchall_51

    if-nez v3, :cond_5a

    monitor-exit p0

    return-void

    :cond_5a
    :try_start_5a
    invoke-virtual {v3}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v4

    if-nez v4, :cond_74

    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-eqz v4, :cond_6a

    invoke-static {p0}, Ls6/h;->j(Ls6/h;)V

    goto :goto_72

    :cond_6a
    new-instance v4, Ls6/h$b;

    invoke-direct {v4, v3, p0}, Ls6/h$b;-><init>(Landroid/view/View;Ls6/h;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_72
    const/4 v3, 0x0

    goto :goto_95

    :cond_74
    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object v4

    invoke-virtual {v3}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Display;->getDisplayId()I

    move-result v5

    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v6

    const-string v7, "getWindowToken(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v4, v5, v6, v7, v3}, Ls6/p;->Z(ILandroid/os/IBinder;II)Z

    move-result v3

    :goto_95
    iput-boolean v3, v2, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v3, :cond_9c

    invoke-static {v0, v1}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    :cond_9c
    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_9e
    .catchall {:try_start_5a .. :try_end_9e} :catchall_51

    monitor-exit p0

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object p0

    iget-boolean v2, v2, Lkotlin/jvm/internal/A;->q:Z

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

    return-void

    :goto_ca
    monitor-exit p0

    throw v0
.end method

.method private final w()V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    sget-object v1, Ls6/a$b;->r:Ls6/a$b;

    invoke-virtual {v0, v1}, Ls6/b;->c(Ls6/a;)Z

    move-result v0
    :try_end_9
    .catchall {:try_start_1 .. :try_end_9} :catchall_1e

    if-nez v0, :cond_d

    monitor-exit p0

    return-void

    :cond_d
    :try_start_d
    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    new-instance v1, Ls6/a$e$e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Ls6/a$e$e;-><init>(ZILkotlin/jvm/internal/h;)V

    invoke-virtual {v0, v1}, Ls6/b;->g(Ls6/a$e;)V

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_1c
    .catchall {:try_start_d .. :try_end_1c} :catchall_1e

    monitor-exit p0

    return-void

    :catchall_1e
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static final y(Ls6/h;Landroid/app/WallpaperColors;I)V
    .registers 3

    iget-object p0, p0, Ls6/h;->a:LH3/C$c;

    if-eqz p0, :cond_7

    invoke-interface {p0, p1, p2}, LH3/C$c;->onWallpaperColorsChanged(Landroid/app/WallpaperColors;I)V

    :cond_7
    return-void
.end method

.method private final z(Landroid/view/SurfaceView;)V
    .registers 4

    iget-boolean v0, p0, Ls6/h;->g:Z

    if-nez v0, :cond_c

    sget-object p0, Ls6/h;->k:Lq6/b;

    const-string p1, "not allow mirror, skip it."

    invoke-virtual {p0, p1}, Lq6/b;->f(Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Ls6/p;->l0(Landroid/view/SurfaceView;)V

    return-void

    :cond_1a
    sget-object v0, Ls6/h;->k:Lq6/b;

    const-string v1, "SurfaceView not initialized yet, adding callback"

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    new-instance v1, Ls6/h$c;

    invoke-direct {v1, p0, p1}, Ls6/h$c;-><init>(Ls6/h;Landroid/view/SurfaceView;)V

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method


# virtual methods
.method public final A(Z)V
    .registers 2

    iput-boolean p1, p0, Ls6/h;->g:Z

    return-void
.end method

.method public final B(Lv8/l;)Z
    .registers 3

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    invoke-interface {p1, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_12
    .catchall {:try_start_6 .. :try_end_12} :catchall_14

    monitor-exit p0

    return p1

    :catchall_14
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a()V
    .registers 5

    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    sget-object v1, Ls6/a$c;->r:Ls6/a$c;

    invoke-static {v1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    monitor-enter p0

    :try_start_b
    invoke-virtual {v0, v1}, Ls6/b;->c(Ls6/a;)Z

    move-result v2

    if-nez v2, :cond_17

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_13
    .catchall {:try_start_b .. :try_end_13} :catchall_15

    monitor-exit p0

    goto :goto_21

    :catchall_15
    move-exception v0

    goto :goto_1f

    :cond_17
    :try_start_17
    const-string v0, "Cannot connect on a destroyed WallpaperConnection"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1f
    .catchall {:try_start_17 .. :try_end_1f} :catchall_15

    :goto_1f
    monitor-exit p0

    throw v0

    :cond_21
    :goto_21
    monitor-enter p0

    :try_start_22
    invoke-virtual {v0, v1}, Ls6/b;->c(Ls6/a;)Z

    move-result v2

    if-eqz v2, :cond_4c

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but already in state."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_48
    .catchall {:try_start_22 .. :try_end_48} :catchall_4a

    monitor-exit p0

    return-void

    :catchall_4a
    move-exception v0

    goto :goto_97

    :cond_4c
    :try_start_4c
    invoke-virtual {p0}, Ls6/h;->n()V

    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object v2

    invoke-virtual {v2, p0}, Ls6/p;->b0(Ls6/h;)V

    invoke-static {v0, v1}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_5b
    .catchall {:try_start_4c .. :try_end_5b} :catchall_4a

    monitor-exit p0

    monitor-enter p0

    :try_start_5d
    iget-object v2, p0, Ls6/h;->i:Ls6/b;

    invoke-virtual {v2}, Ls6/b;->f()Z
    :try_end_62
    .catchall {:try_start_5d .. :try_end_62} :catchall_94

    monitor-exit p0

    const/4 v2, 0x0

    iput-object v2, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    iput-object v2, p0, Ls6/h;->f:Landroid/view/SurfaceView;

    iput-object v2, p0, Ls6/h;->a:LH3/C$c;

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq6/b;->a(Ljava/lang/String;)V

    return-void

    :catchall_94
    move-exception v0

    monitor-exit p0

    throw v0

    :goto_97
    monitor-exit p0

    throw v0
.end method

.method public b()Z
    .registers 5

    iget-object v0, p0, Ls6/h;->i:Ls6/b;

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

    if-eqz v2, :cond_4f

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but already in state."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_4a
    .catchall {:try_start_24 .. :try_end_4a} :catchall_4d

    monitor-exit p0

    const/4 p0, 0x1

    return p0

    :catchall_4d
    move-exception v0

    goto :goto_91

    :cond_4f
    :try_start_4f
    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object v2

    invoke-virtual {v2}, Ls6/p;->a0()Z

    move-result v2

    if-eqz v2, :cond_5c

    invoke-static {v0, v1}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    :cond_5c
    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_5e
    .catchall {:try_start_4f .. :try_end_5e} :catchall_4d

    monitor-exit p0

    if-eqz v2, :cond_68

    iget-object p0, p0, Ls6/h;->a:LH3/C$c;

    if-eqz p0, :cond_68

    invoke-interface {p0}, LH3/C$c;->H()V

    :cond_68
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

    :goto_91
    monitor-exit p0

    throw v0
.end method

.method public c(Z)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    invoke-virtual {v0, p1}, Ls6/b;->h(Z)V

    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls6/p;->p0(Z)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_f
    .catchall {:try_start_1 .. :try_end_f} :catchall_11

    monitor-exit p0

    return-void

    :catchall_11
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final n()V
    .registers 5

    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    sget-object v1, Ls6/a$d;->r:Ls6/a$d;

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

    if-eqz v2, :cond_4e

    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but already in state."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_4a
    .catchall {:try_start_24 .. :try_end_4a} :catchall_4c

    monitor-exit p0

    return-void

    :catchall_4c
    move-exception v0

    goto :goto_96

    :cond_4e
    :try_start_4e
    invoke-direct {p0}, Ls6/h;->r()Ls6/p;

    move-result-object v2

    invoke-virtual {v2}, Ls6/p;->c0()V

    invoke-static {v0, v1}, Ls6/b;->b(Ls6/b;Ls6/a;)V

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_5a
    .catchall {:try_start_4e .. :try_end_5a} :catchall_4c

    monitor-exit p0

    monitor-enter p0

    :try_start_5c
    iget-object v2, p0, Ls6/h;->i:Ls6/b;

    invoke-virtual {v2}, Ls6/b;->f()Z
    :try_end_61
    .catchall {:try_start_5c .. :try_end_61} :catchall_93

    monitor-exit p0

    iget-object p0, p0, Ls6/h;->a:LH3/C$c;

    if-eqz p0, :cond_69

    invoke-interface {p0}, LH3/C$c;->E()V

    :cond_69
    invoke-static {}, Ls6/b;->a()Lq6/b;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " do event "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq6/b;->a(Ljava/lang/String;)V

    return-void

    :catchall_93
    move-exception v0

    monitor-exit p0

    throw v0

    :goto_96
    monitor-exit p0

    throw v0
.end method

.method public final s()Landroid/graphics/Point;
    .registers 2

    iget-object p0, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    if-eqz p0, :cond_18

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object p0

    if-eqz p0, :cond_18

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    invoke-virtual {v0, p0}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object p0

    const-string v0, "getScreenSize(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_18
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Display is null due to the view not currently attached to a window."

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final t()Landroid/graphics/Point;
    .registers 3

    iget-object p0, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    if-eqz p0, :cond_12

    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    invoke-direct {v0, v1, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object v0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method public final u(Ls6/a$e;)Z
    .registers 6

    monitor-enter p0

    if-eqz p1, :cond_f

    :try_start_3
    iget-object v0, p0, Ls6/h;->i:Ls6/b;

    invoke-virtual {v0, p1}, Ls6/b;->i(Ls6/a$e;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    goto :goto_1f

    :catchall_d
    move-exception p1

    goto :goto_72

    :cond_f
    iget-object p1, p0, Ls6/h;->i:Ls6/b;

    invoke-virtual {p1}, Ls6/b;->f()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object p1, p0, Ls6/h;->i:Ls6/b;

    invoke-virtual {p1}, Ls6/b;->d()Ls6/a$e;

    move-result-object p1

    goto :goto_1f

    :cond_1e
    const/4 p1, 0x0

    :goto_1f
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_21
    .catchall {:try_start_3 .. :try_end_21} :catchall_d

    monitor-exit p0

    sget-object v1, Ls6/h;->k:Lq6/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " moveState moved "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", newState "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq6/b;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_71

    sget-object v1, Ls6/a$e$d;->s:Ls6/a$e$d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_56

    invoke-direct {p0}, Ls6/h;->v()V

    return v0

    :cond_56
    instance-of v1, p1, Ls6/a$e$b;

    if-eqz v1, :cond_6a

    check-cast p1, Ls6/a$e$b;

    invoke-virtual {p1}, Ls6/a$e$b;->k()Z

    move-result p1

    if-eqz p1, :cond_66

    invoke-direct {p0}, Ls6/h;->o()V

    return v0

    :cond_66
    invoke-direct {p0}, Ls6/h;->k()V

    return v0

    :cond_6a
    instance-of p1, p1, Ls6/a$e$e;

    if-eqz p1, :cond_71

    invoke-direct {p0}, Ls6/h;->w()V

    :cond_71
    return v0

    :goto_72
    monitor-exit p0

    throw p1
.end method

.method public final x(Landroid/app/WallpaperColors;I)V
    .registers 5

    iget-object v0, p0, Ls6/h;->e:Landroid/view/SurfaceView;

    if-eqz v0, :cond_c

    new-instance v1, Ls6/d;

    invoke-direct {v1, p0, p1, p2}, Ls6/d;-><init>(Ls6/h;Landroid/app/WallpaperColors;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_c
    return-void
.end method
