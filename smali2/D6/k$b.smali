.class final LD6/k$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/k;->f(Lcom/nothing/wallpaper/effects/data/model/ViewScope;Ljava/util/List;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic A:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:Ljava/lang/Object;

.field v:Ljava/lang/Object;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/util/List;

.field final synthetic z:LD6/k;


# direct methods
.method constructor <init>(Ljava/util/List;LD6/k;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LD6/k$b;->y:Ljava/util/List;

    iput-object p2, p0, LD6/k$b;->z:LD6/k;

    iput-object p3, p0, LD6/k$b;->A:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance v0, LD6/k$b;

    iget-object v1, p0, LD6/k$b;->y:Ljava/util/List;

    iget-object v2, p0, LD6/k$b;->z:LD6/k;

    iget-object p0, p0, LD6/k$b;->A:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-direct {v0, v1, v2, p0, p2}, LD6/k$b;-><init>(Ljava/util/List;LD6/k;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V

    iput-object p1, v0, LD6/k$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/k$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/k$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 16

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/k$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_34

    if-ne v1, v2, :cond_2c

    iget-object v1, p0, LD6/k$b;->v:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    iget-object v3, p0, LD6/k$b;->u:Ljava/lang/Object;

    check-cast v3, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget-object v4, p0, LD6/k$b;->t:Ljava/lang/Object;

    check-cast v4, LC6/a;

    iget-object v5, p0, LD6/k$b;->s:Ljava/lang/Object;

    check-cast v5, LC6/d;

    iget-object v6, p0, LD6/k$b;->r:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, LD6/k$b;->q:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, p0, LD6/k$b;->x:Ljava/lang/Object;

    check-cast v8, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_c8

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/k$b;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, LF8/L;

    iget-object p1, p0, LD6/k$b;->y:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, LD6/k$b;->z:LD6/k;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {p1, v10}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_51
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_80

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/o;

    new-instance v11, Lh8/u;

    invoke-virtual {v4}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v13

    move-object v5, v4

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v4

    new-instance v6, LD6/k$b$a;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v5, v7}, LD6/k$b$a;-><init>(LD6/k;Lh8/o;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;

    move-result-object v4

    invoke-direct {v11, v12, v13, v4}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_51

    :cond_80
    iget-object p1, p0, LD6/k$b;->A:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v9, v10}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v6, v3

    move-object v3, p1

    :goto_91
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_d5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/u;

    invoke-virtual {p1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC6/a;

    invoke-virtual {p1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC6/d;

    invoke-virtual {p1}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/T;

    iput-object v3, p0, LD6/k$b;->x:Ljava/lang/Object;

    iput-object v1, p0, LD6/k$b;->q:Ljava/lang/Object;

    iput-object v6, p0, LD6/k$b;->r:Ljava/lang/Object;

    iput-object v5, p0, LD6/k$b;->s:Ljava/lang/Object;

    iput-object v4, p0, LD6/k$b;->t:Ljava/lang/Object;

    iput-object v3, p0, LD6/k$b;->u:Ljava/lang/Object;

    iput-object v1, p0, LD6/k$b;->v:Ljava/lang/Object;

    iput v2, p0, LD6/k$b;->w:I

    invoke-interface {p1, p0}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c6

    return-object v0

    :cond_c6
    move-object v7, v1

    move-object v8, v3

    :goto_c8
    check-cast p1, LC6/i;

    new-instance v9, LC6/b;

    invoke-direct {v9, v3, v4, v5, p1}, LC6/b;-><init>(Lcom/nothing/wallpaper/effects/data/model/ViewScope;LC6/a;LC6/d;LC6/i;)V

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v7

    move-object v3, v8

    goto :goto_91

    :cond_d5
    check-cast v1, Ljava/util/List;

    return-object v1
.end method
