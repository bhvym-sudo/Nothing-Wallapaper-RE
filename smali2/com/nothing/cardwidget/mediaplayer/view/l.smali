.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/l;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/l;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->f0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    return-void
.end method
