.class public abstract LF8/h0;
.super LF8/I;
.source "SourceFile"


# instance fields
.field private s:J

.field private t:Z

.field private u:Li8/l;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/I;-><init>()V

    return-void
.end method

.method public static synthetic m1(LF8/h0;ZILjava/lang/Object;)V
    .registers 4

    if-nez p3, :cond_b

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_7

    const/4 p1, 0x0

    :cond_7
    invoke-virtual {p0, p1}, LF8/h0;->l1(Z)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final n1(Z)J
    .registers 2

    if-eqz p1, :cond_8

    const-wide p0, 0x100000000L

    return-wide p0

    :cond_8
    const-wide/16 p0, 0x1

    return-wide p0
.end method

.method public static synthetic r1(LF8/h0;ZILjava/lang/Object;)V
    .registers 4

    if-nez p3, :cond_b

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_7

    const/4 p1, 0x0

    :cond_7
    invoke-virtual {p0, p1}, LF8/h0;->q1(Z)V

    return-void

    :cond_b
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final j1(ILjava/lang/String;)LF8/I;
    .registers 3

    invoke-static {p1}, LK8/l;->a(I)V

    invoke-static {p0, p2}, LK8/l;->b(LF8/I;Ljava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0
.end method

.method public final l1(Z)V
    .registers 6

    iget-wide v0, p0, LF8/h0;->s:J

    invoke-direct {p0, p1}, LF8/h0;->n1(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, LF8/h0;->s:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_10

    goto :goto_17

    :cond_10
    iget-boolean p1, p0, LF8/h0;->t:Z

    if-eqz p1, :cond_17

    invoke-virtual {p0}, LF8/h0;->shutdown()V

    :cond_17
    :goto_17
    return-void
.end method

.method public final o1(LF8/Z;)V
    .registers 3

    iget-object v0, p0, LF8/h0;->u:Li8/l;

    if-nez v0, :cond_b

    new-instance v0, Li8/l;

    invoke-direct {v0}, Li8/l;-><init>()V

    iput-object v0, p0, LF8/h0;->u:Li8/l;

    :cond_b
    invoke-virtual {v0, p1}, Li8/l;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method protected p1()J
    .registers 3

    iget-object p0, p0, LF8/h0;->u:Li8/l;

    const-wide v0, 0x7fffffffffffffffL

    if-nez p0, :cond_a

    return-wide v0

    :cond_a
    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_11

    return-wide v0

    :cond_11
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final q1(Z)V
    .registers 6

    iget-wide v0, p0, LF8/h0;->s:J

    invoke-direct {p0, p1}, LF8/h0;->n1(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, LF8/h0;->s:J

    if-nez p1, :cond_e

    const/4 p1, 0x1

    iput-boolean p1, p0, LF8/h0;->t:Z

    :cond_e
    return-void
.end method

.method public final s1()Z
    .registers 6

    iget-wide v0, p0, LF8/h0;->s:J

    const/4 v2, 0x1

    invoke-direct {p0, v2}, LF8/h0;->n1(Z)J

    move-result-wide v3

    cmp-long p0, v0, v3

    if-ltz p0, :cond_c

    return v2

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public abstract shutdown()V
.end method

.method public final t1()Z
    .registers 1

    iget-object p0, p0, LF8/h0;->u:Li8/l;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x1

    return p0
.end method

.method public abstract u1()J
.end method

.method public final v1()Z
    .registers 2

    iget-object p0, p0, LF8/h0;->u:Li8/l;

    const/4 v0, 0x0

    if-nez p0, :cond_6

    return v0

    :cond_6
    invoke-virtual {p0}, Li8/l;->t()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/Z;

    if-nez p0, :cond_f

    return v0

    :cond_f
    invoke-virtual {p0}, LF8/Z;->run()V

    const/4 p0, 0x1

    return p0
.end method

.method public w1()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method
