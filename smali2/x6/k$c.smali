.class final Lx6/k$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx6/k;->l(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Ljava/util/List;

.field final synthetic s:Lx6/k;

.field final synthetic t:J

.field final synthetic u:LC6/e;


# direct methods
.method constructor <init>(Ljava/util/List;Lx6/k;JLC6/e;Lm8/e;)V
    .registers 7

    iput-object p1, p0, Lx6/k$c;->r:Ljava/util/List;

    iput-object p2, p0, Lx6/k$c;->s:Lx6/k;

    iput-wide p3, p0, Lx6/k$c;->t:J

    iput-object p5, p0, Lx6/k$c;->u:LC6/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, Lx6/k$c;

    iget-object v1, p0, Lx6/k$c;->r:Ljava/util/List;

    iget-object v2, p0, Lx6/k$c;->s:Lx6/k;

    iget-wide v3, p0, Lx6/k$c;->t:J

    iget-object v5, p0, Lx6/k$c;->u:LC6/e;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lx6/k$c;-><init>(Ljava/util/List;Lx6/k;JLC6/e;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lx6/k$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lx6/k$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lx6/k$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lx6/k$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    const-string v0, "EffectAssetManager"

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v1, p0, Lx6/k$c;->q:I

    if-nez v1, :cond_e7

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_c
    iget-object p1, p0, Lx6/k$c;->r:Ljava/util/List;

    if-eqz p1, :cond_51

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    const/4 v1, 0x1

    xor-int/2addr p1, v1

    if-ne p1, v1, :cond_51

    iget-object p1, p0, Lx6/k$c;->r:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "do delete deletes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lx6/k$c;->r:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lx6/k$c;->s:Lx6/k;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lx6/k;->e(Lx6/k;)Lx6/q;

    move-result-object v3

    invoke-interface {v3, v2}, Lx6/r;->p(Ljava/lang/String;)V

    goto :goto_3a

    :catch_4e
    move-exception p0

    goto/16 :goto_d0

    :cond_51
    iget-object p1, p0, Lx6/k$c;->s:Lx6/k;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lx6/k;->d(Lx6/k;Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lx6/k$c;->t:J

    sub-long/2addr v2, v4

    iget-object p1, p0, Lx6/k$c;->s:Lx6/k;

    invoke-static {p1}, Lx6/k;->f(Lx6/k;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lx6/k$c;->s:Lx6/k;

    invoke-static {v4}, Lx6/k;->f(Lx6/k;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lx6/k$c;->s:Lx6/k;

    invoke-static {v5}, Lx6/k;->f(Lx6/k;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v5, v6, v1, v7, v8}, Lx6/k;->s(Lx6/k;Ljava/lang/String;ZILjava/lang/Object;)Lx6/k$b;

    move-result-object v1

    if-eqz v1, :cond_83

    invoke-virtual {v1}, Lx6/k$b;->a()Lw6/c;

    move-result-object v1

    if-eqz v1, :cond_83

    invoke-virtual {v1}, Lw6/c;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_84

    :cond_83
    move-object v1, v8

    :goto_84
    iget-object v5, p0, Lx6/k$c;->r:Ljava/util/List;

    iget-object p0, p0, Lx6/k$c;->u:LC6/e;

    if-eqz p0, :cond_8e

    invoke-virtual {p0}, LC6/e;->a()Ljava/lang/String;

    move-result-object v8

    :cond_8e
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "close success: consume="

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",originScope="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",deletes="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ",effect="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_cf
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_cf} :catch_4e

    goto :goto_e4

    :goto_d0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close with error:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_e4
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_e7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
