.class public interface abstract Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IBindPolicy"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;,
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$DefaultImpls;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;->$$INSTANCE:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;

    sput-object v0, Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy;->Companion:Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IBindPolicy$Companion;

    return-void
.end method


# virtual methods
.method public abstract getBindFlags()I
.end method

.method public abstract getReBindLimitCount()I
.end method

.method public abstract getRebindInterval()J
.end method

.method public abstract isAutoReBind()Z
.end method
