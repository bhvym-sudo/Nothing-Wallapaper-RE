.class public abstract LH8/h;
.super LF8/a;
.source "SourceFile"

# interfaces
.implements LH8/g;


# instance fields
.field private final t:LH8/g;


# direct methods
.method public constructor <init>(Lm8/i;LH8/g;ZZ)V
    .registers 5

    invoke-direct {p0, p1, p3, p4}, LF8/a;-><init>(Lm8/i;ZZ)V

    iput-object p2, p0, LH8/h;->t:LH8/g;

    return-void
.end method


# virtual methods
.method public F(Ljava/lang/Throwable;)V
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1, v0}, LF8/D0;->J0(LF8/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    iget-object v0, p0, LH8/h;->t:LH8/g;

    invoke-interface {v0, p1}, LH8/v;->f(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, LF8/D0;->D(Ljava/lang/Throwable;)Z

    return-void
.end method

.method protected final Y0()LH8/g;
    .registers 1

    iget-object p0, p0, LH8/h;->t:LH8/g;

    return-object p0
.end method

.method public c(Lm8/e;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0, p1}, LH8/v;->c(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    return-object p0
.end method

.method public d()LN8/g;
    .registers 1

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0}, LH8/v;->d()LN8/g;

    move-result-object p0

    return-object p0
.end method

.method public e(Lv8/l;)V
    .registers 2

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0, p1}, LH8/w;->e(Lv8/l;)V

    return-void
.end method

.method public final f(Ljava/util/concurrent/CancellationException;)V
    .registers 4

    invoke-virtual {p0}, LF8/D0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    if-nez p1, :cond_13

    new-instance p1, LF8/y0;

    invoke-static {p0}, LF8/D0;->v(LF8/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LF8/y0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LF8/x0;)V

    :cond_13
    invoke-virtual {p0, p1}, LH8/h;->F(Ljava/lang/Throwable;)V

    return-void
.end method

.method public g()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0}, LH8/v;->g()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public h(Ljava/lang/Throwable;)Z
    .registers 2

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0, p1}, LH8/w;->h(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public iterator()LH8/i;
    .registers 1

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0}, LH8/v;->iterator()LH8/i;

    move-result-object p0

    return-object p0
.end method

.method public l(Lm8/e;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0, p1}, LH8/v;->l(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public n(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0, p1, p2}, LH8/w;->n(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public p(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0, p1}, LH8/w;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public s()Z
    .registers 1

    iget-object p0, p0, LH8/h;->t:LH8/g;

    invoke-interface {p0}, LH8/w;->s()Z

    move-result p0

    return p0
.end method
