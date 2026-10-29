.class final Lj7/j$h$b$b;
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

    iput-object p1, p0, Lj7/j$h$b$b;->s:Lj7/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lj7/j$h$b$b;

    iget-object p0, p0, Lj7/j$h$b$b;->s:Lj7/j;

    invoke-direct {v0, p0, p2}, Lj7/j$h$b$b;-><init>(Lj7/j;Lm8/e;)V

    iput-object p1, v0, Lj7/j$h$b$b;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$h$b$b;->s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$h$b$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_47

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$h$b$b;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lj7/j$h$b$b;->s:Lj7/j;

    invoke-virtual {v1}, Lj7/j;->l0()Lp7/a;

    move-result-object v1

    sget-object v3, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_38

    iget-object v1, p0, Lj7/j$h$b$b;->s:Lj7/j;

    invoke-virtual {v1}, Lj7/j;->u0()Lg3/x;

    move-result-object v1

    invoke-static {v1}, LG6/e;->i(Lg3/x;)Z

    move-result v1

    if-eqz v1, :cond_47

    :cond_38
    iget-object v1, p0, Lj7/j$h$b$b;->s:Lj7/j;

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object v3

    iput v2, p0, Lj7/j$h$b$b;->q:I

    invoke-static {v1, p1, v3, p0}, Lj7/j;->M(Lj7/j;Ljava/util/List;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_47

    return-object v0

    :cond_47
    :goto_47
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lj7/j$h$b$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$h$b$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$h$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
