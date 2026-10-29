.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$bindPolicy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;-><init>(Landroid/content/Context;Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBindFlags()I
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$DefaultImpls;->getBindFlags(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)I

    move-result p0

    return p0
.end method

.method public getReBindLimitCount()I
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$DefaultImpls;->getReBindLimitCount(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)I

    move-result p0

    return p0
.end method

.method public getRebindInterval()J
    .registers 3

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$DefaultImpls;->getRebindInterval(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)J

    move-result-wide v0

    return-wide v0
.end method

.method public isAutoReBind()Z
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$DefaultImpls;->isAutoReBind(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)Z

    move-result p0

    return p0
.end method
