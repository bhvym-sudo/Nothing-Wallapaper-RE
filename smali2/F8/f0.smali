.class final LF8/f0;
.super LF8/C0;
.source "SourceFile"


# instance fields
.field private final u:LF8/d0;


# direct methods
.method public constructor <init>(LF8/d0;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/f0;->u:LF8/d0;

    return-void
.end method


# virtual methods
.method public v()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p0, p0, LF8/f0;->u:LF8/d0;

    invoke-interface {p0}, LF8/d0;->dispose()V

    return-void
.end method
