.class public final LZ8/b;
.super LZ8/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ8/b$a;,
        LZ8/b$b;
    }
.end annotation


# static fields
.field public static final f:LZ8/b$a;

.field private static final g:Z


# instance fields
.field private final d:Ljava/util/List;

.field private final e:La9/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LZ8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZ8/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LZ8/b;->f:LZ8/b$a;

    sget-object v0, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v0}, LZ8/h$a;->h()Z

    const/4 v0, 0x0

    sput-boolean v0, LZ8/b;->g:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 6

    invoke-direct {p0}, LZ8/h;-><init>()V

    sget-object v0, La9/l;->j:La9/l$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, La9/l$a;->b(La9/l$a;Ljava/lang/String;ILjava/lang/Object;)La9/k;

    move-result-object v0

    new-instance v1, La9/j;

    sget-object v2, La9/f;->f:La9/f$a;

    invoke-virtual {v2}, La9/f$a;->d()La9/j$a;

    move-result-object v2

    invoke-direct {v1, v2}, La9/j;-><init>(La9/j$a;)V

    new-instance v2, La9/j;

    sget-object v3, La9/i;->a:La9/i$b;

    invoke-virtual {v3}, La9/i$b;->a()La9/j$a;

    move-result-object v3

    invoke-direct {v2, v3}, La9/j;-><init>(La9/j$a;)V

    new-instance v3, La9/j;

    sget-object v4, La9/g;->a:La9/g$b;

    invoke-virtual {v4}, La9/g$b;->a()La9/j$a;

    move-result-object v4

    invoke-direct {v3, v4}, La9/j;-><init>(La9/j$a;)V

    filled-new-array {v0, v1, v2, v3}, [La9/k;

    move-result-object v0

    invoke-static {v0}, Li8/s;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3f
    :goto_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_56

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, La9/k;

    invoke-interface {v3}, La9/k;->b()Z

    move-result v3

    if-eqz v3, :cond_3f

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3f

    :cond_56
    iput-object v1, p0, LZ8/b;->d:Ljava/util/List;

    sget-object v0, La9/h;->d:La9/h$a;

    invoke-virtual {v0}, La9/h$a;->a()La9/h;

    move-result-object v0

    iput-object v0, p0, LZ8/b;->e:La9/h;

    return-void
.end method

.method public static final synthetic p()Z
    .registers 1

    sget-boolean v0, LZ8/b;->g:Z

    return v0
.end method


# virtual methods
.method public c(Ljavax/net/ssl/X509TrustManager;)Lc9/c;
    .registers 3

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La9/b;->d:La9/b$a;

    invoke-virtual {v0, p1}, La9/b$a;->a(Ljavax/net/ssl/X509TrustManager;)La9/b;

    move-result-object v0

    if-eqz v0, :cond_e

    return-object v0

    :cond_e
    invoke-super {p0, p1}, LZ8/h;->c(Ljavax/net/ssl/X509TrustManager;)Lc9/c;

    move-result-object p0

    return-object p0
.end method

.method public d(Ljavax/net/ssl/X509TrustManager;)Lc9/e;
    .registers 5

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "findTrustAnchorByIssuerAndSignature"

    const-class v2, Ljava/security/cert/X509Certificate;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v1, LZ8/b$b;

    const-string v2, "method"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, LZ8/b$b;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
    :try_end_23
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_23} :catch_24

    return-object v1

    :catch_24
    invoke-super {p0, p1}, LZ8/h;->d(Ljavax/net/ssl/X509TrustManager;)Lc9/e;

    move-result-object p0

    return-object p0
.end method

.method public e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 6

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LZ8/b;->d:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, La9/k;

    invoke-interface {v1, p1}, La9/k;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_27

    :cond_26
    const/4 v0, 0x0

    :goto_27
    check-cast v0, La9/k;

    if-eqz v0, :cond_2e

    invoke-interface {v0, p1, p2, p3}, La9/k;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_2e
    return-void
.end method

.method public f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .registers 4

    const-string p0, "socket"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "address"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-void
.end method

.method public g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 5

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LZ8/b;->d:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_22

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, La9/k;

    invoke-interface {v2, p1}, La9/k;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_23

    :cond_22
    move-object v0, v1

    :goto_23
    check-cast v0, La9/k;

    if-eqz v0, :cond_2c

    invoke-interface {v0, p1}, La9/k;->c(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2c
    return-object v1
.end method

.method public h(Ljava/lang/String;)Ljava/lang/Object;
    .registers 3

    const-string v0, "closer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LZ8/b;->e:La9/h;

    invoke-virtual {p0, p1}, La9/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public i(Ljava/lang/String;)Z
    .registers 2

    const-string p0, "hostname"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public l(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 9

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZ8/b;->e:La9/h;

    invoke-virtual {v0, p2}, La9/h;->b(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_16

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LZ8/h;->k(LZ8/h;Ljava/lang/String;ILjava/lang/Throwable;ILjava/lang/Object;)V

    :cond_16
    return-void
.end method
