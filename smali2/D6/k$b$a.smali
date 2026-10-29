.class final LD6/k$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/k;

.field final synthetic s:Lh8/o;


# direct methods
.method constructor <init>(LD6/k;Lh8/o;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LD6/k$b$a;->r:LD6/k;

    iput-object p2, p0, LD6/k$b$a;->s:Lh8/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LD6/k$b$a;

    iget-object v0, p0, LD6/k$b$a;->r:LD6/k;

    iget-object p0, p0, LD6/k$b$a;->s:Lh8/o;

    invoke-direct {p1, v0, p0, p2}, LD6/k$b$a;-><init>(LD6/k;Lh8/o;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/k$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/k$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/k$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/k$b$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LD6/k$b$a;->q:I

    if-nez v0, :cond_21

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/k$b$a;->r:LD6/k;

    iget-object v0, p0, LD6/k$b$a;->s:Lh8/o;

    invoke-virtual {v0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC6/d;

    iget-object p0, p0, LD6/k$b$a;->s:Lh8/o;

    invoke-virtual {p0}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC6/a;

    invoke-static {p1, v0, p0}, LD6/k;->c(LD6/k;LC6/d;LC6/a;)LC6/i;

    move-result-object p0

    return-object p0

    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
