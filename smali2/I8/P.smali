.class final LI8/P;
.super LJ8/b;
.source "SourceFile"

# interfaces
.implements LI8/A;
.implements LI8/f;
.implements LJ8/q;


# static fields
.field private static final synthetic v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state$volatile"

    const-class v2, LI8/P;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LI8/P;->v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .registers 2

    invoke-direct {p0}, LJ8/b;-><init>()V

    iput-object p1, p0, LI8/P;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private static final synthetic s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LI8/P;->v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final t(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 9

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_2
    invoke-static {}, LI8/P;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p1, :cond_17

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_11
    .catchall {:try_start_2 .. :try_end_11} :catchall_15

    if-nez p1, :cond_17

    monitor-exit p0

    return v2

    :catchall_15
    move-exception p1

    goto :goto_66

    :cond_17
    :try_start_17
    invoke-static {v1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_1b
    .catchall {:try_start_17 .. :try_end_1b} :catchall_15

    if-eqz p1, :cond_1f

    monitor-exit p0

    return v0

    :cond_1f
    :try_start_1f
    invoke-static {}, LI8/P;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, p0, LI8/P;->u:I

    and-int/lit8 p2, p1, 0x1

    if-nez p2, :cond_60

    add-int/2addr p1, v0

    iput p1, p0, LI8/P;->u:I

    invoke-virtual {p0}, LJ8/b;->p()[LJ8/d;

    move-result-object p2

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_35
    .catchall {:try_start_1f .. :try_end_35} :catchall_15

    monitor-exit p0

    :goto_36
    check-cast p2, [LI8/S;

    if-eqz p2, :cond_47

    array-length v1, p2

    move v3, v2

    :goto_3c
    if-ge v3, v1, :cond_47

    aget-object v4, p2, v3

    if-eqz v4, :cond_45

    invoke-virtual {v4}, LI8/S;->g()V

    :cond_45
    add-int/2addr v3, v0

    goto :goto_3c

    :cond_47
    monitor-enter p0

    :try_start_48
    iget p2, p0, LI8/P;->u:I

    if-ne p2, p1, :cond_53

    add-int/2addr p1, v0

    iput p1, p0, LI8/P;->u:I
    :try_end_4f
    .catchall {:try_start_48 .. :try_end_4f} :catchall_51

    monitor-exit p0

    return v0

    :catchall_51
    move-exception p1

    goto :goto_5e

    :cond_53
    :try_start_53
    invoke-virtual {p0}, LJ8/b;->p()[LJ8/d;

    move-result-object p1

    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_59
    .catchall {:try_start_53 .. :try_end_59} :catchall_51

    monitor-exit p0

    move v5, p2

    move-object p2, p1

    move p1, v5

    goto :goto_36

    :goto_5e
    monitor-exit p0

    throw p1

    :cond_60
    add-int/lit8 p1, p1, 0x2

    :try_start_62
    iput p1, p0, LI8/P;->u:I
    :try_end_64
    .catchall {:try_start_62 .. :try_end_64} :catchall_15

    monitor-exit p0

    return v0

    :goto_66
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 12

    instance-of v0, p2, LI8/P$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/P$a;

    iget v1, v0, LI8/P$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/P$a;->x:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/P$a;

    invoke-direct {v0, p0, p2}, LI8/P$a;-><init>(LI8/P;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/P$a;->v:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/P$a;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eqz v2, :cond_7b

    const/4 p0, 0x1

    if-eq v2, p0, :cond_64

    if-eq v2, v5, :cond_4d

    if-ne v2, v4, :cond_45

    iget-object p0, v0, LI8/P$a;->u:Ljava/lang/Object;

    iget-object p1, v0, LI8/P$a;->t:Ljava/lang/Object;

    check-cast p1, LF8/x0;

    iget-object v2, v0, LI8/P$a;->s:Ljava/lang/Object;

    check-cast v2, LI8/S;

    iget-object v6, v0, LI8/P$a;->r:Ljava/lang/Object;

    check-cast v6, LI8/g;

    iget-object v7, v0, LI8/P$a;->q:Ljava/lang/Object;

    check-cast v7, LI8/P;

    :try_start_3e
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_41
    .catchall {:try_start_3e .. :try_end_41} :catchall_42

    goto :goto_95

    :catchall_42
    move-exception p0

    goto/16 :goto_de

    :cond_45
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4d
    iget-object p0, v0, LI8/P$a;->u:Ljava/lang/Object;

    iget-object p1, v0, LI8/P$a;->t:Ljava/lang/Object;

    check-cast p1, LF8/x0;

    iget-object v2, v0, LI8/P$a;->s:Ljava/lang/Object;

    check-cast v2, LI8/S;

    iget-object v6, v0, LI8/P$a;->r:Ljava/lang/Object;

    check-cast v6, LI8/g;

    iget-object v7, v0, LI8/P$a;->q:Ljava/lang/Object;

    check-cast v7, LI8/P;

    :try_start_5f
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_62
    .catchall {:try_start_5f .. :try_end_62} :catchall_42

    goto/16 :goto_c5

    :cond_64
    iget-object p0, v0, LI8/P$a;->s:Ljava/lang/Object;

    move-object v2, p0

    check-cast v2, LI8/S;

    iget-object p0, v0, LI8/P$a;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LI8/g;

    iget-object p0, v0, LI8/P$a;->q:Ljava/lang/Object;

    check-cast p0, LI8/P;

    :try_start_72
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_75
    .catchall {:try_start_72 .. :try_end_75} :catchall_76

    goto :goto_85

    :catchall_76
    move-exception p1

    move-object v7, p0

    move-object p0, p1

    goto/16 :goto_de

    :cond_7b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LJ8/b;->j()LJ8/d;

    move-result-object p2

    check-cast p2, LI8/S;

    move-object v2, p2

    :goto_85
    :try_start_85
    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p2

    sget-object v6, LF8/x0;->e:LF8/x0$b;

    invoke-interface {p2, v6}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p2

    check-cast p2, LF8/x0;
    :try_end_91
    .catchall {:try_start_85 .. :try_end_91} :catchall_76

    move-object v7, p0

    move-object v6, p1

    move-object p1, p2

    move-object p0, v3

    :cond_95
    :goto_95
    :try_start_95
    invoke-static {}, LI8/P;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_a2

    invoke-static {p1}, LF8/A0;->i(LF8/x0;)V

    :cond_a2
    if-eqz p0, :cond_aa

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c5

    :cond_aa
    sget-object p0, LJ8/t;->a:LK8/D;

    if-ne p2, p0, :cond_b0

    move-object p0, v3

    goto :goto_b1

    :cond_b0
    move-object p0, p2

    :goto_b1
    iput-object v7, v0, LI8/P$a;->q:Ljava/lang/Object;

    iput-object v6, v0, LI8/P$a;->r:Ljava/lang/Object;

    iput-object v2, v0, LI8/P$a;->s:Ljava/lang/Object;

    iput-object p1, v0, LI8/P$a;->t:Ljava/lang/Object;

    iput-object p2, v0, LI8/P$a;->u:Ljava/lang/Object;

    iput v5, v0, LI8/P$a;->x:I

    invoke-interface {v6, p0, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_c4

    goto :goto_dd

    :cond_c4
    move-object p0, p2

    :cond_c5
    :goto_c5
    invoke-virtual {v2}, LI8/S;->h()Z

    move-result p2

    if-nez p2, :cond_95

    iput-object v7, v0, LI8/P$a;->q:Ljava/lang/Object;

    iput-object v6, v0, LI8/P$a;->r:Ljava/lang/Object;

    iput-object v2, v0, LI8/P$a;->s:Ljava/lang/Object;

    iput-object p1, v0, LI8/P$a;->t:Ljava/lang/Object;

    iput-object p0, v0, LI8/P$a;->u:Ljava/lang/Object;

    iput v4, v0, LI8/P$a;->x:I

    invoke-virtual {v2, v0}, LI8/S;->e(Lm8/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_db
    .catchall {:try_start_95 .. :try_end_db} :catchall_42

    if-ne p2, v1, :cond_95

    :goto_dd
    return-object v1

    :goto_de
    invoke-virtual {v7, v2}, LJ8/b;->n(LJ8/d;)V

    throw p0
.end method

.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1}, LI8/P;->setValue(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public c()Ljava/util/List;
    .registers 1

    invoke-virtual {p0}, LI8/P;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    if-nez p1, :cond_4

    sget-object p1, LJ8/t;->a:LK8/D;

    :cond_4
    if-nez p2, :cond_8

    sget-object p2, LJ8/t;->a:LK8/D;

    :cond_8
    invoke-direct {p0, p1, p2}, LI8/P;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public e(Lm8/i;ILH8/a;)LI8/f;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/Q;->d(LI8/O;Lm8/i;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public g()V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "MutableStateFlow.resetReplayCache is not supported"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public getValue()Ljava/lang/Object;
    .registers 3

    sget-object v0, LJ8/t;->a:LK8/D;

    invoke-static {}, LI8/P;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_d

    const/4 p0, 0x0

    :cond_d
    return-object p0
.end method

.method public h(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0, p1}, LI8/P;->setValue(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public bridge synthetic k()LJ8/d;
    .registers 1

    invoke-virtual {p0}, LI8/P;->q()LI8/S;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic m(I)[LJ8/d;
    .registers 2

    invoke-virtual {p0, p1}, LI8/P;->r(I)[LI8/S;

    move-result-object p0

    return-object p0
.end method

.method protected q()LI8/S;
    .registers 1

    new-instance p0, LI8/S;

    invoke-direct {p0}, LI8/S;-><init>()V

    return-object p0
.end method

.method protected r(I)[LI8/S;
    .registers 2

    new-array p0, p1, [LI8/S;

    return-object p0
.end method

.method public setValue(Ljava/lang/Object;)V
    .registers 3

    if-nez p1, :cond_4

    sget-object p1, LJ8/t;->a:LK8/D;

    :cond_4
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, LI8/P;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
