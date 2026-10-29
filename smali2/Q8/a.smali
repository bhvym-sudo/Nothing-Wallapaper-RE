.class public abstract LQ8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/lang/String;)Z
    .registers 11

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_30

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v3, 0x1f

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v3

    const/4 v9, 0x1

    if-lez v3, :cond_2f

    const/16 v3, 0x7f

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v3

    if-ltz v3, :cond_1e

    goto :goto_2f

    :cond_1e
    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v3, " #%/:?@[\\]"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2c

    return v9

    :cond_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_2f
    :goto_2f
    return v9

    :cond_30
    return v1
.end method

.method private static final b(Ljava/lang/String;II[BI)Z
    .registers 12

    move v0, p4

    :goto_1
    const/4 v1, 0x0

    if-ge p1, p2, :cond_4c

    array-length v2, p3

    if-ne v0, v2, :cond_8

    return v1

    :cond_8
    if-eq v0, p4, :cond_15

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2e

    if-eq v2, v3, :cond_13

    return v1

    :cond_13
    add-int/lit8 p1, p1, 0x1

    :cond_15
    move v2, p1

    move v3, v1

    :goto_17
    if-ge v2, p2, :cond_3f

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v6

    if-ltz v6, :cond_3f

    const/16 v6, 0x39

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v6

    if-lez v6, :cond_2e

    goto :goto_3f

    :cond_2e
    if-nez v3, :cond_33

    if-eq p1, v2, :cond_33

    return v1

    :cond_33
    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v4

    sub-int/2addr v3, v5

    const/16 v4, 0xff

    if-le v3, v4, :cond_3c

    return v1

    :cond_3c
    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_3f
    :goto_3f
    sub-int p1, v2, p1

    if-nez p1, :cond_44

    return v1

    :cond_44
    add-int/lit8 p1, v0, 0x1

    int-to-byte v1, v3

    aput-byte v1, p3, v0

    move v0, p1

    move p1, v2

    goto :goto_1

    :cond_4c
    add-int/lit8 p4, p4, 0x4

    if-ne v0, p4, :cond_52

    const/4 p0, 0x1

    return p0

    :cond_52
    return v1
.end method

.method private static final c(Ljava/lang/String;II)Ljava/net/InetAddress;
    .registers 19

    move/from16 v6, p2

    const/16 v7, 0x10

    new-array v8, v7, [B

    const/4 v9, 0x0

    const/4 v10, -0x1

    move/from16 v2, p1

    move v11, v9

    move v12, v10

    move v13, v12

    :goto_d
    const/4 v14, 0x0

    if-ge v2, v6, :cond_91

    if-ne v11, v7, :cond_13

    return-object v14

    :cond_13
    add-int/lit8 v15, v2, 0x2

    if-gt v15, v6, :cond_33

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "::"

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, LE8/i;->L(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    if-eq v12, v10, :cond_27

    return-object v14

    :cond_27
    add-int/lit8 v11, v11, 0x2

    if-ne v15, v6, :cond_2e

    move v12, v11

    goto/16 :goto_91

    :cond_2e
    move-object/from16 v0, p0

    move v12, v11

    move v13, v15

    goto :goto_62

    :cond_33
    if-eqz v11, :cond_44

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, ":"

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, LE8/i;->L(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_48

    add-int/lit8 v2, v2, 0x1

    :cond_44
    move-object/from16 v0, p0

    move v13, v2

    goto :goto_62

    :cond_48
    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "."

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, LE8/i;->L(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_61

    add-int/lit8 v1, v11, -0x2

    invoke-static {v0, v13, v6, v8, v1}, LQ8/a;->b(Ljava/lang/String;II[BI)Z

    move-result v0

    if-nez v0, :cond_5e

    return-object v14

    :cond_5e
    add-int/lit8 v11, v11, 0x2

    goto :goto_91

    :cond_61
    return-object v14

    :goto_62
    move v1, v9

    move v2, v13

    :goto_64
    if-ge v2, v6, :cond_76

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, LQ8/d;->H(C)I

    move-result v3

    if-eq v3, v10, :cond_76

    shl-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_64

    :cond_76
    sub-int v3, v2, v13

    if-eqz v3, :cond_90

    const/4 v4, 0x4

    if-le v3, v4, :cond_7e

    goto :goto_90

    :cond_7e
    add-int/lit8 v3, v11, 0x1

    ushr-int/lit8 v4, v1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v8, v11

    add-int/lit8 v11, v11, 0x2

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v8, v3

    goto/16 :goto_d

    :cond_90
    :goto_90
    return-object v14

    :cond_91
    :goto_91
    if-eq v11, v7, :cond_a2

    if-ne v12, v10, :cond_96

    return-object v14

    :cond_96
    sub-int v0, v11, v12

    rsub-int/lit8 v1, v0, 0x10

    invoke-static {v8, v12, v8, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v7, v11

    add-int/2addr v7, v12

    invoke-static {v8, v12, v7, v9}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_a2
    invoke-static {v8}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method private static final d([B)Ljava/lang/String;
    .registers 9

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_4
    array-length v4, p0

    const/16 v5, 0x10

    if-ge v2, v4, :cond_25

    move v4, v2

    :goto_a
    if-ge v4, v5, :cond_19

    aget-byte v6, p0, v4

    if-nez v6, :cond_19

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, p0, v6

    if-nez v6, :cond_19

    add-int/lit8 v4, v4, 0x2

    goto :goto_a

    :cond_19
    sub-int v5, v4, v2

    if-le v5, v3, :cond_22

    const/4 v6, 0x4

    if-lt v5, v6, :cond_22

    move v0, v2

    move v3, v5

    :cond_22
    add-int/lit8 v2, v4, 0x2

    goto :goto_4

    :cond_25
    new-instance v2, Le9/e;

    invoke-direct {v2}, Le9/e;-><init>()V

    :cond_2a
    :goto_2a
    array-length v4, p0

    if-ge v1, v4, :cond_5a

    const/16 v4, 0x3a

    if-ne v1, v0, :cond_3b

    invoke-virtual {v2, v4}, Le9/e;->m1(I)Le9/e;

    add-int/2addr v1, v3

    if-ne v1, v5, :cond_2a

    invoke-virtual {v2, v4}, Le9/e;->m1(I)Le9/e;

    goto :goto_2a

    :cond_3b
    if-lez v1, :cond_40

    invoke-virtual {v2, v4}, Le9/e;->m1(I)Le9/e;

    :cond_40
    aget-byte v4, p0, v1

    const/16 v6, 0xff

    invoke-static {v4, v6}, LQ8/d;->d(BI)I

    move-result v4

    shl-int/lit8 v4, v4, 0x8

    add-int/lit8 v7, v1, 0x1

    aget-byte v7, p0, v7

    invoke-static {v7, v6}, LQ8/d;->d(BI)I

    move-result v6

    or-int/2addr v4, v6

    int-to-long v6, v4

    invoke-virtual {v2, v6, v7}, Le9/e;->o1(J)Le9/e;

    add-int/lit8 v1, v1, 0x2

    goto :goto_2a

    :cond_5a
    invoke-virtual {v2}, Le9/e;->P0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ":"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, LE8/i;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6e

    const-string v0, "["

    invoke-static {p0, v0, v1, v2, v3}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    const-string v0, "]"

    invoke-static {p0, v0, v1, v2, v3}, LE8/i;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-static {p0, v1, v0}, LQ8/a;->c(Ljava/lang/String;II)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_33

    :cond_2b
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p0, v1, v0}, LQ8/a;->c(Ljava/lang/String;II)Ljava/net/InetAddress;

    move-result-object v0

    :goto_33
    if-nez v0, :cond_36

    return-object v3

    :cond_36
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v1

    array-length v2, v1

    const/16 v3, 0x10

    if-ne v2, v3, :cond_49

    const-string p0, "address"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LQ8/a;->d([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_49
    array-length v1, v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_52

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_52
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid IPv6 address: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_6e
    :try_start_6e
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toASCII(host)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_8e

    return-object v3

    :cond_8e
    invoke-static {p0}, LQ8/a;->a(Ljava/lang/String;)Z

    move-result v0
    :try_end_92
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6e .. :try_end_92} :catch_96

    if-eqz v0, :cond_95

    return-object v3

    :cond_95
    return-object p0

    :catch_96
    return-object v3
.end method
