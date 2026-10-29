.class final LW8/b$c;
.super LW8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final t:LP8/v;

.field private u:J

.field private v:Z

.field final synthetic w:LW8/b;


# direct methods
.method public constructor <init>(LW8/b;LP8/v;)V
    .registers 4

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LW8/b$c;->w:LW8/b;

    invoke-direct {p0, p1}, LW8/b$a;-><init>(LW8/b;)V

    iput-object p2, p0, LW8/b$c;->t:LP8/v;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LW8/b$c;->u:J

    const/4 p1, 0x1

    iput-boolean p1, p0, LW8/b$c;->v:Z

    return-void
.end method

.method private final f()V
    .registers 8

    iget-wide v0, p0, LW8/b$c;->u:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_11

    iget-object v0, p0, LW8/b$c;->w:LW8/b;

    invoke-static {v0}, LW8/b;->m(LW8/b;)Le9/g;

    move-result-object v0

    invoke-interface {v0}, Le9/g;->z0()Ljava/lang/String;

    :cond_11
    :try_start_11
    iget-object v0, p0, LW8/b$c;->w:LW8/b;

    invoke-static {v0}, LW8/b;->m(LW8/b;)Le9/g;

    move-result-object v0

    invoke-interface {v0}, Le9/g;->d1()J

    move-result-wide v0

    iput-wide v0, p0, LW8/b$c;->u:J

    iget-object v0, p0, LW8/b$c;->w:LW8/b;

    invoke-static {v0}, LW8/b;->m(LW8/b;)Le9/g;

    move-result-object v0

    invoke-interface {v0}, Le9/g;->z0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE8/i;->N0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LW8/b$c;->u:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-ltz v1, :cond_7c

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_48

    const-string v1, ";"

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v1, v2, v5, v6}, LE8/i;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1
    :try_end_46
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_46} :catch_9d

    if-eqz v1, :cond_7c

    :cond_48
    iget-wide v0, p0, LW8/b$c;->u:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_7b

    iput-boolean v2, p0, LW8/b$c;->v:Z

    iget-object v0, p0, LW8/b$c;->w:LW8/b;

    invoke-static {v0}, LW8/b;->k(LW8/b;)LW8/a;

    move-result-object v1

    invoke-virtual {v1}, LW8/a;->a()LP8/u;

    move-result-object v1

    invoke-static {v0, v1}, LW8/b;->q(LW8/b;LP8/u;)V

    iget-object v0, p0, LW8/b$c;->w:LW8/b;

    invoke-static {v0}, LW8/b;->j(LW8/b;)LP8/z;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LP8/z;->o()LP8/n;

    move-result-object v0

    iget-object v1, p0, LW8/b$c;->t:LP8/v;

    iget-object v2, p0, LW8/b$c;->w:LW8/b;

    invoke-static {v2}, LW8/b;->o(LW8/b;)LP8/u;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, LV8/e;->f(LP8/n;LP8/v;LP8/u;)V

    invoke-virtual {p0}, LW8/b$a;->a()V

    :cond_7b
    return-void

    :cond_7c
    :try_start_7c
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected chunk size and optional extensions but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, LW8/b$c;->u:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x22

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_9d
    .catch Ljava/lang/NumberFormatException; {:try_start_7c .. :try_end_9d} :catch_9d

    :catch_9d
    move-exception p0

    new-instance v0, Ljava/net/ProtocolException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public close()V
    .registers 3

    invoke-virtual {p0}, LW8/b$a;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-boolean v0, p0, LW8/b$c;->v:Z

    if-eqz v0, :cond_21

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, LQ8/d;->s(Le9/B;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_21

    iget-object v0, p0, LW8/b$c;->w:LW8/b;

    invoke-virtual {v0}, LW8/b;->f()LU8/f;

    move-result-object v0

    invoke-virtual {v0}, LU8/f;->z()V

    invoke-virtual {p0}, LW8/b$a;->a()V

    :cond_21
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

    if-ltz v2, :cond_5a

    invoke-virtual {p0}, LW8/b$a;->y()Z

    move-result v2

    if-nez v2, :cond_52

    iget-boolean v2, p0, LW8/b$c;->v:Z

    const-wide/16 v3, -0x1

    if-nez v2, :cond_18

    return-wide v3

    :cond_18
    iget-wide v5, p0, LW8/b$c;->u:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_22

    cmp-long v0, v5, v3

    if-nez v0, :cond_2a

    :cond_22
    invoke-direct {p0}, LW8/b$c;->f()V

    iget-boolean v0, p0, LW8/b$c;->v:Z

    if-nez v0, :cond_2a

    return-wide v3

    :cond_2a
    iget-wide v0, p0, LW8/b$c;->u:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, LW8/b$a;->e1(Le9/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-eqz p3, :cond_3e

    iget-wide v0, p0, LW8/b$c;->u:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, LW8/b$c;->u:J

    return-wide p1

    :cond_3e
    iget-object p1, p0, LW8/b$c;->w:LW8/b;

    invoke-virtual {p1}, LW8/b;->f()LU8/f;

    move-result-object p1

    invoke-virtual {p1}, LU8/f;->z()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LW8/b$a;->a()V

    throw p1

    :cond_52
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5a
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
