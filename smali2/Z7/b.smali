.class public LZ7/b;
.super Ld8/a;
.source "SourceFile"


# static fields
.field private static j:LZ7/b;


# instance fields
.field private c:Landroid/content/Context;

.field private d:Landroid/os/Vibrator;

.field private e:I

.field private f:LZ7/a;

.field private g:Le8/f;

.field private h:I

.field private i:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ld8/a;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LZ7/b;->e:I

    iput v0, p0, LZ7/b;->h:I

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, LZ7/b;->i:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a(LZ7/b;)I
    .registers 1

    iget p0, p0, LZ7/b;->h:I

    return p0
.end method

.method static synthetic b(LZ7/b;)I
    .registers 1

    iget p0, p0, LZ7/b;->e:I

    return p0
.end method

.method static synthetic c(LZ7/b;)Le8/f;
    .registers 1

    iget-object p0, p0, LZ7/b;->g:Le8/f;

    return-object p0
.end method

.method static synthetic d(LZ7/b;)LZ7/a;
    .registers 1

    iget-object p0, p0, LZ7/b;->f:LZ7/a;

    return-object p0
.end method

.method public static e()LZ7/b;
    .registers 2

    sget-object v0, LZ7/b;->j:LZ7/b;

    if-nez v0, :cond_19

    const-class v0, LZ7/b;

    monitor-enter v0

    :try_start_7
    sget-object v1, LZ7/b;->j:LZ7/b;

    if-nez v1, :cond_15

    new-instance v1, LZ7/b;

    invoke-direct {v1}, LZ7/b;-><init>()V

    sput-object v1, LZ7/b;->j:LZ7/b;

    goto :goto_15

    :catchall_13
    move-exception v1

    goto :goto_17

    :cond_15
    :goto_15
    monitor-exit v0

    goto :goto_19

    :goto_17
    monitor-exit v0
    :try_end_18
    .catchall {:try_start_7 .. :try_end_18} :catchall_13

    throw v1

    :cond_19
    :goto_19
    sget-object v0, LZ7/b;->j:LZ7/b;

    return-object v0
.end method


# virtual methods
.method public f()I
    .registers 1

    iget-object p0, p0, LZ7/b;->c:Landroid/content/Context;

    invoke-static {p0}, LZ7/a;->h(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method public g(Landroid/content/Context;)LZ7/b;
    .registers 6

    const-string v0, "RichTapUtils"

    if-eqz p1, :cond_a7

    :try_start_4
    iget-object v1, p0, LZ7/b;->f:LZ7/a;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, LZ7/a;->a()V

    const/4 v1, 0x0

    iput-object v1, p0, LZ7/b;->f:LZ7/a;

    goto :goto_11

    :catchall_f
    move-exception p1

    goto :goto_77

    :cond_11
    :goto_11
    iget-object v1, p0, LZ7/b;->g:Le8/f;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Le8/f;->b()V

    :cond_18
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, LZ7/b;->c:Landroid/content/Context;

    if-nez v1, :cond_27

    const-string v1, "fail to get application context!"

    invoke-static {v0, v1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LZ7/b;->c:Landroid/content/Context;

    :cond_27
    iget-object p1, p0, LZ7/b;->c:Landroid/content/Context;

    const-string v1, "vibrator"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    iput-object p1, p0, LZ7/b;->d:Landroid/os/Vibrator;

    invoke-virtual {p0}, LZ7/b;->f()I

    move-result p1

    iput p1, p0, LZ7/b;->h:I

    const/4 p1, 0x2

    invoke-static {p1}, LZ7/a;->i(I)Z

    move-result v1

    if-eqz v1, :cond_5b

    iget v1, p0, LZ7/b;->h:I

    const/16 v2, 0x20

    if-gt v2, v1, :cond_50

    new-instance v2, Le8/f;

    iget-object v3, p0, LZ7/b;->c:Landroid/content/Context;

    invoke-direct {v2, v3, v1}, Le8/f;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, LZ7/b;->g:Le8/f;

    goto :goto_58

    :cond_50
    iget-object v1, p0, LZ7/b;->c:Landroid/content/Context;

    invoke-static {v1, p1}, LZ7/a;->g(Landroid/content/Context;I)LZ7/a;

    move-result-object v1

    iput-object v1, p0, LZ7/b;->f:LZ7/a;

    :goto_58
    iput p1, p0, LZ7/b;->e:I

    goto :goto_7a

    :cond_5b
    const/4 p1, 0x1

    invoke-static {p1}, LZ7/a;->i(I)Z

    move-result v1

    if-eqz v1, :cond_6b

    iget-object v1, p0, LZ7/b;->c:Landroid/content/Context;

    invoke-static {v1, p1}, LZ7/a;->g(Landroid/content/Context;I)LZ7/a;

    move-result-object v1

    iput-object v1, p0, LZ7/b;->f:LZ7/a;

    goto :goto_58

    :cond_6b
    iget-object p1, p0, LZ7/b;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LZ7/a;->g(Landroid/content/Context;I)LZ7/a;

    move-result-object p1

    iput-object p1, p0, LZ7/b;->f:LZ7/a;

    iput v1, p0, LZ7/b;->e:I
    :try_end_76
    .catchall {:try_start_4 .. :try_end_76} :catchall_f

    goto :goto_7a

    :goto_77
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_7a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "init , sdk version:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ld8/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " versionCode:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Ld8/a;->a:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", RichTap Core Major Version:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LZ7/b;->h:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, LZ7/b;->j:LZ7/b;

    return-object p0

    :cond_a7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "context shouldn\'t be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public h()Z
    .registers 2

    const/4 p0, 0x2

    invoke-static {p0}, LZ7/a;->i(I)Z

    move-result p0

    const/4 v0, 0x1

    if-nez p0, :cond_11

    invoke-static {v0}, LZ7/a;->i(I)Z

    move-result p0

    if-eqz p0, :cond_f

    goto :goto_11

    :cond_f
    const/4 p0, 0x0

    return p0

    :cond_11
    :goto_11
    return v0
.end method

.method public i(Ljava/io/File;I)V
    .registers 9

    const/16 v4, 0xff

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v5}, LZ7/b;->j(Ljava/io/File;IIII)V

    return-void
.end method

.method public j(Ljava/io/File;IIII)V
    .registers 6

    invoke-static {p1}, Ld8/d;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual/range {p0 .. p5}, LZ7/b;->k(Ljava/lang/String;IIII)V

    return-void
.end method

.method public k(Ljava/lang/String;IIII)V
    .registers 13

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, LZ7/b;->l(Ljava/lang/String;IIIILf8/a;)V

    return-void
.end method

.method public l(Ljava/lang/String;IIIILf8/a;)V
    .registers 16

    if-eqz p1, :cond_55

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_55

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "playHaptic: loop:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",interval:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",amplitude:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",freq:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",callback is null:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p6, :cond_36

    const/4 v1, 0x1

    goto :goto_37

    :cond_36
    const/4 v1, 0x0

    :goto_37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RichTapUtils"

    invoke-static {v1, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LZ7/b;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LZ7/b$a;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, LZ7/b$a;-><init>(LZ7/b;Ljava/lang/String;IIIILf8/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_55
    move-object v3, p1

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Wrong parameter {string: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "} is null!"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public m(Ljava/io/File;I)V
    .registers 3

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p0, p1, p2}, LZ7/b;->i(Ljava/io/File;I)V

    return-void
.end method
