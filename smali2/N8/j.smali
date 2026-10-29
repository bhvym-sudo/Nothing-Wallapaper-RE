.class public LN8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/k;
.implements LN8/d;
.implements LN8/k;
.implements LF8/c1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN8/j$a;
    }
.end annotation


# static fields
.field private static final synthetic v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final q:Lm8/i;

.field private r:Ljava/util/List;

.field private s:Ljava/lang/Object;

.field private volatile synthetic state$volatile:Ljava/lang/Object;

.field private t:I

.field private u:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "state$volatile"

    const-class v2, LN8/j;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LN8/j;->v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm8/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN8/j;->q:Lm8/i;

    invoke-static {}, LN8/l;->g()LK8/D;

    move-result-object p1

    iput-object p1, p0, LN8/j;->state$volatile:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, LN8/j;->r:Ljava/util/List;

    const/4 p1, -0x1

    iput p1, p0, LN8/j;->t:I

    invoke-static {}, LN8/l;->d()LK8/D;

    move-result-object p1

    iput-object p1, p0, LN8/j;->u:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic g(LN8/j;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, LN8/j;->q(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LN8/j;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LN8/j;->u:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic j(LN8/j;Ljava/lang/Object;)V
    .registers 2

    invoke-direct {p0, p1}, LN8/j;->w(Ljava/lang/Object;)V

    return-void
.end method

.method private final k(Ljava/lang/Object;)V
    .registers 3

    iget-object p0, p0, LN8/j;->r:Ljava/util/List;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_15

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    return-void

    :cond_15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_45

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN8/j$a;

    iget-object v0, v0, LN8/j$a;->a:Ljava/lang/Object;

    if-eq v0, p1, :cond_2a

    goto :goto_19

    :cond_2a
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot use select clauses on the same object: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_45
    return-void
.end method

.method private final l(LN8/j$a;)V
    .registers 4

    iget-object v0, p0, LN8/j;->r:Ljava/util/List;

    if-nez v0, :cond_5

    return-void

    :cond_5
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN8/j$a;

    if-eq v1, p1, :cond_b

    invoke-virtual {v1}, LN8/j$a;->b()V

    goto :goto_b

    :cond_1d
    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-static {}, LN8/l;->f()LK8/D;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LN8/l;->d()LK8/D;

    move-result-object p1

    iput-object p1, p0, LN8/j;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, LN8/j;->r:Ljava/util/List;

    return-void
.end method

.method private final m(Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LN8/j$a;

    iget-object v1, p0, LN8/j;->u:Ljava/lang/Object;

    invoke-direct {p0, v0}, LN8/j;->l(LN8/j$a;)V

    invoke-virtual {v0, v1}, LN8/j$a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, LN8/j$a;->c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(LN8/j;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, LN8/j;->t()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0, p1}, LN8/j;->m(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-direct {p0, p1}, LN8/j;->q(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final q(Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p1, LN8/j$b;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LN8/j$b;

    iget v1, v0, LN8/j$b;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LN8/j$b;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LN8/j$b;

    invoke-direct {v0, p0, p1}, LN8/j$b;-><init>(LN8/j;Lm8/e;)V

    :goto_18
    iget-object p1, v0, LN8/j$b;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN8/j$b;->t:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3c

    if-eq v2, v4, :cond_34

    if-ne v2, v3, :cond_2c

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    iget-object p0, v0, LN8/j$b;->q:Ljava/lang/Object;

    check-cast p0, LN8/j;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4a

    :cond_3c
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LN8/j$b;->q:Ljava/lang/Object;

    iput v4, v0, LN8/j$b;->t:I

    invoke-direct {p0, v0}, LN8/j;->z(Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4a

    goto :goto_55

    :cond_4a
    :goto_4a
    const/4 p1, 0x0

    iput-object p1, v0, LN8/j$b;->q:Ljava/lang/Object;

    iput v3, v0, LN8/j$b;->t:I

    invoke-direct {p0, v0}, LN8/j;->m(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_56

    :goto_55
    return-object v1

    :cond_56
    return-object p0
.end method

.method private final r(Ljava/lang/Object;)LN8/j$a;
    .registers 5

    iget-object p0, p0, LN8/j;->r:Ljava/util/List;

    const/4 v0, 0x0

    if-nez p0, :cond_6

    return-object v0

    :cond_6
    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LN8/j$a;

    iget-object v2, v2, LN8/j$a;->a:Ljava/lang/Object;

    if-ne v2, p1, :cond_c

    move-object v0, v1

    :cond_1e
    check-cast v0, LN8/j$a;

    if-eqz v0, :cond_23

    return-object v0

    :cond_23
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Clause with object "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not found"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final synthetic s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LN8/j;->v:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final t()Z
    .registers 2

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, LN8/j$a;

    return p0
.end method

.method public static synthetic v(LN8/j;LN8/j$a;ZILjava/lang/Object;)V
    .registers 5

    if-nez p4, :cond_b

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_7

    const/4 p2, 0x0

    :cond_7
    invoke-virtual {p0, p1, p2}, LN8/j;->u(LN8/j$a;Z)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: register"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final w(Ljava/lang/Object;)V
    .registers 3

    invoke-direct {p0, p1}, LN8/j;->r(Ljava/lang/Object;)LN8/j$a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p1, LN8/j$a;->g:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p1, LN8/j$a;->h:I

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LN8/j;->u(LN8/j$a;Z)V

    return-void
.end method

.method private final y(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 8

    :cond_0
    :goto_0
    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LF8/l;

    const/4 v2, 0x2

    if-eqz v1, :cond_35

    invoke-direct {p0, p1}, LN8/j;->r(Ljava/lang/Object;)LN8/j$a;

    move-result-object v1

    if-nez v1, :cond_14

    goto :goto_0

    :cond_14
    invoke-virtual {v1, p0, p2}, LN8/j$a;->a(LN8/k;Ljava/lang/Object;)Lv8/q;

    move-result-object v3

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, LF8/l;

    iput-object p2, p0, LN8/j;->u:Ljava/lang/Object;

    invoke-static {v0, v3}, LN8/l;->h(LF8/l;Lv8/q;)Z

    move-result p1

    if-eqz p1, :cond_2e

    const/4 p0, 0x0

    return p0

    :cond_2e
    invoke-static {}, LN8/l;->d()LK8/D;

    move-result-object p1

    iput-object p1, p0, LN8/j;->u:Ljava/lang/Object;

    return v2

    :cond_35
    invoke-static {}, LN8/l;->f()LK8/D;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9a

    instance-of v1, v0, LN8/j$a;

    if-eqz v1, :cond_44

    goto :goto_9a

    :cond_44
    invoke-static {}, LN8/l;->e()LK8/D;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4f

    return v2

    :cond_4f
    invoke-static {}, LN8/l;->g()LK8/D;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_69

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {p1}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_69
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_7f

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3, p1}, Li8/s;->h0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_7f
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unexpected state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9a
    :goto_9a
    const/4 p0, 0x3

    return p0
.end method

.method private final z(Lm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LF8/n;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    invoke-static {}, LN8/j;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    :cond_11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LN8/l;->g()LK8/D;

    move-result-object v3

    if-ne v2, v3, :cond_29

    invoke-static {}, LN8/j;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-static {v0, p0}, LF8/p;->c(LF8/l;LF8/k;)V

    goto :goto_62

    :cond_29
    instance-of v3, v2, Ljava/util/List;

    if-eqz v3, :cond_4f

    invoke-static {}, LN8/j;->i()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {}, LN8/l;->g()LK8/D;

    move-result-object v4

    invoke-virtual {v3, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_41
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0, v3}, LN8/j;->j(LN8/j;Ljava/lang/Object;)V

    goto :goto_41

    :cond_4f
    instance-of v1, v2, LN8/j$a;

    if-eqz v1, :cond_79

    sget-object v1, Lh8/A;->a:Lh8/A;

    check-cast v2, LN8/j$a;

    invoke-static {p0}, LN8/j;->h(LN8/j;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p0, v3}, LN8/j$a;->a(LN8/k;Ljava/lang/Object;)Lv8/q;

    move-result-object p0

    invoke-interface {v0, v1, p0}, LF8/l;->m(Ljava/lang/Object;Lv8/q;)V

    :goto_62
    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_6f

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_6f
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_76

    return-object p0

    :cond_76
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_79
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unexpected state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(LN8/e;Lv8/l;)V
    .registers 11

    new-instance v0, LN8/j$a;

    invoke-interface {p1}, LN8/i;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, LN8/i;->a()Lv8/q;

    move-result-object v3

    invoke-interface {p1}, LN8/i;->d()Lv8/q;

    move-result-object v4

    invoke-static {}, LN8/l;->i()LK8/D;

    move-result-object v5

    invoke-interface {p1}, LN8/i;->c()Lv8/q;

    move-result-object v7

    move-object v1, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, LN8/j$a;-><init>(LN8/j;Ljava/lang/Object;Lv8/q;Lv8/q;Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {v1, v0, p2, p0, p1}, LN8/j;->v(LN8/j;LN8/j$a;ZILjava/lang/Object;)V

    return-void
.end method

.method public b(LK8/A;I)V
    .registers 3

    iput-object p1, p0, LN8/j;->s:Ljava/lang/Object;

    iput p2, p0, LN8/j;->t:I

    return-void
.end method

.method public c(LN8/g;Lv8/p;)V
    .registers 11

    new-instance v0, LN8/j$a;

    invoke-interface {p1}, LN8/i;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, LN8/i;->a()Lv8/q;

    move-result-object v3

    invoke-interface {p1}, LN8/i;->d()Lv8/q;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {p1}, LN8/i;->c()Lv8/q;

    move-result-object v7

    move-object v1, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, LN8/j$a;-><init>(LN8/j;Ljava/lang/Object;Lv8/q;Lv8/q;Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {v1, v0, p2, p0, p1}, LN8/j;->v(LN8/j;LN8/j$a;ZILjava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    invoke-direct {p0, p1, p2}, LN8/j;->y(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public e(Ljava/lang/Throwable;)V
    .registers 4

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    :cond_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LN8/l;->f()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_f

    goto :goto_1d

    :cond_f
    invoke-static {}, LN8/l;->e()LK8/D;

    move-result-object v1

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, LN8/j;->r:Ljava/util/List;

    if-nez p1, :cond_1e

    :goto_1d
    return-void

    :cond_1e
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_24
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN8/j$a;

    invoke-virtual {v0}, LN8/j$a;->b()V

    goto :goto_24

    :cond_34
    invoke-static {}, LN8/l;->d()LK8/D;

    move-result-object p1

    iput-object p1, p0, LN8/j;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, LN8/j;->r:Ljava/util/List;

    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, LN8/j;->u:Ljava/lang/Object;

    return-void
.end method

.method public getContext()Lm8/i;
    .registers 1

    iget-object p0, p0, LN8/j;->q:Lm8/i;

    return-object p0
.end method

.method public n(LF8/d0;)V
    .registers 2

    iput-object p1, p0, LN8/j;->s:Ljava/lang/Object;

    return-void
.end method

.method public o(Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, LN8/j;->p(LN8/j;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final u(LN8/j$a;Z)V
    .registers 4

    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LN8/j$a;

    if-eqz v0, :cond_d

    return-void

    :cond_d
    if-nez p2, :cond_14

    iget-object v0, p1, LN8/j$a;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, LN8/j;->k(Ljava/lang/Object;)V

    :cond_14
    invoke-virtual {p1, p0}, LN8/j$a;->e(LN8/j;)Z

    move-result v0

    if-eqz v0, :cond_35

    if-nez p2, :cond_26

    iget-object p2, p0, LN8/j;->r:Ljava/util/List;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_26
    iget-object p2, p0, LN8/j;->s:Ljava/lang/Object;

    iput-object p2, p1, LN8/j$a;->g:Ljava/lang/Object;

    iget p2, p0, LN8/j;->t:I

    iput p2, p1, LN8/j$a;->h:I

    const/4 p1, 0x0

    iput-object p1, p0, LN8/j;->s:Ljava/lang/Object;

    const/4 p1, -0x1

    iput p1, p0, LN8/j;->t:I

    return-void

    :cond_35
    invoke-static {}, LN8/j;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;)LN8/m;
    .registers 3

    invoke-direct {p0, p1, p2}, LN8/j;->y(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, LN8/l;->b(I)LN8/m;

    move-result-object p0

    return-object p0
.end method
