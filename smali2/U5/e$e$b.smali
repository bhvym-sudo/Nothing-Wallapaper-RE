.class final LU5/e$e$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e$e;->x(LH8/t;LU5/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LH8/t;

.field final synthetic s:LU5/e;


# direct methods
.method constructor <init>(LH8/t;LU5/e;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LU5/e$e$b;->r:LH8/t;

    iput-object p2, p0, LU5/e$e$b;->s:LU5/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LU5/e$e$b;

    iget-object v0, p0, LU5/e$e$b;->r:LH8/t;

    iget-object p0, p0, LU5/e$e$b;->s:LU5/e;

    invoke-direct {p1, v0, p0, p2}, LU5/e$e$b;-><init>(LH8/t;LU5/e;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LU5/e$e$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LU5/e$e$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LU5/e$e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LU5/e$e$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LU5/e$e$b;->q:I

    if-nez v0, :cond_18

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/e$e$b;->r:LH8/t;

    iget-object p0, p0, LU5/e$e$b;->s:LU5/e;

    invoke-static {p0}, LU5/e;->L(LU5/e;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p0}, LH8/w;->p(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_18
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
