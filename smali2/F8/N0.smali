.class final LF8/N0;
.super LF8/C0;
.source "SourceFile"


# instance fields
.field private final u:LF8/n;


# direct methods
.method public constructor <init>(LF8/n;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/N0;->u:LF8/n;

    return-void
.end method


# virtual methods
.method public v()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 3

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p1

    invoke-virtual {p1}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LF8/A;

    if-eqz v0, :cond_20

    iget-object p0, p0, LF8/N0;->u:LF8/n;

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    check-cast p1, LF8/A;

    iget-object p1, p1, LF8/A;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_20
    iget-object p0, p0, LF8/N0;->u:LF8/n;

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, LF8/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
