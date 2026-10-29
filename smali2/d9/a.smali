.class public final Ld9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld9/a$a;,
        Ld9/a$b;
    }
.end annotation


# instance fields
.field private final a:Ld9/a$b;

.field private volatile b:Ljava/util/Set;

.field private volatile c:Ld9/a$a;


# direct methods
.method public constructor <init>(Ld9/a$b;)V
    .registers 3

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/a;->a:Ld9/a$b;

    invoke-static {}, Li8/U;->d()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ld9/a;->b:Ljava/util/Set;

    sget-object p1, Ld9/a$a;->q:Ld9/a$a;

    iput-object p1, p0, Ld9/a;->c:Ld9/a$a;

    return-void
.end method

.method private final b(LP8/u;)Z
    .registers 4

    const-string p0, "Content-Encoding"

    invoke-virtual {p1, p0}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    if-nez p0, :cond_a

    return p1

    :cond_a
    const-string v0, "identity"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1c

    const-string v0, "gzip"

    invoke-static {p0, v0, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_1c

    return v1

    :cond_1c
    return p1
.end method

.method private final c(LP8/u;I)V
    .registers 5

    iget-object v0, p0, Ld9/a;->b:Ljava/util/Set;

    invoke-virtual {p1, p2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "\u2588\u2588"

    goto :goto_13

    :cond_f
    invoke-virtual {p1, p2}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v0

    :goto_13
    iget-object p0, p0, Ld9/a;->a:Ld9/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ld9/a$b;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "chain"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Ld9/a;->c:Ld9/a$a;

    invoke-interface {v0}, LP8/w$a;->b()LP8/B;

    move-result-object v3

    sget-object v4, Ld9/a$a;->q:Ld9/a$a;

    if-ne v2, v4, :cond_18

    invoke-interface {v0, v3}, LP8/w$a;->a(LP8/B;)LP8/D;

    move-result-object v0

    return-object v0

    :cond_18
    sget-object v4, Ld9/a$a;->t:Ld9/a$a;

    if-ne v2, v4, :cond_1e

    const/4 v4, 0x1

    goto :goto_1f

    :cond_1e
    const/4 v4, 0x0

    :goto_1f
    if-nez v4, :cond_28

    sget-object v7, Ld9/a$a;->s:Ld9/a$a;

    if-ne v2, v7, :cond_26

    goto :goto_28

    :cond_26
    const/4 v2, 0x0

    goto :goto_29

    :cond_28
    :goto_28
    const/4 v2, 0x1

    :goto_29
    invoke-virtual {v3}, LP8/B;->a()LP8/C;

    move-result-object v7

    invoke-interface {v0}, LP8/w$a;->c()LP8/j;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "--> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x20

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->j()LP8/v;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ""

    if-eqz v8, :cond_66

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v8}, LP8/j;->a()LP8/A;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_67

    :cond_66
    move-object v8, v11

    :goto_67
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "-byte body)"

    const-string v12, " ("

    if-nez v2, :cond_8f

    if-eqz v7, :cond_8f

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, LP8/C;->a()J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :cond_8f
    iget-object v13, v1, Ld9/a;->a:Ld9/a$b;

    invoke-interface {v13, v8}, Ld9/a$b;->a(Ljava/lang/String;)V

    const-string v8, "-byte body omitted)"

    const-string v13, "UTF_8"

    if-eqz v2, :cond_20e

    invoke-virtual {v3}, LP8/B;->e()LP8/u;

    move-result-object v5

    const-wide/16 v16, -0x1

    if-eqz v7, :cond_f0

    invoke-virtual {v7}, LP8/C;->b()LP8/x;

    move-result-object v14

    if-eqz v14, :cond_c6

    const-string v15, "Content-Type"

    invoke-virtual {v5, v15}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_c6

    iget-object v15, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Content-Type: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v15, v6}, Ld9/a$b;->a(Ljava/lang/String;)V

    :cond_c6
    invoke-virtual {v7}, LP8/C;->a()J

    move-result-wide v14

    cmp-long v6, v14, v16

    if-eqz v6, :cond_f0

    const-string v6, "Content-Length"

    invoke-virtual {v5, v6}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_f0

    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Content-Length: "

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, LP8/C;->a()J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v6, v10}, Ld9/a$b;->a(Ljava/lang/String;)V

    :cond_f0
    invoke-virtual {v5}, LP8/u;->size()I

    move-result v6

    const/4 v10, 0x0

    :goto_f5
    if-ge v10, v6, :cond_fd

    invoke-direct {v1, v5, v10}, Ld9/a;->c(LP8/u;I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_f5

    :cond_fd
    const-string v5, "--> END "

    if-eqz v4, :cond_1f5

    if-nez v7, :cond_105

    goto/16 :goto_1f5

    :cond_105
    invoke-virtual {v3}, LP8/B;->e()LP8/u;

    move-result-object v6

    invoke-direct {v1, v6}, Ld9/a;->b(LP8/u;)Z

    move-result v6

    if-eqz v6, :cond_12e

    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " (encoded body omitted)"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ld9/a$b;->a(Ljava/lang/String;)V

    goto/16 :goto_210

    :cond_12e
    invoke-virtual {v7}, LP8/C;->e()Z

    move-result v6

    if-eqz v6, :cond_153

    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " (duplex request body omitted)"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ld9/a$b;->a(Ljava/lang/String;)V

    goto/16 :goto_210

    :cond_153
    invoke-virtual {v7}, LP8/C;->f()Z

    move-result v6

    if-eqz v6, :cond_178

    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " (one-shot body omitted)"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ld9/a$b;->a(Ljava/lang/String;)V

    goto/16 :goto_210

    :cond_178
    new-instance v6, Le9/e;

    invoke-direct {v6}, Le9/e;-><init>()V

    invoke-virtual {v7, v6}, LP8/C;->g(Le9/f;)V

    invoke-virtual {v7}, LP8/C;->b()LP8/x;

    move-result-object v10

    if-eqz v10, :cond_18e

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v10, v14}, LP8/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v10

    if-nez v10, :cond_193

    :cond_18e
    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v10, v13}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_193
    iget-object v14, v1, Ld9/a;->a:Ld9/a$b;

    invoke-interface {v14, v11}, Ld9/a$b;->a(Ljava/lang/String;)V

    invoke-static {v6}, Ld9/b;->a(Le9/e;)Z

    move-result v14

    if-eqz v14, :cond_1cd

    iget-object v14, v1, Ld9/a;->a:Ld9/a$b;

    invoke-virtual {v6, v10}, Le9/e;->h0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v14, v6}, Ld9/a$b;->a(Ljava/lang/String;)V

    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, LP8/C;->a()J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ld9/a$b;->a(Ljava/lang/String;)V

    goto :goto_210

    :cond_1cd
    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " (binary "

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, LP8/C;->a()J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ld9/a$b;->a(Ljava/lang/String;)V

    goto :goto_210

    :cond_1f5
    :goto_1f5
    iget-object v6, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ld9/a$b;->a(Ljava/lang/String;)V

    goto :goto_210

    :cond_20e
    const-wide/16 v16, -0x1

    :goto_210
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    :try_start_214
    invoke-interface {v0, v3}, LP8/w$a;->a(LP8/B;)LP8/D;

    move-result-object v0
    :try_end_218
    .catch Ljava/lang/Exception; {:try_start_214 .. :try_end_218} :catch_3e4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v14

    sub-long/2addr v14, v5

    invoke-virtual {v3, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    invoke-virtual {v0}, LP8/D;->a()LP8/E;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v3}, LP8/E;->f()J

    move-result-wide v14

    cmp-long v7, v14, v16

    if-eqz v7, :cond_244

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, "-byte"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_246

    :cond_244
    const-string v7, "unknown-length"

    :goto_246
    iget-object v10, v1, Ld9/a;->a:Ld9/a$b;

    move-object/from16 p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v2

    const-string v2, "<-- "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LP8/D;->j()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LP8/D;->K()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_26f

    move-object/from16 v17, v3

    move/from16 v18, v4

    move-object v2, v11

    const/16 v4, 0x20

    goto :goto_288

    :cond_26f
    invoke-virtual/range {p1 .. p1}, LP8/D;->K()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v17, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v18, v4

    const/16 v4, 0x20

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_288
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LP8/D;->t0()LP8/B;

    move-result-object v2

    invoke-virtual {v2}, LP8/B;->j()LP8/v;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v16, :cond_2bd

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " body"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2be

    :cond_2bd
    move-object v2, v11

    :goto_2be
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v10, v0}, Ld9/a$b;->a(Ljava/lang/String;)V

    if-eqz v16, :cond_3e3

    invoke-virtual/range {p1 .. p1}, LP8/D;->I()LP8/u;

    move-result-object v0

    invoke-virtual {v0}, LP8/u;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_2d8
    if-ge v5, v2, :cond_2e0

    invoke-direct {v1, v0, v5}, Ld9/a;->c(LP8/u;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2d8

    :cond_2e0
    if-eqz v18, :cond_3dc

    invoke-static/range {p1 .. p1}, LV8/e;->b(LP8/D;)Z

    move-result v2

    if-nez v2, :cond_2ea

    goto/16 :goto_3dc

    :cond_2ea
    invoke-virtual/range {p1 .. p1}, LP8/D;->I()LP8/u;

    move-result-object v2

    invoke-direct {v1, v2}, Ld9/a;->b(LP8/u;)Z

    move-result v2

    if-eqz v2, :cond_2fc

    iget-object v0, v1, Ld9/a;->a:Ld9/a$b;

    const-string v1, "<-- END HTTP (encoded body omitted)"

    invoke-interface {v0, v1}, Ld9/a$b;->a(Ljava/lang/String;)V

    return-object p1

    :cond_2fc
    invoke-virtual/range {v17 .. v17}, LP8/E;->u()Le9/g;

    move-result-object v2

    const-wide v3, 0x7fffffffffffffffL

    invoke-interface {v2, v3, v4}, Le9/g;->u0(J)Z

    invoke-interface {v2}, Le9/g;->d()Le9/e;

    move-result-object v2

    const-string v3, "Content-Encoding"

    invoke-virtual {v0, v3}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "gzip"

    const/4 v4, 0x1

    invoke-static {v3, v0, v4}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_342

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v4, Le9/l;

    invoke-virtual {v2}, Le9/e;->G()Le9/e;

    move-result-object v2

    invoke-direct {v4, v2}, Le9/l;-><init>(Le9/B;)V

    :try_start_32d
    new-instance v2, Le9/e;

    invoke-direct {v2}, Le9/e;-><init>()V

    invoke-virtual {v2, v4}, Le9/e;->l1(Le9/B;)J
    :try_end_335
    .catchall {:try_start_32d .. :try_end_335} :catchall_33a

    invoke-static {v4, v3}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    move-object v3, v0

    goto :goto_342

    :catchall_33a
    move-exception v0

    move-object v1, v0

    :try_start_33c
    throw v1
    :try_end_33d
    .catchall {:try_start_33c .. :try_end_33d} :catchall_33d

    :catchall_33d
    move-exception v0

    invoke-static {v4, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_342
    :goto_342
    invoke-virtual/range {v17 .. v17}, LP8/E;->g()LP8/x;

    move-result-object v0

    if-eqz v0, :cond_350

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v4}, LP8/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    if-nez v0, :cond_355

    :cond_350
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v13}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_355
    invoke-static {v2}, Ld9/b;->a(Le9/e;)Z

    move-result v4

    if-nez v4, :cond_37e

    iget-object v0, v1, Ld9/a;->a:Ld9/a$b;

    invoke-interface {v0, v11}, Ld9/a$b;->a(Ljava/lang/String;)V

    iget-object v0, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<-- END HTTP (binary "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ld9/a$b;->a(Ljava/lang/String;)V

    return-object p1

    :cond_37e
    const-wide/16 v4, 0x0

    cmp-long v4, v14, v4

    if-eqz v4, :cond_396

    iget-object v4, v1, Ld9/a;->a:Ld9/a$b;

    invoke-interface {v4, v11}, Ld9/a$b;->a(Ljava/lang/String;)V

    iget-object v4, v1, Ld9/a;->a:Ld9/a$b;

    invoke-virtual {v2}, Le9/e;->G()Le9/e;

    move-result-object v5

    invoke-virtual {v5, v0}, Le9/e;->h0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ld9/a$b;->a(Ljava/lang/String;)V

    :cond_396
    const-string v0, "<-- END HTTP ("

    if-eqz v3, :cond_3c0

    iget-object v1, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "-byte, "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "-gzipped-byte body)"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ld9/a$b;->a(Ljava/lang/String;)V

    return-object p1

    :cond_3c0
    iget-object v1, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ld9/a$b;->a(Ljava/lang/String;)V

    return-object p1

    :cond_3dc
    :goto_3dc
    iget-object v0, v1, Ld9/a;->a:Ld9/a$b;

    const-string v1, "<-- END HTTP"

    invoke-interface {v0, v1}, Ld9/a$b;->a(Ljava/lang/String;)V

    :cond_3e3
    return-object p1

    :catch_3e4
    move-exception v0

    iget-object v1, v1, Ld9/a;->a:Ld9/a$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<-- HTTP FAILED: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ld9/a$b;->a(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Ld9/a$a;)Ld9/a;
    .registers 3

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ld9/a;->c:Ld9/a$a;

    return-object p0
.end method
