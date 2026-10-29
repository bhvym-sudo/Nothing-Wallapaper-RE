.class public final Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;
.super Lb/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;->d:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lb/u;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;->d:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->w0(Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;)Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$b;->q()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_10

    return-void

    :cond_10
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;->d:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/J;->c1()Z

    move-result v0

    if-eqz v0, :cond_1d

    return-void

    :cond_1d
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$c;->d:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
