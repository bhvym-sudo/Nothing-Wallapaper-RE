.class final LF8/w;
.super LF8/D0;
.source "SourceFile"

# interfaces
.implements LF8/v;


# direct methods
.method public constructor <init>(LF8/x0;)V
    .registers 3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LF8/D0;-><init>(Z)V

    invoke-virtual {p0, p1}, LF8/D0;->h0(LF8/x0;)V

    return-void
.end method


# virtual methods
.method public A0(Ljava/lang/Throwable;)Z
    .registers 6

    new-instance v0, LF8/A;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LF8/A;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/h;)V

    invoke-virtual {p0, v0}, LF8/D0;->n0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public B0(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->n0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public P0(Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->A(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    return-object p0
.end method

.method public W()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method
