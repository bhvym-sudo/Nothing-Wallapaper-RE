.class public final LH8/l;
.super LK8/A;
.source "SourceFile"


# instance fields
.field private final u:LH8/e;

.field private final synthetic v:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public constructor <init>(JLH8/l;LH8/e;I)V
    .registers 6

    invoke-direct {p0, p1, p2, p3, p5}, LK8/A;-><init>(JLK8/A;I)V

    iput-object p4, p0, LH8/l;->u:LH8/e;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget p2, LH8/f;->b:I

    mul-int/lit8 p2, p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, LH8/l;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method private final E(ILjava/lang/Object;)V
    .registers 3

    invoke-direct {p0}, LH8/l;->z()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method

.method private final synthetic z()Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .registers 1

    iget-object p0, p0, LH8/l;->v:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-object p0
.end method


# virtual methods
.method public final A(I)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, LH8/l;->z()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final B(I)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0}, LH8/l;->z()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final C(IZ)V
    .registers 7

    if-eqz p2, :cond_11

    invoke-virtual {p0}, LH8/l;->y()LH8/e;

    move-result-object p2

    iget-wide v0, p0, LK8/A;->s:J

    sget v2, LH8/f;->b:I

    int-to-long v2, v2

    mul-long/2addr v0, v2

    int-to-long v2, p1

    add-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, LH8/e;->s1(J)V

    :cond_11
    invoke-virtual {p0}, LK8/A;->t()V

    return-void
.end method

.method public final D(I)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1}, LH8/l;->A(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1}, LH8/l;->w(I)V

    return-object v0
.end method

.method public final F(ILjava/lang/Object;)V
    .registers 3

    invoke-direct {p0}, LH8/l;->z()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method

.method public final G(ILjava/lang/Object;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LH8/l;->E(ILjava/lang/Object;)V

    return-void
.end method

.method public r()I
    .registers 1

    sget p0, LH8/f;->b:I

    return p0
.end method

.method public s(ILjava/lang/Throwable;Lm8/i;)V
    .registers 7

    sget p2, LH8/f;->b:I

    if-lt p1, p2, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    if-eqz v0, :cond_a

    sub-int/2addr p1, p2

    :cond_a
    invoke-virtual {p0, p1}, LH8/l;->A(I)Ljava/lang/Object;

    move-result-object p2

    :cond_e
    :goto_e
    invoke-virtual {p0, p1}, LH8/l;->B(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LF8/c1;

    if-nez v2, :cond_73

    instance-of v2, v1, LH8/x;

    if-eqz v2, :cond_1b

    goto :goto_73

    :cond_1b
    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v2

    if-eq v1, v2, :cond_62

    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_28

    goto :goto_62

    :cond_28
    invoke-static {}, LH8/f;->p()LK8/D;

    move-result-object v2

    if-eq v1, v2, :cond_e

    invoke-static {}, LH8/f;->q()LK8/D;

    move-result-object v2

    if-ne v1, v2, :cond_35

    goto :goto_e

    :cond_35
    invoke-static {}, LH8/f;->f()LK8/D;

    move-result-object p0

    if-eq v1, p0, :cond_99

    sget-object p0, LH8/f;->d:LK8/D;

    if-ne v1, p0, :cond_40

    goto :goto_99

    :cond_40
    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object p0

    if-ne v1, p0, :cond_47

    goto :goto_99

    :cond_47
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "unexpected state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_62
    :goto_62
    invoke-virtual {p0, p1}, LH8/l;->w(I)V

    if-eqz v0, :cond_99

    invoke-virtual {p0}, LH8/l;->y()LH8/e;

    move-result-object p0

    iget-object p0, p0, LH8/e;->r:Lv8/l;

    if-eqz p0, :cond_99

    invoke-static {p0, p2, p3}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    return-void

    :cond_73
    :goto_73
    if-eqz v0, :cond_7a

    invoke-static {}, LH8/f;->j()LK8/D;

    move-result-object v2

    goto :goto_7e

    :cond_7a
    invoke-static {}, LH8/f;->i()LK8/D;

    move-result-object v2

    :goto_7e
    invoke-virtual {p0, p1, v1, v2}, LH8/l;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p0, p1}, LH8/l;->w(I)V

    xor-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, p1, v1}, LH8/l;->C(IZ)V

    if-eqz v0, :cond_99

    invoke-virtual {p0}, LH8/l;->y()LH8/e;

    move-result-object p0

    iget-object p0, p0, LH8/e;->r:Lv8/l;

    if-eqz p0, :cond_99

    invoke-static {p0, p2, p3}, LK8/w;->a(Lv8/l;Ljava/lang/Object;Lm8/i;)V

    :cond_99
    :goto_99
    return-void
.end method

.method public final v(ILjava/lang/Object;Ljava/lang/Object;)Z
    .registers 4

    invoke-direct {p0}, LH8/l;->z()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final w(I)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LH8/l;->E(ILjava/lang/Object;)V

    return-void
.end method

.method public final x(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, LH8/l;->z()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final y()LH8/e;
    .registers 1

    iget-object p0, p0, LH8/l;->u:LH8/e;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method
