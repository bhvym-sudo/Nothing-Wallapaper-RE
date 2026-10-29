.class public final Le9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/g;


# instance fields
.field public final q:Le9/B;

.field public final r:Le9/e;

.field public s:Z


# direct methods
.method public constructor <init>(Le9/B;)V
    .registers 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/v;->q:Le9/B;

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    iput-object p1, p0, Le9/v;->r:Le9/e;

    return-void
.end method


# virtual methods
.method public C0(J)[B
    .registers 3

    invoke-virtual {p0, p1, p2}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0, p1, p2}, Le9/e;->C0(J)[B

    move-result-object p0

    return-object p0
.end method

.method public D()Z
    .registers 5

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_20

    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->D()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, Le9/v;->q:Le9/B;

    iget-object p0, p0, Le9/v;->r:Le9/e;

    const-wide/16 v1, 0x2000

    invoke-interface {v0, p0, v1, v2}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p0, v0, v2

    if-nez p0, :cond_1e

    const/4 p0, 0x1

    return p0

    :cond_1e
    const/4 p0, 0x0

    return p0

    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public M0(Le9/r;)I
    .registers 7

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_39

    :cond_9
    iget-object v0, p0, Le9/v;->r:Le9/e;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lf9/a;->f(Le9/e;Le9/r;Z)I

    move-result v0

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-eq v0, v1, :cond_28

    if-eq v0, v2, :cond_27

    invoke-virtual {p1}, Le9/r;->n()[Le9/h;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Le9/h;->v()I

    move-result p1

    iget-object p0, p0, Le9/v;->r:Le9/e;

    int-to-long v1, p1

    invoke-virtual {p0, v1, v2}, Le9/e;->skip(J)V

    return v0

    :cond_27
    return v2

    :cond_28
    iget-object v0, p0, Le9/v;->q:Le9/B;

    iget-object v1, p0, Le9/v;->r:Le9/e;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v1, v3, v4}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_9

    return v2

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public O(J)Ljava/lang/String;
    .registers 16

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_a8

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_13

    move-wide v11, v0

    goto :goto_16

    :cond_13
    add-long v5, p1, v3

    move-wide v11, v5

    :goto_16
    const/16 v8, 0xa

    const-wide/16 v9, 0x0

    move-object v7, p0

    invoke-virtual/range {v7 .. v12}, Le9/v;->b(BJJ)J

    move-result-wide v5

    const-wide/16 v8, -0x1

    cmp-long p0, v5, v8

    if-eqz p0, :cond_2c

    iget-object p0, v7, Le9/v;->r:Le9/e;

    invoke-static {p0, v5, v6}, Lf9/a;->e(Le9/e;J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2c
    cmp-long p0, v11, v0

    if-gez p0, :cond_5b

    invoke-virtual {v7, v11, v12}, Le9/v;->u0(J)Z

    move-result p0

    if-eqz p0, :cond_5b

    iget-object p0, v7, Le9/v;->r:Le9/e;

    sub-long v0, v11, v3

    invoke-virtual {p0, v0, v1}, Le9/e;->U(J)B

    move-result p0

    const/16 v0, 0xd

    if-ne p0, v0, :cond_5b

    add-long v0, v11, v3

    invoke-virtual {v7, v0, v1}, Le9/v;->u0(J)Z

    move-result p0

    if-eqz p0, :cond_5b

    iget-object p0, v7, Le9/v;->r:Le9/e;

    invoke-virtual {p0, v11, v12}, Le9/e;->U(J)B

    move-result p0

    const/16 v0, 0xa

    if-ne p0, v0, :cond_5b

    iget-object p0, v7, Le9/v;->r:Le9/e;

    invoke-static {p0, v11, v12}, Lf9/a;->e(Le9/e;J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5b
    new-instance v1, Le9/e;

    invoke-direct {v1}, Le9/e;-><init>()V

    iget-object v0, v7, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v2

    const/16 p0, 0x20

    int-to-long v4, p0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Le9/e;->Q(Le9/e;JJ)Le9/e;

    new-instance p0, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: limit="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Le9/v;->r:Le9/e;

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Le9/e;->w0()Le9/h;

    move-result-object p1

    invoke-virtual {p1}, Le9/h;->n()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "limit < 0: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public R(Le9/h;)J
    .registers 4

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Le9/v;->f(Le9/h;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public S0()Le9/g;
    .registers 2

    new-instance v0, Le9/t;

    invoke-direct {v0, p0}, Le9/t;-><init>(Le9/g;)V

    invoke-static {v0}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p0

    return-object p0
.end method

.method public Y0(J)V
    .registers 3

    invoke-virtual {p0, p1, p2}, Le9/v;->u0(J)Z

    move-result p0

    if-eqz p0, :cond_7

    return-void

    :cond_7
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public a(B)J
    .registers 8

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Le9/v;->b(BJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public b(BJJ)J
    .registers 15

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_67

    const-wide/16 v0, 0x0

    cmp-long v0, v0, p2

    if-gtz v0, :cond_43

    cmp-long v0, p2, p4

    if-gtz v0, :cond_43

    move-wide v3, p2

    :goto_f
    cmp-long p2, v3, p4

    const-wide/16 v7, -0x1

    if-gez p2, :cond_42

    iget-object v1, p0, Le9/v;->r:Le9/e;

    move v2, p1

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Le9/e;->Y(BJJ)J

    move-result-wide p1

    cmp-long p3, p1, v7

    if-eqz p3, :cond_22

    return-wide p1

    :cond_22
    iget-object p1, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-gez p3, :cond_42

    iget-object p3, p0, Le9/v;->q:Le9/B;

    iget-object p4, p0, Le9/v;->r:Le9/e;

    const-wide/16 v0, 0x2000

    invoke-interface {p3, p4, v0, v1}, Le9/B;->e1(Le9/e;J)J

    move-result-wide p3

    cmp-long p3, p3, v7

    if-nez p3, :cond_3b

    goto :goto_42

    :cond_3b
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move p1, v2

    move-wide p4, v5

    goto :goto_f

    :cond_42
    :goto_42
    return-wide v7

    :cond_43
    move-wide v5, p4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "fromIndex="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " toIndex="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_67
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public close()V
    .registers 2

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_11

    const/4 v0, 0x1

    iput-boolean v0, p0, Le9/v;->s:Z

    iget-object v0, p0, Le9/v;->q:Le9/B;

    invoke-interface {v0}, Le9/B;->close()V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->j()V

    :cond_11
    return-void
.end method

.method public d()Le9/e;
    .registers 1

    iget-object p0, p0, Le9/v;->r:Le9/e;

    return-object p0
.end method

.method public d1()J
    .registers 6

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Le9/v;->Y0(J)V

    const/4 v0, 0x0

    :goto_6
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    invoke-virtual {p0, v2, v3}, Le9/v;->u0(J)Z

    move-result v2

    if-eqz v2, :cond_5a

    iget-object v2, p0, Le9/v;->r:Le9/e;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Le9/e;->U(J)B

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1e

    const/16 v3, 0x39

    if-le v2, v3, :cond_2f

    :cond_1e
    const/16 v3, 0x61

    if-lt v2, v3, :cond_26

    const/16 v3, 0x66

    if-le v2, v3, :cond_2f

    :cond_26
    const/16 v3, 0x41

    if-lt v2, v3, :cond_31

    const/16 v3, 0x46

    if-le v2, v3, :cond_2f

    goto :goto_31

    :cond_2f
    move v0, v1

    goto :goto_6

    :cond_31
    :goto_31
    if-eqz v0, :cond_34

    goto :goto_5a

    :cond_34
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-static {v1}, LE8/a;->a(I)I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5a
    :goto_5a
    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->d1()J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/v;->q:Le9/B;

    invoke-interface {p0}, Le9/B;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 9

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_46

    iget-boolean v3, p0, Le9/v;->s:Z

    if-nez v3, :cond_3e

    iget-object v3, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v3}, Le9/e;->X0()J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-nez v3, :cond_2d

    if-nez v2, :cond_1c

    return-wide v0

    :cond_1c
    iget-object v0, p0, Le9/v;->q:Le9/B;

    iget-object v1, p0, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2d

    return-wide v2

    :cond_2d
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0, p1, p2, p3}, Le9/e;->e1(Le9/e;J)J

    move-result-wide p0

    return-wide p0

    :cond_3e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_46
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "byteCount < 0: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Le9/h;J)J
    .registers 12

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_39

    :goto_9
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0, p1, p2, p3}, Le9/e;->b0(Le9/h;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_16

    return-wide v0

    :cond_16
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    iget-object v4, p0, Le9/v;->q:Le9/B;

    iget-object v5, p0, Le9/v;->r:Le9/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-nez v4, :cond_2b

    return-wide v2

    :cond_2b
    invoke-virtual {p1}, Le9/h;->v()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_9

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public f1()Ljava/io/InputStream;
    .registers 2

    new-instance v0, Le9/v$a;

    invoke-direct {v0, p0}, Le9/v$a;-><init>(Le9/v;)V

    return-object v0
.end method

.method public g(Le9/h;J)J
    .registers 12

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_30

    :goto_9
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0, p1, p2, p3}, Le9/e;->q0(Le9/h;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_16

    return-wide v0

    :cond_16
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    iget-object v4, p0, Le9/v;->q:Le9/B;

    iget-object v5, p0, Le9/v;->r:Le9/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-nez v4, :cond_2b

    return-wide v2

    :cond_2b
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_9

    :cond_30
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public g0(Le9/z;)J
    .registers 10

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :cond_8
    :goto_8
    iget-object v4, p0, Le9/v;->q:Le9/B;

    iget-object v5, p0, Le9/v;->r:Le9/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v4, v5, v6, v7}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_29

    iget-object v4, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v4}, Le9/e;->I()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-lez v6, :cond_8

    add-long/2addr v2, v4

    iget-object v6, p0, Le9/v;->r:Le9/e;

    invoke-interface {p1, v6, v4, v5}, Le9/z;->Z(Le9/e;J)V

    goto :goto_8

    :cond_29
    iget-object v4, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v4}, Le9/e;->X0()J

    move-result-wide v4

    cmp-long v0, v4, v0

    if-lez v0, :cond_43

    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    add-long/2addr v2, v0

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-interface {p1, p0, v0, v1}, Le9/z;->Z(Le9/e;J)V

    :cond_43
    return-wide v2
.end method

.method public h0(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .registers 4

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/v;->r:Le9/e;

    iget-object v1, p0, Le9/v;->q:Le9/B;

    invoke-virtual {v0, v1}, Le9/e;->l1(Le9/B;)J

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0, p1}, Le9/e;->h0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public isOpen()Z
    .registers 1

    iget-boolean p0, p0, Le9/v;->s:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public j()I
    .registers 3

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->B0()I

    move-result p0

    return p0
.end method

.method public l()Le9/e;
    .registers 1

    iget-object p0, p0, Le9/v;->r:Le9/e;

    return-object p0
.end method

.method public m0(Le9/h;)J
    .registers 4

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Le9/v;->g(Le9/h;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public n(J)Le9/h;
    .registers 3

    invoke-virtual {p0, p1, p2}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0, p1, p2}, Le9/e;->n(J)Le9/h;

    move-result-object p0

    return-object p0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .registers 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_23

    iget-object v0, p0, Le9/v;->q:Le9/B;

    iget-object v1, p0, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_23

    const/4 p0, -0x1

    return p0

    :cond_23
    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0, p1}, Le9/e;->read(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0
.end method

.method public readByte()B
    .registers 3

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result p0

    return p0
.end method

.method public readInt()I
    .registers 3

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->readInt()I

    move-result p0

    return p0
.end method

.method public readShort()S
    .registers 3

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->readShort()S

    move-result p0

    return p0
.end method

.method public skip(J)V
    .registers 7

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_3d

    :goto_4
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_3c

    iget-object v2, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_2b

    iget-object v0, p0, Le9/v;->q:Le9/B;

    iget-object v1, p0, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_25

    goto :goto_2b

    :cond_25
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :cond_2b
    :goto_2b
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-object v2, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v2, v0, v1}, Le9/e;->skip(J)V

    sub-long/2addr p1, v0

    goto :goto_4

    :cond_3c
    return-void

    :cond_3d
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

    iget-object p0, p0, Le9/v;->q:Le9/B;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public u()S
    .registers 3

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Le9/v;->Y0(J)V

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->I0()S

    move-result p0

    return p0
.end method

.method public u0(J)Z
    .registers 7

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_30

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_28

    :cond_a
    iget-object v0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gez v0, :cond_26

    iget-object v0, p0, Le9/v;->q:Le9/B;

    iget-object v1, p0, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_26
    const/4 p0, 0x1

    return p0

    :cond_28
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_30
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z0()Ljava/lang/String;
    .registers 3

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Le9/v;->O(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
