.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;


# direct methods
.method public synthetic constructor <init>(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/c;->a:I

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/c;->b:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    iget v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/c;->a:I

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/c;->b:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    check-cast p1, Landroid/os/Bundle;

    invoke-static {v0, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->Z(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Landroid/os/Bundle;)V

    return-void
.end method
