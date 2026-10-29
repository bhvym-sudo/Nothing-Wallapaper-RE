.class public final Lj8/h;
.super Li8/i;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Lw8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/h$a;
    }
.end annotation


# static fields
.field private static final r:Lj8/h$a;

.field private static final s:Lj8/h;


# instance fields
.field private final q:Lj8/d;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lj8/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/h$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lj8/h;->r:Lj8/h$a;

    new-instance v0, Lj8/h;

    sget-object v1, Lj8/d;->D:Lj8/d$a;

    invoke-virtual {v1}, Lj8/d$a;->e()Lj8/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lj8/h;-><init>(Lj8/d;)V

    sput-object v0, Lj8/h;->s:Lj8/h;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 3
    new-instance v0, Lj8/d;

    invoke-direct {v0}, Lj8/d;-><init>()V

    invoke-direct {p0, v0}, Lj8/h;-><init>(Lj8/d;)V

    return-void
.end method

.method public constructor <init>(Lj8/d;)V
    .registers 3

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Li8/i;-><init>()V

    .line 2
    iput-object p1, p0, Lj8/h;->q:Lj8/d;

    return-void
.end method


# virtual methods
.method public a()I
    .registers 1

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result p0

    return p0
.end method

.method public add(Ljava/lang/Object;)Z
    .registers 2

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0, p1}, Lj8/d;->k(Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public final b()Ljava/util/Set;
    .registers 2

    iget-object v0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->m()Ljava/util/Map;

    invoke-virtual {p0}, Li8/i;->size()I

    move-result v0

    if-lez v0, :cond_c

    return-object p0

    :cond_c
    sget-object p0, Lj8/h;->s:Lj8/h;

    return-object p0
.end method

.method public clear()V
    .registers 1

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .registers 2

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0, p1}, Lj8/d;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public isEmpty()Z
    .registers 1

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 1

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0}, Lj8/d;->E()Lj8/d$e;

    move-result-object p0

    return-object p0
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 2

    iget-object p0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {p0, p1}, Lj8/d;->N(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/h;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method
