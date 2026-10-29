.class public final Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FirstPage"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;

.field public static final MARGIN_START_BOTTOM_MUSIC_WAVEFORM:I = 0xb

.field public static final STANDARD_MUSIC_WAVEFORM_SIZE:I = 0x7e


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;

    invoke-direct {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
