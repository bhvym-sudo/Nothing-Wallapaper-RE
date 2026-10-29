.class public LK8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _prev$volatile:Ljava/lang/Object;

.field private volatile synthetic _removedRef$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-string v0, "_next$volatile"

    const-class v1, LK8/o;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/o;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/o;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_removedRef$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/o;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LK8/o;->_next$volatile:Ljava/lang/Object;

    iput-object p0, p0, LK8/o;->_prev$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final h()LK8/o;
    .registers 8

    :goto_0
    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK8/o;

    const/4 v1, 0x0

    move-object v2, v0

    :goto_c
    move-object v3, v1

    :goto_d
    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_26

    if-ne v0, v2, :cond_1a

    goto :goto_25

    :cond_1a
    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto :goto_0

    :cond_25
    :goto_25
    return-object v2

    :cond_26
    invoke-virtual {p0}, LK8/o;->q()Z

    move-result v5

    if-eqz v5, :cond_2d

    return-object v1

    :cond_2d
    instance-of v5, v4, LK8/x;

    if-eqz v5, :cond_4f

    if-eqz v3, :cond_44

    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v5

    check-cast v4, LK8/x;

    iget-object v4, v4, LK8/x;->a:LK8/o;

    invoke-virtual {v5, v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_42

    goto :goto_0

    :cond_42
    move-object v2, v3

    goto :goto_c

    :cond_44
    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK8/o;

    goto :goto_d

    :cond_4f
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v4

    check-cast v3, LK8/o;

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    goto :goto_d
.end method

.method private final i(LK8/o;)LK8/o;
    .registers 2

    :goto_0
    invoke-virtual {p1}, LK8/o;->q()Z

    move-result p0

    if-nez p0, :cond_7

    return-object p1

    :cond_7
    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p1, p0

    check-cast p1, LK8/o;

    goto :goto_0
.end method

.method private final j(LK8/o;)V
    .registers 5

    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK8/o;

    invoke-virtual {p0}, LK8/o;->k()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_11

    goto :goto_24

    :cond_11
    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p1, v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LK8/o;->q()Z

    move-result p0

    if-eqz p0, :cond_24

    invoke-direct {p1}, LK8/o;->h()LK8/o;

    :cond_24
    :goto_24
    return-void
.end method

.method private static final synthetic n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/o;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/o;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/o;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final t()LK8/x;
    .registers 3

    invoke-static {}, LK8/o;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK8/x;

    if-nez v0, :cond_18

    new-instance v0, LK8/x;

    invoke-direct {v0, p0}, LK8/x;-><init>(LK8/o;)V

    invoke-static {}, LK8/o;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_18
    return-object v0
.end method


# virtual methods
.method public final c(LK8/o;I)Z
    .registers 6

    :cond_0
    invoke-virtual {p0}, LK8/o;->m()LK8/o;

    move-result-object v0

    instance-of v1, v0, LK8/m;

    const/4 v2, 0x1

    if-eqz v1, :cond_1a

    move-object p0, v0

    check-cast p0, LK8/m;

    iget p0, p0, LK8/m;->t:I

    and-int/2addr p0, p2

    if-nez p0, :cond_18

    invoke-virtual {v0, p1, p2}, LK8/o;->c(LK8/o;I)Z

    move-result p0

    if-eqz p0, :cond_18

    return v2

    :cond_18
    const/4 p0, 0x0

    return p0

    :cond_1a
    invoke-virtual {v0, p1, p0}, LK8/o;->e(LK8/o;LK8/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method public final e(LK8/o;LK8/o;)Z
    .registers 4

    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    const/4 p0, 0x0

    return p0

    :cond_1a
    invoke-direct {p1, p2}, LK8/o;->j(LK8/o;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final f(LK8/o;)Z
    .registers 3

    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {p0}, LK8/o;->k()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_16

    const/4 p0, 0x0

    return p0

    :cond_16
    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-direct {p1, p0}, LK8/o;->j(LK8/o;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final g(I)V
    .registers 3

    new-instance v0, LK8/m;

    invoke-direct {v0, p1}, LK8/m;-><init>(I)V

    invoke-virtual {p0, v0, p1}, LK8/o;->c(LK8/o;I)Z

    return-void
.end method

.method public final k()Ljava/lang/Object;
    .registers 2

    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final l()LK8/o;
    .registers 2

    invoke-virtual {p0}, LK8/o;->k()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LK8/x;

    if-eqz v0, :cond_c

    move-object v0, p0

    check-cast v0, LK8/x;

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_15

    iget-object v0, v0, LK8/x;->a:LK8/o;

    if-nez v0, :cond_14

    goto :goto_15

    :cond_14
    return-object v0

    :cond_15
    :goto_15
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LK8/o;

    return-object p0
.end method

.method public final m()LK8/o;
    .registers 2

    invoke-direct {p0}, LK8/o;->h()LK8/o;

    move-result-object v0

    if-nez v0, :cond_15

    invoke-static {}, LK8/o;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK8/o;

    invoke-direct {p0, v0}, LK8/o;->i(LK8/o;)LK8/o;

    move-result-object p0

    return-object p0

    :cond_15
    return-object v0
.end method

.method public q()Z
    .registers 1

    invoke-virtual {p0}, LK8/o;->k()Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, LK8/x;

    return p0
.end method

.method public r()Z
    .registers 1

    invoke-virtual {p0}, LK8/o;->s()LK8/o;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final s()LK8/o;
    .registers 5

    :cond_0
    invoke-virtual {p0}, LK8/o;->k()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LK8/x;

    if-eqz v1, :cond_d

    check-cast v0, LK8/x;

    iget-object p0, v0, LK8/x;->a:LK8/o;

    return-object p0

    :cond_d
    if-ne v0, p0, :cond_12

    check-cast v0, LK8/o;

    return-object v0

    :cond_12
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, LK8/o;

    invoke-direct {v1}, LK8/o;->t()LK8/x;

    move-result-object v2

    invoke-static {}, LK8/o;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {v1}, LK8/o;->h()LK8/o;

    const/4 p0, 0x0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, LK8/o$a;

    invoke-direct {v1, p0}, LK8/o$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
