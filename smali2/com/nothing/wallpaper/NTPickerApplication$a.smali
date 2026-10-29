.class public final Lcom/nothing/wallpaper/NTPickerApplication$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/NTPickerApplication;
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
    invoke-direct {p0}, Lcom/nothing/wallpaper/NTPickerApplication$a;-><init>()V

    return-void
.end method

.method private final c(Landroid/app/Application;)V
    .registers 2

    invoke-static {p1}, Lcom/nothing/wallpaper/NTPickerApplication;->b(Landroid/app/Application;)V

    return-void
.end method

.method private final d(Landroid/app/Application;)V
    .registers 2

    invoke-static {p1}, Lcom/nothing/wallpaper/common/log/c;->l(Landroid/content/Context;)V

    sget-object p0, Li6/o;->a:Li6/o;

    invoke-virtual {p0, p1}, Li6/o;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_e

    const-string p0, "main"

    goto :goto_10

    :cond_e
    const-string p0, "blur"

    :goto_10
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/FileLog;->setDir(Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Application;
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/NTPickerApplication;->a()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final b(Landroid/app/Application;)V
    .registers 3

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->d(Landroid/app/Application;)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->c(Landroid/app/Application;)V

    new-instance p0, LK6/c;

    invoke-direct {p0}, LK6/c;-><init>()V

    invoke-static {p0}, Lh3/I;->b(Lh3/H;)V

    sget-object p0, LA6/b;->a:LA6/b;

    invoke-virtual {p0, p1}, LA6/b;->i(Landroid/app/Application;)V

    sget-object p0, Li6/o;->a:Li6/o;

    invoke-virtual {p0, p1}, Li6/o;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_2a

    sget-object p0, Ly6/a;->a:Ly6/a;

    invoke-virtual {p0, p1}, Ly6/a;->b(Landroid/content/Context;)V

    sget-object p0, LL6/b;->a:LL6/b;

    invoke-virtual {p0, p1}, LL6/b;->h(Landroid/content/Context;)V

    :cond_2a
    return-void
.end method
