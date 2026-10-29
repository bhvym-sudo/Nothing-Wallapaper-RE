.class public final Lx6/c;
.super Lcom/android/wallpaper/asset/a;
.source "SourceFile"


# instance fields
.field private final b:Landroid/graphics/Bitmap;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .registers 3

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/android/wallpaper/asset/a;-><init>()V

    iput-object p1, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    const-string p1, "BitmapAsset"

    iput-object p1, p0, Lx6/c;->c:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lx6/c;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic t(Lx6/c;IILandroid/graphics/Rect;Lcom/android/wallpaper/asset/a$d;)V
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, Lx6/c;->x(Lx6/c;IILandroid/graphics/Rect;Lcom/android/wallpaper/asset/a$d;)V

    return-void
.end method

.method public static synthetic u(Lx6/c;IILcom/android/wallpaper/asset/a$d;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lx6/c;->w(Lx6/c;IILcom/android/wallpaper/asset/a$d;)V

    return-void
.end method

.method private final v()Landroid/graphics/Point;
    .registers 3

    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object p0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    invoke-direct {v0, v1, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method private static final w(Lx6/c;IILcom/android/wallpaper/asset/a$d;)V
    .registers 6

    iget-object v0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createScaledBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1}, Lcom/android/wallpaper/asset/a;->h(Lcom/android/wallpaper/asset/a$d;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final x(Lx6/c;IILandroid/graphics/Rect;Lcom/android/wallpaper/asset/a$d;)V
    .registers 13

    iget-object v0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    const/16 v6, 0x20

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v7}, LG6/b;->e(Landroid/graphics/Bitmap;IILandroid/graphics/Rect;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p4, p1}, Lcom/android/wallpaper/asset/a;->h(Lcom/android/wallpaper/asset/a$d;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public g(IIZLcom/android/wallpaper/asset/a$d;)V
    .registers 6

    const-string p3, "receiver"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lx6/c;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lx6/a;

    invoke-direct {v0, p0, p1, p2, p4}, Lx6/a;-><init>(Lx6/c;IILcom/android/wallpaper/asset/a$d;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public i(Landroid/graphics/Rect;IIZLcom/android/wallpaper/asset/a$d;)V
    .registers 12

    const-string p4, "rect"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "receiver"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p4

    iget-object v0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", raw = ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", "

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "), rect = "

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iget v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-le v0, v1, :cond_6c

    iget-object v0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    iget-object v0, p0, Lx6/c;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "decodeBitmapRegion: before x + width has > bitmap.width() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", updatedRect = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6c
    iget v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_a1

    iget-object v0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lx6/c;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "decodeBitmapRegion: before y + height has > bitmap.height() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ",updatedRect = "

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {v0, p4}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a1
    iget-object p4, p0, Lx6/c;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lx6/b;

    move-object v1, p0

    move-object v4, p1

    move v2, p2

    move v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lx6/b;-><init>(Lx6/c;IILandroid/graphics/Rect;Lcom/android/wallpaper/asset/a$d;)V

    invoke-interface {p4, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public j(Landroid/app/Activity;Lcom/android/wallpaper/asset/a$e;)V
    .registers 3

    const-string p1, "receiver"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lx6/c;->v()Landroid/graphics/Point;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/android/wallpaper/asset/a$e;->a(Landroid/graphics/Point;)V

    return-void
.end method

.method public final y()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lx6/c;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method
