.class public final synthetic Lt7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Landroid/graphics/Bitmap;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/f;->q:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lt7/f;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lt7/f;->q:Landroid/graphics/Bitmap;

    iget-object p0, p0, Lt7/f;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    check-cast p1, Landroid/widget/ImageView;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->c(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
