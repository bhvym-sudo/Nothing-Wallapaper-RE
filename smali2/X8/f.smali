.class public final LX8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/f$a;,
        LX8/f$b;,
        LX8/f$c;,
        LX8/f$d;
    }
.end annotation


# static fields
.field public static final S:LX8/f$b;

.field private static final T:LX8/m;


# instance fields
.field private final A:LT8/d;

.field private final B:LX8/l;

.field private C:J

.field private D:J

.field private E:J

.field private F:J

.field private G:J

.field private H:J

.field private final I:LX8/m;

.field private J:LX8/m;

.field private K:J

.field private L:J

.field private M:J

.field private N:J

.field private final O:Ljava/net/Socket;

.field private final P:LX8/j;

.field private final Q:LX8/f$d;

.field private final R:Ljava/util/Set;

.field private final q:Z

.field private final r:LX8/f$c;

.field private final s:Ljava/util/Map;

.field private final t:Ljava/lang/String;

.field private u:I

.field private v:I

.field private w:Z

.field private final x:LT8/e;

.field private final y:LT8/d;

.field private final z:LT8/d;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LX8/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/f$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/f;->S:LX8/f$b;

    new-instance v0, LX8/m;

    invoke-direct {v0}, LX8/m;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, LX8/m;->h(II)LX8/m;

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, LX8/m;->h(II)LX8/m;

    sput-object v0, LX8/f;->T:LX8/m;

    return-void
.end method

.method public constructor <init>(LX8/f$a;)V
    .registers 8

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LX8/f$a;->b()Z

    move-result v0

    iput-boolean v0, p0, LX8/f;->q:Z

    invoke-virtual {p1}, LX8/f$a;->d()LX8/f$c;

    move-result-object v1

    iput-object v1, p0, LX8/f;->r:LX8/f$c;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LX8/f;->s:Ljava/util/Map;

    invoke-virtual {p1}, LX8/f$a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {p1}, LX8/f$a;->b()Z

    move-result v2

    if-eqz v2, :cond_29

    const/4 v2, 0x3

    goto :goto_2a

    :cond_29
    const/4 v2, 0x2

    :goto_2a
    iput v2, p0, LX8/f;->v:I

    invoke-virtual {p1}, LX8/f$a;->j()LT8/e;

    move-result-object v2

    iput-object v2, p0, LX8/f;->x:LT8/e;

    invoke-virtual {v2}, LT8/e;->i()LT8/d;

    move-result-object v3

    iput-object v3, p0, LX8/f;->y:LT8/d;

    invoke-virtual {v2}, LT8/e;->i()LT8/d;

    move-result-object v4

    iput-object v4, p0, LX8/f;->z:LT8/d;

    invoke-virtual {v2}, LT8/e;->i()LT8/d;

    move-result-object v2

    iput-object v2, p0, LX8/f;->A:LT8/d;

    invoke-virtual {p1}, LX8/f$a;->f()LX8/l;

    move-result-object v2

    iput-object v2, p0, LX8/f;->B:LX8/l;

    new-instance v2, LX8/m;

    invoke-direct {v2}, LX8/m;-><init>()V

    invoke-virtual {p1}, LX8/f$a;->b()Z

    move-result v4

    if-eqz v4, :cond_5b

    const/4 v4, 0x7

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, LX8/m;->h(II)LX8/m;

    :cond_5b
    iput-object v2, p0, LX8/f;->I:LX8/m;

    sget-object v2, LX8/f;->T:LX8/m;

    iput-object v2, p0, LX8/f;->J:LX8/m;

    invoke-virtual {v2}, LX8/m;->c()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, LX8/f;->N:J

    invoke-virtual {p1}, LX8/f$a;->h()Ljava/net/Socket;

    move-result-object v2

    iput-object v2, p0, LX8/f;->O:Ljava/net/Socket;

    new-instance v2, LX8/j;

    invoke-virtual {p1}, LX8/f$a;->g()Le9/f;

    move-result-object v4

    invoke-direct {v2, v4, v0}, LX8/j;-><init>(Le9/f;Z)V

    iput-object v2, p0, LX8/f;->P:LX8/j;

    new-instance v2, LX8/f$d;

    new-instance v4, LX8/h;

    invoke-virtual {p1}, LX8/f$a;->i()Le9/g;

    move-result-object v5

    invoke-direct {v4, v5, v0}, LX8/h;-><init>(Le9/g;Z)V

    invoke-direct {v2, p0, v4}, LX8/f$d;-><init>(LX8/f;LX8/h;)V

    iput-object v2, p0, LX8/f;->Q:LX8/f$d;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LX8/f;->R:Ljava/util/Set;

    invoke-virtual {p1}, LX8/f$a;->e()I

    move-result v0

    if-eqz v0, :cond_ba

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, LX8/f$a;->e()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ping"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LX8/f$j;

    invoke-direct {v0, p1, p0, v4, v5}, LX8/f$j;-><init>(Ljava/lang/String;LX8/f;J)V

    invoke-virtual {v3, v0, v4, v5}, LT8/d;->i(LT8/a;J)V

    :cond_ba
    return-void
.end method

.method public static final synthetic B(LX8/f;)LX8/l;
    .registers 1

    iget-object p0, p0, LX8/f;->B:LX8/l;

    return-object p0
.end method

.method private final B0(Ljava/io/IOException;)V
    .registers 3

    sget-object v0, LX8/b;->t:LX8/b;

    invoke-virtual {p0, v0, v0, p1}, LX8/f;->A0(LX8/b;LX8/b;Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic G(LX8/f;)LT8/d;
    .registers 1

    iget-object p0, p0, LX8/f;->A:LT8/d;

    return-object p0
.end method

.method public static final synthetic I(LX8/f;)LT8/e;
    .registers 1

    iget-object p0, p0, LX8/f;->x:LT8/e;

    return-object p0
.end method

.method public static final synthetic K(LX8/f;)LT8/d;
    .registers 1

    iget-object p0, p0, LX8/f;->y:LT8/d;

    return-object p0
.end method

.method public static final synthetic Q(LX8/f;)Z
    .registers 1

    iget-boolean p0, p0, LX8/f;->w:Z

    return p0
.end method

.method public static final synthetic U(LX8/f;J)V
    .registers 3

    iput-wide p1, p0, LX8/f;->G:J

    return-void
.end method

.method public static final synthetic Y(LX8/f;J)V
    .registers 3

    iput-wide p1, p0, LX8/f;->F:J

    return-void
.end method

.method public static final synthetic a(LX8/f;Ljava/io/IOException;)V
    .registers 2

    invoke-direct {p0, p1}, LX8/f;->B0(Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic b(LX8/f;)J
    .registers 3

    iget-wide v0, p0, LX8/f;->G:J

    return-wide v0
.end method

.method public static final synthetic b0(LX8/f;J)V
    .registers 3

    iput-wide p1, p0, LX8/f;->C:J

    return-void
.end method

.method public static final synthetic f(LX8/f;)Ljava/util/Set;
    .registers 1

    iget-object p0, p0, LX8/f;->R:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic g()LX8/m;
    .registers 1

    sget-object v0, LX8/f;->T:LX8/m;

    return-object v0
.end method

.method public static final synthetic j(LX8/f;)J
    .registers 3

    iget-wide v0, p0, LX8/f;->F:J

    return-wide v0
.end method

.method private final k1(ILjava/util/List;Z)LX8/i;
    .registers 14

    const/4 v0, 0x1

    xor-int/lit8 v4, p3, 0x1

    iget-object v7, p0, LX8/f;->P:LX8/j;

    monitor-enter v7

    :try_start_6
    monitor-enter p0
    :try_end_7
    .catchall {:try_start_6 .. :try_end_7} :catchall_61

    :try_start_7
    iget v1, p0, LX8/f;->v:I
    :try_end_9
    .catchall {:try_start_7 .. :try_end_9} :catchall_7e

    const v2, 0x3fffffff    # 1.9999999f

    if-le v1, v2, :cond_19

    :try_start_e
    sget-object v1, LX8/b;->z:LX8/b;

    invoke-virtual {p0, v1}, LX8/f;->v1(LX8/b;)V
    :try_end_13
    .catchall {:try_start_e .. :try_end_13} :catchall_14

    goto :goto_19

    :catchall_14
    move-exception v0

    move-object p1, v0

    move-object v3, p0

    goto/16 :goto_88

    :cond_19
    :goto_19
    :try_start_19
    iget-boolean v1, p0, LX8/f;->w:Z

    if-nez v1, :cond_81

    iget v2, p0, LX8/f;->v:I

    add-int/lit8 v1, v2, 0x2

    iput v1, p0, LX8/f;->v:I

    new-instance v1, LX8/i;
    :try_end_25
    .catchall {:try_start_19 .. :try_end_25} :catchall_7e

    const/4 v6, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    :try_start_28
    invoke-direct/range {v1 .. v6}, LX8/i;-><init>(ILX8/f;ZZLP8/u;)V

    if-eqz p3, :cond_47

    iget-wide v5, v3, LX8/f;->M:J

    iget-wide v8, v3, LX8/f;->N:J

    cmp-long p0, v5, v8

    if-gez p0, :cond_47

    invoke-virtual {v1}, LX8/i;->r()J

    move-result-wide v5

    invoke-virtual {v1}, LX8/i;->q()J

    move-result-wide v8

    cmp-long p0, v5, v8

    if-ltz p0, :cond_42

    goto :goto_47

    :cond_42
    const/4 v0, 0x0

    goto :goto_47

    :catchall_44
    move-exception v0

    :goto_45
    move-object p1, v0

    goto :goto_88

    :cond_47
    :goto_47
    invoke-virtual {v1}, LX8/i;->u()Z

    move-result p0

    if-eqz p0, :cond_56

    iget-object p0, v3, LX8/f;->s:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p0, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_56
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_58
    .catchall {:try_start_28 .. :try_end_58} :catchall_44

    :try_start_58
    monitor-exit v3

    if-nez p1, :cond_64

    iget-object p0, v3, LX8/f;->P:LX8/j;

    invoke-virtual {p0, v4, v2, p2}, LX8/j;->z(ZILjava/util/List;)V

    goto :goto_6d

    :catchall_61
    move-exception v0

    move-object p0, v0

    goto :goto_8a

    :cond_64
    iget-boolean p0, v3, LX8/f;->q:Z

    if-nez p0, :cond_76

    iget-object p0, v3, LX8/f;->P:LX8/j;

    invoke-virtual {p0, p1, v2, p2}, LX8/j;->I(IILjava/util/List;)V
    :try_end_6d
    .catchall {:try_start_58 .. :try_end_6d} :catchall_61

    :goto_6d
    monitor-exit v7

    if-eqz v0, :cond_75

    iget-object p0, v3, LX8/f;->P:LX8/j;

    invoke-virtual {p0}, LX8/j;->flush()V

    :cond_75
    return-object v1

    :cond_76
    :try_start_76
    const-string p0, "client streams shouldn\'t have associated stream IDs"

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7e
    .catchall {:try_start_76 .. :try_end_7e} :catchall_61

    :catchall_7e
    move-exception v0

    move-object v3, p0

    goto :goto_45

    :cond_81
    move-object v3, p0

    :try_start_82
    new-instance p0, LX8/a;

    invoke-direct {p0}, LX8/a;-><init>()V

    throw p0
    :try_end_88
    .catchall {:try_start_82 .. :try_end_88} :catchall_44

    :goto_88
    :try_start_88
    monitor-exit v3

    throw p1
    :try_end_8a
    .catchall {:try_start_88 .. :try_end_8a} :catchall_61

    :goto_8a
    monitor-exit v7

    throw p0
.end method

.method public static final synthetic q0(LX8/f;J)V
    .registers 3

    iput-wide p1, p0, LX8/f;->D:J

    return-void
.end method

.method public static final synthetic t0(LX8/f;Z)V
    .registers 2

    iput-boolean p1, p0, LX8/f;->w:Z

    return-void
.end method

.method public static final synthetic u(LX8/f;)J
    .registers 3

    iget-wide v0, p0, LX8/f;->C:J

    return-wide v0
.end method

.method public static final synthetic w0(LX8/f;J)V
    .registers 3

    iput-wide p1, p0, LX8/f;->N:J

    return-void
.end method

.method public static synthetic x1(LX8/f;ZLT8/e;ILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_5

    const/4 p1, 0x1

    :cond_5
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_b

    sget-object p2, LT8/e;->i:LT8/e;

    :cond_b
    invoke-virtual {p0, p1, p2}, LX8/f;->w1(ZLT8/e;)V

    return-void
.end method

.method public static final synthetic z(LX8/f;)J
    .registers 3

    iget-wide v0, p0, LX8/f;->D:J

    return-wide v0
.end method


# virtual methods
.method public final A0(LX8/b;LX8/b;Ljava/io/IOException;)V
    .registers 7

    const-string v0, "connectionCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_3c

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_3c

    :cond_15
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3c
    :goto_3c
    :try_start_3c
    invoke-virtual {p0, p1}, LX8/f;->v1(LX8/b;)V
    :try_end_3f
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_3f} :catch_3f

    :catch_3f
    monitor-enter p0

    :try_start_40
    iget-object p1, p0, LX8/f;->s:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_5d

    iget-object p1, p0, LX8/f;->s:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [LX8/i;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, LX8/f;->s:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    goto :goto_5e

    :catchall_5b
    move-exception p1

    goto :goto_8a

    :cond_5d
    const/4 p1, 0x0

    :goto_5e
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_60
    .catchall {:try_start_40 .. :try_end_60} :catchall_5b

    monitor-exit p0

    check-cast p1, [LX8/i;

    if-eqz p1, :cond_70

    array-length v1, p1

    :goto_66
    if-ge v0, v1, :cond_70

    aget-object v2, p1, v0

    :try_start_6a
    invoke-virtual {v2, p2, p3}, LX8/i;->d(LX8/b;Ljava/io/IOException;)V
    :try_end_6d
    .catch Ljava/io/IOException; {:try_start_6a .. :try_end_6d} :catch_6d

    :catch_6d
    add-int/lit8 v0, v0, 0x1

    goto :goto_66

    :cond_70
    :try_start_70
    iget-object p1, p0, LX8/f;->P:LX8/j;

    invoke-virtual {p1}, LX8/j;->close()V
    :try_end_75
    .catch Ljava/io/IOException; {:try_start_70 .. :try_end_75} :catch_75

    :catch_75
    :try_start_75
    iget-object p1, p0, LX8/f;->O:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_7a
    .catch Ljava/io/IOException; {:try_start_75 .. :try_end_7a} :catch_7a

    :catch_7a
    iget-object p1, p0, LX8/f;->y:LT8/d;

    invoke-virtual {p1}, LT8/d;->n()V

    iget-object p1, p0, LX8/f;->z:LT8/d;

    invoke-virtual {p1}, LT8/d;->n()V

    iget-object p0, p0, LX8/f;->A:LT8/d;

    invoke-virtual {p0}, LT8/d;->n()V

    return-void

    :goto_8a
    monitor-exit p0

    throw p1
.end method

.method public final A1(IZLjava/util/List;)V
    .registers 5

    const-string v0, "alternating"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LX8/f;->P:LX8/j;

    invoke-virtual {p0, p2, p1, p3}, LX8/j;->z(ZILjava/util/List;)V

    return-void
.end method

.method public final B1(ZII)V
    .registers 5

    :try_start_0
    iget-object v0, p0, LX8/f;->P:LX8/j;

    invoke-virtual {v0, p1, p2, p3}, LX8/j;->G(ZII)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception p1

    invoke-direct {p0, p1}, LX8/f;->B0(Ljava/io/IOException;)V

    return-void
.end method

.method public final C1(ILX8/b;)V
    .registers 4

    const-string v0, "statusCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LX8/f;->P:LX8/j;

    invoke-virtual {p0, p1, p2}, LX8/j;->K(ILX8/b;)V

    return-void
.end method

.method public final D1(ILX8/b;)V
    .registers 12

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f;->y:LT8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] writeSynReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, LX8/f$k;

    const/4 v5, 0x1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LX8/f$k;-><init>(Ljava/lang/String;ZLX8/f;ILX8/b;)V

    const-wide/16 p0, 0x0

    invoke-virtual {v0, v3, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public final E1(IJ)V
    .registers 14

    iget-object v0, p0, LX8/f;->y:LT8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] windowUpdate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, LX8/f$l;

    const/4 v5, 0x1

    move-object v6, p0

    move v7, p1

    move-wide v8, p2

    invoke-direct/range {v3 .. v9}, LX8/f$l;-><init>(Ljava/lang/String;ZLX8/f;IJ)V

    const-wide/16 p0, 0x0

    invoke-virtual {v0, v3, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public final I0()Z
    .registers 1

    iget-boolean p0, p0, LX8/f;->q:Z

    return p0
.end method

.method public final O0()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LX8/f;->t:Ljava/lang/String;

    return-object p0
.end method

.method public final P0()I
    .registers 1

    iget p0, p0, LX8/f;->u:I

    return p0
.end method

.method public final T0()LX8/f$c;
    .registers 1

    iget-object p0, p0, LX8/f;->r:LX8/f$c;

    return-object p0
.end method

.method public final U0()I
    .registers 1

    iget p0, p0, LX8/f;->v:I

    return p0
.end method

.method public final W0()LX8/m;
    .registers 1

    iget-object p0, p0, LX8/f;->I:LX8/m;

    return-object p0
.end method

.method public final X0()LX8/m;
    .registers 1

    iget-object p0, p0, LX8/f;->J:LX8/m;

    return-object p0
.end method

.method public final declared-synchronized c1(I)LX8/i;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LX8/f;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX8/i;
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_f

    monitor-exit p0

    return-object p1

    :catchall_f
    move-exception p1

    :try_start_10
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_10 .. :try_end_11} :catchall_f

    throw p1
.end method

.method public close()V
    .registers 4

    sget-object v0, LX8/b;->s:LX8/b;

    sget-object v1, LX8/b;->A:LX8/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, LX8/f;->A0(LX8/b;LX8/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final flush()V
    .registers 1

    iget-object p0, p0, LX8/f;->P:LX8/j;

    invoke-virtual {p0}, LX8/j;->flush()V

    return-void
.end method

.method public final g1()Ljava/util/Map;
    .registers 1

    iget-object p0, p0, LX8/f;->s:Ljava/util/Map;

    return-object p0
.end method

.method public final h1()J
    .registers 3

    iget-wide v0, p0, LX8/f;->N:J

    return-wide v0
.end method

.method public final i1()LX8/j;
    .registers 1

    iget-object p0, p0, LX8/f;->P:LX8/j;

    return-object p0
.end method

.method public final declared-synchronized j1(J)Z
    .registers 9

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/f;->w:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_18

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    monitor-exit p0

    return v1

    :cond_8
    :try_start_8
    iget-wide v2, p0, LX8/f;->F:J

    iget-wide v4, p0, LX8/f;->E:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1a

    iget-wide v2, p0, LX8/f;->H:J
    :try_end_12
    .catchall {:try_start_8 .. :try_end_12} :catchall_18

    cmp-long p1, p1, v2

    if-ltz p1, :cond_1a

    monitor-exit p0

    return v1

    :catchall_18
    move-exception p1

    goto :goto_1d

    :cond_1a
    monitor-exit p0

    const/4 p0, 0x1

    return p0

    :goto_1d
    :try_start_1d
    monitor-exit p0
    :try_end_1e
    .catchall {:try_start_1d .. :try_end_1e} :catchall_18

    throw p1
.end method

.method public final l1(Ljava/util/List;Z)LX8/i;
    .registers 4

    const-string v0, "requestHeaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, LX8/f;->k1(ILjava/util/List;Z)LX8/i;

    move-result-object p0

    return-object p0
.end method

.method public final m1(ILe9/g;IZ)V
    .registers 14

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Le9/e;

    invoke-direct {v6}, Le9/e;-><init>()V

    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Le9/g;->Y0(J)V

    invoke-interface {p2, v6, v0, v1}, Le9/B;->e1(Le9/e;J)J

    iget-object p2, p0, LX8/f;->z:LT8/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] onData"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v1, LX8/f$e;

    const/4 v3, 0x1

    move-object v4, p0

    move v5, p1

    move v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, LX8/f$e;-><init>(Ljava/lang/String;ZLX8/f;ILe9/e;IZ)V

    const-wide/16 p0, 0x0

    invoke-virtual {p2, v1, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public final n1(ILjava/util/List;Z)V
    .registers 14

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f;->z:LT8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, LX8/f$f;

    const/4 v5, 0x1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    move v9, p3

    invoke-direct/range {v3 .. v9}, LX8/f$f;-><init>(Ljava/lang/String;ZLX8/f;ILjava/util/List;Z)V

    const-wide/16 p0, 0x0

    invoke-virtual {v0, v3, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public final o1(ILjava/util/List;)V
    .registers 12

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-object v0, p0, LX8/f;->R:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_10
    .catchall {:try_start_6 .. :try_end_10} :catchall_53

    if-eqz v0, :cond_1d

    :try_start_12
    sget-object p2, LX8/b;->t:LX8/b;

    invoke-virtual {p0, p1, p2}, LX8/f;->D1(ILX8/b;)V
    :try_end_17
    .catchall {:try_start_12 .. :try_end_17} :catchall_19

    monitor-exit p0

    return-void

    :catchall_19
    move-exception v0

    move-object p1, v0

    move-object v6, p0

    goto :goto_56

    :cond_1d
    :try_start_1d
    iget-object v0, p0, LX8/f;->R:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_26
    .catchall {:try_start_1d .. :try_end_26} :catchall_53

    monitor-exit p0

    iget-object v0, p0, LX8/f;->z:LT8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onRequest"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, LX8/f$g;

    const/4 v5, 0x1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LX8/f$g;-><init>(Ljava/lang/String;ZLX8/f;ILjava/util/List;)V

    const-wide/16 p0, 0x0

    invoke-virtual {v0, v3, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void

    :catchall_53
    move-exception v0

    move-object v6, p0

    move-object p1, v0

    :goto_56
    monitor-exit v6

    throw p1
.end method

.method public final p1(ILX8/b;)V
    .registers 12

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f;->z:LT8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, LX8/f$h;

    const/4 v5, 0x1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LX8/f$h;-><init>(Ljava/lang/String;ZLX8/f;ILX8/b;)V

    const-wide/16 p0, 0x0

    invoke-virtual {v0, v3, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public final q1(I)Z
    .registers 2

    if-eqz p1, :cond_7

    const/4 p0, 0x1

    and-int/2addr p1, p0

    if-nez p1, :cond_7

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final declared-synchronized r1(I)LX8/i;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LX8/f;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX8/i;

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_17

    monitor-exit p0

    return-object p1

    :catchall_17
    move-exception p1

    :try_start_18
    monitor-exit p0
    :try_end_19
    .catchall {:try_start_18 .. :try_end_19} :catchall_17

    throw p1
.end method

.method public final s1()V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-wide v0, p0, LX8/f;->F:J

    iget-wide v2, p0, LX8/f;->E:J
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_3f

    cmp-long v0, v0, v2

    if-gez v0, :cond_b

    monitor-exit p0

    return-void

    :cond_b
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    :try_start_e
    iput-wide v2, p0, LX8/f;->E:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const v2, 0x3b9aca00

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LX8/f;->H:J

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_1d
    .catchall {:try_start_e .. :try_end_1d} :catchall_3f

    monitor-exit p0

    iget-object v0, p0, LX8/f;->y:LT8/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ping"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LX8/f$i;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3, p0}, LX8/f$i;-><init>(Ljava/lang/String;ZLX8/f;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v2, v3, v4}, LT8/d;->i(LT8/a;J)V

    return-void

    :catchall_3f
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final t1(I)V
    .registers 2

    iput p1, p0, LX8/f;->u:I

    return-void
.end method

.method public final u1(LX8/m;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f;->J:LX8/m;

    return-void
.end method

.method public final v1(LX8/b;)V
    .registers 5

    const-string v0, "statusCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f;->P:LX8/j;

    monitor-enter v0

    :try_start_8
    new-instance v1, Lkotlin/jvm/internal/C;

    invoke-direct {v1}, Lkotlin/jvm/internal/C;-><init>()V

    monitor-enter p0
    :try_end_e
    .catchall {:try_start_8 .. :try_end_e} :catchall_15

    :try_start_e
    iget-boolean v2, p0, LX8/f;->w:Z
    :try_end_10
    .catchall {:try_start_e .. :try_end_10} :catchall_2a

    if-eqz v2, :cond_17

    :try_start_12
    monitor-exit p0
    :try_end_13
    .catchall {:try_start_12 .. :try_end_13} :catchall_15

    monitor-exit v0

    return-void

    :catchall_15
    move-exception p0

    goto :goto_2d

    :cond_17
    const/4 v2, 0x1

    :try_start_18
    iput-boolean v2, p0, LX8/f;->w:Z

    iget v2, p0, LX8/f;->u:I

    iput v2, v1, Lkotlin/jvm/internal/C;->q:I

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_20
    .catchall {:try_start_18 .. :try_end_20} :catchall_2a

    :try_start_20
    monitor-exit p0

    iget-object p0, p0, LX8/f;->P:LX8/j;

    sget-object v1, LQ8/d;->a:[B

    invoke-virtual {p0, v2, p1, v1}, LX8/j;->u(ILX8/b;[B)V
    :try_end_28
    .catchall {:try_start_20 .. :try_end_28} :catchall_15

    monitor-exit v0

    return-void

    :catchall_2a
    move-exception p1

    :try_start_2b
    monitor-exit p0

    throw p1
    :try_end_2d
    .catchall {:try_start_2b .. :try_end_2d} :catchall_15

    :goto_2d
    monitor-exit v0

    throw p0
.end method

.method public final w1(ZLT8/e;)V
    .registers 7

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_26

    iget-object p1, p0, LX8/f;->P:LX8/j;

    invoke-virtual {p1}, LX8/j;->b()V

    iget-object p1, p0, LX8/f;->P:LX8/j;

    iget-object v0, p0, LX8/f;->I:LX8/m;

    invoke-virtual {p1, v0}, LX8/j;->Q(LX8/m;)V

    iget-object p1, p0, LX8/f;->I:LX8/m;

    invoke-virtual {p1}, LX8/m;->c()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_26

    iget-object v1, p0, LX8/f;->P:LX8/j;

    sub-int/2addr p1, v0

    int-to-long v2, p1

    const/4 p1, 0x0

    invoke-virtual {v1, p1, v2, v3}, LX8/j;->U(IJ)V

    :cond_26
    invoke-virtual {p2}, LT8/e;->i()LT8/d;

    move-result-object p1

    iget-object p2, p0, LX8/f;->t:Ljava/lang/String;

    iget-object p0, p0, LX8/f;->Q:LX8/f$d;

    new-instance v0, LT8/c;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p0}, LT8/c;-><init>(Ljava/lang/String;ZLv8/a;)V

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public final declared-synchronized y1(J)V
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-wide v0, p0, LX8/f;->K:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LX8/f;->K:J

    iget-wide p1, p0, LX8/f;->L:J

    sub-long/2addr v0, p1

    iget-object p1, p0, LX8/f;->I:LX8/m;

    invoke-virtual {p1}, LX8/m;->c()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_22

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, LX8/f;->E1(IJ)V

    iget-wide p1, p0, LX8/f;->L:J

    add-long/2addr p1, v0

    iput-wide p1, p0, LX8/f;->L:J
    :try_end_1f
    .catchall {:try_start_1 .. :try_end_1f} :catchall_20

    goto :goto_22

    :catchall_20
    move-exception p1

    goto :goto_24

    :cond_22
    :goto_22
    monitor-exit p0

    return-void

    :goto_24
    :try_start_24
    monitor-exit p0
    :try_end_25
    .catchall {:try_start_24 .. :try_end_25} :catchall_20

    throw p1
.end method

.method public final z1(IZLe9/e;J)V
    .registers 14

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_d

    iget-object p0, p0, LX8/f;->P:LX8/j;

    invoke-virtual {p0, p2, p1, p3, v3}, LX8/j;->f(ZILe9/e;I)V

    return-void

    :cond_d
    :goto_d
    cmp-long v2, p4, v0

    if-lez v2, :cond_71

    monitor-enter p0

    :goto_12
    :try_start_12
    iget-wide v4, p0, LX8/f;->M:J

    iget-wide v6, p0, LX8/f;->N:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_39

    iget-object v2, p0, LX8/f;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_31

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_12

    :catchall_2f
    move-exception p1

    goto :goto_6f

    :cond_31
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_39
    .catch Ljava/lang/InterruptedException; {:try_start_12 .. :try_end_39} :catch_62
    .catchall {:try_start_12 .. :try_end_39} :catchall_2f

    :cond_39
    sub-long/2addr v6, v4

    :try_start_3a
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, LX8/f;->P:LX8/j;

    invoke-virtual {v4}, LX8/j;->B()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, LX8/f;->M:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, LX8/f;->M:J

    sget-object v4, Lh8/A;->a:Lh8/A;
    :try_end_51
    .catchall {:try_start_3a .. :try_end_51} :catchall_2f

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, LX8/f;->P:LX8/j;

    if-eqz p2, :cond_5d

    cmp-long v5, p4, v0

    if-nez v5, :cond_5d

    const/4 v5, 0x1

    goto :goto_5e

    :cond_5d
    move v5, v3

    :goto_5e
    invoke-virtual {v4, v5, p1, p3, v2}, LX8/j;->f(ZILe9/e;I)V

    goto :goto_d

    :catch_62
    :try_start_62
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_6f
    .catchall {:try_start_62 .. :try_end_6f} :catchall_2f

    :goto_6f
    monitor-exit p0

    throw p1

    :cond_71
    return-void
.end method
