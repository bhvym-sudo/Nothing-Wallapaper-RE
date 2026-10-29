.class public final Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;
.super Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/mediaplayer/IMediaMetaDataChanged;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView$Companion;

.field private static final TAG:Ljava/lang/String; = "MediaPlayerPagerView"


# instance fields
.field private final attrs:Landroid/util/AttributeSet;

.field private controller:Lcom/nothing/cardwidget/mediaplayer/IMediaController;

.field private pageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

.field private pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

.field private uiRatio:F

.field private viewpager2:Landroidx/viewpager2/widget/ViewPager2;

.field private widgetId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->Companion:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 12

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->attrs:Landroid/util/AttributeSet;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 6
    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->uiRatio:F

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_6

    move p3, v0

    :cond_6
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_b

    move p4, v0

    .line 3
    :cond_b
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic c(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->onFinishInflate$lambda$1$lambda$0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final onFinishInflate$lambda$1$lambda$0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;Z)Lh8/A;
    .registers 3

    const-string v0, "$this_run"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->controller:Lcom/nothing/cardwidget/mediaplayer/IMediaController;

    if-eqz p0, :cond_c

    invoke-interface {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/IMediaController;->onPlayStateSwitch(Z)V

    :cond_c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final setSwitchVibration(B)V
    .registers 4

    const/16 v0, -0x80

    if-eq p1, v0, :cond_15

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction$Companion;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction$Companion;->supportSlideNext(B)Z

    move-result v1

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction$Companion;->supportSlidePrevious(B)Z

    move-result p1

    invoke-virtual {p0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportSlideLeft(Z)V

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportSlideRight(Z)V

    return-void

    :cond_15
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportSlideLeft(Z)V

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->supportSlideRight(Z)V

    return-void
.end method


# virtual methods
.method public final addMediaController(Lcom/nothing/cardwidget/mediaplayer/IMediaController;)V
    .registers 3

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->controller:Lcom/nothing/cardwidget/mediaplayer/IMediaController;

    return-void
.end method

.method public final disableHScroll(Z)V
    .registers 2

    invoke-super {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->disableHorizontalScroll(Z)V

    return-void
.end method

.method public final getAttrs()Landroid/util/AttributeSet;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->attrs:Landroid/util/AttributeSet;

    return-object p0
.end method

.method public final getCurrentPage()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    if-nez p0, :cond_a

    const-string p0, "viewpager2"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p0

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_d

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_d
    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->onAttached()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_d

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_d
    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->onDetached()V

    return-void
.end method

.method protected onFinishInflate()V
    .registers 7

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    sget v0, Lcom/nothing/cardwidget/R$id;->media_player_viewpager2:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    sget v1, Lcom/nothing/cardwidget/R$id;->media_player_indicator:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/nothing/cardwidget/NTPageIndicatorDot;

    iput-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pageIndicator:Lcom/nothing/cardwidget/NTPageIndicatorDot;

    const/4 v2, 0x0

    if-nez v1, :cond_20

    const-string v1, "pageIndicator"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_20
    invoke-virtual {v1, v0}, Lcom/nothing/cardwidget/NTPageIndicatorDot;->setPageListener(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    const-string v1, "viewpager2"

    if-nez v0, :cond_2d

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2d
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-nez v0, :cond_74

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    if-nez v4, :cond_46

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v2

    :cond_46
    new-instance v5, Lcom/nothing/cardwidget/mediaplayer/view/o;

    invoke-direct {v5, p0}, Lcom/nothing/cardwidget/mediaplayer/view/o;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;)V

    invoke-direct {v0, v3, v4, v5}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;-><init>(Landroid/content/Context;Landroidx/viewpager2/widget/ViewPager2;Lv8/l;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    if-nez v0, :cond_58

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_58
    iget-object v3, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez v3, :cond_62

    const-string v3, "pagerAdapter"

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v3, v2

    :cond_62
    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    if-nez p0, :cond_6d

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_6e

    :cond_6d
    move-object v2, p0

    :goto_6e
    const/4 p0, 0x1

    invoke-virtual {v2, p0}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    :cond_74
    return-void
.end method

.method public final onMediaPlayerVisibilityChanged(Z)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_a

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->onVisibilityChanged(Z)V

    return-void
.end method

.method public onSlidingSwitch(Z)V
    .registers 2

    invoke-super {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->onSlidingSwitch(Z)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->controller:Lcom/nothing/cardwidget/mediaplayer/IMediaController;

    if-eqz p0, :cond_a

    invoke-interface {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/IMediaController;->onMusicSwitch(Z)V

    :cond_a
    return-void
.end method

.method public final registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V
    .registers 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->viewpager2:Landroidx/viewpager2/widget/ViewPager2;

    if-nez p0, :cond_f

    const-string p0, "viewpager2"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_f
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

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

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_f

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_f
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->setOpenAppListener(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final setWidgetId(I)V
    .registers 3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->widgetId:Ljava/lang/Integer;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_10

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_10
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->setWidgetId(I)V

    return-void
.end method

.method public final updateDisplayRatio(F)V
    .registers 2

    invoke-super {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/HorizontalScrollReboundView;->setDisplayRatio(F)V

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->uiRatio:F

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_f

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_f
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->updateDisplayRatio(F)V

    return-void
.end method

.method public updateMusicMetaData(LN5/b;Z)V
    .registers 5

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, "pagerAdapter"

    if-eqz p2, :cond_17

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p2, :cond_12

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_13

    :cond_12
    move-object v0, p2

    :goto_13
    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->setMusicMetaData(LN5/b;)V

    goto :goto_23

    :cond_17
    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p2, :cond_1f

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_20

    :cond_1f
    move-object v0, p2

    :goto_20
    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->updateMusicMetaData(LN5/b;)V

    :goto_23
    invoke-virtual {p1}, LN5/b;->m()B

    move-result p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->setSwitchVibration(B)V

    return-void
.end method

.method public updateMusicPosition(I)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_a

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->updateMusicPosition(I)V

    return-void
.end method

.method public updatePlayBackState(I)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->pagerAdapter:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    if-nez p0, :cond_a

    const-string p0, "pagerAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->updatePlayBackState(I)V

    return-void
.end method
