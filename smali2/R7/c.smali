.class public final LR7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR7/c;

.field private static b:LR7/a;

.field private static final c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LR7/c;

    invoke-direct {v0}, LR7/c;-><init>()V

    sput-object v0, LR7/c;->a:LR7/c;

    new-instance v0, LR7/a;

    sget-object v1, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v1

    invoke-direct {v0, v1}, LR7/a;-><init>(Landroid/content/Context;)V

    sput-object v0, LR7/c;->b:LR7/a;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, LR7/c;->c:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 2

    invoke-static {p0, p1}, LR7/c;->c(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private static final c(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    sget-object v0, LR7/c;->b:LR7/a;

    invoke-virtual {v0, p0, p1}, LR7/a;->a(Ljava/lang/String;Landroid/os/Bundle;)Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 4

    const-string p0, "eventName"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "eventParams"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LR7/c;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v0, LR7/b;

    invoke-direct {v0, p1, p2}, LR7/b;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
