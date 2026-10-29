.class public abstract LF8/C0;
.super LK8/o;
.source "SourceFile"

# interfaces
.implements LF8/d0;
.implements LF8/t0;


# instance fields
.field public t:LF8/D0;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LK8/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public b()LF8/I0;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public dispose()V
    .registers 2

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object v0

    invoke-virtual {v0, p0}, LF8/D0;->D0(LF8/C0;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/C0;->u()LF8/D0;

    move-result-object p0

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u()LF8/D0;
    .registers 1

    iget-object p0, p0, LF8/C0;->t:LF8/D0;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    const-string p0, "job"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract v()Z
.end method

.method public abstract w(Ljava/lang/Throwable;)V
.end method

.method public final x(LF8/D0;)V
    .registers 2

    iput-object p1, p0, LF8/C0;->t:LF8/D0;

    return-void
.end method
