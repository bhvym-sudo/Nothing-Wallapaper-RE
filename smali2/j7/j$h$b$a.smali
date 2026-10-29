.class final Lj7/j$h$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lj7/j;


# direct methods
.method constructor <init>(Lj7/j;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lj7/j$h$b$a;->s:Lj7/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lj7/j$h$b$a;

    iget-object p0, p0, Lj7/j$h$b$a;->s:Lj7/j;

    invoke-direct {v0, p0, p2}, Lj7/j$h$b$a;-><init>(Lj7/j;Lm8/e;)V

    iput-object p1, v0, Lj7/j$h$b$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$h$b$a;->s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$h$b$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_22

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_51

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    iget-object v1, p0, Lj7/j$h$b$a;->r:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_41

    :cond_22
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$h$b$a;->r:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    iget-object p1, p0, Lj7/j$h$b$a;->s:Lj7/j;

    invoke-static {p1}, Lj7/j;->z(Lj7/j;)LD6/f;

    move-result-object p1

    check-cast p1, LD6/e;

    invoke-interface {p1}, LD6/e;->t()LI8/f;

    move-result-object p1

    iput-object v1, p0, Lj7/j$h$b$a;->r:Ljava/lang/Object;

    iput v3, p0, Lj7/j$h$b$a;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_41

    goto :goto_50

    :cond_41
    :goto_41
    check-cast p1, Ljava/util/List;

    iget-object v3, p0, Lj7/j$h$b$a;->s:Lj7/j;

    const/4 v4, 0x0

    iput-object v4, p0, Lj7/j$h$b$a;->r:Ljava/lang/Object;

    iput v2, p0, Lj7/j$h$b$a;->q:I

    invoke-static {v3, p1, v1, p0}, Lj7/j;->M(Lj7/j;Ljava/util/List;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_51

    :goto_50
    return-object v0

    :cond_51
    :goto_51
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lj7/j$h$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$h$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$h$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
