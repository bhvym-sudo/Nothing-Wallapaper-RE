.class final LD6/d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/d;->E(LC6/b;Ljava/util/List;)V
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

.field private synthetic u:Ljava/lang/Object;

.field final synthetic v:LF8/x0;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:LD6/d;

.field final synthetic y:LC6/b;


# direct methods
.method constructor <init>(LF8/x0;Ljava/util/List;LD6/d;LC6/b;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LD6/d$a;->v:LF8/x0;

    iput-object p2, p0, LD6/d$a;->w:Ljava/util/List;

    iput-object p3, p0, LD6/d$a;->x:LD6/d;

    iput-object p4, p0, LD6/d$a;->y:LC6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LD6/d$a;

    iget-object v1, p0, LD6/d$a;->v:LF8/x0;

    iget-object v2, p0, LD6/d$a;->w:Ljava/util/List;

    iget-object v3, p0, LD6/d$a;->x:LD6/d;

    iget-object v4, p0, LD6/d$a;->y:LC6/b;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LD6/d$a;-><init>(LF8/x0;Ljava/util/List;LD6/d;LC6/b;Lm8/e;)V

    iput-object p1, v0, LD6/d$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/d$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/d$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/d$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 16

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/d$a;->t:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3c

    if-eq v1, v4, :cond_34

    if-eq v1, v3, :cond_1f

    if-ne v1, v2, :cond_17

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_121

    :cond_17
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1f
    iget-object v1, p0, LD6/d$a;->s:Ljava/lang/Object;

    check-cast v1, Lh8/o;

    iget-object v4, p0, LD6/d$a;->r:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v6, p0, LD6/d$a;->q:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, p0, LD6/d$a;->u:Ljava/lang/Object;

    check-cast v7, LC6/b;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_e5

    :cond_34
    iget-object v1, p0, LD6/d$a;->u:Ljava/lang/Object;

    check-cast v1, LF8/L;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_54

    :cond_3c
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/d$a;->u:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LF8/L;

    iget-object p1, p0, LD6/d$a;->v:LF8/x0;

    if-eqz p1, :cond_54

    iput-object v1, p0, LD6/d$a;->u:Ljava/lang/Object;

    iput v4, p0, LD6/d$a;->t:I

    invoke-static {p1, p0}, LF8/A0;->g(LF8/x0;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_54

    goto/16 :goto_120

    :cond_54
    :goto_54
    move-object v6, v1

    iget-object p1, p0, LD6/d$a;->w:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, LD6/d$a;->x:LD6/d;

    iget-object v4, p0, LD6/d$a;->y:LC6/b;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {p1, v8}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_80

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LC6/e;

    invoke-static {v1, v4, v9}, LD6/d;->a(LD6/d;LC6/b;LC6/e;)Lw6/c;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6c

    :cond_80
    iget-object p1, p0, LD6/d$a;->x:LD6/d;

    iget-object v1, p0, LD6/d$a;->y:LC6/b;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v7, v8}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_91
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lw6/c;

    new-instance v9, LD6/d$a$a;

    invoke-direct {v9, p1, v1, v13, v5}, LD6/d$a$a;-><init>(LD6/d;LC6/b;Lw6/c;Lm8/e;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, LF8/g;->b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;

    move-result-object v7

    new-instance v8, Lh8/o;

    invoke-direct {v8, v13, v7}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_91

    :cond_b4
    iget-object p1, p0, LD6/d$a;->y:LC6/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v7, p1

    move-object v6, v1

    :cond_c1
    :goto_c1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_fc

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lh8/o;

    invoke-virtual {v1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/T;

    iput-object v7, p0, LD6/d$a;->u:Ljava/lang/Object;

    iput-object v6, p0, LD6/d$a;->q:Ljava/lang/Object;

    iput-object v4, p0, LD6/d$a;->r:Ljava/lang/Object;

    iput-object v1, p0, LD6/d$a;->s:Ljava/lang/Object;

    iput v3, p0, LD6/d$a;->t:I

    invoke-interface {p1, p0}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e5

    goto :goto_120

    :cond_e5
    :goto_e5
    check-cast p1, LC6/i;

    if-eqz p1, :cond_f5

    new-instance v8, LC6/f;

    invoke-virtual {v1}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw6/c;

    invoke-direct {v8, v1, p1, v7}, LC6/f;-><init>(Lw6/c;LC6/i;LC6/b;)V

    goto :goto_f6

    :cond_f5
    move-object v8, v5

    :goto_f6
    if-eqz v8, :cond_c1

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c1

    :cond_fc
    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p1

    iget-object v1, p0, LD6/d$a;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne p1, v1, :cond_121

    iget-object p1, p0, LD6/d$a;->x:LD6/d;

    invoke-static {p1}, LD6/d;->u(LD6/d;)LI8/z;

    move-result-object p1

    iput-object v5, p0, LD6/d$a;->u:Ljava/lang/Object;

    iput-object v5, p0, LD6/d$a;->q:Ljava/lang/Object;

    iput-object v5, p0, LD6/d$a;->r:Ljava/lang/Object;

    iput-object v5, p0, LD6/d$a;->s:Ljava/lang/Object;

    iput v2, p0, LD6/d$a;->t:I

    invoke-interface {p1, v6, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_121

    :goto_120
    return-object v0

    :cond_121
    :goto_121
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
