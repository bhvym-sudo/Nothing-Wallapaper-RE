.class public final Lx6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/k$a;,
        Lx6/k$b;
    }
.end annotation


# static fields
.field public static final q:Lx6/k$a;

.field private static final r:Z


# instance fields
.field private final a:Lx6/q;

.field private final b:Lcom/android/wallpaper/asset/a;

.field private final c:Lq6/b;

.field private final d:Landroid/content/Context;

.field private final e:Z

.field private final f:Ljava/lang/String;

.field private final g:Ljava/util/Map;

.field private final h:Landroid/util/LruCache;

.field private final i:Ljava/lang/String;

.field private final j:Lh8/h;

.field private k:LC6/e;

.field private final l:Z

.field private final m:Z

.field private final n:Landroid/util/LruCache;

.field private o:Z

.field private volatile p:Lv8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lx6/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx6/k$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lx6/k;->q:Lx6/k$a;

    return-void
.end method

.method public constructor <init>(Lx6/q;Landroid/content/Context;Lcom/android/wallpaper/asset/a;Ljava/lang/String;)V
    .registers 6

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "original"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/k;->a:Lx6/q;

    iput-object p3, p0, Lx6/k;->b:Lcom/android/wallpaper/asset/a;

    new-instance p1, Lq6/b;

    invoke-direct {p1, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lx6/k;->c:Lq6/b;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lx6/k;->d:Landroid/content/Context;

    const/4 p1, 0x1

    if-nez p4, :cond_28

    move p2, p1

    goto :goto_29

    :cond_28
    const/4 p2, 0x0

    :goto_29
    iput-boolean p2, p0, Lx6/k;->e:Z

    if-nez p4, :cond_35

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p4

    :cond_35
    iput-object p4, p0, Lx6/k;->f:Ljava/lang/String;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lx6/k;->g:Ljava/util/Map;

    new-instance p2, Lx6/k$e;

    invoke-direct {p2, p0}, Lx6/k$e;-><init>(Lx6/k;)V

    iput-object p2, p0, Lx6/k;->h:Landroid/util/LruCache;

    const/4 p2, 0x0

    invoke-static {p2, p4}, Lx6/o;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lx6/k;->i:Ljava/lang/String;

    new-instance p2, Lx6/h;

    invoke-direct {p2}, Lx6/h;-><init>()V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lx6/k;->j:Lh8/h;

    iput-boolean p1, p0, Lx6/k;->l:Z

    new-instance p1, Lx6/k$d;

    invoke-direct {p1}, Lx6/k$d;-><init>()V

    iput-object p1, p0, Lx6/k;->n:Landroid/util/LruCache;

    return-void
.end method

.method private final C(Lcom/android/wallpaper/asset/a;)V
    .registers 11

    iget-object v0, p0, Lx6/k;->i:Ljava/lang/String;

    invoke-direct {p0, v0}, Lx6/k;->o(Ljava/lang/String;)Lx6/k$b;

    move-result-object v0

    if-eqz v0, :cond_10

    const-string p0, "EffectAssetManager"

    const-string p1, "original in files, no need save again."

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_10
    new-instance v0, Lw6/d;

    new-instance v1, Lw6/c;

    new-instance v2, LC6/j;

    invoke-static {}, LG6/c;->h()Landroid/graphics/Rect;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, LC6/j;-><init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;ILkotlin/jvm/internal/h;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lw6/c;-><init>(LC6/j;LE6/a$a;)V

    new-instance v2, Lw6/b$a;

    invoke-direct {v2, p1}, Lw6/b$a;-><init>(Lcom/android/wallpaper/asset/a;)V

    invoke-direct {v0, v1, v2}, Lw6/d;-><init>(Lw6/c;Lw6/b;)V

    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lx6/k;->y(Lw6/d;Z)V

    return-void
.end method

.method public static synthetic a()Lh3/b;
    .registers 1

    invoke-static {}, Lx6/k;->g()Lh3/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lx6/k;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lx6/k;->z(Lx6/k;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Z
    .registers 1

    invoke-static {p0}, Lx6/k;->x(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lx6/k;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lx6/k;->j(Z)V

    return-void
.end method

.method public static final synthetic e(Lx6/k;)Lx6/q;
    .registers 1

    iget-object p0, p0, Lx6/k;->a:Lx6/q;

    return-object p0
.end method

.method public static final synthetic f(Lx6/k;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lx6/k;->i:Ljava/lang/String;

    return-object p0
.end method

.method private static final g()Lh3/b;
    .registers 1

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->t()Lh3/b;

    move-result-object v0

    return-object v0
.end method

.method private final h(Lw6/d;)Lw6/d;
    .registers 5

    iget-boolean v0, p0, Lx6/k;->l:Z

    if-eqz v0, :cond_5e

    iget-boolean v0, p0, Lx6/k;->m:Z

    if-eqz v0, :cond_5e

    invoke-virtual {p1}, Lw6/d;->c()Lw6/b;

    move-result-object v0

    instance-of v0, v0, Lw6/b$a;

    if-eqz v0, :cond_5e

    invoke-virtual {p1}, Lw6/d;->c()Lw6/b;

    move-result-object v0

    check-cast v0, Lw6/b$a;

    invoke-virtual {v0}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object v0

    instance-of v0, v0, Lcom/android/wallpaper/asset/d;

    if-nez v0, :cond_5e

    invoke-virtual {p1}, Lw6/d;->d()Lw6/c;

    move-result-object v0

    invoke-virtual {v0}, Lw6/c;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "build cache asset for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EffectAssetManager"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lw6/b$a;

    new-instance v1, Lcom/android/wallpaper/asset/d;

    iget-object p0, p0, Lx6/k;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lw6/d;->c()Lw6/b;

    move-result-object v2

    check-cast v2, Lw6/b$a;

    invoke-virtual {v2}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/android/wallpaper/asset/d;-><init>(Landroid/content/Context;Lcom/android/wallpaper/asset/a;)V

    invoke-direct {v0, v1}, Lw6/b$a;-><init>(Lcom/android/wallpaper/asset/a;)V

    const/4 p0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p0, v1}, Lw6/d;->b(Lw6/d;Lw6/c;Lw6/b;ILjava/lang/Object;)Lw6/d;

    move-result-object p0

    return-object p0

    :cond_5e
    return-object p1
.end method

.method private final j(Z)V
    .registers 3

    if-eqz p1, :cond_9

    iget-object p1, p0, Lx6/k;->a:Lx6/q;

    iget-object v0, p0, Lx6/k;->f:Ljava/lang/String;

    invoke-interface {p1, v0}, Lx6/r;->p(Ljava/lang/String;)V

    :cond_9
    iget-object p0, p0, Lx6/k;->a:Lx6/q;

    invoke-interface {p0}, Ljava/io/Flushable;->flush()V

    return-void
.end method

.method private final o(Ljava/lang/String;)Lx6/k$b;
    .registers 4

    iget-object v0, p0, Lx6/k;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx6/k$b;

    if-nez v0, :cond_23

    iget-object v0, p0, Lx6/k;->a:Lx6/q;

    invoke-interface {v0, p1}, Lx6/r;->get(Ljava/lang/String;)Lw6/d;

    move-result-object v0

    if-eqz v0, :cond_21

    new-instance v1, Lx6/k$b;

    invoke-direct {p0, v0}, Lx6/k;->h(Lw6/d;)Lw6/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lx6/k$b;-><init>(Lw6/d;)V

    iget-object p0, p0, Lx6/k;->g:Ljava/util/Map;

    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_21
    const/4 p0, 0x0

    return-object p0

    :cond_23
    return-object v0
.end method

.method private final declared-synchronized r(Ljava/lang/String;Z)Lx6/k$b;
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lx6/k;->t()V

    if-eqz p2, :cond_18

    invoke-direct {p0, p1}, Lx6/k;->o(Ljava/lang/String;)Lx6/k$b;

    move-result-object p2

    if-nez p2, :cond_26

    iget-object p2, p0, Lx6/k;->h:Landroid/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lx6/k$b;

    goto :goto_26

    :catchall_16
    move-exception p1

    goto :goto_28

    :cond_18
    iget-object p2, p0, Lx6/k;->h:Landroid/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx6/k$b;

    if-nez p2, :cond_26

    invoke-direct {p0, p1}, Lx6/k;->o(Ljava/lang/String;)Lx6/k$b;

    move-result-object p2
    :try_end_26
    .catchall {:try_start_1 .. :try_end_26} :catchall_16

    :cond_26
    :goto_26
    monitor-exit p0

    return-object p2

    :goto_28
    :try_start_28
    monitor-exit p0
    :try_end_29
    .catchall {:try_start_28 .. :try_end_29} :catchall_16

    throw p1
.end method

.method static synthetic s(Lx6/k;Ljava/lang/String;ZILjava/lang/Object;)Lx6/k$b;
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-direct {p0, p1, p2}, Lx6/k;->r(Ljava/lang/String;Z)Lx6/k$b;

    move-result-object p0

    return-object p0
.end method

.method private final u(LC6/e;)Ljava/lang/String;
    .registers 2

    if-eqz p1, :cond_7

    invoke-virtual {p1}, LC6/e;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    iget-object p0, p0, Lx6/k;->f:Ljava/lang/String;

    invoke-static {p1, p0}, Lx6/o;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final v(Lw6/c;)Ljava/lang/String;
    .registers 2

    invoke-virtual {p1}, Lw6/c;->b()LE6/a$a;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, LE6/a$a;->b()LC6/e;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-direct {p0, p1}, Lx6/k;->u(LC6/e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final w()V
    .registers 6

    sget-boolean v0, Lx6/k;->r:Z

    if-eqz v0, :cond_51

    iget-object v0, p0, Lx6/k;->a:Lx6/q;

    new-instance v1, Lx6/j;

    invoke-direct {v1}, Lx6/j;-><init>()V

    invoke-interface {v0, v1}, Lx6/r;->A(Lv8/l;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lx6/k;->f:Ljava/lang/String;

    invoke-virtual {p0}, Lx6/k;->q()Lw6/d;

    move-result-object v2

    invoke-virtual {v2}, Lw6/d;->d()Lw6/c;

    move-result-object v2

    invoke-virtual {v2}, Lw6/c;->c()LC6/j;

    move-result-object v2

    invoke-virtual {v2}, LC6/j;->a()Ljava/lang/String;

    move-result-object v2

    iget-boolean p0, p0, Lx6/k;->e:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "current group="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",origin scope="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",isNew="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ",all cache:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "EffectAssetManager"

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_51
    return-void
.end method

.method private static final x(Ljava/lang/String;)Z
    .registers 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final y(Lw6/d;Z)V
    .registers 8

    invoke-virtual {p1}, Lw6/d;->d()Lw6/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lx6/k;->v(Lw6/c;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lx6/k;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    if-nez p2, :cond_1a

    const-string p0, "EffectAssetManager"

    const-string p1, "can\'s put original in memory out of setOriginal()."

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1a
    invoke-direct {p0, p1}, Lx6/k;->h(Lw6/d;)Lw6/d;

    move-result-object p2

    iget-object v1, p0, Lx6/k;->h:Landroid/util/LruCache;

    new-instance v2, Lx6/k$b;

    invoke-direct {v2, p2}, Lx6/k$b;-><init>(Lw6/d;)V

    invoke-virtual {v1, v0, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lx6/k;->c:Lq6/b;

    invoke-virtual {p1}, Lw6/d;->d()Lw6/c;

    move-result-object p1

    iget-object v2, p0, Lx6/k;->h:Landroid/util/LruCache;

    invoke-virtual {v2}, Landroid/util/LruCache;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "resultCache add result for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", now size is "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lx6/k;->a:Lx6/q;

    new-instance v1, Lx6/i;

    invoke-direct {v1, p0}, Lx6/i;-><init>(Lx6/k;)V

    invoke-interface {p1, v0, p2, v1}, Lx6/q;->L(Ljava/lang/String;Lw6/d;Lv8/l;)V

    return-void
.end method

.method private static final z(Lx6/k;Z)Lh8/A;
    .registers 2

    if-nez p1, :cond_9

    iget-object p0, p0, Lx6/k;->p:Lv8/a;

    if-eqz p0, :cond_9

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_9
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized A(Landroid/graphics/Bitmap;)V
    .registers 11

    monitor-enter p0

    :try_start_1
    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw6/d;

    new-instance v1, Lw6/c;

    new-instance v2, LC6/j;

    invoke-static {}, LG6/c;->h()Landroid/graphics/Rect;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, LC6/j;-><init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;ILkotlin/jvm/internal/h;)V

    new-instance v3, LE6/a$a;

    sget-object v4, LC6/e$a;->c:LC6/e$a;

    invoke-direct {v3, v4}, LE6/a$a;-><init>(LC6/e;)V

    invoke-direct {v1, v2, v3}, Lw6/c;-><init>(LC6/j;LE6/a$a;)V

    new-instance v2, Lw6/b$b;

    invoke-direct {v2, p1}, Lw6/b$b;-><init>(Landroid/graphics/Bitmap;)V

    invoke-direct {v0, v1, v2}, Lw6/d;-><init>(Lw6/c;Lw6/b;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Lx6/k;->y(Lw6/d;Z)V
    :try_end_30
    .catchall {:try_start_1 .. :try_end_30} :catchall_32

    monitor-exit p0

    return-void

    :catchall_32
    move-exception v0

    move-object p1, v0

    :try_start_34
    monitor-exit p0
    :try_end_35
    .catchall {:try_start_34 .. :try_end_35} :catchall_32

    throw p1
.end method

.method public final B(Lv8/a;)V
    .registers 2

    iput-object p1, p0, Lx6/k;->p:Lv8/a;

    return-void
.end method

.method public final i()V
    .registers 2

    iget-boolean v0, p0, Lx6/k;->o:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-boolean v0, p0, Lx6/k;->e:Z

    invoke-direct {p0, v0}, Lx6/k;->j(Z)V

    return-void
.end method

.method public final k()V
    .registers 2

    iget-boolean v0, p0, Lx6/k;->o:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-boolean v0, p0, Lx6/k;->e:Z

    invoke-direct {p0, v0}, Lx6/k;->j(Z)V

    return-void
.end method

.method public final l(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 10

    iget-boolean v0, p0, Lx6/k;->o:Z

    if-nez v0, :cond_7

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p0, Lx6/k;->i:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lx6/k;->r(Ljava/lang/String;Z)Lx6/k$b;

    move-result-object v0

    if-eqz v0, :cond_40

    if-eqz p1, :cond_1d

    iget-object v0, p0, Lx6/k;->i:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1e

    :cond_1d
    const/4 v0, 0x0

    :goto_1e
    if-nez v0, :cond_38

    iget-object v5, p0, Lx6/k;->k:LC6/e;

    new-instance v0, Lx6/k$c;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lx6/k$c;-><init>(Ljava/util/List;Lx6/k;JLC6/e;Lm8/e;)V

    invoke-static {v0, p2}, LF8/M;->e(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_35

    return-object p0

    :cond_35
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_38
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "save original but original image contains in deletes."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_40
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "original image is null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final declared-synchronized m()Lw6/d;
    .registers 2

    monitor-enter p0

    :try_start_1
    sget-object v0, LC6/e$a;->c:LC6/e$a;

    invoke-virtual {p0, v0}, Lx6/k;->n(LC6/e;)Lw6/d;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_9

    monitor-exit p0

    return-object v0

    :catchall_9
    move-exception v0

    :try_start_a
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_a .. :try_end_b} :catchall_9

    throw v0
.end method

.method public final declared-synchronized n(LC6/e;)Lw6/d;
    .registers 5

    monitor-enter p0

    :try_start_1
    const-string v0, "effect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx6/k;->t()V

    invoke-direct {p0, p1}, Lx6/k;->u(LC6/e;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lx6/k;->s(Lx6/k;Ljava/lang/String;ZILjava/lang/Object;)Lx6/k$b;

    move-result-object p1

    if-eqz p1, :cond_1d

    invoke-virtual {p1}, Lx6/k$b;->b()Lw6/d;

    move-result-object v2
    :try_end_1a
    .catchall {:try_start_1 .. :try_end_1a} :catchall_1b

    goto :goto_1d

    :catchall_1b
    move-exception p1

    goto :goto_1f

    :cond_1d
    :goto_1d
    monitor-exit p0

    return-object v2

    :goto_1f
    :try_start_1f
    monitor-exit p0
    :try_end_20
    .catchall {:try_start_1f .. :try_end_20} :catchall_1b

    throw p1
.end method

.method public final p()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lx6/k;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final declared-synchronized q()Lw6/d;
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lx6/k;->t()V

    iget-object v0, p0, Lx6/k;->i:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lx6/k;->r(Ljava/lang/String;Z)Lx6/k$b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lx6/k$b;->b()Lw6/d;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_1 .. :try_end_12} :catchall_14

    monitor-exit p0

    return-object v0

    :catchall_14
    move-exception v0

    :try_start_15
    monitor-exit p0
    :try_end_16
    .catchall {:try_start_15 .. :try_end_16} :catchall_14

    throw v0
.end method

.method public final declared-synchronized t()V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lx6/k;->o:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_1b

    if-eqz v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    const-string v0, "EffectAssetManager"

    const-string v1, "initialize."

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/k;->b:Lcom/android/wallpaper/asset/a;

    invoke-direct {p0, v0}, Lx6/k;->C(Lcom/android/wallpaper/asset/a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx6/k;->o:Z

    invoke-direct {p0}, Lx6/k;->w()V
    :try_end_19
    .catchall {:try_start_7 .. :try_end_19} :catchall_1b

    monitor-exit p0

    return-void

    :catchall_1b
    move-exception v0

    :try_start_1c
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1c .. :try_end_1d} :catchall_1b

    throw v0
.end method
