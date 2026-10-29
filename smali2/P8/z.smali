.class public LP8/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements LP8/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/z$a;,
        LP8/z$b;
    }
.end annotation


# static fields
.field public static final T:LP8/z$b;

.field private static final U:Ljava/util/List;

.field private static final V:Ljava/util/List;


# instance fields
.field private final A:LP8/q;

.field private final B:Ljava/net/Proxy;

.field private final C:Ljava/net/ProxySelector;

.field private final D:LP8/b;

.field private final E:Ljavax/net/SocketFactory;

.field private final F:Ljavax/net/ssl/SSLSocketFactory;

.field private final G:Ljavax/net/ssl/X509TrustManager;

.field private final H:Ljava/util/List;

.field private final I:Ljava/util/List;

.field private final J:Ljavax/net/ssl/HostnameVerifier;

.field private final K:LP8/g;

.field private final L:Lc9/c;

.field private final M:I

.field private final N:I

.field private final O:I

.field private final P:I

.field private final Q:I

.field private final R:J

.field private final S:LU8/h;

.field private final q:LP8/p;

.field private final r:LP8/k;

.field private final s:Ljava/util/List;

.field private final t:Ljava/util/List;

.field private final u:LP8/r$c;

.field private final v:Z

.field private final w:LP8/b;

.field private final x:Z

.field private final y:Z

.field private final z:LP8/n;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/z$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/z;->T:LP8/z$b;

    sget-object v0, LP8/A;->v:LP8/A;

    sget-object v1, LP8/A;->t:LP8/A;

    filled-new-array {v0, v1}, [LP8/A;

    move-result-object v0

    invoke-static {v0}, LQ8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LP8/z;->U:Ljava/util/List;

    sget-object v0, LP8/l;->i:LP8/l;

    sget-object v1, LP8/l;->k:LP8/l;

    filled-new-array {v0, v1}, [LP8/l;

    move-result-object v0

    invoke-static {v0}, LQ8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LP8/z;->V:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 52
    new-instance v0, LP8/z$a;

    invoke-direct {v0}, LP8/z$a;-><init>()V

    invoke-direct {p0, v0}, LP8/z;-><init>(LP8/z$a;)V

    return-void
.end method

.method public constructor <init>(LP8/z$a;)V
    .registers 5

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, LP8/z$a;->n()LP8/p;

    move-result-object v0

    iput-object v0, p0, LP8/z;->q:LP8/p;

    .line 3
    invoke-virtual {p1}, LP8/z$a;->k()LP8/k;

    move-result-object v0

    iput-object v0, p0, LP8/z;->r:LP8/k;

    .line 4
    invoke-virtual {p1}, LP8/z$a;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LP8/z;->s:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, LP8/z$a;->v()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LQ8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LP8/z;->t:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, LP8/z$a;->p()LP8/r$c;

    move-result-object v0

    iput-object v0, p0, LP8/z;->u:LP8/r$c;

    .line 7
    invoke-virtual {p1}, LP8/z$a;->C()Z

    move-result v0

    iput-boolean v0, p0, LP8/z;->v:Z

    .line 8
    invoke-virtual {p1}, LP8/z$a;->e()LP8/b;

    move-result-object v0

    iput-object v0, p0, LP8/z;->w:LP8/b;

    .line 9
    invoke-virtual {p1}, LP8/z$a;->q()Z

    move-result v0

    iput-boolean v0, p0, LP8/z;->x:Z

    .line 10
    invoke-virtual {p1}, LP8/z$a;->r()Z

    move-result v0

    iput-boolean v0, p0, LP8/z;->y:Z

    .line 11
    invoke-virtual {p1}, LP8/z$a;->m()LP8/n;

    move-result-object v0

    iput-object v0, p0, LP8/z;->z:LP8/n;

    .line 12
    invoke-virtual {p1}, LP8/z$a;->f()LP8/c;

    .line 13
    invoke-virtual {p1}, LP8/z$a;->o()LP8/q;

    move-result-object v0

    iput-object v0, p0, LP8/z;->A:LP8/q;

    .line 14
    invoke-virtual {p1}, LP8/z$a;->y()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, LP8/z;->B:Ljava/net/Proxy;

    .line 15
    invoke-virtual {p1}, LP8/z$a;->y()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_64

    sget-object v0, Lb9/a;->a:Lb9/a;

    goto :goto_72

    .line 16
    :cond_64
    invoke-virtual {p1}, LP8/z$a;->A()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_6e

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_6e
    if-nez v0, :cond_72

    sget-object v0, Lb9/a;->a:Lb9/a;

    .line 17
    :cond_72
    :goto_72
    iput-object v0, p0, LP8/z;->C:Ljava/net/ProxySelector;

    .line 18
    invoke-virtual {p1}, LP8/z$a;->z()LP8/b;

    move-result-object v0

    iput-object v0, p0, LP8/z;->D:LP8/b;

    .line 19
    invoke-virtual {p1}, LP8/z$a;->E()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, LP8/z;->E:Ljavax/net/SocketFactory;

    .line 20
    invoke-virtual {p1}, LP8/z$a;->l()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LP8/z;->H:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, LP8/z$a;->x()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LP8/z;->I:Ljava/util/List;

    .line 22
    invoke-virtual {p1}, LP8/z$a;->s()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, LP8/z;->J:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    invoke-virtual {p1}, LP8/z$a;->g()I

    move-result v1

    iput v1, p0, LP8/z;->M:I

    .line 24
    invoke-virtual {p1}, LP8/z$a;->j()I

    move-result v1

    iput v1, p0, LP8/z;->N:I

    .line 25
    invoke-virtual {p1}, LP8/z$a;->B()I

    move-result v1

    iput v1, p0, LP8/z;->O:I

    .line 26
    invoke-virtual {p1}, LP8/z$a;->G()I

    move-result v1

    iput v1, p0, LP8/z;->P:I

    .line 27
    invoke-virtual {p1}, LP8/z$a;->w()I

    move-result v1

    iput v1, p0, LP8/z;->Q:I

    .line 28
    invoke-virtual {p1}, LP8/z$a;->u()J

    move-result-wide v1

    iput-wide v1, p0, LP8/z;->R:J

    .line 29
    invoke-virtual {p1}, LP8/z$a;->D()LU8/h;

    move-result-object v1

    if-nez v1, :cond_c1

    new-instance v1, LU8/h;

    invoke-direct {v1}, LU8/h;-><init>()V

    :cond_c1
    iput-object v1, p0, LP8/z;->S:LU8/h;

    .line 30
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_d3

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d3

    goto :goto_147

    .line 32
    :cond_d3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_147

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP8/l;

    .line 33
    invoke-virtual {v1}, LP8/l;->f()Z

    move-result v1

    if-eqz v1, :cond_d7

    .line 34
    invoke-virtual {p1}, LP8/z$a;->F()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_115

    .line 35
    invoke-virtual {p1}, LP8/z$a;->F()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, LP8/z;->F:Ljavax/net/ssl/SSLSocketFactory;

    .line 36
    invoke-virtual {p1}, LP8/z$a;->h()Lc9/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iput-object v0, p0, LP8/z;->L:Lc9/c;

    .line 37
    invoke-virtual {p1}, LP8/z$a;->H()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iput-object v1, p0, LP8/z;->G:Ljavax/net/ssl/X509TrustManager;

    .line 38
    invoke-virtual {p1}, LP8/z$a;->i()LP8/g;

    move-result-object p1

    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LP8/g;->e(Lc9/c;)LP8/g;

    move-result-object p1

    .line 40
    iput-object p1, p0, LP8/z;->K:LP8/g;

    goto :goto_152

    .line 41
    :cond_115
    sget-object v0, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v0}, LZ8/h$a;->g()LZ8/h;

    move-result-object v1

    invoke-virtual {v1}, LZ8/h;->o()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, LP8/z;->G:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {v0}, LZ8/h$a;->g()LZ8/h;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LZ8/h;->n(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, LP8/z;->F:Ljavax/net/ssl/SSLSocketFactory;

    .line 43
    sget-object v0, Lc9/c;->a:Lc9/c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lc9/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lc9/c;

    move-result-object v0

    iput-object v0, p0, LP8/z;->L:Lc9/c;

    .line 44
    invoke-virtual {p1}, LP8/z$a;->i()LP8/g;

    move-result-object p1

    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LP8/g;->e(Lc9/c;)LP8/g;

    move-result-object p1

    .line 46
    iput-object p1, p0, LP8/z;->K:LP8/g;

    goto :goto_152

    :cond_147
    :goto_147
    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, LP8/z;->F:Ljavax/net/ssl/SSLSocketFactory;

    .line 48
    iput-object p1, p0, LP8/z;->L:Lc9/c;

    .line 49
    iput-object p1, p0, LP8/z;->G:Ljavax/net/ssl/X509TrustManager;

    .line 50
    sget-object p1, LP8/g;->d:LP8/g;

    iput-object p1, p0, LP8/z;->K:LP8/g;

    .line 51
    :goto_152
    invoke-direct {p0}, LP8/z;->K()V

    return-void
.end method

.method private final K()V
    .registers 4

    iget-object v0, p0, LP8/z;->s:Ljava/util/List;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b4

    iget-object v0, p0, LP8/z;->t:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_97

    iget-object v0, p0, LP8/z;->H:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_2b

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2b

    goto :goto_66

    :cond_2b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_66

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP8/l;

    invoke-virtual {v1}, LP8/l;->f()Z

    move-result v1

    if-eqz v1, :cond_2f

    iget-object v0, p0, LP8/z;->F:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5e

    iget-object v0, p0, LP8/z;->L:Lc9/c;

    if-eqz v0, :cond_56

    iget-object p0, p0, LP8/z;->G:Ljavax/net/ssl/X509TrustManager;

    if-eqz p0, :cond_4e

    goto :goto_7e

    :cond_4e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_56
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_66
    :goto_66
    iget-object v0, p0, LP8/z;->F:Ljavax/net/ssl/SSLSocketFactory;

    const-string v1, "Check failed."

    if-nez v0, :cond_91

    iget-object v0, p0, LP8/z;->L:Lc9/c;

    if-nez v0, :cond_8b

    iget-object v0, p0, LP8/z;->G:Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_85

    iget-object p0, p0, LP8/z;->K:LP8/g;

    sget-object v0, LP8/g;->d:LP8/g;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7f

    :goto_7e
    return-void

    :cond_7f
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_85
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8b
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_91
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/z;->t:Ljava/util/List;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/z;->s:Ljava/util/List;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic d()Ljava/util/List;
    .registers 1

    sget-object v0, LP8/z;->V:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic e()Ljava/util/List;
    .registers 1

    sget-object v0, LP8/z;->U:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final A()I
    .registers 1

    iget p0, p0, LP8/z;->Q:I

    return p0
.end method

.method public final C()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z;->I:Ljava/util/List;

    return-object p0
.end method

.method public final D()Ljava/net/Proxy;
    .registers 1

    iget-object p0, p0, LP8/z;->B:Ljava/net/Proxy;

    return-object p0
.end method

.method public final E()LP8/b;
    .registers 1

    iget-object p0, p0, LP8/z;->D:LP8/b;

    return-object p0
.end method

.method public final F()Ljava/net/ProxySelector;
    .registers 1

    iget-object p0, p0, LP8/z;->C:Ljava/net/ProxySelector;

    return-object p0
.end method

.method public final G()I
    .registers 1

    iget p0, p0, LP8/z;->O:I

    return p0
.end method

.method public final H()Z
    .registers 1

    iget-boolean p0, p0, LP8/z;->v:Z

    return p0
.end method

.method public final I()Ljavax/net/SocketFactory;
    .registers 1

    iget-object p0, p0, LP8/z;->E:Ljavax/net/SocketFactory;

    return-object p0
.end method

.method public final J()Ljavax/net/ssl/SSLSocketFactory;
    .registers 2

    iget-object p0, p0, LP8/z;->F:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz p0, :cond_5

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "CLEARTEXT-only client"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final L()I
    .registers 1

    iget p0, p0, LP8/z;->P:I

    return p0
.end method

.method public c(LP8/B;)LP8/e;
    .registers 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LU8/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LU8/e;-><init>(LP8/z;LP8/B;Z)V

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .registers 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final h()LP8/b;
    .registers 1

    iget-object p0, p0, LP8/z;->w:LP8/b;

    return-object p0
.end method

.method public final i()LP8/c;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public final j()I
    .registers 1

    iget p0, p0, LP8/z;->M:I

    return p0
.end method

.method public final k()LP8/g;
    .registers 1

    iget-object p0, p0, LP8/z;->K:LP8/g;

    return-object p0
.end method

.method public final l()I
    .registers 1

    iget p0, p0, LP8/z;->N:I

    return p0
.end method

.method public final m()LP8/k;
    .registers 1

    iget-object p0, p0, LP8/z;->r:LP8/k;

    return-object p0
.end method

.method public final n()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z;->H:Ljava/util/List;

    return-object p0
.end method

.method public final o()LP8/n;
    .registers 1

    iget-object p0, p0, LP8/z;->z:LP8/n;

    return-object p0
.end method

.method public final p()LP8/p;
    .registers 1

    iget-object p0, p0, LP8/z;->q:LP8/p;

    return-object p0
.end method

.method public final q()LP8/q;
    .registers 1

    iget-object p0, p0, LP8/z;->A:LP8/q;

    return-object p0
.end method

.method public final r()LP8/r$c;
    .registers 1

    iget-object p0, p0, LP8/z;->u:LP8/r$c;

    return-object p0
.end method

.method public final s()Z
    .registers 1

    iget-boolean p0, p0, LP8/z;->x:Z

    return p0
.end method

.method public final t()Z
    .registers 1

    iget-boolean p0, p0, LP8/z;->y:Z

    return p0
.end method

.method public final v()LU8/h;
    .registers 1

    iget-object p0, p0, LP8/z;->S:LU8/h;

    return-object p0
.end method

.method public final w()Ljavax/net/ssl/HostnameVerifier;
    .registers 1

    iget-object p0, p0, LP8/z;->J:Ljavax/net/ssl/HostnameVerifier;

    return-object p0
.end method

.method public final x()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z;->s:Ljava/util/List;

    return-object p0
.end method

.method public final y()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z;->t:Ljava/util/List;

    return-object p0
.end method
