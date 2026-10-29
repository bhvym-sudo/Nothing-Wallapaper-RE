.class final LQ6/c$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ6/c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lb2/c;

.field final synthetic s:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic t:LP6/e;

.field final synthetic u:Lp6/a;


# direct methods
.method constructor <init>(Lb2/c;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LQ6/c$a$a$a;->r:Lb2/c;

    iput-object p2, p0, LQ6/c$a$a$a;->s:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, LQ6/c$a$a$a;->t:LP6/e;

    iput-object p4, p0, LQ6/c$a$a$a;->u:Lp6/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LQ6/c$a$a$a;

    iget-object v1, p0, LQ6/c$a$a$a;->r:Lb2/c;

    iget-object v2, p0, LQ6/c$a$a$a;->s:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, p0, LQ6/c$a$a$a;->t:LP6/e;

    iget-object v4, p0, LQ6/c$a$a$a;->u:Lp6/a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LQ6/c$a$a$a;-><init>(Lb2/c;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LQ6/c$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LQ6/c$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LQ6/c$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LQ6/c$a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LQ6/c$a$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_39

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQ6/c$a$a$a;->r:Lb2/c;

    invoke-virtual {p1}, Lb2/c;->s()LI8/f;

    move-result-object p1

    new-instance v1, LQ6/c$a$a$a$b;

    invoke-direct {v1, p1}, LQ6/c$a$a$a$b;-><init>(LI8/f;)V

    new-instance p1, LQ6/c$a$a$a$a;

    iget-object v3, p0, LQ6/c$a$a$a;->s:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, p0, LQ6/c$a$a$a;->t:LP6/e;

    iget-object v5, p0, LQ6/c$a$a$a;->u:Lp6/a;

    invoke-direct {p1, v3, v4, v5}, LQ6/c$a$a$a$a;-><init>(Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;)V

    iput v2, p0, LQ6/c$a$a$a;->q:I

    invoke-interface {v1, p1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_39

    return-object v0

    :cond_39
    :goto_39
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
