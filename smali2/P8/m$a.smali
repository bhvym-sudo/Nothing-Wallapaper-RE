.class public final LP8/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/m;
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
    invoke-direct {p0}, LP8/m$a;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;IIZ)I
    .registers 8

    :goto_0
    if-ge p2, p3, :cond_3c

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x20

    const/4 v1, 0x1

    if-ge p0, v0, :cond_f

    const/16 v0, 0x9

    if-ne p0, v0, :cond_33

    :cond_f
    const/16 v0, 0x7f

    if-ge p0, v0, :cond_33

    const/16 v0, 0x30

    const/16 v2, 0x3a

    if-gt v0, p0, :cond_1c

    if-ge p0, v2, :cond_1c

    goto :goto_33

    :cond_1c
    const/16 v0, 0x61

    if-gt v0, p0, :cond_25

    const/16 v0, 0x7b

    if-ge p0, v0, :cond_25

    goto :goto_33

    :cond_25
    const/16 v0, 0x41

    if-gt v0, p0, :cond_2e

    const/16 v0, 0x5b

    if-ge p0, v0, :cond_2e

    goto :goto_33

    :cond_2e
    if-ne p0, v2, :cond_31

    goto :goto_33

    :cond_31
    const/4 p0, 0x0

    goto :goto_34

    :cond_33
    :goto_33
    move p0, v1

    :goto_34
    xor-int/lit8 v0, p4, 0x1

    if-ne p0, v0, :cond_39

    return p2

    :cond_39
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3c
    return p3
.end method

.method private final b(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 6

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_8

    return v0

    :cond_8
    const/4 p0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, p0, v1}, LE8/i;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2a

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    sub-int/2addr p0, p2

    sub-int/2addr p0, v0

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 p2, 0x2e

    if-ne p0, p2, :cond_2a

    invoke-static {p1}, LQ8/d;->i(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2a

    return v0

    :cond_2a
    return v2
.end method

.method private final f(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "."

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, LE8/i;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    invoke-static {p1, v1}, LE8/i;->w0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LQ8/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_16

    return-object p0

    :cond_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final g(Ljava/lang/String;II)J
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/4 v3, 0x0

    move/from16 v4, p2

    invoke-direct {v0, v1, v4, v2, v3}, LP8/m$a;->a(Ljava/lang/String;IIZ)I

    move-result v4

    invoke-static {}, LP8/m;->c()Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    const/4 v6, -0x1

    move v7, v6

    move v8, v7

    move v9, v8

    move v10, v9

    move v11, v10

    move v12, v11

    :goto_1c
    const/4 v13, 0x2

    const/4 v14, 0x1

    if-ge v4, v2, :cond_ea

    add-int/lit8 v15, v4, 0x1

    invoke-direct {v0, v1, v15, v2, v14}, LP8/m$a;->a(Ljava/lang/String;IIZ)I

    move-result v15

    invoke-virtual {v5, v4, v15}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    const-string v4, "matcher.group(1)"

    if-ne v8, v6, :cond_63

    invoke-static {}, LP8/m;->c()Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_63

    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v5, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "matcher.group(2)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    const/4 v3, 0x3

    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "matcher.group(3)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    goto/16 :goto_e1

    :cond_63
    if-ne v9, v6, :cond_7f

    invoke-static {}, LP8/m;->a()Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_7f

    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    goto :goto_e1

    :cond_7f
    if-ne v10, v6, :cond_c6

    invoke-static {}, LP8/m;->b()Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_c6

    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "US"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LP8/m;->b()Ljava/util/regex/Pattern;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v4

    const-string v10, "MONTH_PATTERN.pattern()"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v3

    move-object/from16 v16, v4

    invoke-static/range {v16 .. v21}, LE8/i;->d0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v3

    div-int/lit8 v10, v3, 0x4

    goto :goto_e1

    :cond_c6
    if-ne v7, v6, :cond_e1

    invoke-static {}, LP8/m;->d()Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_e1

    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    :cond_e1
    :goto_e1
    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v15, v2, v3}, LP8/m$a;->a(Ljava/lang/String;IIZ)I

    move-result v4

    goto/16 :goto_1c

    :cond_ea
    const/16 v0, 0x46

    if-gt v0, v7, :cond_f4

    const/16 v1, 0x64

    if-ge v7, v1, :cond_f4

    add-int/lit16 v7, v7, 0x76c

    :cond_f4
    if-ltz v7, :cond_fa

    if-ge v7, v0, :cond_fa

    add-int/lit16 v7, v7, 0x7d0

    :cond_fa
    const/16 v0, 0x641

    const-string v1, "Failed requirement."

    if-lt v7, v0, :cond_166

    if-eq v10, v6, :cond_160

    if-gt v14, v9, :cond_15a

    const/16 v0, 0x20

    if-ge v9, v0, :cond_15a

    if-ltz v8, :cond_154

    const/16 v0, 0x18

    if-ge v8, v0, :cond_154

    if-ltz v11, :cond_14e

    const/16 v0, 0x3c

    if-ge v11, v0, :cond_14e

    if-ltz v12, :cond_148

    if-ge v12, v0, :cond_148

    new-instance v0, Ljava/util/GregorianCalendar;

    sget-object v1, LQ8/d;->f:Ljava/util/TimeZone;

    invoke-direct {v0, v1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->setLenient(Z)V

    invoke-virtual {v0, v14, v7}, Ljava/util/Calendar;->set(II)V

    sub-int/2addr v10, v14

    invoke-virtual {v0, v13, v10}, Ljava/util/Calendar;->set(II)V

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v9}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1, v8}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v11}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xd

    invoke-virtual {v0, v1, v12}, Ljava/util/Calendar;->set(II)V

    const/16 v1, 0xe

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    :cond_148
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_154
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_160
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_166
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final h(Ljava/lang/String;)J
    .registers 7

    const-wide/high16 v0, -0x8000000000000000L

    :try_start_2
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_6} :catch_e

    const-wide/16 v2, 0x0

    cmp-long v2, p0, v2

    if-gtz v2, :cond_d

    return-wide v0

    :cond_d
    return-wide p0

    :catch_e
    move-exception p0

    new-instance v2, LE8/g;

    const-string v3, "-?\\d+"

    invoke-direct {v2, v3}, LE8/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, LE8/g;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2e

    const/4 p0, 0x2

    const/4 v2, 0x0

    const-string v3, "-"

    const/4 v4, 0x0

    invoke-static {p1, v3, v4, p0, v2}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_28

    goto :goto_2d

    :cond_28
    const-wide v0, 0x7fffffffffffffffL

    :goto_2d
    return-wide v0

    :cond_2e
    throw p0
.end method


# virtual methods
.method public final c(LP8/v;Ljava/lang/String;)LP8/m;
    .registers 5

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCookie"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p1, p2}, LP8/m$a;->d(JLP8/v;Ljava/lang/String;)LP8/m;

    move-result-object p0

    return-object p0
.end method

.method public final d(JLP8/v;Ljava/lang/String;)LP8/m;
    .registers 37

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const-string v2, "url"

    move-object/from16 v7, p3

    invoke-static {v7, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "setCookie"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x3b

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LQ8/d;->r(Ljava/lang/String;CIIILjava/lang/Object;)I

    move-result v4

    const/4 v5, 0x2

    const/16 v2, 0x3d

    invoke-static/range {v1 .. v6}, LQ8/d;->r(Ljava/lang/String;CIIILjava/lang/Object;)I

    move-result v2

    const/4 v3, 0x0

    if-ne v2, v4, :cond_25

    return-object v3

    :cond_25
    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v1, v5, v2, v6, v3}, LQ8/d;->X(Ljava/lang/String;IIILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_32

    goto :goto_39

    :cond_32
    invoke-static {v8}, LQ8/d;->y(Ljava/lang/String;)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_3a

    :goto_39
    return-object v3

    :cond_3a
    add-int/2addr v2, v6

    invoke-static {v1, v2, v4}, LQ8/d;->W(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LQ8/d;->y(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v10, :cond_46

    return-object v3

    :cond_46
    add-int/2addr v4, v6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    move-object v10, v3

    move-object v11, v10

    move/from16 v18, v5

    move/from16 v20, v18

    move/from16 v23, v20

    move/from16 v19, v6

    const-wide/16 v14, -0x1

    const-wide/16 v16, -0x1

    const-wide v21, 0xe677d21fdbffL

    :goto_5e
    if-ge v4, v2, :cond_d6

    const-wide v24, 0xe677d21fdbffL

    const/16 v12, 0x3b

    invoke-static {v1, v12, v4, v2}, LQ8/d;->p(Ljava/lang/String;CII)I

    move-result v12

    const/16 v13, 0x3d

    invoke-static {v1, v13, v4, v12}, LQ8/d;->p(Ljava/lang/String;CII)I

    move-result v13

    invoke-static {v1, v4, v13}, LQ8/d;->W(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v4

    if-ge v13, v12, :cond_80

    add-int/lit8 v13, v13, 0x1

    invoke-static {v1, v13, v12}, LQ8/d;->W(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v13

    :goto_7d
    move-object/from16 v26, v3

    goto :goto_83

    :cond_80
    const-string v13, ""

    goto :goto_7d

    :goto_83
    const-string v3, "expires"

    invoke-static {v4, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_96

    :try_start_8b
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v13, v5, v3}, LP8/m$a;->g(Ljava/lang/String;II)J

    move-result-wide v21
    :try_end_93
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8b .. :try_end_93} :catch_d1

    :goto_93
    move/from16 v20, v6

    goto :goto_d1

    :cond_96
    const-string v3, "max-age"

    invoke-static {v4, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_a3

    :try_start_9e
    invoke-direct {v0, v13}, LP8/m$a;->h(Ljava/lang/String;)J

    move-result-wide v14
    :try_end_a2
    .catch Ljava/lang/NumberFormatException; {:try_start_9e .. :try_end_a2} :catch_d1

    goto :goto_93

    :cond_a3
    const-string v3, "domain"

    invoke-static {v4, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_b2

    :try_start_ab
    invoke-direct {v0, v13}, LP8/m$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_af
    .catch Ljava/lang/IllegalArgumentException; {:try_start_ab .. :try_end_af} :catch_d1

    move/from16 v19, v5

    goto :goto_d1

    :cond_b2
    const-string v3, "path"

    invoke-static {v4, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_bc

    move-object v11, v13

    goto :goto_d1

    :cond_bc
    const-string v3, "secure"

    invoke-static {v4, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_c7

    move/from16 v23, v6

    goto :goto_d1

    :cond_c7
    const-string v3, "httponly"

    invoke-static {v4, v3, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_d1

    move/from16 v18, v6

    :catch_d1
    :cond_d1
    :goto_d1
    add-int/lit8 v4, v12, 0x1

    move-object/from16 v3, v26

    goto :goto_5e

    :cond_d6
    move-object/from16 v26, v3

    const-wide v24, 0xe677d21fdbffL

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v3, v14, v1

    if-nez v3, :cond_e5

    move-wide v12, v1

    goto :goto_10e

    :cond_e5
    cmp-long v1, v14, v16

    if-eqz v1, :cond_10c

    const-wide v1, 0x20c49ba5e353f7L

    cmp-long v1, v14, v1

    if-gtz v1, :cond_f7

    const/16 v1, 0x3e8

    int-to-long v1, v1

    mul-long/2addr v14, v1

    goto :goto_fc

    :cond_f7
    const-wide v14, 0x7fffffffffffffffL

    :goto_fc
    add-long v14, p1, v14

    cmp-long v1, v14, p1

    if-ltz v1, :cond_109

    cmp-long v1, v14, v24

    if-lez v1, :cond_107

    goto :goto_109

    :cond_107
    move-wide v12, v14

    goto :goto_10e

    :cond_109
    :goto_109
    move-wide/from16 v12, v24

    goto :goto_10e

    :cond_10c
    move-wide/from16 v12, v21

    :goto_10e
    invoke-virtual {v7}, LP8/v;->i()Ljava/lang/String;

    move-result-object v1

    if-nez v10, :cond_116

    move-object v10, v1

    goto :goto_11d

    :cond_116
    invoke-direct {v0, v1, v10}, LP8/m$a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_11d

    return-object v26

    :cond_11d
    :goto_11d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_134

    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;

    invoke-virtual {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;->c()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    move-result-object v0

    invoke-virtual {v0, v10}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_134

    return-object v26

    :cond_134
    const-string v0, "/"

    if-eqz v11, :cond_141

    const/4 v1, 0x2

    move-object/from16 v2, v26

    invoke-static {v11, v0, v5, v1, v2}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_161

    :cond_141
    invoke-virtual {v7}, LP8/v;->d()Ljava/lang/String;

    move-result-object v24

    const/16 v28, 0x6

    const/16 v29, 0x0

    const/16 v25, 0x2f

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v24 .. v29}, LE8/i;->i0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    move-object/from16 v2, v24

    if-eqz v1, :cond_160

    invoke-virtual {v2, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_160
    move-object v11, v0

    :cond_161
    new-instance v7, LP8/m;

    move/from16 v15, v18

    const/16 v18, 0x0

    move/from16 v17, v19

    move/from16 v16, v20

    move/from16 v14, v23

    move-wide/from16 v30, v12

    move-object v12, v10

    move-object v13, v11

    move-wide/from16 v10, v30

    invoke-direct/range {v7 .. v18}, LP8/m;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLkotlin/jvm/internal/h;)V

    return-object v7
.end method

.method public final e(LP8/v;LP8/u;)Ljava/util/List;
    .registers 7

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Set-Cookie"

    invoke-virtual {p2, v0}, LP8/u;->n(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v0, :cond_32

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, p1, v3}, LP8/m$a;->c(LP8/v;Ljava/lang/String;)LP8/m;

    move-result-object v3

    if-nez v3, :cond_25

    goto :goto_2f

    :cond_25
    if-nez v1, :cond_2c

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2c
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2f
    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    :cond_32
    if-eqz v1, :cond_3e

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string p1, "{\n        Collections.un\u2026ableList(cookies)\n      }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_3e
    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
