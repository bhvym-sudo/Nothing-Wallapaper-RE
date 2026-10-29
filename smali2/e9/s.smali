.class final Le9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/z;


# instance fields
.field private final q:Ljava/io/OutputStream;

.field private final r:Le9/C;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Le9/C;)V
    .registers 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/s;->q:Ljava/io/OutputStream;

    iput-object p2, p0, Le9/s;->r:Le9/C;

    return-void
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 11

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    :cond_f
    :goto_f
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_52

    iget-object v0, p0, Le9/s;->r:Le9/C;

    invoke-virtual {v0}, Le9/C;->f()V

    iget-object v0, p1, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v0, Le9/w;->c:I

    iget v2, v0, Le9/w;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, p0, Le9/s;->q:Ljava/io/OutputStream;

    iget-object v3, v0, Le9/w;->a:[B

    iget v4, v0, Le9/w;->b:I

    invoke-virtual {v2, v3, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    iget v2, v0, Le9/w;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Le9/w;->b:I

    int-to-long v1, v1

    sub-long/2addr p2, v1

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, Le9/e;->W0(J)V

    iget v1, v0, Le9/w;->b:I

    iget v2, v0, Le9/w;->c:I

    if-ne v1, v2, :cond_f

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object v1

    iput-object v1, p1, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    goto :goto_f

    :cond_52
    return-void
.end method

.method public close()V
    .registers 1

    iget-object p0, p0, Le9/s;->q:Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/s;->r:Le9/C;

    return-object p0
.end method

.method public flush()V
    .registers 1

    iget-object p0, p0, Le9/s;->q:Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le9/s;->q:Ljava/io/OutputStream;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
