.class final La7/d$n;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d;->A0(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

.field final synthetic s:La7/d;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;La7/d;Lm8/e;)V
    .registers 4

    iput-object p1, p0, La7/d$n;->r:Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    iput-object p2, p0, La7/d$n;->s:La7/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, La7/d$n;

    iget-object v0, p0, La7/d$n;->r:Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    iget-object p0, p0, La7/d$n;->s:La7/d;

    invoke-direct {p1, v0, p0, p2}, La7/d$n;-><init>(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;La7/d;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, La7/d$n;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, La7/d$n;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, La7/d$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, La7/d$n;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 14

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, La7/d$n;->q:I

    if-nez v0, :cond_e2

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La7/d$n;->r:Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saveGeneratedRecords "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NtCreativeViewModel"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, La7/d$n;->r:Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, La7/d$n;->s:La7/d;

    invoke-static {p1}, La7/d;->q(La7/d;)LU6/e;

    move-result-object p1

    invoke-virtual {p1, v3}, LU6/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3d

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3b

    goto :goto_3d

    :cond_3b
    :goto_3b
    move-object v4, p1

    goto :goto_57

    :cond_3d
    :goto_3d
    iget-object p1, p0, La7/d$n;->s:La7/d;

    invoke-static {p1}, La7/d;->q(La7/d;)LU6/e;

    move-result-object p1

    iget-object v0, p0, La7/d$n;->s:La7/d;

    invoke-static {v0}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, LU6/e;->l(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, La7/d$n;->s:La7/d;

    invoke-static {p1}, La7/d;->q(La7/d;)LU6/e;

    move-result-object p1

    invoke-virtual {p1, v3}, LU6/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3b

    :goto_57
    if-eqz v4, :cond_ac

    iget-object p1, p0, La7/d$n;->r:Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    iget-object v11, p0, La7/d$n;->s:La7/d;

    new-instance v0, Lcom/nothing/wallpaper/db/CreativeWallpaper;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getId()J

    move-result-wide v1

    invoke-static {v11}, La7/d;->v(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p1

    const-string v5, ""

    if-eqz p1, :cond_71

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_72

    :cond_71
    move-object p1, v5

    :cond_72
    invoke-static {v11}, La7/d;->v(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v6

    if-eqz v6, :cond_7e

    invoke-virtual {v6}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7f

    :cond_7e
    move-object v6, v5

    :cond_7f
    invoke-static {v11}, La7/d;->u(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v7

    if-eqz v7, :cond_8b

    invoke-virtual {v7}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_8c

    :cond_8b
    move-object v7, v5

    :cond_8c
    invoke-static {v11}, La7/d;->u(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v8

    if-eqz v8, :cond_98

    invoke-virtual {v8}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordForLocale()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_99

    :cond_98
    move-object v8, v5

    :cond_99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    move-object v5, p1

    invoke-direct/range {v0 .. v10}, Lcom/nothing/wallpaper/db/CreativeWallpaper;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-static {v11}, La7/d;->y(La7/d;)LV6/a;

    move-result-object p1

    invoke-virtual {p1, v0}, LV6/a;->r(Lcom/nothing/wallpaper/db/CreativeWallpaper;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    :cond_ac
    iget-object p1, p0, La7/d$n;->s:La7/d;

    invoke-static {p1}, La7/d;->v(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p1

    if-eqz p1, :cond_df

    iget-object p1, p0, La7/d$n;->s:La7/d;

    invoke-static {p1}, La7/d;->u(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p1

    if-eqz p1, :cond_df

    iget-object p1, p0, La7/d$n;->s:La7/d;

    invoke-static {p1}, La7/d;->y(La7/d;)LV6/a;

    move-result-object p1

    iget-object v0, p0, La7/d$n;->s:La7/d;

    invoke-static {v0}, La7/d;->v(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v1, p0, La7/d$n;->s:La7/d;

    invoke-static {v1}, La7/d;->u(La7/d;)Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p0, La7/d$n;->s:La7/d;

    invoke-static {p0}, La7/d;->z(La7/d;)Landroid/graphics/Point;

    move-result-object p0

    iget p0, p0, Landroid/graphics/Point;->x:I

    invoke-virtual {p1, v0, v1, p0}, LV6/a;->t(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;I)I

    :cond_df
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_e2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
