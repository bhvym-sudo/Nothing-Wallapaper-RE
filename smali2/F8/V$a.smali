.class public abstract LF8/V$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LF8/V;JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 5

    invoke-static {}, LF8/S;->a()LF8/V;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, LF8/V;->W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object p0

    return-object p0
.end method
