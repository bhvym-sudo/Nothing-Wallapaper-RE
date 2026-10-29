.class final Lo7/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/b;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:I

.field final synthetic s:Lo7/b;


# direct methods
.method constructor <init>(Lo7/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lo7/b$b;->s:Lo7/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lo7/b$b;

    iget-object p0, p0, Lo7/b$b;->s:Lo7/b;

    invoke-direct {p1, p0, p2}, Lo7/b$b;-><init>(Lo7/b;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lo7/b$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lo7/b$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lo7/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lo7/b$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo7/b$b;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-string v5, "BaseCropWallpaperViewModel"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_2e

    if-eq v1, v6, :cond_2a

    if-eq v1, v4, :cond_22

    if-ne v1, v3, :cond_1a

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_ab

    :cond_1a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_22
    iget-object v1, p0, Lo7/b$b;->q:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_7c

    :cond_2a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_61

    :cond_2e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_31
    iget-object p1, p0, Lo7/b$b;->s:Lo7/b;

    invoke-virtual {p1}, Lo7/b;->f()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v1, "com.nothing.launcher.share"

    const-string v8, "get_wallpaper_scrollable"

    invoke-virtual {p1, v1, v8, v7, v7}, Landroid/content/ContentResolver;->call(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_43
    .catch Ljava/lang/IllegalArgumentException; {:try_start_31 .. :try_end_43} :catch_45

    move-object v1, p1

    goto :goto_4c

    :catch_45
    move-exception p1

    const-string v1, "call exception:"

    invoke-static {v5, v1, p1}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v7

    :goto_4c
    if-nez v1, :cond_67

    iget-object p1, p0, Lo7/b$b;->s:Lo7/b;

    invoke-virtual {p1}, Lo7/b;->n()LI8/z;

    move-result-object p1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput v6, p0, Lo7/b$b;->r:I

    invoke-interface {p1, v1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_61

    goto :goto_aa

    :cond_61
    :goto_61
    const-string p0, "initScrollableState not support wallpaper scrolling"

    invoke-static {v5, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_ab

    :cond_67
    iget-object p1, p0, Lo7/b$b;->s:Lo7/b;

    invoke-virtual {p1}, Lo7/b;->n()LI8/z;

    move-result-object p1

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v6

    iput-object v1, p0, Lo7/b$b;->q:Ljava/lang/Object;

    iput v4, p0, Lo7/b$b;->r:I

    invoke-interface {p1, v6, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7c

    goto :goto_aa

    :cond_7c
    :goto_7c
    const-string p1, "state"

    invoke-virtual {v1, p1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initScrollableState support scrolling, state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lo7/b$b;->s:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->l()LI8/z;

    move-result-object v1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object v7, p0, Lo7/b$b;->q:Ljava/lang/Object;

    iput v3, p0, Lo7/b$b;->r:I

    invoke-interface {v1, p1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_ab

    :goto_aa
    return-object v0

    :cond_ab
    :goto_ab
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
