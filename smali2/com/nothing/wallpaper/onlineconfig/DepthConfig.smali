.class public final Lcom/nothing/wallpaper/onlineconfig/DepthConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final depthOverlapRate:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "depth_overlap_rate"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Float;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/onlineconfig/DepthConfig;Ljava/lang/Float;ILjava/lang/Object;)Lcom/nothing/wallpaper/onlineconfig/DepthConfig;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    :cond_6
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->copy(Ljava/lang/Float;)Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Float;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    return-object p0
.end method

.method public final copy(Ljava/lang/Float;)Lcom/nothing/wallpaper/onlineconfig/DepthConfig;
    .registers 2

    new-instance p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;-><init>(Ljava/lang/Float;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    iget-object p1, p1, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getDepthOverlapRate()Ljava/lang/Float;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

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

    iget-object p0, p0, Lcom/nothing/wallpaper/onlineconfig/DepthConfig;->depthOverlapRate:Ljava/lang/Float;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DepthConfig(depthOverlapRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
