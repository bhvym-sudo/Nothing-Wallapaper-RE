.class public final Lj8/e;
.super Lj8/a;
.source "SourceFile"


# instance fields
.field private final q:Lj8/d;


# direct methods
.method public constructor <init>(Lj8/d;)V
    .registers 3

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj8/a;-><init>()V

    iput-object p1, p0, Lj8/e;->q:Lj8/d;

    return-void
.end method


# virtual methods
.method public a()I
    .registers 1

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result p0

    return p0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .registers 2

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lj8/e;->m(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 2

    const-string p0, "elements"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public clear()V
    .registers 1

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->clear()V

    return-void
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .registers 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0, p1}, Lj8/d;->p(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public f(Ljava/util/Map$Entry;)Z
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0, p1}, Lj8/d;->q(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public g(Ljava/util/Map$Entry;)Z
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0, p1}, Lj8/d;->K(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public isEmpty()Z
    .registers 1

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 1

    iget-object p0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->u()Lj8/d$b;

    move-result-object p0

    return-object p0
.end method

.method public m(Ljava/util/Map$Entry;)Z
    .registers 2

    const-string p0, "element"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/e;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method
