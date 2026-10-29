.class public final Le9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# instance fields
.field private q:B

.field private final r:Le9/v;

.field private final s:Ljava/util/zip/Inflater;

.field private final t:Le9/m;

.field private final u:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Le9/B;)V
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le9/v;

    invoke-direct {v0, p1}, Le9/v;-><init>(Le9/B;)V

    iput-object v0, p0, Le9/l;->r:Le9/v;

    new-instance p1, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object p1, p0, Le9/l;->s:Ljava/util/zip/Inflater;

    new-instance v1, Le9/m;

    invoke-direct {v1, v0, p1}, Le9/m;-><init>(Le9/g;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Le9/l;->t:Le9/m;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Le9/l;->u:Ljava/util/zip/CRC32;

    return-void
.end method

.method private final a(Ljava/lang/String;II)V
    .registers 6

    if-ne p3, p2, :cond_3

    return-void

    :cond_3
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": actual 0x"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Le9/b;->i(I)Ljava/lang/String;

    move-result-object p1

    const/16 p3, 0x8

    const/16 v1, 0x30

    invoke-static {p1, p3, v1}, LE8/i;->o0(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " != expected 0x"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Le9/b;->i(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3, v1}, LE8/i;->o0(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final b()V
    .registers 17

    move-object/from16 v0, p0

    iget-object v1, v0, Le9/l;->r:Le9/v;

    const-wide/16 v2, 0xa

    invoke-virtual {v1, v2, v3}, Le9/v;->Y0(J)V

    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x3

    invoke-virtual {v1, v2, v3}, Le9/e;->U(J)B

    move-result v6

    shr-int/lit8 v1, v6, 0x1

    const/4 v7, 0x1

    and-int/2addr v1, v7

    const/4 v8, 0x0

    if-ne v1, v7, :cond_1c

    move v9, v7

    goto :goto_1d

    :cond_1c
    move v9, v8

    :goto_1d
    if-eqz v9, :cond_2a

    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    invoke-direct/range {v0 .. v5}, Le9/l;->g(Le9/e;JJ)V

    :cond_2a
    iget-object v1, v0, Le9/l;->r:Le9/v;

    invoke-virtual {v1}, Le9/v;->readShort()S

    move-result v1

    const-string v2, "ID1ID2"

    const/16 v3, 0x1f8b

    invoke-direct {v0, v2, v3, v1}, Le9/l;->a(Ljava/lang/String;II)V

    iget-object v1, v0, Le9/l;->r:Le9/v;

    const-wide/16 v2, 0x8

    invoke-virtual {v1, v2, v3}, Le9/v;->skip(J)V

    shr-int/lit8 v1, v6, 0x2

    and-int/2addr v1, v7

    if-ne v1, v7, :cond_79

    iget-object v1, v0, Le9/l;->r:Le9/v;

    const-wide/16 v2, 0x2

    invoke-virtual {v1, v2, v3}, Le9/v;->Y0(J)V

    if-eqz v9, :cond_57

    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    invoke-direct/range {v0 .. v5}, Le9/l;->g(Le9/e;JJ)V

    :cond_57
    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    invoke-virtual {v1}, Le9/e;->I0()S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    int-to-long v4, v1

    iget-object v1, v0, Le9/l;->r:Le9/v;

    invoke-virtual {v1, v4, v5}, Le9/v;->Y0(J)V

    if-eqz v9, :cond_74

    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Le9/l;->g(Le9/e;JJ)V

    :cond_74
    iget-object v1, v0, Le9/l;->r:Le9/v;

    invoke-virtual {v1, v4, v5}, Le9/v;->skip(J)V

    :cond_79
    shr-int/lit8 v1, v6, 0x3

    and-int/2addr v1, v7

    const-wide/16 v10, -0x1

    const-wide/16 v12, 0x1

    if-ne v1, v7, :cond_a6

    iget-object v1, v0, Le9/l;->r:Le9/v;

    invoke-virtual {v1, v8}, Le9/v;->a(B)J

    move-result-wide v14

    cmp-long v1, v14, v10

    if-eqz v1, :cond_a0

    if-eqz v9, :cond_99

    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x0

    add-long v4, v14, v12

    invoke-direct/range {v0 .. v5}, Le9/l;->g(Le9/e;JJ)V

    :cond_99
    iget-object v1, v0, Le9/l;->r:Le9/v;

    add-long/2addr v14, v12

    invoke-virtual {v1, v14, v15}, Le9/v;->skip(J)V

    goto :goto_a6

    :cond_a0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_a6
    :goto_a6
    shr-int/lit8 v1, v6, 0x4

    and-int/2addr v1, v7

    if-ne v1, v7, :cond_cf

    iget-object v1, v0, Le9/l;->r:Le9/v;

    invoke-virtual {v1, v8}, Le9/v;->a(B)J

    move-result-wide v6

    cmp-long v1, v6, v10

    if-eqz v1, :cond_c9

    if-eqz v9, :cond_c2

    iget-object v1, v0, Le9/l;->r:Le9/v;

    iget-object v1, v1, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x0

    add-long v4, v6, v12

    invoke-direct/range {v0 .. v5}, Le9/l;->g(Le9/e;JJ)V

    :cond_c2
    iget-object v1, v0, Le9/l;->r:Le9/v;

    add-long/2addr v6, v12

    invoke-virtual {v1, v6, v7}, Le9/v;->skip(J)V

    goto :goto_cf

    :cond_c9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_cf
    :goto_cf
    if-eqz v9, :cond_e9

    iget-object v1, v0, Le9/l;->r:Le9/v;

    invoke-virtual {v1}, Le9/v;->u()S

    move-result v1

    iget-object v2, v0, Le9/l;->u:Ljava/util/zip/CRC32;

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v2, v2

    int-to-short v2, v2

    const-string v3, "FHCRC"

    invoke-direct {v0, v3, v1, v2}, Le9/l;->a(Ljava/lang/String;II)V

    iget-object v0, v0, Le9/l;->u:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    :cond_e9
    return-void
.end method

.method private final f()V
    .registers 4

    iget-object v0, p0, Le9/l;->r:Le9/v;

    invoke-virtual {v0}, Le9/v;->j()I

    move-result v0

    iget-object v1, p0, Le9/l;->u:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "CRC"

    invoke-direct {p0, v2, v0, v1}, Le9/l;->a(Ljava/lang/String;II)V

    iget-object v0, p0, Le9/l;->r:Le9/v;

    invoke-virtual {v0}, Le9/v;->j()I

    move-result v0

    iget-object v1, p0, Le9/l;->s:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "ISIZE"

    invoke-direct {p0, v2, v0, v1}, Le9/l;->a(Ljava/lang/String;II)V

    return-void
.end method

.method private final g(Le9/e;JJ)V
    .registers 10

    iget-object p1, p1, Le9/e;->q:Le9/w;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_5
    iget v0, p1, Le9/w;->c:I

    iget v1, p1, Le9/w;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p2, v2

    if-ltz v2, :cond_19

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Le9/w;->f:Le9/w;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    goto :goto_5

    :cond_19
    :goto_19
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_3d

    iget v2, p1, Le9/w;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    iget p3, p1, Le9/w;->c:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Le9/l;->u:Ljava/util/zip/CRC32;

    iget-object v3, p1, Le9/w;->a:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    iget-object p1, p1, Le9/w;->f:Le9/w;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_19

    :cond_3d
    return-void
.end method


# virtual methods
.method public close()V
    .registers 1

    iget-object p0, p0, Le9/l;->t:Le9/m;

    invoke-virtual {p0}, Le9/m;->close()V

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/l;->r:Le9/v;

    invoke-virtual {p0}, Le9/v;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 15

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_54

    if-nez v2, :cond_e

    return-wide v0

    :cond_e
    iget-byte v0, p0, Le9/l;->q:B

    const/4 v1, 0x1

    if-nez v0, :cond_18

    invoke-direct {p0}, Le9/l;->b()V

    iput-byte v1, p0, Le9/l;->q:B

    :cond_18
    iget-byte v0, p0, Le9/l;->q:B

    const/4 v2, 0x2

    const-wide/16 v3, -0x1

    if-ne v0, v1, :cond_37

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v7

    iget-object v0, p0, Le9/l;->t:Le9/m;

    invoke-virtual {v0, p1, p2, p3}, Le9/m;->e1(Le9/e;J)J

    move-result-wide v9

    cmp-long p2, v9, v3

    if-eqz p2, :cond_33

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Le9/l;->g(Le9/e;JJ)V

    return-wide v9

    :cond_33
    move-object v5, p0

    iput-byte v2, v5, Le9/l;->q:B

    goto :goto_38

    :cond_37
    move-object v5, p0

    :goto_38
    iget-byte p0, v5, Le9/l;->q:B

    if-ne p0, v2, :cond_53

    invoke-direct {v5}, Le9/l;->f()V

    const/4 p0, 0x3

    iput-byte p0, v5, Le9/l;->q:B

    iget-object p0, v5, Le9/l;->r:Le9/v;

    invoke-virtual {p0}, Le9/v;->D()Z

    move-result p0

    if-eqz p0, :cond_4b

    goto :goto_53

    :cond_4b
    new-instance p0, Ljava/io/IOException;

    const-string p1, "gzip finished without exhausting source"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_53
    :goto_53
    return-wide v3

    :cond_54
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
