.class final LI8/N$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/N;->a(LI8/O;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field synthetic s:I

.field final synthetic t:LI8/N;


# direct methods
.method constructor <init>(LI8/N;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LI8/N$a;->t:LI8/N;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LI8/g;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LI8/N$a;->s(LI8/g;ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/N$a;->q:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_3c

    if-eq v1, v6, :cond_38

    if-eq v1, v5, :cond_30

    if-eq v1, v4, :cond_28

    if-eq v1, v3, :cond_20

    if-ne v1, v2, :cond_18

    goto :goto_38

    :cond_18
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_20
    iget-object v1, p0, LI8/N$a;->r:Ljava/lang/Object;

    check-cast v1, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_8e

    :cond_28
    iget-object v1, p0, LI8/N$a;->r:Ljava/lang/Object;

    check-cast v1, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_7d

    :cond_30
    iget-object v1, p0, LI8/N$a;->r:Ljava/lang/Object;

    check-cast v1, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_64

    :cond_38
    :goto_38
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_9c

    :cond_3c
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/N$a;->r:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LI8/g;

    iget p1, p0, LI8/N$a;->s:I

    if-lez p1, :cond_53

    sget-object p1, LI8/I;->q:LI8/I;

    iput v6, p0, LI8/N$a;->q:I

    invoke-interface {v1, p1, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_9c

    goto :goto_9b

    :cond_53
    iget-object p1, p0, LI8/N$a;->t:LI8/N;

    invoke-static {p1}, LI8/N;->c(LI8/N;)J

    move-result-wide v6

    iput-object v1, p0, LI8/N$a;->r:Ljava/lang/Object;

    iput v5, p0, LI8/N$a;->q:I

    invoke-static {v6, v7, p0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_64

    goto :goto_9b

    :cond_64
    :goto_64
    iget-object p1, p0, LI8/N$a;->t:LI8/N;

    invoke-static {p1}, LI8/N;->b(LI8/N;)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long p1, v5, v7

    if-lez p1, :cond_8e

    sget-object p1, LI8/I;->r:LI8/I;

    iput-object v1, p0, LI8/N$a;->r:Ljava/lang/Object;

    iput v4, p0, LI8/N$a;->q:I

    invoke-interface {v1, p1, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7d

    goto :goto_9b

    :cond_7d
    :goto_7d
    iget-object p1, p0, LI8/N$a;->t:LI8/N;

    invoke-static {p1}, LI8/N;->b(LI8/N;)J

    move-result-wide v4

    iput-object v1, p0, LI8/N$a;->r:Ljava/lang/Object;

    iput v3, p0, LI8/N$a;->q:I

    invoke-static {v4, v5, p0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8e

    goto :goto_9b

    :cond_8e
    :goto_8e
    sget-object p1, LI8/I;->s:LI8/I;

    const/4 v3, 0x0

    iput-object v3, p0, LI8/N$a;->r:Ljava/lang/Object;

    iput v2, p0, LI8/N$a;->q:I

    invoke-interface {v1, p1, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_9c

    :goto_9b
    return-object v0

    :cond_9c
    :goto_9c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LI8/g;ILm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LI8/N$a;

    iget-object p0, p0, LI8/N$a;->t:LI8/N;

    invoke-direct {v0, p0, p3}, LI8/N$a;-><init>(LI8/N;Lm8/e;)V

    iput-object p1, v0, LI8/N$a;->r:Ljava/lang/Object;

    iput p2, v0, LI8/N$a;->s:I

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LI8/N$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
