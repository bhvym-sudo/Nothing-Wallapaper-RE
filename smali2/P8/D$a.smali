.class public LP8/D$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LP8/B;

.field private b:LP8/A;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:LP8/t;

.field private f:LP8/u$a;

.field private g:LP8/E;

.field private h:LP8/D;

.field private i:LP8/D;

.field private j:LP8/D;

.field private k:J

.field private l:J

.field private m:LU8/c;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, LP8/D$a;->c:I

    .line 3
    new-instance v0, LP8/u$a;

    invoke-direct {v0}, LP8/u$a;-><init>()V

    iput-object v0, p0, LP8/D$a;->f:LP8/u$a;

    return-void
.end method

.method public constructor <init>(LP8/D;)V
    .registers 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, LP8/D$a;->c:I

    .line 6
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->a:LP8/B;

    .line 7
    invoke-virtual {p1}, LP8/D;->b0()LP8/A;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->b:LP8/A;

    .line 8
    invoke-virtual {p1}, LP8/D;->j()I

    move-result v0

    iput v0, p0, LP8/D$a;->c:I

    .line 9
    invoke-virtual {p1}, LP8/D;->K()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->d:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, LP8/D;->z()LP8/t;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->e:LP8/t;

    .line 11
    invoke-virtual {p1}, LP8/D;->I()LP8/u;

    move-result-object v0

    invoke-virtual {v0}, LP8/u;->f()LP8/u$a;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->f:LP8/u$a;

    .line 12
    invoke-virtual {p1}, LP8/D;->a()LP8/E;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->g:LP8/E;

    .line 13
    invoke-virtual {p1}, LP8/D;->Q()LP8/D;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->h:LP8/D;

    .line 14
    invoke-virtual {p1}, LP8/D;->f()LP8/D;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->i:LP8/D;

    .line 15
    invoke-virtual {p1}, LP8/D;->Y()LP8/D;

    move-result-object v0

    iput-object v0, p0, LP8/D$a;->j:LP8/D;

    .line 16
    invoke-virtual {p1}, LP8/D;->w0()J

    move-result-wide v0

    iput-wide v0, p0, LP8/D$a;->k:J

    .line 17
    invoke-virtual {p1}, LP8/D;->q0()J

    move-result-wide v0

    iput-wide v0, p0, LP8/D$a;->l:J

    .line 18
    invoke-virtual {p1}, LP8/D;->u()LU8/c;

    move-result-object p1

    iput-object p1, p0, LP8/D$a;->m:LU8/c;

    return-void
.end method

.method private final e(LP8/D;)V
    .registers 2

    if-eqz p1, :cond_11

    invoke-virtual {p1}, LP8/D;->a()LP8/E;

    move-result-object p0

    if-nez p0, :cond_9

    return-void

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "priorResponse.body != null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    return-void
.end method

.method private final f(Ljava/lang/String;LP8/D;)V
    .registers 3

    if-eqz p2, :cond_87

    invoke-virtual {p2}, LP8/D;->a()LP8/E;

    move-result-object p0

    if-nez p0, :cond_6c

    invoke-virtual {p2}, LP8/D;->Q()LP8/D;

    move-result-object p0

    if-nez p0, :cond_51

    invoke-virtual {p2}, LP8/D;->f()LP8/D;

    move-result-object p0

    if-nez p0, :cond_36

    invoke-virtual {p2}, LP8/D;->Y()LP8/D;

    move-result-object p0

    if-nez p0, :cond_1b

    return-void

    :cond_1b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_51
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6c
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_87
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)LP8/D$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/D$a;->f:LP8/u$a;

    invoke-virtual {v0, p1, p2}, LP8/u$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public b(LP8/E;)LP8/D$a;
    .registers 2

    iput-object p1, p0, LP8/D$a;->g:LP8/E;

    return-object p0
.end method

.method public c()LP8/D;
    .registers 17

    move-object/from16 v0, p0

    iget v4, v0, LP8/D$a;->c:I

    if-ltz v4, :cond_46

    iget-object v1, v0, LP8/D$a;->a:LP8/B;

    if-eqz v1, :cond_3e

    iget-object v2, v0, LP8/D$a;->b:LP8/A;

    if-eqz v2, :cond_36

    iget-object v3, v0, LP8/D$a;->d:Ljava/lang/String;

    if-eqz v3, :cond_2e

    iget-object v5, v0, LP8/D$a;->e:LP8/t;

    iget-object v6, v0, LP8/D$a;->f:LP8/u$a;

    invoke-virtual {v6}, LP8/u$a;->f()LP8/u;

    move-result-object v6

    iget-object v7, v0, LP8/D$a;->g:LP8/E;

    iget-object v8, v0, LP8/D$a;->h:LP8/D;

    iget-object v9, v0, LP8/D$a;->i:LP8/D;

    iget-object v10, v0, LP8/D$a;->j:LP8/D;

    iget-wide v11, v0, LP8/D$a;->k:J

    iget-wide v13, v0, LP8/D$a;->l:J

    iget-object v15, v0, LP8/D$a;->m:LU8/c;

    new-instance v0, LP8/D;

    invoke-direct/range {v0 .. v15}, LP8/D;-><init>(LP8/B;LP8/A;Ljava/lang/String;ILP8/t;LP8/u;LP8/E;LP8/D;LP8/D;LP8/D;JJLU8/c;)V

    return-object v0

    :cond_2e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, LP8/D$a;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public d(LP8/D;)LP8/D$a;
    .registers 3

    const-string v0, "cacheResponse"

    invoke-direct {p0, v0, p1}, LP8/D$a;->f(Ljava/lang/String;LP8/D;)V

    iput-object p1, p0, LP8/D$a;->i:LP8/D;

    return-object p0
.end method

.method public g(I)LP8/D$a;
    .registers 2

    iput p1, p0, LP8/D$a;->c:I

    return-object p0
.end method

.method public final h()I
    .registers 1

    iget p0, p0, LP8/D$a;->c:I

    return p0
.end method

.method public i(LP8/t;)LP8/D$a;
    .registers 2

    iput-object p1, p0, LP8/D$a;->e:LP8/t;

    return-object p0
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)LP8/D$a;
    .registers 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/D$a;->f:LP8/u$a;

    invoke-virtual {v0, p1, p2}, LP8/u$a;->i(Ljava/lang/String;Ljava/lang/String;)LP8/u$a;

    return-object p0
.end method

.method public k(LP8/u;)LP8/D$a;
    .registers 3

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP8/u;->f()LP8/u$a;

    move-result-object p1

    iput-object p1, p0, LP8/D$a;->f:LP8/u$a;

    return-object p0
.end method

.method public final l(LU8/c;)V
    .registers 3

    const-string v0, "deferredTrailers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/D$a;->m:LU8/c;

    return-void
.end method

.method public m(Ljava/lang/String;)LP8/D$a;
    .registers 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/D$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public n(LP8/D;)LP8/D$a;
    .registers 3

    const-string v0, "networkResponse"

    invoke-direct {p0, v0, p1}, LP8/D$a;->f(Ljava/lang/String;LP8/D;)V

    iput-object p1, p0, LP8/D$a;->h:LP8/D;

    return-object p0
.end method

.method public o(LP8/D;)LP8/D$a;
    .registers 2

    invoke-direct {p0, p1}, LP8/D$a;->e(LP8/D;)V

    iput-object p1, p0, LP8/D$a;->j:LP8/D;

    return-object p0
.end method

.method public p(LP8/A;)LP8/D$a;
    .registers 3

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/D$a;->b:LP8/A;

    return-object p0
.end method

.method public q(J)LP8/D$a;
    .registers 3

    iput-wide p1, p0, LP8/D$a;->l:J

    return-object p0
.end method

.method public r(LP8/B;)LP8/D$a;
    .registers 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/D$a;->a:LP8/B;

    return-object p0
.end method

.method public s(J)LP8/D$a;
    .registers 3

    iput-wide p1, p0, LP8/D$a;->k:J

    return-object p0
.end method
