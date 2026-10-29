.class public final Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final wallpapers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;Ljava/util/List;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    :cond_6
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->copy(Ljava/util/List;)Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    return-object p0
.end method

.method public final copy(Ljava/util/List;)Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;",
            ">;)",
            "Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;"
        }
    .end annotation

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getWallpapers()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;->wallpapers:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WallpaperResponse(wallpapers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
