.class abstract synthetic LI8/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a()Lv8/a;
    .registers 1

    invoke-static {}, LI8/y;->f()Lv8/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(LI8/f;LI8/f;LI8/f;LI8/f;Lv8/s;)LI8/f;
    .registers 5

    filled-new-array {p0, p1, p2, p3}, [LI8/f;

    move-result-object p0

    new-instance p1, LI8/y$b;

    invoke-direct {p1, p0, p4}, LI8/y$b;-><init>([LI8/f;Lv8/s;)V

    return-object p1
.end method

.method public static final c(LI8/f;LI8/f;LI8/f;Lv8/r;)LI8/f;
    .registers 4

    filled-new-array {p0, p1, p2}, [LI8/f;

    move-result-object p0

    new-instance p1, LI8/y$a;

    invoke-direct {p1, p0, p3}, LI8/y$a;-><init>([LI8/f;Lv8/r;)V

    return-object p1
.end method

.method public static final d(LI8/f;LI8/f;Lv8/q;)LI8/f;
    .registers 3

    invoke-static {p0, p1, p2}, LI8/h;->B(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LI8/f;LI8/f;Lv8/q;)LI8/f;
    .registers 4

    new-instance v0, LI8/y$c;

    invoke-direct {v0, p0, p1, p2}, LI8/y$c;-><init>(LI8/f;LI8/f;Lv8/q;)V

    return-object v0
.end method

.method private static final f()Lv8/a;
    .registers 1

    sget-object v0, LI8/y$e;->q:LI8/y$e;

    return-object v0
.end method
