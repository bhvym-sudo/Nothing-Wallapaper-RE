.class public final Le9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# instance fields
.field private final q:Le9/g;

.field private final r:Le9/e;

.field private s:Le9/w;

.field private t:I

.field private u:Z

.field private v:J


# direct methods
.method public constructor <init>(Le9/g;)V
    .registers 3

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/t;->q:Le9/g;

    invoke-interface {p1}, Le9/g;->d()Le9/e;

    move-result-object p1

    iput-object p1, p0, Le9/t;->r:Le9/e;

    iget-object p1, p1, Le9/e;->q:Le9/w;

    iput-object p1, p0, Le9/t;->s:Le9/w;

    if-eqz p1, :cond_19

    iget p1, p1, Le9/w;->b:I

    goto :goto_1a

    :cond_19
    const/4 p1, -0x1

    :goto_1a
    iput p1, p0, Le9/t;->t:I

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Le9/t;->u:Z

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/t;->q:Le9/g;

    invoke-interface {p0}, Le9/B;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 12

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_74

    iget-boolean v3, p0, Le9/t;->u:Z

    if-nez v3, :cond_6c

    iget-object v3, p0, Le9/t;->s:Le9/w;

    if-eqz v3, :cond_2b

    iget-object v4, p0, Le9/t;->r:Le9/e;

    iget-object v4, v4, Le9/e;->q:Le9/w;

    if-ne v3, v4, :cond_23

    iget v3, p0, Le9/t;->t:I

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v4, v4, Le9/w;->b:I

    if-ne v3, v4, :cond_23

    goto :goto_2b

    :cond_23
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Peek source is invalid because upstream source was used"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2b
    :goto_2b
    if-nez v2, :cond_2e

    return-wide v0

    :cond_2e
    iget-object v0, p0, Le9/t;->q:Le9/g;

    iget-wide v1, p0, Le9/t;->v:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-interface {v0, v1, v2}, Le9/g;->u0(J)Z

    move-result v0

    if-nez v0, :cond_3e

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_3e
    iget-object v0, p0, Le9/t;->s:Le9/w;

    if-nez v0, :cond_51

    iget-object v0, p0, Le9/t;->r:Le9/e;

    iget-object v0, v0, Le9/e;->q:Le9/w;

    if-eqz v0, :cond_51

    iput-object v0, p0, Le9/t;->s:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v0, v0, Le9/w;->b:I

    iput v0, p0, Le9/t;->t:I

    :cond_51
    iget-object v0, p0, Le9/t;->r:Le9/e;

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide v0

    iget-wide v2, p0, Le9/t;->v:J

    sub-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    iget-object v2, p0, Le9/t;->r:Le9/e;

    iget-wide v4, p0, Le9/t;->v:J

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Le9/e;->Q(Le9/e;JJ)Le9/e;

    iget-wide p1, p0, Le9/t;->v:J

    add-long/2addr p1, v6

    iput-wide p1, p0, Le9/t;->v:J

    return-wide v6

    :cond_6c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_74
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
