.class public final Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;[B[[BI)Ljava/lang/String;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;->b([B[[BI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final b([B[[BI)Ljava/lang/String;
    .registers 22

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    array-length v2, v0

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v2, :cond_93

    add-int v5, v4, v2

    div-int/lit8 v5, v5, 0x2

    :goto_c
    const/16 v6, 0xa

    const/4 v7, -0x1

    if-le v5, v7, :cond_18

    aget-byte v8, v0, v5

    if-eq v8, v6, :cond_18

    add-int/lit8 v5, v5, -0x1

    goto :goto_c

    :cond_18
    add-int/lit8 v8, v5, 0x1

    const/4 v9, 0x1

    move v10, v9

    :goto_1c
    add-int v11, v8, v10

    aget-byte v12, v0, v11

    if-eq v12, v6, :cond_25

    add-int/lit8 v10, v10, 0x1

    goto :goto_1c

    :cond_25
    sub-int v6, v11, v8

    move/from16 v12, p3

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2c
    const/16 v15, 0xff

    if-eqz v10, :cond_34

    const/16 v10, 0x2e

    const/4 v3, 0x0

    goto :goto_41

    :cond_34
    aget-object v16, v1, v12

    aget-byte v3, v16, v13

    invoke-static {v3, v15}, LQ8/d;->d(BI)I

    move-result v3

    move/from16 v17, v10

    move v10, v3

    move/from16 v3, v17

    :goto_41
    add-int v16, v8, v14

    aget-byte v7, v0, v16

    invoke-static {v7, v15}, LQ8/d;->d(BI)I

    move-result v7

    sub-int/2addr v10, v7

    if-nez v10, :cond_65

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v13, v13, 0x1

    if-eq v14, v6, :cond_65

    aget-object v7, v1, v12

    array-length v7, v7

    if-ne v7, v13, :cond_62

    array-length v3, v1

    sub-int/2addr v3, v9

    if-ne v12, v3, :cond_5c

    goto :goto_65

    :cond_5c
    add-int/lit8 v12, v12, 0x1

    move v10, v9

    const/4 v7, -0x1

    const/4 v13, -0x1

    goto :goto_2c

    :cond_62
    move v10, v3

    const/4 v7, -0x1

    goto :goto_2c

    :cond_65
    :goto_65
    if-gez v10, :cond_69

    :goto_67
    move v2, v5

    goto :goto_6

    :cond_69
    if-lez v10, :cond_6e

    :goto_6b
    add-int/lit8 v4, v11, 0x1

    goto :goto_6

    :cond_6e
    sub-int v3, v6, v14

    aget-object v7, v1, v12

    array-length v7, v7

    sub-int/2addr v7, v13

    add-int/lit8 v12, v12, 0x1

    array-length v9, v1

    :goto_77
    if-ge v12, v9, :cond_80

    aget-object v10, v1, v12

    array-length v10, v10

    add-int/2addr v7, v10

    add-int/lit8 v12, v12, 0x1

    goto :goto_77

    :cond_80
    if-ge v7, v3, :cond_83

    goto :goto_67

    :cond_83
    if-le v7, v3, :cond_86

    goto :goto_6b

    :cond_86
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v8, v6, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v2

    :cond_93
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final c()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
    .registers 1

    invoke-static {}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    move-result-object p0

    return-object p0
.end method
