.class public final LU8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU8/c$a;,
        LU8/c$b;
    }
.end annotation


# instance fields
.field private final a:LU8/e;

.field private final b:LP8/r;

.field private final c:LU8/d;

.field private final d:LV8/d;

.field private e:Z

.field private f:Z

.field private final g:LU8/f;


# direct methods
.method public constructor <init>(LU8/e;LP8/r;LU8/d;LV8/d;)V
    .registers 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8/c;->a:LU8/e;

    iput-object p2, p0, LU8/c;->b:LP8/r;

    iput-object p3, p0, LU8/c;->c:LU8/d;

    iput-object p4, p0, LU8/c;->d:LV8/d;

    invoke-interface {p4}, LV8/d;->f()LU8/f;

    move-result-object p1

    iput-object p1, p0, LU8/c;->g:LU8/f;

    return-void
.end method

.method private final t(Ljava/io/IOException;)V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LU8/c;->f:Z

    iget-object v0, p0, LU8/c;->c:LU8/d;

    invoke-virtual {v0, p1}, LU8/d;->h(Ljava/io/IOException;)V

    iget-object v0, p0, LU8/c;->d:LV8/d;

    invoke-interface {v0}, LV8/d;->f()LU8/f;

    move-result-object v0

    iget-object p0, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, p0, p1}, LU8/f;->H(LU8/e;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .registers 8

    if-eqz p5, :cond_5

    invoke-direct {p0, p5}, LU8/c;->t(Ljava/io/IOException;)V

    :cond_5
    if-eqz p4, :cond_18

    if-eqz p5, :cond_11

    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p5}, LP8/r;->r(LP8/e;Ljava/io/IOException;)V

    goto :goto_18

    :cond_11
    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p1, p2}, LP8/r;->p(LP8/e;J)V

    :cond_18
    :goto_18
    if-eqz p3, :cond_2b

    if-eqz p5, :cond_24

    iget-object p1, p0, LU8/c;->b:LP8/r;

    iget-object p2, p0, LU8/c;->a:LU8/e;

    invoke-virtual {p1, p2, p5}, LP8/r;->w(LP8/e;Ljava/io/IOException;)V

    goto :goto_2b

    :cond_24
    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p1, p2}, LP8/r;->u(LP8/e;J)V

    :cond_2b
    :goto_2b
    iget-object p1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {p1, p0, p4, p3, p5}, LU8/e;->w(LU8/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0
.end method

.method public final b()V
    .registers 1

    iget-object p0, p0, LU8/c;->d:LV8/d;

    invoke-interface {p0}, LV8/d;->cancel()V

    return-void
.end method

.method public final c(LP8/B;Z)Le9/z;
    .registers 6

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, LU8/c;->e:Z

    invoke-virtual {p1}, LP8/B;->a()LP8/C;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p2}, LP8/C;->a()J

    move-result-wide v0

    iget-object p2, p0, LU8/c;->b:LP8/r;

    iget-object v2, p0, LU8/c;->a:LU8/e;

    invoke-virtual {p2, v2}, LP8/r;->q(LP8/e;)V

    iget-object p2, p0, LU8/c;->d:LV8/d;

    invoke-interface {p2, p1, v0, v1}, LV8/d;->a(LP8/B;J)Le9/z;

    move-result-object p1

    new-instance p2, LU8/c$a;

    invoke-direct {p2, p0, p1, v0, v1}, LU8/c$a;-><init>(LU8/c;Le9/z;J)V

    return-object p2
.end method

.method public final d()V
    .registers 4

    iget-object v0, p0, LU8/c;->d:LV8/d;

    invoke-interface {v0}, LV8/d;->cancel()V

    iget-object v0, p0, LU8/c;->a:LU8/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, LU8/e;->w(LU8/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final e()V
    .registers 4

    :try_start_0
    iget-object v0, p0, LU8/c;->d:LV8/d;

    invoke-interface {v0}, LV8/d;->c()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception v0

    iget-object v1, p0, LU8/c;->b:LP8/r;

    iget-object v2, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v1, v2, v0}, LP8/r;->r(LP8/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, LU8/c;->t(Ljava/io/IOException;)V

    throw v0
.end method

.method public final f()V
    .registers 4

    :try_start_0
    iget-object v0, p0, LU8/c;->d:LV8/d;

    invoke-interface {v0}, LV8/d;->g()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception v0

    iget-object v1, p0, LU8/c;->b:LP8/r;

    iget-object v2, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v1, v2, v0}, LP8/r;->r(LP8/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, LU8/c;->t(Ljava/io/IOException;)V

    throw v0
.end method

.method public final g()LU8/e;
    .registers 1

    iget-object p0, p0, LU8/c;->a:LU8/e;

    return-object p0
.end method

.method public final h()LU8/f;
    .registers 1

    iget-object p0, p0, LU8/c;->g:LU8/f;

    return-object p0
.end method

.method public final i()LP8/r;
    .registers 1

    iget-object p0, p0, LU8/c;->b:LP8/r;

    return-object p0
.end method

.method public final j()LU8/d;
    .registers 1

    iget-object p0, p0, LU8/c;->c:LU8/d;

    return-object p0
.end method

.method public final k()Z
    .registers 1

    iget-boolean p0, p0, LU8/c;->f:Z

    return p0
.end method

.method public final l()Z
    .registers 2

    iget-object v0, p0, LU8/c;->c:LU8/d;

    invoke-virtual {v0}, LU8/d;->d()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, LU8/c;->g:LU8/f;

    invoke-virtual {p0}, LU8/f;->A()LP8/F;

    move-result-object p0

    invoke-virtual {p0}, LP8/F;->a()LP8/a;

    move-result-object p0

    invoke-virtual {p0}, LP8/a;->l()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final m()Z
    .registers 1

    iget-boolean p0, p0, LU8/c;->e:Z

    return p0
.end method

.method public final n()V
    .registers 1

    iget-object p0, p0, LU8/c;->d:LV8/d;

    invoke-interface {p0}, LV8/d;->f()LU8/f;

    move-result-object p0

    invoke-virtual {p0}, LU8/f;->z()V

    return-void
.end method

.method public final o()V
    .registers 5

    iget-object v0, p0, LU8/c;->a:LU8/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v3, v1, v2}, LU8/e;->w(LU8/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final p(LP8/D;)LP8/E;
    .registers 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    const-string v0, "Content-Type"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LU8/c;->d:LV8/d;

    invoke-interface {v1, p1}, LV8/d;->d(LP8/D;)J

    move-result-wide v1

    iget-object v3, p0, LU8/c;->d:LV8/d;

    invoke-interface {v3, p1}, LV8/d;->b(LP8/D;)Le9/B;

    move-result-object p1

    new-instance v3, LU8/c$b;

    invoke-direct {v3, p0, p1, v1, v2}, LU8/c$b;-><init>(LU8/c;Le9/B;J)V

    new-instance p1, LV8/h;

    invoke-static {v3}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, LV8/h;-><init>(Ljava/lang/String;JLe9/g;)V
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_27} :catch_28

    return-object p1

    :catch_28
    move-exception p1

    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p1}, LP8/r;->w(LP8/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, LU8/c;->t(Ljava/io/IOException;)V

    throw p1
.end method

.method public final q(Z)LP8/D$a;
    .registers 4

    :try_start_0
    iget-object v0, p0, LU8/c;->d:LV8/d;

    invoke-interface {v0, p1}, LV8/d;->e(Z)LP8/D$a;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1, p0}, LP8/D$a;->l(LU8/c;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_b} :catch_c

    return-object p1

    :catch_c
    move-exception p1

    goto :goto_f

    :cond_e
    return-object p1

    :goto_f
    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p1}, LP8/r;->w(LP8/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, LU8/c;->t(Ljava/io/IOException;)V

    throw p1
.end method

.method public final r(LP8/D;)V
    .registers 3

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object p0, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, p0, p1}, LP8/r;->x(LP8/e;LP8/D;)V

    return-void
.end method

.method public final s()V
    .registers 2

    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object p0, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, p0}, LP8/r;->y(LP8/e;)V

    return-void
.end method

.method public final u(LP8/B;)V
    .registers 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1}, LP8/r;->t(LP8/e;)V

    iget-object v0, p0, LU8/c;->d:LV8/d;

    invoke-interface {v0, p1}, LV8/d;->h(LP8/B;)V

    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p1}, LP8/r;->s(LP8/e;LP8/B;)V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_18} :catch_19

    return-void

    :catch_19
    move-exception p1

    iget-object v0, p0, LU8/c;->b:LP8/r;

    iget-object v1, p0, LU8/c;->a:LU8/e;

    invoke-virtual {v0, v1, p1}, LP8/r;->r(LP8/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, LU8/c;->t(Ljava/io/IOException;)V

    throw p1
.end method
