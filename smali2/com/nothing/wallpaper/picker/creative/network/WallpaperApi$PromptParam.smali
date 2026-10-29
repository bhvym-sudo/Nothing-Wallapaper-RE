.class public final Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;
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
    name = "PromptParam"
.end annotation


# instance fields
.field private final category:Ljava/lang/String;

.field private final promptWordEn:Ljava/lang/String;

.field private final promptWordId:J


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .registers 6

    const-string v0, "category"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promptWordEn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_c

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    :cond_c
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_12

    iget-object p4, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    :cond_12
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->copy(JLjava/lang/String;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    return-object p0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;
    .registers 5

    const-string p0, "category"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "promptWordEn"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2b

    return v2

    :cond_2b
    return v0
.end method

.method public final getCategory()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    return-object p0
.end method

.method public final getPromptWordEn()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    return-object p0
.end method

.method public final getPromptWordId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    return-wide v0
.end method

.method public hashCode()I
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordId:J

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->category:Ljava/lang/String;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;->promptWordEn:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PromptParam(promptWordId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", category="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", promptWordEn="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
