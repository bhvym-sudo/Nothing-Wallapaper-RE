.class public interface abstract Lcom/nothing/commBase/deferred/IDeferringObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/commBase/deferred/IDeferringObserver$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract getDeferringController()Lcom/nothing/commBase/deferred/IDeferring;
.end method

.method public abstract onCardRemoved(I)V
.end method

.method public abstract onCardVisibilityChanged(Z)V
.end method
