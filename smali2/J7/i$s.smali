.class final LJ7/i$s;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/s;


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

.field synthetic t:Ljava/lang/Object;

.field synthetic u:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm8/e;)V
    .registers 3

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(LC7/b;LC7/b;)Z
    .registers 2

    invoke-static {p0, p1}, LJ7/i$s;->w(LC7/b;LC7/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic u(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, LJ7/i$s;->x(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final w(LC7/b;LC7/b;)Z
    .registers 2

    invoke-virtual {p0}, LC7/b;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, LC7/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final x(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LJ7/i$s;->q:I

    if-nez v0, :cond_f9

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$s;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, LJ7/i$s;->s:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, LJ7/i$s;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object p0, p0, LJ7/i$s;->u:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Li8/s;->u0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "bottom_start"

    const/4 v7, 0x0

    if-eqz v5, :cond_47

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, LC7/b;

    invoke-virtual {v8}, LC7/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2c

    goto :goto_48

    :cond_47
    move-object v5, v7

    :goto_48
    const-string v4, "none"

    if-nez v5, :cond_54

    new-instance v5, LC7/b;

    invoke-direct {v5, v6, v4}, LC7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_54
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_58
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "bottom_end"

    if-eqz v5, :cond_72

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, LC7/b;

    invoke-virtual {v8}, LC7/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_58

    goto :goto_73

    :cond_72
    move-object v5, v7

    :goto_73
    if-nez v5, :cond_7d

    new-instance p1, LC7/b;

    invoke-direct {p1, v6, v4}, LC7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7d
    if-eqz v0, :cond_a5

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_85
    :goto_85
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC7/b;

    new-instance v4, LJ7/j;

    invoke-direct {v4, v0}, LJ7/j;-><init>(LC7/b;)V

    new-instance v5, LJ7/k;

    invoke-direct {v5, v4}, LJ7/k;-><init>(Lv8/l;)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    move-result v4

    if-eqz v4, :cond_85

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_85

    :cond_a5
    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_ab
    :goto_ab
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC7/b;

    move-object v3, p0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_be
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_da

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LC7/a;

    invoke-virtual {v0}, LC7/b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, LC7/a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_be

    goto :goto_db

    :cond_da
    move-object v4, v7

    :goto_db
    check-cast v4, LC7/a;

    if-eqz v4, :cond_ab

    new-instance v3, Lh8/u;

    invoke-virtual {v0}, LC7/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LC7/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v3, v5, v4, v0}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_ab

    :cond_f8
    return-object v2

    :cond_f9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public bridge synthetic n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/util/List;

    check-cast p5, Lm8/e;

    invoke-virtual/range {p0 .. p5}, LJ7/i$s;->v(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final v(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance p0, LJ7/i$s;

    invoke-direct {p0, p5}, LJ7/i$s;-><init>(Lm8/e;)V

    iput-object p1, p0, LJ7/i$s;->r:Ljava/lang/Object;

    iput-object p2, p0, LJ7/i$s;->s:Ljava/lang/Object;

    iput-object p3, p0, LJ7/i$s;->t:Ljava/lang/Object;

    iput-object p4, p0, LJ7/i$s;->u:Ljava/lang/Object;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/i$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
