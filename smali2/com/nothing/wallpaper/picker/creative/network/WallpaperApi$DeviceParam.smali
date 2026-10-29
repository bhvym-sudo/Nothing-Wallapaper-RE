.class public final Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DeviceParam"
.end annotation


# instance fields
.field private final color:Ljava/lang/String;

.field private final language:Ljava/lang/String;

.field private final model:Ljava/lang/String;

.field private final version:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .registers 6

    const-string v0, "language"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    iput p2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_c

    iget p2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    :cond_c
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_12

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    :cond_12
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_18

    iget-object p4, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    :cond_18
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    return-object p0
.end method

.method public final component2()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    return p0
.end method

.method public final component3()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    return-object p0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;
    .registers 5

    const-string p0, "language"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "model"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "color"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    iget v3, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_34

    return v2

    :cond_34
    return v0
.end method

.method public final getColor()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    return-object p0
.end method

.method public final getLanguage()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    return-object p0
.end method

.method public final getModel()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    return-object p0
.end method

.method public final getVersion()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    return p0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->language:Ljava/lang/String;

    iget v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->version:I

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->model:Ljava/lang/String;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;->color:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DeviceParam(language="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
