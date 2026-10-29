.class public final Le9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# instance fields
.field private final q:Le9/g;

.field private final r:Ljava/util/zip/Inflater;

.field private s:I

.field private t:Z


# direct methods
.method public constructor <init>(Le9/g;Ljava/util/zip/Inflater;)V
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflater"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/m;->q:Le9/g;

    iput-object p2, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    return-void
.end method

.method private final f()V
    .registers 3

    iget v0, p0, Le9/m;->s:I

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Le9/m;->s:I

    sub-int/2addr v1, v0

    iput v1, p0, Le9/m;->s:I

    iget-object p0, p0, Le9/m;->q:Le9/g;

    int-to-long v0, v0

    invoke-interface {p0, v0, v1}, Le9/g;->skip(J)V

    return-void
.end method


# virtual methods
.method public final a(Le9/e;J)J
    .registers 9

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_61

    iget-boolean v3, p0, Le9/m;->t:Z

    if-nez v3, :cond_59

    if-nez v2, :cond_12

    return-wide v0

    :cond_12
    const/4 v2, 0x1

    :try_start_13
    invoke-virtual {p1, v2}, Le9/e;->h1(I)Le9/w;

    move-result-object v2

    iget v3, v2, Le9/w;->c:I

    rsub-int v3, v3, 0x2000

    int-to-long v3, v3

    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    invoke-virtual {p0}, Le9/m;->b()Z

    iget-object p3, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    iget-object v3, v2, Le9/w;->a:[B

    iget v4, v2, Le9/w;->c:I

    invoke-virtual {p3, v3, v4, p2}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result p2

    invoke-direct {p0}, Le9/m;->f()V

    if-lez p2, :cond_42

    iget p0, v2, Le9/w;->c:I

    add-int/2addr p0, p2

    iput p0, v2, Le9/w;->c:I

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v0

    int-to-long p2, p2

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Le9/e;->W0(J)V

    return-wide p2

    :cond_42
    iget p0, v2, Le9/w;->b:I

    iget p2, v2, Le9/w;->c:I

    if-ne p0, p2, :cond_51

    invoke-virtual {v2}, Le9/w;->b()Le9/w;

    move-result-object p0

    iput-object p0, p1, Le9/e;->q:Le9/w;

    invoke-static {v2}, Le9/x;->b(Le9/w;)V
    :try_end_51
    .catch Ljava/util/zip/DataFormatException; {:try_start_13 .. :try_end_51} :catch_52

    :cond_51
    return-wide v0

    :catch_52
    move-exception p0

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_59
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_61
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

.method public final b()Z
    .registers 5

    iget-object v0, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return v1

    :cond_a
    iget-object v0, p0, Le9/m;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->D()Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    iget-object v0, p0, Le9/m;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->d()Le9/e;

    move-result-object v0

    iget-object v0, v0, Le9/e;->q:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v2, v0, Le9/w;->c:I

    iget v3, v0, Le9/w;->b:I

    sub-int/2addr v2, v3

    iput v2, p0, Le9/m;->s:I

    iget-object p0, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    iget-object v0, v0, Le9/w;->a:[B

    invoke-virtual {p0, v0, v3, v2}, Ljava/util/zip/Inflater;->setInput([BII)V

    return v1
.end method

.method public close()V
    .registers 2

    iget-boolean v0, p0, Le9/m;->t:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le9/m;->t:Z

    iget-object p0, p0, Le9/m;->q:Le9/g;

    invoke-interface {p0}, Le9/B;->close()V

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/m;->q:Le9/g;

    invoke-interface {p0}, Le9/B;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    invoke-virtual {p0, p1, p2, p3}, Le9/m;->a(Le9/e;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_10

    return-wide v0

    :cond_10
    iget-object v0, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v0

    if-nez v0, :cond_32

    iget-object v0, p0, Le9/m;->r:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_32

    :cond_21
    iget-object v0, p0, Le9/m;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->D()Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_5

    :cond_2a
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "source exhausted prematurely"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_32
    :goto_32
    const-wide/16 p0, -0x1

    return-wide p0
.end method
