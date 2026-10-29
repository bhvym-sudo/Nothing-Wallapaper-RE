.class public abstract LN7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LN7/d;

    invoke-direct {v0}, LN7/d;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LN7/f;->a:Lh8/h;

    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/q;LN7/f$a;)V
    .registers 2

    invoke-static {p0, p1}, LN7/f;->k(Landroidx/lifecycle/q;LN7/f$a;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/internal/E;Landroid/os/Bundle;)V
    .registers 2

    invoke-static {p0, p1}, LN7/f;->l(Lkotlin/jvm/internal/E;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Landroidx/lifecycle/q;LN7/f$a;)V
    .registers 2

    invoke-static {p0, p1}, LN7/f;->j(Landroidx/lifecycle/q;LN7/f$a;)V

    return-void
.end method

.method public static synthetic d()Landroid/os/Handler;
    .registers 1

    invoke-static {}, LN7/f;->n()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;LN7/f$a;Lkotlin/jvm/internal/E;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LN7/f;->i(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;LN7/f$a;Lkotlin/jvm/internal/E;)V

    return-void
.end method

.method public static final synthetic f(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/A;Ljava/lang/String;)V
    .registers 3

    invoke-static {p0, p1, p2}, LN7/f;->h(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/A;Ljava/lang/String;)V

    return-void
.end method

.method public static final g(Landroidx/lifecycle/q;Lv8/l;)Lh8/o;
    .registers 5

    const-string v0, "lifecycle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/E;

    invoke-direct {v0}, Lkotlin/jvm/internal/E;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    new-instance p1, Lkotlin/jvm/internal/A;

    invoke-direct {p1}, Lkotlin/jvm/internal/A;-><init>()V

    new-instance v1, LN7/f$a;

    invoke-direct {v1, p1, p0, v0}, LN7/f$a;-><init>(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;Lkotlin/jvm/internal/E;)V

    new-instance v2, LN7/a;

    invoke-direct {v2, p1, p0, v1, v0}, LN7/a;-><init>(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;LN7/f$a;Lkotlin/jvm/internal/E;)V

    new-instance p1, LN7/b;

    invoke-direct {p1, p0, v1}, LN7/b;-><init>(Landroidx/lifecycle/q;LN7/f$a;)V

    invoke-static {p1}, LN7/f;->o(Ljava/lang/Runnable;)V

    new-instance p0, Landroid/os/RemoteCallback;

    new-instance p1, LN7/c;

    invoke-direct {p1, v0}, LN7/c;-><init>(Lkotlin/jvm/internal/E;)V

    invoke-static {}, LN7/f;->m()Landroid/os/Handler;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroid/os/RemoteCallback;-><init>(Landroid/os/RemoteCallback$OnResultListener;Landroid/os/Handler;)V

    new-instance p1, Lh8/o;

    invoke-direct {p1, v2, p0}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private static final h(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/A;Ljava/lang/String;)V
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dispose onFrameCallback by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "BuildFrameCallback"

    invoke-static {v0, p2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    iput-object p2, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    const/4 p0, 0x1

    iput-boolean p0, p1, Lkotlin/jvm/internal/A;->q:Z

    return-void
.end method

.method private static final i(Lkotlin/jvm/internal/A;Landroidx/lifecycle/q;LN7/f$a;Lkotlin/jvm/internal/E;)V
    .registers 5

    iget-boolean v0, p0, Lkotlin/jvm/internal/A;->q:Z

    if-nez v0, :cond_11

    new-instance v0, LN7/e;

    invoke-direct {v0, p1, p2}, LN7/e;-><init>(Landroidx/lifecycle/q;LN7/f$a;)V

    invoke-static {v0}, LN7/f;->o(Ljava/lang/Runnable;)V

    const-string p1, "handle"

    invoke-static {p3, p0, p1}, LN7/f;->h(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/A;Ljava/lang/String;)V

    :cond_11
    return-void
.end method

.method private static final j(Landroidx/lifecycle/q;LN7/f$a;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/lifecycle/q;->d(Landroidx/lifecycle/w;)V

    return-void
.end method

.method private static final k(Landroidx/lifecycle/q;LN7/f$a;)V
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    return-void
.end method

.method private static final l(Lkotlin/jvm/internal/E;Landroid/os/Bundle;)V
    .registers 4

    iget-object v0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, Lv8/l;

    if-nez v0, :cond_7

    goto :goto_36

    :cond_7
    if-eqz p1, :cond_10

    const-string v0, "frame_bitmap_fetcher"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    goto :goto_11

    :cond_10
    const/4 p1, 0x0

    :goto_11
    const-string v0, "BuildFrameCallback"

    if-nez p1, :cond_1b

    const-string p0, "frame_bitmap_fetcher didn\'t received."

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1b
    invoke-static {p1}, Lj6/f$a;->a(Landroid/os/IBinder;)Lj6/f;

    move-result-object p1

    const-string v1, "send bitmap to onFrame."

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Lv8/l;

    if-eqz p0, :cond_36

    invoke-interface {p1}, Lj6/f;->get()Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_36
    :goto_36
    return-void
.end method

.method private static final m()Landroid/os/Handler;
    .registers 1

    sget-object v0, LN7/f;->a:Lh8/h;

    invoke-interface {v0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method private static final n()Landroid/os/Handler;
    .registers 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method private static final o(Ljava/lang/Runnable;)V
    .registers 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_12

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_12
    invoke-static {}, LN7/f;->m()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
