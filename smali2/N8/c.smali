.class public abstract LN8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LN8/d;JLv8/l;)V
    .registers 5

    new-instance v0, LN8/b;

    invoke-direct {v0, p1, p2}, LN8/b;-><init>(J)V

    invoke-virtual {v0}, LN8/b;->c()LN8/e;

    move-result-object p1

    invoke-interface {p0, p1, p3}, LN8/d;->a(LN8/e;Lv8/l;)V

    return-void
.end method
