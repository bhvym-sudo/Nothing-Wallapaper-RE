.class final LG7/d$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Landroidx/lifecycle/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Landroidx/lifecycle/x;

.field final synthetic s:Z

.field final synthetic t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field final synthetic u:LJ7/i;

.field final synthetic v:LS1/a;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;ZLcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Lm8/e;)V
    .registers 7

    iput-object p1, p0, LG7/d$b;->r:Landroidx/lifecycle/x;

    iput-boolean p2, p0, LG7/d$b;->s:Z

    iput-object p3, p0, LG7/d$b;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p4, p0, LG7/d$b;->u:LJ7/i;

    iput-object p5, p0, LG7/d$b;->v:LS1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, LG7/d$b;

    iget-object v1, p0, LG7/d$b;->r:Landroidx/lifecycle/x;

    iget-boolean v2, p0, LG7/d$b;->s:Z

    iget-object v3, p0, LG7/d$b;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v4, p0, LG7/d$b;->u:LJ7/i;

    iget-object v5, p0, LG7/d$b;->v:LS1/a;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LG7/d$b;-><init>(Landroidx/lifecycle/x;ZLcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/d$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/d$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/d$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/d$b;->q:I

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

    iget-object p1, p0, LG7/d$b;->r:Landroidx/lifecycle/x;

    sget-object v1, Landroidx/lifecycle/q$b;->t:Landroidx/lifecycle/q$b;

    new-instance v3, LG7/d$b$a;

    iget-boolean v4, p0, LG7/d$b;->s:Z

    iget-object v5, p0, LG7/d$b;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v6, p0, LG7/d$b;->u:LJ7/i;

    iget-object v7, p0, LG7/d$b;->v:LS1/a;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, LG7/d$b$a;-><init>(ZLcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Lm8/e;)V

    iput v2, p0, LG7/d$b;->q:I

    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/N;->b(Landroidx/lifecycle/x;Landroidx/lifecycle/q$b;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_35

    return-object v0

    :cond_35
    :goto_35
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
