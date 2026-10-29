.class final Lg9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/q$b;,
        Lg9/q$c;
    }
.end annotation


# instance fields
.field private final q:Lg9/w;

.field private final r:Ljava/lang/Object;

.field private final s:[Ljava/lang/Object;

.field private final t:LP8/e$a;

.field private final u:Lg9/h;

.field private volatile v:Z

.field private w:LP8/e;

.field private x:Ljava/lang/Throwable;

.field private y:Z


# direct methods
.method constructor <init>(Lg9/w;Ljava/lang/Object;[Ljava/lang/Object;LP8/e$a;Lg9/h;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/q;->q:Lg9/w;

    iput-object p2, p0, Lg9/q;->r:Ljava/lang/Object;

    iput-object p3, p0, Lg9/q;->s:[Ljava/lang/Object;

    iput-object p4, p0, Lg9/q;->t:LP8/e$a;

    iput-object p5, p0, Lg9/q;->u:Lg9/h;

    return-void
.end method

.method private d()LP8/e;
    .registers 4

    iget-object v0, p0, Lg9/q;->t:LP8/e$a;

    iget-object v1, p0, Lg9/q;->q:Lg9/w;

    iget-object v2, p0, Lg9/q;->r:Ljava/lang/Object;

    iget-object p0, p0, Lg9/q;->s:[Ljava/lang/Object;

    invoke-virtual {v1, v2, p0}, Lg9/w;->a(Ljava/lang/Object;[Ljava/lang/Object;)LP8/B;

    move-result-object p0

    invoke-interface {v0, p0}, LP8/e$a;->c(LP8/B;)LP8/e;

    move-result-object p0

    if-eqz p0, :cond_13

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Call.Factory returned null."

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private e()LP8/e;
    .registers 2

    iget-object v0, p0, Lg9/q;->w:LP8/e;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    iget-object v0, p0, Lg9/q;->x:Ljava/lang/Throwable;

    if-eqz v0, :cond_1a

    instance-of p0, v0, Ljava/io/IOException;

    if-nez p0, :cond_17

    instance-of p0, v0, Ljava/lang/RuntimeException;

    if-eqz p0, :cond_14

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_14
    check-cast v0, Ljava/lang/Error;

    throw v0

    :cond_17
    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_1a
    :try_start_1a
    invoke-direct {p0}, Lg9/q;->d()LP8/e;

    move-result-object v0

    iput-object v0, p0, Lg9/q;->w:LP8/e;
    :try_end_20
    .catch Ljava/lang/RuntimeException; {:try_start_1a .. :try_end_20} :catch_21
    .catch Ljava/lang/Error; {:try_start_1a .. :try_end_20} :catch_21
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_20} :catch_21

    return-object v0

    :catch_21
    move-exception v0

    invoke-static {v0}, Lg9/C;->t(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lg9/q;->x:Ljava/lang/Throwable;

    throw v0
.end method


# virtual methods
.method public a()Lg9/x;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lg9/q;->y:Z

    if-nez v0, :cond_1f

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg9/q;->y:Z

    invoke-direct {p0}, Lg9/q;->e()LP8/e;

    move-result-object v0

    monitor-exit p0
    :try_end_d
    .catchall {:try_start_1 .. :try_end_d} :catchall_1d

    iget-boolean v1, p0, Lg9/q;->v:Z

    if-eqz v1, :cond_14

    invoke-interface {v0}, LP8/e;->cancel()V

    :cond_14
    invoke-interface {v0}, LP8/e;->a()LP8/D;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg9/q;->h(LP8/D;)Lg9/x;

    move-result-object p0

    return-object p0

    :catchall_1d
    move-exception v0

    goto :goto_27

    :cond_1f
    :try_start_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already executed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_27
    monitor-exit p0
    :try_end_28
    .catchall {:try_start_1f .. :try_end_28} :catchall_1d

    throw v0
.end method

.method public declared-synchronized b()LP8/B;
    .registers 4

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, Lg9/q;->e()LP8/e;

    move-result-object v0

    invoke-interface {v0}, LP8/e;->b()LP8/B;

    move-result-object v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_9} :catch_d
    .catchall {:try_start_1 .. :try_end_9} :catchall_b

    monitor-exit p0

    return-object v0

    :catchall_b
    move-exception v0

    goto :goto_16

    :catch_d
    move-exception v0

    :try_start_e
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to create request."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_16
    monitor-exit p0
    :try_end_17
    .catchall {:try_start_e .. :try_end_17} :catchall_b

    throw v0
.end method

.method public c()Lg9/q;
    .registers 7

    new-instance v0, Lg9/q;

    iget-object v1, p0, Lg9/q;->q:Lg9/w;

    iget-object v2, p0, Lg9/q;->r:Ljava/lang/Object;

    iget-object v3, p0, Lg9/q;->s:[Ljava/lang/Object;

    iget-object v4, p0, Lg9/q;->t:LP8/e$a;

    iget-object v5, p0, Lg9/q;->u:Lg9/h;

    invoke-direct/range {v0 .. v5}, Lg9/q;-><init>(Lg9/w;Ljava/lang/Object;[Ljava/lang/Object;LP8/e$a;Lg9/h;)V

    return-object v0
.end method

.method public cancel()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg9/q;->v:Z

    monitor-enter p0

    :try_start_4
    iget-object v0, p0, Lg9/q;->w:LP8/e;

    monitor-exit p0
    :try_end_7
    .catchall {:try_start_4 .. :try_end_7} :catchall_d

    if-eqz v0, :cond_c

    invoke-interface {v0}, LP8/e;->cancel()V

    :cond_c
    return-void

    :catchall_d
    move-exception v0

    :try_start_e
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_e .. :try_end_f} :catchall_d

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Lg9/q;->c()Lg9/q;

    move-result-object p0

    return-object p0
.end method

.method public f()Z
    .registers 3

    iget-boolean v0, p0, Lg9/q;->v:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    return v1

    :cond_6
    monitor-enter p0

    :try_start_7
    iget-object v0, p0, Lg9/q;->w:LP8/e;

    if-eqz v0, :cond_14

    invoke-interface {v0}, LP8/e;->f()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_15

    :catchall_12
    move-exception v0

    goto :goto_17

    :cond_14
    const/4 v1, 0x0

    :goto_15
    monitor-exit p0

    return v1

    :goto_17
    monitor-exit p0
    :try_end_18
    .catchall {:try_start_7 .. :try_end_18} :catchall_12

    throw v0
.end method

.method public g(Lg9/f;)V
    .registers 5

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    monitor-enter p0

    :try_start_6
    iget-boolean v0, p0, Lg9/q;->y:Z

    if-nez v0, :cond_3d

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg9/q;->y:Z

    iget-object v0, p0, Lg9/q;->w:LP8/e;

    iget-object v1, p0, Lg9/q;->x:Ljava/lang/Throwable;
    :try_end_11
    .catchall {:try_start_6 .. :try_end_11} :catchall_24

    if-nez v0, :cond_26

    if-nez v1, :cond_26

    :try_start_15
    invoke-direct {p0}, Lg9/q;->d()LP8/e;

    move-result-object v2

    iput-object v2, p0, Lg9/q;->w:LP8/e;
    :try_end_1b
    .catchall {:try_start_15 .. :try_end_1b} :catchall_1d

    move-object v0, v2

    goto :goto_26

    :catchall_1d
    move-exception v1

    :try_start_1e
    invoke-static {v1}, Lg9/C;->t(Ljava/lang/Throwable;)V

    iput-object v1, p0, Lg9/q;->x:Ljava/lang/Throwable;

    goto :goto_26

    :catchall_24
    move-exception p1

    goto :goto_45

    :cond_26
    :goto_26
    monitor-exit p0
    :try_end_27
    .catchall {:try_start_1e .. :try_end_27} :catchall_24

    if-eqz v1, :cond_2d

    invoke-interface {p1, p0, v1}, Lg9/f;->a(Lg9/d;Ljava/lang/Throwable;)V

    return-void

    :cond_2d
    iget-boolean v1, p0, Lg9/q;->v:Z

    if-eqz v1, :cond_34

    invoke-interface {v0}, LP8/e;->cancel()V

    :cond_34
    new-instance v1, Lg9/q$a;

    invoke-direct {v1, p0, p1}, Lg9/q$a;-><init>(Lg9/q;Lg9/f;)V

    invoke-interface {v0, v1}, LP8/e;->B(LP8/f;)V

    return-void

    :cond_3d
    :try_start_3d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already executed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_45
    monitor-exit p0
    :try_end_46
    .catchall {:try_start_3d .. :try_end_46} :catchall_24

    throw p1
.end method

.method h(LP8/D;)Lg9/x;
    .registers 7

    invoke-virtual {p1}, LP8/D;->a()LP8/E;

    move-result-object v0

    invoke-virtual {p1}, LP8/D;->U()LP8/D$a;

    move-result-object p1

    new-instance v1, Lg9/q$c;

    invoke-virtual {v0}, LP8/E;->g()LP8/x;

    move-result-object v2

    invoke-virtual {v0}, LP8/E;->f()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lg9/q$c;-><init>(LP8/x;J)V

    invoke-virtual {p1, v1}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object p1

    invoke-virtual {p1}, LP8/D$a;->c()LP8/D;

    move-result-object p1

    invoke-virtual {p1}, LP8/D;->j()I

    move-result v1

    const/16 v2, 0xc8

    if-lt v1, v2, :cond_51

    const/16 v2, 0x12c

    if-lt v1, v2, :cond_2a

    goto :goto_51

    :cond_2a
    const/16 v2, 0xcc

    if-eq v1, v2, :cond_48

    const/16 v2, 0xcd

    if-ne v1, v2, :cond_33

    goto :goto_48

    :cond_33
    new-instance v1, Lg9/q$b;

    invoke-direct {v1, v0}, Lg9/q$b;-><init>(LP8/E;)V

    :try_start_38
    iget-object p0, p0, Lg9/q;->u:Lg9/h;

    invoke-interface {p0, v1}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Lg9/x;->f(Ljava/lang/Object;LP8/D;)Lg9/x;

    move-result-object p0
    :try_end_42
    .catch Ljava/lang/RuntimeException; {:try_start_38 .. :try_end_42} :catch_43

    return-object p0

    :catch_43
    move-exception p0

    invoke-virtual {v1}, Lg9/q$b;->z()V

    throw p0

    :cond_48
    :goto_48
    invoke-virtual {v0}, LP8/E;->close()V

    const/4 p0, 0x0

    invoke-static {p0, p1}, Lg9/x;->f(Ljava/lang/Object;LP8/D;)Lg9/x;

    move-result-object p0

    return-object p0

    :cond_51
    :goto_51
    :try_start_51
    invoke-static {v0}, Lg9/C;->a(LP8/E;)LP8/E;

    move-result-object p0

    invoke-static {p0, p1}, Lg9/x;->c(LP8/E;LP8/D;)Lg9/x;

    move-result-object p0
    :try_end_59
    .catchall {:try_start_51 .. :try_end_59} :catchall_5d

    invoke-virtual {v0}, LP8/E;->close()V

    return-object p0

    :catchall_5d
    move-exception p0

    invoke-virtual {v0}, LP8/E;->close()V

    throw p0
.end method

.method public bridge synthetic u()Lg9/d;
    .registers 1

    invoke-virtual {p0}, Lg9/q;->c()Lg9/q;

    move-result-object p0

    return-object p0
.end method
