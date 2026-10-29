.class final LI8/w$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/w;->d(LF8/L;Lm8/i;LI8/f;LI8/z;LI8/K;Ljava/lang/Object;)LF8/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LI8/K;

.field final synthetic s:LI8/f;

.field final synthetic t:LI8/z;

.field final synthetic u:Ljava/lang/Object;


# direct methods
.method constructor <init>(LI8/K;LI8/f;LI8/z;Ljava/lang/Object;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LI8/w$a;->r:LI8/K;

    iput-object p2, p0, LI8/w$a;->s:LI8/f;

    iput-object p3, p0, LI8/w$a;->t:LI8/z;

    iput-object p4, p0, LI8/w$a;->u:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LI8/w$a;

    iget-object v1, p0, LI8/w$a;->r:LI8/K;

    iget-object v2, p0, LI8/w$a;->s:LI8/f;

    iget-object v3, p0, LI8/w$a;->t:LI8/z;

    iget-object v4, p0, LI8/w$a;->u:Ljava/lang/Object;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LI8/w$a;-><init>(LI8/K;LI8/f;LI8/z;Ljava/lang/Object;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LI8/w$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LI8/w$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LI8/w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LI8/w$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/w$a;->q:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_25

    if-eq v1, v5, :cond_21

    if-eq v1, v4, :cond_1d

    if-eq v1, v3, :cond_21

    if-ne v1, v2, :cond_15

    goto :goto_21

    :cond_15
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1d
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5c

    :cond_21
    :goto_21
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_8d

    :cond_25
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/w$a;->r:LI8/K;

    sget-object v1, LI8/K;->a:LI8/K$a;

    invoke-virtual {v1}, LI8/K$a;->c()LI8/K;

    move-result-object v6

    if-ne p1, v6, :cond_3f

    iget-object p1, p0, LI8/w$a;->s:LI8/f;

    iget-object v1, p0, LI8/w$a;->t:LI8/z;

    iput v5, p0, LI8/w$a;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_8d

    goto :goto_8c

    :cond_3f
    iget-object p1, p0, LI8/w$a;->r:LI8/K;

    invoke-virtual {v1}, LI8/K$a;->d()LI8/K;

    move-result-object v1

    const/4 v5, 0x0

    if-ne p1, v1, :cond_69

    iget-object p1, p0, LI8/w$a;->t:LI8/z;

    invoke-interface {p1}, LI8/z;->l()LI8/O;

    move-result-object p1

    new-instance v1, LI8/w$a$a;

    invoke-direct {v1, v5}, LI8/w$a$a;-><init>(Lm8/e;)V

    iput v4, p0, LI8/w$a;->q:I

    invoke-static {p1, v1, p0}, LI8/h;->y(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5c

    goto :goto_8c

    :cond_5c
    :goto_5c
    iget-object p1, p0, LI8/w$a;->s:LI8/f;

    iget-object v1, p0, LI8/w$a;->t:LI8/z;

    iput v3, p0, LI8/w$a;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_8d

    goto :goto_8c

    :cond_69
    iget-object p1, p0, LI8/w$a;->r:LI8/K;

    iget-object v1, p0, LI8/w$a;->t:LI8/z;

    invoke-interface {v1}, LI8/z;->l()LI8/O;

    move-result-object v1

    invoke-interface {p1, v1}, LI8/K;->a(LI8/O;)LI8/f;

    move-result-object p1

    invoke-static {p1}, LI8/h;->o(LI8/f;)LI8/f;

    move-result-object p1

    new-instance v1, LI8/w$a$b;

    iget-object v3, p0, LI8/w$a;->s:LI8/f;

    iget-object v4, p0, LI8/w$a;->t:LI8/z;

    iget-object v6, p0, LI8/w$a;->u:Ljava/lang/Object;

    invoke-direct {v1, v3, v4, v6, v5}, LI8/w$a$b;-><init>(LI8/f;LI8/z;Ljava/lang/Object;Lm8/e;)V

    iput v2, p0, LI8/w$a;->q:I

    invoke-static {p1, v1, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_8d

    :goto_8c
    return-object v0

    :cond_8d
    :goto_8d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
