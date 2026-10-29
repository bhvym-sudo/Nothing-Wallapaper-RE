.class public final LX8/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX8/h$c;
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final q:LX8/h;

.field final synthetic r:LX8/f;


# direct methods
.method public constructor <init>(LX8/f;LX8/h;)V
    .registers 4

    const-string v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX8/f$d;->r:LX8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LX8/f$d;->q:LX8/h;

    return-void
.end method


# virtual methods
.method public a()V
    .registers 1

    return-void
.end method

.method public b(ZIILjava/util/List;)V
    .registers 11

    const-string p3, "headerBlock"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p3, p2}, LX8/f;->q1(I)Z

    move-result p3

    if-eqz p3, :cond_13

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p0, p2, p4, p1}, LX8/f;->n1(ILjava/util/List;Z)V

    return-void

    :cond_13
    iget-object v2, p0, LX8/f$d;->r:LX8/f;

    monitor-enter v2

    :try_start_16
    invoke-virtual {v2, p2}, LX8/f;->c1(I)LX8/i;

    move-result-object p0

    if-nez p0, :cond_87

    invoke-static {v2}, LX8/f;->Q(LX8/f;)Z

    move-result p0
    :try_end_20
    .catchall {:try_start_16 .. :try_end_20} :catchall_84

    if-eqz p0, :cond_24

    monitor-exit v2

    return-void

    :cond_24
    :try_start_24
    invoke-virtual {v2}, LX8/f;->P0()I

    move-result p0
    :try_end_28
    .catchall {:try_start_24 .. :try_end_28} :catchall_84

    if-gt p2, p0, :cond_2c

    monitor-exit v2

    return-void

    :cond_2c
    :try_start_2c
    rem-int/lit8 p0, p2, 0x2

    invoke-virtual {v2}, LX8/f;->U0()I

    move-result p3

    rem-int/lit8 p3, p3, 0x2
    :try_end_34
    .catchall {:try_start_2c .. :try_end_34} :catchall_84

    if-ne p0, p3, :cond_38

    monitor-exit v2

    return-void

    :cond_38
    :try_start_38
    invoke-static {p4}, LQ8/d;->P(Ljava/util/List;)LP8/u;

    move-result-object v5

    new-instance v0, LX8/i;

    const/4 v3, 0x0

    move v4, p1

    move v1, p2

    invoke-direct/range {v0 .. v5}, LX8/i;-><init>(ILX8/f;ZZLP8/u;)V

    invoke-virtual {v2, v1}, LX8/f;->t1(I)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v2}, LX8/f;->g1()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, LX8/f;->I(LX8/f;)LT8/e;

    move-result-object p0

    invoke-virtual {p0}, LT8/e;->i()LT8/d;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, LX8/f;->O0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x5b

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] onStream"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, LX8/f$d$b;

    const/4 p3, 0x1

    invoke-direct {p2, p1, p3, v2, v0}, LX8/f$d$b;-><init>(Ljava/lang/String;ZLX8/f;LX8/i;)V

    const-wide/16 p3, 0x0

    invoke-virtual {p0, p2, p3, p4}, LT8/d;->i(LT8/a;J)V
    :try_end_82
    .catchall {:try_start_38 .. :try_end_82} :catchall_84

    monitor-exit v2

    return-void

    :catchall_84
    move-exception v0

    move-object p0, v0

    goto :goto_93

    :cond_87
    move v4, p1

    :try_start_88
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_8a
    .catchall {:try_start_88 .. :try_end_8a} :catchall_84

    monitor-exit v2

    invoke-static {p4}, LQ8/d;->P(Ljava/util/List;)LP8/u;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, LX8/i;->x(LP8/u;Z)V

    return-void

    :goto_93
    monitor-exit v2

    throw p0
.end method

.method public d(ILX8/b;)V
    .registers 4

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v0, p1}, LX8/f;->q1(I)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p0, p1, p2}, LX8/f;->p1(ILX8/b;)V

    return-void

    :cond_13
    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p0, p1}, LX8/f;->r1(I)LX8/i;

    move-result-object p0

    if-eqz p0, :cond_1e

    invoke-virtual {p0, p2}, LX8/i;->y(LX8/b;)V

    :cond_1e
    return-void
.end method

.method public g(IJ)V
    .registers 6

    if-nez p1, :cond_1c

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    monitor-enter p0

    :try_start_5
    invoke-virtual {p0}, LX8/f;->h1()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-static {p0, v0, v1}, LX8/f;->w0(LX8/f;J)V

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_17
    .catchall {:try_start_5 .. :try_end_17} :catchall_19

    monitor-exit p0

    return-void

    :catchall_19
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1c
    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p0, p1}, LX8/f;->c1(I)LX8/i;

    move-result-object p0

    if-eqz p0, :cond_2f

    monitor-enter p0

    :try_start_25
    invoke-virtual {p0, p2, p3}, LX8/i;->a(J)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_2a
    .catchall {:try_start_25 .. :try_end_2a} :catchall_2c

    monitor-exit p0

    return-void

    :catchall_2c
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_2f
    return-void
.end method

.method public h(ILX8/b;Le9/h;)V
    .registers 8

    const/4 v0, 0x1

    const-string v1, "errorCode"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "debugData"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Le9/h;->v()I

    iget-object p2, p0, LX8/f$d;->r:LX8/f;

    monitor-enter p2

    :try_start_11
    invoke-virtual {p2}, LX8/f;->g1()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    const/4 v1, 0x0

    new-array v2, v1, [LX8/i;

    invoke-interface {p3, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, v0}, LX8/f;->t0(LX8/f;Z)V

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_25
    .catchall {:try_start_11 .. :try_end_25} :catchall_4a

    monitor-exit p2

    check-cast p3, [LX8/i;

    array-length p2, p3

    :goto_29
    if-ge v1, p2, :cond_49

    aget-object v2, p3, v1

    invoke-virtual {v2}, LX8/i;->j()I

    move-result v3

    if-le v3, p1, :cond_47

    invoke-virtual {v2}, LX8/i;->t()Z

    move-result v3

    if-eqz v3, :cond_47

    sget-object v3, LX8/b;->z:LX8/b;

    invoke-virtual {v2, v3}, LX8/i;->y(LX8/b;)V

    iget-object v3, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v2}, LX8/i;->j()I

    move-result v2

    invoke-virtual {v3, v2}, LX8/f;->r1(I)LX8/i;

    :cond_47
    add-int/2addr v1, v0

    goto :goto_29

    :cond_49
    return-void

    :catchall_4a
    move-exception p0

    monitor-exit p2

    throw p0
.end method

.method public i(ZLX8/m;)V
    .registers 12

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f$d;->r:LX8/f;

    invoke-static {v0}, LX8/f;->K(LX8/f;)LT8/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v2}, LX8/f;->O0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " applyAndAckSettings"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v3, LX8/f$d$d;

    const/4 v5, 0x1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LX8/f$d$d;-><init>(Ljava/lang/String;ZLX8/f$d;ZLX8/m;)V

    const-wide/16 p0, 0x0

    invoke-virtual {v0, v3, p0, p1}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LX8/f$d;->r()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public k(ZII)V
    .registers 12

    if-eqz p1, :cond_3c

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    monitor-enter p0

    const/4 p1, 0x1

    const-wide/16 v0, 0x1

    if-eq p2, p1, :cond_30

    const/4 p1, 0x2

    if-eq p2, p1, :cond_27

    const/4 p1, 0x3

    if-eq p2, p1, :cond_16

    :goto_10
    :try_start_10
    sget-object p1, Lh8/A;->a:Lh8/A;

    goto :goto_38

    :catchall_13
    move-exception v0

    move-object p1, v0

    goto :goto_3a

    :cond_16
    invoke-static {p0}, LX8/f;->b(LX8/f;)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-static {p0, p1, p2}, LX8/f;->U(LX8/f;J)V

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    goto :goto_10

    :cond_27
    invoke-static {p0}, LX8/f;->j(LX8/f;)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-static {p0, p1, p2}, LX8/f;->Y(LX8/f;J)V

    goto :goto_38

    :cond_30
    invoke-static {p0}, LX8/f;->z(LX8/f;)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-static {p0, p1, p2}, LX8/f;->q0(LX8/f;J)V
    :try_end_38
    .catchall {:try_start_10 .. :try_end_38} :catchall_13

    :goto_38
    monitor-exit p0

    return-void

    :goto_3a
    monitor-exit p0

    throw p1

    :cond_3c
    iget-object p1, p0, LX8/f$d;->r:LX8/f;

    invoke-static {p1}, LX8/f;->K(LX8/f;)LT8/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v1}, LX8/f;->O0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ping"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, LX8/f$d;->r:LX8/f;

    new-instance v2, LX8/f$d$c;

    const/4 v4, 0x1

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, LX8/f$d$c;-><init>(Ljava/lang/String;ZLX8/f;II)V

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v2, p2, p3}, LT8/d;->i(LT8/a;J)V

    return-void
.end method

.method public l(IIIZ)V
    .registers 5

    return-void
.end method

.method public m(IILjava/util/List;)V
    .registers 4

    const-string p1, "requestHeaders"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p0, p2, p3}, LX8/f;->o1(ILjava/util/List;)V

    return-void
.end method

.method public o(ZILe9/g;I)V
    .registers 6

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v0, p2}, LX8/f;->q1(I)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {p0, p2, p3, p4, p1}, LX8/f;->m1(ILe9/g;IZ)V

    return-void

    :cond_13
    iget-object v0, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v0, p2}, LX8/f;->c1(I)LX8/i;

    move-result-object v0

    if-nez v0, :cond_2c

    iget-object p1, p0, LX8/f$d;->r:LX8/f;

    sget-object v0, LX8/b;->t:LX8/b;

    invoke-virtual {p1, p2, v0}, LX8/f;->D1(ILX8/b;)V

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    int-to-long p1, p4

    invoke-virtual {p0, p1, p2}, LX8/f;->y1(J)V

    invoke-interface {p3, p1, p2}, Le9/g;->skip(J)V

    return-void

    :cond_2c
    invoke-virtual {v0, p3, p4}, LX8/i;->w(Le9/g;I)V

    if-eqz p1, :cond_37

    sget-object p0, LQ8/d;->b:LP8/u;

    const/4 p1, 0x1

    invoke-virtual {v0, p0, p1}, LX8/i;->x(LP8/u;Z)V

    :cond_37
    return-void
.end method

.method public final q(ZLX8/m;)V
    .registers 13

    const/4 v0, 0x1

    const-string v1, "settings"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/E;

    invoke-direct {v1}, Lkotlin/jvm/internal/E;-><init>()V

    iget-object v2, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v2}, LX8/f;->i1()LX8/j;

    move-result-object v2

    iget-object p0, p0, LX8/f$d;->r:LX8/f;

    monitor-enter v2

    :try_start_14
    monitor-enter p0
    :try_end_15
    .catchall {:try_start_14 .. :try_end_15} :catchall_92

    :try_start_15
    invoke-virtual {p0}, LX8/f;->X0()LX8/m;

    move-result-object v3

    if-eqz p1, :cond_1c

    goto :goto_28

    :cond_1c
    new-instance p1, LX8/m;

    invoke-direct {p1}, LX8/m;-><init>()V

    invoke-virtual {p1, v3}, LX8/m;->g(LX8/m;)V

    invoke-virtual {p1, p2}, LX8/m;->g(LX8/m;)V

    move-object p2, p1

    :goto_28
    iput-object p2, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    invoke-virtual {p2}, LX8/m;->c()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v3}, LX8/m;->c()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr p1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    const/4 v6, 0x0

    if-eqz v5, :cond_5a

    invoke-virtual {p0}, LX8/f;->g1()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_47

    goto :goto_5a

    :cond_47
    invoke-virtual {p0}, LX8/f;->g1()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v7, v6, [LX8/i;

    invoke-interface {v5, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [LX8/i;

    goto :goto_5b

    :catchall_58
    move-exception p1

    goto :goto_af

    :cond_5a
    :goto_5a
    const/4 v5, 0x0

    :goto_5b
    iget-object v7, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v7, LX8/m;

    invoke-virtual {p0, v7}, LX8/f;->u1(LX8/m;)V

    invoke-static {p0}, LX8/f;->G(LX8/f;)LT8/d;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LX8/f;->O0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " onSettings"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, LX8/f$d$a;

    invoke-direct {v9, v8, v0, p0, v1}, LX8/f$d$a;-><init>(Ljava/lang/String;ZLX8/f;Lkotlin/jvm/internal/E;)V

    invoke-virtual {v7, v9, v3, v4}, LT8/d;->i(LT8/a;J)V

    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_85
    .catchall {:try_start_15 .. :try_end_85} :catchall_58

    :try_start_85
    monitor-exit p0
    :try_end_86
    .catchall {:try_start_85 .. :try_end_86} :catchall_92

    :try_start_86
    invoke-virtual {p0}, LX8/f;->i1()LX8/j;

    move-result-object v3

    iget-object v1, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v1, LX8/m;

    invoke-virtual {v3, v1}, LX8/j;->a(LX8/m;)V
    :try_end_91
    .catch Ljava/io/IOException; {:try_start_86 .. :try_end_91} :catch_94
    .catchall {:try_start_86 .. :try_end_91} :catchall_92

    goto :goto_98

    :catchall_92
    move-exception p0

    goto :goto_b1

    :catch_94
    move-exception v1

    :try_start_95
    invoke-static {p0, v1}, LX8/f;->a(LX8/f;Ljava/io/IOException;)V

    :goto_98
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_9a
    .catchall {:try_start_95 .. :try_end_9a} :catchall_92

    monitor-exit v2

    if-eqz v5, :cond_ae

    array-length p0, v5

    :goto_9e
    if-ge v6, p0, :cond_ae

    aget-object v1, v5, v6

    monitor-enter v1

    :try_start_a3
    invoke-virtual {v1, p1, p2}, LX8/i;->a(J)V

    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_a8
    .catchall {:try_start_a3 .. :try_end_a8} :catchall_ab

    monitor-exit v1

    add-int/2addr v6, v0

    goto :goto_9e

    :catchall_ab
    move-exception p0

    monitor-exit v1

    throw p0

    :cond_ae
    return-void

    :goto_af
    :try_start_af
    monitor-exit p0

    throw p1
    :try_end_b1
    .catchall {:try_start_af .. :try_end_b1} :catchall_92

    :goto_b1
    monitor-exit v2

    throw p0
.end method

.method public r()V
    .registers 6

    sget-object v0, LX8/b;->u:LX8/b;

    const/4 v1, 0x0

    :try_start_3
    iget-object v2, p0, LX8/f$d;->q:LX8/h;

    invoke-virtual {v2, p0}, LX8/h;->f(LX8/h$c;)V

    :cond_8
    iget-object v2, p0, LX8/f$d;->q:LX8/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, LX8/h;->b(ZLX8/h$c;)Z

    move-result v2

    if-nez v2, :cond_8

    sget-object v2, LX8/b;->s:LX8/b;
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_13} :catch_27
    .catchall {:try_start_3 .. :try_end_13} :catchall_24

    :try_start_13
    sget-object v0, LX8/b;->A:LX8/b;
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_15} :catch_22
    .catchall {:try_start_13 .. :try_end_15} :catchall_20

    iget-object v3, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v3, v2, v0, v1}, LX8/f;->A0(LX8/b;LX8/b;Ljava/io/IOException;)V

    iget-object p0, p0, LX8/f$d;->q:LX8/h;

    invoke-static {p0}, LQ8/d;->m(Ljava/io/Closeable;)V

    return-void

    :catchall_20
    move-exception v3

    goto :goto_36

    :catch_22
    move-exception v1

    goto :goto_29

    :catchall_24
    move-exception v3

    move-object v2, v0

    goto :goto_36

    :catch_27
    move-exception v1

    move-object v2, v0

    :goto_29
    :try_start_29
    sget-object v0, LX8/b;->t:LX8/b;
    :try_end_2b
    .catchall {:try_start_29 .. :try_end_2b} :catchall_20

    iget-object v2, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v2, v0, v0, v1}, LX8/f;->A0(LX8/b;LX8/b;Ljava/io/IOException;)V

    iget-object p0, p0, LX8/f$d;->q:LX8/h;

    invoke-static {p0}, LQ8/d;->m(Ljava/io/Closeable;)V

    return-void

    :goto_36
    iget-object v4, p0, LX8/f$d;->r:LX8/f;

    invoke-virtual {v4, v2, v0, v1}, LX8/f;->A0(LX8/b;LX8/b;Ljava/io/IOException;)V

    iget-object p0, p0, LX8/f$d;->q:LX8/h;

    invoke-static {p0}, LQ8/d;->m(Ljava/io/Closeable;)V

    throw v3
.end method
