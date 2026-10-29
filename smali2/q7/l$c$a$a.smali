.class final Lq7/l$c$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/l$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lq7/l;


# direct methods
.method constructor <init>(Lq7/l;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lq7/l$c$a$a;->r:Lq7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lq7/l$c$a$a;

    iget-object p0, p0, Lq7/l$c$a$a;->r:Lq7/l;

    invoke-direct {p1, p0, p2}, Lq7/l$c$a$a;-><init>(Lq7/l;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lq7/l$c$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lq7/l$c$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lq7/l$c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lq7/l$c$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq7/l$c$a$a;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4a

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_31

    :cond_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq7/l$c$a$a;->r:Lq7/l;

    invoke-static {p1}, Lq7/l;->K0(Lq7/l;)Ls7/a;

    move-result-object p1

    iput v3, p0, Lq7/l$c$a$a;->q:I

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p0}, Ls7/a;->n(ZLm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_31

    goto :goto_49

    :cond_31
    :goto_31
    iget-object v1, p0, Lq7/l$c$a$a;->r:Lq7/l;

    check-cast p1, Lh8/o;

    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg3/x;

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg3/x;

    iput v2, p0, Lq7/l$c$a$a;->q:I

    invoke-static {v1, v3, p1, p0}, Lq7/l;->M0(Lq7/l;Lg3/x;Lg3/x;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4a

    :goto_49
    return-object v0

    :cond_4a
    :goto_4a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
