.class public final LJ6/l;
.super Lg3/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/l$a;,
        LJ6/l$b;
    }
.end annotation


# static fields
.field public static final f:LJ6/l$b;


# instance fields
.field private final e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ6/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ6/l$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ6/l;->f:LJ6/l$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .registers 6

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lg3/h;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, LJ6/l;->e:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic p(LJ6/l;Landroid/content/Context;LJ6/l$a;)V
    .registers 3

    invoke-static {p0, p1, p2}, LJ6/l;->t(LJ6/l;Landroid/content/Context;LJ6/l$a;)V

    return-void
.end method

.method public static synthetic q(LJ6/l$a;Ljava/util/List;)V
    .registers 2

    invoke-static {p0, p1}, LJ6/l;->u(LJ6/l$a;Ljava/util/List;)V

    return-void
.end method

.method private final r(Landroid/content/Context;)Ljava/util/List;
    .registers 9

    invoke-static {p1}, LH6/a;->c(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_c

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_c
    invoke-static {p1}, Landroid/provider/MediaStore;->getExternalVolumeNames(Landroid/content/Context;)Ljava/util/Set;

    move-result-object p0

    const-string v0, "getExternalVolumeNames(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_28

    const-string p0, "NTMyImageCategory"

    const-string p1, "No external volumes!"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_28
    const-string p0, "_id"

    const-string v0, "date_modified"

    filled-new-array {p0, v0}, [Ljava/lang/String;

    move-result-object v3

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "date_modified DESC"

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_8b

    :goto_45
    :try_start_45
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_7d

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_7d

    new-instance v0, Lcom/android/wallpaper/asset/g;

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, p1, v2}, Lcom/android/wallpaper/asset/g;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_45

    :catchall_7a
    move-exception v0

    move-object p0, v0

    goto :goto_84

    :cond_7d
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_7f
    .catchall {:try_start_45 .. :try_end_7f} :catchall_7a

    const/4 p1, 0x0

    invoke-static {v1, p1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p0

    :goto_84
    :try_start_84
    throw p0
    :try_end_85
    .catchall {:try_start_84 .. :try_end_85} :catchall_85

    :catchall_85
    move-exception v0

    move-object p1, v0

    invoke-static {v1, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1

    :cond_8b
    return-object p0
.end method

.method private static final t(LJ6/l;Landroid/content/Context;LJ6/l$a;)V
    .registers 4

    invoke-direct {p0, p1}, LJ6/l;->r(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, LJ6/k;

    invoke-direct {v0, p2, p0}, LJ6/k;-><init>(LJ6/l$a;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final u(LJ6/l$a;Ljava/util/List;)V
    .registers 2

    invoke-interface {p0, p1}, LJ6/l$a;->a(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final s(Landroid/content/Context;LJ6/l$a;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/l;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LJ6/j;

    invoke-direct {v1, p0, p1, p2}, LJ6/j;-><init>(LJ6/l;Landroid/content/Context;LJ6/l$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
