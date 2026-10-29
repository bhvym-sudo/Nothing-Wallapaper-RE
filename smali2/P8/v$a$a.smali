.class public final LP8/v$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/v$a;
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
    invoke-direct {p0}, LP8/v$a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LP8/v$a$a;Ljava/lang/String;II)I
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LP8/v$a$a;->e(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(LP8/v$a$a;Ljava/lang/String;II)I
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LP8/v$a$a;->f(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic c(LP8/v$a$a;Ljava/lang/String;II)I
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LP8/v$a$a;->g(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(LP8/v$a$a;Ljava/lang/String;II)I
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LP8/v$a$a;->h(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method private final e(Ljava/lang/String;II)I
    .registers 16

    const/4 p0, -0x1

    :try_start_1
    sget-object v0, LP8/v;->k:LP8/v$b;

    const-string v4, ""

    const/16 v10, 0xf8

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-static/range {v0 .. v11}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_18
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_18} :catch_20

    const/4 p2, 0x1

    if-gt p2, p1, :cond_20

    const/high16 p2, 0x10000

    if-ge p1, p2, :cond_20

    return p1

    :catch_20
    :cond_20
    return p0
.end method

.method private final f(Ljava/lang/String;II)I
    .registers 5

    :goto_0
    if-ge p2, p3, :cond_1f

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x5b

    if-ne p0, v0, :cond_17

    :cond_a
    add-int/lit8 p2, p2, 0x1

    if-ge p2, p3, :cond_1c

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x5d

    if-ne p0, v0, :cond_a

    goto :goto_1c

    :cond_17
    const/16 v0, 0x3a

    if-ne p0, v0, :cond_1c

    return p2

    :cond_1c
    :goto_1c
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1f
    return p3
.end method

.method private final g(Ljava/lang/String;II)I
    .registers 9

    sub-int p0, p3, p2

    const/4 v0, 0x2

    const/4 v1, -0x1

    if-ge p0, v0, :cond_7

    return v1

    :cond_7
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x61

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v2

    const/16 v3, 0x41

    if-ltz v2, :cond_1d

    const/16 v2, 0x7a

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v2

    if-lez v2, :cond_2c

    :cond_1d
    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->i(II)I

    move-result v2

    if-ltz v2, :cond_5d

    const/16 v2, 0x5a

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->i(II)I

    move-result p0

    if-lez p0, :cond_2c

    goto :goto_5d

    :cond_2c
    :goto_2c
    add-int/lit8 p2, p2, 0x1

    if-ge p2, p3, :cond_5d

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    if-gt v0, p0, :cond_3b

    const/16 v2, 0x7b

    if-ge p0, v2, :cond_3b

    goto :goto_59

    :cond_3b
    if-gt v3, p0, :cond_42

    const/16 v2, 0x5b

    if-ge p0, v2, :cond_42

    goto :goto_59

    :cond_42
    const/16 v2, 0x30

    const/16 v4, 0x3a

    if-gt v2, p0, :cond_4b

    if-ge p0, v4, :cond_4b

    goto :goto_59

    :cond_4b
    const/16 v2, 0x2b

    if-ne p0, v2, :cond_50

    goto :goto_59

    :cond_50
    const/16 v2, 0x2d

    if-ne p0, v2, :cond_55

    goto :goto_59

    :cond_55
    const/16 v2, 0x2e

    if-ne p0, v2, :cond_5a

    :goto_59
    goto :goto_2c

    :cond_5a
    if-ne p0, v4, :cond_5d

    return p2

    :cond_5d
    :goto_5d
    return v1
.end method

.method private final h(Ljava/lang/String;II)I
    .registers 6

    const/4 p0, 0x0

    :goto_1
    if-ge p2, p3, :cond_14

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_f

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_14

    :cond_f
    add-int/lit8 p0, p0, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_14
    return p0
.end method
