.class public final LV8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV8/j$a;
    }
.end annotation


# static fields
.field public static final b:LV8/j$a;


# instance fields
.field private final a:LP8/z;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LV8/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV8/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LV8/j;->b:LV8/j$a;

    return-void
.end method

.method public constructor <init>(LP8/z;)V
    .registers 3

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV8/j;->a:LP8/z;

    return-void
.end method

.method private final b(LP8/D;Ljava/lang/String;)LP8/B;
    .registers 10

    iget-object v0, p0, LV8/j;->a:LP8/z;

    invoke-virtual {v0}, LP8/z;->s()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return-object v1

    :cond_a
    const-string v0, "Location"

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_14

    return-object v1

    :cond_14
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object v2

    invoke-virtual {v2}, LP8/B;->j()LP8/v;

    move-result-object v2

    invoke-virtual {v2, v0}, LP8/v;->q(Ljava/lang/String;)LP8/v;

    move-result-object v0

    if-nez v0, :cond_23

    return-object v1

    :cond_23
    invoke-virtual {v0}, LP8/v;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object v3

    invoke-virtual {v3}, LP8/B;->j()LP8/v;

    move-result-object v3

    invoke-virtual {v3}, LP8/v;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_42

    iget-object p0, p0, LV8/j;->a:LP8/z;

    invoke-virtual {p0}, LP8/z;->t()Z

    move-result p0

    if-nez p0, :cond_42

    return-object v1

    :cond_42
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p0

    invoke-virtual {p0}, LP8/B;->h()LP8/B$a;

    move-result-object p0

    invoke-static {p2}, LV8/f;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_96

    invoke-virtual {p1}, LP8/D;->j()I

    move-result v2

    sget-object v3, LV8/f;->a:LV8/f;

    invoke-virtual {v3, p2}, LV8/f;->c(Ljava/lang/String;)Z

    move-result v4

    const/16 v5, 0x133

    const/16 v6, 0x134

    if-nez v4, :cond_67

    if-eq v2, v6, :cond_67

    if-ne v2, v5, :cond_65

    goto :goto_67

    :cond_65
    const/4 v4, 0x0

    goto :goto_68

    :cond_67
    :goto_67
    const/4 v4, 0x1

    :goto_68
    invoke-virtual {v3, p2}, LV8/f;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_78

    if-eq v2, v6, :cond_78

    if-eq v2, v5, :cond_78

    const-string p2, "GET"

    invoke-virtual {p0, p2, v1}, LP8/B$a;->e(Ljava/lang/String;LP8/C;)LP8/B$a;

    goto :goto_85

    :cond_78
    if-eqz v4, :cond_82

    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object v1

    invoke-virtual {v1}, LP8/B;->a()LP8/C;

    move-result-object v1

    :cond_82
    invoke-virtual {p0, p2, v1}, LP8/B$a;->e(Ljava/lang/String;LP8/C;)LP8/B$a;

    :goto_85
    if-nez v4, :cond_96

    const-string p2, "Transfer-Encoding"

    invoke-virtual {p0, p2}, LP8/B$a;->f(Ljava/lang/String;)LP8/B$a;

    const-string p2, "Content-Length"

    invoke-virtual {p0, p2}, LP8/B$a;->f(Ljava/lang/String;)LP8/B$a;

    const-string p2, "Content-Type"

    invoke-virtual {p0, p2}, LP8/B$a;->f(Ljava/lang/String;)LP8/B$a;

    :cond_96
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p1

    invoke-virtual {p1}, LP8/B;->j()LP8/v;

    move-result-object p1

    invoke-static {p1, v0}, LQ8/d;->j(LP8/v;LP8/v;)Z

    move-result p1

    if-nez p1, :cond_a9

    const-string p1, "Authorization"

    invoke-virtual {p0, p1}, LP8/B$a;->f(Ljava/lang/String;)LP8/B$a;

    :cond_a9
    invoke-virtual {p0, v0}, LP8/B$a;->h(LP8/v;)LP8/B$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/B$a;->b()LP8/B;

    move-result-object p0

    return-object p0
.end method

.method private final c(LP8/D;LU8/c;)LP8/B;
    .registers 8

    const/4 v0, 0x0

    if-eqz p2, :cond_e

    invoke-virtual {p2}, LU8/c;->h()LU8/f;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, LU8/f;->A()LP8/F;

    move-result-object v1

    goto :goto_f

    :cond_e
    move-object v1, v0

    :goto_f
    invoke-virtual {p1}, LP8/D;->j()I

    move-result v2

    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object v3

    invoke-virtual {v3}, LP8/B;->g()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x133

    if-eq v2, v4, :cond_df

    const/16 v4, 0x134

    if-eq v2, v4, :cond_df

    const/16 v4, 0x191

    if-eq v2, v4, :cond_d4

    const/16 v4, 0x1a5

    if-eq v2, v4, :cond_ad

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_91

    const/16 p2, 0x197

    if-eq v2, p2, :cond_6f

    const/16 p2, 0x198

    if-eq v2, p2, :cond_3b

    packed-switch v2, :pswitch_data_e4

    return-object v0

    :cond_3b
    iget-object v1, p0, LV8/j;->a:LP8/z;

    invoke-virtual {v1}, LP8/z;->H()Z

    move-result v1

    if-nez v1, :cond_44

    return-object v0

    :cond_44
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object v1

    invoke-virtual {v1}, LP8/B;->a()LP8/C;

    move-result-object v1

    if-eqz v1, :cond_55

    invoke-virtual {v1}, LP8/C;->f()Z

    move-result v1

    if-eqz v1, :cond_55

    return-object v0

    :cond_55
    invoke-virtual {p1}, LP8/D;->Y()LP8/D;

    move-result-object v1

    if-eqz v1, :cond_62

    invoke-virtual {v1}, LP8/D;->j()I

    move-result v1

    if-ne v1, p2, :cond_62

    return-object v0

    :cond_62
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LV8/j;->g(LP8/D;I)I

    move-result p0

    if-lez p0, :cond_6a

    return-object v0

    :cond_6a
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p0

    return-object p0

    :cond_6f
    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v1}, LP8/F;->b()Ljava/net/Proxy;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_89

    iget-object p0, p0, LV8/j;->a:LP8/z;

    invoke-virtual {p0}, LP8/z;->E()LP8/b;

    move-result-object p0

    invoke-interface {p0, v1, p1}, LP8/b;->a(LP8/F;LP8/D;)LP8/B;

    move-result-object p0

    return-object p0

    :cond_89
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_91
    invoke-virtual {p1}, LP8/D;->Y()LP8/D;

    move-result-object v1

    if-eqz v1, :cond_9e

    invoke-virtual {v1}, LP8/D;->j()I

    move-result v1

    if-ne v1, p2, :cond_9e

    return-object v0

    :cond_9e
    const p2, 0x7fffffff

    invoke-direct {p0, p1, p2}, LV8/j;->g(LP8/D;I)I

    move-result p0

    if-nez p0, :cond_ac

    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p0

    return-object p0

    :cond_ac
    return-object v0

    :cond_ad
    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p0

    invoke-virtual {p0}, LP8/B;->a()LP8/C;

    move-result-object p0

    if-eqz p0, :cond_be

    invoke-virtual {p0}, LP8/C;->f()Z

    move-result p0

    if-eqz p0, :cond_be

    return-object v0

    :cond_be
    if-eqz p2, :cond_d3

    invoke-virtual {p2}, LU8/c;->l()Z

    move-result p0

    if-nez p0, :cond_c7

    goto :goto_d3

    :cond_c7
    invoke-virtual {p2}, LU8/c;->h()LU8/f;

    move-result-object p0

    invoke-virtual {p0}, LU8/f;->y()V

    invoke-virtual {p1}, LP8/D;->t0()LP8/B;

    move-result-object p0

    return-object p0

    :cond_d3
    :goto_d3
    return-object v0

    :cond_d4
    iget-object p0, p0, LV8/j;->a:LP8/z;

    invoke-virtual {p0}, LP8/z;->h()LP8/b;

    move-result-object p0

    invoke-interface {p0, v1, p1}, LP8/b;->a(LP8/F;LP8/D;)LP8/B;

    move-result-object p0

    return-object p0

    :cond_df
    :pswitch_df
    invoke-direct {p0, p1, v3}, LV8/j;->b(LP8/D;Ljava/lang/String;)LP8/B;

    move-result-object p0

    return-object p0

    :pswitch_data_e4
    .packed-switch 0x12c
        :pswitch_df
        :pswitch_df
        :pswitch_df
        :pswitch_df
    .end packed-switch
.end method

.method private final d(Ljava/io/IOException;Z)Z
    .registers 5

    instance-of p0, p1, Ljava/net/ProtocolException;

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    return v0

    :cond_6
    instance-of p0, p1, Ljava/io/InterruptedIOException;

    const/4 v1, 0x1

    if-eqz p0, :cond_13

    instance-of p0, p1, Ljava/net/SocketTimeoutException;

    if-eqz p0, :cond_12

    if-nez p2, :cond_12

    return v1

    :cond_12
    return v0

    :cond_13
    instance-of p0, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p0, :cond_20

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Ljava/security/cert/CertificateException;

    if-eqz p0, :cond_20

    return v0

    :cond_20
    instance-of p0, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p0, :cond_25

    return v0

    :cond_25
    return v1
.end method

.method private final e(Ljava/io/IOException;LU8/e;LP8/B;Z)Z
    .registers 7

    iget-object v0, p0, LV8/j;->a:LP8/z;

    invoke-virtual {v0}, LP8/z;->H()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return v1

    :cond_a
    if-eqz p4, :cond_13

    invoke-direct {p0, p1, p3}, LV8/j;->f(Ljava/io/IOException;LP8/B;)Z

    move-result p3

    if-eqz p3, :cond_13

    return v1

    :cond_13
    invoke-direct {p0, p1, p4}, LV8/j;->d(Ljava/io/IOException;Z)Z

    move-result p0

    if-nez p0, :cond_1a

    return v1

    :cond_1a
    invoke-virtual {p2}, LU8/e;->C()Z

    move-result p0

    if-nez p0, :cond_21

    return v1

    :cond_21
    const/4 p0, 0x1

    return p0
.end method

.method private final f(Ljava/io/IOException;LP8/B;)Z
    .registers 3

    invoke-virtual {p2}, LP8/B;->a()LP8/C;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, LP8/C;->f()Z

    move-result p0

    if-nez p0, :cond_10

    :cond_c
    instance-of p0, p1, Ljava/io/FileNotFoundException;

    if-eqz p0, :cond_12

    :cond_10
    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method private final g(LP8/D;I)I
    .registers 5

    const/4 p0, 0x0

    const/4 v0, 0x2

    const-string v1, "Retry-After"

    invoke-static {p1, v1, p0, v0, p0}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_b

    return p2

    :cond_b
    new-instance p1, LE8/g;

    const-string p2, "\\d+"

    invoke-direct {p1, p2}, LE8/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LE8/g;->a(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_26

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "valueOf(header)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_26
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 12

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV8/g;

    invoke-virtual {p1}, LV8/g;->j()LP8/B;

    move-result-object v0

    invoke-virtual {p1}, LV8/g;->f()LU8/e;

    move-result-object v1

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move v8, v3

    move-object v7, v4

    :goto_18
    move v6, v5

    :goto_19
    invoke-virtual {v1, v0, v6}, LU8/e;->l(LP8/B;Z)V

    :try_start_1c
    invoke-virtual {v1}, LU8/e;->f()Z

    move-result v6
    :try_end_20
    .catchall {:try_start_1c .. :try_end_20} :catchall_42

    if-nez v6, :cond_d3

    :try_start_22
    invoke-virtual {p1, v0}, LV8/g;->a(LP8/B;)LP8/D;

    move-result-object v0
    :try_end_26
    .catch LU8/i; {:try_start_22 .. :try_end_26} :catch_b4
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_26} :catch_99
    .catchall {:try_start_22 .. :try_end_26} :catchall_42

    if-eqz v7, :cond_40

    :try_start_28
    invoke-virtual {v0}, LP8/D;->U()LP8/D$a;

    move-result-object v0

    invoke-virtual {v7}, LP8/D;->U()LP8/D$a;

    move-result-object v6

    invoke-virtual {v6, v4}, LP8/D$a;->b(LP8/E;)LP8/D$a;

    move-result-object v6

    invoke-virtual {v6}, LP8/D$a;->c()LP8/D;

    move-result-object v6

    invoke-virtual {v0, v6}, LP8/D$a;->o(LP8/D;)LP8/D$a;

    move-result-object v0

    invoke-virtual {v0}, LP8/D$a;->c()LP8/D;

    move-result-object v0

    :cond_40
    move-object v7, v0

    goto :goto_45

    :catchall_42
    move-exception p0

    goto/16 :goto_db

    :goto_45
    invoke-virtual {v1}, LU8/e;->r()LU8/c;

    move-result-object v0

    invoke-direct {p0, v7, v0}, LV8/j;->c(LP8/D;LU8/c;)LP8/B;

    move-result-object v6

    if-nez v6, :cond_5e

    if-eqz v0, :cond_5a

    invoke-virtual {v0}, LU8/c;->m()Z

    move-result p0

    if-eqz p0, :cond_5a

    invoke-virtual {v1}, LU8/e;->E()V
    :try_end_5a
    .catchall {:try_start_28 .. :try_end_5a} :catchall_42

    :cond_5a
    invoke-virtual {v1, v3}, LU8/e;->m(Z)V

    return-object v7

    :cond_5e
    :try_start_5e
    invoke-virtual {v6}, LP8/B;->a()LP8/C;

    move-result-object v0

    if-eqz v0, :cond_6e

    invoke-virtual {v0}, LP8/C;->f()Z

    move-result v0
    :try_end_68
    .catchall {:try_start_5e .. :try_end_68} :catchall_42

    if-eqz v0, :cond_6e

    invoke-virtual {v1, v3}, LU8/e;->m(Z)V

    return-object v7

    :cond_6e
    :try_start_6e
    invoke-virtual {v7}, LP8/D;->a()LP8/E;

    move-result-object v0

    if-eqz v0, :cond_77

    invoke-static {v0}, LQ8/d;->m(Ljava/io/Closeable;)V
    :try_end_77
    .catchall {:try_start_6e .. :try_end_77} :catchall_42

    :cond_77
    add-int/lit8 v8, v8, 0x1

    const/16 v0, 0x14

    if-gt v8, v0, :cond_82

    invoke-virtual {v1, v5}, LU8/e;->m(Z)V

    move-object v0, v6

    goto :goto_18

    :cond_82
    :try_start_82
    new-instance p0, Ljava/net/ProtocolException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Too many follow-up requests: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_99
    move-exception v6

    instance-of v9, v6, LX8/a;

    xor-int/2addr v9, v5

    invoke-direct {p0, v6, v1, v0, v9}, LV8/j;->e(Ljava/io/IOException;LU8/e;LP8/B;Z)Z

    move-result v9

    if-eqz v9, :cond_af

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, v6}, Li8/s;->h0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_a9
    .catchall {:try_start_82 .. :try_end_a9} :catchall_42

    :goto_a9
    invoke-virtual {v1, v5}, LU8/e;->m(Z)V

    move v6, v3

    goto/16 :goto_19

    :cond_af
    :try_start_af
    invoke-static {v6, v2}, LQ8/d;->Y(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :catch_b4
    move-exception v6

    invoke-virtual {v6}, LU8/i;->c()Ljava/io/IOException;

    move-result-object v9

    invoke-direct {p0, v9, v1, v0, v3}, LV8/j;->e(Ljava/io/IOException;LU8/e;LP8/B;Z)Z

    move-result v9

    if-eqz v9, :cond_ca

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v6}, LU8/i;->b()Ljava/io/IOException;

    move-result-object v6

    invoke-static {v2, v6}, Li8/s;->h0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_a9

    :cond_ca
    invoke-virtual {v6}, LU8/i;->b()Ljava/io/IOException;

    move-result-object p0

    invoke-static {p0, v2}, LQ8/d;->Y(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_d3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Canceled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_db
    .catchall {:try_start_af .. :try_end_db} :catchall_42

    :goto_db
    invoke-virtual {v1, v5}, LU8/e;->m(Z)V

    throw p0
.end method
