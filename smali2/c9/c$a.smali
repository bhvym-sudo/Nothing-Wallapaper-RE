.class public final Lc9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lc9/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/X509TrustManager;)Lc9/c;
    .registers 2

    const-string p0, "trustManager"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LZ8/h;->a:LZ8/h$a;

    invoke-virtual {p0}, LZ8/h$a;->g()LZ8/h;

    move-result-object p0

    invoke-virtual {p0, p1}, LZ8/h;->c(Ljavax/net/ssl/X509TrustManager;)Lc9/c;

    move-result-object p0

    return-object p0
.end method
