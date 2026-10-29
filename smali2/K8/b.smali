.class public abstract LK8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _prev$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "_next$volatile"

    const-class v1, LK8/b;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/b;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LK8/b;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK8/b;->_prev$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(LK8/b;)Ljava/lang/Object;
    .registers 1

    invoke-direct {p0}, LK8/b;->g()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c()LK8/b;
    .registers 2

    invoke-virtual {p0}, LK8/b;->h()LK8/b;

    move-result-object p0

    :goto_4
    if-eqz p0, :cond_17

    invoke-virtual {p0}, LK8/b;->k()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LK8/b;->j()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK8/b;

    goto :goto_4

    :cond_17
    return-object p0
.end method

.method private final d()LK8/b;
    .registers 2

    invoke-virtual {p0}, LK8/b;->f()LK8/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_7
    invoke-virtual {p0}, LK8/b;->k()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {p0}, LK8/b;->f()LK8/b;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_16

    :cond_14
    move-object p0, v0

    goto :goto_7

    :cond_16
    :goto_16
    return-object p0
.end method

.method private final g()Ljava/lang/Object;
    .registers 2

    invoke-static {}, LK8/b;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/b;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic j()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/b;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .registers 3

    invoke-static {}, LK8/b;->j()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final f()LK8/b;
    .registers 2

    invoke-static {p0}, LK8/b;->a(LK8/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LK8/a;->a()LK8/D;

    move-result-object v0

    if-ne p0, v0, :cond_c

    const/4 p0, 0x0

    return-object p0

    :cond_c
    check-cast p0, LK8/b;

    return-object p0
.end method

.method public final h()LK8/b;
    .registers 2

    invoke-static {}, LK8/b;->j()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK8/b;

    return-object p0
.end method

.method public abstract k()Z
.end method

.method public final l()Z
    .registers 1

    invoke-virtual {p0}, LK8/b;->f()LK8/b;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final m()Z
    .registers 4

    invoke-static {}, LK8/b;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, LK8/a;->a()LK8/D;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final n()V
    .registers 6

    invoke-virtual {p0}, LK8/b;->l()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_42

    :cond_7
    invoke-direct {p0}, LK8/b;->c()LK8/b;

    move-result-object v0

    invoke-direct {p0}, LK8/b;->d()LK8/b;

    move-result-object v1

    invoke-static {}, LK8/b;->j()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    :cond_13
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LK8/b;

    if-nez v4, :cond_1e

    const/4 v4, 0x0

    goto :goto_1f

    :cond_1e
    move-object v4, v0

    :goto_1f
    invoke-virtual {v2, v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    if-eqz v0, :cond_2e

    invoke-static {}, LK8/b;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2e
    invoke-virtual {v1}, LK8/b;->k()Z

    move-result v2

    if-eqz v2, :cond_3a

    invoke-virtual {v1}, LK8/b;->l()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_3a
    if-eqz v0, :cond_42

    invoke-virtual {v0}, LK8/b;->k()Z

    move-result v0

    if-nez v0, :cond_7

    :cond_42
    :goto_42
    return-void
.end method

.method public final o(LK8/b;)Z
    .registers 4

    invoke-static {}, LK8/b;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
