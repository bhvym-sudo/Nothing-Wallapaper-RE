.class public final synthetic Lt7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lr6/g;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

.field public final synthetic s:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;


# direct methods
.method public synthetic constructor <init>(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/g;->q:Lr6/g;

    iput-object p2, p0, Lt7/g;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    iput-object p3, p0, Lt7/g;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lt7/g;->q:Lr6/g;

    iget-object v1, p0, Lt7/g;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    iget-object p0, p0, Lt7/g;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    check-cast p1, Landroid/widget/ImageView;

    invoke-static {v0, v1, p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->b(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
