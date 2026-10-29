.class public final Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static getBindFlags(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public static getReBindLimitCount(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)I
    .registers 1

    const/4 p0, 0x3

    return p0
.end method

.method public static getRebindInterval(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)J
    .registers 3

    const-wide/16 v0, 0x7d0

    return-wide v0
.end method

.method public static isAutoReBind(Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;)Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method
