.class public LK8/z;
.super LF8/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field public final t:Lm8/e;


# direct methods
.method public constructor <init>(Lm8/i;Lm8/e;)V
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, LF8/a;-><init>(Lm8/i;ZZ)V

    iput-object p2, p0, LK8/z;->t:Lm8/e;

    return-void
.end method


# virtual methods
.method protected S0(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, LK8/z;->t:Lm8/e;

    invoke-static {p1, p0}, LF8/C;->a(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public Y0()V
    .registers 1

    return-void
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .registers 2

    iget-object p0, p0, LK8/z;->t:Lm8/e;

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v0, :cond_9

    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method protected final j0()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method protected y(Ljava/lang/Object;)V
    .registers 3

    iget-object v0, p0, LK8/z;->t:Lm8/e;

    invoke-static {v0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    iget-object p0, p0, LK8/z;->t:Lm8/e;

    invoke-static {p1, p0}, LF8/C;->a(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, LK8/i;->b(Lm8/e;Ljava/lang/Object;)V

    return-void
.end method
