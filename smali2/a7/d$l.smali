.class final La7/d$l;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d;->v0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:La7/d;

.field final synthetic s:Ljava/lang/String;


# direct methods
.method constructor <init>(La7/d;Ljava/lang/String;Lm8/e;)V
    .registers 4

    iput-object p1, p0, La7/d$l;->r:La7/d;

    iput-object p2, p0, La7/d$l;->s:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, La7/d$l;

    iget-object v0, p0, La7/d$l;->r:La7/d;

    iget-object p0, p0, La7/d$l;->s:Ljava/lang/String;

    invoke-direct {p1, v0, p0, p2}, La7/d$l;-><init>(La7/d;Ljava/lang/String;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, La7/d$l;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, La7/d$l;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, La7/d$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, La7/d$l;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La7/d$l;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v2, :cond_10

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_c9

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La7/d$l;->r:La7/d;

    invoke-static {p1}, La7/d;->y(La7/d;)LV6/a;

    move-result-object p1

    iget-object v1, p0, La7/d$l;->s:Ljava/lang/String;

    invoke-virtual {p1, v1}, LV6/a;->l(Ljava/lang/String;)Lcom/nothing/wallpaper/db/CreativeWallpaper;

    move-result-object p1

    sget-object v1, LJ6/i;->F:LJ6/i$a;

    iget-object v3, p0, La7/d$l;->r:La7/d;

    invoke-static {v3}, La7/d;->v(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_37

    invoke-virtual {v3}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object v3

    goto :goto_38

    :cond_37
    move-object v3, v4

    :goto_38
    iget-object v5, p0, La7/d$l;->r:La7/d;

    invoke-static {v5}, La7/d;->u(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v5

    if-eqz v5, :cond_45

    invoke-virtual {v5}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object v5

    goto :goto_46

    :cond_45
    move-object v5, v4

    :goto_46
    if-eqz p1, :cond_51

    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_52

    :cond_51
    move-object v6, v4

    :goto_52
    invoke-virtual {v1, v3, v5, v6}, LJ6/i$a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, La7/d$l;->r:La7/d;

    invoke-static {v5}, La7/d;->q(La7/d;)LU6/e;

    move-result-object v5

    iget-object v6, p0, La7/d$l;->s:Ljava/lang/String;

    invoke-virtual {v5, v6}, LU6/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_81

    iget-object v5, p0, La7/d$l;->r:La7/d;

    invoke-static {v5}, La7/d;->q(La7/d;)LU6/e;

    move-result-object v5

    iget-object v6, p0, La7/d$l;->r:La7/d;

    invoke-static {v6}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object v6

    iget-object v7, p0, La7/d$l;->s:Ljava/lang/String;

    invoke-virtual {v5, v6, v7}, LU6/e;->l(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v5, p0, La7/d$l;->r:La7/d;

    invoke-static {v5}, La7/d;->q(La7/d;)LU6/e;

    move-result-object v5

    iget-object v6, p0, La7/d$l;->s:Ljava/lang/String;

    invoke-virtual {v5, v6}, LU6/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_81
    if-eqz v5, :cond_87

    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    :cond_87
    if-nez v4, :cond_91

    const-string p0, "NtCreativeViewModel"

    const-string p1, "onWallpaperDownload failed, bitmap is null"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c9

    :cond_91
    iget-object v5, p0, La7/d$l;->r:La7/d;

    invoke-static {v5}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object v5

    invoke-virtual {v1}, LJ6/i$a;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v3}, Li6/i;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Li6/i$a;

    move-result-object v5

    if-eqz v5, :cond_a3

    move v5, v2

    goto :goto_a4

    :cond_a3
    const/4 v5, 0x0

    :goto_a4
    if-nez v5, :cond_b1

    if-eqz p1, :cond_b1

    invoke-virtual {p1}, Lcom/nothing/wallpaper/db/CreativeWallpaper;->getImageId()J

    move-result-wide v6

    sget-object p1, LR7/d;->r:LR7/d;

    invoke-virtual {p1, v6, v7}, LR7/d;->d(J)V

    :cond_b1
    iget-object p1, p0, La7/d$l;->r:La7/d;

    invoke-static {p1}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object p1

    invoke-virtual {v1}, LJ6/i$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v4, v3}, Li6/i;->b(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Z

    iget-object p1, p0, La7/d$l;->r:La7/d;

    iput v2, p0, La7/d$l;->q:I

    invoke-static {p1, v5, p0}, La7/d;->C(La7/d;ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_c9

    return-object v0

    :cond_c9
    :goto_c9
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
