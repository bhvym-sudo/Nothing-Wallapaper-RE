.class final Li7/d$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/d;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field final synthetic u:Li7/d;


# direct methods
.method constructor <init>(Li7/d;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Li7/d$b;->u:Li7/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Li7/d$b;

    iget-object p0, p0, Li7/d$b;->u:Li7/d;

    invoke-direct {p1, p0, p2}, Li7/d$b;-><init>(Li7/d;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Li7/d$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Li7/d$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Li7/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Li7/d$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Li7/d$b;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2f

    if-eq v1, v3, :cond_27

    if-ne v1, v2, :cond_1f

    iget-object v1, p0, Li7/d$b;->s:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v3, p0, Li7/d$b;->r:Ljava/lang/Object;

    check-cast v3, Li7/d;

    iget-object v4, p0, Li7/d$b;->q:Ljava/lang/Object;

    check-cast v4, LV1/a;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_ac

    :cond_1f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_27
    iget-object v1, p0, Li7/d$b;->q:Ljava/lang/Object;

    check-cast v1, LV1/a;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5a

    :cond_2f
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK1/p;

    iget-object v1, p0, Li7/d$b;->u:Li7/d;

    invoke-virtual {v1}, Landroidx/lifecycle/b;->e()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {p1}, Lh3/V;->i()Lg3/v;

    move-result-object v4

    invoke-virtual {p1, v1, v4}, LK1/p;->f0(Landroid/content/Context;Lg3/v;)LV1/a;

    move-result-object v1

    invoke-virtual {v1}, LV1/a;->b()LI8/f;

    move-result-object p1

    iput-object v1, p0, Li7/d$b;->q:Ljava/lang/Object;

    iput v3, p0, Li7/d$b;->t:I

    invoke-static {p1, p0}, LI8/h;->z(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5a

    goto :goto_ab

    :cond_5a
    :goto_5a
    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_bf

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_bf

    check-cast p1, Ljava/lang/Iterable;

    iget-object v3, p0, Li7/d$b;->u:Li7/d;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v4, v1

    move-object v1, p1

    :cond_6e
    :goto_6e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_bf

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_80
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_98

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LW1/a;

    invoke-virtual {v6}, LW1/a;->a()Lx1/g;

    move-result-object v6

    invoke-static {v3, v6}, Li7/d;->j(Li7/d;Lx1/g;)Z

    move-result v6

    if-eqz v6, :cond_80

    goto :goto_99

    :cond_98
    const/4 v5, 0x0

    :goto_99
    check-cast v5, LW1/a;

    if-eqz v5, :cond_6e

    iput-object v4, p0, Li7/d$b;->q:Ljava/lang/Object;

    iput-object v3, p0, Li7/d$b;->r:Ljava/lang/Object;

    iput-object v1, p0, Li7/d$b;->s:Ljava/lang/Object;

    iput v2, p0, Li7/d$b;->t:I

    invoke-virtual {v4, v5, p0}, LV1/a;->e(LW1/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_ac

    :goto_ab
    return-object v0

    :cond_ac
    :goto_ac
    invoke-static {v3}, Li7/d;->h(Li7/d;)Landroid/app/Application;

    move-result-object p1

    invoke-static {p1}, LO6/b;->c(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_6e

    invoke-static {v3}, Li7/d;->h(Li7/d;)Landroid/app/Application;

    move-result-object p1

    const/4 v5, 0x0

    invoke-static {p1, v5}, LO6/b;->g(Landroid/content/Context;Z)V

    goto :goto_6e

    :cond_bf
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
