.class public abstract LV8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Le9/h;

.field private static final b:Le9/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    sget-object v0, Le9/h;->t:Le9/h$a;

    const-string v1, "\"\\"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v1

    sput-object v1, LV8/e;->a:Le9/h;

    const-string v1, "\t ,="

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v0

    sput-object v0, LV8/e;->b:Le9/h;

    return-void
.end method

.method public static final a(LP8/u;Ljava/lang/String;)Ljava/util/List;
    .registers 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LP8/u;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v1, :cond_42

    invoke-virtual {p0, v2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {p1, v3, v4}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_3f

    new-instance v3, Le9/e;

    invoke-direct {v3}, Le9/e;-><init>()V

    invoke-virtual {p0, v2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    move-result-object v3

    :try_start_2e
    invoke-static {v3, v0}, LV8/e;->c(Le9/e;Ljava/util/List;)V
    :try_end_31
    .catch Ljava/io/EOFException; {:try_start_2e .. :try_end_31} :catch_32

    goto :goto_3f

    :catch_32
    move-exception v3

    sget-object v4, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v4}, LZ8/h$a;->g()LZ8/h;

    move-result-object v4

    const-string v5, "Unable to parse challenge"

    const/4 v6, 0x5

    invoke-virtual {v4, v5, v6, v3}, LZ8/h;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    :cond_3f
    :goto_3f
    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_42
    return-object v0
.end method

.method public static final b(LP8/D;)Z
    .registers 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LP8/D;->t0()LP8/B;

    move-result-object v0

    invoke-virtual {v0}, LP8/B;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HEAD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    return v1

    :cond_17
    invoke-virtual {p0}, LP8/D;->j()I

    move-result v0

    const/16 v2, 0x64

    const/4 v3, 0x1

    if-lt v0, v2, :cond_24

    const/16 v2, 0xc8

    if-lt v0, v2, :cond_2d

    :cond_24
    const/16 v2, 0xcc

    if-eq v0, v2, :cond_2d

    const/16 v2, 0x130

    if-eq v0, v2, :cond_2d

    return v3

    :cond_2d
    invoke-static {p0}, LQ8/d;->v(LP8/D;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_49

    const-string v0, "Transfer-Encoding"

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v0, v4, v2, v4}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "chunked"

    invoke-static {v0, p0, v3}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_48

    goto :goto_49

    :cond_48
    return v1

    :cond_49
    :goto_49
    return v3
.end method

.method private static final c(Le9/e;Ljava/util/List;)V
    .registers 9

    const/4 v0, 0x0

    :goto_1
    move-object v1, v0

    :goto_2
    if-nez v1, :cond_f

    invoke-static {p0}, LV8/e;->g(Le9/e;)Z

    invoke-static {p0}, LV8/e;->e(Le9/e;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_f

    goto/16 :goto_b9

    :cond_f
    invoke-static {p0}, LV8/e;->g(Le9/e;)Z

    move-result v2

    invoke-static {p0}, LV8/e;->e(Le9/e;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2e

    invoke-virtual {p0}, Le9/e;->D()Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_b9

    :cond_21
    new-instance p0, LP8/h;

    invoke-static {}, Li8/N;->g()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v1, v0}, LP8/h;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2e
    const/16 v4, 0x3d

    invoke-static {p0, v4}, LQ8/d;->K(Le9/e;B)I

    move-result v5

    invoke-static {p0}, LV8/e;->g(Le9/e;)Z

    move-result v6

    if-nez v2, :cond_69

    if-nez v6, :cond_42

    invoke-virtual {p0}, Le9/e;->D()Z

    move-result v2

    if-eqz v2, :cond_69

    :cond_42
    new-instance v2, LP8/h;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-static {v3, v5}, LE8/i;->E(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "singletonMap<String, Str\u2026ek + \"=\".repeat(eqCount))"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, v3}, LP8/h;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_69
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p0, v4}, LQ8/d;->K(Le9/e;B)I

    move-result v6

    add-int/2addr v5, v6

    :goto_73
    if-nez v3, :cond_83

    invoke-static {p0}, LV8/e;->e(Le9/e;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, LV8/e;->g(Le9/e;)Z

    move-result v5

    if-nez v5, :cond_bc

    invoke-static {p0, v4}, LQ8/d;->K(Le9/e;B)I

    move-result v5

    :cond_83
    if-eqz v5, :cond_bc

    const/4 v6, 0x1

    if-le v5, v6, :cond_89

    goto :goto_b9

    :cond_89
    invoke-static {p0}, LV8/e;->g(Le9/e;)Z

    move-result v6

    if-eqz v6, :cond_90

    goto :goto_b9

    :cond_90
    const/16 v6, 0x22

    invoke-static {p0, v6}, LV8/e;->h(Le9/e;B)Z

    move-result v6

    if-eqz v6, :cond_9d

    invoke-static {p0}, LV8/e;->d(Le9/e;)Ljava/lang/String;

    move-result-object v6

    goto :goto_a1

    :cond_9d
    invoke-static {p0}, LV8/e;->e(Le9/e;)Ljava/lang/String;

    move-result-object v6

    :goto_a1
    if-nez v6, :cond_a4

    goto :goto_b9

    :cond_a4
    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_ad

    goto :goto_b9

    :cond_ad
    invoke-static {p0}, LV8/e;->g(Le9/e;)Z

    move-result v3

    if-nez v3, :cond_ba

    invoke-virtual {p0}, Le9/e;->D()Z

    move-result v3

    if-nez v3, :cond_ba

    :goto_b9
    return-void

    :cond_ba
    move-object v3, v0

    goto :goto_73

    :cond_bc
    new-instance v4, LP8/h;

    invoke-direct {v4, v1, v2}, LP8/h;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v3

    goto/16 :goto_2
.end method

.method private static final d(Le9/e;)Ljava/lang/String;
    .registers 13

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_43

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    :goto_d
    sget-object v2, LV8/e;->a:Le9/h;

    invoke-virtual {p0, v2}, Le9/e;->m0(Le9/h;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    if-nez v4, :cond_1b

    return-object v5

    :cond_1b
    invoke-virtual {p0, v2, v3}, Le9/e;->U(J)B

    move-result v4

    if-ne v4, v1, :cond_2c

    invoke-virtual {v0, p0, v2, v3}, Le9/e;->Z(Le9/e;J)V

    invoke-virtual {p0}, Le9/e;->readByte()B

    invoke-virtual {v0}, Le9/e;->P0()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2c
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long v10, v2, v8

    cmp-long v4, v6, v10

    if-nez v4, :cond_39

    return-object v5

    :cond_39
    invoke-virtual {v0, p0, v2, v3}, Le9/e;->Z(Le9/e;J)V

    invoke-virtual {p0}, Le9/e;->readByte()B

    invoke-virtual {v0, p0, v8, v9}, Le9/e;->Z(Le9/e;J)V

    goto :goto_d

    :cond_43
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final e(Le9/e;)Ljava/lang/String;
    .registers 5

    sget-object v0, LV8/e;->b:Le9/h;

    invoke-virtual {p0, v0}, Le9/e;->m0(Le9/h;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_10

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    :cond_10
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1b

    invoke-virtual {p0, v0, v1}, Le9/e;->T0(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final f(LP8/n;LP8/v;LP8/u;)V
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP8/n;->b:LP8/n;

    if-ne p0, v0, :cond_14

    goto :goto_20

    :cond_14
    sget-object v0, LP8/m;->j:LP8/m$a;

    invoke-virtual {v0, p1, p2}, LP8/m$a;->e(LP8/v;LP8/u;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    :goto_20
    return-void

    :cond_21
    invoke-interface {p0, p1, p2}, LP8/n;->a(LP8/v;Ljava/util/List;)V

    return-void
.end method

.method private static final g(Le9/e;)Z
    .registers 4

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Le9/e;->D()Z

    move-result v1

    if-nez v1, :cond_23

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, Le9/e;->U(J)B

    move-result v1

    const/16 v2, 0x2c

    if-ne v1, v2, :cond_16

    invoke-virtual {p0}, Le9/e;->readByte()B

    const/4 v0, 0x1

    goto :goto_1

    :cond_16
    const/16 v2, 0x20

    if-ne v1, v2, :cond_1b

    goto :goto_1f

    :cond_1b
    const/16 v2, 0x9

    if-ne v1, v2, :cond_23

    :goto_1f
    invoke-virtual {p0}, Le9/e;->readByte()B

    goto :goto_1

    :cond_23
    return v0
.end method

.method private static final h(Le9/e;B)Z
    .registers 4

    invoke-virtual {p0}, Le9/e;->D()Z

    move-result v0

    if-nez v0, :cond_10

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Le9/e;->U(J)B

    move-result p0

    if-ne p0, p1, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method
