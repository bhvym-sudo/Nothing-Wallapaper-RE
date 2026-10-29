.class public interface abstract Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;,
        Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;,
        Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;,
        Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;
    }
.end annotation


# virtual methods
.method public abstract a(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;)Lg9/d;
    .param p1    # Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;
        .annotation runtime Li9/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;",
            ")",
            "Lg9/d<",
            "Lcom/nothing/wallpaper/picker/creative/network/ResponseData<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Li9/o;
        value = "/wallpaper/aiApi/v1/getClue"
    .end annotation
.end method

.method public abstract b(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;)Lg9/d;
    .param p1    # Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;
        .annotation runtime Li9/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;",
            ")",
            "Lg9/d<",
            "Lcom/nothing/wallpaper/picker/creative/network/ResponseData<",
            "Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Li9/o;
        value = "/wallpaper/aiApi/v2/getSettings"
    .end annotation
.end method

.method public abstract c(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;)Lg9/d;
    .param p1    # Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;
        .annotation runtime Li9/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;",
            ")",
            "Lg9/d<",
            "Lcom/nothing/wallpaper/picker/creative/network/ResponseData<",
            "Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Li9/o;
        value = "/wallpaper/aiApi/v2/getWallpapers"
    .end annotation
.end method
