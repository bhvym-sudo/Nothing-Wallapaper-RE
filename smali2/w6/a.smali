.class public final Lw6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw6/a$a;
    }
.end annotation


# static fields
.field public static final e:Lw6/a$a;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Lx6/k;

.field private final c:Ljava/util/Map;

.field private volatile d:Lk6/a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lw6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lw6/a;->e:Lw6/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lx6/k;)V
    .registers 4

    const-string v0, "effectFactories"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effectAssetManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/a;->a:Ljava/util/List;

    iput-object p2, p0, Lw6/a;->b:Lx6/k;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lw6/a;->c:Ljava/util/Map;

    return-void
.end method

.method private final a(Lw6/c;)LE6/a;
    .registers 4

    invoke-virtual {p1}, Lw6/c;->b()LE6/a$a;

    move-result-object v0

    if-eqz v0, :cond_50

    invoke-virtual {p1}, Lw6/c;->b()LE6/a$a;

    move-result-object p1

    invoke-virtual {p1}, LE6/a$a;->b()LC6/e;

    move-result-object p1

    iget-object v0, p0, Lw6/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE6/a;

    if-eqz v0, :cond_19

    return-object v0

    :cond_19
    iget-object v0, p0, Lw6/a;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE6/b;

    invoke-interface {v1, p1}, LE6/b;->a(LC6/e;)LE6/a;

    move-result-object v1

    if-eqz v1, :cond_21

    iget-object p0, p0, Lw6/a;->c:Ljava/util/Map;

    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_39
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "can\'t build Effecter for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_50
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "can\'t build Effecter without Effect ID"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()V
    .registers 1

    iget-object p0, p0, Lw6/a;->d:Lk6/a;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lk6/e;->d()V

    :cond_7
    return-void
.end method

.method public final c(Lw6/c;LC6/i;LC6/i;)V
    .registers 13

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalBitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effectBitmap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw6/a;->d:Lk6/a;

    if-nez v0, :cond_42

    monitor-enter p0

    :try_start_14
    iget-object v0, p0, Lw6/a;->d:Lk6/a;

    if-nez v0, :cond_3c

    invoke-virtual {p1}, Lw6/c;->c()LC6/j;

    move-result-object v0

    invoke-virtual {v0}, LC6/j;->d()Landroid/graphics/Point;

    move-result-object v0

    if-eqz v0, :cond_34

    new-instance v1, Lk6/a;

    invoke-static {v0}, LG6/f;->e(Landroid/graphics/Point;)Landroid/util/Size;

    move-result-object v0

    const-string v2, "EffectApply"

    const/4 v3, 0x2

    invoke-direct {v1, v0, v3, v2}, Lk6/a;-><init>(Landroid/util/Size;ILjava/lang/String;)V

    iput-object v1, p0, Lw6/a;->d:Lk6/a;

    goto :goto_3c

    :catchall_31
    move-exception v0

    move-object p1, v0

    goto :goto_40

    :cond_34
    const-string p1, "EffectApply need viewSize to init BitmapPool, but viewSize is null."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3c
    :goto_3c
    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_3e
    .catchall {:try_start_14 .. :try_end_3e} :catchall_31

    monitor-exit p0

    goto :goto_42

    :goto_40
    monitor-exit p0

    throw p1

    :cond_42
    :goto_42
    iget-object v1, p0, Lw6/a;->d:Lk6/a;

    if-nez v1, :cond_47

    return-void

    :cond_47
    invoke-direct {p0, p1}, Lw6/a;->a(Lw6/c;)LE6/a;

    move-result-object p0

    invoke-virtual {p1}, Lw6/c;->b()LE6/a$a;

    move-result-object v0

    if-eqz v0, :cond_c2

    invoke-static {p2, v1}, LG6/b;->a(LC6/i;Lk6/c;)Lh8/o;

    move-result-object v0

    invoke-virtual {v0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {p2}, LC6/i;->e()I

    move-result v2

    invoke-virtual {p2}, LC6/i;->d()I

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lk6/c;->q(Lk6/c;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p2

    :try_start_75
    invoke-virtual {p1}, Lw6/c;->b()LE6/a$a;

    move-result-object v0

    invoke-interface {p0, v7, p2, v0}, LE6/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;LE6/a$a;)Landroid/graphics/Bitmap;

    new-instance p0, Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {p0, v3, v3, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p2, p0, v0, p3}, LG6/b;->b(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLC6/i;)V
    :try_end_8f
    .catchall {:try_start_75 .. :try_end_8f} :catchall_b7

    if-eqz v8, :cond_94

    invoke-virtual {v1, v7}, Lk6/e;->m(Ljava/lang/Object;)V

    :cond_94
    invoke-virtual {v1, p2}, Lk6/e;->m(Ljava/lang/Object;)V

    const-string p0, "EffectApply"

    invoke-virtual {p1}, Lw6/c;->a()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "finish request "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and build the result success."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_b7
    move-exception v0

    move-object p0, v0

    if-eqz v8, :cond_be

    invoke-virtual {v1, v7}, Lk6/e;->m(Ljava/lang/Object;)V

    :cond_be
    invoke-virtual {v1, p2}, Lk6/e;->m(Ljava/lang/Object;)V

    throw p0

    :cond_c2
    const-string p0, "Failed requirement."

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
