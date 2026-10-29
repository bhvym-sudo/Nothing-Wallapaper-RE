.class public final LB7/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB7/b$a;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LB7/b$a$a;->q:LI8/g;

    iput-object p2, p0, LB7/b$a$a;->r:LB7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, LB7/b$a$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LB7/b$a$a$a;

    iget v1, v0, LB7/b$a$a$a;->r:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LB7/b$a$a$a;->r:I

    goto :goto_18

    :cond_13
    new-instance v0, LB7/b$a$a$a;

    invoke-direct {v0, p0, p2}, LB7/b$a$a$a;-><init>(LB7/b$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LB7/b$a$a$a;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LB7/b$a$a$a;->r:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_68

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LB7/b$a$a;->q:LI8/g;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_49
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR2/a$d;

    iget-object v5, p0, LB7/b$a$a;->r:LB7/b;

    invoke-static {v5, v4}, LB7/b;->g(LB7/b;LR2/a$d;)LC7/c;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_49

    :cond_5f
    iput v3, v0, LB7/b$a$a$a;->r:I

    invoke-interface {p2, v2, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_68

    return-object v1

    :cond_68
    :goto_68
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
