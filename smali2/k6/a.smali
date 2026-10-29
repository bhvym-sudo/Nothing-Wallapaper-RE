.class public final Lk6/a;
.super Lk6/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/a$a;
    }
.end annotation


# static fields
.field public static final p:Lk6/a$a;


# instance fields
.field private final m:Landroid/util/Size;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lk6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lk6/a;->p:Lk6/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;ILjava/lang/String;)V
    .registers 5

    const-string v0, "maxSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p2}, Lk6/c;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lk6/a;->m:Landroid/util/Size;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "LargeSizeBitmapPool-"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk6/a;->n:Ljava/lang/String;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lk6/a;->o:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Lk6/a;->h()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " create a LargeSizeBitmapPool."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "LargeSizeBitmapPool"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected h()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lk6/a;->n:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)V
    .registers 2

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lk6/a;->w(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public p(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .registers 6

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lk6/a;->m:Landroid/util/Size;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result p3

    iget-object v0, p0, Lk6/a;->m:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-super {p0, p3, v0, v1}, Lk6/c;->p(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0, p1, p2, v1}, Lj6/b;->b(Landroid/graphics/Bitmap;IILandroid/graphics/Bitmap$Config;)V

    return-object p0
.end method

.method public t(Landroid/graphics/Bitmap;)V
    .registers 6

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lk6/c;->t(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lk6/a;->o:Ljava/util/WeakHashMap;

    monitor-enter v0

    :try_start_b
    iget-object p0, p0, Lk6/a;->o:Ljava/util/WeakHashMap;

    new-instance v1, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_1f
    .catchall {:try_start_b .. :try_end_1f} :catchall_21

    monitor-exit v0

    return-void

    :catchall_21
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method protected w(Landroid/graphics/Bitmap;)V
    .registers 7

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lk6/c;->w(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lk6/a;->o:Ljava/util/WeakHashMap;

    monitor-enter v0

    :try_start_b
    iget-object v1, p0, Lk6/a;->o:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    if-eqz v1, :cond_61

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget v3, v1, Landroid/graphics/Point;->x:I

    if-ne v2, v3, :cond_28

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget v3, v1, Landroid/graphics/Point;->y:I

    if-eq v2, v3, :cond_5f

    goto :goto_28

    :catchall_26
    move-exception p0

    goto :goto_89

    :cond_28
    :goto_28
    const-string v2, "LargeSizeBitmapPool"

    invoke-virtual {p0}, Lk6/a;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Lj6/b;->c(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " reconfigure "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " to original size "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget p0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, p0, v1, v2}, Landroid/graphics/Bitmap;->reconfigure(IILandroid/graphics/Bitmap$Config;)V
    :try_end_5f
    .catchall {:try_start_b .. :try_end_5f} :catchall_26

    :cond_5f
    monitor-exit v0

    return-void

    :cond_61
    monitor-exit v0

    const-string v0, "LargeSizeBitmapPool"

    invoke-virtual {p0}, Lk6/a;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Lj6/b;->c(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " recycle "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " but didn\'t find it\'s original size."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_89
    monitor-exit v0

    throw p0
.end method
