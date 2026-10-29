.class public final LE7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE7/c$a;,
        LE7/c$b;
    }
.end annotation


# static fields
.field public static final e:LE7/c$a;

.field private static final f:Landroid/view/animation/PathInterpolator;


# instance fields
.field private final a:LE7/Z;

.field private final b:Lh8/h;

.field private final c:Landroidx/cardview/widget/CardView;

.field private d:Landroid/animation/ObjectAnimator;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, LE7/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE7/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LE7/c;->e:LE7/c$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, LE7/c;->f:Landroid/view/animation/PathInterpolator;

    return-void
.end method

.method public constructor <init>(LE7/Z;)V
    .registers 3

    const-string v0, "wallpaperHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/c;->a:LE7/Z;

    new-instance v0, LE7/b;

    invoke-direct {v0}, LE7/b;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, LE7/c;->b:Lh8/h;

    invoke-virtual {p1}, LE7/Z;->D()Landroidx/cardview/widget/CardView;

    move-result-object p1

    iput-object p1, p0, LE7/c;->c:Landroidx/cardview/widget/CardView;

    return-void
.end method

.method public static synthetic a()Lq6/d;
    .registers 1

    invoke-static {}, LE7/c;->i()Lq6/d;

    move-result-object v0

    return-object v0
.end method

.method private final c()Lq6/d;
    .registers 1

    iget-object p0, p0, LE7/c;->b:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq6/d;

    return-object p0
.end method

.method public static synthetic f(LE7/c;Landroid/view/View;ZJILjava/lang/Object;)Landroid/animation/ObjectAnimator;
    .registers 7

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_6

    const-wide/16 p3, 0x12c

    :cond_6
    invoke-virtual {p0, p1, p2, p3, p4}, LE7/c;->e(Landroid/view/View;ZJ)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method private final g(I)V
    .registers 4

    iget-object v0, p0, LE7/c;->a:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    invoke-direct {p0}, LE7/c;->c()Lq6/d;

    move-result-object p0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "getString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lq6/d;->d(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private final h()V
    .registers 5

    iget-object v0, p0, LE7/c;->a:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showUnavailableTip "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DepthUIController"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LE7/c;->a:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_29

    goto :goto_70

    :cond_29
    iget-object v1, p0, LE7/c;->a:LE7/Z;

    invoke-virtual {v1}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object v1

    instance-of v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    const v3, 0x7f1300db

    if-eqz v2, :cond_4f

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_40

    const v3, 0x7f13021e

    goto :goto_4b

    :cond_40
    check-cast v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;->isInstalling()Z

    move-result v0

    if-eqz v0, :cond_4b

    const v3, 0x7f1300d8

    :cond_4b
    :goto_4b
    invoke-direct {p0, v3}, LE7/c;->g(I)V

    return-void

    :cond_4f
    instance-of v0, v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    if-eqz v0, :cond_70

    check-cast v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;->getReason()Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    move-result-object v0

    sget-object v1, LE7/c$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_72

    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :pswitch_6a
    const v3, 0x7f1300dd

    :pswitch_6d
    invoke-direct {p0, v3}, LE7/c;->g(I)V

    :cond_70
    :goto_70
    return-void

    nop

    :pswitch_data_72
    .packed-switch 0x1
        :pswitch_6d
        :pswitch_6d
        :pswitch_6d
        :pswitch_6d
        :pswitch_6a
        :pswitch_6a
    .end packed-switch
.end method

.method private static final i()Lq6/d;
    .registers 1

    new-instance v0, Lq6/d;

    invoke-direct {v0}, Lq6/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final b()Landroid/animation/ObjectAnimator;
    .registers 1

    iget-object p0, p0, LE7/c;->d:Landroid/animation/ObjectAnimator;

    return-object p0
.end method

.method public final d(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V
    .registers 6

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleDepthStateChange newState:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DepthUIController"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LE7/c;->c:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_27

    move v0, v1

    goto :goto_28

    :cond_27
    move v0, v2

    :goto_28
    instance-of v3, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$Initializing;

    if-nez v3, :cond_47

    instance-of v0, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    if-nez v0, :cond_3f

    instance-of v0, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    if-eqz v0, :cond_35

    goto :goto_3f

    :cond_35
    instance-of v0, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-eqz v0, :cond_3b

    move v0, v1

    goto :goto_47

    :cond_3b
    instance-of p1, p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    if-eqz p1, :cond_41

    :cond_3f
    :goto_3f
    move v0, v2

    goto :goto_47

    :cond_41
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_47
    :goto_47
    iget-object p1, p0, LE7/c;->d:Landroid/animation/ObjectAnimator;

    if-eqz p1, :cond_4e

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_4e
    iget-object p1, p0, LE7/c;->c:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_57

    goto :goto_58

    :cond_57
    move v1, v2

    :goto_58
    if-eq v0, v1, :cond_64

    iget-object p1, p0, LE7/c;->c:Landroidx/cardview/widget/CardView;

    const-wide/16 v1, 0x12c

    invoke-virtual {p0, p1, v0, v1, v2}, LE7/c;->e(Landroid/view/View;ZJ)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, LE7/c;->d:Landroid/animation/ObjectAnimator;

    :cond_64
    return-void
.end method

.method public final e(Landroid/view/View;ZJ)Landroid/animation/ObjectAnimator;
    .registers 9

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    if-eqz p2, :cond_e

    move v2, v1

    goto :goto_f

    :cond_e
    move v2, v0

    :goto_f
    if-eqz p2, :cond_12

    goto :goto_13

    :cond_12
    move v0, v1

    :goto_13
    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v0, v1, v2

    invoke-static {p1, p0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    invoke-virtual {p0, p3, p4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p3, LE7/c;->f:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p0, p3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p3, LE7/c$c;

    invoke-direct {p3, p1, p2}, LE7/c$c;-><init>(Landroid/view/View;Z)V

    invoke-virtual {p0, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final j(ZZ)V
    .registers 3

    if-eqz p2, :cond_5

    invoke-direct {p0}, LE7/c;->h()V

    :cond_5
    if-nez p1, :cond_16

    iget-object p0, p0, LE7/c;->a:LE7/Z;

    invoke-virtual {p0}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object p0

    if-eqz p0, :cond_16

    invoke-virtual {p0}, Lj7/j;->a1()V

    :cond_16
    return-void
.end method
