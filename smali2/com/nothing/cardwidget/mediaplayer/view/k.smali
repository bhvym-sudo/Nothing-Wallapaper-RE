.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LC8/e;


# direct methods
.method public synthetic constructor <init>(LC8/e;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/k;->q:LC8/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/k;->q:LC8/e;

    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->g0(LC8/e;)V

    return-void
.end method
