.class public final Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/pedometer/PedometerContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;Landroid/os/Looper;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 14

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_55

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    # invokes: Lcom/nothing/cardwidget/pedometer/PedometerContainer;->setViewPagerShow(Z)V
    invoke-static {v0, v1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->access$setViewPagerShow(Lcom/nothing/cardwidget/pedometer/PedometerContainer;Z)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerAnimIv:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->access$getPedometerAnimIv$p(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerContainer;->isResumed:Z
    invoke-static {v0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->access$isResumed$p(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)Z

    move-result v0

    if-eqz v0, :cond_55

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {}, LO5/g;->j()LF8/L;

    move-result-object v0

    new-instance v3, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;

    iget-object v1, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    const/4 v2, 0x0

    invoke-direct {v3, v1, p1, v2}, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1$handleMessage$1;-><init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;ILm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object v6, p0, Lcom/nothing/cardwidget/pedometer/PedometerContainer$handler$1;->this$0:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    # getter for: Lcom/nothing/cardwidget/pedometer/PedometerContainer;->pedometerViewpager:Landroidx/viewpager2/widget/ViewPager2;
    invoke-static {v6}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->access$getPedometerViewpager$p(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->maybeUpdateWalkingPercent$default(Lcom/nothing/cardwidget/pedometer/PedometerContainer;IIZILjava/lang/Object;)V

    :cond_55
    return-void
.end method
