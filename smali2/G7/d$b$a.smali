.class final LG7/d$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Z

.field final synthetic t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field final synthetic u:LJ7/i;

.field final synthetic v:LS1/a;


# direct methods
.method constructor <init>(ZLcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Lm8/e;)V
    .registers 6

    iput-boolean p1, p0, LG7/d$b$a;->s:Z

    iput-object p2, p0, LG7/d$b$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p3, p0, LG7/d$b$a;->u:LJ7/i;

    iput-object p4, p0, LG7/d$b$a;->v:LS1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LG7/d$b$a;

    iget-boolean v1, p0, LG7/d$b$a;->s:Z

    iget-object v2, p0, LG7/d$b$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v3, p0, LG7/d$b$a;->u:LJ7/i;

    iget-object v4, p0, LG7/d$b$a;->v:LS1/a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LG7/d$b$a;-><init>(ZLcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Lm8/e;)V

    iput-object p1, v0, LG7/d$b$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/d$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/d$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/d$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/d$b$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LG7/d$b$a;->q:I

    if-nez v0, :cond_45

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/d$b$a;->r:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LF8/L;

    new-instance v3, LG7/d$b$a$a;

    iget-object p1, p0, LG7/d$b$a;->u:LJ7/i;

    iget-object v1, p0, LG7/d$b$a;->v:LS1/a;

    const/4 v6, 0x0

    invoke-direct {v3, p1, v1, v6}, LG7/d$b$a$a;-><init>(LJ7/i;LS1/a;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-boolean p1, p0, LG7/d$b$a;->s:Z

    if-eqz p1, :cond_30

    sget-object p1, LG7/d;->a:LG7/d;

    iget-object v1, p0, LG7/d$b$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v2, p0, LG7/d$b$a;->u:LJ7/i;

    iget-object p0, p0, LG7/d$b$a;->v:LS1/a;

    invoke-static {p1, v0, v1, v2, p0}, LG7/d;->e(LG7/d;LF8/L;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;)LF8/x0;

    goto :goto_42

    :cond_30
    new-instance v3, LG7/d$b$a$b;

    iget-object p1, p0, LG7/d$b$a;->u:LJ7/i;

    iget-object v1, p0, LG7/d$b$a;->t:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object p0, p0, LG7/d$b$a;->v:LS1/a;

    invoke-direct {v3, p1, v1, p0, v6}, LG7/d$b$a$b;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :goto_42
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_45
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
