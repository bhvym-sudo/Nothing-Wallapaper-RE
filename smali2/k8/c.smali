.class abstract Lk8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a([Lv8/l;Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    invoke-static {p0, p1, p2}, Lk8/c;->c([Lv8/l;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static varargs b([Lv8/l;)Ljava/util/Comparator;
    .registers 2

    const-string v0, "selectors"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-lez v0, :cond_e

    new-instance v0, Lk8/b;

    invoke-direct {v0, p0}, Lk8/b;-><init>([Lv8/l;)V

    return-object v0

    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final c([Lv8/l;Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    invoke-static {p1, p2, p0}, Lk8/c;->e(Ljava/lang/Object;Ljava/lang/Object;[Lv8/l;)I

    move-result p0

    return p0
.end method

.method public static d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .registers 2

    if-ne p0, p1, :cond_4

    const/4 p0, 0x0

    return p0

    :cond_4
    if-nez p0, :cond_8

    const/4 p0, -0x1

    return p0

    :cond_8
    if-nez p1, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static final e(Ljava/lang/Object;Ljava/lang/Object;[Lv8/l;)I
    .registers 8

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v2, v0, :cond_1d

    aget-object v3, p2, v2

    invoke-interface {v3, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    invoke-interface {v3, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    invoke-static {v4, v3}, Lk8/c;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v3

    if-eqz v3, :cond_1a

    return v3

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_1d
    return v1
.end method

.method public static f()Ljava/util/Comparator;
    .registers 2

    sget-object v0, Lk8/f;->a:Lk8/f;

    const-string v1, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
