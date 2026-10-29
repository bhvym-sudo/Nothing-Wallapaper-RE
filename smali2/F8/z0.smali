.class public LF8/z0;
.super LF8/D0;
.source "SourceFile"

# interfaces
.implements LF8/y;


# instance fields
.field private final s:Z


# direct methods
.method public constructor <init>(LF8/x0;)V
    .registers 3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LF8/D0;-><init>(Z)V

    invoke-virtual {p0, p1}, LF8/D0;->h0(LF8/x0;)V

    invoke-direct {p0}, LF8/z0;->S0()Z

    move-result p1

    iput-boolean p1, p0, LF8/z0;->s:Z

    return-void
.end method

.method private final S0()Z
    .registers 4

    invoke-virtual {p0}, LF8/D0;->a0()LF8/s;

    move-result-object p0

    instance-of v0, p0, LF8/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    check-cast p0, LF8/t;

    goto :goto_d

    :cond_c
    move-object p0, v1

    :goto_d
    const/4 v0, 0x0

    if-eqz p0, :cond_33

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    if-nez p0, :cond_17

    goto :goto_33

    :cond_17
    invoke-virtual {p0}, LF8/D0;->V()Z

    move-result v2

    if-eqz v2, :cond_1f

    const/4 p0, 0x1

    return p0

    :cond_1f
    invoke-virtual {p0}, LF8/D0;->a0()LF8/s;

    move-result-object p0

    instance-of v2, p0, LF8/t;

    if-eqz v2, :cond_2a

    check-cast p0, LF8/t;

    goto :goto_2b

    :cond_2a
    move-object p0, v1

    :goto_2b
    if-eqz p0, :cond_33

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    if-nez p0, :cond_17

    :cond_33
    :goto_33
    return v0
.end method


# virtual methods
.method public V()Z
    .registers 1

    iget-boolean p0, p0, LF8/z0;->s:Z

    return p0
.end method

.method public W()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method
