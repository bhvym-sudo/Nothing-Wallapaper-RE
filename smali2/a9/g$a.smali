.class public final La9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/g;
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

    sget-object p0, LZ8/c;->e:LZ8/c$a;

    invoke-virtual {p0}, LZ8/c$a;->b()Z

    const/4 p0, 0x0

    return p0
.end method

.method public b(Ljavax/net/ssl/SSLSocket;)La9/k;
    .registers 2

    const-string p0, "sslSocket"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, La9/g;

    invoke-direct {p0}, La9/g;-><init>()V

    return-object p0
.end method
