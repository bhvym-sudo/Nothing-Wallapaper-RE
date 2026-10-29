.class public abstract Lf9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_a

    sput-object v0, Lf9/b;->a:[C

    return-void

    :array_a
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static final synthetic a([BI)I
    .registers 2

    invoke-static {p0, p1}, Lf9/b;->c([BI)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(C)I
    .registers 1

    invoke-static {p0}, Lf9/b;->e(C)I

    move-result p0

    return p0
.end method

.method private static final c([BI)I
    .registers 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x1

    array-length v4, v0

    const/4 v5, 0x0

    move v6, v5

    move v7, v6

    :goto_9
    if-ge v5, v4, :cond_1c0

    aget-byte v8, v0, v5

    const v9, 0xfffd

    const/16 v10, 0xa0

    const/16 v11, 0x7f

    const/16 v12, 0x20

    const/16 v13, 0xd

    const/16 v14, 0xa

    const/high16 v15, 0x10000

    const/16 v16, -0x1

    if-ltz v8, :cond_6c

    add-int/lit8 v17, v7, 0x1

    if-ne v7, v1, :cond_26

    goto/16 :goto_1c0

    :cond_26
    if-eq v8, v14, :cond_34

    if-eq v8, v13, :cond_34

    if-ltz v8, :cond_2f

    if-ge v8, v12, :cond_2f

    goto :goto_36

    :cond_2f
    if-gt v11, v8, :cond_34

    if-ge v8, v10, :cond_34

    goto :goto_36

    :cond_34
    if-ne v8, v9, :cond_37

    :goto_36
    return v16

    :cond_37
    if-ge v8, v15, :cond_3b

    move v7, v3

    goto :goto_3c

    :cond_3b
    const/4 v7, 0x2

    :goto_3c
    add-int/2addr v6, v7

    add-int/2addr v5, v3

    :goto_3e
    move/from16 v7, v17

    if-ge v5, v4, :cond_64

    aget-byte v8, v0, v5

    if-ltz v8, :cond_64

    add-int/2addr v5, v3

    add-int/lit8 v17, v7, 0x1

    if-ne v7, v1, :cond_4c

    return v6

    :cond_4c
    if-eq v8, v14, :cond_5a

    if-eq v8, v13, :cond_5a

    if-ltz v8, :cond_55

    if-ge v8, v12, :cond_55

    goto :goto_5c

    :cond_55
    if-gt v11, v8, :cond_5a

    if-ge v8, v10, :cond_5a

    goto :goto_5c

    :cond_5a
    if-ne v8, v9, :cond_5d

    :goto_5c
    return v16

    :cond_5d
    if-ge v8, v15, :cond_61

    move v7, v3

    goto :goto_62

    :cond_61
    const/4 v7, 0x2

    :goto_62
    add-int/2addr v6, v7

    goto :goto_3e

    :cond_64
    sget-object v8, Lh8/A;->a:Lh8/A;

    move/from16 v18, v3

    const/16 v17, 0x2

    goto/16 :goto_1ac

    :cond_6c
    const/16 v17, 0x2

    shr-int/lit8 v2, v8, 0x5

    move/from16 v18, v3

    const/4 v3, -0x2

    const/16 v15, 0x80

    if-ne v2, v3, :cond_bf

    add-int/lit8 v3, v5, 0x1

    if-gt v4, v3, :cond_80

    if-ne v7, v1, :cond_7f

    goto/16 :goto_1c0

    :cond_7f
    return v16

    :cond_80
    aget-byte v2, v0, v3

    and-int/lit16 v3, v2, 0xc0

    if-ne v3, v15, :cond_ba

    xor-int/lit16 v2, v2, 0xf80

    shl-int/lit8 v3, v8, 0x6

    xor-int/2addr v2, v3

    if-ge v2, v15, :cond_92

    if-ne v7, v1, :cond_91

    goto/16 :goto_1c0

    :cond_91
    return v16

    :cond_92
    add-int/lit8 v3, v7, 0x1

    if-ne v7, v1, :cond_98

    goto/16 :goto_1c0

    :cond_98
    if-eq v2, v14, :cond_a6

    if-eq v2, v13, :cond_a6

    if-ltz v2, :cond_a1

    if-ge v2, v12, :cond_a1

    goto :goto_a8

    :cond_a1
    if-gt v11, v2, :cond_a6

    if-ge v2, v10, :cond_a6

    goto :goto_a8

    :cond_a6
    if-ne v2, v9, :cond_a9

    :goto_a8
    return v16

    :cond_a9
    const/high16 v7, 0x10000

    if-ge v2, v7, :cond_b0

    move/from16 v2, v18

    goto :goto_b2

    :cond_b0
    move/from16 v2, v17

    :goto_b2
    add-int/2addr v6, v2

    sget-object v2, Lh8/A;->a:Lh8/A;

    add-int/lit8 v5, v5, 0x2

    :goto_b7
    move v7, v3

    goto/16 :goto_1ac

    :cond_ba
    if-ne v7, v1, :cond_be

    goto/16 :goto_1c0

    :cond_be
    return v16

    :cond_bf
    shr-int/lit8 v2, v8, 0x4

    const v9, 0xe000

    const v10, 0xd800

    if-ne v2, v3, :cond_133

    add-int/lit8 v2, v5, 0x2

    if-gt v4, v2, :cond_d2

    if-ne v7, v1, :cond_d1

    goto/16 :goto_1c0

    :cond_d1
    return v16

    :cond_d2
    add-int/lit8 v3, v5, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v11, v3, 0xc0

    if-ne v11, v15, :cond_12e

    aget-byte v2, v0, v2

    and-int/lit16 v11, v2, 0xc0

    if-ne v11, v15, :cond_129

    const v11, -0x1e080

    xor-int/2addr v2, v11

    shl-int/lit8 v3, v3, 0x6

    xor-int/2addr v2, v3

    shl-int/lit8 v3, v8, 0xc

    xor-int/2addr v2, v3

    const/16 v3, 0x800

    if-ge v2, v3, :cond_f3

    if-ne v7, v1, :cond_f2

    goto/16 :goto_1c0

    :cond_f2
    return v16

    :cond_f3
    if-gt v10, v2, :cond_fc

    if-ge v2, v9, :cond_fc

    if-ne v7, v1, :cond_fb

    goto/16 :goto_1c0

    :cond_fb
    return v16

    :cond_fc
    add-int/lit8 v3, v7, 0x1

    if-ne v7, v1, :cond_102

    goto/16 :goto_1c0

    :cond_102
    if-eq v2, v14, :cond_114

    if-eq v2, v13, :cond_114

    if-ltz v2, :cond_10b

    if-ge v2, v12, :cond_10b

    goto :goto_119

    :cond_10b
    const/16 v7, 0x7f

    if-gt v7, v2, :cond_114

    const/16 v7, 0xa0

    if-ge v2, v7, :cond_114

    goto :goto_119

    :cond_114
    const v7, 0xfffd

    if-ne v2, v7, :cond_11a

    :goto_119
    return v16

    :cond_11a
    const/high16 v7, 0x10000

    if-ge v2, v7, :cond_121

    move/from16 v2, v18

    goto :goto_123

    :cond_121
    move/from16 v2, v17

    :goto_123
    add-int/2addr v6, v2

    sget-object v2, Lh8/A;->a:Lh8/A;

    add-int/lit8 v5, v5, 0x3

    goto :goto_b7

    :cond_129
    if-ne v7, v1, :cond_12d

    goto/16 :goto_1c0

    :cond_12d
    return v16

    :cond_12e
    if-ne v7, v1, :cond_132

    goto/16 :goto_1c0

    :cond_132
    return v16

    :cond_133
    shr-int/lit8 v2, v8, 0x3

    if-ne v2, v3, :cond_1bc

    add-int/lit8 v2, v5, 0x3

    if-gt v4, v2, :cond_140

    if-ne v7, v1, :cond_13f

    goto/16 :goto_1c0

    :cond_13f
    return v16

    :cond_140
    add-int/lit8 v3, v5, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v11, v3, 0xc0

    if-ne v11, v15, :cond_1b8

    add-int/lit8 v11, v5, 0x2

    aget-byte v11, v0, v11

    and-int/lit16 v12, v11, 0xc0

    if-ne v12, v15, :cond_1b4

    aget-byte v2, v0, v2

    and-int/lit16 v12, v2, 0xc0

    if-ne v12, v15, :cond_1b0

    const v12, 0x381f80

    xor-int/2addr v2, v12

    shl-int/lit8 v11, v11, 0x6

    xor-int/2addr v2, v11

    shl-int/lit8 v3, v3, 0xc

    xor-int/2addr v2, v3

    shl-int/lit8 v3, v8, 0x12

    xor-int/2addr v2, v3

    const v3, 0x10ffff

    if-le v2, v3, :cond_16d

    if-ne v7, v1, :cond_16c

    goto/16 :goto_1c0

    :cond_16c
    return v16

    :cond_16d
    if-gt v10, v2, :cond_175

    if-ge v2, v9, :cond_175

    if-ne v7, v1, :cond_174

    goto :goto_1c0

    :cond_174
    return v16

    :cond_175
    const/high16 v3, 0x10000

    if-ge v2, v3, :cond_17d

    if-ne v7, v1, :cond_17c

    goto :goto_1c0

    :cond_17c
    return v16

    :cond_17d
    add-int/lit8 v3, v7, 0x1

    if-ne v7, v1, :cond_182

    goto :goto_1c0

    :cond_182
    if-eq v2, v14, :cond_196

    if-eq v2, v13, :cond_196

    if-ltz v2, :cond_18d

    const/16 v7, 0x20

    if-ge v2, v7, :cond_18d

    goto :goto_19b

    :cond_18d
    const/16 v7, 0x7f

    if-gt v7, v2, :cond_196

    const/16 v7, 0xa0

    if-ge v2, v7, :cond_196

    goto :goto_19b

    :cond_196
    const v7, 0xfffd

    if-ne v2, v7, :cond_19c

    :goto_19b
    return v16

    :cond_19c
    const/high16 v7, 0x10000

    if-ge v2, v7, :cond_1a3

    move/from16 v2, v18

    goto :goto_1a5

    :cond_1a3
    move/from16 v2, v17

    :goto_1a5
    add-int/2addr v6, v2

    sget-object v2, Lh8/A;->a:Lh8/A;

    add-int/lit8 v5, v5, 0x4

    goto/16 :goto_b7

    :goto_1ac
    move/from16 v3, v18

    goto/16 :goto_9

    :cond_1b0
    if-ne v7, v1, :cond_1b3

    goto :goto_1c0

    :cond_1b3
    return v16

    :cond_1b4
    if-ne v7, v1, :cond_1b7

    goto :goto_1c0

    :cond_1b7
    return v16

    :cond_1b8
    if-ne v7, v1, :cond_1bb

    goto :goto_1c0

    :cond_1bb
    return v16

    :cond_1bc
    if-ne v7, v1, :cond_1bf

    goto :goto_1c0

    :cond_1bf
    return v16

    :cond_1c0
    :goto_1c0
    return v6
.end method

.method public static final d(Le9/h;Le9/e;II)V
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    invoke-virtual {p1, p0, p2, p3}, Le9/e;->k1([BII)Le9/e;

    return-void
.end method

.method private static final e(C)I
    .registers 4

    const/16 v0, 0x30

    if-gt v0, p0, :cond_a

    const/16 v1, 0x3a

    if-ge p0, v1, :cond_a

    sub-int/2addr p0, v0

    return p0

    :cond_a
    const/16 v0, 0x61

    if-gt v0, p0, :cond_15

    const/16 v0, 0x67

    if-ge p0, v0, :cond_15

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_15
    const/16 v0, 0x41

    if-gt v0, p0, :cond_20

    const/16 v0, 0x47

    if-ge p0, v0, :cond_20

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected hex digit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f()[C
    .registers 1

    sget-object v0, Lf9/b;->a:[C

    return-object v0
.end method
