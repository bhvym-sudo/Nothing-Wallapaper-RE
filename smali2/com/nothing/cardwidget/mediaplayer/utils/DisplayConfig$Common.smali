.class public final Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Common"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;

.field public static final MARGIN_PARENT_NEXT_PREVIOUS_ICON:I = 0x51

.field public static final MARGIN_TOP_END_MUSIC_APP_ICON:I = 0xb

.field public static final PADDING_MUSIC_APP_ICON:I = 0x1a

.field public static final STANDARD_AUTHORIZE_GUIDE_TEXT_SIZE:I = 0x35

.field public static final STANDARD_MUSIC_APP_ICON_SIZE:I = 0x7e

.field public static final STANDARD_MUSIC_DEFAULT_ICON_HEIGHT:I = 0xa8

.field public static final STANDARD_MUSIC_DEFAULT_ICON_WIDTH:I = 0xbd

.field public static final STANDARD_NORMAL_CARD_SIZE:I = 0x1c4


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;

    invoke-direct {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
