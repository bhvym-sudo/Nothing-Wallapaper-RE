.class public final Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;

.field private static final KEY_PLAYING_POSITION:Ljava/lang/String; = "playingPosition"


# instance fields
.field private final playingPosition:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition$Companion;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;-><init>(IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    .line 4
    :cond_5
    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;-><init>(I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;IILjava/lang/Object;)Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    iget p1, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    :cond_6
    invoke-virtual {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->copy(I)Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    return p0
.end method

.method public final copy(I)Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;
    .registers 2

    new-instance p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;

    invoke-direct {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;-><init>(I)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    iget p1, p1, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    if-eq p0, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getPlayingPosition()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    return p0
.end method

.method public hashCode()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlayingPosition;->playingPosition:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MusicPlayingPosition(playingPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
