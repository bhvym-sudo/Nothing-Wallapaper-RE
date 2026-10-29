.class public final Lf7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf7/b;

.field private static b:Ljava/lang/Boolean;

.field private static c:Landroid/content/Intent;

.field private static d:Ljava/lang/Boolean;

.field private static e:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lf7/b;

    invoke-direct {v0}, Lf7/b;-><init>()V

    sput-object v0, Lf7/b;->a:Lf7/b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;
    .registers 2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string p1, "getPackageManager(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ln6/b;->a(Landroid/content/pm/PackageManager;)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;
    .registers 2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string p1, "getPackageManager(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ln6/b;->b(Landroid/content/pm/PackageManager;)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Z
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf7/b;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_e
    invoke-direct {p0, p1}, Lf7/b;->a(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    goto :goto_17

    :cond_16
    const/4 p0, 0x0

    :goto_17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sput-object p1, Lf7/b;->d:Ljava/lang/Boolean;

    invoke-static {}, Lf7/a;->a()Landroid/content/Intent;

    move-result-object p1

    sput-object p1, Lf7/b;->e:Landroid/content/Intent;

    return p0
.end method

.method public final d(Landroid/content/Context;)Z
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf7/b;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_e
    invoke-direct {p0, p1}, Lf7/b;->b(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    goto :goto_17

    :cond_16
    const/4 p0, 0x0

    :goto_17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sput-object p1, Lf7/b;->b:Ljava/lang/Boolean;

    invoke-static {}, Lf7/a;->b()Landroid/content/Intent;

    move-result-object p1

    sput-object p1, Lf7/b;->c:Landroid/content/Intent;

    return p0
.end method
