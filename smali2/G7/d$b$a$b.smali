.class final LG7/d$b$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/d$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LJ7/i;

.field final synthetic s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field final synthetic t:LS1/a;


# direct methods
.method constructor <init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LG7/d$b$a$b;->r:LJ7/i;

    iput-object p2, p0, LG7/d$b$a$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p3, p0, LG7/d$b$a$b;->t:LS1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static final synthetic s(Ljava/util/List;ILm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LG7/d$b$a$b;->u(Ljava/util/List;ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic u(Ljava/util/List;ILm8/e;)Ljava/lang/Object;
    .registers 3

    new-instance p2, Lh8/o;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LG7/d$b$a$b;

    iget-object v0, p0, LG7/d$b$a$b;->r:LJ7/i;

    iget-object v1, p0, LG7/d$b$a$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object p0, p0, LG7/d$b$a$b;->t:LS1/a;

    invoke-direct {p1, v0, v1, p0, p2}, LG7/d$b$a$b;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/d$b$a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/d$b$a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/d$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/d$b$a$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/d$b$a$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/d$b$a$b;->r:LJ7/i;

    invoke-virtual {p1}, LJ7/i;->E()LI8/O;

    move-result-object p1

    iget-object v1, p0, LG7/d$b$a$b;->r:LJ7/i;

    invoke-virtual {v1}, LJ7/i;->X()LI8/f;

    move-result-object v1

    sget-object v3, LG7/d$b$a$b$a;->x:LG7/d$b$a$b$a;

    invoke-static {p1, v1, v3}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    new-instance v1, LG7/d$b$a$b$b;

    iget-object v3, p0, LG7/d$b$a$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iget-object v4, p0, LG7/d$b$a$b;->t:LS1/a;

    invoke-direct {v1, v3, v4}, LG7/d$b$a$b$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;)V

    iput v2, p0, LG7/d$b$a$b;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3e

    return-object v0

    :cond_3e
    :goto_3e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
