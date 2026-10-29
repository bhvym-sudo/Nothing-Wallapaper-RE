.class public abstract LF8/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/x0;)LF8/v;
    .registers 2

    new-instance v0, LF8/w;

    invoke-direct {v0, p0}, LF8/w;-><init>(LF8/x0;)V

    return-object v0
.end method

.method public static synthetic b(LF8/x0;ILjava/lang/Object;)LF8/v;
    .registers 3

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_5

    const/4 p0, 0x0

    :cond_5
    invoke-static {p0}, LF8/x;->a(LF8/x0;)LF8/v;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LF8/v;Ljava/lang/Object;)Z
    .registers 3

    invoke-static {p1}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-interface {p0, p1}, LF8/v;->B0(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_b
    invoke-interface {p0, v0}, LF8/v;->A0(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method
