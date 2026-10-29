.class public final La9/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)Z
    .registers 2

    const-string p0, "sslSocket"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LZ8/d;->e:LZ8/d$a;

    invoke-virtual {p0}, LZ8/d$a;->c()Z

    move-result p0

    if-eqz p0, :cond_15

    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->isConscrypt(Ljavax/net/ssl/SSLSocket;)Z

    move-result p0

    if-eqz p0, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method public b(Ljavax/net/ssl/SSLSocket;)La9/k;
    .registers 2

    const-string p0, "sslSocket"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, La9/i;

    invoke-direct {p0}, La9/i;-><init>()V

    return-object p0
.end method
