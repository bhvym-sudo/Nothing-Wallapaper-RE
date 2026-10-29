.class public abstract Lf9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B

.field private static final b:[J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const-string v0, "0123456789abcdef"

    invoke-static {v0}, Le9/E;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lf9/a;->a:[B

    const/16 v0, 0x14

    new-array v0, v0, [J

    fill-array-data v0, :array_12

    sput-object v0, Lf9/a;->b:[J

    return-void

    :array_12
    .array-data 8
        -0x1
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x2540be3ffL
        0x174876e7ffL
        0xe8d4a50fffL
        0x9184e729fffL
        0x5af3107a3fffL
        0x38d7ea4c67fffL
        0x2386f26fc0ffffL
        0x16345785d89ffffL
        0xde0b6b3a763ffffL
        0x7fffffffffffffffL
    .end array-data
.end method

.method public static final synthetic a(J)I
    .registers 2

    invoke-static {p0, p1}, Lf9/a;->b(J)I

    move-result p0

    return p0
.end method

.method private static final b(J)I
    .registers 5

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    mul-int/lit8 v0, v0, 0xa

    ushr-int/lit8 v0, v0, 0x5

    sget-object v1, Lf9/a;->b:[J

    aget-wide v1, v1, v0

    cmp-long p0, p0, v1

    if-lez p0, :cond_14

    const/4 p0, 0x1

    goto :goto_15

    :cond_14
    const/4 p0, 0x0

    :goto_15
    add-int/2addr v0, p0

    return v0
.end method

.method public static final c()[B
    .registers 1

    sget-object v0, Lf9/a;->a:[B

    return-object v0
.end method

.method public static final d(Le9/w;I[BII)Z
    .registers 10

    const-string v0, "segment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Le9/w;->c:I

    iget-object v1, p0, Le9/w;->a:[B

    :goto_e
    if-ge p3, p4, :cond_2e

    if-ne p1, v0, :cond_21

    iget-object p0, p0, Le9/w;->f:Le9/w;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p1, p0, Le9/w;->a:[B

    iget v0, p0, Le9/w;->b:I

    iget v1, p0, Le9/w;->c:I

    move v4, v1

    move-object v1, p1

    move p1, v0

    move v0, v4

    :cond_21
    aget-byte v2, v1, p1

    aget-byte v3, p2, p3

    if-eq v2, v3, :cond_29

    const/4 p0, 0x0

    return p0

    :cond_29
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p3, p3, 0x1

    goto :goto_e

    :cond_2e
    const/4 p0, 0x1

    return p0
.end method

.method public static final e(Le9/e;J)Ljava/lang/String;
    .registers 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const-wide/16 v1, 0x1

    if-lez v0, :cond_21

    sub-long v3, p1, v1

    invoke-virtual {p0, v3, v4}, Le9/e;->U(J)B

    move-result v0

    const/16 v5, 0xd

    if-ne v0, v5, :cond_21

    invoke-virtual {p0, v3, v4}, Le9/e;->T0(J)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Le9/e;->skip(J)V

    return-object p1

    :cond_21
    invoke-virtual {p0, p1, p2}, Le9/e;->T0(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, v2}, Le9/e;->skip(J)V

    return-object p1
.end method

.method public static final f(Le9/e;Le9/r;Z)I
    .registers 20

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "options"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Le9/e;->q:Le9/w;

    const/4 v1, -0x2

    const/4 v3, -0x1

    if-nez v0, :cond_18

    if-eqz p2, :cond_17

    return v1

    :cond_17
    return v3

    :cond_18
    iget-object v4, v0, Le9/w;->a:[B

    iget v5, v0, Le9/w;->b:I

    iget v6, v0, Le9/w;->c:I

    invoke-virtual {v2}, Le9/r;->o()[I

    move-result-object v2

    const/4 v7, 0x0

    move-object v9, v0

    move v10, v3

    move v8, v7

    :goto_26
    add-int/lit8 v11, v8, 0x1

    aget v12, v2, v8

    add-int/lit8 v8, v8, 0x2

    aget v11, v2, v11

    if-eq v11, v3, :cond_31

    move v10, v11

    :cond_31
    if-nez v9, :cond_34

    goto :goto_64

    :cond_34
    const/4 v11, 0x0

    if-gez v12, :cond_7d

    mul-int/lit8 v12, v12, -0x1

    add-int v13, v8, v12

    :goto_3b
    add-int/lit8 v12, v5, 0x1

    aget-byte v5, v4, v5

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v14, v8, 0x1

    aget v8, v2, v8

    if-eq v5, v8, :cond_48

    goto :goto_87

    :cond_48
    if-ne v14, v13, :cond_4c

    const/4 v5, 0x1

    goto :goto_4d

    :cond_4c
    move v5, v7

    :goto_4d
    if-ne v12, v6, :cond_6d

    invoke-static {v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v4, v9, Le9/w;->f:Le9/w;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v6, v4, Le9/w;->b:I

    iget-object v8, v4, Le9/w;->a:[B

    iget v9, v4, Le9/w;->c:I

    if-ne v4, v0, :cond_67

    if-eqz v5, :cond_64

    move-object v4, v8

    move-object v8, v11

    goto :goto_70

    :cond_64
    :goto_64
    if-eqz p2, :cond_87

    return v1

    :cond_67
    move-object/from16 v16, v8

    move-object v8, v4

    move-object/from16 v4, v16

    goto :goto_70

    :cond_6d
    move-object v8, v9

    move v9, v6

    move v6, v12

    :goto_70
    if-eqz v5, :cond_78

    aget v5, v2, v14

    move v13, v6

    move v6, v9

    move-object v9, v8

    goto :goto_a2

    :cond_78
    move v5, v6

    move v6, v9

    move-object v9, v8

    move v8, v14

    goto :goto_3b

    :cond_7d
    add-int/lit8 v13, v5, 0x1

    aget-byte v5, v4, v5

    and-int/lit16 v5, v5, 0xff

    add-int v14, v8, v12

    :goto_85
    if-ne v8, v14, :cond_88

    :cond_87
    :goto_87
    return v10

    :cond_88
    aget v15, v2, v8

    if-ne v5, v15, :cond_a9

    add-int/2addr v8, v12

    aget v5, v2, v8

    if-ne v13, v6, :cond_a2

    iget-object v9, v9, Le9/w;->f:Le9/w;

    invoke-static {v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v4, v9, Le9/w;->b:I

    iget-object v6, v9, Le9/w;->a:[B

    iget v8, v9, Le9/w;->c:I

    move v13, v4

    move-object v4, v6

    move v6, v8

    if-ne v9, v0, :cond_a2

    move-object v9, v11

    :cond_a2
    :goto_a2
    if-ltz v5, :cond_a5

    return v5

    :cond_a5
    neg-int v8, v5

    move v5, v13

    goto/16 :goto_26

    :cond_a9
    add-int/lit8 v8, v8, 0x1

    goto :goto_85
.end method

.method public static synthetic g(Le9/e;Le9/r;ZILjava/lang/Object;)I
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-static {p0, p1, p2}, Lf9/a;->f(Le9/e;Le9/r;Z)I

    move-result p0

    return p0
.end method
