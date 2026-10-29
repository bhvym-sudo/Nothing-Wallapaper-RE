.class abstract synthetic LI8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/f;Lm8/e;)Ljava/lang/Object;
    .registers 3

    sget-object v0, LJ8/s;->q:LJ8/s;

    invoke-interface {p0, v0, p1}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final b(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-static {p0, p1}, LI8/h;->E(LI8/f;Lv8/p;)LI8/f;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0, p1}, LI8/h;->d(LI8/f;ILH8/a;ILjava/lang/Object;)LI8/f;

    move-result-object p0

    invoke-static {p0, p2}, LI8/h;->h(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_16

    return-object p0

    :cond_16
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final c(LI8/g;LI8/f;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0}, LI8/h;->v(LI8/g;)V

    invoke-interface {p1, p0, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_e

    return-object p0

    :cond_e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
