.class public final Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SecondPage"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;

.field public static final MARGIN_HORIZONTAL_MUSIC_NAME_LAYOUT:I = 0x2a

.field public static final MARGIN_TOP_LEFT_ALBUM_SMALL_ICON:I = 0x2a

.field public static final MARGIN_TOP_MUSIC_NAME_LAYOUT:I = 0x20

.field public static final STANDARD_ALBUM_NAME_TEXT_SIZE:I = 0x25

.field public static final STANDARD_ALBUM_SMALL_ICON_SIZE:I = 0xb8

.field public static final STANDARD_MUSIC_NAME_TEXT_SIZE:I = 0x2a


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;

    invoke-direct {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
