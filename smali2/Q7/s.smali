.class public final LQ7/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ7/s$a;,
        LQ7/s$b;
    }
.end annotation


# static fields
.field public static final h:LQ7/s$a;

.field private static final i:Lh8/h;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lf4/d;

.field private c:Lh5/d;

.field private final d:Lh8/h;

.field private final e:Lh8/h;

.field private final f:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LQ7/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ7/s$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LQ7/s;->h:LQ7/s$a;

    new-instance v0, LQ7/k;

    invoke-direct {v0}, LQ7/k;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LQ7/s;->i:Lh8/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/s;->a:Landroid/content/Context;

    new-instance p1, LQ7/g;

    invoke-direct {p1, p0}, LQ7/g;-><init>(LQ7/s;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LQ7/s;->d:Lh8/h;

    new-instance p1, LQ7/j;

    invoke-direct {p1, p0}, LQ7/j;-><init>(LQ7/s;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LQ7/s;->e:Lh8/h;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LQ7/s;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object p1, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;

    iput-object p1, p0, LQ7/s;->g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    invoke-direct {p0}, LQ7/s;->A()Z

    move-result p0

    if-nez p0, :cond_38

    const-string p0, "MLKitSegmenter"

    const-string p1, "initialize, failed to initialize"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_38
    return-void
.end method

.method private final A()Z
    .registers 6

    const-string v0, "initialize"

    const-string v1, "MLKitSegmenter"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/s;->c:Lh5/d;

    const/4 v2, 0x1

    if-eqz v0, :cond_d

    return v2

    :cond_d
    const/4 v0, 0x0

    :try_start_e
    iget-object v3, p0, LQ7/s;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Ld5/i;->d(Landroid/content/Context;)Ld5/i;
    :try_end_17
    .catchall {:try_start_e .. :try_end_17} :catchall_94

    :try_start_17
    new-instance v3, Lh5/e$a;

    invoke-direct {v3}, Lh5/e$a;-><init>()V

    invoke-virtual {v3}, Lh5/e$a;->b()Lh5/e$a;

    move-result-object v3

    invoke-virtual {v3}, Lh5/e$a;->c()Lh5/e$a;

    move-result-object v3

    invoke-virtual {v3}, Lh5/e$a;->a()Lh5/e;

    move-result-object v3

    const-string v4, "build(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lh5/b;->a(Lh5/e;)Lh5/d;

    move-result-object v3
    :try_end_31
    .catchall {:try_start_17 .. :try_end_31} :catchall_7a

    iput-object v3, p0, LQ7/s;->c:Lh5/d;

    :try_start_33
    iget-object v3, p0, LQ7/s;->a:Landroid/content/Context;

    invoke-static {v3}, Lf4/c;->a(Landroid/content/Context;)Lf4/d;

    move-result-object v0
    :try_end_39
    .catchall {:try_start_33 .. :try_end_39} :catchall_3f

    iput-object v0, p0, LQ7/s;->b:Lf4/d;

    invoke-direct {p0}, LQ7/s;->s()V

    return v2

    :catchall_3f
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initialize, failed to create module installation, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LQ7/s;->c:Lh5/d;

    if-eqz v1, :cond_76

    :try_start_5c
    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-interface {v1}, Lh5/d;->close()V

    sget-object v1, Lh8/A;->a:Lh8/A;

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_67
    .catchall {:try_start_5c .. :try_end_67} :catchall_68

    goto :goto_73

    :catchall_68
    move-exception v1

    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-static {v1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_73
    invoke-static {v1}, Lh8/q;->a(Ljava/lang/Object;)Lh8/q;

    :cond_76
    const/4 v1, 0x0

    iput-object v1, p0, LQ7/s;->c:Lh5/d;

    return v0

    :catchall_7a
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initialize, failed to create subject segmentation, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :catchall_94
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initialize, failed to init MLKit,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method private final B()V
    .registers 5

    iget-object v0, p0, LQ7/s;->g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    instance-of v1, v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;

    if-nez v1, :cond_83

    instance-of v0, v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    if-eqz v0, :cond_b

    goto :goto_83

    :cond_b
    iget-object v0, p0, LQ7/s;->a:Landroid/content/Context;

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "MLKitSegmenter"

    if-nez v0, :cond_1e

    const-string v0, "installModule, network is not available"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LQ7/s;->L()V

    return-void

    :cond_1e
    iget-object v0, p0, LQ7/s;->c:Lh5/d;

    if-nez v0, :cond_28

    const-string p0, "installModule, can\'t find segmenter"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_28
    const-string v2, "installModule, start installing module"

    invoke-static {v1, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;

    invoke-direct {p0, v2}, LQ7/s;->P(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    :try_start_32
    invoke-static {}, Lf4/f;->d()Lf4/f$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lf4/f$a;->a(La4/f;)Lf4/f$a;

    move-result-object v0

    invoke-direct {p0}, LQ7/s;->x()LQ7/s$b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lf4/f$a;->c(Lf4/a;)Lf4/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lf4/f$a;->b()Lf4/f;

    move-result-object v0

    const-string v2, "build(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LQ7/s;->b:Lf4/d;

    if-eqz v2, :cond_83

    invoke-interface {v2, v0}, Lf4/d;->b(Lf4/f;)Lv4/k;

    move-result-object v0

    new-instance v2, LQ7/q;

    invoke-direct {v2, p0}, LQ7/q;-><init>(LQ7/s;)V

    new-instance v3, LQ7/r;

    invoke-direct {v3, v2}, LQ7/r;-><init>(Lv8/l;)V

    invoke-virtual {v0, v3}, Lv4/k;->g(Lv4/g;)Lv4/k;

    move-result-object v0

    new-instance v2, LQ7/h;

    invoke-direct {v2, p0}, LQ7/h;-><init>(LQ7/s;)V

    invoke-virtual {v0, v2}, Lv4/k;->e(Lv4/f;)Lv4/k;
    :try_end_69
    .catchall {:try_start_32 .. :try_end_69} :catchall_6a

    return-void

    :catchall_6a
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "installModule, error occurred while installing module, "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_83
    :goto_83
    return-void
.end method

.method private static final C(LQ7/s;Lf4/g;)Lh8/A;
    .registers 2

    invoke-virtual {p1}, Lf4/g;->a()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-direct {p0}, LQ7/s;->H()V

    goto :goto_11

    :cond_a
    const-string p0, "MLKitSegmenter"

    const-string p1, "installModule, module still not installed"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    :goto_11
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final D(Lv8/l;Ljava/lang/Object;)V
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final E(LQ7/s;Ljava/lang/Exception;)V
    .registers 4

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "installModule, failed to install module, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MLKitSegmenter"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;

    invoke-direct {p0, p1}, LQ7/s;->P(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    return-void
.end method

.method private static final F(LQ7/s;)LQ7/s$b;
    .registers 2

    new-instance v0, LQ7/s$b;

    invoke-direct {v0, p0}, LQ7/s$b;-><init>(LQ7/s;)V

    return-object v0
.end method

.method private static final G(LQ7/s;)Li6/k;
    .registers 3

    new-instance v0, Li6/k;

    iget-object p0, p0, LQ7/s;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "getApplicationContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Li6/k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private final H()V
    .registers 3

    const-string v0, "MLKitSegmenter"

    const-string v1, "onModuleInstalled"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    invoke-direct {p0, v0}, LQ7/s;->P(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    invoke-direct {p0}, LQ7/s;->Q()V

    return-void
.end method

.method private static final J()Ljava/util/concurrent/ScheduledExecutorService;
    .registers 2

    new-instance v0, LQ7/l;

    invoke-direct {v0}, LQ7/l;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private static final K(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .registers 2

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string p0, "MLKitSegmenter"

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-object v0
.end method

.method private final L()V
    .registers 3

    invoke-direct {p0}, LQ7/s;->z()Li6/k;

    move-result-object v0

    new-instance v1, LQ7/i;

    invoke-direct {v1, p0}, LQ7/i;-><init>(LQ7/s;)V

    invoke-virtual {v0, v1}, Li6/k;->f(Lv8/l;)V

    return-void
.end method

.method private static final M(LQ7/s;Z)Lh8/A;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "network status changed, available: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MLKitSegmenter"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1b

    invoke-direct {p0}, LQ7/s;->B()V

    :cond_1b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final P(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V
    .registers 3

    iget-object v0, p0, LQ7/s;->g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    iput-object p1, p0, LQ7/s;->g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    iget-object p0, p0, LQ7/s;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-string v0, "iterator(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/segmenter/Segmenter$b;

    invoke-interface {v0, p1}, Lcom/nothing/wallpaper/segmenter/Segmenter$b;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    goto :goto_15

    :cond_25
    return-void
.end method

.method private final Q()V
    .registers 1

    invoke-direct {p0}, LQ7/s;->z()Li6/k;

    move-result-object p0

    invoke-virtual {p0}, Li6/k;->g()V

    return-void
.end method

.method public static synthetic a(LQ7/s;)LQ7/s$b;
    .registers 1

    invoke-static {p0}, LQ7/s;->F(LQ7/s;)LQ7/s$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LQ7/s;Lf4/g;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->C(LQ7/s;Lf4/g;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljava/util/concurrent/ScheduledExecutorService;
    .registers 1

    invoke-static {}, LQ7/s;->J()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(LQ7/s;)V
    .registers 1

    invoke-direct {p0}, LQ7/s;->B()V

    return-void
.end method

.method public static synthetic e(Lv8/l;Ljava/lang/Object;)V
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->u(Lv8/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lv8/l;Ljava/lang/Object;)V
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->D(Lv8/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(LQ7/s;Lf4/b;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->t(LQ7/s;Lf4/b;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LQ7/s;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->M(LQ7/s;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(LQ7/s;)Li6/k;
    .registers 1

    invoke-static {p0}, LQ7/s;->G(LQ7/s;)Li6/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(LQ7/s;Ljava/lang/Exception;)V
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->E(LQ7/s;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic k(LQ7/s;Ljava/lang/Exception;)V
    .registers 2

    invoke-static {p0, p1}, LQ7/s;->v(LQ7/s;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic l(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .registers 1

    invoke-static {p0}, LQ7/s;->K(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LQ7/s;)V
    .registers 1

    invoke-direct {p0}, LQ7/s;->s()V

    return-void
.end method

.method public static final synthetic n(LQ7/s;)Lf4/d;
    .registers 1

    iget-object p0, p0, LQ7/s;->b:Lf4/d;

    return-object p0
.end method

.method public static final synthetic o()Lh8/h;
    .registers 1

    sget-object v0, LQ7/s;->i:Lh8/h;

    return-object v0
.end method

.method public static final synthetic p(LQ7/s;)V
    .registers 1

    invoke-direct {p0}, LQ7/s;->H()V

    return-void
.end method

.method public static final synthetic q(LQ7/s;Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V
    .registers 2

    invoke-direct {p0, p1}, LQ7/s;->P(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    return-void
.end method

.method private final s()V
    .registers 5

    iget-object v0, p0, LQ7/s;->c:Lh5/d;

    const-string v1, "MLKitSegmenter"

    if-nez v0, :cond_c

    const-string p0, "checkModule, can\'t find segmenter"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    :try_start_c
    iget-object v2, p0, LQ7/s;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ld5/i;->d(Landroid/content/Context;)Ld5/i;
    :try_end_15
    .catchall {:try_start_c .. :try_end_15} :catchall_5d

    const-string v2, "checkModule, start checking module availability."

    invoke-static {v1, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, LQ7/s;->b:Lf4/d;

    if-eqz v2, :cond_5c

    :try_start_1e
    filled-new-array {v0}, [La4/f;

    move-result-object v0

    invoke-interface {v2, v0}, Lf4/d;->d([La4/f;)Lv4/k;

    move-result-object v0

    new-instance v2, LQ7/m;

    invoke-direct {v2, p0}, LQ7/m;-><init>(LQ7/s;)V

    new-instance v3, LQ7/n;

    invoke-direct {v3, v2}, LQ7/n;-><init>(Lv8/l;)V

    invoke-virtual {v0, v3}, Lv4/k;->g(Lv4/g;)Lv4/k;

    move-result-object v0

    new-instance v2, LQ7/o;

    invoke-direct {v2, p0}, LQ7/o;-><init>(LQ7/s;)V

    invoke-virtual {v0, v2}, Lv4/k;->e(Lv4/f;)Lv4/k;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V
    :try_end_40
    .catchall {:try_start_1e .. :try_end_40} :catchall_41

    goto :goto_5c

    :catchall_41
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkModule, failed to start checking module installation, "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    :cond_5c
    :goto_5c
    return-void

    :catchall_5d
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkModule, failed to initialize MLKit,"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final t(LQ7/s;Lf4/b;)Lh8/A;
    .registers 3

    invoke-virtual {p1}, Lf4/b;->a()Z

    move-result p1

    const-string v0, "MLKitSegmenter"

    if-eqz p1, :cond_11

    const-string p1, "checkModule, module is installed"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LQ7/s;->H()V

    goto :goto_24

    :cond_11
    const-string p1, "checkModule, module is still not installed"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, LQ7/s;->h:LQ7/s$a;

    invoke-static {p1}, LQ7/s$a;->a(LQ7/s$a;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, LQ7/p;

    invoke-direct {v0, p0}, LQ7/p;-><init>(LQ7/s;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :goto_24
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final u(Lv8/l;Ljava/lang/Object;)V
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final v(LQ7/s;Ljava/lang/Exception;)V
    .registers 4

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkModule, failed to check module availability, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MLKitSegmenter"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, LQ7/s;->h:LQ7/s$a;

    invoke-static {p1}, LQ7/s$a;->a(LQ7/s$a;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, LQ7/p;

    invoke-direct {v0, p0}, LQ7/p;-><init>(LQ7/s;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private final x()LQ7/s$b;
    .registers 1

    iget-object p0, p0, LQ7/s;->e:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LQ7/s$b;

    return-object p0
.end method

.method private final z()Li6/k;
    .registers 1

    iget-object p0, p0, LQ7/s;->d:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li6/k;

    return-object p0
.end method


# virtual methods
.method public final I(Landroid/graphics/Bitmap;LQ7/f$a;)Z
    .registers 6

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/s;->g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    instance-of v1, v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    const-string v2, "MLKitSegmenter"

    if-eqz v1, :cond_2b

    iget-object v1, p0, LQ7/s;->c:Lh5/d;

    if-nez v1, :cond_17

    goto :goto_2b

    :cond_17
    const-string v0, "processBitmap start"

    invoke-static {v2, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LQ7/f;

    iget-object p0, p0, LQ7/s;->c:Lh5/d;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v0, p0}, LQ7/f;-><init>(Lh5/d;)V

    invoke-virtual {v0, p1, p2}, LQ7/f;->j(Landroid/graphics/Bitmap;LQ7/f$a;)V

    const/4 p0, 0x1

    return p0

    :cond_2b
    :goto_2b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "processBitmap, module is not available, state:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public final N(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LQ7/s;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final O()V
    .registers 1

    iget-object p0, p0, LQ7/s;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final r(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LQ7/s;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final w()V
    .registers 3

    const-string v0, "MLKitSegmenter"

    const-string v1, "close"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, LQ7/s;->c:Lh5/d;

    if-eqz p0, :cond_e

    invoke-interface {p0}, Lh5/d;->close()V

    :cond_e
    return-void
.end method

.method public final y()Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;
    .registers 1

    iget-object p0, p0, LQ7/s;->g:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    return-object p0
.end method
