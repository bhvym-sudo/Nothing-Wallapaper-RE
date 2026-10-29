.class final Lo7/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/b;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/b;


# direct methods
.method constructor <init>(Lo7/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lo7/b$c;->r:Lo7/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lo7/b$c;

    iget-object p0, p0, Lo7/b$c;->r:Lo7/b;

    invoke-direct {p1, p0, p2}, Lo7/b$c;-><init>(Lo7/b;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/b$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/b$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/b$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/b$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v2, :cond_10

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_10a

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/b$c;->r:Lo7/b;

    invoke-virtual {p1}, Lo7/b;->j()Lg3/x;

    move-result-object p1

    iget-object v1, p0, Lo7/b$c;->r:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg3/x;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2f

    const-string p1, ""

    :cond_2f
    sget-object v1, Lcom/nothing/wallpaper/db/WallpaperDatabase;->p:Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

    iget-object v3, p0, Lo7/b$c;->r:Lo7/b;

    invoke-virtual {v3}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getApplicationContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;->b(Landroid/content/Context;)Lcom/nothing/wallpaper/db/WallpaperDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/WallpaperDatabase;->D()Lu6/a;

    move-result-object v1

    invoke-interface {v1, p1}, Lu6/a;->f(Ljava/lang/String;)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object v1

    sget-object v3, LJ6/i;->F:LJ6/i$a;

    const/4 v4, 0x0

    if-eqz v1, :cond_56

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getSubjectEn()Ljava/lang/String;

    move-result-object v5

    goto :goto_57

    :cond_56
    move-object v5, v4

    :goto_57
    if-eqz v1, :cond_5e

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getStyleEn()Ljava/lang/String;

    move-result-object v6

    goto :goto_5f

    :cond_5e
    move-object v6, v4

    :goto_5f
    if-eqz v1, :cond_6a

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v7

    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_6b

    :cond_6a
    move-object v7, v4

    :goto_6b
    invoke-virtual {v3, v5, v6, v7}, LJ6/i$a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, LU6/b;->a:LU6/b;

    invoke-virtual {v5}, LU6/b;->b()Lm6/a;

    move-result-object v5

    invoke-interface {v5, p1}, Lm6/a;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_80

    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_81

    :cond_80
    move-object v5, v4

    :goto_81
    const-string v6, "BaseCropWallpaperViewModel"

    if-nez v5, :cond_bf

    :try_start_85
    iget-object v5, p0, Lo7/b$c;->r:Lo7/b;

    invoke-virtual {v5}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    const/high16 v5, -0x80000000

    invoke-virtual {p1, v5, v5}, Lcom/bumptech/glide/RequestBuilder;->submit(II)Lcom/bumptech/glide/request/FutureTarget;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_a3
    .catch Ljava/lang/Exception; {:try_start_85 .. :try_end_a3} :catch_a5

    move-object v5, p1

    goto :goto_bf

    :catch_a5
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "saveImageToGallery exception:"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v4

    :cond_bf
    :goto_bf
    if-nez v5, :cond_c7

    const-string p0, "saveImageToGallery failed, bitmap is null"

    invoke-static {v6, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10a

    :cond_c7
    iget-object p1, p0, Lo7/b$c;->r:Lo7/b;

    invoke-virtual {p1}, Lo7/b;->f()Landroid/content/Context;

    move-result-object p1

    sget-object v6, LJ6/i;->F:LJ6/i$a;

    invoke-virtual {v6}, LJ6/i$a;->e()Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, v7, v3}, Li6/i;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Li6/i$a;

    move-result-object p1

    if-eqz p1, :cond_db

    move p1, v2

    goto :goto_dc

    :cond_db
    const/4 p1, 0x0

    :goto_dc
    if-nez p1, :cond_e9

    if-eqz v1, :cond_e9

    invoke-virtual {v1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v7

    sget-object v1, LR7/d;->r:LR7/d;

    invoke-virtual {v1, v7, v8}, LR7/d;->d(J)V

    :cond_e9
    iget-object v1, p0, Lo7/b$c;->r:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v6}, LJ6/i$a;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6, v5, v3}, Li6/i;->b(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Z

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v1

    new-instance v3, Lo7/b$c$a;

    iget-object v5, p0, Lo7/b$c;->r:Lo7/b;

    invoke-direct {v3, p1, v5, v4}, Lo7/b$c$a;-><init>(ZLo7/b;Lm8/e;)V

    iput v2, p0, Lo7/b$c;->q:I

    invoke-static {v1, v3, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_10a

    return-object v0

    :cond_10a
    :goto_10a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
