.class abstract LB8/j;
.super LB8/i;
.source "SourceFile"


# direct methods
.method public static d(DD)D
    .registers 5

    cmpg-double v0, p0, p2

    if-gez v0, :cond_5

    return-wide p2

    :cond_5
    return-wide p0
.end method

.method public static e(FF)F
    .registers 3

    cmpg-float v0, p0, p1

    if-gez v0, :cond_5

    return p1

    :cond_5
    return p0
.end method

.method public static f(II)I
    .registers 2

    if-ge p0, p1, :cond_3

    return p1

    :cond_3
    return p0
.end method

.method public static g(JJ)J
    .registers 5

    cmp-long v0, p0, p2

    if-gez v0, :cond_5

    return-wide p2

    :cond_5
    return-wide p0
.end method

.method public static h(FF)F
    .registers 3

    cmpl-float v0, p0, p1

    if-lez v0, :cond_5

    return p1

    :cond_5
    return p0
.end method

.method public static i(II)I
    .registers 2

    if-le p0, p1, :cond_3

    return p1

    :cond_3
    return p0
.end method

.method public static j(JJ)J
    .registers 5

    cmp-long v0, p0, p2

    if-lez v0, :cond_5

    return-wide p2

    :cond_5
    return-wide p0
.end method

.method public static k(DDD)D
    .registers 7

    cmpl-double v0, p2, p4

    if-gtz v0, :cond_f

    cmpg-double v0, p0, p2

    if-gez v0, :cond_9

    return-wide p2

    :cond_9
    cmpl-double p2, p0, p4

    if-lez p2, :cond_e

    return-wide p4

    :cond_e
    return-wide p0

    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p4, " is less than minimum "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static l(FFF)F
    .registers 5

    cmpl-float v0, p1, p2

    if-gtz v0, :cond_f

    cmpg-float v0, p0, p1

    if-gez v0, :cond_9

    return p1

    :cond_9
    cmpl-float p1, p0, p2

    if-lez p1, :cond_e

    return p2

    :cond_e
    return p0

    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static m(III)I
    .registers 5

    if-gt p1, p2, :cond_9

    if-ge p0, p1, :cond_5

    return p1

    :cond_5
    if-le p0, p2, :cond_8

    return p2

    :cond_8
    return p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(II)LB8/e;
    .registers 4

    sget-object v0, LB8/e;->t:LB8/e$a;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LB8/e$a;->a(III)LB8/e;

    move-result-object p0

    return-object p0
.end method

.method public static o(LB8/e;)LB8/e;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LB8/e;->t:LB8/e$a;

    invoke-virtual {p0}, LB8/e;->m()I

    move-result v1

    invoke-virtual {p0}, LB8/e;->g()I

    move-result v2

    invoke-virtual {p0}, LB8/e;->n()I

    move-result p0

    neg-int p0, p0

    invoke-virtual {v0, v1, v2, p0}, LB8/e$a;->a(III)LB8/e;

    move-result-object p0

    return-object p0
.end method

.method public static p(LB8/e;I)LB8/e;
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p1, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, LB8/i;->a(ZLjava/lang/Number;)V

    sget-object v0, LB8/e;->t:LB8/e$a;

    invoke-virtual {p0}, LB8/e;->g()I

    move-result v1

    invoke-virtual {p0}, LB8/e;->m()I

    move-result v2

    invoke-virtual {p0}, LB8/e;->n()I

    move-result p0

    if-lez p0, :cond_22

    goto :goto_23

    :cond_22
    neg-int p1, p1

    :goto_23
    invoke-virtual {v0, v1, v2, p1}, LB8/e$a;->a(III)LB8/e;

    move-result-object p0

    return-object p0
.end method

.method public static q(II)LB8/g;
    .registers 3

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_b

    sget-object p0, LB8/g;->u:LB8/g$a;

    invoke-virtual {p0}, LB8/g$a;->a()LB8/g;

    move-result-object p0

    return-object p0

    :cond_b
    new-instance v0, LB8/g;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LB8/g;-><init>(II)V

    return-object v0
.end method
