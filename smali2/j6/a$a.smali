.class final Lj6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:J

.field private c:J

.field private d:J

.field private e:J

.field private f:J

.field private g:J


# direct methods
.method public constructor <init>(IJJJJJJ)V
    .registers 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lj6/a$a;->a:I

    .line 3
    iput-wide p2, p0, Lj6/a$a;->b:J

    .line 4
    iput-wide p4, p0, Lj6/a$a;->c:J

    .line 5
    iput-wide p6, p0, Lj6/a$a;->d:J

    .line 6
    iput-wide p8, p0, Lj6/a$a;->e:J

    .line 7
    iput-wide p10, p0, Lj6/a$a;->f:J

    .line 8
    iput-wide p12, p0, Lj6/a$a;->g:J

    return-void
.end method

.method public synthetic constructor <init>(IJJJJJJILkotlin/jvm/internal/h;)V
    .registers 29

    and-int/lit8 v0, p14, 0x1

    if-eqz v0, :cond_5

    const/4 p1, 0x0

    :cond_5
    and-int/lit8 v0, p14, 0x2

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_d

    move-wide v3, v1

    goto :goto_e

    :cond_d
    move-wide v3, p2

    :goto_e
    and-int/lit8 v0, p14, 0x4

    if-eqz v0, :cond_14

    move-wide v5, v1

    goto :goto_16

    :cond_14
    move-wide/from16 v5, p4

    :goto_16
    and-int/lit8 v0, p14, 0x8

    if-eqz v0, :cond_1c

    move-wide v7, v1

    goto :goto_1e

    :cond_1c
    move-wide/from16 v7, p6

    :goto_1e
    and-int/lit8 v0, p14, 0x10

    if-eqz v0, :cond_24

    move-wide v9, v1

    goto :goto_26

    :cond_24
    move-wide/from16 v9, p8

    :goto_26
    and-int/lit8 v0, p14, 0x20

    if-eqz v0, :cond_2c

    move-wide v11, v1

    goto :goto_2e

    :cond_2c
    move-wide/from16 v11, p10

    :goto_2e
    and-int/lit8 v0, p14, 0x40

    if-eqz v0, :cond_42

    move-wide/from16 p14, v1

    :goto_34
    move-object p2, p0

    move/from16 p3, p1

    move-wide/from16 p4, v3

    move-wide/from16 p6, v5

    move-wide/from16 p8, v7

    move-wide/from16 p10, v9

    move-wide/from16 p12, v11

    goto :goto_45

    :cond_42
    move-wide/from16 p14, p12

    goto :goto_34

    .line 9
    :goto_45
    invoke-direct/range {p2 .. p15}, Lj6/a$a;-><init>(IJJJJJJ)V

    return-void
.end method


# virtual methods
.method public final a(III)V
    .registers 10

    iget v0, p0, Lj6/a$a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj6/a$a;->a:I

    iget-wide v0, p0, Lj6/a$a;->b:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj6/a$a;->b:J

    iget-wide v0, p0, Lj6/a$a;->c:J

    int-to-long p1, p2

    add-long/2addr v0, p1

    iput-wide v0, p0, Lj6/a$a;->c:J

    iget-wide v0, p0, Lj6/a$a;->d:J

    int-to-long v4, p3

    add-long/2addr v0, v4

    iput-wide v0, p0, Lj6/a$a;->d:J

    iget-wide v0, p0, Lj6/a$a;->e:J

    mul-long/2addr v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj6/a$a;->e:J

    iget-wide v0, p0, Lj6/a$a;->f:J

    mul-long/2addr p1, p1

    add-long/2addr v0, p1

    iput-wide v0, p0, Lj6/a$a;->f:J

    iget-wide p1, p0, Lj6/a$a;->g:J

    mul-long/2addr v4, v4

    add-long/2addr p1, v4

    iput-wide p1, p0, Lj6/a$a;->g:J

    return-void
.end method

.method public final b()I
    .registers 1

    iget p0, p0, Lj6/a$a;->a:I

    return p0
.end method

.method public final c()J
    .registers 3

    iget-wide v0, p0, Lj6/a$a;->c:J

    return-wide v0
.end method

.method public final d()J
    .registers 3

    iget-wide v0, p0, Lj6/a$a;->f:J

    return-wide v0
.end method

.method public final e()J
    .registers 3

    iget-wide v0, p0, Lj6/a$a;->d:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lj6/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lj6/a$a;

    iget v1, p0, Lj6/a$a;->a:I

    iget v3, p1, Lj6/a$a;->a:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lj6/a$a;->b:J

    iget-wide v5, p1, Lj6/a$a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget-wide v3, p0, Lj6/a$a;->c:J

    iget-wide v5, p1, Lj6/a$a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_25

    return v2

    :cond_25
    iget-wide v3, p0, Lj6/a$a;->d:J

    iget-wide v5, p1, Lj6/a$a;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2e

    return v2

    :cond_2e
    iget-wide v3, p0, Lj6/a$a;->e:J

    iget-wide v5, p1, Lj6/a$a;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_37

    return v2

    :cond_37
    iget-wide v3, p0, Lj6/a$a;->f:J

    iget-wide v5, p1, Lj6/a$a;->f:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_40

    return v2

    :cond_40
    iget-wide v3, p0, Lj6/a$a;->g:J

    iget-wide p0, p1, Lj6/a$a;->g:J

    cmp-long p0, v3, p0

    if-eqz p0, :cond_49

    return v2

    :cond_49
    return v0
.end method

.method public final f()J
    .registers 3

    iget-wide v0, p0, Lj6/a$a;->g:J

    return-wide v0
.end method

.method public final g()J
    .registers 3

    iget-wide v0, p0, Lj6/a$a;->b:J

    return-wide v0
.end method

.method public final h()J
    .registers 3

    iget-wide v0, p0, Lj6/a$a;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .registers 4

    iget v0, p0, Lj6/a$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lj6/a$a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lj6/a$a;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lj6/a$a;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lj6/a$a;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lj6/a$a;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lj6/a$a;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 15

    iget v0, p0, Lj6/a$a;->a:I

    iget-wide v1, p0, Lj6/a$a;->b:J

    iget-wide v3, p0, Lj6/a$a;->c:J

    iget-wide v5, p0, Lj6/a$a;->d:J

    iget-wide v7, p0, Lj6/a$a;->e:J

    iget-wide v9, p0, Lj6/a$a;->f:J

    iget-wide v11, p0, Lj6/a$a;->g:J

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "ColorStats(count="

    invoke-virtual {p0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sumY="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sumU="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sumV="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sumYY="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sumUU="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sumVV="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
