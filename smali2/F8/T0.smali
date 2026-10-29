.class public abstract LF8/T0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/x0;)LF8/y;
    .registers 2

    new-instance v0, LF8/S0;

    invoke-direct {v0, p0}, LF8/S0;-><init>(LF8/x0;)V

    return-object v0
.end method

.method public static synthetic b(LF8/x0;ILjava/lang/Object;)LF8/y;
    .registers 3

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_5

    const/4 p0, 0x0

    :cond_5
    invoke-static {p0}, LF8/T0;->a(LF8/x0;)LF8/y;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance v0, LF8/R0;

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LF8/R0;-><init>(Lm8/i;Lm8/e;)V

    invoke-static {v0, v0, p0}, LL8/b;->b(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_16

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_16
    return-object p0
.end method
