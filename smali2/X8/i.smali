.class public final LX8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/i$a;,
        LX8/i$b;,
        LX8/i$c;,
        LX8/i$d;
    }
.end annotation


# static fields
.field public static final o:LX8/i$a;


# instance fields
.field private final a:I

.field private final b:LX8/f;

.field private c:J

.field private d:J

.field private e:J

.field private f:J

.field private final g:Ljava/util/ArrayDeque;

.field private h:Z

.field private final i:LX8/i$c;

.field private final j:LX8/i$b;

.field private final k:LX8/i$d;

.field private final l:LX8/i$d;

.field private m:LX8/b;

.field private n:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX8/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/i$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/i;->o:LX8/i$a;

    return-void
.end method

.method public constructor <init>(ILX8/f;ZZLP8/u;)V
    .registers 9

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LX8/i;->a:I

    iput-object p2, p0, LX8/i;->b:LX8/f;

    invoke-virtual {p2}, LX8/f;->X0()LX8/m;

    move-result-object p1

    invoke-virtual {p1}, LX8/m;->c()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, LX8/i;->f:J

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LX8/i;->g:Ljava/util/ArrayDeque;

    new-instance v0, LX8/i$c;

    invoke-virtual {p2}, LX8/f;->W0()LX8/m;

    move-result-object p2

    invoke-virtual {p2}, LX8/m;->c()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {v0, p0, v1, v2, p4}, LX8/i$c;-><init>(LX8/i;JZ)V

    iput-object v0, p0, LX8/i;->i:LX8/i$c;

    new-instance p2, LX8/i$b;

    invoke-direct {p2, p0, p3}, LX8/i$b;-><init>(LX8/i;Z)V

    iput-object p2, p0, LX8/i;->j:LX8/i$b;

    new-instance p2, LX8/i$d;

    invoke-direct {p2, p0}, LX8/i$d;-><init>(LX8/i;)V

    iput-object p2, p0, LX8/i;->k:LX8/i$d;

    new-instance p2, LX8/i$d;

    invoke-direct {p2, p0}, LX8/i$d;-><init>(LX8/i;)V

    iput-object p2, p0, LX8/i;->l:LX8/i$d;

    if-eqz p5, :cond_57

    invoke-virtual {p0}, LX8/i;->t()Z

    move-result p0

    if-nez p0, :cond_4f

    invoke-interface {p1, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_4f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "locally-initiated streams shouldn\'t have headers yet"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_57
    invoke-virtual {p0}, LX8/i;->t()Z

    move-result p0

    if-eqz p0, :cond_5e

    return-void

    :cond_5e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "remotely-initiated streams should have headers"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final e(LX8/b;Ljava/io/IOException;)Z
    .registers 5

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    monitor-enter p0

    :try_start_33
    iget-object v0, p0, LX8/i;->m:LX8/b;
    :try_end_35
    .catchall {:try_start_33 .. :try_end_35} :catchall_58

    const/4 v1, 0x0

    if-eqz v0, :cond_3a

    monitor-exit p0

    return v1

    :cond_3a
    :try_start_3a
    iput-object p1, p0, LX8/i;->m:LX8/b;

    iput-object p2, p0, LX8/i;->n:Ljava/io/IOException;

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    iget-object p1, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {p1}, LX8/i$c;->b()Z

    move-result p1

    if-eqz p1, :cond_5a

    iget-object p1, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {p1}, LX8/i$b;->b()Z

    move-result p1
    :try_end_54
    .catchall {:try_start_3a .. :try_end_54} :catchall_58

    if-eqz p1, :cond_5a

    monitor-exit p0

    return v1

    :catchall_58
    move-exception p1

    goto :goto_66

    :cond_5a
    :try_start_5a
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_5c
    .catchall {:try_start_5a .. :try_end_5c} :catchall_58

    monitor-exit p0

    iget-object p1, p0, LX8/i;->b:LX8/f;

    iget p0, p0, LX8/i;->a:I

    invoke-virtual {p1, p0}, LX8/f;->r1(I)LX8/i;

    const/4 p0, 0x1

    return p0

    :goto_66
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final A(J)V
    .registers 3

    iput-wide p1, p0, LX8/i;->c:J

    return-void
.end method

.method public final B(J)V
    .registers 3

    iput-wide p1, p0, LX8/i;->e:J

    return-void
.end method

.method public final declared-synchronized C()LP8/u;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LX8/i;->k:LX8/i$d;

    invoke-virtual {v0}, Le9/c;->v()V
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_34

    :goto_6
    :try_start_6
    iget-object v0, p0, LX8/i;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, LX8/i;->m:LX8/b;

    if-nez v0, :cond_18

    invoke-virtual {p0}, LX8/i;->D()V
    :try_end_15
    .catchall {:try_start_6 .. :try_end_15} :catchall_16

    goto :goto_6

    :catchall_16
    move-exception v0

    goto :goto_46

    :cond_18
    :try_start_18
    iget-object v0, p0, LX8/i;->k:LX8/i$d;

    invoke-virtual {v0}, LX8/i$d;->C()V

    iget-object v0, p0, LX8/i;->g:Ljava/util/ArrayDeque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_36

    iget-object v0, p0, LX8/i;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "headersQueue.removeFirst()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LP8/u;
    :try_end_32
    .catchall {:try_start_18 .. :try_end_32} :catchall_34

    monitor-exit p0

    return-object v0

    :catchall_34
    move-exception v0

    goto :goto_4c

    :cond_36
    :try_start_36
    iget-object v0, p0, LX8/i;->n:Ljava/io/IOException;

    if-eqz v0, :cond_3b

    goto :goto_45

    :cond_3b
    new-instance v0, LX8/n;

    iget-object v1, p0, LX8/i;->m:LX8/b;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LX8/n;-><init>(LX8/b;)V

    :goto_45
    throw v0

    :goto_46
    iget-object v1, p0, LX8/i;->k:LX8/i$d;

    invoke-virtual {v1}, LX8/i$d;->C()V

    throw v0

    :goto_4c
    monitor-exit p0
    :try_end_4d
    .catchall {:try_start_36 .. :try_end_4d} :catchall_34

    throw v0
.end method

.method public final D()V
    .registers 2

    :try_start_0
    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_8} :catch_9

    return-void

    :catch_9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    new-instance p0, Ljava/io/InterruptedIOException;

    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    throw p0
.end method

.method public final E()Le9/C;
    .registers 1

    iget-object p0, p0, LX8/i;->l:LX8/i$d;

    return-object p0
.end method

.method public final a(J)V
    .registers 5

    iget-wide v0, p0, LX8/i;->f:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LX8/i;->f:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_13

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_13
    return-void
.end method

.method public final b()V
    .registers 4

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_32
    :goto_32
    monitor-enter p0

    :try_start_33
    iget-object v0, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {v0}, LX8/i$c;->b()Z

    move-result v0

    if-nez v0, :cond_58

    iget-object v0, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {v0}, LX8/i$c;->a()Z

    move-result v0

    if-eqz v0, :cond_58

    iget-object v0, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {v0}, LX8/i$b;->b()Z

    move-result v0

    if-nez v0, :cond_56

    iget-object v0, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {v0}, LX8/i$b;->y()Z

    move-result v0

    if-eqz v0, :cond_58

    goto :goto_56

    :catchall_54
    move-exception v0

    goto :goto_73

    :cond_56
    :goto_56
    const/4 v0, 0x1

    goto :goto_59

    :cond_58
    const/4 v0, 0x0

    :goto_59
    invoke-virtual {p0}, LX8/i;->u()Z

    move-result v1

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_5f
    .catchall {:try_start_33 .. :try_end_5f} :catchall_54

    monitor-exit p0

    if-eqz v0, :cond_69

    sget-object v0, LX8/b;->A:LX8/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LX8/i;->d(LX8/b;Ljava/io/IOException;)V

    return-void

    :cond_69
    if-nez v1, :cond_72

    iget-object v0, p0, LX8/i;->b:LX8/f;

    iget p0, p0, LX8/i;->a:I

    invoke-virtual {v0, p0}, LX8/f;->r1(I)LX8/i;

    :cond_72
    return-void

    :goto_73
    monitor-exit p0

    throw v0
.end method

.method public final c()V
    .registers 2

    iget-object v0, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {v0}, LX8/i$b;->y()Z

    move-result v0

    if-nez v0, :cond_2d

    iget-object v0, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {v0}, LX8/i$b;->b()Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, p0, LX8/i;->m:LX8/b;

    if-eqz v0, :cond_24

    iget-object v0, p0, LX8/i;->n:Ljava/io/IOException;

    if-eqz v0, :cond_19

    goto :goto_23

    :cond_19
    new-instance v0, LX8/n;

    iget-object p0, p0, LX8/i;->m:LX8/b;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {v0, p0}, LX8/n;-><init>(LX8/b;)V

    :goto_23
    throw v0

    :cond_24
    return-void

    :cond_25
    new-instance p0, Ljava/io/IOException;

    const-string v0, "stream finished"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2d
    new-instance p0, Ljava/io/IOException;

    const-string v0, "stream closed"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final d(LX8/b;Ljava/io/IOException;)V
    .registers 4

    const-string v0, "rstStatusCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LX8/i;->e(LX8/b;Ljava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_c

    return-void

    :cond_c
    iget-object p2, p0, LX8/i;->b:LX8/f;

    iget p0, p0, LX8/i;->a:I

    invoke-virtual {p2, p0, p1}, LX8/f;->C1(ILX8/b;)V

    return-void
.end method

.method public final f(LX8/b;)V
    .registers 3

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LX8/i;->e(LX8/b;Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    iget-object v0, p0, LX8/i;->b:LX8/f;

    iget p0, p0, LX8/i;->a:I

    invoke-virtual {v0, p0, p1}, LX8/f;->D1(ILX8/b;)V

    return-void
.end method

.method public final g()LX8/f;
    .registers 1

    iget-object p0, p0, LX8/i;->b:LX8/f;

    return-object p0
.end method

.method public final declared-synchronized h()LX8/b;
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LX8/i;->m:LX8/b;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    monitor-exit p0

    return-object v0

    :catchall_5
    move-exception v0

    :try_start_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_5

    throw v0
.end method

.method public final i()Ljava/io/IOException;
    .registers 1

    iget-object p0, p0, LX8/i;->n:Ljava/io/IOException;

    return-object p0
.end method

.method public final j()I
    .registers 1

    iget p0, p0, LX8/i;->a:I

    return p0
.end method

.method public final k()J
    .registers 3

    iget-wide v0, p0, LX8/i;->d:J

    return-wide v0
.end method

.method public final l()J
    .registers 3

    iget-wide v0, p0, LX8/i;->c:J

    return-wide v0
.end method

.method public final m()LX8/i$d;
    .registers 1

    iget-object p0, p0, LX8/i;->k:LX8/i$d;

    return-object p0
.end method

.method public final n()Le9/z;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/i;->h:Z

    if-nez v0, :cond_16

    invoke-virtual {p0}, LX8/i;->t()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_16

    :cond_c
    const-string v0, "reply before requesting the sink"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_14
    move-exception v0

    goto :goto_1c

    :cond_16
    :goto_16
    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_18
    .catchall {:try_start_1 .. :try_end_18} :catchall_14

    monitor-exit p0

    iget-object p0, p0, LX8/i;->j:LX8/i$b;

    return-object p0

    :goto_1c
    monitor-exit p0

    throw v0
.end method

.method public final o()LX8/i$b;
    .registers 1

    iget-object p0, p0, LX8/i;->j:LX8/i$b;

    return-object p0
.end method

.method public final p()LX8/i$c;
    .registers 1

    iget-object p0, p0, LX8/i;->i:LX8/i$c;

    return-object p0
.end method

.method public final q()J
    .registers 3

    iget-wide v0, p0, LX8/i;->f:J

    return-wide v0
.end method

.method public final r()J
    .registers 3

    iget-wide v0, p0, LX8/i;->e:J

    return-wide v0
.end method

.method public final s()LX8/i$d;
    .registers 1

    iget-object p0, p0, LX8/i;->l:LX8/i$d;

    return-object p0
.end method

.method public final t()Z
    .registers 4

    iget v0, p0, LX8/i;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_9

    move v0, v1

    goto :goto_a

    :cond_9
    move v0, v2

    :goto_a
    iget-object p0, p0, LX8/i;->b:LX8/f;

    invoke-virtual {p0}, LX8/f;->I0()Z

    move-result p0

    if-ne p0, v0, :cond_13

    return v1

    :cond_13
    return v2
.end method

.method public final declared-synchronized u()Z
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LX8/i;->m:LX8/b;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_19

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    monitor-exit p0

    return v1

    :cond_8
    :try_start_8
    iget-object v0, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {v0}, LX8/i$c;->b()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {v0}, LX8/i$c;->a()Z

    move-result v0

    if-eqz v0, :cond_31

    goto :goto_1b

    :catchall_19
    move-exception v0

    goto :goto_34

    :cond_1b
    :goto_1b
    iget-object v0, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {v0}, LX8/i$b;->b()Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object v0, p0, LX8/i;->j:LX8/i$b;

    invoke-virtual {v0}, LX8/i$b;->y()Z

    move-result v0

    if-eqz v0, :cond_31

    :cond_2b
    iget-boolean v0, p0, LX8/i;->h:Z
    :try_end_2d
    .catchall {:try_start_8 .. :try_end_2d} :catchall_19

    if-eqz v0, :cond_31

    monitor-exit p0

    return v1

    :cond_31
    monitor-exit p0

    const/4 p0, 0x1

    return p0

    :goto_34
    :try_start_34
    monitor-exit p0
    :try_end_35
    .catchall {:try_start_34 .. :try_end_35} :catchall_19

    throw v0
.end method

.method public final v()Le9/C;
    .registers 1

    iget-object p0, p0, LX8/i;->k:LX8/i$d;

    return-object p0
.end method

.method public final w(Le9/g;I)V
    .registers 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_37

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_37

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_37
    :goto_37
    iget-object p0, p0, LX8/i;->i:LX8/i$c;

    int-to-long v0, p2

    invoke-virtual {p0, p1, v0, v1}, LX8/i$c;->f(Le9/g;J)V

    return-void
.end method

.method public final x(LP8/u;Z)V
    .registers 5

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_37

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_37

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_37
    :goto_37
    monitor-enter p0

    :try_start_38
    iget-boolean v0, p0, LX8/i;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_48

    if-nez p2, :cond_40

    goto :goto_48

    :cond_40
    iget-object v0, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {v0, p1}, LX8/i$c;->j(LP8/u;)V

    goto :goto_4f

    :catchall_46
    move-exception p1

    goto :goto_6f

    :cond_48
    :goto_48
    iput-boolean v1, p0, LX8/i;->h:Z

    iget-object v0, p0, LX8/i;->g:Ljava/util/ArrayDeque;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_4f
    if-eqz p2, :cond_56

    iget-object p1, p0, LX8/i;->i:LX8/i$c;

    invoke-virtual {p1, v1}, LX8/i$c;->g(Z)V

    :cond_56
    invoke-virtual {p0}, LX8/i;->u()Z

    move-result p1

    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Lh8/A;->a:Lh8/A;
    :try_end_64
    .catchall {:try_start_38 .. :try_end_64} :catchall_46

    monitor-exit p0

    if-nez p1, :cond_6e

    iget-object p1, p0, LX8/i;->b:LX8/f;

    iget p0, p0, LX8/i;->a:I

    invoke-virtual {p1, p0}, LX8/f;->r1(I)LX8/i;

    :cond_6e
    return-void

    :goto_6f
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized y(LX8/b;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/i;->m:LX8/b;

    if-nez v0, :cond_17

    iput-object p1, p0, LX8/i;->m:LX8/b;

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_15

    goto :goto_17

    :catchall_15
    move-exception p1

    goto :goto_19

    :cond_17
    :goto_17
    monitor-exit p0

    return-void

    :goto_19
    :try_start_19
    monitor-exit p0
    :try_end_1a
    .catchall {:try_start_19 .. :try_end_1a} :catchall_15

    throw p1
.end method

.method public final z(J)V
    .registers 3

    iput-wide p1, p0, LX8/i;->d:J

    return-void
.end method
