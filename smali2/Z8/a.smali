.class public final LZ8/a;
.super LZ8/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ8/a$a;
    }
.end annotation


# static fields
.field public static final e:LZ8/a$a;

.field private static final f:Z


# instance fields
.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LZ8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZ8/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LZ8/a;->e:LZ8/a$a;

    sget-object v0, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {v0}, LZ8/h$a;->h()Z

    move-result v0

    sput-boolean v0, LZ8/a;->f:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 6

    invoke-direct {p0}, LZ8/h;-><init>()V

    sget-object v0, La9/a;->a:La9/a$a;

    invoke-virtual {v0}, La9/a$a;->a()La9/k;

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

    :cond_3d
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_54

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, La9/k;

    invoke-interface {v3}, La9/k;->b()Z

    move-result v3

    if-eqz v3, :cond_3d

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_54
    iput-object v1, p0, LZ8/a;->d:Ljava/util/List;

    return-void
.end method

.method public static final synthetic p()Z
    .registers 1

    sget-boolean v0, LZ8/a;->f:Z

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

.method public e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 6

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LZ8/a;->d:Ljava/util/List;

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

.method public g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 5

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LZ8/a;->d:Ljava/util/List;

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
