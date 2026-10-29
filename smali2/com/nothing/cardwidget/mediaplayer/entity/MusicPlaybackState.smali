.class public final Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;
    }
.end annotation


# static fields
.field private static final CONNECTED:I = 0x1

.field public static final Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

.field private static final DISCONNECTED:I = 0x0

.field private static final KEY_PLAY_STATE:Ljava/lang/String; = "playingState"

.field private static final NEXT:I = 0x5

.field private static final PAUSE:I = 0x3

.field private static final PLAYING:I = 0x2

.field private static final PREVIOUS:I = 0x4

.field private static final UNAUTHORIZED:I = -0x1


# instance fields
.field private final state:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->Companion:Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState$Companion;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->state:I

    return-void
.end method


# virtual methods
.method public final getState()I
    .registers 1

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/entity/MusicPlaybackState;->state:I

    return p0
.end method
