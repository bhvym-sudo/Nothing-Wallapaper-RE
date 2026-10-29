.class final Ll7/k$d$a$b;
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

    iput-object p1, p0, Ll7/k$d$a$b;->r:Ll7/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Ll7/k$d$a$b;

    iget-object p0, p0, Ll7/k$d$a$b;->r:Ll7/k;

    invoke-direct {p1, p0, p2}, Ll7/k$d$a$b;-><init>(Ll7/k;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ll7/k$d$a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ll7/k$d$a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ll7/k$d$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ll7/k$d$a$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll7/k$d$a$b;->q:I

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

    iget-object p1, p0, Ll7/k$d$a$b;->r:Ll7/k;

    invoke-virtual {p1}, Ll7/k;->G0()Lo7/b;

    move-result-object p1

    invoke-virtual {p1}, Lo7/b;->l()LI8/z;

    move-result-object p1

    new-instance v1, Ll7/k$d$a$b$a;

    iget-object v3, p0, Ll7/k$d$a$b;->r:Ll7/k;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Ll7/k$d$a$b$a;-><init>(Ll7/k;Lm8/e;)V

    iput v2, p0, Ll7/k$d$a$b;->q:I

    invoke-static {p1, v1, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_35

    return-object v0

    :cond_35
    :goto_35
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
