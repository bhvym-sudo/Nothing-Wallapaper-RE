.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

.field public final synthetic s:Lv8/a;


# direct methods
.method public synthetic constructor <init>(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lv8/a;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/m;->q:I

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/m;->r:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    iput-object p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/m;->s:Lv8/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/m;->q:I

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/m;->r:Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/m;->s:Lv8/a;

    invoke-static {v0, v1, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->e0(ILcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;Lv8/a;Landroid/view/View;)V

    return-void
.end method
