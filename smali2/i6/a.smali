.class public final Li6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li6/a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Li6/a;

    invoke-direct {v0}, Li6/a;-><init>()V

    sput-object v0, Li6/a;->a:Li6/a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Li6/a;Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;IILjava/lang/Object;)Z
    .registers 7

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_5

    const/4 p3, 0x0

    :cond_5
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_b

    sget p4, Li6/p;->a:I

    :cond_b
    invoke-virtual {p0, p1, p2, p3, p4}, Li6/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;I)Z
    .registers 6

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "intent"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_a
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_d
    .catch Ljava/lang/NullPointerException; {:try_start_a .. :try_end_d} :catch_f
    .catch Landroid/content/ActivityNotFoundException; {:try_start_a .. :try_end_d} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_d} :catch_f

    const/4 p0, 0x0

    goto :goto_10

    :catch_f
    move-exception p0

    :goto_10
    const/4 p3, 0x0

    if-eqz p0, :cond_3e

    if-lez p4, :cond_1c

    invoke-static {p1, p4, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_1c
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "startActivitySafely: Unable to launch intent = "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", exception is "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ActivityJumper"

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3e
    if-nez p0, :cond_41

    const/4 p3, 0x1

    :cond_41
    return p3
.end method
