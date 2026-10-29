.class public interface abstract Lcom/nothing/commBase/deferred/IDeferring;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/commBase/deferred/IDeferringObservable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/commBase/deferred/IDeferring$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/commBase/deferred/IDeferring$Companion;

.field public static final MAX_DEFERRED_REFRESH_TIME:J = 0x3e8L


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, Lcom/nothing/commBase/deferred/IDeferring$Companion;->$$INSTANCE:Lcom/nothing/commBase/deferred/IDeferring$Companion;

    sput-object v0, Lcom/nothing/commBase/deferred/IDeferring;->Companion:Lcom/nothing/commBase/deferred/IDeferring$Companion;

    return-void
.end method


# virtual methods
.method public abstract isDeferring()Z
.end method

.method public abstract removeDeferringCallback(Ljava/lang/Runnable;)Z
.end method

.method public abstract runOnDeferringEnd(Ljava/lang/Runnable;)V
.end method
