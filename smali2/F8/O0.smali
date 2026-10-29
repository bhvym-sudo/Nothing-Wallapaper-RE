.class final LF8/O0;
.super LF8/C0;
.source "SourceFile"


# instance fields
.field private final u:Lm8/e;


# direct methods
.method public constructor <init>(Lm8/e;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/O0;->u:Lm8/e;

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

    iget-object p0, p0, LF8/O0;->u:Lm8/e;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
