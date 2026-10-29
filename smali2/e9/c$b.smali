.class final Le9/c$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "Okio Watchdog"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    :catch_0
    :cond_0
    :goto_0
    :try_start_0
    invoke-static {}, Le9/c;->i()Le9/c$a;

    move-result-object p0

    invoke-virtual {p0}, Le9/c$a;->e()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_b} :catch_0

    :try_start_b
    invoke-static {}, Le9/c;->i()Le9/c$a;

    move-result-object v0

    invoke-virtual {v0}, Le9/c$a;->c()Le9/c;

    move-result-object v0

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object v1

    if-ne v0, v1, :cond_26

    invoke-static {}, Le9/c;->i()Le9/c$a;

    const/4 v0, 0x0

    invoke-static {v0}, Le9/c;->r(Le9/c;)V
    :try_end_20
    .catchall {:try_start_b .. :try_end_20} :catchall_24

    :try_start_20
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_23
    .catch Ljava/lang/InterruptedException; {:try_start_20 .. :try_end_23} :catch_0

    return-void

    :catchall_24
    move-exception v0

    goto :goto_31

    :cond_26
    :try_start_26
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_28
    .catchall {:try_start_26 .. :try_end_28} :catchall_24

    :try_start_28
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le9/c;->B()V

    goto :goto_0

    :goto_31
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
    :try_end_35
    .catch Ljava/lang/InterruptedException; {:try_start_28 .. :try_end_35} :catch_0
.end method
