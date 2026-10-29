.class public final LT8/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT8/e;-><init>(LT8/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LT8/e;


# direct methods
.method constructor <init>(LT8/e;)V
    .registers 2

    iput-object p1, p0, LT8/e$d;->q:LT8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 8

    :cond_0
    :goto_0
    iget-object v0, p0, LT8/e$d;->q:LT8/e;

    monitor-enter v0

    :try_start_3
    invoke-virtual {v0}, LT8/e;->d()LT8/a;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_96

    monitor-exit v0

    if-nez v1, :cond_b

    return-void

    :cond_b
    invoke-virtual {v1}, LT8/a;->d()LT8/d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, p0, LT8/e$d;->q:LT8/e;

    sget-object v3, LT8/e;->h:LT8/e$b;

    invoke-virtual {v3}, LT8/e$b;->a()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_34

    invoke-virtual {v0}, LT8/d;->h()LT8/e;

    move-result-object v4

    invoke-virtual {v4}, LT8/e;->g()LT8/e$a;

    move-result-object v4

    invoke-interface {v4}, LT8/e$a;->c()J

    move-result-wide v4

    const-string v6, "starting"

    invoke-static {v1, v0, v6}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    goto :goto_36

    :cond_34
    const-wide/16 v4, -0x1

    :goto_36
    :try_start_36
    invoke-static {v2, v1}, LT8/e;->b(LT8/e;LT8/a;)V
    :try_end_39
    .catchall {:try_start_36 .. :try_end_39} :catchall_65

    :try_start_39
    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_3b
    .catchall {:try_start_39 .. :try_end_3b} :catchall_63

    if-eqz v3, :cond_0

    invoke-virtual {v0}, LT8/d;->h()LT8/e;

    move-result-object v2

    invoke-virtual {v2}, LT8/e;->g()LT8/e$a;

    move-result-object v2

    invoke-interface {v2}, LT8/e$a;->c()J

    move-result-wide v2

    sub-long/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "finished run in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, LT8/b;->b(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    goto :goto_0

    :catchall_63
    move-exception p0

    goto :goto_6e

    :catchall_65
    move-exception v6

    :try_start_66
    invoke-virtual {v2}, LT8/e;->g()LT8/e$a;

    move-result-object v2

    invoke-interface {v2, p0}, LT8/e$a;->execute(Ljava/lang/Runnable;)V

    throw v6
    :try_end_6e
    .catchall {:try_start_66 .. :try_end_6e} :catchall_63

    :goto_6e
    if-eqz v3, :cond_95

    invoke-virtual {v0}, LT8/d;->h()LT8/e;

    move-result-object v2

    invoke-virtual {v2}, LT8/e;->g()LT8/e$a;

    move-result-object v2

    invoke-interface {v2}, LT8/e$a;->c()J

    move-result-wide v2

    sub-long/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "failed a run in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, LT8/b;->b(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, LT8/b;->a(LT8/a;LT8/d;Ljava/lang/String;)V

    :cond_95
    throw p0

    :catchall_96
    move-exception p0

    monitor-exit v0

    throw p0
.end method
