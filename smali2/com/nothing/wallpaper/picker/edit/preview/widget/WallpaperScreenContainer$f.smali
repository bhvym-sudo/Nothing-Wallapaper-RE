.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->J(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$f;->a:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$f;->a:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->o(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    return-void
.end method
