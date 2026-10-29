.class final La7/d$k$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:La7/d;

.field final synthetic s:Z

.field final synthetic t:Ljava/lang/String;


# direct methods
.method constructor <init>(La7/d;ZLjava/lang/String;Lm8/e;)V
    .registers 5

    iput-object p1, p0, La7/d$k$a;->r:La7/d;

    iput-boolean p2, p0, La7/d$k$a;->s:Z

    iput-object p3, p0, La7/d$k$a;->t:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, La7/d$k$a;

    iget-object v0, p0, La7/d$k$a;->r:La7/d;

    iget-boolean v1, p0, La7/d$k$a;->s:Z

    iget-object p0, p0, La7/d$k$a;->t:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p0, p2}, La7/d$k$a;-><init>(La7/d;ZLjava/lang/String;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, La7/d$k$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, La7/d$k$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, La7/d$k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, La7/d$k$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La7/d$k$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_33

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La7/d$k$a;->r:La7/d;

    invoke-static {p1}, La7/d;->y(La7/d;)LV6/a;

    move-result-object p1

    iget-object v1, p0, La7/d$k$a;->r:La7/d;

    invoke-static {v1}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object v1

    iget-boolean v3, p0, La7/d$k$a;->s:Z

    iget-object v4, p0, La7/d$k$a;->t:Ljava/lang/String;

    iput v2, p0, La7/d$k$a;->q:I

    invoke-virtual {p1, v1, v3, v4, p0}, LV6/a;->h(Landroid/content/Context;ZLjava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_33

    return-object v0

    :cond_33
    :goto_33
    check-cast p1, LX6/b;

    iget-object v0, p0, La7/d$k$a;->r:La7/d;

    invoke-static {v0, p1}, La7/d;->B(La7/d;LX6/b;)V

    iget-object p0, p0, La7/d$k$a;->r:La7/d;

    new-instance v0, La7/d$c$f;

    invoke-direct {v0, p1}, La7/d$c$f;-><init>(LX6/b;)V

    invoke-static {p0, v0}, La7/d;->m(La7/d;La7/d$c;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
