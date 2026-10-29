.class public abstract Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "MediaItemViewHolder"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;


# direct methods
.method public constructor <init>(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;Landroid/view/View;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method

.method private final doStartApplicationWithPackageName(Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    if-eqz p2, :cond_49

    :try_start_2
    sget-object p0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_19

    const/high16 p2, 0x10000000

    invoke-virtual {p0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    goto :goto_1a

    :cond_19
    const/4 p0, 0x0

    :goto_1a
    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1e
    .catchall {:try_start_2 .. :try_end_1e} :catchall_1f

    goto :goto_2a

    :catchall_1f
    move-exception p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2a
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_46

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "doStartApplicationWithPackageName error: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ViewPagerAdapter"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_46
    invoke-static {p0}, Lh8/q;->a(Ljava/lang/Object;)Lh8/q;

    :cond_49
    return-void
.end method

.method private final trackMediaPlayerOnOpenApp(Landroid/content/Context;ILN5/b;)V
    .registers 12

    if-eqz p3, :cond_2c

    sget-object v0, LO5/i;->a:LO5/i;

    invoke-virtual {p3}, LN5/b;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, LN5/b;->h()Ljava/lang/String;

    move-result-object p0

    const-string v1, ""

    if-nez p0, :cond_12

    move-object v5, v1

    goto :goto_13

    :cond_12
    move-object v5, p0

    :goto_13
    invoke-virtual {p3}, LN5/b;->f()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1b

    move-object v6, v1

    goto :goto_1c

    :cond_1b
    move-object v6, p0

    :goto_1c
    invoke-virtual {p3}, LN5/b;->l()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_24

    move-object v7, v1

    goto :goto_25

    :cond_24
    move-object v7, p0

    :goto_25
    const/16 v3, 0x8

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v7}, LO5/i;->c(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2c
    return-void
.end method

.method public static synthetic updateMusicMetaData$default(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;LN5/b;ZILjava/lang/Object;)V
    .registers 5

    if-nez p4, :cond_b

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_7

    const/4 p2, 0x0

    :cond_7
    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->updateMusicMetaData(LN5/b;Z)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateMusicMetaData"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract bind(LN5/b;)V
.end method

.method public abstract onAlbumArtClick()V
.end method

.method public onVisibilityChanged()V
    .registers 1

    return-void
.end method

.method public final openApp(Landroid/content/Context;LN5/b;Z)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p3, :cond_46

    if-eqz p2, :cond_f

    invoke-virtual {p2}, LN5/b;->i()Landroid/app/PendingIntent;

    move-result-object p3

    goto :goto_10

    :cond_f
    move-object p3, v0

    :goto_10
    if-nez p3, :cond_13

    goto :goto_46

    :cond_13
    iget-object p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->widgetId:I
    invoke-static {p3}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getWidgetId$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)I

    move-result p3

    invoke-direct {p0, p1, p3, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->trackMediaPlayerOnOpenApp(Landroid/content/Context;ILN5/b;)V

    iget-object p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->openAppConsumer:Ljava/util/function/Consumer;
    invoke-static {p3}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getOpenAppConsumer$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Ljava/util/function/Consumer;

    move-result-object p3

    if-eqz p3, :cond_3e

    new-instance p1, Lh8/u;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->this$0:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;

    # getter for: Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->viewPager2:Landroidx/viewpager2/widget/ViewPager2;
    invoke-static {p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;->access$getViewPager2$p(Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p0

    invoke-virtual {p2}, LN5/b;->i()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p2}, LN5/b;->l()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, v0, p2}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    :cond_3e
    invoke-virtual {p2}, LN5/b;->l()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->doStartApplicationWithPackageName(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_46
    :goto_46
    if-eqz p2, :cond_4c

    invoke-virtual {p2}, LN5/b;->l()Ljava/lang/String;

    move-result-object v0

    :cond_4c
    invoke-direct {p0, p1, v0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$MediaItemViewHolder;->doStartApplicationWithPackageName(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public abstract updateDisplayRatio(F)V
.end method

.method public abstract updateMusicMetaData(LN5/b;Z)V
.end method

.method public abstract updatePlayBackState(I)V
.end method
