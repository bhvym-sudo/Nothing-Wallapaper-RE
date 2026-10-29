.class final LJ7/i$F;
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

.field final synthetic v:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/i$F;->v:LJ7/i;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LJ7/i$F;->q:I

    if-nez v0, :cond_a8

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$F;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, LJ7/i$F;->s:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, LJ7/i$F;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, LJ7/i$F;->u:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    if-nez v1, :cond_2b

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_59

    :cond_2b
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_49

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LC7/b;

    invoke-virtual {v4}, LC7/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    goto :goto_4a

    :cond_49
    const/4 v1, 0x0

    :goto_4a
    check-cast v1, LC7/b;

    if-eqz v1, :cond_59

    invoke-virtual {v1}, LC7/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    :cond_59
    :goto_59
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_60
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_78

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC7/a;

    invoke-virtual {v1}, LC7/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, LC7/a;->g(Z)V

    goto :goto_60

    :cond_78
    sget-object v0, LC7/a;->k:LC7/a$a;

    iget-object p0, p0, LJ7/i$F;->v:LJ7/i;

    invoke-static {p0}, LJ7/i;->k(LJ7/i;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, LC7/a$a;->a(Landroid/content/Context;)LC7/a;

    move-result-object p0

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_97

    invoke-virtual {p0}, LC7/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_95

    goto :goto_97

    :cond_95
    const/4 v0, 0x0

    goto :goto_98

    :cond_97
    :goto_97
    const/4 v0, 0x1

    :goto_98
    invoke-virtual {p0, v0}, LC7/a;->g(Z)V

    check-cast p1, Ljava/util/Collection;

    invoke-static {p0}, Li8/s;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p1, p0}, Li8/s;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_a8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public bridge synthetic n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Lm8/e;

    invoke-virtual/range {p0 .. p5}, LJ7/i$F;->s(Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final s(Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LJ7/i$F;

    iget-object p0, p0, LJ7/i$F;->v:LJ7/i;

    invoke-direct {v0, p0, p5}, LJ7/i$F;-><init>(LJ7/i;Lm8/e;)V

    iput-object p1, v0, LJ7/i$F;->r:Ljava/lang/Object;

    iput-object p2, v0, LJ7/i$F;->s:Ljava/lang/Object;

    iput-object p3, v0, LJ7/i$F;->t:Ljava/lang/Object;

    iput-object p4, v0, LJ7/i$F;->u:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LJ7/i$F;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
