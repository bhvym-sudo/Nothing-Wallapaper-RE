.class public abstract LF8/x0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .registers 4

    if-nez p3, :cond_b

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_7

    const/4 p1, 0x0

    :cond_7
    invoke-interface {p0, p1}, LF8/x0;->f(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(LF8/x0;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, Lm8/i$b$a;->a(Lm8/i$b;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(LF8/x0;Lm8/i$c;)Lm8/i$b;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->b(Lm8/i$b;Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(LF8/x0;Lm8/i$c;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->c(Lm8/i$b;Lm8/i$c;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public static e(LF8/x0;Lm8/i;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->d(Lm8/i$b;Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
