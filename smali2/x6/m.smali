.class public final Lx6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx6/m;

.field private static b:Lx6/q;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lx6/m;

    invoke-direct {v0}, Lx6/m;-><init>()V

    sput-object v0, Lx6/m;->a:Lx6/m;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .registers 1

    invoke-static {p0}, Lx6/m;->c(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .registers 3

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "DiskLruCache"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized b(Landroid/content/Context;)Lx6/q;
    .registers 11

    monitor-enter p0

    :try_start_1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx6/m;->b:Lx6/q;

    if-eqz v0, :cond_2a

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const-string v0, "cache"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_17

    :catchall_14
    move-exception v0

    move-object p1, v0

    goto :goto_5e

    :cond_17
    :goto_17
    invoke-interface {v0}, Lx6/r;->y()Z

    move-result v0

    if-nez v0, :cond_2a

    sget-object p1, Lx6/m;->b:Lx6/q;

    if-nez p1, :cond_27

    const-string p1, "cache"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V
    :try_end_26
    .catchall {:try_start_1 .. :try_end_26} :catchall_14

    goto :goto_28

    :cond_27
    move-object v1, p1

    :goto_28
    monitor-exit p0

    return-object v1

    :cond_2a
    :try_start_2a
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object p1

    const-string v0, "effect"

    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Lx6/d;

    new-instance v8, Lx6/e;

    new-instance v0, Lz6/b;

    sget-object v1, LY8/a;->b:LY8/a;

    new-instance v7, LT8/e;

    new-instance v3, LT8/e$c;

    new-instance v4, Lx6/l;

    invoke-direct {v4}, Lx6/l;-><init>()V

    invoke-direct {v3, v4}, LT8/e$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v7, v3}, LT8/e;-><init>(LT8/e$a;)V

    const/4 v3, 0x1

    const/4 v4, 0x2

    const-wide/32 v5, 0x6400000

    invoke-direct/range {v0 .. v7}, Lz6/b;-><init>(LY8/a;Ljava/io/File;IIJLT8/e;)V

    invoke-direct {v8, v0}, Lx6/e;-><init>(Lz6/b;)V

    invoke-direct {p1, v8}, Lx6/d;-><init>(Lx6/r;)V

    sput-object p1, Lx6/m;->b:Lx6/q;
    :try_end_5c
    .catchall {:try_start_2a .. :try_end_5c} :catchall_14

    monitor-exit p0

    return-object p1

    :goto_5e
    :try_start_5e
    monitor-exit p0
    :try_end_5f
    .catchall {:try_start_5e .. :try_end_5f} :catchall_14

    throw p1
.end method
