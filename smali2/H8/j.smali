.class public abstract LH8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILH8/a;Lv8/l;)LH8/g;
    .registers 5

    const/4 v0, -0x2

    const/4 v1, 0x1

    if-eq p0, v0, :cond_49

    const/4 v0, -0x1

    if-eq p0, v0, :cond_35

    if-eqz p0, :cond_24

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_1e

    sget-object v0, LH8/a;->q:LH8/a;

    if-ne p1, v0, :cond_18

    new-instance p1, LH8/e;

    invoke-direct {p1, p0, p2}, LH8/e;-><init>(ILv8/l;)V

    return-object p1

    :cond_18
    new-instance v0, LH8/q;

    invoke-direct {v0, p0, p1, p2}, LH8/q;-><init>(ILH8/a;Lv8/l;)V

    return-object v0

    :cond_1e
    new-instance p0, LH8/e;

    invoke-direct {p0, v0, p2}, LH8/e;-><init>(ILv8/l;)V

    return-object p0

    :cond_24
    sget-object p0, LH8/a;->q:LH8/a;

    if-ne p1, p0, :cond_2f

    new-instance p0, LH8/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, LH8/e;-><init>(ILv8/l;)V

    return-object p0

    :cond_2f
    new-instance p0, LH8/q;

    invoke-direct {p0, v1, p1, p2}, LH8/q;-><init>(ILH8/a;Lv8/l;)V

    return-object p0

    :cond_35
    sget-object p0, LH8/a;->q:LH8/a;

    if-ne p1, p0, :cond_41

    new-instance p0, LH8/q;

    sget-object p1, LH8/a;->r:LH8/a;

    invoke-direct {p0, v1, p1, p2}, LH8/q;-><init>(ILH8/a;Lv8/l;)V

    return-object p0

    :cond_41
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_49
    sget-object p0, LH8/a;->q:LH8/a;

    if-ne p1, p0, :cond_59

    new-instance p0, LH8/e;

    sget-object p1, LH8/g;->f:LH8/g$a;

    invoke-virtual {p1}, LH8/g$a;->a()I

    move-result p1

    invoke-direct {p0, p1, p2}, LH8/e;-><init>(ILv8/l;)V

    return-object p0

    :cond_59
    new-instance p0, LH8/q;

    invoke-direct {p0, v1, p1, p2}, LH8/q;-><init>(ILH8/a;Lv8/l;)V

    return-object p0
.end method

.method public static synthetic b(ILH8/a;Lv8/l;ILjava/lang/Object;)LH8/g;
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_5

    const/4 p0, 0x0

    :cond_5
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_b

    sget-object p1, LH8/a;->q:LH8/a;

    :cond_b
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_10

    const/4 p2, 0x0

    :cond_10
    invoke-static {p0, p1, p2}, LH8/j;->a(ILH8/a;Lv8/l;)LH8/g;

    move-result-object p0

    return-object p0
.end method
