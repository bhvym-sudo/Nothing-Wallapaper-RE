.class public final LU8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LU8/g;

.field private final b:LP8/a;

.field private final c:LU8/e;

.field private final d:LP8/r;

.field private e:LU8/j$b;

.field private f:LU8/j;

.field private g:I

.field private h:I

.field private i:I

.field private j:LP8/F;


# direct methods
.method public constructor <init>(LU8/g;LP8/a;LU8/e;LP8/r;)V
    .registers 6

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8/d;->a:LU8/g;

    iput-object p2, p0, LU8/d;->b:LP8/a;

    iput-object p3, p0, LU8/d;->c:LU8/e;

    iput-object p4, p0, LU8/d;->d:LP8/r;

    return-void
.end method

.method private final b(IIIIZ)LU8/f;
    .registers 18

    iget-object v0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v0}, LU8/e;->f()Z

    move-result v0

    if-nez v0, :cond_170

    iget-object v0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v0}, LU8/e;->o()LU8/f;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5b

    monitor-enter v1

    :try_start_12
    invoke-virtual {v1}, LU8/f;->q()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {v1}, LU8/f;->A()LP8/F;

    move-result-object v0

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {p0, v0}, LU8/d;->g(LP8/v;)Z

    move-result v0

    if-nez v0, :cond_2b

    goto :goto_30

    :cond_2b
    move-object v0, v2

    goto :goto_36

    :catchall_2d
    move-exception v0

    move-object p0, v0

    goto :goto_59

    :cond_30
    :goto_30
    iget-object v0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v0}, LU8/e;->A()Ljava/net/Socket;

    move-result-object v0

    :goto_36
    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_38
    .catchall {:try_start_12 .. :try_end_38} :catchall_2d

    monitor-exit v1

    iget-object v3, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v3}, LU8/e;->o()LU8/f;

    move-result-object v3

    if-eqz v3, :cond_4c

    if-nez v0, :cond_44

    return-object v1

    :cond_44
    const-string p0, "Check failed."

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4c
    if-eqz v0, :cond_51

    invoke-static {v0}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_51
    iget-object v0, p0, LU8/d;->d:LP8/r;

    iget-object v3, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v0, v3, v1}, LP8/r;->k(LP8/e;LP8/j;)V

    goto :goto_5b

    :goto_59
    monitor-exit v1

    throw p0

    :cond_5b
    :goto_5b
    const/4 v0, 0x0

    iput v0, p0, LU8/d;->g:I

    iput v0, p0, LU8/d;->h:I

    iput v0, p0, LU8/d;->i:I

    iget-object v1, p0, LU8/d;->a:LU8/g;

    iget-object v3, p0, LU8/d;->b:LP8/a;

    iget-object v4, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v1, v3, v4, v2, v0}, LU8/g;->a(LP8/a;LU8/e;Ljava/util/List;Z)Z

    move-result v1

    if-eqz v1, :cond_7f

    iget-object p1, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1}, LU8/e;->o()LU8/f;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p2, p0, LU8/d;->d:LP8/r;

    iget-object p0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p2, p0, p1}, LP8/r;->j(LP8/e;LP8/j;)V

    return-object p1

    :cond_7f
    iget-object v1, p0, LU8/d;->j:LP8/F;

    if-eqz v1, :cond_8a

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iput-object v2, p0, LU8/d;->j:LP8/F;

    :goto_88
    move-object v3, v2

    goto :goto_ef

    :cond_8a
    iget-object v1, p0, LU8/d;->e:LU8/j$b;

    if-eqz v1, :cond_a1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v1}, LU8/j$b;->b()Z

    move-result v1

    if-eqz v1, :cond_a1

    iget-object v0, p0, LU8/d;->e:LU8/j$b;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LU8/j$b;->c()LP8/F;

    move-result-object v1

    goto :goto_88

    :cond_a1
    iget-object v1, p0, LU8/d;->f:LU8/j;

    if-nez v1, :cond_bc

    new-instance v1, LU8/j;

    iget-object v3, p0, LU8/d;->b:LP8/a;

    iget-object v4, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v4}, LU8/e;->n()LP8/z;

    move-result-object v4

    invoke-virtual {v4}, LP8/z;->v()LU8/h;

    move-result-object v4

    iget-object v5, p0, LU8/d;->c:LU8/e;

    iget-object v6, p0, LU8/d;->d:LP8/r;

    invoke-direct {v1, v3, v4, v5, v6}, LU8/j;-><init>(LP8/a;LU8/h;LP8/e;LP8/r;)V

    iput-object v1, p0, LU8/d;->f:LU8/j;

    :cond_bc
    invoke-virtual {v1}, LU8/j;->c()LU8/j$b;

    move-result-object v1

    iput-object v1, p0, LU8/d;->e:LU8/j$b;

    invoke-virtual {v1}, LU8/j$b;->a()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v4}, LU8/e;->f()Z

    move-result v4

    if-nez v4, :cond_168

    iget-object v4, p0, LU8/d;->a:LU8/g;

    iget-object v5, p0, LU8/d;->b:LP8/a;

    iget-object v6, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v4, v5, v6, v3, v0}, LU8/g;->a(LP8/a;LU8/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_eb

    iget-object p1, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1}, LU8/e;->o()LU8/f;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p2, p0, LU8/d;->d:LP8/r;

    iget-object p0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p2, p0, p1}, LP8/r;->j(LP8/e;LP8/j;)V

    return-object p1

    :cond_eb
    invoke-virtual {v1}, LU8/j$b;->c()LP8/F;

    move-result-object v1

    :goto_ef
    new-instance v4, LU8/f;

    iget-object v0, p0, LU8/d;->a:LU8/g;

    invoke-direct {v4, v0, v1}, LU8/f;-><init>(LU8/g;LP8/F;)V

    iget-object v0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v0, v4}, LU8/e;->D(LU8/f;)V

    :try_start_fb
    iget-object v10, p0, LU8/d;->c:LU8/e;

    iget-object v11, p0, LU8/d;->d:LP8/r;

    move v5, p1

    move v6, p2

    move v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    invoke-virtual/range {v4 .. v11}, LU8/f;->g(IIIIZLP8/e;LP8/r;)V
    :try_end_109
    .catchall {:try_start_fb .. :try_end_109} :catchall_160

    iget-object p1, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1, v2}, LU8/e;->D(LU8/f;)V

    iget-object p1, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1}, LU8/e;->n()LP8/z;

    move-result-object p1

    invoke-virtual {p1}, LP8/z;->v()LU8/h;

    move-result-object p1

    invoke-virtual {v4}, LU8/f;->A()LP8/F;

    move-result-object p2

    invoke-virtual {p1, p2}, LU8/h;->a(LP8/F;)V

    iget-object p1, p0, LU8/d;->a:LU8/g;

    iget-object p2, p0, LU8/d;->b:LP8/a;

    iget-object v0, p0, LU8/d;->c:LU8/e;

    const/4 v2, 0x1

    invoke-virtual {p1, p2, v0, v3, v2}, LU8/g;->a(LP8/a;LU8/e;Ljava/util/List;Z)Z

    move-result p1

    if-eqz p1, :cond_146

    iget-object p1, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1}, LU8/e;->o()LU8/f;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iput-object v1, p0, LU8/d;->j:LP8/F;

    invoke-virtual {v4}, LU8/f;->E()Ljava/net/Socket;

    move-result-object p2

    invoke-static {p2}, LQ8/d;->n(Ljava/net/Socket;)V

    iget-object p2, p0, LU8/d;->d:LP8/r;

    iget-object p0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p2, p0, p1}, LP8/r;->j(LP8/e;LP8/j;)V

    return-object p1

    :cond_146
    monitor-enter v4

    :try_start_147
    iget-object p1, p0, LU8/d;->a:LU8/g;

    invoke-virtual {p1, v4}, LU8/g;->e(LU8/f;)V

    iget-object p1, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1, v4}, LU8/e;->e(LU8/f;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_153
    .catchall {:try_start_147 .. :try_end_153} :catchall_15c

    monitor-exit v4

    iget-object p1, p0, LU8/d;->d:LP8/r;

    iget-object p0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p1, p0, v4}, LP8/r;->j(LP8/e;LP8/j;)V

    return-object v4

    :catchall_15c
    move-exception v0

    move-object p0, v0

    monitor-exit v4

    throw p0

    :catchall_160
    move-exception v0

    move-object p1, v0

    iget-object p0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {p0, v2}, LU8/e;->D(LU8/f;)V

    throw p1

    :cond_168
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Canceled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_170
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Canceled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final c(IIIIZZ)LU8/f;
    .registers 9

    :cond_0
    :goto_0
    invoke-direct/range {p0 .. p5}, LU8/d;->b(IIIIZ)LU8/f;

    move-result-object v0

    invoke-virtual {v0, p6}, LU8/f;->v(Z)Z

    move-result v1

    if-eqz v1, :cond_b

    return-object v0

    :cond_b
    invoke-virtual {v0}, LU8/f;->z()V

    iget-object v0, p0, LU8/d;->j:LP8/F;

    if-nez v0, :cond_0

    iget-object v0, p0, LU8/d;->e:LU8/j$b;

    const/4 v1, 0x1

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, LU8/j$b;->b()Z

    move-result v0

    goto :goto_1d

    :cond_1c
    move v0, v1

    :goto_1d
    if-nez v0, :cond_0

    iget-object v0, p0, LU8/d;->f:LU8/j;

    if-eqz v0, :cond_27

    invoke-virtual {v0}, LU8/j;->a()Z

    move-result v1

    :cond_27
    if-eqz v1, :cond_2a

    goto :goto_0

    :cond_2a
    new-instance p0, Ljava/io/IOException;

    const-string p1, "exhausted all routes"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final f()LP8/F;
    .registers 4

    iget v0, p0, LU8/d;->g:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_44

    iget v0, p0, LU8/d;->h:I

    if-gt v0, v2, :cond_44

    iget v0, p0, LU8/d;->i:I

    if-lez v0, :cond_f

    goto :goto_44

    :cond_f
    iget-object v0, p0, LU8/d;->c:LU8/e;

    invoke-virtual {v0}, LU8/e;->o()LU8/f;

    move-result-object v0

    if-nez v0, :cond_18

    return-object v1

    :cond_18
    monitor-enter v0

    :try_start_19
    invoke-virtual {v0}, LU8/f;->r()I

    move-result v2
    :try_end_1d
    .catchall {:try_start_19 .. :try_end_1d} :catchall_41

    if-eqz v2, :cond_21

    monitor-exit v0

    return-object v1

    :cond_21
    :try_start_21
    invoke-virtual {v0}, LU8/f;->A()LP8/F;

    move-result-object v2

    invoke-virtual {v2}, LP8/F;->a()LP8/a;

    move-result-object v2

    invoke-virtual {v2}, LP8/a;->l()LP8/v;

    move-result-object v2

    iget-object p0, p0, LU8/d;->b:LP8/a;

    invoke-virtual {p0}, LP8/a;->l()LP8/v;

    move-result-object p0

    invoke-static {v2, p0}, LQ8/d;->j(LP8/v;LP8/v;)Z

    move-result p0
    :try_end_37
    .catchall {:try_start_21 .. :try_end_37} :catchall_41

    if-nez p0, :cond_3b

    monitor-exit v0

    return-object v1

    :cond_3b
    :try_start_3b
    invoke-virtual {v0}, LU8/f;->A()LP8/F;

    move-result-object p0
    :try_end_3f
    .catchall {:try_start_3b .. :try_end_3f} :catchall_41

    monitor-exit v0

    return-object p0

    :catchall_41
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_44
    :goto_44
    return-object v1
.end method


# virtual methods
.method public final a(LP8/z;LV8/g;)LV8/d;
    .registers 11

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_a
    invoke-virtual {p2}, LV8/g;->g()I

    move-result v2

    invoke-virtual {p2}, LV8/g;->i()I

    move-result v3

    invoke-virtual {p2}, LV8/g;->k()I

    move-result v4

    invoke-virtual {p1}, LP8/z;->A()I

    move-result v5

    invoke-virtual {p1}, LP8/z;->H()Z

    move-result v6

    invoke-virtual {p2}, LV8/g;->j()LP8/B;

    move-result-object v0

    invoke-virtual {v0}, LP8/B;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_2c
    .catch LU8/i; {:try_start_a .. :try_end_2c} :catch_41
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_2c} :catch_3e

    xor-int/lit8 v7, v0, 0x1

    move-object v1, p0

    :try_start_2f
    invoke-direct/range {v1 .. v7}, LU8/d;->c(IIIIZZ)LU8/f;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, LU8/f;->x(LP8/z;LV8/g;)LV8/d;

    move-result-object p0
    :try_end_37
    .catch LU8/i; {:try_start_2f .. :try_end_37} :catch_3b
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_37} :catch_38

    return-object p0

    :catch_38
    move-exception v0

    :goto_39
    move-object p0, v0

    goto :goto_44

    :catch_3b
    move-exception v0

    :goto_3c
    move-object p0, v0

    goto :goto_4d

    :catch_3e
    move-exception v0

    move-object v1, p0

    goto :goto_39

    :catch_41
    move-exception v0

    move-object v1, p0

    goto :goto_3c

    :goto_44
    invoke-virtual {v1, p0}, LU8/d;->h(Ljava/io/IOException;)V

    new-instance p1, LU8/i;

    invoke-direct {p1, p0}, LU8/i;-><init>(Ljava/io/IOException;)V

    throw p1

    :goto_4d
    invoke-virtual {p0}, LU8/i;->c()Ljava/io/IOException;

    move-result-object p1

    invoke-virtual {v1, p1}, LU8/d;->h(Ljava/io/IOException;)V

    throw p0
.end method

.method public final d()LP8/a;
    .registers 1

    iget-object p0, p0, LU8/d;->b:LP8/a;

    return-object p0
.end method

.method public final e()Z
    .registers 3

    iget v0, p0, LU8/d;->g:I

    if-nez v0, :cond_e

    iget v0, p0, LU8/d;->h:I

    if-nez v0, :cond_e

    iget v0, p0, LU8/d;->i:I

    if-nez v0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    iget-object v0, p0, LU8/d;->j:LP8/F;

    const/4 v1, 0x1

    if-eqz v0, :cond_14

    return v1

    :cond_14
    invoke-direct {p0}, LU8/d;->f()LP8/F;

    move-result-object v0

    if-eqz v0, :cond_1d

    iput-object v0, p0, LU8/d;->j:LP8/F;

    return v1

    :cond_1d
    iget-object v0, p0, LU8/d;->e:LU8/j$b;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, LU8/j$b;->b()Z

    move-result v0

    if-ne v0, v1, :cond_28

    return v1

    :cond_28
    iget-object p0, p0, LU8/d;->f:LU8/j;

    if-nez p0, :cond_2d

    return v1

    :cond_2d
    invoke-virtual {p0}, LU8/j;->a()Z

    move-result p0

    return p0
.end method

.method public final g(LP8/v;)Z
    .registers 4

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LU8/d;->b:LP8/a;

    invoke-virtual {p0}, LP8/a;->l()LP8/v;

    move-result-object p0

    invoke-virtual {p1}, LP8/v;->n()I

    move-result v0

    invoke-virtual {p0}, LP8/v;->n()I

    move-result v1

    if-ne v0, v1, :cond_25

    invoke-virtual {p1}, LP8/v;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LP8/v;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_25

    const/4 p0, 0x1

    return p0

    :cond_25
    const/4 p0, 0x0

    return p0
.end method

.method public final h(Ljava/io/IOException;)V
    .registers 4

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, LU8/d;->j:LP8/F;

    instance-of v0, p1, LX8/n;

    if-eqz v0, :cond_1c

    move-object v0, p1

    check-cast v0, LX8/n;

    iget-object v0, v0, LX8/n;->q:LX8/b;

    sget-object v1, LX8/b;->z:LX8/b;

    if-ne v0, v1, :cond_1c

    iget p1, p0, LU8/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LU8/d;->g:I

    return-void

    :cond_1c
    instance-of p1, p1, LX8/a;

    if-eqz p1, :cond_27

    iget p1, p0, LU8/d;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LU8/d;->h:I

    return-void

    :cond_27
    iget p1, p0, LU8/d;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LU8/d;->i:I

    return-void
.end method
