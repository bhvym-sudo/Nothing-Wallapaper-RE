.class public final Lq6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/ExecutorService;

.field private final c:Landroid/os/Vibrator;

.field private final d:Z

.field private final e:Landroid/os/VibrationAttributes;

.field private final f:Landroid/os/VibrationEffect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq6/f;->a:Landroid/content/Context;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lq6/f;->b:Ljava/util/concurrent/ExecutorService;

    const-class v0, Landroid/os/Vibrator;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    iput-object p1, p0, Lq6/f;->c:Landroid/os/Vibrator;

    const/4 v0, 0x0

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result p1

    goto :goto_23

    :cond_22
    move p1, v0

    :goto_23
    iput-boolean p1, p0, Lq6/f;->d:Z

    const/16 p1, 0x12

    invoke-static {p1}, Landroid/os/VibrationAttributes;->createForUsage(I)Landroid/os/VibrationAttributes;

    move-result-object p1

    const-string v1, "createForUsage(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq6/f;->e:Landroid/os/VibrationAttributes;

    invoke-static {v0}, Landroid/os/VibrationEffect;->createPredefined(I)Landroid/os/VibrationEffect;

    move-result-object p1

    const-string v0, "createPredefined(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq6/f;->f:Landroid/os/VibrationEffect;

    return-void
.end method

.method public static synthetic a(Lq6/f;)V
    .registers 1

    invoke-static {p0}, Lq6/f;->c(Lq6/f;)V

    return-void
.end method

.method private static final c(Lq6/f;)V
    .registers 3

    iget-object v0, p0, Lq6/f;->c:Landroid/os/Vibrator;

    if-eqz v0, :cond_b

    iget-object v1, p0, Lq6/f;->f:Landroid/os/VibrationEffect;

    iget-object p0, p0, Lq6/f;->e:Landroid/os/VibrationAttributes;

    invoke-virtual {v0, v1, p0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;Landroid/os/VibrationAttributes;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final b()V
    .registers 3

    iget-boolean v0, p0, Lq6/f;->d:Z

    if-eqz v0, :cond_e

    iget-object v0, p0, Lq6/f;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lq6/e;

    invoke-direct {v1, p0}, Lq6/e;-><init>(Lq6/f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_e
    return-void
.end method
