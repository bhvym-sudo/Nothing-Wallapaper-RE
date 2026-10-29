.class public final Lc6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc6/a$a;
    }
.end annotation


# static fields
.field public static final b:Lc6/a$a;

.field private static final c:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field private final a:Lcom/nothing/security/sdk/SecurityConfig;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lc6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lc6/a;->b:Lc6/a$a;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lc6/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private constructor <init>(Lcom/nothing/security/sdk/SecurityConfig;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lc6/a;->a:Lcom/nothing/security/sdk/SecurityConfig;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/nothing/security/sdk/SecurityConfig;Lkotlin/jvm/internal/h;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lc6/a;-><init>(Lcom/nothing/security/sdk/SecurityConfig;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/concurrent/ConcurrentHashMap;
    .registers 1

    sget-object v0, Lc6/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lc6/a;->a:Lcom/nothing/security/sdk/SecurityConfig;

    invoke-virtual {p0, p1}, Lcom/nothing/security/sdk/SecurityConfig;->fetchKey1(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final c(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lc6/a;->a:Lcom/nothing/security/sdk/SecurityConfig;

    invoke-virtual {p0, p1}, Lcom/nothing/security/sdk/SecurityConfig;->fetchKey2(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final d(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object p0, p0, Lc6/a;->a:Lcom/nothing/security/sdk/SecurityConfig;

    invoke-virtual {p0, p1}, Lcom/nothing/security/sdk/SecurityConfig;->fetchCustomData(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
