.class public abstract Lk6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/e$a;
    }
.end annotation


# static fields
.field public static final g:Lk6/e$a;


# instance fields
.field private volatile a:J

.field private volatile b:Z

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/util/List;

.field private final e:Landroid/os/Handler;

.field private final f:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lk6/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk6/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lk6/e;->g:Lk6/e$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk6/e;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk6/e;->d:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lk6/e;->e:Landroid/os/Handler;

    new-instance v0, Lk6/d;

    invoke-direct {v0, p0}, Lk6/d;-><init>(Lk6/e;)V

    iput-object v0, p0, Lk6/e;->f:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(Lk6/e;)V
    .registers 1

    invoke-static {p0}, Lk6/e;->b(Lk6/e;)V

    return-void
.end method

.method private static final b(Lk6/e;)V
    .registers 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk6/e;->b:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lk6/e;->a:J

    sub-long/2addr v0, v2

    invoke-virtual {p0}, Lk6/e;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_16

    invoke-virtual {p0}, Lk6/e;->c()V

    return-void

    :cond_16
    invoke-direct {p0}, Lk6/e;->n()V

    return-void
.end method

.method private final n()V
    .registers 6

    iget-boolean v0, p0, Lk6/e;->b:Z

    if-nez v0, :cond_2e

    iget-object v0, p0, Lk6/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_7
    iget-boolean v1, p0, Lk6/e;->b:Z
    :try_end_9
    .catchall {:try_start_7 .. :try_end_9} :catchall_26

    if-eqz v1, :cond_d

    monitor-exit v0

    return-void

    :cond_d
    :try_start_d
    iget-object v1, p0, Lk6/e;->d:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_28

    const/4 v1, 0x1

    iput-boolean v1, p0, Lk6/e;->b:Z

    iget-object v1, p0, Lk6/e;->e:Landroid/os/Handler;

    iget-object v2, p0, Lk6/e;->f:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lk6/e;->f()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_28

    :catchall_26
    move-exception p0

    goto :goto_2c

    :cond_28
    :goto_28
    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_2a
    .catchall {:try_start_d .. :try_end_2a} :catchall_26

    monitor-exit v0

    return-void

    :goto_2c
    monitor-exit v0

    throw p0

    :cond_2e
    return-void
.end method


# virtual methods
.method public final c()V
    .registers 4

    iget-object v0, p0, Lk6/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lk6/e;->d:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lk6/e;->j(Ljava/lang/Object;)V

    goto :goto_b

    :catchall_19
    move-exception p0

    goto :goto_24

    :cond_1b
    iget-object p0, p0, Lk6/e;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_22
    .catchall {:try_start_3 .. :try_end_22} :catchall_19

    monitor-exit v0

    return-void

    :goto_24
    monitor-exit v0

    throw p0
.end method

.method public final d()V
    .registers 4

    iget-object v0, p0, Lk6/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lk6/e;->e:Landroid/os/Handler;

    iget-object v2, p0, Lk6/e;->f:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_11

    monitor-exit v0

    invoke-virtual {p0}, Lk6/e;->c()V

    return-void

    :catchall_11
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method protected final e(Lv8/l;)Ljava/lang/Object;
    .registers 6

    const-string v0, "predicateLocked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lk6/e;->a:J

    iget-object v0, p0, Lk6/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_e
    iget-object v1, p0, Lk6/e;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_53

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    const-string p1, "SimpledObjectPool"

    invoke-virtual {p0}, Lk6/e;->h()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " get "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4f
    .catchall {:try_start_e .. :try_end_4f} :catchall_51

    monitor-exit v0

    return-object v2

    :catchall_51
    move-exception p0

    goto :goto_72

    :cond_53
    :try_start_53
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_55
    .catchall {:try_start_53 .. :try_end_55} :catchall_51

    monitor-exit v0

    const-string p1, "SimpledObjectPool"

    invoke-virtual {p0}, Lk6/e;->h()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " get nothing."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :goto_72
    monitor-exit v0

    throw p0
.end method

.method public abstract f()J
.end method

.method public abstract g()I
.end method

.method protected abstract h()Ljava/lang/String;
.end method

.method protected abstract i(Ljava/lang/Object;)Z
.end method

.method protected j(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method protected k(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method protected l(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .registers 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lk6/e;->a:J

    invoke-virtual {p0, p1}, Lk6/e;->i(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    const-string v0, "SimpledObjectPool"

    invoke-virtual {p0}, Lk6/e;->h()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " can\'t recycle "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2f
    iget-object v0, p0, Lk6/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_32
    iget-object v1, p0, Lk6/e;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Lk6/e;->g()I

    move-result v2

    if-ne v1, v2, :cond_67

    invoke-virtual {p0, p1}, Lk6/e;->k(Ljava/lang/Object;)V

    const-string v1, "SimpledObjectPool"

    invoke-virtual {p0}, Lk6/e;->h()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " can\'t recycle "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cause capacity to maximum."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_63
    .catchall {:try_start_32 .. :try_end_63} :catchall_65

    monitor-exit v0

    return-void

    :catchall_65
    move-exception p0

    goto :goto_98

    :cond_67
    :try_start_67
    iget-object v1, p0, Lk6/e;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lk6/e;->l(Ljava/lang/Object;)V

    const-string v1, "SimpledObjectPool"

    invoke-virtual {p0}, Lk6/e;->h()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " successful recycling."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_93
    .catchall {:try_start_67 .. :try_end_93} :catchall_65

    monitor-exit v0

    invoke-direct {p0}, Lk6/e;->n()V

    return-void

    :goto_98
    monitor-exit v0

    throw p0
.end method
