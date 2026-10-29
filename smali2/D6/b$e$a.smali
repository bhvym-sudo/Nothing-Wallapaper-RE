.class final LD6/b$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LF8/L;

.field final synthetic t:LD6/b;


# direct methods
.method constructor <init>(LF8/L;LD6/b;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LD6/b$e$a;->s:LF8/L;

    iput-object p2, p0, LD6/b$e$a;->t:LD6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, LD6/b$e$a;

    iget-object v1, p0, LD6/b$e$a;->s:LF8/L;

    iget-object p0, p0, LD6/b$e$a;->t:LD6/b;

    invoke-direct {v0, v1, p0, p2}, LD6/b$e$a;-><init>(LF8/L;LD6/b;Lm8/e;)V

    iput-object p1, v0, LD6/b$e$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LD6/h$c;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$e$a;->s(LD6/h$c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$e$a;->q:I

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

    iget-object p1, p0, LD6/b$e$a;->r:Ljava/lang/Object;

    check-cast p1, LD6/h$c;

    invoke-virtual {p1}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_47

    iget-object v3, p0, LD6/b$e$a;->s:LF8/L;

    new-instance v6, LD6/b$e$a$a;

    iget-object v1, p0, LD6/b$e$a;->t:LD6/b;

    const/4 v4, 0x0

    invoke-direct {v6, v1, p1, v4}, LD6/b$e$a$a;-><init>(LD6/b;LD6/h$c;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object v1, p0, LD6/b$e$a;->t:LD6/b;

    invoke-static {v1}, LD6/b;->G(LD6/b;)LI8/z;

    move-result-object v1

    invoke-virtual {p1}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object p1

    iput v2, p0, LD6/b$e$a;->q:I

    invoke-interface {v1, p1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_47

    return-object v0

    :cond_47
    :goto_47
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LD6/h$c;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LD6/b$e$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$e$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
