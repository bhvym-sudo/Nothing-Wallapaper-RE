.class public final Lcom/nothing/launcher/card/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/launcher/card/j;
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
    invoke-direct {p0}, Lcom/nothing/launcher/card/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LF5/m;)Lcom/nothing/launcher/card/j;
    .registers 5

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "cardInfo"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p2, Lcom/nothing/launcher/card/j;

    if-eqz p0, :cond_11

    check-cast p2, Lcom/nothing/launcher/card/j;

    return-object p2

    :cond_11
    new-instance p0, Lcom/nothing/launcher/card/j;

    invoke-direct {p0}, Lcom/nothing/launcher/card/j;-><init>()V

    invoke-static {p0, p2}, Lcom/nothing/launcher/card/j;->o0(Lcom/nothing/launcher/card/j;LF5/m;)V

    invoke-static {p0}, Lcom/nothing/launcher/card/j;->p0(Lcom/nothing/launcher/card/j;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p2}, LF5/m;->H()Ljava/lang/String;

    move-result-object p2

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {p0, p1}, Lcom/nothing/launcher/card/j;->q0(Lcom/nothing/launcher/card/j;I)V

    return-object p0
.end method
