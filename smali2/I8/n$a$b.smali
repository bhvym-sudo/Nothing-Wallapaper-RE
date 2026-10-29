.class final LI8/n$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:I

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:Lkotlin/jvm/internal/E;

.field final synthetic u:LI8/g;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/E;LI8/g;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LI8/n$a$b;->t:Lkotlin/jvm/internal/E;

    iput-object p2, p0, LI8/n$a$b;->u:LI8/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, LI8/n$a$b;

    iget-object v1, p0, LI8/n$a$b;->t:Lkotlin/jvm/internal/E;

    iget-object p0, p0, LI8/n$a$b;->u:LI8/g;

    invoke-direct {v0, v1, p0, p2}, LI8/n$a$b;-><init>(Lkotlin/jvm/internal/E;LI8/g;Lm8/e;)V

    iput-object p1, v0, LI8/n$a$b;->s:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LH8/k;

    invoke-virtual {p1}, LH8/k;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LI8/n$a$b;->s(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/n$a$b;->r:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object p0, p0, LI8/n$a$b;->q:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/E;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4f

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/n$a$b;->s:Ljava/lang/Object;

    check-cast p1, LH8/k;

    invoke-virtual {p1}, LH8/k;->k()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, LI8/n$a$b;->t:Lkotlin/jvm/internal/E;

    instance-of v3, p1, LH8/k$c;

    if-nez v3, :cond_2e

    iput-object p1, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    :cond_2e
    iget-object v4, p0, LI8/n$a$b;->u:LI8/g;

    if-eqz v3, :cond_56

    invoke-static {p1}, LH8/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_55

    iget-object v3, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-eqz v3, :cond_50

    sget-object v5, LJ8/t;->a:LK8/D;

    if-ne v3, v5, :cond_41

    const/4 v3, 0x0

    :cond_41
    iput-object p1, p0, LI8/n$a$b;->s:Ljava/lang/Object;

    iput-object v1, p0, LI8/n$a$b;->q:Ljava/lang/Object;

    iput v2, p0, LI8/n$a$b;->r:I

    invoke-interface {v4, v3, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4e

    return-object v0

    :cond_4e
    move-object p0, v1

    :goto_4f
    move-object v1, p0

    :cond_50
    sget-object p0, LJ8/t;->c:LK8/D;

    iput-object p0, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    goto :goto_56

    :cond_55
    throw v3

    :cond_56
    :goto_56
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p1}, LH8/k;->b(Ljava/lang/Object;)LH8/k;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LI8/n$a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LI8/n$a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LI8/n$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
