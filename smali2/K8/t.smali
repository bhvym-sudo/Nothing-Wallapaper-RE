.class public abstract LK8/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method private static final a(Ljava/lang/Throwable;Ljava/lang/String;)LK8/u;
    .registers 2

    if-eqz p0, :cond_3

    throw p0

    :cond_3
    invoke-static {}, LK8/t;->d()Ljava/lang/Void;

    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method

.method static synthetic b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)LK8/u;
    .registers 5

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_6

    move-object p0, v0

    :cond_6
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_b

    move-object p1, v0

    :cond_b
    invoke-static {p0, p1}, LK8/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)LK8/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LF8/H0;)Z
    .registers 1

    invoke-virtual {p0}, LF8/H0;->l1()LF8/H0;

    move-result-object p0

    instance-of p0, p0, LK8/u;

    return p0
.end method

.method public static final d()Ljava/lang/Void;
    .registers 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(LK8/r;Ljava/util/List;)LF8/H0;
    .registers 2

    :try_start_0
    invoke-interface {p0, p1}, LK8/r;->b(Ljava/util/List;)LF8/H0;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_5

    return-object p0

    :catchall_5
    move-exception p1

    invoke-interface {p0}, LK8/r;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LK8/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)LK8/u;

    move-result-object p0

    return-object p0
.end method
