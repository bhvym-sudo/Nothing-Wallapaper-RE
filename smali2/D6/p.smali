.class public final LD6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lg3/x;

.field private final c:LD6/a$b;

.field private final d:Lq6/b;

.field private final e:Lh8/h;

.field private final f:Lh8/h;

.field private final g:Z

.field private final h:Lh8/h;

.field private final i:Landroid/util/LruCache;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg3/x;LD6/a$b;)V
    .registers 15

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/p;->a:Landroid/content/Context;

    iput-object p2, p0, LD6/p;->b:Lg3/x;

    iput-object p3, p0, LD6/p;->c:LD6/a$b;

    new-instance v0, Lq6/b;

    invoke-direct {v0, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LD6/p;->d:Lq6/b;

    new-instance v1, LD6/l;

    invoke-direct {v1, p0}, LD6/l;-><init>(LD6/p;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, LD6/p;->e:Lh8/h;

    new-instance v1, LD6/m;

    invoke-direct {v1, p0}, LD6/m;-><init>(LD6/p;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, LD6/p;->f:Lh8/h;

    const/4 v1, 0x1

    iput-boolean v1, p0, LD6/p;->g:Z

    new-instance v1, LD6/n;

    invoke-direct {v1, p0}, LD6/n;-><init>(LD6/p;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, LD6/p;->h:Lh8/h;

    new-instance v1, Landroid/util/LruCache;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Landroid/util/LruCache;-><init>(I)V

    iput-object v1, p0, LD6/p;->i:Landroid/util/LruCache;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Quick get init color, "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p3, :cond_68

    invoke-direct {p0}, LD6/p;->i()Ljava/util/concurrent/Future;

    move-result-object p0

    const-string p1, "<get-colorFuture>(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/h;->c(Ljava/util/concurrent/Future;)Landroid/app/WallpaperColors;

    move-result-object p0

    if-eqz p0, :cond_a2

    invoke-virtual {v1, p3, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "from last cached to Manager."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a2

    :cond_68
    invoke-virtual {p2, p1}, Lg3/x;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8b

    invoke-direct {p0}, LD6/p;->l()Lh3/W;

    move-result-object p2

    invoke-interface {p2, p1}, Lh3/W;->Y(Ljava/lang/String;)Landroid/app/WallpaperColors;

    move-result-object p2

    if-eqz p2, :cond_8b

    sget-object p2, LD6/a$a;->a:LD6/a$a;

    invoke-direct {p0}, LD6/p;->l()Lh3/W;

    move-result-object p0

    invoke-interface {p0, p1}, Lh3/W;->Y(Ljava/lang/String;)Landroid/app/WallpaperColors;

    move-result-object p0

    invoke-virtual {v1, p2, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "from last cached to SP."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a2

    :cond_8b
    new-instance v8, LD6/o;

    const-wide/16 p1, 0xbb8

    invoke-direct {v8, p0, p1, p2}, LD6/o;-><init>(LD6/p;J)V

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Ll8/a;->b(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILv8/a;ILjava/lang/Object;)Ljava/lang/Thread;

    const-string p0, "from future in a background thread."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a2
    :goto_a2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lq6/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(LD6/p;)Ljava/util/concurrent/Future;
    .registers 1

    invoke-static {p0}, LD6/p;->h(LD6/p;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LD6/p;)Lh3/W;
    .registers 1

    invoke-static {p0}, LD6/p;->n(LD6/p;)Lh3/W;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LD6/p;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, LD6/p;->o(LD6/p;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LD6/p;J)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LD6/p;->e(LD6/p;J)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LD6/p;J)Lh8/A;
    .registers 6

    :try_start_0
    invoke-direct {p0}, LD6/p;->i()Ljava/util/concurrent/Future;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p1, p2, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg3/x$a;

    invoke-virtual {v0}, Lg3/x$a;->b()Landroid/app/WallpaperColors;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v0}, LG6/h;->d(Landroid/app/WallpaperColors;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto :goto_1b

    :cond_1a
    const/4 v0, 0x0

    :goto_1b
    if-eqz v0, :cond_57

    iget-object v1, p0, LD6/p;->i:Landroid/util/LruCache;

    sget-object v2, LD6/a$a;->a:LD6/a$a;

    invoke-virtual {v1, v2, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LD6/p;->d:Lq6/b;

    const-string v1, "Get init colors after future done."

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V
    :try_end_2b
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_2b} :catch_3c
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_2b} :catch_34
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_2b} :catch_2c

    goto :goto_57

    :catch_2c
    iget-object p0, p0, LD6/p;->d:Lq6/b;

    const-string p1, "Get init colors failure cause future was cancellation."

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_57

    :catch_34
    iget-object p0, p0, LD6/p;->d:Lq6/b;

    const-string p1, "Get init colors failure cause future was interrupted."

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    goto :goto_57

    :catch_3c
    iget-object p0, p0, LD6/p;->d:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Get init colors failure cause timeout after "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ms."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    :cond_57
    :goto_57
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final h(LD6/p;)Ljava/util/concurrent/Future;
    .registers 2

    iget-object v0, p0, LD6/p;->b:Lg3/x;

    iget-object p0, p0, LD6/p;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, Lg3/x;->b(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private final i()Ljava/util/concurrent/Future;
    .registers 1

    iget-object p0, p0, LD6/p;->e:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Future;

    return-object p0
.end method

.method private final l()Lh3/W;
    .registers 1

    iget-object p0, p0, LD6/p;->f:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh3/W;

    return-object p0
.end method

.method private final m()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LD6/p;->h:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final n(LD6/p;)Lh3/W;
    .registers 2

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    iget-object p0, p0, LD6/p;->a:Landroid/content/Context;

    invoke-interface {v0, p0}, Lh3/H;->f(Landroid/content/Context;)Lh3/W;

    move-result-object p0

    return-object p0
.end method

.method private static final o(LD6/p;)Ljava/lang/String;
    .registers 2

    iget-object v0, p0, LD6/p;->b:Lg3/x;

    iget-object p0, p0, LD6/p;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, Lg3/x;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final f(Landroid/graphics/Bitmap;LD6/a;)Landroid/app/WallpaperColors;
    .registers 6

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD6/p;->i:Landroid/util/LruCache;

    invoke-virtual {v0, p2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/WallpaperColors;

    if-eqz v0, :cond_33

    iget-object p0, p0, LD6/p;->d:Lq6/b;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "calculateColors for "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " from cache. colors="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-object v0

    :cond_33
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_43

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 v2, 0x1

    :cond_43
    invoke-static {p1}, Landroid/app/WallpaperColors;->fromBitmap(Landroid/graphics/Bitmap;)Landroid/app/WallpaperColors;

    move-result-object v0

    if-eqz v2, :cond_4c

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4c
    iget-object p1, p0, LD6/p;->i:Landroid/util/LruCache;

    invoke-virtual {p1, p2, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p1, p0, LD6/p;->g:Z

    if-eqz p1, :cond_66

    invoke-direct {p0}, LD6/p;->m()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_66

    invoke-direct {p0}, LD6/p;->l()Lh3/W;

    move-result-object p1

    invoke-direct {p0}, LD6/p;->m()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0, v0}, Lh3/W;->j0(Ljava/lang/String;Landroid/app/WallpaperColors;)V

    :cond_66
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final g()V
    .registers 2

    invoke-direct {p0}, LD6/p;->i()Ljava/util/concurrent/Future;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public final j()Landroid/app/WallpaperColors;
    .registers 3

    iget-object v0, p0, LD6/p;->c:LD6/a$b;

    if-eqz v0, :cond_f

    iget-object v1, p0, LD6/p;->i:Landroid/util/LruCache;

    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/WallpaperColors;

    if-eqz v0, :cond_f

    return-object v0

    :cond_f
    iget-object p0, p0, LD6/p;->i:Landroid/util/LruCache;

    sget-object v0, LD6/a$a;->a:LD6/a$a;

    invoke-virtual {p0, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/WallpaperColors;

    if-eqz p0, :cond_1c

    return-object p0

    :cond_1c
    const/4 p0, 0x0

    return-object p0
.end method

.method public final k()LD6/a$b;
    .registers 1

    iget-object p0, p0, LD6/p;->c:LD6/a$b;

    return-object p0
.end method
