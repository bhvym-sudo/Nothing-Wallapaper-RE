.class public interface abstract Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/IRemoteServiceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/utils/AsyncServiceBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IServiceBindListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/utils/AsyncServiceBinder$IServiceBindListener$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract asBinder()Landroid/os/IBinder;
.end method

.method public abstract onServiceBind(Lcom/nothing/cardwidget/IRemoteService;)V
.end method

.method public abstract onServiceUnbind()V
.end method
