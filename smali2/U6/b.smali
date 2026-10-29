.class public final LU6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU6/b;

.field private static final b:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LU6/b;

    invoke-direct {v0}, LU6/b;-><init>()V

    sput-object v0, LU6/b;->a:LU6/b;

    new-instance v0, LU6/a;

    invoke-direct {v0}, LU6/a;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LU6/b;->b:Lh8/h;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lm6/d;
    .registers 1

    invoke-static {}, LU6/b;->c()Lm6/d;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Lm6/d;
    .registers 3

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NTCreative_wallpapers_cache"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_1e
    sget-object v1, Lm6/d;->e:Lm6/d$b;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getAbsolutePath(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x64

    invoke-virtual {v1, v0, v2}, Lm6/d$b;->a(Ljava/lang/String;I)Lm6/d;

    move-result-object v0

    return-object v0
.end method

.method private final d()Lm6/a;
    .registers 1

    sget-object p0, LU6/b;->b:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm6/a;

    return-object p0
.end method


# virtual methods
.method public final b()Lm6/a;
    .registers 1

    invoke-direct {p0}, LU6/b;->d()Lm6/a;

    move-result-object p0

    return-object p0
.end method
