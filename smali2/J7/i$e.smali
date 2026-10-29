.class final LJ7/i$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


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

.field final synthetic s:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LJ7/i$e;->s:LJ7/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LJ7/i$e;

    iget-object p0, p0, LJ7/i$e;->s:LJ7/i;

    invoke-direct {v0, p0, p2}, LJ7/i$e;-><init>(LJ7/i;Lm8/e;)V

    iput-object p1, v0, LJ7/i$e;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ7/i$e;->s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ7/i$e;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object v0, p0, LJ7/i$e;->r:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_30

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ7/i$e;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LJ7/i$e;->r:Ljava/lang/Object;

    iput v2, p0, LJ7/i$e;->q:I

    const-wide/16 v1, 0x64

    invoke-static {v1, v2, p0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2f

    return-object v0

    :cond_2f
    move-object v0, p1

    :goto_30
    check-cast v0, Ljava/lang/Iterable;

    iget-object p0, p0, LJ7/i$e;->s:LJ7/i;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3d
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_88

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO1/a;

    invoke-static {p0}, LJ7/i;->l(LJ7/i;)LS1/a;

    move-result-object v2

    invoke-virtual {v1}, LO1/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LS1/a;->d(Ljava/lang/String;)LO2/h;

    move-result-object v2

    if-eqz v2, :cond_81

    invoke-static {p0}, LJ7/i;->p(LJ7/i;)Landroid/content/res/Resources;

    move-result-object v3

    invoke-interface {v2}, LO2/h;->a()LO2/g;

    move-result-object v2

    invoke-virtual {v2}, LO2/g;->a()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v4, 0x7f130275

    invoke-virtual {v3, v4, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LT1/a;

    invoke-virtual {v1}, LO1/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, LO1/a;->g()Z

    move-result v1

    invoke-direct {v3, v4, v1, v2}, LT1/a;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_82

    :cond_81
    const/4 v3, 0x0

    :goto_82
    if-eqz v3, :cond_3d

    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_88
    return-object p1
.end method

.method public final s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LJ7/i$e;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ7/i$e;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ7/i$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
