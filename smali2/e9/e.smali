.class public final Le9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/g;
.implements Le9/f;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/e$a;
    }
.end annotation


# instance fields
.field public q:Le9/w;

.field private r:J


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic t1(Le9/e;Ljava/io/OutputStream;JILjava/lang/Object;)Le9/e;
    .registers 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_6

    iget-wide p2, p0, Le9/e;->r:J

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Le9/e;->s1(Ljava/io/OutputStream;J)Le9/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0([B)V
    .registers 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_6
    array-length v1, p1

    if-ge v0, v1, :cond_1a

    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Le9/e;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_14

    add-int/2addr v0, v1

    goto :goto_6

    :cond_14
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :cond_1a
    return-void
.end method

.method public B0()I
    .registers 1

    invoke-virtual {p0}, Le9/e;->readInt()I

    move-result p0

    invoke-static {p0}, Le9/b;->f(I)I

    move-result p0

    return p0
.end method

.method public C0(J)[B
    .registers 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_22

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_22

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_1c

    long-to-int p1, p1

    new-array p1, p1, [B

    invoke-virtual {p0, p1}, Le9/e;->A0([B)V

    return-object p1

    :cond_1c
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :cond_22
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount: "

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

.method public D()Z
    .registers 5

    iget-wide v0, p0, Le9/e;->r:J

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic F(I)Le9/f;
    .registers 2

    invoke-virtual {p0, p1}, Le9/e;->m1(I)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public G()Le9/e;
    .registers 1

    invoke-virtual {p0}, Le9/e;->K()Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic G0([B)Le9/f;
    .registers 2

    invoke-virtual {p0, p1}, Le9/e;->j1([B)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public final I()J
    .registers 6

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_b

    return-wide v2

    :cond_b
    iget-object p0, p0, Le9/e;->q:Le9/w;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p0, Le9/w;->g:Le9/w;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v2, p0, Le9/w;->c:I

    const/16 v3, 0x2000

    if-ge v2, v3, :cond_24

    iget-boolean v3, p0, Le9/w;->e:Z

    if-eqz v3, :cond_24

    iget p0, p0, Le9/w;->b:I

    sub-int/2addr v2, p0

    int-to-long v2, v2

    sub-long/2addr v0, v2

    :cond_24
    return-wide v0
.end method

.method public I0()S
    .registers 1

    invoke-virtual {p0}, Le9/e;->readShort()S

    move-result p0

    invoke-static {p0}, Le9/b;->g(S)S

    move-result p0

    return p0
.end method

.method public final K()Le9/e;
    .registers 7

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_10

    return-object v0

    :cond_10
    iget-object v1, p0, Le9/e;->q:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v1}, Le9/w;->d()Le9/w;

    move-result-object v2

    iput-object v2, v0, Le9/e;->q:Le9/w;

    iput-object v2, v2, Le9/w;->g:Le9/w;

    iput-object v2, v2, Le9/w;->f:Le9/w;

    iget-object v3, v1, Le9/w;->f:Le9/w;

    :goto_21
    if-eq v3, v1, :cond_35

    iget-object v4, v2, Le9/w;->g:Le9/w;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v3}, Le9/w;->d()Le9/w;

    move-result-object v5

    invoke-virtual {v4, v5}, Le9/w;->c(Le9/w;)Le9/w;

    iget-object v3, v3, Le9/w;->f:Le9/w;

    goto :goto_21

    :cond_35
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le9/e;->W0(J)V

    return-object v0
.end method

.method public M0(Le9/r;)I
    .registers 5

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lf9/a;->g(Le9/e;Le9/r;ZILjava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_10

    return v1

    :cond_10
    invoke-virtual {p1}, Le9/r;->n()[Le9/h;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Le9/h;->v()I

    move-result p1

    int-to-long v1, p1

    invoke-virtual {p0, v1, v2}, Le9/e;->skip(J)V

    return v0
.end method

.method public O(J)Ljava/lang/String;
    .registers 13

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_93

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v6, 0x1

    if-nez v2, :cond_13

    :goto_11
    move-wide v4, v0

    goto :goto_16

    :cond_13
    add-long v0, p1, v6

    goto :goto_11

    :goto_16
    const/16 v1, 0xa

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Le9/e;->Y(BJJ)J

    move-result-wide v1

    const-wide/16 v8, -0x1

    cmp-long v3, v1, v8

    if-eqz v3, :cond_2a

    invoke-static {p0, v1, v2}, Lf9/a;->e(Le9/e;J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2a
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v1

    cmp-long v1, v4, v1

    if-gez v1, :cond_49

    sub-long v1, v4, v6

    invoke-virtual {p0, v1, v2}, Le9/e;->U(J)B

    move-result v1

    const/16 v2, 0xd

    if-ne v1, v2, :cond_49

    invoke-virtual {p0, v4, v5}, Le9/e;->U(J)B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_49

    invoke-static {p0, v4, v5}, Lf9/a;->e(Le9/e;J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_49
    new-instance v1, Le9/e;

    invoke-direct {v1}, Le9/e;-><init>()V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v2

    const/16 v4, 0x20

    int-to-long v4, v4

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Le9/e;->Q(Le9/e;JJ)Le9/e;

    new-instance v0, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\\n not found: limit="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v3

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " content="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Le9/e;->w0()Le9/h;

    move-result-object v1

    invoke-virtual {v1}, Le9/h;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2026

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "limit < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public O0(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .registers 10

    const-string v0, "charset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_5d

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_5d

    iget-wide v1, p0, Le9/e;->r:J

    cmp-long v1, v1, p1

    if-ltz v1, :cond_57

    if-nez v0, :cond_1d

    const-string p0, ""

    return-object p0

    :cond_1d
    iget-object v0, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->b:I

    int-to-long v2, v1

    add-long/2addr v2, p1

    iget v4, v0, Le9/w;->c:I

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_37

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Le9/e;->C0(J)[B

    move-result-object p0

    invoke-direct {v0, p0, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_37
    new-instance v2, Ljava/lang/String;

    iget-object v3, v0, Le9/w;->a:[B

    long-to-int v4, p1

    invoke-direct {v2, v3, v1, v4, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget p3, v0, Le9/w;->b:I

    add-int/2addr p3, v4

    iput p3, v0, Le9/w;->b:I

    iget-wide v3, p0, Le9/e;->r:J

    sub-long/2addr v3, p1

    iput-wide v3, p0, Le9/e;->r:J

    iget p1, v0, Le9/w;->c:I

    if-ne p3, p1, :cond_56

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object p1

    iput-object p1, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    :cond_56
    return-object v2

    :cond_57
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :cond_5d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "byteCount: "

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public P0()Ljava/lang/String;
    .registers 4

    iget-wide v0, p0, Le9/e;->r:J

    sget-object v2, LE8/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1, v2}, Le9/e;->O0(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final Q(Le9/e;JJ)Le9/e;
    .registers 13

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    const-wide/16 p2, 0x0

    cmp-long p4, v5, p2

    if-nez p4, :cond_15

    goto :goto_71

    :cond_15
    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide p4

    add-long/2addr p4, v5

    invoke-virtual {p1, p4, p5}, Le9/e;->W0(J)V

    iget-object p4, p0, Le9/e;->q:Le9/w;

    :goto_1f
    invoke-static {p4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p5, p4, Le9/w;->c:I

    iget v0, p4, Le9/w;->b:I

    sub-int v1, p5, v0

    int-to-long v1, v1

    cmp-long v1, v3, v1

    if-ltz v1, :cond_33

    sub-int/2addr p5, v0

    int-to-long v0, p5

    sub-long/2addr v3, v0

    iget-object p4, p4, Le9/w;->f:Le9/w;

    goto :goto_1f

    :cond_33
    move-object v0, p4

    move-wide p4, v5

    :goto_35
    cmp-long v1, p4, p2

    if-lez v1, :cond_71

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le9/w;->d()Le9/w;

    move-result-object v1

    iget v2, v1, Le9/w;->b:I

    long-to-int v3, v3

    add-int/2addr v2, v3

    iput v2, v1, Le9/w;->b:I

    long-to-int v3, p4

    add-int/2addr v2, v3

    iget v3, v1, Le9/w;->c:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v1, Le9/w;->c:I

    iget-object v2, p1, Le9/e;->q:Le9/w;

    if-nez v2, :cond_5b

    iput-object v1, v1, Le9/w;->g:Le9/w;

    iput-object v1, v1, Le9/w;->f:Le9/w;

    iput-object v1, p1, Le9/e;->q:Le9/w;

    goto :goto_66

    :cond_5b
    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, v2, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Le9/w;->c(Le9/w;)Le9/w;

    :goto_66
    iget v2, v1, Le9/w;->c:I

    iget v1, v1, Le9/w;->b:I

    sub-int/2addr v2, v1

    int-to-long v1, v2

    sub-long/2addr p4, v1

    iget-object v0, v0, Le9/w;->f:Le9/w;

    move-wide v3, p2

    goto :goto_35

    :cond_71
    :goto_71
    return-object p0
.end method

.method public R(Le9/h;)J
    .registers 4

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Le9/e;->b0(Le9/h;J)J

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

.method public T0(J)Ljava/lang/String;
    .registers 4

    sget-object v0, LE8/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, p2, v0}, Le9/e;->O0(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final U(J)B
    .registers 9

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v4, 0x1

    move-wide v2, p1

    invoke-static/range {v0 .. v5}, Le9/b;->b(JJJ)V

    iget-object p1, p0, Le9/e;->q:Le9/w;

    if-eqz p1, :cond_5c

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    sub-long/2addr v0, v2

    cmp-long p2, v0, v2

    if-gez p2, :cond_3a

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    :goto_1b
    cmp-long p0, v0, v2

    if-lez p0, :cond_2c

    iget-object p1, p1, Le9/w;->g:Le9/w;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p0, p1, Le9/w;->c:I

    iget p2, p1, Le9/w;->b:I

    sub-int/2addr p0, p2

    int-to-long v4, p0

    sub-long/2addr v0, v4

    goto :goto_1b

    :cond_2c
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p1, Le9/w;->a:[B

    iget p1, p1, Le9/w;->b:I

    int-to-long p1, p1

    add-long/2addr p1, v2

    sub-long/2addr p1, v0

    long-to-int p1, p1

    aget-byte p0, p0, p1

    return p0

    :cond_3a
    const-wide/16 v0, 0x0

    :goto_3c
    iget p0, p1, Le9/w;->c:I

    iget p2, p1, Le9/w;->b:I

    sub-int/2addr p0, p2

    int-to-long v4, p0

    add-long/2addr v4, v0

    cmp-long p0, v4, v2

    if-gtz p0, :cond_4e

    iget-object p1, p1, Le9/w;->f:Le9/w;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide v0, v4

    goto :goto_3c

    :cond_4e
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p1, Le9/w;->a:[B

    iget p1, p1, Le9/w;->b:I

    int-to-long p1, p1

    add-long/2addr p1, v2

    sub-long/2addr p1, v0

    long-to-int p1, p1

    aget-byte p0, p0, p1

    return p0

    :cond_5c
    const/4 p0, 0x0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    throw p0
.end method

.method public U0()I
    .registers 13

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_b2

    invoke-virtual {p0, v2, v3}, Le9/e;->U(J)B

    move-result v0

    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x1

    const/16 v3, 0x80

    const v4, 0xfffd

    if-nez v1, :cond_1e

    and-int/lit8 v1, v0, 0x7f

    const/4 v5, 0x0

    move v6, v5

    move v5, v2

    goto :goto_40

    :cond_1e
    and-int/lit16 v1, v0, 0xe0

    const/16 v5, 0xc0

    if-ne v1, v5, :cond_29

    and-int/lit8 v1, v0, 0x1f

    const/4 v5, 0x2

    move v6, v3

    goto :goto_40

    :cond_29
    and-int/lit16 v1, v0, 0xf0

    const/16 v5, 0xe0

    if-ne v1, v5, :cond_35

    and-int/lit8 v1, v0, 0xf

    const/4 v5, 0x3

    const/16 v6, 0x800

    goto :goto_40

    :cond_35
    and-int/lit16 v1, v0, 0xf8

    const/16 v5, 0xf0

    if-ne v1, v5, :cond_ac

    and-int/lit8 v1, v0, 0x7

    const/4 v5, 0x4

    const/high16 v6, 0x10000

    :goto_40
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v7

    int-to-long v9, v5

    cmp-long v7, v7, v9

    if-ltz v7, :cond_78

    :goto_49
    if-ge v2, v5, :cond_60

    int-to-long v7, v2

    invoke-virtual {p0, v7, v8}, Le9/e;->U(J)B

    move-result v0

    and-int/lit16 v11, v0, 0xc0

    if-ne v11, v3, :cond_5c

    shl-int/lit8 v1, v1, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_49

    :cond_5c
    invoke-virtual {p0, v7, v8}, Le9/e;->skip(J)V

    return v4

    :cond_60
    invoke-virtual {p0, v9, v10}, Le9/e;->skip(J)V

    const p0, 0x10ffff

    if-le v1, p0, :cond_69

    return v4

    :cond_69
    const p0, 0xd800

    if-gt p0, v1, :cond_74

    const p0, 0xe000

    if-ge v1, p0, :cond_74

    return v4

    :cond_74
    if-ge v1, v6, :cond_77

    return v4

    :cond_77
    return v1

    :cond_78
    new-instance v1, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "size < "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " (to read code point prefixed 0x"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Le9/b;->h(B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_ac
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Le9/e;->skip(J)V

    return v4

    :cond_b2
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public final W0(J)V
    .registers 3

    iput-wide p1, p0, Le9/e;->r:J

    return-void
.end method

.method public final X0()J
    .registers 3

    iget-wide v0, p0, Le9/e;->r:J

    return-wide v0
.end method

.method public Y(BJJ)J
    .registers 15

    const-wide/16 v0, 0x0

    cmp-long v2, v0, p2

    if-gtz v2, :cond_bb

    cmp-long v2, p2, p4

    if-gtz v2, :cond_bb

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v2

    cmp-long v2, p4, v2

    if-lez v2, :cond_16

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide p4

    :cond_16
    cmp-long v2, p2, p4

    const-wide/16 v3, -0x1

    if-nez v2, :cond_1d

    return-wide v3

    :cond_1d
    iget-object v2, p0, Le9/e;->q:Le9/w;

    if-nez v2, :cond_22

    return-wide v3

    :cond_22
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v5

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    if-gez v5, :cond_77

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    :goto_2f
    cmp-long p0, v0, p2

    if-lez p0, :cond_40

    iget-object v2, v2, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p0, v2, Le9/w;->c:I

    iget v5, v2, Le9/w;->b:I

    sub-int/2addr p0, v5

    int-to-long v5, p0

    sub-long/2addr v0, v5

    goto :goto_2f

    :cond_40
    :goto_40
    cmp-long p0, v0, p4

    if-gez p0, :cond_76

    iget-object p0, v2, Le9/w;->a:[B

    iget v5, v2, Le9/w;->c:I

    int-to-long v5, v5

    iget v7, v2, Le9/w;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p4

    sub-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    iget v6, v2, Le9/w;->b:I

    int-to-long v6, v6

    add-long/2addr v6, p2

    sub-long/2addr v6, v0

    long-to-int p2, v6

    :goto_59
    if-ge p2, v5, :cond_68

    aget-byte p3, p0, p2

    if-ne p3, p1, :cond_65

    :goto_5f
    iget p0, v2, Le9/w;->b:I

    sub-int/2addr p2, p0

    int-to-long p0, p2

    add-long/2addr p0, v0

    return-wide p0

    :cond_65
    add-int/lit8 p2, p2, 0x1

    goto :goto_59

    :cond_68
    iget p0, v2, Le9/w;->c:I

    iget p2, v2, Le9/w;->b:I

    sub-int/2addr p0, p2

    int-to-long p2, p0

    add-long/2addr v0, p2

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_40

    :cond_76
    return-wide v3

    :cond_77
    :goto_77
    iget p0, v2, Le9/w;->c:I

    iget v5, v2, Le9/w;->b:I

    sub-int/2addr p0, v5

    int-to-long v5, p0

    add-long/2addr v5, v0

    cmp-long p0, v5, p2

    if-gtz p0, :cond_89

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide v0, v5

    goto :goto_77

    :cond_89
    :goto_89
    cmp-long p0, v0, p4

    if-gez p0, :cond_ba

    iget-object p0, v2, Le9/w;->a:[B

    iget v5, v2, Le9/w;->c:I

    int-to-long v5, v5

    iget v7, v2, Le9/w;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p4

    sub-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    iget v6, v2, Le9/w;->b:I

    int-to-long v6, v6

    add-long/2addr v6, p2

    sub-long/2addr v6, v0

    long-to-int p2, v6

    :goto_a2
    if-ge p2, v5, :cond_ac

    aget-byte p3, p0, p2

    if-ne p3, p1, :cond_a9

    goto :goto_5f

    :cond_a9
    add-int/lit8 p2, p2, 0x1

    goto :goto_a2

    :cond_ac
    iget p0, v2, Le9/w;->c:I

    iget p2, v2, Le9/w;->b:I

    sub-int/2addr p0, p2

    int-to-long p2, p0

    add-long/2addr v0, p2

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_89

    :cond_ba
    return-wide v3

    :cond_bb
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "size="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " fromIndex="

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " toIndex="

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Y0(J)V
    .registers 5

    iget-wide v0, p0, Le9/e;->r:J

    cmp-long p0, v0, p1

    if-ltz p0, :cond_7

    return-void

    :cond_7
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public Z(Le9/e;J)V
    .registers 11

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_b5

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    :goto_11
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_b4

    iget-object v0, p1, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v0, v0, Le9/w;->c:I

    iget-object v1, p1, Le9/e;->q:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v1, Le9/w;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-gez v0, :cond_76

    iget-object v0, p0, Le9/e;->q:Le9/w;

    if-eqz v0, :cond_35

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v0, v0, Le9/w;->g:Le9/w;

    goto :goto_36

    :cond_35
    const/4 v0, 0x0

    :goto_36
    if-eqz v0, :cond_6a

    iget-boolean v1, v0, Le9/w;->e:Z

    if-eqz v1, :cond_6a

    iget v1, v0, Le9/w;->c:I

    int-to-long v1, v1

    add-long/2addr v1, p2

    iget-boolean v3, v0, Le9/w;->d:Z

    if-eqz v3, :cond_46

    const/4 v3, 0x0

    goto :goto_48

    :cond_46
    iget v3, v0, Le9/w;->b:I

    :goto_48
    int-to-long v3, v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2000

    cmp-long v1, v1, v3

    if-gtz v1, :cond_6a

    iget-object v1, p1, Le9/e;->q:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    long-to-int v2, p2

    invoke-virtual {v1, v0, v2}, Le9/w;->f(Le9/w;I)V

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v0

    sub-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Le9/e;->W0(J)V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-void

    :cond_6a
    iget-object v0, p1, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    long-to-int v1, p2

    invoke-virtual {v0, v1}, Le9/w;->e(I)Le9/w;

    move-result-object v0

    iput-object v0, p1, Le9/e;->q:Le9/w;

    :cond_76
    iget-object v0, p1, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->c:I

    iget v2, v0, Le9/w;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v3

    iput-object v3, p1, Le9/e;->q:Le9/w;

    iget-object v3, p0, Le9/e;->q:Le9/w;

    if-nez v3, :cond_92

    iput-object v0, p0, Le9/e;->q:Le9/w;

    iput-object v0, v0, Le9/w;->g:Le9/w;

    iput-object v0, v0, Le9/w;->f:Le9/w;

    goto :goto_a1

    :cond_92
    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, v3, Le9/w;->g:Le9/w;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Le9/w;->c(Le9/w;)Le9/w;

    move-result-object v0

    invoke-virtual {v0}, Le9/w;->a()V

    :goto_a1
    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, Le9/e;->W0(J)V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v3

    add-long/2addr v3, v1

    invoke-virtual {p0, v3, v4}, Le9/e;->W0(J)V

    sub-long/2addr p2, v1

    goto/16 :goto_11

    :cond_b4
    return-void

    :cond_b5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "source == this"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public bridge synthetic Z0(J)Le9/f;
    .registers 3

    invoke-virtual {p0, p1, p2}, Le9/e;->n1(J)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public b0(Le9/h;J)J
    .registers 24

    move-wide/from16 v0, p2

    const-string v2, "bytes"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Le9/h;->v()I

    move-result v2

    if-lez v2, :cond_117

    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-ltz v2, :cond_fc

    move-object/from16 v2, p0

    iget-object v6, v2, Le9/e;->q:Le9/w;

    const-wide/16 v7, -0x1

    if-nez v6, :cond_1e

    return-wide v7

    :cond_1e
    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v9

    sub-long/2addr v9, v0

    cmp-long v9, v9, v0

    const-wide/16 v10, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-gez v9, :cond_92

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v4

    :goto_2f
    cmp-long v9, v4, v0

    if-lez v9, :cond_40

    iget-object v6, v6, Le9/w;->g:Le9/w;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v9, v6, Le9/w;->c:I

    iget v14, v6, Le9/w;->b:I

    sub-int/2addr v9, v14

    int-to-long v14, v9

    sub-long/2addr v4, v14

    goto :goto_2f

    :cond_40
    invoke-virtual {v3}, Le9/h;->o()[B

    move-result-object v9

    aget-byte v12, v9, v12

    invoke-virtual {v3}, Le9/h;->v()I

    move-result v3

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v14

    move-wide/from16 v16, v7

    int-to-long v7, v3

    sub-long/2addr v14, v7

    add-long/2addr v14, v10

    :goto_53
    cmp-long v2, v4, v14

    if-gez v2, :cond_91

    iget-object v2, v6, Le9/w;->a:[B

    iget v7, v6, Le9/w;->c:I

    iget v8, v6, Le9/w;->b:I

    int-to-long v10, v8

    add-long/2addr v10, v14

    sub-long/2addr v10, v4

    int-to-long v7, v7

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v7, v7

    iget v8, v6, Le9/w;->b:I

    int-to-long v10, v8

    add-long/2addr v10, v0

    sub-long/2addr v10, v4

    long-to-int v0, v10

    :goto_6c
    if-ge v0, v7, :cond_83

    aget-byte v1, v2, v0

    if-ne v1, v12, :cond_80

    add-int/lit8 v1, v0, 0x1

    invoke-static {v6, v1, v9, v13, v3}, Lf9/a;->d(Le9/w;I[BII)Z

    move-result v1

    if-eqz v1, :cond_80

    :goto_7a
    iget v1, v6, Le9/w;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v0, v4

    return-wide v0

    :cond_80
    add-int/lit8 v0, v0, 0x1

    goto :goto_6c

    :cond_83
    iget v0, v6, Le9/w;->c:I

    iget v1, v6, Le9/w;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v4, v0

    iget-object v6, v6, Le9/w;->f:Le9/w;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide v0, v4

    goto :goto_53

    :cond_91
    return-wide v16

    :cond_92
    move-wide/from16 v16, v7

    :goto_94
    iget v7, v6, Le9/w;->c:I

    iget v8, v6, Le9/w;->b:I

    sub-int/2addr v7, v8

    int-to-long v7, v7

    add-long/2addr v7, v4

    cmp-long v9, v7, v0

    if-gtz v9, :cond_a6

    iget-object v6, v6, Le9/w;->f:Le9/w;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide v4, v7

    goto :goto_94

    :cond_a6
    invoke-virtual {v3}, Le9/h;->o()[B

    move-result-object v7

    aget-byte v8, v7, v12

    invoke-virtual {v3}, Le9/h;->v()I

    move-result v3

    invoke-virtual {v2}, Le9/e;->X0()J

    move-result-wide v14

    move-wide/from16 v18, v10

    int-to-long v10, v3

    sub-long/2addr v14, v10

    add-long v14, v14, v18

    :goto_ba
    cmp-long v2, v4, v14

    if-gez v2, :cond_fb

    iget-object v2, v6, Le9/w;->a:[B

    iget v9, v6, Le9/w;->c:I

    iget v10, v6, Le9/w;->b:I

    int-to-long v10, v10

    add-long/2addr v10, v14

    sub-long/2addr v10, v4

    move-wide/from16 p0, v14

    int-to-long v13, v9

    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    long-to-int v9, v9

    iget v10, v6, Le9/w;->b:I

    int-to-long v10, v10

    add-long/2addr v10, v0

    sub-long/2addr v10, v4

    long-to-int v0, v10

    :goto_d5
    if-ge v0, v9, :cond_e9

    aget-byte v1, v2, v0

    if-ne v1, v8, :cond_e5

    add-int/lit8 v1, v0, 0x1

    const/4 v12, 0x1

    invoke-static {v6, v1, v7, v12, v3}, Lf9/a;->d(Le9/w;I[BII)Z

    move-result v1

    if-eqz v1, :cond_e6

    goto :goto_7a

    :cond_e5
    const/4 v12, 0x1

    :cond_e6
    add-int/lit8 v0, v0, 0x1

    goto :goto_d5

    :cond_e9
    const/4 v12, 0x1

    iget v0, v6, Le9/w;->c:I

    iget v1, v6, Le9/w;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v4, v0

    iget-object v6, v6, Le9/w;->f:Le9/w;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide/from16 v14, p0

    move-wide v0, v4

    move v13, v12

    goto :goto_ba

    :cond_fb
    return-wide v16

    :cond_fc
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fromIndex < 0: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_117
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bytes is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b1()Ljava/io/OutputStream;
    .registers 2

    new-instance v0, Le9/e$c;

    invoke-direct {v0, p0}, Le9/e$c;-><init>(Le9/e;)V

    return-object v0
.end method

.method public final c1()Le9/h;
    .registers 5

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_15

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Le9/e;->g1(I)Le9/h;

    move-result-object p0

    return-object p0

    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "size > Int.MAX_VALUE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Le9/e;->G()Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public close()V
    .registers 1

    return-void
.end method

.method public d()Le9/e;
    .registers 1

    return-object p0
.end method

.method public bridge synthetic d0(Ljava/lang/String;)Le9/f;
    .registers 2

    invoke-virtual {p0, p1}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public d1()J
    .registers 15

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_b1

    const/4 v0, 0x0

    move v1, v0

    move-wide v4, v2

    :cond_d
    iget-object v6, p0, Le9/e;->q:Le9/w;

    invoke-static {v6}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v7, v6, Le9/w;->a:[B

    iget v8, v6, Le9/w;->b:I

    iget v9, v6, Le9/w;->c:I

    :goto_18
    if-ge v8, v9, :cond_93

    aget-byte v10, v7, v8

    const/16 v11, 0x30

    if-lt v10, v11, :cond_27

    const/16 v11, 0x39

    if-gt v10, v11, :cond_27

    add-int/lit8 v11, v10, -0x30

    goto :goto_3c

    :cond_27
    const/16 v11, 0x61

    if-lt v10, v11, :cond_32

    const/16 v11, 0x66

    if-gt v10, v11, :cond_32

    add-int/lit8 v11, v10, -0x57

    goto :goto_3c

    :cond_32
    const/16 v11, 0x41

    if-lt v10, v11, :cond_74

    const/16 v11, 0x46

    if-gt v10, v11, :cond_74

    add-int/lit8 v11, v10, -0x37

    :goto_3c
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v12, v4

    cmp-long v12, v12, v2

    if-nez v12, :cond_4c

    const/4 v10, 0x4

    shl-long/2addr v4, v10

    int-to-long v10, v11

    or-long/2addr v4, v10

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    :cond_4c
    new-instance p0, Le9/e;

    invoke-direct {p0}, Le9/e;-><init>()V

    invoke-virtual {p0, v4, v5}, Le9/e;->o1(J)Le9/e;

    move-result-object p0

    invoke-virtual {p0, v10}, Le9/e;->m1(I)Le9/e;

    move-result-object p0

    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number too large: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/e;->P0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_74
    if-eqz v0, :cond_78

    const/4 v1, 0x1

    goto :goto_93

    :cond_78
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Le9/b;->h(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_93
    :goto_93
    if-ne v8, v9, :cond_9f

    invoke-virtual {v6}, Le9/w;->b()Le9/w;

    move-result-object v7

    iput-object v7, p0, Le9/e;->q:Le9/w;

    invoke-static {v6}, Le9/x;->b(Le9/w;)V

    goto :goto_a1

    :cond_9f
    iput v8, v6, Le9/w;->b:I

    :goto_a1
    if-nez v1, :cond_a7

    iget-object v6, p0, Le9/e;->q:Le9/w;

    if-nez v6, :cond_d

    :cond_a7
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v1

    int-to-long v6, v0

    sub-long/2addr v1, v6

    invoke-virtual {p0, v1, v2}, Le9/e;->W0(J)V

    return-wide v4

    :cond_b1
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public e()Le9/C;
    .registers 1

    sget-object p0, Le9/C;->e:Le9/C;

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_26

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_16

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_16
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_22

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide p2

    :cond_22
    invoke-virtual {p1, p0, p2, p3}, Le9/e;->Z(Le9/e;J)V

    return-wide p2

    :cond_26
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

.method public equals(Ljava/lang/Object;)Z
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_8

    return v2

    :cond_8
    instance-of v3, v1, Le9/e;

    const/4 v4, 0x0

    if-nez v3, :cond_e

    return v4

    :cond_e
    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v5

    check-cast v1, Le9/e;

    invoke-virtual {v1}, Le9/e;->X0()J

    move-result-wide v7

    cmp-long v3, v5, v7

    if-eqz v3, :cond_1d

    return v4

    :cond_1d
    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-nez v3, :cond_28

    return v2

    :cond_28
    iget-object v3, v0, Le9/e;->q:Le9/w;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, v1, Le9/e;->q:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v5, v3, Le9/w;->b:I

    iget v6, v1, Le9/w;->b:I

    move-wide v9, v7

    :goto_37
    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v11

    cmp-long v11, v9, v11

    if-gez v11, :cond_7e

    iget v11, v3, Le9/w;->c:I

    sub-int/2addr v11, v5

    iget v12, v1, Le9/w;->c:I

    sub-int/2addr v12, v6

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    int-to-long v11, v11

    move-wide v13, v7

    :goto_4b
    cmp-long v15, v13, v11

    if-gez v15, :cond_66

    iget-object v15, v3, Le9/w;->a:[B

    add-int/lit8 v16, v5, 0x1

    aget-byte v5, v15, v5

    iget-object v15, v1, Le9/w;->a:[B

    add-int/lit8 v17, v6, 0x1

    aget-byte v6, v15, v6

    if-eq v5, v6, :cond_5e

    return v4

    :cond_5e
    const-wide/16 v5, 0x1

    add-long/2addr v13, v5

    move/from16 v5, v16

    move/from16 v6, v17

    goto :goto_4b

    :cond_66
    iget v13, v3, Le9/w;->c:I

    if-ne v5, v13, :cond_71

    iget-object v3, v3, Le9/w;->f:Le9/w;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v5, v3, Le9/w;->b:I

    :cond_71
    iget v13, v1, Le9/w;->c:I

    if-ne v6, v13, :cond_7c

    iget-object v1, v1, Le9/w;->f:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v6, v1, Le9/w;->b:I

    :cond_7c
    add-long/2addr v9, v11

    goto :goto_37

    :cond_7e
    return v2
.end method

.method public f1()Ljava/io/InputStream;
    .registers 2

    new-instance v0, Le9/e$b;

    invoke-direct {v0, p0}, Le9/e$b;-><init>(Le9/e;)V

    return-object v0
.end method

.method public flush()V
    .registers 1

    return-void
.end method

.method public g0(Le9/z;)J
    .registers 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_12

    invoke-interface {p1, p0, v0, v1}, Le9/z;->Z(Le9/e;J)V

    :cond_12
    return-wide v0
.end method

.method public final g1(I)Le9/h;
    .registers 9

    if-nez p1, :cond_5

    sget-object p0, Le9/h;->u:Le9/h;

    return-object p0

    :cond_5
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    int-to-long v4, p1

    invoke-static/range {v0 .. v5}, Le9/b;->b(JJJ)V

    iget-object v0, p0, Le9/e;->q:Le9/w;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_14
    if-ge v2, p1, :cond_2e

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v4, v0, Le9/w;->c:I

    iget v5, v0, Le9/w;->b:I

    if-eq v4, v5, :cond_26

    sub-int/2addr v4, v5

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    iget-object v0, v0, Le9/w;->f:Le9/w;

    goto :goto_14

    :cond_26
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "s.limit == s.pos"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_2e
    new-array v0, v3, [[B

    mul-int/lit8 v2, v3, 0x2

    new-array v2, v2, [I

    iget-object p0, p0, Le9/e;->q:Le9/w;

    move v4, v1

    :goto_37
    if-ge v1, p1, :cond_59

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v5, p0, Le9/w;->a:[B

    aput-object v5, v0, v4

    iget v5, p0, Le9/w;->c:I

    iget v6, p0, Le9/w;->b:I

    sub-int/2addr v5, v6

    add-int/2addr v1, v5

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v5

    aput v5, v2, v4

    add-int v5, v4, v3

    iget v6, p0, Le9/w;->b:I

    aput v6, v2, v5

    const/4 v5, 0x1

    iput-boolean v5, p0, Le9/w;->d:Z

    add-int/2addr v4, v5

    iget-object p0, p0, Le9/w;->f:Le9/w;

    goto :goto_37

    :cond_59
    new-instance p0, Le9/y;

    invoke-direct {p0, v0, v2}, Le9/y;-><init>([[B[I)V

    return-object p0
.end method

.method public h0(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .registers 4

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Le9/e;->r:J

    invoke-virtual {p0, v0, v1, p1}, Le9/e;->O0(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final h1(I)Le9/w;
    .registers 4

    const/4 v0, 0x1

    if-lt p1, v0, :cond_32

    const/16 v0, 0x2000

    if-gt p1, v0, :cond_32

    iget-object v1, p0, Le9/e;->q:Le9/w;

    if-nez v1, :cond_16

    invoke-static {}, Le9/x;->c()Le9/w;

    move-result-object p1

    iput-object p1, p0, Le9/e;->q:Le9/w;

    iput-object p1, p1, Le9/w;->g:Le9/w;

    iput-object p1, p1, Le9/w;->f:Le9/w;

    return-object p1

    :cond_16
    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, v1, Le9/w;->g:Le9/w;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, p0, Le9/w;->c:I

    add-int/2addr v1, p1

    if-gt v1, v0, :cond_29

    iget-boolean p1, p0, Le9/w;->e:Z

    if-nez p1, :cond_28

    goto :goto_29

    :cond_28
    return-object p0

    :cond_29
    :goto_29
    invoke-static {}, Le9/x;->c()Le9/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Le9/w;->c(Le9/w;)Le9/w;

    move-result-object p0

    return-object p0

    :cond_32
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "unexpected capacity"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public hashCode()I
    .registers 6

    iget-object v0, p0, Le9/e;->q:Le9/w;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    const/4 v1, 0x1

    :cond_7
    iget v2, v0, Le9/w;->b:I

    iget v3, v0, Le9/w;->c:I

    :goto_b
    if-ge v2, v3, :cond_17

    mul-int/lit8 v1, v1, 0x1f

    iget-object v4, v0, Le9/w;->a:[B

    aget-byte v4, v4, v2

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_17
    iget-object v0, v0, Le9/w;->f:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, p0, Le9/e;->q:Le9/w;

    if-ne v0, v2, :cond_7

    return v1
.end method

.method public i1(Le9/h;)Le9/e;
    .registers 4

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le9/h;->v()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Le9/h;->z(Le9/e;II)V

    return-object p0
.end method

.method public isOpen()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final j()V
    .registers 3

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Le9/e;->skip(J)V

    return-void
.end method

.method public j1([B)Le9/e;
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Le9/e;->k1([BII)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic k0([BII)Le9/f;
    .registers 4

    invoke-virtual {p0, p1, p2, p3}, Le9/e;->k1([BII)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public k1([BII)Le9/e;
    .registers 11

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    add-int/2addr p3, p2

    :goto_d
    if-ge p2, p3, :cond_2e

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Le9/e;->h1(I)Le9/w;

    move-result-object v0

    sub-int v1, p3, p2

    iget v2, v0, Le9/w;->c:I

    rsub-int v2, v2, 0x2000

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Le9/w;->a:[B

    iget v3, v0, Le9/w;->c:I

    add-int v4, p2, v1

    invoke-static {p1, v2, v3, p2, v4}, Li8/m;->d([B[BIII)[B

    iget p2, v0, Le9/w;->c:I

    add-int/2addr p2, v1

    iput p2, v0, Le9/w;->c:I

    move p2, v4

    goto :goto_d

    :cond_2e
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide p1

    add-long/2addr p1, v5

    invoke-virtual {p0, p1, p2}, Le9/e;->W0(J)V

    return-object p0
.end method

.method public l()Le9/e;
    .registers 1

    return-object p0
.end method

.method public l1(Le9/B;)J
    .registers 8

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_7
    const-wide/16 v2, 0x2000

    invoke-interface {p1, p0, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_15

    add-long/2addr v0, v2

    goto :goto_7

    :cond_15
    return-wide v0
.end method

.method public m0(Le9/h;)J
    .registers 4

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Le9/e;->q0(Le9/h;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public m1(I)Le9/e;
    .registers 6

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Le9/e;->h1(I)Le9/w;

    move-result-object v0

    iget-object v1, v0, Le9/w;->a:[B

    iget v2, v0, Le9/w;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Le9/w;->c:I

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-object p0
.end method

.method public n(J)Le9/h;
    .registers 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_34

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_34

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_2e

    const-wide/16 v0, 0x1000

    cmp-long v0, p1, v0

    if-ltz v0, :cond_24

    long-to-int v0, p1

    invoke-virtual {p0, v0}, Le9/e;->g1(I)Le9/h;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Le9/e;->skip(J)V

    return-object v0

    :cond_24
    new-instance v0, Le9/h;

    invoke-virtual {p0, p1, p2}, Le9/e;->C0(J)[B

    move-result-object p0

    invoke-direct {v0, p0}, Le9/h;-><init>([B)V

    return-object v0

    :cond_2e
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :cond_34
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount: "

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

.method public n1(J)Le9/e;
    .registers 14

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_d

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Le9/e;->m1(I)Le9/e;

    move-result-object p0

    return-object p0

    :cond_d
    if-gez v2, :cond_1d

    neg-long p1, p1

    cmp-long v2, p1, v0

    if-gez v2, :cond_1b

    const-string p1, "-9223372036854775808"

    invoke-virtual {p0, p1}, Le9/e;->u1(Ljava/lang/String;)Le9/e;

    move-result-object p0

    return-object p0

    :cond_1b
    const/4 v2, 0x1

    goto :goto_1e

    :cond_1d
    const/4 v2, 0x0

    :goto_1e
    invoke-static {p1, p2}, Lf9/a;->a(J)I

    move-result v3

    if-eqz v2, :cond_26

    add-int/lit8 v3, v3, 0x1

    :cond_26
    invoke-virtual {p0, v3}, Le9/e;->h1(I)Le9/w;

    move-result-object v4

    iget-object v5, v4, Le9/w;->a:[B

    iget v6, v4, Le9/w;->c:I

    add-int/2addr v6, v3

    :goto_2f
    cmp-long v7, p1, v0

    if-eqz v7, :cond_45

    const/16 v7, 0xa

    int-to-long v7, v7

    rem-long v9, p1, v7

    long-to-int v9, v9

    add-int/lit8 v6, v6, -0x1

    invoke-static {}, Lf9/a;->c()[B

    move-result-object v10

    aget-byte v9, v10, v9

    aput-byte v9, v5, v6

    div-long/2addr p1, v7

    goto :goto_2f

    :cond_45
    if-eqz v2, :cond_4d

    add-int/lit8 v6, v6, -0x1

    const/16 p1, 0x2d

    aput-byte p1, v5, v6

    :cond_4d
    iget p1, v4, Le9/w;->c:I

    add-int/2addr p1, v3

    iput p1, v4, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide p1

    int-to-long v0, v3

    add-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Le9/e;->W0(J)V

    return-object p0
.end method

.method public bridge synthetic o0(Ljava/lang/String;II)Le9/f;
    .registers 4

    invoke-virtual {p0, p1, p2, p3}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public o1(J)Le9/e;
    .registers 15

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_d

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Le9/e;->m1(I)Le9/e;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 v0, 0x1

    ushr-long v1, p1, v0

    or-long/2addr v1, p1

    const/4 v3, 0x2

    ushr-long v4, v1, v3

    or-long/2addr v1, v4

    const/4 v4, 0x4

    ushr-long v5, v1, v4

    or-long/2addr v1, v5

    const/16 v5, 0x8

    ushr-long v6, v1, v5

    or-long/2addr v1, v6

    const/16 v6, 0x10

    ushr-long v7, v1, v6

    or-long/2addr v1, v7

    const/16 v7, 0x20

    ushr-long v8, v1, v7

    or-long/2addr v1, v8

    ushr-long v8, v1, v0

    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    and-long/2addr v8, v10

    sub-long/2addr v1, v8

    ushr-long v8, v1, v3

    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    and-long/2addr v8, v10

    and-long/2addr v1, v10

    add-long/2addr v8, v1

    ushr-long v1, v8, v4

    add-long/2addr v1, v8

    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    and-long/2addr v1, v8

    ushr-long v8, v1, v5

    add-long/2addr v1, v8

    ushr-long v5, v1, v6

    add-long/2addr v1, v5

    const-wide/16 v5, 0x3f

    and-long v8, v1, v5

    ushr-long/2addr v1, v7

    and-long/2addr v1, v5

    add-long/2addr v8, v1

    const/4 v1, 0x3

    int-to-long v1, v1

    add-long/2addr v8, v1

    int-to-long v1, v4

    div-long/2addr v8, v1

    long-to-int v1, v8

    invoke-virtual {p0, v1}, Le9/e;->h1(I)Le9/w;

    move-result-object v2

    iget-object v3, v2, Le9/w;->a:[B

    iget v5, v2, Le9/w;->c:I

    add-int v6, v5, v1

    sub-int/2addr v6, v0

    :goto_62
    if-lt v6, v5, :cond_74

    invoke-static {}, Lf9/a;->c()[B

    move-result-object v0

    const-wide/16 v7, 0xf

    and-long/2addr v7, p1

    long-to-int v7, v7

    aget-byte v0, v0, v7

    aput-byte v0, v3, v6

    ushr-long/2addr p1, v4

    add-int/lit8 v6, v6, -0x1

    goto :goto_62

    :cond_74
    iget p1, v2, Le9/w;->c:I

    add-int/2addr p1, v1

    iput p1, v2, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide p1

    int-to-long v0, v1

    add-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Le9/e;->W0(J)V

    return-object p0
.end method

.method public p1(I)Le9/e;
    .registers 9

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Le9/e;->h1(I)Le9/w;

    move-result-object v1

    iget-object v2, v1, Le9/w;->a:[B

    iget v3, v1, Le9/w;->c:I

    add-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v5, p1, 0x18

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/lit8 v5, v3, 0x2

    ushr-int/lit8 v6, p1, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v2, v4

    add-int/lit8 v4, v3, 0x3

    ushr-int/lit8 v6, p1, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/2addr v3, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v2, v4

    iput v3, v1, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-object p0
.end method

.method public q0(Le9/h;J)J
    .registers 15

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_133

    iget-object v2, p0, Le9/e;->q:Le9/w;

    const-wide/16 v3, -0x1

    if-nez v2, :cond_12

    return-wide v3

    :cond_12
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v5

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-gez v5, :cond_ad

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    :goto_22
    cmp-long v5, v0, p2

    if-lez v5, :cond_33

    iget-object v2, v2, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v5, v2, Le9/w;->c:I

    iget v9, v2, Le9/w;->b:I

    sub-int/2addr v5, v9

    int-to-long v9, v5

    sub-long/2addr v0, v9

    goto :goto_22

    :cond_33
    invoke-virtual {p1}, Le9/h;->v()I

    move-result v5

    if-ne v5, v6, :cond_73

    invoke-virtual {p1, v7}, Le9/h;->h(I)B

    move-result v5

    invoke-virtual {p1, v8}, Le9/h;->h(I)B

    move-result p1

    :goto_41
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v6

    cmp-long v6, v0, v6

    if-gez v6, :cond_ac

    iget-object v6, v2, Le9/w;->a:[B

    iget v7, v2, Le9/w;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Le9/w;->c:I

    :goto_53
    if-ge p2, p3, :cond_65

    aget-byte v7, v6, p2

    if-eq v7, v5, :cond_5f

    if-ne v7, p1, :cond_5c

    goto :goto_5f

    :cond_5c
    add-int/lit8 p2, p2, 0x1

    goto :goto_53

    :cond_5f
    :goto_5f
    iget p0, v2, Le9/w;->b:I

    :goto_61
    sub-int/2addr p2, p0

    int-to-long p0, p2

    add-long/2addr p0, v0

    return-wide p0

    :cond_65
    iget p2, v2, Le9/w;->c:I

    iget p3, v2, Le9/w;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_41

    :cond_73
    invoke-virtual {p1}, Le9/h;->o()[B

    move-result-object p1

    :goto_77
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v5

    cmp-long v5, v0, v5

    if-gez v5, :cond_ac

    iget-object v5, v2, Le9/w;->a:[B

    iget v6, v2, Le9/w;->b:I

    int-to-long v8, v6

    add-long/2addr v8, p2

    sub-long/2addr v8, v0

    long-to-int p2, v8

    iget p3, v2, Le9/w;->c:I

    :goto_89
    if-ge p2, p3, :cond_9e

    aget-byte v6, v5, p2

    array-length v8, p1

    move v9, v7

    :goto_8f
    if-ge v9, v8, :cond_9b

    aget-byte v10, p1, v9

    if-ne v6, v10, :cond_98

    :goto_95
    iget p0, v2, Le9/w;->b:I

    goto :goto_61

    :cond_98
    add-int/lit8 v9, v9, 0x1

    goto :goto_8f

    :cond_9b
    add-int/lit8 p2, p2, 0x1

    goto :goto_89

    :cond_9e
    iget p2, v2, Le9/w;->c:I

    iget p3, v2, Le9/w;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_77

    :cond_ac
    return-wide v3

    :cond_ad
    :goto_ad
    iget v5, v2, Le9/w;->c:I

    iget v9, v2, Le9/w;->b:I

    sub-int/2addr v5, v9

    int-to-long v9, v5

    add-long/2addr v9, v0

    cmp-long v5, v9, p2

    if-gtz v5, :cond_bf

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide v0, v9

    goto :goto_ad

    :cond_bf
    invoke-virtual {p1}, Le9/h;->v()I

    move-result v5

    if-ne v5, v6, :cond_fa

    invoke-virtual {p1, v7}, Le9/h;->h(I)B

    move-result v5

    invoke-virtual {p1, v8}, Le9/h;->h(I)B

    move-result p1

    :goto_cd
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v6

    cmp-long v6, v0, v6

    if-gez v6, :cond_132

    iget-object v6, v2, Le9/w;->a:[B

    iget v7, v2, Le9/w;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    iget p3, v2, Le9/w;->c:I

    :goto_df
    if-ge p2, p3, :cond_ec

    aget-byte v7, v6, p2

    if-eq v7, v5, :cond_5f

    if-ne v7, p1, :cond_e9

    goto/16 :goto_5f

    :cond_e9
    add-int/lit8 p2, p2, 0x1

    goto :goto_df

    :cond_ec
    iget p2, v2, Le9/w;->c:I

    iget p3, v2, Le9/w;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_cd

    :cond_fa
    invoke-virtual {p1}, Le9/h;->o()[B

    move-result-object p1

    :goto_fe
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v5

    cmp-long v5, v0, v5

    if-gez v5, :cond_132

    iget-object v5, v2, Le9/w;->a:[B

    iget v6, v2, Le9/w;->b:I

    int-to-long v8, v6

    add-long/2addr v8, p2

    sub-long/2addr v8, v0

    long-to-int p2, v8

    iget p3, v2, Le9/w;->c:I

    :goto_110
    if-ge p2, p3, :cond_124

    aget-byte v6, v5, p2

    array-length v8, p1

    move v9, v7

    :goto_116
    if-ge v9, v8, :cond_121

    aget-byte v10, p1, v9

    if-ne v6, v10, :cond_11e

    goto/16 :goto_95

    :cond_11e
    add-int/lit8 v9, v9, 0x1

    goto :goto_116

    :cond_121
    add-int/lit8 p2, p2, 0x1

    goto :goto_110

    :cond_124
    iget p2, v2, Le9/w;->c:I

    iget p3, v2, Le9/w;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr v0, p2

    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_fe

    :cond_132
    return-wide v3

    :cond_133
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "fromIndex < 0: "

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

.method public q1(I)Le9/e;
    .registers 8

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Le9/e;->h1(I)Le9/w;

    move-result-object v1

    iget-object v2, v1, Le9/w;->a:[B

    iget v3, v1, Le9/w;->c:I

    add-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v5, p1, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/2addr v3, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v2, v4

    iput v3, v1, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-object p0
.end method

.method public bridge synthetic r0(J)Le9/f;
    .registers 3

    invoke-virtual {p0, p1, p2}, Le9/e;->o1(J)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public r1(Ljava/lang/String;IILjava/nio/charset/Charset;)Le9/e;
    .registers 6

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_84

    if-lt p3, p2, :cond_61

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p3, v0, :cond_3a

    sget-object v0, LE8/d;->b:Ljava/nio/charset/Charset;

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {p0, p1, p2, p3}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    move-result-object p0

    return-object p0

    :cond_21
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "getBytes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, p1

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3, p2}, Le9/e;->k1([BII)Le9/e;

    move-result-object p0

    return-object p0

    :cond_3a
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "endIndex > string.length: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " > "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_61
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "endIndex < beginIndex: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_84
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "beginIndex < 0: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .registers 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Le9/e;->q:Le9/w;

    if-nez v0, :cond_b

    const/4 p0, -0x1

    return p0

    .line 2
    :cond_b
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget v2, v0, Le9/w;->c:I

    iget v3, v0, Le9/w;->b:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 3
    iget-object v2, v0, Le9/w;->a:[B

    iget v3, v0, Le9/w;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 4
    iget p1, v0, Le9/w;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Le9/w;->b:I

    .line 5
    iget-wide v2, p0, Le9/e;->r:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Le9/e;->r:J

    .line 6
    iget v2, v0, Le9/w;->c:I

    if-ne p1, v2, :cond_37

    .line 7
    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object p1

    iput-object p1, p0, Le9/e;->q:Le9/w;

    .line 8
    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    :cond_37
    return v1
.end method

.method public read([BII)I
    .registers 11

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    .line 10
    iget-object v0, p0, Le9/e;->q:Le9/w;

    if-nez v0, :cond_12

    const/4 p0, -0x1

    return p0

    .line 11
    :cond_12
    iget v1, v0, Le9/w;->c:I

    iget v2, v0, Le9/w;->b:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 12
    iget-object v1, v0, Le9/w;->a:[B

    .line 13
    iget v2, v0, Le9/w;->b:I

    add-int v3, v2, p3

    .line 14
    invoke-static {v1, p1, p2, v2, v3}, Li8/m;->d([B[BIII)[B

    .line 15
    iget p1, v0, Le9/w;->b:I

    add-int/2addr p1, p3

    iput p1, v0, Le9/w;->b:I

    .line 16
    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide p1

    int-to-long v1, p3

    sub-long/2addr p1, v1

    invoke-virtual {p0, p1, p2}, Le9/e;->W0(J)V

    .line 17
    iget p1, v0, Le9/w;->b:I

    iget p2, v0, Le9/w;->c:I

    if-ne p1, p2, :cond_41

    .line 18
    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object p1

    iput-object p1, p0, Le9/e;->q:Le9/w;

    .line 19
    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    :cond_41
    return p3
.end method

.method public readByte()B
    .registers 10

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_32

    iget-object v0, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->b:I

    iget v2, v0, Le9/w;->c:I

    iget-object v3, v0, Le9/w;->a:[B

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v3, v1

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v5

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    invoke-virtual {p0, v5, v6}, Le9/e;->W0(J)V

    if-ne v4, v2, :cond_2f

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v2

    iput-object v2, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    return v1

    :cond_2f
    iput v4, v0, Le9/w;->b:I

    return v1

    :cond_32
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public readInt()I
    .registers 10

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_76

    iget-object v0, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->b:I

    iget v4, v0, Le9/w;->c:I

    sub-int v5, v4, v1

    int-to-long v5, v5

    cmp-long v5, v5, v2

    if-gez v5, :cond_3c

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0

    :cond_3c
    iget-object v5, v0, Le9/w;->a:[B

    add-int/lit8 v6, v1, 0x1

    aget-byte v7, v5, v1

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x18

    add-int/lit8 v8, v1, 0x2

    aget-byte v6, v5, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v6, v7

    add-int/lit8 v7, v1, 0x3

    aget-byte v8, v5, v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    or-int/2addr v6, v8

    add-int/lit8 v1, v1, 0x4

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v6

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-virtual {p0, v6, v7}, Le9/e;->W0(J)V

    if-ne v1, v4, :cond_73

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v1

    iput-object v1, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    return v5

    :cond_73
    iput v1, v0, Le9/w;->b:I

    return v5

    :cond_76
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public readShort()S
    .registers 10

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_51

    iget-object v0, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->b:I

    iget v4, v0, Le9/w;->c:I

    sub-int v5, v4, v1

    const/4 v6, 0x2

    if-ge v5, v6, :cond_29

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0

    :cond_29
    iget-object v5, v0, Le9/w;->a:[B

    add-int/lit8 v7, v1, 0x1

    aget-byte v8, v5, v1

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    add-int/2addr v1, v6

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v8

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-virtual {p0, v6, v7}, Le9/e;->W0(J)V

    if-ne v1, v4, :cond_4d

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v1

    iput-object v1, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    goto :goto_4f

    :cond_4d
    iput v1, v0, Le9/w;->b:I

    :goto_4f
    int-to-short p0, v5

    return p0

    :cond_51
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0
.end method

.method public bridge synthetic s(I)Le9/f;
    .registers 2

    invoke-virtual {p0, p1}, Le9/e;->q1(I)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic s0(Le9/h;)Le9/f;
    .registers 2

    invoke-virtual {p0, p1}, Le9/e;->i1(Le9/h;)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public final s1(Ljava/io/OutputStream;J)Le9/e;
    .registers 11

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p0, Le9/e;->r:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    iget-object p2, p0, Le9/e;->q:Le9/w;

    move-object v0, p2

    move-wide p2, v5

    :cond_11
    :goto_11
    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-lez v1, :cond_47

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->c:I

    iget v2, v0, Le9/w;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, v0, Le9/w;->a:[B

    iget v3, v0, Le9/w;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    iget v2, v0, Le9/w;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Le9/w;->b:I

    iget-wide v3, p0, Le9/e;->r:J

    int-to-long v5, v1

    sub-long/2addr v3, v5

    iput-wide v3, p0, Le9/e;->r:J

    sub-long/2addr p2, v5

    iget v1, v0, Le9/w;->c:I

    if-ne v2, v1, :cond_11

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v1

    iput-object v1, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    move-object v0, v1

    goto :goto_11

    :cond_47
    return-object p0
.end method

.method public skip(J)V
    .registers 9

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_38

    iget-object v0, p0, Le9/e;->q:Le9/w;

    if-eqz v0, :cond_32

    iget v1, v0, Le9/w;->c:I

    iget v2, v0, Le9/w;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v2

    int-to-long v4, v1

    sub-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, Le9/e;->W0(J)V

    sub-long/2addr p1, v4

    iget v2, v0, Le9/w;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Le9/w;->b:I

    iget v1, v0, Le9/w;->c:I

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v1

    iput-object v1, p0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    goto :goto_0

    :cond_32
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    :cond_38
    return-void
.end method

.method public t0()[B
    .registers 3

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Le9/e;->C0(J)[B

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    invoke-virtual {p0}, Le9/e;->c1()Le9/h;

    move-result-object p0

    invoke-virtual {p0}, Le9/h;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public u0(J)Z
    .registers 5

    iget-wide v0, p0, Le9/e;->r:J

    cmp-long p0, v0, p1

    if-ltz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public u1(Ljava/lang/String;)Le9/e;
    .registers 4

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Le9/e;->v1(Ljava/lang/String;II)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public v1(Ljava/lang/String;II)Le9/e;
    .registers 13

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_167

    if-lt p3, p2, :cond_144

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p3, v0, :cond_11d

    :goto_f
    if-ge p2, p3, :cond_11c

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_50

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Le9/e;->h1(I)Le9/w;

    move-result-object v2

    iget-object v3, v2, Le9/w;->a:[B

    iget v4, v2, Le9/w;->c:I

    sub-int/2addr v4, p2

    rsub-int v5, v4, 0x2000

    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    :goto_2f
    move p2, v6

    if-ge p2, v5, :cond_3f

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ge v0, v1, :cond_3f

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    goto :goto_2f

    :cond_3f
    add-int/2addr v4, p2

    iget v0, v2, Le9/w;->c:I

    sub-int/2addr v4, v0

    add-int/2addr v0, v4

    iput v0, v2, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    int-to-long v2, v4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    goto :goto_f

    :cond_50
    const/16 v2, 0x800

    if-ge v0, v2, :cond_7c

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Le9/e;->h1(I)Le9/w;

    move-result-object v3

    iget-object v4, v3, Le9/w;->a:[B

    iget v5, v3, Le9/w;->c:I

    shr-int/lit8 v6, v0, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v6

    add-int/2addr v5, v2

    iput v5, v3, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    :goto_79
    add-int/lit8 p2, p2, 0x1

    goto :goto_f

    :cond_7c
    const v2, 0xd800

    const/16 v3, 0x3f

    if-lt v0, v2, :cond_ec

    const v2, 0xdfff

    if-le v0, v2, :cond_89

    goto :goto_ec

    :cond_89
    add-int/lit8 v2, p2, 0x1

    if-ge v2, p3, :cond_92

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    goto :goto_93

    :cond_92
    const/4 v4, 0x0

    :goto_93
    const v5, 0xdbff

    if-gt v0, v5, :cond_e6

    const v5, 0xdc00

    if-gt v5, v4, :cond_e6

    const v5, 0xe000

    if-ge v4, v5, :cond_e6

    and-int/lit16 v0, v0, 0x3ff

    shl-int/lit8 v0, v0, 0xa

    and-int/lit16 v2, v4, 0x3ff

    or-int/2addr v0, v2

    const/high16 v2, 0x10000

    add-int/2addr v0, v2

    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Le9/e;->h1(I)Le9/w;

    move-result-object v4

    iget-object v5, v4, Le9/w;->a:[B

    iget v6, v4, Le9/w;->c:I

    shr-int/lit8 v7, v0, 0x12

    or-int/lit16 v7, v7, 0xf0

    int-to-byte v7, v7

    aput-byte v7, v5, v6

    add-int/lit8 v7, v6, 0x1

    shr-int/lit8 v8, v0, 0xc

    and-int/2addr v8, v3

    or-int/2addr v8, v1

    int-to-byte v8, v8

    aput-byte v8, v5, v7

    add-int/lit8 v7, v6, 0x2

    shr-int/lit8 v8, v0, 0x6

    and-int/2addr v8, v3

    or-int/2addr v8, v1

    int-to-byte v8, v8

    aput-byte v8, v5, v7

    add-int/lit8 v7, v6, 0x3

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v5, v7

    add-int/2addr v6, v2

    iput v6, v4, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    add-int/lit8 p2, p2, 0x2

    goto/16 :goto_f

    :cond_e6
    invoke-virtual {p0, v3}, Le9/e;->m1(I)Le9/e;

    move p2, v2

    goto/16 :goto_f

    :cond_ec
    :goto_ec
    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Le9/e;->h1(I)Le9/w;

    move-result-object v4

    iget-object v5, v4, Le9/w;->a:[B

    iget v6, v4, Le9/w;->c:I

    shr-int/lit8 v7, v0, 0xc

    or-int/lit16 v7, v7, 0xe0

    int-to-byte v7, v7

    aput-byte v7, v5, v6

    add-int/lit8 v7, v6, 0x1

    shr-int/lit8 v8, v0, 0x6

    and-int/2addr v3, v8

    or-int/2addr v3, v1

    int-to-byte v3, v3

    aput-byte v3, v5, v7

    add-int/lit8 v3, v6, 0x2

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v5, v3

    add-int/2addr v6, v2

    iput v6, v4, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    goto/16 :goto_79

    :cond_11c
    return-object p0

    :cond_11d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "endIndex > string.length: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " > "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_144
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "endIndex < beginIndex: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_167
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "beginIndex < 0: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public w0()Le9/h;
    .registers 3

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Le9/e;->n(J)Le9/h;

    move-result-object p0

    return-object p0
.end method

.method public w1(I)Le9/e;
    .registers 10

    const/16 v0, 0x80

    if-ge p1, v0, :cond_8

    invoke-virtual {p0, p1}, Le9/e;->m1(I)Le9/e;

    return-object p0

    :cond_8
    const/16 v1, 0x800

    const/16 v2, 0x3f

    if-ge p1, v1, :cond_33

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Le9/e;->h1(I)Le9/w;

    move-result-object v3

    iget-object v4, v3, Le9/w;->a:[B

    iget v5, v3, Le9/w;->c:I

    shr-int/lit8 v6, p1, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-object p0

    :cond_33
    const v1, 0xd800

    if-gt v1, p1, :cond_41

    const v1, 0xe000

    if-ge p1, v1, :cond_41

    invoke-virtual {p0, v2}, Le9/e;->m1(I)Le9/e;

    return-object p0

    :cond_41
    const/high16 v1, 0x10000

    if-ge p1, v1, :cond_73

    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Le9/e;->h1(I)Le9/w;

    move-result-object v3

    iget-object v4, v3, Le9/w;->a:[B

    iget v5, v3, Le9/w;->c:I

    shr-int/lit8 v6, p1, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, p1, 0x6

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-object p0

    :cond_73
    const v1, 0x10ffff

    if-gt p1, v1, :cond_af

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Le9/e;->h1(I)Le9/w;

    move-result-object v3

    iget-object v4, v3, Le9/w;->a:[B

    iget v5, v3, Le9/w;->c:I

    shr-int/lit8 v6, p1, 0x12

    or-int/lit16 v6, v6, 0xf0

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, p1, 0xc

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x2

    shr-int/lit8 v7, p1, 0x6

    and-int/2addr v7, v2

    or-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v4, v6

    add-int/lit8 v6, v5, 0x3

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    aput-byte p1, v4, v6

    add-int/2addr v5, v1

    iput v5, v3, Le9/w;->c:I

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le9/e;->W0(J)V

    return-object p0

    :cond_af
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected code point: 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Le9/b;->i(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .registers 8

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_a
    if-lez v1, :cond_27

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Le9/e;->h1(I)Le9/w;

    move-result-object v2

    iget v3, v2, Le9/w;->c:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, v2, Le9/w;->a:[B

    iget v5, v2, Le9/w;->c:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    iget v4, v2, Le9/w;->c:I

    add-int/2addr v4, v3

    iput v4, v2, Le9/w;->c:I

    goto :goto_a

    :cond_27
    iget-wide v1, p0, Le9/e;->r:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Le9/e;->r:J

    return v0
.end method

.method public bridge synthetic x(I)Le9/f;
    .registers 2

    invoke-virtual {p0, p1}, Le9/e;->p1(I)Le9/e;

    move-result-object p0

    return-object p0
.end method

.method public z0()Ljava/lang/String;
    .registers 3

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Le9/e;->O(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
