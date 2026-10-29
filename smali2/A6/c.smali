.class public final LA6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA6/c$a;
    }
.end annotation


# static fields
.field public static final D:LA6/c$a;

.field private static final E:Landroid/net/Uri;


# instance fields
.field private A:Ljava/io/File;

.field private B:Z

.field private C:Z

.field private final q:Landroid/content/Context;

.field private final r:Lq6/b;

.field private final s:LF8/L;

.field private final t:Landroid/content/Context;

.field private final u:Ljava/util/Map;

.field private final v:I

.field private w:Lk6/a;

.field private final x:Landroid/util/LruCache;

.field private y:Ljava/lang/String;

.field private z:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LA6/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA6/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LA6/c;->D:LA6/c$a;

    const-string v0, "content://com.nothing.blurwallpaper.AtmosphereProvider"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, LA6/c;->E:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA6/c;->q:Landroid/content/Context;

    new-instance v0, Lq6/b;

    const-string v1, "BlurImageUtil"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LA6/c;->r:Lq6/b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    invoke-interface {v0, v1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    iput-object v0, p0, LA6/c;->s:LF8/L;

    invoke-virtual {p1}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "createDeviceProtectedStorageContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA6/c;->t:Landroid/content/Context;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LA6/c;->u:Ljava/util/Map;

    const/4 p1, 0x6

    iput p1, p0, LA6/c;->v:I

    new-instance v0, LA6/c$b;

    invoke-direct {v0, p0, p1}, LA6/c$b;-><init>(LA6/c;I)V

    iput-object v0, p0, LA6/c;->x:Landroid/util/LruCache;

    return-void
.end method

.method private final A0()V
    .registers 8

    iget-object v0, p0, LA6/c;->y:Ljava/lang/String;

    if-eqz v0, :cond_21

    iget-boolean v0, p0, LA6/c;->B:Z

    if-eqz v0, :cond_21

    iget-object v0, p0, LA6/c;->r:Lq6/b;

    const-string v1, "notifyCleanPreview"

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LA6/c;->B:Z

    sget-object v1, LF8/r0;->q:LF8/r0;

    new-instance v4, LA6/c$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, LA6/c$d;-><init>(LA6/c;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_21
    return-void
.end method

.method private final B()V
    .registers 2

    iget-boolean p0, p0, LA6/c;->C:Z

    if-nez p0, :cond_5

    return-void

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "BlurHelper is closed!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final B0(LC6/i;Ljava/io/File;)V
    .registers 8

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    new-instance p2, Ljava/io/BufferedOutputStream;

    const/16 v1, 0x2000

    invoke-direct {p2, v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    :try_start_c
    iget-object v0, p0, LA6/c;->w:Lk6/a;
    :try_end_e
    .catchall {:try_start_c .. :try_end_e} :catchall_18

    const-string v1, "bitmapPool"

    const/4 v2, 0x0

    if-nez v0, :cond_1a

    :try_start_13
    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    goto :goto_1a

    :catchall_18
    move-exception p0

    goto :goto_58

    :cond_1a
    :goto_1a
    invoke-static {p1, v0}, LG6/b;->a(LC6/i;Lk6/c;)Lh8/o;

    move-result-object p1

    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_2e
    .catchall {:try_start_13 .. :try_end_2e} :catchall_18

    :try_start_2e
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {v0, v3, v4, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_35
    .catchall {:try_start_2e .. :try_end_35} :catchall_48

    if-eqz p1, :cond_42

    :try_start_37
    iget-object p0, p0, LA6/c;->w:Lk6/a;

    if-nez p0, :cond_3f

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v2

    :cond_3f
    invoke-virtual {p0, v0}, Lk6/e;->m(Ljava/lang/Object;)V
    :try_end_42
    .catchall {:try_start_37 .. :try_end_42} :catchall_18

    :cond_42
    :try_start_42
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_45
    .catchall {:try_start_42 .. :try_end_45} :catchall_46

    goto :goto_61

    :catchall_46
    move-exception v2

    goto :goto_61

    :catchall_48
    move-exception v3

    if-eqz p1, :cond_57

    :try_start_4b
    iget-object p0, p0, LA6/c;->w:Lk6/a;

    if-nez p0, :cond_53

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_54

    :cond_53
    move-object v2, p0

    :goto_54
    invoke-virtual {v2, v0}, Lk6/e;->m(Ljava/lang/Object;)V

    :cond_57
    throw v3
    :try_end_58
    .catchall {:try_start_4b .. :try_end_58} :catchall_18

    :goto_58
    :try_start_58
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_5b
    .catchall {:try_start_58 .. :try_end_5b} :catchall_5c

    goto :goto_60

    :catchall_5c
    move-exception p1

    invoke-static {p0, p1}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_60
    move-object v2, p0

    :goto_61
    if-nez v2, :cond_64

    return-void

    :cond_64
    throw v2
.end method

.method private final K(Ljava/io/File;J)V
    .registers 15

    invoke-direct {p0}, LA6/c;->Y()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_b8

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    array-length v2, v0

    goto :goto_14

    :cond_13
    move v2, v1

    :goto_14
    if-eqz v0, :cond_92

    array-length v3, v0

    move v4, v1

    move v5, v4

    :goto_19
    if-ge v4, v3, :cond_91

    aget-object v6, v0, v4

    :try_start_1d
    invoke-virtual {v6}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v7

    const-class v8, Ljava/nio/file/attribute/BasicFileAttributes;

    new-array v9, v1, [Ljava/nio/file/LinkOption;

    invoke-static {v7, v8, v9}, Ljava/nio/file/Files;->readAttributes(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object v7

    const-string v8, "readAttributes(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7}, Ljava/nio/file/attribute/BasicFileAttributes;->creationTime()Ljava/nio/file/attribute/FileTime;

    move-result-object v7

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v8}, Ljava/nio/file/attribute/FileTime;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v7

    invoke-static {v6, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8e

    cmp-long v7, v7, p2

    if-gez v7, :cond_8e

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    iget-object v7, p0, LA6/c;->r:Lq6/b;

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "file "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " create time < "

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ", delete."

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lq6/b;->c(Ljava/lang/String;)V
    :try_end_6e
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_6e} :catch_6f

    goto :goto_8e

    :catch_6f
    iget-object v7, p0, LA6/c;->r:Lq6/b;

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "get file "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " create time failed."

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lq6/b;->e(Ljava/lang/String;)V

    :cond_8e
    :goto_8e
    add-int/lit8 v4, v4, 0x1

    goto :goto_19

    :cond_91
    move v1, v5

    :cond_92
    iget-object p0, p0, LA6/c;->r:Lq6/b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "deleteFiles: total count "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", delete files "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", keep "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->d(Ljava/lang/String;)V

    :cond_b8
    return-void
.end method

.method private final Q(Ll6/a;)Ljava/io/File;
    .registers 3

    invoke-direct {p0}, LA6/c;->Y()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    :cond_d
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Ll6/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final U(Ljava/io/File;)Ljava/lang/String;
    .registers 2

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    const-string p1, "getPath(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final Y()Ljava/io/File;
    .registers 3

    new-instance v0, Ljava/io/File;

    iget-object p0, p0, LA6/c;->t:Landroid/content/Context;

    invoke-static {p0}, LG6/c;->g(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    const-string v1, "blur"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final synthetic a()Landroid/net/Uri;
    .registers 1

    sget-object v0, LA6/c;->E:Landroid/net/Uri;

    return-object v0
.end method

.method public static final synthetic b(LA6/c;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, LA6/c;->q:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic f(LA6/c;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LA6/c;->y:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic g(LA6/c;)Lq6/b;
    .registers 1

    iget-object p0, p0, LA6/c;->r:Lq6/b;

    return-object p0
.end method

.method public static final synthetic j(LA6/c;)Ljava/util/Map;
    .registers 1

    iget-object p0, p0, LA6/c;->u:Ljava/util/Map;

    return-object p0
.end method

.method private final q0(Ljava/lang/String;Ljava/lang/String;)Ll6/a;
    .registers 4

    new-instance v0, Ll6/a;

    if-nez p1, :cond_6

    const-string p1, "ORIGIN"

    :cond_6
    iget-object p0, p0, LA6/c;->y:Ljava/lang/String;

    if-nez p0, :cond_10

    const-string p0, "groupField"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_10
    invoke-direct {v0, p1, p2, p0}, Ll6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final synthetic u(LA6/c;LC6/i;Ljava/io/File;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LA6/c;->B0(LC6/i;Ljava/io/File;)V

    return-void
.end method

.method public static final synthetic z(LA6/c;Ljava/io/File;)V
    .registers 2

    iput-object p1, p0, LA6/c;->A:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final G(ZJ)V
    .registers 7

    iget-object v0, p0, LA6/c;->y:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_28

    if-eqz p1, :cond_9

    iget-object v1, p0, LA6/c;->z:Ljava/io/File;

    :cond_9
    iget-object p1, p0, LA6/c;->r:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tryClean, keep "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq6/b;->d(Ljava/lang/String;)V

    invoke-direct {p0, v1, p2, p3}, LA6/c;->K(Ljava/io/File;J)V

    return-void

    :cond_28
    if-nez p1, :cond_34

    iget-object p1, p0, LA6/c;->r:Lq6/b;

    const-string v0, "tryClean delete all."

    invoke-virtual {p1, v0}, Lq6/b;->d(Ljava/lang/String;)V

    invoke-direct {p0, v1, p2, p3}, LA6/c;->K(Ljava/io/File;J)V

    :cond_34
    return-void
.end method

.method public final I()V
    .registers 2

    iget-object v0, p0, LA6/c;->y:Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object p0, p0, LA6/c;->z:Ljava/io/File;

    if-eqz p0, :cond_b

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    :cond_b
    return-void
.end method

.method public final declared-synchronized I0(Ljava/util/Map;Z)Ljava/util/Map;
    .registers 19

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    monitor-enter p0

    :try_start_5
    const-string v0, "originBitmaps"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1}, LA6/c;->B()V

    iget-object v0, v1, LA6/c;->w:Lk6/a;

    if-nez v0, :cond_78

    invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_72

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC6/i;

    invoke-virtual {v2}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v2}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_3b
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_62

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC6/i;

    invoke-virtual {v3}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-virtual {v3}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-ge v2, v3, :cond_3b

    move v2, v3

    goto :goto_3b

    :catchall_5f
    move-exception v0

    goto/16 :goto_146

    :cond_62
    new-instance v0, Lk6/a;

    new-instance v3, Landroid/util/Size;

    invoke-direct {v3, v2, v2}, Landroid/util/Size;-><init>(II)V

    const-string v2, "BlurImageUtil"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v2}, Lk6/a;-><init>(Landroid/util/Size;ILjava/lang/String;)V

    iput-object v0, v1, LA6/c;->w:Lk6/a;

    goto :goto_78

    :cond_72
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_78
    :goto_78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-wide v9, v4

    :goto_93
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC6/e;

    invoke-virtual {v6}, LC6/e;->a()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v11, 0x1

    add-long/2addr v11, v9

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v1, v6, v9}, LA6/c;->q0(Ljava/lang/String;Ljava/lang/String;)Ll6/a;

    move-result-object v6

    invoke-direct {v1, v6}, LA6/c;->Q(Ll6/a;)Ljava/io/File;

    move-result-object v9

    new-instance v10, Lh8/u;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v10, v6, v9, v3}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-wide v9, v11

    goto :goto_93

    :cond_c6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_ca
    :goto_ca
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_121

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lh8/u;

    invoke-virtual {v3}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/a;

    invoke-virtual {v0}, Ll6/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-direct {v1, v2}, LA6/c;->U(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, LA6/c;->x:Landroid/util/LruCache;

    invoke-virtual {v3}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v2, v6}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_ca

    invoke-virtual {v3}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    iget-object v10, v1, LA6/c;->s:LF8/L;

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v11

    new-instance v13, LA6/c$e;

    const/4 v6, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v6}, LA6/c$e;-><init>(LA6/c;Ljava/lang/String;Lh8/u;JLm8/e;)V

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LF8/g;->b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;

    move-result-object v0

    iget-object v3, v1, LA6/c;->u:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_ca

    :cond_121
    iget-object v0, v1, LA6/c;->r:Lq6/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "savePreview for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " consume "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_144
    .catchall {:try_start_5 .. :try_end_144} :catchall_5f

    monitor-exit p0

    return-object v8

    :goto_146
    :try_start_146
    monitor-exit p0
    :try_end_147
    .catchall {:try_start_146 .. :try_end_147} :catchall_5f

    throw v0
.end method

.method public final O0(Ljava/lang/String;)V
    .registers 3

    const-string v0, "group"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LA6/c;->B()V

    iput-object p1, p0, LA6/c;->y:Ljava/lang/String;

    return-void
.end method

.method public final P0(Ljava/lang/String;)V
    .registers 7

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    const-string v2, "setGroupByPath for "

    if-nez v1, :cond_2c

    iget-object p0, p0, LA6/c;->r:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",but the file didn\'t exists."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    return-void

    :cond_2c
    sget-object v1, Ll6/a;->e:Ll6/a$a;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ll6/a$a;->a(Ljava/lang/String;)Ll6/a;

    move-result-object v1

    invoke-virtual {v1}, Ll6/a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LA6/c;->y:Ljava/lang/String;

    iput-object v0, p0, LA6/c;->z:Ljava/io/File;

    iget-object p0, p0, LA6/c;->r:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " success."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final b0()Ljava/lang/String;
    .registers 2

    iget-object p0, p0, LA6/c;->y:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p0, :cond_e

    if-nez p0, :cond_d

    const-string p0, "groupField"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    return-object v0

    :cond_d
    return-object p0

    :cond_e
    return-object v0
.end method

.method public declared-synchronized close()V
    .registers 4

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, LA6/c;->s:LF8/L;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    iget-object v0, p0, LA6/c;->x:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    iget-object v0, p0, LA6/c;->A:Ljava/io/File;

    if-eqz v0, :cond_1b

    iget-object v0, p0, LA6/c;->z:Ljava/io/File;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_1b

    :catchall_19
    move-exception v0

    goto :goto_30

    :cond_1b
    :goto_1b
    invoke-direct {p0}, LA6/c;->A0()V

    iget-object v0, p0, LA6/c;->w:Lk6/a;

    if-eqz v0, :cond_2e

    if-nez v0, :cond_2a

    const-string v0, "bitmapPool"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_2b

    :cond_2a
    move-object v2, v0

    :goto_2b
    invoke-virtual {v2}, Lk6/e;->d()V
    :try_end_2e
    .catchall {:try_start_1 .. :try_end_2e} :catchall_19

    :cond_2e
    monitor-exit p0

    return-void

    :goto_30
    :try_start_30
    monitor-exit p0
    :try_end_31
    .catchall {:try_start_30 .. :try_end_31} :catchall_19

    throw v0
.end method

.method public final declared-synchronized t0(Ljava/lang/String;Landroid/app/WallpaperColors;)Z
    .registers 12

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LA6/c;->B()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v4, Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyBlurDone: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Ll6/a;->e:Ll6/a$a;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll6/a$a;->a(Ljava/lang/String;)Ll6/a;

    move-result-object v0

    :goto_41
    iget-object v1, p0, LA6/c;->u:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1
    :try_end_47
    .catchall {:try_start_1 .. :try_end_47} :catchall_c3

    if-eqz v1, :cond_6c

    :try_start_49
    iget-object v1, p0, LA6/c;->r:Lq6/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyBlurDone: wait for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " job finished."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq6/b;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_67
    .catchall {:try_start_49 .. :try_end_67} :catchall_68

    goto :goto_41

    :catchall_68
    move-exception v0

    move-object p1, v0

    move-object v3, p0

    goto :goto_c6

    :cond_6c
    :try_start_6c
    iget-object v1, p0, LA6/c;->x:Landroid/util/LruCache;

    invoke-virtual {v1, v0}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/io/File;
    :try_end_75
    .catchall {:try_start_6c .. :try_end_75} :catchall_c3

    if-nez v7, :cond_81

    :try_start_77
    iget-object p1, p0, LA6/c;->r:Lq6/b;

    const-string p2, "notifyBlurDone: didn\'t find file in cache."

    invoke-virtual {p1, p2}, Lq6/b;->e(Ljava/lang/String;)V
    :try_end_7e
    .catchall {:try_start_77 .. :try_end_7e} :catchall_68

    monitor-exit p0

    const/4 p0, 0x0

    return p0

    :cond_81
    :try_start_81
    iget-object v0, p0, LA6/c;->r:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyBlurDone usedFile:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->d(Ljava/lang/String;)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "send type IN_USE."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "final_uri"

    invoke-virtual {v2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "final_colors"

    invoke-virtual {v2, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v1, LA6/c$c;
    :try_end_ad
    .catchall {:try_start_81 .. :try_end_ad} :catchall_c3

    const/4 v8, 0x0

    move-object v3, p0

    :try_start_af
    invoke-direct/range {v1 .. v8}, LA6/c$c;-><init>(Landroid/os/Bundle;LA6/c;Ljava/lang/StringBuilder;JLjava/io/File;Lm8/e;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {p1, v1, p0, p1}, LF8/g;->f(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_be
    .catchall {:try_start_af .. :try_end_be} :catchall_c0

    monitor-exit v3

    return p0

    :catchall_c0
    move-exception v0

    :goto_c1
    move-object p1, v0

    goto :goto_c6

    :catchall_c3
    move-exception v0

    move-object v3, p0

    goto :goto_c1

    :goto_c6
    :try_start_c6
    monitor-exit v3
    :try_end_c7
    .catchall {:try_start_c6 .. :try_end_c7} :catchall_c0

    throw p1
.end method

.method public final declared-synchronized w0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .registers 12

    monitor-enter p0

    :try_start_1
    const-string v0, "effectBitmaps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewBitmaps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LA6/c;->B()V

    const/4 v0, 0x0

    iput-object v0, p0, LA6/c;->A:Ljava/io/File;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "notifyBlur preview effects="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {p0, p1, v3}, LA6/c;->I0(Ljava/util/Map;Z)Ljava/util/Map;

    move-result-object p1

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "send type PREVIEW, "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_50
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_80

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LC6/e;

    invoke-virtual {v7}, LC6/e;->a()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v8, Lj6/c;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    invoke-direct {v8, v6}, Lj6/c;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v4, v7, v8}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    goto :goto_50

    :catchall_7e
    move-exception p1

    goto :goto_ef

    :cond_80
    const-string p2, "preview_uris"

    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, p2, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_89
    .catchall {:try_start_1 .. :try_end_89} :catchall_7e

    :try_start_89
    iget-object p2, p0, LA6/c;->q:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    sget-object v5, LA6/c;->E:Landroid/net/Uri;

    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p2, v5, v6, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Landroid/os/Bundle;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2
    :try_end_9e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_89 .. :try_end_9e} :catch_9f
    .catchall {:try_start_89 .. :try_end_9e} :catchall_7e

    goto :goto_bc

    :catch_9f
    move-exception p2

    :try_start_a0
    iget-object v4, p0, LA6/c;->r:Lq6/b;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "update exception:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object p2, Lh8/A;->a:Lh8/A;

    :goto_bc
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "result "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", consume "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, LA6/c;->r:Lq6/b;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lq6/b;->a(Ljava/lang/String;)V

    iput-boolean v3, p0, LA6/c;->B:Z
    :try_end_ed
    .catchall {:try_start_a0 .. :try_end_ed} :catchall_7e

    monitor-exit p0

    return-object p1

    :goto_ef
    :try_start_ef
    monitor-exit p0
    :try_end_f0
    .catchall {:try_start_ef .. :try_end_f0} :catchall_7e

    throw p1
.end method
