.class public final LP8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/l$a;,
        LP8/l$b;
    }
.end annotation


# static fields
.field public static final e:LP8/l$b;

.field private static final f:[LP8/i;

.field private static final g:[LP8/i;

.field public static final h:LP8/l;

.field public static final i:LP8/l;

.field public static final j:LP8/l;

.field public static final k:LP8/l;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:[Ljava/lang/String;

.field private final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 18

    new-instance v0, LP8/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/l$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/l;->e:LP8/l$b;

    sget-object v2, LP8/i;->o1:LP8/i;

    sget-object v3, LP8/i;->p1:LP8/i;

    sget-object v4, LP8/i;->q1:LP8/i;

    sget-object v5, LP8/i;->a1:LP8/i;

    sget-object v6, LP8/i;->e1:LP8/i;

    sget-object v7, LP8/i;->b1:LP8/i;

    sget-object v8, LP8/i;->f1:LP8/i;

    sget-object v9, LP8/i;->l1:LP8/i;

    sget-object v10, LP8/i;->k1:LP8/i;

    filled-new-array/range {v2 .. v10}, [LP8/i;

    move-result-object v0

    sput-object v0, LP8/l;->f:[LP8/i;

    sget-object v11, LP8/i;->L0:LP8/i;

    sget-object v12, LP8/i;->M0:LP8/i;

    sget-object v13, LP8/i;->j0:LP8/i;

    sget-object v14, LP8/i;->k0:LP8/i;

    sget-object v15, LP8/i;->H:LP8/i;

    sget-object v16, LP8/i;->L:LP8/i;

    sget-object v17, LP8/i;->l:LP8/i;

    filled-new-array/range {v2 .. v17}, [LP8/i;

    move-result-object v1

    sput-object v1, LP8/l;->g:[LP8/i;

    new-instance v2, LP8/l$a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, LP8/l$a;-><init>(Z)V

    array-length v4, v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP8/i;

    invoke-virtual {v2, v0}, LP8/l$a;->b([LP8/i;)LP8/l$a;

    move-result-object v0

    sget-object v2, LP8/G;->s:LP8/G;

    sget-object v4, LP8/G;->t:LP8/G;

    filled-new-array {v2, v4}, [LP8/G;

    move-result-object v5

    invoke-virtual {v0, v5}, LP8/l$a;->e([LP8/G;)LP8/l$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LP8/l$a;->d(Z)LP8/l$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/l$a;->a()LP8/l;

    move-result-object v0

    sput-object v0, LP8/l;->h:LP8/l;

    new-instance v0, LP8/l$a;

    invoke-direct {v0, v3}, LP8/l$a;-><init>(Z)V

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [LP8/i;

    invoke-virtual {v0, v5}, LP8/l$a;->b([LP8/i;)LP8/l$a;

    move-result-object v0

    filled-new-array {v2, v4}, [LP8/G;

    move-result-object v5

    invoke-virtual {v0, v5}, LP8/l$a;->e([LP8/G;)LP8/l$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LP8/l$a;->d(Z)LP8/l$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/l$a;->a()LP8/l;

    move-result-object v0

    sput-object v0, LP8/l;->i:LP8/l;

    new-instance v0, LP8/l$a;

    invoke-direct {v0, v3}, LP8/l$a;-><init>(Z)V

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LP8/i;

    invoke-virtual {v0, v1}, LP8/l$a;->b([LP8/i;)LP8/l$a;

    move-result-object v0

    sget-object v1, LP8/G;->u:LP8/G;

    sget-object v5, LP8/G;->v:LP8/G;

    filled-new-array {v2, v4, v1, v5}, [LP8/G;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/l$a;->e([LP8/G;)LP8/l$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LP8/l$a;->d(Z)LP8/l$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/l$a;->a()LP8/l;

    move-result-object v0

    sput-object v0, LP8/l;->j:LP8/l;

    new-instance v0, LP8/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/l$a;-><init>(Z)V

    invoke-virtual {v0}, LP8/l$a;->a()LP8/l;

    move-result-object v0

    sput-object v0, LP8/l;->k:LP8/l;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LP8/l;->a:Z

    iput-boolean p2, p0, LP8/l;->b:Z

    iput-object p3, p0, LP8/l;->c:[Ljava/lang/String;

    iput-object p4, p0, LP8/l;->d:[Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(LP8/l;)[Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/l;->c:[Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic b(LP8/l;)[Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/l;->d:[Ljava/lang/String;

    return-object p0
.end method

.method private final g(Ljavax/net/ssl/SSLSocket;Z)LP8/l;
    .registers 7

    iget-object v0, p0, LP8/l;->c:[Ljava/lang/String;

    if-eqz v0, :cond_1a

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "sslSocket.enabledCipherSuites"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LP8/l;->c:[Ljava/lang/String;

    sget-object v2, LP8/i;->b:LP8/i$b;

    invoke-virtual {v2}, LP8/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v1, v2}, LQ8/d;->E([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_1e

    :cond_1a
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    :goto_1e
    iget-object v1, p0, LP8/l;->d:[Ljava/lang/String;

    if-eqz v1, :cond_36

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "sslSocket.enabledProtocols"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LP8/l;->d:[Ljava/lang/String;

    invoke-static {}, Lk8/a;->f()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v1, v2, v3}, LQ8/d;->E([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v1

    goto :goto_3a

    :cond_36
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    :goto_3a
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object p1

    const-string v2, "supportedCipherSuites"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LP8/i;->b:LP8/i$b;

    invoke-virtual {v2}, LP8/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    const-string v3, "TLS_FALLBACK_SCSV"

    invoke-static {p1, v3, v2}, LQ8/d;->x([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I

    move-result v2

    const-string v3, "cipherSuitesIntersection"

    if-eqz p2, :cond_64

    const/4 p2, -0x1

    if-eq v2, p2, :cond_64

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object p1, p1, v2

    const-string p2, "supportedCipherSuites[indexOfFallbackScsv]"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LQ8/d;->o([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :cond_64
    new-instance p1, LP8/l$a;

    invoke-direct {p1, p0}, LP8/l$a;-><init>(LP8/l;)V

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, v0

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-virtual {p1, p0}, LP8/l$a;->c([Ljava/lang/String;)LP8/l$a;

    move-result-object p0

    const-string p1, "tlsVersionsIntersection"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, LP8/l$a;->f([Ljava/lang/String;)LP8/l$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/l$a;->a()LP8/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljavax/net/ssl/SSLSocket;Z)V
    .registers 4

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LP8/l;->g(Ljavax/net/ssl/SSLSocket;Z)LP8/l;

    move-result-object p0

    invoke-virtual {p0}, LP8/l;->i()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_14

    iget-object p2, p0, LP8/l;->d:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_14
    invoke-virtual {p0}, LP8/l;->d()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1f

    iget-object p0, p0, LP8/l;->c:[Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_1f
    return-void
.end method

.method public final d()Ljava/util/List;
    .registers 6

    iget-object p0, p0, LP8/l;->c:[Ljava/lang/String;

    if-eqz p0, :cond_21

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v1, :cond_1c

    aget-object v3, p0, v2

    sget-object v4, LP8/i;->b:LP8/i$b;

    invoke-virtual {v4, v3}, LP8/i$b;->b(Ljava/lang/String;)LP8/i;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_1c
    invoke-static {v0}, Li8/s;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_21
    const/4 p0, 0x0

    return-object p0
.end method

.method public final e(Ljavax/net/ssl/SSLSocket;)Z
    .registers 6

    const-string v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LP8/l;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_b

    return v1

    :cond_b
    iget-object v0, p0, LP8/l;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1e

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lk8/a;->f()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v0, v2, v3}, LQ8/d;->u([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v0

    if-nez v0, :cond_1e

    return v1

    :cond_1e
    iget-object p0, p0, LP8/l;->c:[Ljava/lang/String;

    if-eqz p0, :cond_33

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    sget-object v0, LP8/i;->b:LP8/i$b;

    invoke-virtual {v0}, LP8/i$b;->c()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p0, p1, v0}, LQ8/d;->u([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result p0

    if-nez p0, :cond_33

    return v1

    :cond_33
    const/4 p0, 0x1

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    instance-of v0, p1, LP8/l;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x1

    if-ne p1, p0, :cond_a

    return v0

    :cond_a
    iget-boolean v2, p0, LP8/l;->a:Z

    check-cast p1, LP8/l;

    iget-boolean v3, p1, LP8/l;->a:Z

    if-eq v2, v3, :cond_13

    return v1

    :cond_13
    if-eqz v2, :cond_32

    iget-object v2, p0, LP8/l;->c:[Ljava/lang/String;

    iget-object v3, p1, LP8/l;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    return v1

    :cond_20
    iget-object v2, p0, LP8/l;->d:[Ljava/lang/String;

    iget-object v3, p1, LP8/l;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    return v1

    :cond_2b
    iget-boolean p0, p0, LP8/l;->b:Z

    iget-boolean p1, p1, LP8/l;->b:Z

    if-eq p0, p1, :cond_32

    return v1

    :cond_32
    return v0
.end method

.method public final f()Z
    .registers 1

    iget-boolean p0, p0, LP8/l;->a:Z

    return p0
.end method

.method public final h()Z
    .registers 1

    iget-boolean p0, p0, LP8/l;->b:Z

    return p0
.end method

.method public hashCode()I
    .registers 4

    iget-boolean v0, p0, LP8/l;->a:Z

    if-eqz v0, :cond_25

    iget-object v0, p0, LP8/l;->c:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    goto :goto_f

    :cond_e
    move v0, v1

    :goto_f
    const/16 v2, 0x20f

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, LP8/l;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1c

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    :cond_1c
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean p0, p0, LP8/l;->b:Z

    xor-int/lit8 p0, p0, 0x1

    add-int/2addr v2, p0

    return v2

    :cond_25
    const/16 p0, 0x11

    return p0
.end method

.method public final i()Ljava/util/List;
    .registers 6

    iget-object p0, p0, LP8/l;->d:[Ljava/lang/String;

    if-eqz p0, :cond_21

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v1, :cond_1c

    aget-object v3, p0, v2

    sget-object v4, LP8/G;->r:LP8/G$a;

    invoke-virtual {v4, v3}, LP8/G$a;->a(Ljava/lang/String;)LP8/G;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_1c
    invoke-static {v0}, Li8/s;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_21
    const/4 p0, 0x0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-boolean v0, p0, LP8/l;->a:Z

    if-nez v0, :cond_7

    const-string p0, "ConnectionSpec()"

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionSpec(cipherSuites="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LP8/l;->d()Ljava/util/List;

    move-result-object v1

    const-string v2, "[all enabled]"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LP8/l;->i()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p0, p0, LP8/l;->b:Z

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
