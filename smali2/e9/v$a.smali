.class public final Le9/v$a;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/v;->f1()Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Le9/v;


# direct methods
.method constructor <init>(Le9/v;)V
    .registers 2

    iput-object p1, p0, Le9/v$a;->q:Le9/v;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public available()I
    .registers 5

    iget-object p0, p0, Le9/v$a;->q:Le9/v;

    iget-boolean v0, p0, Le9/v;->s:Z

    if-nez v0, :cond_16

    iget-object p0, p0, Le9/v;->r:Le9/e;

    invoke-virtual {p0}, Le9/e;->X0()J

    move-result-wide v0

    const p0, 0x7fffffff

    int-to-long v2, p0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p0, v0

    return p0

    :cond_16
    new-instance p0, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public close()V
    .registers 1

    iget-object p0, p0, Le9/v$a;->q:Le9/v;

    invoke-virtual {p0}, Le9/v;->close()V

    return-void
.end method

.method public read()I
    .registers 5

    .line 1
    iget-object v0, p0, Le9/v$a;->q:Le9/v;

    iget-boolean v1, v0, Le9/v;->s:Z

    if-nez v1, :cond_31

    .line 2
    iget-object v0, v0, Le9/v;->r:Le9/e;

    .line 3
    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_26

    .line 4
    iget-object v0, p0, Le9/v$a;->q:Le9/v;

    iget-object v1, v0, Le9/v;->q:Le9/B;

    .line 5
    iget-object v0, v0, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x2000

    .line 6
    invoke-interface {v1, v0, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_26

    const/4 p0, -0x1

    return p0

    .line 7
    :cond_26
    iget-object p0, p0, Le9/v$a;->q:Le9/v;

    .line 8
    iget-object p0, p0, Le9/v;->r:Le9/e;

    .line 9
    invoke-virtual {p0}, Le9/e;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0

    .line 10
    :cond_31
    new-instance p0, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public read([BII)I
    .registers 11

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Le9/v$a;->q:Le9/v;

    iget-boolean v0, v0, Le9/v;->s:Z

    if-nez v0, :cond_3d

    .line 12
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    .line 13
    iget-object v0, p0, Le9/v$a;->q:Le9/v;

    .line 14
    iget-object v0, v0, Le9/v;->r:Le9/e;

    .line 15
    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_34

    .line 16
    iget-object v0, p0, Le9/v$a;->q:Le9/v;

    iget-object v1, v0, Le9/v;->q:Le9/B;

    .line 17
    iget-object v0, v0, Le9/v;->r:Le9/e;

    const-wide/16 v2, 0x2000

    .line 18
    invoke-interface {v1, v0, v2, v3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_34

    const/4 p0, -0x1

    return p0

    .line 19
    :cond_34
    iget-object p0, p0, Le9/v$a;->q:Le9/v;

    .line 20
    iget-object p0, p0, Le9/v;->r:Le9/e;

    .line 21
    invoke-virtual {p0, p1, p2, p3}, Le9/e;->read([BII)I

    move-result p0

    return p0

    .line 22
    :cond_3d
    new-instance p0, Ljava/io/IOException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Le9/v$a;->q:Le9/v;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".inputStream()"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public transferTo(Ljava/io/OutputStream;)J
    .registers 13

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/v$a;->q:Le9/v;

    iget-boolean v0, v0, Le9/v;->s:Z

    if-nez v0, :cond_44

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :goto_e
    iget-object v4, p0, Le9/v$a;->q:Le9/v;

    iget-object v4, v4, Le9/v;->r:Le9/e;

    invoke-virtual {v4}, Le9/e;->X0()J

    move-result-wide v4

    cmp-long v4, v4, v0

    if-nez v4, :cond_2e

    iget-object v4, p0, Le9/v$a;->q:Le9/v;

    iget-object v5, v4, Le9/v;->q:Le9/B;

    iget-object v4, v4, Le9/v;->r:Le9/e;

    const-wide/16 v6, 0x2000

    invoke-interface {v5, v4, v6, v7}, Le9/B;->e1(Le9/e;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_2d

    goto :goto_2e

    :cond_2d
    return-wide v2

    :cond_2e
    :goto_2e
    iget-object v4, p0, Le9/v$a;->q:Le9/v;

    iget-object v4, v4, Le9/v;->r:Le9/e;

    invoke-virtual {v4}, Le9/e;->X0()J

    move-result-wide v4

    add-long/2addr v2, v4

    iget-object v4, p0, Le9/v$a;->q:Le9/v;

    iget-object v5, v4, Le9/v;->r:Le9/e;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object v6, p1

    invoke-static/range {v5 .. v10}, Le9/e;->t1(Le9/e;Ljava/io/OutputStream;JILjava/lang/Object;)Le9/e;

    goto :goto_e

    :cond_44
    new-instance p0, Ljava/io/IOException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
