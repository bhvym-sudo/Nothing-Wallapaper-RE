.class public final Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->startPlayPauseCoverAnimation(Landroid/view/View;)Landroid/animation/ObjectAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $objectView:Landroid/view/View;

.field final synthetic this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;->$objectView:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->animHandler:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;
    invoke-static {p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getAnimHandler$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;

    move-result-object p1

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$startPlayPauseCoverAnimation$1$1;->$objectView:Landroid/view/View;

    const-wide/16 v0, 0x1c2

    invoke-virtual {p1, p0, v0, v1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$AnimationHandle;->sendFadeOutMsg(Landroid/view/View;J)V

    return-void
.end method
