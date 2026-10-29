.class final LF8/t;
.super LF8/C0;
.source "SourceFile"

# interfaces
.implements LF8/s;


# instance fields
.field public final u:LF8/u;


# direct methods
.method public constructor <init>(LF8/u;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/t;->u:LF8/u;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Throwable;)Z
    .registers 2

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    invoke-virtual {p0, p1}, LF8/D0;->M(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public getParent()LF8/x0;
    .registers 1

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    return-object p0
.end method

.method public v()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p1, p0, LF8/t;->u:LF8/u;

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    invoke-interface {p1, p0}, LF8/u;->q0(LF8/M0;)V

    return-void
.end method
