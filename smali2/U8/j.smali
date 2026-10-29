.class public final LU8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU8/j$a;,
        LU8/j$b;
    }
.end annotation


# static fields
.field public static final i:LU8/j$a;


# instance fields
.field private final a:LP8/a;

.field private final b:LU8/h;

.field private final c:LP8/e;

.field private final d:LP8/r;

.field private e:Ljava/util/List;

.field private f:I

.field private g:Ljava/util/List;

.field private final h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LU8/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU8/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LU8/j;->i:LU8/j$a;

    return-void
.end method

.method public constructor <init>(LP8/a;LU8/h;LP8/e;LP8/r;)V
    .registers 6

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routeDatabase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8/j;->a:LP8/a;

    iput-object p2, p0, LU8/j;->b:LU8/h;

    iput-object p3, p0, LU8/j;->c:LP8/e;

    iput-object p4, p0, LU8/j;->d:LP8/r;

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LU8/j;->e:Ljava/util/List;

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LU8/j;->g:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LU8/j;->h:Ljava/util/List;

    invoke-virtual {p1}, LP8/a;->l()LP8/v;

    move-result-object p2

    invoke-virtual {p1}, LP8/a;->g()Ljava/net/Proxy;

    move-result-object p1

    invoke-direct {p0, p2, p1}, LU8/j;->f(LP8/v;Ljava/net/Proxy;)V

    return-void
.end method

.method private final b()Z
    .registers 2

    iget v0, p0, LU8/j;->f:I

    iget-object p0, p0, LU8/j;->e:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-ge v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method private final d()Ljava/net/Proxy;
    .registers 4

    invoke-direct {p0}, LU8/j;->b()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, LU8/j;->e:Ljava/util/List;

    iget v1, p0, LU8/j;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LU8/j;->f:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Proxy;

    invoke-direct {p0, v0}, LU8/j;->e(Ljava/net/Proxy;)V

    return-object v0

    :cond_18
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No route to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LU8/j;->a:LP8/a;

    invoke-virtual {v2}, LP8/a;->l()LP8/v;

    move-result-object v2

    invoke-virtual {v2}, LP8/v;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; exhausted proxy configurations: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LU8/j;->e:Ljava/util/List;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final e(Ljava/net/Proxy;)V
    .registers 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LU8/j;->g:Ljava/util/List;

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v1, v2, :cond_51

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v1, v2, :cond_18

    goto :goto_51

    :cond_18
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v1

    instance-of v2, v1, Ljava/net/InetSocketAddress;

    if-eqz v2, :cond_32

    sget-object v2, LU8/j;->i:LU8/j$a;

    const-string v3, "proxyAddress"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/net/InetSocketAddress;

    invoke-virtual {v2, v1}, LU8/j$a;->a(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    goto :goto_65

    :cond_32
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Proxy.address() is not an InetSocketAddress: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_51
    :goto_51
    iget-object v1, p0, LU8/j;->a:LP8/a;

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    invoke-virtual {v1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, LU8/j;->a:LP8/a;

    invoke-virtual {v1}, LP8/a;->l()LP8/v;

    move-result-object v1

    invoke-virtual {v1}, LP8/v;->n()I

    move-result v1

    :goto_65
    const/4 v3, 0x1

    if-gt v3, v1, :cond_e4

    const/high16 v3, 0x10000

    if-ge v1, v3, :cond_e4

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p1

    sget-object v3, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne p1, v3, :cond_7c

    invoke-static {v2, v1}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_7c
    invoke-static {v2}, LQ8/d;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8b

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p0

    invoke-static {p0}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_aa

    :cond_8b
    iget-object p1, p0, LU8/j;->d:LP8/r;

    iget-object v3, p0, LU8/j;->c:LP8/e;

    invoke-virtual {p1, v3, v2}, LP8/r;->m(LP8/e;Ljava/lang/String;)V

    iget-object p1, p0, LU8/j;->a:LP8/a;

    invoke-virtual {p1}, LP8/a;->c()LP8/q;

    move-result-object p1

    invoke-interface {p1, v2}, LP8/q;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_c4

    iget-object v3, p0, LU8/j;->d:LP8/r;

    iget-object p0, p0, LU8/j;->c:LP8/e;

    invoke-virtual {v3, p0, v2, p1}, LP8/r;->l(LP8/e;Ljava/lang/String;Ljava/util/List;)V

    move-object p0, p1

    :goto_aa
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_ae
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_c3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/InetAddress;

    new-instance v2, Ljava/net/InetSocketAddress;

    invoke-direct {v2, p1, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_ae

    :cond_c3
    return-void

    :cond_c4
    new-instance p1, Ljava/net/UnknownHostException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, LU8/j;->a:LP8/a;

    invoke-virtual {p0}, LP8/a;->c()LP8/q;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " returned no addresses for "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e4
    new-instance p0, Ljava/net/SocketException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No route to "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "; port is out of range"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final f(LP8/v;Ljava/net/Proxy;)V
    .registers 5

    iget-object v0, p0, LU8/j;->d:LP8/r;

    iget-object v1, p0, LU8/j;->c:LP8/e;

    invoke-virtual {v0, v1, p1}, LP8/r;->o(LP8/e;LP8/v;)V

    invoke-static {p2, p1, p0}, LU8/j;->g(Ljava/net/Proxy;LP8/v;LU8/j;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LU8/j;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, LU8/j;->f:I

    iget-object v0, p0, LU8/j;->d:LP8/r;

    iget-object p0, p0, LU8/j;->c:LP8/e;

    invoke-virtual {v0, p0, p1, p2}, LP8/r;->n(LP8/e;LP8/v;Ljava/util/List;)V

    return-void
.end method

.method private static final g(Ljava/net/Proxy;LP8/v;LU8/j;)Ljava/util/List;
    .registers 3

    if-eqz p0, :cond_7

    invoke-static {p0}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-virtual {p1}, LP8/v;->s()Ljava/net/URI;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1c

    sget-object p0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p0}, [Ljava/net/Proxy;

    move-result-object p0

    invoke-static {p0}, LQ8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1c
    iget-object p1, p2, LU8/j;->a:LP8/a;

    invoke-virtual {p1}, LP8/a;->i()Ljava/net/ProxySelector;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_3c

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_32

    goto :goto_3c

    :cond_32
    const-string p1, "proxiesOrNull"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3c
    :goto_3c
    sget-object p0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p0}, [Ljava/net/Proxy;

    move-result-object p0

    invoke-static {p0}, LQ8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Z
    .registers 2

    invoke-direct {p0}, LU8/j;->b()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object p0, p0, LU8/j;->h:Ljava/util/List;

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_11

    goto :goto_13

    :cond_11
    const/4 p0, 0x0

    return p0

    :cond_13
    :goto_13
    const/4 p0, 0x1

    return p0
.end method

.method public final c()LU8/j$b;
    .registers 7

    invoke-virtual {p0}, LU8/j;->a()Z

    move-result v0

    if-eqz v0, :cond_60

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    invoke-direct {p0}, LU8/j;->b()Z

    move-result v1

    if-eqz v1, :cond_48

    invoke-direct {p0}, LU8/j;->d()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, p0, LU8/j;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_42

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetSocketAddress;

    new-instance v4, LP8/F;

    iget-object v5, p0, LU8/j;->a:LP8/a;

    invoke-direct {v4, v5, v1, v3}, LP8/F;-><init>(LP8/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    iget-object v3, p0, LU8/j;->b:LU8/h;

    invoke-virtual {v3, v4}, LU8/h;->c(LP8/F;)Z

    move-result v3

    if-eqz v3, :cond_3e

    iget-object v3, p0, LU8/j;->h:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_3e
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_42
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    :cond_48
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5a

    iget-object v1, p0, LU8/j;->h:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Li8/s;->z(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    iget-object p0, p0, LU8/j;->h:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_5a
    new-instance p0, LU8/j$b;

    invoke-direct {p0, v0}, LU8/j$b;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_60
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method
