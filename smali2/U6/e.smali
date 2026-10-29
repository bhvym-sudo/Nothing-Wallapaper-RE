.class public final LU6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU6/e$a;
    }
.end annotation


# static fields
.field public static final c:LU6/e$a;

.field private static final d:Lh8/h;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LU6/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU6/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LU6/e;->c:LU6/e$a;

    new-instance v0, LU6/c;

    invoke-direct {v0}, LU6/c;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LU6/e;->d:Lh8/h;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ImageDiskCache"

    iput-object v0, p0, LU6/e;->a:Ljava/lang/String;

    new-instance v0, LU6/d;

    invoke-direct {v0}, LU6/d;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, LU6/e;->b:Lh8/h;

    return-void
.end method

.method public static synthetic a()Lm6/a;
    .registers 1

    invoke-static {}, LU6/e;->f()Lm6/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()LU6/e;
    .registers 1

    invoke-static {}, LU6/e;->j()LU6/e;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c()Lh8/h;
    .registers 1

    sget-object v0, LU6/e;->d:Lh8/h;

    return-object v0
.end method

.method private static final f()Lm6/a;
    .registers 1

    sget-object v0, LU6/b;->a:LU6/b;

    invoke-virtual {v0}, LU6/b;->b()Lm6/a;

    move-result-object v0

    return-object v0
.end method

.method private final i()Lm6/a;
    .registers 1

    iget-object p0, p0, LU6/e;->b:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm6/a;

    return-object p0
.end method

.method private static final j()LU6/e;
    .registers 1

    new-instance v0, LU6/e;

    invoke-direct {v0}, LU6/e;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final d(Ljava/lang/String;)V
    .registers 3

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU6/e;->i()Lm6/a;

    move-result-object p0

    invoke-interface {p0, p1}, Lm6/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final e()V
    .registers 2

    invoke-direct {p0}, LU6/e;->i()Lm6/a;

    move-result-object p0

    const/16 v0, 0x63

    invoke-interface {p0, v0}, Lm6/a;->a(I)V

    return-void
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU6/e;->i()Lm6/a;

    move-result-object p0

    invoke-interface {p0, p1}, Lm6/a;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final h()I
    .registers 1

    invoke-direct {p0}, LU6/e;->i()Lm6/a;

    move-result-object p0

    invoke-interface {p0}, Lm6/a;->b()I

    move-result p0

    return p0
.end method

.method public final k(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU6/e;->i()Lm6/a;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lm6/a;->d(Ljava/lang/String;Landroid/graphics/Bitmap;)Z

    move-result p0

    return p0
.end method

.method public final l(Landroid/content/Context;Ljava/lang/String;)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_a
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    const/high16 v0, -0x80000000

    invoke-virtual {p1, v0, v0}, Lcom/bumptech/glide/RequestBuilder;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_22} :catch_23

    goto :goto_3f

    :catch_23
    move-exception p1

    iget-object v0, p0, LU6/e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "load image failed, msg:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_3f
    if-eqz p1, :cond_48

    invoke-direct {p0}, LU6/e;->i()Lm6/a;

    move-result-object p0

    invoke-interface {p0, p2, p1}, Lm6/a;->d(Ljava/lang/String;Landroid/graphics/Bitmap;)Z

    :cond_48
    return-void
.end method
