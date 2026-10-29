.class public final Li6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private c:Lv8/l;

.field private final d:Lh8/h;

.field private final e:Li6/k$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/k;->a:Landroid/content/Context;

    const-string p1, "NTNetworkStatusNotifier"

    iput-object p1, p0, Li6/k;->b:Ljava/lang/String;

    new-instance p1, Li6/j;

    invoke-direct {p1, p0}, Li6/j;-><init>(Li6/k;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Li6/k;->d:Lh8/h;

    new-instance p1, Li6/k$a;

    invoke-direct {p1, p0}, Li6/k$a;-><init>(Li6/k;)V

    iput-object p1, p0, Li6/k;->e:Li6/k$a;

    return-void
.end method

.method public static synthetic a(Li6/k;)Landroid/net/ConnectivityManager;
    .registers 1

    invoke-static {p0}, Li6/k;->d(Li6/k;)Landroid/net/ConnectivityManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Li6/k;)Lv8/l;
    .registers 1

    iget-object p0, p0, Li6/k;->c:Lv8/l;

    return-object p0
.end method

.method public static final synthetic c(Li6/k;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Li6/k;->b:Ljava/lang/String;

    return-object p0
.end method

.method private static final d(Li6/k;)Landroid/net/ConnectivityManager;
    .registers 2

    iget-object p0, p0, Li6/k;->a:Landroid/content/Context;

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/net/ConnectivityManager;

    return-object p0
.end method

.method private final e()Landroid/net/ConnectivityManager;
    .registers 1

    iget-object p0, p0, Li6/k;->d:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    return-object p0
.end method


# virtual methods
.method public final f(Lv8/l;)V
    .registers 4

    const-string v0, "networkChanged"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li6/k;->c:Lv8/l;

    if-nez v0, :cond_14

    invoke-direct {p0}, Li6/k;->e()Landroid/net/ConnectivityManager;

    move-result-object v0

    iget-object v1, p0, Li6/k;->e:Li6/k$a;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    iput-object p1, p0, Li6/k;->c:Lv8/l;

    :cond_14
    return-void
.end method

.method public final g()V
    .registers 3

    iget-object v0, p0, Li6/k;->c:Lv8/l;

    if-eqz v0, :cond_10

    invoke-direct {p0}, Li6/k;->e()Landroid/net/ConnectivityManager;

    move-result-object v0

    iget-object v1, p0, Li6/k;->e:Li6/k$a;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 v0, 0x0

    iput-object v0, p0, Li6/k;->c:Lv8/l;

    :cond_10
    return-void
.end method
