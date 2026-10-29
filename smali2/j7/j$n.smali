.class final Lj7/j$n;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->Y0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lj7/j;

.field final synthetic s:Z

.field final synthetic t:Z


# direct methods
.method constructor <init>(Lj7/j;ZZLm8/e;)V
    .registers 5

    iput-object p1, p0, Lj7/j$n;->r:Lj7/j;

    iput-boolean p2, p0, Lj7/j$n;->s:Z

    iput-boolean p3, p0, Lj7/j$n;->t:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Lj7/j$n;

    iget-object v0, p0, Lj7/j$n;->r:Lj7/j;

    iget-boolean v1, p0, Lj7/j$n;->s:Z

    iget-boolean p0, p0, Lj7/j$n;->t:Z

    invoke-direct {p1, v0, v1, p0, p2}, Lj7/j$n;-><init>(Lj7/j;ZZLm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$n;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$n;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$n;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$n;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v2, :cond_10

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_42

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$n;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->v(Lj7/j;)LJ6/e;

    move-result-object v3

    iget-boolean v4, p0, Lj7/j$n;->s:Z

    iget-boolean v5, p0, Lj7/j$n;->t:Z

    iget-object p1, p0, Lj7/j$n;->r:Lj7/j;

    invoke-virtual {p1}, Lj7/j;->u0()Lg3/x;

    move-result-object v6

    iget-object p1, p0, Lj7/j$n;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->z(Lj7/j;)LD6/f;

    move-result-object v7

    new-instance v8, Lj7/j$n$a;

    iget-object p1, p0, Lj7/j$n;->r:Lj7/j;

    invoke-direct {v8, p1}, Lj7/j$n$a;-><init>(Ljava/lang/Object;)V

    iput v2, p0, Lj7/j$n;->q:I

    move-object v9, p0

    invoke-virtual/range {v3 .. v9}, LJ6/e;->i(ZZLg3/x;LD6/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_42

    return-object v0

    :cond_42
    :goto_42
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_4f

    iget-object p0, v9, Lj7/j$n;->r:Lj7/j;

    invoke-virtual {p0}, Lj7/j;->Z()V

    :cond_4f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
