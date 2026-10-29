.class final LJ8/i$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8/i$a$a;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LJ8/i;

.field final synthetic s:LI8/g;

.field final synthetic t:Ljava/lang/Object;


# direct methods
.method constructor <init>(LJ8/i;LI8/g;Ljava/lang/Object;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LJ8/i$a$a$a;->r:LJ8/i;

    iput-object p2, p0, LJ8/i$a$a$a;->s:LI8/g;

    iput-object p3, p0, LJ8/i$a$a$a;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LJ8/i$a$a$a;

    iget-object v0, p0, LJ8/i$a$a$a;->r:LJ8/i;

    iget-object v1, p0, LJ8/i$a$a$a;->s:LI8/g;

    iget-object p0, p0, LJ8/i$a$a$a;->t:Ljava/lang/Object;

    invoke-direct {p1, v0, v1, p0, p2}, LJ8/i$a$a$a;-><init>(LJ8/i;LI8/g;Ljava/lang/Object;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LJ8/i$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LJ8/i$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LJ8/i$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LJ8/i$a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ8/i$a$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ8/i$a$a$a;->r:LJ8/i;

    invoke-static {p1}, LJ8/i;->u(LJ8/i;)Lv8/q;

    move-result-object p1

    iget-object v1, p0, LJ8/i$a$a$a;->s:LI8/g;

    iget-object v3, p0, LJ8/i$a$a$a;->t:Ljava/lang/Object;

    iput v2, p0, LJ8/i$a$a$a;->q:I

    invoke-interface {p1, v1, v3, p0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
