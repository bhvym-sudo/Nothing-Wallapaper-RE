.class public final LY5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:I


# direct methods
.method public constructor <init>(JLjava/lang/String;IIIILjava/lang/String;I)V
    .registers 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, LY5/a;->a:J

    .line 3
    iput-object p3, p0, LY5/a;->b:Ljava/lang/String;

    .line 4
    iput p4, p0, LY5/a;->c:I

    .line 5
    iput p5, p0, LY5/a;->d:I

    .line 6
    iput p6, p0, LY5/a;->e:I

    .line 7
    iput p7, p0, LY5/a;->f:I

    .line 8
    iput-object p8, p0, LY5/a;->g:Ljava/lang/String;

    .line 9
    iput p9, p0, LY5/a;->h:I

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;IIIILjava/lang/String;IILkotlin/jvm/internal/h;)V
    .registers 22

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_8

    const-wide/16 p1, 0x0

    :cond_8
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_10

    move-object v3, p2

    goto :goto_11

    :cond_10
    move-object v3, p3

    :goto_11
    and-int/lit8 p1, v0, 0x4

    const/4 p3, 0x0

    if-eqz p1, :cond_18

    move v4, p3

    goto :goto_19

    :cond_18
    move v4, p4

    :goto_19
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_1f

    move v5, p3

    goto :goto_20

    :cond_1f
    move v5, p5

    :goto_20
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_26

    move v6, p3

    goto :goto_28

    :cond_26
    move/from16 v6, p6

    :goto_28
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_30

    const/high16 p1, -0x80000000

    move v7, p1

    goto :goto_32

    :cond_30
    move/from16 v7, p7

    :goto_32
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_38

    move-object v8, p2

    goto :goto_3a

    :cond_38
    move-object/from16 v8, p8

    :goto_3a
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_41

    move v9, p3

    :goto_3f
    move-object v0, p0

    goto :goto_44

    :cond_41
    move/from16 v9, p9

    goto :goto_3f

    .line 10
    :goto_44
    invoke-direct/range {v0 .. v9}, LY5/a;-><init>(JLjava/lang/String;IIIILjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()I
    .registers 1

    iget p0, p0, LY5/a;->c:I

    return p0
.end method

.method public final b()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LY5/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final c()I
    .registers 1

    iget p0, p0, LY5/a;->f:I

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LY5/a;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LY5/a;

    iget-wide v3, p0, LY5/a;->a:J

    iget-wide v5, p1, LY5/a;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, LY5/a;->b:Ljava/lang/String;

    iget-object v3, p1, LY5/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget v1, p0, LY5/a;->c:I

    iget v3, p1, LY5/a;->c:I

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget v1, p0, LY5/a;->d:I

    iget v3, p1, LY5/a;->d:I

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget v1, p0, LY5/a;->e:I

    iget v3, p1, LY5/a;->e:I

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget v1, p0, LY5/a;->f:I

    iget v3, p1, LY5/a;->f:I

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget-object v1, p0, LY5/a;->g:Ljava/lang/String;

    iget-object v3, p1, LY5/a;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    return v2

    :cond_47
    iget p0, p0, LY5/a;->h:I

    iget p1, p1, LY5/a;->h:I

    if-eq p0, p1, :cond_4e

    return v2

    :cond_4e
    return v0
.end method

.method public hashCode()I
    .registers 4

    iget-wide v0, p0, LY5/a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LY5/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_13

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY5/a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY5/a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY5/a;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY5/a;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LY5/a;->g:Ljava/lang/String;

    if-nez v1, :cond_3f

    goto :goto_43

    :cond_3f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_43
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, LY5/a;->h:I

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WeatherData(lastUpdateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LY5/a;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", phrase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", iconType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY5/a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lowTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY5/a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", highTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY5/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", temp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY5/a;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", locationKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY5/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", locationType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LY5/a;->h:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
