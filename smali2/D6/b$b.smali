.class final LD6/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b;->A0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:J

.field r:I

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:LD6/b;


# direct methods
.method constructor <init>(LD6/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LD6/b$b;->t:LD6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LD6/b$b;

    iget-object p0, p0, LD6/b$b;->t:LD6/b;

    invoke-direct {v0, p0, p2}, LD6/b$b;-><init>(LD6/b;Lm8/e;)V

    iput-object p1, v0, LD6/b$b;->s:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$b;->s(Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$b;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1f

    if-ne v1, v3, :cond_17

    iget-wide v0, p0, LD6/b$b;->q:J

    iget-object v3, p0, LD6/b$b;->s:Ljava/lang/Object;

    check-cast v3, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_93

    :cond_17
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1f
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$b;->s:Ljava/lang/Object;

    check-cast p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v1, p0, LD6/b$b;->t:LD6/b;

    invoke-static {v1}, LD6/b;->u(LD6/b;)Lq6/b;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "start crop bitmaps for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object v1, LC6/a;->q:LC6/a;

    filled-new-array {v1}, [LC6/a;

    move-result-object v1

    invoke-static {v1}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v6, p0, LD6/b$b;->t:LD6/b;

    invoke-virtual {v6}, LD6/b;->b0()Z

    move-result v6

    if-eqz v6, :cond_60

    sget-object v6, LC6/a;->r:LC6/a;

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_60
    iget-object v6, p0, LD6/b$b;->t:LD6/b;

    invoke-virtual {v6}, LD6/b;->q0()Z

    move-result v6

    if-eqz v6, :cond_75

    iget-object v6, p0, LD6/b$b;->t:LD6/b;

    invoke-static {v6}, LD6/b;->j(LD6/b;)Landroid/graphics/Bitmap;

    move-result-object v6

    if-eqz v6, :cond_75

    sget-object v6, LC6/a;->s:LC6/a;

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_75
    iget-object v6, p0, LD6/b$b;->t:LD6/b;

    invoke-static {v6}, LD6/b;->a(LD6/b;)LD6/k;

    move-result-object v6

    if-nez v6, :cond_83

    const-string v6, "bitmapCropper"

    invoke-static {v6}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v6, v2

    :cond_83
    iput-object p1, p0, LD6/b$b;->s:Ljava/lang/Object;

    iput-wide v4, p0, LD6/b$b;->q:J

    iput v3, p0, LD6/b$b;->r:I

    invoke-virtual {v6, p1, v1, p0}, LD6/k;->f(Lcom/nothing/wallpaper/effects/data/model/ViewScope;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_90

    return-object v0

    :cond_90
    move-object v3, p1

    move-object p1, v1

    move-wide v0, v4

    :goto_93
    iget-object p0, p0, LD6/b$b;->t:LD6/b;

    move-object v4, p1

    check-cast v4, Ljava/util/List;

    invoke-static {p0}, LD6/b;->u(LD6/b;)Lq6/b;

    move-result-object p0

    if-eqz v4, :cond_c3

    check-cast v4, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v4, v5}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_af
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC6/b;

    invoke-virtual {v5}, LC6/b;->c()LC6/a;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_af

    :cond_c3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "end crop bitmaps for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", types "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", time consume "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "ms."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq6/b;->a(Ljava/lang/String;)V

    return-object p1
.end method

.method public final s(Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LD6/b$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
