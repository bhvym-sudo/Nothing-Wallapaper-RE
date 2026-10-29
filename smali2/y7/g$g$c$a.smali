.class final Ly7/g$g$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/g$g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Ly7/g;


# direct methods
.method constructor <init>(Ly7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ly7/g$g$c$a;->s:Ly7/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Ly7/g$g$c$a;

    iget-object p0, p0, Ly7/g$g$c$a;->s:Ly7/g;

    invoke-direct {v0, p0, p2}, Ly7/g$g$c$a;-><init>(Ly7/g;Lm8/e;)V

    iput-object p1, v0, Ly7/g$g$c$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LO2/a;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ly7/g$g$c$a;->s(LO2/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ly7/g$g$c$a;->q:I

    if-nez v0, :cond_32

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly7/g$g$c$a;->r:Ljava/lang/Object;

    check-cast p1, LO2/a;

    iget-object v0, p0, Ly7/g$g$c$a;->s:Ly7/g;

    invoke-static {v0, p1}, Ly7/g;->p(Ly7/g;LO2/a;)V

    iget-object p0, p0, Ly7/g$g$c$a;->s:Ly7/g;

    invoke-static {p0}, Ly7/g;->j(Ly7/g;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly7/g$b;

    invoke-interface {v0, p1}, Ly7/g$b;->b(LO2/a;)V

    goto :goto_1f

    :cond_2f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_32
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(LO2/a;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Ly7/g$g$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ly7/g$g$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ly7/g$g$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
