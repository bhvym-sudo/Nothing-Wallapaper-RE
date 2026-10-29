.class public final Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final cellX:I

.field private final cellY:I

.field private final id:I

.field private final seq:J

.field private final spanX:I

.field private final spanY:I


# direct methods
.method public constructor <init>(IIIIIJ)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    iput p2, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    iput p3, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    iput p4, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    iput p5, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    iput-wide p6, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;IIIIIJILjava/lang/Object;)Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;
    .registers 10

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_6

    iget p1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    :cond_6
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_c

    iget p2, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    :cond_c
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_12

    iget p3, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    :cond_12
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_18

    iget p4, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    :cond_18
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1e

    iget p5, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    :cond_1e
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_24

    iget-wide p6, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    :cond_24
    move-wide p8, p6

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->copy(IIIIIJ)Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    return p0
.end method

.method public final component2()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    return p0
.end method

.method public final component3()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    return p0
.end method

.method public final component4()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    return p0
.end method

.method public final component5()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    return p0
.end method

.method public final component6()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    return-wide v0
.end method

.method public final copy(IIIIIJ)Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;
    .registers 8

    new-instance p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-direct/range {p0 .. p7}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;-><init>(IIIIIJ)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    iget v3, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    iget v3, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    iget v3, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    iget v3, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    iget v3, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget-wide v3, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    iget-wide p0, p1, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    cmp-long p0, v3, p0

    if-eqz p0, :cond_38

    return v2

    :cond_38
    return v0
.end method

.method public final getCellX()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    return p0
.end method

.method public final getCellY()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    return p0
.end method

.method public final getId()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    return p0
.end method

.method public final getSeq()J
    .registers 3

    iget-wide v0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    return-wide v0
.end method

.method public final getSpanX()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    return p0
.end method

.method public final getSpanY()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    return p0
.end method

.method public hashCode()I
    .registers 4

    iget v0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 9

    iget v0, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->id:I

    iget v1, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellX:I

    iget v2, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->cellY:I

    iget v3, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanX:I

    iget v4, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->spanY:I

    iget-wide v5, p0, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->seq:J

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CardWidgetSimpleInfo(id="

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", cellX="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", cellY="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", spanX="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", spanY="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", seq="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
