.class public abstract Ln6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const-string v0, "content://com.nothing.blurwallpaper.AtmosphereProvider/final"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Ln6/a;->a:Landroid/net/Uri;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .registers 6

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Ln6/a;->a:Landroid/net/Uri;

    const-string v2, "r"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->openFile(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_5 .. :try_end_14} :catchall_2c

    if-eqz v0, :cond_35

    :try_start_16
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_27
    .catchall {:try_start_16 .. :try_end_27} :catchall_2e

    :try_start_27
    invoke-static {v0, v3}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2a
    .catchall {:try_start_27 .. :try_end_2a} :catchall_2c

    move-object v3, v1

    goto :goto_35

    :catchall_2c
    move-exception v0

    goto :goto_3a

    :catchall_2e
    move-exception v1

    :try_start_2f
    throw v1
    :try_end_30
    .catchall {:try_start_2f .. :try_end_30} :catchall_30

    :catchall_30
    move-exception v2

    :try_start_31
    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_35
    :goto_35
    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_39
    .catchall {:try_start_31 .. :try_end_39} :catchall_2c

    goto :goto_44

    :goto_3a
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {v0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_44
    invoke-static {v0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_60

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadBlurThumbnail error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "LiveWallpaperThumbAssetExt"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_60
    sget-object v1, Lq5/n;->a:Lq5/n;

    invoke-virtual {v1}, Lq5/n;->l()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {v0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_71

    move-object v0, p0

    :cond_71
    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public static final b(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .registers 6

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_6
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Ln6/a;->a:Landroid/net/Uri;

    const-string v3, "r"

    invoke-virtual {v1, v2, v3, v0}, Landroid/content/ContentResolver;->openFile(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object v1
    :try_end_14
    .catchall {:try_start_6 .. :try_end_14} :catchall_22

    if-eqz v1, :cond_2b

    :try_start_16
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_1e
    .catchall {:try_start_16 .. :try_end_1e} :catchall_24

    :try_start_1e
    invoke-static {v1, v0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_21
    .catchall {:try_start_1e .. :try_end_21} :catchall_22

    goto :goto_2c

    :catchall_22
    move-exception v1

    goto :goto_31

    :catchall_24
    move-exception v2

    :try_start_25
    throw v2
    :try_end_26
    .catchall {:try_start_25 .. :try_end_26} :catchall_26

    :catchall_26
    move-exception v3

    :try_start_27
    invoke-static {v1, v2}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_2b
    move-object v2, v0

    :goto_2c
    invoke-static {v2}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_30
    .catchall {:try_start_27 .. :try_end_30} :catchall_22

    goto :goto_3b

    :goto_31
    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-static {v1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_3b
    invoke-static {v1}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_57

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadBlurThumbnailBitmap error:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "LiveWallpaperThumbAssetExt"

    invoke-static {v3, v2}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_57
    invoke-static {v1}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5e

    goto :goto_5f

    :cond_5e
    move-object v0, v1

    :goto_5f
    check-cast v0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_69

    sget-object v0, Lq5/n;->a:Lq5/n;

    invoke-virtual {v0, p0}, Lq5/n;->m(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_69
    return-object v0
.end method
