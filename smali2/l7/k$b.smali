.class final Ll7/k$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/k;->T0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Ll7/k;


# direct methods
.method constructor <init>(Ll7/k;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ll7/k$b;->r:Ll7/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Ll7/k;)V
    .registers 1

    invoke-static {p0}, Ll7/k$b;->u(Ll7/k;)V

    return-void
.end method

.method private static final u(Ll7/k;)V
    .registers 9

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v3

    new-instance v5, Ll7/k$b$a;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Ll7/k$b$a;-><init>(Ll7/k;Lm8/e;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Ll7/k$b;

    iget-object p0, p0, Ll7/k$b;->r:Ll7/k;

    invoke-direct {p1, p0, p2}, Ll7/k$b;-><init>(Ll7/k;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ll7/k$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ll7/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ll7/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ll7/k$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ll7/k$b;->q:I

    if-nez v0, :cond_40

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ll7/k$b;->r:Ll7/k;

    invoke-virtual {p1}, Ll7/k;->G0()Lo7/b;

    move-result-object v0

    iget-object v1, p0, Ll7/k$b;->r:Ll7/k;

    invoke-virtual {v1}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo7/b;->g(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll7/k;->r0(Ll7/k;Ljava/util/List;)V

    iget-object p1, p0, Ll7/k$b;->r:Ll7/k;

    invoke-static {p1}, Ll7/k;->n0(Ll7/k;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_3d

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_33

    goto :goto_3d

    :cond_33
    iget-object p0, p0, Ll7/k$b;->r:Ll7/k;

    new-instance p1, Ll7/l;

    invoke-direct {p1, p0}, Ll7/l;-><init>(Ll7/k;)V

    invoke-static {p0, p1}, Ll7/k;->t0(Ll7/k;Ljava/lang/Runnable;)V

    :cond_3d
    :goto_3d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_40
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
