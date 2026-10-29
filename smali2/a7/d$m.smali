.class final La7/d$m;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/d;->z0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:La7/d;


# direct methods
.method constructor <init>(La7/d;Lm8/e;)V
    .registers 3

    iput-object p1, p0, La7/d$m;->r:La7/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, La7/d$m;

    iget-object p0, p0, La7/d$m;->r:La7/d;

    invoke-direct {p1, p0, p2}, La7/d$m;-><init>(La7/d;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, La7/d$m;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, La7/d$m;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, La7/d$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, La7/d$m;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, La7/d$m;->q:I

    if-nez v0, :cond_31

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La7/d$m;->r:La7/d;

    invoke-static {p1}, La7/d;->p(La7/d;)Landroid/app/Application;

    move-result-object p1

    invoke-static {p1}, Li6/m;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_27

    iget-object p1, p0, La7/d$m;->r:La7/d;

    new-instance v0, La7/d$c$f;

    iget-object p0, p0, La7/d$m;->r:La7/d;

    invoke-static {p0}, La7/d;->x(La7/d;)LX6/b;

    move-result-object p0

    invoke-direct {v0, p0}, La7/d$c$f;-><init>(LX6/b;)V

    invoke-static {p1, v0}, La7/d;->m(La7/d;La7/d$c;)V

    goto :goto_2e

    :cond_27
    iget-object p0, p0, La7/d$m;->r:La7/d;

    sget-object p1, La7/d$c$g;->v:La7/d$c$g;

    invoke-static {p0, p1}, La7/d;->m(La7/d;La7/d$c;)V

    :goto_2e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_31
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
