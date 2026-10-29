.class public final LP8/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:I

.field private B:J

.field private C:LU8/h;

.field private a:LP8/p;

.field private b:LP8/k;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private e:LP8/r$c;

.field private f:Z

.field private g:LP8/b;

.field private h:Z

.field private i:Z

.field private j:LP8/n;

.field private k:LP8/q;

.field private l:Ljava/net/Proxy;

.field private m:Ljava/net/ProxySelector;

.field private n:LP8/b;

.field private o:Ljavax/net/SocketFactory;

.field private p:Ljavax/net/ssl/SSLSocketFactory;

.field private q:Ljavax/net/ssl/X509TrustManager;

.field private r:Ljava/util/List;

.field private s:Ljava/util/List;

.field private t:Ljavax/net/ssl/HostnameVerifier;

.field private u:LP8/g;

.field private v:Lc9/c;

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LP8/p;

    invoke-direct {v0}, LP8/p;-><init>()V

    iput-object v0, p0, LP8/z$a;->a:LP8/p;

    new-instance v0, LP8/k;

    invoke-direct {v0}, LP8/k;-><init>()V

    iput-object v0, p0, LP8/z$a;->b:LP8/k;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP8/z$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP8/z$a;->d:Ljava/util/List;

    sget-object v0, LP8/r;->b:LP8/r;

    invoke-static {v0}, LQ8/d;->g(LP8/r;)LP8/r$c;

    move-result-object v0

    iput-object v0, p0, LP8/z$a;->e:LP8/r$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, LP8/z$a;->f:Z

    sget-object v1, LP8/b;->b:LP8/b;

    iput-object v1, p0, LP8/z$a;->g:LP8/b;

    iput-boolean v0, p0, LP8/z$a;->h:Z

    iput-boolean v0, p0, LP8/z$a;->i:Z

    sget-object v0, LP8/n;->b:LP8/n;

    iput-object v0, p0, LP8/z$a;->j:LP8/n;

    sget-object v0, LP8/q;->b:LP8/q;

    iput-object v0, p0, LP8/z$a;->k:LP8/q;

    iput-object v1, p0, LP8/z$a;->n:LP8/b;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LP8/z$a;->o:Ljavax/net/SocketFactory;

    sget-object v0, LP8/z;->T:LP8/z$b;

    invoke-virtual {v0}, LP8/z$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LP8/z$a;->r:Ljava/util/List;

    invoke-virtual {v0}, LP8/z$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LP8/z$a;->s:Ljava/util/List;

    sget-object v0, Lc9/d;->a:Lc9/d;

    iput-object v0, p0, LP8/z$a;->t:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, LP8/g;->d:LP8/g;

    iput-object v0, p0, LP8/z$a;->u:LP8/g;

    const/16 v0, 0x2710

    iput v0, p0, LP8/z$a;->x:I

    iput v0, p0, LP8/z$a;->y:I

    iput v0, p0, LP8/z$a;->z:I

    const-wide/16 v0, 0x400

    iput-wide v0, p0, LP8/z$a;->B:J

    return-void
.end method


# virtual methods
.method public final A()Ljava/net/ProxySelector;
    .registers 1

    iget-object p0, p0, LP8/z$a;->m:Ljava/net/ProxySelector;

    return-object p0
.end method

.method public final B()I
    .registers 1

    iget p0, p0, LP8/z$a;->y:I

    return p0
.end method

.method public final C()Z
    .registers 1

    iget-boolean p0, p0, LP8/z$a;->f:Z

    return p0
.end method

.method public final D()LU8/h;
    .registers 1

    iget-object p0, p0, LP8/z$a;->C:LU8/h;

    return-object p0
.end method

.method public final E()Ljavax/net/SocketFactory;
    .registers 1

    iget-object p0, p0, LP8/z$a;->o:Ljavax/net/SocketFactory;

    return-object p0
.end method

.method public final F()Ljavax/net/ssl/SSLSocketFactory;
    .registers 1

    iget-object p0, p0, LP8/z$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    return-object p0
.end method

.method public final G()I
    .registers 1

    iget p0, p0, LP8/z$a;->z:I

    return p0
.end method

.method public final H()Ljavax/net/ssl/X509TrustManager;
    .registers 1

    iget-object p0, p0, LP8/z$a;->q:Ljavax/net/ssl/X509TrustManager;

    return-object p0
.end method

.method public final I(JLjava/util/concurrent/TimeUnit;)LP8/z$a;
    .registers 5

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, LQ8/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, LP8/z$a;->y:I

    return-object p0
.end method

.method public final J(Ljava/time/Duration;)LP8/z$a;
    .registers 4

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, LP8/z$a;->I(JLjava/util/concurrent/TimeUnit;)LP8/z$a;

    return-object p0
.end method

.method public final a(LP8/w;)LP8/z$a;
    .registers 3

    const-string v0, "interceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/z$a;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()LP8/z;
    .registers 2

    new-instance v0, LP8/z;

    invoke-direct {v0, p0}, LP8/z;-><init>(LP8/z$a;)V

    return-object v0
.end method

.method public final c(JLjava/util/concurrent/TimeUnit;)LP8/z$a;
    .registers 5

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, LQ8/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, LP8/z$a;->x:I

    return-object p0
.end method

.method public final d(Ljava/time/Duration;)LP8/z$a;
    .registers 4

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, LP8/z$a;->c(JLjava/util/concurrent/TimeUnit;)LP8/z$a;

    return-object p0
.end method

.method public final e()LP8/b;
    .registers 1

    iget-object p0, p0, LP8/z$a;->g:LP8/b;

    return-object p0
.end method

.method public final f()LP8/c;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public final g()I
    .registers 1

    iget p0, p0, LP8/z$a;->w:I

    return p0
.end method

.method public final h()Lc9/c;
    .registers 1

    iget-object p0, p0, LP8/z$a;->v:Lc9/c;

    return-object p0
.end method

.method public final i()LP8/g;
    .registers 1

    iget-object p0, p0, LP8/z$a;->u:LP8/g;

    return-object p0
.end method

.method public final j()I
    .registers 1

    iget p0, p0, LP8/z$a;->x:I

    return p0
.end method

.method public final k()LP8/k;
    .registers 1

    iget-object p0, p0, LP8/z$a;->b:LP8/k;

    return-object p0
.end method

.method public final l()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z$a;->r:Ljava/util/List;

    return-object p0
.end method

.method public final m()LP8/n;
    .registers 1

    iget-object p0, p0, LP8/z$a;->j:LP8/n;

    return-object p0
.end method

.method public final n()LP8/p;
    .registers 1

    iget-object p0, p0, LP8/z$a;->a:LP8/p;

    return-object p0
.end method

.method public final o()LP8/q;
    .registers 1

    iget-object p0, p0, LP8/z$a;->k:LP8/q;

    return-object p0
.end method

.method public final p()LP8/r$c;
    .registers 1

    iget-object p0, p0, LP8/z$a;->e:LP8/r$c;

    return-object p0
.end method

.method public final q()Z
    .registers 1

    iget-boolean p0, p0, LP8/z$a;->h:Z

    return p0
.end method

.method public final r()Z
    .registers 1

    iget-boolean p0, p0, LP8/z$a;->i:Z

    return p0
.end method

.method public final s()Ljavax/net/ssl/HostnameVerifier;
    .registers 1

    iget-object p0, p0, LP8/z$a;->t:Ljavax/net/ssl/HostnameVerifier;

    return-object p0
.end method

.method public final t()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public final u()J
    .registers 3

    iget-wide v0, p0, LP8/z$a;->B:J

    return-wide v0
.end method

.method public final v()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z$a;->d:Ljava/util/List;

    return-object p0
.end method

.method public final w()I
    .registers 1

    iget p0, p0, LP8/z$a;->A:I

    return p0
.end method

.method public final x()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/z$a;->s:Ljava/util/List;

    return-object p0
.end method

.method public final y()Ljava/net/Proxy;
    .registers 1

    iget-object p0, p0, LP8/z$a;->l:Ljava/net/Proxy;

    return-object p0
.end method

.method public final z()LP8/b;
    .registers 1

    iget-object p0, p0, LP8/z$a;->n:LP8/b;

    return-object p0
.end method
