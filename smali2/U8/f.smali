.class public final LU8/f;
.super LX8/f$c;
.source "SourceFile"

# interfaces
.implements LP8/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU8/f$a;,
        LU8/f$b;
    }
.end annotation


# static fields
.field public static final t:LU8/f$a;


# instance fields
.field private final c:LU8/g;

.field private final d:LP8/F;

.field private e:Ljava/net/Socket;

.field private f:Ljava/net/Socket;

.field private g:LP8/t;

.field private h:LP8/A;

.field private i:LX8/f;

.field private j:Le9/g;

.field private k:Le9/f;

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private final r:Ljava/util/List;

.field private s:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LU8/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU8/f$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LU8/f;->t:LU8/f$a;

    return-void
.end method

.method public constructor <init>(LU8/g;LP8/F;)V
    .registers 4

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LX8/f$c;-><init>()V

    iput-object p1, p0, LU8/f;->c:LU8/g;

    iput-object p2, p0, LU8/f;->d:LP8/F;

    const/4 p1, 0x1

    iput p1, p0, LU8/f;->q:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LU8/f;->r:Ljava/util/List;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, LU8/f;->s:J

    return-void
.end method

.method private final B(Ljava/util/List;)Z
    .registers 6

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    return v1

    :cond_11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP8/F;

    invoke-virtual {v0}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_15

    iget-object v2, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v2}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-ne v2, v3, :cond_15

    iget-object v2, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v2}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v0}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_4b
    return v1
.end method

.method private final F(I)V
    .registers 9

    iget-object v0, p0, LU8/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, p0, LU8/f;->j:Le9/g;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, p0, LU8/f;->k:Le9/f;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, LX8/f$a;

    const/4 v5, 0x1

    sget-object v6, LT8/e;->i:LT8/e;

    invoke-direct {v4, v5, v6}, LX8/f$a;-><init>(ZLT8/e;)V

    iget-object v5, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v5}, LP8/F;->a()LP8/a;

    move-result-object v5

    invoke-virtual {v5}, LP8/a;->l()LP8/v;

    move-result-object v5

    invoke-virtual {v5}, LP8/v;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5, v1, v2}, LX8/f$a;->q(Ljava/net/Socket;Ljava/lang/String;Le9/g;Le9/f;)LX8/f$a;

    move-result-object v0

    invoke-virtual {v0, p0}, LX8/f$a;->k(LX8/f$c;)LX8/f$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LX8/f$a;->l(I)LX8/f$a;

    move-result-object p1

    invoke-virtual {p1}, LX8/f$a;->a()LX8/f;

    move-result-object p1

    iput-object p1, p0, LU8/f;->i:LX8/f;

    sget-object v0, LX8/f;->S:LX8/f$b;

    invoke-virtual {v0}, LX8/f$b;->a()LX8/m;

    move-result-object v0

    invoke-virtual {v0}, LX8/m;->d()I

    move-result v0

    iput v0, p0, LU8/f;->q:I

    const/4 p0, 0x0

    const/4 v0, 0x3

    invoke-static {p1, v3, p0, v0, p0}, LX8/f;->x1(LX8/f;ZLT8/e;ILjava/lang/Object;)V

    return-void
.end method

.method private final G(LP8/v;)Z
    .registers 6

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {p1}, LP8/v;->n()I

    move-result v1

    invoke-virtual {v0}, LP8/v;->n()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_48

    return v3

    :cond_48
    invoke-virtual {p1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_58

    return v1

    :cond_58
    iget-boolean v0, p0, LU8/f;->m:Z

    if-nez v0, :cond_6a

    iget-object v0, p0, LU8/f;->g:LP8/t;

    if-eqz v0, :cond_6a

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, LU8/f;->f(LP8/v;LP8/t;)Z

    move-result p0

    if-eqz p0, :cond_6a

    return v1

    :cond_6a
    return v3
.end method

.method public static final synthetic d(LU8/f;)LP8/t;
    .registers 1

    iget-object p0, p0, LU8/f;->g:LP8/t;

    return-object p0
.end method

.method private final f(LP8/v;LP8/t;)Z
    .registers 5

    invoke-virtual {p2}, LP8/t;->d()Ljava/util/List;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_27

    sget-object p2, Lc9/d;->a:Lc9/d;

    invoke-virtual {p1}, LP8/v;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/security/cert/X509Certificate;

    invoke-virtual {p2, p1, p0}, Lc9/d;->e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p0

    if-eqz p0, :cond_27

    const/4 p0, 0x1

    return p0

    :cond_27
    return v0
.end method

.method private final i(IILP8/e;LP8/r;)V
    .registers 9

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v0

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->a()LP8/a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_14

    const/4 v2, -0x1

    goto :goto_1c

    :cond_14
    sget-object v3, LU8/f$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_1c
    const/4 v3, 0x1

    if-eq v2, v3, :cond_28

    const/4 v3, 0x2

    if-eq v2, v3, :cond_28

    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_33

    :cond_28
    invoke-virtual {v1}, LP8/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_33
    iput-object v1, p0, LU8/f;->e:Ljava/net/Socket;

    iget-object v2, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v2}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {p4, p3, v2, v0}, LP8/r;->i(LP8/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    invoke-virtual {v1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_41
    sget-object p2, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {p2}, LZ8/h$a;->g()LZ8/h;

    move-result-object p2

    iget-object p3, p0, LU8/f;->d:LP8/F;

    invoke-virtual {p3}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object p3

    invoke-virtual {p2, v1, p3, p1}, LZ8/h;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_50
    .catch Ljava/net/ConnectException; {:try_start_41 .. :try_end_50} :catch_79

    :try_start_50
    invoke-static {v1}, Le9/o;->l(Ljava/net/Socket;)Le9/B;

    move-result-object p1

    invoke-static {p1}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p1

    iput-object p1, p0, LU8/f;->j:Le9/g;

    invoke-static {v1}, Le9/o;->h(Ljava/net/Socket;)Le9/z;

    move-result-object p1

    invoke-static {p1}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object p1

    iput-object p1, p0, LU8/f;->k:Le9/f;
    :try_end_64
    .catch Ljava/lang/NullPointerException; {:try_start_50 .. :try_end_64} :catch_65

    return-void

    :catch_65
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "throw with null exception"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_73

    return-void

    :cond_73
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_79
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {p0}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method private final j(LU8/b;)V
    .registers 12

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_b
    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, LU8/f;->e:Ljava/net/Socket;

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v4

    invoke-virtual {v4}, LP8/v;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v5

    invoke-virtual {v5}, LP8/v;->n()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_2c
    .catchall {:try_start_b .. :try_end_2c} :catchall_174

    :try_start_2c
    invoke-virtual {p1, v1}, LU8/b;->a(Ljavax/net/ssl/SSLSocket;)LP8/l;

    move-result-object p1

    invoke-virtual {p1}, LP8/l;->h()Z

    move-result v3

    if-eqz v3, :cond_50

    sget-object v3, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v3}, LZ8/h$a;->g()LZ8/h;

    move-result-object v3

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v4

    invoke-virtual {v4}, LP8/v;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LP8/a;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, LZ8/h;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_50

    :catchall_4c
    move-exception p0

    move-object v2, v1

    goto/16 :goto_175

    :cond_50
    :goto_50
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    sget-object v4, LP8/t;->e:LP8/t$a;

    const-string v5, "sslSocketSession"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, LP8/t$a;->a(Ljavax/net/ssl/SSLSession;)LP8/t;

    move-result-object v4

    invoke-virtual {v0}, LP8/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v7

    invoke-virtual {v7}, LP8/v;->i()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_108

    invoke-virtual {v4}, LP8/t;->d()Ljava/util/List;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_e4

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/security/cert/X509Certificate;

    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\n              |Hostname "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n              |    certificate: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, LP8/g;->c:LP8/g$b;

    invoke-virtual {v0, p0}, LP8/g$b;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    DN: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    subjectAltNames: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lc9/d;->a:Lc9/d;

    invoke-virtual {v0, p0}, Lc9/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\n              "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2, v6, v2}, LE8/i;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e4
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Hostname "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_108
    invoke-virtual {v0}, LP8/a;->a()LP8/g;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    new-instance v5, LP8/t;

    invoke-virtual {v4}, LP8/t;->e()LP8/G;

    move-result-object v6

    invoke-virtual {v4}, LP8/t;->a()LP8/i;

    move-result-object v7

    invoke-virtual {v4}, LP8/t;->c()Ljava/util/List;

    move-result-object v8

    new-instance v9, LU8/f$c;

    invoke-direct {v9, v3, v4, v0}, LU8/f$c;-><init>(LP8/g;LP8/t;LP8/a;)V

    invoke-direct {v5, v6, v7, v8, v9}, LP8/t;-><init>(LP8/G;LP8/i;Ljava/util/List;Lv8/a;)V

    iput-object v5, p0, LU8/f;->g:LP8/t;

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v4, LU8/f$d;

    invoke-direct {v4, p0}, LU8/f$d;-><init>(LU8/f;)V

    invoke-virtual {v3, v0, v4}, LP8/g;->b(Ljava/lang/String;Lv8/a;)V

    invoke-virtual {p1}, LP8/l;->h()Z

    move-result p1

    if-eqz p1, :cond_147

    sget-object p1, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {p1}, LZ8/h$a;->g()LZ8/h;

    move-result-object p1

    invoke-virtual {p1, v1}, LZ8/h;->g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_147
    iput-object v1, p0, LU8/f;->f:Ljava/net/Socket;

    invoke-static {v1}, Le9/o;->l(Ljava/net/Socket;)Le9/B;

    move-result-object p1

    invoke-static {p1}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p1

    iput-object p1, p0, LU8/f;->j:Le9/g;

    invoke-static {v1}, Le9/o;->h(Ljava/net/Socket;)Le9/z;

    move-result-object p1

    invoke-static {p1}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object p1

    iput-object p1, p0, LU8/f;->k:Le9/f;

    if-eqz v2, :cond_166

    sget-object p1, LP8/A;->r:LP8/A$a;

    invoke-virtual {p1, v2}, LP8/A$a;->a(Ljava/lang/String;)LP8/A;

    move-result-object p1

    goto :goto_168

    :cond_166
    sget-object p1, LP8/A;->t:LP8/A;

    :goto_168
    iput-object p1, p0, LU8/f;->h:LP8/A;
    :try_end_16a
    .catchall {:try_start_2c .. :try_end_16a} :catchall_4c

    sget-object p0, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {p0}, LZ8/h$a;->g()LZ8/h;

    move-result-object p0

    invoke-virtual {p0, v1}, LZ8/h;->b(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_174
    move-exception p0

    :goto_175
    if-eqz v2, :cond_180

    sget-object p1, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {p1}, LZ8/h$a;->g()LZ8/h;

    move-result-object p1

    invoke-virtual {p1, v2}, LZ8/h;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_180
    if-eqz v2, :cond_185

    invoke-static {v2}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_185
    throw p0
.end method

.method private final k(IIILP8/e;LP8/r;)V
    .registers 12

    invoke-direct {p0}, LU8/f;->m()LP8/B;

    move-result-object v0

    invoke-virtual {v0}, LP8/B;->j()LP8/v;

    move-result-object v1

    const/4 v2, 0x0

    :goto_9
    const/16 v3, 0x15

    if-ge v2, v3, :cond_37

    invoke-direct {p0, p1, p2, p4, p5}, LU8/f;->i(IILP8/e;LP8/r;)V

    invoke-direct {p0, p2, p3, v0, v1}, LU8/f;->l(IILP8/B;LP8/v;)LP8/B;

    move-result-object v0

    if-nez v0, :cond_17

    goto :goto_37

    :cond_17
    iget-object v3, p0, LU8/f;->e:Ljava/net/Socket;

    if-eqz v3, :cond_1e

    invoke-static {v3}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_1e
    const/4 v3, 0x0

    iput-object v3, p0, LU8/f;->e:Ljava/net/Socket;

    iput-object v3, p0, LU8/f;->k:Le9/f;

    iput-object v3, p0, LU8/f;->j:Le9/g;

    iget-object v4, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v4}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v5}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, LP8/r;->g(LP8/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LP8/A;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_37
    :goto_37
    return-void
.end method

.method private final l(IILP8/B;LP8/v;)LP8/B;
    .registers 14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, LQ8/d;->Q(LP8/v;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_1b
    iget-object v0, p0, LU8/f;->j:Le9/g;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, p0, LU8/f;->k:Le9/f;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    new-instance v3, LW8/b;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0, v0, v2}, LW8/b;-><init>(LP8/z;LU8/f;Le9/g;Le9/f;)V

    invoke-interface {v0}, Le9/B;->e()Le9/C;

    move-result-object v5

    int-to-long v6, p1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v6, v7, v8}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    invoke-interface {v2}, Le9/z;->e()Le9/C;

    move-result-object v5

    int-to-long v6, p2

    invoke-virtual {v5, v6, v7, v8}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    invoke-virtual {p3}, LP8/B;->e()LP8/u;

    move-result-object v5

    invoke-virtual {v3, v5, p4}, LW8/b;->A(LP8/u;Ljava/lang/String;)V

    invoke-virtual {v3}, LW8/b;->c()V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, LW8/b;->e(Z)LP8/D$a;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v5, p3}, LP8/D$a;->r(LP8/B;)LP8/D$a;

    move-result-object p3

    invoke-virtual {p3}, LP8/D$a;->c()LP8/D;

    move-result-object p3

    invoke-virtual {v3, p3}, LW8/b;->z(LP8/D;)V

    invoke-virtual {p3}, LP8/D;->j()I

    move-result v3

    const/16 v5, 0xc8

    if-eq v3, v5, :cond_ad

    const/16 v0, 0x197

    if-ne v3, v0, :cond_92

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->h()LP8/b;

    move-result-object v0

    iget-object v2, p0, LU8/f;->d:LP8/F;

    invoke-interface {v0, v2, p3}, LP8/b;->a(LP8/F;LP8/D;)LP8/B;

    move-result-object v0

    if-eqz v0, :cond_8a

    const-string v2, "Connection"

    const/4 v3, 0x2

    invoke-static {p3, v2, v4, v3, v4}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "close"

    invoke-static {v2, p3, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_88

    return-object v0

    :cond_88
    move-object p3, v0

    goto :goto_1b

    :cond_8a
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Failed to authenticate with proxy"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_92
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unexpected response code for CONNECT: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, LP8/D;->j()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_ad
    invoke-interface {v0}, Le9/g;->d()Le9/e;

    move-result-object p0

    invoke-virtual {p0}, Le9/e;->D()Z

    move-result p0

    if-eqz p0, :cond_c2

    invoke-interface {v2}, Le9/f;->d()Le9/e;

    move-result-object p0

    invoke-virtual {p0}, Le9/e;->D()Z

    move-result p0

    if-eqz p0, :cond_c2

    return-object v4

    :cond_c2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "TLS tunnel buffered too many bytes!"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final m()LP8/B;
    .registers 5

    new-instance v0, LP8/B$a;

    invoke-direct {v0}, LP8/B$a;-><init>()V

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->a()LP8/a;

    move-result-object v1

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/B$a;->h(LP8/v;)LP8/B$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LP8/B$a;->e(Ljava/lang/String;LP8/C;)LP8/B$a;

    move-result-object v0

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->a()LP8/a;

    move-result-object v1

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, LQ8/d;->Q(LP8/v;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object v0

    const-string v1, "User-Agent"

    const-string v2, "okhttp/4.12.0"

    invoke-virtual {v0, v1, v2}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/B$a;->b()LP8/B;

    move-result-object v0

    new-instance v1, LP8/D$a;

    invoke-direct {v1}, LP8/D$a;-><init>()V

    invoke-virtual {v1, v0}, LP8/D$a;->r(LP8/B;)LP8/D$a;

    move-result-object v1

    sget-object v2, LP8/A;->t:LP8/A;

    invoke-virtual {v1, v2}, LP8/D$a;->p(LP8/A;)LP8/D$a;

    move-result-object v1

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, LP8/D$a;->g(I)LP8/D$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, LP8/D$a;->m(Ljava/lang/String;)LP8/D$a;

    move-result-object v1

    sget-object v2, LQ8/d;->c:LP8/E;

    invoke-virtual {v1, v2}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, LP8/D$a;->s(J)LP8/D$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, LP8/D$a;->q(J)LP8/D$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, LP8/D$a;->j(Ljava/lang/String;Ljava/lang/String;)LP8/D$a;

    move-result-object v1

    invoke-virtual {v1}, LP8/D$a;->c()LP8/D;

    move-result-object v1

    iget-object v2, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v2}, LP8/F;->a()LP8/a;

    move-result-object v2

    invoke-virtual {v2}, LP8/a;->h()LP8/b;

    move-result-object v2

    iget-object p0, p0, LU8/f;->d:LP8/F;

    invoke-interface {v2, p0, v1}, LP8/b;->a(LP8/F;LP8/D;)LP8/B;

    move-result-object p0

    if-nez p0, :cond_8d

    return-object v0

    :cond_8d
    return-object p0
.end method

.method private final n(LU8/b;ILP8/e;LP8/r;)V
    .registers 6

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_31

    iget-object p1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {p1}, LP8/F;->a()LP8/a;

    move-result-object p1

    invoke-virtual {p1}, LP8/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, LP8/A;->w:LP8/A;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_28

    iget-object p1, p0, LU8/f;->e:Ljava/net/Socket;

    iput-object p1, p0, LU8/f;->f:Ljava/net/Socket;

    iput-object p3, p0, LU8/f;->h:LP8/A;

    invoke-direct {p0, p2}, LU8/f;->F(I)V

    return-void

    :cond_28
    iget-object p1, p0, LU8/f;->e:Ljava/net/Socket;

    iput-object p1, p0, LU8/f;->f:Ljava/net/Socket;

    sget-object p1, LP8/A;->t:LP8/A;

    iput-object p1, p0, LU8/f;->h:LP8/A;

    return-void

    :cond_31
    invoke-virtual {p4, p3}, LP8/r;->B(LP8/e;)V

    invoke-direct {p0, p1}, LU8/f;->j(LU8/b;)V

    iget-object p1, p0, LU8/f;->g:LP8/t;

    invoke-virtual {p4, p3, p1}, LP8/r;->A(LP8/e;LP8/t;)V

    iget-object p1, p0, LU8/f;->h:LP8/A;

    sget-object p3, LP8/A;->v:LP8/A;

    if-ne p1, p3, :cond_45

    invoke-direct {p0, p2}, LU8/f;->F(I)V

    :cond_45
    return-void
.end method


# virtual methods
.method public A()LP8/F;
    .registers 1

    iget-object p0, p0, LU8/f;->d:LP8/F;

    return-object p0
.end method

.method public final C(J)V
    .registers 3

    iput-wide p1, p0, LU8/f;->s:J

    return-void
.end method

.method public final D(Z)V
    .registers 2

    iput-boolean p1, p0, LU8/f;->l:Z

    return-void
.end method

.method public E()Ljava/net/Socket;
    .registers 1

    iget-object p0, p0, LU8/f;->f:Ljava/net/Socket;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final declared-synchronized H(LU8/e;Ljava/io/IOException;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LX8/n;

    const/4 v1, 0x1

    if-eqz v0, :cond_3b

    move-object v0, p2

    check-cast v0, LX8/n;

    iget-object v0, v0, LX8/n;->q:LX8/b;

    sget-object v2, LX8/b;->z:LX8/b;

    if-ne v0, v2, :cond_25

    iget p1, p0, LU8/f;->p:I

    add-int/2addr p1, v1

    iput p1, p0, LU8/f;->p:I

    if-le p1, v1, :cond_5b

    iput-boolean v1, p0, LU8/f;->l:Z

    iget p1, p0, LU8/f;->n:I

    add-int/2addr p1, v1

    iput p1, p0, LU8/f;->n:I

    goto :goto_5b

    :catchall_23
    move-exception p1

    goto :goto_5d

    :cond_25
    check-cast p2, LX8/n;

    iget-object p2, p2, LX8/n;->q:LX8/b;

    sget-object v0, LX8/b;->A:LX8/b;

    if-ne p2, v0, :cond_33

    invoke-virtual {p1}, LU8/e;->f()Z

    move-result p1

    if-nez p1, :cond_5b

    :cond_33
    iput-boolean v1, p0, LU8/f;->l:Z

    iget p1, p0, LU8/f;->n:I

    add-int/2addr p1, v1

    iput p1, p0, LU8/f;->n:I

    goto :goto_5b

    :cond_3b
    invoke-virtual {p0}, LU8/f;->w()Z

    move-result v0

    if-eqz v0, :cond_45

    instance-of v0, p2, LX8/a;

    if-eqz v0, :cond_5b

    :cond_45
    iput-boolean v1, p0, LU8/f;->l:Z

    iget v0, p0, LU8/f;->o:I

    if-nez v0, :cond_5b

    if-eqz p2, :cond_56

    invoke-virtual {p1}, LU8/e;->n()LP8/z;

    move-result-object p1

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {p0, p1, v0, p2}, LU8/f;->h(LP8/z;LP8/F;Ljava/io/IOException;)V

    :cond_56
    iget p1, p0, LU8/f;->n:I

    add-int/2addr p1, v1

    iput p1, p0, LU8/f;->n:I
    :try_end_5b
    .catchall {:try_start_1 .. :try_end_5b} :catchall_23

    :cond_5b
    :goto_5b
    monitor-exit p0

    return-void

    :goto_5d
    :try_start_5d
    monitor-exit p0
    :try_end_5e
    .catchall {:try_start_5d .. :try_end_5e} :catchall_23

    throw p1
.end method

.method public a()LP8/A;
    .registers 1

    iget-object p0, p0, LU8/f;->h:LP8/A;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public declared-synchronized b(LX8/f;LX8/m;)V
    .registers 4

    monitor-enter p0

    :try_start_1
    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LX8/m;->d()I

    move-result p1

    iput p1, p0, LU8/f;->q:I
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_13

    monitor-exit p0

    return-void

    :catchall_13
    move-exception p1

    :try_start_14
    monitor-exit p0
    :try_end_15
    .catchall {:try_start_14 .. :try_end_15} :catchall_13

    throw p1
.end method

.method public c(LX8/i;)V
    .registers 3

    const-string p0, "stream"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LX8/b;->z:LX8/b;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, LX8/i;->d(LX8/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final e()V
    .registers 1

    iget-object p0, p0, LU8/f;->e:Ljava/net/Socket;

    if-eqz p0, :cond_7

    invoke-static {p0}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_7
    return-void
.end method

.method public final g(IIIIZLP8/e;LP8/r;)V
    .registers 20

    move-object/from16 v2, p6

    move-object/from16 v1, p7

    const-string v0, "call"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/f;->h:LP8/A;

    if-nez v0, :cond_14d

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->b()Ljava/util/List;

    move-result-object v0

    new-instance v7, LU8/b;

    invoke-direct {v7, v0}, LU8/b;-><init>(Ljava/util/List;)V

    iget-object v3, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v3}, LP8/F;->a()LP8/a;

    move-result-object v3

    invoke-virtual {v3}, LP8/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    if-nez v3, :cond_7e

    sget-object v3, LP8/l;->k:LP8/l;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_71

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    sget-object v3, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v3}, LZ8/h$a;->g()LZ8/h;

    move-result-object v3

    invoke-virtual {v3, v0}, LZ8/h;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_50

    goto :goto_90

    :cond_50
    new-instance p0, LU8/i;

    new-instance p1, Ljava/net/UnknownServiceException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "CLEARTEXT communication to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not permitted by network security policy"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, LU8/i;-><init>(Ljava/io/IOException;)V

    throw p0

    :cond_71
    new-instance p0, LU8/i;

    new-instance p1, Ljava/net/UnknownServiceException;

    const-string p2, "CLEARTEXT communication not enabled for client"

    invoke-direct {p1, p2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, LU8/i;-><init>(Ljava/io/IOException;)V

    throw p0

    :cond_7e
    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0}, LP8/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v3, LP8/A;->w:LP8/A;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_140

    :goto_90
    const/4 v8, 0x0

    move-object v9, v8

    :goto_92
    :try_start_92
    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->c()Z

    move-result v0
    :try_end_98
    .catch Ljava/io/IOException; {:try_start_92 .. :try_end_98} :catch_f4

    if-eqz v0, :cond_b8

    move v3, p2

    move v4, p3

    move-object v6, v1

    move-object v5, v2

    move-object v1, p0

    move v2, p1

    :try_start_a0
    invoke-direct/range {v1 .. v6}, LU8/f;->k(IIILP8/e;LP8/r;)V
    :try_end_a3
    .catch Ljava/io/IOException; {:try_start_a0 .. :try_end_a3} :catch_b3

    move v10, v3

    move-object v2, v5

    move-object v1, v6

    :try_start_a6
    iget-object v0, p0, LU8/f;->e:Ljava/net/Socket;

    if-nez v0, :cond_ab

    goto :goto_d1

    :cond_ab
    :goto_ab
    move/from16 v11, p4

    goto :goto_bd

    :catch_ae
    move-exception v0

    :goto_af
    move/from16 v11, p4

    :goto_b1
    move-object v6, v0

    goto :goto_f7

    :catch_b3
    move-exception v0

    move v10, v3

    move-object v2, v5

    move-object v1, v6

    goto :goto_af

    :cond_b8
    move v10, p2

    invoke-direct {p0, p1, p2, v2, v1}, LU8/f;->i(IILP8/e;LP8/r;)V
    :try_end_bc
    .catch Ljava/io/IOException; {:try_start_a6 .. :try_end_bc} :catch_ae

    goto :goto_ab

    :goto_bd
    :try_start_bd
    invoke-direct {p0, v7, v11, v2, v1}, LU8/f;->n(LU8/b;ILP8/e;LP8/r;)V

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v3, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v3}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v3

    iget-object v4, p0, LU8/f;->h:LP8/A;

    invoke-virtual {v1, v2, v0, v3, v4}, LP8/r;->g(LP8/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LP8/A;)V
    :try_end_d1
    .catch Ljava/io/IOException; {:try_start_bd .. :try_end_d1} :catch_f2

    :goto_d1
    iget-object p1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {p1}, LP8/F;->c()Z

    move-result p1

    if-eqz p1, :cond_eb

    iget-object p1, p0, LU8/f;->e:Ljava/net/Socket;

    if-eqz p1, :cond_de

    goto :goto_eb

    :cond_de
    new-instance p0, LU8/i;

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Too many tunnel connections attempted: 21"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, LU8/i;-><init>(Ljava/io/IOException;)V

    throw p0

    :cond_eb
    :goto_eb
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    iput-wide p1, p0, LU8/f;->s:J

    return-void

    :catch_f2
    move-exception v0

    goto :goto_b1

    :catch_f4
    move-exception v0

    move v10, p2

    goto :goto_af

    :goto_f7
    iget-object v0, p0, LU8/f;->f:Ljava/net/Socket;

    if-eqz v0, :cond_fe

    invoke-static {v0}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_fe
    iget-object v0, p0, LU8/f;->e:Ljava/net/Socket;

    if-eqz v0, :cond_105

    invoke-static {v0}, LQ8/d;->n(Ljava/net/Socket;)V

    :cond_105
    iput-object v8, p0, LU8/f;->f:Ljava/net/Socket;

    iput-object v8, p0, LU8/f;->e:Ljava/net/Socket;

    iput-object v8, p0, LU8/f;->j:Le9/g;

    iput-object v8, p0, LU8/f;->k:Le9/f;

    iput-object v8, p0, LU8/f;->g:LP8/t;

    iput-object v8, p0, LU8/f;->h:LP8/A;

    iput-object v8, p0, LU8/f;->i:LX8/f;

    const/4 v0, 0x1

    iput v0, p0, LU8/f;->q:I

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v6}, LP8/r;->h(LP8/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LP8/A;Ljava/io/IOException;)V

    if-nez v9, :cond_12e

    new-instance v9, LU8/i;

    invoke-direct {v9, v6}, LU8/i;-><init>(Ljava/io/IOException;)V

    goto :goto_131

    :cond_12e
    invoke-virtual {v9, v6}, LU8/i;->a(Ljava/io/IOException;)V

    :goto_131
    if-eqz p5, :cond_13f

    invoke-virtual {v7, v6}, LU8/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_13f

    move-object/from16 v2, p6

    move-object/from16 v1, p7

    goto/16 :goto_92

    :cond_13f
    throw v9

    :cond_140
    new-instance p0, LU8/i;

    new-instance p1, Ljava/net/UnknownServiceException;

    const-string p2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {p1, p2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, LU8/i;-><init>(Ljava/io/IOException;)V

    throw p0

    :cond_14d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "already connected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final h(LP8/z;LP8/F;Ljava/io/IOException;)V
    .registers 6

    const-string p0, "client"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "failedRoute"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "failure"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p0

    sget-object v0, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq p0, v0, :cond_36

    invoke-virtual {p2}, LP8/F;->a()LP8/a;

    move-result-object p0

    invoke-virtual {p0}, LP8/a;->i()Ljava/net/ProxySelector;

    move-result-object v0

    invoke-virtual {p0}, LP8/a;->l()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->s()Ljava/net/URI;

    move-result-object p0

    invoke-virtual {p2}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v1

    invoke-virtual {v0, p0, v1, p3}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_36
    invoke-virtual {p1}, LP8/z;->v()LU8/h;

    move-result-object p0

    invoke-virtual {p0, p2}, LU8/h;->b(LP8/F;)V

    return-void
.end method

.method public final o()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LU8/f;->r:Ljava/util/List;

    return-object p0
.end method

.method public final p()J
    .registers 3

    iget-wide v0, p0, LU8/f;->s:J

    return-wide v0
.end method

.method public final q()Z
    .registers 1

    iget-boolean p0, p0, LU8/f;->l:Z

    return p0
.end method

.method public final r()I
    .registers 1

    iget p0, p0, LU8/f;->n:I

    return p0
.end method

.method public s()LP8/t;
    .registers 1

    iget-object p0, p0, LU8/f;->g:LP8/t;

    return-object p0
.end method

.method public final declared-synchronized t()V
    .registers 2

    monitor-enter p0

    :try_start_1
    iget v0, p0, LU8/f;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LU8/f;->o:I
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_9

    monitor-exit p0

    return-void

    :catchall_9
    move-exception v0

    :try_start_a
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_a .. :try_end_b} :catchall_9

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->a()LP8/a;

    move-result-object v1

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    invoke-virtual {v1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->a()LP8/a;

    move-result-object v1

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    invoke-virtual {v1}, LP8/v;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v1}, LP8/F;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU8/f;->g:LP8/t;

    if-eqz v1, :cond_5c

    invoke-virtual {v1}, LP8/t;->a()LP8/i;

    move-result-object v1

    if-nez v1, :cond_5e

    :cond_5c
    const-string v1, "none"

    :cond_5e
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LU8/f;->h:LP8/A;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u(LP8/a;Ljava/util/List;)Z
    .registers 6

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_37

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_37

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_37
    :goto_37
    iget-object v0, p0, LU8/f;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, LU8/f;->q:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_b4

    iget-boolean v0, p0, LU8/f;->l:Z

    if-eqz v0, :cond_47

    goto :goto_b4

    :cond_47
    iget-object v0, p0, LU8/f;->d:LP8/F;

    invoke-virtual {v0}, LP8/F;->a()LP8/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LP8/a;->d(LP8/a;)Z

    move-result v0

    if-nez v0, :cond_54

    return v2

    :cond_54
    invoke-virtual {p1}, LP8/a;->l()LP8/v;

    move-result-object v0

    invoke-virtual {v0}, LP8/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LU8/f;->A()LP8/F;

    move-result-object v1

    invoke-virtual {v1}, LP8/F;->a()LP8/a;

    move-result-object v1

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    invoke-virtual {v1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_74

    return v1

    :cond_74
    iget-object v0, p0, LU8/f;->i:LX8/f;

    if-nez v0, :cond_79

    return v2

    :cond_79
    if-eqz p2, :cond_b4

    invoke-direct {p0, p2}, LU8/f;->B(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_82

    goto :goto_b4

    :cond_82
    invoke-virtual {p1}, LP8/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Lc9/d;->a:Lc9/d;

    if-eq p2, v0, :cond_8b

    return v2

    :cond_8b
    invoke-virtual {p1}, LP8/a;->l()LP8/v;

    move-result-object p2

    invoke-direct {p0, p2}, LU8/f;->G(LP8/v;)Z

    move-result p2

    if-nez p2, :cond_96

    return v2

    :cond_96
    :try_start_96
    invoke-virtual {p1}, LP8/a;->a()LP8/g;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, LP8/a;->l()LP8/v;

    move-result-object p1

    invoke-virtual {p1}, LP8/v;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LU8/f;->s()LP8/t;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, LP8/t;->d()Ljava/util/List;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, LP8/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_b3
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_96 .. :try_end_b3} :catch_b4

    return v1

    :catch_b4
    :cond_b4
    :goto_b4
    return v2
.end method

.method public final v(Z)Z
    .registers 9

    sget-boolean v0, LQ8/d;->h:Z

    if-eqz v0, :cond_32

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_32

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_32
    :goto_32
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, LU8/f;->e:Ljava/net/Socket;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, LU8/f;->f:Ljava/net/Socket;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v4, p0, LU8/f;->j:Le9/g;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_81

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_81

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_81

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_5e

    goto :goto_81

    :cond_5e
    iget-object v2, p0, LU8/f;->i:LX8/f;

    if-eqz v2, :cond_67

    invoke-virtual {v2, v0, v1}, LX8/f;->j1(J)Z

    move-result p0

    return p0

    :cond_67
    monitor-enter p0

    :try_start_68
    iget-wide v5, p0, LU8/f;->s:J
    :try_end_6a
    .catchall {:try_start_68 .. :try_end_6a} :catchall_7e

    sub-long/2addr v0, v5

    monitor-exit p0

    const-wide v5, 0x2540be400L

    cmp-long p0, v0, v5

    if-ltz p0, :cond_7c

    if-eqz p1, :cond_7c

    invoke-static {v3, v4}, LQ8/d;->F(Ljava/net/Socket;Le9/g;)Z

    move-result p0

    return p0

    :cond_7c
    const/4 p0, 0x1

    return p0

    :catchall_7e
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_81
    :goto_81
    const/4 p0, 0x0

    return p0
.end method

.method public final w()Z
    .registers 1

    iget-object p0, p0, LU8/f;->i:LX8/f;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final x(LP8/z;LV8/g;)LV8/d;
    .registers 9

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU8/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, p0, LU8/f;->j:Le9/g;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, p0, LU8/f;->k:Le9/f;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, LU8/f;->i:LX8/f;

    if-eqz v3, :cond_23

    new-instance v0, LX8/g;

    invoke-direct {v0, p1, p0, p2, v3}, LX8/g;-><init>(LP8/z;LU8/f;LV8/g;LX8/f;)V

    return-object v0

    :cond_23
    invoke-virtual {p2}, LV8/g;->l()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-interface {v1}, Le9/B;->e()Le9/C;

    move-result-object v0

    invoke-virtual {p2}, LV8/g;->i()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    invoke-interface {v2}, Le9/z;->e()Le9/C;

    move-result-object v0

    invoke-virtual {p2}, LV8/g;->k()I

    move-result p2

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    new-instance p2, LW8/b;

    invoke-direct {p2, p1, p0, v1, v2}, LW8/b;-><init>(LP8/z;LU8/f;Le9/g;Le9/f;)V

    return-object p2
.end method

.method public final declared-synchronized y()V
    .registers 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, LU8/f;->m:Z
    :try_end_4
    .catchall {:try_start_2 .. :try_end_4} :catchall_6

    monitor-exit p0

    return-void

    :catchall_6
    move-exception v0

    :try_start_7
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_7 .. :try_end_8} :catchall_6

    throw v0
.end method

.method public final declared-synchronized z()V
    .registers 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, LU8/f;->l:Z
    :try_end_4
    .catchall {:try_start_2 .. :try_end_4} :catchall_6

    monitor-exit p0

    return-void

    :catchall_6
    move-exception v0

    :try_start_7
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_7 .. :try_end_8} :catchall_6

    throw v0
.end method
