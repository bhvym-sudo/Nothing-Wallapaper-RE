.class public final LX8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/j$a;
    }
.end annotation


# static fields
.field public static final w:LX8/j$a;

.field private static final x:Ljava/util/logging/Logger;


# instance fields
.field private final q:Le9/f;

.field private final r:Z

.field private final s:Le9/e;

.field private t:I

.field private u:Z

.field private final v:LX8/d$b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX8/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/j;->w:LX8/j$a;

    const-class v0, LX8/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LX8/j;->x:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Le9/f;Z)V
    .registers 10

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX8/j;->q:Le9/f;

    iput-boolean p2, p0, LX8/j;->r:Z

    new-instance v4, Le9/e;

    invoke-direct {v4}, Le9/e;-><init>()V

    iput-object v4, p0, LX8/j;->s:Le9/e;

    const/16 p1, 0x4000

    iput p1, p0, LX8/j;->t:I

    new-instance v1, LX8/d$b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, LX8/d$b;-><init>(IZLe9/e;ILkotlin/jvm/internal/h;)V

    iput-object v1, p0, LX8/j;->v:LX8/d$b;

    return-void
.end method

.method private final Y(IJ)V
    .registers 9

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_23

    iget v2, p0, LX8/j;->t:I

    int-to-long v2, v2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long/2addr p2, v2

    long-to-int v4, v2

    cmp-long v0, p2, v0

    if-nez v0, :cond_15

    const/4 v0, 0x4

    goto :goto_16

    :cond_15
    const/4 v0, 0x0

    :goto_16
    const/16 v1, 0x9

    invoke-virtual {p0, p1, v4, v1, v0}, LX8/j;->j(IIII)V

    iget-object v0, p0, LX8/j;->q:Le9/f;

    iget-object v1, p0, LX8/j;->s:Le9/e;

    invoke-interface {v0, v1, v2, v3}, Le9/z;->Z(Le9/e;J)V

    goto :goto_0

    :cond_23
    return-void
.end method


# virtual methods
.method public final B()I
    .registers 1

    iget p0, p0, LX8/j;->t:I

    return p0
.end method

.method public final declared-synchronized G(ZII)V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_1f

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x6

    invoke-virtual {p0, v0, v1, v2, p1}, LX8/j;->j(IIII)V

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1, p2}, Le9/f;->x(I)Le9/f;

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1, p3}, Le9/f;->x(I)Le9/f;

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1}, Le9/f;->flush()V
    :try_end_1b
    .catchall {:try_start_1 .. :try_end_1b} :catchall_1d

    monitor-exit p0

    return-void

    :catchall_1d
    move-exception p1

    goto :goto_27

    :cond_1f
    :try_start_1f
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_27
    monitor-exit p0
    :try_end_28
    .catchall {:try_start_1f .. :try_end_28} :catchall_1d

    throw p1
.end method

.method public final declared-synchronized I(IILjava/util/List;)V
    .registers 11

    monitor-enter p0

    :try_start_1
    const-string v0, "requestHeaders"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_49

    iget-object v0, p0, LX8/j;->v:LX8/d$b;

    invoke-virtual {v0, p3}, LX8/d$b;->g(Ljava/util/List;)V

    iget-object p3, p0, LX8/j;->s:Le9/e;

    invoke-virtual {p3}, Le9/e;->X0()J

    move-result-wide v0

    iget p3, p0, LX8/j;->t:I

    int-to-long v2, p3

    const-wide/16 v4, 0x4

    sub-long/2addr v2, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    add-int/lit8 v2, p3, 0x4

    int-to-long v3, p3

    cmp-long p3, v0, v3

    if-nez p3, :cond_29

    const/4 v5, 0x4

    goto :goto_2a

    :cond_29
    const/4 v5, 0x0

    :goto_2a
    const/4 v6, 0x5

    invoke-virtual {p0, p1, v2, v6, v5}, LX8/j;->j(IIII)V

    iget-object v2, p0, LX8/j;->q:Le9/f;

    const v5, 0x7fffffff

    and-int/2addr p2, v5

    invoke-interface {v2, p2}, Le9/f;->x(I)Le9/f;

    iget-object p2, p0, LX8/j;->q:Le9/f;

    iget-object v2, p0, LX8/j;->s:Le9/e;

    invoke-interface {p2, v2, v3, v4}, Le9/z;->Z(Le9/e;J)V

    if-lez p3, :cond_47

    sub-long/2addr v0, v3

    invoke-direct {p0, p1, v0, v1}, LX8/j;->Y(IJ)V
    :try_end_44
    .catchall {:try_start_1 .. :try_end_44} :catchall_45

    goto :goto_47

    :catchall_45
    move-exception p1

    goto :goto_51

    :cond_47
    :goto_47
    monitor-exit p0

    return-void

    :cond_49
    :try_start_49
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_51
    monitor-exit p0
    :try_end_52
    .catchall {:try_start_49 .. :try_end_52} :catchall_45

    throw p1
.end method

.method public final declared-synchronized K(ILX8/b;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_31

    invoke-virtual {p2}, LX8/b;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_29

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, p1, v2, v0, v1}, LX8/j;->j(IIII)V

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-virtual {p2}, LX8/b;->e()I

    move-result p2

    invoke-interface {p1, p2}, Le9/f;->x(I)Le9/f;

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1}, Le9/f;->flush()V
    :try_end_25
    .catchall {:try_start_1 .. :try_end_25} :catchall_27

    monitor-exit p0

    return-void

    :catchall_27
    move-exception p1

    goto :goto_39

    :cond_29
    :try_start_29
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_31
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_39
    monitor-exit p0
    :try_end_3a
    .catchall {:try_start_29 .. :try_end_3a} :catchall_27

    throw p1
.end method

.method public final declared-synchronized Q(LX8/m;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_44

    invoke-virtual {p1}, LX8/m;->i()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, LX8/j;->j(IIII)V

    :goto_15
    const/16 v0, 0xa

    if-ge v2, v0, :cond_3d

    invoke-virtual {p1, v2}, LX8/m;->f(I)Z

    move-result v0

    if-eqz v0, :cond_3a

    if-eq v2, v1, :cond_28

    const/4 v0, 0x7

    if-eq v2, v0, :cond_26

    move v0, v2

    goto :goto_29

    :cond_26
    move v0, v1

    goto :goto_29

    :cond_28
    const/4 v0, 0x3

    :goto_29
    iget-object v3, p0, LX8/j;->q:Le9/f;

    invoke-interface {v3, v0}, Le9/f;->s(I)Le9/f;

    iget-object v0, p0, LX8/j;->q:Le9/f;

    invoke-virtual {p1, v2}, LX8/m;->a(I)I

    move-result v3

    invoke-interface {v0, v3}, Le9/f;->x(I)Le9/f;

    goto :goto_3a

    :catchall_38
    move-exception p1

    goto :goto_4c

    :cond_3a
    :goto_3a
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_3d
    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1}, Le9/f;->flush()V
    :try_end_42
    .catchall {:try_start_1 .. :try_end_42} :catchall_38

    monitor-exit p0

    return-void

    :cond_44
    :try_start_44
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_4c
    monitor-exit p0
    :try_end_4d
    .catchall {:try_start_44 .. :try_end_4d} :catchall_38

    throw p1
.end method

.method public final declared-synchronized U(IJ)V
    .registers 7

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_43

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_28

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p2, v0

    if-gtz v0, :cond_28

    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, p1, v2, v0, v1}, LX8/j;->j(IIII)V

    iget-object p1, p0, LX8/j;->q:Le9/f;

    long-to-int p2, p2

    invoke-interface {p1, p2}, Le9/f;->x(I)Le9/f;

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1}, Le9/f;->flush()V
    :try_end_24
    .catchall {:try_start_1 .. :try_end_24} :catchall_26

    monitor-exit p0

    return-void

    :catchall_26
    move-exception p1

    goto :goto_4b

    :cond_28
    :try_start_28
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_43
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_4b
    monitor-exit p0
    :try_end_4c
    .catchall {:try_start_28 .. :try_end_4c} :catchall_26

    throw p1
.end method

.method public final declared-synchronized a(LX8/m;)V
    .registers 4

    monitor-enter p0

    :try_start_1
    const-string v0, "peerSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_32

    iget v0, p0, LX8/j;->t:I

    invoke-virtual {p1, v0}, LX8/m;->e(I)I

    move-result v0

    iput v0, p0, LX8/j;->t:I

    invoke-virtual {p1}, LX8/m;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_25

    iget-object v0, p0, LX8/j;->v:LX8/d$b;

    invoke-virtual {p1}, LX8/m;->b()I

    move-result p1

    invoke-virtual {v0, p1}, LX8/d$b;->e(I)V

    goto :goto_25

    :catchall_23
    move-exception p1

    goto :goto_3a

    :cond_25
    :goto_25
    const/4 p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v1, p1, v0}, LX8/j;->j(IIII)V

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1}, Le9/f;->flush()V
    :try_end_30
    .catchall {:try_start_1 .. :try_end_30} :catchall_23

    monitor-exit p0

    return-void

    :cond_32
    :try_start_32
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3a
    monitor-exit p0
    :try_end_3b
    .catchall {:try_start_32 .. :try_end_3b} :catchall_23

    throw p1
.end method

.method public final declared-synchronized b()V
    .registers 4

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_47

    iget-boolean v0, p0, LX8/j;->r:Z
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_37

    if-nez v0, :cond_b

    monitor-exit p0

    return-void

    :cond_b
    :try_start_b
    sget-object v0, LX8/j;->x:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_39

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ">> CONNECTION "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, LX8/e;->b:Le9/h;

    invoke-virtual {v2}, Le9/h;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_39

    :catchall_37
    move-exception v0

    goto :goto_4f

    :cond_39
    :goto_39
    iget-object v0, p0, LX8/j;->q:Le9/f;

    sget-object v1, LX8/e;->b:Le9/h;

    invoke-interface {v0, v1}, Le9/f;->s0(Le9/h;)Le9/f;

    iget-object v0, p0, LX8/j;->q:Le9/f;

    invoke-interface {v0}, Le9/f;->flush()V
    :try_end_45
    .catchall {:try_start_b .. :try_end_45} :catchall_37

    monitor-exit p0

    return-void

    :cond_47
    :try_start_47
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_4f
    monitor-exit p0
    :try_end_50
    .catchall {:try_start_47 .. :try_end_50} :catchall_37

    throw v0
.end method

.method public declared-synchronized close()V
    .registers 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, LX8/j;->u:Z

    iget-object v0, p0, LX8/j;->q:Le9/f;

    invoke-interface {v0}, Le9/z;->close()V
    :try_end_9
    .catchall {:try_start_2 .. :try_end_9} :catchall_b

    monitor-exit p0

    return-void

    :catchall_b
    move-exception v0

    :try_start_c
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_c .. :try_end_d} :catchall_b

    throw v0
.end method

.method public final declared-synchronized f(ZILe9/e;I)V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_c

    invoke-virtual {p0, p2, p1, p3, p4}, LX8/j;->g(IILe9/e;I)V
    :try_end_8
    .catchall {:try_start_1 .. :try_end_8} :catchall_a

    monitor-exit p0

    return-void

    :catchall_a
    move-exception p1

    goto :goto_14

    :cond_c
    :try_start_c
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_14
    monitor-exit p0
    :try_end_15
    .catchall {:try_start_c .. :try_end_15} :catchall_a

    throw p1
.end method

.method public final declared-synchronized flush()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_e

    iget-object v0, p0, LX8/j;->q:Le9/f;

    invoke-interface {v0}, Le9/f;->flush()V
    :try_end_a
    .catchall {:try_start_1 .. :try_end_a} :catchall_c

    monitor-exit p0

    return-void

    :catchall_c
    move-exception v0

    goto :goto_16

    :cond_e
    :try_start_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_16
    monitor-exit p0
    :try_end_17
    .catchall {:try_start_e .. :try_end_17} :catchall_c

    throw v0
.end method

.method public final g(IILe9/e;I)V
    .registers 6

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p4, v0, p2}, LX8/j;->j(IIII)V

    if-lez p4, :cond_f

    iget-object p0, p0, LX8/j;->q:Le9/f;

    invoke-static {p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    int-to-long p1, p4

    invoke-interface {p0, p3, p1, p2}, Le9/z;->Z(Le9/e;J)V

    :cond_f
    return-void
.end method

.method public final j(IIII)V
    .registers 13

    sget-object v0, LX8/j;->x:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_19

    sget-object v2, LX8/e;->a:LX8/e;

    const/4 v3, 0x0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v2 .. v7}, LX8/e;->c(ZIIII)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_1d

    :cond_19
    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    :goto_1d
    iget p1, p0, LX8/j;->t:I

    if-gt v5, p1, :cond_5e

    const/high16 p1, -0x80000000

    and-int/2addr p1, v4

    if-nez p1, :cond_43

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-static {p1, v5}, LQ8/d;->Z(Le9/f;I)V

    iget-object p1, p0, LX8/j;->q:Le9/f;

    and-int/lit16 p2, v6, 0xff

    invoke-interface {p1, p2}, Le9/f;->F(I)Le9/f;

    iget-object p1, p0, LX8/j;->q:Le9/f;

    and-int/lit16 p2, v7, 0xff

    invoke-interface {p1, p2}, Le9/f;->F(I)Le9/f;

    iget-object p0, p0, LX8/j;->q:Le9/f;

    const p1, 0x7fffffff

    and-int/2addr p1, v4

    invoke-interface {p0, p1}, Le9/f;->x(I)Le9/f;

    return-void

    :cond_43
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "reserved bit set: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "FRAME_SIZE_ERROR length > "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LX8/j;->t:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized u(ILX8/b;[B)V
    .registers 7

    monitor-enter p0

    :try_start_1
    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_49

    invoke-virtual {p2}, LX8/b;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_41

    array-length v0, p3

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, LX8/j;->j(IIII)V

    iget-object v0, p0, LX8/j;->q:Le9/f;

    invoke-interface {v0, p1}, Le9/f;->x(I)Le9/f;

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-virtual {p2}, LX8/b;->e()I

    move-result p2

    invoke-interface {p1, p2}, Le9/f;->x(I)Le9/f;

    array-length p1, p3

    if-nez p1, :cond_30

    const/4 v2, 0x1

    :cond_30
    if-nez v2, :cond_3a

    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1, p3}, Le9/f;->G0([B)Le9/f;

    goto :goto_3a

    :catchall_38
    move-exception p1

    goto :goto_51

    :cond_3a
    :goto_3a
    iget-object p1, p0, LX8/j;->q:Le9/f;

    invoke-interface {p1}, Le9/f;->flush()V
    :try_end_3f
    .catchall {:try_start_1 .. :try_end_3f} :catchall_38

    monitor-exit p0

    return-void

    :cond_41
    :try_start_41
    const-string p1, "errorCode.httpCode == -1"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_49
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_51
    monitor-exit p0
    :try_end_52
    .catchall {:try_start_41 .. :try_end_52} :catchall_38

    throw p1
.end method

.method public final declared-synchronized z(ZILjava/util/List;)V
    .registers 10

    monitor-enter p0

    :try_start_1
    const-string v0, "headerBlock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/j;->u:Z

    if-nez v0, :cond_3e

    iget-object v0, p0, LX8/j;->v:LX8/d$b;

    invoke-virtual {v0, p3}, LX8/d$b;->g(Ljava/util/List;)V

    iget-object p3, p0, LX8/j;->s:Le9/e;

    invoke-virtual {p3}, Le9/e;->X0()J

    move-result-wide v0

    iget p3, p0, LX8/j;->t:I

    int-to-long v2, p3

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    cmp-long p3, v0, v2

    if-nez p3, :cond_22

    const/4 v4, 0x4

    goto :goto_23

    :cond_22
    const/4 v4, 0x0

    :goto_23
    if-eqz p1, :cond_27

    or-int/lit8 v4, v4, 0x1

    :cond_27
    long-to-int p1, v2

    const/4 v5, 0x1

    invoke-virtual {p0, p2, p1, v5, v4}, LX8/j;->j(IIII)V

    iget-object p1, p0, LX8/j;->q:Le9/f;

    iget-object v4, p0, LX8/j;->s:Le9/e;

    invoke-interface {p1, v4, v2, v3}, Le9/z;->Z(Le9/e;J)V

    if-lez p3, :cond_3c

    sub-long/2addr v0, v2

    invoke-direct {p0, p2, v0, v1}, LX8/j;->Y(IJ)V
    :try_end_39
    .catchall {:try_start_1 .. :try_end_39} :catchall_3a

    goto :goto_3c

    :catchall_3a
    move-exception p1

    goto :goto_46

    :cond_3c
    :goto_3c
    monitor-exit p0

    return-void

    :cond_3e
    :try_start_3e
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_46
    monitor-exit p0
    :try_end_47
    .catchall {:try_start_3e .. :try_end_47} :catchall_3a

    throw p1
.end method
