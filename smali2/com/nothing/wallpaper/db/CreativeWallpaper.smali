.class public final Lcom/nothing/wallpaper/db/CreativeWallpaper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final createTime:J

.field private final filePath:Ljava/lang/String;

.field private final imageId:J

.field private final imageUrl:Ljava/lang/String;

.field private final styleEn:Ljava/lang/String;

.field private final styleLoc:Ljava/lang/String;

.field private final subjectEn:Ljava/lang/String;

.field private final subjectLoc:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .registers 12

    const-string v0, "imageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filePath"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subjectEn"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "styleEn"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    iput-object p3, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    iput-object p5, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    iput-object p6, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    iput-object p7, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    iput-object p8, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    iput-wide p9, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/db/CreativeWallpaper;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/nothing/wallpaper/db/CreativeWallpaper;
    .registers 24

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_8

    iget-wide p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    :cond_8
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_f

    iget-object p3, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    :cond_f
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_18

    iget-object p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    move-object v4, p1

    goto :goto_19

    :cond_18
    move-object v4, p4

    :goto_19
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_21

    iget-object p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    move-object v5, p1

    goto :goto_23

    :cond_21
    move-object/from16 v5, p5

    :goto_23
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_2b

    iget-object p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    move-object v6, p1

    goto :goto_2d

    :cond_2b
    move-object/from16 v6, p6

    :goto_2d
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_35

    iget-object p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    move-object v7, p1

    goto :goto_37

    :cond_35
    move-object/from16 v7, p7

    :goto_37
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_3f

    iget-object p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    move-object v8, p1

    goto :goto_41

    :cond_3f
    move-object/from16 v8, p8

    :goto_41
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_4a

    iget-wide p1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    move-wide v9, p1

    :goto_48
    move-object v0, p0

    goto :goto_4d

    :cond_4a
    move-wide/from16 v9, p9

    goto :goto_48

    :goto_4d
    invoke-virtual/range {v0 .. v10}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    return-object p0
.end method

.method public final component6()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    return-object p0
.end method

.method public final component8()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    return-wide v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/nothing/wallpaper/db/CreativeWallpaper;
    .registers 22

    const-string p0, "imageUrl"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "filePath"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "subjectEn"

    move-object/from16 v5, p5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "styleEn"

    move-object/from16 v7, p7

    invoke-static {v7, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v6, p6

    move-object/from16 v8, p8

    move-wide/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lcom/nothing/wallpaper/db/CreativeWallpaper;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    iget-wide v3, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    return v2

    :cond_36
    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    return v2

    :cond_41
    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    return v2

    :cond_4c
    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_57

    return v2

    :cond_57
    iget-wide v3, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    iget-wide p0, p1, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    cmp-long p0, v3, p0

    if-eqz p0, :cond_60

    return v2

    :cond_60
    return v0
.end method

.method public final getCreateTime()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    return-wide v0
.end method

.method public final getFilePath()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    return-object p0
.end method

.method public final getImageId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    return-wide v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final getStyleEn()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    return-object p0
.end method

.method public final getStyleLoc()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    return-object p0
.end method

.method public final getSubjectEn()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    return-object p0
.end method

.method public final getSubjectLoc()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 4

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_2a

    move v1, v2

    goto :goto_2e

    :cond_2a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    if-nez v1, :cond_3f

    goto :goto_43

    :cond_3f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_43
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 12

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageId:J

    iget-object v2, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->imageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->filePath:Ljava/lang/String;

    iget-object v4, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectEn:Ljava/lang/String;

    iget-object v5, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->subjectLoc:Ljava/lang/String;

    iget-object v6, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleEn:Ljava/lang/String;

    iget-object v7, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->styleLoc:Ljava/lang/String;

    iget-wide v8, p0, Lcom/nothing/wallpaper/db/CreativeWallpaper;->createTime:J

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "CreativeWallpaper(imageId="

    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", imageUrl="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", filePath="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subjectEn="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subjectLoc="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", styleEn="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", styleLoc="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createTime="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
