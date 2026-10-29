.class public final Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

.field private static musicIdentifyMap:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static musicMetaData:Landroid/os/Bundle;

.field private static musicPlaybackState:Landroid/os/Bundle;

.field private static playingPosition:Landroid/os/Bundle;

.field private static widgetsEnableRecords:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-direct {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->widgetsEnableRecords:Ljava/util/Map;

    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicIdentifyMap:Landroid/util/SparseArray;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final cacheData(Landroid/os/Bundle;)V
    .registers 2

    const-string p0, "bundleData"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LN5/b;->m:LN5/b$a;

    invoke-virtual {p0, p1}, LN5/b$a;->a(Landroid/os/Bundle;)Z

    move-result p0

    if-eqz p0, :cond_10

    sput-object p1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicMetaData:Landroid/os/Bundle;

    return-void

    :cond_10
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->belongTo(Landroid/os/Bundle;)Z

    move-result p0

    if-eqz p0, :cond_1b

    sput-object p1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicPlaybackState:Landroid/os/Bundle;

    return-void

    :cond_1b
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;->belongTo(Landroid/os/Bundle;)Z

    move-result p0

    if-eqz p0, :cond_25

    sput-object p1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->playingPosition:Landroid/os/Bundle;

    :cond_25
    return-void
.end method

.method public final clearCachedData()V
    .registers 1

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->widgetsEnableRecords:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicMetaData:Landroid/os/Bundle;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroid/os/Bundle;->clear()V

    :cond_c
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicPlaybackState:Landroid/os/Bundle;

    if-eqz p0, :cond_13

    invoke-virtual {p0}, Landroid/os/Bundle;->clear()V

    :cond_13
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->playingPosition:Landroid/os/Bundle;

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Landroid/os/Bundle;->clear()V

    :cond_1a
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicIdentifyMap:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method

.method public final getAppName()Ljava/lang/String;
    .registers 3

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicMetaData:Landroid/os/Bundle;

    const/4 v0, 0x0

    if-eqz p0, :cond_1a

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v1, p0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object p0

    instance-of v1, p0, LN5/b;

    if-eqz v1, :cond_12

    check-cast p0, LN5/b;

    goto :goto_13

    :cond_12
    move-object p0, v0

    :goto_13
    if-eqz p0, :cond_1a

    invoke-virtual {p0}, LN5/b;->l()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1a
    return-object v0
.end method

.method public final getCachedData()Lh8/u;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh8/u;"
        }
    .end annotation

    new-instance p0, Lh8/u;

    sget-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicMetaData:Landroid/os/Bundle;

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicPlaybackState:Landroid/os/Bundle;

    sget-object v2, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->playingPosition:Landroid/os/Bundle;

    invoke-direct {p0, v0, v1, v2}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public final getMusicFlag(I)Ljava/lang/String;
    .registers 2

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicIdentifyMap:Landroid/util/SparseArray;

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public final getPlaybackState()Ljava/lang/Integer;
    .registers 3

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicPlaybackState:Landroid/os/Bundle;

    const/4 v0, 0x0

    if-eqz p0, :cond_1e

    sget-object v1, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;

    invoke-virtual {v1, p0}, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->parseMusicData(Landroid/os/Bundle;)LN5/a;

    move-result-object p0

    instance-of v1, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    if-eqz v1, :cond_12

    check-cast p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;

    goto :goto_13

    :cond_12
    move-object p0, v0

    :goto_13
    if-eqz p0, :cond_1e

    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->getState()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1e
    return-object v0
.end method

.method public final isWidgetEnabled(I)Ljava/lang/Boolean;
    .registers 2

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->widgetsEnableRecords:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public final markMusicFlag(ILN5/b;)V
    .registers 3

    const-string p0, "data"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->musicIdentifyMap:Landroid/util/SparseArray;

    invoke-virtual {p2}, LN5/b;->j()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public final parseMusicData(Landroid/os/Bundle;)LN5/a;
    .registers 3

    const-string p0, "bundleData"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LN5/b;->m:LN5/b$a;

    invoke-virtual {p0, p1}, LN5/b$a;->a(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p0, p1}, LN5/b$a;->b(Landroid/os/Bundle;)LN5/a;

    move-result-object p0

    return-object p0

    :cond_12
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->belongTo(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;->parseData(Landroid/os/Bundle;)LN5/a;

    move-result-object p0

    return-object p0

    :cond_1f
    sget-object p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;->belongTo(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;->parseData(Landroid/os/Bundle;)LN5/a;

    move-result-object p0

    return-object p0

    :cond_2c
    const/4 p0, 0x0

    return-object p0
.end method

.method public final setWidgetEnabled(IZ)V
    .registers 3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sget-object p2, Lcom/nothing/cardwidget/mediaplayer/utils/MusicDataHelper;->widgetsEnableRecords:Ljava/util/Map;

    invoke-interface {p2, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
