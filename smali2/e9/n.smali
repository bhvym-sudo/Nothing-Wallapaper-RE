.class Le9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# instance fields
.field private final q:Ljava/io/InputStream;

.field private final r:Le9/C;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Le9/C;)V
    .registers 4

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/n;->q:Ljava/io/InputStream;

    iput-object p2, p0, Le9/n;->r:Le9/C;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 1

    iget-object p0, p0, Le9/n;->q:Ljava/io/InputStream;

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/n;->r:Le9/C;

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 7

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_c

    return-wide v0

    :cond_c
    if-ltz v2, :cond_5e

    :try_start_e
    iget-object v0, p0, Le9/n;->r:Le9/C;

    invoke-virtual {v0}, Le9/C;->f()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Le9/e;->h1(I)Le9/w;

    move-result-object v0

    iget v1, v0, Le9/w;->c:I

    rsub-int v1, v1, 0x2000

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    iget-object p0, p0, Le9/n;->q:Ljava/io/InputStream;

    iget-object p3, v0, Le9/w;->a:[B

    iget v1, v0, Le9/w;->c:I

    invoke-virtual {p0, p3, v1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p0

    const/4 p2, -0x1

    if-ne p0, p2, :cond_41

    iget p0, v0, Le9/w;->b:I

    iget p2, v0, Le9/w;->c:I

    if-ne p0, p2, :cond_3e

    invoke-virtual {v0}, Le9/w;->b()Le9/w;

    move-result-object p0

    iput-object p0, p1, Le9/e;->q:Le9/w;

    invoke-static {v0}, Le9/x;->b(Le9/w;)V

    :cond_3e
    const-wide/16 p0, -0x1

    return-wide p0

    :cond_41
    iget p2, v0, Le9/w;->c:I

    add-int/2addr p2, p0

    iput p2, v0, Le9/w;->c:I

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide p2

    int-to-long v0, p0

    add-long/2addr p2, v0

    invoke-virtual {p1, p2, p3}, Le9/e;->W0(J)V
    :try_end_4f
    .catch Ljava/lang/AssertionError; {:try_start_e .. :try_end_4f} :catch_50

    return-wide v0

    :catch_50
    move-exception p0

    invoke-static {p0}, Le9/o;->e(Ljava/lang/AssertionError;)Z

    move-result p1

    if-eqz p1, :cond_5d

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_5d
    throw p0

    :cond_5e
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

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le9/n;->q:Ljava/io/InputStream;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
