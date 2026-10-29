.class final LM7/c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM7/c;->e(Landroid/content/Context;Landroid/view/ViewGroup;ILandroidx/lifecycle/x;Lw7/a;)Landroid/widget/LinearLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroidx/lifecycle/x;

.field final synthetic s:LI8/f;

.field final synthetic t:Landroid/widget/LinearLayout;

.field final synthetic u:Landroid/content/Context;

.field final synthetic v:Lw7/a;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;LI8/f;Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;Lm8/e;)V
    .registers 7

    iput-object p1, p0, LM7/c$a;->r:Landroidx/lifecycle/x;

    iput-object p2, p0, LM7/c$a;->s:LI8/f;

    iput-object p3, p0, LM7/c$a;->t:Landroid/widget/LinearLayout;

    iput-object p4, p0, LM7/c$a;->u:Landroid/content/Context;

    iput-object p5, p0, LM7/c$a;->v:Lw7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, LM7/c$a;

    iget-object v1, p0, LM7/c$a;->r:Landroidx/lifecycle/x;

    iget-object v2, p0, LM7/c$a;->s:LI8/f;

    iget-object v3, p0, LM7/c$a;->t:Landroid/widget/LinearLayout;

    iget-object v4, p0, LM7/c$a;->u:Landroid/content/Context;

    iget-object v5, p0, LM7/c$a;->v:Lw7/a;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LM7/c$a;-><init>(Landroidx/lifecycle/x;LI8/f;Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LM7/c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LM7/c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LM7/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LM7/c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM7/c$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_35

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM7/c$a;->r:Landroidx/lifecycle/x;

    sget-object v1, Landroidx/lifecycle/q$b;->t:Landroidx/lifecycle/q$b;

    new-instance v3, LM7/c$a$a;

    iget-object v4, p0, LM7/c$a;->s:LI8/f;

    iget-object v5, p0, LM7/c$a;->t:Landroid/widget/LinearLayout;

    iget-object v6, p0, LM7/c$a;->u:Landroid/content/Context;

    iget-object v7, p0, LM7/c$a;->v:Lw7/a;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, LM7/c$a$a;-><init>(LI8/f;Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;Lm8/e;)V

    iput v2, p0, LM7/c$a;->q:I

    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_35

    return-object v0

    :cond_35
    :goto_35
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
