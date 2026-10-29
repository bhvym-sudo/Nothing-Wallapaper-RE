.class final Lq7/l$c$a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/l$c$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lq7/l;


# direct methods
.method constructor <init>(Lq7/l;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lq7/l$c$a$c$a;->s:Lq7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lq7/l$c$a$c$a;

    iget-object p0, p0, Lq7/l$c$a$c$a;->s:Lq7/l;

    invoke-direct {v0, p0, p2}, Lq7/l$c$a$c$a;-><init>(Lq7/l;Lm8/e;)V

    iput-object p1, v0, Lq7/l$c$a$c$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lp7/c;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lq7/l$c$a$c$a;->s(Lp7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lq7/l$c$a$c$a;->q:I

    if-nez v0, :cond_16

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq7/l$c$a$c$a;->r:Ljava/lang/Object;

    check-cast p1, Lp7/c;

    iget-object p0, p0, Lq7/l$c$a$c$a;->s:Lq7/l;

    invoke-static {p0, p1}, Lq7/l;->N0(Lq7/l;Lp7/c;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Lp7/c;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lq7/l$c$a$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lq7/l$c$a$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lq7/l$c$a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
