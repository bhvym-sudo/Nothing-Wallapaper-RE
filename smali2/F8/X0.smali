.class final LF8/X0;
.super LK8/z;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final u:J


# direct methods
.method public constructor <init>(JLm8/e;)V
    .registers 5

    invoke-interface {p3}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    invoke-direct {p0, v0, p3}, LK8/z;-><init>(Lm8/i;Lm8/e;)V

    iput-wide p1, p0, LF8/X0;->u:J

    return-void
.end method


# virtual methods
.method public p0()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LF8/a;->p0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LF8/X0;->u:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public run()V
    .registers 4

    iget-wide v0, p0, LF8/X0;->u:J

    invoke-virtual {p0}, LF8/a;->getContext()Lm8/i;

    move-result-object v2

    invoke-static {v2}, LF8/W;->c(Lm8/i;)LF8/V;

    move-result-object v2

    invoke-static {v0, v1, v2, p0}, LF8/Y0;->a(JLF8/V;LF8/x0;)LF8/W0;

    move-result-object v0

    invoke-virtual {p0, v0}, LF8/D0;->D(Ljava/lang/Throwable;)Z

    return-void
.end method
