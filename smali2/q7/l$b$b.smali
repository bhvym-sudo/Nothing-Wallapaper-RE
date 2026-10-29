.class final Lq7/l$b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lq7/l$b$b;->r:Lq7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lq7/l$b$b;

    iget-object p0, p0, Lq7/l$b$b;->r:Lq7/l;

    invoke-direct {p1, p0, p2}, Lq7/l$b$b;-><init>(Lq7/l;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lq7/l$b$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lq7/l$b$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lq7/l$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lq7/l$b$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq7/l$b$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq7/l$b$b;->r:Lq7/l;

    invoke-static {p1}, Lq7/l;->H0(Lq7/l;)Lj7/j;

    move-result-object p1

    invoke-virtual {p1}, Lj7/j;->d0()LI8/f;

    move-result-object p1

    iput v2, p0, Lq7/l$b$b;->q:I

    invoke-static {p1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2d

    return-object v0

    :cond_2d
    :goto_2d
    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lq7/l$b$b;->r:Lq7/l;

    invoke-static {v0}, Lq7/l;->G0(Lq7/l;)Lr6/g;

    move-result-object v0

    if-eqz v0, :cond_5f

    iget-object v1, p0, Lq7/l$b$b;->r:Lq7/l;

    invoke-static {v1}, Lq7/l;->K0(Lq7/l;)Ls7/a;

    move-result-object v1

    invoke-virtual {v1}, Ls7/a;->t()Z

    move-result v1

    if-eqz v1, :cond_4a

    sget-object v1, LC6/e$b;->c:LC6/e$b;

    invoke-virtual {v1}, LC6/e;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_4c

    :cond_4a
    const-string v1, "ORIGIN"

    :goto_4c
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p0, p0, Lq7/l$b$b;->r:Lq7/l;

    invoke-static {p0}, Lq7/l;->K0(Lq7/l;)Ls7/a;

    move-result-object p0

    invoke-virtual {p0}, Ls7/a;->s()Z

    move-result p0

    invoke-static {v0, p1, p0}, Lq6/g;->b(Lr6/g;Ljava/lang/String;I)V

    :cond_5f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
