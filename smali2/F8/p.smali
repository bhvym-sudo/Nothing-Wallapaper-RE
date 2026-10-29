.class public abstract LF8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/l;LF8/d0;)V
    .registers 3

    new-instance v0, LF8/e0;

    invoke-direct {v0, p1}, LF8/e0;-><init>(LF8/d0;)V

    invoke-static {p0, v0}, LF8/p;->c(LF8/l;LF8/k;)V

    return-void
.end method

.method public static final b(Lm8/e;)LF8/n;
    .registers 3

    instance-of v0, p0, LK8/h;

    if-nez v0, :cond_b

    new-instance v0, LF8/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LF8/n;-><init>(Lm8/e;I)V

    return-object v0

    :cond_b
    move-object v0, p0

    check-cast v0, LK8/h;

    invoke-virtual {v0}, LK8/h;->l()LF8/n;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, LF8/n;->Q()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_1c

    :cond_1b
    const/4 v0, 0x0

    :goto_1c
    if-nez v0, :cond_1f

    goto :goto_20

    :cond_1f
    return-object v0

    :cond_20
    :goto_20
    new-instance v0, LF8/n;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LF8/n;-><init>(Lm8/e;I)V

    return-object v0
.end method

.method public static final c(LF8/l;LF8/k;)V
    .registers 3

    instance-of v0, p0, LF8/n;

    if-eqz v0, :cond_a

    check-cast p0, LF8/n;

    invoke-virtual {p0, p1}, LF8/n;->J(LF8/k;)V

    return-void

    :cond_a
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "third-party implementation of CancellableContinuation is not supported"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
