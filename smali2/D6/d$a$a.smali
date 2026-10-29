.class final LD6/d$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/d;

.field final synthetic s:LC6/b;

.field final synthetic t:Lw6/c;


# direct methods
.method constructor <init>(LD6/d;LC6/b;Lw6/c;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LD6/d$a$a;->r:LD6/d;

    iput-object p2, p0, LD6/d$a$a;->s:LC6/b;

    iput-object p3, p0, LD6/d$a$a;->t:Lw6/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LD6/d$a$a;

    iget-object v0, p0, LD6/d$a$a;->r:LD6/d;

    iget-object v1, p0, LD6/d$a$a;->s:LC6/b;

    iget-object p0, p0, LD6/d$a$a;->t:Lw6/c;

    invoke-direct {p1, v0, v1, p0, p2}, LD6/d$a$a;-><init>(LD6/d;LC6/b;Lw6/c;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/d$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/d$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/d$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/d$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LD6/d$a$a;->q:I

    if-nez v0, :cond_a5

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_b
    iget-object v0, p0, LD6/d$a$a;->r:LD6/d;

    invoke-static {v0}, LD6/d;->g(LD6/d;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_3e

    iget-object v0, p0, LD6/d$a$a;->r:LD6/d;

    invoke-static {v0}, LD6/d;->b(LD6/d;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LD6/d$a$a;->r:LD6/d;

    iget-object v2, p0, LD6/d$a$a;->s:LC6/b;

    monitor-enter v0
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_1e} :catch_3a

    :try_start_1e
    invoke-static {v1}, LD6/d;->g(LD6/d;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_36

    invoke-virtual {v2}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v2

    invoke-virtual {v2}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getViewSize()Landroid/graphics/Point;

    move-result-object v2

    invoke-static {v2}, LG6/f;->c(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v1, v2}, LD6/d;->z(LD6/d;Landroid/graphics/Bitmap;)V

    goto :goto_36

    :catchall_34
    move-exception v1

    goto :goto_3c

    :cond_36
    :goto_36
    sget-object v1, Lh8/A;->a:Lh8/A;
    :try_end_38
    .catchall {:try_start_1e .. :try_end_38} :catchall_34

    :try_start_38
    monitor-exit v0

    goto :goto_3e

    :catch_3a
    move-exception v0

    goto :goto_6d

    :goto_3c
    monitor-exit v0

    throw v1

    :cond_3e
    :goto_3e
    new-instance v0, LC6/i;

    iget-object v1, p0, LD6/d$a$a;->s:LC6/b;

    invoke-virtual {v1}, LC6/b;->a()LC6/i;

    move-result-object v1

    invoke-virtual {v1}, LC6/i;->c()Landroid/graphics/Point;

    move-result-object v1

    iget-object v2, p0, LD6/d$a$a;->r:LD6/d;

    invoke-static {v2}, LD6/d;->g(LD6/d;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_58

    const-string v2, "effectBitmap"

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v2, p1

    :cond_58
    invoke-direct {v0, v1, v2}, LC6/i;-><init>(Landroid/graphics/Point;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, LD6/d$a$a;->r:LD6/d;

    invoke-static {v1}, LD6/d;->f(LD6/d;)Lw6/a;

    move-result-object v1

    iget-object v2, p0, LD6/d$a$a;->t:Lw6/c;

    iget-object v3, p0, LD6/d$a$a;->s:LC6/b;

    invoke-virtual {v3}, LC6/b;->a()LC6/i;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lw6/a;->c(Lw6/c;LC6/i;LC6/i;)V
    :try_end_6c
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_6c} :catch_3a

    return-object v0

    :goto_6d
    invoke-static {}, LG6/d;->b()Z

    move-result v1

    if-eqz v1, :cond_a4

    iget-object v1, p0, LD6/d$a$a;->r:LD6/d;

    invoke-static {v1}, LD6/d;->j(LD6/d;)Lq6/b;

    move-result-object v1

    iget-object p0, p0, LD6/d$a$a;->t:Lw6/c;

    invoke-virtual {p0}, Lw6/c;->b()LE6/a$a;

    move-result-object p0

    if-eqz p0, :cond_86

    invoke-virtual {p0}, LE6/a$a;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_87

    :cond_86
    move-object p0, p1

    :goto_87
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "effectApply.request("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") error: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lq6/b;->e(Ljava/lang/String;)V

    return-object p1

    :cond_a4
    throw v0

    :cond_a5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
