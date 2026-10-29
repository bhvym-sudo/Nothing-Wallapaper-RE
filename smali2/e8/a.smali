.class public Le8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/a$d;,
        Le8/a$b;,
        Le8/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private final b:Le8/d;

.field private final c:Le8/b;

.field private final d:Landroid/os/HandlerThread;

.field private final e:Le8/a$d;


# direct methods
.method public constructor <init>(Le8/b;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Le8/a;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Le8/d;

    invoke-direct {v0}, Le8/d;-><init>()V

    iput-object v0, p0, Le8/a;->b:Le8/d;

    const-string v1, "initialize!"

    const-string v2, "Customizable-Player"

    invoke-static {v2, v1}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_24

    const-string v1, "CustomizableHapticPlayer() null == performer"

    invoke-static {v2, v1}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Le8/d;->b(II)V

    :cond_24
    iput-object p1, p0, Le8/a;->c:Le8/b;

    new-instance p1, Landroid/os/HandlerThread;

    invoke-direct {p1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Le8/a;->d:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    new-instance v0, Le8/a$d;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    new-instance v1, Le8/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Le8/a$b;-><init>(Le8/a;Le8/a$c;)V

    invoke-direct {v0, p1, v1}, Le8/a$d;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Le8/a;->e:Le8/a$d;

    return-void
.end method

.method static synthetic g(Le8/a;)Le8/b;
    .registers 1

    iget-object p0, p0, Le8/a;->c:Le8/b;

    return-object p0
.end method

.method static synthetic h(Le8/a;)Le8/d;
    .registers 1

    iget-object p0, p0, Le8/a;->b:Le8/d;

    return-object p0
.end method

.method static synthetic i(Le8/a;)Le8/a$d;
    .registers 1

    iget-object p0, p0, Le8/a;->e:Le8/a$d;

    return-object p0
.end method

.method static synthetic j(Le8/a;)Ljava/util/concurrent/ExecutorService;
    .registers 1

    iget-object p0, p0, Le8/a;->a:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method


# virtual methods
.method public a()V
    .registers 5

    const-string v0, "Customizable-Player"

    const-string v1, " released!"

    invoke-static {v0, v1}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Le8/a;->e()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Le8/a;->e:Le8/a$d;

    const/16 v3, 0x3eb

    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v0, v3, v2, v1}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    :cond_1a
    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->h()V

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0, v1, v2}, Le8/d;->b(II)V

    iget-object v0, p0, Le8/a;->d:Landroid/os/HandlerThread;

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_2b
    iget-object p0, p0, Le8/a;->a:Ljava/util/concurrent/ExecutorService;

    if-eqz p0, :cond_32

    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_32
    return-void
.end method

.method public b()V
    .registers 5

    invoke-virtual {p0}, Le8/a;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    iget-object v0, p0, Le8/a;->e:Le8/a$d;

    const/16 v2, 0x3eb

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    :cond_13
    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->h()V

    iget-object p0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p0, v1, v1}, Le8/d;->b(II)V

    return-void
.end method

.method public c()V
    .registers 4

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/4 v1, 0x3

    const-string v2, "Customizable-Player"

    if-eq v1, v0, :cond_35

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/16 v1, 0x8

    if-eq v1, v0, :cond_35

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "call prepare() in invalid status:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p0}, Le8/d;->e()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", do nothing!"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_35
    iget-object v0, p0, Le8/a;->b:Le8/d;

    iget-object v0, v0, Le8/d;->a:Ljava/lang/String;

    invoke-static {v0}, Ld8/b;->q(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4a

    iget-object v0, p0, Le8/a;->b:Le8/d;

    iget-object v1, v0, Le8/d;->a:Ljava/lang/String;

    invoke-static {v1}, Ld8/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Le8/d;->a:Ljava/lang/String;

    :cond_4a
    iget-object v0, p0, Le8/a;->b:Le8/d;

    iget-object v1, v0, Le8/d;->a:Ljava/lang/String;

    iput-object v1, v0, Le8/d;->k:Ljava/lang/String;

    invoke-static {v1}, Ld8/b;->p(Ljava/lang/String;)Lc8/a;

    move-result-object v0

    invoke-static {v0}, Le8/d;->d(La8/c;)Z

    move-result v1

    if-nez v1, :cond_6d

    const-string v0, "prepare error, invalid HE"

    invoke-static {v2, v0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->h()V

    iget-object p0, p0, Le8/a;->b:Le8/d;

    const/4 v0, 0x2

    const/16 v1, 0x1001

    invoke-virtual {p0, v0, v1}, Le8/d;->b(II)V

    return-void

    :cond_6d
    iget-object v1, p0, Le8/a;->b:Le8/d;

    iput-object v0, v1, Le8/d;->g:Lc8/a;

    invoke-virtual {v1}, Le8/d;->g()V

    iget-object v0, p0, Le8/a;->c:Le8/b;

    iget-object v1, p0, Le8/a;->b:Le8/d;

    iget-object v1, v1, Le8/d;->l:Ljava/lang/String;

    invoke-interface {v0, v1}, Le8/b;->c(Ljava/lang/String;)V

    iget-object v0, p0, Le8/a;->c:Le8/b;

    const/16 v1, 0xff

    invoke-interface {v0, v1}, Le8/b;->b(I)V

    iget-object v0, p0, Le8/a;->b:Le8/d;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Le8/d;->b(II)V

    iget-object p0, p0, Le8/a;->b:Le8/d;

    iget-object p0, p0, Le8/d;->a:Ljava/lang/String;

    const-string v0, "prepared.he"

    invoke-static {v0, p0}, Ld8/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;IIIILf8/a;)V
    .registers 9

    iget-object p6, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p6}, Le8/d;->e()I

    move-result p6

    const-string v0, "Customizable-Player"

    if-eqz p6, :cond_2a

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "setDataSource in invalid status:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p0}, Le8/d;->e()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ",do nothing!"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2a
    iget-object p6, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p6}, Le8/d;->h()V

    iget-object p6, p0, Le8/a;->b:Le8/d;

    iput-object p1, p6, Le8/d;->a:Ljava/lang/String;

    iput p2, p6, Le8/d;->d:I

    iput p3, p6, Le8/d;->e:I

    const/4 p1, 0x0

    const/16 v1, 0x1ff

    if-le p2, v1, :cond_3f

    iput v1, p6, Le8/d;->d:I

    goto :goto_43

    :cond_3f
    if-gez p2, :cond_43

    iput p1, p6, Le8/d;->d:I

    :cond_43
    :goto_43
    const/16 p2, 0x64

    if-le p3, p2, :cond_4a

    :goto_47
    iput p2, p6, Le8/d;->e:I

    goto :goto_4f

    :cond_4a
    const/16 p2, -0x64

    if-ge p3, p2, :cond_4f

    goto :goto_47

    :cond_4f
    :goto_4f
    const/4 p2, 0x1

    if-ltz p4, :cond_56

    add-int/2addr p4, p2

    iput p4, p6, Le8/d;->c:I

    goto :goto_5e

    :cond_56
    const/4 p3, -0x1

    if-ne p3, p4, :cond_5c

    const p2, 0x7fffffff

    :cond_5c
    iput p2, p6, Le8/d;->c:I

    :goto_5e
    if-ltz p5, :cond_62

    iput p5, p6, Le8/d;->f:I

    :cond_62
    const-string p2, "will change to initialized!"

    invoke-static {v0, p2}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Le8/a;->b:Le8/d;

    const/4 p2, 0x3

    invoke-virtual {p0, p2, p1}, Le8/d;->b(II)V

    return-void
.end method

.method public e()Z
    .registers 2

    iget-object p0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p0}, Le8/d;->e()I

    move-result p0

    const/4 v0, 0x6

    if-ne v0, p0, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public start()V
    .registers 5

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/4 v1, 0x5

    const/16 v2, 0x9

    const-string v3, "Customizable-Player"

    if-eq v1, v0, :cond_3e

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/4 v1, 0x7

    if-eq v1, v0, :cond_3e

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    if-eq v2, v0, :cond_3e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "call start() in invalid status:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p0}, Le8/d;->e()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", do nothing!"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  start() in, mCurrentHePausePosition:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le8/a;->b:Le8/d;

    iget v1, v1, Le8/d;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/4 v1, 0x0

    if-ne v2, v0, :cond_68

    const-string v0, "  start() return, already COMPLETED, start from 0"

    invoke-static {v3, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Le8/a;->b:Le8/d;

    iput v1, v0, Le8/d;->h:I

    :cond_68
    iget-object v0, p0, Le8/a;->e:Le8/a$d;

    const/16 v2, 0x3ed

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    iget-object p0, p0, Le8/a;->b:Le8/d;

    const/4 v0, 0x6

    invoke-virtual {p0, v0, v1}, Le8/d;->b(II)V

    return-void
.end method

.method public stop()V
    .registers 5

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/4 v1, 0x6

    if-eq v1, v0, :cond_3e

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/4 v1, 0x7

    if-eq v1, v0, :cond_3e

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->e()I

    move-result v0

    const/16 v1, 0x9

    if-eq v1, v0, :cond_3e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "call stop() in invalid status:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {p0}, Le8/d;->e()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", do nothing!"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Customizable-Player"

    invoke-static {v0, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3e
    iget-object v0, p0, Le8/a;->e:Le8/a$d;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Le8/a$d;->b(Landroid/os/Message;IZ)Z

    iget-object v0, p0, Le8/a;->b:Le8/d;

    invoke-virtual {v0}, Le8/d;->h()V

    iget-object p0, p0, Le8/a;->b:Le8/d;

    const/16 v0, 0x8

    invoke-virtual {p0, v0, v3}, Le8/d;->b(II)V

    return-void
.end method
