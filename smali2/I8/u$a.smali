.class final LI8/u$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/u;->a(LI8/f;Lv8/p;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:Lv8/p;


# direct methods
.method constructor <init>(Lv8/p;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LI8/u$a;->t:Lv8/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LI8/g;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LI8/u$a;->s(LI8/g;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/u$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_22

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_45

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    iget-object v1, p0, LI8/u$a;->r:Ljava/lang/Object;

    check-cast v1, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_39

    :cond_22
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/u$a;->r:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LI8/g;

    iget-object p1, p0, LI8/u$a;->s:Ljava/lang/Object;

    iget-object v4, p0, LI8/u$a;->t:Lv8/p;

    iput-object v1, p0, LI8/u$a;->r:Ljava/lang/Object;

    iput v3, p0, LI8/u$a;->q:I

    invoke-interface {v4, p1, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_39

    goto :goto_44

    :cond_39
    :goto_39
    const/4 v3, 0x0

    iput-object v3, p0, LI8/u$a;->r:Ljava/lang/Object;

    iput v2, p0, LI8/u$a;->q:I

    invoke-interface {v1, p1, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_45

    :goto_44
    return-object v0

    :cond_45
    :goto_45
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LI8/g;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LI8/u$a;

    iget-object p0, p0, LI8/u$a;->t:Lv8/p;

    invoke-direct {v0, p0, p3}, LI8/u$a;-><init>(Lv8/p;Lm8/e;)V

    iput-object p1, v0, LI8/u$a;->r:Ljava/lang/Object;

    iput-object p2, v0, LI8/u$a;->s:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LI8/u$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
