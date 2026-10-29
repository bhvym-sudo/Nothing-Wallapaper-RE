.class public final Li6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li6/l;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Li6/l;

    invoke-direct {v0}, Li6/l;-><init>()V

    sput-object v0, Li6/l;->a:Li6/l;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .registers 4

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lc6/a;->b:Lc6/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lc6/a$a;->b(Lc6/a$a;Ljava/lang/String;ILjava/lang/Object;)Lc6/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lc6/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .registers 4

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lc6/a;->b:Lc6/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lc6/a$a;->b(Lc6/a$a;Ljava/lang/String;ILjava/lang/Object;)Lc6/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lc6/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final c(Landroid/content/Context;Z)Ljava/lang/String;
    .registers 5

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lc6/a;->b:Lc6/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lc6/a$a;->b(Lc6/a$a;Ljava/lang/String;ILjava/lang/Object;)Lc6/a;

    move-result-object p0

    const-class v0, Lcom/nothing/wallpaper/common/SecurityConfig;

    invoke-virtual {p0, p1, v0}, Lc6/a;->d(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/common/SecurityConfig;

    if-eqz p2, :cond_1c

    invoke-virtual {p0}, Lcom/nothing/wallpaper/common/SecurityConfig;->getReleaseUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1c
    invoke-virtual {p0}, Lcom/nothing/wallpaper/common/SecurityConfig;->getDebugUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .registers 4

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lc6/a;->b:Lc6/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lc6/a$a;->b(Lc6/a$a;Ljava/lang/String;ILjava/lang/Object;)Lc6/a;

    move-result-object p0

    const-class v0, Lcom/nothing/wallpaper/common/SecurityConfig;

    invoke-virtual {p0, p1, v0}, Lc6/a;->d(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/common/SecurityConfig;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/common/SecurityConfig;->getPrivacyUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final e(Landroid/content/Context;Z)Ljava/lang/String;
    .registers 5

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lc6/a;->b:Lc6/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lc6/a$a;->b(Lc6/a$a;Ljava/lang/String;ILjava/lang/Object;)Lc6/a;

    move-result-object p0

    const-class v0, Lcom/nothing/wallpaper/common/SecurityConfig;

    invoke-virtual {p0, p1, v0}, Lc6/a;->d(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/common/SecurityConfig;

    if-eqz p2, :cond_1c

    invoke-virtual {p0}, Lcom/nothing/wallpaper/common/SecurityConfig;->getLightTermsUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1c
    invoke-virtual {p0}, Lcom/nothing/wallpaper/common/SecurityConfig;->getDarkTermsUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
