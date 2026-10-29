.class public final Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "depth_config"
    .end annotation
.end field

.field private final version:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/nothing/wallpaper/onlineconfig/DepthConfig;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;Ljava/lang/Integer;Lcom/nothing/wallpaper/onlineconfig/DepthConfig;ILjava/lang/Object;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_c

    iget-object p2, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    :cond_c
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->copy(Ljava/lang/Integer;Lcom/nothing/wallpaper/onlineconfig/DepthConfig;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    return-object p0
.end method

.method public final component2()Lcom/nothing/wallpaper/onlineconfig/DepthConfig;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    return-object p0
.end method

.method public final copy(Ljava/lang/Integer;Lcom/nothing/wallpaper/onlineconfig/DepthConfig;)Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;
    .registers 3

    new-instance p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;-><init>(Ljava/lang/Integer;Lcom/nothing/wallpaper/onlineconfig/DepthConfig;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;

    iget-object v1, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    iget-object p1, p1, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    return v2

    :cond_22
    return v0
.end method

.method public final getDepthConfig()Lcom/nothing/wallpaper/onlineconfig/DepthConfig;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    return-object p0
.end method

.method public final getVersion()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_b

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_b
    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    if-nez p0, :cond_12

    goto :goto_16

    :cond_12
    invoke-virtual {p0}, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->version:Ljava/lang/Integer;

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/WallpaperOnlineConfig;->depthConfig:Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WallpaperOnlineConfig(version="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", depthConfig="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
