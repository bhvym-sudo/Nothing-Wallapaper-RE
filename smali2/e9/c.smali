.class public Le9/c;
.super Le9/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/c$a;,
        Le9/c$b;
    }
.end annotation


# static fields
.field private static final i:Le9/c$a;

.field private static final j:Ljava/util/concurrent/locks/ReentrantLock;

.field private static final k:Ljava/util/concurrent/locks/Condition;

.field private static final l:J

.field private static final m:J

.field private static n:Le9/c;


# instance fields
.field private f:I

.field private g:Le9/c;

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Le9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le9/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Le9/c;->i:Le9/c$a;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Le9/c;->j:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "newCondition(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Le9/c;->k:Ljava/util/concurrent/locks/Condition;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Le9/c;->l:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Le9/c;->m:J

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Le9/C;-><init>()V

    return-void
.end method

.method public static final synthetic i()Le9/c$a;
    .registers 1

    sget-object v0, Le9/c;->i:Le9/c$a;

    return-object v0
.end method

.method public static final synthetic j()Ljava/util/concurrent/locks/Condition;
    .registers 1

    sget-object v0, Le9/c;->k:Ljava/util/concurrent/locks/Condition;

    return-object v0
.end method

.method public static final synthetic k()Le9/c;
    .registers 1

    sget-object v0, Le9/c;->n:Le9/c;

    return-object v0
.end method

.method public static final synthetic l()J
    .registers 2

    sget-wide v0, Le9/c;->l:J

    return-wide v0
.end method

.method public static final synthetic m()J
    .registers 2

    sget-wide v0, Le9/c;->m:J

    return-wide v0
.end method

.method public static final synthetic n()Ljava/util/concurrent/locks/ReentrantLock;
    .registers 1

    sget-object v0, Le9/c;->j:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic o(Le9/c;)Le9/c;
    .registers 1

    iget-object p0, p0, Le9/c;->g:Le9/c;

    return-object p0
.end method

.method public static final synthetic q(Le9/c;J)J
    .registers 3

    invoke-direct {p0, p1, p2}, Le9/c;->y(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic r(Le9/c;)V
    .registers 1

    sput-object p0, Le9/c;->n:Le9/c;

    return-void
.end method

.method public static final synthetic s(Le9/c;Le9/c;)V
    .registers 2

    iput-object p1, p0, Le9/c;->g:Le9/c;

    return-void
.end method

.method public static final synthetic t(Le9/c;I)V
    .registers 2

    iput p1, p0, Le9/c;->f:I

    return-void
.end method

.method public static final synthetic u(Le9/c;J)V
    .registers 3

    iput-wide p1, p0, Le9/c;->h:J

    return-void
.end method

.method private final y(J)J
    .registers 5

    iget-wide v0, p0, Le9/c;->h:J

    sub-long/2addr v0, p1

    return-wide v0
.end method


# virtual methods
.method public final A(Le9/B;)Le9/B;
    .registers 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/c$d;

    invoke-direct {v0, p0, p1}, Le9/c$d;-><init>(Le9/c;Le9/B;)V

    return-object v0
.end method

.method protected B()V
    .registers 1

    return-void
.end method

.method public final p(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 2

    invoke-virtual {p0, p1}, Le9/c;->x(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0
.end method

.method public final v()V
    .registers 6

    invoke-virtual {p0}, Le9/C;->h()J

    move-result-wide v0

    invoke-virtual {p0}, Le9/C;->e()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-nez v3, :cond_11

    if-nez v2, :cond_11

    return-void

    :cond_11
    sget-object v3, Le9/c;->j:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_16
    iget v4, p0, Le9/c;->f:I

    if-nez v4, :cond_2a

    const/4 v4, 0x1

    iput v4, p0, Le9/c;->f:I

    sget-object v4, Le9/c;->i:Le9/c$a;

    invoke-static {v4, p0, v0, v1, v2}, Le9/c$a;->a(Le9/c$a;Le9/c;JZ)V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_24
    .catchall {:try_start_16 .. :try_end_24} :catchall_28

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_28
    move-exception p0

    goto :goto_32

    :cond_2a
    :try_start_2a
    const-string p0, "Unbalanced enter/exit"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_32
    .catchall {:try_start_2a .. :try_end_32} :catchall_28

    :goto_32
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method public final w()Z
    .registers 5

    sget-object v0, Le9/c;->j:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_5
    iget v1, p0, Le9/c;->f:I

    const/4 v2, 0x0

    iput v2, p0, Le9/c;->f:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_18

    sget-object v1, Le9/c;->i:Le9/c$a;

    invoke-static {v1, p0}, Le9/c$a;->b(Le9/c$a;Le9/c;)V
    :try_end_12
    .catchall {:try_start_5 .. :try_end_12} :catchall_16

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :catchall_16
    move-exception p0

    goto :goto_20

    :cond_18
    const/4 p0, 0x2

    if-ne v1, p0, :cond_1c

    move v2, v3

    :cond_1c
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :goto_20
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method protected x(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 3

    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "timeout"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_c
    return-object p0
.end method

.method public final z(Le9/z;)Le9/z;
    .registers 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/c$c;

    invoke-direct {v0, p0, p1}, Le9/c$c;-><init>(Le9/c;Le9/z;)V

    return-object v0
.end method
