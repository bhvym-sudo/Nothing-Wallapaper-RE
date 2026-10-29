.class public final Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;
.super Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SecondPageViewHolder"
.end annotation


# instance fields
.field private albumIconLayout:Lcom/nothing/cardwidget/RoundCornersFrameLayout;

.field private albumSmallIcon:Landroid/widget/ImageView;

.field private appIcon:Landroid/widget/ImageView;

.field private artistAndAlbumName:Landroid/widget/TextView;

.field private currentProgress:I

.field private isPlaying:Z

.field private musicName:Landroid/widget/TextView;

.field private musicNameLayout:Landroid/widget/LinearLayout;

.field private playPauseCover:Landroid/widget/ImageView;

.field private playState:I

.field private progressBar:Landroid/widget/ProgressBar;

.field final synthetic this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;


# direct methods
.method public constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V

    sget v0, Lcom/nothing/cardwidget/R$id;->music_album_small_icon_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/RoundCornersFrameLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->albumIconLayout:Lcom/nothing/cardwidget/RoundCornersFrameLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->play_pause_cover:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->playPauseCover:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->music_album_small_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->albumSmallIcon:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->second_music_app_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->appIcon:Landroid/widget/ImageView;

    sget v0, Lcom/nothing/cardwidget/R$id;->music_name_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicNameLayout:Landroid/widget/LinearLayout;

    sget v0, Lcom/nothing/cardwidget/R$id;->music_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicName:Landroid/widget/TextView;

    sget v0, Lcom/nothing/cardwidget/R$id;->artist_album_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->artistAndAlbumName:Landroid/widget/TextView;

    sget v0, Lcom/nothing/cardwidget/R$id;->music_position_bar:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p2, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewPager2:Landroidx/viewpager2/widget/ViewPager2;
    invoke-static {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getViewPager2$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p1

    new-instance p2, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder$1;

    invoke-direct {p2, p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder$1;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;)V

    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    return-void
.end method

.method public static final synthetic access$getMusicName$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;)Landroid/widget/TextView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicName:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getMusicNameLayout$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;)Landroid/widget/LinearLayout;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicNameLayout:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final bindViewData(LN5/b;)V
    .registers 3

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicMetaData(LN5/b;Z)V

    return-void
.end method

.method public static synthetic d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicMetaData$lambda$9$lambda$8(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicMetaData$lambda$7$lambda$6(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->onAlbumArtClick$lambda$1(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicMetaData$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/widget/TextView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicMetaData$lambda$11$lambda$10(Landroid/widget/TextView;)V

    return-void
.end method

.method public static synthetic i(Landroid/widget/TextView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->setArtistAndAlbumName$lambda$19$lambda$18(Landroid/widget/TextView;)V

    return-void
.end method

.method public static synthetic j(Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateMusicMetaData$lambda$7$lambda$5(Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private static final onAlbumArtClick$lambda$1(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 6

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->playPauseCover:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_13

    return-void

    :cond_13
    sget-object p2, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    iget v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->playState:I

    invoke-virtual {p2, v0}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->isConnected(I)Z

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_2a

    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getContext()Landroid/content/Context;

    move-result-object p2

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicData:LN5/b;
    invoke-static {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getMusicData$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)LN5/b;

    move-result-object p1

    invoke-virtual {p0, p2, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->openApp(Landroid/content/Context;LN5/b;Z)V

    return-void

    :cond_2a
    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->playPauseCover:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->isPlaying:Z

    if-eqz v1, :cond_3b

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/nothing/cardwidget/R$drawable;->music_pause_small_icon:I

    invoke-static {v1, v2}, Lg/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_45

    :cond_3b
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/nothing/cardwidget/R$drawable;->music_play_small_icon:I

    invoke-static {v1, v2}, Lg/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :goto_45
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    # invokes: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->startPlayPauseCoverAnimation(Landroid/view/View;)Landroid/animation/ObjectAnimator;
    invoke-static {p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$startPlayPauseCoverAnimation(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getPlayStateCallback()Lv8/l;

    move-result-object p1

    iget-boolean p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->isPlaying:Z

    xor-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final setArtistAndAlbumName(LN5/b;)V
    .registers 4

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->artistAndAlbumName:Landroid/widget/TextView;

    invoke-virtual {p1}, LN5/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_18

    invoke-virtual {p1}, LN5/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_51

    :cond_18
    invoke-virtual {p1}, LN5/b;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_41

    invoke-virtual {p1}, LN5/b;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_41

    invoke-virtual {p1}, LN5/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LN5/b;->f()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_51

    :cond_41
    invoke-virtual {p1}, LN5/b;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_50

    invoke-virtual {p1}, LN5/b;->f()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4e

    goto :goto_51

    :cond_4e
    move-object v1, p1

    goto :goto_51

    :cond_50
    move-object v1, v0

    :cond_51
    :goto_51
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p1, Lcom/nothing/cardwidget/mediaplayer/view/B;

    invoke-direct {p1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/B;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final setArtistAndAlbumName$lambda$19$lambda$18(Landroid/widget/TextView;)V
    .registers 2

    const-string v0, "$this_with"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setSelected(Z)V

    return-void
.end method

.method private final tintAppIconColor(Landroid/graphics/Bitmap;Lv8/l;)V
    .registers 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceType"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v1, Lcom/nothing/cardwidget/R$color;->color_app_icon_default:I

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p0

    invoke-virtual {v0, p1, p0}, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->colorizeBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-interface {p2, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final updateMusicMetaData$lambda$11$lambda$10(Landroid/widget/TextView;)V
    .registers 2

    const-string v0, "$this_with"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setSelected(Z)V

    return-void
.end method

.method private static final updateMusicMetaData$lambda$7$lambda$5(Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/graphics/drawable/Drawable;)V
    .registers 10

    const-string v0, "$this_with"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p2, :cond_24

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->drawableToBitmap$default(Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;Landroid/graphics/drawable/Drawable;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_24

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/C;

    invoke-direct {v0, p0}, Lcom/nothing/cardwidget/mediaplayer/view/C;-><init>(Landroid/widget/ImageView;)V

    invoke-direct {p1, p2, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->tintAppIconColor(Landroid/graphics/Bitmap;Lv8/l;)V

    :cond_24
    return-void
.end method

.method private static final updateMusicMetaData$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)Lh8/A;
    .registers 3

    const-string v0, "$this_with"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "covertBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final updateMusicMetaData$lambda$7$lambda$6(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 5

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$this_with"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "this$1"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    iget v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->playState:I

    invoke-virtual {p3, v0}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->isConnected(I)Z

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicData:LN5/b;
    invoke-static {p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getMusicData$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)LN5/b;

    move-result-object p2

    xor-int/lit8 p3, p3, 0x1

    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->openApp(Landroid/content/Context;LN5/b;Z)V

    return-void
.end method

.method private static final updateMusicMetaData$lambda$9$lambda$8(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)Lh8/A;
    .registers 3

    const-string v0, "$this_with"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public bind(LN5/b;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->bindViewData(LN5/b;)V

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->onAlbumArtClick()V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->uiRatio:F
    invoke-static {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getUiRatio$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->updateDisplayRatio(F)V

    return-void
.end method

.method public onAlbumArtClick()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->albumSmallIcon:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    new-instance v2, Lcom/nothing/cardwidget/mediaplayer/view/D;

    invoke-direct {v2, p0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/D;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onVisibilityChanged()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicViewVisible:Z
    invoke-static {v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getMusicViewVisible$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->progressBar:Landroid/widget/ProgressBar;

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->currentProgress:I

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    :cond_10
    return-void
.end method

.method public updateDisplayRatio(F)V
    .registers 12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDisplayRatio second page ratio: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ViewPagerAdapter"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->albumIconLayout:Lcom/nothing/cardwidget/RoundCornersFrameLayout;

    const/16 v1, 0xb8

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v1

    sget-object v2, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v3, v1}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v1, 0x2a

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v3

    const-string v8, "layout_marginStart"

    invoke-virtual {v2, v0, v8, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v3

    const-string v9, "layout_marginTop"

    invoke-virtual {v2, v0, v9, v3}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    iget-object v3, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->appIcon:Landroid/widget/ImageView;

    const/16 v0, 0x7e

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v4, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v0, 0x1a

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual/range {v2 .. v7}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewPadding(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v0, 0xb

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    invoke-virtual {v2, v3, v9, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    const-string v4, "layout_marginEnd"

    invoke-virtual {v2, v3, v4, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicNameLayout:Landroid/widget/LinearLayout;

    const/16 v3, 0x20

    int-to-float v3, v3

    mul-float/2addr v3, p1

    invoke-static {v3}, Lx8/a;->b(F)I

    move-result v5

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v6

    invoke-virtual {v2, v0, v9, v5}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, v0, v8, v6}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, v0, v4, v6}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicName:Landroid/widget/TextView;

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->artistAndAlbumName:Landroid/widget/TextView;

    const/16 v6, 0x25

    int-to-float v6, v6

    mul-float/2addr v6, p1

    invoke-virtual {v0, v5, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->progressBar:Landroid/widget/ProgressBar;

    invoke-static {v3}, Lx8/a;->b(F)I

    move-result p1

    invoke-static {v1}, Lx8/a;->b(F)I

    move-result v0

    invoke-virtual {v2, p0, v9, p1}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, p0, v8, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    invoke-virtual {v2, p0, v4, v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->setViewMargin(Landroid/view/View;Ljava/lang/String;I)V

    return-void
.end method

.method public updateMusicMetaData(LN5/b;Z)V
    .registers 8

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->appIcon:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    invoke-virtual {p1}, LN5/b;->g()Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_28

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p1}, LN5/b;->g()Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_2d

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/nothing/cardwidget/mediaplayer/view/x;

    invoke-direct {v3, p2, p0}, Lcom/nothing/cardwidget/mediaplayer/view/x;-><init>(Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;)V

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->mainHandler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getMainHandler$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/drawable/Icon;->loadDrawableAsync(Landroid/content/Context;Landroid/graphics/drawable/Icon$OnDrawableLoadedListener;Landroid/os/Handler;)V

    goto :goto_2d

    :cond_28
    const/16 v1, 0x8

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2d
    :goto_2d
    new-instance v1, Lcom/nothing/cardwidget/mediaplayer/view/y;

    invoke-direct {v1, p0, p2, v0}, Lcom/nothing/cardwidget/mediaplayer/view/y;-><init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->albumSmallIcon:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    sget v1, Lcom/nothing/cardwidget/R$drawable;->album_cover_small_icon:I

    new-instance v2, Lcom/nothing/cardwidget/mediaplayer/view/z;

    invoke-direct {v2, p2}, Lcom/nothing/cardwidget/mediaplayer/view/z;-><init>(Landroid/widget/ImageView;)V

    # invokes: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->loadAlbumDrawable(Landroid/widget/ImageView;LN5/b;ILv8/l;)V
    invoke-static {v0, p2, p1, v1, v2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$loadAlbumDrawable(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/widget/ImageView;LN5/b;ILv8/l;)V

    iget-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->musicName:Landroid/widget/TextView;

    invoke-virtual {p1}, LN5/b;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/view/A;

    invoke-direct {v0, p2}, Lcom/nothing/cardwidget/mediaplayer/view/A;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->setArtistAndAlbumName(LN5/b;)V

    return-void
.end method

.method public final updateMusicPosition(I)V
    .registers 3

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->currentProgress:I

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->musicViewVisible:Z
    invoke-static {v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getMusicViewVisible$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->progressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    :cond_10
    return-void
.end method

.method public updatePlayBackState(I)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updatePlayBackState playState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ViewPagerAdapter"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {v0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->isPlaying(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->isPlaying:Z

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$SecondPageViewHolder;->playState:I

    return-void
.end method
