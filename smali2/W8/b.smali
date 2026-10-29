.class public final LW8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV8/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/b$a;,
        LW8/b$b;,
        LW8/b$c;,
        LW8/b$d;,
        LW8/b$e;,
        LW8/b$f;,
        LW8/b$g;
    }
.end annotation


# static fields
.field public static final h:LW8/b$d;


# instance fields
.field private final a:LP8/z;

.field private final b:LU8/f;

.field private final c:Le9/g;

.field private final d:Le9/f;

.field private e:I

.field private final f:LW8/a;

.field private g:LP8/u;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW8/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW8/b$d;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW8/b;->h:LW8/b$d;

    return-void
.end method

.method public constructor <init>(LP8/z;LU8/f;Le9/g;Le9/f;)V
    .registers 6

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/b;->a:LP8/z;

    iput-object p2, p0, LW8/b;->b:LU8/f;

    iput-object p3, p0, LW8/b;->c:Le9/g;

    iput-object p4, p0, LW8/b;->d:Le9/f;

    new-instance p1, LW8/a;

    invoke-direct {p1, p3}, LW8/a;-><init>(Le9/g;)V

    iput-object p1, p0, LW8/b;->f:LW8/a;

    return-void
.end method

.method public static final synthetic i(LW8/b;Le9/k;)V
    .registers 2

    invoke-direct {p0, p1}, LW8/b;->r(Le9/k;)V

    return-void
.end method

.method public static final synthetic j(LW8/b;)LP8/z;
    .registers 1

    iget-object p0, p0, LW8/b;->a:LP8/z;

    return-object p0
.end method

.method public static final synthetic k(LW8/b;)LW8/a;
    .registers 1

    iget-object p0, p0, LW8/b;->f:LW8/a;

    return-object p0
.end method

.method public static final synthetic l(LW8/b;)Le9/f;
    .registers 1

    iget-object p0, p0, LW8/b;->d:Le9/f;

    return-object p0
.end method

.method public static final synthetic m(LW8/b;)Le9/g;
    .registers 1

    iget-object p0, p0, LW8/b;->c:Le9/g;

    return-object p0
.end method

.method public static final synthetic n(LW8/b;)I
    .registers 1

    iget p0, p0, LW8/b;->e:I

    return p0
.end method

.method public static final synthetic o(LW8/b;)LP8/u;
    .registers 1

    iget-object p0, p0, LW8/b;->g:LP8/u;

    return-object p0
.end method

.method public static final synthetic p(LW8/b;I)V
    .registers 2

    iput p1, p0, LW8/b;->e:I

    return-void
.end method

.method public static final synthetic q(LW8/b;LP8/u;)V
    .registers 2

    iput-object p1, p0, LW8/b;->g:LP8/u;

    return-void
.end method

.method private final r(Le9/k;)V
    .registers 3

    invoke-virtual {p1}, Le9/k;->i()Le9/C;

    move-result-object p0

    sget-object v0, Le9/C;->e:Le9/C;

    invoke-virtual {p1, v0}, Le9/k;->j(Le9/C;)Le9/k;

    invoke-virtual {p0}, Le9/C;->a()Le9/C;

    invoke-virtual {p0}, Le9/C;->b()Le9/C;

    return-void
.end method

.method private final s(LP8/B;)Z
    .registers 3

    const-string p0, "Transfer-Encoding"

    invoke-virtual {p1, p0}, LP8/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    const-string v0, "chunked"

    invoke-static {v0, p0, p1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private final t(LP8/D;)Z
    .registers 4

    const/4 p0, 0x0

    const/4 v0, 0x2

    const-string v1, "Transfer-Encoding"

    invoke-static {p1, v1, p0, v0, p0}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    const-string v0, "chunked"

    invoke-static {v0, p0, p1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private final u()Le9/z;
    .registers 3

    iget v0, p0, LW8/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_e

    const/4 v0, 0x2

    iput v0, p0, LW8/b;->e:I

    new-instance v0, LW8/b$b;

    invoke-direct {v0, p0}, LW8/b$b;-><init>(LW8/b;)V

    return-object v0

    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final v(LP8/v;)Le9/B;
    .registers 4

    iget v0, p0, LW8/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    const/4 v0, 0x5

    iput v0, p0, LW8/b;->e:I

    new-instance v0, LW8/b$c;

    invoke-direct {v0, p0, p1}, LW8/b$c;-><init>(LW8/b;LP8/v;)V

    return-object v0

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final w(J)Le9/B;
    .registers 5

    iget v0, p0, LW8/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    const/4 v0, 0x5

    iput v0, p0, LW8/b;->e:I

    new-instance v0, LW8/b$e;

    invoke-direct {v0, p0, p1, p2}, LW8/b$e;-><init>(LW8/b;J)V

    return-object v0

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final x()Le9/z;
    .registers 3

    iget v0, p0, LW8/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_e

    const/4 v0, 0x2

    iput v0, p0, LW8/b;->e:I

    new-instance v0, LW8/b$f;

    invoke-direct {v0, p0}, LW8/b$f;-><init>(LW8/b;)V

    return-object v0

    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final y()Le9/B;
    .registers 3

    iget v0, p0, LW8/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_15

    const/4 v0, 0x5

    iput v0, p0, LW8/b;->e:I

    invoke-virtual {p0}, LW8/b;->f()LU8/f;

    move-result-object v0

    invoke-virtual {v0}, LU8/f;->z()V

    new-instance v0, LW8/b$g;

    invoke-direct {v0, p0}, LW8/b$g;-><init>(LW8/b;)V

    return-object v0

    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final A(LP8/u;Ljava/lang/String;)V
    .registers 7

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LW8/b;->e:I

    if-nez v0, :cond_47

    iget-object v0, p0, LW8/b;->d:Le9/f;

    invoke-interface {v0, p2}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-virtual {p1}, LP8/u;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_1e
    if-ge v1, p2, :cond_3e

    iget-object v2, p0, LW8/b;->d:Le9/f;

    invoke-virtual {p1, v1}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v2

    const-string v3, ": "

    invoke-interface {v2, v3}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v2

    invoke-virtual {p1, v1}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v2

    invoke-interface {v2, v0}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1e

    :cond_3e
    iget-object p1, p0, LW8/b;->d:Le9/f;

    invoke-interface {p1, v0}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    const/4 p1, 0x1

    iput p1, p0, LW8/b;->e:I

    return-void

    :cond_47
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(LP8/B;J)Le9/z;
    .registers 6

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP8/B;->a()LP8/C;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {p1}, LP8/B;->a()LP8/C;

    move-result-object v0

    invoke-virtual {v0}, LP8/C;->e()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_1e

    :cond_16
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1e
    :goto_1e
    invoke-direct {p0, p1}, LW8/b;->s(LP8/B;)Z

    move-result p1

    if-eqz p1, :cond_29

    invoke-direct {p0}, LW8/b;->u()Le9/z;

    move-result-object p0

    return-object p0

    :cond_29
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_34

    invoke-direct {p0}, LW8/b;->x()Le9/z;

    move-result-object p0

    return-object p0

    :cond_34
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public b(LP8/D;)Le9/B;
    .registers 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV8/e;->b(LP8/D;)Z

    move-result v0

    if-nez v0, :cond_12

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, LW8/b;->w(J)Le9/B;

    move-result-object p0

    return-object p0

    :cond_12
    invoke-direct {p0, p1}, LW8/b;->t(LP8/D;)Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p1

    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object p1

    invoke-direct {p0, p1}, LW8/b;->v(LP8/v;)Le9/B;

    move-result-object p0

    return-object p0

    :cond_25
    invoke-static {p1}, LQ8/d;->v(LP8/D;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_34

    invoke-direct {p0, v0, v1}, LW8/b;->w(J)Le9/B;

    move-result-object p0

    return-object p0

    :cond_34
    invoke-direct {p0}, LW8/b;->y()Le9/B;

    move-result-object p0

    return-object p0
.end method

.method public c()V
    .registers 1

    iget-object p0, p0, LW8/b;->d:Le9/f;

    invoke-interface {p0}, Le9/f;->flush()V

    return-void
.end method

.method public cancel()V
    .registers 1

    invoke-virtual {p0}, LW8/b;->f()LU8/f;

    move-result-object p0

    invoke-virtual {p0}, LU8/f;->e()V

    return-void
.end method

.method public d(LP8/D;)J
    .registers 3

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV8/e;->b(LP8/D;)Z

    move-result v0

    if-nez v0, :cond_e

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_e
    invoke-direct {p0, p1}, LW8/b;->t(LP8/D;)Z

    move-result p0

    if-eqz p0, :cond_17

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_17
    invoke-static {p1}, LQ8/d;->v(LP8/D;)J

    move-result-wide p0

    return-wide p0
.end method

.method public e(Z)LP8/D$a;
    .registers 6

    iget v0, p0, LW8/b;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq v0, v1, :cond_29

    const/4 v1, 0x2

    if-eq v0, v1, :cond_29

    if-ne v0, v2, :cond_c

    goto :goto_29

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LW8/b;->e:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_29
    :goto_29
    :try_start_29
    sget-object v0, LV8/k;->d:LV8/k$a;

    iget-object v1, p0, LW8/b;->f:LW8/a;

    invoke-virtual {v1}, LW8/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LV8/k$a;->a(Ljava/lang/String;)LV8/k;

    move-result-object v0

    new-instance v1, LP8/D$a;

    invoke-direct {v1}, LP8/D$a;-><init>()V

    iget-object v3, v0, LV8/k;->a:LP8/A;

    invoke-virtual {v1, v3}, LP8/D$a;->p(LP8/A;)LP8/D$a;

    move-result-object v1

    iget v3, v0, LV8/k;->b:I

    invoke-virtual {v1, v3}, LP8/D$a;->g(I)LP8/D$a;

    move-result-object v1

    iget-object v3, v0, LV8/k;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, LP8/D$a;->m(Ljava/lang/String;)LP8/D$a;

    move-result-object v1

    iget-object v3, p0, LW8/b;->f:LW8/a;

    invoke-virtual {v3}, LW8/a;->a()LP8/u;

    move-result-object v3

    invoke-virtual {v1, v3}, LP8/D$a;->k(LP8/u;)LP8/D$a;

    move-result-object v1

    const/16 v3, 0x64

    if-eqz p1, :cond_62

    iget p1, v0, LV8/k;->b:I

    if-ne p1, v3, :cond_62

    const/4 p0, 0x0

    return-object p0

    :catch_60
    move-exception p1

    goto :goto_78

    :cond_62
    iget p1, v0, LV8/k;->b:I

    if-ne p1, v3, :cond_69

    iput v2, p0, LW8/b;->e:I

    return-object v1

    :cond_69
    const/16 v0, 0x66

    if-gt v0, p1, :cond_74

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_74

    iput v2, p0, LW8/b;->e:I

    return-object v1

    :cond_74
    const/4 p1, 0x4

    iput p1, p0, LW8/b;->e:I
    :try_end_77
    .catch Ljava/io/EOFException; {:try_start_29 .. :try_end_77} :catch_60

    return-object v1

    :goto_78
    invoke-virtual {p0}, LW8/b;->f()LU8/f;

    move-result-object p0

    invoke-virtual {p0}, LU8/f;->A()LP8/F;

    move-result-object p0

    invoke-virtual {p0}, LP8/F;->a()LP8/a;

    move-result-object p0

    invoke-virtual {p0}, LP8/a;->l()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->p()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected end of stream on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public f()LU8/f;
    .registers 1

    iget-object p0, p0, LW8/b;->b:LU8/f;

    return-object p0
.end method

.method public g()V
    .registers 1

    iget-object p0, p0, LW8/b;->d:Le9/f;

    invoke-interface {p0}, Le9/f;->flush()V

    return-void
.end method

.method public h(LP8/B;)V
    .registers 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LV8/i;->a:LV8/i;

    invoke-virtual {p0}, LW8/b;->f()LU8/f;

    move-result-object v1

    invoke-virtual {v1}, LU8/f;->A()LP8/F;

    move-result-object v1

    invoke-virtual {v1}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    const-string v2, "connection.route().proxy.type()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, LV8/i;->a(LP8/B;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LP8/B;->e()LP8/u;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LW8/b;->A(LP8/u;Ljava/lang/String;)V

    return-void
.end method

.method public final z(LP8/D;)V
    .registers 6

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LQ8/d;->v(LP8/D;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_10

    return-void

    :cond_10
    invoke-direct {p0, v0, v1}, LW8/b;->w(J)Le9/B;

    move-result-object p0

    const p1, 0x7fffffff

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, v0}, LQ8/d;->L(Le9/B;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p0}, Le9/B;->close()V

    return-void
.end method
