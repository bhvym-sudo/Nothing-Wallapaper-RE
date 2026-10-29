.class final LG7/p$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/p;->b(Le3/g;LJ7/i;Ly7/s;LF8/L;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LJ7/i;

.field final synthetic s:Le3/g;

.field final synthetic t:Ly7/s;


# direct methods
.method constructor <init>(LJ7/i;Le3/g;Ly7/s;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LG7/p$a;->r:LJ7/i;

    iput-object p2, p0, LG7/p$a;->s:Le3/g;

    iput-object p3, p0, LG7/p$a;->t:Ly7/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, LG7/p$a;

    iget-object v0, p0, LG7/p$a;->r:LJ7/i;

    iget-object v1, p0, LG7/p$a;->s:Le3/g;

    iget-object p0, p0, LG7/p$a;->t:Ly7/s;

    invoke-direct {p1, v0, v1, p0, p2}, LG7/p$a;-><init>(LJ7/i;Le3/g;Ly7/s;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/p$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/p$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/p$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/p$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_3d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/A;

    invoke-direct {p1}, Lkotlin/jvm/internal/A;-><init>()V

    iput-boolean v2, p1, Lkotlin/jvm/internal/A;->q:Z

    iget-object v1, p0, LG7/p$a;->r:LJ7/i;

    invoke-virtual {v1}, LJ7/i;->W()LI8/f;

    move-result-object v1

    invoke-static {v1}, LI8/h;->o(LI8/f;)LI8/f;

    move-result-object v1

    new-instance v3, LG7/p$a$a;

    iget-object v4, p0, LG7/p$a;->s:Le3/g;

    iget-object v5, p0, LG7/p$a;->t:Ly7/s;

    invoke-direct {v3, v4, v5, p1}, LG7/p$a$a;-><init>(Le3/g;Ly7/s;Lkotlin/jvm/internal/A;)V

    iput v2, p0, LG7/p$a;->q:I

    invoke-interface {v1, v3, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3d

    return-object v0

    :cond_3d
    :goto_3d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
