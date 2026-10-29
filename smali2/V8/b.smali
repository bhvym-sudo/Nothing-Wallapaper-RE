.class public final LV8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LV8/b;->a:Z

    return-void
.end method

.method private final b(I)Z
    .registers 3

    const/16 p0, 0x64

    const/4 v0, 0x1

    if-ne p1, p0, :cond_6

    return v0

    :cond_6
    const/16 p0, 0x66

    if-gt p0, p1, :cond_f

    const/16 p0, 0xc8

    if-ge p1, p0, :cond_f

    return v0

    :cond_f
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 15

    const-string v0, "Connection"

    const-string v1, "close"

    const-string v2, "chain"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV8/g;

    invoke-virtual {p1}, LV8/g;->h()LU8/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, LV8/g;->j()LP8/B;

    move-result-object p1

    invoke-virtual {p1}, LP8/B;->a()LP8/C;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    :try_start_21
    invoke-virtual {v2, p1}, LU8/c;->u(LP8/B;)V

    invoke-virtual {p1}, LP8/B;->g()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LV8/f;->a(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8c

    if-eqz v3, :cond_8c

    const-string v9, "100-continue"

    const-string v10, "Expect"

    invoke-virtual {p1, v10}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v7}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_51

    invoke-virtual {v2}, LU8/c;->f()V

    invoke-virtual {v2, v7}, LU8/c;->q(Z)LP8/D$a;

    move-result-object v9
    :try_end_45
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_45} :catch_4d

    :try_start_45
    invoke-virtual {v2}, LU8/c;->s()V
    :try_end_48
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_48} :catch_4a

    move v10, v6

    goto :goto_53

    :catch_4a
    move-exception v3

    move v10, v7

    goto :goto_9e

    :catch_4d
    move-exception v3

    move v10, v7

    move-object v9, v8

    goto :goto_9e

    :cond_51
    move v10, v7

    move-object v9, v8

    :goto_53
    if-nez v9, :cond_7b

    :try_start_55
    invoke-virtual {v3}, LP8/C;->e()Z

    move-result v11

    if-eqz v11, :cond_6c

    invoke-virtual {v2}, LU8/c;->f()V

    invoke-virtual {v2, p1, v7}, LU8/c;->c(LP8/B;Z)Le9/z;

    move-result-object v11

    invoke-static {v11}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object v11

    invoke-virtual {v3, v11}, LP8/C;->g(Le9/f;)V

    goto :goto_91

    :catch_6a
    move-exception v3

    goto :goto_9e

    :cond_6c
    invoke-virtual {v2, p1, v6}, LU8/c;->c(LP8/B;Z)Le9/z;

    move-result-object v11

    invoke-static {v11}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object v11

    invoke-virtual {v3, v11}, LP8/C;->g(Le9/f;)V

    invoke-interface {v11}, Le9/z;->close()V

    goto :goto_91

    :cond_7b
    invoke-virtual {v2}, LU8/c;->o()V

    invoke-virtual {v2}, LU8/c;->h()LU8/f;

    move-result-object v11

    invoke-virtual {v11}, LU8/f;->w()Z

    move-result v11

    if-nez v11, :cond_91

    invoke-virtual {v2}, LU8/c;->n()V
    :try_end_8b
    .catch Ljava/io/IOException; {:try_start_55 .. :try_end_8b} :catch_6a

    goto :goto_91

    :cond_8c
    :try_start_8c
    invoke-virtual {v2}, LU8/c;->o()V
    :try_end_8f
    .catch Ljava/io/IOException; {:try_start_8c .. :try_end_8f} :catch_4d

    move v10, v7

    move-object v9, v8

    :cond_91
    :goto_91
    if-eqz v3, :cond_99

    :try_start_93
    invoke-virtual {v3}, LP8/C;->e()Z

    move-result v3

    if-nez v3, :cond_9c

    :cond_99
    invoke-virtual {v2}, LU8/c;->e()V
    :try_end_9c
    .catch Ljava/io/IOException; {:try_start_93 .. :try_end_9c} :catch_6a

    :cond_9c
    move-object v3, v8

    goto :goto_a8

    :goto_9e
    instance-of v11, v3, LX8/a;

    if-nez v11, :cond_1ac

    invoke-virtual {v2}, LU8/c;->k()Z

    move-result v11

    if-eqz v11, :cond_1ab

    :goto_a8
    if-nez v9, :cond_bb

    :try_start_aa
    invoke-virtual {v2, v6}, LU8/c;->q(Z)LP8/D$a;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    if-eqz v10, :cond_bb

    invoke-virtual {v2}, LU8/c;->s()V

    move v10, v6

    goto :goto_bb

    :catch_b8
    move-exception p0

    goto/16 :goto_1a4

    :cond_bb
    :goto_bb
    invoke-virtual {v9, p1}, LP8/D$a;->r(LP8/B;)LP8/D$a;

    move-result-object v9

    invoke-virtual {v2}, LU8/c;->h()LU8/f;

    move-result-object v11

    invoke-virtual {v11}, LU8/f;->s()LP8/t;

    move-result-object v11

    invoke-virtual {v9, v11}, LP8/D$a;->i(LP8/t;)LP8/D$a;

    move-result-object v9

    invoke-virtual {v9, v4, v5}, LP8/D$a;->s(J)LP8/D$a;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, LP8/D$a;->q(J)LP8/D$a;

    move-result-object v9

    invoke-virtual {v9}, LP8/D$a;->c()LP8/D;

    move-result-object v9

    invoke-virtual {v9}, LP8/D;->j()I

    move-result v11

    invoke-direct {p0, v11}, LV8/b;->b(I)Z

    move-result v12

    if-eqz v12, :cond_115

    invoke-virtual {v2, v6}, LU8/c;->q(Z)LP8/D$a;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    if-eqz v10, :cond_f1

    invoke-virtual {v2}, LU8/c;->s()V

    :cond_f1
    invoke-virtual {v6, p1}, LP8/D$a;->r(LP8/B;)LP8/D$a;

    move-result-object p1

    invoke-virtual {v2}, LU8/c;->h()LU8/f;

    move-result-object v6

    invoke-virtual {v6}, LU8/f;->s()LP8/t;

    move-result-object v6

    invoke-virtual {p1, v6}, LP8/D$a;->i(LP8/t;)LP8/D$a;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, LP8/D$a;->s(J)LP8/D$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, LP8/D$a;->q(J)LP8/D$a;

    move-result-object p1

    invoke-virtual {p1}, LP8/D$a;->c()LP8/D;

    move-result-object v9

    invoke-virtual {v9}, LP8/D;->j()I

    move-result v11

    :cond_115
    invoke-virtual {v2, v9}, LU8/c;->r(LP8/D;)V

    iget-boolean p0, p0, LV8/b;->a:Z

    if-eqz p0, :cond_12f

    const/16 p0, 0x65

    if-ne v11, p0, :cond_12f

    invoke-virtual {v9}, LP8/D;->U()LP8/D$a;

    move-result-object p0

    sget-object p1, LQ8/d;->c:LP8/E;

    invoke-virtual {p0, p1}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/D$a;->c()LP8/D;

    move-result-object p0

    goto :goto_13f

    :cond_12f
    invoke-virtual {v9}, LP8/D;->U()LP8/D$a;

    move-result-object p0

    invoke-virtual {v2, v9}, LU8/c;->p(LP8/D;)LP8/E;

    move-result-object p1

    invoke-virtual {p0, p1}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/D$a;->c()LP8/D;

    move-result-object p0

    :goto_13f
    invoke-virtual {p0}, LP8/D;->t0()LP8/B;

    move-result-object p1

    invoke-virtual {p1, v0}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v7}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_158

    const/4 p1, 0x2

    invoke-static {p0, v0, v8, p1, v8}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v7}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_15b

    :cond_158
    invoke-virtual {v2}, LU8/c;->n()V

    :cond_15b
    const/16 p1, 0xcc

    if-eq v11, p1, :cond_163

    const/16 p1, 0xcd

    if-ne v11, p1, :cond_1a3

    :cond_163
    invoke-virtual {p0}, LP8/D;->a()LP8/E;

    move-result-object p1

    if-eqz p1, :cond_16e

    invoke-virtual {p1}, LP8/E;->f()J

    move-result-wide v0

    goto :goto_170

    :cond_16e
    const-wide/16 v0, -0x1

    :goto_170
    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-lez p1, :cond_1a3

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " had non-zero Content-Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LP8/D;->a()LP8/E;

    move-result-object p0

    if-eqz p0, :cond_198

    invoke-virtual {p0}, LP8/E;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :cond_198
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1a3
    .catch Ljava/io/IOException; {:try_start_aa .. :try_end_1a3} :catch_b8

    :cond_1a3
    return-object p0

    :goto_1a4
    if-eqz v3, :cond_1aa

    invoke-static {v3, p0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v3

    :cond_1aa
    throw p0

    :cond_1ab
    throw v3

    :cond_1ac
    throw v3
.end method
