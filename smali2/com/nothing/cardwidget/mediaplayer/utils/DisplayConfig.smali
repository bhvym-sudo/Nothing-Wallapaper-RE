.class public final Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$Common;,
        Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$FirstPage;,
        Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig$SecondPage;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;

    invoke-direct {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayConfig;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
