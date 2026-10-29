.class final LI8/S;
.super LJ8/d;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, LJ8/d;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic c(LI8/S;)Ljava/util/concurrent/atomic/AtomicReference;
    .registers 1

    iget-object p0, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .registers 2

    check-cast p1, LI8/P;

    invoke-virtual {p0, p1}, LI8/S;->d(LI8/P;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lm8/e;
    .registers 2

    check-cast p1, LI8/P;

    invoke-virtual {p0, p1}, LI8/S;->f(LI8/P;)[Lm8/e;

    move-result-object p0

    return-object p0
.end method

.method public d(LI8/P;)Z
    .registers 2

    iget-object p1, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, LK8/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    iget-object p0, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LI8/Q;->b()LK8/D;

    move-result-object p1

    invoke-static {p0, p1}, LK8/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final e(Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LF8/n;

    invoke-static {p1}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    invoke-static {p0}, LI8/S;->c(LI8/S;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p0

    invoke-static {}, LI8/Q;->b()LK8/D;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_26
    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_33

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_33
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3a

    return-object p0

    :cond_3a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public f(LI8/P;)[Lm8/e;
    .registers 2

    iget-object p0, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p1, 0x0

    invoke-static {p0, p1}, LK8/c;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    sget-object p0, LJ8/c;->a:[Lm8/e;

    return-object p0
.end method

.method public final g()V
    .registers 5

    iget-object v0, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_2
    invoke-static {v0}, LK8/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_22

    :cond_9
    invoke-static {}, LI8/Q;->c()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_10

    goto :goto_22

    :cond_10
    invoke-static {}, LI8/Q;->b()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_23

    iget-object v2, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LI8/Q;->c()LK8/D;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_22
    return-void

    :cond_23
    iget-object v2, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LI8/Q;->b()LK8/D;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    check-cast v1, LF8/n;

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v1, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()Z
    .registers 2

    iget-object p0, p0, LI8/S;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LI8/Q;->b()LK8/D;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {}, LI8/Q;->c()LK8/D;

    move-result-object v0

    if-ne p0, v0, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method
