.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/j;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    iput p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/j;->r:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/j;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/j;->r:I

    invoke-static {v0, p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->b0(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method
