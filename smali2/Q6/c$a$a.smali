.class final LQ6/c$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ6/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Landroid/view/View;

.field final synthetic t:Lb2/c;

.field final synthetic u:LK7/b;

.field final synthetic v:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic w:Landroidx/lifecycle/x;

.field final synthetic x:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic y:LP6/e;

.field final synthetic z:Lp6/a;


# direct methods
.method constructor <init>(Landroid/view/View;Lb2/c;LK7/b;Landroidx/recyclerview/widget/RecyclerView;Landroidx/lifecycle/x;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V
    .registers 10

    iput-object p1, p0, LQ6/c$a$a;->s:Landroid/view/View;

    iput-object p2, p0, LQ6/c$a$a;->t:Lb2/c;

    iput-object p3, p0, LQ6/c$a$a;->u:LK7/b;

    iput-object p4, p0, LQ6/c$a$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p5, p0, LQ6/c$a$a;->w:Landroidx/lifecycle/x;

    iput-object p6, p0, LQ6/c$a$a;->x:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p7, p0, LQ6/c$a$a;->y:LP6/e;

    iput-object p8, p0, LQ6/c$a$a;->z:Lp6/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 13

    new-instance v0, LQ6/c$a$a;

    iget-object v1, p0, LQ6/c$a$a;->s:Landroid/view/View;

    iget-object v2, p0, LQ6/c$a$a;->t:Lb2/c;

    iget-object v3, p0, LQ6/c$a$a;->u:LK7/b;

    iget-object v4, p0, LQ6/c$a$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, p0, LQ6/c$a$a;->w:Landroidx/lifecycle/x;

    iget-object v6, p0, LQ6/c$a$a;->x:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, p0, LQ6/c$a$a;->y:LP6/e;

    iget-object v8, p0, LQ6/c$a$a;->z:Lp6/a;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, LQ6/c$a$a;-><init>(Landroid/view/View;Lb2/c;LK7/b;Landroidx/recyclerview/widget/RecyclerView;Landroidx/lifecycle/x;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V

    iput-object p1, v0, LQ6/c$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LQ6/c$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LQ6/c$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LQ6/c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LQ6/c$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LQ6/c$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQ6/c$a$a;->r:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, LF8/L;

    new-instance v4, LQ6/c$a$a$a;

    iget-object v5, p0, LQ6/c$a$a;->t:Lb2/c;

    iget-object v6, p0, LQ6/c$a$a;->x:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, p0, LQ6/c$a$a;->y:LP6/e;

    iget-object v8, p0, LQ6/c$a$a;->z:Lp6/a;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, LQ6/c$a$a$a;-><init>(Lb2/c;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v6, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p1, LY1/c;->a:LY1/c;

    iget-object v5, p0, LQ6/c$a$a;->s:Landroid/view/View;

    iget-object v6, p0, LQ6/c$a$a;->t:Lb2/c;

    iget-object v7, p0, LQ6/c$a$a;->u:LK7/b;

    iget-object v8, p0, LQ6/c$a$a;->v:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, p0, LQ6/c$a$a;->w:Landroidx/lifecycle/x;

    iput v2, p0, LQ6/c$a$a;->q:I

    move-object v10, p0

    move-object v4, v3

    move-object v3, p1

    invoke-virtual/range {v3 .. v10}, LY1/c;->h(LF8/L;Landroid/view/View;Lb2/c;Lz3/a;Landroidx/recyclerview/widget/RecyclerView;Landroidx/lifecycle/x;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4d

    return-object v0

    :cond_4d
    :goto_4d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
