.class final LL7/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/a;->b(Landroid/content/Context;Landroid/view/ViewGroup;Lr2/c;Landroidx/lifecycle/x;Landroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lr2/c;

.field final synthetic s:Landroidx/lifecycle/x;

.field final synthetic t:Landroid/widget/ImageView;

.field final synthetic u:Landroid/widget/ImageView;

.field final synthetic v:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Lr2/c;Landroidx/lifecycle/x;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lm8/e;)V
    .registers 7

    iput-object p1, p0, LL7/a$a;->r:Lr2/c;

    iput-object p2, p0, LL7/a$a;->s:Landroidx/lifecycle/x;

    iput-object p3, p0, LL7/a$a;->t:Landroid/widget/ImageView;

    iput-object p4, p0, LL7/a$a;->u:Landroid/widget/ImageView;

    iput-object p5, p0, LL7/a$a;->v:Landroid/widget/ImageView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, LL7/a$a;

    iget-object v1, p0, LL7/a$a;->r:Lr2/c;

    iget-object v2, p0, LL7/a$a;->s:Landroidx/lifecycle/x;

    iget-object v3, p0, LL7/a$a;->t:Landroid/widget/ImageView;

    iget-object v4, p0, LL7/a$a;->u:Landroid/widget/ImageView;

    iget-object v5, p0, LL7/a$a;->v:Landroid/widget/ImageView;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LL7/a$a;-><init>(Lr2/c;Landroidx/lifecycle/x;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LL7/a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LL7/a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LL7/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LL7/a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LL7/a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_41

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LL7/a$a;->r:Lr2/c;

    invoke-virtual {p1}, Lr2/c;->A()LI8/f;

    move-result-object p1

    iget-object v1, p0, LL7/a$a;->s:Landroidx/lifecycle/x;

    invoke-interface {v1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object v1

    sget-object v3, Landroidx/lifecycle/q$b;->u:Landroidx/lifecycle/q$b;

    invoke-static {p1, v1, v3}, Landroidx/lifecycle/k;->a(LI8/f;Landroidx/lifecycle/q;Landroidx/lifecycle/q$b;)LI8/f;

    move-result-object p1

    new-instance v1, LL7/a$a$a;

    iget-object v3, p0, LL7/a$a;->t:Landroid/widget/ImageView;

    iget-object v4, p0, LL7/a$a;->u:Landroid/widget/ImageView;

    iget-object v5, p0, LL7/a$a;->v:Landroid/widget/ImageView;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, LL7/a$a$a;-><init>(Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lm8/e;)V

    iput v2, p0, LL7/a$a;->q:I

    invoke-static {p1, v1, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_41

    return-object v0

    :cond_41
    :goto_41
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
