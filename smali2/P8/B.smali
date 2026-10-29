.class public final LP8/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/B$a;
    }
.end annotation


# instance fields
.field private final a:LP8/v;

.field private final b:Ljava/lang/String;

.field private final c:LP8/u;

.field private final d:LP8/C;

.field private final e:Ljava/util/Map;

.field private f:LP8/d;


# direct methods
.method public constructor <init>(LP8/v;Ljava/lang/String;LP8/u;LP8/C;Ljava/util/Map;)V
    .registers 7

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP8/B;->a:LP8/v;

    iput-object p2, p0, LP8/B;->b:Ljava/lang/String;

    iput-object p3, p0, LP8/B;->c:LP8/u;

    iput-object p4, p0, LP8/B;->d:LP8/C;

    iput-object p5, p0, LP8/B;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()LP8/C;
    .registers 1

    iget-object p0, p0, LP8/B;->d:LP8/C;

    return-object p0
.end method

.method public final b()LP8/d;
    .registers 3

    iget-object v0, p0, LP8/B;->f:LP8/d;

    if-nez v0, :cond_e

    sget-object v0, LP8/d;->n:LP8/d$b;

    iget-object v1, p0, LP8/B;->c:LP8/u;

    invoke-virtual {v0, v1}, LP8/d$b;->b(LP8/u;)LP8/d;

    move-result-object v0

    iput-object v0, p0, LP8/B;->f:LP8/d;

    :cond_e
    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .registers 1

    iget-object p0, p0, LP8/B;->e:Ljava/util/Map;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LP8/B;->c:LP8/u;

    invoke-virtual {p0, p1}, LP8/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final e()LP8/u;
    .registers 1

    iget-object p0, p0, LP8/B;->c:LP8/u;

    return-object p0
.end method

.method public final f()Z
    .registers 1

    iget-object p0, p0, LP8/B;->a:LP8/v;

    invoke-virtual {p0}, LP8/v;->j()Z

    move-result p0

    return p0
.end method

.method public final g()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/B;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final h()LP8/B$a;
    .registers 2

    new-instance v0, LP8/B$a;

    invoke-direct {v0, p0}, LP8/B$a;-><init>(LP8/B;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Class;)Ljava/lang/Object;
    .registers 3

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LP8/B;->e:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final j()LP8/v;
    .registers 1

    iget-object p0, p0, LP8/B;->a:LP8/v;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/B;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/B;->a:LP8/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/B;->c:LP8/u;

    invoke-virtual {v1}, LP8/u;->size()I

    move-result v1

    if-eqz v1, :cond_65

    const-string v1, ", headers=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/B;->c:LP8/u;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_60

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_3e

    invoke-static {}, Li8/s;->t()V

    :cond_3e
    check-cast v3, Lh8/o;

    invoke-virtual {v3}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-lez v2, :cond_53

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_53
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_2d

    :cond_60
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_65
    iget-object v1, p0, LP8/B;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_77

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/B;->e:Ljava/util/Map;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_77
    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
