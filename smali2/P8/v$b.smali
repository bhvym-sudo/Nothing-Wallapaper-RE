.class public final LP8/v$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, LP8/v$b;-><init>()V

    return-void
.end method

.method public static synthetic b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .registers 13

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_6

    move p2, v0

    :cond_6
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_e

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    :cond_e
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_13

    move p5, v0

    :cond_13
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_18

    move p6, v0

    :cond_18
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1d

    move p7, v0

    :cond_1d
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_22

    move p8, v0

    :cond_22
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_27

    const/4 p9, 0x0

    :cond_27
    invoke-virtual/range {p0 .. p9}, LP8/v$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final e(Ljava/lang/String;II)Z
    .registers 5

    add-int/lit8 p0, p2, 0x2

    if-ge p0, p3, :cond_24

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p3

    const/16 v0, 0x25

    if-ne p3, v0, :cond_24

    const/4 p3, 0x1

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    invoke-static {p2}, LQ8/d;->H(C)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_24

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, LQ8/d;->H(C)I

    move-result p0

    if-eq p0, v0, :cond_24

    return p3

    :cond_24
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;
    .registers 8

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_6

    move p2, v0

    :cond_6
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_e

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    :cond_e
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_13

    move p4, v0

    :cond_13
    invoke-virtual {p0, p1, p2, p3, p4}, LP8/v$b;->f(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final k(Le9/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V
    .registers 21

    move-object/from16 v0, p10

    const/4 v1, 0x0

    move v2, p3

    move-object v3, v1

    :goto_5
    if-ge v2, p4, :cond_ac

    invoke-virtual {p2, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    if-eqz p6, :cond_20

    const/16 v5, 0x9

    if-eq v4, v5, :cond_1d

    const/16 v5, 0xa

    if-eq v4, v5, :cond_1d

    const/16 v5, 0xc

    if-eq v4, v5, :cond_1d

    const/16 v5, 0xd

    if-ne v4, v5, :cond_20

    :cond_1d
    :goto_1d
    move-object v9, p5

    goto/16 :goto_a5

    :cond_20
    const/16 v5, 0x2b

    if-ne v4, v5, :cond_31

    if-eqz p8, :cond_31

    if-eqz p6, :cond_2b

    const-string v5, "+"

    goto :goto_2d

    :cond_2b
    const-string v5, "%2B"

    :goto_2d
    invoke-virtual {p1, v5}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    goto :goto_1d

    :cond_31
    const/16 v5, 0x20

    const/16 v6, 0x25

    if-lt v4, v5, :cond_42

    const/16 v5, 0x7f

    if-eq v4, v5, :cond_42

    const/16 v5, 0x80

    if-lt v4, v5, :cond_44

    if-eqz p9, :cond_42

    goto :goto_44

    :cond_42
    move-object v9, p5

    goto :goto_5f

    :cond_44
    :goto_44
    int-to-char v5, v4

    const/4 v7, 0x0

    const/4 v8, 0x2

    move-object v9, p5

    invoke-static {p5, v5, v7, v8, v1}, LE8/i;->R(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5f

    if-ne v4, v6, :cond_5b

    if-eqz p6, :cond_5f

    if-eqz p7, :cond_5b

    invoke-direct {p0, p2, v2, p4}, LP8/v$b;->e(Ljava/lang/String;II)Z

    move-result v5

    if-nez v5, :cond_5b

    goto :goto_5f

    :cond_5b
    invoke-virtual {p1, v4}, Le9/e;->w1(I)Le9/e;

    goto :goto_a5

    :cond_5f
    :goto_5f
    if-nez v3, :cond_66

    new-instance v3, Le9/e;

    invoke-direct {v3}, Le9/e;-><init>()V

    :cond_66
    if-eqz v0, :cond_7a

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_71

    goto :goto_7a

    :cond_71
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {v3, p2, v2, v5, v0}, Le9/e;->r1(Ljava/lang/String;IILjava/nio/charset/Charset;)Le9/e;

    goto :goto_7d

    :cond_7a
    :goto_7a
    invoke-virtual {v3, v4}, Le9/e;->w1(I)Le9/e;

    :goto_7d
    invoke-virtual {v3}, Le9/e;->D()Z

    move-result v5

    if-nez v5, :cond_a5

    invoke-virtual {v3}, Le9/e;->readByte()B

    move-result v5

    and-int/lit16 v7, v5, 0xff

    invoke-virtual {p1, v6}, Le9/e;->m1(I)Le9/e;

    invoke-static {}, LP8/v;->a()[C

    move-result-object v8

    shr-int/lit8 v7, v7, 0x4

    and-int/lit8 v7, v7, 0xf

    aget-char v7, v8, v7

    invoke-virtual {p1, v7}, Le9/e;->m1(I)Le9/e;

    invoke-static {}, LP8/v;->a()[C

    move-result-object v7

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v7, v5

    invoke-virtual {p1, v5}, Le9/e;->m1(I)Le9/e;

    goto :goto_7d

    :cond_a5
    :goto_a5
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v2, v4

    goto/16 :goto_5

    :cond_ac
    return-void
.end method

.method private final l(Le9/e;Ljava/lang/String;IIZ)V
    .registers 10

    :goto_0
    if-ge p3, p4, :cond_49

    invoke-virtual {p2, p3}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    const/16 v0, 0x25

    if-ne p0, v0, :cond_32

    add-int/lit8 v0, p3, 0x2

    if-ge v0, p4, :cond_32

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, LQ8/d;->H(C)I

    move-result v1

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, LQ8/d;->H(C)I

    move-result v2

    const/4 v3, -0x1

    if-eq v1, v3, :cond_40

    if-eq v2, v3, :cond_40

    shl-int/lit8 p3, v1, 0x4

    add-int/2addr p3, v2

    invoke-virtual {p1, p3}, Le9/e;->m1(I)Le9/e;

    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    add-int p3, v0, p0

    goto :goto_0

    :cond_32
    const/16 v0, 0x2b

    if-ne p0, v0, :cond_40

    if-eqz p5, :cond_40

    const/16 p0, 0x20

    invoke-virtual {p1, p0}, Le9/e;->m1(I)Le9/e;

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_40
    invoke-virtual {p1, p0}, Le9/e;->w1(I)Le9/e;

    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    add-int/2addr p3, p0

    goto :goto_0

    :cond_49
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;
    .registers 21

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodeSet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move v3, p2

    :goto_b
    if-ge v3, p3, :cond_62

    invoke-virtual {p1, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    const/16 v1, 0x20

    if-lt v0, v1, :cond_44

    const/16 v1, 0x7f

    if-eq v0, v1, :cond_44

    const/16 v1, 0x80

    if-lt v0, v1, :cond_1f

    if-eqz p8, :cond_44

    :cond_1f
    int-to-char v1, v0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {p4, v1, v8, v6, v7}, LE8/i;->R(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    const/16 v1, 0x25

    if-ne v0, v1, :cond_37

    if-eqz p5, :cond_44

    if-eqz p6, :cond_37

    invoke-direct {p0, p1, v3, p3}, LP8/v$b;->e(Ljava/lang/String;II)Z

    move-result v6

    if-eqz v6, :cond_44

    :cond_37
    const/16 v6, 0x2b

    if-ne v0, v6, :cond_3e

    if-eqz p7, :cond_3e

    goto :goto_44

    :cond_3e
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr v3, v0

    goto :goto_b

    :cond_44
    :goto_44
    new-instance v1, Le9/e;

    invoke-direct {v1}, Le9/e;-><init>()V

    invoke-virtual {v1, p1, p2, v3}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    move-object v0, p0

    move-object v2, p1

    move v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, LP8/v$b;->k(Le9/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V

    invoke-virtual {v1}, Le9/e;->P0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_62
    invoke-virtual/range {p1 .. p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;)I
    .registers 2

    const-string p0, "scheme"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "http"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/16 p0, 0x50

    return p0

    :cond_10
    const-string p0, "https"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1b

    const/16 p0, 0x1bb

    return p0

    :cond_1b
    const/4 p0, -0x1

    return p0
.end method

.method public final d(Ljava/lang/String;)LP8/v;
    .registers 3

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LP8/v$a;

    invoke-direct {p0}, LP8/v$a;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LP8/v$a;->j(LP8/v;Ljava/lang/String;)LP8/v$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/v$a;->c()LP8/v;

    move-result-object p0

    return-object p0
.end method

.method public final f(Ljava/lang/String;IIZ)Ljava/lang/String;
    .registers 12

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move v4, p2

    :goto_6
    if-ge v4, p3, :cond_2e

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x25

    if-eq v0, v1, :cond_1a

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_17

    if-eqz p4, :cond_17

    goto :goto_1a

    :cond_17
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_1a
    :goto_1a
    new-instance v2, Le9/e;

    invoke-direct {v2}, Le9/e;-><init>()V

    invoke-virtual {v2, p1, p2, v4}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    move-object v1, p0

    move-object v3, p1

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, LP8/v$b;->l(Le9/e;Ljava/lang/String;IIZ)V

    invoke-virtual {v2}, Le9/e;->P0()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2e
    move-object v3, p1

    move v5, p3

    invoke-virtual {v3, p2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final h(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .registers 5

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "out"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    :goto_f
    if-ge v0, p0, :cond_22

    const/16 v1, 0x2f

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_22
    return-void
.end method

.method public final i(Ljava/lang/String;)Ljava/util/List;
    .registers 9

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v3, v0

    :goto_c
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v3, v0, :cond_5c

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x26

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_23

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    :cond_23
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x3d

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-eq v2, v0, :cond_4a

    if-le v2, p1, :cond_33

    goto :goto_4a

    :cond_33
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_58

    :cond_4a
    :goto_4a
    invoke-virtual {v1, v3, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_58
    add-int/lit8 v3, p1, 0x1

    move-object p1, v1

    goto :goto_c

    :cond_5c
    return-object p0
.end method

.method public final j(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .registers 8

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "out"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, LB8/h;->q(II)LB8/g;

    move-result-object p0

    const/4 v0, 0x2

    invoke-static {p0, v0}, LB8/h;->p(LB8/e;I)LB8/e;

    move-result-object p0

    invoke-virtual {p0}, LB8/e;->g()I

    move-result v0

    invoke-virtual {p0}, LB8/e;->m()I

    move-result v1

    invoke-virtual {p0}, LB8/e;->n()I

    move-result p0

    if-lez p0, :cond_28

    if-le v0, v1, :cond_2c

    :cond_28
    if-gez p0, :cond_52

    if-gt v1, v0, :cond_52

    :cond_2c
    :goto_2c
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v0, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-lez v0, :cond_41

    const/16 v4, 0x26

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_41
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_4e

    const/16 v2, 0x3d

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4e
    if-eq v0, v1, :cond_52

    add-int/2addr v0, p0

    goto :goto_2c

    :cond_52
    return-void
.end method
