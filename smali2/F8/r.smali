.class final LF8/r;
.super LF8/C0;
.source "SourceFile"


# instance fields
.field public final u:LF8/n;


# direct methods
.method public constructor <init>(LF8/n;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/r;->u:LF8/n;

    return-void
.end method


# virtual methods
.method public v()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p1, p0, LF8/r;->u:LF8/n;

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    invoke-virtual {p1, p0}, LF8/n;->y(LF8/x0;)Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LF8/n;->O(Ljava/lang/Throwable;)V

    return-void
.end method
