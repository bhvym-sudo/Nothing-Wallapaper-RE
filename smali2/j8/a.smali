.class public abstract Lj8/a;
.super Li8/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Li8/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/Map$Entry;)Z
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj8/a;->f(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lj8/a;->b(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public abstract f(Ljava/util/Map$Entry;)Z
.end method

.method public bridge abstract g(Ljava/util/Map$Entry;)Z
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lj8/a;->g(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method
