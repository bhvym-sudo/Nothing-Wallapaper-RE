.class final LQ6/c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ6/c;->b(Landroid/view/View;Lb2/c;Landroidx/lifecycle/x;)LY1/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroidx/lifecycle/x;

.field final synthetic s:Landroid/view/View;

.field final synthetic t:Lb2/c;

.field final synthetic u:LK7/b;

.field final synthetic v:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic w:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic x:LP6/e;

.field final synthetic y:Lp6/a;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroid/view/View;Lb2/c;LK7/b;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V
    .registers 10

    iput-object p1, p0, LQ6/c$a;->r:Landroidx/lifecycle/x;

    iput-object p2, p0, LQ6/c$a;->s:Landroid/view/View;

    iput-object p3, p0, LQ6/c$a;->t:Lb2/c;

    iput-object p4, p0, LQ6/c$a;->u:LK7/b;

    iput-object p5, p0, LQ6/c$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p6, p0, LQ6/c$a;->w:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p7, p0, LQ6/c$a;->x:LP6/e;

    iput-object p8, p0, LQ6/c$a;->y:Lp6/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 13

    new-instance v0, LQ6/c$a;

    iget-object v1, p0, LQ6/c$a;->r:Landroidx/lifecycle/x;

    iget-object v2, p0, LQ6/c$a;->s:Landroid/view/View;

    iget-object v3, p0, LQ6/c$a;->t:Lb2/c;

    iget-object v4, p0, LQ6/c$a;->u:LK7/b;

    iget-object v5, p0, LQ6/c$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, p0, LQ6/c$a;->w:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, p0, LQ6/c$a;->x:LP6/e;

    iget-object v8, p0, LQ6/c$a;->y:Lp6/a;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, LQ6/c$a;-><init>(Landroidx/lifecycle/x;Landroid/view/View;Lb2/c;LK7/b;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LQ6/c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LQ6/c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LQ6/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LQ6/c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LQ6/c$a;->q:I

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

    iget-object v8, p0, LQ6/c$a;->r:Landroidx/lifecycle/x;

    sget-object p1, Landroidx/lifecycle/q$b;->t:Landroidx/lifecycle/q$b;

    new-instance v3, LQ6/c$a$a;

    iget-object v4, p0, LQ6/c$a;->s:Landroid/view/View;

    iget-object v5, p0, LQ6/c$a;->t:Lb2/c;

    iget-object v6, p0, LQ6/c$a;->u:LK7/b;

    iget-object v7, p0, LQ6/c$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, p0, LQ6/c$a;->w:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, p0, LQ6/c$a;->x:LP6/e;

    iget-object v11, p0, LQ6/c$a;->y:Lp6/a;

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v12}, LQ6/c$a$a;-><init>(Landroid/view/View;Lb2/c;LK7/b;Landroidx/recyclerview/widget/RecyclerView;Landroidx/lifecycle/x;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V

    iput v2, p0, LQ6/c$a;->q:I

    invoke-static {v8, p1, v3, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3b

    return-object v0

    :cond_3b
    :goto_3b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
