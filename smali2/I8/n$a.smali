.class final LI8/n$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/n;->d(LI8/f;Lv8/l;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:I

.field private synthetic t:Ljava/lang/Object;

.field synthetic u:Ljava/lang/Object;

.field final synthetic v:Lv8/l;

.field final synthetic w:LI8/f;


# direct methods
.method constructor <init>(Lv8/l;LI8/f;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LI8/n$a;->v:Lv8/l;

    iput-object p2, p0, LI8/n$a;->w:LI8/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LF8/L;

    check-cast p2, LI8/g;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LI8/n$a;->s(LF8/L;LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 16

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/n$a;->s:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3e

    if-eq v1, v3, :cond_2a

    if-ne v1, v2, :cond_22

    iget-object v1, p0, LI8/n$a;->q:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/E;

    iget-object v5, p0, LI8/n$a;->u:Ljava/lang/Object;

    check-cast v5, LH8/v;

    iget-object v6, p0, LI8/n$a;->t:Ljava/lang/Object;

    check-cast v6, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    :cond_1e
    move-object v7, v6

    move-object v6, v5

    move-object v5, v1

    goto :goto_60

    :cond_22
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2a
    iget-object v1, p0, LI8/n$a;->r:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/D;

    iget-object v5, p0, LI8/n$a;->q:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/E;

    iget-object v6, p0, LI8/n$a;->u:Ljava/lang/Object;

    check-cast v6, LH8/v;

    iget-object v7, p0, LI8/n$a;->t:Ljava/lang/Object;

    check-cast v7, LI8/g;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_a2

    :cond_3e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/n$a;->t:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, LF8/L;

    iget-object p1, p0, LI8/n$a;->u:Ljava/lang/Object;

    check-cast p1, LI8/g;

    new-instance v8, LI8/n$a$c;

    iget-object v1, p0, LI8/n$a;->w:LI8/f;

    invoke-direct {v8, v1, v4}, LI8/n$a$c;-><init>(LI8/f;Lm8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LH8/r;->e(LF8/L;Lm8/i;ILv8/p;ILjava/lang/Object;)LH8/v;

    move-result-object v1

    new-instance v5, Lkotlin/jvm/internal/E;

    invoke-direct {v5}, Lkotlin/jvm/internal/E;-><init>()V

    move-object v7, p1

    move-object v6, v1

    :goto_60
    iget-object p1, v5, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object v1, LJ8/t;->c:LK8/D;

    if-eq p1, v1, :cond_e5

    new-instance v1, Lkotlin/jvm/internal/D;

    invoke-direct {v1}, Lkotlin/jvm/internal/D;-><init>()V

    iget-object p1, v5, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-eqz p1, :cond_a4

    iget-object v8, p0, LI8/n$a;->v:Lv8/l;

    sget-object v9, LJ8/t;->a:LK8/D;

    if-ne p1, v9, :cond_76

    move-object p1, v4

    :cond_76
    invoke-interface {v8, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    iput-wide v10, v1, Lkotlin/jvm/internal/D;->q:J

    const-wide/16 v12, 0x0

    cmp-long p1, v10, v12

    if-ltz p1, :cond_a9

    cmp-long p1, v10, v12

    if-nez p1, :cond_a4

    iget-object p1, v5, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-ne p1, v9, :cond_91

    move-object p1, v4

    :cond_91
    iput-object v7, p0, LI8/n$a;->t:Ljava/lang/Object;

    iput-object v6, p0, LI8/n$a;->u:Ljava/lang/Object;

    iput-object v5, p0, LI8/n$a;->q:Ljava/lang/Object;

    iput-object v1, p0, LI8/n$a;->r:Ljava/lang/Object;

    iput v3, p0, LI8/n$a;->s:I

    invoke-interface {v7, p1, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a2

    goto :goto_e4

    :cond_a2
    :goto_a2
    iput-object v4, v5, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    :cond_a4
    move-object p1, v1

    move-object v1, v5

    move-object v5, v6

    move-object v6, v7

    goto :goto_b1

    :cond_a9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Debounce timeout should not be negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_b1
    new-instance v7, LN8/j;

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v8

    invoke-direct {v7, v8}, LN8/j;-><init>(Lm8/i;)V

    iget-object v8, v1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-eqz v8, :cond_c8

    iget-wide v8, p1, Lkotlin/jvm/internal/D;->q:J

    new-instance p1, LI8/n$a$a;

    invoke-direct {p1, v6, v1, v4}, LI8/n$a$a;-><init>(LI8/g;Lkotlin/jvm/internal/E;Lm8/e;)V

    invoke-static {v7, v8, v9, p1}, LN8/c;->a(LN8/d;JLv8/l;)V

    :cond_c8
    invoke-interface {v5}, LH8/v;->d()LN8/g;

    move-result-object p1

    new-instance v8, LI8/n$a$b;

    invoke-direct {v8, v1, v6, v4}, LI8/n$a$b;-><init>(Lkotlin/jvm/internal/E;LI8/g;Lm8/e;)V

    invoke-interface {v7, p1, v8}, LN8/d;->c(LN8/g;Lv8/p;)V

    iput-object v6, p0, LI8/n$a;->t:Ljava/lang/Object;

    iput-object v5, p0, LI8/n$a;->u:Ljava/lang/Object;

    iput-object v1, p0, LI8/n$a;->q:Ljava/lang/Object;

    iput-object v4, p0, LI8/n$a;->r:Ljava/lang/Object;

    iput v2, p0, LI8/n$a;->s:I

    invoke-virtual {v7, p0}, LN8/j;->o(Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1e

    :goto_e4
    return-object v0

    :cond_e5
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LF8/L;LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, LI8/n$a;

    iget-object v1, p0, LI8/n$a;->v:Lv8/l;

    iget-object p0, p0, LI8/n$a;->w:LI8/f;

    invoke-direct {v0, v1, p0, p3}, LI8/n$a;-><init>(Lv8/l;LI8/f;Lm8/e;)V

    iput-object p1, v0, LI8/n$a;->t:Ljava/lang/Object;

    iput-object p2, v0, LI8/n$a;->u:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {v0, p0}, LI8/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
