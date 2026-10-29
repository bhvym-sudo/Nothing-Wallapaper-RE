.class Lb6/c$i;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "i"
.end annotation


# instance fields
.field final synthetic q:Lb6/c;


# direct methods
.method private constructor <init>(Lb6/c;)V
    .registers 2

    .line 2
    iput-object p1, p0, Lb6/c$i;->q:Lb6/c;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb6/c;Lb6/d;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lb6/c$i;-><init>(Lb6/c;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .registers 1

    iget-object p0, p0, Lb6/c$i;->q:Lb6/c;

    invoke-virtual {p0}, Lb6/c;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .registers 4

    if-eqz p1, :cond_2b

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2b

    check-cast p1, Ljava/util/Map$Entry;

    iget-object p0, p0, Lb6/c$i;->q:Lb6/c;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lb6/c$m;->r:Lb6/c$m;

    invoke-virtual {p0, v0, v1}, Lb6/c;->i(Ljava/lang/Object;Lb6/c$m;)Lb6/c$j;

    move-result-object p0

    if-eqz p0, :cond_1b

    invoke-interface {p0}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object p0

    goto :goto_1c

    :cond_1b
    const/4 p0, 0x0

    :goto_1c
    if-eqz p0, :cond_2b

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lb6/c$g;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0}, Lb6/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2b
    const/4 p0, 0x0

    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, Lb6/c$h;

    iget-object p0, p0, Lb6/c$i;->q:Lb6/c;

    invoke-direct {v0, p0}, Lb6/c$h;-><init>(Lb6/c;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_15

    check-cast p1, Ljava/util/Map$Entry;

    iget-object p0, p0, Lb6/c$i;->q:Lb6/c;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lb6/c;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method public size()I
    .registers 1

    iget-object p0, p0, Lb6/c$i;->q:Lb6/c;

    invoke-virtual {p0}, Lb6/c;->size()I

    move-result p0

    return p0
.end method
