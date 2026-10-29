.class public final Le9/u$a;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/u;->b1()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Le9/u;


# direct methods
.method constructor <init>(Le9/u;)V
    .registers 2

    iput-object p1, p0, Le9/u$a;->q:Le9/u;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 1

    iget-object p0, p0, Le9/u$a;->q:Le9/u;

    invoke-virtual {p0}, Le9/u;->close()V

    return-void
.end method

.method public flush()V
    .registers 2

    iget-object p0, p0, Le9/u$a;->q:Le9/u;

    iget-boolean v0, p0, Le9/u;->s:Z

    if-nez v0, :cond_9

    invoke-virtual {p0}, Le9/u;->flush()V

    :cond_9
    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Le9/u$a;->q:Le9/u;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".outputStream()"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public write(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Le9/u$a;->q:Le9/u;

    iget-boolean v1, v0, Le9/u;->s:Z

    if-nez v1, :cond_12

    .line 2
    iget-object v0, v0, Le9/u;->r:Le9/e;

    int-to-byte p1, p1

    .line 3
    invoke-virtual {v0, p1}, Le9/e;->m1(I)Le9/e;

    .line 4
    iget-object p0, p0, Le9/u$a;->q:Le9/u;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    return-void

    .line 5
    :cond_12
    new-instance p0, Ljava/io/IOException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public write([BII)V
    .registers 6

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Le9/u$a;->q:Le9/u;

    iget-boolean v1, v0, Le9/u;->s:Z

    if-nez v1, :cond_16

    .line 7
    iget-object v0, v0, Le9/u;->r:Le9/e;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Le9/e;->k1([BII)Le9/e;

    .line 9
    iget-object p0, p0, Le9/u$a;->q:Le9/u;

    invoke-virtual {p0}, Le9/u;->a()Le9/f;

    return-void

    .line 10
    :cond_16
    new-instance p0, Ljava/io/IOException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
