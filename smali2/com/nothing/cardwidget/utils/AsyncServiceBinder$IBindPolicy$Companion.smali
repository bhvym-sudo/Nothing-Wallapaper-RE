.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;

.field private static final RETRY_INTERVAL:J = 0x7d0L

.field private static final RETRY_LIMIT_COUNT:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;

    invoke-direct {v0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;->$$INSTANCE:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
