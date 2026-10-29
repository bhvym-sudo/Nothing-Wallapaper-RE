.class final LW6/x$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/x;->L1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LW6/x;


# direct methods
.method constructor <init>(LW6/x;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LW6/x$e;->r:LW6/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LW6/x$e;

    iget-object p0, p0, LW6/x$e;->r:LW6/x;

    invoke-direct {p1, p0, p2}, LW6/x$e;-><init>(LW6/x;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LW6/x$e;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LW6/x$e;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LW6/x$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LW6/x$e;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LW6/x$e;->q:I

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

    iget-object p1, p0, LW6/x$e;->r:LW6/x;

    invoke-static {p1}, LW6/x;->e1(LW6/x;)La7/d;

    move-result-object p1

    iget-object v1, p0, LW6/x$e;->r:LW6/x;

    invoke-static {v1}, LW6/x;->f1(LW6/x;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, LW6/x$e;->r:LW6/x;

    invoke-static {v3}, LW6/x;->d1(LW6/x;)I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-virtual {p1, v1}, La7/d;->s0(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)LJ6/i;

    move-result-object p1

    if-eqz p1, :cond_4d

    iget-object v1, p0, LW6/x$e;->r:LW6/x;

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v3

    new-instance v4, LW6/x$e$a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, p1, v5}, LW6/x$e$a;-><init>(LW6/x;LJ6/i;Lm8/e;)V

    iput v2, p0, LW6/x$e;->q:I

    invoke-static {v3, v4, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4d

    return-object v0

    :cond_4d
    :goto_4d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
