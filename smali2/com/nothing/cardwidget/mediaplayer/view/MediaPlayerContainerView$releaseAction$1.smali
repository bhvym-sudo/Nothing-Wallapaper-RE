.class final synthetic Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$releaseAction$1;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lv8/a;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const-string v5, "release()V"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-class v3, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    const-string v4, "release"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView$releaseAction$1;->invoke()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final invoke()V
    .registers 1

    .line 2
    iget-object p0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    check-cast p0, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;

    # invokes: Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->release()V
    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;->access$release(Lcom/nothing/cardwidget/mediaplayer/view/MediaPlayerContainerView;)V

    return-void
.end method
