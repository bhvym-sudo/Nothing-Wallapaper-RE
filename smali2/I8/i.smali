.class abstract synthetic LI8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv8/p;)LI8/f;
    .registers 8

    new-instance v0, LI8/b;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LI8/b;-><init>(Lv8/p;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public static final b()LI8/f;
    .registers 1

    sget-object v0, LI8/e;->q:LI8/e;

    return-object v0
.end method

.method public static final c(Lv8/p;)LI8/f;
    .registers 2

    new-instance v0, LI8/D;

    invoke-direct {v0, p0}, LI8/D;-><init>(Lv8/p;)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;)LI8/f;
    .registers 2

    new-instance v0, LI8/i$a;

    invoke-direct {v0, p0}, LI8/i$a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
