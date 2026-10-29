.class public final Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;,
        Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$Companion;,
        Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;,
        Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;,
        Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field private static final ANIM_PLAY_PAUSE_FADE_OUT:I = 0x3e9

.field public static final Companion:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$Companion;

.field private static final DURATION_PLAY_ALBUM_COVER_FADE:J = 0x15eL

.field private static final DURATION_PLAY_PAUSE_FADE_IN:J = 0xfaL

.field private static final DURATION_PLAY_PAUSE_FADE_OUT:J = 0xfaL

.field private static final DURATION_PLAY_PAUSE_HOLD:J = 0x1c2L

.field private static final INTERPOLATOR_ALBUM_COVER_FADE:Landroid/view/animation/PathInterpolator;

.field private static final INTERPOLATOR_PLAY_PAUSE_FADE:Landroid/view/animation/PathInterpolator;

.field private static final PAGE_COUNT:I = 0x2

.field private static final TAG:Ljava/lang/String; = "ViewPagerAdapter"


# instance fields
.field private final animHandler:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;

.field private final context:Landroid/content/Context;

.field private firstPageViewHolder:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

.field private isAttachToWindow:Z

.field private final latestAlbumIconMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/drawable/Icon;",
            ">;"
        }
    .end annotation
.end field

.field private mainHandler:Landroid/os/Handler;

.field private musicData:LN5/b;

.field private musicViewVisible:Z

.field private final mutex:LO8/a;

.field private openAppConsumer:Ljava/util/function/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Consumer<",
            "Lh8/u;",
            ">;"
        }
    .end annotation
.end field

.field private playPauseFadeInAnimation:Landroid/animation/ObjectAnimator;

.field private playPauseFadeOutAnimation:Landroid/animation/ObjectAnimator;

.field private final playStateCallback:Lv8/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv8/l;"
        }
    .end annotation
.end field

.field private secondPageViewHolder:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

.field private uiRatio:F

.field private final viewPager2:Landroidx/viewpager2/widget/ViewPager2;

.field private widgetId:I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->Companion:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$Companion;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f666666    # 0.9f

    const v2, 0x3c23d70a    # 0.01f

    const v3, 0x3e051eb8    # 0.13f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->INTERPOLATOR_PLAY_PAUSE_FADE:Landroid/view/animation/PathInterpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->INTERPOLATOR_ALBUM_COVER_FADE:Landroid/view/animation/PathInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/viewpager2/widget/ViewPager2;Lv8/l;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/viewpager2/widget/ViewPager2;",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewPager2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "playStateCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewPager2:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->playStateCallback:Lv8/l;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->uiRatio:F

    new-instance p1, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    const-string p3, "getMainLooper(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->mainHandler:Landroid/os/Handler;

    const/4 p1, -0x1

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->widgetId:I

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->latestAlbumIconMap:Ljava/util/Map;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p3, p1, p2}, LO8/g;->b(ZILjava/lang/Object;)LO8/a;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->mutex:LO8/a;

    return-void
.end method

.method public static final synthetic access$getAnimHandler$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;

    return-object p0
.end method

.method public static final synthetic access$getDesiredAlbumIcon(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;LN5/b;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getDesiredAlbumIcon(LN5/b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getHighResolutionAlbumIcon(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;LN5/b;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getHighResolutionAlbumIcon(LN5/b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getINTERPOLATOR_ALBUM_COVER_FADE$cp()Landroid/view/animation/PathInterpolator;
    .registers 1

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->INTERPOLATOR_ALBUM_COVER_FADE:Landroid/view/animation/PathInterpolator;

    return-object v0
.end method

.method public static final synthetic access$getINTERPOLATOR_PLAY_PAUSE_FADE$cp()Landroid/view/animation/PathInterpolator;
    .registers 1

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->INTERPOLATOR_PLAY_PAUSE_FADE:Landroid/view/animation/PathInterpolator;

    return-object v0
.end method

.method public static final synthetic access$getMainHandler$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->mainHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getMusicData$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)LN5/b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicData:LN5/b;

    return-object p0
.end method

.method public static final synthetic access$getMusicViewVisible$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicViewVisible:Z

    return p0
.end method

.method public static final synthetic access$getOpenAppConsumer$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Ljava/util/function/Consumer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->openAppConsumer:Ljava/util/function/Consumer;

    return-object p0
.end method

.method public static final synthetic access$getUiRatio$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)F
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->uiRatio:F

    return p0
.end method

.method public static final synthetic access$getViewPager2$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Landroidx/viewpager2/widget/ViewPager2;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewPager2:Landroidx/viewpager2/widget/ViewPager2;

    return-object p0
.end method

.method public static final synthetic access$getWidgetId$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->widgetId:I

    return p0
.end method

.method public static final synthetic access$hasAlbumIcon(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;LN5/b;)Z
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->hasAlbumIcon(LN5/b;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$isAttachToWindow$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->isAttachToWindow:Z

    return p0
.end method

.method public static final synthetic access$isEqualLastMusic(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;LN5/b;)Z
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->isEqualLastMusic(LN5/b;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$loadAlbumDrawable(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/widget/ImageView;LN5/b;ILv8/l;)V
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->loadAlbumDrawable(Landroid/widget/ImageView;LN5/b;ILv8/l;)V

    return-void
.end method

.method public static final synthetic access$setPlayPauseFadeOutAnimation$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/animation/ObjectAnimator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->playPauseFadeOutAnimation:Landroid/animation/ObjectAnimator;

    return-void
.end method

.method public static final synthetic access$startPlayPauseCoverAnimation(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)Landroid/animation/ObjectAnimator;
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->startPlayPauseCoverAnimation(Landroid/view/View;)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method private final getDesiredAlbumIcon(LN5/b;Lm8/e;)Ljava/lang/Object;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN5/b;",
            "Lm8/e<",
            "-",
            "Landroid/graphics/drawable/Icon;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;

    iget v1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->label:I

    goto :goto_18

    :cond_13
    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;

    invoke-direct {v0, p0, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->result:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->label:I

    const-string v3, "latestAlbumIconMap"

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_58

    if-eq v2, v5, :cond_46

    if-ne v2, v4, :cond_3e

    iget-object p0, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$2:Ljava/lang/Object;

    check-cast p0, LO8/a;

    iget-object p1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$1:Ljava/lang/Object;

    check-cast p1, LN5/b;

    iget-object v0, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    :try_start_37
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_3a
    .catchall {:try_start_37 .. :try_end_3a} :catchall_3b

    goto :goto_97

    :catchall_3b
    move-exception p1

    goto/16 :goto_c0

    :cond_3e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_46
    iget-object p0, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$2:Ljava/lang/Object;

    check-cast p0, LO8/a;

    iget-object p1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$1:Ljava/lang/Object;

    check-cast p1, LN5/b;

    iget-object v2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object p2, p0

    move-object p0, v2

    goto :goto_6c

    :cond_58
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->mutex:LO8/a;

    iput-object p0, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->label:I

    invoke-interface {p2, v6, v0}, LO8/a;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6c

    goto :goto_92

    :cond_6c
    :goto_6c
    :try_start_6c
    iget-object v2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->latestAlbumIconMap:Ljava/util/Map;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LN5/b;->e()I

    move-result v5

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_a6

    iget-object v2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->latestAlbumIconMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    iput-object p0, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getDesiredAlbumIcon$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getHighResolutionAlbumIcon(LN5/b;Lm8/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_90
    .catchall {:try_start_6c .. :try_end_90} :catchall_a3

    if-ne v0, v1, :cond_93

    :goto_92
    return-object v1

    :cond_93
    move-object v7, v0

    move-object v0, p0

    move-object p0, p2

    move-object p2, v7

    :goto_97
    :try_start_97
    check-cast p2, Landroid/graphics/drawable/Icon;

    if-nez p2, :cond_9f

    invoke-virtual {p1}, LN5/b;->a()Landroid/graphics/drawable/Icon;

    move-result-object p2
    :try_end_9f
    .catchall {:try_start_97 .. :try_end_9f} :catchall_3b

    :cond_9f
    move-object v2, p2

    move-object p2, p0

    move-object p0, v0

    goto :goto_a6

    :catchall_a3
    move-exception p1

    move-object p0, p2

    goto :goto_c0

    :cond_a6
    :goto_a6
    :try_start_a6
    check-cast v2, Landroid/graphics/drawable/Icon;

    if-eqz v2, :cond_bb

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->latestAlbumIconMap:Ljava/util/Map;

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LN5/b;->e()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_ba
    .catchall {:try_start_a6 .. :try_end_ba} :catchall_a3

    goto :goto_bc

    :cond_bb
    move-object v2, v6

    :goto_bc
    invoke-interface {p2, v6}, LO8/a;->b(Ljava/lang/Object;)V

    return-object v2

    :goto_c0
    invoke-interface {p0, v6}, LO8/a;->b(Ljava/lang/Object;)V

    throw p1
.end method

.method private final getHighResolutionAlbumIcon(LN5/b;Lm8/e;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN5/b;",
            "Lm8/e<",
            "-",
            "Landroid/graphics/drawable/Icon;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;

    iget v1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;->label:I

    goto :goto_18

    :cond_13
    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;

    invoke-direct {v0, p0, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;->result:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_55

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, LN5/b;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, LN5/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LN5/b;->d()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p2, v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li8/s;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    sget-object p2, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->context:Landroid/content/Context;

    iput v3, v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$getHighResolutionAlbumIcon$1;->label:I

    invoke-virtual {p2, p0, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->getAvailableBitmap(Landroid/content/Context;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_55

    return-object v1

    :cond_55
    :goto_55
    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_5e

    invoke-static {p2}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0

    :cond_5e
    const/4 p0, 0x0

    return-object p0
.end method

.method private final getViewHolder(I)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;
    .registers 4

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewPager2:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    check-cast p0, Landroid/view/ViewGroup;

    goto :goto_10

    :cond_f
    move-object p0, v1

    :goto_10
    if-eqz p0, :cond_17

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    goto :goto_18

    :cond_17
    move-object p0, v1

    :goto_18
    if-eqz p0, :cond_1f

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p0

    goto :goto_20

    :cond_1f
    move-object p0, v1

    :goto_20
    instance-of v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    if-eqz v0, :cond_27

    move-object v1, p0

    check-cast v1, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    :cond_27
    if-nez v1, :cond_41

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "getViewHolder == null, position: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ViewPagerAdapter"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lh8/A;->a:Lh8/A;

    :cond_41
    return-object v1
.end method

.method private final hasAlbumIcon(LN5/b;)Z
    .registers 2

    invoke-virtual {p1}, LN5/b;->a()Landroid/graphics/drawable/Icon;

    move-result-object p0

    if-nez p0, :cond_1b

    invoke-virtual {p1}, LN5/b;->b()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1b

    invoke-virtual {p1}, LN5/b;->c()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1b

    invoke-virtual {p1}, LN5/b;->d()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_19

    goto :goto_1b

    :cond_19
    const/4 p0, 0x0

    return p0

    :cond_1b
    :goto_1b
    const/4 p0, 0x1

    return p0
.end method

.method private final isEqualLastMusic(LN5/b;)Z
    .registers 3

    invoke-virtual {p1}, LN5/b;->j()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->widgetId:I

    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getMusicFlag(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final loadAlbumDrawable(Landroid/widget/ImageView;LN5/b;ILv8/l;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "LN5/b;",
            "I",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v0

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$loadAlbumDrawable$1;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v3, p1

    move-object v2, p2

    move v6, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$loadAlbumDrawable$1;-><init>(LN5/b;Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Lv8/l;ILm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final startPlayPauseCoverAnimation(Landroid/view/View;)Landroid/animation/ObjectAnimator;
    .registers 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_24

    const-string v1, "alpha"

    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->INTERPOLATOR_PLAY_PAUSE_FADE:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;

    invoke-direct {v1, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->playPauseFadeInAnimation:Landroid/animation/ObjectAnimator;

    return-object v0

    :array_24
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final viewHolderItem1()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->firstPageViewHolder:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    if-nez v0, :cond_b

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getViewHolder(I)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->firstPageViewHolder:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    :cond_b
    return-object v0
.end method

.method private final viewHolderItem2()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->secondPageViewHolder:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    if-nez v0, :cond_b

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getViewHolder(I)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->secondPageViewHolder:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    :cond_b
    return-object v0
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->context:Landroid/content/Context;

    return-object p0
.end method

.method public getItemCount()I
    .registers 1

    const/4 p0, 0x2

    return p0
.end method

.method public getItemViewType(I)I
    .registers 2

    return p1
.end method

.method public final getPlayStateCallback()Lv8/l;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/l;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->playStateCallback:Lv8/l;

    return-object p0
.end method

.method public final onAttached()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->isAttachToWindow:Z

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem1()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    instance-of v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    if-eqz v0, :cond_e

    check-cast p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    goto :goto_f

    :cond_e
    const/4 p0, 0x0

    :goto_f
    if-eqz p0, :cond_14

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;->resumeWaveFormAnimation()V

    :cond_14
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .registers 3

    .line 1
    check-cast p1, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->onBindViewHolder(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;I)V
    .registers 3

    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicData:LN5/b;

    invoke-virtual {p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->bind(LN5/b;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    return-object p0
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;
    .registers 5

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_1f

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 3
    sget v1, Lcom/nothing/cardwidget/R$layout;->mediaplayer_first_item:I

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p2, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V

    return-object p2

    .line 5
    :cond_1f
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 6
    sget v1, Lcom/nothing/cardwidget/R$layout;->mediaplayer_second_item:I

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 7
    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p2, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public final onDetached()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->isAttachToWindow:Z

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem1()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    instance-of v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    if-eqz v0, :cond_e

    check-cast p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    goto :goto_f

    :cond_e
    const/4 p0, 0x0

    :goto_f
    if-eqz p0, :cond_14

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;->cancelWaveFormAnimation()V

    :cond_14
    return-void
.end method

.method public final onVisibilityChanged(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicViewVisible:Z

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem1()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->onVisibilityChanged()V

    :cond_b
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem2()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    if-eqz p0, :cond_14

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->onVisibilityChanged()V

    :cond_14
    return-void
.end method

.method public final setMusicMetaData(LN5/b;)V
    .registers 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicData:LN5/b;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final setOpenAppListener(Ljava/util/function/Consumer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Consumer<",
            "Lh8/u;",
            ">;)V"
        }
    .end annotation

    const-string v0, "consumer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->openAppConsumer:Ljava/util/function/Consumer;

    return-void
.end method

.method public final setWidgetId(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->widgetId:I

    return-void
.end method

.method public final updateDisplayRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->uiRatio:F

    return-void
.end method

.method public final updateMusicMetaData(LN5/b;)V
    .registers 6

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicData:LN5/b;

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem1()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_13

    invoke-static {v0, p1, v3, v2, v1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->updateMusicMetaData$default(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;LN5/b;ZILjava/lang/Object;)V

    :cond_13
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem2()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    if-eqz p0, :cond_1c

    invoke-static {p0, p1, v3, v2, v1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->updateMusicMetaData$default(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;LN5/b;ZILjava/lang/Object;)V

    :cond_1c
    return-void
.end method

.method public final updateMusicPosition(I)V
    .registers 3

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem2()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    instance-of v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;

    if-eqz v0, :cond_b

    check-cast p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;

    goto :goto_c

    :cond_b
    const/4 p0, 0x0

    :goto_c
    if-eqz p0, :cond_11

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicPosition(I)V

    :cond_11
    return-void
.end method

.method public final updatePlayBackState(I)V
    .registers 3

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem1()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->updatePlayBackState(I)V

    :cond_9
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewHolderItem2()Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;

    move-result-object p0

    if-eqz p0, :cond_12

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->updatePlayBackState(I)V

    :cond_12
    return-void
.end method
