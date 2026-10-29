.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->onFinishInflate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Landroid/view/View;

.field final synthetic r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

.field final synthetic s:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/view/View;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->q:Landroid/view/View;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->s:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->k(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/graphics/PointF;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->s:Landroid/view/View;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->s:Landroid/view/View;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {v1, p0}, LH6/d;->b(Landroid/view/View;Landroid/view/View;)Landroid/graphics/PointF;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    return-void
.end method
