.class public final LE7/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE7/Z$a;
    }
.end annotation


# static fields
.field public static final p:LE7/Z$a;


# instance fields
.field private final a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field private final b:Le3/u;

.field private final c:Landroid/content/Context;

.field private d:Lg3/x;

.field private e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

.field private f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

.field private g:Landroidx/cardview/widget/CardView;

.field private h:Lcom/davemorrissey/labs/subscaleview/ImageSource;

.field private i:Landroid/graphics/Point;

.field private j:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

.field private k:Z

.field private final l:Lh8/h;

.field private final m:Lh8/h;

.field private final n:Lh8/h;

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LE7/Z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE7/Z$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LE7/Z;->p:LE7/Z$a;

    return-void
.end method

.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Le3/u;)V
    .registers 5

    const-string v0, "lockScreenFragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-object p2, p0, LE7/Z;->b:Le3/u;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "requireContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE7/Z;->c:Landroid/content/Context;

    iget-object v0, p2, Le3/u;->M:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const-string v1, "wallpaperImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget-object v0, p2, Le3/u;->K:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const-string v1, "wallpaperDepthImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LE7/Z;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    iget-object p2, p2, Le3/u;->L:Landroidx/cardview/widget/CardView;

    const-string v0, "wallpaperDepthPreview"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LE7/Z;->g:Landroidx/cardview/widget/CardView;

    sget-object p2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$Initializing;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$Initializing;

    iput-object p2, p0, LE7/Z;->j:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    new-instance p2, LE7/T;

    invoke-direct {p2, p0}, LE7/T;-><init>(LE7/Z;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, LE7/Z;->l:Lh8/h;

    new-instance p2, LE7/U;

    invoke-direct {p2, p0}, LE7/U;-><init>(LE7/Z;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, LE7/Z;->m:Lh8/h;

    new-instance p2, LE7/V;

    invoke-direct {p2, p0}, LE7/V;-><init>(LE7/Z;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, LE7/Z;->n:Lh8/h;

    sget-object p2, LJ7/i;->d0:LJ7/i$b;

    invoke-virtual {p2, p1}, LJ7/i$b;->b(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, LE7/Z;->o:Z

    return-void
.end method

.method private final B()Z
    .registers 1

    iget-object p0, p0, LE7/Z;->l:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final K()V
    .registers 9

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, LE7/Z$f;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, LE7/Z$f;-><init>(LE7/Z;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private static final L(LE7/Z;)LE7/c0;
    .registers 4

    new-instance v0, LE7/c0;

    iget-object v1, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, LE7/c0;-><init>(Landroidx/fragment/app/v;LE7/Z;)V

    return-object v0
.end method

.method private final O()V
    .registers 3

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->isDetached()Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_2b

    :cond_11
    iget-object v0, p0, LE7/Z;->h:Lcom/davemorrissey/labs/subscaleview/ImageSource;

    if-eqz v0, :cond_2b

    iget-object v1, p0, LE7/Z;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v1, v0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    invoke-virtual {p0}, LE7/Z;->A()LE7/c0;

    move-result-object v0

    invoke-virtual {v0}, LE7/c0;->p()V

    invoke-virtual {p0}, LE7/Z;->v()Lo7/g;

    move-result-object p0

    if-eqz p0, :cond_2b

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo7/g;->k0(Z)V

    :cond_2b
    :goto_2b
    return-void
.end method

.method private final P(Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V
    .registers 5

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->isDetached()Z

    move-result v0

    if-nez v0, :cond_3c

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_3c

    :cond_11
    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    new-instance v1, LE7/Z$g;

    invoke-direct {v1, p0}, LE7/Z$g;-><init>(LE7/Z;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iput-object p2, p0, LE7/Z;->i:Landroid/graphics/Point;

    iget-object p2, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {p2, p1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    invoke-virtual {p0}, LE7/Z;->v()Lo7/g;

    move-result-object p1

    if-eqz p1, :cond_2d

    invoke-virtual {p1}, Lo7/g;->V()Lcom/android/wallpaper/asset/a;

    move-result-object p1

    goto :goto_2e

    :cond_2d
    const/4 p1, 0x0

    :goto_2e
    invoke-virtual {p0}, LE7/Z;->A()LE7/c0;

    move-result-object p2

    instance-of p1, p1, Lcom/android/wallpaper/asset/h;

    invoke-virtual {p2, p1}, LE7/c0;->q(Z)V

    iget-object p0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->B2()V

    :cond_3c
    :goto_3c
    return-void
.end method

.method private final R()V
    .registers 4

    iget-object v0, p0, LE7/Z;->d:Lg3/x;

    if-eqz v0, :cond_1c

    iget-object v1, p0, LE7/Z;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v1, p0, LE7/Z;->c:Landroid/content/Context;

    iget-object p0, p0, LE7/Z;->b:Le3/u;

    iget-object p0, p0, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    const v2, 0x1010530

    invoke-static {v1, v2}, LH3/r;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1, p0, v2}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    :cond_1c
    return-void
.end method

.method private final S(Landroid/graphics/Bitmap;)V
    .registers 5

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->isDetached()Z

    move-result v0

    if-nez v0, :cond_66

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_66

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_66

    :cond_17
    new-instance v0, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {v0}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->transform(Lcom/bumptech/glide/load/Transformation;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/RequestOptions;

    sget-object v1, Lcom/bumptech/glide/load/DecodeFormat;->PREFER_RGB_565:Lcom/bumptech/glide/load/DecodeFormat;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->format(Lcom/bumptech/glide/load/DecodeFormat;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/bumptech/glide/request/RequestOptions;

    iget-object v1, p0, LE7/Z;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07062d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, LE7/Z;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/bumptech/glide/RequestManager;->load(Landroid/graphics/Bitmap;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Lcom/bumptech/glide/request/BaseRequestOptions;->override(II)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/RequestBuilder;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-static {}, Lcom/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;->withCrossFade()Lcom/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/RequestBuilder;->transition(Lcom/bumptech/glide/TransitionOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    iget-object p0, p0, LE7/Z;->b:Le3/u;

    iget-object p0, p0, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_66
    :goto_66
    const-string p0, "WallpaperUIHelper"

    const-string p1, "setThumbnail bitmap is recycled or detached"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final T()V
    .registers 3

    iget-object v0, p0, LE7/Z;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->setCanHandleTouchEvent(Z)V

    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinimumScaleType(I)V

    iget-object v0, p0, LE7/Z;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setMinimumScaleType(I)V

    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setPanLimit(I)V

    iget-object v0, p0, LE7/Z;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    invoke-virtual {v0, v1}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setPanLimit(I)V

    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    new-instance v1, LE7/W;

    invoke-direct {v1, p0}, LE7/W;-><init>(LE7/Z;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->setOnStartTouchListener(Lv8/a;)V

    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    new-instance v1, LE7/X;

    invoke-direct {v1, p0}, LE7/X;-><init>(LE7/Z;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->setOnStateEndListener(Lv8/a;)V

    iget-object v0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    new-instance v1, LE7/Y;

    invoke-direct {v1, p0}, LE7/Y;-><init>(LE7/Z;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;->setOnStatePreEndListener(Lv8/p;)V

    invoke-virtual {p0}, LE7/Z;->A()LE7/c0;

    move-result-object v0

    invoke-virtual {v0}, LE7/c0;->o()V

    invoke-virtual {p0}, LE7/Z;->A()LE7/c0;

    move-result-object p0

    invoke-virtual {p0}, LE7/c0;->n()V

    return-void
.end method

.method private static final U(LE7/Z;)Lh8/A;
    .registers 1

    invoke-direct {p0}, LE7/Z;->x()LE7/c;

    move-result-object p0

    invoke-virtual {p0}, LE7/c;->b()Landroid/animation/ObjectAnimator;

    move-result-object p0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final V(LE7/Z;)Lh8/A;
    .registers 10

    invoke-virtual {p0}, LE7/Z;->v()Lo7/g;

    move-result-object v0

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo7/g;->l0(Lo7/g;ZILjava/lang/Object;)V

    :cond_c
    iget-boolean v0, p0, LE7/Z;->o:Z

    if-nez v0, :cond_35

    invoke-virtual {p0}, LE7/Z;->N()V

    iget-object v0, p0, LE7/Z;->b:Le3/u;

    iget-object v0, v0, Le3/u;->J:Landroid/widget/TextView;

    const-string v1, "tvPinchTip"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_35

    invoke-direct {p0}, LE7/Z;->x()LE7/c;

    move-result-object v2

    iget-object p0, p0, LE7/Z;->b:Le3/u;

    iget-object v3, p0, Le3/u;->J:Landroid/widget/TextView;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v2 .. v8}, LE7/c;->f(LE7/c;Landroid/view/View;ZJILjava/lang/Object;)Landroid/animation/ObjectAnimator;

    :cond_35
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final W(LE7/Z;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;
    .registers 3

    invoke-virtual {p0}, LE7/Z;->v()Lo7/g;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0, p1, p2}, Lo7/g;->m0(Ljava/lang/Float;Landroid/graphics/PointF;)V

    :cond_9
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final X(LE7/Z;)Z
    .registers 1

    iget-object p0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    invoke-virtual {p0}, LJ7/i;->a0()Z

    move-result p0

    return p0
.end method

.method public static synthetic a(LE7/Z;)LE7/c0;
    .registers 1

    invoke-static {p0}, LE7/Z;->L(LE7/Z;)LE7/c0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LE7/Z;)LE7/c;
    .registers 1

    invoke-static {p0}, LE7/Z;->r(LE7/Z;)LE7/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LE7/Z;)Lh8/A;
    .registers 1

    invoke-static {p0}, LE7/Z;->U(LE7/Z;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LE7/Z;)Z
    .registers 1

    invoke-static {p0}, LE7/Z;->X(LE7/Z;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(LE7/Z;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LE7/Z;->W(LE7/Z;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LE7/Z;)Lh8/A;
    .registers 1

    invoke-static {p0}, LE7/Z;->V(LE7/Z;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LE7/Z;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, LE7/Z;->s(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LE7/Z;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .registers 1

    iget-object p0, p0, LE7/Z;->h:Lcom/davemorrissey/labs/subscaleview/ImageSource;

    return-object p0
.end method

.method public static final synthetic i(LE7/Z;)LE7/c;
    .registers 1

    invoke-direct {p0}, LE7/Z;->x()LE7/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(LE7/Z;)V
    .registers 1

    invoke-direct {p0}, LE7/Z;->K()V

    return-void
.end method

.method public static final synthetic k(LE7/Z;Lcom/davemorrissey/labs/subscaleview/ImageSource;)V
    .registers 2

    iput-object p1, p0, LE7/Z;->h:Lcom/davemorrissey/labs/subscaleview/ImageSource;

    return-void
.end method

.method public static final synthetic l(LE7/Z;Z)V
    .registers 2

    iput-boolean p1, p0, LE7/Z;->k:Z

    return-void
.end method

.method public static final synthetic m(LE7/Z;)V
    .registers 1

    invoke-direct {p0}, LE7/Z;->O()V

    return-void
.end method

.method public static final synthetic n(LE7/Z;Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LE7/Z;->P(Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V

    return-void
.end method

.method public static final synthetic o(LE7/Z;)V
    .registers 1

    invoke-direct {p0}, LE7/Z;->R()V

    return-void
.end method

.method public static final synthetic p(LE7/Z;Landroid/graphics/Bitmap;)V
    .registers 2

    invoke-direct {p0, p1}, LE7/Z;->S(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static final synthetic q(LE7/Z;)V
    .registers 1

    invoke-direct {p0}, LE7/Z;->T()V

    return-void
.end method

.method private static final r(LE7/Z;)LE7/c;
    .registers 2

    new-instance v0, LE7/c;

    invoke-direct {v0, p0}, LE7/c;-><init>(LE7/Z;)V

    return-object v0
.end method

.method private final s(Lm8/e;)Ljava/lang/Object;
    .registers 10

    instance-of v0, p1, LE7/Z$b;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LE7/Z$b;

    iget v1, v0, LE7/Z$b;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LE7/Z$b;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LE7/Z$b;

    invoke-direct {v0, p0, p1}, LE7/Z$b;-><init>(LE7/Z;Lm8/e;)V

    :goto_18
    iget-object p1, v0, LE7/Z$b;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LE7/Z$b;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_45

    if-eq v2, v5, :cond_3d

    if-ne v2, v4, :cond_35

    iget-object p0, v0, LE7/Z$b;->r:Ljava/lang/Object;

    check-cast p0, [I

    iget-object v0, v0, LE7/Z$b;->q:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Rect;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_81

    :cond_35
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3d
    iget-object p0, v0, LE7/Z$b;->q:Ljava/lang/Object;

    check-cast p0, Landroid/view/View;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5f

    :cond_45
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object p0

    invoke-interface {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getClockView()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_a4

    iput-object p0, v0, LE7/Z$b;->q:Ljava/lang/Object;

    iput v5, v0, LE7/Z$b;->u:I

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->d(Landroid/view/View;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5f

    goto :goto_7e

    :cond_5f
    :goto_5f
    check-cast p1, Landroid/graphics/Rect;

    iget v2, p1, Landroid/graphics/Rect;->left:I

    const/4 v6, -0x1

    if-ne v2, v6, :cond_67

    return-object v3

    :cond_67
    new-array v2, v4, [I

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v6

    new-instance v7, LE7/Z$c;

    invoke-direct {v7, p0, v2, v3}, LE7/Z$c;-><init>(Landroid/view/View;[ILm8/e;)V

    iput-object p1, v0, LE7/Z$b;->q:Ljava/lang/Object;

    iput-object v2, v0, LE7/Z$b;->r:Ljava/lang/Object;

    iput v4, v0, LE7/Z$b;->u:I

    invoke-static {v6, v7, v0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_7f

    :goto_7e
    return-object v1

    :cond_7f
    move-object v0, p1

    move-object p0, v2

    :goto_81
    iget p1, v0, Landroid/graphics/Rect;->top:I

    aget p0, p0, v5

    add-int/2addr p1, p0

    iput p1, v0, Landroid/graphics/Rect;->top:I

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p0

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "getClockAreaInScreen "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "WallpaperUIHelper"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_a4
    return-object v3
.end method

.method public static synthetic u(LE7/Z;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-virtual {p0, p1}, LE7/Z;->t(Z)V

    return-void
.end method

.method private final x()LE7/c;
    .registers 1

    iget-object p0, p0, LE7/Z;->n:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LE7/c;

    return-object p0
.end method


# virtual methods
.method public final A()LE7/c0;
    .registers 1

    iget-object p0, p0, LE7/Z;->m:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LE7/c0;

    return-object p0
.end method

.method public final C()Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;
    .registers 1

    iget-object p0, p0, LE7/Z;->f:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    return-object p0
.end method

.method public final D()Landroidx/cardview/widget/CardView;
    .registers 1

    iget-object p0, p0, LE7/Z;->g:Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method public final E()Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;
    .registers 1

    iget-object p0, p0, LE7/Z;->e:Lcom/nothing/wallpaper/picker/edit/crop/view/EditSubsamplingScaleImageView;

    return-object p0
.end method

.method public final F()Lg3/x;
    .registers 1

    iget-object p0, p0, LE7/Z;->d:Lg3/x;

    return-object p0
.end method

.method public final G()Z
    .registers 3

    iget-object p0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_11

    invoke-virtual {p0}, Lj7/j;->g0()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_11

    return v1

    :cond_11
    return v0
.end method

.method public final H()Z
    .registers 2

    invoke-direct {p0}, LE7/Z;->B()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, LE7/Z;->d:Lg3/x;

    if-eqz v0, :cond_16

    invoke-static {v0}, LG6/e;->m(Lg3/x;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-boolean p0, p0, LE7/Z;->o:Z

    if-nez p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final I()Z
    .registers 2

    invoke-direct {p0}, LE7/Z;->B()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, LE7/Z;->d:Lg3/x;

    if-eqz v0, :cond_1c

    invoke-static {v0}, LG6/e;->m(Lg3/x;)Z

    move-result v0

    if-nez v0, :cond_1c

    iget-object p0, p0, LE7/Z;->d:Lg3/x;

    if-eqz p0, :cond_1c

    invoke-virtual {p0}, Lg3/x;->s()Z

    move-result p0

    if-nez p0, :cond_1c

    const/4 p0, 0x1

    return p0

    :cond_1c
    const/4 p0, 0x0

    return p0
.end method

.method public final J()V
    .registers 8

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    new-instance v4, LE7/Z$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, LE7/Z$e;-><init>(LE7/Z;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final M(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE7/Z;->j:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    return-void
.end method

.method public final N()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LE7/Z;->o:Z

    sget-object v0, LJ7/i;->d0:LJ7/i$b;

    iget-object p0, p0, LE7/Z;->c:Landroid/content/Context;

    invoke-virtual {v0, p0}, LJ7/i$b;->c(Landroid/content/Context;)V

    return-void
.end method

.method public final Q(Lg3/x;)V
    .registers 2

    iput-object p1, p0, LE7/Z;->d:Lg3/x;

    return-void
.end method

.method public final Y(ZZ)V
    .registers 3

    invoke-direct {p0}, LE7/Z;->x()LE7/c;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, LE7/c;->j(ZZ)V

    return-void
.end method

.method public final t(Z)V
    .registers 9

    invoke-direct {p0}, LE7/Z;->B()Z

    move-result v0

    if-eqz v0, :cond_4c

    iget-boolean v0, p0, LE7/Z;->k:Z

    if-nez v0, :cond_4c

    iget-object v0, p0, LE7/Z;->d:Lg3/x;

    if-eqz v0, :cond_16

    invoke-static {v0}, LG6/e;->m(Lg3/x;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_16

    goto :goto_4c

    :cond_16
    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h()Z

    move-result v0

    if-nez v0, :cond_4c

    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object v0

    invoke-virtual {v0}, LJ7/b;->j()LI8/A;

    move-result-object v0

    invoke-interface {v0}, LI8/A;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto :goto_4c

    :cond_35
    iget-object v0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    new-instance v4, LE7/Z$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LE7/Z$d;-><init>(LE7/Z;ZLm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void

    :cond_4c
    :goto_4c
    const-string p0, "WallpaperUIHelper"

    const-string p1, "getClockAreaInScreenIfNeed return"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final v()Lo7/g;
    .registers 1

    iget-object p0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M2()Lo7/g;

    move-result-object p0

    return-object p0
.end method

.method public final w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;
    .registers 1

    iget-object p0, p0, LE7/Z;->j:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    return-object p0
.end method

.method public final y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;
    .registers 1

    iget-object p0, p0, LE7/Z;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-object p0
.end method

.method public final z()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, LE7/Z;->i:Landroid/graphics/Point;

    return-object p0
.end method
