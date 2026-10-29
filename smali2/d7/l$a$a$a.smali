.class final Ld7/l$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7/l$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lx3/b;

.field final synthetic s:Li7/d;

.field final synthetic t:Landroid/view/MenuItem;


# direct methods
.method constructor <init>(Lx3/b;Li7/d;Landroid/view/MenuItem;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Ld7/l$a$a$a;->r:Lx3/b;

    iput-object p2, p0, Ld7/l$a$a$a;->s:Li7/d;

    iput-object p3, p0, Ld7/l$a$a$a;->t:Landroid/view/MenuItem;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Ld7/l$a$a$a;

    iget-object v0, p0, Ld7/l$a$a$a;->r:Lx3/b;

    iget-object v1, p0, Ld7/l$a$a$a;->s:Li7/d;

    iget-object p0, p0, Ld7/l$a$a$a;->t:Landroid/view/MenuItem;

    invoke-direct {p1, v0, v1, p0, p2}, Ld7/l$a$a$a;-><init>(Lx3/b;Li7/d;Landroid/view/MenuItem;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ld7/l$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ld7/l$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ld7/l$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ld7/l$a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ld7/l$a$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_44

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ld7/l$a$a$a;->r:Lx3/b;

    invoke-virtual {p1}, Lx3/b;->k()LI8/O;

    move-result-object p1

    iget-object v1, p0, Ld7/l$a$a$a;->s:Li7/d;

    invoke-virtual {v1}, Li7/d;->n()LI8/f;

    move-result-object v1

    new-instance v3, Ld7/l$a$a$a$a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ld7/l$a$a$a$a;-><init>(Lm8/e;)V

    invoke-static {p1, v1, v3}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    invoke-static {p1}, LI8/h;->o(LI8/f;)LI8/f;

    move-result-object p1

    new-instance v1, Ld7/l$a$a$a$b;

    iget-object v3, p0, Ld7/l$a$a$a;->t:Landroid/view/MenuItem;

    invoke-direct {v1, v3}, Ld7/l$a$a$a$b;-><init>(Landroid/view/MenuItem;)V

    iput v2, p0, Ld7/l$a$a$a;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_44

    return-object v0

    :cond_44
    :goto_44
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
