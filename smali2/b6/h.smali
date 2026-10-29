.class public abstract Lb6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(D)I
    .registers 2

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    invoke-static {p0, p1}, Lb6/h;->c(J)I

    move-result p0

    return p0
.end method

.method public static b(F)I
    .registers 1

    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    return p0
.end method

.method public static c(J)I
    .registers 4

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static d(Z)I
    .registers 1

    if-eqz p0, :cond_5

    const/16 p0, 0x4cf

    return p0

    :cond_5
    const/16 p0, 0x4d5

    return p0
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-eqz p0, :cond_bf

    if-nez p1, :cond_b

    goto/16 :goto_bf

    :cond_b
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    return v0

    :cond_12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_bf

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_bf

    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_37

    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_37

    check-cast p0, [Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_37
    instance-of v0, p0, [Z

    if-eqz v0, :cond_48

    instance-of v0, p1, [Z

    if-eqz v0, :cond_48

    check-cast p0, [Z

    check-cast p1, [Z

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p0

    return p0

    :cond_48
    instance-of v0, p0, [B

    if-eqz v0, :cond_59

    instance-of v0, p1, [B

    if-eqz v0, :cond_59

    check-cast p0, [B

    check-cast p1, [B

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0

    :cond_59
    instance-of v0, p0, [C

    if-eqz v0, :cond_6a

    instance-of v0, p1, [C

    if-eqz v0, :cond_6a

    check-cast p0, [C

    check-cast p1, [C

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p0

    return p0

    :cond_6a
    instance-of v0, p0, [D

    if-eqz v0, :cond_7b

    instance-of v0, p1, [D

    if-eqz v0, :cond_7b

    check-cast p0, [D

    check-cast p1, [D

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([D[D)Z

    move-result p0

    return p0

    :cond_7b
    instance-of v0, p0, [F

    if-eqz v0, :cond_8c

    instance-of v0, p1, [F

    if-eqz v0, :cond_8c

    check-cast p0, [F

    check-cast p1, [F

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([F[F)Z

    move-result p0

    return p0

    :cond_8c
    instance-of v0, p0, [I

    if-eqz v0, :cond_9d

    instance-of v0, p1, [I

    if-eqz v0, :cond_9d

    check-cast p0, [I

    check-cast p1, [I

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p0

    return p0

    :cond_9d
    instance-of v0, p0, [J

    if-eqz v0, :cond_ae

    instance-of v0, p1, [J

    if-eqz v0, :cond_ae

    check-cast p0, [J

    check-cast p1, [J

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p0

    return p0

    :cond_ae
    instance-of v0, p0, [S

    if-eqz v0, :cond_bf

    instance-of v0, p1, [S

    if-eqz v0, :cond_bf

    check-cast p0, [S

    check-cast p1, [S

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([S[S)Z

    move-result p0

    return p0

    :cond_bf
    :goto_bf
    return v1
.end method

.method public static f(Ljava/lang/Object;)I
    .registers 2

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return p0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_71

    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_19

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Lb6/h;->m([Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_19
    instance-of v0, p0, [Z

    if-eqz v0, :cond_24

    check-cast p0, [Z

    invoke-static {p0}, Lb6/h;->o([Z)I

    move-result p0

    return p0

    :cond_24
    instance-of v0, p0, [B

    if-eqz v0, :cond_2f

    check-cast p0, [B

    invoke-static {p0}, Lb6/h;->g([B)I

    move-result p0

    return p0

    :cond_2f
    instance-of v0, p0, [C

    if-eqz v0, :cond_3a

    check-cast p0, [C

    invoke-static {p0}, Lb6/h;->h([C)I

    move-result p0

    return p0

    :cond_3a
    instance-of v0, p0, [D

    if-eqz v0, :cond_45

    check-cast p0, [D

    invoke-static {p0}, Lb6/h;->i([D)I

    move-result p0

    return p0

    :cond_45
    instance-of v0, p0, [F

    if-eqz v0, :cond_50

    check-cast p0, [F

    invoke-static {p0}, Lb6/h;->j([F)I

    move-result p0

    return p0

    :cond_50
    instance-of v0, p0, [I

    if-eqz v0, :cond_5b

    check-cast p0, [I

    invoke-static {p0}, Lb6/h;->k([I)I

    move-result p0

    return p0

    :cond_5b
    instance-of v0, p0, [J

    if-eqz v0, :cond_66

    check-cast p0, [J

    invoke-static {p0}, Lb6/h;->l([J)I

    move-result p0

    return p0

    :cond_66
    instance-of v0, p0, [S

    if-eqz v0, :cond_71

    check-cast p0, [S

    invoke-static {p0}, Lb6/h;->n([S)I

    move-result p0

    return p0

    :cond_71
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public static g([B)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_10

    aget-byte v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_10
    return v2
.end method

.method public static h([C)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_10

    aget-char v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_10
    return v2
.end method

.method public static i([D)I
    .registers 6

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_14

    aget-wide v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    invoke-static {v3, v4}, Lb6/h;->a(D)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_14
    return v2
.end method

.method public static j([F)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_14

    aget v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    invoke-static {v3}, Lb6/h;->b(F)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_14
    return v2
.end method

.method public static k([I)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_10

    aget v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_10
    return v2
.end method

.method public static l([J)I
    .registers 6

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_14

    aget-wide v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    invoke-static {v3, v4}, Lb6/h;->c(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_14
    return v2
.end method

.method public static m([Ljava/lang/Object;)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_14

    aget-object v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    invoke-static {v3}, Lb6/h;->f(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_14
    return v2
.end method

.method public static n([S)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_10

    aget-short v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_10
    return v2
.end method

.method public static o([Z)I
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return v0

    :cond_4
    array-length v1, p0

    const/4 v2, 0x7

    :goto_6
    if-ge v0, v1, :cond_14

    aget-boolean v3, p0, v0

    mul-int/lit8 v2, v2, 0x1f

    invoke-static {v3}, Lb6/h;->d(Z)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_14
    return v2
.end method
