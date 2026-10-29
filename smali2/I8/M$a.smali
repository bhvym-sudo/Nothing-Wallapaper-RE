.class final LI8/M$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/M;->a(LI8/O;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LI8/O;


# direct methods
.method constructor <init>(LI8/O;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LI8/M$a;->s:LI8/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LI8/M$a;

    iget-object p0, p0, LI8/M$a;->s:LI8/O;

    invoke-direct {v0, p0, p2}, LI8/M$a;-><init>(LI8/O;Lm8/e;)V

    iput-object p1, v0, LI8/M$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LI8/g;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LI8/M$a;->s(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI8/M$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-eq v1, v2, :cond_13

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_33

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI8/M$a;->r:Ljava/lang/Object;

    check-cast p1, LI8/g;

    new-instance v1, Lkotlin/jvm/internal/A;

    invoke-direct {v1}, Lkotlin/jvm/internal/A;-><init>()V

    iget-object v3, p0, LI8/M$a;->s:LI8/O;

    new-instance v4, LI8/M$a$a;

    invoke-direct {v4, v1, p1}, LI8/M$a$a;-><init>(Lkotlin/jvm/internal/A;LI8/g;)V

    iput v2, p0, LI8/M$a;->q:I

    invoke-interface {v3, v4, p0}, LI8/E;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_33

    return-object v0

    :cond_33
    :goto_33
    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method

.method public final s(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LI8/M$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LI8/M$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LI8/M$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
