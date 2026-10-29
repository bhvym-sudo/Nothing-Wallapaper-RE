.class public final LX8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final q:Le9/g;

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I


# direct methods
.method public constructor <init>(Le9/g;)V
    .registers 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX8/h$b;->q:Le9/g;

    return-void
.end method

.method private final b()V
    .registers 10

    iget v0, p0, LX8/h$b;->t:I

    iget-object v1, p0, LX8/h$b;->q:Le9/g;

    invoke-static {v1}, LQ8/d;->J(Le9/g;)I

    move-result v1

    iput v1, p0, LX8/h$b;->u:I

    iput v1, p0, LX8/h$b;->r:I

    iget-object v1, p0, LX8/h$b;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->readByte()B

    move-result v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, LQ8/d;->d(BI)I

    move-result v7

    iget-object v1, p0, LX8/h$b;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->readByte()B

    move-result v1

    invoke-static {v1, v2}, LQ8/d;->d(BI)I

    move-result v1

    iput v1, p0, LX8/h$b;->s:I

    sget-object v1, LX8/h;->u:LX8/h$a;

    invoke-virtual {v1}, LX8/h$a;->a()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v2

    if-eqz v2, :cond_46

    invoke-virtual {v1}, LX8/h$a;->a()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v3, LX8/e;->a:LX8/e;

    iget v5, p0, LX8/h$b;->t:I

    iget v6, p0, LX8/h$b;->r:I

    iget v8, p0, LX8/h$b;->s:I

    const/4 v4, 0x1

    invoke-virtual/range {v3 .. v8}, LX8/e;->c(ZIIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_46
    iget-object v1, p0, LX8/h$b;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    iput v1, p0, LX8/h$b;->t:I

    const/16 p0, 0x9

    if-ne v7, p0, :cond_61

    if-ne v1, v0, :cond_59

    return-void

    :cond_59
    new-instance p0, Ljava/io/IOException;

    const-string v0, "TYPE_CONTINUATION streamId changed"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_61
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " != TYPE_CONTINUATION"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()I
    .registers 1

    iget p0, p0, LX8/h$b;->u:I

    return p0
.end method

.method public close()V
    .registers 1

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, LX8/h$b;->q:Le9/g;

    invoke-interface {p0}, Le9/B;->e()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 10

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    iget v0, p0, LX8/h$b;->u:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_21

    iget-object v0, p0, LX8/h$b;->q:Le9/g;

    iget v3, p0, LX8/h$b;->v:I

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Le9/g;->skip(J)V

    const/4 v0, 0x0

    iput v0, p0, LX8/h$b;->v:I

    iget v0, p0, LX8/h$b;->s:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1d

    return-wide v1

    :cond_1d
    invoke-direct {p0}, LX8/h$b;->b()V

    goto :goto_5

    :cond_21
    iget-object v3, p0, LX8/h$b;->q:Le9/g;

    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_31

    return-wide v1

    :cond_31
    iget p3, p0, LX8/h$b;->u:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, LX8/h$b;->u:I

    return-wide p1
.end method

.method public final f(I)V
    .registers 2

    iput p1, p0, LX8/h$b;->s:I

    return-void
.end method

.method public final g(I)V
    .registers 2

    iput p1, p0, LX8/h$b;->u:I

    return-void
.end method

.method public final j(I)V
    .registers 2

    iput p1, p0, LX8/h$b;->r:I

    return-void
.end method

.method public final u(I)V
    .registers 2

    iput p1, p0, LX8/h$b;->v:I

    return-void
.end method

.method public final z(I)V
    .registers 2

    iput p1, p0, LX8/h$b;->t:I

    return-void
.end method
