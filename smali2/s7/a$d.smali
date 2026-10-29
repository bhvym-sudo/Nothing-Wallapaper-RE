.class final Ls7/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/a;->v(Lg3/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lg3/x;

.field final synthetic s:Ls7/a;


# direct methods
.method constructor <init>(Lg3/x;Ls7/a;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Ls7/a$d;->r:Lg3/x;

    iput-object p2, p0, Ls7/a$d;->s:Ls7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Ls7/a$d;

    iget-object v0, p0, Ls7/a$d;->r:Lg3/x;

    iget-object p0, p0, Ls7/a$d;->s:Ls7/a;

    invoke-direct {p1, v0, p0, p2}, Ls7/a$d;-><init>(Lg3/x;Ls7/a;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ls7/a$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ls7/a$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ls7/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ls7/a$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ls7/a$d;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_40

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    sget-object p1, Lp7/b;->s:Lp7/b$a;

    iget-object v1, p0, Ls7/a$d;->r:Lg3/x;

    iget-object v3, p0, Ls7/a$d;->s:Ls7/a;

    invoke-static {v3}, Ls7/a;->f(Ls7/a;)Landroid/app/Application;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lp7/b$a;->a(Lg3/x;Landroid/content/Context;)Lp7/b;

    move-result-object p1

    iget-object v1, p0, Ls7/a$d;->s:Ls7/a;

    invoke-static {v1}, Ls7/a;->g(Ls7/a;)Landroidx/lifecycle/Q;

    move-result-object v3

    const-string v4, "effect_actions"

    invoke-virtual {v3, v4, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1}, Ls7/a;->i(Ls7/a;)LI8/z;

    move-result-object v1

    iput v2, p0, Ls7/a$d;->q:I

    invoke-interface {v1, p1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_40

    return-object v0

    :cond_40
    :goto_40
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
