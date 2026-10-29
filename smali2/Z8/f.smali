.class public LZ8/f;
.super LZ8/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ8/f$a;
    }
.end annotation


# static fields
.field public static final d:LZ8/f$a;

.field private static final e:Z


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, LZ8/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZ8/f$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LZ8/f;->d:LZ8/f$a;

    const-string v0, "java.specification.version"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-static {v0}, LE8/i;->r(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    :cond_14
    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_23

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x9

    if-lt v1, v3, :cond_21

    goto :goto_2c

    :catch_21
    :cond_21
    move v0, v2

    goto :goto_2c

    :cond_23
    :try_start_23
    const-class v1, Ljavax/net/ssl/SSLSocket;

    const-string v3, "getApplicationProtocol"

    new-array v4, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_2c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_23 .. :try_end_2c} :catch_21

    :goto_2c
    sput-boolean v0, LZ8/f;->e:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LZ8/h;-><init>()V

    return-void
.end method

.method public static final synthetic p()Z
    .registers 1

    sget-boolean v0, LZ8/f;->e:Z

    return v0
.end method


# virtual methods
.method public e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 4

    const-string p0, "sslSocket"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "protocols"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSSLParameters()Ljavax/net/ssl/SSLParameters;

    move-result-object p0

    sget-object p2, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {p2, p3}, LZ8/h$a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/String;

    invoke-interface {p2, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljavax/net/ssl/SSLParameters;->setApplicationProtocols([Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V

    return-void
.end method

.method public g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 3

    const-string p0, "sslSocket"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    :try_start_6
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getApplicationProtocol()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_e

    const/4 v0, 0x1

    goto :goto_14

    :cond_e
    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_14
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_6 .. :try_end_14} :catch_18

    :goto_14
    if-eqz v0, :cond_17

    return-object p0

    :cond_17
    return-object p1

    :catch_18
    return-object p0
.end method
