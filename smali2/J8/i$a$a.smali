.class final LJ8/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ8/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/E;

.field final synthetic r:LF8/L;

.field final synthetic s:LJ8/i;

.field final synthetic t:LI8/g;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/E;LF8/L;LJ8/i;LI8/g;)V
    .registers 5

    iput-object p1, p0, LJ8/i$a$a;->q:Lkotlin/jvm/internal/E;

    iput-object p2, p0, LJ8/i$a$a;->r:LF8/L;

    iput-object p3, p0, LJ8/i$a$a;->s:LJ8/i;

    iput-object p4, p0, LJ8/i$a$a;->t:LI8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, LJ8/i$a$a$b;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LJ8/i$a$a$b;

    iget v1, v0, LJ8/i$a$a$b;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LJ8/i$a$a$b;->v:I

    goto :goto_18

    :cond_13
    new-instance v0, LJ8/i$a$a$b;

    invoke-direct {v0, p0, p2}, LJ8/i$a$a$b;-><init>(LJ8/i$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LJ8/i$a$a$b;->t:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ8/i$a$a$b;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v3, :cond_33

    iget-object p0, v0, LJ8/i$a$a$b;->s:Ljava/lang/Object;

    check-cast p0, LF8/x0;

    iget-object p1, v0, LJ8/i$a$a$b;->r:Ljava/lang/Object;

    iget-object p0, v0, LJ8/i$a$a$b;->q:Ljava/lang/Object;

    check-cast p0, LJ8/i$a$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_5d

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LJ8/i$a$a;->q:Lkotlin/jvm/internal/E;

    iget-object p2, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p2, LF8/x0;

    if-eqz p2, :cond_5d

    new-instance v2, LJ8/k;

    invoke-direct {v2}, LJ8/k;-><init>()V

    invoke-interface {p2, v2}, LF8/x0;->f(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, LJ8/i$a$a$b;->q:Ljava/lang/Object;

    iput-object p1, v0, LJ8/i$a$a$b;->r:Ljava/lang/Object;

    iput-object p2, v0, LJ8/i$a$a$b;->s:Ljava/lang/Object;

    iput v3, v0, LJ8/i$a$a$b;->v:I

    invoke-interface {p2, v0}, LF8/x0;->Q(Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5d

    return-object v1

    :cond_5d
    :goto_5d
    iget-object p2, p0, LJ8/i$a$a;->q:Lkotlin/jvm/internal/E;

    iget-object v0, p0, LJ8/i$a$a;->r:LF8/L;

    sget-object v2, LF8/N;->t:LF8/N;

    new-instance v3, LJ8/i$a$a$a;

    iget-object v1, p0, LJ8/i$a$a;->s:LJ8/i;

    iget-object p0, p0, LJ8/i$a$a;->t:LI8/g;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, p1, v4}, LJ8/i$a$a$a;-><init>(LJ8/i;LI8/g;Ljava/lang/Object;Lm8/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p0

    iput-object p0, p2, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
