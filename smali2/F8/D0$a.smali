.class final LF8/D0$a;
.super LF8/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/D0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final y:LF8/D0;


# direct methods
.method public constructor <init>(Lm8/e;LF8/D0;)V
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LF8/n;-><init>(Lm8/e;I)V

    iput-object p2, p0, LF8/D0$a;->y:LF8/D0;

    return-void
.end method


# virtual methods
.method protected N()Ljava/lang/String;
    .registers 1

    const-string p0, "AwaitContinuation"

    return-object p0
.end method

.method public y(LF8/x0;)Ljava/lang/Throwable;
    .registers 3

    iget-object p0, p0, LF8/D0$a;->y:LF8/D0;

    invoke-virtual {p0}, LF8/D0;->c0()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LF8/D0$c;

    if-eqz v0, :cond_14

    move-object v0, p0

    check-cast v0, LF8/D0$c;

    invoke-virtual {v0}, LF8/D0$c;->f()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_14

    return-object v0

    :cond_14
    instance-of v0, p0, LF8/A;

    if-eqz v0, :cond_1d

    check-cast p0, LF8/A;

    iget-object p0, p0, LF8/A;->a:Ljava/lang/Throwable;

    return-object p0

    :cond_1d
    invoke-interface {p1}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0
.end method
