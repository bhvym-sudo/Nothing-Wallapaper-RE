.class public abstract LJ8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LJ8/a;Ljava/lang/Object;)V
    .registers 3

    iget-object v0, p0, LJ8/a;->q:Ljava/lang/Object;

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    throw p0
.end method
