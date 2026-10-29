.class public final Lj8/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final q:Lj8/d;

.field private final r:I

.field private final s:I


# direct methods
.method public constructor <init>(Lj8/d;I)V
    .registers 4

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/d$c;->q:Lj8/d;

    iput p2, p0, Lj8/d$c;->r:I

    invoke-static {p1}, Lj8/d;->f(Lj8/d;)I

    move-result p1

    iput p1, p0, Lj8/d$c;->s:I

    return-void
.end method

.method private final a()V
    .registers 2

    iget-object v0, p0, Lj8/d$c;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->f(Lj8/d;)I

    move-result v0

    iget p0, p0, Lj8/d$c;->s:I

    if-ne v0, p0, :cond_b

    return-void

    :cond_b
    new-instance p0, Ljava/util/ConcurrentModificationException;

    const-string v0, "The backing map has been modified after this entry was obtained."

    invoke-direct {p0, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_24

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lj8/d$c;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lj8/d$c;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_24

    const/4 p0, 0x1

    return p0

    :cond_24
    const/4 p0, 0x0

    return p0
.end method

.method public getKey()Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, Lj8/d$c;->a()V

    iget-object v0, p0, Lj8/d$c;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->c(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    iget p0, p0, Lj8/d$c;->r:I

    aget-object p0, v0, p0

    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, Lj8/d$c;->a()V

    iget-object v0, p0, Lj8/d$c;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->h(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p0, p0, Lj8/d$c;->r:I

    aget-object p0, v0, p0

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    invoke-virtual {p0}, Lj8/d$c;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_d

    :cond_c
    move v0, v1

    :goto_d
    invoke-virtual {p0}, Lj8/d$c;->getValue()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_17
    xor-int p0, v0, v1

    return p0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0}, Lj8/d$c;->a()V

    iget-object v0, p0, Lj8/d$c;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    iget-object v0, p0, Lj8/d$c;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->a(Lj8/d;)[Ljava/lang/Object;

    move-result-object v0

    iget p0, p0, Lj8/d$c;->r:I

    aget-object v1, v0, p0

    aput-object p1, v0, p0

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lj8/d$c;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj8/d$c;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
