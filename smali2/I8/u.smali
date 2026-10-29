.class abstract synthetic LI8/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    const v1, 0x7fffffff

    const-string v2, "kotlinx.coroutines.flow.defaultConcurrency"

    const/16 v3, 0x10

    invoke-static {v2, v3, v0, v1}, LK8/E;->b(Ljava/lang/String;III)I

    move-result v0

    sput v0, LI8/u;->a:I

    return-void
.end method

.method public static final a(LI8/f;Lv8/p;)LI8/f;
    .registers 4

    new-instance v0, LI8/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LI8/u$a;-><init>(Lv8/p;Lm8/e;)V

    invoke-static {p0, v0}, LI8/h;->N(LI8/f;Lv8/q;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Iterable;)LI8/f;
    .registers 8

    new-instance v0, LJ8/j;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LJ8/j;-><init>(Ljava/lang/Iterable;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public static final varargs c([LI8/f;)LI8/f;
    .registers 1

    invoke-static {p0}, Li8/m;->A([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, LI8/h;->F(Ljava/lang/Iterable;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LI8/f;Lv8/q;)LI8/f;
    .registers 10

    new-instance v0, LJ8/i;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, LJ8/i;-><init>(Lv8/q;LI8/f;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method
