.class public final LU8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;

.field private b:I

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 3

    const-string v0, "connectionSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8/b;->a:Ljava/util/List;

    return-void
.end method

.method private final c(Ljavax/net/ssl/SSLSocket;)Z
    .registers 5

    iget v0, p0, LU8/b;->b:I

    iget-object v1, p0, LU8/b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_8
    if-ge v0, v1, :cond_1d

    iget-object v2, p0, LU8/b;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP8/l;

    invoke-virtual {v2, p1}, LP8/l;->e(Ljavax/net/ssl/SSLSocket;)Z

    move-result v2

    if-eqz v2, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_1d
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)LP8/l;
    .registers 6

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LU8/b;->b:I

    iget-object v1, p0, LU8/b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_d
    if-ge v0, v1, :cond_25

    iget-object v2, p0, LU8/b;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP8/l;

    invoke-virtual {v2, p1}, LP8/l;->e(Ljavax/net/ssl/SSLSocket;)Z

    move-result v3

    if-eqz v3, :cond_22

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LU8/b;->b:I

    goto :goto_26

    :cond_22
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_25
    const/4 v2, 0x0

    :goto_26
    if-eqz v2, :cond_34

    invoke-direct {p0, p1}, LU8/b;->c(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    iput-boolean v0, p0, LU8/b;->c:Z

    iget-boolean p0, p0, LU8/b;->d:Z

    invoke-virtual {v2, p1, p0}, LP8/l;->c(Ljavax/net/ssl/SSLSocket;Z)V

    return-object v2

    :cond_34
    new-instance v0, Ljava/net/UnknownServiceException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to find acceptable protocols. isFallback="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LU8/b;->d:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", modes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LU8/b;->a:Ljava/util/List;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", supported protocols="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(this)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Ljava/io/IOException;)Z
    .registers 4

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LU8/b;->d:Z

    iget-boolean p0, p0, LU8/b;->c:Z

    const/4 v1, 0x0

    if-nez p0, :cond_e

    return v1

    :cond_e
    instance-of p0, p1, Ljava/net/ProtocolException;

    if-eqz p0, :cond_13

    return v1

    :cond_13
    instance-of p0, p1, Ljava/io/InterruptedIOException;

    if-eqz p0, :cond_18

    return v1

    :cond_18
    instance-of p0, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p0, :cond_25

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Ljava/security/cert/CertificateException;

    if-eqz p0, :cond_25

    return v1

    :cond_25
    instance-of p0, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p0, :cond_2a

    return v1

    :cond_2a
    instance-of p0, p1, Ljavax/net/ssl/SSLException;

    if-eqz p0, :cond_2f

    return v0

    :cond_2f
    return v1
.end method
