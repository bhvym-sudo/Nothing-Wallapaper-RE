.class public abstract LF8/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 2

    instance-of p1, p0, LF8/A;

    if-eqz p1, :cond_13

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    check-cast p0, LF8/A;

    iget-object p0, p0, LF8/A;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_13
    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_7

    return-object p0

    :cond_7
    new-instance p0, LF8/A;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v3, v1, v2}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    return-object p0
.end method

.method public static final c(Ljava/lang/Object;LF8/l;)Ljava/lang/Object;
    .registers 5

    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_7

    return-object p0

    :cond_7
    new-instance p0, LF8/A;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    return-object p0
.end method
