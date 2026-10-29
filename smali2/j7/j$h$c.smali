.class final Lj7/j$h$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lj7/j;


# direct methods
.method constructor <init>(Lj7/j;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lj7/j$h$c;->s:Lj7/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lj7/j$h$c;

    iget-object p0, p0, Lj7/j$h$c;->s:Lj7/j;

    invoke-direct {v0, p0, p2}, Lj7/j$h$c;-><init>(Lj7/j;Lm8/e;)V

    iput-object p1, v0, Lj7/j$h$c;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$h$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$h$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$h$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$h$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_3b

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$h$c;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    iget-object v1, p0, Lj7/j$h$c;->s:Lj7/j;

    invoke-static {v1}, Lj7/j;->z(Lj7/j;)LD6/f;

    move-result-object v1

    check-cast v1, LD6/e;

    invoke-interface {v1}, LD6/e;->t()LI8/f;

    move-result-object v1

    new-instance v3, Lj7/j$h$c$a;

    iget-object v4, p0, Lj7/j$h$c;->s:Lj7/j;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Lj7/j$h$c$a;-><init>(Lj7/j;LF8/L;Lm8/e;)V

    iput v2, p0, Lj7/j$h$c;->q:I

    invoke-static {v1, v3, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3b

    return-object v0

    :cond_3b
    :goto_3b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
