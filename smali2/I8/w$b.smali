.class final LI8/w$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/w;->e(LF8/L;Lm8/i;LI8/f;LF8/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LI8/f;

.field final synthetic t:LF8/v;


# direct methods
.method constructor <init>(LI8/f;LF8/v;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LI8/w$b;->s:LI8/f;

    iput-object p2, p0, LI8/w$b;->t:LF8/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, LI8/w$b;

    iget-object v1, p0, LI8/w$b;->s:LI8/f;

    iget-object p0, p0, LI8/w$b;->t:LF8/v;

    invoke-direct {v0, v1, p0, p2}, LI8/w$b;-><init>(LI8/f;LF8/v;Lm8/e;)V

    iput-object p1, v0, LI8/w$b;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LI8/w$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LI8/w$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LI8/w$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LI8/w$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/w$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_19

    if-ne v1, v2, :cond_11

    :try_start_b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_b .. :try_end_e} :catchall_f

    goto :goto_37

    :catchall_f
    move-exception p1

    goto :goto_3a

    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/w$b;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    :try_start_20
    new-instance v1, Lkotlin/jvm/internal/E;

    invoke-direct {v1}, Lkotlin/jvm/internal/E;-><init>()V

    iget-object v3, p0, LI8/w$b;->s:LI8/f;

    new-instance v4, LI8/w$b$a;

    iget-object v5, p0, LI8/w$b;->t:LF8/v;

    invoke-direct {v4, v1, p1, v5}, LI8/w$b$a;-><init>(Lkotlin/jvm/internal/E;LF8/L;LF8/v;)V

    iput v2, p0, LI8/w$b;->q:I

    invoke-interface {v3, v4, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_34
    .catchall {:try_start_20 .. :try_end_34} :catchall_f

    if-ne p0, v0, :cond_37

    return-object v0

    :cond_37
    :goto_37
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_3a
    iget-object p0, p0, LI8/w$b;->t:LF8/v;

    invoke-interface {p0, p1}, LF8/v;->A0(Ljava/lang/Throwable;)Z

    throw p1
.end method
