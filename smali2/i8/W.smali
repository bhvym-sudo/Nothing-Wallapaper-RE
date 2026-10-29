.class abstract Li8/W;
.super Li8/V;
.source "SourceFile"


# direct methods
.method public static d()Ljava/util/Set;
    .registers 1

    sget-object v0, Li8/H;->q:Li8/H;

    return-object v0
.end method

.method public static final e(Ljava/util/Set;)Ljava/util/Set;
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    return-object p0

    :cond_f
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Li8/V;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_1c
    invoke-static {}, Li8/W;->d()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static varargs f([Ljava/lang/Object;)Ljava/util/Set;
    .registers 2

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li8/q;->a0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
