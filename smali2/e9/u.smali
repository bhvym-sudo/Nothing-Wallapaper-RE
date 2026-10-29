.class public final Le9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/f;


# instance fields
.field public final q:Le9/z;

.field public final r:Le9/e;

.field public s:Z


# direct methods
.method public constructor <init>(Le9/z;)V
    .registers 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/u;->q:Le9/z;

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    iput-object p1, p0, Le9/u;->r:Le9/e;

    return-void
.end method


# virtual methods
.method public F(I)Le9/f;
    .registers 3

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->m1(I)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public G0([B)Le9/f;
    .registers 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->j1([B)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public Z(Le9/e;J)V
    .registers 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_12

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1, p2, p3}, Le9/e;->Z(Le9/e;J)V

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    return-void

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public Z0(J)Le9/f;
    .registers 4

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1, p2}, Le9/e;->n1(J)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a()Le9/f;
    .registers 5

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_18

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->I()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_17

    iget-object v2, p0, Le9/u;->q:Le9/z;

    iget-object v3, p0, Le9/u;->r:Le9/e;

    invoke-interface {v2, v3, v0, v1}, Le9/z;->Z(Le9/e;J)V

    :cond_17
    return-object p0

    :cond_18
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public b1()Ljava/io/OutputStream;
    .registers 2

    new-instance v0, Le9/u$a;

    invoke-direct {v0, p0}, Le9/u$a;-><init>(Le9/u;)V

    return-object v0
.end method

.method public close()V
    .registers 5

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_30

    :try_start_4
    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1e

    iget-object v0, p0, Le9/u;->q:Le9/z;

    iget-object v1, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v1}, Le9/e;->X0()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Le9/z;->Z(Le9/e;J)V
    :try_end_1b
    .catchall {:try_start_4 .. :try_end_1b} :catchall_1c

    goto :goto_1e

    :catchall_1c
    move-exception v0

    goto :goto_1f

    :cond_1e
    :goto_1e
    const/4 v0, 0x0

    :goto_1f
    :try_start_1f
    iget-object v1, p0, Le9/u;->q:Le9/z;

    invoke-interface {v1}, Le9/z;->close()V
    :try_end_24
    .catchall {:try_start_1f .. :try_end_24} :catchall_25

    goto :goto_29

    :catchall_25
    move-exception v1

    if-nez v0, :cond_29

    move-object v0, v1

    :cond_29
    :goto_29
    const/4 v1, 0x1

    iput-boolean v1, p0, Le9/u;->s:Z

    if-nez v0, :cond_2f

    goto :goto_30

    :cond_2f
    throw v0

    :cond_30
    :goto_30
    return-void
.end method

.method public d()Le9/e;
    .registers 1

    iget-object p0, p0, Le9/u;->r:Le9/e;

    return-object p0
.end method

.method public d0(Ljava/lang/String;)Le9/f;
    .registers 3

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/u;->q:Le9/z;

    invoke-interface {p0}, Le9/z;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public flush()V
    .registers 5

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_21

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1b

    iget-object v0, p0, Le9/u;->q:Le9/z;

    iget-object v1, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v1}, Le9/e;->X0()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Le9/z;->Z(Le9/e;J)V

    :cond_1b
    iget-object p0, p0, Le9/u;->q:Le9/z;

    invoke-interface {p0}, Le9/z;->flush()V

    return-void

    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public isOpen()Z
    .registers 1

    iget-boolean p0, p0, Le9/u;->s:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public k0([BII)Le9/f;
    .registers 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1, p2, p3}, Le9/e;->k1([BII)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public o0(Ljava/lang/String;II)Le9/f;
    .registers 5

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1, p2, p3}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public r0(J)Le9/f;
    .registers 4

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1, p2}, Le9/e;->o1(J)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public s(I)Le9/f;
    .registers 3

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->q1(I)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public s0(Le9/h;)Le9/f;
    .registers 3

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->i1(Le9/h;)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le9/u;->q:Le9/z;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .registers 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    return p1

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public x(I)Le9/f;
    .registers 3

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Le9/u;->r:Le9/e;

    invoke-virtual {v0, p1}, Le9/e;->p1(I)Le9/e;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    move-result-object p0

    return-object p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
