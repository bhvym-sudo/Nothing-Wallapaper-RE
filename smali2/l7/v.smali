.class public final Ll7/v;
.super Ll7/k;
.source "SourceFile"

# interfaces
.implements LH3/C$c;


# instance fields
.field private final J:Ljava/lang/String;

.field private final K:Lh8/h;

.field private L:Landroidx/cardview/widget/CardView;

.field private M:Landroid/view/SurfaceView;

.field private N:LH3/F;

.field private O:LH3/C;

.field private P:Li3/J0;


# direct methods
.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Ll7/k;-><init>()V

    const-string v0, "CropLiveFragment"

    iput-object v0, p0, Ll7/v;->J:Ljava/lang/String;

    const-class v0, Lo7/h;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, Ll7/v$a;

    invoke-direct {v1, p0}, Ll7/v$a;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, Ll7/v$b;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Ll7/v$b;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, Ll7/v$c;

    invoke-direct {v3, p0}, Ll7/v$c;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Ll7/v;->K:Lh8/h;

    return-void
.end method

.method public static synthetic o1(Ll7/v;)V
    .registers 1

    invoke-static {p0}, Ll7/v;->t1(Ll7/v;)V

    return-void
.end method

.method public static synthetic p1(Ll7/v;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 3

    invoke-static {p0, p1, p2}, Ll7/v;->y1(Ll7/v;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic q1(Ll7/v;)V
    .registers 1

    invoke-static {p0}, Ll7/v;->v1(Ll7/v;)V

    return-void
.end method

.method private static final t1(Ll7/v;)V
    .registers 1

    invoke-direct {p0}, Ll7/v;->u1()V

    return-void
.end method

.method private final u1()V
    .registers 3

    iget-object v0, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    if-eqz v0, :cond_c

    new-instance v1, Ll7/u;

    invoke-direct {v1, p0}, Ll7/u;-><init>(Ll7/v;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_c
    return-void
.end method

.method private static final v1(Ll7/v;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Ll7/v;->N:LH3/F;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, LH3/F;->c()Landroid/widget/ImageView;

    move-result-object v0

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_1b

    iget-object v0, p0, Ll7/v;->N:LH3/F;

    if-eqz v0, :cond_1b

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LH3/F;->i(Z)V

    :cond_1b
    invoke-direct {p0}, Ll7/v;->w1()V

    return-void
.end method

.method private final w1()V
    .registers 14

    invoke-virtual {p0}, Ll7/k;->M0()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Ll7/v;->r1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll7/v;->s1()Lo7/h;

    move-result-object v1

    invoke-virtual {v1}, Lo7/h;->y()Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    goto :goto_1c

    :cond_1b
    move-object v1, v2

    :goto_1c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setUpLiveWallpaperPreview "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ll7/v;->O:LH3/C;

    if-nez v0, :cond_c7

    invoke-static {}, LH3/C;->l0()Z

    move-result v0

    if-eqz v0, :cond_c7

    sget-boolean v0, Lcom/android/launcher3/w;->i:Z

    const/4 v1, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_8a

    new-instance v4, LH3/C;

    invoke-virtual {p0}, Ll7/v;->s1()Lo7/h;

    move-result-object v0

    invoke-virtual {v0}, Lo7/h;->y()Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v6

    iget-object v8, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    invoke-static {v8}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ll7/v;->s1()Lo7/h;

    move-result-object v0

    invoke-virtual {v0}, Lo7/h;->z()Z

    move-result v0

    if-eqz v0, :cond_5e

    move v1, v3

    :cond_5e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {p0}, Ll7/k;->N0()Z

    move-result v0

    if-eqz v0, :cond_6c

    sget-object v0, LH3/C$d;->t:LH3/C$d;

    :goto_6a
    move-object v11, v0

    goto :goto_6f

    :cond_6c
    sget-object v0, LH3/C$d;->s:LH3/C$d;

    goto :goto_6a

    :goto_6f
    new-instance v0, Landroid/app/wallpaper/WallpaperDescription$Builder;

    invoke-direct {v0}, Landroid/app/wallpaper/WallpaperDescription$Builder;-><init>()V

    invoke-virtual {p0}, Ll7/v;->s1()Lo7/h;

    move-result-object v1

    invoke-virtual {v1}, Lo7/h;->x()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/wallpaper/WallpaperDescription$Builder;->setComponent(Landroid/content/ComponentName;)Landroid/app/wallpaper/WallpaperDescription$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/wallpaper/WallpaperDescription$Builder;->build()Landroid/app/wallpaper/WallpaperDescription;

    move-result-object v12

    const/4 v9, 0x0

    move-object v7, p0

    invoke-direct/range {v4 .. v12}, LH3/C;-><init>(Landroid/content/Intent;Landroid/content/Context;LH3/C$c;Landroid/view/SurfaceView;Landroid/view/SurfaceView;Ljava/lang/Integer;LH3/C$d;Landroid/app/wallpaper/WallpaperDescription;)V

    goto :goto_c1

    :cond_8a
    move-object v7, p0

    new-instance v5, LH3/C;

    invoke-virtual {v7}, Ll7/v;->s1()Lo7/h;

    move-result-object p0

    invoke-virtual {p0}, Lo7/h;->y()Landroid/content/Intent;

    move-result-object v6

    move-object v8, v7

    invoke-virtual {v8}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v7

    iget-object v9, v8, Ll7/v;->M:Landroid/view/SurfaceView;

    invoke-static {v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ll7/v;->s1()Lo7/h;

    move-result-object p0

    invoke-virtual {p0}, Lo7/h;->z()Z

    move-result p0

    if-eqz p0, :cond_aa

    move v1, v3

    :cond_aa
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v8}, Ll7/k;->N0()Z

    move-result p0

    if-eqz p0, :cond_b8

    sget-object p0, LH3/C$d;->t:LH3/C$d;

    :goto_b6
    move-object v12, p0

    goto :goto_bb

    :cond_b8
    sget-object p0, LH3/C$d;->s:LH3/C$d;

    goto :goto_b6

    :goto_bb
    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, LH3/C;-><init>(Landroid/content/Intent;Landroid/content/Context;LH3/C$c;Landroid/view/SurfaceView;Landroid/view/SurfaceView;Ljava/lang/Integer;LH3/C$d;)V

    move-object v7, v8

    move-object v4, v5

    :goto_c1
    iput-object v4, v7, Ll7/v;->O:LH3/C;

    invoke-virtual {v4, v3}, LH3/C;->u0(Z)V

    goto :goto_c8

    :cond_c7
    move-object v7, p0

    :goto_c8
    iget-object p0, v7, Ll7/v;->O:LH3/C;

    if-eqz p0, :cond_db

    invoke-virtual {p0}, LH3/C;->d0()Z

    move-result p0

    if-nez p0, :cond_db

    iget-object p0, v7, Ll7/v;->O:LH3/C;

    if-eqz p0, :cond_d9

    invoke-virtual {p0}, LH3/C;->e0()V

    :cond_d9
    iput-object v2, v7, Ll7/v;->O:LH3/C;

    :cond_db
    return-void
.end method

.method private final x1()V
    .registers 3

    iget-object v0, p0, Ll7/v;->L:Landroidx/cardview/widget/CardView;

    if-eqz v0, :cond_c

    new-instance v1, Ll7/s;

    invoke-direct {v1, p0}, Ll7/s;-><init>(Ll7/v;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_c
    return-void
.end method

.method private static final y1(Ll7/v;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 11

    const-string p1, "ev"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ll7/v;->O:LH3/C;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, LH3/C;->i0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object p1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    if-eqz p1, :cond_80

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    invoke-static {p2}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    :try_start_19
    iget-object v0, p0, Ll7/v;->O:LH3/C;

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, LH3/C;->i0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-interface {v0, v1}, Landroid/service/wallpaper/IWallpaperEngine;->dispatchPointer(Landroid/view/MotionEvent;)V

    goto :goto_2a

    :catchall_27
    move-exception v0

    move-object p0, v0

    goto :goto_7c

    :cond_2a
    :goto_2a
    const/4 v0, 0x1

    if-eq p1, v0, :cond_51

    const/4 v0, 0x6

    if-eq p1, v0, :cond_31

    goto :goto_6c

    :cond_31
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p1

    iget-object v0, p0, Ll7/v;->O:LH3/C;

    if-eqz v0, :cond_6c

    invoke-virtual {v0}, LH3/C;->i0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object v2

    if-eqz v2, :cond_6c

    const-string v3, "android.wallpaper.secondaryTap"

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v4, v0

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    float-to-int v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v2 .. v7}, Landroid/service/wallpaper/IWallpaperEngine;->dispatchWallpaperCommand(Ljava/lang/String;IIILandroid/os/Bundle;)V

    goto :goto_6c

    :cond_51
    iget-object p1, p0, Ll7/v;->O:LH3/C;

    if-eqz p1, :cond_6c

    invoke-virtual {p1}, LH3/C;->i0()Landroid/service/wallpaper/IWallpaperEngine;

    move-result-object v2

    if-eqz v2, :cond_6c

    const-string v3, "android.wallpaper.tap"

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int v4, p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v2 .. v7}, Landroid/service/wallpaper/IWallpaperEngine;->dispatchWallpaperCommand(Ljava/lang/String;IIILandroid/os/Bundle;)V

    :cond_6c
    :goto_6c
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_6e
    .catch Landroid/os/RemoteException; {:try_start_19 .. :try_end_6e} :catch_72
    .catchall {:try_start_19 .. :try_end_6e} :catchall_27

    :goto_6e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_80

    :catch_72
    :try_start_72
    invoke-virtual {p0}, Ll7/v;->r1()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Remote exception of wallpaper connection"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7b
    .catchall {:try_start_72 .. :try_end_7b} :catchall_27

    goto :goto_6e

    :goto_7c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    throw p0

    :cond_80
    :goto_80
    const/4 p0, 0x0

    return p0
.end method

.method private final z1()V
    .registers 3

    iget-object v0, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v1, p0, Ll7/v;->N:LH3/F;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_f
    iget-object p0, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    if-eqz p0, :cond_17

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    :cond_17
    return-void
.end method


# virtual methods
.method public bridge synthetic G0()Lo7/b;
    .registers 1

    invoke-virtual {p0}, Ll7/v;->s1()Lo7/h;

    move-result-object p0

    return-object p0
.end method

.method protected K0(Landroid/view/View;)V
    .registers 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ll7/k;->K0(Landroid/view/View;)V

    const v0, 0x7f0a02ac

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Ll7/v;->L:Landroidx/cardview/widget/CardView;

    const v0, 0x7f0a02ad

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    new-instance v0, LH3/F;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Ll7/v;->L:Landroidx/cardview/widget/CardView;

    iget-object v3, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "requireContext(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LG6/e;->f(Landroid/content/Context;)I

    move-result v4

    new-instance v5, Ll7/t;

    invoke-direct {v5, p0}, Ll7/t;-><init>(Ll7/v;)V

    invoke-direct/range {v0 .. v5}, LH3/F;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/view/SurfaceView;ILH3/F$a;)V

    iput-object v0, p0, Ll7/v;->N:LH3/F;

    invoke-virtual {p0}, Ll7/k;->H0()V

    return-void
.end method

.method public m()V
    .registers 3

    invoke-virtual {p0}, Ll7/v;->r1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onEngineShown"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll7/k;->M0()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_18

    :cond_10
    iget-object p0, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    if-eqz p0, :cond_18

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_18
    :goto_18
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, Ll7/k;->onCreate(Landroid/os/Bundle;)V

    new-instance p1, Li3/J0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    invoke-virtual {p0}, Ll7/k;->P0()Z

    move-result v1

    invoke-direct {p1, v0, v1}, Li3/J0;-><init>(Landroid/content/Context;Z)V

    iput-object p1, p0, Ll7/v;->P:Li3/J0;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 5

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll7/k;->Y0()V

    const p3, 0x7f0d0123

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll7/v;->K0(Landroid/view/View;)V

    return-object p1
.end method

.method public onDestroy()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroy()V

    invoke-virtual {p0}, Ll7/v;->s1()Lo7/h;

    move-result-object p0

    invoke-virtual {p0}, Lo7/h;->w()V

    return-void
.end method

.method public onDestroyView()V
    .registers 4

    invoke-super {p0}, Ll7/k;->onDestroyView()V

    iget-object v0, p0, Ll7/v;->O:LH3/C;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, LH3/C;->e0()V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Ll7/v;->O:LH3/C;

    iput-object v0, p0, Ll7/v;->L:Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    iget-object v1, p0, Ll7/v;->N:LH3/F;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, LH3/F;->b()V

    :cond_18
    iget-object v1, p0, Ll7/v;->M:Landroid/view/SurfaceView;

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    if-eqz v1, :cond_27

    iget-object v2, p0, Ll7/v;->N:LH3/F;

    invoke-interface {v1, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_27
    iput-object v0, p0, Ll7/v;->N:LH3/F;

    return-void
.end method

.method public onPause()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/q;->onPause()V

    iget-object p0, p0, Ll7/v;->O:LH3/C;

    if-eqz p0, :cond_b

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LH3/C;->u0(Z)V

    :cond_b
    return-void
.end method

.method public onResume()V
    .registers 2

    invoke-super {p0}, Ll7/k;->onResume()V

    iget-object p0, p0, Ll7/v;->O:LH3/C;

    if-eqz p0, :cond_b

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LH3/C;->u0(Z)V

    :cond_b
    return-void
.end method

.method public onStop()V
    .registers 1

    invoke-super {p0}, Landroidx/fragment/app/q;->onStop()V

    iget-object p0, p0, Ll7/v;->O:LH3/C;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, LH3/C;->g0()V

    :cond_a
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ll7/k;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const-string p1, "onViewCreated"

    invoke-static {p1}, Lcom/nothing/wallpaper/common/log/c;->j(Ljava/lang/String;)V

    invoke-direct {p0}, Ll7/v;->z1()V

    invoke-direct {p0}, Ll7/v;->x1()V

    return-void
.end method

.method protected r1()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Ll7/v;->J:Ljava/lang/String;

    return-object p0
.end method

.method protected s1()Lo7/h;
    .registers 1

    iget-object p0, p0, Ll7/v;->K:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo7/h;

    return-object p0
.end method
