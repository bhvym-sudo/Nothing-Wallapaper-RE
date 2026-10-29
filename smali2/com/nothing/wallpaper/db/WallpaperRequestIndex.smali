.class public final Lcom/nothing/wallpaper/db/WallpaperRequestIndex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private _Id:I

.field private final indexArray:Ljava/lang/String;

.field private final requestIndex:I

.field private final stylePromptId:J

.field private final subjectPromptId:J

.field private final totalCount:I

.field private final version:I


# direct methods
.method public constructor <init>(IJJLjava/lang/String;III)V
    .registers 11

    const-string v0, "indexArray"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    iput-wide p2, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    iput-wide p4, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    iput-object p6, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    iput p7, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    iput p8, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    iput p9, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/wallpaper/db/WallpaperRequestIndex;IJJLjava/lang/String;IIIILjava/lang/Object;)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;
    .registers 12

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_6

    iget p1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    :cond_6
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_c

    iget-wide p2, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    :cond_c
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_12

    iget-wide p4, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    :cond_12
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_18

    iget-object p6, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    :cond_18
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_1e

    iget p7, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    :cond_1e
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_24

    iget p8, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    :cond_24
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_2a

    iget p9, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    :cond_2a
    move p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->copy(IJJLjava/lang/String;III)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    return p0
.end method

.method public final component2()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    return-wide v0
.end method

.method public final component3()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    return-object p0
.end method

.method public final component5()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    return p0
.end method

.method public final component6()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    return p0
.end method

.method public final component7()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    return p0
.end method

.method public final copy(IJJLjava/lang/String;III)Lcom/nothing/wallpaper/db/WallpaperRequestIndex;
    .registers 20

    const-string p0, "indexArray"

    move-object/from16 v6, p6

    invoke-static {v6, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;-><init>(IJJLjava/lang/String;III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;

    iget v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    iget v3, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget-wide v3, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    iget-wide v5, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    iget-object v3, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    iget v3, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    iget v3, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    if-eq v1, v3, :cond_3e

    return v2

    :cond_3e
    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    iget p1, p1, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    if-eq p0, p1, :cond_45

    return v2

    :cond_45
    return v0
.end method

.method public final getIndexArray()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    return-object p0
.end method

.method public final getRequestIndex()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    return p0
.end method

.method public final getStylePromptId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    return-wide v0
.end method

.method public final getSubjectPromptId()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    return-wide v0
.end method

.method public final getTotalCount()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    return p0
.end method

.method public final getVersion()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    return p0
.end method

.method public final get_Id()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    return p0
.end method

.method public hashCode()I
    .registers 4

    iget v0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final set_Id(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 11

    iget v0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->_Id:I

    iget-wide v1, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->subjectPromptId:J

    iget-wide v3, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->stylePromptId:J

    iget-object v5, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->indexArray:Ljava/lang/String;

    iget v6, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->totalCount:I

    iget v7, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->requestIndex:I

    iget p0, p0, Lcom/nothing/wallpaper/db/WallpaperRequestIndex;->version:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "WallpaperRequestIndex(_Id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", subjectPromptId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", stylePromptId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", indexArray="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", totalCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", requestIndex="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
