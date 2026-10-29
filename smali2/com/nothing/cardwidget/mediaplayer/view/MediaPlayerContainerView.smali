.class public final Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;
.super Lcom/nothing/cardwidget/RemoteServiceView;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/mediaplayer/IMediaController;
.implements LP5/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;,
        Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$Companion;,
        Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;,
        Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$WhenMappings;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$Companion;

.field private static final DURATION_COVER_FADE_OUT:J = 0x96L

.field private static final DURATION_MEDIA_PLAYER_FADE_IN:J = 0xfaL

.field private static final DURATION_STANDBY_STATE:J = 0xbb8L

.field private static final EVENT_INIT_ACTIVE:I = 0x1

.field private static final EVENT_INIT_ALBUM:I = 0x2

.field private static final EVENT_IN_ACTIVE:I = 0x0

.field private static final EVENT_RE_ACTIVE:I = 0x3

.field private static final KEY_IS_WIDGET_ID_ENABLED:Ljava/lang/String; = "is_widget_id_enabled"

.field private static final KEY_MUSIC_CONTROL_EVENT:Ljava/lang/String; = "music_control_event"

.field private static final KEY_SET_ENABLED_WIDGET_ID:Ljava/lang/String; = "set_enabled_widget_id"

.field private static final MSG_ANIM_STATE_SWITCH:I = 0x3e9

.field private static final RELEASE_DELAY_TIME:J = 0x64L

.field private static final SWITCH_ICON_DISABLE_ALPHA:F = 0.3f

.field private static final TAG:Ljava/lang/String; = "MediaPlayerContainer"


# instance fields
.field private animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

.field private final animInterpolator:Landroid/view/animation/PathInterpolator;

.field private authGuideClickListener:Landroid/view/View$OnClickListener;

.field private authorizeGuideCover:Landroid/widget/TextView;

.field private cardContainerVisible:Z

.field private containerCornerRadius:Ljava/lang/Float;

.field private displayRatio:F

.field private guideNotifAuth:Ljava/lang/String;

.field private isAppExist:Z

.field private isDetached:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private isPkgReceiverRegister:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

.field private mediaPlayerViewVisible:Z

.field private openMusicTip:Ljava/lang/String;

.field private final packageRemovedReceiver:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$packageRemovedReceiver$1;

.field private registerTask:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private final releaseAction:LC8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC8/e;"
        }
    .end annotation
.end field

.field private startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

.field private widgetId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->Companion:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$Companion;

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

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

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/RemoteServiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    new-instance p3, Landroid/view/animation/PathInterpolator;

    const p4, 0x3f666666    # 0.9f

    const v0, 0x3c23d70a    # 0.01f

    const v1, 0x3e051eb8    # 0.13f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p3, p4, v0, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    iput-object p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animInterpolator:Landroid/view/animation/PathInterpolator;

    .line 6
    new-instance p3, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$releaseAction$1;

    invoke-direct {p3, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$releaseAction$1;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->releaseAction:LC8/e;

    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->cardContainerVisible:Z

    .line 8
    iput v2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->displayRatio:F

    .line 9
    iput-boolean p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isAppExist:Z

    .line 10
    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isPkgReceiverRegister:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isDetached:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    new-instance p4, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$packageRemovedReceiver$1;

    invoke-direct {p4, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$packageRemovedReceiver$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    iput-object p4, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->packageRemovedReceiver:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$packageRemovedReceiver$1;

    .line 13
    invoke-direct {p0, p2, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->getRemoteResource(Landroid/util/AttributeSet;Landroid/content/Context;)V

    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/nothing/cardwidget/R$layout;->mediaplayer_widget_container:I

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->initView(Landroid/view/View;)V

    .line 16
    new-instance p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez p2, :cond_62

    const-string p2, "startUpCover"

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_62
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    const-string p4, "getMainLooper(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;-><init>(Lcom/airbnb/lottie/LottieAnimationView;Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    .line 17
    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/d;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/mediaplayer/view/d;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->nextStateCallBack(Lv8/l;)V

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic X(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;IF)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateSwitchIconByAction$lambda$20(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;IF)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->_init_$lambda$1(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/os/Bundle;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isWidgetEnabled$lambda$50$lambda$49(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/os/Bundle;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;)Lh8/A;
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;->IDLE:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    if-ne p1, v0, :cond_12

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->trackMediaOnClick(I)V

    :cond_12
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic a0(LC8/e;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onAttachedToWindow$lambda$4(LC8/e;)V

    return-void
.end method

.method public static final synthetic access$applyCachedData(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->applyCachedData()V

    return-void
.end method

.method public static final synthetic access$getStartUpCover$p(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)Lcom/airbnb/lottie/LottieAnimationView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    return-object p0
.end method

.method public static final synthetic access$getWidgetId$p(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic access$release(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->release()V

    return-void
.end method

.method public static final synthetic access$updateStartUpViewState(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState(I)V

    return-void
.end method

.method private final applyCachedData()V
    .registers 4

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getCachedData()Lh8/u;

    move-result-object v0

    invoke-virtual {v0}, Lh8/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0}, Lh8/u;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v0}, Lh8/u;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    if-eqz v1, :cond_1d

    invoke-virtual {p0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onDataChanged(Landroid/os/Bundle;)V

    :cond_1d
    if-eqz v2, :cond_22

    invoke-virtual {p0, v2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onDataChanged(Landroid/os/Bundle;)V

    :cond_22
    if-eqz v0, :cond_27

    invoke-virtual {p0, v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onDataChanged(Landroid/os/Bundle;)V

    :cond_27
    return-void
.end method

.method public static synthetic b0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState$lambda$44(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onAttachedToWindow$lambda$7$lambda$6(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    return-void
.end method

.method public static synthetic d0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->initView$lambda$16(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;IF)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateSwitchIconByAction$lambda$22(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;IF)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lv8/a;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onClickStartUpView$lambda$40(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lv8/a;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->release$lambda$11$lambda$10(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    return-void
.end method

.method public static synthetic g0(LC8/e;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onDetachedFromWindow$lambda$8(LC8/e;)V

    return-void
.end method

.method private final getPkgInstallIntentFilter()Landroid/content/IntentFilter;
    .registers 2

    new-instance p0, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {p0, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {p0, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "package"

    invoke-virtual {p0, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    return-object p0
.end method

.method private final getRemoteResource(Landroid/util/AttributeSet;Landroid/content/Context;)V
    .registers 8

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    sget-object v0, LJ5/a;->a:LJ5/a$a;

    const-string v1, "openMusicTip"

    invoke-virtual {v0, p2, v1}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget v2, Lcom/nothing/cardwidget/R$attr;->openMusicTip:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    const-string v2, "guideNotifAuth"

    invoke-virtual {v0, p2, v2}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lcom/nothing/cardwidget/R$attr;->guideNotifAuth:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v2

    const-string v3, "containerCornerRadius"

    invoke-virtual {v0, p2, v3}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v4, Lcom/nothing/cardwidget/R$attr;->containerCornerRadius:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lh8/o;

    move-result-object v1

    invoke-static {v1}, Li8/N;->i([Lh8/o;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LJ5/a$a;->k(Landroid/util/AttributeSet;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_56
    :goto_56
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget v3, Lcom/nothing/cardwidget/R$attr;->openMusicTip:I

    if-ne v2, v3, :cond_83

    sget-object v2, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v2, p2, p1, v1}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->openMusicTip:Ljava/lang/String;

    goto :goto_56

    :cond_83
    sget v3, Lcom/nothing/cardwidget/R$attr;->guideNotifAuth:I

    if-ne v2, v3, :cond_9a

    sget-object v2, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v2, p2, p1, v1}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->guideNotifAuth:Ljava/lang/String;

    goto :goto_56

    :cond_9a
    sget v3, Lcom/nothing/cardwidget/R$attr;->containerCornerRadius:I

    if-ne v2, v3, :cond_56

    sget-object v2, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/high16 v3, -0x40800000    # -1.0f

    invoke-virtual {v2, p2, p1, v1, v3}, LJ5/a$a;->h(Landroid/content/Context;Landroid/util/AttributeSet;IF)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->containerCornerRadius:Ljava/lang/Float;

    goto :goto_56

    :cond_b7
    return-void
.end method

.method private final initView(Landroid/view/View;)V
    .registers 7

    sget v0, Lcom/nothing/cardwidget/R$id;->media_player_pager_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    sget v0, Lcom/nothing/cardwidget/R$id;->authorize_guide_cover:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authorizeGuideCover:Landroid/widget/TextView;

    sget v0, Lcom/nothing/cardwidget/R$id;->startup_cover:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const-string v0, "mediaPlayerView"

    const/4 v1, 0x0

    if-nez p1, :cond_29

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_29
    invoke-virtual {p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->addMediaController(Lcom/nothing/cardwidget/mediaplayer/IMediaController;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authorizeGuideCover:Landroid/widget/TextView;

    if-nez p1, :cond_36

    const-string p1, "authorizeGuideCover"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_36
    new-instance v2, Lcom/nothing/cardwidget/mediaplayer/view/g;

    invoke-direct {v2, p0}, Lcom/nothing/cardwidget/mediaplayer/view/g;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez p1, :cond_48

    const-string p1, "startUpCover"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_48
    sget-object v2, Lcom/nothing/cardwidget/util/UiUtil;->INSTANCE:Lcom/nothing/cardwidget/util/UiUtil;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/nothing/cardwidget/util/UiUtil;->isDarkTheme(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_5c

    sget v2, Lcom/nothing/cardwidget/R$raw;->music_enter_initial_state_dark:I

    goto :goto_5e

    :cond_5c
    sget v2, Lcom/nothing/cardwidget/R$raw;->music_enter_initial_state_light:I

    :goto_5e
    invoke-virtual {p1, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v2, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$initView$2;

    invoke-direct {v2, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$initView$2;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {p1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p1, :cond_75

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_76

    :cond_75
    move-object v1, p1

    :goto_76
    new-instance p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$initView$3;

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$initView$3;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {v1, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    return-void
.end method

.method private static final initView$lambda$16(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/view/View;)V
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authGuideClickListener:Landroid/view/View$OnClickListener;

    if-eqz p0, :cond_c

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_c
    return-void
.end method

.method private final isMusicAppExist()Z
    .registers 5

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getAppName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/ContextExtKt;->isAppExist(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1a

    move v1, v2

    :cond_1a
    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isAppExist:Z

    return v1
.end method

.method private final isStartUpAnimationRunning()Z
    .registers 5

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    const/4 v1, 0x0

    const-string v2, "animHandler"

    if-nez v0, :cond_b

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_b
    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->getCurStartUpState()Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    move-result-object v0

    sget-object v3, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;->IDLE:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-lez v0, :cond_2e

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    if-nez p0, :cond_1f

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_20

    :cond_1f
    move-object v1, p0

    :goto_20
    invoke-virtual {v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->getCurStartUpState()Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    move-result-object p0

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;->FINISH:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p0

    if-gez p0, :cond_2e

    const/4 p0, 0x1

    return p0

    :cond_2e
    const/4 p0, 0x0

    return p0
.end method

.method private final isWidgetAvailable(I)Z
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isWidgetEnabled(I)Z

    move-result p0

    goto :goto_f

    :cond_e
    move p0, v1

    :goto_f
    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->needNotificationAuth(I)Z

    move-result p1

    if-eqz p0, :cond_1b

    if-nez p1, :cond_1b

    const/4 p0, 0x1

    return p0

    :cond_1b
    return v1
.end method

.method private final isWidgetEnabled(I)Z
    .registers 4

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->isWidgetEnabled(I)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_d
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "is_widget_id_enabled"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/c;

    invoke-direct {v1, p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/c;-><init>(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {p0, v0, v1}, Lcom/nothing/cardwidget/RemoteServiceView;->forceCallRemoteService(Landroid/os/Bundle;LB0/a;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final isWidgetEnabled$lambda$50$lambda$49(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/os/Bundle;)V
    .registers 5

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_e

    const-string v0, "is_widget_id_enabled"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    goto :goto_f

    :cond_e
    const/4 p2, 0x0

    :goto_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CallRemote isWidgetEnabled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MediaPlayerContainer"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0, p0, p2}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->setWidgetEnabled(IZ)V

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getPlaybackState()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_37

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState(I)V

    :cond_37
    return-void
.end method

.method private final notifyMediaPlayerVisibilityChanged()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v0, :cond_a

    const-string v0, "mediaPlayerView"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    iget-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->cardContainerVisible:Z

    if-eqz v1, :cond_14

    iget-boolean p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerViewVisible:Z

    if-eqz p0, :cond_14

    const/4 p0, 0x1

    goto :goto_15

    :cond_14
    const/4 p0, 0x0

    :goto_15
    invoke-virtual {v0, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->onMediaPlayerVisibilityChanged(Z)V

    return-void
.end method

.method private static final onAttachedToWindow$lambda$4(LC8/e;)V
    .registers 2

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final onAttachedToWindow$lambda$7$lambda$6(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 5

    const-string v0, "$this_runCatching"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isDetached:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_33

    :try_start_d
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->packageRemovedReceiver:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$packageRemovedReceiver$1;

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->getPkgInstallIntentFilter()Landroid/content/IntentFilter;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isPkgReceiverRegister:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_28
    .catchall {:try_start_d .. :try_end_28} :catchall_29

    return-void

    :catchall_29
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_33
    return-void
.end method

.method private final onClickStartUpView(ILv8/a;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv8/a;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez v0, :cond_a

    const-string v0, "startUpCover"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/m;

    invoke-direct {v1, p1, p0, p2}, Lcom/nothing/cardwidget/mediaplayer/view/m;-><init>(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lv8/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final onClickStartUpView$lambda$40(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lv8/a;Landroid/view/View;)V
    .registers 9

    const-string p3, "this$0"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$confirmPlay"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {p3, p0}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->needEnableMusicService(I)Z

    move-result p0

    if-nez p0, :cond_75

    invoke-direct {p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isMusicAppExist()Z

    move-result p0

    if-nez p0, :cond_19

    goto :goto_75

    :cond_19
    iget-object p0, p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    const/4 p3, 0x0

    const-string v0, "animHandler"

    if-nez p0, :cond_24

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, p3

    :cond_24
    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->getCurStartUpState()Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    move-result-object p0

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    if-eq p0, v3, :cond_59

    const/4 v3, 0x2

    if-eq p0, v3, :cond_39

    return-void

    :cond_39
    iget-object p0, p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    if-nez p0, :cond_41

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, p3

    :cond_41
    sget-object v4, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;->FINISH:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    invoke-virtual {p0, v4}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->setCurStartUpState(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;)V

    iget-object p0, p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    if-nez p0, :cond_4e

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_4f

    :cond_4e
    move-object p3, p0

    :goto_4f
    invoke-virtual {p3, v4, v1, v2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->sendStartUpStateMessage(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;J)V

    invoke-interface {p2}, Lv8/a;->invoke()Ljava/lang/Object;

    invoke-direct {p1, v3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->trackMediaOnClick(I)V

    return-void

    :cond_59
    iget-object p0, p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    if-nez p0, :cond_61

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, p3

    :cond_61
    iget-object p2, p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    if-nez p2, :cond_69

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_6a

    :cond_69
    move-object p3, p2

    :goto_6a
    invoke-virtual {p3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->switchNextState()Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    move-result-object p2

    invoke-virtual {p0, p2, v1, v2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->sendStartUpStateMessage(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;J)V

    invoke-direct {p1, v3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->trackMediaOnClick(I)V

    return-void

    :cond_75
    :goto_75
    iget-object p0, p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->openMusicTip:Ljava/lang/String;

    if-eqz p0, :cond_8b

    sget-object p2, Lcom/nothing/cardwidget/util/ToastUtil;->INSTANCE:Lcom/nothing/cardwidget/util/ToastUtil;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    const-string v0, "getApplicationContext(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p3, p0}, Lcom/nothing/cardwidget/util/ToastUtil;->showToast(Landroid/content/Context;Ljava/lang/CharSequence;)V

    :cond_8b
    const/4 p0, 0x0

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->trackMediaOnClick(I)V

    return-void
.end method

.method private static final onDetachedFromWindow$lambda$8(LC8/e;)V
    .registers 2

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final onMediaPlayerViewShown()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerViewVisible:Z

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->notifyMediaPlayerVisibilityChanged()V

    return-void
.end method

.method private final recordEnabledWidget()V
    .registers 10

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->setWidgetEnabled(IZ)V

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v3

    new-instance v6, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$recordEnabledWidget$1$1;

    const/4 v1, 0x0

    invoke-direct {v6, v0, p0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$recordEnabledWidget$1$1;-><init>(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_1f
    return-void
.end method

.method private final release()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->registerTask:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_8
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isPkgReceiverRegister:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_4f

    :try_start_10
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/l;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/l;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_23
    .catchall {:try_start_10 .. :try_end_23} :catchall_24

    goto :goto_2f

    :catchall_24
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2f
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_4f

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDetachedFromWindow error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "MediaPlayerContainer"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4f
    return-void
.end method

.method private static final release$lambda$11$lambda$10(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 2

    const-string v0, "$this_runCatching"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->packageRemovedReceiver:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$packageRemovedReceiver$1;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15
    .catchall {:try_start_5 .. :try_end_15} :catchall_16

    return-void

    :catchall_16
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final showAuthorizationGuideView()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const-string v1, "mediaPlayerView"

    const/4 v2, 0x0

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->disableHScroll(Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v0, :cond_17

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_17
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez v0, :cond_25

    const-string v0, "startUpCover"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_25
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authorizeGuideCover:Landroid/widget/TextView;

    if-nez v0, :cond_34

    const-string v0, "authorizeGuideCover"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_35

    :cond_34
    move-object v2, v0

    :goto_35
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->guideNotifAuth:Ljava/lang/String;

    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final showMediaPlayerViewPager(IZ)V
    .registers 9

    const/4 v0, 0x2

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onMediaPlayerViewShown()V

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const-string v2, "mediaPlayerView"

    const/4 v3, 0x0

    if-nez v1, :cond_f

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_f
    sget-object v4, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {v4, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->isConnected(I)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->disableHScroll(Z)V

    const-string p1, "startUpCover"

    if-eqz p2, :cond_6a

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez p2, :cond_26

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p2, v3

    :cond_26
    new-array p1, v0, [F

    fill-array-data p1, :array_92

    const-string v1, "alpha"

    invoke-static {p2, v1, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v4, 0x96

    invoke-virtual {p1, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$showMediaPlayerViewPager$startUpCoverFadeOut$1$1;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$showMediaPlayerViewPager$startUpCoverFadeOut$1$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p2, :cond_46

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_47

    :cond_46
    move-object v3, p2

    :goto_47
    new-array p2, v0, [F

    fill-array-data p2, :array_9a

    invoke-static {v3, v1, p2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-wide/16 v0, 0xfa

    invoke-virtual {p2, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animInterpolator:Landroid/view/animation/PathInterpolator;

    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_6a
    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authorizeGuideCover:Landroid/widget/TextView;

    if-nez p2, :cond_74

    const-string p2, "authorizeGuideCover"

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p2, v3

    :cond_74
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez p2, :cond_81

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p2, v3

    :cond_81
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p0, :cond_8c

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_8d

    :cond_8c
    move-object v3, p0

    :goto_8d
    const/4 p0, 0x0

    invoke-virtual {v3, p0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :array_92
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_9a
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final showStartUpView(ILv8/a;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv8/a;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const-string v1, "mediaPlayerView"

    const/4 v2, 0x0

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->disableHScroll(Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authorizeGuideCover:Landroid/widget/TextView;

    if-nez v0, :cond_19

    const-string v0, "authorizeGuideCover"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_19
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v0, :cond_26

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_26
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->startUpCover:Lcom/airbnb/lottie/LottieAnimationView;

    if-nez v0, :cond_34

    const-string v0, "startUpCover"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_34
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->onClickStartUpView(ILv8/a;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isStartUpAnimationRunning()Z

    move-result p1

    if-eqz p1, :cond_47

    return-void

    :cond_47
    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    const-string p2, "animHandler"

    if-nez p1, :cond_51

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v2

    :cond_51
    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;->IDLE:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    const-wide/16 v3, 0x0

    invoke-virtual {p1, v0, v3, v4}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->sendStartUpStateMessage(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;J)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;

    if-nez p0, :cond_60

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_61

    :cond_60
    move-object v2, p0

    :goto_61
    invoke-virtual {v2, v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$AnimStateHandler;->setCurStartUpState(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;)V

    return-void
.end method

.method private final trackMediaOnClick(I)V
    .registers 13

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getCachedData()Lh8/u;

    move-result-object v1

    invoke-virtual {v1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    const/4 v2, 0x0

    if-eqz v1, :cond_14

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object v0

    goto :goto_15

    :cond_14
    move-object v0, v2

    :goto_15
    instance-of v1, v0, LN5/b;

    if-eqz v1, :cond_1c

    move-object v2, v0

    check-cast v2, LN5/b;

    :cond_1c
    sget-object v3, LO5/i;->a:LO5/i;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v0, "getContext(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    if-eqz p0, :cond_31

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :goto_2f
    move v5, p0

    goto :goto_33

    :cond_31
    const/4 p0, -0x1

    goto :goto_2f

    :goto_33
    const-string p0, ""

    if-eqz v2, :cond_40

    invoke-virtual {v2}, LN5/b;->k()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3e

    goto :goto_40

    :cond_3e
    move-object v7, v0

    goto :goto_41

    :cond_40
    :goto_40
    move-object v7, p0

    :goto_41
    if-eqz v2, :cond_4c

    invoke-virtual {v2}, LN5/b;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4a

    goto :goto_4c

    :cond_4a
    move-object v8, v0

    goto :goto_4d

    :cond_4c
    :goto_4c
    move-object v8, p0

    :goto_4d
    if-eqz v2, :cond_58

    invoke-virtual {v2}, LN5/b;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_56

    goto :goto_58

    :cond_56
    move-object v9, v0

    goto :goto_59

    :cond_58
    :goto_58
    move-object v9, p0

    :goto_59
    if-eqz v2, :cond_65

    invoke-virtual {v2}, LN5/b;->l()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_62

    goto :goto_65

    :cond_62
    move-object v10, v0

    :goto_63
    move v6, p1

    goto :goto_67

    :cond_65
    :goto_65
    move-object v10, p0

    goto :goto_63

    :goto_67
    invoke-virtual/range {v3 .. v10}, LO5/i;->c(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final updateDisplayRatio(F)V
    .registers 6

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authorizeGuideCover:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_b

    const-string v0, "authorizeGuideCover"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_b
    const/16 v2, 0x35

    int-to-float v2, v2

    mul-float/2addr v2, p1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p0, :cond_1d

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v1

    :cond_1d
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v0, p0, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_28

    move-object v1, p0

    check-cast v1, Landroid/graphics/drawable/LayerDrawable;

    :cond_28
    if-eqz v1, :cond_44

    const/16 p0, 0x51

    int-to-float p0, p0

    mul-float/2addr p0, p1

    invoke-static {p0}, Lx8/a;->b(F)I

    move-result p0

    sget p1, Lcom/nothing/cardwidget/R$id;->media_play_previous_icon:I

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/LayerDrawable;->findIndexByLayerId(I)I

    move-result p1

    sget v0, Lcom/nothing/cardwidget/R$id;->media_play_next_icon:I

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/LayerDrawable;->findIndexByLayerId(I)I

    move-result v0

    invoke-virtual {v1, p1, p0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetStart(II)V

    invoke-virtual {v1, v0, p0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetEnd(II)V

    :cond_44
    return-void
.end method

.method private final updateMusicPlayingState(I)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v0, :cond_a

    const-string v0, "mediaPlayerView"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->updatePlayBackState(I)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState(I)V

    return-void
.end method

.method private final updatePlayStateIfNotAvailable(Landroid/os/Bundle;)V
    .registers 3

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object p1

    instance-of v0, p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    if-eqz v0, :cond_13

    check-cast p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->getState()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateMusicPlayingState(I)V

    :cond_13
    return-void
.end method

.method private final updateStartUpViewState(I)V
    .registers 3

    .line 10
    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/j;

    invoke-direct {v0, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/j;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)V

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState(ILv8/a;)V

    return-void
.end method

.method private final updateStartUpViewState(ILv8/a;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv8/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isWidgetEnabled(I)Z

    move-result v0

    goto :goto_f

    :cond_e
    move v0, v1

    .line 2
    :goto_f
    iget-object v2, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateStartUpViewState isEnabledWidget: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", widgetId: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", state: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MediaPlayerContainer"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    sget-object v2, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->needNotificationAuth(I)Z

    move-result v2

    if-eqz v2, :cond_45

    .line 4
    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerViewVisible:Z

    .line 5
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->showAuthorizationGuideView()V

    return-void

    :cond_45
    if-eqz v0, :cond_52

    .line 6
    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isMusicAppExist()Z

    move-result v0

    if-nez v0, :cond_4e

    goto :goto_52

    .line 7
    :cond_4e
    invoke-direct {p0, p1, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->showMediaPlayerViewPager(IZ)V

    return-void

    .line 8
    :cond_52
    :goto_52
    iput-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerViewVisible:Z

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->showStartUpView(ILv8/a;)V

    return-void
.end method

.method private static final updateStartUpViewState$lambda$44(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)Lh8/A;
    .registers 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->recordEnabledWidget()V

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->applyCachedData()V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->showMediaPlayerViewPager(IZ)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final updateSwitchIconByAction(B)V
    .registers 9

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/h;

    invoke-direct {v0, p0}, Lcom/nothing/cardwidget/mediaplayer/view/h;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/i;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/i;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v2, Lcom/nothing/cardwidget/R$color;->color_media_switch_icon:I

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p0

    const/16 v2, -0x80

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    if-eq p1, v2, :cond_5f

    sget-object v2, Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction$Companion;

    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction$Companion;->supportSlidePrevious(B)Z

    move-result v4

    const v5, 0x3e99999a    # 0.3f

    if-eqz v4, :cond_3a

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_45

    :cond_3a
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v0, v4, v6}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_45
    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/PlaybackStateAction$Companion;->supportSlideNext(B)Z

    move-result p1

    if-eqz p1, :cond_53

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v1, p0, p1}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5f
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final updateSwitchIconByAction$lambda$20(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;IF)Lh8/A;
    .registers 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const/4 v0, 0x0

    if-nez p0, :cond_10

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v0

    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_1b

    check-cast p0, Landroid/graphics/drawable/LayerDrawable;

    goto :goto_1c

    :cond_1b
    move-object p0, v0

    :goto_1c
    if-eqz p0, :cond_24

    sget v0, Lcom/nothing/cardwidget/R$id;->media_play_previous_icon:I

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_24
    if-eqz v0, :cond_3b

    const/16 p0, 0xff

    int-to-float p0, p0

    mul-float/2addr p2, p0

    float-to-int p0, p2

    invoke-static {p1, p0}, Lt0/a;->x(II)I

    move-result p0

    invoke-static {v0}, Lu0/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const-string p2, "wrap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lu0/a;->n(Landroid/graphics/drawable/Drawable;I)V

    :cond_3b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final updateSwitchIconByAction$lambda$22(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;IF)Lh8/A;
    .registers 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const/4 v0, 0x0

    if-nez p0, :cond_10

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v0

    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v1, :cond_1b

    check-cast p0, Landroid/graphics/drawable/LayerDrawable;

    goto :goto_1c

    :cond_1b
    move-object p0, v0

    :goto_1c
    if-eqz p0, :cond_24

    sget v0, Lcom/nothing/cardwidget/R$id;->media_play_next_icon:I

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_24
    if-eqz v0, :cond_3b

    const/16 p0, 0xff

    int-to-float p0, p0

    mul-float/2addr p2, p0

    float-to-int p0, p2

    invoke-static {p1, p0}, Lt0/a;->x(II)I

    move-result p0

    invoke-static {v0}, Lu0/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const-string p2, "wrap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lu0/a;->n(Landroid/graphics/drawable/Drawable;I)V

    :cond_3b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public onAllWidgetViewRemoved()V
    .registers 1

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->clearCachedData()V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 3

    invoke-super {p0}, Lcom/nothing/cardwidget/RemoteServiceView;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_e

    check-cast v0, Landroid/view/View;

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    if-eqz v0, :cond_20

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_20

    sget v1, Lcom/nothing/cardwidget/R$drawable;->color_media_container_bg:I

    invoke-static {v0, v1}, Lg/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_20
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isDetached:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->releaseAction:LC8/e;

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/e;

    invoke-direct {v1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/e;-><init>(LC8/e;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isPkgReceiverRegister:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_59

    :try_start_38
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/f;

    invoke-direct {v1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/f;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->registerTask:Ljava/util/concurrent/Future;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4e
    .catchall {:try_start_38 .. :try_end_4e} :catchall_4f

    return-void

    :catchall_4f
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    return-void
.end method

.method public onCardVisibilityChanged(Z)V
    .registers 4

    invoke-super {p0, p1}, Lcom/nothing/cardwidget/RemoteServiceView;->onCardVisibilityChanged(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCardVisibilityChanged: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MediaPlayerContainer"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->cardContainerVisible:Z

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->notifyMediaPlayerVisibilityChanged()V

    return-void
.end method

.method public onDataChanged(Landroid/os/Bundle;)V
    .registers 5

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->cacheData(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getPlaybackState()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isWidgetAvailable(I)Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updatePlayStateIfNotAvailable(Landroid/os/Bundle;)V

    return-void

    :cond_1e
    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object p1

    instance-of v1, p1, LN5/b;

    if-eqz v1, :cond_55

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v1, :cond_30

    const-string v1, "mediaPlayerView"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_30
    check-cast p1, LN5/b;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->updateMusicMetaData(LN5/b;Z)V

    invoke-virtual {p1}, LN5/b;->m()B

    move-result p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateSwitchIconByAction(B)V

    iget-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isAppExist:Z

    if-nez p1, :cond_54

    invoke-direct {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isMusicAppExist()Z

    move-result p1

    iput-boolean p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isAppExist:Z

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getPlaybackState()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_54

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState(I)V

    :cond_54
    return-void

    :cond_55
    instance-of v0, p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    if-eqz v0, :cond_63

    check-cast p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->getState()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateMusicPlayingState(I)V

    return-void

    :cond_63
    instance-of v0, p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;

    if-eqz v0, :cond_71

    check-cast p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;

    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->getPlayingPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->setMusicPlayingPosition(I)V

    return-void

    :cond_71
    const-string p0, "MediaPlayerContainer"

    const-string p1, "Unsupported data type."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 5

    invoke-super {p0}, Lcom/nothing/cardwidget/RemoteServiceView;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->isDetached:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->releaseAction:LC8/e;

    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/k;

    invoke-direct {v1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/k;-><init>(LC8/e;)V

    const-wide/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->containerCornerRadius:Ljava/lang/Float;

    if-eqz v0, :cond_39

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_16

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    if-eqz v0, :cond_39

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    new-instance v3, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    invoke-direct {v3, v2, v2, v4, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object p0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v3, v0, v0, p0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    :cond_39
    return-void
.end method

.method public onMusicSwitch(Z)V
    .registers 11

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_e

    sget-object p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;->PREVIOUS:Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;

    :goto_9
    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;->getEvent()Ljava/lang/String;

    move-result-object p1

    goto :goto_11

    :cond_e
    sget-object p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;->NEXT:Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;

    goto :goto_9

    :goto_11
    const-string v1, "music_control_event"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const/4 v1, 0x0

    if-nez p1, :cond_21

    const-string p1, "mediaPlayerView"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_21
    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->getCurrentPage()I

    move-result p1

    const-string v2, "key_selected_position"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    if-eqz p1, :cond_33

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_34

    :cond_33
    const/4 p1, -0x1

    :goto_34
    const-string v2, "key_widget_id"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v3

    new-instance v6, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$onMusicSwitch$2$1;

    invoke-direct {v6, p0, v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$onMusicSwitch$2$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/os/Bundle;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public onPlayStateSwitch(Z)V
    .registers 11

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_e

    sget-object p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;->PLAY:Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;

    :goto_9
    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;->getEvent()Ljava/lang/String;

    move-result-object p1

    goto :goto_11

    :cond_e
    sget-object p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;->PAUSE:Lcom/nothing/cardwidget/mediaplayer/entity/MusicControlEvent;

    goto :goto_9

    :goto_11
    const-string v1, "music_control_event"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    const/4 v1, 0x0

    if-nez p1, :cond_21

    const-string p1, "mediaPlayerView"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_21
    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->getCurrentPage()I

    move-result p1

    const-string v2, "key_selected_position"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    if-eqz p1, :cond_33

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_34

    :cond_33
    const/4 p1, -0x1

    :goto_34
    const-string v2, "key_widget_id"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v3

    new-instance v6, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$onPlayStateSwitch$2$1;

    invoke-direct {v6, p0, v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$onPlayStateSwitch$2$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/os/Bundle;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public onWidgetViewRemoved(I)V
    .registers 2

    return-void
.end method

.method public final setDisplayRatio(F)V
    .registers 4

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->displayRatio:F

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v0, :cond_c

    const-string v0, "mediaPlayerView"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_c
    iget v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->displayRatio:F

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->updateDisplayRatio(F)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateDisplayRatio(F)V

    return-void
.end method

.method public final setMusicMetaData(LN5/b;)V
    .registers 5

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getCachedData()Lh8/u;

    move-result-object v1

    invoke-virtual {v1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    const/4 v2, 0x0

    if-eqz v1, :cond_19

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object v0

    goto :goto_1a

    :cond_19
    move-object v0, v2

    :goto_1a
    instance-of v1, v0, LN5/b;

    if-eqz v1, :cond_21

    check-cast v0, LN5/b;

    goto :goto_22

    :cond_21
    move-object v0, v2

    :goto_22
    if-nez v0, :cond_25

    goto :goto_26

    :cond_25
    move-object p1, v0

    :goto_26
    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p0, :cond_30

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_31

    :cond_30
    move-object v2, p0

    :goto_31
    const/4 p0, 0x0

    invoke-virtual {v2, p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->updateMusicMetaData(LN5/b;Z)V

    return-void
.end method

.method public final setMusicPlayingPosition(I)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p0, :cond_a

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->updateMusicPosition(I)V

    return-void
.end method

.method public final setMusicPlayingState(I)V
    .registers 5

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->getCachedData()Lh8/u;

    move-result-object v1

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    const/4 v2, 0x0

    if-eqz v1, :cond_26

    invoke-virtual {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object v0

    instance-of v1, v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    if-eqz v1, :cond_1a

    check-cast v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    goto :goto_1b

    :cond_1a
    move-object v0, v2

    :goto_1b
    if-eqz v0, :cond_26

    invoke-virtual {v0}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->getState()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_27

    :cond_26
    move-object v0, v2

    :goto_27
    if-eqz v0, :cond_2d

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :cond_2d
    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez v0, :cond_37

    const-string v0, "mediaPlayerView"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_38

    :cond_37
    move-object v2, v0

    :goto_38
    invoke-virtual {v2, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->updatePlayBackState(I)V

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->updateStartUpViewState(I)V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->authGuideClickListener:Landroid/view/View$OnClickListener;

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

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p0, :cond_f

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_f
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->setOpenAppListener(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final setWidgetId(I)V
    .registers 3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->widgetId:Ljava/lang/Integer;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->mediaPlayerView:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    if-nez p0, :cond_10

    const-string p0, "mediaPlayerView"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_10
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->setWidgetId(I)V

    return-void
.end method
