.class public final Lc6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc6/a;
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
    invoke-direct {p0}, Lc6/a$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lc6/a$a;Ljava/lang/String;ILjava/lang/Object;)Lc6/a;
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    const-string p1, ""

    :cond_6
    invoke-virtual {p0, p1}, Lc6/a$a;->a(Ljava/lang/String;)Lc6/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lc6/a;
    .registers 5

    const-string p0, "dir"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lc6/a;->a()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    new-instance v0, Lc6/a;

    new-instance v1, Lcom/nothing/security/sdk/SecurityConfig;

    invoke-direct {v1, p1}, Lcom/nothing/security/sdk/SecurityConfig;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc6/a;-><init>(Lcom/nothing/security/sdk/SecurityConfig;Lkotlin/jvm/internal/h;)V

    invoke-interface {p0, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_21

    goto :goto_22

    :cond_21
    move-object v0, p0

    :cond_22
    :goto_22
    const-string p0, "getOrPut(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lc6/a;

    return-object v0
.end method
