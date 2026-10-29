.class public final Lj7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj7/m;

.field private static final b:Landroid/os/Handler;

.field private static final c:Ljava/lang/Runnable;

.field private static volatile d:Landroid/graphics/Bitmap;

.field private static volatile e:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lj7/m;

    invoke-direct {v0}, Lj7/m;-><init>()V

    sput-object v0, Lj7/m;->a:Lj7/m;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lj7/m;->b:Landroid/os/Handler;

    new-instance v0, Lj7/l;

    invoke-direct {v0}, Lj7/l;-><init>()V

    sput-object v0, Lj7/m;->c:Ljava/lang/Runnable;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .registers 0

    invoke-static {}, Lj7/m;->d()V

    return-void
.end method

.method public static final declared-synchronized c()V
    .registers 4

    const-class v0, Lj7/m;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lj7/m;->b:Landroid/os/Handler;

    sget-object v2, Lj7/m;->c:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v1, Lj7/m;->d:Landroid/graphics/Bitmap;
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_21

    if-nez v1, :cond_10

    monitor-exit v0

    return-void

    :cond_10
    :try_start_10
    sget-object v2, Lj7/m;->e:Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-eqz v2, :cond_23

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_23

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_23

    :catchall_21
    move-exception v1

    goto :goto_32

    :cond_23
    :goto_23
    sput-object v3, Lj7/m;->e:Ljava/lang/ref/WeakReference;

    sput-object v3, Lj7/m;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_30

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_30
    .catchall {:try_start_10 .. :try_end_30} :catchall_21

    :cond_30
    monitor-exit v0

    return-void

    :goto_32
    :try_start_32
    monitor-exit v0
    :try_end_33
    .catchall {:try_start_32 .. :try_end_33} :catchall_21

    throw v1
.end method

.method private static final d()V
    .registers 0

    invoke-static {}, Lj7/m;->c()V

    return-void
.end method

.method public static final e()V
    .registers 4

    sget-object v0, Lj7/m;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_5

    return-void

    :cond_5
    sget-object v0, Lj7/m;->b:Landroid/os/Handler;

    sget-object v1, Lj7/m;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static final f(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .registers 3

    const-string v0, "imageView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Lj7/m;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final b()Landroid/graphics/Bitmap;
    .registers 1

    sget-object p0, Lj7/m;->d:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final g(Landroid/graphics/Bitmap;)V
    .registers 2

    sput-object p1, Lj7/m;->d:Landroid/graphics/Bitmap;

    return-void
.end method
