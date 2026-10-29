.class public final Lm6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm6/d$a;,
        Lm6/d$b;
    }
.end annotation


# static fields
.field public static final e:Lm6/d$b;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lm6/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm6/d$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lm6/d;->e:Lm6/d$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lm6/d;->a:Ljava/lang/String;

    .line 4
    iput p2, p0, Lm6/d;->b:I

    .line 5
    const-string p1, "DiskRUFileCache"

    iput-object p1, p0, Lm6/d;->c:Ljava/lang/String;

    .line 6
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    .line 7
    invoke-direct {p0}, Lm6/d;->k()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/h;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lm6/d;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic e(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, Lm6/d;->i(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Ljava/lang/String;Lm6/d$a;)Z
    .registers 2

    invoke-static {p0, p1}, Lm6/d;->h(Ljava/lang/String;Lm6/d$a;)Z

    move-result p0

    return p0
.end method

.method private final g(Ljava/io/Closeable;)V
    .registers 4

    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_4

    return-void

    :catch_4
    move-exception p1

    iget-object p0, p0, Lm6/d;->c:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "closeQuietly exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final h(Ljava/lang/String;Lm6/d$a;)Z
    .registers 2

    invoke-virtual {p1}, Lm6/d$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final i(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final j(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    invoke-static {p1}, Li6/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_7

    return-object p1

    :cond_7
    return-object p0
.end method

.method private final k()V
    .registers 10

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lm6/d;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_e

    return-void

    :cond_e
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_37

    array-length v2, v0

    const/4 v3, 0x0

    :goto_1b
    if-ge v3, v2, :cond_37

    aget-object v4, v0, v3

    new-instance v5, Lm6/d$a;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    invoke-direct {v5, v6, v7, v8}, Lm6/d$a;-><init>(Ljava/lang/String;J)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1b

    :cond_37
    iget-object p0, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    new-instance v0, Lm6/d$c;

    invoke-direct {v0}, Lm6/d$c;-><init>()V

    invoke-static {v1, v0}, Li8/s;->m0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public declared-synchronized a(I)V
    .registers 7

    monitor-enter p0

    :goto_1
    :try_start_1
    iget-object v0, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-le v0, p1, :cond_48

    iget-object v0, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    invoke-static {v0}, Li8/s;->R(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/d$a;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lm6/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lm6/d$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_42

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    iget-object v1, p0, Lm6/d;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lm6/d$a;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deleteBeyond file:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_42

    :catchall_40
    move-exception p1

    goto :goto_4a

    :cond_42
    :goto_42
    iget-object v1, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z
    :try_end_47
    .catchall {:try_start_1 .. :try_end_47} :catchall_40

    goto :goto_1

    :cond_48
    monitor-exit p0

    return-void

    :goto_4a
    :try_start_4a
    monitor-exit p0
    :try_end_4b
    .catchall {:try_start_4a .. :try_end_4b} :catchall_40

    throw p1
.end method

.method public b()I
    .registers 1

    iget-object p0, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    return p0
.end method

.method public declared-synchronized c(Ljava/lang/String;)V
    .registers 5

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm6/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lm6/d;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_49

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_49

    iget-object v1, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    new-instance v2, Lm6/b;

    invoke-direct {v2, p1}, Lm6/b;-><init>(Ljava/lang/String;)V

    new-instance p1, Lm6/c;

    invoke-direct {p1, v2}, Lm6/c;-><init>(Lv8/l;)V

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    iget-object p1, p0, Lm6/d;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete file:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_46
    .catchall {:try_start_1 .. :try_end_46} :catchall_47

    goto :goto_49

    :catchall_47
    move-exception p1

    goto :goto_4b

    :cond_49
    :goto_49
    monitor-exit p0

    return-void

    :goto_4b
    :try_start_4b
    monitor-exit p0
    :try_end_4c
    .catchall {:try_start_4b .. :try_end_4c} :catchall_47

    throw p1
.end method

.method public declared-synchronized d(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
    .registers 8

    monitor-enter p0

    :try_start_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm6/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lm6/d;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1b
    .catchall {:try_start_1 .. :try_end_1b} :catchall_37

    :try_start_1b
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {p2, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p2
    :try_end_23
    .catchall {:try_start_1b .. :try_end_23} :catchall_50

    :try_start_23
    invoke-direct {p0, v1}, Lm6/d;->g(Ljava/io/Closeable;)V

    if-eqz p2, :cond_39

    iget-object v1, p0, Lm6/d;->d:Ljava/util/LinkedHashSet;

    new-instance v2, Lm6/d$a;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    invoke-direct {v2, p1, v3, v4}, Lm6/d$a;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_49

    :catchall_37
    move-exception p1

    goto :goto_55

    :cond_39
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_42

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_42
    iget-object p1, p0, Lm6/d;->c:Ljava/lang/String;

    const-string v0, "Failed to save bitmap to disk!!"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_49
    iget p1, p0, Lm6/d;->b:I

    invoke-virtual {p0, p1}, Lm6/d;->a(I)V
    :try_end_4e
    .catchall {:try_start_23 .. :try_end_4e} :catchall_37

    monitor-exit p0

    return p2

    :catchall_50
    move-exception p1

    :try_start_51
    invoke-direct {p0, v1}, Lm6/d;->g(Ljava/io/Closeable;)V

    throw p1

    :goto_55
    monitor-exit p0
    :try_end_56
    .catchall {:try_start_51 .. :try_end_56} :catchall_37

    throw p1
.end method

.method public get(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lm6/d;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Lm6/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_1b

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method
