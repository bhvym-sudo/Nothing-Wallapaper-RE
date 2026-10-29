.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/o;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/o;->q:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;->c(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerPagerView;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method
