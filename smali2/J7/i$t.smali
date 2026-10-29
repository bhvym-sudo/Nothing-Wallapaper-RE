.class final LJ7/i$t;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;-><init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/i$t;->t:LJ7/i;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, Ljava/util/List;

    check-cast p2, Lz7/c;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LJ7/i$t;->s(Ljava/util/List;Lz7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LJ7/i$t;->q:I

    if-nez v0, :cond_13e

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$t;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, LJ7/i$t;->s:Ljava/lang/Object;

    check-cast v0, Lz7/c;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_23
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LS5/d;

    instance-of v5, v3, LS5/a;

    if-eqz v5, :cond_37

    move-object v4, v3

    check-cast v4, LS5/a;

    :cond_37
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_3b
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LS5/a;

    if-eqz v3, :cond_53

    invoke-virtual {v3}, LS5/a;->h()Ljava/lang/String;

    move-result-object v3

    goto :goto_54

    :cond_53
    move-object v3, v4

    :goto_54
    invoke-virtual {v0}, Lz7/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3f

    goto :goto_60

    :cond_5f
    move-object v1, v4

    :goto_60
    check-cast v1, LS5/a;

    if-eqz v1, :cond_13d

    iget-object p0, p0, LJ7/i$t;->t:LJ7/i;

    invoke-virtual {v1}, LS5/a;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v5, 0x0

    move v6, v5

    :goto_77
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_124

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/nothing/launcher/card/j;

    invoke-static {p0}, LJ7/i;->k(LJ7/i;)Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v7, v8}, LF5/m;->E(Landroid/content/Context;)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_115

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_97

    goto :goto_98

    :cond_97
    move-object v8, v4

    :goto_98
    if-eqz v8, :cond_115

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v2}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh8/u;

    new-instance v10, Lcom/nothing/launcher/card/j;

    invoke-direct {v10}, Lcom/nothing/launcher/card/j;-><init>()V

    invoke-virtual {v10, v7}, Lcom/nothing/launcher/card/j;->r0(Lcom/nothing/launcher/card/j;)V

    invoke-virtual {v6}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Size;

    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/nothing/launcher/card/j;->L0(I)V

    invoke-virtual {v6}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Size;

    invoke-virtual {v11}, Landroid/util/Size;->getHeight()I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/nothing/launcher/card/j;->M0(I)V

    invoke-virtual {v10}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/nothing/launcher/card/j;->I0(I)V

    invoke-virtual {v10}, Lcom/nothing/launcher/card/j;->C0()I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/nothing/launcher/card/j;->J0(I)V

    invoke-virtual {v6}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v10, v11}, Lcom/nothing/launcher/card/j;->K0(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ljava/lang/String;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    const/4 v12, 0x1

    if-lez v11, :cond_fe

    move v11, v12

    goto :goto_ff

    :cond_fe
    move v11, v5

    :goto_ff
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_10a

    goto :goto_10b

    :cond_10a
    move-object v6, v4

    :goto_10b
    check-cast v6, Ljava/lang/String;

    invoke-virtual {v10, v6}, Lcom/nothing/launcher/card/j;->H0(Ljava/lang/String;)V

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v6, v12

    goto :goto_a9

    :cond_115
    filled-new-array {v7}, [Lcom/nothing/launcher/card/j;

    move-result-object v7

    invoke-static {v7}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    :cond_11d
    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v3, v9}, Li8/s;->z(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_77

    :cond_124
    if-eqz v6, :cond_127

    goto :goto_12f

    :cond_127
    invoke-static {p0}, LJ7/i;->u(LJ7/i;)LJ7/i$K;

    move-result-object p1

    invoke-static {v3, p1}, Li8/s;->m0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    :goto_12f
    new-instance p1, Lz7/d;

    invoke-static {p0}, LJ7/i;->k(LJ7/i;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v1, p0}, LS5/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v0, v3}, Lz7/d;-><init>(Ljava/lang/String;Lz7/c;Ljava/util/List;)V

    return-object p1

    :cond_13d
    return-object v4

    :cond_13e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Ljava/util/List;Lz7/c;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LJ7/i$t;

    iget-object p0, p0, LJ7/i$t;->t:LJ7/i;

    invoke-direct {v0, p0, p3}, LJ7/i$t;-><init>(LJ7/i;Lm8/e;)V

    iput-object p1, v0, LJ7/i$t;->r:Ljava/lang/Object;

    iput-object p2, v0, LJ7/i$t;->s:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LJ7/i$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
