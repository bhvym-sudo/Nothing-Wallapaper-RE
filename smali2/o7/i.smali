.class public final Lo7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/i$a;
    }
.end annotation


# static fields
.field public static final m:Lo7/i$a;


# instance fields
.field private final a:LC6/g;

.field private final b:Landroidx/lifecycle/Q;

.field private final c:Lq6/b;

.field private d:Landroid/graphics/Point;

.field private e:Landroid/graphics/Point;

.field private final f:Z

.field private g:Lv8/l;

.field private volatile h:Z

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/Float;

.field private l:Landroid/graphics/PointF;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lo7/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo7/i$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lo7/i;->m:Lo7/i$a;

    return-void
.end method

.method public constructor <init>(LC6/g;Landroidx/lifecycle/Q;)V
    .registers 4

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/i;->a:LC6/g;

    iput-object p2, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    new-instance p1, Lq6/b;

    const-string p2, "WallpaperImageScopeHelper"

    invoke-direct {p1, p2}, Lq6/b;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lo7/i;->c:Lq6/b;

    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_23

    invoke-direct {p0}, Lo7/i;->d()Landroid/graphics/PointF;

    move-result-object p1

    if-eqz p1, :cond_23

    const/4 p1, 0x1

    goto :goto_24

    :cond_23
    const/4 p1, 0x0

    :goto_24
    iput-boolean p1, p0, Lo7/i;->f:Z

    return-void
.end method

.method private final a(Ljava/lang/Float;Landroid/graphics/PointF;)V
    .registers 8

    iget-boolean v0, p0, Lo7/i;->i:Z

    if-eqz v0, :cond_72

    iget-object v0, p0, Lo7/i;->g:Lv8/l;

    if-eqz v0, :cond_72

    invoke-virtual {p0}, Lo7/i;->h()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v1

    if-eqz v1, :cond_6f

    invoke-virtual {v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->a(FLjava/lang/Float;)Z

    move-result p1

    const-string v2, "."

    if-eqz p1, :cond_3e

    invoke-virtual {v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3e

    iget-object p1, p0, Lo7/i;->c:Lq6/b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "consumePending but skip send "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq6/b;->a(Ljava/lang/String;)V

    goto :goto_6f

    :cond_3e
    invoke-direct {p0, v1}, Lo7/i;->i(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)Z

    move-result p1

    iget-object p2, p0, Lo7/i;->c:Lq6/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "consumePending, normalized = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " , send "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    if-nez p1, :cond_6c

    invoke-virtual {p0, v1}, Lo7/i;->m(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V

    :cond_6c
    invoke-interface {v0, v1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6f
    :goto_6f
    const/4 p1, 0x0

    iput-boolean p1, p0, Lo7/i;->i:Z

    :cond_72
    return-void
.end method

.method static synthetic b(Lo7/i;Ljava/lang/Float;Landroid/graphics/PointF;ILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_6

    move-object p1, v0

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_b

    move-object p2, v0

    :cond_b
    invoke-direct {p0, p1, p2}, Lo7/i;->a(Ljava/lang/Float;Landroid/graphics/PointF;)V

    return-void
.end method

.method private final d()Landroid/graphics/PointF;
    .registers 2

    iget-object p0, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_scope_center"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/PointF;

    return-object p0
.end method

.method private final e()Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 6

    iget-boolean v0, p0, Lo7/i;->h:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_73

    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object v0

    if-nez v0, :cond_11

    invoke-direct {p0}, Lo7/i;->d()Landroid/graphics/PointF;

    move-result-object v0

    if-eqz v0, :cond_73

    :cond_11
    new-instance v0, Ljava/lang/StringBuffer;

    iget-object v2, p0, Lo7/i;->j:Ljava/lang/String;

    if-nez v2, :cond_19

    const-string v2, ""

    :cond_19
    invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_27

    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object v2

    goto :goto_3c

    :cond_27
    const-string v2, "|LastScope.scale"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    if-eqz v2, :cond_3b

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_3c

    :cond_3b
    move-object v2, v1

    :goto_3c
    invoke-direct {p0}, Lo7/i;->d()Landroid/graphics/PointF;

    move-result-object v3

    if-nez v3, :cond_53

    const-string v3, "|LastScope.center"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v3

    if-eqz v3, :cond_52

    invoke-virtual {v3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v3

    goto :goto_53

    :cond_52
    move-object v3, v1

    :cond_53
    :goto_53
    if-eqz v2, :cond_73

    if-eqz v3, :cond_73

    new-instance v4, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget-object p0, p0, Lo7/i;->d:Landroid/graphics/Point;

    if-nez p0, :cond_67

    const-string p0, "viewSize"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_68

    :cond_67
    move-object v1, p0

    :goto_68
    invoke-direct {v4, v2, v3, v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;-><init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->setReason(Ljava/lang/String;)V

    return-object v4

    :cond_73
    return-object v1
.end method

.method private final g()Ljava/lang/Float;
    .registers 2

    iget-object p0, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_scope_scale"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method

.method private final i(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)Z
    .registers 4

    iget-boolean v0, p0, Lo7/i;->h:Z

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v0

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getViewSize()Landroid/graphics/Point;

    move-result-object v1

    iget-object p0, p0, Lo7/i;->e:Landroid/graphics/Point;

    if-nez p0, :cond_18

    const-string p0, "imageSize"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_18
    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object p1

    invoke-static {v0, v1, p0, p1}, LG6/b;->j(FLandroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/PointF;)Z

    move-result p0

    return p0
.end method

.method private final l(Landroid/graphics/PointF;)V
    .registers 3

    iget-object p0, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_scope_center"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final o(Ljava/lang/Float;)V
    .registers 3

    iget-object p0, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_scope_scale"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized c(Ljava/lang/Float;Landroid/graphics/PointF;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lo7/i;->c:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "consumeScope, scale="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", center="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const-string v0, "consumeScope"

    invoke-virtual {p0, p2, p1, v0}, Lo7/i;->j(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V

    invoke-direct {p0}, Lo7/i;->e()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    if-eqz p1, :cond_42

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iput-object p2, p0, Lo7/i;->k:Ljava/lang/Float;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object p1

    iput-object p1, p0, Lo7/i;->l:Landroid/graphics/PointF;

    goto :goto_42

    :catchall_40
    move-exception p1

    goto :goto_49

    :cond_42
    :goto_42
    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, p1, p2}, Lo7/i;->b(Lo7/i;Ljava/lang/Float;Landroid/graphics/PointF;ILjava/lang/Object;)V
    :try_end_47
    .catchall {:try_start_1 .. :try_end_47} :catchall_40

    monitor-exit p0

    return-void

    :goto_49
    :try_start_49
    monitor-exit p0
    :try_end_4a
    .catchall {:try_start_49 .. :try_end_4a} :catchall_40

    throw p1
.end method

.method public final f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 2

    iget-object p0, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_origin_scope"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    return-object p0
.end method

.method public final h()Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 2

    invoke-direct {p0}, Lo7/i;->e()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    return-object p0

    :cond_b
    return-object v0
.end method

.method public final declared-synchronized j(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V
    .registers 12

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lo7/i;->h:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_19

    if-nez v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    invoke-direct {p0}, Lo7/i;->d()Landroid/graphics/PointF;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1d

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v0

    goto :goto_1d

    :catchall_19
    move-exception p1

    goto/16 :goto_ba

    :cond_1c
    move-object v0, v1

    :cond_1d
    :goto_1d
    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object v2

    if-nez v2, :cond_33

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    if-eqz v2, :cond_32

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_33

    :cond_32
    move-object v2, v1

    :cond_33
    :goto_33
    const/4 v3, 0x1

    if-nez v0, :cond_3a

    if-nez v2, :cond_3a

    move v4, v3

    goto :goto_3b

    :cond_3a
    const/4 v4, 0x0

    :goto_3b
    if-eqz p1, :cond_49

    new-instance v5, Landroid/graphics/PointF;

    iget v6, p1, Landroid/graphics/PointF;->x:F

    iget v7, p1, Landroid/graphics/PointF;->y:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {p0, v5}, Lo7/i;->l(Landroid/graphics/PointF;)V

    :cond_49
    if-eqz p2, :cond_56

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-direct {p0, v5}, Lo7/i;->o(Ljava/lang/Float;)V

    :cond_56
    invoke-direct {p0}, Lo7/i;->d()Landroid/graphics/PointF;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_62

    if-eqz p2, :cond_8a

    :cond_62
    if-nez p1, :cond_6e

    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Float;Ljava/lang/Float;)Z

    move-result p1

    if-eqz p1, :cond_8a

    :cond_6e
    invoke-direct {p0}, Lo7/i;->d()Landroid/graphics/PointF;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8a

    invoke-direct {p0}, Lo7/i;->g()Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Float;Ljava/lang/Float;)Z

    move-result p1

    if-eqz p1, :cond_8a

    const-string p1, "reason_depth_init"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_aa

    :cond_8a
    iput-object p3, p0, Lo7/i;->j:Ljava/lang/String;

    invoke-direct {p0}, Lo7/i;->e()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    if-eqz p1, :cond_aa

    iget-object p2, p0, Lo7/i;->c:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onScopeChanged,received new scope "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lq6/b;->a(Ljava/lang/String;)V

    iput-boolean v3, p0, Lo7/i;->i:Z

    :cond_aa
    if-nez v4, :cond_b4

    const-string p1, "reason_depth_init"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b8

    :cond_b4
    const/4 p1, 0x3

    invoke-static {p0, v1, v1, p1, v1}, Lo7/i;->b(Lo7/i;Ljava/lang/Float;Landroid/graphics/PointF;ILjava/lang/Object;)V
    :try_end_b8
    .catchall {:try_start_7 .. :try_end_b8} :catchall_19

    :cond_b8
    monitor-exit p0

    return-void

    :goto_ba
    :try_start_ba
    monitor-exit p0
    :try_end_bb
    .catchall {:try_start_ba .. :try_end_bb} :catchall_19

    throw p1
.end method

.method public final declared-synchronized k(Z)V
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lo7/i;->c:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onScopeChangedEnd, send new scope, force:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_24

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo7/i;->i:Z

    const/4 p1, 0x3

    invoke-static {p0, v0, v0, p1, v0}, Lo7/i;->b(Lo7/i;Ljava/lang/Float;Landroid/graphics/PointF;ILjava/lang/Object;)V

    goto :goto_2b

    :catchall_22
    move-exception p1

    goto :goto_31

    :cond_24
    iget-object p1, p0, Lo7/i;->k:Ljava/lang/Float;

    iget-object v1, p0, Lo7/i;->l:Landroid/graphics/PointF;

    invoke-direct {p0, p1, v1}, Lo7/i;->a(Ljava/lang/Float;Landroid/graphics/PointF;)V

    :goto_2b
    iput-object v0, p0, Lo7/i;->k:Ljava/lang/Float;

    iput-object v0, p0, Lo7/i;->l:Landroid/graphics/PointF;
    :try_end_2f
    .catchall {:try_start_1 .. :try_end_2f} :catchall_22

    monitor-exit p0

    return-void

    :goto_31
    :try_start_31
    monitor-exit p0
    :try_end_32
    .catchall {:try_start_31 .. :try_end_32} :catchall_22

    throw p1
.end method

.method public final m(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V
    .registers 3

    iget-object p0, p0, Lo7/i;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_origin_scope"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final n(Lv8/l;)V
    .registers 3

    iget-object v0, p0, Lo7/i;->g:Lv8/l;

    iput-object p1, p0, Lo7/i;->g:Lv8/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    if-eqz p1, :cond_e

    const/4 p1, 0x1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    iput-boolean p1, p0, Lo7/i;->i:Z

    const/4 p1, 0x3

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, p1, v0}, Lo7/i;->b(Lo7/i;Ljava/lang/Float;Landroid/graphics/PointF;ILjava/lang/Object;)V

    return-void
.end method

.method public final declared-synchronized p(Landroid/graphics/Point;Landroid/graphics/Point;)V
    .registers 5

    monitor-enter p0

    :try_start_1
    const-string v0, "viewSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageSize"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lo7/i;->h:Z
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_2a

    if-eqz v0, :cond_11

    monitor-exit p0

    return-void

    :cond_11
    const/4 v0, 0x1

    :try_start_12
    iput-boolean v0, p0, Lo7/i;->h:Z

    iput-object p1, p0, Lo7/i;->d:Landroid/graphics/Point;

    iput-object p2, p0, Lo7/i;->e:Landroid/graphics/Point;

    iget-object p2, p0, Lo7/i;->a:LC6/g;

    invoke-static {p2, p1}, LG6/c;->i(LC6/g;Landroid/graphics/Point;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2c

    const-string v1, "LastScope"

    invoke-virtual {p1, v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->setReason(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo7/i;->i(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)Z

    goto :goto_2d

    :catchall_2a
    move-exception p1

    goto :goto_44

    :cond_2c
    move-object p1, p2

    :goto_2d
    invoke-virtual {p0, p1}, Lo7/i;->m(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    if-nez p1, :cond_3c

    iget-boolean p1, p0, Lo7/i;->f:Z

    if-eqz p1, :cond_3b

    goto :goto_3c

    :cond_3b
    const/4 v0, 0x0

    :cond_3c
    :goto_3c
    iput-boolean v0, p0, Lo7/i;->i:Z

    const/4 p1, 0x3

    invoke-static {p0, p2, p2, p1, p2}, Lo7/i;->b(Lo7/i;Ljava/lang/Float;Landroid/graphics/PointF;ILjava/lang/Object;)V
    :try_end_42
    .catchall {:try_start_12 .. :try_end_42} :catchall_2a

    monitor-exit p0

    return-void

    :goto_44
    :try_start_44
    monitor-exit p0
    :try_end_45
    .catchall {:try_start_44 .. :try_end_45} :catchall_2a

    throw p1
.end method

.method public final declared-synchronized q(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0, p1}, Lo7/i;->m(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V
    :try_end_4
    .catchall {:try_start_1 .. :try_end_4} :catchall_6

    monitor-exit p0

    return-void

    :catchall_6
    move-exception p1

    :try_start_7
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_7 .. :try_end_8} :catchall_6

    throw p1
.end method
