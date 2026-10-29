.class public final LM5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:Z

.field private final k:J

.field private final l:Ljava/util/List;

.field private final m:Ljava/util/List;

.field private final n:Ljava/util/List;

.field private final o:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .registers 18

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryStatus"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "caseBatteryStatus"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LM5/a;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LM5/a;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, LM5/a;->c:Ljava/lang/String;

    .line 5
    iput p4, p0, LM5/a;->d:I

    .line 6
    iput-object p5, p0, LM5/a;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, LM5/a;->f:Ljava/lang/String;

    .line 8
    iput p7, p0, LM5/a;->g:I

    .line 9
    iput p8, p0, LM5/a;->h:I

    .line 10
    iput p9, p0, LM5/a;->i:I

    .line 11
    iput-boolean p10, p0, LM5/a;->j:Z

    .line 12
    iput-wide p11, p0, LM5/a;->k:J

    .line 13
    iput-object p13, p0, LM5/a;->l:Ljava/util/List;

    .line 14
    iput-object p14, p0, LM5/a;->m:Ljava/util/List;

    move-object/from16 p1, p15

    .line 15
    iput-object p1, p0, LM5/a;->n:Ljava/util/List;

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, LM5/a;->o:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V
    .registers 39

    move/from16 v0, p17

    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    const-wide/16 v1, 0x0

    move-wide v14, v1

    goto :goto_c

    :cond_a
    move-wide/from16 v14, p11

    :goto_c
    and-int/lit16 v1, v0, 0x800

    const/4 v2, 0x0

    if-eqz v1, :cond_14

    move-object/from16 v16, v2

    goto :goto_16

    :cond_14
    move-object/from16 v16, p13

    :goto_16
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1d

    move-object/from16 v17, v2

    goto :goto_1f

    :cond_1d
    move-object/from16 v17, p14

    :goto_1f
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_26

    move-object/from16 v18, v2

    goto :goto_28

    :cond_26
    move-object/from16 v18, p15

    :goto_28
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_45

    move-object/from16 v19, v2

    :goto_2e
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    goto :goto_48

    :cond_45
    move-object/from16 v19, p16

    goto :goto_2e

    .line 17
    :goto_48
    invoke-direct/range {v3 .. v19}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LM5/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LM5/a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final c()I
    .registers 1

    iget p0, p0, LM5/a;->g:I

    return p0
.end method

.method public final d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LM5/a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final e()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LM5/a;->n:Ljava/util/List;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LM5/a;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LM5/a;

    iget-object v1, p0, LM5/a;->a:Ljava/lang/String;

    iget-object v3, p1, LM5/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, LM5/a;->b:Ljava/lang/String;

    iget-object v3, p1, LM5/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, LM5/a;->c:Ljava/lang/String;

    iget-object v3, p1, LM5/a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, LM5/a;->d:I

    iget v3, p1, LM5/a;->d:I

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget-object v1, p0, LM5/a;->e:Ljava/lang/String;

    iget-object v3, p1, LM5/a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    return v2

    :cond_3f
    iget-object v1, p0, LM5/a;->f:Ljava/lang/String;

    iget-object v3, p1, LM5/a;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    return v2

    :cond_4a
    iget v1, p0, LM5/a;->g:I

    iget v3, p1, LM5/a;->g:I

    if-eq v1, v3, :cond_51

    return v2

    :cond_51
    iget v1, p0, LM5/a;->h:I

    iget v3, p1, LM5/a;->h:I

    if-eq v1, v3, :cond_58

    return v2

    :cond_58
    iget v1, p0, LM5/a;->i:I

    iget v3, p1, LM5/a;->i:I

    if-eq v1, v3, :cond_5f

    return v2

    :cond_5f
    iget-boolean v1, p0, LM5/a;->j:Z

    iget-boolean v3, p1, LM5/a;->j:Z

    if-eq v1, v3, :cond_66

    return v2

    :cond_66
    iget-wide v3, p0, LM5/a;->k:J

    iget-wide v5, p1, LM5/a;->k:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6f

    return v2

    :cond_6f
    iget-object v1, p0, LM5/a;->l:Ljava/util/List;

    iget-object v3, p1, LM5/a;->l:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7a

    return v2

    :cond_7a
    iget-object v1, p0, LM5/a;->m:Ljava/util/List;

    iget-object v3, p1, LM5/a;->m:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_85

    return v2

    :cond_85
    iget-object v1, p0, LM5/a;->n:Ljava/util/List;

    iget-object v3, p1, LM5/a;->n:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_90

    return v2

    :cond_90
    iget-object p0, p0, LM5/a;->o:Ljava/util/List;

    iget-object p1, p1, LM5/a;->o:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9b

    return v2

    :cond_9b
    return v0
.end method

.method public final f()J
    .registers 3

    iget-wide v0, p0, LM5/a;->k:J

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LM5/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LM5/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 4

    iget-object v0, p0, LM5/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM5/a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM5/a;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM5/a;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM5/a;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LM5/a;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LM5/a;->k:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->l:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_69

    move v1, v2

    goto :goto_6d

    :cond_69
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->m:Ljava/util/List;

    if-nez v1, :cond_76

    move v1, v2

    goto :goto_7a

    :cond_76
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM5/a;->n:Ljava/util/List;

    if-nez v1, :cond_83

    move v1, v2

    goto :goto_87

    :cond_83
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_87
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LM5/a;->o:Ljava/util/List;

    if-nez p0, :cond_8f

    goto :goto_93

    :cond_8f
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_93
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LM5/a;->o:Ljava/util/List;

    return-object p0
.end method

.method public final j()I
    .registers 1

    iget p0, p0, LM5/a;->h:I

    return p0
.end method

.method public final k()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LM5/a;->l:Ljava/util/List;

    return-object p0
.end method

.method public final l()I
    .registers 1

    iget p0, p0, LM5/a;->d:I

    return p0
.end method

.method public final m()I
    .registers 1

    iget p0, p0, LM5/a;->i:I

    return p0
.end method

.method public final n()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LM5/a;->m:Ljava/util/List;

    return-object p0
.end method

.method public final o()Z
    .registers 1

    iget-boolean p0, p0, LM5/a;->j:Z

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 18

    move-object/from16 v0, p0

    iget-object v1, v0, LM5/a;->a:Ljava/lang/String;

    iget-object v2, v0, LM5/a;->b:Ljava/lang/String;

    iget-object v3, v0, LM5/a;->c:Ljava/lang/String;

    iget v4, v0, LM5/a;->d:I

    iget-object v5, v0, LM5/a;->e:Ljava/lang/String;

    iget-object v6, v0, LM5/a;->f:Ljava/lang/String;

    iget v7, v0, LM5/a;->g:I

    iget v8, v0, LM5/a;->h:I

    iget v9, v0, LM5/a;->i:I

    iget-boolean v10, v0, LM5/a;->j:Z

    iget-wide v11, v0, LM5/a;->k:J

    iget-object v13, v0, LM5/a;->l:Ljava/util/List;

    iget-object v14, v0, LM5/a;->m:Ljava/util/List;

    iget-object v15, v0, LM5/a;->n:Ljava/util/List;

    iget-object v0, v0, LM5/a;->o:Ljava/util/List;

    move-object/from16 p0, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v15

    const-string v15, "CustomBattery(address="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mainBattery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", batteryStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", caseBatteryStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", caseBattery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftBattery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightBattery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", connectedTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", leftImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rightImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", caseImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", globalImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
