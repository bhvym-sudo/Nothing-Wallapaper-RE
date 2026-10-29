.class public final Lx6/g;
.super Lcom/android/wallpaper/asset/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/g$a;
    }
.end annotation


# static fields
.field public static final k:Lx6/g$a;


# instance fields
.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/ref/WeakReference;

.field private i:Landroid/media/ExifInterface;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lx6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx6/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lx6/g;->k:Lx6/g$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lx6/r;)V
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/android/wallpaper/asset/o;-><init>()V

    iput-object p1, p0, Lx6/g;->g:Ljava/lang/String;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lx6/g;->h:Ljava/lang/ref/WeakReference;

    const/4 p1, -0x1

    iput p1, p0, Lx6/g;->j:I

    return-void
.end method

.method private final R()V
    .registers 6

    const-string v0, "EffectAsset"

    iget-object v1, p0, Lx6/g;->i:Landroid/media/ExifInterface;

    if-nez v1, :cond_51

    :try_start_6
    invoke-virtual {p0}, Lx6/g;->O()Ljava/io/InputStream;

    move-result-object v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_a} :catch_33

    if-eqz v1, :cond_16

    :try_start_c
    new-instance v2, Landroid/media/ExifInterface;

    invoke-direct {v2, v1}, Landroid/media/ExifInterface;-><init>(Ljava/io/InputStream;)V

    iput-object v2, p0, Lx6/g;->i:Landroid/media/ExifInterface;

    goto :goto_2c

    :catchall_14
    move-exception v2

    goto :goto_35

    :cond_16
    iget-object v2, p0, Lx6/g;->g:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Stream is null when create exif for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2c
    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_2e
    .catchall {:try_start_c .. :try_end_2e} :catchall_14

    const/4 v2, 0x0

    :try_start_2f
    invoke-static {v1, v2}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_32
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_32} :catch_33

    return-void

    :catch_33
    move-exception v1

    goto :goto_3b

    :goto_35
    :try_start_35
    throw v2
    :try_end_36
    .catchall {:try_start_35 .. :try_end_36} :catchall_36

    :catchall_36
    move-exception v3

    :try_start_37
    invoke-static {v1, v2}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_3b
    .catch Ljava/io/IOException; {:try_start_37 .. :try_end_3b} :catch_33

    :goto_3b
    iget-object p0, p0, Lx6/g;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Couldn\'t read stream when create exif for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0, v1}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_51
    return-void
.end method

.method private final T()I
    .registers 4

    invoke-direct {p0}, Lx6/g;->R()V

    iget-object v0, p0, Lx6/g;->i:Landroid/media/ExifInterface;

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    const-string p0, "Orientation"

    invoke-virtual {v0, p0, v1}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_f
    iget-object p0, p0, Lx6/g;->g:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to read EXIF rotation for EffectAsset["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "EffectAsset"

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method


# virtual methods
.method public G()I
    .registers 3

    iget v0, p0, Lx6/g;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    invoke-direct {p0}, Lx6/g;->T()I

    move-result v0

    iput v0, p0, Lx6/g;->j:I

    return v0
.end method

.method public O()Ljava/io/InputStream;
    .registers 3

    iget-object v0, p0, Lx6/g;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/r;

    if-eqz v0, :cond_11

    iget-object p0, p0, Lx6/g;->g:Ljava/lang/String;

    invoke-interface {v0, p0}, Lx6/r;->W(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    goto :goto_12

    :cond_11
    const/4 p0, 0x0

    :goto_12
    if-nez p0, :cond_1b

    const-string v0, "EffectAsset"

    const-string v1, "cache is been recycled, return null InputStream."

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1b
    return-object p0
.end method

.method public final S()Landroid/net/Uri;
    .registers 2

    iget-object v0, p0, Lx6/g;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/r;

    if-eqz v0, :cond_11

    iget-object p0, p0, Lx6/g;->g:Ljava/lang/String;

    invoke-interface {v0, p0}, Lx6/r;->Q0(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_11
    const/4 p0, 0x0

    return-object p0
.end method

.method protected h(Lcom/android/wallpaper/asset/a$d;Landroid/graphics/Bitmap;)V
    .registers 3

    if-eqz p1, :cond_5

    invoke-interface {p1, p2}, Lcom/android/wallpaper/asset/a$d;->a(Landroid/graphics/Bitmap;)V

    :cond_5
    return-void
.end method
