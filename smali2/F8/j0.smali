.class public abstract LF8/j0;
.super LF8/h0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/h0;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract x1()Ljava/lang/Thread;
.end method

.method protected y1(JLF8/i0$c;)V
    .registers 4

    sget-object p0, LF8/Q;->y:LF8/Q;

    invoke-virtual {p0, p1, p2, p3}, LF8/i0;->M1(JLF8/i0$c;)V

    return-void
.end method

.method protected final z1()V
    .registers 2

    invoke-virtual {p0}, LF8/j0;->x1()Ljava/lang/Thread;

    move-result-object p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq v0, p0, :cond_10

    invoke-static {}, LF8/c;->a()LF8/b;

    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_10
    return-void
.end method
