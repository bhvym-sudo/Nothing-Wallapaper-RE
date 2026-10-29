.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Landroid/widget/ImageView;

.field public final synthetic r:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/r;->q:Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/r;->r:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/r;->q:Landroid/widget/ImageView;

    iget-object p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/r;->r:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p0, p1}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;->g(Landroid/widget/ImageView;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;Landroid/graphics/drawable/Drawable;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
