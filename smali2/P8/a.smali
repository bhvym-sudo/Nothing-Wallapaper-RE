.class public final LP8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP8/q;

.field private final b:Ljavax/net/SocketFactory;

.field private final c:Ljavax/net/ssl/SSLSocketFactory;

.field private final d:Ljavax/net/ssl/HostnameVerifier;

.field private final e:LP8/g;

.field private final f:LP8/b;

.field private final g:Ljava/net/Proxy;

.field private final h:Ljava/net/ProxySelector;

.field private final i:LP8/v;

.field private final j:Ljava/util/List;

.field private final k:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILP8/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LP8/g;LP8/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .registers 14

    const-string v0, "uriHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dns"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socketFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyAuthenticator"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionSpecs"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxySelector"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LP8/a;->a:LP8/q;

    iput-object p4, p0, LP8/a;->b:Ljavax/net/SocketFactory;

    iput-object p5, p0, LP8/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p6, p0, LP8/a;->d:Ljavax/net/ssl/HostnameVerifier;

    iput-object p7, p0, LP8/a;->e:LP8/g;

    iput-object p8, p0, LP8/a;->f:LP8/b;

    iput-object p9, p0, LP8/a;->g:Ljava/net/Proxy;

    iput-object p12, p0, LP8/a;->h:Ljava/net/ProxySelector;

    new-instance p3, LP8/v$a;

    invoke-direct {p3}, LP8/v$a;-><init>()V

    if-eqz p5, :cond_40

    const-string p4, "https"

    goto :goto_42

    :cond_40
    const-string p4, "http"

    :goto_42
    invoke-virtual {p3, p4}, LP8/v$a;->q(Ljava/lang/String;)LP8/v$a;

    move-result-object p3

    invoke-virtual {p3, p1}, LP8/v$a;->g(Ljava/lang/String;)LP8/v$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LP8/v$a;->m(I)LP8/v$a;

    move-result-object p1

    invoke-virtual {p1}, LP8/v$a;->c()LP8/v;

    move-result-object p1

    iput-object p1, p0, LP8/a;->i:LP8/v;

    invoke-static {p10}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LP8/a;->j:Ljava/util/List;

    invoke-static {p11}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LP8/a;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()LP8/g;
    .registers 1

    iget-object p0, p0, LP8/a;->e:LP8/g;

    return-object p0
.end method

.method public final b()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/a;->k:Ljava/util/List;

    return-object p0
.end method

.method public final c()LP8/q;
    .registers 1

    iget-object p0, p0, LP8/a;->a:LP8/q;

    return-object p0
.end method

.method public final d(LP8/a;)Z
    .registers 4

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/a;->a:LP8/q;

    iget-object v1, p1, LP8/a;->a:LP8/q;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->f:LP8/b;

    iget-object v1, p1, LP8/a;->f:LP8/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->j:Ljava/util/List;

    iget-object v1, p1, LP8/a;->j:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->k:Ljava/util/List;

    iget-object v1, p1, LP8/a;->k:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->h:Ljava/net/ProxySelector;

    iget-object v1, p1, LP8/a;->h:Ljava/net/ProxySelector;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->g:Ljava/net/Proxy;

    iget-object v1, p1, LP8/a;->g:Ljava/net/Proxy;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p1, LP8/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->d:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p1, LP8/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object v0, p0, LP8/a;->e:LP8/g;

    iget-object v1, p1, LP8/a;->e:LP8/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    iget-object p0, p0, LP8/a;->i:LP8/v;

    invoke-virtual {p0}, LP8/v;->n()I

    move-result p0

    iget-object p1, p1, LP8/a;->i:LP8/v;

    invoke-virtual {p1}, LP8/v;->n()I

    move-result p1

    if-ne p0, p1, :cond_6f

    const/4 p0, 0x1

    return p0

    :cond_6f
    const/4 p0, 0x0

    return p0
.end method

.method public final e()Ljavax/net/ssl/HostnameVerifier;
    .registers 1

    iget-object p0, p0, LP8/a;->d:Ljavax/net/ssl/HostnameVerifier;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LP8/a;

    if-eqz v0, :cond_18

    iget-object v0, p0, LP8/a;->i:LP8/v;

    check-cast p1, LP8/a;

    iget-object v1, p1, LP8/a;->i:LP8/v;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {p0, p1}, LP8/a;->d(LP8/a;)Z

    move-result p0

    if-eqz p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method public final f()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/a;->j:Ljava/util/List;

    return-object p0
.end method

.method public final g()Ljava/net/Proxy;
    .registers 1

    iget-object p0, p0, LP8/a;->g:Ljava/net/Proxy;

    return-object p0
.end method

.method public final h()LP8/b;
    .registers 1

    iget-object p0, p0, LP8/a;->f:LP8/b;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, LP8/a;->i:LP8/v;

    invoke-virtual {v0}, LP8/v;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->a:LP8/q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->f:LP8/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->j:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->k:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->h:Ljava/net/ProxySelector;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->g:Ljava/net/Proxy;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LP8/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object p0, p0, LP8/a;->e:LP8/g;

    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result p0

    add-int/2addr v1, p0

    return v1
.end method

.method public final i()Ljava/net/ProxySelector;
    .registers 1

    iget-object p0, p0, LP8/a;->h:Ljava/net/ProxySelector;

    return-object p0
.end method

.method public final j()Ljavax/net/SocketFactory;
    .registers 1

    iget-object p0, p0, LP8/a;->b:Ljavax/net/SocketFactory;

    return-object p0
.end method

.method public final k()Ljavax/net/ssl/SSLSocketFactory;
    .registers 1

    iget-object p0, p0, LP8/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    return-object p0
.end method

.method public final l()LP8/v;
    .registers 1

    iget-object p0, p0, LP8/a;->i:LP8/v;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Address{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/a;->i:LP8/v;

    invoke-virtual {v1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/a;->i:LP8/v;

    invoke-virtual {v1}, LP8/v;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/a;->g:Ljava/net/Proxy;

    if-eqz v1, :cond_3e

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "proxy="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/a;->g:Ljava/net/Proxy;

    :goto_36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_4b

    :cond_3e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "proxySelector="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/a;->h:Ljava/net/ProxySelector;

    goto :goto_36

    :goto_4b
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
