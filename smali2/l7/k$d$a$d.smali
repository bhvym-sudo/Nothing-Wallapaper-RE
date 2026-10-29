.class final Ll7/k$d$a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/k$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Ll7/k$d$a$d;->r:Ll7/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Ll7/k;Lm7/a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Ll7/k$d$a$d;->u(Ll7/k;Lm7/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Ll7/k;Lm7/a;)Lh8/A;
    .registers 4

    sget-object v0, Lm7/a$b;->a:Lm7/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {p0}, Ll7/k;->C0()Lcom/nothing/wallpaper/widget/ToolActionsView;

    move-result-object v0

    if-eqz v0, :cond_17

    sget-object v1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->s:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    filled-new-array {v1}, [Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->d([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V

    :cond_17
    sget-object v0, Lm7/a$a;->a:Lm7/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_26

    invoke-static {p0}, Ll7/k;->o0(Ll7/k;)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_26
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Ll7/k$d$a$d;

    iget-object p0, p0, Ll7/k$d$a$d;->r:Ll7/k;

    invoke-direct {p1, p0, p2}, Ll7/k$d$a$d;-><init>(Ll7/k;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ll7/k$d$a$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ll7/k$d$a$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ll7/k$d$a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ll7/k$d$a$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ll7/k$d$a$d;->q:I

    if-nez v0, :cond_2c

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ll7/k$d$a$d;->r:Ll7/k;

    invoke-virtual {p1}, Ll7/k;->G0()Lo7/b;

    move-result-object p1

    invoke-virtual {p1}, Lo7/b;->h()Landroidx/lifecycle/C;

    move-result-object p1

    iget-object v0, p0, Ll7/k$d$a$d;->r:Ll7/k;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object p0, p0, Ll7/k$d$a$d;->r:Ll7/k;

    new-instance v1, Ll7/m;

    invoke-direct {v1, p0}, Ll7/m;-><init>(Ll7/k;)V

    new-instance p0, Ll7/k$e;

    invoke-direct {p0, v1}, Ll7/k$e;-><init>(Lv8/l;)V

    invoke-virtual {p1, v0, p0}, Landroidx/lifecycle/C;->h(Landroidx/lifecycle/x;Landroidx/lifecycle/I;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_2c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
