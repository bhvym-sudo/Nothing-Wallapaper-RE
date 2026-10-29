.class public final LR8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/a$a;
    }
.end annotation


# instance fields
.field private final d:LP8/q;


# direct methods
.method public constructor <init>(LP8/q;)V
    .registers 3

    const-string v0, "defaultDns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8/a;->d:LP8/q;

    return-void
.end method

.method public synthetic constructor <init>(LP8/q;ILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    .line 2
    sget-object p1, LP8/q;->b:LP8/q;

    :cond_6
    invoke-direct {p0, p1}, LR8/a;-><init>(LP8/q;)V

    return-void
.end method

.method private final b(Ljava/net/Proxy;LP8/v;LP8/q;)Ljava/net/InetAddress;
    .registers 5

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, -0x1

    goto :goto_10

    :cond_8
    sget-object v0, LR8/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_10
    const/4 v0, 0x1

    if-ne p0, v0, :cond_22

    invoke-virtual {p2}, LP8/v;->i()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p3, p0}, LP8/q;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/net/InetAddress;

    return-object p0

    :cond_22
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/net/InetSocketAddress;

    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p0

    const-string p1, "address() as InetSocketAddress).address"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public a(LP8/F;LP8/D;)LP8/B;
    .registers 22

    move-object/from16 v0, p0

    const-string v1, "response"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, LP8/D;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, LP8/D;->t0()LP8/B;

    move-result-object v3

    invoke-virtual {v3}, LP8/B;->j()LP8/v;

    move-result-object v4

    invoke-virtual {v2}, LP8/D;->j()I

    move-result v2

    const/16 v5, 0x197

    const/4 v6, 0x1

    if-ne v2, v5, :cond_20

    move v2, v6

    goto :goto_21

    :cond_20
    const/4 v2, 0x0

    :goto_21
    if-eqz p1, :cond_29

    invoke-virtual/range {p1 .. p1}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object v5

    if-nez v5, :cond_2b

    :cond_29
    sget-object v5, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    :cond_2b
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2f
    :goto_2f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LP8/h;

    invoke-virtual {v7}, LP8/h;->c()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Basic"

    invoke-static {v9, v8, v6}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-nez v8, :cond_48

    goto :goto_2f

    :cond_48
    if-eqz p1, :cond_56

    invoke-virtual/range {p1 .. p1}, LP8/F;->a()LP8/a;

    move-result-object v8

    if-eqz v8, :cond_56

    invoke-virtual {v8}, LP8/a;->c()LP8/q;

    move-result-object v8

    if-nez v8, :cond_58

    :cond_56
    iget-object v8, v0, LR8/a;->d:LP8/q;

    :cond_58
    const-string v9, "proxy"

    if-eqz v2, :cond_8d

    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/net/InetSocketAddress;

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v5, v4, v8}, LR8/a;->b(Ljava/net/Proxy;LP8/v;LP8/q;)Ljava/net/InetAddress;

    move-result-object v12

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v13

    invoke-virtual {v4}, LP8/v;->r()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7}, LP8/h;->b()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7}, LP8/h;->c()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4}, LP8/v;->t()Ljava/net/URL;

    move-result-object v17

    sget-object v18, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    invoke-static/range {v11 .. v18}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    goto :goto_b4

    :cond_8d
    invoke-virtual {v4}, LP8/v;->i()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v5, v4, v8}, LR8/a;->b(Ljava/net/Proxy;LP8/v;LP8/q;)Ljava/net/InetAddress;

    move-result-object v8

    invoke-virtual {v4}, LP8/v;->n()I

    move-result v11

    invoke-virtual {v4}, LP8/v;->r()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, LP8/h;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7}, LP8/h;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, LP8/v;->t()Ljava/net/URL;

    move-result-object v15

    sget-object v16, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    move-object v9, v10

    move-object v10, v8

    invoke-static/range {v9 .. v16}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    :goto_b4
    if-eqz v8, :cond_2f

    if-eqz v2, :cond_bb

    const-string v0, "Proxy-Authorization"

    goto :goto_bd

    :cond_bb
    const-string v0, "Authorization"

    :goto_bd
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "auth.userName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v2

    const-string v4, "auth.password"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v7}, LP8/h;->a()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-static {v1, v4, v2}, LP8/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, LP8/B;->h()LP8/B$a;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, LP8/B$a;->c(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/B$a;->b()LP8/B;

    move-result-object v0

    return-object v0

    :cond_e9
    const/4 v0, 0x0

    return-object v0
.end method
