.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/d;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/d;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    check-cast p1, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->Y(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$StartUpState;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
