.class public final Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;
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
    name = "WallpaperCountParam"
.end annotation


# instance fields
.field private final styleId:J

.field private final subjectId:J


# direct methods
.method public constructor <init>(JJ)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    iput-wide p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;JJILjava/lang/Object;)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    iget-wide p1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    :cond_6
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_c

    iget-wide p3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    :cond_c
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->copy(JJ)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    return-wide v0
.end method

.method public final component2()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    return-wide v0
.end method

.method public final copy(JJ)Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;
    .registers 5

    new-instance p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;-><init>(JJ)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;

    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    iget-wide p0, p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    cmp-long p0, v3, p0

    if-eqz p0, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public final getStyleId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    return-wide v0
.end method

.method public final getSubjectId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    return-wide v0
.end method

.method public hashCode()I
    .registers 4

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget-wide v0, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->subjectId:J

    iget-wide v2, p0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;->styleId:J

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WallpaperCountParam(subjectId="

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", styleId="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
