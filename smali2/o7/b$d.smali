.class final Lo7/b$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/b;->s(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lo7/b;

.field final synthetic s:Z


# direct methods
.method constructor <init>(Lo7/b;ZLm8/e;)V
    .registers 4

    iput-object p1, p0, Lo7/b$d;->r:Lo7/b;

    iput-boolean p2, p0, Lo7/b$d;->s:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lo7/b$d;

    iget-object v0, p0, Lo7/b$d;->r:Lo7/b;

    iget-boolean p0, p0, Lo7/b$d;->s:Z

    invoke-direct {p1, v0, p0, p2}, Lo7/b$d;-><init>(Lo7/b;ZLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/b$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/b$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/b$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    const-string v0, "BaseCropWallpaperViewModel"

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lo7/b$d;->q:I

    const/4 v3, 0x1

    if-eqz v2, :cond_19

    if-ne v2, v3, :cond_11

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_31

    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo7/b$d;->r:Lo7/b;

    invoke-virtual {p1}, Lo7/b;->l()LI8/z;

    move-result-object p1

    iget-boolean v2, p0, Lo7/b$d;->s:Z

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput v3, p0, Lo7/b$d;->q:I

    invoke-interface {p1, v2, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_31

    return-object v1

    :cond_31
    :goto_31
    const/4 p1, 0x0

    :try_start_32
    iget-object v1, p0, Lo7/b$d;->r:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "com.nothing.launcher.share"

    const-string v3, "set_wallpaper_scrollable"

    iget-boolean v4, p0, Lo7/b$d;->s:Z

    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4, p1}, Landroid/content/ContentResolver;->call(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1
    :try_end_4a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_32 .. :try_end_4a} :catch_4b

    goto :goto_52

    :catch_4b
    move-exception v1

    const-string v2, "call exception:"

    invoke-static {v0, v2, v1}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, p1

    :goto_52
    iget-boolean p0, p0, Lo7/b$d;->s:Z

    if-eqz v1, :cond_60

    const-string p1, "result"

    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    :cond_60
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setWallpaperScrollable state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, " result="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
