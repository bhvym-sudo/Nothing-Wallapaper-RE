.class public final LF8/a1;
.super LK8/z;
.source "SourceFile"


# instance fields
.field private volatile threadLocalIsSet:Z

.field private final u:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Lm8/i;Lm8/e;)V
    .registers 5

    sget-object v0, LF8/b1;->q:LF8/b1;

    invoke-interface {p1, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v1

    if-nez v1, :cond_d

    invoke-interface {p1, v0}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    goto :goto_e

    :cond_d
    move-object v0, p1

    :goto_e
    invoke-direct {p0, v0, p2}, LK8/z;-><init>(Lm8/i;Lm8/e;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LF8/a1;->u:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object p2

    sget-object v0, Lm8/f;->l:Lm8/f$b;

    invoke-interface {p2, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p2

    instance-of p2, p2, LF8/I;

    if-nez p2, :cond_31

    const/4 p2, 0x0

    invoke-static {p1, p2}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LF8/a1;->b1(Lm8/i;Ljava/lang/Object;)V

    :cond_31
    return-void
.end method

.method private final a1()V
    .registers 3

    iget-boolean v0, p0, LF8/a1;->threadLocalIsSet:Z

    if-eqz v0, :cond_20

    iget-object v0, p0, LF8/a1;->u:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm8/i;

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_1b
    iget-object p0, p0, LF8/a1;->u:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_20
    return-void
.end method


# virtual methods
.method protected S0(Ljava/lang/Object;)V
    .registers 7

    invoke-direct {p0}, LF8/a1;->a1()V

    iget-object v0, p0, LK8/z;->t:Lm8/e;

    invoke-static {p1, v0}, LF8/C;->a(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LK8/z;->t:Lm8/e;

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LK8/K;->a:LK8/D;

    if-eq v3, v4, :cond_1c

    invoke-static {v0, v1, v3}, LF8/G;->m(Lm8/e;Lm8/i;Ljava/lang/Object;)LF8/a1;

    move-result-object v2

    :cond_1c
    :try_start_1c
    iget-object p0, p0, LK8/z;->t:Lm8/e;

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_23
    .catchall {:try_start_1c .. :try_end_23} :catchall_31

    if-eqz v2, :cond_2d

    invoke-virtual {v2}, LF8/a1;->Z0()Z

    move-result p0

    if-eqz p0, :cond_2c

    goto :goto_2d

    :cond_2c
    return-void

    :cond_2d
    :goto_2d
    invoke-static {v1, v3}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    return-void

    :catchall_31
    move-exception p0

    if-eqz v2, :cond_3a

    invoke-virtual {v2}, LF8/a1;->Z0()Z

    move-result p1

    if-eqz p1, :cond_3d

    :cond_3a
    invoke-static {v1, v3}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_3d
    throw p0
.end method

.method public Y0()V
    .registers 1

    invoke-direct {p0}, LF8/a1;->a1()V

    return-void
.end method

.method public final Z0()Z
    .registers 3

    iget-boolean v0, p0, LF8/a1;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    iget-object v0, p0, LF8/a1;->u:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_f

    move v0, v1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    iget-object p0, p0, LF8/a1;->u:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/lit8 p0, v0, 0x1

    return p0
.end method

.method public final b1(Lm8/i;Ljava/lang/Object;)V
    .registers 4

    const/4 v0, 0x1

    iput-boolean v0, p0, LF8/a1;->threadLocalIsSet:Z

    iget-object p0, p0, LF8/a1;->u:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
