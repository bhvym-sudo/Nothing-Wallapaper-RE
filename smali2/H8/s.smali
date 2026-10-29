.class final LH8/s;
.super LH8/h;
.source "SourceFile"

# interfaces
.implements LH8/t;


# direct methods
.method public constructor <init>(Lm8/i;LH8/g;)V
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, v0}, LH8/h;-><init>(Lm8/i;LH8/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected T0(Ljava/lang/Throwable;Z)V
    .registers 4

    invoke-virtual {p0}, LH8/h;->Y0()LH8/g;

    move-result-object v0

    invoke-interface {v0, p1}, LH8/w;->h(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_13

    if-nez p2, :cond_13

    invoke-virtual {p0}, LF8/a;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0, p1}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    :cond_13
    return-void
.end method

.method public bridge synthetic V0(Ljava/lang/Object;)V
    .registers 2

    check-cast p1, Lh8/A;

    invoke-virtual {p0, p1}, LH8/s;->Z0(Lh8/A;)V

    return-void
.end method

.method protected Z0(Lh8/A;)V
    .registers 3

    invoke-virtual {p0}, LH8/h;->Y0()LH8/g;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, LH8/w$a;->a(LH8/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method

.method public a()Z
    .registers 1

    invoke-super {p0}, LF8/a;->a()Z

    move-result p0

    return p0
.end method
