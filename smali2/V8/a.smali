.class public final LV8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# instance fields
.field private final a:LP8/n;


# direct methods
.method public constructor <init>(LP8/n;)V
    .registers 3

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV8/a;->a:LP8/n;

    return-void
.end method

.method private final b(Ljava/util/List;)Ljava/lang/String;
    .registers 5

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_1d

    invoke-static {}, Li8/s;->t()V

    :cond_1d
    check-cast v1, LP8/m;

    if-lez v0, :cond_26

    const-string v0, "; "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_26
    invoke-virtual {v1}, LP8/m;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LP8/m;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v0, v2

    goto :goto_c

    :cond_3b
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 14

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP8/w$a;->b()LP8/B;

    move-result-object v0

    invoke-virtual {v0}, LP8/B;->h()LP8/B$a;

    move-result-object v1

    invoke-virtual {v0}, LP8/B;->a()LP8/C;

    move-result-object v2

    const-wide/16 v3, -0x1

    const-string v5, "Content-Type"

    const-string v6, "Content-Length"

    if-eqz v2, :cond_43

    invoke-virtual {v2}, LP8/C;->b()LP8/x;

    move-result-object v7

    if-eqz v7, :cond_26

    invoke-virtual {v7}, LP8/x;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    :cond_26
    invoke-virtual {v2}, LP8/C;->a()J

    move-result-wide v7

    cmp-long v2, v7, v3

    const-string v9, "Transfer-Encoding"

    if-eqz v2, :cond_3b

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    invoke-virtual {v1, v9}, LP8/B$a;->f(Ljava/lang/String;)LP8/B$a;

    goto :goto_43

    :cond_3b
    const-string v2, "chunked"

    invoke-virtual {v1, v9, v2}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    invoke-virtual {v1, v6}, LP8/B$a;->f(Ljava/lang/String;)LP8/B$a;

    :cond_43
    :goto_43
    const-string v2, "Host"

    invoke-virtual {v0, v2}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v7, :cond_59

    invoke-virtual {v0}, LP8/B;->j()LP8/v;

    move-result-object v7

    invoke-static {v7, v8, v9, v10}, LQ8/d;->R(LP8/v;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    :cond_59
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_66

    const-string v7, "Keep-Alive"

    invoke-virtual {v1, v2, v7}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    :cond_66
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "gzip"

    if-nez v7, :cond_7c

    const-string v7, "Range"

    invoke-virtual {v0, v7}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7c

    invoke-virtual {v1, v2, v11}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move v8, v9

    :cond_7c
    iget-object v2, p0, LV8/a;->a:LP8/n;

    invoke-virtual {v0}, LP8/B;->j()LP8/v;

    move-result-object v7

    invoke-interface {v2, v7}, LP8/n;->b(LP8/v;)Ljava/util/List;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_98

    const-string v7, "Cookie"

    invoke-direct {p0, v2}, LV8/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    :cond_98
    const-string v2, "User-Agent"

    invoke-virtual {v0, v2}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_a5

    const-string v7, "okhttp/4.12.0"

    invoke-virtual {v1, v2, v7}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    :cond_a5
    invoke-virtual {v1}, LP8/B$a;->b()LP8/B;

    move-result-object v1

    invoke-interface {p1, v1}, LP8/w$a;->a(LP8/B;)LP8/D;

    move-result-object p1

    iget-object p0, p0, LV8/a;->a:LP8/n;

    invoke-virtual {v0}, LP8/B;->j()LP8/v;

    move-result-object v1

    invoke-virtual {p1}, LP8/D;->I()LP8/u;

    move-result-object v2

    invoke-static {p0, v1, v2}, LV8/e;->f(LP8/n;LP8/v;LP8/u;)V

    invoke-virtual {p1}, LP8/D;->U()LP8/D$a;

    move-result-object p0

    invoke-virtual {p0, v0}, LP8/D$a;->r(LP8/B;)LP8/D$a;

    move-result-object p0

    if-eqz v8, :cond_10d

    const-string v0, "Content-Encoding"

    const/4 v1, 0x2

    invoke-static {p1, v0, v10, v1, v10}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2, v9}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_10d

    invoke-static {p1}, LV8/e;->b(LP8/D;)Z

    move-result v2

    if-eqz v2, :cond_10d

    invoke-virtual {p1}, LP8/D;->a()LP8/E;

    move-result-object v2

    if-eqz v2, :cond_10d

    new-instance v7, Le9/l;

    invoke-virtual {v2}, LP8/E;->u()Le9/g;

    move-result-object v2

    invoke-direct {v7, v2}, Le9/l;-><init>(Le9/B;)V

    invoke-virtual {p1}, LP8/D;->I()LP8/u;

    move-result-object v2

    invoke-virtual {v2}, LP8/u;->f()LP8/u$a;

    move-result-object v2

    invoke-virtual {v2, v0}, LP8/u$a;->h(Ljava/lang/String;)LP8/u$a;

    move-result-object v0

    invoke-virtual {v0, v6}, LP8/u$a;->h(Ljava/lang/String;)LP8/u$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/u$a;->f()LP8/u;

    move-result-object v0

    invoke-virtual {p0, v0}, LP8/D$a;->k(LP8/u;)LP8/D$a;

    invoke-static {p1, v5, v10, v1, v10}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, LV8/h;

    invoke-static {v7}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object v1

    invoke-direct {v0, p1, v3, v4, v1}, LV8/h;-><init>(Ljava/lang/String;JLe9/g;)V

    invoke-virtual {p0, v0}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    :cond_10d
    invoke-virtual {p0}, LP8/D$a;->c()LP8/D;

    move-result-object p0

    return-object p0
.end method
