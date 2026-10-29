.class public final LB7/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB7/b$b;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/g;

.field final synthetic r:LB7/b;


# direct methods
.method public constructor <init>(LI8/g;LB7/b;)V
    .registers 3

    iput-object p1, p0, LB7/b$b$a;->q:LI8/g;

    iput-object p2, p0, LB7/b$b$a;->r:LB7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 12

    instance-of v0, p2, LB7/b$b$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LB7/b$b$a$a;

    iget v1, v0, LB7/b$b$a$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LB7/b$b$a$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LB7/b$b$a$a;

    invoke-direct {v0, p0, p2}, LB7/b$b$a$a;-><init>(LB7/b$b$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LB7/b$b$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LB7/b$b$a$a;->r:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_52

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_b7

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    iget-object p0, v0, LB7/b$b$a$a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/Collection;

    iget-object p1, v0, LB7/b$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, LB7/b$b$a$a;->v:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v5, v0, LB7/b$b$a$a;->u:Ljava/lang/Object;

    check-cast v5, LI8/g;

    iget-object v6, v0, LB7/b$b$a$a;->s:Ljava/lang/Object;

    check-cast v6, LB7/b$b$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v8, v0

    move-object v0, p1

    move-object p1, v6

    move-object v6, v5

    move-object v5, v8

    goto :goto_98

    :cond_52
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LB7/b$b$a;->q:LI8/g;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p1, v5}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p2

    move-object p2, p1

    move-object p1, p0

    :goto_6d
    move-object p0, v2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LR2/a$a;

    iget-object v6, p1, LB7/b$b$a;->r:LB7/b;

    invoke-static {v6}, LB7/b;->e(LB7/b;)LR2/a;

    move-result-object v7

    iput-object p1, v0, LB7/b$b$a$a;->s:Ljava/lang/Object;

    iput-object v5, v0, LB7/b$b$a$a;->u:Ljava/lang/Object;

    iput-object p0, v0, LB7/b$b$a$a;->v:Ljava/lang/Object;

    iput-object p2, v0, LB7/b$b$a$a;->w:Ljava/lang/Object;

    iput-object p0, v0, LB7/b$b$a$a;->x:Ljava/lang/Object;

    iput v4, v0, LB7/b$b$a$a;->r:I

    invoke-static {v6, v2, v7, v0}, LB7/b;->h(LB7/b;LR2/a$a;LR2/a;Lm8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_93

    goto :goto_b6

    :cond_93
    move-object v6, v5

    move-object v5, v0

    move-object v0, p2

    move-object p2, v2

    move-object v2, p0

    :goto_98
    check-cast p2, LC7/a;

    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object p2, v0

    move-object v0, v5

    move-object v5, v6

    goto :goto_6d

    :cond_a1
    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, v0, LB7/b$b$a$a;->s:Ljava/lang/Object;

    iput-object p1, v0, LB7/b$b$a$a;->u:Ljava/lang/Object;

    iput-object p1, v0, LB7/b$b$a$a;->v:Ljava/lang/Object;

    iput-object p1, v0, LB7/b$b$a$a;->w:Ljava/lang/Object;

    iput-object p1, v0, LB7/b$b$a$a;->x:Ljava/lang/Object;

    iput v3, v0, LB7/b$b$a$a;->r:I

    invoke-interface {v5, p0, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_b7

    :goto_b6
    return-object v1

    :cond_b7
    :goto_b7
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
