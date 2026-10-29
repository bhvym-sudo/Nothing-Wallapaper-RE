.class public abstract Lkotlin/jvm/internal/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Ljava/util/Collection;
    .registers 2

    instance-of v0, p0, Lw8/a;

    if-eqz v0, :cond_d

    instance-of v0, p0, Lw8/b;

    if-nez v0, :cond_d

    const-string v0, "kotlin.collections.MutableCollection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/I;->n(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_d
    invoke-static {p0}, Lkotlin/jvm/internal/I;->e(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Ljava/util/List;
    .registers 2

    instance-of v0, p0, Lw8/a;

    if-eqz v0, :cond_d

    instance-of v0, p0, Lw8/c;

    if-nez v0, :cond_d

    const-string v0, "kotlin.collections.MutableList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/I;->n(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_d
    invoke-static {p0}, Lkotlin/jvm/internal/I;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Object;)Ljava/util/Map;
    .registers 2

    instance-of v0, p0, Lw8/a;

    if-eqz v0, :cond_d

    instance-of v0, p0, Lw8/d;

    if-nez v0, :cond_d

    const-string v0, "kotlin.collections.MutableMap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/I;->n(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_d
    invoke-static {p0}, Lkotlin/jvm/internal/I;->g(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/Object;I)Ljava/lang/Object;
    .registers 4

    if-eqz p0, :cond_1c

    invoke-static {p0, p1}, Lkotlin/jvm/internal/I;->i(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_1c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "kotlin.jvm.functions.Function"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/I;->n(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1c
    return-object p0
.end method

.method public static e(Ljava/lang/Object;)Ljava/util/Collection;
    .registers 1

    :try_start_0
    check-cast p0, Ljava/util/Collection;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_2} :catch_3

    return-object p0

    :catch_3
    move-exception p0

    invoke-static {p0}, Lkotlin/jvm/internal/I;->m(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;

    move-result-object p0

    throw p0
.end method

.method public static f(Ljava/lang/Object;)Ljava/util/List;
    .registers 1

    :try_start_0
    check-cast p0, Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_2} :catch_3

    return-object p0

    :catch_3
    move-exception p0

    invoke-static {p0}, Lkotlin/jvm/internal/I;->m(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;

    move-result-object p0

    throw p0
.end method

.method public static g(Ljava/lang/Object;)Ljava/util/Map;
    .registers 1

    :try_start_0
    check-cast p0, Ljava/util/Map;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_2} :catch_3

    return-object p0

    :catch_3
    move-exception p0

    invoke-static {p0}, Lkotlin/jvm/internal/I;->m(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;

    move-result-object p0

    throw p0
.end method

.method public static h(Ljava/lang/Object;)I
    .registers 2

    instance-of v0, p0, Lkotlin/jvm/internal/j;

    if-eqz v0, :cond_b

    check-cast p0, Lkotlin/jvm/internal/j;

    invoke-interface {p0}, Lkotlin/jvm/internal/j;->getArity()I

    move-result p0

    return p0

    :cond_b
    instance-of v0, p0, Lv8/a;

    if-eqz v0, :cond_11

    const/4 p0, 0x0

    return p0

    :cond_11
    instance-of v0, p0, Lv8/l;

    if-eqz v0, :cond_17

    const/4 p0, 0x1

    return p0

    :cond_17
    instance-of v0, p0, Lv8/p;

    if-eqz v0, :cond_1d

    const/4 p0, 0x2

    return p0

    :cond_1d
    instance-of v0, p0, Lv8/q;

    if-eqz v0, :cond_23

    const/4 p0, 0x3

    return p0

    :cond_23
    instance-of v0, p0, Lv8/r;

    if-eqz v0, :cond_29

    const/4 p0, 0x4

    return p0

    :cond_29
    instance-of v0, p0, Lv8/s;

    if-eqz v0, :cond_2f

    const/4 p0, 0x5

    return p0

    :cond_2f
    instance-of v0, p0, Lv8/t;

    if-eqz v0, :cond_35

    const/4 p0, 0x6

    return p0

    :cond_35
    instance-of v0, p0, Lv8/u;

    if-eqz v0, :cond_3b

    const/4 p0, 0x7

    return p0

    :cond_3b
    instance-of v0, p0, Lv8/v;

    if-eqz v0, :cond_42

    const/16 p0, 0x8

    return p0

    :cond_42
    instance-of v0, p0, Lv8/w;

    if-eqz v0, :cond_49

    const/16 p0, 0x9

    return p0

    :cond_49
    instance-of v0, p0, Lv8/b;

    if-eqz v0, :cond_50

    const/16 p0, 0xa

    return p0

    :cond_50
    instance-of v0, p0, Lv8/c;

    if-eqz v0, :cond_57

    const/16 p0, 0xb

    return p0

    :cond_57
    instance-of v0, p0, Lv8/e;

    if-eqz v0, :cond_5e

    const/16 p0, 0xd

    return p0

    :cond_5e
    instance-of v0, p0, Lv8/f;

    if-eqz v0, :cond_65

    const/16 p0, 0xe

    return p0

    :cond_65
    instance-of v0, p0, Lv8/g;

    if-eqz v0, :cond_6c

    const/16 p0, 0xf

    return p0

    :cond_6c
    instance-of v0, p0, Lv8/h;

    if-eqz v0, :cond_73

    const/16 p0, 0x10

    return p0

    :cond_73
    instance-of v0, p0, Lv8/i;

    if-eqz v0, :cond_7a

    const/16 p0, 0x11

    return p0

    :cond_7a
    instance-of v0, p0, Lv8/j;

    if-eqz v0, :cond_81

    const/16 p0, 0x12

    return p0

    :cond_81
    instance-of v0, p0, Lv8/k;

    if-eqz v0, :cond_88

    const/16 p0, 0x13

    return p0

    :cond_88
    instance-of v0, p0, Lv8/m;

    if-eqz v0, :cond_8f

    const/16 p0, 0x14

    return p0

    :cond_8f
    instance-of p0, p0, Lv8/n;

    if-eqz p0, :cond_96

    const/16 p0, 0x15

    return p0

    :cond_96
    const/4 p0, -0x1

    return p0
.end method

.method public static i(Ljava/lang/Object;I)Z
    .registers 3

    instance-of v0, p0, Lh8/e;

    if-eqz v0, :cond_c

    invoke-static {p0}, Lkotlin/jvm/internal/I;->h(Ljava/lang/Object;)I

    move-result p0

    if-ne p0, p1, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Ljava/lang/Object;)Z
    .registers 2

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_e

    instance-of v0, p0, Lw8/a;

    if-eqz v0, :cond_c

    instance-of p0, p0, Lw8/c;

    if-eqz p0, :cond_e

    :cond_c
    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public static k(Ljava/lang/Object;)Z
    .registers 2

    instance-of v0, p0, Ljava/util/Set;

    if-eqz v0, :cond_e

    instance-of v0, p0, Lw8/a;

    if-eqz v0, :cond_c

    instance-of p0, p0, Lw8/e;

    if-eqz p0, :cond_e

    :cond_c
    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private static l(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .registers 2

    const-class v0, Lkotlin/jvm/internal/I;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->m(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/I;->l(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Ljava/lang/ClassCastException;

    throw p0
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/String;)V
    .registers 3

    if-nez p0, :cond_5

    const-string p0, "null"

    goto :goto_d

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    :goto_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " cannot be cast to "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/I;->o(Ljava/lang/String;)V

    return-void
.end method

.method public static o(Ljava/lang/String;)V
    .registers 2

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/I;->m(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;

    move-result-object p0

    throw p0
.end method
