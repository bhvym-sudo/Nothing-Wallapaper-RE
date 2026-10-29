.class public final LI8/y$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/y$b;->a(LI8/g;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;

.field final synthetic t:Lv8/s;


# direct methods
.method public constructor <init>(Lm8/e;Lv8/s;)V
    .registers 3

    iput-object p2, p0, LI8/y$b$a;->t:Lv8/s;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LI8/g;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LI8/y$b$a;->s(LI8/g;[Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/y$b$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_23

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    iget-object v1, p0, LI8/y$b$a;->r:Ljava/lang/Object;

    check-cast v1, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_4f

    :cond_23
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/y$b$a;->r:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LI8/g;

    iget-object p1, p0, LI8/y$b$a;->s:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    iget-object v4, p0, LI8/y$b$a;->t:Lv8/s;

    const/4 v5, 0x0

    aget-object v5, p1, v5

    aget-object v6, p1, v3

    aget-object v7, p1, v2

    const/4 v8, 0x3

    aget-object v8, p1, v8

    iput-object v1, p0, LI8/y$b$a;->r:Ljava/lang/Object;

    iput v3, p0, LI8/y$b$a;->q:I

    const/4 p1, 0x6

    invoke-static {p1}, Lkotlin/jvm/internal/m;->a(I)V

    move-object v9, p0

    invoke-interface/range {v4 .. v9}, Lv8/s;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p0, 0x7

    invoke-static {p0}, Lkotlin/jvm/internal/m;->a(I)V

    if-ne p1, v0, :cond_4f

    goto :goto_5a

    :cond_4f
    :goto_4f
    const/4 p0, 0x0

    iput-object p0, v9, LI8/y$b$a;->r:Ljava/lang/Object;

    iput v2, v9, LI8/y$b$a;->q:I

    invoke-interface {v1, p1, v9}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_5b

    :goto_5a
    return-object v0

    :cond_5b
    :goto_5b
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LI8/g;[Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LI8/y$b$a;

    iget-object p0, p0, LI8/y$b$a;->t:Lv8/s;

    invoke-direct {v0, p3, p0}, LI8/y$b$a;-><init>(Lm8/e;Lv8/s;)V

    iput-object p1, v0, LI8/y$b$a;->r:Ljava/lang/Object;

    iput-object p2, v0, LI8/y$b$a;->s:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LI8/y$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
