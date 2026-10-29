.class final Ld7/c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7/c;->b(Landroid/view/View;Landroidx/lifecycle/x;Ljava/util/List;Lv8/a;)LF8/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroidx/lifecycle/x;

.field final synthetic s:Landroid/widget/FrameLayout;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroid/widget/FrameLayout;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Ld7/c$a;->r:Landroidx/lifecycle/x;

    iput-object p2, p0, Ld7/c$a;->s:Landroid/widget/FrameLayout;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Landroid/view/View;)Lh8/o;
    .registers 1

    invoke-static {p0}, Ld7/c$a;->u(Landroid/view/View;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Landroid/view/View;)Lh8/o;
    .registers 4

    new-instance v0, Lh8/o;

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lg3/f;

    if-eqz v2, :cond_d

    check-cast v1, Lg3/f;

    goto :goto_e

    :cond_d
    const/4 v1, 0x0

    :goto_e
    invoke-direct {v0, p0, v1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Ld7/c$a;

    iget-object v0, p0, Ld7/c$a;->r:Landroidx/lifecycle/x;

    iget-object p0, p0, Ld7/c$a;->s:Landroid/widget/FrameLayout;

    invoke-direct {p1, v0, p0, p2}, Ld7/c$a;-><init>(Landroidx/lifecycle/x;Landroid/widget/FrameLayout;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ld7/c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ld7/c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ld7/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ld7/c$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ld7/c$a;->q:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v3, :cond_10

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ld7/c$a;->r:Landroidx/lifecycle/x;

    sget-object v1, Landroidx/lifecycle/q$b;->t:Landroidx/lifecycle/q$b;

    new-instance v4, Ld7/c$a$a;

    invoke-direct {v4, v2}, Ld7/c$a$a;-><init>(Lm8/e;)V

    iput v3, p0, Ld7/c$a;->q:I

    invoke-static {p1, v1, v4, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    iget-object p1, p0, Ld7/c$a;->s:Landroid/widget/FrameLayout;

    invoke-static {p1}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object p1

    new-instance v0, Ld7/b;

    invoke-direct {v0}, Ld7/b;-><init>()V

    invoke-static {p1, v0}, LD8/k;->x(LD8/h;Lv8/l;)LD8/h;

    move-result-object p1

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_40
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_61

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-virtual {v0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/f;

    if-eqz v1, :cond_57

    invoke-interface {v1}, Lg3/f;->a()V

    :cond_57
    invoke-virtual {v0}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_40

    :cond_61
    iget-object p0, p0, Ld7/c$a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
