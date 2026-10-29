.class abstract synthetic LI8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLjava/lang/Object;)J
    .registers 3

    invoke-static {p0, p1, p2}, LI8/n;->c(JLjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(LI8/f;J)LI8/f;
    .registers 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_13

    if-nez v0, :cond_9

    return-object p0

    :cond_9
    new-instance v0, LI8/m;

    invoke-direct {v0, p1, p2}, LI8/m;-><init>(J)V

    invoke-static {p0, v0}, LI8/n;->d(LI8/f;Lv8/l;)LI8/f;

    move-result-object p0

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Debounce timeout should not be negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final c(JLjava/lang/Object;)J
    .registers 3

    return-wide p0
.end method

.method private static final d(LI8/f;Lv8/l;)LI8/f;
    .registers 4

    new-instance v0, LI8/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, LI8/n$a;-><init>(Lv8/l;LI8/f;Lm8/e;)V

    invoke-static {v0}, LJ8/o;->b(Lv8/q;)LI8/f;

    move-result-object p0

    return-object p0
.end method
