.class public final La9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/j$a;
    }
.end annotation


# instance fields
.field private final a:La9/j$a;

.field private b:La9/k;


# direct methods
.method public constructor <init>(La9/j$a;)V
    .registers 3

    const-string v0, "socketAdapterFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/j;->a:La9/j$a;

    return-void
.end method

.method private final declared-synchronized e(Ljavax/net/ssl/SSLSocket;)La9/k;
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, La9/j;->b:La9/k;

    if-nez v0, :cond_18

    iget-object v0, p0, La9/j;->a:La9/j$a;

    invoke-interface {v0, p1}, La9/j$a;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, La9/j;->a:La9/j$a;

    invoke-interface {v0, p1}, La9/j$a;->b(Ljavax/net/ssl/SSLSocket;)La9/k;

    move-result-object p1

    iput-object p1, p0, La9/j;->b:La9/k;

    goto :goto_18

    :catchall_16
    move-exception p1

    goto :goto_1c

    :cond_18
    :goto_18
    iget-object p1, p0, La9/j;->b:La9/k;
    :try_end_1a
    .catchall {:try_start_1 .. :try_end_1a} :catchall_16

    monitor-exit p0

    return-object p1

    :goto_1c
    :try_start_1c
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1c .. :try_end_1d} :catchall_16

    throw p1
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)Z
    .registers 3

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, La9/j;->a:La9/j$a;

    invoke-interface {p0, p1}, La9/j$a;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result p0

    return p0
.end method

.method public b()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public c(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 3

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La9/j;->e(Ljavax/net/ssl/SSLSocket;)La9/k;

    move-result-object p0

    if-eqz p0, :cond_10

    invoke-interface {p0, p1}, La9/k;->c(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_10
    const/4 p0, 0x0

    return-object p0
.end method

.method public d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 5

    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La9/j;->e(Ljavax/net/ssl/SSLSocket;)La9/k;

    move-result-object p0

    if-eqz p0, :cond_13

    invoke-interface {p0, p1, p2, p3}, La9/k;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_13
    return-void
.end method
