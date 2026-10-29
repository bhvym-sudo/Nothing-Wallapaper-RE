.class public final LJ6/h;
.super Lg3/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/h$a;
    }
.end annotation


# static fields
.field public static final i:LJ6/h$a;

.field private static j:Z


# instance fields
.field private final h:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ6/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ6/h$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ6/h;->i:LJ6/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V
    .registers 6

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpapers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lg3/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, LJ6/h;->h:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic r(Lg3/A;Ljava/util/List;)V
    .registers 2

    invoke-static {p0, p1}, LJ6/h;->x(Lg3/A;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s(Landroid/content/Context;LJ6/h;Lg3/A;)V
    .registers 3

    invoke-static {p0, p1, p2}, LJ6/h;->w(Landroid/content/Context;LJ6/h;Lg3/A;)V

    return-void
.end method

.method public static final synthetic t()Z
    .registers 1

    sget-boolean v0, LJ6/h;->j:Z

    return v0
.end method

.method public static final synthetic u(Z)V
    .registers 1

    sput-boolean p0, LJ6/h;->j:Z

    return-void
.end method

.method private static final w(Landroid/content/Context;LJ6/h;Lg3/A;)V
    .registers 6

    sget-object v0, LJ6/i;->F:LJ6/i$a;

    invoke-virtual {p1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getCollectionId(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, LJ6/i$a;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    iget-object v0, p1, Lg3/r;->d:Ljava/lang/Object;

    const-string v1, "mWallpapersLock"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_17
    invoke-virtual {p1}, Lg3/r;->p()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {p1}, Lg3/r;->p()Ljava/util/List;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_28
    .catchall {:try_start_17 .. :try_end_28} :catchall_3b

    monitor-exit v0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, LJ6/g;

    invoke-direct {v0, p2, p0}, LJ6/g;-><init>(Lg3/A;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_3b
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static final x(Lg3/A;Ljava/util/List;)V
    .registers 2

    if-eqz p0, :cond_5

    invoke-interface {p0, p1}, Lg3/A;->a(Ljava/util/List;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public n()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public o(Landroid/content/Context;Lg3/A;Z)V
    .registers 5

    if-eqz p3, :cond_f

    if-eqz p1, :cond_e

    iget-object p3, p0, LJ6/h;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v0, LJ6/f;

    invoke-direct {v0, p1, p0, p2}, LJ6/f;-><init>(Landroid/content/Context;LJ6/h;Lg3/A;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_e
    return-void

    :cond_f
    const/4 p3, 0x0

    invoke-super {p0, p1, p2, p3}, Lg3/r;->o(Landroid/content/Context;Lg3/A;Z)V

    return-void
.end method

.method public final v(Ljava/util/List;)V
    .registers 4

    if-eqz p1, :cond_1c

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg3/x;

    invoke-virtual {p0}, Lg3/r;->p()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_1c
    return-void
.end method
