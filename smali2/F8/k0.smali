.class public abstract LF8/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LF8/h0;
    .registers 2

    new-instance v0, LF8/f;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, LF8/f;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
