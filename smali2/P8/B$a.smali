.class public LP8/B$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LP8/v;

.field private b:Ljava/lang/String;

.field private c:LP8/u$a;

.field private d:LP8/C;

.field private e:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LP8/B$a;->e:Ljava/util/Map;

    .line 3
    const-string v0, "GET"

    iput-object v0, p0, LP8/B$a;->b:Ljava/lang/String;

    .line 4
    new-instance v0, LP8/u$a;

    invoke-direct {v0}, LP8/u$a;-><init>()V

    iput-object v0, p0, LP8/B$a;->c:LP8/u$a;

    return-void
.end method

.method public constructor <init>(LP8/B;)V
    .registers 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LP8/B$a;->e:Ljava/util/Map;

    .line 7
    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object v0

    iput-object v0, p0, LP8/B$a;->a:LP8/v;

    .line 8
    invoke-virtual {p1}, LP8/B;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LP8/B$a;->b:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, LP8/B;->a()LP8/C;

    move-result-object v0

    iput-object v0, p0, LP8/B$a;->d:LP8/C;

    .line 10
    invoke-virtual {p1}, LP8/B;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_31

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_39

    .line 12
    :cond_31
    invoke-virtual {p1}, LP8/B;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Li8/N;->r(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 13
    :goto_39
    iput-object v0, p0, LP8/B$a;->e:Ljava/util/Map;

    .line 14
    invoke-virtual {p1}, LP8/B;->e()LP8/u;

    move-result-object p1

    invoke-virtual {p1}, LP8/u;->f()LP8/u$a;

    move-result-object p1

    iput-object p1, p0, LP8/B$a;->c:LP8/u$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/B$a;->c:LP8/u$a;

    invoke-virtual {v0, p1, p2}, LP8/u$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public b()LP8/B;
    .registers 7

    iget-object v1, p0, LP8/B$a;->a:LP8/v;

    if-eqz v1, :cond_1a

    iget-object v2, p0, LP8/B$a;->b:Ljava/lang/String;

    iget-object v0, p0, LP8/B$a;->c:LP8/u$a;

    invoke-virtual {v0}, LP8/u$a;->f()LP8/u;

    move-result-object v3

    iget-object v4, p0, LP8/B$a;->d:LP8/C;

    iget-object p0, p0, LP8/B$a;->e:Ljava/util/Map;

    invoke-static {p0}, LQ8/d;->T(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    new-instance v0, LP8/B;

    invoke-direct/range {v0 .. v5}, LP8/B;-><init>(LP8/v;Ljava/lang/String;LP8/u;LP8/C;Ljava/util/Map;)V

    return-object v0

    :cond_1a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "url == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/B$a;->c:LP8/u$a;

    invoke-virtual {v0, p1, p2}, LP8/u$a;->i(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public d(LP8/u;)LP8/B$a;
    .registers 3

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP8/u;->f()LP8/u$a;

    move-result-object p1

    iput-object p1, p0, LP8/B$a;->c:LP8/u$a;

    return-object p0
.end method

.method public e(Ljava/lang/String;LP8/C;)LP8/B$a;
    .registers 5

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_5d

    const-string v0, "method "

    if-nez p2, :cond_34

    invoke-static {p1}, LV8/f;->d(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_16

    goto :goto_3a

    :cond_16
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    invoke-static {p1}, LV8/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3f

    :goto_3a
    iput-object p1, p0, LP8/B$a;->b:Ljava/lang/String;

    iput-object p2, p0, LP8/B$a;->d:LP8/C;

    return-object p0

    :cond_3f
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "method.isEmpty() == true"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public f(Ljava/lang/String;)LP8/B$a;
    .registers 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/B$a;->c:LP8/u$a;

    invoke-virtual {v0, p1}, LP8/u$a;->h(Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public g(Ljava/lang/Class;Ljava/lang/Object;)LP8/B$a;
    .registers 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_d

    iget-object p2, p0, LP8/B$a;->e:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_d
    iget-object v0, p0, LP8/B$a;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LP8/B$a;->e:Ljava/util/Map;

    :cond_1c
    iget-object v0, p0, LP8/B$a;->e:Ljava/util/Map;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public h(LP8/v;)LP8/B$a;
    .registers 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/B$a;->a:LP8/v;

    return-object p0
.end method
