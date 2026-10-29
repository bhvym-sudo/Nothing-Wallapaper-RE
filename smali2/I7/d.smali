.class public final LI7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/d$a;
    }
.end annotation


# static fields
.field public static final b:LI7/d$a;


# instance fields
.field private final a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LI7/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI7/d$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LI7/d;->b:LI7/d$a;

    return-void
.end method

.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 3

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-void
.end method

.method private final a()Z
    .registers 3

    iget-object p0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_17

    invoke-virtual {p0}, LE7/Z;->F()Lg3/x;

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-static {p0}, LG6/e;->i(Lg3/x;)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_17

    return v1

    :cond_17
    return v0
.end method

.method private final b()Z
    .registers 3

    iget-object p0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_11

    invoke-virtual {p0}, LE7/Z;->G()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_11

    return v1

    :cond_11
    return v0
.end method

.method private final c()Z
    .registers 3

    iget-object v0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Lj7/j;->k0()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_22

    iget-object p0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    if-eqz p0, :cond_1c

    invoke-virtual {p0}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object p0

    goto :goto_1d

    :cond_1c
    const/4 p0, 0x0

    :goto_1d
    instance-of p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-nez p0, :cond_22

    return v1

    :cond_22
    const/4 p0, 0x0

    return p0
.end method

.method private final d()Z
    .registers 3

    iget-object v0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lj7/j;->k0()Z

    move-result v0

    if-ne v0, v1, :cond_10

    goto :goto_23

    :cond_10
    iget-object p0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    if-eqz p0, :cond_1d

    invoke-virtual {p0}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object p0

    goto :goto_1e

    :cond_1d
    const/4 p0, 0x0

    :goto_1e
    instance-of p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-eqz p0, :cond_23

    return v1

    :cond_23
    :goto_23
    const/4 p0, 0x0

    return p0
.end method

.method private final e()Z
    .registers 3

    invoke-direct {p0}, LI7/d;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    invoke-direct {p0}, LI7/d;->d()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-direct {p0}, LI7/d;->c()Z

    move-result p0

    if-eqz p0, :cond_14

    goto :goto_15

    :cond_14
    return v1

    :cond_15
    :goto_15
    const/4 p0, 0x1

    return p0

    :cond_17
    return v1
.end method

.method private final f()Z
    .registers 3

    iget-object p0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_17

    invoke-virtual {p0}, LE7/Z;->F()Lg3/x;

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-static {p0}, LG6/e;->m(Lg3/x;)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_17

    return v1

    :cond_17
    return v0
.end method


# virtual methods
.method public final g()Z
    .registers 7

    invoke-direct {p0}, LI7/d;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    iget-object v0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M2()Lo7/g;

    move-result-object v0

    if-nez v0, :cond_11

    return v1

    :cond_11
    invoke-virtual {v0}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v2

    goto :goto_1e

    :cond_1d
    move-object v2, v3

    :goto_1e
    invoke-virtual {v0}, Lo7/g;->b0()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v4

    if-eqz v4, :cond_29

    invoke-virtual {v4}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v4

    goto :goto_2a

    :cond_29
    move-object v4, v3

    :goto_2a
    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_5a

    invoke-virtual {v0}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    if-eqz v2, :cond_40

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_41

    :cond_40
    move-object v2, v3

    :goto_41
    invoke-virtual {v0}, Lo7/g;->b0()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v0

    if-eqz v0, :cond_50

    invoke-virtual {v0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_51

    :cond_50
    move-object v0, v3

    :goto_51
    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Float;Ljava/lang/Float;)Z

    move-result v0

    if-nez v0, :cond_58

    goto :goto_5a

    :cond_58
    move v0, v1

    goto :goto_5b

    :cond_5a
    :goto_5a
    move v0, v4

    :goto_5b
    iget-object v2, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object v2

    if-eqz v2, :cond_67

    invoke-virtual {v2}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object v3

    :cond_67
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isNeedSaveWallpaper moved:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " state:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WallpaperPersistStrategy"

    invoke-static {v3, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_95

    invoke-direct {p0}, LI7/d;->b()Z

    move-result v0

    if-eqz v0, :cond_94

    invoke-direct {p0}, LI7/d;->d()Z

    move-result p0

    if-eqz p0, :cond_94

    goto :goto_95

    :cond_94
    return v1

    :cond_95
    :goto_95
    return v4
.end method

.method public final h()Z
    .registers 3

    invoke-direct {p0}, LI7/d;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    invoke-virtual {p0}, LI7/d;->g()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-direct {p0}, LI7/d;->e()Z

    move-result p0

    if-eqz p0, :cond_15

    goto :goto_16

    :cond_15
    return v1

    :cond_16
    :goto_16
    const/4 p0, 0x1

    return p0
.end method

.method public final i()V
    .registers 5

    invoke-direct {p0}, LI7/d;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_5c

    :cond_7
    iget-object v0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M2()Lo7/g;

    move-result-object v0

    if-nez v0, :cond_10

    goto :goto_5c

    :cond_10
    iget-object v1, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object v1

    if-eqz v1, :cond_5c

    invoke-virtual {v0}, Lo7/g;->b0()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    if-eqz v2, :cond_23

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v2

    goto :goto_2b

    :cond_23
    invoke-virtual {v1}, LE7/Z;->A()LE7/c0;

    move-result-object v2

    invoke-virtual {v2}, LE7/c0;->h()F

    move-result v2

    :goto_2b
    invoke-virtual {v0}, Lo7/g;->b0()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v3

    if-eqz v3, :cond_37

    invoke-virtual {v3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v3

    if-nez v3, :cond_3f

    :cond_37
    invoke-virtual {v1}, LE7/Z;->A()LE7/c0;

    move-result-object v3

    invoke-virtual {v3}, LE7/c0;->g()Landroid/graphics/PointF;

    move-result-object v3

    :cond_3f
    invoke-direct {p0}, LI7/d;->b()Z

    move-result p0

    if-eqz p0, :cond_4c

    invoke-virtual {v1}, LE7/Z;->C()Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    move-result-object p0

    invoke-virtual {p0, v2, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    :cond_4c
    invoke-virtual {v1}, LE7/Z;->E()Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    move-result-object p0

    invoke-virtual {p0, v2, v3}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setScaleAndCenter(FLandroid/graphics/PointF;)V

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const-string v1, "reason_depth_init"

    invoke-virtual {v0, v3, p0, v1}, Lo7/g;->j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    :cond_5c
    :goto_5c
    return-void
.end method

.method public final j()Z
    .registers 9

    iget-object v0, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_92

    iget-object v2, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object v2

    invoke-virtual {v2}, LJ7/b;->j()LI8/A;

    move-result-object v2

    invoke-interface {v2}, LI8/A;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_92

    invoke-direct {p0}, LI7/d;->f()Z

    move-result v2

    if-eqz v2, :cond_26

    goto :goto_92

    :cond_26
    invoke-virtual {p0}, LI7/d;->g()Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveWallpaper need:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "WallpaperPersistStrategy"

    invoke-static {v4, v3}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_80

    invoke-direct {p0}, LI7/d;->a()Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "requireActivity(...)"

    if-eqz v3, :cond_67

    iget-object v3, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object v3

    if-eqz v3, :cond_80

    iget-object v6, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v6}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lk7/a;->r:Lk7/a;

    invoke-static {v5}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x2

    invoke-virtual {v3, v6, v5, v7, v4}, Lj7/j;->Z0(Landroid/app/Activity;Ljava/util/List;ILandroid/service/wallpaper/IWallpaperEngine;)V

    goto :goto_80

    :cond_67
    iget-object v3, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object v3

    if-eqz v3, :cond_80

    iget-object v6, p0, LI7/d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v6}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x1

    invoke-virtual {v3, v6, v5, v7, v4}, Lj7/j;->Z0(Landroid/app/Activity;Ljava/util/List;ILandroid/service/wallpaper/IWallpaperEngine;)V

    :cond_80
    :goto_80
    invoke-direct {p0}, LI7/d;->b()Z

    move-result v3

    if-eqz v3, :cond_91

    invoke-direct {p0}, LI7/d;->c()Z

    move-result p0

    if-eqz p0, :cond_91

    sget-object p0, Lj7/j;->T:Lj7/j$a;

    invoke-virtual {p0, v0, v1}, Lj7/j$a;->c(Landroid/content/Context;Z)V

    :cond_91
    return v2

    :cond_92
    :goto_92
    return v1
.end method
