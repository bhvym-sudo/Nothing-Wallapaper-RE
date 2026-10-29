.class public final LX8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV8/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/g$a;
    }
.end annotation


# static fields
.field public static final g:LX8/g$a;

.field private static final h:Ljava/util/List;

.field private static final i:Ljava/util/List;


# instance fields
.field private final a:LU8/f;

.field private final b:LV8/g;

.field private final c:LX8/f;

.field private volatile d:LX8/i;

.field private final e:LP8/A;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .registers 14

    new-instance v0, LX8/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/g;->g:LX8/g$a;

    const-string v12, ":scheme"

    const-string v13, ":authority"

    const-string v2, "connection"

    const-string v3, "host"

    const-string v4, "keep-alive"

    const-string v5, "proxy-connection"

    const-string v6, "te"

    const-string v7, "transfer-encoding"

    const-string v8, "encoding"

    const-string v9, "upgrade"

    const-string v10, ":method"

    const-string v11, ":path"

    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LQ8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LX8/g;->h:Ljava/util/List;

    const-string v7, "encoding"

    const-string v8, "upgrade"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LQ8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LX8/g;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LP8/z;LU8/f;LV8/g;LX8/f;)V
    .registers 6

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LX8/g;->a:LU8/f;

    iput-object p3, p0, LX8/g;->b:LV8/g;

    iput-object p4, p0, LX8/g;->c:LX8/f;

    invoke-virtual {p1}, LP8/z;->C()Ljava/util/List;

    move-result-object p1

    sget-object p2, LP8/A;->w:LP8/A;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2a

    goto :goto_2c

    :cond_2a
    sget-object p2, LP8/A;->v:LP8/A;

    :goto_2c
    iput-object p2, p0, LX8/g;->e:LP8/A;

    return-void
.end method

.method public static final synthetic i()Ljava/util/List;
    .registers 1

    sget-object v0, LX8/g;->h:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic j()Ljava/util/List;
    .registers 1

    sget-object v0, LX8/g;->i:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(LP8/B;J)Le9/z;
    .registers 4

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LX8/g;->d:LX8/i;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX8/i;->n()Le9/z;

    move-result-object p0

    return-object p0
.end method

.method public b(LP8/D;)Le9/B;
    .registers 3

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LX8/g;->d:LX8/i;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX8/i;->p()LX8/i$c;

    move-result-object p0

    return-object p0
.end method

.method public c()V
    .registers 1

    iget-object p0, p0, LX8/g;->d:LX8/i;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX8/i;->n()Le9/z;

    move-result-object p0

    invoke-interface {p0}, Le9/z;->close()V

    return-void
.end method

.method public cancel()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LX8/g;->f:Z

    iget-object p0, p0, LX8/g;->d:LX8/i;

    if-eqz p0, :cond_c

    sget-object v0, LX8/b;->A:LX8/b;

    invoke-virtual {p0, v0}, LX8/i;->f(LX8/b;)V

    :cond_c
    return-void
.end method

.method public d(LP8/D;)J
    .registers 2

    const-string p0, "response"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV8/e;->b(LP8/D;)Z

    move-result p0

    if-nez p0, :cond_e

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_e
    invoke-static {p1}, LQ8/d;->v(LP8/D;)J

    move-result-wide p0

    return-wide p0
.end method

.method public e(Z)LP8/D$a;
    .registers 4

    iget-object v0, p0, LX8/g;->d:LX8/i;

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, LX8/i;->C()LP8/u;

    move-result-object v0

    sget-object v1, LX8/g;->g:LX8/g$a;

    iget-object p0, p0, LX8/g;->e:LP8/A;

    invoke-virtual {v1, v0, p0}, LX8/g$a;->b(LP8/u;LP8/A;)LP8/D$a;

    move-result-object p0

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, LP8/D$a;->h()I

    move-result p1

    const/16 v0, 0x64

    if-ne p1, v0, :cond_1b

    const/4 p0, 0x0

    :cond_1b
    return-object p0

    :cond_1c
    new-instance p0, Ljava/io/IOException;

    const-string p1, "stream wasn\'t created"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public f()LU8/f;
    .registers 1

    iget-object p0, p0, LX8/g;->a:LU8/f;

    return-object p0
.end method

.method public g()V
    .registers 1

    iget-object p0, p0, LX8/g;->c:LX8/f;

    invoke-virtual {p0}, LX8/f;->flush()V

    return-void
.end method

.method public h(LP8/B;)V
    .registers 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX8/g;->d:LX8/i;

    if-eqz v0, :cond_a

    return-void

    :cond_a
    invoke-virtual {p1}, LP8/B;->a()LP8/C;

    move-result-object v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    sget-object v1, LX8/g;->g:LX8/g$a;

    invoke-virtual {v1, p1}, LX8/g$a;->a(LP8/B;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, LX8/g;->c:LX8/f;

    invoke-virtual {v1, p1, v0}, LX8/f;->l1(Ljava/util/List;Z)LX8/i;

    move-result-object p1

    iput-object p1, p0, LX8/g;->d:LX8/i;

    iget-boolean p1, p0, LX8/g;->f:Z

    if-nez p1, :cond_4e

    iget-object p1, p0, LX8/g;->d:LX8/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, LX8/i;->v()Le9/C;

    move-result-object p1

    iget-object v0, p0, LX8/g;->b:LV8/g;

    invoke-virtual {v0}, LV8/g;->i()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    iget-object p1, p0, LX8/g;->d:LX8/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, LX8/i;->E()Le9/C;

    move-result-object p1

    iget-object p0, p0, LX8/g;->b:LV8/g;

    invoke-virtual {p0}, LV8/g;->k()I

    move-result p0

    int-to-long v0, p0

    invoke-virtual {p1, v0, v1, v2}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    return-void

    :cond_4e
    iget-object p0, p0, LX8/g;->d:LX8/i;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object p1, LX8/b;->A:LX8/b;

    invoke-virtual {p0, p1}, LX8/i;->f(LX8/b;)V

    new-instance p0, Ljava/io/IOException;

    const-string p1, "Canceled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
