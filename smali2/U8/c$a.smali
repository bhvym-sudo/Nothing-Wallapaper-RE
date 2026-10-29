.class final LU8/c$a;
.super Le9/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final r:J

.field private s:Z

.field private t:J

.field private u:Z

.field final synthetic v:LU8/c;


# direct methods
.method public constructor <init>(LU8/c;Le9/z;J)V
    .registers 6

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LU8/c$a;->v:LU8/c;

    invoke-direct {p0, p2}, Le9/i;-><init>(Le9/z;)V

    iput-wide p3, p0, LU8/c$a;->r:J

    return-void
.end method

.method private final a(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 9

    iget-boolean v0, p0, LU8/c$a;->s:Z

    if-eqz v0, :cond_5

    return-object p1

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, LU8/c$a;->s:Z

    iget-object v1, p0, LU8/c$a;->v:LU8/c;

    iget-wide v2, p0, LU8/c$a;->t:J

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, LU8/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 8

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LU8/c$a;->u:Z

    if-nez v0, :cond_4c

    iget-wide v0, p0, LU8/c$a;->r:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_3d

    iget-wide v2, p0, LU8/c$a;->t:J

    add-long/2addr v2, p2

    cmp-long v0, v2, v0

    if-gtz v0, :cond_19

    goto :goto_3d

    :cond_19
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LU8/c$a;->r:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LU8/c$a;->t:J

    add-long/2addr v1, p2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3d
    :goto_3d
    :try_start_3d
    invoke-super {p0, p1, p2, p3}, Le9/i;->Z(Le9/e;J)V

    iget-wide v0, p0, LU8/c$a;->t:J

    add-long/2addr v0, p2

    iput-wide v0, p0, LU8/c$a;->t:J
    :try_end_45
    .catch Ljava/io/IOException; {:try_start_3d .. :try_end_45} :catch_46

    return-void

    :catch_46
    move-exception p1

    invoke-direct {p0, p1}, LU8/c$a;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :cond_4c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public close()V
    .registers 5

    iget-boolean v0, p0, LU8/c$a;->u:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, LU8/c$a;->u:Z

    iget-wide v0, p0, LU8/c$a;->r:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1f

    iget-wide v2, p0, LU8/c$a;->t:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_17

    goto :goto_1f

    :cond_17
    new-instance p0, Ljava/net/ProtocolException;

    const-string v0, "unexpected end of stream"

    invoke-direct {p0, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1f
    :goto_1f
    :try_start_1f
    invoke-super {p0}, Le9/i;->close()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LU8/c$a;->a(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_26} :catch_27

    return-void

    :catch_27
    move-exception v0

    invoke-direct {p0, v0}, LU8/c$a;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public flush()V
    .registers 2

    :try_start_0
    invoke-super {p0}, Le9/i;->flush()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_3} :catch_4

    return-void

    :catch_4
    move-exception v0

    invoke-direct {p0, v0}, LU8/c$a;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method
