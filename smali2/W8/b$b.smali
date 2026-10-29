.class final LW8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final q:Le9/k;

.field private r:Z

.field final synthetic s:LW8/b;


# direct methods
.method public constructor <init>(LW8/b;)V
    .registers 3

    iput-object p1, p0, LW8/b$b;->s:LW8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le9/k;

    invoke-static {p1}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object p1

    invoke-interface {p1}, Le9/z;->e()Le9/C;

    move-result-object p1

    invoke-direct {v0, p1}, Le9/k;-><init>(Le9/C;)V

    iput-object v0, p0, LW8/b$b;->q:Le9/k;

    return-void
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LW8/b$b;->r:Z

    if-nez v0, :cond_37

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_10

    return-void

    :cond_10
    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    invoke-static {v0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Le9/f;->r0(J)Le9/f;

    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    invoke-static {v0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    invoke-static {v0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Le9/z;->Z(Le9/e;J)V

    iget-object p0, p0, LW8/b$b;->s:LW8/b;

    invoke-static {p0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object p0

    invoke-interface {p0, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    return-void

    :cond_37
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public declared-synchronized close()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LW8/b$b;->r:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_24

    if-eqz v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    const/4 v0, 0x1

    :try_start_8
    iput-boolean v0, p0, LW8/b$b;->r:Z

    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    invoke-static {v0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    iget-object v1, p0, LW8/b$b;->q:Le9/k;

    invoke-static {v0, v1}, LW8/b;->i(LW8/b;Le9/k;)V

    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    const/4 v1, 0x3

    invoke-static {v0, v1}, LW8/b;->p(LW8/b;I)V
    :try_end_22
    .catchall {:try_start_8 .. :try_end_22} :catchall_24

    monitor-exit p0

    return-void

    :catchall_24
    move-exception v0

    :try_start_25
    monitor-exit p0
    :try_end_26
    .catchall {:try_start_25 .. :try_end_26} :catchall_24

    throw v0
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, LW8/b$b;->q:Le9/k;

    return-object p0
.end method

.method public declared-synchronized flush()V
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LW8/b$b;->r:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_12

    if-eqz v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    iget-object v0, p0, LW8/b$b;->s:LW8/b;

    invoke-static {v0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object v0

    invoke-interface {v0}, Le9/f;->flush()V
    :try_end_10
    .catchall {:try_start_7 .. :try_end_10} :catchall_12

    monitor-exit p0

    return-void

    :catchall_12
    move-exception v0

    :try_start_13
    monitor-exit p0
    :try_end_14
    .catchall {:try_start_13 .. :try_end_14} :catchall_12

    throw v0
.end method
