.class final LW8/b$e;
.super LW8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field private t:J

.field final synthetic u:LW8/b;


# direct methods
.method public constructor <init>(LW8/b;J)V
    .registers 6

    iput-object p1, p0, LW8/b$e;->u:LW8/b;

    invoke-direct {p0, p1}, LW8/b$a;-><init>(LW8/b;)V

    iput-wide p2, p0, LW8/b$e;->t:J

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_10

    invoke-virtual {p0}, LW8/b$a;->a()V

    :cond_10
    return-void
.end method


# virtual methods
.method public close()V
    .registers 5

    invoke-virtual {p0}, LW8/b$a;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-wide v0, p0, LW8/b$e;->t:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_25

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, LQ8/d;->s(Le9/B;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, p0, LW8/b$e;->u:LW8/b;

    invoke-virtual {v0}, LW8/b;->f()LU8/f;

    move-result-object v0

    invoke-virtual {v0}, LU8/f;->z()V

    invoke-virtual {p0}, LW8/b$a;->a()V

    :cond_25
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LW8/b$a;->b(Z)V

    return-void
.end method

.method public e1(Le9/e;J)J
    .registers 11

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4f

    invoke-virtual {p0}, LW8/b$a;->y()Z

    move-result v2

    if-nez v2, :cond_47

    iget-wide v2, p0, LW8/b$e;->t:J

    cmp-long v4, v2, v0

    const-wide/16 v5, -0x1

    if-nez v4, :cond_1a

    return-wide v5

    :cond_1a
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, LW8/b$a;->e1(Le9/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-eqz p3, :cond_33

    iget-wide v2, p0, LW8/b$e;->t:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, LW8/b$e;->t:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_32

    invoke-virtual {p0}, LW8/b$a;->a()V

    :cond_32
    return-wide p1

    :cond_33
    iget-object p1, p0, LW8/b$e;->u:LW8/b;

    invoke-virtual {p1}, LW8/b;->f()LU8/f;

    move-result-object p1

    invoke-virtual {p1}, LU8/f;->z()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LW8/b$a;->a()V

    throw p1

    :cond_47
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4f
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
