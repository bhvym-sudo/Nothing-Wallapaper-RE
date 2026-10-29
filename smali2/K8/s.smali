.class public final LK8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK8/s;

.field public static final b:LF8/H0;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LK8/s;

    invoke-direct {v0}, LK8/s;-><init>()V

    sput-object v0, LK8/s;->a:LK8/s;

    const-string v1, "kotlinx.coroutines.fast.service.loader"

    const/4 v2, 0x1

    invoke-static {v1, v2}, LK8/E;->f(Ljava/lang/String;Z)Z

    invoke-direct {v0}, LK8/s;->a()LF8/H0;

    move-result-object v0

    sput-object v0, LK8/s;->b:LF8/H0;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()LF8/H0;
    .registers 7

    const-class p0, LK8/r;

    const/4 v0, 0x0

    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {p0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, LD8/k;->e(Ljava/util/Iterator;)LD8/h;

    move-result-object p0

    invoke-static {p0}, LD8/k;->C(LD8/h;)Ljava/util/List;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_26

    move-object v2, v0

    goto :goto_4d

    :cond_26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_31

    goto :goto_4d

    :cond_31
    move-object v3, v2

    check-cast v3, LK8/r;

    invoke-interface {v3}, LK8/r;->c()I

    move-result v3

    :cond_38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LK8/r;

    invoke-interface {v5}, LK8/r;->c()I

    move-result v5

    if-ge v3, v5, :cond_47

    move-object v2, v4

    move v3, v5

    :cond_47
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_38

    :goto_4d
    check-cast v2, LK8/r;

    if-eqz v2, :cond_5b

    invoke-static {v2, p0}, LK8/t;->e(LK8/r;Ljava/util/List;)LF8/H0;

    move-result-object p0

    if-nez p0, :cond_58

    goto :goto_5b

    :cond_58
    return-object p0

    :catchall_59
    move-exception p0

    goto :goto_60

    :cond_5b
    :goto_5b
    const/4 p0, 0x3

    invoke-static {v0, v0, p0, v0}, LK8/t;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)LK8/u;
    :try_end_5f
    .catchall {:try_start_3 .. :try_end_5f} :catchall_59

    return-object v0

    :goto_60
    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LK8/t;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)LK8/u;

    return-object v0
.end method
