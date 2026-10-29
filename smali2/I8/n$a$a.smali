.class final LI8/n$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LI8/g;

.field final synthetic s:Lkotlin/jvm/internal/E;


# direct methods
.method constructor <init>(LI8/g;Lkotlin/jvm/internal/E;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LI8/n$a$a;->r:LI8/g;

    iput-object p2, p0, LI8/n$a$a;->s:Lkotlin/jvm/internal/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LI8/n$a$a;

    iget-object v1, p0, LI8/n$a$a;->r:LI8/g;

    iget-object p0, p0, LI8/n$a$a;->s:Lkotlin/jvm/internal/E;

    invoke-direct {v0, v1, p0, p1}, LI8/n$a$a;-><init>(LI8/g;Lkotlin/jvm/internal/E;Lm8/e;)V

    return-object v0
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Lm8/e;

    invoke-virtual {p0, p1}, LI8/n$a$a;->s(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/n$a$a;->q:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v3, :cond_10

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2f

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/n$a$a;->r:LI8/g;

    sget-object v1, LJ8/t;->a:LK8/D;

    iget-object v4, p0, LI8/n$a$a;->s:Lkotlin/jvm/internal/E;

    iget-object v4, v4, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-ne v4, v1, :cond_26

    move-object v4, v2

    :cond_26
    iput v3, p0, LI8/n$a$a;->q:I

    invoke-interface {p1, v4, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2f

    return-object v0

    :cond_2f
    :goto_2f
    iget-object p0, p0, LI8/n$a$a;->s:Lkotlin/jvm/internal/E;

    iput-object v2, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, LI8/n$a$a;->create(Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LI8/n$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LI8/n$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
