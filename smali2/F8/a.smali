.class public abstract LF8/a;
.super LF8/D0;
.source "SourceFile"

# interfaces
.implements LF8/x0;
.implements Lm8/e;
.implements LF8/L;


# instance fields
.field private final s:Lm8/i;


# direct methods
.method public constructor <init>(Lm8/i;ZZ)V
    .registers 4

    invoke-direct {p0, p3}, LF8/D0;-><init>(Z)V

    if-eqz p2, :cond_10

    sget-object p2, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p1, p2}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p2

    check-cast p2, LF8/x0;

    invoke-virtual {p0, p2}, LF8/D0;->h0(LF8/x0;)V

    :cond_10
    invoke-interface {p1, p0}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p1

    iput-object p1, p0, LF8/a;->s:Lm8/i;

    return-void
.end method


# virtual methods
.method protected L()Ljava/lang/String;
    .registers 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " was cancelled"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected S0(Ljava/lang/Object;)V
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->y(Ljava/lang/Object;)V

    return-void
.end method

.method protected T0(Ljava/lang/Throwable;Z)V
    .registers 3

    return-void
.end method

.method protected V0(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method public final W0(LF8/N;Ljava/lang/Object;Lv8/p;)V
    .registers 4

    invoke-virtual {p1, p3, p2, p0}, LF8/N;->e(Lv8/p;Ljava/lang/Object;Lm8/e;)V

    return-void
.end method

.method public a()Z
    .registers 1

    invoke-super {p0}, LF8/D0;->a()Z

    move-result p0

    return p0
.end method

.method public final g0(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p0, p0, LF8/a;->s:Lm8/i;

    invoke-static {p0, p1}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getContext()Lm8/i;
    .registers 1

    iget-object p0, p0, LF8/a;->s:Lm8/i;

    return-object p0
.end method

.method public p0()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, LF8/a;->s:Lm8/i;

    invoke-static {v0}, LF8/G;->g(Lm8/i;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_d

    invoke-super {p0}, LF8/D0;->p0()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LF8/D0;->p0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .registers 3

    invoke-static {p1}, LF8/C;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LF8/D0;->o0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LF8/E0;->b:LK8/D;

    if-ne p1, v0, :cond_d

    return-void

    :cond_d
    invoke-virtual {p0, p1}, LF8/a;->S0(Ljava/lang/Object;)V

    return-void
.end method

.method public w0()Lm8/i;
    .registers 1

    iget-object p0, p0, LF8/a;->s:Lm8/i;

    return-object p0
.end method

.method protected final x0(Ljava/lang/Object;)V
    .registers 3

    instance-of v0, p1, LF8/A;

    if-eqz v0, :cond_10

    check-cast p1, LF8/A;

    iget-object v0, p1, LF8/A;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, LF8/A;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, LF8/a;->T0(Ljava/lang/Throwable;Z)V

    return-void

    :cond_10
    invoke-virtual {p0, p1}, LF8/a;->V0(Ljava/lang/Object;)V

    return-void
.end method
