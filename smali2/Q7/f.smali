.class public final LQ7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ7/f$a;
    }
.end annotation


# instance fields
.field private final a:Lh5/d;

.field private final b:Ljava/lang/String;

.field private final c:Lh8/h;

.field private final d:Lh8/h;


# direct methods
.method public constructor <init>(Lh5/d;)V
    .registers 3

    const-string v0, "subjectSegmenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/f;->a:Lh5/d;

    const-string p1, "MLKitSegmenterProcessor"

    iput-object p1, p0, LQ7/f;->b:Ljava/lang/String;

    new-instance p1, LQ7/d;

    invoke-direct {p1}, LQ7/d;-><init>()V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LQ7/f;->c:Lh8/h;

    new-instance p1, LQ7/e;

    invoke-direct {p1}, LQ7/e;-><init>()V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LQ7/f;->d:Lh8/h;

    return-void
.end method

.method public static synthetic a(LQ7/f;LQ7/f$a;Ljava/lang/Exception;)V
    .registers 3

    invoke-static {p0, p1, p2}, LQ7/f;->m(LQ7/f;LQ7/f$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b()Landroid/app/ActivityManager;
    .registers 1

    invoke-static {}, LQ7/f;->e()Landroid/app/ActivityManager;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(LQ7/f;LQ7/f$a;Lh5/c;)V
    .registers 3

    invoke-static {p0, p1, p2}, LQ7/f;->l(LQ7/f;LQ7/f$a;Lh5/c;)V

    return-void
.end method

.method public static synthetic d()Ljava/util/concurrent/ExecutorService;
    .registers 1

    invoke-static {}, LQ7/f;->g()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private static final e()Landroid/app/ActivityManager;
    .registers 2

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/ActivityManager;

    return-object v0
.end method

.method private final f(Lf5/a;)Lv4/k;
    .registers 2

    iget-object p0, p0, LQ7/f;->a:Lh5/d;

    invoke-interface {p0, p1}, Lh5/d;->p0(Lf5/a;)Lv4/k;

    move-result-object p0

    const-string p1, "process(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final g()Ljava/util/concurrent/ExecutorService;
    .registers 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private final h()Landroid/app/ActivityManager;
    .registers 1

    iget-object p0, p0, LQ7/f;->c:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    return-object p0
.end method

.method private final i()Ljava/util/concurrent/ExecutorService;
    .registers 1

    iget-object p0, p0, LQ7/f;->d:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method private final k(Lv4/k;LQ7/f$a;)Lv4/k;
    .registers 5

    invoke-direct {p0}, LQ7/f;->i()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, LQ7/b;

    invoke-direct {v1, p0, p2}, LQ7/b;-><init>(LQ7/f;LQ7/f$a;)V

    invoke-virtual {p1, v0, v1}, Lv4/k;->f(Ljava/util/concurrent/Executor;Lv4/g;)Lv4/k;

    move-result-object p1

    invoke-direct {p0}, LQ7/f;->i()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, LQ7/c;

    invoke-direct {v1, p0, p2}, LQ7/c;-><init>(LQ7/f;LQ7/f$a;)V

    invoke-virtual {p1, v0, v1}, Lv4/k;->d(Ljava/util/concurrent/Executor;Lv4/f;)Lv4/k;

    move-result-object p0

    const-string p1, "addOnFailureListener(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final l(LQ7/f;LQ7/f$a;Lh5/c;)V
    .registers 7

    iget-object v0, p0, LQ7/f;->b:Ljava/lang/String;

    const-string v1, "Success to process."

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-eqz v0, :cond_3c

    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-direct {p0}, LQ7/f;->h()Landroid/app/ActivityManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    const-wide/32 v2, 0x100000

    div-long/2addr v0, v2

    iget-object p0, p0, LQ7/f;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Memory available in system: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " MB"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3c
    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, LQ7/f$a;->b(Lh5/c;)V

    return-void
.end method

.method private static final m(LQ7/f;LQ7/f$a;Ljava/lang/Exception;)V
    .registers 5

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LQ7/f;->b:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to process. error:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, LQ7/f$a;->a()V

    return-void
.end method


# virtual methods
.method public final j(Landroid/graphics/Bitmap;LQ7/f$a;)V
    .registers 4

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lf5/a;->a(Landroid/graphics/Bitmap;I)Lf5/a;

    move-result-object p1

    const-string v0, "fromBitmap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LQ7/f;->f(Lf5/a;)Lv4/k;

    move-result-object p1

    invoke-direct {p0, p1, p2}, LQ7/f;->k(Lv4/k;LQ7/f$a;)Lv4/k;

    return-void
.end method
