.class public final LG8/f;
.super LG8/g;
.source "SourceFile"

# interfaces
.implements LF8/V;


# instance fields
.field private final s:Landroid/os/Handler;

.field private final t:Ljava/lang/String;

.field private final u:Z

.field private final v:LG8/f;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .registers 4

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0}, LG8/f;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Ljava/lang/String;ILkotlin/jvm/internal/h;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    .line 7
    :cond_5
    invoke-direct {p0, p1, p2}, LG8/f;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .registers 5

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LG8/g;-><init>(Lkotlin/jvm/internal/h;)V

    .line 2
    iput-object p1, p0, LG8/f;->s:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, LG8/f;->t:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, LG8/f;->u:Z

    if-eqz p3, :cond_e

    move-object p3, p0

    goto :goto_14

    .line 5
    :cond_e
    new-instance p3, LG8/f;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, LG8/f;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 6
    :goto_14
    iput-object p3, p0, LG8/f;->v:LG8/f;

    return-void
.end method

.method public static synthetic o1(LF8/l;LG8/f;)V
    .registers 2

    invoke-static {p0, p1}, LG8/f;->u1(LF8/l;LG8/f;)V

    return-void
.end method

.method public static synthetic p1(LG8/f;Ljava/lang/Runnable;)V
    .registers 2

    invoke-static {p0, p1}, LG8/f;->t1(LG8/f;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic q1(LG8/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LG8/f;->v1(LG8/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final r1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 6

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' was closed"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, LF8/A0;->d(Lm8/i;Ljava/util/concurrent/CancellationException;)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, LF8/I;->g1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final t1(LG8/f;Ljava/lang/Runnable;)V
    .registers 2

    iget-object p0, p0, LG8/f;->s:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final u1(LF8/l;LG8/f;)V
    .registers 3

    sget-object v0, Lh8/A;->a:Lh8/A;

    invoke-interface {p0, p1, v0}, LF8/l;->q(LF8/I;Ljava/lang/Object;)V

    return-void
.end method

.method private static final v1(LG8/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)Lh8/A;
    .registers 3

    iget-object p0, p0, LG8/f;->s:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public T0(JLF8/l;)V
    .registers 8

    new-instance v0, LG8/d;

    invoke-direct {v0, p3, p0}, LG8/d;-><init>(LF8/l;LG8/f;)V

    iget-object v1, p0, LG8/f;->s:Landroid/os/Handler;

    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v2, v3}, LB8/h;->j(JJ)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_1f

    new-instance p1, LG8/e;

    invoke-direct {p1, p0, v0}, LG8/e;-><init>(LG8/f;Ljava/lang/Runnable;)V

    invoke-interface {p3, p1}, LF8/l;->i(Lv8/l;)V

    return-void

    :cond_1f
    invoke-interface {p3}, Lm8/e;->getContext()Lm8/i;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LG8/f;->r1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 8

    iget-object v0, p0, LG8/f;->s:Landroid/os/Handler;

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v1, v2}, LB8/h;->j(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_17

    new-instance p1, LG8/c;

    invoke-direct {p1, p0, p3}, LG8/c;-><init>(LG8/f;Ljava/lang/Runnable;)V

    return-object p1

    :cond_17
    invoke-direct {p0, p4, p3}, LG8/f;->r1(Lm8/i;Ljava/lang/Runnable;)V

    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LG8/f;

    if-eqz v0, :cond_14

    check-cast p1, LG8/f;

    iget-object v0, p1, LG8/f;->s:Landroid/os/Handler;

    iget-object v1, p0, LG8/f;->s:Landroid/os/Handler;

    if-ne v0, v1, :cond_14

    iget-boolean p1, p1, LG8/f;->u:Z

    iget-boolean p0, p0, LG8/f;->u:Z

    if-ne p1, p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 4

    iget-object v0, p0, LG8/f;->s:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-direct {p0, p1, p2}, LG8/f;->r1(Lm8/i;Ljava/lang/Runnable;)V

    :cond_b
    return-void
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, LG8/f;->s:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget-boolean p0, p0, LG8/f;->u:Z

    if-eqz p0, :cond_d

    const/16 p0, 0x4cf

    goto :goto_f

    :cond_d
    const/16 p0, 0x4d5

    :goto_f
    xor-int/2addr p0, v0

    return p0
.end method

.method public i1(Lm8/i;)Z
    .registers 2

    iget-boolean p1, p0, LG8/f;->u:Z

    if-eqz p1, :cond_17

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object p0, p0, LG8/f;->s:Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto :goto_17

    :cond_15
    const/4 p0, 0x0

    return p0

    :cond_17
    :goto_17
    const/4 p0, 0x1

    return p0
.end method

.method public bridge synthetic l1()LF8/H0;
    .registers 1

    invoke-virtual {p0}, LG8/f;->s1()LG8/f;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic n1()LG8/g;
    .registers 1

    invoke-virtual {p0}, LG8/f;->s1()LG8/f;

    move-result-object p0

    return-object p0
.end method

.method public s1()LG8/f;
    .registers 1

    iget-object p0, p0, LG8/f;->v:LG8/f;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, LF8/H0;->m1()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_26

    iget-object v0, p0, LG8/f;->t:Ljava/lang/String;

    if-nez v0, :cond_10

    iget-object v0, p0, LG8/f;->s:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_10
    iget-boolean p0, p0, LG8/f;->u:Z

    if-eqz p0, :cond_26

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".immediate"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_26
    return-object v0
.end method
