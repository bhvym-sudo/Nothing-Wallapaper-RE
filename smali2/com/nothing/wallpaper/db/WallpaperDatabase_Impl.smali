.class public final Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;
.super Lcom/nothing/wallpaper/db/WallpaperDatabase;
.source "SourceFile"


# instance fields
.field private volatile r:Lu6/a;

.field private volatile s:Lu6/c;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/db/WallpaperDatabase;-><init>()V

    return-void
.end method

.method static synthetic F(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lg1/q;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic G(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lg1/q;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic H(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;Lo1/g;)Lo1/g;
    .registers 2

    iput-object p1, p0, Lg1/q;->a:Lo1/g;

    return-object p1
.end method

.method static synthetic I(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;Lo1/g;)V
    .registers 2

    invoke-virtual {p0, p1}, Lg1/q;->u(Lo1/g;)V

    return-void
.end method

.method static synthetic J(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lg1/q;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public D()Lu6/a;
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->r:Lu6/a;

    if-eqz v0, :cond_7

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->r:Lu6/a;

    return-object p0

    :cond_7
    monitor-enter p0

    :try_start_8
    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->r:Lu6/a;

    if-nez v0, :cond_16

    new-instance v0, Lu6/b;

    invoke-direct {v0, p0}, Lu6/b;-><init>(Lg1/q;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->r:Lu6/a;

    goto :goto_16

    :catchall_14
    move-exception v0

    goto :goto_1a

    :cond_16
    :goto_16
    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->r:Lu6/a;

    monitor-exit p0

    return-object v0

    :goto_1a
    monitor-exit p0
    :try_end_1b
    .catchall {:try_start_8 .. :try_end_1b} :catchall_14

    throw v0
.end method

.method public E()Lu6/c;
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->s:Lu6/c;

    if-eqz v0, :cond_7

    iget-object p0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->s:Lu6/c;

    return-object p0

    :cond_7
    monitor-enter p0

    :try_start_8
    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->s:Lu6/c;

    if-nez v0, :cond_16

    new-instance v0, Lu6/d;

    invoke-direct {v0, p0}, Lu6/d;-><init>(Lg1/q;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->s:Lu6/c;

    goto :goto_16

    :catchall_14
    move-exception v0

    goto :goto_1a

    :cond_16
    :goto_16
    iget-object v0, p0, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;->s:Lu6/c;

    monitor-exit p0

    return-object v0

    :goto_1a
    monitor-exit p0
    :try_end_1b
    .catchall {:try_start_8 .. :try_end_1b} :catchall_14

    throw v0
.end method

.method protected g()Landroidx/room/c;
    .registers 6

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/c;

    const-string v3, "wallpaper_studio_history"

    const-string v4, "wallpaper_request_index"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(Lg1/q;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected h(Lg1/f;)Lo1/h;
    .registers 5

    new-instance v0, Lg1/s;

    new-instance v1, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl$a;-><init>(Lcom/nothing/wallpaper/db/WallpaperDatabase_Impl;I)V

    const-string p0, "b3d321ba58c586feff189d308a1141be"

    const-string v2, "586317cffd96661a62859088aa6e276c"

    invoke-direct {v0, p1, v1, p0, v2}, Lg1/s;-><init>(Lg1/f;Lg1/s$b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p1, Lg1/f;->a:Landroid/content/Context;

    invoke-static {p0}, Lo1/h$b;->a(Landroid/content/Context;)Lo1/h$b$a;

    move-result-object p0

    iget-object v1, p1, Lg1/f;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lo1/h$b$a;->c(Ljava/lang/String;)Lo1/h$b$a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lo1/h$b$a;->b(Lo1/h$a;)Lo1/h$b$a;

    move-result-object p0

    invoke-virtual {p0}, Lo1/h$b$a;->a()Lo1/h$b;

    move-result-object p0

    iget-object p1, p1, Lg1/f;->c:Lo1/h$c;

    invoke-interface {p1, p0}, Lo1/h$c;->a(Lo1/h$b;)Lo1/h;

    move-result-object p0

    return-object p0
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .registers 2

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public o()Ljava/util/Set;
    .registers 1

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0
.end method

.method protected p()Ljava/util/Map;
    .registers 3

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-class v0, Lu6/a;

    invoke-static {}, Lu6/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lu6/c;

    invoke-static {}, Lu6/d;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
