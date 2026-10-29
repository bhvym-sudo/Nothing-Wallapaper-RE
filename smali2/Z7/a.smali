.class public LZ7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/c;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/os/Vibrator;

.field private c:Le8/c;

.field private d:Le8/g;


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LZ7/a;->a:Landroid/content/Context;

    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    iput-object p1, p0, LZ7/a;->b:Landroid/os/Vibrator;

    new-instance p1, Le8/g;

    iget-object v0, p0, LZ7/a;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, Le8/g;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, LZ7/a;->d:Le8/g;

    if-eqz p2, :cond_40

    const/4 v0, 0x2

    if-eq p2, v0, :cond_38

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unknown player type:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "RichTapPlayer"

    invoke-static {p2, p1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4e

    :cond_38
    new-instance p2, LZ7/a;

    invoke-direct {p2, p1}, LZ7/a;-><init>(Le8/b;)V

    iput-object p2, p0, LZ7/a;->c:Le8/c;

    goto :goto_4e

    :cond_40
    new-instance p1, LZ7/a;

    new-instance p2, Le8/e;

    iget-object v0, p0, LZ7/a;->b:Landroid/os/Vibrator;

    invoke-direct {p2, v0}, Le8/e;-><init>(Landroid/os/Vibrator;)V

    invoke-direct {p1, p2}, LZ7/a;-><init>(Le8/b;)V

    iput-object p1, p0, LZ7/a;->c:Le8/c;

    :goto_4e
    iget-object p0, p0, LZ7/a;->a:Landroid/content/Context;

    sput-object p0, Ld8/d;->b:Landroid/content/Context;

    return-void
.end method

.method private constructor <init>(Le8/b;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Le8/c;->f(Le8/b;)Le8/c;

    move-result-object p1

    iput-object p1, p0, LZ7/a;->c:Le8/c;

    return-void
.end method

.method public static g(Landroid/content/Context;I)LZ7/a;
    .registers 5

    const/4 v0, 0x0

    const-string v1, "RichTapPlayer"

    if-nez p0, :cond_b

    const-string p0, "context == null"

    invoke-static {v1, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_b
    invoke-static {p1}, LZ7/a;->i(I)Z

    move-result v2

    if-nez v2, :cond_17

    const-string p0, "specified player type not available!"

    invoke-static {v1, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_17
    new-instance v0, LZ7/a;

    invoke-direct {v0, p0, p1}, LZ7/a;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public static h(Landroid/content/Context;)I
    .registers 3

    const/4 v0, -0x1

    if-nez p0, :cond_d

    :try_start_3
    const-string p0, "RichTapPlayer"

    const-string v1, "getRichTapCoreMajorVersion, null == context"

    invoke-static {p0, v1}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :catchall_b
    move-exception p0

    goto :goto_17

    :cond_d
    new-instance v1, Le8/g;

    invoke-direct {v1, p0}, Le8/g;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Le8/g;->d()I

    move-result p0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_b

    return p0

    :goto_17
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method

.method public static i(I)Z
    .registers 3

    if-eqz p0, :cond_11

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p0, v0, :cond_7

    return v1

    :cond_7
    :try_start_7
    invoke-static {}, Le8/g;->f()Z

    move-result p0
    :try_end_b
    .catchall {:try_start_7 .. :try_end_b} :catchall_c

    return p0

    :catchall_c
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return v1

    :cond_11
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a()V
    .registers 2

    iget-object v0, p0, LZ7/a;->c:Le8/c;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Le8/c;->a()V

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, LZ7/a;->c:Le8/c;

    return-void
.end method

.method public b()V
    .registers 2

    iget-object p0, p0, LZ7/a;->c:Le8/c;

    if-nez p0, :cond_c

    const-string p0, "RichTapPlayer"

    const-string v0, "null == mPlayer!"

    invoke-static {p0, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-interface {p0}, Le8/c;->b()V

    return-void
.end method

.method public c()V
    .registers 2

    iget-object p0, p0, LZ7/a;->c:Le8/c;

    if-nez p0, :cond_c

    const-string p0, "RichTapPlayer"

    const-string v0, "null == mPlayer!"

    invoke-static {p0, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-interface {p0}, Le8/c;->c()V

    return-void
.end method

.method public d(Ljava/lang/String;IIIILf8/a;)V
    .registers 7

    iget-object p0, p0, LZ7/a;->c:Le8/c;

    if-nez p0, :cond_c

    const-string p0, "RichTapPlayer"

    const-string p1, "null == mPlayer!"

    invoke-static {p0, p1}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-interface/range {p0 .. p6}, Le8/c;->d(Ljava/lang/String;IIIILf8/a;)V

    return-void
.end method

.method public e()Z
    .registers 2

    iget-object p0, p0, LZ7/a;->c:Le8/c;

    if-nez p0, :cond_d

    const-string p0, "RichTapPlayer"

    const-string v0, "null == mPlayer!"

    invoke-static {p0, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_d
    invoke-interface {p0}, Le8/c;->e()Z

    move-result p0

    return p0
.end method

.method public start()V
    .registers 2

    iget-object p0, p0, LZ7/a;->c:Le8/c;

    if-nez p0, :cond_c

    const-string p0, "RichTapPlayer"

    const-string v0, "null == mPlayer!"

    invoke-static {p0, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-interface {p0}, Le8/c;->start()V

    return-void
.end method

.method public stop()V
    .registers 2

    iget-object p0, p0, LZ7/a;->c:Le8/c;

    if-nez p0, :cond_c

    const-string p0, "RichTapPlayer"

    const-string v0, "null == mPlayer!"

    invoke-static {p0, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    invoke-interface {p0}, Le8/c;->stop()V

    return-void
.end method
