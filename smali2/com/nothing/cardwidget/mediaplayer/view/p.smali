.class public final synthetic Lcom/nothing/cardwidget/mediaplayer/view/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/graphics/drawable/Drawable;

.field public final synthetic r:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/Drawable;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/view/p;->q:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/nothing/cardwidget/mediaplayer/view/p;->r:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    iput p3, p0, Lcom/nothing/cardwidget/mediaplayer/view/p;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/mediaplayer/view/p;->q:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/nothing/cardwidget/mediaplayer/view/p;->r:Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;

    iget p0, p0, Lcom/nothing/cardwidget/mediaplayer/view/p;->s:I

    invoke-static {v0, v1, p0}, Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;->h(Landroid/graphics/drawable/Drawable;Lcom/nothing/cardwidget/mediaplayer/view/ViewPagerAdapter$FirstPageViewHolder;I)V

    return-void
.end method
